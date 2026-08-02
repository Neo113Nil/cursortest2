package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class iu9 implements u1f {
    public final sm8 a;
    public final sm8 b;
    public final szb c;
    public final String d;
    public final szb e;
    public final jc8 f;
    public final szb g;
    public final String h;
    public final xu9 i;
    public final bf9 j;
    public final szb k;
    public final jc8 l;
    public final List m;
    public Integer n;

    public iu9(sm8 sm8Var, sm8 sm8Var2, szb szbVar, String str, szb szbVar2, jc8 jc8Var, szb szbVar3, String str2, xu9 xu9Var, bf9 bf9Var, szb szbVar4, jc8 jc8Var2, List list) {
        this.a = sm8Var;
        this.b = sm8Var2;
        this.c = szbVar;
        this.d = str;
        this.e = szbVar2;
        this.f = jc8Var;
        this.g = szbVar3;
        this.h = str2;
        this.i = xu9Var;
        this.j = bf9Var;
        this.k = szbVar4;
        this.l = jc8Var2;
        this.m = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0160, code lost:
    
        if (r8 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c5, code lost:
    
        if ((r3 instanceof defpackage.gv9 ? (defpackage.gv9) r3 : null) != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00c7, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00eb, code lost:
    
        if ((r3 instanceof defpackage.bv9 ? (defpackage.bv9) r3 : null) != null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(iu9 iu9Var, xzb xzbVar, xzb xzbVar2) {
        Object obj;
        boolean z;
        Object obj2;
        boolean z2;
        if (iu9Var != null) {
            sm8 sm8Var = iu9Var.a;
            sm8 sm8Var2 = this.a;
            if (sm8Var2 != null ? sm8Var2.a(sm8Var, xzbVar, xzbVar2) : sm8Var == null) {
                sm8 sm8Var3 = iu9Var.b;
                sm8 sm8Var4 = this.b;
                if (sm8Var4 != null ? sm8Var4.a(sm8Var3, xzbVar, xzbVar2) : sm8Var3 == null) {
                    szb szbVar = this.c;
                    String str = szbVar != null ? (String) szbVar.a(xzbVar) : null;
                    szb szbVar2 = iu9Var.c;
                    if (Intrinsics.d(str, szbVar2 != null ? (String) szbVar2.a(xzbVar2) : null) && Intrinsics.d(this.d, iu9Var.d) && ((Boolean) this.e.a(xzbVar)).booleanValue() == ((Boolean) iu9Var.e.a(xzbVar2)).booleanValue() && this.f.a(iu9Var.f, xzbVar, xzbVar2) && ((Number) this.g.a(xzbVar)).longValue() == ((Number) iu9Var.g.a(xzbVar2)).longValue() && Intrinsics.d(this.h, iu9Var.h)) {
                        xu9 xu9Var = iu9Var.i;
                        xu9 xu9Var2 = this.i;
                        xu9Var2.getClass();
                        if (xu9Var != null) {
                            if (!(xu9Var2 instanceof wu9)) {
                                if (!(xu9Var2 instanceof vu9)) {
                                    b6e.s();
                                    return false;
                                }
                                if (xu9Var instanceof wu9) {
                                    obj = ((wu9) xu9Var).b;
                                } else {
                                    if (!(xu9Var instanceof vu9)) {
                                        b6e.s();
                                        return false;
                                    }
                                    obj = ((vu9) xu9Var).b;
                                }
                            } else if (xu9Var instanceof wu9) {
                                obj2 = ((wu9) xu9Var).b;
                            } else {
                                if (!(xu9Var instanceof vu9)) {
                                    b6e.s();
                                    return false;
                                }
                                obj2 = ((vu9) xu9Var).b;
                            }
                            if (z) {
                                bf9 bf9Var = iu9Var.j;
                                bf9 bf9Var2 = this.j;
                                if ((bf9Var2 != null ? bf9Var2.a(bf9Var, xzbVar, xzbVar2) : bf9Var == null) && this.k.a(xzbVar) == iu9Var.k.a(xzbVar2)) {
                                    jc8 jc8Var = iu9Var.l;
                                    jc8 jc8Var2 = this.l;
                                    if (jc8Var2 != null ? jc8Var2.a(jc8Var, xzbVar, xzbVar2) : jc8Var == null) {
                                        List list = iu9Var.m;
                                        List list2 = this.m;
                                        if (list2 != null) {
                                            if (list != null) {
                                                if (list2.size() == list.size()) {
                                                    int i = 0;
                                                    for (Object obj3 : list2) {
                                                        int i2 = i + 1;
                                                        if (i < 0) {
                                                            u75.n();
                                                            throw null;
                                                        }
                                                        if (((bd8) obj3).a((bd8) list.get(i), xzbVar, xzbVar2)) {
                                                            i = i2;
                                                        }
                                                    }
                                                    z2 = true;
                                                }
                                                z2 = false;
                                                break;
                                            }
                                        }
                                        if (z2) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        int hashCode;
        int intValue;
        Integer num = this.n;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = ern.a(iu9.class).hashCode();
        int i2 = 0;
        sm8 sm8Var = this.a;
        int b = hashCode2 + (sm8Var != null ? sm8Var.b() : 0);
        sm8 sm8Var2 = this.b;
        int b2 = b + (sm8Var2 != null ? sm8Var2.b() : 0);
        szb szbVar = this.c;
        int hashCode3 = b2 + (szbVar != null ? szbVar.hashCode() : 0);
        String str = this.d;
        int hashCode4 = this.h.hashCode() + this.g.hashCode() + this.f.b() + this.e.hashCode() + hashCode3 + (str != null ? str.hashCode() : 0);
        xu9 xu9Var = this.i;
        Integer num2 = xu9Var.a;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            int hashCode5 = ern.a(xu9Var.getClass()).hashCode();
            if (xu9Var instanceof wu9) {
                gv9 gv9Var = ((wu9) xu9Var).b;
                Integer num3 = gv9Var.a;
                if (num3 != null) {
                    intValue = num3.intValue();
                    int i3 = hashCode5 + intValue;
                    xu9Var.a = Integer.valueOf(i3);
                    i = i3;
                } else {
                    hashCode = ern.a(gv9.class).hashCode();
                    gv9Var.a = Integer.valueOf(hashCode);
                    intValue = hashCode;
                    int i32 = hashCode5 + intValue;
                    xu9Var.a = Integer.valueOf(i32);
                    i = i32;
                }
            } else if (xu9Var instanceof vu9) {
                bv9 bv9Var = ((vu9) xu9Var).b;
                Integer num4 = bv9Var.a;
                if (num4 != null) {
                    intValue = num4.intValue();
                    int i322 = hashCode5 + intValue;
                    xu9Var.a = Integer.valueOf(i322);
                    i = i322;
                } else {
                    hashCode = ern.a(bv9.class).hashCode();
                    bv9Var.a = Integer.valueOf(hashCode);
                    intValue = hashCode;
                    int i3222 = hashCode5 + intValue;
                    xu9Var.a = Integer.valueOf(i3222);
                    i = i3222;
                }
            } else {
                b6e.s();
                i = 0;
            }
        }
        int i4 = i + hashCode4;
        bf9 bf9Var = this.j;
        int hashCode6 = this.k.hashCode() + i4 + (bf9Var != null ? bf9Var.b() : 0);
        jc8 jc8Var = this.l;
        int b3 = hashCode6 + (jc8Var != null ? jc8Var.b() : 0);
        List list = this.m;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i2 += ((bd8) it.next()).b();
            }
        }
        int i5 = b3 + i2;
        this.n = Integer.valueOf(i5);
        return i5;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((ru9) rj3.b.n9.getValue()).b(rj3.a, this);
    }
}
