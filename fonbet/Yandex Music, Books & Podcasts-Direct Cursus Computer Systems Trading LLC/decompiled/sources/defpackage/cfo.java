package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cfo {
    public final String a;
    public final String b;
    public final Uri c;

    public cfo(Uri uri, String str, String str2) {
        uwh uwhVar = uwh.a;
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfo)) {
            return false;
        }
        cfo cfoVar = (cfo) obj;
        if (!this.a.equals(cfoVar.a)) {
            return false;
        }
        uwh uwhVar = uwh.a;
        return Intrinsics.d(this.b, cfoVar.b) && Intrinsics.d(this.c, cfoVar.c);
    }

    public final int hashCode() {
        int c = k5r.c((uwh.a.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.b);
        Uri uri = this.c;
        return c + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "RootItem(mediaItemId=" + this.a + ", mediaType=" + uwh.a + ", title=" + this.b + ", iconUri=" + this.c + ")";
    }
}
