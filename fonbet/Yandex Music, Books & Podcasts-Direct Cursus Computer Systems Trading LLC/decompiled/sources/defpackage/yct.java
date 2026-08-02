package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class yct implements u9f {

    @NotNull
    public static final xct c = new xct(null);
    public final lm4 a;
    public final int b;

    public yct(lm4 lm4Var, boolean z) {
        Collections.EMPTY_LIST.getClass();
        this.a = lm4Var;
        this.b = z ? 1 : 0;
    }

    @Override // defpackage.u9f
    public final boolean a() {
        return (this.b & 1) != 0;
    }

    @Override // defpackage.u9f
    public final f9f d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yct)) {
            return false;
        }
        yct yctVar = (yct) obj;
        if (!this.a.equals(yctVar.a)) {
            return false;
        }
        List list = Collections.EMPTY_LIST;
        return Intrinsics.d(list, list) && this.b == yctVar.b;
    }

    @Override // defpackage.u9f
    public final List g() {
        return Collections.EMPTY_LIST;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + k5r.d(this.a.hashCode() * 31, 31, Collections.EMPTY_LIST);
    }

    public final String toString() {
        List list = Collections.EMPTY_LIST;
        Class P = leu.P(this.a);
        return ouj.o(P.isArray() ? P.equals(boolean[].class) ? "kotlin.BooleanArray" : P.equals(char[].class) ? "kotlin.CharArray" : P.equals(byte[].class) ? "kotlin.ByteArray" : P.equals(short[].class) ? "kotlin.ShortArray" : P.equals(int[].class) ? "kotlin.IntArray" : P.equals(float[].class) ? "kotlin.FloatArray" : P.equals(long[].class) ? "kotlin.LongArray" : P.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : P.getName(), list.isEmpty() ? "" : CollectionsKt.X(list, ", ", "<", ">", new h4t(this), 24), a() ? "?" : "").concat(" (Kotlin reflection is not available)");
    }
}
