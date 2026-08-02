package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k7v {
    public final String a;
    public final String b;
    public final o6v c;

    public k7v(String str, String str2, o6v o6vVar) {
        this.a = str;
        this.b = str2;
        this.c = o6vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7v)) {
            return false;
        }
        k7v k7vVar = (k7v) obj;
        return this.a.equals(k7vVar.a) && Intrinsics.d(this.b, k7vVar.b) && this.c == k7vVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WaveWordsFeedback(cardId=", this.a, ", bigCardId=", this.b, ", feedbackState=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
