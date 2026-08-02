package defpackage;

/* loaded from: classes6.dex */
public final class hc5 extends ou2 {
    public final euo g = euo.H;
    public final jyr h = btf.b(new r25(5, this));

    @Override // defpackage.ypt
    public final cqt T() {
        return (cqt) this.h.getValue();
    }

    public final m94 b() {
        String a = a(1);
        if (a != null) {
            int hashCode = a.hashCode();
            if (hashCode != -839344347) {
                if (hashCode == 3291757 && a.equals("kids")) {
                    return m94.KIDS;
                }
            } else if (a.equals("non-music")) {
                return m94.NON_MUSIC;
            }
        }
        ssg.a(7, null, "Invalid url scheme for catalog category.", null);
        return m94.NON_MUSIC;
    }

    @Override // defpackage.ypt
    public final euo getType() {
        return this.g;
    }
}
