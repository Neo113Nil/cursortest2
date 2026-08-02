package com.yandex.plus.home.internal.di;

import android.net.Uri;
import com.yandex.passport.internal.methods.performer.v0;
import defpackage.btf;
import defpackage.dp0;
import defpackage.joj;
import defpackage.jyr;
import defpackage.vao;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class p {
    public final u a;
    public final d b;
    public final com.yandex.plus.domain.auth.impl.i c;
    public final com.yandex.plus.metrica.utils.i d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final jyr p;
    public final jyr q;
    public final jyr r;

    public p(u uVar, d dVar, com.yandex.plus.domain.auth.impl.i iVar, com.yandex.plus.metrica.utils.i iVar2) {
        iVar2.getClass();
        this.a = uVar;
        this.b = dVar;
        this.c = iVar;
        this.d = iVar2;
        this.e = btf.b(new m(this, 0));
        this.f = btf.b(new m(this, 11));
        this.g = btf.b(new m(this, 12));
        this.h = btf.b(new m(this, 13));
        this.i = btf.b(new com.yandex.plus.home.graphql.configuration.a(10));
        this.j = btf.b(new com.yandex.plus.home.graphql.configuration.a(11));
        this.k = btf.b(new m(this, 1));
        this.l = btf.b(new m(this, 2));
        this.m = btf.b(new m(this, 3));
        this.n = btf.b(new m(this, 4));
        this.o = btf.b(new m(this, 8));
        this.p = btf.b(new com.yandex.plus.home.graphql.configuration.a(9));
        this.q = btf.b(new m(this, 9));
        this.r = btf.b(new m(this, 10));
    }

    public static String d(Uri uri) {
        String decode = Uri.decode(uri.toString());
        decode.getClass();
        return StringsKt.O(decode, '/') ? decode : decode.concat("/");
    }

    public final joj a() {
        OkHttpClient okHttpClient = (OkHttpClient) this.r.getValue();
        joj c = okHttpClient != null ? okHttpClient.c() : new joj();
        ArrayList arrayList = c.c;
        int i = 1;
        arrayList.add(new com.yandex.plus.core.network.api.interceptors.b(i));
        arrayList.add(new com.yandex.plus.core.network.api.interceptors.a(2, new com.yandex.passport.sloth.ui.c(10, this)));
        Continuation continuation = null;
        arrayList.add(new com.yandex.plus.core.network.api.interceptors.a(new o(this, continuation, 0)));
        m mVar = new m(this, 5);
        m mVar2 = new m(this, 6);
        m mVar3 = new m(this, 7);
        String str = this.b.c;
        u uVar = this.a;
        arrayList.add(new com.yandex.plus.core.network.api.interceptors.c("music", mVar, mVar2, mVar3, new com.yandex.plus.core.graphql.daily.progress.s(7), str, uVar.r, uVar.s, "PlusSdk"));
        o oVar = new o(this, continuation, i);
        v0 v0Var = new v0(17);
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        arrayList.add(new com.yandex.plus.core.network.api.interceptors.f(oVar, v0Var, com.yandex.plus.core.analytics.logging.e.a(com.yandex.plus.core.analytics.logging.b.a)));
        c.b((com.yandex.plus.core.network.api.interceptors.d) this.j.getValue());
        return c;
    }

    public final dp0 b() {
        return (dp0) this.l.getValue();
    }

    public final vao c() {
        Object value = this.m.getValue();
        value.getClass();
        return (vao) value;
    }
}
