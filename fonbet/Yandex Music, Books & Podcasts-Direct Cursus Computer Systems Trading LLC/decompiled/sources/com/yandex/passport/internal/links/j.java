package com.yandex.passport.internal.links;

import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.sloth.webcard.s0;
import defpackage.ezc;
import defpackage.hq0;
import defpackage.ph;
import defpackage.rh;
import defpackage.syc;
import defpackage.zyc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class j implements rh, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ hq0 b;

    public /* synthetic */ j(hq0 hq0Var, int i) {
        this.a = i;
        this.b = hq0Var;
    }

    @Override // defpackage.rh
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                s0 s0Var = (s0) obj;
                s0Var.getClass();
                LinksHandlingActivity.m((LinksHandlingActivity) this.b, s0Var);
                break;
            case 1:
                s0 s0Var2 = (s0) obj;
                s0Var2.getClass();
                LinksHandlingActivity.m((LinksHandlingActivity) this.b, s0Var2);
                break;
            default:
                ph phVar = (ph) obj;
                phVar.getClass();
                GlobalRouterActivity.j((GlobalRouterActivity) this.b, phVar);
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
                return new ezc(1, 0, LinksHandlingActivity.class, (LinksHandlingActivity) this.b, "processWebCardResult", "processWebCardResult(Lcom/yandex/passport/internal/ui/sloth/webcard/WebCardResult;)V");
            case 1:
                return new ezc(1, 0, LinksHandlingActivity.class, (LinksHandlingActivity) this.b, "processWebCardResult", "processWebCardResult(Lcom/yandex/passport/internal/ui/sloth/webcard/WebCardResult;)V");
            default:
                return new ezc(1, 0, GlobalRouterActivity.class, (GlobalRouterActivity) this.b, "processResult", "processResult(Lcom/lightside/android/ActivityResult;)V");
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
