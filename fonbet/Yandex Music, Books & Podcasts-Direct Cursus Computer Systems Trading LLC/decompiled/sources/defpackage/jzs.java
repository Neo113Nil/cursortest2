package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jzs implements mwk {
    public final mqs a;
    public final v80 b;
    public final bzs c;
    public final String d;
    public final Boolean e;
    public final Boolean f;
    public final izs g;
    public final boolean h;
    public final String i;

    public jzs(mqs mqsVar, v80 v80Var, bzs bzsVar, String str, Boolean bool, Boolean bool2, izs izsVar, boolean z, String str2) {
        mqsVar.getClass();
        v80Var.getClass();
        this.a = mqsVar;
        this.b = v80Var;
        this.c = bzsVar;
        this.d = str;
        this.e = bool;
        this.f = bool2;
        this.g = izsVar;
        this.h = z;
        this.i = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [izs] */
    public static jzs d(jzs jzsVar, String str, e6v e6vVar, int i) {
        mqs mqsVar = jzsVar.a;
        v80 v80Var = jzsVar.b;
        bzs bzsVar = jzsVar.c;
        if ((i & 8) != 0) {
            str = jzsVar.d;
        }
        String str2 = str;
        Boolean bool = jzsVar.e;
        Boolean bool2 = jzsVar.f;
        e6v e6vVar2 = e6vVar;
        if ((i & 64) != 0) {
            e6vVar2 = jzsVar.g;
        }
        e6v e6vVar3 = e6vVar2;
        boolean z = jzsVar.h;
        String str3 = jzsVar.i;
        mqsVar.getClass();
        v80Var.getClass();
        e6vVar3.getClass();
        str3.getClass();
        return new jzs(mqsVar, v80Var, bzsVar, str2, bool, bool2, e6vVar3, z, str3);
    }

    @Override // defpackage.mwk
    public final mqs a() {
        return this.a;
    }

    @Override // defpackage.mwk
    public final String b() {
        return this.i;
    }

    @Override // defpackage.mwk
    public final v80 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzs)) {
            return false;
        }
        jzs jzsVar = (jzs) obj;
        mqs mqsVar = jzsVar.a;
        mqs mqsVar2 = this.a;
        if (Intrinsics.d(mqsVar2, mqsVar) && Intrinsics.d(mqsVar2.d, mqsVar.d) && Intrinsics.d(this.b, jzsVar.b)) {
            String str = jzsVar.i;
            AtomicInteger atomicInteger = rwk.b;
            if (Intrinsics.d(this.i, str) && Intrinsics.d(this.d, jzsVar.d) && Intrinsics.d(this.e, jzsVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        mqs mqsVar = this.a;
        return Objects.hash(mqsVar, mqsVar.d, this.b, new rwk(this.i), this.d, this.e);
    }

    public final String toString() {
        mqs mqsVar = this.a;
        String str = mqsVar.a;
        String str2 = mqsVar.c;
        String b = rwk.b(this.i);
        StringBuilder m = f1d.m("TrackPlayable(trackId=", str, ", trackTitle=", str2, ", analyticsValues=");
        m.append(this.b);
        m.append(", playableId=");
        m.append(b);
        m.append(", batchId=");
        return su4.o(m, this.d, ")");
    }

    public /* synthetic */ jzs(mqs mqsVar, v80 v80Var, bzs bzsVar, String str, Boolean bool, Boolean bool2, izs izsVar, boolean z) {
        this(mqsVar, v80Var, bzsVar, str, bool, bool2, izsVar, z, rwk.a());
    }
}
