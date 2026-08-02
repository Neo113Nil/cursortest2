package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fej implements yit {
    public final lt a;
    public final List b;
    public final int c;
    public final Boolean d;

    public fej(lt ltVar, List list, int i, Boolean bool) {
        list.getClass();
        this.a = ltVar;
        this.b = list;
        this.c = i;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fej)) {
            return false;
        }
        fej fejVar = (fej) obj;
        return this.a.equals(fejVar.a) && Intrinsics.d(this.b, fejVar.b) && this.c == fejVar.c && Intrinsics.d(this.d, fejVar.d);
    }

    public final int hashCode() {
        int a = f1d.a(this.c, k5r.d(this.a.hashCode() * 31, 31, this.b), 31);
        Boolean bool = this.d;
        return a + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "NonMusicUniversalEntity(album=" + this.a + ", artists=" + this.b + ", likesCount=" + this.c + ", yandexBooksOptionRequired=" + this.d + ")";
    }
}
