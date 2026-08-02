package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kaw {
    public final zvs a;
    public final gy1 b;
    public final long c;
    public final long d;
    public final boolean e;
    public final vzg f;
    public final String g;
    public final be6 h;
    public final Uri i;

    public kaw(zvs zvsVar, gy1 gy1Var, long j, long j2, boolean z, vzg vzgVar, String str, be6 be6Var) {
        zvsVar.getClass();
        be6Var.getClass();
        this.a = zvsVar;
        this.b = gy1Var;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = vzgVar;
        this.g = str;
        this.h = be6Var;
        Uri.Builder path = new Uri.Builder().scheme("yandexmusic").authority("track").path(String.valueOf(zvsVar));
        path.appendQueryParameter("previewType", gy1Var.toString());
        path.appendQueryParameter("normalize", String.valueOf(z));
        path.appendQueryParameter("crossfadeTime", String.valueOf(nsa.f(j)));
        path.appendQueryParameter("waitCrossfadeTime", String.valueOf(nsa.f(j2)));
        if (str != null) {
            path.appendQueryParameter("playableId", str);
        }
        if (vzgVar != null) {
            path.appendQueryParameter("truePeakDb", String.valueOf(vzgVar.b));
            path.appendQueryParameter("integratedLoudnessDb", String.valueOf(vzgVar.a));
            path.appendQueryParameter("contentType", be6Var.toString());
        }
        Uri build = path.build();
        build.getClass();
        this.i = build;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kaw)) {
            return false;
        }
        kaw kawVar = (kaw) obj;
        return Intrinsics.d(this.a, kawVar.a) && this.b == kawVar.b && nsa.e(this.c, kawVar.c) && nsa.e(this.d, kawVar.d) && this.e == kawVar.e && Intrinsics.d(this.f, kawVar.f) && Intrinsics.d(this.g, kawVar.g) && this.h == kawVar.h;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        msa msaVar = nsa.b;
        int e = k5r.e(tlm.c(this.d, tlm.c(this.c, hashCode, 31), 31), 31, this.e);
        vzg vzgVar = this.f;
        int hashCode2 = (e + (vzgVar == null ? 0 : vzgVar.hashCode())) * 31;
        String str = this.g;
        return this.h.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String uri = this.i.toString();
        uri.getClass();
        return uri;
    }
}
