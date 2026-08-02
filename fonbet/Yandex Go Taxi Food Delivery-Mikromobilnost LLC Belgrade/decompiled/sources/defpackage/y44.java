package defpackage;

import defpackage.c3f;

/* loaded from: classes11.dex */
public final class y44 extends c3f.e.d.a.b.AbstractC0014a.AbstractC0015a {
    public long a;
    public long b;
    public String c;
    public String d;
    public byte e;

    public final z44 a() {
        String str;
        if (this.e == 3 && (str = this.c) != null) {
            return new z44(this.a, str, this.b, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((this.e & 2) == 0) {
            sb.append(" size");
        }
        if (this.c == null) {
            sb.append(" name");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final y44 b(long j) {
        this.a = j;
        this.e = (byte) (this.e | 1);
        return this;
    }

    public final y44 c(String str) {
        if (str != null) {
            this.c = str;
            return this;
        }
        ny61.t("Null name");
        return null;
    }

    public final y44 d(long j) {
        this.b = j;
        this.e = (byte) (this.e | 2);
        return this;
    }

    public final y44 e(String str) {
        this.d = str;
        return this;
    }
}
