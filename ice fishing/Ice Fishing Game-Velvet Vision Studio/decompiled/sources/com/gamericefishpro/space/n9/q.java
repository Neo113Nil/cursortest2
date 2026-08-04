package com.gamericefishpro.space.n9;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final t f;

    public q(r1 r1Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        t tVar;
        com.gamericefishpro.space.v8.c0.d(str2);
        com.gamericefishpro.space.v8.c0.d(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.B.b(v0.z(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            tVar = new t(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    v0 v0Var2 = r1Var.y;
                    r1.l(v0Var2);
                    v0Var2.y.a("Param name can't be null");
                    it.remove();
                } else {
                    r4 r4Var = r1Var.B;
                    r1.j(r4Var);
                    Object objY = r4Var.y(bundle2.get(next), next);
                    if (objY == null) {
                        v0 v0Var3 = r1Var.y;
                        r1.l(v0Var3);
                        v0Var3.B.b(r1Var.C.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        r4 r4Var2 = r1Var.B;
                        r1.j(r4Var2);
                        r4Var2.G(bundle2, next, objY);
                    }
                }
            }
            tVar = new t(bundle2);
        }
        this.f = tVar;
    }

    public final q a(r1 r1Var, long j) {
        return new q(r1Var, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        String string = this.f.toString();
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        return com.gamericefishpro.space.m5.a.j(sb, "', params=", string, "}");
    }

    public q(r1 r1Var, String str, String str2, String str3, long j, long j2, t tVar) {
        com.gamericefishpro.space.v8.c0.d(str2);
        com.gamericefishpro.space.v8.c0.d(str3);
        com.gamericefishpro.space.v8.c0.g(tVar);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.B.c("Event created with reverse previous/current timestamps. appId, name", v0.z(str2), v0.z(str3));
        }
        this.f = tVar;
    }
}
