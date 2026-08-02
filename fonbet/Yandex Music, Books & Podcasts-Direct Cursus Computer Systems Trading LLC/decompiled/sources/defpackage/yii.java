package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class yii implements zii {
    public final dou a;
    public final np b;
    public final String c;
    public final int d;

    public yii(dou douVar, np npVar, String str, int i) {
        douVar.getClass();
        this.a = douVar;
        this.b = npVar;
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yii)) {
            return false;
        }
        yii yiiVar = (yii) obj;
        return Intrinsics.d(this.a, yiiVar.a) && Intrinsics.d(this.b, yiiVar.b) && Intrinsics.d(this.c, yiiVar.c) && this.d == yiiVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        np npVar = this.b;
        int hashCode2 = (hashCode + (npVar == null ? 0 : npVar.hashCode())) * 31;
        String str = this.c;
        return Integer.hashCode(this.d) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.zii
    public final boolean r() {
        return true;
    }

    public final String toString() {
        return "Wave(domainModel=" + this.a + ", agent=" + this.b + ", foregroundImage=" + this.c + ", backgroundColor=" + this.d + ")";
    }
}
