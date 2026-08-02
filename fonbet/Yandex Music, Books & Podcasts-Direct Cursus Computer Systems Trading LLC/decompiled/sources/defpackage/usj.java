package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class usj {
    public final String a;
    public final String b;
    public final ArrayList c;

    public usj(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usj)) {
            return false;
        }
        usj usjVar = (usj) obj;
        return this.a.equals(usjVar.a) && Intrinsics.d(this.b, usjVar.b) && this.c.equals(usjVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return vz1.t(f1d.m("OpenPlaylistBlockState(blockTitle=", this.a, ", description=", this.b, ", coverTrackItems="), this.c, ")");
    }
}
