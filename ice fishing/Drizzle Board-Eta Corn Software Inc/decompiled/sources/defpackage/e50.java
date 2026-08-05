package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class e50 {
    public static boolean MdtA4re8 = true;
    public static final /* synthetic */ int NCTxEWno = 0;
    public static final /* synthetic */ int qoPGr6Ce = 0;

    public e50() {
        new ConcurrentHashMap();
    }

    public static final boolean MdtA4re8(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !fn.qoPGr6Ce(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!MdtA4re8((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!a1.g2aRJUAd((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static void NCTxEWno(z2 z2Var) {
        z2Var.wxUZMvaN(null, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e0, code lost:
    
        r0 = defpackage.g50.qoPGr6Ce(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e4, code lost:
    
        defpackage.le0.eVhOlqcC(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jb0 OnDfzHZD(f40 f40Var, String str) {
        long j;
        Map NCTxEWno2;
        o60 o60Var;
        f40Var.getClass();
        h40 Ey6iv0m0 = f40Var.Ey6iv0m0("PRAGMA table_info(`" + str + "`)");
        try {
            long j2 = 0;
            if (Ey6iv0m0.amk52bBQ()) {
                int jb9XjC4I = ej0.jb9XjC4I(Ey6iv0m0, "name");
                int jb9XjC4I2 = ej0.jb9XjC4I(Ey6iv0m0, "type");
                int jb9XjC4I3 = ej0.jb9XjC4I(Ey6iv0m0, "notnull");
                int jb9XjC4I4 = ej0.jb9XjC4I(Ey6iv0m0, "pk");
                int jb9XjC4I5 = ej0.jb9XjC4I(Ey6iv0m0, "dflt_value");
                wq wqVar = new wq();
                while (true) {
                    String wxUZMvaN = Ey6iv0m0.wxUZMvaN(jb9XjC4I);
                    j = j2;
                    wqVar.put(wxUZMvaN, new gb0(wxUZMvaN, Ey6iv0m0.wxUZMvaN(jb9XjC4I2), Ey6iv0m0.getLong(jb9XjC4I3) != j2, (int) Ey6iv0m0.getLong(jb9XjC4I4), Ey6iv0m0.isNull(jb9XjC4I5) ? null : Ey6iv0m0.wxUZMvaN(jb9XjC4I5), 2));
                    if (!Ey6iv0m0.amk52bBQ()) {
                        break;
                    }
                    j2 = j;
                }
                NCTxEWno2 = wqVar.NCTxEWno();
                le0.eVhOlqcC(Ey6iv0m0, null);
            } else {
                NCTxEWno2 = xf.NCTxEWno;
                le0.eVhOlqcC(Ey6iv0m0, null);
                j = 0;
            }
            Ey6iv0m0 = f40Var.Ey6iv0m0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int jb9XjC4I6 = ej0.jb9XjC4I(Ey6iv0m0, "id");
                int jb9XjC4I7 = ej0.jb9XjC4I(Ey6iv0m0, "seq");
                int jb9XjC4I8 = ej0.jb9XjC4I(Ey6iv0m0, "table");
                int jb9XjC4I9 = ej0.jb9XjC4I(Ey6iv0m0, "on_delete");
                int jb9XjC4I10 = ej0.jb9XjC4I(Ey6iv0m0, "on_update");
                List Qr9iLBAD = g50.Qr9iLBAD(Ey6iv0m0);
                Ey6iv0m0.I5GHvsYW();
                o60 o60Var2 = new o60();
                while (Ey6iv0m0.amk52bBQ()) {
                    if (Ey6iv0m0.getLong(jb9XjC4I7) == j) {
                        int i = (int) Ey6iv0m0.getLong(jb9XjC4I6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = jb9XjC4I6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : Qr9iLBAD) {
                            int i3 = jb9XjC4I7;
                            List list = Qr9iLBAD;
                            if (((fi) obj).NCTxEWno == i) {
                                arrayList3.add(obj);
                            }
                            jb9XjC4I7 = i3;
                            Qr9iLBAD = list;
                        }
                        int i4 = jb9XjC4I7;
                        List list2 = Qr9iLBAD;
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj2 = arrayList3.get(i5);
                            i5++;
                            fi fiVar = (fi) obj2;
                            arrayList.add(fiVar.wxUZMvaN);
                            arrayList2.add(fiVar.VgvYg0wo);
                            arrayList3 = arrayList3;
                        }
                        o60Var2.add(new hb0(Ey6iv0m0.wxUZMvaN(jb9XjC4I8), Ey6iv0m0.wxUZMvaN(jb9XjC4I9), Ey6iv0m0.wxUZMvaN(jb9XjC4I10), arrayList, arrayList2));
                        jb9XjC4I6 = i2;
                        jb9XjC4I7 = i4;
                        Qr9iLBAD = list2;
                    }
                }
                o60 qoPGr6Ce2 = g50.qoPGr6Ce(o60Var2);
                le0.eVhOlqcC(Ey6iv0m0, null);
                Ey6iv0m0 = f40Var.Ey6iv0m0("PRAGMA index_list(`" + str + "`)");
                try {
                    int jb9XjC4I11 = ej0.jb9XjC4I(Ey6iv0m0, "name");
                    int jb9XjC4I12 = ej0.jb9XjC4I(Ey6iv0m0, "origin");
                    int jb9XjC4I13 = ej0.jb9XjC4I(Ey6iv0m0, "unique");
                    if (jb9XjC4I11 == -1 || jb9XjC4I12 == -1 || jb9XjC4I13 == -1) {
                        le0.eVhOlqcC(Ey6iv0m0, null);
                        o60Var = null;
                    } else {
                        o60 o60Var3 = new o60();
                        while (true) {
                            if (!Ey6iv0m0.amk52bBQ()) {
                                break;
                            }
                            if ("c".equals(Ey6iv0m0.wxUZMvaN(jb9XjC4I12))) {
                                ib0 jb9XjC4I14 = g50.jb9XjC4I(f40Var, Ey6iv0m0.wxUZMvaN(jb9XjC4I11), Ey6iv0m0.getLong(jb9XjC4I13) == 1);
                                if (jb9XjC4I14 == null) {
                                    le0.eVhOlqcC(Ey6iv0m0, null);
                                    o60Var = null;
                                    break;
                                }
                                o60Var3.add(jb9XjC4I14);
                            }
                        }
                    }
                    return new jb0(str, NCTxEWno2, qoPGr6Ce2, o60Var);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static int eVhOlqcC(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        m1.sjUBp5pO(q70.VgvYg0wo("type needs to be >= FIRST and <= LAST, type=", i));
        return 0;
    }

    public static ei jb9XjC4I(ei[] eiVarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        ei eiVar = null;
        int i3 = Integer.MAX_VALUE;
        for (ei eiVar2 : eiVarArr) {
            int abs = (Math.abs(eiVar2.MdtA4re8 - i2) * 2) + (eiVar2.wxUZMvaN == z ? 0 : 1);
            if (eiVar == null || i3 > abs) {
                eiVar = eiVar2;
                i3 = abs;
            }
        }
        return eiVar;
    }

    public static void lDXGDhIF(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            lg0.NCTxEWno(viewGroup, z);
        } else if (MdtA4re8) {
            try {
                lg0.NCTxEWno(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                MdtA4re8 = false;
            }
        }
    }

    public static void qoPGr6Ce(StringBuilder sb, Object obj, zk zkVar) {
        if (zkVar != null) {
            sb.append((CharSequence) zkVar.ow5vqvCr(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final int wxUZMvaN(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            i = (i * 31) + (obj instanceof Bundle ? wxUZMvaN((Bundle) obj) : obj instanceof Object[] ? Arrays.deepHashCode((Object[]) obj) : obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj instanceof short[] ? Arrays.hashCode((short[]) obj) : obj instanceof int[] ? Arrays.hashCode((int[]) obj) : obj instanceof long[] ? Arrays.hashCode((long[]) obj) : obj instanceof float[] ? Arrays.hashCode((float[]) obj) : obj instanceof double[] ? Arrays.hashCode((double[]) obj) : obj instanceof char[] ? Arrays.hashCode((char[]) obj) : obj instanceof boolean[] ? Arrays.hashCode((boolean[]) obj) : obj != null ? obj.hashCode() : 0);
        }
        return i;
    }

    public static void ygLcUYwZ(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            ed0.qoPGr6Ce(view, charSequence);
            return;
        }
        gd0 gd0Var = gd0.ow5vqvCr;
        if (gd0Var != null && gd0Var.NCTxEWno == view) {
            gd0.NCTxEWno(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new gd0(view, charSequence);
            return;
        }
        gd0 gd0Var2 = gd0.OnDfzHZD;
        if (gd0Var2 != null && gd0Var2.NCTxEWno == view) {
            gd0Var2.qoPGr6Ce();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public abstract Typeface P7K7Inc8(Context context, ei[] eiVarArr, int i);

    public Typeface Qr9iLBAD(Context context, Resources resources, int i, String str, int i2) {
        File jb9XjC4I = f50.jb9XjC4I(context);
        if (jb9XjC4I == null) {
            return null;
        }
        try {
            if (f50.VgvYg0wo(jb9XjC4I, resources, i)) {
                return Typeface.createFromFile(jb9XjC4I.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            jb9XjC4I.delete();
        }
    }

    public abstract Typeface VgvYg0wo(Context context, bi biVar, Resources resources, int i);

    public Typeface b2ZJblxo(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract void k3x7lurq(int i);

    public abstract void ow5vqvCr(Typeface typeface, boolean z);
}
