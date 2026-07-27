package I3;

import com.google.android.gms.internal.ads.L9;
import com.google.android.gms.internal.ads.M9;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2520Dh;
import com.google.android.gms.internal.ads.W9;
import com.google.android.gms.internal.ads.X9;
import com.google.android.gms.internal.ads.Z8;

/* loaded from: classes2.dex */
public final class a implements Z8 {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1256n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1257u;

    public /* synthetic */ a(int i, boolean z8) {
        this.f1256n = z8;
        this.f1257u = i;
    }

    @Override // com.google.android.gms.internal.ads.Z8
    public void a(W9 w9) {
        int i = ViewTreeObserverOnGlobalLayoutListenerC2520Dh.f24460I0;
        L9 B8 = M9.B();
        boolean A8 = ((M9) B8.f30000u).A();
        boolean z8 = this.f1256n;
        if (A8 != z8) {
            B8.h();
            ((M9) B8.f30000u).C(z8);
        }
        B8.h();
        ((M9) B8.f30000u).D(this.f1257u);
        M9 m9 = (M9) B8.j();
        w9.h();
        ((X9) w9.f30000u).J(m9);
    }

    public /* synthetic */ a(boolean z8, F.d dVar) {
        this.f1256n = z8;
        this.f1257u = dVar.f908b;
    }
}
