package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class uga {
    public final String a;
    public final String b;
    public final String c;

    public uga(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uga)) {
            return false;
        }
        return Intrinsics.d(this.a, ((uga) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return su4.o(f1d.m("DownloadedPlaylistUserInfo(userUid=", this.a, ", userLogin=", this.b, ", userName="), this.c, ")");
    }
}
