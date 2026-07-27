package e8;

import b8.InterfaceC0529a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final c8.e[] f37252a = new c8.e[0];

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC0529a[] f37253b = new InterfaceC0529a[0];

    public static final C4489v a(String str, InterfaceC0529a interfaceC0529a) {
        return new C4489v(str, new C4490w(interfaceC0529a));
    }

    public static final c8.e[] b(List list) {
        c8.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (c8.e[]) list.toArray(new c8.e[0])) == null) ? f37252a : eVarArr;
    }

    public static final int c(c8.e eVar, c8.e[] typeParams) {
        kotlin.jvm.internal.h.e(eVar, "<this>");
        kotlin.jvm.internal.h.e(typeParams, "typeParams");
        int hashCode = (eVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        c8.g gVar = new c8.g(eVar);
        int i = 1;
        int i6 = 1;
        while (true) {
            int i9 = 0;
            if (!gVar.hasNext()) {
                break;
            }
            int i10 = i6 * 31;
            String a9 = ((c8.e) gVar.next()).a();
            if (a9 != null) {
                i9 = a9.hashCode();
            }
            i6 = i10 + i9;
        }
        c8.g gVar2 = new c8.g(eVar);
        while (gVar2.hasNext()) {
            int i11 = i * 31;
            t8.g d2 = ((c8.e) gVar2.next()).d();
            i = i11 + (d2 != null ? d2.hashCode() : 0);
        }
        return (((hashCode * 31) + i6) * 31) + i;
    }
}
