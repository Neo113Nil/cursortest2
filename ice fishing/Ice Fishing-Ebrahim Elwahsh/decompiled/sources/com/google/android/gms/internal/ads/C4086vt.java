package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.consent_sdk.C4313b;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.vt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4086vt implements Bt, InterfaceC3701ol, Gu, InterfaceC4253yy, InterfaceC3352iB, InterfaceC3198fK, InterfaceC4277zL, InterfaceC3865ro {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34885n;

    /* renamed from: u, reason: collision with root package name */
    public Object f34886u;

    public /* synthetic */ C4086vt() {
        this.f34885n = 0;
    }

    public synchronized J3.a a(C2593Hm c2593Hm, At at, InterfaceC3592mk interfaceC3592mk) {
        C2709Oj a9;
        try {
            if (interfaceC3592mk != null) {
                this.f34886u = interfaceC3592mk;
            } else {
                this.f34886u = (InterfaceC3592mk) at.j((InterfaceC4302zt) c2593Hm.f25416u).c();
            }
            a9 = ((InterfaceC3592mk) this.f34886u).a();
        } catch (Throwable th) {
            throw th;
        }
        return a9.c(a9.b());
    }

    @Override // com.google.android.gms.internal.ads.Gu
    public /* synthetic */ Object b(Object obj) {
        if (((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
            ((Vu) this.f34886u).a();
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4277zL
    public boolean c(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((InterfaceC4277zL[]) this.f34886u)[i].c(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3198fK
    public Object d(String str) {
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
                return ((InterfaceC3361iK) this.f34886u).d(str, (Provider) it.next());
            } catch (Exception e6) {
                if (exc == null) {
                    exc = e6;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4277zL
    public KL e(Class cls) {
        for (int i = 0; i < 2; i++) {
            InterfaceC4277zL interfaceC4277zL = ((InterfaceC4277zL[]) this.f34886u)[i];
            if (interfaceC4277zL.c(cls)) {
                return interfaceC4277zL.e(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4253yy
    public /* synthetic */ void f(Object obj, FileOutputStream fileOutputStream) {
        ((IK) obj).c(fileOutputStream);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3352iB
    public Iterator g(com.bumptech.glide.manager.o oVar, CharSequence charSequence) {
        return new C3134eB(oVar, charSequence, new C2478Aq(((YA) this.f34886u).f28810I.matcher(charSequence)), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4253yy
    public Object h(FileInputStream fileInputStream) {
        try {
            GL o9 = ((My) this.f34886u).o();
            YK yk = YK.f28820a;
            int i = KK.f25952a;
            YK yk2 = YK.f28821b;
            C3144eL c3144eL = (C3144eL) o9;
            c3144eL.getClass();
            UK uk = new UK(fileInputStream);
            AbstractC3199fL l9 = AbstractC3199fL.l(c3144eL.f30345a, uk, yk2);
            uk.l(0);
            if (AbstractC3199fL.x(l9, true)) {
                return l9;
            }
            throw new C3845rL(new WL().getMessage());
        } catch (C3845rL e6) {
            throw new C4199xy("Cannot read proto.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4253yy
    public /* synthetic */ Object i() {
        return (My) this.f34886u;
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public Object o() {
        InterfaceC3592mk interfaceC3592mk;
        synchronized (this) {
            interfaceC3592mk = (InterfaceC3592mk) this.f34886u;
        }
        return interfaceC3592mk;
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public /* bridge */ /* synthetic */ J3.a x(C2593Hm c2593Hm, At at) {
        return a(c2593Hm, at, null);
    }

    public /* synthetic */ C4086vt(int i, Object obj) {
        this.f34885n = i;
        this.f34886u = obj;
    }

    public /* synthetic */ C4086vt(KO ko, TP tp, MN mn) {
        this.f34885n = 13;
        this.f34886u = tp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3701ol, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public void mo2b(Object obj) {
        switch (this.f34885n) {
            case 1:
                Ku ku = (Ku) this.f34886u;
                ((Pu) obj).t((Lu) ku.f26061n, ku.f26062u);
                break;
            case 9:
                ((I6) obj).f0((C3100dd) this.f34886u);
                break;
            case 10:
                C3399j6 c3399j6 = ((C3093dO) this.f34886u).f30040s0;
                ((I6) obj).e();
                break;
            case 12:
                ((LO) obj).q();
                break;
            default:
                ((LO) obj).j((TP) this.f34886u);
                break;
        }
    }

    public /* synthetic */ C4086vt(KO ko, Object obj, long j9) {
        this.f34885n = 12;
        this.f34886u = obj;
    }

    public /* synthetic */ C4086vt(AbstractC3149eQ abstractC3149eQ) {
        this.f34885n = 15;
        Objects.requireNonNull(abstractC3149eQ);
        this.f34886u = abstractC3149eQ;
    }

    public /* synthetic */ C4086vt(C4313b c4313b) {
        this.f34885n = 14;
        Objects.requireNonNull(c4313b);
        this.f34886u = c4313b;
    }
}
