package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class v0e implements qlp {
    public final e15 a;

    public v0e(e15 e15Var) {
        this.a = e15Var;
    }

    @Override // defpackage.qlp
    public final Boolean a(String str) {
        Object obj;
        slp a;
        n4d0 n4d0Var = this.a.b.e;
        Object obj2 = null;
        Map a2 = (n4d0Var == null || (a = n4d0Var.a()) == null) ? null : a.a();
        if (a2 != null && (obj = a2.get(str)) != null && (obj instanceof Boolean)) {
            obj2 = obj;
        }
        return (Boolean) obj2;
    }

    @Override // defpackage.qlp
    public final String b(String str) {
        Object obj;
        slp a;
        n4d0 n4d0Var = this.a.b.e;
        Object obj2 = null;
        Map a2 = (n4d0Var == null || (a = n4d0Var.a()) == null) ? null : a.a();
        if (a2 != null && (obj = a2.get(str)) != null && (obj instanceof String)) {
            obj2 = obj;
        }
        return (String) obj2;
    }

    @Override // defpackage.qlp
    public final Set c(String str) {
        Object obj;
        ArrayList arrayList;
        slp a;
        n4d0 n4d0Var = this.a.b.e;
        Map a2 = (n4d0Var == null || (a = n4d0Var.a()) == null) ? null : a.a();
        if (a2 == null || (obj = a2.get(str)) == null || !(obj instanceof Set)) {
            obj = null;
        }
        Collection collection = (Collection) obj;
        if (collection != null) {
            arrayList = new ArrayList();
            for (Object obj2 : collection) {
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        if (collection != null && arrayList != null && collection.size() != arrayList.size()) {
            arrayList = null;
        }
        if (arrayList != null) {
            return a.N0(arrayList);
        }
        return null;
    }

    @Override // defpackage.qlp
    public final Float d(String str) {
        Object obj;
        slp a;
        n4d0 n4d0Var = this.a.b.e;
        Object obj2 = null;
        Map a2 = (n4d0Var == null || (a = n4d0Var.a()) == null) ? null : a.a();
        if (a2 != null && (obj = a2.get(str)) != null && (obj instanceof Float)) {
            obj2 = obj;
        }
        return (Float) obj2;
    }

    @Override // defpackage.qlp
    public final Integer e(String str) {
        Object obj;
        slp a;
        n4d0 n4d0Var = this.a.b.e;
        Object obj2 = null;
        Map a2 = (n4d0Var == null || (a = n4d0Var.a()) == null) ? null : a.a();
        if (a2 != null && (obj = a2.get(str)) != null && (obj instanceof Integer)) {
            obj2 = obj;
        }
        return (Integer) obj2;
    }
}
