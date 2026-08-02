package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p9p implements k7h {
    public final String a;
    public final String b;
    public final String c;

    public p9p(String str) {
        str.getClass();
        this.a = str;
        int i = -1;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (str.charAt(length) == '_') {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        if (i < 1 || this.a.length() < 3) {
            su4.s(2, null, f1d.g("Owner and kind could not be parsed from ", this.a), null);
            this.b = null;
            this.c = null;
        } else {
            this.b = this.a.substring(0, i);
            String str2 = this.a;
            this.c = str2.substring(i + 1, str2.length());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9p) && Intrinsics.d(this.a, ((p9p) obj).a);
    }

    @Override // defpackage.g9p
    public final String getTag() {
        return this.a;
    }

    @Override // defpackage.g9p
    public final String getType() {
        return "playlist";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("SeedPlaylist(tag=", this.a, ")");
    }
}
