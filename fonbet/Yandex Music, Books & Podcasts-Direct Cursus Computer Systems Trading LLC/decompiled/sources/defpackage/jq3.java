package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public class jq3 implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public jq3(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(jq3 jq3Var) {
        String str = jq3Var.a;
        String str2 = this.a;
        if (!str2.equals(str)) {
            return str2.compareTo(jq3Var.a);
        }
        long j = this.b - jq3Var.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.b);
        sb.append(", ");
        return hrg.m(this.c, "]", sb);
    }
}
