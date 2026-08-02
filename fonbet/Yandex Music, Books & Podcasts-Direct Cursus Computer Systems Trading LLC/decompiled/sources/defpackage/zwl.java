package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zwl extends tcm {
    public final String a;
    public final String b;
    public final String c;
    public final ypt d;
    public final s4m e;
    public final vcm f;
    public final int g;
    public final g94 h;
    public final String i;

    public zwl(String str, String str2, String str3, ypt yptVar, s4m s4mVar, vcm vcmVar, int i, g94 g94Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = yptVar;
        this.e = s4mVar;
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
        if (!(obj instanceof zwl)) {
            return false;
        }
        zwl zwlVar = (zwl) obj;
        return Intrinsics.d(this.a, zwlVar.a) && Intrinsics.d(this.b, zwlVar.b) && this.c.equals(zwlVar.c) && Intrinsics.d(this.d, zwlVar.d) && this.e.equals(zwlVar.e) && this.f.equals(zwlVar.f) && this.g == zwlVar.g && this.h == zwlVar.h && this.i.equals(zwlVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int c = k5r.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        ypt yptVar = this.d;
        return this.i.hashCode() + ((this.h.hashCode() + f1d.a(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((c + (yptVar != null ? yptVar.hashCode() : 0)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PlaylistPodcastsBlock(title=", this.a, ", description=", this.b, ", id=");
        m.append(this.c);
        m.append(", viewAllUrlScheme=");
        m.append(this.d);
        m.append(", playlistEntity=");
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
