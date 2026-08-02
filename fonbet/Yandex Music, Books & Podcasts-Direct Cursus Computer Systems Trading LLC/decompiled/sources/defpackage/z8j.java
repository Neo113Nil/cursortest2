package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes3.dex */
public final class z8j implements a9j {
    public final xbb a;
    public final Album$AlbumType b;
    public final List c;
    public final String d;
    public final List e;
    public final List f;

    public z8j(xbb xbbVar, Album$AlbumType album$AlbumType, List list, String str, List list2, List list3) {
        xbbVar.getClass();
        album$AlbumType.getClass();
        list2.getClass();
        list3.getClass();
        this.a = xbbVar;
        this.b = album$AlbumType;
        this.c = list;
        this.d = str;
        this.e = list2;
        this.f = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8j)) {
            return false;
        }
        z8j z8jVar = (z8j) obj;
        return Intrinsics.d(this.a, z8jVar.a) && this.b == z8jVar.b && Intrinsics.d(this.c, z8jVar.c) && Intrinsics.d(this.d, z8jVar.d) && Intrinsics.d(this.e, z8jVar.e) && Intrinsics.d(this.f, z8jVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        List list = this.c;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        return this.f.hashCode() + k5r.d((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        return "Success(header=" + this.a + ", albumType=" + this.b + ", speakers=" + this.c + ", description=" + this.d + ", actions=" + this.e + ", disclaimers=" + this.f + ")";
    }
}
