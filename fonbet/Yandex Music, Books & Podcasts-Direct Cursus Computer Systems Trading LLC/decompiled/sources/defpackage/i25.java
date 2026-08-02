package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class i25 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public i25(int i, i2u i2uVar, i2u i2uVar2) {
        this.a = 1;
        this.b = i;
        this.c = i2uVar;
        this.d = i2uVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        plb plbVar;
        int i2 = this.a;
        int i3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                j25 j25Var = (j25) obj2;
                cvl cvlVar = ((dwl) obj).b;
                j25Var.getClass();
                v25 v25Var = (v25) j25Var.a.b;
                yk3 yk3Var = v25Var.d;
                yk3Var.getClass();
                t0s t0sVar = (t0s) yk3Var.e;
                if (t0sVar != null) {
                    pwl pwlVar = (pwl) yk3Var.d;
                    String e = cvlVar.e();
                    int i4 = i3 + 1;
                    int ordinal = t0sVar.a.ordinal();
                    if (ordinal != 0) {
                        i = 1;
                        if (ordinal != 1) {
                            b6e.s();
                            break;
                        } else {
                            plbVar = plb.Liked;
                        }
                    } else {
                        i = 1;
                        plbVar = plb.Own;
                    }
                    int i5 = t0sVar.b + i;
                    boolean z = yk3Var.a;
                    qlb x = yk3.x(cvlVar, (frt) ((jyr) yk3Var.c).getValue());
                    wjb wjbVar = wjb.AboutArtistScreen;
                    pwlVar.getClass();
                    nmb nmbVar = pwlVar.b;
                    String G = pwlVar.a.G();
                    nmbVar.getClass();
                    G.getClass();
                    LinkedHashMap m = dfi.m("page_type", "listing", "hash", G);
                    m.put("view_uuid", "");
                    m.put("page_id", "playlist_list_screen");
                    m.put("object_type", "playlist");
                    eta.m(i4, "object_id", e, "object_pos", m);
                    eta.m(i5, "tab_id", plbVar.a, "tab_pos", m);
                    m.put("is_tab_selected_by_default", String.valueOf(z));
                    m.put("playlist_type", x.a);
                    m.put("to", "playlist_screen");
                    dfi.p(2, "from", "playlist_list_screen", "_meta", m);
                    nmbVar.C("PlaylistList.Playlist.Navigated", m);
                }
                mwl mwlVar = v25Var.c;
                mwlVar.getClass();
                mwlVar.b.a(cvlVar);
                break;
            case 1:
                i2u i2uVar = (i2u) obj2;
                i2u i2uVar2 = (i2u) obj;
                float f = 0.0f;
                if (w8u.f(i2uVar) == i3) {
                    if (w8u.e(i2uVar2) > 0.0f) {
                        f = (-1) * w8u.e(i2uVar2);
                    } else {
                        f = w8u.e(i2uVar2);
                    }
                } else if (w8u.e(i2uVar2) < 0.0f && i3 == w8u.f(i2uVar) + 1) {
                    f = Math.abs(w8u.e(i2uVar2));
                } else if (w8u.e(i2uVar2) > 0.0f && i3 == w8u.f(i2uVar) - 1) {
                    f = w8u.e(i2uVar2);
                }
                break;
            case 2:
                ((nru) obj2).m((hsu) obj, i3);
                break;
            default:
                hxv hxvVar = (hxv) obj2;
                bxv bxvVar = (bxv) obj;
                j1w j1wVar = (j1w) hxvVar.b.b;
                String str = hxvVar.d;
                jd1 jd1Var = (jd1) bxvVar.g.getValue();
                String str2 = bxvVar.c;
                String str3 = bxvVar.b;
                boolean z2 = jd1Var.c;
                p0w p0wVar = hxvVar.c;
                if (z2) {
                    p0wVar.getClass();
                    str3.getClass();
                    str2.getClass();
                    str.getClass();
                    nmb a = p0wVar.a();
                    String j = k5r.j(p0wVar, a);
                    LinkedHashMap m2 = dfi.m("page_type", "landing", "page_id", "wizard");
                    m2.put("hash", j);
                    m2.put("genre_tab", str);
                    m2.put("artist_id", str3);
                    eta.m(i3, "artist_name", str2, "artist_pos", m2);
                    m2.put("_meta", nmb.u(1));
                    a.C("Wizard.LikedArtistsItem.Unliked", m2);
                    j1wVar.a.h0(bxvVar);
                } else {
                    p0wVar.getClass();
                    str3.getClass();
                    str2.getClass();
                    str.getClass();
                    nmb a2 = p0wVar.a();
                    String j2 = k5r.j(p0wVar, a2);
                    LinkedHashMap m3 = dfi.m("page_type", "landing", "page_id", "wizard");
                    m3.put("hash", j2);
                    m3.put("genre_tab", str);
                    m3.put("artist_id", str3);
                    eta.m(i3, "artist_name", str2, "artist_pos", m3);
                    m3.put("_meta", nmb.u(1));
                    a2.C("Wizard.LikedArtistsItem.Liked", m3);
                    j1wVar.a.b0(bxvVar);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i25(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
