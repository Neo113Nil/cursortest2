package C2;

import com.google.android.gms.internal.ads.C2993bo;
import com.google.android.gms.internal.ads.InterfaceC2627Jl;
import java.util.HashSet;
import p2.C4835j;

/* loaded from: classes.dex */
public final class L implements InterfaceC2627Jl {

    /* renamed from: n, reason: collision with root package name */
    public final C2993bo f294n;

    /* renamed from: u, reason: collision with root package name */
    public final K f295u;

    /* renamed from: v, reason: collision with root package name */
    public final String f296v;

    public L(C2993bo c2993bo, K k9, String str) {
        this.f294n = c2993bo;
        this.f295u = k9;
        this.f296v = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2627Jl
    public final void c(t tVar) {
        if (tVar == null) {
            return;
        }
        K k9 = this.f295u;
        String str = this.f296v;
        C2993bo c2993bo = this.f294n;
        String str2 = tVar.f408b;
        synchronized (k9) {
            C4835j.f39730C.f39742k.getClass();
            k9.f290e.put(str, new I(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
            k9.b();
            k9.c(c2993bo);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2627Jl
    public final void b(String str) {
    }
}
