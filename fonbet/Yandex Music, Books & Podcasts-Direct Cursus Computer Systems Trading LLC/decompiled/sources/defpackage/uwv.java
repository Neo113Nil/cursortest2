package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class uwv {
    public final ArrayList a;
    public final ArrayList b;
    public final Set c;
    public final b0w d;
    public final boolean e;

    public uwv(ArrayList arrayList, ArrayList arrayList2, Set set, b0w b0wVar, boolean z) {
        set.getClass();
        this.a = arrayList;
        this.b = arrayList2;
        this.c = set;
        this.d = b0wVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwv)) {
            return false;
        }
        uwv uwvVar = (uwv) obj;
        return this.a.equals(uwvVar.a) && this.b.equals(uwvVar.b) && Intrinsics.d(this.c, uwvVar.c) && this.d.equals(uwvVar.d) && this.e == uwvVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + su4.f(this.c, dfi.b(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WizardInitialArtists(artists=");
        sb.append(this.a);
        sb.append(", genres=");
        sb.append(this.b);
        sb.append(", likedArtistIds=");
        sb.append(this.c);
        sb.append(", progress=");
        sb.append(this.d);
        sb.append(", isPumpkin=");
        return ouj.r(sb, this.e, ")");
    }
}
