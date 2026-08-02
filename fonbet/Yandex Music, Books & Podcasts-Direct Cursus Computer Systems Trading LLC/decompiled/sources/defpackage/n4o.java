package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class n4o implements u4o {

    @NotNull
    public static final m4o Companion = new m4o();
    public static final arf[] e;
    public final String a;
    public final f4o b;
    public final String c;
    public final upi d;

    static {
        bwf bwfVar = bwf.b;
        e = new arf[]{null, btf.a(bwfVar, new trn(23)), null, btf.a(bwfVar, new trn(24))};
    }

    public /* synthetic */ n4o(int i, String str, f4o f4oVar, String str2, upi upiVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f4oVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = upiVar;
        }
    }

    @Override // defpackage.u4o
    public final upi a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4o)) {
            return false;
        }
        n4o n4oVar = (n4o) obj;
        return Intrinsics.d(this.a, n4oVar.a) && Intrinsics.d(this.b, n4oVar.b) && Intrinsics.d(this.c, n4oVar.c) && Intrinsics.d(this.d, n4oVar.d);
    }

    @Override // defpackage.u4o
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.u4o
    public final String getTitle() {
        return this.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        f4o f4oVar = this.b;
        int hashCode2 = (hashCode + (f4oVar == null ? 0 : f4oVar.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        upi upiVar = this.d;
        return hashCode3 + (upiVar != null ? upiVar.hashCode() : 0);
    }

    @Override // defpackage.u4o
    public final f4o q() {
        return this.b;
    }

    public final String toString() {
        return "Gift(id=" + this.a + ", action=" + this.b + ", title=" + this.c + ", metricContext=" + this.d + ')';
    }
}
