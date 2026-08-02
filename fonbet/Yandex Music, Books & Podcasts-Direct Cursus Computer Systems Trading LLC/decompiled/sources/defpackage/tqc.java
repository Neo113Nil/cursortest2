package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tqc implements Comparable {
    public static final tqc b;
    public static final tqc c;
    public static final tqc d;
    public static final tqc e;
    public static final tqc f;
    public static final tqc g;
    public static final tqc h;
    public static final tqc i;
    public static final tqc j;
    public static final tqc k;
    public static final tqc l;
    public static final tqc m;
    public static final tqc n;
    public static final tqc o;
    public static final tqc p;
    public static final tqc q;
    public final int a;

    static {
        tqc tqcVar = new tqc(100);
        b = tqcVar;
        tqc tqcVar2 = new tqc(200);
        c = tqcVar2;
        tqc tqcVar3 = new tqc(300);
        d = tqcVar3;
        tqc tqcVar4 = new tqc(400);
        e = tqcVar4;
        tqc tqcVar5 = new tqc(500);
        f = tqcVar5;
        tqc tqcVar6 = new tqc(600);
        g = tqcVar6;
        tqc tqcVar7 = new tqc(700);
        h = tqcVar7;
        tqc tqcVar8 = new tqc(800);
        i = tqcVar8;
        tqc tqcVar9 = new tqc(900);
        j = tqcVar9;
        k = tqcVar;
        l = tqcVar3;
        m = tqcVar4;
        n = tqcVar5;
        o = tqcVar6;
        p = tqcVar7;
        q = tqcVar9;
        u75.h(tqcVar, tqcVar2, tqcVar3, tqcVar4, tqcVar5, tqcVar6, tqcVar7, tqcVar8, tqcVar9);
    }

    public tqc(int i2) {
        this.a = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        tme.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(tqc tqcVar) {
        return Intrinsics.e(this.a, tqcVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tqc) {
            return this.a == ((tqc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return vz1.r(new StringBuilder("FontWeight(weight="), this.a, ')');
    }
}
