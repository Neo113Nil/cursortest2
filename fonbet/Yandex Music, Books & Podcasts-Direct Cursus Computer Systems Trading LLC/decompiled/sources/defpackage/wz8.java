package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wz8 implements u1f {
    public final List a;
    public final op8 b;
    public final vz8 c;
    public final List d;
    public final List e;
    public Integer f;

    public wz8(List list, op8 op8Var, vz8 vz8Var, List list2, List list3) {
        this.a = list;
        this.b = op8Var;
        this.c = vz8Var;
        this.d = list2;
        this.e = list3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0188, code lost:
    
        if (r9 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0143, code lost:
    
        if (r1 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00fd, code lost:
    
        if (r1 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0047, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fa, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4, r1 != null ? (java.lang.String) r1.a(r11) : null) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ff, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(wz8 wz8Var, xzb xzbVar, xzb xzbVar2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (wz8Var != null) {
            List list = wz8Var.a;
            List list2 = this.a;
            if (list2 != null) {
                if (list != null && list2.size() == list.size()) {
                    int i = 0;
                    for (Object obj : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            u75.n();
                            throw null;
                        }
                        if (!((mo8) obj).a((mo8) list.get(i), xzbVar, xzbVar2)) {
                            break;
                        }
                        i = i2;
                    }
                    op8 op8Var = wz8Var.b;
                    op8 op8Var2 = this.b;
                    if (op8Var2 != null ? op8Var2.a(op8Var, xzbVar, xzbVar2) : op8Var == null) {
                        vz8 vz8Var = wz8Var.c;
                        vz8 vz8Var2 = this.c;
                        if (vz8Var2 != null) {
                            if (vz8Var != null) {
                                szb szbVar = vz8Var2.a;
                                String str = szbVar != null ? (String) szbVar.a(xzbVar) : null;
                                szb szbVar2 = vz8Var.a;
                                if (Intrinsics.d(str, szbVar2 != null ? (String) szbVar2.a(xzbVar2) : null)) {
                                    szb szbVar3 = vz8Var2.b;
                                    String str2 = szbVar3 != null ? (String) szbVar3.a(xzbVar) : null;
                                    szb szbVar4 = vz8Var.b;
                                    if (Intrinsics.d(str2, szbVar4 != null ? (String) szbVar4.a(xzbVar2) : null)) {
                                        szb szbVar5 = vz8Var2.c;
                                        String str3 = szbVar5 != null ? (String) szbVar5.a(xzbVar) : null;
                                        szb szbVar6 = vz8Var.c;
                                        if (Intrinsics.d(str3, szbVar6 != null ? (String) szbVar6.a(xzbVar2) : null)) {
                                            szb szbVar7 = vz8Var2.d;
                                            String str4 = szbVar7 != null ? (String) szbVar7.a(xzbVar) : null;
                                            szb szbVar8 = vz8Var.d;
                                            if (Intrinsics.d(str4, szbVar8 != null ? (String) szbVar8.a(xzbVar2) : null)) {
                                                szb szbVar9 = vz8Var2.e;
                                                String str5 = szbVar9 != null ? (String) szbVar9.a(xzbVar) : null;
                                                szb szbVar10 = vz8Var.e;
                                            }
                                        }
                                    }
                                }
                            }
                            z = false;
                        }
                        if (z) {
                            List list3 = wz8Var.d;
                            List list4 = this.d;
                            if (list4 != null) {
                                if (list3 != null) {
                                    if (list4.size() == list3.size()) {
                                        int i3 = 0;
                                        for (Object obj2 : list4) {
                                            int i4 = i3 + 1;
                                            if (i3 < 0) {
                                                u75.n();
                                                throw null;
                                            }
                                            if (((bd8) obj2).a((bd8) list3.get(i3), xzbVar, xzbVar2)) {
                                                i3 = i4;
                                            }
                                        }
                                        z2 = true;
                                    }
                                    z2 = false;
                                    break;
                                }
                            }
                            if (z2) {
                                List list5 = wz8Var.e;
                                List list6 = this.e;
                                if (list6 != null) {
                                    if (list5 != null) {
                                        if (list6.size() == list5.size()) {
                                            int i5 = 0;
                                            for (Object obj3 : list6) {
                                                int i6 = i5 + 1;
                                                if (i5 < 0) {
                                                    u75.n();
                                                    throw null;
                                                }
                                                if (((bd8) obj3).a((bd8) list5.get(i5), xzbVar, xzbVar2)) {
                                                    i5 = i6;
                                                }
                                            }
                                            z3 = true;
                                        }
                                        z3 = false;
                                        break;
                                    }
                                }
                                if (z3) {
                                    return true;
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
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(wz8.class).hashCode();
        int i4 = 0;
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((mo8) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i5 = hashCode + i;
        op8 op8Var = this.b;
        int b = i5 + (op8Var != null ? op8Var.b() : 0);
        vz8 vz8Var = this.c;
        if (vz8Var != null) {
            Integer num2 = vz8Var.f;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                int hashCode2 = ern.a(vz8.class).hashCode();
                szb szbVar = vz8Var.a;
                int hashCode3 = hashCode2 + (szbVar != null ? szbVar.hashCode() : 0);
                szb szbVar2 = vz8Var.b;
                int hashCode4 = hashCode3 + (szbVar2 != null ? szbVar2.hashCode() : 0);
                szb szbVar3 = vz8Var.c;
                int hashCode5 = hashCode4 + (szbVar3 != null ? szbVar3.hashCode() : 0);
                szb szbVar4 = vz8Var.d;
                int hashCode6 = hashCode5 + (szbVar4 != null ? szbVar4.hashCode() : 0);
                szb szbVar5 = vz8Var.e;
                int hashCode7 = hashCode6 + (szbVar5 != null ? szbVar5.hashCode() : 0);
                vz8Var.f = Integer.valueOf(hashCode7);
                i2 = hashCode7;
            }
        } else {
            i2 = 0;
        }
        int i6 = b + i2;
        List list2 = this.d;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i3 = 0;
            while (it2.hasNext()) {
                i3 += ((bd8) it2.next()).b();
            }
        } else {
            i3 = 0;
        }
        int i7 = i6 + i3;
        List list3 = this.e;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                i4 += ((bd8) it3.next()).b();
            }
        }
        int i8 = i7 + i4;
        this.f = Integer.valueOf(i8);
        return i8;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((yz8) rj3.b.L3.getValue()).b(rj3.a, this);
    }
}
