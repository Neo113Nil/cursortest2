package defpackage;

/* loaded from: classes3.dex */
public abstract class sc3 extends tst {
    public sc3(String str, boolean z, boolean z2, boolean z3) {
        super(str, Boolean.valueOf(z), z2, z3);
    }

    @Override // defpackage.tst
    public final String a(Boolean bool) {
        return String.valueOf(bool.booleanValue());
    }

    @Override // defpackage.tst
    public final Object b(String str) {
        return hag.B(str);
    }
}
