package com.yandex.passport.internal.usecase;

import android.accounts.Account;
import defpackage.rhw;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class q2 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.credentials.g b;
    public final com.yandex.passport.internal.core.accounts.k c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.credentials.g gVar, com.yandex.passport.internal.core.accounts.k kVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        gVar.getClass();
        kVar.getClass();
        this.b = gVar;
        this.c = kVar;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        p2 p2Var = (p2) obj;
        com.yandex.passport.internal.credentials.g gVar = this.b;
        try {
            com.yandex.passport.internal.core.accounts.k kVar = this.c;
            Account account = p2Var.a;
            kVar.getClass();
            account.getClass();
            String userData = kVar.a.getUserData(account, "user_info_body");
            JSONObject jSONObject = userData != null ? new JSONObject(userData) : null;
            jSONObject.getClass();
            String string = jSONObject.getString("x_token_client_id");
            com.yandex.passport.common.core.b bVar = p2Var.b;
            string.getClass();
            return gVar.c(bVar, string);
        } catch (Exception unused) {
            return gVar.b(p2Var.b);
        }
    }
}
