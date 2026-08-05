package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class i40 extends h9 implements yg {
    public final l9 P7K7Inc8;
    public l9 Qr9iLBAD;
    public final yg VgvYg0wo;
    public final int b2ZJblxo;
    public g9 jb9XjC4I;

    public i40(yg ygVar, l9 l9Var) {
        super(b7.wxUZMvaN, uf.NCTxEWno);
        this.VgvYg0wo = ygVar;
        this.P7K7Inc8 = l9Var;
        this.b2ZJblxo = ((Number) l9Var.Qr9iLBAD(0, new l6(6))).intValue();
    }

    public final Object KlHjfFWx(g9 g9Var, Object obj) {
        Comparable comparable;
        String str;
        l9 wxUZMvaN = g9Var.wxUZMvaN();
        le0.lDXGDhIF(wxUZMvaN);
        l9 l9Var = this.Qr9iLBAD;
        if (l9Var != wxUZMvaN) {
            int i = 1;
            int i2 = 0;
            if (l9Var instanceof rd) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((rd) l9Var).MdtA4re8 + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                List DK9slbsy = ba0.DK9slbsy(str2);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : DK9slbsy) {
                    if (!ba0.WYNAV5pd((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(z5.bvfAo0eO(arrayList, 10));
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj3 = arrayList.get(i3);
                    i3++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i4 = -1;
                            break;
                        }
                        if (!le0.U0LaHZX7(str3.charAt(i4))) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 == -1) {
                        i4 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i4));
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                DK9slbsy.size();
                int size2 = DK9slbsy.size() - 1;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : DK9slbsy) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        y5.ZyZthT5G();
                        throw null;
                    }
                    String str4 = (String) obj4;
                    if ((i2 == 0 || i2 == size2) && ba0.WYNAV5pd(str4)) {
                        str = null;
                    } else {
                        str4.getClass();
                        if (intValue < 0) {
                            m1.Qr9iLBAD("Requested character count ", intValue, " is less than zero.");
                            return null;
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                    }
                    if (str != null) {
                        arrayList3.add(str);
                    }
                    i2 = i5;
                }
                StringBuilder sb = new StringBuilder(length2);
                x5.pP9Y2m6O(arrayList3, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) wxUZMvaN.Qr9iLBAD(0, new kx(i, this))).intValue() != this.b2ZJblxo) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.P7K7Inc8 + ",\n\t\tbut emission happened in " + wxUZMvaN + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.Qr9iLBAD = wxUZMvaN;
        }
        this.jb9XjC4I = g9Var;
        el elVar = k40.qoPGr6Ce;
        yg ygVar = this.VgvYg0wo;
        ygVar.getClass();
        Object b2ZJblxo = elVar.b2ZJblxo(ygVar, obj, this);
        if (!fn.qoPGr6Ce(b2ZJblxo, u9.NCTxEWno)) {
            this.jb9XjC4I = null;
        }
        return b2ZJblxo;
    }

    @Override // defpackage.h9, defpackage.v9
    public final v9 MdtA4re8() {
        g9 g9Var = this.jb9XjC4I;
        if (g9Var instanceof v9) {
            return (v9) g9Var;
        }
        return null;
    }

    @Override // defpackage.yg
    public final Object OnDfzHZD(Object obj, g9 g9Var) {
        try {
            Object KlHjfFWx = KlHjfFWx(g9Var, obj);
            return KlHjfFWx == u9.NCTxEWno ? KlHjfFWx : xe0.qoPGr6Ce;
        } catch (Throwable th) {
            this.Qr9iLBAD = new rd(g9Var.wxUZMvaN(), th);
            throw th;
        }
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        Throwable qoPGr6Ce = l30.qoPGr6Ce(obj);
        if (qoPGr6Ce != null) {
            this.Qr9iLBAD = new rd(wxUZMvaN(), qoPGr6Ce);
        }
        g9 g9Var = this.jb9XjC4I;
        if (g9Var != null) {
            g9Var.P7K7Inc8(obj);
        }
        return u9.NCTxEWno;
    }

    @Override // defpackage.h9
    public final StackTraceElement sjUBp5pO() {
        return null;
    }

    @Override // defpackage.h9, defpackage.g9
    public final l9 wxUZMvaN() {
        l9 l9Var = this.Qr9iLBAD;
        return l9Var == null ? uf.NCTxEWno : l9Var;
    }
}
