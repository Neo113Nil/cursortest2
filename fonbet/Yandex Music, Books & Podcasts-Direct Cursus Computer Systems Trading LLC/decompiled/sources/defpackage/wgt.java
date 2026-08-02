package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wgt extends jht {
    public final String a;
    public final ArrayList b;

    public wgt(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgt)) {
            return false;
        }
        wgt wgtVar = (wgt) obj;
        return Intrinsics.d(this.a, wgtVar.a) && this.b.equals(wgtVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Success(blockTitle=" + this.a + ", items=" + this.b + ")";
    }
}
