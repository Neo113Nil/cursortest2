package B2;

import com.google.android.gms.internal.ads.C3002bo;
import com.google.android.gms.internal.ads.InterfaceC2592Hl;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class L implements InterfaceC2592Hl {

    /* renamed from: n, reason: collision with root package name */
    public final C3002bo f189n;

    /* renamed from: u, reason: collision with root package name */
    public final K f190u;

    /* renamed from: v, reason: collision with root package name */
    public final String f191v;

    public L(C3002bo c3002bo, K k6, String str) {
        this.f189n = c3002bo;
        this.f190u = k6;
        this.f191v = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2592Hl
    public final void a(u uVar) {
        if (uVar == null) {
            return;
        }
        K k6 = this.f190u;
        String str = this.f191v;
        C3002bo c3002bo = this.f189n;
        String str2 = uVar.f304b;
        synchronized (k6) {
            p2.j.f39798C.f39810k.getClass();
            k6.f185e.put(str, new I(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
            k6.b();
            k6.c(c3002bo);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2592Hl
    public final void C(String str) {
    }
}
