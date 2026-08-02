package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes6.dex */
public final class fdm {
    public final String a;
    public final String b;
    public final String c;
    public final ypt d;
    public final int e;
    public final CoverPath f;

    public fdm(String str, String str2, String str3, ypt yptVar, int i, CoverPath coverPath) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = yptVar;
        this.e = i;
        this.f = coverPath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdm)) {
            return false;
        }
        fdm fdmVar = (fdm) obj;
        return this.a.equals(fdmVar.a) && this.b.equals(fdmVar.b) && Intrinsics.d(this.c, fdmVar.c) && this.d.equals(fdmVar.d) && this.e == fdmVar.e && this.f.equals(fdmVar.f);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.f.hashCode() + f1d.a(this.e, (this.d.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PodcastsCategory(title=", this.a, ", categoryId=", this.b, ", description=");
        m.append(this.c);
        m.append(", urlScheme=");
        m.append(this.d);
        m.append(", textColor=");
        m.append(this.e);
        m.append(", backgroundCover=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
