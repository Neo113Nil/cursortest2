package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.go.sdk.SourceType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes9.dex */
public final class vms implements ams, gqw, rtf0, ese, em71, ga91 {
    public final /* synthetic */ int a;
    public static final /* synthetic */ vms b = new vms(15);
    public static final /* synthetic */ vms c = new vms(16);
    public static final /* synthetic */ vms w = new vms(17);
    public static final /* synthetic */ vms x = new vms(18);
    public static final /* synthetic */ vms y = new vms(19);
    public static final /* synthetic */ vms z = new vms(20);
    public static final /* synthetic */ vms A = new vms(21);
    public static final /* synthetic */ vms B = new vms(22);
    public static final /* synthetic */ vms C = new vms(23);
    public static final /* synthetic */ vms D = new vms(24);
    public static final /* synthetic */ vms E = new vms(25);
    public static final /* synthetic */ vms F = new vms(26);
    public static final /* synthetic */ vms G = new vms(27);
    public static final /* synthetic */ vms H = new vms(28);
    public static final /* synthetic */ vms I = new vms(29);

    public vms(my80 my80Var) {
        this.a = 5;
    }

    public static final String e(String str, ArrayList arrayList) {
        String m;
        qrq0 qrq0Var = y7u.b;
        String str2 = "";
        if (!arrayList.isEmpty()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                x7u x7uVar = (x7u) listIterator.previous();
                if (evu0.J(str2)) {
                    m = str + "=" + x7uVar.b() + "@" + x7uVar.a();
                } else {
                    m = unr0.m(x7uVar.a(), "@", oyr.w(str2, ",", str, "=", x7uVar.b()));
                }
                str2 = m;
            }
        }
        return str2;
    }

    public static ArrayList g(List list, tls tlsVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = (String) tlsVar.invoke(obj);
            String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "unknown";
            Object obj2 = linkedHashMap.get(lowerCase);
            if (obj2 == null) {
                obj2 = qv10.w(lowerCase, linkedHashMap);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new x7u((String) entry.getKey(), ((List) entry.getValue()).size()));
        }
        return arrayList;
    }

    public static hbp0 h(int i, String str) {
        if ((i & 1) != 0) {
            str = null;
        }
        czo0 czo0Var = new czo0(14);
        if (str == null) {
            str = "";
        }
        return new hbp0(czo0Var, str, null);
    }

    public static String i(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // defpackage.rtf0
    public void a(List list, Object obj, String str, String str2) {
    }

    @Override // defpackage.rtf0
    public f1k b(Expression expression, sls slsVar) {
        return f1k.O1;
    }

    @Override // defpackage.rtf0
    public Object c(Expression expression) {
        return new Object();
    }

    @Override // defpackage.ams
    public Object d(jje jjeVar, inj injVar) {
        if (injVar.c != 2) {
            throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"dispatch\" requires 2 argument but "));
        }
        Object[] objArr = injVar.a;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        if (!(obj instanceof String)) {
            throw oyr.y(obj, "Event name should be string but actual value is ");
        }
        jjeVar.e.add(new g5x((String) obj, obj2));
        return seu.E;
    }

    public k7z f(k7z k7zVar, Object obj) {
        return new k7z(k7zVar.a, k7zVar.b, k7zVar.c, k7zVar.d, new ky80(SourceType.OUTPUT.getSource(), k7zVar.e.a()));
    }

    @Override // defpackage.ga91
    public Object zza() {
        switch (this.a) {
            case 15:
                ((odb1) gdb1.b.a.get()).getClass();
                return new Boolean(((Boolean) odb1.b.b()).booleanValue());
            case 16:
                List list = nw91.a;
                ((mlb1) flb1.b.a.get()).getClass();
                Boolean bool = (Boolean) mlb1.a.b();
                bool.getClass();
                return bool;
            case 17:
                List list2 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.o0.b()).longValue());
            case 18:
                List list3 = nw91.a;
                hcb1.b.get().getClass();
                return (String) qcb1.M.b();
            case 19:
                List list4 = nw91.a;
                hcb1.b.get().getClass();
                Long l = (Long) qcb1.L.b();
                l.getClass();
                return l;
            case 20:
                List list5 = nw91.a;
                hcb1.b.get().getClass();
                Long l2 = (Long) qcb1.Q.b();
                l2.getClass();
                return l2;
            case 21:
                List list6 = nw91.a;
                hcb1.b.get().getClass();
                Long l3 = (Long) qcb1.E.b();
                l3.getClass();
                return l3;
            case 22:
                List list7 = nw91.a;
                hcb1.b.get().getClass();
                Long l4 = (Long) qcb1.g0.b();
                l4.getClass();
                return l4;
            case 23:
                List list8 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.o.b()).longValue());
            case 24:
                List list9 = nw91.a;
                hcb1.b.get().getClass();
                return (String) qcb1.g.b();
            case 25:
                List list10 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.u.b()).longValue());
            case 26:
                List list11 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.x.b()).longValue());
            case 27:
                List list12 = nw91.a;
                hcb1.b.get().getClass();
                return (String) qcb1.D.b();
            case 28:
                List list13 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.W.b()).longValue());
            default:
                List list14 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.B.b()).longValue());
        }
    }

    public /* synthetic */ vms(int i) {
        this.a = i;
    }
}
