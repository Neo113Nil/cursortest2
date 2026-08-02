package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.xc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0777xc {
    public final void a(@NotNull Ud ud, @NotNull Id id) {
        Xk xk;
        Wk wk = Z4.b.a().a;
        wk.getClass();
        Context context = ud.c;
        String str = ud.a.apiKey;
        R4.l().l.a(context);
        synchronized (wk.e) {
            try {
                LinkedHashMap linkedHashMap = wk.c;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    Context context2 = ud.c;
                    obj = new Xk(context2, str, AppMetrica.getReporter(context2, str), wk.b);
                    linkedHashMap.put(str, obj);
                }
                xk = (Xk) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (wk.f) {
            try {
                if (wk.d == null && !R4.l().l.a(context)) {
                    wk.a.getClass();
                    Dl gl = R4.l().l.a(ud.c) ? new Gl() : El.a(ud);
                    A2 a2 = wk.a;
                    Context context3 = ud.c;
                    a2.getClass();
                    L1 a = (R4.l().l.a(context3) ? new O1() : new N1()).a(ud);
                    wk.d = new Fd(id, gl, a);
                    xk.a(gl, a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(@NotNull C0223e7 c0223e7) {
    }

    public final void a(@NotNull String str, @NotNull C0230ee c0230ee, @NotNull IReporter iReporter) {
        Xk xk;
        Dl a;
        M1 n1;
        Wk wk = Z4.b.a().a;
        synchronized (wk.e) {
            try {
                LinkedHashMap linkedHashMap = wk.c;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    Context context = c0230ee.a;
                    obj = new Xk(context, str, AppMetrica.getReporter(context, str), wk.b);
                    linkedHashMap.put(str, obj);
                }
                xk = (Xk) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (wk.f) {
            try {
                wk.a.getClass();
                if (R4.l().l.a(c0230ee.a)) {
                    a = new Gl();
                } else {
                    a = El.a(c0230ee, str);
                }
                A2 a2 = wk.a;
                Context context2 = c0230ee.a;
                a2.getClass();
                if (R4.l().l.a(context2)) {
                    n1 = new O1();
                } else {
                    n1 = new N1();
                }
                xk.a(a, n1.a(c0230ee));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
