package androidx.work.impl;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.ConnectivityManager;
import android.os.storage.StorageManager;
import android.telephony.TelephonyManager;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsetsAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.LruCache;
import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.text.input.internal.ChangeTracker$Change;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.CancellationHandle;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.PathParserKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DepthSortedSetKt$DepthComparator$1;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.emoji2.text.EmojiCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import app.cash.trifle.Trifle;
import coil3.Extras;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.bugsnag.android.Bugsnag;
import com.bugsnag.android.Logger;
import com.bugsnag.android.NativeInterface;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.bugsnag.android.internal.dag.ContextModule;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.DatadogCore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.internal.measurement.zzjy;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzku;
import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzob;
import com.google.android.gms.internal.measurement.zzod;
import com.google.android.gms.internal.measurement.zzof;
import com.google.android.gms.internal.measurement.zzpi;
import com.google.android.gms.internal.measurement.zzxs;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadj;
import com.google.android.gms.measurement.internal.zzoc;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.util.Bytes;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.MainActivity;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.wire.GrpcMethod;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.internal.LaunchTracker$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public class WorkLauncherImpl implements Serialization, CancellationHandle, Saver, RemoteCall {
    public final /* synthetic */ int $r8$classId;
    public Object processor;
    public Object workTaskExecutor;

    public WorkLauncherImpl(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 9:
                this.workTaskExecutor = new float[64];
                break;
            case 12:
                this.processor = new MutableVector(0, new LayoutNode[16]);
                break;
            case 13:
                this.processor = new MutableVector(0, new Reference[16]);
                this.workTaskExecutor = new ReferenceQueue();
                break;
            case 14:
                this.processor = new Trifle(4);
                this.workTaskExecutor = new LruCache(16);
                break;
            case 20:
                break;
            default:
                this.processor = new MutableScatterMap();
                this.workTaskExecutor = new MutableScatterMap();
                break;
        }
    }

    public static WorkLauncherImpl create(KeyTemplate keyTemplate) {
        return new WorkLauncherImpl(keyTemplate, Util.toBytesFromPrintableAscii(keyTemplate.getTypeUrl()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void dispatchHierarchy(LayoutNode layoutNode) {
        if (layoutNode.globallyPositionedObservers > 0) {
            if (layoutNode.layoutDelegate.layoutState == LayoutNode.LayoutState.Idle && !layoutNode.getLayoutPending$ui() && !layoutNode.getMeasurePending$ui() && !layoutNode.isDeactivated && layoutNode.isPlaced()) {
                NodeChain nodeChain = layoutNode.nodes;
                if ((((Modifier.Node) nodeChain.head).getAggregateChildKindSet$ui() & 256) != 0) {
                    for (Modifier.Node node = (Modifier.Node) nodeChain.head; node != null; node = node.getChild$ui()) {
                        if ((node.getKindSet$ui() & 256) != 0) {
                            DelegatingNode delegatingNode = node;
                            ?? r5 = 0;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof GlobalPositionAwareModifierNode) {
                                    GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) delegatingNode;
                                    globalPositionAwareModifierNode.onGloballyPositioned(DepthSortedSetKt.m864requireCoordinator64DMado(globalPositionAwareModifierNode, 256));
                                } else if ((delegatingNode.getKindSet$ui() & 256) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node node2 = delegatingNode.delegate;
                                    int i = 0;
                                    delegatingNode = delegatingNode;
                                    r5 = r5;
                                    while (node2 != null) {
                                        if ((node2.getKindSet$ui() & 256) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                delegatingNode = node2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new MutableVector(0, new Modifier.Node[16]);
                                                }
                                                if (delegatingNode != 0) {
                                                    r5.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                r5.add(node2);
                                            }
                                        }
                                        node2 = node2.getChild$ui();
                                        delegatingNode = delegatingNode;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                delegatingNode = DepthSortedSetKt.access$pop(r5);
                            }
                        }
                        if ((node.getAggregateChildKindSet$ui() & 256) == 0) {
                            break;
                        }
                    }
                }
            }
            layoutNode.needsOnGloballyPositionedDispatch = false;
            MutableVector mutableVector = layoutNode.get_children$ui();
            Object[] objArr = mutableVector.content;
            int i2 = mutableVector.size;
            for (int i3 = 0; i3 < i2; i3++) {
                dispatchHierarchy((LayoutNode) objArr[i3]);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i = zzkk.$r8$clinit;
        zzjy zzjyVar = new zzjy((TaskCompletionSource) obj2);
        ((zzkt) ((zzku) obj).getService()).zze(zzjyVar, (String) this.processor, (String[]) this.workTaskExecutor);
    }

    public void add(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.processor).add(Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(length + 1 + valueOf.length()), str, "=", valueOf));
    }

    public void appendNewChange(ChangeTracker$Change changeTracker$Change, int i, int i2, int i3) {
        int i4;
        MutableVector mutableVector = (MutableVector) this.workTaskExecutor;
        int i5 = mutableVector.size;
        if (i5 == 0) {
            i4 = 0;
        } else if (i5 == 0) {
            OptionalProvider$$ExternalSyntheticLambda0.m("MutableVector is empty.");
            return;
        } else {
            ChangeTracker$Change changeTracker$Change2 = (ChangeTracker$Change) mutableVector.content[i5 - 1];
            i4 = changeTracker$Change2.preEnd - changeTracker$Change2.originalEnd;
        }
        if (changeTracker$Change == null) {
            int i6 = i - i4;
            changeTracker$Change = new ChangeTracker$Change(i, i2 + i3, i6, (i2 - i) + i6);
        } else {
            if (changeTracker$Change.preStart > i) {
                changeTracker$Change.preStart = i;
                changeTracker$Change.originalStart = i;
            }
            int i7 = changeTracker$Change.preEnd;
            if (i2 > i7) {
                int i8 = i7 - changeTracker$Change.originalEnd;
                changeTracker$Change.preEnd = i2;
                changeTracker$Change.originalEnd = i2 - i8;
            }
            changeTracker$Change.preEnd += i3;
        }
        mutableVector.add(changeTracker$Change);
    }

    @Override // androidx.compose.runtime.CancellationHandle
    public void cancel() {
        if (((AtomicInt) this.workTaskExecutor).compareAndSet(1, 1)) {
            return;
        }
        ((LaunchTracker$$ExternalSyntheticLambda0) this.processor).invoke();
    }

    public void clearChanges() {
        ((MutableVector) this.processor).clear();
    }

    public boolean contains(WorkGenerationalId workGenerationalId) {
        boolean containsKey;
        synchronized (this.workTaskExecutor) {
            containsKey = ((StartStopTokensImpl) this.processor).runs.containsKey(workGenerationalId);
        }
        return containsKey;
    }

    public void createSplashScreenView() {
        View rootView = ((ViewGroup) ((MainActivity) this.processor).findViewById(R.id.content)).getRootView();
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup != null) {
            viewGroup.addView((ViewGroup) ((Lazy) this.workTaskExecutor).getValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r4 < r1) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatch() {
        Object[] objArr;
        MutableVector mutableVector = (MutableVector) this.processor;
        Arrays.sort(mutableVector.content, 0, mutableVector.size, DepthSortedSetKt$DepthComparator$1.INSTANCE);
        int i = mutableVector.size;
        LayoutNode[] layoutNodeArr = (LayoutNode[]) this.workTaskExecutor;
        if (layoutNodeArr != null) {
            int length = layoutNodeArr.length;
            objArr = layoutNodeArr;
        }
        objArr = new LayoutNode[Math.max(16, i)];
        this.workTaskExecutor = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = mutableVector.content[i2];
        }
        mutableVector.clear();
        while (true) {
            i--;
            if (-1 >= i) {
                this.workTaskExecutor = objArr;
                return;
            }
            LayoutNode layoutNode = objArr[i];
            layoutNode.getClass();
            if (layoutNode.needsOnGloballyPositionedDispatch) {
                dispatchHierarchy(layoutNode);
            }
            objArr[i] = 0;
        }
    }

    public void flush() {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) this.workTaskExecutor;
        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextUndoOperation textUndoOperation = (TextUndoOperation) parcelableSnapshotMutableState.getValue();
            if (textUndoOperation != null) {
                UndoManager undoManager = (UndoManager) this.processor;
                SnapshotStateList snapshotStateList = undoManager.undoStack;
                SnapshotStateList snapshotStateList2 = undoManager.redoStack;
                snapshotStateList2.clear();
                while (snapshotStateList2.size() + snapshotStateList.size() > undoManager.capacity - 1) {
                    CollectionsKt__MutableCollectionsKt.removeFirst(snapshotStateList);
                }
                snapshotStateList.add(textUndoOperation);
            }
            parcelableSnapshotMutableState.setValue(null);
        } finally {
            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public InternalSdkCore get() {
        InternalSdkCore internalSdkCore = (InternalSdkCore) ((AtomicReference) this.workTaskExecutor).get();
        InternalSdkCore internalSdkCore2 = null;
        if (internalSdkCore != null) {
            DatadogCore datadogCore = internalSdkCore instanceof DatadogCore ? (DatadogCore) internalSdkCore : null;
            Boolean valueOf = datadogCore != null ? Boolean.valueOf(datadogCore.isActive$dd_sdk_android_core_release()) : null;
            if (valueOf == null || valueOf.booleanValue()) {
                return internalSdkCore;
            }
            Thread$State$EnumUnboxingLocalUtility.m((AtomicReference) this.workTaskExecutor, internalSdkCore);
            return null;
        }
        synchronized (((AtomicReference) this.workTaskExecutor)) {
            InternalSdkCore internalSdkCore3 = (InternalSdkCore) ((AtomicReference) this.workTaskExecutor).get();
            if (internalSdkCore3 != null) {
                internalSdkCore2 = internalSdkCore3;
            } else if (Datadog.isInitialized()) {
                internalSdkCore2 = Datadog.getInstance(null);
                ((AtomicReference) this.workTaskExecutor).set(internalSdkCore2);
                ((Function1) this.processor).invoke(internalSdkCore2);
            }
        }
        return internalSdkCore2;
    }

    public InputFilter[] getFilters(InputFilter[] inputFilterArr) {
        return ((Trace) ((Extras.Key) this.workTaskExecutor).f61default).getFilters(inputFilterArr);
    }

    public View getIconView() {
        View findViewById = getSplashScreenView().findViewById(com.squareup.cash.R.id.splashscreen_icon_view);
        findViewById.getClass();
        return findViewById;
    }

    public MeasurePolicy getMeasurePolicyState() {
        return (MeasurePolicy) ((ParcelableSnapshotMutableState) this.workTaskExecutor).getValue();
    }

    public ViewGroup getSplashScreenView() {
        return (ViewGroup) ((Lazy) this.workTaskExecutor).getValue();
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((TextView) this.processor).getContext().obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            setEnabled(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void pathStringToNodes(String str, ArrayList arrayList) {
        int i;
        char charAt;
        char c;
        float intBitsToFloat;
        int length = str.length();
        char c2 = 0;
        int i2 = 0;
        while (i2 < length && Intrinsics.compare((int) str.charAt(i2), 32) <= 0) {
            i2++;
        }
        while (length > i2 && Intrinsics.compare((int) str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i3 = 0;
        while (i2 < length) {
            while (true) {
                i = i2 + 1;
                charAt = str.charAt(i2);
                int i4 = charAt | ' ';
                if ((i4 - 122) * (i4 - 97) > 0 || i4 == 101) {
                    if (i >= length) {
                        charAt = c2;
                    } else {
                        i2 = i;
                    }
                }
            }
            if (charAt != 0) {
                int i5 = charAt | ' ';
                if (i5 != 122) {
                    while (i < length && Intrinsics.compare((int) str.charAt(i), 32) <= 0) {
                        i++;
                    }
                    char c3 = i5 == 97 ? (char) 1 : c2;
                    int i6 = c2;
                    do {
                        long nextFloat = (c3 == 0 || 3 > i6 || i6 >= 5) ? PathParserKt.nextFloat(i, length, str) : PathParserKt.nextFloat(i, Math.min(i + 1, length), str);
                        i = (int) (nextFloat >>> 32);
                        intBitsToFloat = Float.intBitsToFloat((int) (nextFloat & BodyPartID.bodyIdMax));
                        if (!Float.isNaN(intBitsToFloat)) {
                            float[] fArr = (float[]) this.workTaskExecutor;
                            int i7 = i6 + 1;
                            fArr[i6] = intBitsToFloat;
                            if (i7 >= fArr.length) {
                                float[] fArr2 = new float[i7 * 2];
                                this.workTaskExecutor = fArr2;
                                System.arraycopy(fArr, c2, fArr2, c2, fArr.length);
                            }
                            i6 = i7;
                        }
                        while (i < length && (Intrinsics.compare((int) str.charAt(i), 32) <= 0 || str.charAt(i) == ',')) {
                            i++;
                        }
                        if (i < length) {
                        }
                        i3 = i6;
                    } while (!Float.isNaN(intBitsToFloat));
                    i3 = i6;
                }
                float[] fArr3 = (float[]) this.workTaskExecutor;
                int i8 = 2;
                switch (charAt) {
                    case 'A':
                        c = c2;
                        int i9 = i3 - 7;
                        for (int i10 = c; i10 <= i9; i10 += 7) {
                            arrayList.add(new PathNode.ArcTo(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], Float.compare(fArr3[i10 + 3], RecyclerView.DECELERATION_RATE) != 0 ? 1 : c, Float.compare(fArr3[i10 + 4], RecyclerView.DECELERATION_RATE) != 0 ? 1 : c, fArr3[i10 + 5], fArr3[i10 + 6]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'C':
                        c = c2;
                        int i11 = i3 - 6;
                        for (int i12 = c; i12 <= i11; i12 += 6) {
                            arrayList.add(new PathNode.CurveTo(fArr3[i12], fArr3[i12 + 1], fArr3[i12 + 2], fArr3[i12 + 3], fArr3[i12 + 4], fArr3[i12 + 5]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'H':
                        c = c2;
                        int i13 = i3 - 1;
                        for (int i14 = c; i14 <= i13; i14++) {
                            arrayList.add(new PathNode.HorizontalTo(fArr3[i14]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'L':
                        c = c2;
                        int i15 = i3 - 2;
                        for (int i16 = c; i16 <= i15; i16 += 2) {
                            arrayList.add(new PathNode.LineTo(fArr3[i16], fArr3[i16 + 1]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'M':
                        c = c2;
                        int i17 = i3 - 2;
                        if (i17 >= 0) {
                            arrayList.add(new PathNode.MoveTo(fArr3[c], fArr3[1]));
                            while (i8 <= i17) {
                                arrayList.add(new PathNode.LineTo(fArr3[i8], fArr3[i8 + 1]));
                                i8 += 2;
                            }
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'Q':
                        c = c2;
                        int i18 = i3 - 4;
                        for (int i19 = c; i19 <= i18; i19 += 4) {
                            arrayList.add(new PathNode.QuadTo(fArr3[i19], fArr3[i19 + 1], fArr3[i19 + 2], fArr3[i19 + 3]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'S':
                        c = c2;
                        int i20 = i3 - 4;
                        for (int i21 = c; i21 <= i20; i21 += 4) {
                            arrayList.add(new PathNode.ReflectiveCurveTo(fArr3[i21], fArr3[i21 + 1], fArr3[i21 + 2], fArr3[i21 + 3]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'T':
                        c = c2;
                        int i22 = i3 - 2;
                        for (int i23 = c; i23 <= i22; i23 += 2) {
                            arrayList.add(new PathNode.ReflectiveQuadTo(fArr3[i23], fArr3[i23 + 1]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'V':
                        c = c2;
                        int i24 = i3 - 1;
                        for (int i25 = c; i25 <= i24; i25++) {
                            arrayList.add(new PathNode.VerticalTo(fArr3[i25]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'Z':
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                        c = c2;
                        arrayList.add(PathNode.Close.INSTANCE);
                        i2 = i;
                        c2 = c;
                        break;
                    case 'a':
                        int i26 = i3 - 7;
                        int i27 = c2;
                        while (i27 <= i26) {
                            char c4 = c2;
                            arrayList.add(new PathNode.RelativeArcTo(fArr3[i27], fArr3[i27 + 1], fArr3[i27 + 2], Float.compare(fArr3[i27 + 3], RecyclerView.DECELERATION_RATE) != 0 ? 1 : c4, Float.compare(fArr3[i27 + 4], RecyclerView.DECELERATION_RATE) != 0 ? 1 : c4, fArr3[i27 + 5], fArr3[i27 + 6]));
                            i27 += 7;
                            c2 = c4;
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'c':
                        int i28 = i3 - 6;
                        for (int i29 = c2; i29 <= i28; i29 += 6) {
                            arrayList.add(new PathNode.RelativeCurveTo(fArr3[i29], fArr3[i29 + 1], fArr3[i29 + 2], fArr3[i29 + 3], fArr3[i29 + 4], fArr3[i29 + 5]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'h':
                        int i30 = i3 - 1;
                        for (int i31 = c2; i31 <= i30; i31++) {
                            arrayList.add(new PathNode.RelativeHorizontalTo(fArr3[i31]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'l':
                        int i32 = i3 - 2;
                        for (int i33 = c2; i33 <= i32; i33 += 2) {
                            arrayList.add(new PathNode.RelativeLineTo(fArr3[i33], fArr3[i33 + 1]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'm':
                        int i34 = i3 - 2;
                        if (i34 >= 0) {
                            arrayList.add(new PathNode.RelativeMoveTo(fArr3[c2], fArr3[1]));
                            while (i8 <= i34) {
                                arrayList.add(new PathNode.RelativeLineTo(fArr3[i8], fArr3[i8 + 1]));
                                i8 += 2;
                            }
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'q':
                        int i35 = i3 - 4;
                        for (int i36 = c2; i36 <= i35; i36 += 4) {
                            arrayList.add(new PathNode.RelativeQuadTo(fArr3[i36], fArr3[i36 + 1], fArr3[i36 + 2], fArr3[i36 + 3]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 's':
                        int i37 = i3 - 4;
                        for (int i38 = c2; i38 <= i37; i38 += 4) {
                            arrayList.add(new PathNode.RelativeReflectiveCurveTo(fArr3[i38], fArr3[i38 + 1], fArr3[i38 + 2], fArr3[i38 + 3]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 't':
                        int i39 = i3 - 2;
                        for (int i40 = c2; i40 <= i39; i40 += 2) {
                            arrayList.add(new PathNode.RelativeReflectiveQuadTo(fArr3[i40], fArr3[i40 + 1]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'v':
                        int i41 = i3 - 1;
                        for (int i42 = c2; i42 <= i41; i42++) {
                            arrayList.add(new PathNode.RelativeVerticalTo(fArr3[i42]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    default:
                        Path$$ExternalSyntheticBUOutline0.m$2(charAt, "Unknown command for: ");
                        break;
                }
                return;
            }
            i2 = i;
        }
    }

    public void record(TextUndoOperation textUndoOperation) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) this.workTaskExecutor;
        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextUndoOperation textUndoOperation2 = (TextUndoOperation) parcelableSnapshotMutableState.getValue();
            if (textUndoOperation2 == null) {
                parcelableSnapshotMutableState.setValue(textUndoOperation);
                return;
            }
            TextUndoOperation merge = zzadj.merge(textUndoOperation2, textUndoOperation);
            if (merge != null) {
                parcelableSnapshotMutableState.setValue(merge);
            } else {
                flush();
                parcelableSnapshotMutableState.setValue(textUndoOperation);
            }
        } finally {
            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public void remove() {
        ViewParent parent = getSplashScreenView().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(getSplashScreenView());
        }
    }

    public InputMethodManager requireImm() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.workTaskExecutor;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = ((View) this.processor).getContext().getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService;
        this.workTaskExecutor = inputMethodManager2;
        return inputMethodManager2;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    /* renamed from: restore */
    public Object mo380restore(Object obj) {
        return ((Function1) this.workTaskExecutor).invoke(obj);
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public Object save(SaveableHolder saveableHolder, Object obj) {
        return ((Function2) this.processor).invoke(saveableHolder, obj);
    }

    public void setAllCaps(boolean z) {
        ((Trace) ((Extras.Key) this.workTaskExecutor).f61default).setAllCaps(z);
    }

    public void setEnabled(boolean z) {
        ((Trace) ((Extras.Key) this.workTaskExecutor).f61default).setEnabled(z);
    }

    public boolean shouldDiscard$bugsnag_plugin_android_ndk_release(JsonReader jsonReader) {
        boolean z;
        boolean z2;
        boolean z3;
        jsonReader.beginObject();
        boolean z4 = true;
        boolean z5 = true;
        do {
            z = false;
            if (!jsonReader.hasNext() || (!z4 && !z5)) {
                return false;
            }
            String nextName = jsonReader.nextName();
            if (Intrinsics.areEqual(nextName, "app")) {
                Collection collection = (Collection) this.workTaskExecutor;
                if (collection.isEmpty()) {
                    jsonReader.skipValue();
                } else {
                    jsonReader.beginObject();
                    while (jsonReader.peek() != JsonToken.END_OBJECT) {
                        if (!Intrinsics.areEqual(jsonReader.nextName(), "releaseStage")) {
                            jsonReader.skipValue();
                        } else if (!collection.contains(jsonReader.nextString())) {
                            z3 = true;
                            break;
                        }
                    }
                    jsonReader.endObject();
                }
                z3 = false;
                z = z3;
                z4 = false;
            } else if (Intrinsics.areEqual(nextName, "exceptions")) {
                jsonReader.beginArray();
                while (true) {
                    if (jsonReader.peek() == JsonToken.END_ARRAY) {
                        jsonReader.endArray();
                        z2 = false;
                        break;
                    }
                    jsonReader.beginObject();
                    while (jsonReader.peek() != JsonToken.END_OBJECT) {
                        if (!Intrinsics.areEqual(jsonReader.nextName(), "errorClass")) {
                            jsonReader.skipValue();
                        } else if (NativeInterface.isDiscardErrorClass(jsonReader.nextString())) {
                            ((Logger) this.processor).d("Discarding native report due to errorClass");
                            z2 = true;
                            break;
                        }
                    }
                    jsonReader.endObject();
                }
                z = z2;
                z5 = false;
            } else {
                jsonReader.skipValue();
            }
        } while (!z);
        return true;
    }

    public void startStylusHandwriting() {
    }

    public void startWork(StartStopToken startStopToken, GrpcMethod grpcMethod) {
        startStopToken.getClass();
        TaskExecutor taskExecutor = (TaskExecutor) this.workTaskExecutor;
        Processor$$ExternalSyntheticLambda1 processor$$ExternalSyntheticLambda1 = new Processor$$ExternalSyntheticLambda1(2, this, startStopToken, grpcMethod);
        taskExecutor.getClass();
        ((WorkManagerTaskExecutor) taskExecutor).mBackgroundExecutor.execute(processor$$ExternalSyntheticLambda1);
    }

    public void stopWork(StartStopToken startStopToken, int i) {
        startStopToken.getClass();
        TaskExecutor taskExecutor = (TaskExecutor) this.workTaskExecutor;
        StopWorkRunnable stopWorkRunnable = new StopWorkRunnable((Processor) this.processor, startStopToken, false, i);
        taskExecutor.getClass();
        ((WorkManagerTaskExecutor) taskExecutor).mBackgroundExecutor.execute(stopWorkRunnable);
    }

    public String toString() {
        int i = 0;
        switch (this.$r8$classId) {
            case 4:
                StringBuilder sb = new StringBuilder("ChangeList(changes=[");
                MutableVector mutableVector = (MutableVector) this.processor;
                Object[] objArr = mutableVector.content;
                int i2 = mutableVector.size;
                while (i < i2) {
                    ChangeTracker$Change changeTracker$Change = (ChangeTracker$Change) objArr[i];
                    sb.append("(" + changeTracker$Change.originalStart + ',' + changeTracker$Change.originalEnd + ")->(" + changeTracker$Change.preStart + ',' + changeTracker$Change.preEnd + ')');
                    if (i < ((MutableVector) this.processor).size - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                sb.append("])");
                return sb.toString();
            case 16:
                return "Bounds{lower=" + ((Insets) this.processor) + " upper=" + ((Insets) this.workTaskExecutor) + "}";
            case 25:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.workTaskExecutor.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.processor;
                int size = arrayList.size();
                while (i < size) {
                    sb2.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb2.append(", ");
                    }
                    i++;
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public StartStopToken tokenFor(WorkGenerationalId workGenerationalId) {
        StartStopToken startStopToken;
        synchronized (this.workTaskExecutor) {
            startStopToken = ((StartStopTokensImpl) this.processor).tokenFor(workGenerationalId);
        }
        return startStopToken;
    }

    public int zaa(Context context, GmsClient gmsClient) {
        int i;
        int i2;
        zzae.checkNotNull(context);
        zzae.checkNotNull(gmsClient);
        int minApkVersion = gmsClient.getMinApkVersion();
        SparseIntArray sparseIntArray = (SparseIntArray) this.processor;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(minApkVersion, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.processor;
        synchronized (sparseIntArray2) {
            i2 = 0;
            int i3 = 0;
            while (true) {
                try {
                    if (i3 >= sparseIntArray2.size()) {
                        i2 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray2.keyAt(i3);
                    if (keyAt > minApkVersion && sparseIntArray2.get(keyAt) == 0) {
                        break;
                    }
                    i3++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i2 == -1) {
                i2 = ((GoogleApiAvailabilityLight) this.workTaskExecutor).isGooglePlayServicesAvailable(context, minApkVersion);
            }
            sparseIntArray2.put(minApkVersion, i2);
        }
        return i2;
    }

    public zzof zza(String str, int i, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.processor;
        zzof zzofVar = (zzof) atomicReferenceArray.get(i);
        if (zzofVar != null) {
            return zzofVar;
        }
        zznx zza = ((zzxs) this.workTaskExecutor).zza(str, z);
        while (!atomicReferenceArray.compareAndSet(i, null, zza)) {
            if (atomicReferenceArray.get(i) != null) {
                zzof zzofVar2 = (zzof) atomicReferenceArray.get(i);
                zzofVar2.getClass();
                return zzofVar2;
            }
        }
        return zza;
    }

    public zzof zzb(long j, String str, int i) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.processor;
        zzof zzofVar = (zzof) atomicReferenceArray.get(i);
        if (zzofVar != null) {
            return zzofVar;
        }
        zzob zzobVar = new zzob(str, (zzpi) ((zzxs) this.workTaskExecutor).zza$1, j);
        while (!atomicReferenceArray.compareAndSet(i, null, zzobVar)) {
            if (atomicReferenceArray.get(i) != null) {
                zzof zzofVar2 = (zzof) atomicReferenceArray.get(i);
                zzofVar2.getClass();
                return zzofVar2;
            }
        }
        return zzobVar;
    }

    public zzof zzd(int i, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.processor;
        zzof zzofVar = (zzof) atomicReferenceArray.get(i);
        if (zzofVar != null) {
            return zzofVar;
        }
        zzod zzodVar = new zzod(str, (zzpi) ((zzxs) this.workTaskExecutor).zza$1, str2);
        while (!atomicReferenceArray.compareAndSet(i, null, zzodVar)) {
            if (atomicReferenceArray.get(i) != null) {
                zzof zzofVar2 = (zzof) atomicReferenceArray.get(i);
                zzofVar2.getClass();
                return zzofVar2;
            }
        }
        return zzodVar;
    }

    public StartStopToken remove(WorkGenerationalId workGenerationalId) {
        StartStopToken remove;
        workGenerationalId.getClass();
        synchronized (this.workTaskExecutor) {
            remove = ((StartStopTokensImpl) this.processor).remove(workGenerationalId);
        }
        return remove;
    }

    public WorkLauncherImpl(zzxs zzxsVar, int i) {
        this.$r8$classId = 28;
        this.workTaskExecutor = zzxsVar;
        this.processor = new AtomicReferenceArray(i);
    }

    public WorkLauncherImpl(zzoc zzocVar) {
        this.$r8$classId = 29;
        this.workTaskExecutor = zzocVar;
    }

    public /* synthetic */ WorkLauncherImpl(Object obj) {
        this.$r8$classId = 25;
        zzae.checkNotNull(obj);
        this.workTaskExecutor = obj;
        this.processor = new ArrayList();
    }

    public WorkLauncherImpl(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.$r8$classId = 26;
        this.processor = new SparseIntArray();
        zzae.checkNotNull(googleApiAvailabilityLight);
        this.workTaskExecutor = googleApiAvailabilityLight;
    }

    public WorkLauncherImpl(ContextModule contextModule) {
        this.$r8$classId = 21;
        Context context = contextModule.ctx;
        StorageManager storageManager = null;
        try {
            Object systemService = context.getSystemService("storage");
            storageManager = (StorageManager) (systemService instanceof StorageManager ? systemService : null);
        } catch (RuntimeException unused) {
        }
        this.processor = storageManager;
        this.workTaskExecutor = Bugsnag.getActivityManagerFrom(context);
    }

    public WorkLauncherImpl(Moshi moshi) {
        this.$r8$classId = 19;
        this.processor = moshi;
        this.workTaskExecutor = Types.newParameterizedType(Map.class, String.class, Object.class);
    }

    public WorkLauncherImpl(Logger logger) {
        this.$r8$classId = 22;
        Object enabledReleaseStages = NativeInterface.getEnabledReleaseStages();
        enabledReleaseStages = enabledReleaseStages == null ? EmptySet.INSTANCE : enabledReleaseStages;
        this.processor = logger;
        this.workTaskExecutor = enabledReleaseStages;
    }

    public WorkLauncherImpl(InternalLogger internalLogger) {
        this.$r8$classId = 24;
        internalLogger.getClass();
        this.processor = internalLogger;
        this.workTaskExecutor = new LinkedHashMap();
    }

    public WorkLauncherImpl(Context context) {
        this.$r8$classId = 18;
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this.processor = (ConnectivityManager) systemService;
        Object systemService2 = context.getSystemService("phone");
        systemService2.getClass();
        this.workTaskExecutor = (TelephonyManager) systemService2;
    }

    public WorkLauncherImpl(Function1 function1) {
        this.$r8$classId = 23;
        function1.getClass();
        this.processor = function1;
        this.workTaskExecutor = new AtomicReference(null);
    }

    public WorkLauncherImpl(LayoutNode layoutNode, MeasurePolicy measurePolicy) {
        this.$r8$classId = 10;
        this.processor = layoutNode;
        this.workTaskExecutor = Updater.mutableStateOf$default(measurePolicy);
    }

    public WorkLauncherImpl(WorkLauncherImpl workLauncherImpl) {
        MutableVector mutableVector;
        this.$r8$classId = 4;
        this.processor = new MutableVector(0, new ChangeTracker$Change[16]);
        this.workTaskExecutor = new MutableVector(0, new ChangeTracker$Change[16]);
        if (workLauncherImpl == null || (mutableVector = (MutableVector) workLauncherImpl.processor) == null) {
            return;
        }
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            ChangeTracker$Change changeTracker$Change = (ChangeTracker$Change) objArr[i2];
            ((MutableVector) this.processor).add(new ChangeTracker$Change(changeTracker$Change.preStart, changeTracker$Change.preEnd, changeTracker$Change.originalStart, changeTracker$Change.originalEnd));
        }
    }

    public WorkLauncherImpl(TextUndoOperation textUndoOperation, UndoManager undoManager) {
        this.$r8$classId = 3;
        this.processor = undoManager;
        this.workTaskExecutor = Updater.mutableStateOf$default(textUndoOperation);
    }

    public WorkLauncherImpl(LaunchTracker$$ExternalSyntheticLambda0 launchTracker$$ExternalSyntheticLambda0) {
        this.$r8$classId = 7;
        this.processor = launchTracker$$ExternalSyntheticLambda0;
        this.workTaskExecutor = new AtomicInt(0);
    }

    public WorkLauncherImpl(KeyTemplate keyTemplate, Bytes bytes) {
        this.$r8$classId = 1;
        this.workTaskExecutor = keyTemplate;
        this.processor = bytes;
    }

    public WorkLauncherImpl(final TextView textView) {
        this.$r8$classId = 2;
        this.processor = textView;
        Extras.Key key = new Extras.Key();
        key.f61default = new Trace(textView) { // from class: androidx.emoji2.viewsintegration.EmojiTextViewHelper$SkippingHelper19
            public final EmojiTextViewHelper$HelperInternal19 mHelperDelegate;

            {
                this.mHelperDelegate = new EmojiTextViewHelper$HelperInternal19(textView);
            }

            @Override // androidx.tracing.Trace
            public final InputFilter[] getFilters(InputFilter[] inputFilterArr) {
                return !EmojiCompat.isConfigured() ? inputFilterArr : this.mHelperDelegate.getFilters(inputFilterArr);
            }

            @Override // androidx.tracing.Trace
            public final boolean isEnabled() {
                return this.mHelperDelegate.mEnabled;
            }

            @Override // androidx.tracing.Trace
            public final void setAllCaps(boolean z) {
                if (EmojiCompat.isConfigured()) {
                    this.mHelperDelegate.setAllCaps(z);
                }
            }

            @Override // androidx.tracing.Trace
            public final void setEnabled(boolean z) {
                boolean isConfigured = EmojiCompat.isConfigured();
                EmojiTextViewHelper$HelperInternal19 emojiTextViewHelper$HelperInternal19 = this.mHelperDelegate;
                if (isConfigured) {
                    emojiTextViewHelper$HelperInternal19.setEnabled(z);
                } else {
                    emojiTextViewHelper$HelperInternal19.mEnabled = z;
                }
            }

            @Override // androidx.tracing.Trace
            public final TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
                return !EmojiCompat.isConfigured() ? transformationMethod : this.mHelperDelegate.wrapTransformationMethod(transformationMethod);
            }
        };
        this.workTaskExecutor = key;
    }

    public WorkLauncherImpl(Processor processor, TaskExecutor taskExecutor) {
        this.$r8$classId = 0;
        processor.getClass();
        taskExecutor.getClass();
        this.processor = processor;
        this.workTaskExecutor = taskExecutor;
    }

    public WorkLauncherImpl(StartStopTokensImpl startStopTokensImpl) {
        this.$r8$classId = 17;
        this.processor = startStopTokensImpl;
        this.workTaskExecutor = new Object();
    }

    public WorkLauncherImpl(MainActivity mainActivity) {
        this.$r8$classId = 15;
        this.processor = mainActivity;
        this.workTaskExecutor = LazyKt.lazy(new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 15));
    }

    public WorkLauncherImpl(View view) {
        this.$r8$classId = 5;
        this.processor = view;
    }

    public WorkLauncherImpl(WindowInsetsAnimation.Bounds bounds) {
        this.$r8$classId = 16;
        this.processor = WindowInsetsAnimationCompat.Impl30.getLowerBounds(bounds);
        this.workTaskExecutor = WindowInsetsAnimationCompat.Impl30.getHigherBounds(bounds);
    }

    public /* synthetic */ WorkLauncherImpl(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.processor = obj;
        this.workTaskExecutor = obj2;
    }
}
