package ru.yandex.taxi.routeselector.presentation;

import android.graphics.Bitmap;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import defpackage.g16;
import defpackage.hnb0;
import defpackage.m9l0;
import defpackage.mob0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.umb0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routeselector.presentation.RouteSelectorPresenter$attachView$12", f = "RouteSelectorPresenter.kt", l = {233, 241}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteSelectorPresenter$attachView$12 extends SuspendLambda implements wls {
    final /* synthetic */ m9l0 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSelectorPresenter$attachView$12(s sVar, m9l0 m9l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
        this.$mvpView = m9l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteSelectorPresenter$attachView$12(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteSelectorPresenter$attachView$12) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r8 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        m9l0 m9l0Var;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g16 b = this.this$0.b0.b().b(this.this$0.c0.a.d());
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(b, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m9l0Var = (m9l0) this.L$3;
                bitmap = (Bitmap) this.L$2;
                str = (String) this.L$1;
                kotlin.b.b(obj);
                m9l0Var.renderPickupFromPhotoButton(bitmap, str, (String) obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        bitmap = (Bitmap) obj;
        if (bitmap != null) {
            s sVar = this.this$0;
            m9l0 m9l0Var2 = this.$mvpView;
            hnb0 hnb0Var = sVar.d0;
            mob0 mob0Var = sVar.c0;
            ((umb0) hnb0Var).a(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.CLARIFY);
            String e = mob0Var.a.e();
            this.L$0 = null;
            this.L$1 = e;
            this.L$2 = bitmap;
            this.L$3 = m9l0Var2;
            this.label = 2;
            obj = mob0Var.a();
            if (obj != coroutineSingletons) {
                m9l0Var = m9l0Var2;
                str = e;
                m9l0Var.renderPickupFromPhotoButton(bitmap, str, (String) obj);
            }
            return coroutineSingletons;
        }
        return zy11.a;
    }
}
