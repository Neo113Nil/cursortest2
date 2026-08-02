package O3;

import com.google.android.gms.internal.ads.C2948aa;
import com.google.android.gms.internal.ads.InterfaceC3037c9;
import com.google.android.gms.internal.ads.O9;
import com.google.android.gms.internal.ads.P9;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2592Gh;
import com.google.android.gms.internal.ads.Z9;

/* loaded from: classes2.dex */
public final class a implements InterfaceC3037c9 {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2292n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2293u;

    public /* synthetic */ a(int i, boolean z6) {
        this.f2292n = z6;
        this.f2293u = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037c9
    public void b(Z9 z9) {
        int i = ViewTreeObserverOnGlobalLayoutListenerC2592Gh.f25837D0;
        O9 B3 = P9.B();
        boolean A9 = ((P9) B3.f28504u).A();
        boolean z6 = this.f2292n;
        if (A9 != z6) {
            B3.h();
            ((P9) B3.f28504u).C(z6);
        }
        B3.h();
        ((P9) B3.f28504u).D(this.f2293u);
        P9 p9 = (P9) B3.j();
        z9.h();
        ((C2948aa) z9.f28504u).J(p9);
    }

    public /* synthetic */ a(boolean z6, F.d dVar) {
        this.f2292n = z6;
        this.f2293u = dVar.f917b;
    }
}
