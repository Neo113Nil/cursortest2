package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bd8 implements u1f {
    public final zw8 a;
    public final szb b;
    public final szb c;
    public final szb d;
    public final List e;
    public final JSONObject f;
    public final szb g;
    public final String h;
    public final szb i;
    public final uk8 j;
    public final szb k;
    public Integer l;

    public bd8(zw8 zw8Var, szb szbVar, szb szbVar2, szb szbVar3, List list, JSONObject jSONObject, szb szbVar4, String str, szb szbVar5, uk8 uk8Var, szb szbVar6) {
        this.a = zw8Var;
        this.b = szbVar;
        this.c = szbVar2;
        this.d = szbVar3;
        this.e = list;
        this.f = jSONObject;
        this.g = szbVar4;
        this.h = str;
        this.i = szbVar5;
        this.j = uk8Var;
        this.k = szbVar6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x011b, code lost:
    
        if (r7 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f7, code lost:
    
        if (r13 == null) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0114 A[LOOP:0: B:25:0x0088->B:34:0x0114, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(bd8 bd8Var, xzb xzbVar, xzb xzbVar2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (bd8Var != null) {
            zw8 zw8Var = bd8Var.a;
            zw8 zw8Var2 = this.a;
            if ((zw8Var2 != null ? zw8Var2.a(zw8Var, xzbVar, xzbVar2) : zw8Var == null) && ((Boolean) this.b.a(xzbVar)).booleanValue() == ((Boolean) bd8Var.b.a(xzbVar2)).booleanValue() && Intrinsics.d(this.c.a(xzbVar), bd8Var.c.a(xzbVar2))) {
                szb szbVar = this.d;
                Uri uri = szbVar != null ? (Uri) szbVar.a(xzbVar) : null;
                szb szbVar2 = bd8Var.d;
                if (Intrinsics.d(uri, szbVar2 != null ? (Uri) szbVar2.a(xzbVar2) : null)) {
                    List list = bd8Var.e;
                    List list2 = this.e;
                    if (list2 != null) {
                        if (list != null) {
                            if (list2.size() == list.size()) {
                                int i = 0;
                                for (Object obj : list2) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        u75.n();
                                        throw null;
                                    }
                                    zc8 zc8Var = (zc8) list.get(i);
                                    zc8 zc8Var2 = (zc8) obj;
                                    if (zc8Var == null) {
                                        zc8Var2.getClass();
                                    } else {
                                        bd8 bd8Var2 = zc8Var2.a;
                                        bd8 bd8Var3 = zc8Var.a;
                                        if (bd8Var2 != null ? bd8Var2.a(bd8Var3, xzbVar, xzbVar2) : bd8Var3 == null) {
                                            List list3 = zc8Var2.b;
                                            List list4 = zc8Var.b;
                                            if (list3 != null) {
                                                if (list4 != null) {
                                                    if (list3.size() == list4.size()) {
                                                        int i3 = 0;
                                                        for (Object obj2 : list3) {
                                                            int i4 = i3 + 1;
                                                            if (i3 < 0) {
                                                                u75.n();
                                                                throw null;
                                                            }
                                                            if (((bd8) obj2).a((bd8) list4.get(i3), xzbVar, xzbVar2)) {
                                                                i3 = i4;
                                                            }
                                                        }
                                                        z2 = true;
                                                    }
                                                    z2 = false;
                                                    break;
                                                }
                                            }
                                            if (z2 && Intrinsics.d(zc8Var2.c.a(xzbVar), zc8Var.c.a(xzbVar2))) {
                                                z3 = true;
                                                if (!z3) {
                                                    i = i2;
                                                }
                                            }
                                        }
                                    }
                                    z3 = false;
                                    if (!z3) {
                                    }
                                }
                                z = true;
                            }
                            z = false;
                            break;
                        }
                    }
                    if (z && Intrinsics.d(this.f, bd8Var.f)) {
                        szb szbVar3 = this.g;
                        Uri uri2 = szbVar3 != null ? (Uri) szbVar3.a(xzbVar) : null;
                        szb szbVar4 = bd8Var.g;
                        if (Intrinsics.d(uri2, szbVar4 != null ? (Uri) szbVar4.a(xzbVar2) : null) && Intrinsics.d(this.h, bd8Var.h)) {
                            szb szbVar5 = this.i;
                            ad8 ad8Var = szbVar5 != null ? (ad8) szbVar5.a(xzbVar) : null;
                            szb szbVar6 = bd8Var.i;
                            if (ad8Var == (szbVar6 != null ? (ad8) szbVar6.a(xzbVar2) : null)) {
                                uk8 uk8Var = bd8Var.j;
                                uk8 uk8Var2 = this.j;
                                if (uk8Var2 != null ? uk8Var2.a(uk8Var, xzbVar, xzbVar2) : uk8Var == null) {
                                    szb szbVar7 = this.k;
                                    Uri uri3 = szbVar7 != null ? (Uri) szbVar7.a(xzbVar) : null;
                                    szb szbVar8 = bd8Var.k;
                                    if (Intrinsics.d(uri3, szbVar8 != null ? (Uri) szbVar8.a(xzbVar2) : null)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        int i2;
        Integer num = this.l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(bd8.class).hashCode();
        zw8 zw8Var = this.a;
        int hashCode2 = this.c.hashCode() + this.b.hashCode() + hashCode + (zw8Var != null ? zw8Var.b() : 0);
        szb szbVar = this.d;
        int hashCode3 = hashCode2 + (szbVar != null ? szbVar.hashCode() : 0);
        List<zc8> list = this.e;
        if (list != null) {
            i = 0;
            for (zc8 zc8Var : list) {
                Integer num2 = zc8Var.d;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    int hashCode4 = ern.a(zc8.class).hashCode();
                    bd8 bd8Var = zc8Var.a;
                    int i3 = 0;
                    int b = hashCode4 + (bd8Var != null ? bd8Var.b() : 0);
                    List list2 = zc8Var.b;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            i3 += ((bd8) it.next()).b();
                        }
                    }
                    int hashCode5 = b + i3 + zc8Var.c.hashCode();
                    zc8Var.d = Integer.valueOf(hashCode5);
                    i2 = hashCode5;
                }
                i += i2;
            }
        } else {
            i = 0;
        }
        int i4 = hashCode3 + i;
        JSONObject jSONObject = this.f;
        int hashCode6 = i4 + (jSONObject != null ? jSONObject.hashCode() : 0);
        szb szbVar2 = this.g;
        int hashCode7 = hashCode6 + (szbVar2 != null ? szbVar2.hashCode() : 0);
        String str = this.h;
        int hashCode8 = hashCode7 + (str != null ? str.hashCode() : 0);
        szb szbVar3 = this.i;
        int hashCode9 = hashCode8 + (szbVar3 != null ? szbVar3.hashCode() : 0);
        uk8 uk8Var = this.j;
        int b2 = hashCode9 + (uk8Var != null ? uk8Var.b() : 0);
        szb szbVar4 = this.k;
        int hashCode10 = b2 + (szbVar4 != null ? szbVar4.hashCode() : 0);
        this.l = Integer.valueOf(hashCode10);
        return hashCode10;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((kg8) rj3.b.t1.getValue()).b(rj3.a, this);
    }
}
