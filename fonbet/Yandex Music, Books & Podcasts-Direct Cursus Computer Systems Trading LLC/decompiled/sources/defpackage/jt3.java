package defpackage;

/* loaded from: classes.dex */
public final class jt3 implements voc {
    public static final jt3 a = new jt3();
    public static Boolean b;

    @Override // defpackage.voc
    public final void b(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // defpackage.voc
    public final boolean d() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw ouj.f("canFocus is read before it is written");
    }
}
