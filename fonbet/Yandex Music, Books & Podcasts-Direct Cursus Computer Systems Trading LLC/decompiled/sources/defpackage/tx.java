package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tx {
    public final String a;
    public final String b;
    public final ArrayList c;

    public tx(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx)) {
            return false;
        }
        tx txVar = (tx) obj;
        return Intrinsics.d(this.a, txVar.a) && Intrinsics.d(this.b, txVar.b) && this.c.equals(txVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return vz1.t(f1d.m("RelatedAlbumsUiData(title=", this.a, ", categoryId=", this.b, ", albums="), this.c, ")");
    }
}
