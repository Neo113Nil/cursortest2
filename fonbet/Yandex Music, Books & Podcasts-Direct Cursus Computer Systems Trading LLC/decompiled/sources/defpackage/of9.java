package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class of9 implements u1f {
    public final rf9 a;
    public final rf9 b;
    public final List c;
    public final vzb d;
    public final mg9 e;
    public Integer f;

    public of9(rf9 rf9Var, rf9 rf9Var2, List list, vzb vzbVar, mg9 mg9Var) {
        this.a = rf9Var;
        this.b = rf9Var2;
        this.c = list;
        this.d = vzbVar;
        this.e = mg9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x00e0, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0091, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(of9 of9Var, xzb xzbVar, xzb xzbVar2) {
        Object obj;
        boolean z;
        Object obj2;
        List a;
        List a2;
        if (of9Var != null) {
            vzb vzbVar = of9Var.d;
            if (this.a.a(of9Var.a, xzbVar, xzbVar2) && this.b.a(of9Var.b, xzbVar, xzbVar2)) {
                List list = of9Var.c;
                List list2 = this.c;
                if (list2 != null) {
                    if (list != null && list2.size() == list.size()) {
                        int i = 0;
                        for (Object obj3 : list2) {
                            int i2 = i + 1;
                            if (i < 0) {
                                u75.n();
                                throw null;
                            }
                            nf9 nf9Var = (nf9) list.get(i);
                            nf9 nf9Var2 = (nf9) obj3;
                            if (nf9Var == null) {
                                nf9Var2.getClass();
                                return false;
                            }
                            if (((Number) nf9Var2.a.a(xzbVar)).intValue() != ((Number) nf9Var.a.a(xzbVar2)).intValue() || ((Number) nf9Var2.b.a(xzbVar)).doubleValue() != ((Number) nf9Var.b.a(xzbVar2)).doubleValue()) {
                                break;
                            }
                            i = i2;
                        }
                        vzb vzbVar2 = this.d;
                        if (vzbVar2 != null && (a = vzbVar2.a(xzbVar)) != null) {
                            if (vzbVar != null && (a2 = vzbVar.a(xzbVar2)) != null && a.size() == a2.size()) {
                                int i3 = 0;
                                for (Object obj4 : a) {
                                    int i4 = i3 + 1;
                                    if (i3 < 0) {
                                        u75.n();
                                        throw null;
                                    }
                                    if (((Number) obj4).intValue() != ((Number) a2.get(i3)).intValue()) {
                                        break;
                                    }
                                    i3 = i4;
                                }
                                mg9 mg9Var = of9Var.e;
                                mg9 mg9Var2 = this.e;
                                mg9Var2.getClass();
                                if (mg9Var != null) {
                                    if (mg9Var2 instanceof kg9) {
                                        jz8 jz8Var = ((kg9) mg9Var2).b;
                                        if (mg9Var instanceof kg9) {
                                            obj2 = ((kg9) mg9Var).b;
                                        } else {
                                            if (!(mg9Var instanceof lg9)) {
                                                b6e.s();
                                                return false;
                                            }
                                            obj2 = ((lg9) mg9Var).b;
                                        }
                                        z = jz8Var.a(obj2 instanceof jz8 ? (jz8) obj2 : null, xzbVar, xzbVar2);
                                    } else {
                                        if (!(mg9Var2 instanceof lg9)) {
                                            b6e.s();
                                            return false;
                                        }
                                        zg9 zg9Var = ((lg9) mg9Var2).b;
                                        if (mg9Var instanceof kg9) {
                                            obj = ((kg9) mg9Var).b;
                                        } else {
                                            if (!(mg9Var instanceof lg9)) {
                                                b6e.s();
                                                return false;
                                            }
                                            obj = ((lg9) mg9Var).b;
                                        }
                                        zg9 zg9Var2 = obj instanceof zg9 ? (zg9) obj : null;
                                        if (zg9Var2 != null && zg9Var.a.a(xzbVar) == zg9Var2.a.a(xzbVar2)) {
                                            z = true;
                                        }
                                    }
                                    if (!z) {
                                        return true;
                                    }
                                }
                                z = false;
                                if (!z) {
                                    break;
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
        int i3;
        int i4;
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int b = this.b.b() + this.a.b() + ern.a(of9.class).hashCode();
        List<nf9> list = this.c;
        if (list != null) {
            i = 0;
            for (nf9 nf9Var : list) {
                Integer num2 = nf9Var.c;
                if (num2 != null) {
                    i4 = num2.intValue();
                } else {
                    int hashCode = nf9Var.b.hashCode() + nf9Var.a.hashCode() + ern.a(nf9.class).hashCode();
                    nf9Var.c = Integer.valueOf(hashCode);
                    i4 = hashCode;
                }
                i += i4;
            }
        } else {
            i = 0;
        }
        int i5 = b + i;
        vzb vzbVar = this.d;
        int hashCode2 = i5 + (vzbVar != null ? vzbVar.hashCode() : 0);
        mg9 mg9Var = this.e;
        Integer num3 = mg9Var.a;
        if (num3 != null) {
            i2 = num3.intValue();
        } else {
            int hashCode3 = ern.a(mg9Var.getClass()).hashCode();
            if (mg9Var instanceof kg9) {
                i3 = ((kg9) mg9Var).b.b();
            } else if (mg9Var instanceof lg9) {
                zg9 zg9Var = ((lg9) mg9Var).b;
                Integer num4 = zg9Var.b;
                if (num4 != null) {
                    i3 = num4.intValue();
                } else {
                    int hashCode4 = zg9Var.a.hashCode() + ern.a(zg9.class).hashCode();
                    zg9Var.b = Integer.valueOf(hashCode4);
                    i3 = hashCode4;
                }
            } else {
                b6e.s();
                i2 = 0;
            }
            int i6 = hashCode3 + i3;
            mg9Var.a = Integer.valueOf(i6);
            i2 = i6;
        }
        int i7 = i2 + hashCode2;
        this.f = Integer.valueOf(i7);
        return i7;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((gg9) rj3.b.D6.getValue()).b(rj3.a, this);
    }
}
