package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class wp2 implements rzm {
    public final /* synthetic */ int a = 0;
    public final szm b;
    public final szm c;
    public final szm d;
    public final toe e;

    public wp2(toe toeVar, toe toeVar2, rzm rzmVar, toe toeVar3) {
        this.b = toeVar;
        this.c = toeVar2;
        this.d = rzmVar;
        this.e = toeVar3;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                mnd mndVar = (mnd) this.b.get();
                boolean booleanValue = ((Boolean) this.c.get()).booleanValue();
                List list = (List) this.d.get();
                xfk xfkVar = (xfk) this.e.a;
                mndVar.getClass();
                list.getClass();
                xfkVar.getClass();
                ts5 ts5Var = new ts5();
                ArrayList arrayList = new ArrayList();
                ts5Var.b = arrayList;
                arrayList.add(new gp7(0, mndVar));
                arrayList.add(new gp7(1, wxf.R(xfkVar)));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    qfk N = wxf.N((zh3) it.next());
                    if (N != null) {
                        arrayList2.add(N);
                    }
                }
                ts5Var.b.add(new ts5(new ArrayList(arrayList2)));
                ts5Var.b.add(new v5b(booleanValue));
                return ts5Var;
            default:
                return new lnd((ind) this.b.get(), (gp2) this.c.get(), (pxf) this.d.get(), (dnd) this.e.a);
        }
    }

    public wp2(mvn mvnVar, rzm rzmVar, toe toeVar, toe toeVar2, toe toeVar3) {
        this.b = rzmVar;
        this.c = toeVar;
        this.d = toeVar2;
        this.e = toeVar3;
    }
}
