package ru.yandex.logistics.care.ui;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.payment.common.result.ResultType;
import defpackage.bt8;
import defpackage.fbx;
import defpackage.gbx;
import defpackage.h2t;
import defpackage.jbx;
import defpackage.kbx;
import defpackage.l4c;
import defpackage.m4c;
import defpackage.mvg;
import defpackage.n4c;
import defpackage.ny61;
import defpackage.o4c;
import defpackage.p4c;
import defpackage.q4c;
import defpackage.sbx;
import defpackage.tse;
import defpackage.vuu0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.ui.CareWebViewViewModelImpl$sendPhotoVerificationResult$1", f = "CareWebViewViewModel.kt", l = {269, SubsamplingScaleImageView.ORIENTATION_270}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareWebViewViewModelImpl$sendPhotoVerificationResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ q4c $reason;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ l this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @mvg(c = "ru.yandex.logistics.care.ui.CareWebViewViewModelImpl$sendPhotoVerificationResult$1$1", f = "CareWebViewViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.logistics.care.ui.CareWebViewViewModelImpl$sendPhotoVerificationResult$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((AnonymousClass1) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(z);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareWebViewViewModelImpl$sendPhotoVerificationResult$1(l lVar, q4c q4cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$reason = q4cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CareWebViewViewModelImpl$sendPhotoVerificationResult$1(this.this$0, this.$reason, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareWebViewViewModelImpl$sendPhotoVerificationResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00fd, code lost:
    
        if (r11.emit(r1, r10) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ff, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ec, code lost:
    
        if (kotlinx.coroutines.flow.e.x(r11, r5, r10) == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object gbxVar;
        String c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = ((bt8) this.this$0.C.getValue()).b;
            h2t h2tVar = this.this$0.z;
            q4c q4cVar = this.$reason;
            if (q4cVar instanceof o4c) {
                gbxVar = new jbx(((o4c) q4cVar).a);
            } else if (q4cVar instanceof n4c) {
                n4c n4cVar = (n4c) q4cVar;
                gbxVar = new gbx(n4cVar.a, new fbx(n4cVar.b ? "CAMERA_PERMISSION_DENIED" : "CAMERA_OPEN_FAILED", "camera"));
            } else if (q4cVar instanceof l4c) {
                gbxVar = new gbx(((l4c) q4cVar).a, new fbx("CANCELLED_BY_USER", "camera"));
            } else if (q4cVar instanceof m4c) {
                gbxVar = new gbx(((m4c) q4cVar).a, new fbx("CANCELLED_BY_USER", ResultType.RESULT_TYPE_FAILURE));
            } else {
                if (!(q4cVar instanceof p4c)) {
                    w511.b();
                    return null;
                }
                gbxVar = new gbx("none", new fbx("CONFIGURATION_NOT_SUPPORTED", "camera"));
            }
            c = vuu0.c("\n            (function() {\n                const result = " + ((sbx) h2tVar.a).c(gbxVar, kbx.Companion.serializer()) + ";\n                window.postMessage({\n                    type: 'photo_verification_result',\n                    result: result\n                }, '" + str + "');\n            })();\n        ");
            r0 r0Var = this.this$0.Q;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
            this.L$0 = null;
            this.L$1 = c;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            c = (String) this.L$1;
            kotlin.b.b(obj);
        }
        n0 n0Var = this.this$0.O;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
