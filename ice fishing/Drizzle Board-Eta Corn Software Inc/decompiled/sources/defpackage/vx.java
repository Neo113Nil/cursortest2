package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class vx extends bb0 implements fl {
    public /* synthetic */ List P7K7Inc8;
    public /* synthetic */ List Qr9iLBAD;
    public /* synthetic */ m70 b2ZJblxo;
    public final /* synthetic */ wx jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx(wx wxVar, g9 g9Var) {
        super(4, g9Var);
        this.jb9XjC4I = wxVar;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        List XrPeKzBk;
        boolean z;
        List list = this.P7K7Inc8;
        m70 m70Var = this.b2ZJblxo;
        List list2 = this.Qr9iLBAD;
        fn.SgZGMMPL(obj);
        String str = m70Var.qoPGr6Ce;
        Set set = m70Var.NCTxEWno;
        String lowerCase = ba0.SgZGMMPL(str).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            xx xxVar = (xx) next;
            if (lowerCase.length() != 0) {
                String lowerCase2 = xxVar.NCTxEWno.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (!ba0.I5GHvsYW(lowerCase2, lowerCase)) {
                    ArrayList arrayList2 = xxVar.ow5vqvCr;
                    if (!arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            String lowerCase3 = ((String) obj2).toLowerCase(Locale.ROOT);
                            lowerCase3.getClass();
                            if (ba0.I5GHvsYW(lowerCase3, lowerCase)) {
                            }
                        }
                    }
                    z = false;
                    if (!set.isEmpty() && !set.contains(xxVar.k3x7lurq)) {
                        z2 = false;
                    }
                    if (z && z2) {
                        arrayList.add(next);
                    }
                }
            }
            z = true;
            if (!set.isEmpty()) {
                z2 = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        int ordinal = m70Var.MdtA4re8.ordinal();
        int i2 = 2;
        if (ordinal == 0) {
            XrPeKzBk = x5.XrPeKzBk(arrayList, new sc(i2));
        } else if (ordinal == 1) {
            XrPeKzBk = x5.XrPeKzBk(arrayList, new sc(3));
        } else {
            if (ordinal != 2) {
                throw new d7();
            }
            XrPeKzBk = x5.XrPeKzBk(arrayList, new sc(4));
        }
        String str2 = m70Var.qoPGr6Ce;
        Set set2 = m70Var.NCTxEWno;
        a4 a4Var = m70Var.MdtA4re8;
        q3 q3Var = m70Var.wxUZMvaN;
        ArrayList arrayList3 = new ArrayList(z5.bvfAo0eO(XrPeKzBk, 10));
        Iterator it2 = XrPeKzBk.iterator();
        while (it2.hasNext()) {
            arrayList3.add(g50.OnDfzHZD((xx) it2.next()));
        }
        ArrayList arrayList4 = new ArrayList(z5.bvfAo0eO(XrPeKzBk, 10));
        Iterator it3 = XrPeKzBk.iterator();
        while (it3.hasNext()) {
            String upperCase = ba0.euDDoUNr(((xx) it3.next()).NCTxEWno).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            arrayList4.add(upperCase);
        }
        return new n70(str2, set2, a4Var, q3Var, arrayList3, x5.uQ3KJUK5(x5.B1cjorwa(x5.yzvmSy3z(arrayList4))), list2, m70Var.VgvYg0wo);
    }
}
