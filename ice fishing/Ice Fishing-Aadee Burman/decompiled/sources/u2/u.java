package u2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.C3864s;
import l.C4648e;
import p2.C4835j;

/* loaded from: classes.dex */
public final class u extends L3.o {

    /* renamed from: v, reason: collision with root package name */
    public final v2.l f41309v;

    /* renamed from: w, reason: collision with root package name */
    public final String f41310w;

    /* renamed from: x, reason: collision with root package name */
    public final C4648e f41311x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, String str, String str2, C4648e c4648e) {
        super(3);
        String E8 = C4835j.f39730C.f39735c.E(context, str);
        this.f41309v = new v2.l(context, E8);
        this.f41310w = str2;
        this.f41311x = c4648e;
    }

    @Override // L3.o
    public final void k() {
        String str = this.f41310w;
        C4648e c4648e = this.f41311x;
        if (c4648e == null) {
            this.f41309v.a(null, str);
        } else {
            new C3864s((v2.h) c4648e.f38761u, this.f41309v, AbstractC3413jg.f31272e, null, null, 10).a(str);
        }
    }
}
