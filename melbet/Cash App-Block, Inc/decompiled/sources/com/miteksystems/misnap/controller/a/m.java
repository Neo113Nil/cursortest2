package com.miteksystems.misnap.controller.a;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.mlkit.vision.text.zzb;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.core.FaceIqaCheck;
import com.miteksystems.misnap.core.Frame;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.face.FaceAnalysisSettings;
import com.miteksystems.misnap.face.MiSnapFaceAnalyzer;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final class m implements a0 {
    public final MiSnapSettings.Analysis.Face a;
    public final Function0 b;
    public final boolean c;
    public final MiSnapFaceAnalyzer d;
    public final z e;
    public int f;
    public long g;

    public final /* synthetic */ class a extends FunctionReferenceImpl implements Function0 {
        public static final a a = new a(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public abstract /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[MiSnapSettings.Analysis.Face.Trigger.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[CameraSelector$$ExternalSyntheticOutline0.values(3).length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    public m(MiSnapSettings.Analysis.Face face, String str, MiSnapFaceAnalyzer miSnapFaceAnalyzer) {
        z zVar;
        a aVar = a.a;
        face.getClass();
        str.getClass();
        this.a = face;
        this.b = aVar;
        this.c = true;
        this.d = miSnapFaceAnalyzer;
        int i = b.a[FaceAnalysisSettings.requireTrigger(face).ordinal()];
        if (i == 1) {
            zVar = new zzb(12);
        } else if (i == 2) {
            x xVar = new x();
            xVar.a = 1;
            zVar = xVar;
        } else {
            if (i != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            zVar = new v();
        }
        this.e = zVar;
        this.f = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if (r3 != 3) goto L20;
     */
    @Override // com.miteksystems.misnap.controller.a.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Frame frame, ContinuationImpl continuationImpl) {
        UserAction userAction;
        MiSnapFaceAnalyzer.Result.Processed analyze = this.d.analyze(frame);
        if (!(analyze instanceof MiSnapFaceAnalyzer.Result.Processed)) {
            if (analyze instanceof MiSnapFaceAnalyzer.Result.Failure) {
                throw new c(new MiSnapController.ErrorResult.FaceAnalysis((MiSnapFaceAnalyzer.Result.Failure) analyze));
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        List prioritizedIqaChecks = FaceAnalysisSettings.getPrioritizedIqaChecks(this.a.advanced);
        MiSnapFaceAnalyzer.Result.Processed processed = analyze;
        List passedFaceChecks = processed.getPassedFaceChecks();
        ArrayList arrayList = new ArrayList();
        for (Object obj : prioritizedIqaChecks) {
            if (!n.a((FaceIqaCheck) obj, passedFaceChecks)) {
                arrayList.add(obj);
            }
        }
        UserAction userAction2 = UserAction.NONE.INSTANCE;
        boolean isEmpty = arrayList.isEmpty();
        z zVar = this.e;
        if (isEmpty) {
            int i = b.b[CameraSelector$$ExternalSyntheticOutline0.ordinal(this.f)];
            Function0 function0 = this.b;
            if (i != 1) {
                if (i == 2) {
                    if (((Number) function0.invoke()).longValue() > this.g + FaceAnalysisSettings.getTriggerDelay(r0.advanced, FaceAnalysisSettings.requireTrigger(r0))) {
                        this.f = 3;
                    }
                }
                userAction2 = zVar.a(frame, processed);
            } else {
                this.f = 2;
                this.g = ((Number) function0.invoke()).longValue();
            }
            userAction2 = UserAction.Face.HOLD_STILL.INSTANCE;
        } else {
            FaceIqaCheck faceIqaCheck = (FaceIqaCheck) CollectionsKt.firstOrNull((List) arrayList);
            if (faceIqaCheck == null || (userAction = n.a(faceIqaCheck)) == null) {
                userAction = UserAction.Face.NOT_FOUND.INSTANCE;
            }
            userAction2 = userAction;
            this.f = 1;
            this.g = 0L;
            zVar.a();
        }
        UserAction userAction3 = userAction2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(n.a((FaceIqaCheck) it.next()));
        }
        return new o(userAction3, this.c ? processed.getFaceIqasResult() : null, arrayList2, processed.getFaceBoundingBox(), processed.getLicenseExpired());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(MiSnapSettings.Analysis.Face face, String str) {
        this(face, str, new MiSnapFaceAnalyzer(face, str));
        a aVar = a.a;
    }

    @Override // com.miteksystems.misnap.controller.a.a0
    public final /* synthetic */ void a() {
        this.d.release();
    }
}
