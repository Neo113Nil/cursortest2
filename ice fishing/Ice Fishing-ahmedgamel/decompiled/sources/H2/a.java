package H2;

import E2.I;
import N3.s;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC2704Na;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C4297ze;
import m2.g;
import s2.r;
import x2.AbstractC5190b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final s f1236a;

    public a(s sVar) {
        this.f1236a = sVar;
    }

    public static void a(Context context, m2.b bVar, g gVar, b bVar2) {
        AbstractC3592ma.a(context);
        if (((Boolean) AbstractC2704Na.f27284j.r()).booleanValue()) {
            if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Cc)).booleanValue()) {
                AbstractC5190b.f41851b.execute(new I(context, bVar, gVar, bVar2, 1));
                return;
            }
        }
        new C4297ze(0, context, bVar, gVar.f39373a).n(bVar2);
    }
}
