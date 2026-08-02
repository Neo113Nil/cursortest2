package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s2q extends v2q {
    public final String a;
    public final Uri b;

    public s2q(Uri uri, String str) {
        str.getClass();
        uri.getClass();
        this.a = str;
        this.b = uri;
    }

    @Override // defpackage.v2q
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2q)) {
            return false;
        }
        s2q s2qVar = (s2q) obj;
        if (!Intrinsics.d(this.a, s2qVar.a) || !Intrinsics.d(this.b, s2qVar.b)) {
            return false;
        }
        the theVar = the.a;
        return theVar.equals(theVar);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 29791) - 1092964217;
    }

    public final String toString() {
        return "LiveHls(id=" + this.a + ", uri=" + this.b + ", episodeId=null, streamSlug=null, inactivityPolicy=" + the.a + ")";
    }
}
