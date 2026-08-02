package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class o4m extends tcm {
    public final String a;
    public final String b;
    public final String c;
    public final ypt d;
    public final List e;
    public final vcm f;
    public final int g;
    public final g94 h;
    public final String i;

    public o4m(String str, String str2, String str3, ypt yptVar, List list, vcm vcmVar, int i, g94 g94Var, String str4) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = yptVar;
        this.e = list;
        this.f = vcmVar;
        this.g = i;
        this.h = g94Var;
        this.i = str4;
    }

    @Override // defpackage.tcm
    public final g94 a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4m)) {
            return false;
        }
        o4m o4mVar = (o4m) obj;
        return Intrinsics.d(this.a, o4mVar.a) && this.b.equals(o4mVar.b) && Intrinsics.d(this.c, o4mVar.c) && Intrinsics.d(this.d, o4mVar.d) && Intrinsics.d(this.e, o4mVar.e) && this.f.equals(o4mVar.f) && this.g == o4mVar.g && this.h == o4mVar.h && this.i.equals(o4mVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        int c = k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        ypt yptVar = this.d;
        return this.i.hashCode() + ((this.h.hashCode() + f1d.a(this.g, (this.f.hashCode() + k5r.d((hashCode + (yptVar != null ? yptVar.hashCode() : 0)) * 31, 31, this.e)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PlaylistsAlbumsPodcastsBlock(title=", this.a, ", id=", this.b, ", description=");
        m.append(this.c);
        m.append(", viewAllUrlScheme=");
        m.append(this.d);
        m.append(", entities=");
        m.append(this.e);
        m.append(", parent=");
        m.append(this.f);
        m.append(", positionInParent=");
        m.append(this.g);
        m.append(", type=");
        m.append(this.h);
        m.append(", typeForFrom=");
        return su4.o(m, this.i, ")");
    }
}
