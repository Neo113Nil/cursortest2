package com.yandex.passport.internal.ui.authsdk;

import defpackage.ezc;
import defpackage.rh;
import defpackage.syc;
import defpackage.zyc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements rh, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ AuthSdkActivity b;

    public /* synthetic */ c(AuthSdkActivity authSdkActivity, int i) {
        this.a = i;
        this.b = authSdkActivity;
    }

    @Override // defpackage.rh
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.ui.sloth.authsdk.g gVar = (com.yandex.passport.internal.ui.sloth.authsdk.g) obj;
                gVar.getClass();
                AuthSdkActivity.m(this.b, gVar);
                break;
            default:
                com.yandex.passport.internal.ui.sloth.authsdk.g gVar2 = (com.yandex.passport.internal.ui.sloth.authsdk.g) obj;
                gVar2.getClass();
                AuthSdkActivity.m(this.b, gVar2);
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
        return new ezc(1, 0, AuthSdkActivity.class, this.b, "onAuthSdkResult", "onAuthSdkResult(Lcom/yandex/passport/internal/ui/sloth/authsdk/AuthSdkResult;)V");
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
