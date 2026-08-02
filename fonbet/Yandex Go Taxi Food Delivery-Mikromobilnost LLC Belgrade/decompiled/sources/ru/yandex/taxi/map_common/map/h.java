package ru.yandex.taxi.map_common.map;

import com.yandex.runtime.auth.Account;
import com.yandex.runtime.auth.TokenListener;
import defpackage.bvf0;
import defpackage.fk00;
import defpackage.gvu0;
import defpackage.hst;
import defpackage.ike;
import defpackage.jst;
import defpackage.kj;
import defpackage.rza;
import defpackage.tje;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class h implements Account {
    public final ike a = bvf0.b();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ fk00 c;

    public h(fk00 fk00Var) {
        this.c = fk00Var;
    }

    @Override // com.yandex.runtime.auth.Account
    public final String httpAuth(String str) {
        return null;
    }

    @Override // com.yandex.runtime.auth.Account
    public final void invalidateToken(String str) {
        hst hstVar = jst.e;
        gvu0.A0(10, str);
        hstVar.getClass();
    }

    @Override // com.yandex.runtime.auth.Account
    public final void requestToken(TokenListener tokenListener) {
        tje.N(this.a, null, null, new MapKitAccountFactory$create$1$requestToken$1(this, tokenListener, this.c, null), 3);
    }

    @Override // com.yandex.runtime.auth.Account
    public final String uid() {
        String str;
        kj Ig = this.c.a.a.Ig();
        if (Ig != null) {
            long j = Ig.a;
            rza.a(10);
            str = Long.toString(j, 10);
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }
}
