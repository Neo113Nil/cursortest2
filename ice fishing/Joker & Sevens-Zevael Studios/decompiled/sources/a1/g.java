package a1;

import ac.o;
import cd.w;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import dd.t;
import e2.n;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m0.r;
import m0.z;
import pc.k;
import u.g0;
import v.e0;
import y0.l;
import y1.x0;
import yc.b1;
import yc.v;
import z.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f168g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f169h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, int i11, Object obj) {
        super(2);
        this.f168g = i11;
        this.f169h = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e0  */
    /* JADX WARN: Type inference failed for: r13v36, types: [java.lang.Object, oc.f, pc.k] */
    @Override // oc.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        CharSequence charSequence;
        Object obj3;
        ac.i iVar;
        boolean z10;
        Object obj4;
        int i10 = this.f168g;
        b1 b1Var = null;
        boolean z11 = false;
        z11 = false;
        z11 = false;
        o oVar = o.f277a;
        Object obj5 = this.f169h;
        switch (i10) {
            case 0:
                ((h) obj5).n(((Number) obj).intValue(), (n) obj2);
                return oVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int intValue = ((Number) obj).intValue();
                fc.g gVar = (fc.g) obj2;
                fc.h key = gVar.getKey();
                fc.g v10 = ((w) obj5).f1393h.v(key);
                if (key != v.f8910h) {
                    return Integer.valueOf(gVar != v10 ? Integer.MIN_VALUE : intValue + 1);
                }
                b1 b1Var2 = (b1) v10;
                for (b1 b1Var3 = (b1) gVar; b1Var3 != null; b1Var3 = b1Var3.getParent()) {
                    if (b1Var3 == b1Var2 || !(b1Var3 instanceof t)) {
                        b1Var = b1Var3;
                        if (b1Var != b1Var2) {
                            if (b1Var2 != null) {
                                intValue++;
                            }
                            return Integer.valueOf(intValue);
                        }
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b1Var + ", expected child of " + b1Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                }
                if (b1Var != b1Var2) {
                }
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((Number) obj2).intValue();
                u0.d dVar = hd.b.f2879a;
                m5.h.b((k5.a) obj5, (r) obj, z.y(24577));
                return oVar;
            case 3:
                u.v vVar = (u.v) obj;
                u.v vVar2 = (u.v) obj2;
                u.v vVar3 = u.v.f6647i;
                if (vVar == vVar3 && vVar2 == vVar3 && !((g0) obj5).f6601a.f6627b) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 4:
                ((Number) obj2).intValue();
                ((e0) obj5).a(z.y(1), (r) obj);
                return oVar;
            case 5:
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue2 = ((Number) obj2).intValue();
                pc.j.e(charSequence2, "$this$$receiver");
                List list = (List) obj5;
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str = (String) list.get(0);
                    int s10 = xc.h.s(charSequence2, str, intValue2, false, 4);
                    if (s10 >= 0) {
                        iVar = new ac.i(Integer.valueOf(s10), str);
                    }
                    iVar = null;
                } else {
                    int i11 = intValue2 >= 0 ? intValue2 : 0;
                    boolean z12 = charSequence2 instanceof String;
                    boolean z13 = false;
                    int i12 = new uc.d(i11, charSequence2.length(), 1).f6736h;
                    if (z12) {
                        if (i11 <= i12) {
                            int i13 = i11;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        z10 = z13;
                                        String str2 = (String) obj4;
                                        if (!xc.h.u(0, i13, str2.length(), str2, (String) charSequence2, z10)) {
                                            z13 = z10;
                                        }
                                    } else {
                                        z10 = z13;
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    iVar = new ac.i(Integer.valueOf(i13), str3);
                                } else if (i13 != i12) {
                                    i13++;
                                    z13 = z10;
                                }
                            }
                        }
                        iVar = null;
                    } else {
                        if (i11 <= i12) {
                            int i14 = i11;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str4 = (String) obj3;
                                        charSequence = charSequence2;
                                        if (!xc.h.v(str4, 0, charSequence, i14, str4.length(), false)) {
                                            charSequence2 = charSequence;
                                        }
                                    } else {
                                        charSequence = charSequence2;
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    iVar = new ac.i(Integer.valueOf(i14), str5);
                                } else if (i14 != i12) {
                                    i14++;
                                    charSequence2 = charSequence;
                                }
                            }
                        }
                        iVar = null;
                    }
                }
                if (iVar != null) {
                    return new ac.i(iVar.f270g, Integer.valueOf(((String) iVar.f271h).length()));
                }
                return null;
            case 6:
                y0.n nVar = (y0.n) obj;
                y0.n nVar2 = (l) obj2;
                r rVar = (r) obj5;
                if (nVar2 instanceof y0.i) {
                    ?? r13 = ((y0.i) nVar2).f8440b;
                    pc.v.c(3, r13);
                    nVar2 = uc.e.n(rVar, (y0.n) r13.b(y0.k.f8442a, rVar, 0));
                }
                return nVar.d(nVar2);
            case 7:
                r rVar2 = (r) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (rVar2.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ((y1.a) obj5).a(0, rVar2);
                } else {
                    rVar2.S();
                }
                return oVar;
            case 8:
                ((Number) obj2).intValue();
                ((x0) obj5).a(z.y(1), (r) obj);
                return oVar;
            default:
                ((Number) obj2).intValue();
                m.a((y0.n) obj5, (r) obj, z.y(1));
                return oVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, Object obj) {
        super(2);
        this.f168g = i10;
        this.f169h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k5.a aVar, m5.d dVar, String str, int i10) {
        super(2);
        this.f168g = 2;
        u0.d dVar2 = hd.b.f2879a;
        this.f169h = aVar;
    }
}
