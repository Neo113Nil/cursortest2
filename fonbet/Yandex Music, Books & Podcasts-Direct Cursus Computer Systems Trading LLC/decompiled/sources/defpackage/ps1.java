package defpackage;

import android.net.Uri;
import android.os.Handler;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ps1 implements m56 {
    public int a;
    public boolean b;
    public Object c = new Object();
    public Object d = new xy0(0);
    public Object e;
    public Object f;

    public boolean a(int i, int i2) {
        eqi eqiVar = (eqi) this.d;
        int i3 = this.a;
        wci wciVar = (wci) eqiVar.a[i + i3];
        wci wciVar2 = (wci) ((eqi) this.e).a[i3 + i2];
        z7j z7jVar = a8j.a;
        return Intrinsics.d(wciVar, wciVar2) || wciVar.getClass() == wciVar2.getClass();
    }

    public chp b(Object obj) {
        chp chpVar;
        synchronized (this.c) {
            try {
                int c = c();
                chpVar = new chp(c, obj);
                if (this.b) {
                    chpVar.o();
                } else {
                    ((xy0) this.d).put(Integer.valueOf(c), chpVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return chpVar;
    }

    public int c() {
        int i;
        synchronized (this.c) {
            i = this.a;
            this.a = i + 1;
        }
        return i;
    }

    public void d() {
        ArrayList arrayList;
        synchronized (this.c) {
            try {
                this.b = true;
                arrayList = new ArrayList(((xy0) this.d).values());
                ((xy0) this.d).clear();
                if (((dyg) this.e) != null) {
                    Handler handler = (Handler) this.f;
                    handler.getClass();
                    handler.post((dyg) this.e);
                    this.e = null;
                    this.f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((chp) it.next()).o();
        }
    }

    public void e(int i, Object obj) {
        synchronized (this.c) {
            try {
                chp chpVar = (chp) ((xy0) this.d).remove(Integer.valueOf(i));
                if (chpVar != null) {
                    if (chpVar.i.getClass() == obj.getClass()) {
                        chpVar.l(obj);
                    } else {
                        vq1.n0("SequencedFutureManager", "Type mismatch, expected " + chpVar.i.getClass() + ", but was " + obj.getClass());
                    }
                }
                if (((dyg) this.e) != null && ((xy0) this.d).isEmpty()) {
                    d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m56
    public void g(Exception exc, dt1 dt1Var) {
        pr1 pr1Var = (pr1) this.d;
        Uri uri = (Uri) this.e;
        if (exc != null) {
            ((m56) this.c).g(exc, dt1Var);
            return;
        }
        if (!this.b) {
            ((u4r) this.f).m(dt1Var, pr1Var, uri, this.a, (m56) this.c);
            return;
        }
        Locale locale = Locale.ENGLISH;
        String host = uri.getHost();
        int i = this.a;
        String o = su4.o(f1d.l(i, "CONNECT ", host, StringUtils.PROCESS_POSTFIX_DELIMITER, " HTTP/1.1\r\nHost: "), uri.getHost(), "\r\n\r\n");
        sr1 sr1Var = pr1Var.b;
        "Proxying: ".concat(o);
        sr1Var.getClass();
        byte[] bytes = o.getBytes();
        le3 le3Var = new le3();
        le3Var.b = this;
        le3Var.a = dt1Var;
        v7g.S(dt1Var, bytes, le3Var);
    }
}
