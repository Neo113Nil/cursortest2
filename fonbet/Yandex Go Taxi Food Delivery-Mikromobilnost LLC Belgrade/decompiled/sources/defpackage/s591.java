package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class s591 implements r691, a691 {
    public final String a;
    public final HashMap b = new HashMap();

    public s591(String str) {
        this.a = str;
    }

    @Override // defpackage.a691
    public final r691 a(String str) {
        HashMap hashMap = this.b;
        return hashMap.containsKey(str) ? (r691) hashMap.get(str) : r691.z5;
    }

    @Override // defpackage.r691
    public final r691 b(String str, cr71 cr71Var, ArrayList arrayList) {
        return "toString".equals(str) ? new a791(this.a) : a691.g(this, new a791(str), cr71Var, arrayList);
    }

    public abstract r691 c(cr71 cr71Var, List list);

    @Override // defpackage.a691
    public final boolean d(String str) {
        return this.b.containsKey(str);
    }

    @Override // defpackage.r691
    public r691 e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s591)) {
            return false;
        }
        s591 s591Var = (s591) obj;
        String str = this.a;
        if (str != null) {
            return str.equals(s591Var.a);
        }
        return false;
    }

    @Override // defpackage.a691
    public final void f(String str, r691 r691Var) {
        HashMap hashMap = this.b;
        if (r691Var == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, r691Var);
        }
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.r691
    public final String zzc() {
        return this.a;
    }

    @Override // defpackage.r691
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.r691
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // defpackage.r691
    public final Iterator zzf() {
        return new v591(this.b.keySet().iterator());
    }
}
