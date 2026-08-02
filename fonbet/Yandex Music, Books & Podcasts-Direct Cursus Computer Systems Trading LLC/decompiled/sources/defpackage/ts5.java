package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class ts5 implements vfk {
    public final /* synthetic */ int a = 1;
    public ArrayList b;

    public ts5(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // defpackage.vfk
    public final mif a(bg2 bg2Var) {
        int i = this.a;
        bg2Var.getClass();
        switch (i) {
            case 0:
                ArrayList A = u1g.A(u1g.A(new ArrayList(), bg2Var.a), this.b);
                cg2 d = bg2Var.d();
                d.a = A;
                return nif.d(d.a());
            default:
                return b(this.b, bg2Var);
        }
    }

    public s8 b(ArrayList arrayList, bg2 bg2Var) {
        if (arrayList.size() == 0) {
            return nif.d(bg2Var);
        }
        mif a = ((vfk) arrayList.get(0)).a(bg2Var);
        afg afgVar = new afg(15, this, arrayList);
        a.getClass();
        return mif.a(a, afgVar, null, 5);
    }

    public /* synthetic */ ts5() {
    }
}
