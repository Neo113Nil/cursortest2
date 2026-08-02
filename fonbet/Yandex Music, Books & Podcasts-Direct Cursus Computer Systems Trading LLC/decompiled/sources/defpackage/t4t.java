package defpackage;

import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class t4t {
    public final kxi a;
    public final String b;
    public final l5t c;
    public final jyr d = btf.b(new wfs(9, this));
    public final cvo e = new cvo(wjb.TrailerScreen, hlb.Bottomsheet, (glb) null, (dvo) null, new avo(pkb.Trailer, a()), 44);
    public final jyr f = btf.b(new x6s(18));

    public t4t(kxi kxiVar, l5t l5tVar, String str) {
        this.a = kxiVar;
        this.b = str;
        this.c = l5tVar;
    }

    public static pkb c(l5t l5tVar) {
        int ordinal = l5tVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return pkb.Album;
        }
        if (ordinal == 2) {
            return pkb.Playlist;
        }
        if (ordinal == 3) {
            return pkb.Artist;
        }
        if (ordinal == 4) {
            return pkb.Track;
        }
        b6e.s();
        return null;
    }

    public static String d(r4t r4tVar, int i) {
        i0r i0rVar = (i0r) CollectionsKt.S(r4tVar.c, i);
        String str = i0rVar != null ? i0rVar.b : null;
        return str == null ? "" : str;
    }

    public final String a() {
        return (String) this.d.getValue();
    }

    public final nmb b() {
        return (nmb) this.f.getValue();
    }
}
