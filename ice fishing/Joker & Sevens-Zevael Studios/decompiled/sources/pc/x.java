package pc;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final e f5685a;

    public x(e eVar) {
        j.e(Collections.EMPTY_LIST, "arguments");
        this.f5685a = eVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        if (!this.f5685a.equals(((x) obj).f5685a)) {
            return false;
        }
        List list = Collections.EMPTY_LIST;
        return j.a(list, list);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((Collections.EMPTY_LIST.hashCode() + (this.f5685a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Class a6 = this.f5685a.a();
        j.c(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        String name = a6.isArray() ? a6.equals(boolean[].class) ? "kotlin.BooleanArray" : a6.equals(char[].class) ? "kotlin.CharArray" : a6.equals(byte[].class) ? "kotlin.ByteArray" : a6.equals(short[].class) ? "kotlin.ShortArray" : a6.equals(int[].class) ? "kotlin.IntArray" : a6.equals(float[].class) ? "kotlin.FloatArray" : a6.equals(long[].class) ? "kotlin.LongArray" : a6.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : a6.getName();
        List list = Collections.EMPTY_LIST;
        sb.append(name + (list.isEmpty() ? "" : bc.m.W(list, ", ", "<", ">", new w(1), 24)) + "");
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
