package defpackage;

/* loaded from: classes9.dex */
public final class vbs0 implements m9s {
    public final tls a;

    public vbs0(int i, int i2, tls tlsVar) {
        switch (i2) {
            case 3:
                this.a = tlsVar;
                if (i < 0) {
                    w511.f(oyr.j(i, "The minimum number of digits (", ") is negative"));
                    throw null;
                }
                if (i <= 9) {
                    return;
                }
                w511.f(oyr.j(i, "The minimum number of digits (", ") exceeds the length of an Int"));
                throw null;
            default:
                this.a = tlsVar;
                if (i < 0) {
                    w511.f(oyr.j(i, "The minimum number of digits (", ") is negative"));
                    throw null;
                }
                if (i <= 9) {
                    return;
                }
                w511.f(oyr.j(i, "The minimum number of digits (", ") exceeds the length of an Int"));
                throw null;
        }
    }

    public /* synthetic */ vbs0(tls tlsVar) {
        this.a = tlsVar;
    }
}
