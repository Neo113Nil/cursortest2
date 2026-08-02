package ru.yandex.taxi.cashback.model;

import com.yandex.go.plus.api.model.BadgeContent$GlyphPosition;
import defpackage.avj0;
import defpackage.co4;
import defpackage.e29;
import defpackage.gzt;
import defpackage.h3b0;
import defpackage.h8b0;
import defpackage.hky0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qqd0;
import defpackage.x5d0;
import defpackage.y5d0;
import defpackage.yj4;
import defpackage.zj4;
import defpackage.zl4;
import defpackage.zls;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqqd0;", "userInfo", "", "availability", "Lak4;", "<anonymous>", "(Lqqd0;Z)Lak4;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.cashback.model.PlusMenuItemInteractorImpl$plusEnabledBadgeFlow$1", f = "PlusMenuItemInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PlusMenuItemInteractorImpl$plusEnabledBadgeFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ h3b0 $viewModel;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ x5d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusMenuItemInteractorImpl$plusEnabledBadgeFlow$1(h3b0 h3b0Var, x5d0 x5d0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = x5d0Var;
        this.$viewModel = h3b0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        x5d0 x5d0Var = this.this$0;
        PlusMenuItemInteractorImpl$plusEnabledBadgeFlow$1 plusMenuItemInteractorImpl$plusEnabledBadgeFlow$1 = new PlusMenuItemInteractorImpl$plusEnabledBadgeFlow$1(this.$viewModel, x5d0Var, (Continuation) obj3);
        plusMenuItemInteractorImpl$plusEnabledBadgeFlow$1.L$0 = (qqd0) obj;
        plusMenuItemInteractorImpl$plusEnabledBadgeFlow$1.Z$0 = booleanValue;
        return plusMenuItemInteractorImpl$plusEnabledBadgeFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qqd0 qqd0Var = (qqd0) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        y5d0 y5d0Var = (y5d0) this.this$0.c.get();
        h3b0 h3b0Var = this.$viewModel;
        zuj0 zuj0Var = y5d0Var.a;
        h8b0 h8b0Var = h3b0Var.a;
        String str2 = h8b0Var != null ? h8b0Var.i : null;
        if (str2 == null || str2.length() == 0) {
            str = ((avj0) zuj0Var).h(kyh0.personal_wallet_deposit_menu_title);
        } else {
            h8b0 h8b0Var2 = h3b0Var.a;
            if (h8b0Var2 != null) {
                str = h8b0Var2.i;
            }
        }
        String str3 = str;
        if (!z) {
            return yj4.a;
        }
        zl4 a = ((e29) y5d0Var.b).a();
        gzt gztVar = a.a;
        float[] fArr = gztVar.b;
        int[] iArr = gztVar.a;
        String str4 = a.b;
        BadgeContent$GlyphPosition badgeContent$GlyphPosition = (qqd0Var.a == null) ^ (((avj0) zuj0Var).a.getResources().getConfiguration().getLayoutDirection() == 1) ? BadgeContent$GlyphPosition.START : BadgeContent$GlyphPosition.END;
        String str5 = qqd0Var.a;
        return new zj4(str5 != null ? new co4(Double.parseDouble(str5), str3, badgeContent$GlyphPosition, iArr, fArr, gztVar.c) : new hky0(str4, str3, badgeContent$GlyphPosition, iArr, fArr, gztVar.c));
    }
}
