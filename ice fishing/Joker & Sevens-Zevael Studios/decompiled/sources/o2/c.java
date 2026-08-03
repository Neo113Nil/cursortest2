package o2;

import android.graphics.Typeface;
import k2.l;
import k2.r;
import k2.t;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements oc.g {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f5152g;

    public /* synthetic */ c(d dVar) {
        this.f5152g = dVar;
    }

    @Override // oc.g
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        d dVar = this.f5152g;
        t b2 = ((k2.f) dVar.f5157e).b((r) obj, (l) obj2, ((k2.j) obj3).f3609a, ((k2.k) obj4).f3610a);
        if (b2 instanceof t) {
            Object obj5 = b2.f3625g;
            pc.j.c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) obj5;
        }
        a5.c cVar = new a5.c(b2, dVar.f5162j);
        dVar.f5162j = cVar;
        Object obj6 = cVar.f263i;
        pc.j.c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj6;
    }
}
