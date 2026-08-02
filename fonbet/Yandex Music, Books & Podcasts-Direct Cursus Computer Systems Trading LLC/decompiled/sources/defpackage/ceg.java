package defpackage;

import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public abstract class ceg implements kqa {
    public static final wu1 c = new wu1("internal:health-checking-config");
    public static final wvo d = new wvo(26);
    public static final wu1 e = new wu1("internal:has-health-check-producer-listener");
    public static final wu1 f = new wu1("io.grpc.IS_PETIOLE_POLICY");
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ ceg(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public static String d(int i) {
        return "" + ((char) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) (i & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public sgr a(ydg ydgVar) {
        List list = ydgVar.a;
        if (!list.isEmpty() || c()) {
            int i = this.b;
            this.b = i + 1;
            if (i == 0) {
                r(ydgVar);
            }
            this.b = 0;
            return sgr.e;
        }
        sgr i2 = sgr.o.i("NameResolver returned no usable address. addrs=" + list + ", attrs=" + ydgVar.b);
        p(i2);
        return i2;
    }

    public void b(int i) {
        this.b = i | this.b;
    }

    public boolean c() {
        return false;
    }

    public boolean f(int i) {
        return (this.b & i) == i;
    }

    public abstract int h();

    public abstract int i();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public int n() {
        if (this instanceof m96) {
            return 1;
        }
        if (this instanceof n96) {
            return 2;
        }
        if (this instanceof p96) {
            return 3;
        }
        if (this instanceof k96) {
            return 4;
        }
        if (this instanceof j96) {
            return 5;
        }
        if (this instanceof o96) {
            return 6;
        }
        if (this instanceof l96) {
            return 7;
        }
        b6e.s();
        return 0;
    }

    public abstract void p(sgr sgrVar);

    public void r(ydg ydgVar) {
        int i = this.b;
        this.b = i + 1;
        if (i == 0) {
            a(ydgVar);
        }
        this.b = 0;
    }

    public abstract int s(int i);

    public String toString() {
        switch (this.a) {
            case 4:
                return d(this.b);
            default:
                return super.toString();
        }
    }

    public abstract int v(int i);

    public abstract int w(int i);

    public abstract void y();

    public /* synthetic */ ceg(int i) {
        this.a = i;
    }

    public void x() {
    }

    public void t(oqj oqjVar) {
    }

    public void u(oqj oqjVar) {
    }
}
