package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain;

import defpackage.gp7;
import defpackage.hp7;
import defpackage.ike;
import defpackage.ip7;
import defpackage.jqr;
import defpackage.kt7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.so7;
import defpackage.tje;
import defpackage.tse;
import defpackage.tys0;
import defpackage.w511;
import defpackage.wls;
import defpackage.y670;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.CameraManagerImpl$switchCameraType$1", f = "CameraManagerImpl.kt", l = {120, HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CameraManagerImpl$switchCameraType$1 extends SuspendLambda implements wls {
    final /* synthetic */ so7 $callback;
    final /* synthetic */ ip7 $config;
    final /* synthetic */ kt7 $newStrategy;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltys0;", "newState", "Lzy11;", "<anonymous>", "(Ltys0;)V"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.CameraManagerImpl$switchCameraType$1$1", f = "CameraManagerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.CameraManagerImpl$switchCameraType$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tys0) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tys0 tys0Var = (tys0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c cVar = this.this$0;
            if (cVar.h) {
                ike ikeVar = cVar.d;
                if (ikeVar != null) {
                    tje.N(ikeVar, null, null, new CameraManagerImpl$setCameraStateRespectingDelay$1(cVar, tys0Var, null), 3);
                }
            } else {
                cVar.i.l(tys0Var);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraManagerImpl$switchCameraType$1(ip7 ip7Var, kt7 kt7Var, so7 so7Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$config = ip7Var;
        this.$newStrategy = kt7Var;
        this.$callback = so7Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CameraManagerImpl$switchCameraType$1 cameraManagerImpl$switchCameraType$1 = new CameraManagerImpl$switchCameraType$1(this.$config, this.$newStrategy, this.$callback, this.this$0, continuation);
        cameraManagerImpl$switchCameraType$1.L$0 = obj;
        return cameraManagerImpl$switchCameraType$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraManagerImpl$switchCameraType$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r2.e(r7, r3, r6) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (r2.e(r7, r4, r6) == r1) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ip7 ip7Var = this.$config;
            if (ip7Var instanceof gp7) {
                kt7 kt7Var = this.$newStrategy;
                if (kt7Var == null) {
                    kt7Var = null;
                }
                if (kt7Var != null) {
                    h hVar = (h) this.$callback;
                    this.L$0 = tseVar;
                    this.label = 1;
                }
            } else {
                if (!(ip7Var instanceof hp7)) {
                    w511.b();
                    return null;
                }
                kt7 kt7Var2 = this.$newStrategy;
                if (kt7Var2 == null) {
                    kt7Var2 = null;
                }
                if (kt7Var2 != null) {
                    y670 y670Var = (y670) this.$callback;
                    this.L$0 = tseVar;
                    this.label = 2;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.e = e.H(tseVar, new jqr(this.$newStrategy.a(), new AnonymousClass1(this.this$0, null), 3));
        return zy11.a;
    }
}
