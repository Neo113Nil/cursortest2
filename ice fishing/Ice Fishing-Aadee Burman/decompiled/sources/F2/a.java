package F2;

import C2.J;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC2684Na;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C4274ze;
import k2.g;
import q2.r;
import v2.AbstractC5111b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final D2.b f951a;

    public a(D2.b bVar) {
        this.f951a = bVar;
    }

    public static void a(Context context, k2.b bVar, g gVar, b bVar2) {
        AbstractC3569ma.a(context);
        if (((Boolean) AbstractC2684Na.f26501j.r()).booleanValue()) {
            if (((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.Cc)).booleanValue()) {
                AbstractC5111b.f41394b.execute(new J(context, bVar, gVar, bVar2, 1));
                return;
            }
        }
        new C4274ze(0, context, bVar, gVar.f38584a).n(bVar2);
    }
}
