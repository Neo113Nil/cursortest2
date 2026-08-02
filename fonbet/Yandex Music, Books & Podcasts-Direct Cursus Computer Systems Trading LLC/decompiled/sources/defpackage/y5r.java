package defpackage;

/* loaded from: classes3.dex */
public final class y5r extends sij {
    public final /* synthetic */ int b;
    public final /* synthetic */ z5r c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y5r(z5r z5rVar, int i) {
        super(r2);
        this.b = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.c = z5rVar;
                super(bool);
                break;
            default:
                Float valueOf = Float.valueOf(1.0f);
                this.c = z5rVar;
                break;
        }
    }

    @Override // defpackage.sij
    public final void afterChange(s9f s9fVar, Object obj, Object obj2) {
        int i = this.b;
        s9fVar.getClass();
        switch (i) {
            case 0:
                float floatValue = ((Number) obj2).floatValue();
                ((Number) obj).floatValue();
                e6r e6rVar = this.c.h;
                if (e6rVar != null) {
                    e6rVar.d.setValue(e6rVar, e6r.g[0], Float.valueOf(floatValue));
                    break;
                }
                break;
            default:
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                ((Boolean) obj).getClass();
                e6r e6rVar2 = this.c.h;
                if (e6rVar2 != null) {
                    e6rVar2.f.setValue(e6rVar2, e6r.g[2], bool);
                    break;
                }
                break;
        }
    }
}
