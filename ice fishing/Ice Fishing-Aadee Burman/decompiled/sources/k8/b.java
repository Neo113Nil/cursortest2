package k8;

import M2.i;
import N1.l;
import N1.p;
import O.C0344t;
import O1.d;
import Z2.e;
import android.content.Intent;
import n4.c;
import o4.InterfaceC4798k;
import s.k;
import s1.InterfaceC4970e;
import t0.AbstractC5003S;
import t0.b0;
import w1.C5147e;

/* loaded from: classes2.dex */
public final class b implements InterfaceC4798k {

    /* renamed from: n, reason: collision with root package name */
    public final Object f38706n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f38707u;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f38706n = obj;
        this.f38707u = obj2;
    }

    @Override // o4.InterfaceC4798k
    public void OnCall() {
        ((c) this.f38707u).f39483c.startActivity((Intent) this.f38706n);
    }

    public void a(AbstractC5003S abstractC5003S, C0344t c0344t) {
        k kVar = (k) this.f38706n;
        b0 b0Var = (b0) kVar.getOrDefault(abstractC5003S, null);
        if (b0Var == null) {
            b0Var = b0.a();
            kVar.put(abstractC5003S, b0Var);
        }
        b0Var.f40647c = c0344t;
        b0Var.f40645a |= 8;
    }

    public String b(InterfaceC4970e interfaceC4970e) {
        String str;
        synchronized (((l) this.f38706n)) {
            str = (String) ((l) this.f38706n).a(interfaceC4970e);
        }
        if (str == null) {
            C5147e c5147e = (C5147e) ((e) this.f38707u).k();
            try {
                interfaceC4970e.a(c5147e.f41654n);
                byte[] digest = c5147e.f41654n.digest();
                char[] cArr = p.f1933b;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        byte b9 = digest[i];
                        int i6 = i * 2;
                        char[] cArr2 = p.f1932a;
                        cArr[i6] = cArr2[(b9 & 255) >>> 4];
                        cArr[i6 + 1] = cArr2[b9 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((e) this.f38707u).D(c5147e);
            }
        }
        synchronized (((l) this.f38706n)) {
            ((l) this.f38706n).f(interfaceC4970e, str);
        }
        return str;
    }

    public C0344t c(AbstractC5003S abstractC5003S, int i) {
        b0 b0Var;
        C0344t c0344t;
        k kVar = (k) this.f38706n;
        int e9 = kVar.e(abstractC5003S);
        if (e9 >= 0 && (b0Var = (b0) kVar.l(e9)) != null) {
            int i6 = b0Var.f40645a;
            if ((i6 & i) != 0) {
                int i9 = i6 & (~i);
                b0Var.f40645a = i9;
                if (i == 4) {
                    c0344t = b0Var.f40646b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0344t = b0Var.f40647c;
                }
                if ((i9 & 12) == 0) {
                    kVar.j(e9);
                    b0Var.f40645a = 0;
                    b0Var.f40646b = null;
                    b0Var.f40647c = null;
                    b0.f40644d.c(b0Var);
                }
                return c0344t;
            }
        }
        return null;
    }

    public void d(AbstractC5003S abstractC5003S) {
        b0 b0Var = (b0) ((k) this.f38706n).getOrDefault(abstractC5003S, null);
        if (b0Var == null) {
            return;
        }
        b0Var.f40645a &= -2;
    }

    public void e(AbstractC5003S abstractC5003S) {
        s.e eVar = (s.e) this.f38707u;
        int l9 = eVar.l() - 1;
        while (true) {
            if (l9 < 0) {
                break;
            }
            if (abstractC5003S == eVar.m(l9)) {
                Object[] objArr = eVar.f40414v;
                Object obj = objArr[l9];
                Object obj2 = s.e.f40411x;
                if (obj != obj2) {
                    objArr[l9] = obj2;
                    eVar.f40412n = true;
                }
            } else {
                l9--;
            }
        }
        b0 b0Var = (b0) ((k) this.f38706n).remove(abstractC5003S);
        if (b0Var != null) {
            b0Var.f40645a = 0;
            b0Var.f40646b = null;
            b0Var.f40647c = null;
            b0.f40644d.c(b0Var);
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z3) {
        this.f38707u = obj;
        this.f38706n = obj2;
    }

    public b(int i) {
        switch (i) {
            case 5:
                this.f38706n = new l(1000L, 0);
                this.f38707u = d.a(10, new i(29));
                break;
            default:
                this.f38706n = new k();
                this.f38707u = new s.e();
                break;
        }
    }
}
