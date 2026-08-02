package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class s691 implements r691 {
    public final String a;
    public final ArrayList b;

    public s691(String str, ArrayList arrayList) {
        this.a = str;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // defpackage.r691
    public final r691 b(String str, cr71 cr71Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // defpackage.r691
    public final r691 e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s691)) {
            return false;
        }
        s691 s691Var = (s691) obj;
        String str = s691Var.a;
        String str2 = this.a;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.b.equals(s691Var.b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // defpackage.r691
    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // defpackage.r691
    public final Double zzd() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // defpackage.r691
    public final Boolean zze() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // defpackage.r691
    public final Iterator zzf() {
        return null;
    }
}
