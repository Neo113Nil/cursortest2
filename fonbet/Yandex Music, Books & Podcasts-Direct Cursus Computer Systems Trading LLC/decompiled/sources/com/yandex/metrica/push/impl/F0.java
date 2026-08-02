package com.yandex.metrica.push.impl;

import android.content.Context;
import com.yandex.metrica.push.common.utils.PublicLogger;
import defpackage.b0o;
import defpackage.d0o;
import defpackage.joj;
import defpackage.l3o;
import defpackage.mkn;
import defpackage.o3o;
import defpackage.to3;
import java.io.IOException;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public class F0 implements D0 {
    private final OkHttpClient a;

    public F0(Context context) {
        to3 to3Var = new to3(context.getCacheDir(), 10485760L);
        joj jojVar = new joj();
        jojVar.k = to3Var;
        this.a = new OkHttpClient(jojVar);
    }

    @Override // com.yandex.metrica.push.impl.D0
    public byte[] a(String str) {
        l3o l3oVar;
        b0o b0oVar = new b0o();
        b0oVar.g(str);
        d0o b = b0oVar.b();
        l3o l3oVar2 = null;
        l3oVar2 = null;
        try {
            OkHttpClient okHttpClient = this.a;
            try {
                okHttpClient.getClass();
                l3oVar = new mkn(okHttpClient, b, false).execute();
                try {
                    try {
                        o3o o3oVar = l3oVar.g;
                        byte[] a = o3oVar != null ? o3oVar.a() : null;
                        com.yandex.metrica.push.utils.f.a(l3oVar);
                        return a;
                    } catch (IOException e) {
                        e = e;
                        PublicLogger.e(e, e.getMessage(), new Object[0]);
                        com.yandex.metrica.push.utils.f.a(l3oVar);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    l3oVar2 = l3oVar;
                    com.yandex.metrica.push.utils.f.a(l3oVar2);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                l3oVar = null;
                PublicLogger.e(e, e.getMessage(), new Object[0]);
                com.yandex.metrica.push.utils.f.a(l3oVar);
                return null;
            } catch (Throwable th2) {
                th = th2;
                com.yandex.metrica.push.utils.f.a(l3oVar2);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
