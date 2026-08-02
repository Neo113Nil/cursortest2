package E2;

import com.google.android.gms.internal.ads.C3069co;
import com.google.android.gms.internal.ads.InterfaceC2664Kl;
import java.util.HashSet;
import r2.C4906k;

/* loaded from: classes.dex */
public final class K implements InterfaceC2664Kl {

    /* renamed from: n, reason: collision with root package name */
    public final C3069co f754n;

    /* renamed from: u, reason: collision with root package name */
    public final J f755u;

    /* renamed from: v, reason: collision with root package name */
    public final String f756v;

    public K(C3069co c3069co, J j6, String str) {
        this.f754n = c3069co;
        this.f755u = j6;
        this.f756v = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2664Kl
    public final void c(s sVar) {
        if (sVar == null) {
            return;
        }
        J j6 = this.f755u;
        String str = this.f756v;
        C3069co c3069co = this.f754n;
        String str2 = sVar.f867b;
        synchronized (j6) {
            C4906k.f40186C.f40198k.getClass();
            j6.f750e.put(str, new H(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
            j6.b();
            j6.c(c3069co);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2664Kl
    public final void b(String str) {
    }
}
