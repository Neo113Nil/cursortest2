package com.yandex.passport.internal.ui.account_upgrade;

import defpackage.ezc;
import defpackage.ph;
import defpackage.rh;
import defpackage.syc;
import defpackage.zyc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements rh, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ AccountUpgraderActivity b;

    public /* synthetic */ d(AccountUpgraderActivity accountUpgraderActivity, int i) {
        this.a = i;
        this.b = accountUpgraderActivity;
    }

    @Override // defpackage.rh
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ph phVar = (ph) obj;
                phVar.getClass();
                AccountUpgraderActivity.k(this.b, phVar);
                break;
            default:
                ph phVar2 = (ph) obj;
                phVar2.getClass();
                AccountUpgraderActivity.k(this.b, phVar2);
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
        }
        return new ezc(1, 0, AccountUpgraderActivity.class, this.b, "processResult", "processResult(Lcom/lightside/android/ActivityResult;)V");
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
