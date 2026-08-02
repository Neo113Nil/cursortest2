package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bvs {
    public final zvs a;
    public final o5n b;
    public final Uri c;
    public final String d;
    public final boolean e;
    public final oq4 f;
    public final int g;
    public final o5n h;
    public final ArrayList i;

    public bvs(zvs zvsVar, o5n o5nVar, Uri uri, String str, boolean z, oq4 oq4Var, int i, o5n o5nVar2, ArrayList arrayList) {
        zvsVar.getClass();
        o5nVar.getClass();
        uri.getClass();
        this.a = zvsVar;
        this.b = o5nVar;
        this.c = uri;
        this.d = str;
        this.e = z;
        this.f = oq4Var;
        this.g = i;
        this.h = o5nVar2;
        this.i = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvs)) {
            return false;
        }
        bvs bvsVar = (bvs) obj;
        return Intrinsics.d(this.a, bvsVar.a) && this.b == bvsVar.b && Intrinsics.d(this.c, bvsVar.c) && this.d.equals(bvsVar.d) && this.e == bvsVar.e && this.f == bvsVar.f && this.g == bvsVar.g && this.h == bvsVar.h && this.i.equals(bvsVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + f1d.a(this.g, (this.f.hashCode() + k5r.e(k5r.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackDownloadData(track=");
        sb.append(this.a);
        sb.append(", quality=");
        sb.append(this.b);
        sb.append(", uri=");
        sb.append(this.c);
        sb.append(", encryptionKey=");
        sb.append(this.d);
        sb.append(", gain=");
        sb.append(this.e);
        sb.append(", codec=");
        sb.append(this.f);
        sb.append(", bitrate=");
        sb.append(this.g);
        sb.append(", realQuality=");
        sb.append(this.h);
        sb.append(", strmUrls=");
        return vz1.t(sb, this.i, ")");
    }
}
