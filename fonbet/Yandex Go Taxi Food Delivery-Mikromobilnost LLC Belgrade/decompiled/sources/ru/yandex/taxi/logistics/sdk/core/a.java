package ru.yandex.taxi.logistics.sdk.core;

import com.squareup.moshi.Moshi;
import defpackage.fq50;
import defpackage.jc21;
import defpackage.l7i;
import defpackage.p8w;
import defpackage.r830;
import defpackage.s0k0;
import defpackage.v7p;
import defpackage.w8g;
import defpackage.xvf0;
import defpackage.y2r0;
import java.util.Iterator;
import java.util.Set;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final class a implements v7p {
    public final w8g a;
    public final y2r0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final w8g e;

    public a(w8g w8gVar, y2r0 y2r0Var, xvf0 xvf0Var, xvf0 xvf0Var2, w8g w8gVar2) {
        this.a = w8gVar;
        this.b = y2r0Var;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = w8gVar2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        fq50 fq50Var = (fq50) this.a.get();
        Set set = (Set) this.b.get();
        Moshi moshi = (Moshi) this.c.get();
        String str = (String) this.d.get();
        l7i l7iVar = (l7i) this.e.get();
        OkHttpClient.a b = ((OkHttpClient) fq50Var.b.get()).b();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b.a((p8w) it.next());
        }
        OkHttpClient okHttpClient = new OkHttpClient(b);
        s0k0 s0k0Var = new s0k0();
        s0k0Var.a = okHttpClient;
        s0k0Var.b(str);
        s0k0Var.a(new jc21());
        s0k0Var.a(r830.d(moshi));
        s0k0Var.d.add(new ru.yandex.taxi.logistics.sdk.network.a(new NetworkModule$provideDefaultRetrofit$1(l7iVar, null)));
        return s0k0Var.c();
    }
}
