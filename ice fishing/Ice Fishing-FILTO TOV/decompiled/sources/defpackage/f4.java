package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.SparseArray;
import com.combinations.level.experts.R;
import com.combinations.level.experts.core.domain.model.Side;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class f4 {
    public static final Object EljAMC1QTz = new Object();
    public static volatile f4 OOA6hdeuvCS;
    public final /* synthetic */ int GWasM1elztuh;
    public Object X1lG3V04pd;
    public Object Yi7zF1RB1;
    public Object xqGvceK5x;

    public f4(int i) {
        this.GWasM1elztuh = i;
        switch (i) {
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                this.Yi7zF1RB1 = new j6IIN2O8eOU(11);
                this.X1lG3V04pd = new j6IIN2O8eOU(11);
                this.xqGvceK5x = new j6IIN2O8eOU(11);
                break;
            case 5:
                this.Yi7zF1RB1 = new hg0();
                break;
            case 13:
                long[] jArr = kx0.GWasM1elztuh;
                this.Yi7zF1RB1 = new hg0();
                break;
            case Side.ALL /* 15 */:
                this.Yi7zF1RB1 = new AtomicReference(n30.XnEVoBF0td1l);
                this.X1lG3V04pd = new Object();
                break;
            case 17:
                this.Yi7zF1RB1 = new WeakHashMap();
                this.X1lG3V04pd = new WeakHashMap();
                this.xqGvceK5x = new WeakHashMap();
                break;
            default:
                this.xqGvceK5x = new x51(5);
                break;
        }
    }

    public static f4 AvO7iQsrTN(Context context) {
        if (OOA6hdeuvCS == null) {
            synchronized (EljAMC1QTz) {
                try {
                    if (OOA6hdeuvCS == null) {
                        OOA6hdeuvCS = new f4(context);
                    }
                } finally {
                }
            }
        }
        return OOA6hdeuvCS;
    }

    public boolean E7jCp8Ls() {
        if (((m51) this.Yi7zF1RB1).getValue() != this.xqGvceK5x) {
            return true;
        }
        f4 f4Var = (f4) this.X1lG3V04pd;
        return f4Var != null && f4Var.E7jCp8Ls();
    }

    public s9 EljAMC1QTz() {
        return ((u9) this.xqGvceK5x).OOA6hdeuvCS.X1lG3V04pd;
    }

    public void GWasM1elztuh(g60 g60Var, x30 x30Var) {
        j6IIN2O8eOU j6iin2o8eou = (j6IIN2O8eOU) this.Yi7zF1RB1;
        j6IIN2O8eOU j6iin2o8eou2 = (j6IIN2O8eOU) this.X1lG3V04pd;
        j6IIN2O8eOU j6iin2o8eou3 = (j6IIN2O8eOU) this.xqGvceK5x;
        int ordinal = x30Var.ordinal();
        if (ordinal == 0) {
            j6iin2o8eou.GWasM1elztuh(g60Var);
            j6iin2o8eou3.GWasM1elztuh(g60Var);
            return;
        }
        if (ordinal == 1) {
            j6iin2o8eou2.GWasM1elztuh(g60Var);
            j6iin2o8eou3.GWasM1elztuh(g60Var);
            return;
        }
        if (ordinal == 2) {
            if (g60Var.E7jCp8Ls != null) {
                j6iin2o8eou3.GWasM1elztuh(g60Var);
                return;
            } else {
                j6iin2o8eou.GWasM1elztuh(g60Var);
                return;
            }
        }
        if (ordinal != 3) {
            o4.xqGvceK5x();
        } else if (g60Var.E7jCp8Ls != null) {
            j6iin2o8eou3.GWasM1elztuh(g60Var);
        } else {
            j6iin2o8eou2.GWasM1elztuh(g60Var);
        }
    }

    public boolean JFJ3QoxA(CharSequence charSequence, int i, int i2, qb1 qb1Var) {
        if ((qb1Var.X1lG3V04pd & 3) == 0) {
            hk hkVar = (hk) this.xqGvceK5x;
            xd0 Yi7zF1RB1 = qb1Var.Yi7zF1RB1();
            int GWasM1elztuh = Yi7zF1RB1.GWasM1elztuh(8);
            if (GWasM1elztuh != 0) {
                ((ByteBuffer) Yi7zF1RB1.encWxUiV2).getShort(GWasM1elztuh + Yi7zF1RB1.OOA6hdeuvCS);
            }
            hkVar.getClass();
            ThreadLocal threadLocal = hk.Yi7zF1RB1;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = hkVar.GWasM1elztuh.hasGlyph(sb.toString());
            int i3 = qb1Var.X1lG3V04pd & 4;
            qb1Var.X1lG3V04pd = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (qb1Var.X1lG3V04pd & 3) == 2;
    }

    public void Mjvvu5DE(el elVar) {
        ((u9) this.xqGvceK5x).OOA6hdeuvCS.GWasM1elztuh = elVar;
    }

    public Object OOA6hdeuvCS() {
        long XnEVoBF0td1l = z50.XnEVoBF0td1l();
        if (XnEVoBF0td1l == h91.GWasM1elztuh) {
            return this.xqGvceK5x;
        }
        e91 e91Var = (e91) ((AtomicReference) this.Yi7zF1RB1).get();
        int GWasM1elztuh = e91Var.GWasM1elztuh(XnEVoBF0td1l);
        if (GWasM1elztuh >= 0) {
            return e91Var.X1lG3V04pd[GWasM1elztuh];
        }
        return null;
    }

    public void WIEu4Ya2g8(Object obj) {
        long XnEVoBF0td1l = z50.XnEVoBF0td1l();
        if (XnEVoBF0td1l == h91.GWasM1elztuh) {
            this.xqGvceK5x = obj;
            return;
        }
        synchronized (this.X1lG3V04pd) {
            e91 e91Var = (e91) ((AtomicReference) this.Yi7zF1RB1).get();
            int GWasM1elztuh = e91Var.GWasM1elztuh(XnEVoBF0td1l);
            if (GWasM1elztuh < 0) {
                ((AtomicReference) this.Yi7zF1RB1).set(e91Var.Yi7zF1RB1(XnEVoBF0td1l, obj));
            } else {
                e91Var.X1lG3V04pd[GWasM1elztuh] = obj;
            }
        }
    }

    public void X1lG3V04pd(Bundle bundle) {
        HashSet hashSet = (HashSet) this.X1lG3V04pd;
        String string = ((Context) this.xqGvceK5x).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (o10.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    xqGvceK5x((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new vc(e);
            }
        }
    }

    public f4 XnEVoBF0td1l() {
        CharSequence charSequence = (CharSequence) this.X1lG3V04pd;
        Matcher matcher = (Matcher) this.Yi7zF1RB1;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(end)) {
            return new f4(matcher2, charSequence);
        }
        return null;
    }

    public void Y6hRI1cF8() {
        hg0 hg0Var = (hg0) this.Yi7zF1RB1;
        String str = (String) this.X1lG3V04pd;
        List list = (List) hg0Var.rQPn8YBR(str);
        if (list != null) {
            list.remove((wu) this.xqGvceK5x);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        hg0Var.XnEVoBF0td1l(str, list);
    }

    public boolean Yi7zF1RB1(g60 g60Var) {
        return !(g60Var.E7jCp8Ls == null) && (((u41) ((j6IIN2O8eOU) this.Yi7zF1RB1).EljAMC1QTz).contains(g60Var) || ((u41) ((j6IIN2O8eOU) this.X1lG3V04pd).EljAMC1QTz).contains(g60Var));
    }

    public void YmKjaVtbfp5Z(s9 s9Var) {
        ((u9) this.xqGvceK5x).OOA6hdeuvCS.X1lG3V04pd = s9Var;
    }

    public x20 encWxUiV2() {
        Matcher matcher = (Matcher) this.Yi7zF1RB1;
        return o50.MZhzXH72(matcher.start(), matcher.end());
    }

    public o20 iwATDS1i01k(va vaVar, rs0 rs0Var, rs0 rs0Var2) {
        String str;
        vaVar.getClass();
        rs0Var2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(p40.GWasM1elztuh(vaVar));
        sb.append(':');
        if (rs0Var == null || (str = rs0Var.getValue()) == null) {
            str = "";
        }
        sb.append(str);
        sb.append(':');
        sb.append(rs0Var2);
        return (o20) ((ConcurrentHashMap) this.X1lG3V04pd).get(sb.toString());
    }

    public void jivtDDk9H(long j) {
        ((u9) this.xqGvceK5x).OOA6hdeuvCS.xqGvceK5x = j;
    }

    public void mE4lRynR(p50 p50Var) {
        ((u9) this.xqGvceK5x).OOA6hdeuvCS.Yi7zF1RB1 = p50Var;
    }

    public long mOu10nynGul() {
        return ((u9) this.xqGvceK5x).OOA6hdeuvCS.xqGvceK5x;
    }

    public boolean rQPn8YBR() {
        return !(((u41) ((j6IIN2O8eOU) this.Yi7zF1RB1).EljAMC1QTz).isEmpty() && ((u41) ((j6IIN2O8eOU) this.xqGvceK5x).EljAMC1QTz).isEmpty() && ((u41) ((j6IIN2O8eOU) this.X1lG3V04pd).EljAMC1QTz).isEmpty());
    }

    public String toString() {
        switch (this.GWasM1elztuh) {
            case 11:
                String str = (String) this.xqGvceK5x;
                String str2 = (String) this.X1lG3V04pd;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.Yi7zF1RB1;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Object uFEq9NpZ(CharSequence charSequence, int i, int i2, int i3, boolean z, op opVar) {
        int i4;
        char c;
        qp qpVar = new qp((zd0) ((rx0) this.X1lG3V04pd).AvO7iQsrTN);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray sparseArray = qpVar.X1lG3V04pd.GWasM1elztuh;
                zd0 zd0Var = sparseArray == null ? null : (zd0) sparseArray.get(codePointAt);
                if (qpVar.GWasM1elztuh == 2) {
                    if (zd0Var != null) {
                        qpVar.X1lG3V04pd = zd0Var;
                        qpVar.EljAMC1QTz++;
                    } else {
                        if (codePointAt == 65038) {
                            qpVar.GWasM1elztuh();
                        } else if (codePointAt != 65039) {
                            zd0 zd0Var2 = qpVar.X1lG3V04pd;
                            if (zd0Var2.Yi7zF1RB1 != null) {
                                if (qpVar.EljAMC1QTz != 1) {
                                    qpVar.xqGvceK5x = zd0Var2;
                                    qpVar.GWasM1elztuh();
                                } else if (qpVar.Yi7zF1RB1()) {
                                    qpVar.xqGvceK5x = qpVar.X1lG3V04pd;
                                    qpVar.GWasM1elztuh();
                                } else {
                                    qpVar.GWasM1elztuh();
                                }
                                c = 3;
                            } else {
                                qpVar.GWasM1elztuh();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (zd0Var == null) {
                    qpVar.GWasM1elztuh();
                    c = 1;
                } else {
                    qpVar.GWasM1elztuh = 2;
                    qpVar.X1lG3V04pd = zd0Var;
                    qpVar.EljAMC1QTz = 1;
                    c = 2;
                }
                qpVar.OOA6hdeuvCS = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !JFJ3QoxA(charSequence, i4, i6, qpVar.xqGvceK5x.Yi7zF1RB1)) {
                        z2 = opVar.AvO7iQsrTN(charSequence, i4, i6, qpVar.xqGvceK5x.Yi7zF1RB1);
                        i5++;
                    }
                }
            }
        }
        if (qpVar.GWasM1elztuh == 2 && qpVar.X1lG3V04pd.Yi7zF1RB1 != null && ((qpVar.EljAMC1QTz > 1 || qpVar.Yi7zF1RB1()) && i5 < i3 && z2 && (z || !JFJ3QoxA(charSequence, i4, i6, qpVar.X1lG3V04pd.Yi7zF1RB1)))) {
            opVar.AvO7iQsrTN(charSequence, i4, i6, qpVar.X1lG3V04pd.Yi7zF1RB1);
        }
        return opVar.GWasM1elztuh();
    }

    public Object xqGvceK5x(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.Yi7zF1RB1;
        if (l60.YmKjaVtbfp5Z()) {
            try {
                l60.encWxUiV2(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                o10 o10Var = (o10) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> GWasM1elztuh = o10Var.GWasM1elztuh();
                if (!GWasM1elztuh.isEmpty()) {
                    for (Class cls2 : GWasM1elztuh) {
                        if (!hashMap.containsKey(cls2)) {
                            xqGvceK5x(cls2, hashSet);
                        }
                    }
                }
                obj = o10Var.Yi7zF1RB1((Context) this.xqGvceK5x);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new vc(th);
            }
        }
        return obj;
    }

    public f4(bt0 bt0Var) {
        this.GWasM1elztuh = 12;
        this.Yi7zF1RB1 = new i5(0);
        this.X1lG3V04pd = new v5(0);
        this.xqGvceK5x = new h2(7, this, bt0Var);
    }

    public /* synthetic */ f4(Object obj, Object obj2, Object obj3, int i) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = obj;
        this.X1lG3V04pd = obj2;
        this.xqGvceK5x = obj3;
    }

    public f4(v5 v5Var) {
        this.GWasM1elztuh = 6;
        this.Yi7zF1RB1 = v5Var;
        this.X1lG3V04pd = new ConcurrentHashMap();
        this.xqGvceK5x = new ConcurrentHashMap();
    }

    public f4(u9 u9Var) {
        this.GWasM1elztuh = 2;
        this.xqGvceK5x = u9Var;
        this.Yi7zF1RB1 = new j6IIN2O8eOU(5, this);
    }

    public f4(Context context) {
        this.GWasM1elztuh = 0;
        this.xqGvceK5x = context.getApplicationContext();
        this.X1lG3V04pd = new HashSet();
        this.Yi7zF1RB1 = new HashMap();
    }

    public f4(rx0 rx0Var, k61 k61Var, hk hkVar, Set set) {
        this.GWasM1elztuh = 4;
        this.Yi7zF1RB1 = k61Var;
        this.X1lG3V04pd = rx0Var;
        this.xqGvceK5x = hkVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            uFEq9NpZ(str, 0, str.length(), 1, true, new pp(str, 0));
        }
    }

    public f4(tb1 tb1Var, f4 f4Var) {
        this.GWasM1elztuh = 16;
        this.Yi7zF1RB1 = tb1Var;
        this.X1lG3V04pd = f4Var;
        this.xqGvceK5x = tb1Var.OOA6hdeuvCS;
    }

    public f4(Matcher matcher, CharSequence charSequence) {
        this.GWasM1elztuh = 9;
        charSequence.getClass();
        this.Yi7zF1RB1 = matcher;
        this.X1lG3V04pd = charSequence;
        this.xqGvceK5x = new tc0(0, this);
    }
}
