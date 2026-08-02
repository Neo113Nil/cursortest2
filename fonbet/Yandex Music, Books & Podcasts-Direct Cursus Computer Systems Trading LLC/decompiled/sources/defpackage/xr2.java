package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public abstract class xr2 {
    public vr2 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public ArrayList c;
    public int d;

    public xr2(vr2 vr2Var) {
        this.a = vr2Var;
        n(vr2Var, true);
    }

    public void a(String str, Integer num) {
        eas w = hyf.w(i(), str);
        int intValue = num.intValue();
        int i = w.b;
        int i2 = intValue - i;
        if (i2 < 0) {
            i2 = 0;
        }
        int l = l(new eas(i2, i, w.c), str);
        int g = g();
        if (i2 < g) {
            while (l < ((ArrayList) f()).size() && !(((ur2) ((ArrayList) f()).get(l)) instanceof sr2)) {
                l++;
            }
            g = Math.min(l, i().length());
        }
        this.d = g;
    }

    public final String b(int i, String str) {
        StringBuilder sb = new StringBuilder();
        vqn vqnVar = new vqn();
        vqnVar.a = i;
        ha0 ha0Var = new ha0(11, vqnVar, this);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            Regex regex = (Regex) ha0Var.invoke();
            if (regex != null && regex.e(String.valueOf(charAt))) {
                sb.append(charAt);
                vqnVar.a++;
            }
        }
        return sb.toString();
    }

    public final void c(eas easVar) {
        int i = easVar.b;
        int i2 = easVar.a;
        if (i == 0 && easVar.c == 1) {
            int i3 = i2;
            while (true) {
                if (i3 < 0) {
                    break;
                }
                ur2 ur2Var = (ur2) ((ArrayList) f()).get(i3);
                if (ur2Var instanceof sr2) {
                    sr2 sr2Var = (sr2) ur2Var;
                    if (sr2Var.a != null) {
                        sr2Var.a = null;
                        break;
                    }
                }
                i3--;
            }
        }
        d(i2, ((ArrayList) f()).size());
    }

    public final void d(int i, int i2) {
        while (i < i2 && i < ((ArrayList) f()).size()) {
            ur2 ur2Var = (ur2) ((ArrayList) f()).get(i);
            if (ur2Var instanceof sr2) {
                ((sr2) ur2Var).a = null;
            }
            i++;
        }
    }

    public final String e(int i, int i2) {
        Character ch;
        StringBuilder sb = new StringBuilder();
        while (i <= i2) {
            ur2 ur2Var = (ur2) ((ArrayList) f()).get(i);
            if ((ur2Var instanceof sr2) && (ch = ((sr2) ur2Var).a) != null) {
                sb.append(ch);
            }
            i++;
        }
        return sb.toString();
    }

    public final List f() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.j("destructedValue");
        throw null;
    }

    public final int g() {
        Iterator it = ((ArrayList) f()).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            ur2 ur2Var = (ur2) it.next();
            if ((ur2Var instanceof sr2) && ((sr2) ur2Var).a == null) {
                break;
            }
            i++;
        }
        return i != -1 ? i : ((ArrayList) f()).size();
    }

    public final String h() {
        return e(0, ((ArrayList) f()).size() - 1);
    }

    public final String i() {
        Character ch;
        StringBuilder sb = new StringBuilder();
        List f = f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            ur2 ur2Var = (ur2) obj;
            if (ur2Var instanceof tr2) {
                sb.append(((tr2) ur2Var).a);
            } else if ((ur2Var instanceof sr2) && (ch = ((sr2) ur2Var).a) != null) {
                sb.append(ch);
            } else {
                if (!this.a.c) {
                    break;
                }
                ur2Var.getClass();
                sb.append(((sr2) ur2Var).c);
            }
            arrayList.add(obj);
        }
        return sb.toString();
    }

    public abstract void j(PatternSyntaxException patternSyntaxException);

    public void k(String str) {
        d(0, ((ArrayList) f()).size());
        m(0, null, str);
        this.d = Math.min(this.d, i().length());
    }

    public final int l(eas easVar, String str) {
        int i;
        Integer valueOf;
        int i2 = easVar.a;
        String substring = str.substring(i2, easVar.b + i2);
        String e = e(i2 + easVar.c, ((ArrayList) f()).size() - 1);
        c(easVar);
        int g = g();
        if (e.length() == 0) {
            valueOf = null;
        } else {
            if (this.b.size() <= 1) {
                int i3 = 0;
                for (int i4 = g; i4 < ((ArrayList) f()).size(); i4++) {
                    if (((ArrayList) f()).get(i4) instanceof sr2) {
                        i3++;
                    }
                }
                i = i3 - e.length();
            } else {
                String b = b(g, e);
                int i5 = 0;
                while (i5 < ((ArrayList) f()).size() && b.equals(b(g + i5, e))) {
                    i5++;
                }
                i = i5 - 1;
            }
            valueOf = Integer.valueOf(i >= 0 ? i : 0);
        }
        m(g, valueOf, substring);
        int g2 = g();
        m(g2, null, e);
        return g2;
    }

    public final void m(int i, Integer num, String str) {
        String b = b(i, str);
        if (num != null) {
            b = mlr.K(num.intValue(), b);
        }
        int i2 = 0;
        while (i < ((ArrayList) f()).size() && i2 < b.length()) {
            ur2 ur2Var = (ur2) ((ArrayList) f()).get(i);
            char charAt = b.charAt(i2);
            if (ur2Var instanceof sr2) {
                ((sr2) ur2Var).a = Character.valueOf(charAt);
                i2++;
            }
            i++;
        }
    }

    public final void n(vr2 vr2Var, boolean z) {
        Object obj;
        String h = (Intrinsics.d(this.a, vr2Var) || !z) ? null : h();
        this.a = vr2Var;
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.clear();
        for (wr2 wr2Var : this.a.b) {
            try {
                String str = wr2Var.b;
                if (str != null) {
                    linkedHashMap.put(Character.valueOf(wr2Var.a), new Regex(str));
                }
            } catch (PatternSyntaxException e) {
                j(e);
            }
        }
        String str2 = this.a.a;
        ArrayList arrayList = new ArrayList(str2.length());
        for (int i = 0; i < str2.length(); i++) {
            char charAt = str2.charAt(i);
            Iterator it = this.a.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((wr2) obj).a == charAt) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            wr2 wr2Var2 = (wr2) obj;
            arrayList.add(wr2Var2 != null ? new sr2((Regex) linkedHashMap.get(Character.valueOf(wr2Var2.a)), wr2Var2.c) : new tr2(charAt));
        }
        this.c = arrayList;
        if (h != null) {
            k(h);
        }
    }
}
