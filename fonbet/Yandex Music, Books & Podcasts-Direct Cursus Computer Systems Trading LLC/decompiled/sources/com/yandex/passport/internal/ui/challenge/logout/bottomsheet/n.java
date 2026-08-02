package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.content.Intent;
import defpackage.ezc;
import defpackage.rh;
import defpackage.syc;
import defpackage.zyc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class n implements rh, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ LogoutBottomSheetComposeActivity b;

    public /* synthetic */ n(LogoutBottomSheetComposeActivity logoutBottomSheetComposeActivity, int i) {
        this.a = i;
        this.b = logoutBottomSheetComposeActivity;
    }

    @Override // defpackage.rh
    public final void a(Object obj) {
        int i = this.a;
        LogoutBottomSheetComposeActivity logoutBottomSheetComposeActivity = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
                j0Var.getClass();
                int i2 = LogoutBottomSheetComposeActivity.f;
                if (!Intrinsics.d(j0Var, com.yandex.passport.api.h0.a)) {
                    logoutBottomSheetComposeActivity.a = false;
                    com.yandex.passport.internal.ui.a.r(logoutBottomSheetComposeActivity, com.yandex.plus.pay.ui.core.b.F(j0Var));
                    break;
                }
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                logoutBottomSheetComposeActivity.a = false;
                logoutBottomSheetComposeActivity.setResult(intValue, new Intent());
                logoutBottomSheetComposeActivity.finish();
                break;
            case 2:
                com.yandex.passport.api.j0 j0Var2 = (com.yandex.passport.api.j0) obj;
                j0Var2.getClass();
                int i3 = LogoutBottomSheetComposeActivity.f;
                if (!Intrinsics.d(j0Var2, com.yandex.passport.api.h0.a)) {
                    logoutBottomSheetComposeActivity.a = false;
                    com.yandex.passport.internal.ui.a.r(logoutBottomSheetComposeActivity, com.yandex.plus.pay.ui.core.b.F(j0Var2));
                    break;
                }
                break;
            default:
                int intValue2 = ((Number) obj).intValue();
                logoutBottomSheetComposeActivity.a = false;
                logoutBottomSheetComposeActivity.setResult(intValue2, new Intent());
                logoutBottomSheetComposeActivity.finish();
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
            case 2:
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
                return new ezc(1, 0, LogoutBottomSheetComposeActivity.class, this.b, "onDeleteResult", "onDeleteResult(Lcom/yandex/passport/api/PassportDeleteResult;)V");
            case 1:
                return new ezc(1, 0, LogoutBottomSheetComposeActivity.class, this.b, "onLogoutResult", "onLogoutResult(I)V");
            case 2:
                return new ezc(1, 0, LogoutBottomSheetComposeActivity.class, this.b, "onDeleteResult", "onDeleteResult(Lcom/yandex/passport/api/PassportDeleteResult;)V");
            default:
                return new ezc(1, 0, LogoutBottomSheetComposeActivity.class, this.b, "onLogoutResult", "onLogoutResult(I)V");
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
