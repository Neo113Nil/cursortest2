package ru.yandex.taxi.masstransit.main.ui.overlay;

import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import defpackage.cwa1;
import defpackage.fi6;
import defpackage.gh00;
import defpackage.j73;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qfu0;
import defpackage.vfu0;
import defpackage.wls;
import defpackage.yo30;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.preorder.source.userposition.e;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/mapkit/ScreenRect;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/mapkit/ScreenRect;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.main.ui.overlay.MtMainOverlayPresenter$handleFocusMode$1$1", f = "MtMainOverlayPresenter.kt", l = {HProv.PP_SAME_MEDIA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtMainOverlayPresenter$handleFocusMode$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ qfu0 $uiState;
    Object L$0;
    int label;
    final /* synthetic */ yo30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtMainOverlayPresenter$handleFocusMode$1$1(yo30 yo30Var, qfu0 qfu0Var, Continuation continuation) {
        super(2, continuation);
        this.$uiState = qfu0Var;
        this.this$0 = yo30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtMainOverlayPresenter$handleFocusMode$1$1(this.this$0, this.$uiState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtMainOverlayPresenter$handleFocusMode$1$1) create((ScreenRect) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vfu0 vfu0Var;
        mo21 mo21Var;
        Point point;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                vfu0 vfu0Var2 = this.$uiState.d;
                try {
                    po21 po21Var = this.this$0.G;
                    this.L$0 = vfu0Var2;
                    this.label = 1;
                    Object h = ((e) po21Var).h(this);
                    if (h == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vfu0Var = vfu0Var2;
                    obj = h;
                } catch (Throwable unused) {
                    vfu0Var = vfu0Var2;
                    mo21Var = null;
                    Point d = cwa1.d(vfu0Var.a);
                    if (mo21Var != null) {
                    }
                    List A = j73.A(new Point[]{d, point});
                    fi6 fi6Var = new fi6();
                    fi6Var.e(A);
                    ((gh00) this.this$0.C).A(fi6Var.g(), null);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vfu0Var = (vfu0) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable unused2) {
                    mo21Var = null;
                    Point d2 = cwa1.d(vfu0Var.a);
                    if (mo21Var != null) {
                    }
                    List A2 = j73.A(new Point[]{d2, point});
                    fi6 fi6Var2 = new fi6();
                    fi6Var2.e(A2);
                    ((gh00) this.this$0.C).A(fi6Var2.g(), null);
                    return zy11.a;
                }
            }
            mo21Var = (mo21) obj;
            Point d22 = cwa1.d(vfu0Var.a);
            if (mo21Var != null) {
                zzs a = mo21Var.a();
                point = new Point(a.a, a.b);
            } else {
                point = null;
            }
            List A22 = j73.A(new Point[]{d22, point});
            fi6 fi6Var22 = new fi6();
            fi6Var22.e(A22);
            ((gh00) this.this$0.C).A(fi6Var22.g(), null);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
