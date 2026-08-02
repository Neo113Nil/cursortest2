package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class fxv implements Function1 {
    public final /* synthetic */ hxv a;
    public final /* synthetic */ bxv b;
    public final /* synthetic */ int c;

    public fxv(hxv hxvVar, bxv bxvVar, int i) {
        this.a = hxvVar;
        this.b = bxvVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        hxv hxvVar = this.a;
        if (booleanValue) {
            p0w p0wVar = hxvVar.c;
            bxv bxvVar = this.b;
            String str = bxvVar.b;
            String str2 = bxvVar.c;
            String str3 = hxvVar.d;
            p0wVar.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            nmb a = p0wVar.a();
            String j = k5r.j(p0wVar, a);
            LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
            m.put("hash", j);
            m.put("genre_tab", str3);
            m.put("artist_id", str);
            eta.m(this.c, "artist_name", str2, "artist_pos", m);
            m.put("_meta", nmb.u(1));
            a.C("Wizard.LikedArtistsItem.Showed", m);
        } else {
            hxvVar.getClass();
        }
        return Unit.a;
    }
}
