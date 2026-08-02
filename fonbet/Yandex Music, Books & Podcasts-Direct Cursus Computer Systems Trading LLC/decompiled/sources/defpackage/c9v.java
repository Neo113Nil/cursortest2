package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c9v {
    public final String a;
    public final String b;

    public c9v(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9v)) {
            return false;
        }
        c9v c9vVar = (c9v) obj;
        return this.a.equals(c9vVar.a) && Intrinsics.d(this.b, c9vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("WaveWordsViewedBigCard(cardId=", this.a, ", bigCardId=", this.b, ")");
    }
}
