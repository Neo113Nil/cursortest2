package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class g50 {
    public static final long MdtA4re8() {
        return Thread.currentThread().getId();
    }

    public static h50 NCTxEWno(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            h50 h50Var = new h50();
            new LinkedHashMap();
            h50Var.qoPGr6Ce = new kn(xf.NCTxEWno);
            return h50Var;
        }
        ClassLoader classLoader = h50.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        wq wqVar = new wq(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            wqVar.put(str, bundle.get(str));
        }
        wq NCTxEWno = wqVar.NCTxEWno();
        h50 h50Var2 = new h50();
        new LinkedHashMap();
        h50Var2.qoPGr6Ce = new kn(NCTxEWno);
        return h50Var2;
    }

    public static final py OnDfzHZD(xx xxVar) {
        xxVar.getClass();
        return new py(xxVar.qoPGr6Ce, xxVar.NCTxEWno, xxVar.MdtA4re8, xxVar.P7K7Inc8, xxVar.b2ZJblxo, xxVar.jb9XjC4I, xxVar.eVhOlqcC, xxVar.k3x7lurq);
    }

    public static final int P7K7Inc8(kb0 kb0Var) {
        kb0Var.getClass();
        int ordinal = kb0Var.ordinal();
        if (ordinal == 0) {
            return R.string.mood_calm;
        }
        if (ordinal == 1) {
            return R.string.mood_bold;
        }
        if (ordinal == 2) {
            return R.string.mood_fresh;
        }
        if (ordinal == 3) {
            return R.string.mood_cozy;
        }
        if (ordinal == 4) {
            return R.string.mood_intense;
        }
        throw new d7();
    }

    public static final List Qr9iLBAD(h40 h40Var) {
        int jb9XjC4I = ej0.jb9XjC4I(h40Var, "id");
        int jb9XjC4I2 = ej0.jb9XjC4I(h40Var, "seq");
        int jb9XjC4I3 = ej0.jb9XjC4I(h40Var, "from");
        int jb9XjC4I4 = ej0.jb9XjC4I(h40Var, "to");
        mp mpVar = new mp(10);
        while (h40Var.amk52bBQ()) {
            mpVar.add(new fi((int) h40Var.getLong(jb9XjC4I), (int) h40Var.getLong(jb9XjC4I2), h40Var.wxUZMvaN(jb9XjC4I3), h40Var.wxUZMvaN(jb9XjC4I4)));
        }
        return x5.uQ3KJUK5(ra.P7K7Inc8(mpVar));
    }

    public static final String VgvYg0wo(Context context, long j) {
        long j2 = j / 1000;
        String string = context.getString(R.string.value_time, Long.valueOf(j2 / 60), Long.valueOf(j2 % 60));
        string.getClass();
        return string;
    }

    public static PorterDuff.Mode b2ZJblxo(int i) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i != 5) {
            if (i == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
            }
        }
        return mode;
    }

    public static final long eVhOlqcC(String str, long j, long j2, long j3) {
        String str2;
        int i = eb0.qoPGr6Ce;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long amk52bBQ = ia0.amk52bBQ(str2);
        if (amk52bBQ == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = amk52bBQ.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static final ib0 jb9XjC4I(f40 f40Var, String str, boolean z) {
        h40 Ey6iv0m0 = f40Var.Ey6iv0m0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int jb9XjC4I = ej0.jb9XjC4I(Ey6iv0m0, "seqno");
            int jb9XjC4I2 = ej0.jb9XjC4I(Ey6iv0m0, "cid");
            int jb9XjC4I3 = ej0.jb9XjC4I(Ey6iv0m0, "name");
            int jb9XjC4I4 = ej0.jb9XjC4I(Ey6iv0m0, "desc");
            if (jb9XjC4I != -1 && jb9XjC4I2 != -1 && jb9XjC4I3 != -1 && jb9XjC4I4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (Ey6iv0m0.amk52bBQ()) {
                    if (((int) Ey6iv0m0.getLong(jb9XjC4I2)) >= 0) {
                        int i = (int) Ey6iv0m0.getLong(jb9XjC4I);
                        String wxUZMvaN = Ey6iv0m0.wxUZMvaN(jb9XjC4I3);
                        String str2 = Ey6iv0m0.getLong(jb9XjC4I4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), wxUZMvaN);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List XrPeKzBk = x5.XrPeKzBk(linkedHashMap.entrySet(), new sc(8));
                ArrayList arrayList = new ArrayList(z5.bvfAo0eO(XrPeKzBk, 10));
                Iterator it = XrPeKzBk.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List B1cjorwa = x5.B1cjorwa(arrayList);
                List XrPeKzBk2 = x5.XrPeKzBk(linkedHashMap2.entrySet(), new sc(9));
                ArrayList arrayList2 = new ArrayList(z5.bvfAo0eO(XrPeKzBk2, 10));
                Iterator it2 = XrPeKzBk2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                ib0 ib0Var = new ib0(str, z, B1cjorwa, x5.B1cjorwa(arrayList2));
                le0.eVhOlqcC(Ey6iv0m0, null);
                return ib0Var;
            }
            le0.eVhOlqcC(Ey6iv0m0, null);
            return null;
        } finally {
        }
    }

    public static int k3x7lurq(String str, int i, int i2) {
        return (int) eVhOlqcC(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final int lDXGDhIF(i90 i90Var) {
        i90Var.getClass();
        int ordinal = i90Var.ordinal();
        if (ordinal == 0) {
            return R.string.trait_prep_time;
        }
        if (ordinal == 1) {
            return R.string.trait_intensity;
        }
        if (ordinal == 2) {
            return R.string.trait_step_count;
        }
        throw new d7();
    }

    public static final w80 ow5vqvCr(z80 z80Var) {
        long j = z80Var.qoPGr6Ce;
        String str = z80Var.NCTxEWno;
        i90.MdtA4re8.getClass();
        i90 qoPGr6Ce = k00.qoPGr6Ce(str);
        long j2 = z80Var.MdtA4re8;
        int i = z80Var.wxUZMvaN;
        long j3 = z80Var.VgvYg0wo;
        List U0LaHZX7 = ba0.U0LaHZX7(z80Var.P7K7Inc8, new String[]{","});
        ArrayList arrayList = new ArrayList();
        Iterator it = U0LaHZX7.iterator();
        while (it.hasNext()) {
            Long amk52bBQ = ia0.amk52bBQ((String) it.next());
            if (amk52bBQ != null) {
                arrayList.add(amk52bBQ);
            }
        }
        List U0LaHZX72 = ba0.U0LaHZX7(z80Var.b2ZJblxo, new String[]{","});
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = U0LaHZX72.iterator();
        while (it2.hasNext()) {
            Long amk52bBQ2 = ia0.amk52bBQ((String) it2.next());
            if (amk52bBQ2 != null) {
                arrayList2.add(amk52bBQ2);
            }
        }
        return new w80(j, qoPGr6Ce, j2, i, j3, arrayList, arrayList2);
    }

    public static o60 qoPGr6Ce(o60 o60Var) {
        wq wqVar = o60Var.NCTxEWno;
        wqVar.NCTxEWno();
        return wqVar.eVhOlqcC > 0 ? o60Var : o60.MdtA4re8;
    }

    public static final Object wxUZMvaN(rz rzVar, String str, h9 h9Var) {
        Object wxUZMvaN = rzVar.wxUZMvaN(str, new x80(4), h9Var);
        return wxUZMvaN == u9.NCTxEWno ? wxUZMvaN : xe0.qoPGr6Ce;
    }

    public static final q6 ygLcUYwZ(xx xxVar) {
        xxVar.getClass();
        return new q6(xxVar.MdtA4re8, xxVar.NCTxEWno, xxVar.P7K7Inc8, xxVar.b2ZJblxo, xxVar.jb9XjC4I, xxVar.eVhOlqcC);
    }
}
