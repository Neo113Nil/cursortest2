package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xtj {
    public static final xtj d = new xtj(0);
    public final a a;
    public final Float b;
    public final a c;

    public xtj(a aVar, Float f, a aVar2) {
        this.a = aVar;
        this.b = f;
        this.c = aVar2;
    }

    public static xtj a(xtj xtjVar, a aVar, Float f, a aVar2, int i) {
        if ((i & 1) != 0) {
            aVar = xtjVar.a;
        }
        if ((i & 2) != 0) {
            f = xtjVar.b;
        }
        if ((i & 4) != 0) {
            aVar2 = xtjVar.c;
        }
        xtjVar.getClass();
        return new xtj(aVar, f, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtj)) {
            return false;
        }
        xtj xtjVar = (xtj) obj;
        return jl40.l(this.a, xtjVar.a) && jl40.l(this.b, xtjVar.b) && jl40.l(this.c, xtjVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        return this.c.hashCode() + ((hashCode + (f == null ? 0 : f.hashCode())) * 31);
    }

    public final String toString() {
        return "DiscoveryMapVisibleBboxConfig(safetyInsets=" + this.a + ", maxZoom=" + this.b + ", uiInsets=" + this.c + Extension.C_BRAKE;
    }

    public xtj() {
        this(0);
    }

    public static final class a {
        public static final a e = new a(0);
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            return ly3.q(oo31.k("Insets(top=", this.a, ", bottom=", this.b, ", left="), this.c, ", right=", this.d, Extension.C_BRAKE);
        }

        public a() {
            this(0);
        }

        public /* synthetic */ a(int i) {
            this(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xtj(int i) {
        this(r0, null, r0);
        a aVar = a.e;
    }
}
