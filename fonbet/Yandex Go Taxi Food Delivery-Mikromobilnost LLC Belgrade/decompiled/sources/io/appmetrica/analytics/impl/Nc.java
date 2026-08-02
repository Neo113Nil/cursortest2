package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class Nc {
    public final void a(C0448je c0448je, Yd yd) {
        C0398hl c0398hl;
        C0369gl c0369gl = C0267d5.b.a().a;
        c0369gl.getClass();
        Context context = c0448je.c;
        String str = c0448je.a.apiKey;
        V4.l().l.a(context);
        synchronized (c0369gl.e) {
            try {
                LinkedHashMap linkedHashMap = c0369gl.c;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    Context context2 = c0448je.c;
                    obj = new C0398hl(context2, str, AppMetrica.getReporter(context2, str), c0369gl.b);
                    linkedHashMap.put(str, obj);
                }
                c0398hl = (C0398hl) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (c0369gl.f) {
            try {
                if (c0369gl.d == null && !V4.l().l.a(context)) {
                    c0369gl.a.getClass();
                    Ol rl = V4.l().l.a(c0448je.c) ? new Rl() : Pl.a(c0448je);
                    A2 a2 = c0369gl.a;
                    Context context3 = c0448je.c;
                    a2.getClass();
                    L1 a = (V4.l().l.a(context3) ? new O1() : new N1()).a(c0448je);
                    c0369gl.d = new Vd(yd, rl, a);
                    c0398hl.a(rl, a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(C0384h7 c0384h7) {
    }

    public final void a(String str, C0737te c0737te, IReporter iReporter) {
        C0398hl c0398hl;
        Ol a;
        M1 n1;
        C0369gl c0369gl = C0267d5.b.a().a;
        synchronized (c0369gl.e) {
            try {
                LinkedHashMap linkedHashMap = c0369gl.c;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    Context context = c0737te.a;
                    obj = new C0398hl(context, str, AppMetrica.getReporter(context, str), c0369gl.b);
                    linkedHashMap.put(str, obj);
                }
                c0398hl = (C0398hl) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (c0369gl.f) {
            try {
                c0369gl.a.getClass();
                if (V4.l().l.a(c0737te.a)) {
                    a = new Rl();
                } else {
                    a = Pl.a(c0737te, str);
                }
                A2 a2 = c0369gl.a;
                Context context2 = c0737te.a;
                a2.getClass();
                if (V4.l().l.a(context2)) {
                    n1 = new O1();
                } else {
                    n1 = new N1();
                }
                c0398hl.a(a, n1.a(c0737te));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
