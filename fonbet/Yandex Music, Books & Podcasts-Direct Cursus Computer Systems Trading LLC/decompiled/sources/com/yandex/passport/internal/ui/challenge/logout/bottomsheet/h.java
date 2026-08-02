package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.content.Intent;
import defpackage.ezc;
import defpackage.rh;
import defpackage.syc;
import defpackage.zyc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements rh, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ LogoutBottomSheetActivity b;

    public /* synthetic */ h(LogoutBottomSheetActivity logoutBottomSheetActivity, int i) {
        this.a = i;
        this.b = logoutBottomSheetActivity;
    }

    @Override // defpackage.rh
    public final void a(Object obj) {
        int i = this.a;
        LogoutBottomSheetActivity logoutBottomSheetActivity = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
                j0Var.getClass();
                int i2 = LogoutBottomSheetActivity.k;
                if (!Intrinsics.d(j0Var, com.yandex.passport.api.h0.a)) {
                    com.yandex.passport.internal.ui.a.r(logoutBottomSheetActivity, com.yandex.plus.pay.ui.core.b.F(j0Var));
                    break;
                }
                break;
            case 1:
                com.yandex.passport.api.j0 j0Var2 = (com.yandex.passport.api.j0) obj;
                j0Var2.getClass();
                int i3 = LogoutBottomSheetActivity.k;
                if (!Intrinsics.d(j0Var2, com.yandex.passport.api.h0.a)) {
                    com.yandex.passport.internal.ui.a.r(logoutBottomSheetActivity, com.yandex.plus.pay.ui.core.b.F(j0Var2));
                    break;
                }
                break;
            default:
                logoutBottomSheetActivity.setResult(((Number) obj).intValue(), new Intent());
                logoutBottomSheetActivity.finish();
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof rh) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof rh) && (obj instanceof zyc)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof rh) && (obj instanceof zyc)) {
                    break;
                }
                break;
        }
        return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new ezc(1, 0, LogoutBottomSheetActivity.class, this.b, "deleteCallback", "deleteCallback(Lcom/yandex/passport/api/PassportDeleteResult;)V");
            case 1:
                return new ezc(1, 0, LogoutBottomSheetActivity.class, this.b, "deleteCallback", "deleteCallback(Lcom/yandex/passport/api/PassportDeleteResult;)V");
            default:
                return new ezc(1, 1, com.yandex.passport.internal.ui.a.class, this.b, "finishWithCode", "finishWithCode(Landroid/app/Activity;I)V");
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
