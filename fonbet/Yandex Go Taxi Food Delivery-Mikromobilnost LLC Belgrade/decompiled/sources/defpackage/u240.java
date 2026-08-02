package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class u240 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;

    public /* synthetic */ u240(Object obj, boolean z, boolean z2, int i, int i2) {
        this.a = i2;
        this.w = obj;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                zob1.c((f530) obj3, z2, z, (fid) obj, vng.O(7));
                break;
            case 1:
                ((Integer) obj2).getClass();
                vpb1.h((CharSequence) obj3, z2, z, (fid) obj, vng.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                si91.b((String) obj3, z2, z, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
