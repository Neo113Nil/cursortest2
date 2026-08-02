package defpackage;

/* loaded from: classes3.dex */
public final class d6r extends sij {
    public final /* synthetic */ int b;
    public final /* synthetic */ e6r c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d6r(e6r e6rVar, int i) {
        super(r2);
        this.b = i;
        switch (i) {
            case 1:
                this.c = e6rVar;
                super(null);
                break;
            case 2:
                Boolean bool = Boolean.FALSE;
                this.c = e6rVar;
                super(bool);
                break;
            default:
                Float valueOf = Float.valueOf(1.0f);
                this.c = e6rVar;
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
                e6r e6rVar = this.c;
                e6rVar.b.setAlpha(floatValue);
                e6rVar.a.getView().setAlpha(floatValue);
                break;
            case 1:
                this.c.a.m11setLogoColorY2TPw74((d85) obj2);
                break;
            default:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                this.c.a.setCollapsedMode(booleanValue);
                break;
        }
    }
}
