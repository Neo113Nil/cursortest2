package defpackage;

import com.connectsdk.service.airplay.PListParser;

/* loaded from: classes3.dex */
public final class nbc extends vbc {
    public final boolean a;

    public nbc(boolean z) {
        this.a = z;
    }

    @Override // defpackage.vbc
    public final String a() {
        return PListParser.TAG_DATE;
    }

    @Override // defpackage.vbc
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbc) && this.a == ((nbc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("DateSort(isSelected=", ")", this.a);
    }
}
