package E2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3364iD;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2820To;
import com.google.android.gms.internal.ads.C3010bi;
import com.google.android.gms.internal.ads.C3123dp;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.C3383ig;
import com.google.android.gms.internal.ads.InterfaceC3320hN;
import x2.C5189a;

/* loaded from: classes.dex */
public final class q implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f860a;

    /* renamed from: b, reason: collision with root package name */
    public final C3010bi f861b;

    /* renamed from: c, reason: collision with root package name */
    public final C3010bi f862c;

    public /* synthetic */ q(C3010bi c3010bi, C3010bi c3010bi2, int i) {
        this.f860a = i;
        this.f861b = c3010bi;
        this.f862c = c3010bi2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        C3010bi c3010bi = this.f862c;
        C3010bi c3010bi2 = this.f861b;
        switch (this.f860a) {
            case 0:
                Context a9 = c3010bi2.a();
                C3324ha c3324ha = AbstractC3592ma.f32971a;
                return new C0305b(a9, s2.r.f40506e.f40507a.A(), c3010bi.b());
            case 1:
                return new C2820To(c3010bi2.a(), c3010bi.b());
            default:
                Context a10 = c3010bi2.a();
                C5189a b9 = c3010bi.b();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C3123dp(a10, b9, c3383ig);
        }
    }
}
