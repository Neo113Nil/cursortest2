package androidx.camera.camera2.pipe.internal;

import android.util.Log;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.OutputStatus;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.atomicfu.AtomicBoolean;
import kotlinx.atomicfu.AtomicFU;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class OutputDistributor implements AutoCloseable {
    public final LinkedHashMap availableOutputs;
    public long cameraOutputSequenceNumbers;
    public boolean closed;
    public long lastFailedCameraOutputNumber;
    public long lastFailedFrameNumber;
    public final Object lock;
    public long newestCameraOutputNumber;
    public long newestFrameNumber;
    public final OutputMatcher outputMatcher;
    public final ArrayList startedOutputs;

    public interface OutputListener {
        /* renamed from: onOutputComplete-3ejhThk */
        void mo96onOutputComplete3ejhThk(Object obj);
    }

    public final class StartedOutput {
        public final long cameraFrameNumber;
        public final long cameraOutputNumber;
        public final long cameraOutputSequence;
        public final long cameraTimestamp;
        public final AtomicBoolean complete;
        public final boolean isOutOfOrder;
        public final OutputListener outputListener;

        public StartedOutput(boolean z, long j, long j2, long j3, long j4, OutputListener outputListener) {
            outputListener.getClass();
            this.isOutOfOrder = z;
            this.cameraFrameNumber = j;
            this.cameraTimestamp = j2;
            this.cameraOutputSequence = j3;
            this.cameraOutputNumber = j4;
            this.outputListener = outputListener;
            this.complete = AtomicFU.atomic(false);
        }

        /* renamed from: completeWith-DvZWqE8, reason: not valid java name */
        public final void m100completeWithDvZWqE8(Object obj, long j) {
            if (this.complete.compareAndSet()) {
                this.outputListener.mo96onOutputComplete3ejhThk(obj);
                return;
            }
            StringBuilder sb = new StringBuilder("Output ");
            sb.append(this.cameraOutputSequence);
            sb.append(" at ");
            sb.append((Object) FrameNumber.m47toStringimpl(this.cameraFrameNumber));
            sb.append(" for ");
            Path$$ExternalSyntheticBUOutline0.m((Object) CameraState$Type$EnumUnboxingLocalUtility.m(j, " was completed multiple times!", sb));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof StartedOutput) {
                StartedOutput startedOutput = (StartedOutput) obj;
                if (this.isOutOfOrder == startedOutput.isOutOfOrder && this.cameraFrameNumber == startedOutput.cameraFrameNumber && this.cameraTimestamp == startedOutput.cameraTimestamp && this.cameraOutputSequence == startedOutput.cameraOutputSequence && this.cameraOutputNumber == startedOutput.cameraOutputNumber && Intrinsics.areEqual(this.outputListener, startedOutput.outputListener)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.outputListener.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Boolean.hashCode(this.isOutOfOrder) * 31, 31, this.cameraFrameNumber), 31, this.cameraTimestamp), 31, this.cameraOutputSequence), 31, this.cameraOutputNumber);
        }

        public final String toString() {
            return "StartedOutput(isOutOfOrder=" + this.isOutOfOrder + ", cameraFrameNumber=" + ((Object) FrameNumber.m47toStringimpl(this.cameraFrameNumber)) + ", cameraTimestamp=" + ((Object) ("CameraTimestamp(value=" + this.cameraTimestamp + ')')) + ", cameraOutputSequence=" + this.cameraOutputSequence + ", cameraOutputNumber=" + this.cameraOutputNumber + ", outputListener=" + this.outputListener + ')';
        }
    }

    public OutputDistributor(OutputMatcher outputMatcher) {
        outputMatcher.getClass();
        this.outputMatcher = outputMatcher;
        this.lock = new Object();
        this.cameraOutputSequenceNumbers = 1L;
        this.newestCameraOutputNumber = Long.MIN_VALUE;
        this.newestFrameNumber = Long.MIN_VALUE;
        this.lastFailedFrameNumber = Long.MIN_VALUE;
        this.lastFailedCameraOutputNumber = Long.MIN_VALUE;
        this.startedOutputs = new ArrayList();
        this.availableOutputs = new LinkedHashMap();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ArrayList mutableList = CollectionsKt.toMutableList(this.availableOutputs.values());
            this.availableOutputs.clear();
            ArrayList mutableList2 = CollectionsKt.toMutableList((Collection) this.startedOutputs);
            this.startedOutputs.clear();
            Iterator it = mutableList.iterator();
            while (it.hasNext()) {
                Object obj = ((OutputResult) it.next()).result;
            }
            Iterator it2 = mutableList2.iterator();
            while (it2.hasNext()) {
                StartedOutput startedOutput = (StartedOutput) it2.next();
                startedOutput.getClass();
                startedOutput.m100completeWithDvZWqE8(new OutputStatus(11), -1L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        r5 = null;
     */
    /* renamed from: onOutputFailure-Vw7M1qk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m97onOutputFailureVw7M1qk(long j) {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                this.lastFailedFrameNumber = j;
                Iterator it = this.startedOutputs.iterator();
                StartedOutput startedOutput = null;
                boolean z = false;
                Object obj = null;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((StartedOutput) next).cameraFrameNumber == j) {
                            if (z) {
                                break;
                            }
                            obj = next;
                            z = true;
                        }
                    } else if (!z) {
                    }
                }
                StartedOutput startedOutput2 = (StartedOutput) obj;
                if (startedOutput2 != null) {
                    this.lastFailedCameraOutputNumber = startedOutput2.cameraOutputNumber;
                    this.startedOutputs.remove(startedOutput2);
                    startedOutput = startedOutput2;
                }
                if (startedOutput != null) {
                    startedOutput.m100completeWithDvZWqE8(new OutputStatus(10), -1L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        r10 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if (r10.hasNext() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        r11 = (androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput) r10.next();
        r11.getClass();
        r11.m100completeWithDvZWqE8(new androidx.camera.camera2.pipe.OutputStatus(12), -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    /* renamed from: onOutputResult-DvZWqE8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m98onOutputResultDvZWqE8(Object obj, long j) {
        Object outputResult;
        ArrayList arrayList;
        Object obj2;
        synchronized (this.lock) {
            try {
                if (!this.closed && !this.outputMatcher.fuzzyEqual(this.lastFailedCameraOutputNumber, j)) {
                    Iterator it = this.startedOutputs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it.next();
                            if (this.outputMatcher.fuzzyEqual(((StartedOutput) obj2).cameraOutputNumber, j)) {
                                break;
                            }
                        }
                    }
                    StartedOutput startedOutput = (StartedOutput) obj2;
                    if (startedOutput != null) {
                        ArrayList removeOutputsOlderThan = removeOutputsOlderThan(startedOutput.isOutOfOrder, startedOutput.cameraOutputSequence, startedOutput.cameraOutputNumber);
                        startedOutput.m100completeWithDvZWqE8(obj, j);
                        this.startedOutputs.remove(startedOutput);
                        arrayList = removeOutputsOlderThan;
                        outputResult = null;
                    } else {
                        this.availableOutputs.put(Long.valueOf(j), new OutputResult(obj));
                        if (this.availableOutputs.size() > 3) {
                            outputResult = this.availableOutputs.remove(Long.valueOf(((Number) CollectionsKt.first(this.availableOutputs.keySet())).longValue()));
                            arrayList = null;
                        } else {
                            outputResult = null;
                            arrayList = null;
                        }
                    }
                }
                outputResult = new OutputResult(obj);
                arrayList = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        OutputResult outputResult2 = (OutputResult) outputResult;
        if (outputResult2 != null) {
            Object obj3 = outputResult2.result;
            if ((obj3 instanceof OutputStatus) || obj3 != null) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0011, B:5:0x0017, B:7:0x001d, B:14:0x0034, B:16:0x0038, B:21:0x0089, B:23:0x0097, B:25:0x009d, B:28:0x00a5, B:32:0x00b0, B:33:0x00b2, B:37:0x00bd, B:42:0x00c7, B:43:0x00d3, B:45:0x00d9, B:50:0x00f6, B:52:0x00fc, B:79:0x010d, B:85:0x0125, B:86:0x0131, B:88:0x0137, B:92:0x014c, B:94:0x0150, B:96:0x015d), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0011, B:5:0x0017, B:7:0x001d, B:14:0x0034, B:16:0x0038, B:21:0x0089, B:23:0x0097, B:25:0x009d, B:28:0x00a5, B:32:0x00b0, B:33:0x00b2, B:37:0x00bd, B:42:0x00c7, B:43:0x00d3, B:45:0x00d9, B:50:0x00f6, B:52:0x00fc, B:79:0x010d, B:85:0x0125, B:86:0x0131, B:88:0x0137, B:92:0x014c, B:94:0x0150, B:96:0x015d), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010d A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0011, B:5:0x0017, B:7:0x001d, B:14:0x0034, B:16:0x0038, B:21:0x0089, B:23:0x0097, B:25:0x009d, B:28:0x00a5, B:32:0x00b0, B:33:0x00b2, B:37:0x00bd, B:42:0x00c7, B:43:0x00d3, B:45:0x00d9, B:50:0x00f6, B:52:0x00fc, B:79:0x010d, B:85:0x0125, B:86:0x0131, B:88:0x0137, B:92:0x014c, B:94:0x0150, B:96:0x015d), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3 A[SYNTHETIC] */
    /* renamed from: onOutputStarted-qGubWw0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m99onOutputStartedqGubWw0(long j, long j2, long j3, OutputListener outputListener) {
        Object obj;
        Object obj2;
        Ref$ObjectRef ref$ObjectRef;
        ArrayList<StartedOutput> arrayList;
        Object obj3;
        boolean z;
        OutputResult outputResult;
        Object outputStatus;
        boolean z2;
        Iterator it;
        long j4;
        Object obj4;
        Long l;
        long j5 = j3;
        outputListener.getClass();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        synchronized (this.lock) {
            try {
                Iterator it2 = this.startedOutputs.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (((StartedOutput) obj).cameraFrameNumber == j) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                StartedOutput startedOutput = (StartedOutput) obj;
                if (startedOutput != null) {
                    Log.w("CXCP", "onOutputStarted was invoked multiple times with a previously started output!onOutputStarted with " + ((Object) FrameNumber.m47toStringimpl(j)) + ", " + ((Object) ("CameraTimestamp(value=" + j2 + ')')) + ", " + j5 + ". Previously started output: " + startedOutput + ". Ignoring.");
                    return;
                }
                boolean z3 = this.closed;
                long j6 = this.cameraOutputSequenceNumbers;
                this.cameraOutputSequenceNumbers = j6 + 1;
                if (!z3 && this.lastFailedFrameNumber != j && this.lastFailedCameraOutputNumber != j5) {
                    boolean z4 = j < this.newestFrameNumber;
                    if (!z4) {
                        this.newestFrameNumber = j;
                    }
                    boolean z5 = j5 < this.newestCameraOutputNumber;
                    if (!z5) {
                        this.newestCameraOutputNumber = j5;
                    }
                    if (!z4 && !z5) {
                        z2 = false;
                        it = this.availableOutputs.keySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                j4 = j5;
                                obj4 = null;
                                break;
                            }
                            Object next = it.next();
                            obj4 = next;
                            j4 = j3;
                            if (this.outputMatcher.fuzzyEqual(j4, ((Number) next).longValue())) {
                                break;
                            } else {
                                j5 = j4;
                            }
                        }
                        l = (Long) obj4;
                        if (l == null) {
                            obj3 = this.availableOutputs.remove(l);
                            arrayList = removeOutputsOlderThan(z2, j6, j4);
                            ref$ObjectRef = ref$ObjectRef2;
                            z = true;
                            if (arrayList != null) {
                                for (StartedOutput startedOutput2 : arrayList) {
                                    startedOutput2.getClass();
                                    startedOutput2.m100completeWithDvZWqE8(new OutputStatus(12), -1L);
                                }
                            }
                            outputResult = (OutputResult) ref$ObjectRef.element;
                            if (outputResult != null) {
                                Object obj5 = outputResult.result;
                                if ((obj5 instanceof OutputStatus) || obj5 == null) {
                                }
                            }
                            if (z) {
                                if (z3) {
                                    outputStatus = new OutputStatus(11);
                                } else {
                                    OutputResult outputResult2 = (OutputResult) obj3;
                                    outputStatus = outputResult2 != null ? outputResult2.result : new OutputStatus(10);
                                }
                                outputListener.mo96onOutputComplete3ejhThk(outputStatus);
                                return;
                            }
                            return;
                        }
                        this.startedOutputs.add(new StartedOutput(z2, j, j2, j6, j3, outputListener));
                        ref$ObjectRef = ref$ObjectRef2;
                        arrayList = null;
                        obj3 = null;
                        z = false;
                        if (arrayList != null) {
                        }
                        outputResult = (OutputResult) ref$ObjectRef.element;
                        if (outputResult != null) {
                        }
                        if (z) {
                        }
                    }
                    z2 = true;
                    it = this.availableOutputs.keySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                        j5 = j4;
                    }
                    l = (Long) obj4;
                    if (l == null) {
                    }
                }
                Iterator it3 = this.availableOutputs.keySet().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = it3.next();
                        if (this.outputMatcher.fuzzyEqual(j5, ((Number) obj2).longValue())) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                Long l2 = (Long) obj2;
                ref$ObjectRef = ref$ObjectRef2;
                ref$ObjectRef.element = l2 != null ? (OutputResult) this.availableOutputs.remove(l2) : null;
                arrayList = null;
                obj3 = null;
                z = true;
                if (arrayList != null) {
                }
                outputResult = (OutputResult) ref$ObjectRef.element;
                if (outputResult != null) {
                }
                if (z) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ArrayList removeOutputsOlderThan(boolean z, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.startedOutputs;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            StartedOutput startedOutput = (StartedOutput) next;
            if (startedOutput.isOutOfOrder == z && startedOutput.cameraOutputSequence < j && startedOutput.cameraOutputNumber < j2) {
                arrayList.add(next);
            }
        }
        arrayList2.removeAll(arrayList);
        return arrayList;
    }
}
