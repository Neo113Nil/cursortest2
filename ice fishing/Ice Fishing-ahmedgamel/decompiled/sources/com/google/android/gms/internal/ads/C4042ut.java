package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.consent_sdk.C4323b;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ut, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4042ut implements At, InterfaceC3765pl, Eu, InterfaceC4209xy, InterfaceC3146eB, VJ, InterfaceC3748pL, InterfaceC3606mo {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35365n;

    /* renamed from: u, reason: collision with root package name */
    public Object f35366u;

    public /* synthetic */ C4042ut() {
        this.f35365n = 0;
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public /* synthetic */ Object a(Object obj) {
        if (((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
            ((Su) this.f35366u).c();
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.VJ
    public Object b(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((YJ) this.f35366u).f(str, (Provider) it.next());
            } catch (Exception e9) {
                if (exc == null) {
                    exc = e9;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public synchronized P3.a c(S0.e eVar, InterfaceC4312zt interfaceC4312zt, InterfaceC3656nk interfaceC3656nk) {
        C2730Oj c9;
        try {
            if (interfaceC3656nk != null) {
                this.f35366u = interfaceC3656nk;
            } else {
                this.f35366u = (InterfaceC3656nk) interfaceC4312zt.k((InterfaceC4258yt) eVar.f2909v).c();
            }
            c9 = ((InterfaceC3656nk) this.f35366u).c();
        } catch (Throwable th) {
            throw th;
        }
        return c9.c(c9.b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3748pL
    public boolean d(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((InterfaceC3748pL[]) this.f35366u)[i].d(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3748pL
    public C4287zL e(Class cls) {
        for (int i = 0; i < 2; i++) {
            InterfaceC3748pL interfaceC3748pL = ((InterfaceC3748pL[]) this.f35366u)[i];
            if (interfaceC3748pL.d(cls)) {
                return interfaceC3748pL.e(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4209xy
    public /* synthetic */ void f(Object obj, FileOutputStream fileOutputStream) {
        ((AbstractC4286zK) obj).c(fileOutputStream);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4209xy
    public Object g(FileInputStream fileInputStream) {
        try {
            InterfaceC4071vL o4 = ((Ky) this.f35366u).o();
            PK pk = PK.f27540a;
            int i = BK.f24648a;
            PK pk2 = PK.f27541b;
            UK uk = (UK) o4;
            uk.getClass();
            LK lk = new LK(fileInputStream);
            VK l9 = VK.l(uk.f28717a, lk, pk2);
            lk.k(0);
            if (VK.x(l9, true)) {
                return l9;
            }
            throw new C3318hL(new KL().getMessage());
        } catch (C3318hL e9) {
            throw new C4101vy("Cannot read proto.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4209xy
    public /* synthetic */ Object i() {
        return (Ky) this.f35366u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3146eB
    public Iterator j(com.bumptech.glide.manager.o oVar, CharSequence charSequence) {
        return new C2986bB(oVar, charSequence, new C4201xq(((VA) this.f35366u).J.matcher(charSequence)), 1);
    }

    @Override // com.google.android.gms.internal.ads.At
    public Object o() {
        InterfaceC3656nk interfaceC3656nk;
        synchronized (this) {
            interfaceC3656nk = (InterfaceC3656nk) this.f35366u;
        }
        return interfaceC3656nk;
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* bridge */ /* synthetic */ P3.a y(S0.e eVar, InterfaceC4312zt interfaceC4312zt) {
        return c(eVar, interfaceC4312zt, null);
    }

    public /* synthetic */ C4042ut(int i, Object obj) {
        this.f35365n = i;
        this.f35366u = obj;
    }

    public /* synthetic */ C4042ut(C4182xO c4182xO, DP dp, C4235yN c4235yN) {
        this.f35365n = 13;
        this.f35366u = dp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3765pl, com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public void mo5a(Object obj) {
        switch (this.f35365n) {
            case 1:
                Iu iu = (Iu) this.f35366u;
                ((Mu) obj).o((Ju) iu.f26366n, iu.f26367u);
                break;
            case 9:
                ((G6) obj).b0((C3058cd) this.f35366u);
                break;
            case 10:
                C3195f6 c3195f6 = ((PN) this.f35366u).f27575k0;
                ((G6) obj).h();
                break;
            case 12:
                ((InterfaceC4236yO) obj).s();
                break;
            default:
                ((InterfaceC4236yO) obj).j((DP) this.f35366u);
                break;
        }
    }

    public /* synthetic */ C4042ut(C4182xO c4182xO, Object obj, long j6) {
        this.f35365n = 12;
        this.f35366u = obj;
    }

    public /* synthetic */ C4042ut(SP sp) {
        this.f35365n = 15;
        Objects.requireNonNull(sp);
        this.f35366u = sp;
    }

    public /* synthetic */ C4042ut(C4323b c4323b) {
        this.f35365n = 14;
        Objects.requireNonNull(c4323b);
        this.f35366u = c4323b;
    }
}
