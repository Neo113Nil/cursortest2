package defpackage;

import android.net.Uri;
import android.widget.TextView;
import com.yandex.div.evaluable.MissingLocalFunctionException;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.d;
import com.yandex.go.settings.email.a;
import com.yandex.go.superapp.order_tracking.eats.presentation.navigation.g;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointCommentImageDto;

/* loaded from: classes5.dex */
public final class u1n implements ksn, tsn, c7z0, gg90, nms {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public u1n(int i) {
        this.a = i;
        switch (i) {
            case 15:
                break;
            case 27:
                this.b = new c3u(null);
                this.c = new HashMap();
                break;
            default:
                this.b = new int[10];
                this.c = new int[10];
                break;
        }
    }

    public static void k(u1n u1nVar, x2s x2sVar) {
        Map f = b.f();
        u1nVar.getClass();
        if (x2sVar == null) {
            x2sVar = null;
        }
        u1nVar.r("Shown", x2sVar, f);
    }

    public static void m(u1n u1nVar, x2s x2sVar) {
        Map f = b.f();
        u1nVar.getClass();
        if (x2sVar == null) {
            x2sVar = null;
        }
        u1nVar.r("Tapped", x2sVar, f);
    }

    @Override // defpackage.tsn
    public void a() {
        TextView textView = (TextView) this.b;
        if (textView != null) {
            textView.setText("😃");
        }
    }

    @Override // defpackage.tsn
    public void b(String str) {
        TextView textView = (TextView) this.b;
        if (textView != null) {
            textView.setText(str);
        }
        ((f02) this.c).invoke();
    }

    @Override // defpackage.c7z0
    public long c() {
        return ((Long) ((xen) this.b).mo104apply(Long.valueOf(((w3x0) this.c).c()))).longValue();
    }

    @Override // defpackage.c7z0
    public long d() {
        return ((Long) ((xen) this.b).mo104apply(Long.valueOf(((w3x0) this.c).d()))).longValue();
    }

