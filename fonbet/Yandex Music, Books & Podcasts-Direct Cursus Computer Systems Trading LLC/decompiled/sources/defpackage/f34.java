package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f34 {
    public final long a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;

    public f34(long j, List list, List list2, List list3, List list4, List list5, List list6, List list7) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        this.a = j;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = list6;
        this.h = list7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f34)) {
            return false;
        }
        f34 f34Var = (f34) obj;
        return this.a == f34Var.a && Intrinsics.d(this.b, f34Var.b) && Intrinsics.d(this.c, f34Var.c) && Intrinsics.d(this.d, f34Var.d) && Intrinsics.d(this.e, f34Var.e) && Intrinsics.d(this.f, f34Var.f) && Intrinsics.d(this.g, f34Var.g) && Intrinsics.d(this.h, f34Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + k5r.d(k5r.d(k5r.d(k5r.d(k5r.d(k5r.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "CarouselMetaState(downloadDurationMs=" + this.a + ", downloads=" + this.b + ", playlists=" + this.c + ", albums=" + this.d + ", videoClips=" + this.e + ", podcasts=" + this.f + ", books=" + this.g + ", kids=" + this.h + ")";
    }
}
