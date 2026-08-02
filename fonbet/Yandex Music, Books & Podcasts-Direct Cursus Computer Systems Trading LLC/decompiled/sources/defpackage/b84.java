package defpackage;

import android.content.Context;
import androidx.fragment.app.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class b84 {
    public static final /* synthetic */ s9f[] h;
    public final t a;
    public final l74 b;
    public final a84 c;
    public final a84 d;
    public final a84 e;
    public final xdr f;
    public final sai g;

    static {
        opi opiVar = new opi(b84.class, "items", "getItems()Ljava/util/List;", 0);
        ern.a.getClass();
        h = new s9f[]{opiVar, new opi(b84.class, "selection", "getSelection()Lru/yandex/music/cast/picker/api/data/CastSelection;", 0), new opi(b84.class, "explanation", "getExplanation()Lru/yandex/music/cast/picker/api/data/CastExplanation;", 0)};
    }

    public b84(t tVar, l74 l74Var, List list, m84 m84Var, z64 z64Var) {
        list.getClass();
        m84Var.getClass();
        this.a = tVar;
        this.b = l74Var;
        this.c = new a84(list, this, 0);
        this.d = new a84(m84Var, this, 1);
        this.e = new a84(z64Var, this, 2);
        this.f = ydr.a(new c84(c5b.a, null, false, false));
        this.g = new sai(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
    
        r19 = r7;
        r5 = defpackage.l18.b;
        r7 = defpackage.hag.I(defpackage.byb.class);
        r5 = r5.a;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0102, code lost:
    
        if (((defpackage.ydq) ((defpackage.byb) r5.C(r7)).c(defpackage.ern.a(defpackage.ydq.class))).h() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0104, code lost:
    
        r5 = (java.util.List) r20.c.getValue(r20, defpackage.b84.h[r19 ? 1 : 0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
    
        if ((r5 instanceof java.util.Collection) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011d, code lost:
    
        if (r5.isEmpty() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0120, code lost:
    
        r5 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
    
        if (r5.hasNext() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0132, code lost:
    
        if ((((defpackage.x74) r5.next()) instanceof defpackage.t74) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0134, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0138, code lost:
    
        r5 = (defpackage.z64) r20.e.getValue(r20, defpackage.b84.h[2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0144, code lost:
    
        if (r5 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0146, code lost:
    
        r10 = new defpackage.vyb(r5.a, r5.b, r5.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0153, code lost:
    
        r5 = defpackage.lxe.l() instanceof defpackage.c0b;
        r4.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0152, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0136, code lost:
    
        r7 = r19 ? 1 : 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(b84 b84Var) {
        Object value;
        ArrayList arrayList;
        boolean z;
        vyb vybVar;
        boolean z2;
        String b;
        o84 o84Var;
        t tVar = b84Var.a;
        xdr xdrVar = b84Var.f;
        do {
            value = xdrVar.getValue();
            c84 c84Var = (c84) value;
            boolean z3 = false;
            List list = (List) b84Var.c.getValue(b84Var, h[0]);
            arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (true) {
                boolean z4 = true;
                if (!it.hasNext()) {
                    break;
                }
                x74 x74Var = (x74) it.next();
                Context baseContext = tVar.getBaseContext();
                baseContext.getClass();
                n84 c = ((m84) b84Var.d.getValue(b84Var, h[1])).c(x74Var);
                c.getClass();
                String a = x74Var.a();
                boolean z5 = z3;
                a18 a18Var = new a18(x74Var.b);
                Integer c2 = x74Var.c();
                if (c2 == null || (b = baseContext.getString(c2.intValue())) == null) {
                    b = x74Var.b();
                }
                if (b == null) {
                    b = "";
                }
                String str = b;
                boolean z6 = x74Var instanceof r74;
                if (!z6 && !x74Var.equals(s74.c) && !(x74Var instanceof t74) && !(x74Var instanceof w74)) {
                    b6e.s();
                    return;
                }
                int ordinal = c.ordinal();
                if (ordinal == 0) {
                    o84Var = o84.a;
                } else if (ordinal == 1) {
                    o84Var = o84.c;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return;
                    }
                    o84Var = o84.b;
                }
                o84 o84Var2 = o84Var;
                if (x74Var instanceof w74) {
                    z4 = ((w74) x74Var).f;
                } else if (x74Var instanceof t74) {
                    z4 = ((t74) x74Var).e.a;
                } else if (!z6 && !x74Var.equals(s74.c)) {
                    b6e.s();
                    return;
                }
                arrayList.add(new b18(a, a18Var, str, o84Var2, z4));
                z3 = z5;
            }
        } while (!xdrVar.k(value, new c84(arrayList, vybVar, z, z2)));
    }
}
