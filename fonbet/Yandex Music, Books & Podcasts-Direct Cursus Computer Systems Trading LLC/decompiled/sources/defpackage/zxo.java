package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class zxo {
    public static final zxo e = new zxo(yxo.b, 0.0f, xuj.z0, new ikc(1, 9, null));
    public final yxo a;
    public final float b;
    public final uif c;
    public final aur d;

    /* JADX WARN: Multi-variable type inference failed */
    public zxo(yxo yxoVar, float f, Function0 function0, Function1 function1) {
        this.a = yxoVar;
        this.b = f;
        this.c = (uif) function0;
        this.d = (aur) function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxo)) {
            return false;
        }
        zxo zxoVar = (zxo) obj;
        return this.a == zxoVar.a && Float.compare(this.b, zxoVar.b) == 0 && this.c.equals(zxoVar.c) && this.d.equals(zxoVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + eta.a(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        return "ScrollInfo(direction=" + this.a + ", speedMultiplier=" + this.b + ", maxScrollDistanceProvider=" + this.c + ", onScroll=" + this.d + ')';
    }
}
