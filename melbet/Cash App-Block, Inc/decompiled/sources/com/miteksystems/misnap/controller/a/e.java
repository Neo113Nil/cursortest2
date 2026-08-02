package com.miteksystems.misnap.controller.a;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$doFetch$2;
import com.miteksystems.misnap.barcode.BarcodeAnalysisSettings;
import com.miteksystems.misnap.barcode.MiSnapBarcodeDetector;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.core.Frame;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.UserAction;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class e implements a0 {
    public final MiSnapSettings a;
    public final h b;
    public final com.miteksystems.misnap.controller.a.a c;
    public final MiSnapBarcodeDetector d;
    public com.miteksystems.misnap.controller.a.b e;

    public final class a extends ContinuationImpl {
        public e a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= PKIFailureInfo.systemUnavail;
            return e.this.a(null, this);
        }
    }

    public final class b extends SuspendLambda implements Function2 {
        public e a;
        public int b;
        public final /* synthetic */ Frame d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Frame frame, Continuation continuation) {
            super(2, continuation);
            this.d = frame;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new b(this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean isDetected;
            e eVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                e eVar2 = e.this;
                com.miteksystems.misnap.controller.a.b bVar = eVar2.e;
                if (!Intrinsics.areEqual(bVar != null ? bVar.a : null, UserAction.NONE.INSTANCE)) {
                    int type2 = BarcodeAnalysisSettings.getType(eVar2.a.analysis.barcode);
                    Frame frame = this.d;
                    if (type2 != 64) {
                        isDetected = true;
                    } else {
                        MiSnapBarcodeDetector.Result.Processed detect = eVar2.d.detect(frame);
                        if (!(detect instanceof MiSnapBarcodeDetector.Result.Processed)) {
                            if (detect instanceof MiSnapBarcodeDetector.Result.Failure) {
                                throw new c(new MiSnapController.ErrorResult.BarcodeDetection((MiSnapBarcodeDetector.Result.Failure) detect));
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        isDetected = detect.isDetected();
                    }
                    if (isDetected) {
                        com.miteksystems.misnap.controller.a.a aVar = eVar2.c;
                        this.a = eVar2;
                        this.b = 1;
                        Object a = aVar.a(frame, this);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = a;
                        eVar = eVar2;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = this.a;
            SafeTrace.throwOnFailure(obj);
            obj.getClass();
            eVar.e = (com.miteksystems.misnap.controller.a.b) obj;
            return Unit.INSTANCE;
        }
    }

    public e(Context context, MiSnapSettings miSnapSettings, String str) {
        str.getClass();
        MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
        h hVar = new h(context, analysis.document, str);
        com.miteksystems.misnap.controller.a.a aVar = new com.miteksystems.misnap.controller.a.a(context, analysis.barcode, str);
        MiSnapBarcodeDetector miSnapBarcodeDetector = new MiSnapBarcodeDetector(str);
        this.a = miSnapSettings;
        this.b = hVar;
        this.c = aVar;
        this.d = miSnapBarcodeDetector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0056, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.miteksystems.misnap.controller.a.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Frame frame, ContinuationImpl continuationImpl) {
        a aVar;
        CoroutineSingletons coroutineSingletons;
        int i;
        b bVar;
        e eVar;
        j jVar;
        UserAction userAction;
        UserAction.NONE none;
        UserAction userAction2;
        if (continuationImpl instanceof a) {
            aVar = (a) continuationImpl;
            int i2 = aVar.e;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.e = i2 - PKIFailureInfo.systemUnavail;
                Object obj = aVar.c;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.e;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    NetworkFetcher$doFetch$2 networkFetcher$doFetch$2 = new NetworkFetcher$doFetch$2(this, frame, objArr == true ? 1 : 0, 9);
                    aVar.a = this;
                    aVar.b = frame;
                    aVar.e = 1;
                    obj = JobKt.coroutineScope(networkFetcher$doFetch$2, aVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jVar = (j) aVar.b;
                        eVar = aVar.a;
                        SafeTrace.throwOnFailure(obj);
                        userAction = jVar.a;
                        none = UserAction.NONE.INSTANCE;
                        if (Intrinsics.areEqual(userAction, none)) {
                            MiSnapSettings.Analysis.Document document = eVar.a.analysis.document;
                            document.getClass();
                            MiSnapSettings.Analysis.Document.ExtractionRequirement extractionRequirement = document.c;
                            if (extractionRequirement == null) {
                                extractionRequirement = MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE;
                            }
                            if (extractionRequirement == MiSnapSettings.Analysis.Document.ExtractionRequirement.REQUIRED) {
                                com.miteksystems.misnap.controller.a.b bVar2 = eVar.e;
                                if (!Intrinsics.areEqual(bVar2 != null ? bVar2.a : null, none)) {
                                    userAction2 = UserAction.Barcode.NOT_FOUND.INSTANCE;
                                    return new f(userAction2, eVar.e, jVar);
                                }
                            }
                        }
                        userAction2 = jVar.a;
                        return new f(userAction2, eVar.e, jVar);
                    }
                    frame = (Frame) aVar.b;
                    this = aVar.a;
                    SafeTrace.throwOnFailure(obj);
                }
                j jVar2 = (j) obj;
                bVar = this.new b(frame, null);
                aVar.a = this;
                aVar.b = jVar2;
                aVar.e = 2;
                if (JobKt.coroutineScope(bVar, aVar) != coroutineSingletons) {
                    eVar = this;
                    jVar = jVar2;
                    userAction = jVar.a;
                    none = UserAction.NONE.INSTANCE;
                    if (Intrinsics.areEqual(userAction, none)) {
                    }
                    userAction2 = jVar.a;
                    return new f(userAction2, eVar.e, jVar);
                }
                return coroutineSingletons;
            }
        }
        aVar = new a(continuationImpl);
        Object obj2 = aVar.c;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.e;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        j jVar22 = (j) obj2;
        bVar = this.new b(frame, null);
        aVar.a = this;
        aVar.b = jVar22;
        aVar.e = 2;
        if (JobKt.coroutineScope(bVar, aVar) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // com.miteksystems.misnap.controller.a.a0
    public final /* synthetic */ void a() {
        this.b.a();
        this.c.a();
    }
}
