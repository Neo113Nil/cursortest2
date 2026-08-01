package m8;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.internal.ads.C3428jv;
import java.util.ArrayDeque;
import java.util.HashMap;
import p2.C4835j;
import t0.Z;
import t0.a0;
import u2.D;
import u2.HandlerC5068A;
import v2.InterfaceC5112c;
import w1.C5144b;

/* loaded from: classes2.dex */
public final class i implements y8.w, InterfaceC5112c {

    /* renamed from: n, reason: collision with root package name */
    public final Object f39362n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f39363u;

    public /* synthetic */ i(Object obj, Object obj2) {
        this.f39362n = obj;
        this.f39363u = obj2;
    }

    public View a(int i, int i6, int i9, int i10) {
        a0 a0Var = (a0) this.f39362n;
        int g4 = a0Var.g();
        int h9 = a0Var.h();
        int i11 = i6 > i ? 1 : -1;
        View view = null;
        while (i != i6) {
            View m4 = a0Var.m(i);
            int e9 = a0Var.e(m4);
            int n9 = a0Var.n(m4);
            Z z3 = (Z) this.f39363u;
            z3.f40637b = g4;
            z3.f40638c = h9;
            z3.f40639d = e9;
            z3.f40640e = n9;
            if (i9 != 0) {
                z3.f40636a = i9;
                if (z3.a()) {
                    return m4;
                }
            }
            if (i10 != 0) {
                z3.f40636a = i10;
                if (z3.a()) {
                    view = m4;
                }
            }
            i += i11;
        }
        return view;
    }

    @Override // v2.InterfaceC5112c
    public v2.k b(String str) {
        HandlerC5068A handlerC5068A = D.f41237l;
        D d2 = C4835j.f39733C.f39738c;
        new u2.u((Context) this.f39362n, (String) this.f39363u, str, null).l();
        return v2.k.f41418n;
    }

    public boolean c(View view) {
        a0 a0Var = (a0) this.f39362n;
        int g4 = a0Var.g();
        int h9 = a0Var.h();
        int e9 = a0Var.e(view);
        int n9 = a0Var.n(view);
        Z z3 = (Z) this.f39363u;
        z3.f40637b = g4;
        z3.f40638c = h9;
        z3.f40639d = e9;
        z3.f40640e = n9;
        z3.f40636a = 24579;
        return z3.a();
    }

    @Override // y8.w
    public y8.x d() {
        return (h) this.f39363u;
    }

    @Override // y8.w
    public y8.v e() {
        return (g) this.f39362n;
    }

    public void f(Context context, Uri uri) {
        Intent intent = (Intent) this.f39362n;
        intent.setData(uri);
        context.startActivity(intent, (Bundle) this.f39363u);
    }

    public void g(String str) {
        C5144b c5144b;
        synchronized (this) {
            try {
                c5144b = (C5144b) ((HashMap) this.f39362n).get(str);
                N1.g.c(c5144b, "Argument must not be null");
                int i = c5144b.f41650b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c5144b.f41650b);
                }
                int i6 = i - 1;
                c5144b.f41650b = i6;
                if (i6 == 0) {
                    C5144b c5144b2 = (C5144b) ((HashMap) this.f39362n).remove(str);
                    if (!c5144b2.equals(c5144b)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c5144b + ", but actually removed: " + c5144b2 + ", safeKey: " + str);
                    }
                    t2.n nVar = (t2.n) this.f39363u;
                    synchronized (((ArrayDeque) nVar.f40859a)) {
                        if (((ArrayDeque) nVar.f40859a).size() < 10) {
                            ((ArrayDeque) nVar.f40859a).offer(c5144b2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c5144b.f41649a.unlock();
    }

    public i() {
        this.f39362n = new HashMap();
        this.f39363u = new t2.n(1);
    }

    public i(a0 a0Var) {
        this.f39362n = a0Var;
        Z z3 = new Z();
        z3.f40636a = 0;
        this.f39363u = z3;
    }

    public i(C3428jv c3428jv) {
        this.f39362n = new g(c3428jv, ((n8.f) c3428jv.f31349x).g().e(), -1L);
        this.f39363u = new h(c3428jv, ((n8.f) c3428jv.f31349x).g().d(), -1L);
    }
}
