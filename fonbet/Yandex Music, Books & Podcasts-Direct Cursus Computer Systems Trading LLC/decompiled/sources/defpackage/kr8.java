package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kr8 extends j66 {
    public final List n;
    public final ArrayList o;

    public kr8(ArrayList arrayList, ArrayList arrayList2) {
        this.n = arrayList;
        this.o = arrayList2;
    }

    public static boolean v0(k79 k79Var, k79 k79Var2) {
        if (k79Var != null) {
            xzb xzbVar = k79Var.b;
            if (k79Var2 != null) {
                xzb xzbVar2 = k79Var2.b;
                zzb zzbVar = xzbVar instanceof zzb ? (zzb) xzbVar : null;
                if (zzbVar != null) {
                    zzbVar.k = true;
                }
                zzb zzbVar2 = xzbVar2 instanceof zzb ? (zzb) xzbVar2 : null;
                if (zzbVar2 != null) {
                    zzbVar2.k = true;
                }
                boolean a = k79Var.a.a(k79Var2.a, xzbVar, xzbVar2);
                zzb zzbVar3 = xzbVar instanceof zzb ? (zzb) xzbVar : null;
                if (zzbVar3 != null) {
                    zzbVar3.k = false;
                }
                zzb zzbVar4 = xzbVar2 instanceof zzb ? (zzb) xzbVar2 : null;
                if (zzbVar4 == null) {
                    return a;
                }
                zzbVar4.k = false;
                return a;
            }
        }
        return Intrinsics.d(k79Var, k79Var2);
    }

    @Override // defpackage.j66
    public final boolean I(int i, int i2) {
        return v0((k79) CollectionsKt.S(this.n, i), (k79) CollectionsKt.S(this.o, i2));
    }

    @Override // defpackage.j66
    public final boolean J(int i, int i2) {
        jc8 jc8Var;
        szb m;
        jc8 jc8Var2;
        szb m2;
        k79 k79Var = (k79) CollectionsKt.S(this.n, i);
        k79 k79Var2 = (k79) CollectionsKt.S(this.o, i2);
        String str = null;
        String str2 = (k79Var == null || (jc8Var2 = k79Var.a) == null || (m2 = jc8Var2.d().m()) == null) ? null : (String) m2.a(k79Var.b);
        if (k79Var2 != null && (jc8Var = k79Var2.a) != null && (m = jc8Var.d().m()) != null) {
            str = (String) m.a(k79Var2.b);
        }
        return (str2 == null && str == null) ? v0(k79Var, k79Var2) : Intrinsics.d(str2, str);
    }

    @Override // defpackage.j66
    public final int Z() {
        return this.o.size();
    }

    @Override // defpackage.j66
    public final int a0() {
        return this.n.size();
    }
}
