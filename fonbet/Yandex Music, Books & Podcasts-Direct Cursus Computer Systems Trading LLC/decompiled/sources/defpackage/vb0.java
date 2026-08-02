package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class vb0 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb0 b;

    public /* synthetic */ vb0(xb0 xb0Var, int i) {
        this.a = i;
        this.b = xb0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0464, code lost:
    
        if (r1 == r12) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x043f, code lost:
    
        if (r1 == r12) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x041a, code lost:
    
        if (r1 != r12) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03c6, code lost:
    
        if (r1 == r12) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02f1, code lost:
    
        if (r1 == r12) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        ub0 ub0Var;
        cvl cvlVar;
        Object a;
        int i;
        Object i2;
        int i3;
        int i4;
        int i5;
        cvl cvlVar2;
        int i6;
        Object c;
        int i7;
        int i8;
        Object h;
        cvl cvlVar3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object V;
        int i15;
        cvl cvlVar4;
        wb0 wb0Var;
        xb0 xb0Var;
        List list;
        String str;
        Object e;
        String str2;
        Object b;
        int i16;
        String str3;
        Object g;
        int i17;
        int i18;
        Object d;
        int i19;
        int i20;
        Object a2;
        int i21;
        int i22;
        Object e2;
        int i23;
        int i24 = this.a;
        xb0 xb0Var2 = this.b;
        switch (i24) {
            case 0:
                y42 y42Var = xb0Var2.b;
                if (continuation instanceof ub0) {
                    ub0Var = (ub0) continuation;
                    int i25 = ub0Var.s;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        ub0Var.s = i25 - Integer.MIN_VALUE;
                        Object obj = ub0Var.q;
                        Object obj2 = nm6.a;
                        switch (ub0Var.s) {
                            case 0:
                                qgg.h0(obj);
                                ub0Var.s = 1;
                                String a3 = y42Var.a();
                                a3.getClass();
                                rtl rtlVar = (rtl) y42Var.a.k.getValue();
                                y42Var.a().getClass();
                                obj = rtlVar.d(a3, new nvl(y42Var.a(), "3"), true, ub0Var);
                                break;
                            case 1:
                                qgg.h0(obj);
                                cvl cvlVar5 = (cvl) obj;
                                Integer num = new Integer(1);
                                ub0Var.j = cvlVar5;
                                ub0Var.s = 2;
                                Object b2 = y42Var.b(num, ub0Var);
                                if (b2 != obj2) {
                                    cvlVar = cvlVar5;
                                    obj = b2;
                                    int i26 = !((Collection) obj).isEmpty() ? 1 : 0;
                                    ub0Var.j = cvlVar;
                                    ub0Var.k = i26;
                                    ub0Var.s = 3;
                                    String a4 = y42Var.a();
                                    a4.getClass();
                                    a = ((yc0) y42Var.c.getValue()).a(a4, ub0Var);
                                    if (a != obj2) {
                                        a = (List) a;
                                    }
                                    if (a != obj2) {
                                        Object obj3 = a;
                                        i = i26;
                                        obj = obj3;
                                        int i27 = !((Collection) obj).isEmpty() ? 1 : 0;
                                        Integer num2 = new Integer(1);
                                        ub0Var.j = cvlVar;
                                        ub0Var.k = i;
                                        ub0Var.l = i27;
                                        ub0Var.s = 4;
                                        i2 = y42Var.i(num2, ub0Var);
                                        if (i2 != obj2) {
                                            i3 = i27;
                                            obj = i2;
                                            if (((Collection) obj).isEmpty()) {
                                                Integer num3 = new Integer(1);
                                                ub0Var.j = cvlVar;
                                                ub0Var.k = i;
                                                ub0Var.l = i3;
                                                ub0Var.s = 5;
                                                obj = y42Var.e(num3, ub0Var);
                                                if (obj != obj2) {
                                                    i4 = i3;
                                                    i5 = i;
                                                    cvlVar2 = cvlVar;
                                                    if (!((Collection) obj).isEmpty()) {
                                                        i6 = 0;
                                                        Integer num4 = new Integer(1);
                                                        ub0Var.j = cvlVar2;
                                                        ub0Var.k = i5;
                                                        ub0Var.l = i4;
                                                        ub0Var.m = i6;
                                                        ub0Var.s = 6;
                                                        c = y42Var.c(num4, ub0Var);
                                                        if (c != obj2) {
                                                            i7 = i6;
                                                            obj = c;
                                                            if (((Collection) obj).isEmpty()) {
                                                                Integer num5 = new Integer(1);
                                                                ub0Var.j = cvlVar2;
                                                                ub0Var.k = i5;
                                                                ub0Var.l = i4;
                                                                ub0Var.m = i7;
                                                                ub0Var.s = 7;
                                                                obj = y42Var.d(num5, ub0Var);
                                                                break;
                                                            }
                                                            i8 = 1;
                                                            i82 i82Var = xb0Var2.c;
                                                            Integer num6 = new Integer(1);
                                                            ub0Var.j = cvlVar2;
                                                            ub0Var.k = i5;
                                                            ub0Var.l = i4;
                                                            ub0Var.m = i7;
                                                            ub0Var.n = i8;
                                                            ub0Var.s = 8;
                                                            h = i82Var.h(num6, ub0Var);
                                                            if (h != obj2) {
                                                                cvlVar3 = cvlVar2;
                                                                i9 = i4;
                                                                i10 = i8;
                                                                obj = h;
                                                                i11 = i5;
                                                                i12 = i7;
                                                                i13 = !((Collection) obj).isEmpty() ? 1 : 0;
                                                                Integer num7 = new Integer(1);
                                                                ub0Var.j = cvlVar3;
                                                                ub0Var.k = i11;
                                                                ub0Var.l = i9;
                                                                ub0Var.m = i12;
                                                                ub0Var.n = i10;
                                                                ub0Var.o = i13;
                                                                ub0Var.s = 9;
                                                                obj = y42Var.f(num7, ub0Var);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        cvlVar = cvlVar2;
                                                        i = i5;
                                                        i3 = i4;
                                                    }
                                                }
                                            }
                                            i4 = i3;
                                            i5 = i;
                                            cvlVar2 = cvlVar;
                                            i6 = 1;
                                            Integer num42 = new Integer(1);
                                            ub0Var.j = cvlVar2;
                                            ub0Var.k = i5;
                                            ub0Var.l = i4;
                                            ub0Var.m = i6;
                                            ub0Var.s = 6;
                                            c = y42Var.c(num42, ub0Var);
                                            if (c != obj2) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 2:
                                cvlVar = ub0Var.j;
                                qgg.h0(obj);
                                int i262 = !((Collection) obj).isEmpty() ? 1 : 0;
                                ub0Var.j = cvlVar;
                                ub0Var.k = i262;
                                ub0Var.s = 3;
                                String a42 = y42Var.a();
                                a42.getClass();
                                a = ((yc0) y42Var.c.getValue()).a(a42, ub0Var);
                                if (a != obj2) {
                                }
                                if (a != obj2) {
                                }
                                break;
                            case 3:
                                i = ub0Var.k;
                                cvlVar = ub0Var.j;
                                qgg.h0(obj);
                                int i272 = !((Collection) obj).isEmpty() ? 1 : 0;
                                Integer num22 = new Integer(1);
                                ub0Var.j = cvlVar;
                                ub0Var.k = i;
                                ub0Var.l = i272;
                                ub0Var.s = 4;
                                i2 = y42Var.i(num22, ub0Var);
                                if (i2 != obj2) {
                                }
                                break;
                            case 4:
                                i3 = ub0Var.l;
                                i = ub0Var.k;
                                cvlVar = ub0Var.j;
                                qgg.h0(obj);
                                if (((Collection) obj).isEmpty()) {
                                }
                                i4 = i3;
                                i5 = i;
                                cvlVar2 = cvlVar;
                                i6 = 1;
                                Integer num422 = new Integer(1);
                                ub0Var.j = cvlVar2;
                                ub0Var.k = i5;
                                ub0Var.l = i4;
                                ub0Var.m = i6;
                                ub0Var.s = 6;
                                c = y42Var.c(num422, ub0Var);
                                if (c != obj2) {
                                }
                                break;
                            case 5:
                                i4 = ub0Var.l;
                                i5 = ub0Var.k;
                                cvlVar2 = ub0Var.j;
                                qgg.h0(obj);
                                if (!((Collection) obj).isEmpty()) {
                                }
                                break;
                            case 6:
                                i7 = ub0Var.m;
                                i4 = ub0Var.l;
                                i5 = ub0Var.k;
                                cvlVar2 = ub0Var.j;
                                qgg.h0(obj);
                                if (((Collection) obj).isEmpty()) {
                                }
                                i8 = 1;
                                i82 i82Var2 = xb0Var2.c;
                                Integer num62 = new Integer(1);
                                ub0Var.j = cvlVar2;
                                ub0Var.k = i5;
                                ub0Var.l = i4;
                                ub0Var.m = i7;
                                ub0Var.n = i8;
                                ub0Var.s = 8;
                                h = i82Var2.h(num62, ub0Var);
                                if (h != obj2) {
                                }
                                break;
                            case 7:
                                i7 = ub0Var.m;
                                i4 = ub0Var.l;
                                i5 = ub0Var.k;
                                cvlVar2 = ub0Var.j;
                                qgg.h0(obj);
                                if (((Collection) obj).isEmpty()) {
                                    i8 = 0;
                                    i82 i82Var22 = xb0Var2.c;
                                    Integer num622 = new Integer(1);
                                    ub0Var.j = cvlVar2;
                                    ub0Var.k = i5;
                                    ub0Var.l = i4;
                                    ub0Var.m = i7;
                                    ub0Var.n = i8;
                                    ub0Var.s = 8;
                                    h = i82Var22.h(num622, ub0Var);
                                    if (h != obj2) {
                                    }
                                    break;
                                }
                                i8 = 1;
                                i82 i82Var222 = xb0Var2.c;
                                Integer num6222 = new Integer(1);
                                ub0Var.j = cvlVar2;
                                ub0Var.k = i5;
                                ub0Var.l = i4;
                                ub0Var.m = i7;
                                ub0Var.n = i8;
                                ub0Var.s = 8;
                                h = i82Var222.h(num6222, ub0Var);
                                if (h != obj2) {
                                }
                                break;
                            case 8:
                                int i28 = ub0Var.n;
                                int i29 = ub0Var.m;
                                int i30 = ub0Var.l;
                                int i31 = ub0Var.k;
                                cvl cvlVar6 = ub0Var.j;
                                qgg.h0(obj);
                                cvlVar3 = cvlVar6;
                                i11 = i31;
                                i9 = i30;
                                i12 = i29;
                                i10 = i28;
                                i13 = !((Collection) obj).isEmpty() ? 1 : 0;
                                Integer num72 = new Integer(1);
                                ub0Var.j = cvlVar3;
                                ub0Var.k = i11;
                                ub0Var.l = i9;
                                ub0Var.m = i12;
                                ub0Var.n = i10;
                                ub0Var.o = i13;
                                ub0Var.s = 9;
                                obj = y42Var.f(num72, ub0Var);
                                break;
                            case 9:
                                i13 = ub0Var.o;
                                i10 = ub0Var.n;
                                i12 = ub0Var.m;
                                i9 = ub0Var.l;
                                i11 = ub0Var.k;
                                cvlVar3 = ub0Var.j;
                                qgg.h0(obj);
                                if (((Collection) obj).isEmpty()) {
                                    Integer num8 = new Integer(1);
                                    ub0Var.j = cvlVar3;
                                    ub0Var.k = i11;
                                    ub0Var.l = i9;
                                    ub0Var.m = i12;
                                    ub0Var.n = i10;
                                    ub0Var.o = i13;
                                    ub0Var.s = 10;
                                    obj = y42Var.g(num8, ub0Var);
                                    break;
                                }
                                i14 = 1;
                                Integer num9 = new Integer(1);
                                ub0Var.j = cvlVar3;
                                ub0Var.k = i11;
                                ub0Var.l = i9;
                                ub0Var.m = i12;
                                ub0Var.n = i10;
                                ub0Var.o = i13;
                                ub0Var.p = i14;
                                ub0Var.s = 12;
                                y42Var.a().getClass();
                                e15 e15Var = (e15) ((sb0) y42Var.a.m.getValue()).b.getValue();
                                e15Var.getClass();
                                V = x97.V(dm6.b, new e05(e15Var, num9, (Continuation) null), ub0Var);
                                if (V != obj2) {
                                    i15 = i14;
                                    obj = V;
                                    cvlVar4 = cvlVar3;
                                    boolean z = !((Collection) obj).isEmpty();
                                    xdr xdrVar = xb0Var2.f;
                                    u35 u35Var = new u35(cvlVar4, i9 == 0, i11 == 0, i10 == 0, i12 == 0, i15 == 0, i13 == 0, z);
                                    xdrVar.getClass();
                                    xdrVar.m(null, u35Var);
                                    break;
                                }
                                break;
                            case 10:
                                i13 = ub0Var.o;
                                i10 = ub0Var.n;
                                i12 = ub0Var.m;
                                i9 = ub0Var.l;
                                i11 = ub0Var.k;
                                cvlVar3 = ub0Var.j;
                                qgg.h0(obj);
                                if (((Collection) obj).isEmpty()) {
                                    Integer num10 = new Integer(1);
                                    ub0Var.j = cvlVar3;
                                    ub0Var.k = i11;
                                    ub0Var.l = i9;
                                    ub0Var.m = i12;
                                    ub0Var.n = i10;
                                    ub0Var.o = i13;
                                    ub0Var.s = 11;
                                    obj = y42Var.h(num10, ub0Var);
                                    break;
                                }
                                i14 = 1;
                                Integer num92 = new Integer(1);
                                ub0Var.j = cvlVar3;
                                ub0Var.k = i11;
                                ub0Var.l = i9;
                                ub0Var.m = i12;
                                ub0Var.n = i10;
                                ub0Var.o = i13;
                                ub0Var.p = i14;
                                ub0Var.s = 12;
                                y42Var.a().getClass();
                                e15 e15Var2 = (e15) ((sb0) y42Var.a.m.getValue()).b.getValue();
                                e15Var2.getClass();
                                V = x97.V(dm6.b, new e05(e15Var2, num92, (Continuation) null), ub0Var);
                                if (V != obj2) {
                                }
                                break;
                            case 11:
                                i13 = ub0Var.o;
                                i10 = ub0Var.n;
                                i12 = ub0Var.m;
                                i9 = ub0Var.l;
                                i11 = ub0Var.k;
                                cvlVar3 = ub0Var.j;
                                qgg.h0(obj);
                                if (((Collection) obj).isEmpty()) {
                                    i14 = 0;
                                    Integer num922 = new Integer(1);
                                    ub0Var.j = cvlVar3;
                                    ub0Var.k = i11;
                                    ub0Var.l = i9;
                                    ub0Var.m = i12;
                                    ub0Var.n = i10;
                                    ub0Var.o = i13;
                                    ub0Var.p = i14;
                                    ub0Var.s = 12;
                                    y42Var.a().getClass();
                                    e15 e15Var22 = (e15) ((sb0) y42Var.a.m.getValue()).b.getValue();
                                    e15Var22.getClass();
                                    V = x97.V(dm6.b, new e05(e15Var22, num922, (Continuation) null), ub0Var);
                                    if (V != obj2) {
                                    }
                                    break;
                                }
                                i14 = 1;
                                Integer num9222 = new Integer(1);
                                ub0Var.j = cvlVar3;
                                ub0Var.k = i11;
                                ub0Var.l = i9;
                                ub0Var.m = i12;
                                ub0Var.n = i10;
                                ub0Var.o = i13;
                                ub0Var.p = i14;
                                ub0Var.s = 12;
                                y42Var.a().getClass();
                                e15 e15Var222 = (e15) ((sb0) y42Var.a.m.getValue()).b.getValue();
                                e15Var222.getClass();
                                V = x97.V(dm6.b, new e05(e15Var222, num9222, (Continuation) null), ub0Var);
                                if (V != obj2) {
                                }
                                break;
                            case 12:
                                i15 = ub0Var.p;
                                i13 = ub0Var.o;
                                i10 = ub0Var.n;
                                i12 = ub0Var.m;
                                i9 = ub0Var.l;
                                i11 = ub0Var.k;
                                cvl cvlVar7 = ub0Var.j;
                                qgg.h0(obj);
                                cvlVar4 = cvlVar7;
                                boolean z2 = !((Collection) obj).isEmpty();
                                xdr xdrVar2 = xb0Var2.f;
                                u35 u35Var2 = new u35(cvlVar4, i9 == 0, i11 == 0, i10 == 0, i12 == 0, i15 == 0, i13 == 0, z2);
                                xdrVar2.getClass();
                                xdrVar2.m(null, u35Var2);
                                break;
                            default:
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                break;
                        }
                    }
                }
                ub0Var = new ub0(this, continuation);
                Object obj4 = ub0Var.q;
                Object obj22 = nm6.a;
                switch (ub0Var.s) {
                }
            default:
                i82 i82Var3 = xb0Var2.c;
                if (continuation instanceof wb0) {
                    wb0Var = (wb0) continuation;
                    int i32 = wb0Var.r;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        wb0Var.r = i32 - Integer.MIN_VALUE;
                        Object obj5 = wb0Var.p;
                        Object obj6 = nm6.a;
                        switch (wb0Var.r) {
                            case 0:
                                qgg.h0(obj5);
                                wb0Var.j = xb0Var2;
                                wb0Var.k = 0;
                                wb0Var.r = 1;
                                obj5 = i82Var3.h(null, wb0Var);
                                if (obj5 != obj6) {
                                    xb0Var = xb0Var2;
                                    list = (List) obj5;
                                    if (list.isEmpty()) {
                                        c62 c62Var = xb0Var.a;
                                        b72 b72Var = b72.b;
                                        c62Var.a("DOWNLOADED_TRACKS_BLOCK_MEDIA_ID", list);
                                        str = ((mqs) CollectionsKt.Q(list)).a;
                                    } else {
                                        str = null;
                                    }
                                    Integer num11 = new Integer(1);
                                    wb0Var.j = str;
                                    wb0Var.r = 2;
                                    String a5 = i82Var3.a();
                                    a5.getClass();
                                    e = ((oga) i82Var3.a.h.getValue()).e(a5, Boolean.FALSE, num11, wb0Var);
                                    if (e != obj6) {
                                        e = (List) e;
                                    }
                                    if (e != obj6) {
                                        Object obj7 = e;
                                        str2 = str;
                                        obj5 = obj7;
                                        int i33 = !((Collection) obj5).isEmpty() ? 1 : 0;
                                        Integer num12 = new Integer(1);
                                        wb0Var.j = str2;
                                        wb0Var.k = i33;
                                        wb0Var.r = 3;
                                        b = i82Var3.b(num12, wb0Var);
                                        if (b != obj6) {
                                            String str4 = str2;
                                            i16 = i33;
                                            obj5 = b;
                                            str3 = str4;
                                            int i34 = !((Collection) obj5).isEmpty() ? 1 : 0;
                                            Integer num13 = new Integer(1);
                                            wb0Var.j = str3;
                                            wb0Var.k = i16;
                                            wb0Var.l = i34;
                                            wb0Var.r = 4;
                                            g = i82Var3.g(num13, null, wb0Var);
                                            if (g != obj6) {
                                                int i35 = i16;
                                                i17 = i34;
                                                obj5 = g;
                                                i18 = i35;
                                                int i36 = !((Collection) obj5).isEmpty() ? 1 : 0;
                                                Integer num14 = new Integer(1);
                                                wb0Var.j = str3;
                                                wb0Var.k = i18;
                                                wb0Var.l = i17;
                                                wb0Var.m = i36;
                                                wb0Var.r = 5;
                                                d = i82Var3.d(num14, null, wb0Var);
                                                if (d != obj6) {
                                                    int i37 = i17;
                                                    i19 = i36;
                                                    obj5 = d;
                                                    i20 = i37;
                                                    int i38 = !((Collection) obj5).isEmpty() ? 1 : 0;
                                                    Integer num15 = new Integer(1);
                                                    wb0Var.j = str3;
                                                    wb0Var.k = i18;
                                                    wb0Var.l = i20;
                                                    wb0Var.m = i19;
                                                    wb0Var.n = i38;
                                                    wb0Var.r = 6;
                                                    i82Var3.a().getClass();
                                                    a2 = ((sb0) i82Var3.a.m.getValue()).a(num15, wb0Var);
                                                    if (a2 != obj6) {
                                                        a2 = (List) a2;
                                                    }
                                                    if (a2 != obj6) {
                                                        int i39 = i19;
                                                        i21 = i38;
                                                        obj5 = a2;
                                                        i22 = i39;
                                                        int i40 = !((Collection) obj5).isEmpty() ? 1 : 0;
                                                        Integer num16 = new Integer(1);
                                                        wb0Var.j = str3;
                                                        wb0Var.k = i18;
                                                        wb0Var.l = i20;
                                                        wb0Var.m = i22;
                                                        wb0Var.n = i21;
                                                        wb0Var.o = i40;
                                                        wb0Var.r = 7;
                                                        e2 = i82Var3.e(num16, null, wb0Var);
                                                        if (e2 != obj6) {
                                                            i23 = i40;
                                                            obj5 = e2;
                                                            String str5 = str3;
                                                            boolean z3 = !((Collection) obj5).isEmpty();
                                                            xdr xdrVar3 = xb0Var2.i;
                                                            eia eiaVar = new eia(str5, i18 == 0, i20 == 0, i21 == 0, i22 == 0, z3, i23 == 0);
                                                            xdrVar3.getClass();
                                                            xdrVar3.m(null, eiaVar);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 1:
                                xb0Var = (xb0) wb0Var.j;
                                qgg.h0(obj5);
                                list = (List) obj5;
                                if (list.isEmpty()) {
                                }
                                Integer num112 = new Integer(1);
                                wb0Var.j = str;
                                wb0Var.r = 2;
                                String a52 = i82Var3.a();
                                a52.getClass();
                                e = ((oga) i82Var3.a.h.getValue()).e(a52, Boolean.FALSE, num112, wb0Var);
                                if (e != obj6) {
                                }
                                if (e != obj6) {
                                }
                                break;
                            case 2:
                                str2 = (String) wb0Var.j;
                                qgg.h0(obj5);
                                int i332 = !((Collection) obj5).isEmpty() ? 1 : 0;
                                Integer num122 = new Integer(1);
                                wb0Var.j = str2;
                                wb0Var.k = i332;
                                wb0Var.r = 3;
                                b = i82Var3.b(num122, wb0Var);
                                if (b != obj6) {
                                }
                                break;
                            case 3:
                                i16 = wb0Var.k;
                                str3 = (String) wb0Var.j;
                                qgg.h0(obj5);
                                int i342 = !((Collection) obj5).isEmpty() ? 1 : 0;
                                Integer num132 = new Integer(1);
                                wb0Var.j = str3;
                                wb0Var.k = i16;
                                wb0Var.l = i342;
                                wb0Var.r = 4;
                                g = i82Var3.g(num132, null, wb0Var);
                                if (g != obj6) {
                                }
                                break;
                            case 4:
                                i17 = wb0Var.l;
                                i18 = wb0Var.k;
                                str3 = (String) wb0Var.j;
                                qgg.h0(obj5);
                                int i362 = !((Collection) obj5).isEmpty() ? 1 : 0;
                                Integer num142 = new Integer(1);
                                wb0Var.j = str3;
                                wb0Var.k = i18;
                                wb0Var.l = i17;
                                wb0Var.m = i362;
                                wb0Var.r = 5;
                                d = i82Var3.d(num142, null, wb0Var);
                                if (d != obj6) {
                                }
                                break;
                            case 5:
                                i19 = wb0Var.m;
                                i20 = wb0Var.l;
                                i18 = wb0Var.k;
                                str3 = (String) wb0Var.j;
                                qgg.h0(obj5);
                                int i382 = !((Collection) obj5).isEmpty() ? 1 : 0;
                                Integer num152 = new Integer(1);
                                wb0Var.j = str3;
                                wb0Var.k = i18;
                                wb0Var.l = i20;
                                wb0Var.m = i19;
                                wb0Var.n = i382;
                                wb0Var.r = 6;
                                i82Var3.a().getClass();
                                a2 = ((sb0) i82Var3.a.m.getValue()).a(num152, wb0Var);
                                if (a2 != obj6) {
                                }
                                if (a2 != obj6) {
                                }
                                break;
                            case 6:
                                i21 = wb0Var.n;
                                i22 = wb0Var.m;
                                i20 = wb0Var.l;
                                i18 = wb0Var.k;
                                str3 = (String) wb0Var.j;
                                qgg.h0(obj5);
                                int i402 = !((Collection) obj5).isEmpty() ? 1 : 0;
                                Integer num162 = new Integer(1);
                                wb0Var.j = str3;
                                wb0Var.k = i18;
                                wb0Var.l = i20;
                                wb0Var.m = i22;
                                wb0Var.n = i21;
                                wb0Var.o = i402;
                                wb0Var.r = 7;
                                e2 = i82Var3.e(num162, null, wb0Var);
                                if (e2 != obj6) {
                                }
                                break;
                            case 7:
                                i23 = wb0Var.o;
                                i21 = wb0Var.n;
                                i22 = wb0Var.m;
                                i20 = wb0Var.l;
                                i18 = wb0Var.k;
                                str3 = (String) wb0Var.j;
                                qgg.h0(obj5);
                                String str52 = str3;
                                boolean z32 = !((Collection) obj5).isEmpty();
                                xdr xdrVar32 = xb0Var2.i;
                                eia eiaVar2 = new eia(str52, i18 == 0, i20 == 0, i21 == 0, i22 == 0, z32, i23 == 0);
                                xdrVar32.getClass();
                                xdrVar32.m(null, eiaVar2);
                                break;
                            default:
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                break;
                        }
                    }
                }
                wb0Var = new wb0(this, continuation);
                Object obj52 = wb0Var.p;
                Object obj62 = nm6.a;
                switch (wb0Var.r) {
                }
        }
        return Unit.a;
    }

    @Override // defpackage.rjc
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return b(continuation);
    }
}
