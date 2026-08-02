package ru.yandextaxi.flutter_yandex_mapkit.methods.auth;

import com.yandex.runtime.auth.Account;
import com.yandex.runtime.auth.TokenListener;
import defpackage.da20;
import defpackage.i3y;
import defpackage.ini0;
import defpackage.k45;
import defpackage.pd;
import defpackage.ssr;
import defpackage.tje;
import defpackage.tse;
import defpackage.x920;

/* loaded from: classes7.dex */
public final class a extends k45 implements Account {
    public final ini0 b;
    public final i3y c;
    public String w;

    public a(ssr ssrVar, ini0 ini0Var) {
        super(ssrVar, "account_".concat("mapkit_factory"));
        this.b = ini0Var;
        this.c = kotlin.a.a(new pd(11));
        this.w = "";
    }

    @Override // com.yandex.runtime.auth.Account
    public final String httpAuth(String str) {
        return null;
    }

    @Override // com.yandex.runtime.auth.Account
    public final void invalidateToken(String str) {
        tje.N((tse) this.c.getValue(), null, null, new AccountMethodHandler$invalidateToken$1(this, str, null), 3);
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
    }

    @Override // com.yandex.runtime.auth.Account
    public final void requestToken(TokenListener tokenListener) {
        tje.N((tse) this.c.getValue(), null, null, new AccountMethodHandler$requestToken$1(this, tokenListener, null), 3);
    }

    @Override // com.yandex.runtime.auth.Account
    public final String uid() {
        return this.w;
    }
}
