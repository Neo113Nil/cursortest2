package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes10.dex */
public final class std implements ybt0 {
    public final bms a;
    public final Map b;
    public final LinkedHashMap c;
    public int e;
    public final x43 d = new x43();
    public f6w f = jws0.a;

    public std(bms bmsVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.a = bmsVar;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
    }

    public final f6w a(aud audVar, int i, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        f6w f6wVar = jws0.a;
        x43 x43Var = this.d;
        x43Var.addLast(audVar);
        int i2 = 0;
        for (aud audVar2 : audVar.d()) {
            f6wVar = jws0.j(f6wVar, a(audVar2, i2, arrayList2));
            String a = audVar2.a();
            if (a != null ? cvu0.x(a, CA20Status.STATUS_REQUEST_C, false) : false) {
                i2++;
            }
        }
        Object node = audVar.getNode();
        n0y n0yVar = node instanceof n0y ? (n0y) node : null;
        if (n0yVar != null) {
            f6wVar = jws0.b(n0yVar);
        }
        this.e = i;
        this.f = f6wVar;
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        List list = linkedHashMap != null ? (List) linkedHashMap.remove(audVar) : null;
        if (list == null) {
            list = EmptyList.a;
        }
        Object invoke = this.a.invoke(audVar, this, arrayList2, list);
        if (invoke != null) {
            arrayList.add(invoke);
        }
        return f6wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final idt0 b() {
        String a;
        int i;
        ddt0 ddt0Var;
        String a2;
        x43 x43Var = this.d;
        int i2 = 2;
        Integer num = null;
        aud audVar = x43Var.size() > 1 ? (aud) x43Var.get(x43Var.size() - 2) : null;
        if (audVar != null && (a = audVar.a()) != null) {
            Map map = this.b;
            Object obj = map.get(a);
            if (obj == null) {
                obj = jws0.i(a, null);
                map.put(a, obj);
            }
            ddt0 ddt0Var2 = obj instanceof ddt0 ? (ddt0) obj : null;
            if (ddt0Var2 != null) {
                ddt0 ddt0Var3 = ddt0Var2;
                while (i2 < x43Var.size()) {
                    if ((ddt0Var3 != null ? ddt0Var3.b : null) != null) {
                        break;
                    }
                    int i3 = i2 + 1;
                    aud audVar2 = x43Var.size() > i2 ? (aud) x43Var.get((x43Var.size() - i2) - 1) : null;
                    if (audVar2 != null && (a2 = audVar2.a()) != null) {
                        Object obj2 = map.get(a2);
                        if (obj2 == null) {
                            obj2 = jws0.i(a2, null);
                            map.put(a2, obj2);
                        }
                        if (obj2 instanceof ddt0) {
                            ddt0Var = (ddt0) obj2;
                            i2 = i3;
                            ddt0Var3 = ddt0Var;
                        }
                    }
                    ddt0Var = null;
                    i2 = i3;
                    ddt0Var3 = ddt0Var;
                }
                int i4 = this.e;
                int i5 = ddt0Var2.e;
                List list = ddt0Var2.d;
                if (i4 >= list.size() && i5 >= 0 && i5 < list.size()) {
                    i4 = ((i4 - i5) % (list.size() - i5)) + i5;
                }
                if (i4 < list.size()) {
                    edz edzVar = (edz) list.get(i4);
                    int i6 = edzVar.a;
                    int i7 = edzVar.b;
                    int i8 = edzVar.c;
                    String str = ddt0Var2.b;
                    String str2 = str == null ? ddt0Var3 != null ? ddt0Var3.b : null : str;
                    if (str == null) {
                        if (ddt0Var3 != null) {
                            i = ddt0Var3.c;
                        }
                        return new idt0(i6, i7, i8, num == null ? num.intValue() : -1, str2);
                    }
                    i = ddt0Var2.c;
                    num = Integer.valueOf(i);
                    return new idt0(i6, i7, i8, num == null ? num.intValue() : -1, str2);
                }
            }
        }
        return null;
    }
}
