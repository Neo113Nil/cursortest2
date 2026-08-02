package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qan {
    public final xxk a;
    public final xxk b;
    public final xxk c;

    public qan(xxk xxkVar, xxk xxkVar2, xxk xxkVar3) {
        xxkVar2.getClass();
        this.a = xxkVar;
        this.b = xxkVar2;
        this.c = xxkVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qan)) {
            return false;
        }
        qan qanVar = (qan) obj;
        return Intrinsics.d(this.a, qanVar.a) && Intrinsics.d(this.b, qanVar.b) && Intrinsics.d(this.c, qanVar.c);
    }

    public final int hashCode() {
        xxk xxkVar = this.a;
        int hashCode = (this.b.hashCode() + ((xxkVar == null ? 0 : xxkVar.hashCode()) * 31)) * 31;
        xxk xxkVar2 = this.c;
        return hashCode + (xxkVar2 != null ? xxkVar2.hashCode() : 0);
    }

    public final String toString() {
        return "QueuePlayablesUiData(previousPlayable=" + this.a + ", currentPlayable=" + this.b + ", nextPlayable=" + this.c + ")";
    }
}
