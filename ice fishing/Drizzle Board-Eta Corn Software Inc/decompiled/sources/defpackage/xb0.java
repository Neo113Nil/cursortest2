package defpackage;

import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xb0 extends bb0 implements gl {
    public /* synthetic */ n2 P7K7Inc8;
    public /* synthetic */ List Qr9iLBAD;
    public /* synthetic */ List b2ZJblxo;
    public final /* synthetic */ yb0 eVhOlqcC;
    public /* synthetic */ List jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb0(yb0 yb0Var, eh ehVar) {
        super(5, ehVar);
        this.eVhOlqcC = yb0Var;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        n2 n2Var = this.P7K7Inc8;
        List list = this.b2ZJblxo;
        List list2 = this.Qr9iLBAD;
        List list3 = this.jb9XjC4I;
        fn.SgZGMMPL(obj);
        int i = n2Var.NCTxEWno;
        int i2 = 0;
        List N8VPGzVC = y5.N8VPGzVC(new u1(R.string.badge_first_drizzle, R.string.emoji_badge_first_drizzle, i >= 1), new u1(R.string.badge_shelf_walker, R.string.emoji_badge_shelf_walker, i >= 15), new u1(R.string.badge_side_by_side, R.string.emoji_badge_side_by_side, n2Var.wxUZMvaN >= 1), new u1(R.string.badge_sprint_starter, R.string.emoji_badge_sprint_starter, n2Var.VgvYg0wo >= 1), new u1(R.string.badge_taste_critic, R.string.emoji_badge_taste_critic, n2Var.MdtA4re8 >= 10));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list3) {
            if (((xx) obj2).amk52bBQ > 0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(z5.bvfAo0eO(arrayList, 10));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = arrayList.get(i3);
            i3++;
            arrayList2.add(((xx) obj3).P7K7Inc8);
        }
        int size2 = x5.B1cjorwa(x5.yzvmSy3z(arrayList2)).size();
        ArrayList arrayList3 = new ArrayList(z5.bvfAo0eO(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList3.add(((xx) it.next()).P7K7Inc8);
        }
        int size3 = x5.B1cjorwa(x5.yzvmSy3z(arrayList3)).size();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list3) {
            if (((xx) obj4).amk52bBQ > 0) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList(z5.bvfAo0eO(arrayList4, 10));
        int size4 = arrayList4.size();
        while (i2 < size4) {
            Object obj5 = arrayList4.get(i2);
            i2++;
            arrayList5.add(((xx) obj5).eVhOlqcC);
        }
        int size5 = x5.B1cjorwa(x5.yzvmSy3z(arrayList5)).size();
        ArrayList arrayList6 = new ArrayList(z5.bvfAo0eO(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList6.add(((xx) it2.next()).eVhOlqcC);
        }
        return new jo(N8VPGzVC, list, list2, size2, size3, size5, x5.B1cjorwa(x5.yzvmSy3z(arrayList6)).size());
    }

    @Override // defpackage.gl
    public final Object eVhOlqcC(Object obj, Object obj2, Object obj3, Object obj4, eh ehVar) {
        xb0 xb0Var = new xb0(this.eVhOlqcC, ehVar);
        xb0Var.P7K7Inc8 = (n2) obj;
        xb0Var.b2ZJblxo = (List) obj2;
        xb0Var.Qr9iLBAD = (List) obj3;
        xb0Var.jb9XjC4I = (List) obj4;
        return xb0Var.OxcuoDLp(xe0.qoPGr6Ce);
    }
}
