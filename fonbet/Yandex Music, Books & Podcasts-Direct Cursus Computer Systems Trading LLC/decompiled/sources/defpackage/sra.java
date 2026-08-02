package defpackage;

/* loaded from: classes.dex */
public final class sra extends szg {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sra(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.szg
    public final Object a(gzg gzgVar) {
        switch (this.c) {
            case 0:
                Float f = (Float) ((szg) this.d).a(gzgVar);
                if (f == null) {
                    return null;
                }
                return Float.valueOf(f.floatValue() * 2.55f);
            default:
                return ((ybg) this.d).invoke(gzgVar);
        }
    }
}
