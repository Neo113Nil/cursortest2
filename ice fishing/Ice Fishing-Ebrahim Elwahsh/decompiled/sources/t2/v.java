package t2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3212fg;

/* loaded from: classes.dex */
public final class v extends d1.f {

    /* renamed from: v, reason: collision with root package name */
    public final u2.l f40935v;

    /* renamed from: w, reason: collision with root package name */
    public final String f40936w;

    /* renamed from: x, reason: collision with root package name */
    public final w f40937x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, String str, String str2, w wVar) {
        super(2);
        String E8 = p2.j.f39798C.f39803c.E(context, str);
        this.f40935v = new u2.l(context, E8);
        this.f40936w = str2;
        this.f40937x = wVar;
    }

    @Override // d1.f
    public final void k() {
        String str = this.f40936w;
        w wVar = this.f40937x;
        if (wVar == null) {
            this.f40935v.a(null, str);
        } else {
            new com.google.android.gms.internal.ads.r((u2.h) wVar.f40939u, this.f40935v, AbstractC3212fg.f30742e, null, null, 10).b(str);
        }
    }
}
