package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class jcw {
    public final String a;
    public final Object b;
    public final String c;
    public boolean d;
    public long e;
    public final LinkedHashSet f;

    public jcw(String str, String str2, Object obj) {
        str2.getClass();
        this.a = str;
        this.b = obj;
        this.c = str2;
        this.f = new LinkedHashSet();
    }

    public final void a() {
        this.e = SystemClock.elapsedRealtime() + 1000;
    }

    public final boolean b(String str) {
        str.getClass();
        return Intrinsics.d(StringsKt.t0(this.c).toString(), StringsKt.t0(str).toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcw)) {
            return false;
        }
        jcw jcwVar = (jcw) obj;
        return this.a.equals(jcwVar.a) && Intrinsics.d(this.b, jcwVar.b) && Intrinsics.d(this.c, jcwVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return this.c.hashCode() + ((hashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubState(name=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", entityId=");
        return su4.o(sb, this.c, ")");
    }
}
