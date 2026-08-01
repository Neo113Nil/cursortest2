package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.consent_sdk.C4300b;
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
public final class C4019ut implements At, InterfaceC3742pl, Eu, InterfaceC4186xy, InterfaceC3123eB, VJ, InterfaceC3725pL, InterfaceC3529lo {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34602n;

    /* renamed from: u, reason: collision with root package name */
    public Object f34603u;

    public /* synthetic */ C4019ut() {
        this.f34602n = 0;
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public /* synthetic */ Object a(Object obj) {
        if (((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
            ((Su) this.f34603u).c();
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
                return ((YJ) this.f34603u).f(str, (Provider) it.next());
            } catch (Exception e9) {
                if (exc == null) {
                    exc = e9;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public synchronized N3.a c(S0.e eVar, InterfaceC4289zt interfaceC4289zt, InterfaceC3633nk interfaceC3633nk) {
        C2710Oj c9;
        try {
            if (interfaceC3633nk != null) {
                this.f34603u = interfaceC3633nk;
            } else {
                this.f34603u = (InterfaceC3633nk) interfaceC4289zt.k((InterfaceC4235yt) eVar.f2782v).c();
            }
            c9 = ((InterfaceC3633nk) this.f34603u).c();
        } catch (Throwable th) {
            throw th;
        }
        return c9.c(c9.b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725pL
    public boolean d(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((InterfaceC3725pL[]) this.f34603u)[i].d(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725pL
    public C4264zL e(Class cls) {
        for (int i = 0; i < 2; i++) {
            InterfaceC3725pL interfaceC3725pL = ((InterfaceC3725pL[]) this.f34603u)[i];
            if (interfaceC3725pL.d(cls)) {
                return interfaceC3725pL.e(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4186xy
    public /* synthetic */ void f(Object obj, FileOutputStream fileOutputStream) {
        ((AbstractC4263zK) obj).c(fileOutputStream);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4186xy
    public Object g(FileInputStream fileInputStream) {
        try {
            InterfaceC4048vL o6 = ((Ky) this.f34603u).o();
            PK pk = PK.f26757a;
            int i = BK.f23877a;
            PK pk2 = PK.f26758b;
            UK uk = (UK) o6;
            uk.getClass();
            LK lk = new LK(fileInputStream);
            VK l9 = VK.l(uk.f27920a, lk, pk2);
            lk.k(0);
            if (VK.x(l9, true)) {
                return l9;
            }
            throw new C3295hL(new KL().getMessage());
        } catch (C3295hL e9) {
            throw new C4078vy("Cannot read proto.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4186xy
    public /* synthetic */ Object i() {
        return (Ky) this.f34603u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3123eB
    public Iterator j(com.bumptech.glide.manager.p pVar, CharSequence charSequence) {
        return new C2963bB(pVar, charSequence, new C4178xq(((VA) this.f34603u).J.matcher(charSequence)), 1);
    }

    @Override // com.google.android.gms.internal.ads.At
    public Object o() {
        InterfaceC3633nk interfaceC3633nk;
        synchronized (this) {
            interfaceC3633nk = (InterfaceC3633nk) this.f34603u;
        }
        return interfaceC3633nk;
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* bridge */ /* synthetic */ N3.a y(S0.e eVar, InterfaceC4289zt interfaceC4289zt) {
        return c(eVar, interfaceC4289zt, null);
    }

    public /* synthetic */ C4019ut(int i, Object obj) {
        this.f34602n = i;
        this.f34603u = obj;
    }

    public /* synthetic */ C4019ut(C4159xO c4159xO, DP dp, C4212yN c4212yN) {
        this.f34602n = 13;
        this.f34603u = dp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3742pl, com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public void mo1a(Object obj) {
        switch (this.f34602n) {
            case 1:
                Iu iu = (Iu) this.f34603u;
                ((Mu) obj).o((Ju) iu.f25613n, iu.f25614u);
                break;
            case 9:
                ((G6) obj).b0((C3035cd) this.f34603u);
                break;
            case 10:
                C3172f6 c3172f6 = ((PN) this.f34603u).f26797p0;
                ((G6) obj).h();
                break;
            case 12:
                ((InterfaceC4213yO) obj).s();
                break;
            default:
                ((InterfaceC4213yO) obj).j((DP) this.f34603u);
                break;
        }
    }

    public /* synthetic */ C4019ut(C4159xO c4159xO, Object obj, long j6) {
        this.f34602n = 12;
        this.f34603u = obj;
    }

    public /* synthetic */ C4019ut(RP rp) {
        this.f34602n = 15;
        Objects.requireNonNull(rp);
        this.f34603u = rp;
    }

    public /* synthetic */ C4019ut(C4300b c4300b) {
        this.f34602n = 14;
        Objects.requireNonNull(c4300b);
        this.f34603u = c4300b;
    }
}
