package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s3p {
    public final lt a;
    public final Date b;

    public s3p(lt ltVar, Date date) {
        this.a = ltVar;
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3p)) {
            return false;
        }
        s3p s3pVar = (s3p) obj;
        return this.a.equals(s3pVar.a) && Intrinsics.d(this.b, s3pVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Date date = this.b;
        return hashCode + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        return "AlbumRelease(album=" + this.a + ", releaseDate=" + this.b + ")";
    }
}