    public int e() {
        char[] cArr = (char[]) this.c;
        yzh yzhVar = (yzh) this.b;
        if (cArr.length == 0) {
            ny61.p();
            return 0;
        }
        int o = yzhVar.o(String.valueOf(cArr[0]));
        int i = 1;
        int length = cArr.length - 1;
        if (1 <= length) {
            while (true) {
                int o2 = yzhVar.o(String.valueOf(cArr[i]));
                if (o < o2) {
                    o = o2;
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        int i2 = o * 2;
        return yzhVar.o(String.valueOf(':')) + i2 + i2;
    }

    public Object f(c6e0 c6e0Var) {
        HashMap hashMap = (HashMap) this.c;
        c3u c3uVar = (c3u) hashMap.get(c6e0Var);
        if (c3uVar == null) {
            c3uVar = new c3u(c6e0Var);
            hashMap.put(c6e0Var, c3uVar);
        } else {
            c6e0Var.a();
        }
        c3u c3uVar2 = c3uVar.d;
        c3uVar2.c = c3uVar.c;
        c3uVar.c.d = c3uVar2;
        c3u c3uVar3 = (c3u) this.b;
        c3uVar.d = c3uVar3;
        c3u c3uVar4 = c3uVar3.c;
        c3uVar.c = c3uVar4;
        c3uVar4.d = c3uVar;
        c3uVar.d.c = c3uVar;
        ArrayList arrayList = c3uVar.b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c3uVar.b.remove(size - 1);
        }
        return null;
    }

    public ArrayList g(List list) {
        List<lkb0> list2 = list;
        l6s l6sVar = (l6s) this.c;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (lkb0 lkb0Var : list2) {
            l6sVar.getClass();
            arrayList.add(new RoutePointCommentImageDto(lkb0Var.b(), lkb0Var.a()));
        }
        return arrayList;
    }

    @Override // defpackage.nms
    public c h(String str, ArrayList arrayList) {
        try {
            return ((d) this.b).h(str, arrayList);
        } catch (MissingLocalFunctionException unused) {
            return ((nms) ((gp50) this.c).b).h(str, arrayList);
        }
    }

    @Override // defpackage.nms
    public c i(String str, ArrayList arrayList) {
        try {
            return ((d) this.b).i(str, arrayList);
        } catch (MissingLocalFunctionException unused) {
            return ((nms) ((gp50) this.c).b).i(str, arrayList);
        }
    }

    public void j(String str, boolean z) {
        xrn xrnVar = (xrn) this.b;
        xrnVar.setProgressing(false);
        xrnVar.T4(str);
        xrnVar.N1(kyh0.favorites_summary_add, z);
        a aVar = (a) this.c;
        String str2 = aVar.y.b().a;
        xrnVar.Mc(!(str2 == null || evu0.J(str2)));
        aVar.A = true;
        aVar.B = false;
    }

    public void l(String str) {
        a aVar = (a) this.c;
        xrn xrnVar = (xrn) this.b;
        xrnVar.setProgressing(false);
        if (str == null) {
            xrnVar.dismiss();
            return;
        }
        xrnVar.T4(str);
        xrnVar.N1(kyh0.common_done, true);
        String str2 = aVar.y.b().a;
        xrnVar.Mc(!(str2 == null || evu0.J(str2)));
        aVar.A = false;
        aVar.B = true;
    }

    public void n(c6e0 c6e0Var, Object obj) {
        HashMap hashMap = (HashMap) this.c;
        c3u c3uVar = (c3u) hashMap.get(c6e0Var);
        if (c3uVar == null) {
            c3uVar = new c3u(c6e0Var);
            c3uVar.d = c3uVar;
            c3u c3uVar2 = (c3u) this.b;
            c3uVar.d = c3uVar2.d;
            c3uVar.c = c3uVar2;
            c3uVar2.d = c3uVar;
            c3uVar.d.c = c3uVar;
            hashMap.put(c6e0Var, c3uVar);
        } else {
            c6e0Var.a();
        }
        if (c3uVar.b == null) {
            c3uVar.b = new ArrayList();
        }
        c3uVar.b.add(obj);
    }

    public Object o() {
        c3u c3uVar = (c3u) this.b;
        c3u c3uVar2 = c3uVar.d;
        while (true) {
            boolean equals = c3uVar2.equals(c3uVar);
            Object obj = c3uVar2.a;
            if (equals) {
                return null;
            }
            ArrayList arrayList = c3uVar2.b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object remove = size > 0 ? c3uVar2.b.remove(size - 1) : null;
            if (remove != null) {
                return remove;
            }
            c3u c3uVar3 = c3uVar2.d;
            c3uVar3.c = c3uVar2.c;
            c3uVar2.c.d = c3uVar3;
            ((HashMap) this.c).remove(obj);
            ((c6e0) obj).a();
            c3uVar2 = c3uVar2.d;
        }
    }

    public void p(Map map, String str, Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(gw00.d(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
            linkedHashMap.putAll(linkedHashMap3);
        }
        for (Map.Entry entry3 : map.entrySet()) {
            linkedHashMap.put((String) entry3.getKey(), entry3.getValue());
        }
        ((mv8) this.c).getClass();
        jgz.a.h("Analytics");
        jgz.a("**" + str + "**, attrs: " + linkedHashMap + " ", new Object[0]);
        ((jwh) this.b).a.o(str, null, linkedHashMap);
    }

    @Override // defpackage.gg90
    public Object parse(Uri uri, InputStream inputStream) {
        o5r o5rVar = (o5r) ((gg90) this.b).parse(uri, inputStream);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? o5rVar : (o5r) o5rVar.copy(list);
    }

    public void q(Object obj, String str) {
        p(b.f(), str, obj);
    }

    public void r(String str, x2s x2sVar, Map map) {
        if ((x2sVar != null ? x2sVar.a : null) != null) {
            p(map, g8e.p(x2sVar.a, Extension.DOT_CHAR, str), x2sVar.b);
        }
    }

    public String toString() {
        switch (this.a) {
            case 27:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                c3u c3uVar = (c3u) this.b;
                c3u c3uVar2 = c3uVar.c;
                boolean z = false;
                while (!c3uVar2.equals(c3uVar)) {
                    sb.append('{');
                    sb.append(c3uVar2.a);
                    sb.append(':');
                    ArrayList arrayList = c3uVar2.b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c3uVar2 = c3uVar2.c;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u1n(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public u1n(yzh yzhVar) {
        this.a = 0;
        this.b = yzhVar;
        this.c = new char[]{MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }

    public u1n(g gVar, cfn cfnVar) {
        this.a = 1;
        this.c = gVar;
        this.b = cfnVar;
    }
}
