package com.anythink.expressad.foundation.g.f.h;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.d.c;
import com.anythink.expressad.foundation.g.f.d.d;
import com.anythink.expressad.foundation.g.f.d.g;
import com.anythink.expressad.foundation.g.f.e;
import com.anythink.expressad.foundation.g.f.j;
import com.anythink.expressad.foundation.g.f.m;
import com.anythink.expressad.foundation.g.f.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.out.l;
import java.io.File;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f20138b = "a";

    /* renamed from: a, reason: collision with root package name */
    protected Context f20139a;

    public a(Context context) {
        if (context == null) {
            this.f20139a = com.anythink.expressad.foundation.b.a.c().e();
        } else {
            this.f20139a = context.getApplicationContext();
        }
    }

    private void b(int i, String str, b bVar, e eVar) {
        String str2 = bVar.b().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        bVar.a("ts", String.valueOf(currentTimeMillis));
        bVar.a(com.anythink.expressad.foundation.g.g.a.b.bb, s.a(str2 + currentTimeMillis));
        b(i, str, bVar, new com.anythink.expressad.foundation.g.f.b(), eVar);
    }

    private void c(int i, String str, b bVar, e eVar) {
        b(i, str, bVar, new com.anythink.expressad.foundation.g.f.b(), eVar);
    }

    public void a(String str, b bVar) {
        if (bVar != null) {
            bVar.a("open", com.anythink.expressad.foundation.g.a.cC);
            StringBuilder sb = new StringBuilder();
            com.anythink.expressad.foundation.g.f.a.a();
            sb.append(com.anythink.expressad.foundation.g.f.a.b());
            bVar.a("band_width", sb.toString());
            String str2 = bVar.b().get("unit_id");
            if (str2 != null) {
                String a9 = l.a().a(str2, str);
                if (TextUtils.isEmpty(a9)) {
                    return;
                }
                bVar.a("ch_info", a9);
            }
        }
    }

    private void b(int i, String str, b bVar, m mVar, e eVar) {
        j gVar;
        if (bVar == null) {
            try {
                bVar = new b();
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
        a(str, bVar);
        if (i == 0) {
            gVar = new g(1, str, bVar.toString(), eVar);
            gVar.a("Content-Type", com.anythink.expressad.foundation.g.f.g.b.f20129e);
        } else if (i == 1) {
            gVar = new d(1, str, bVar.toString(), eVar);
            gVar.a("Content-Type", com.anythink.expressad.foundation.g.f.g.b.f20129e);
        } else if (i != 2) {
            gVar = null;
        } else {
            gVar = new c(1, str, bVar.toString(), eVar);
            gVar.a("Content-Type", com.anythink.expressad.foundation.g.f.g.b.f20129e);
        }
        if (gVar != null) {
            gVar.a(mVar);
            n.a(gVar);
        }
    }

    public void a(int i, String str, b bVar, e eVar) {
        a(i, str, bVar, new com.anythink.expressad.foundation.g.f.b(), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, String str, b bVar, m mVar, e eVar) {
        j gVar;
        if (bVar == null) {
            try {
                bVar = new b();
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
        a(str, bVar);
        String str2 = bVar.b().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        bVar.a("ts", String.valueOf(currentTimeMillis));
        bVar.a(com.anythink.expressad.foundation.g.g.a.b.bb, s.a(str2 + currentTimeMillis));
        StringBuilder c9 = AbstractC5050e.c(str, "?");
        c9.append(bVar.toString());
        String sb = c9.toString();
        j jVar = null;
        if (i == 0) {
            gVar = new g(0, sb, null, eVar);
        } else {
            if (i != 1) {
                if (i == 2) {
                    gVar = new c(0, sb, null, eVar);
                }
                if (jVar == null) {
                    jVar.a(mVar);
                    n.a(jVar);
                    return;
                }
                return;
            }
            gVar = new d(0, sb, null, eVar);
        }
        jVar = gVar;
        if (jVar == null) {
        }
    }

    public static void a(File file, String str, e eVar) {
        n.a().a(file, str, (e<Void>) eVar);
    }
}
