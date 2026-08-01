package u2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.C3864s;
import l.C4648e;
import p2.C4835j;

/* loaded from: classes.dex */
public final class u extends L3.o {

    /* renamed from: v, reason: collision with root package name */
    public final v2.l f41312v;

    /* renamed from: w, reason: collision with root package name */
    public final String f41313w;

    /* renamed from: x, reason: collision with root package name */
    public final C4648e f41314x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, String str, String str2, C4648e c4648e) {
        super(3);
        String E8 = C4835j.f39733C.f39738c.E(context, str);
        this.f41312v = new v2.l(context, E8);
        this.f41313w = str2;
        this.f41314x = c4648e;
    }

    @Override // L3.o
    public final void k() {
        String str = this.f41313w;
        C4648e c4648e = this.f41314x;
        if (c4648e == null) {
            this.f41312v.a(null, str);
        } else {
            new C3864s((v2.h) c4648e.f38761u, this.f41312v, AbstractC3413jg.f31272e, null, null, 10).a(str);
        }
    }
}
