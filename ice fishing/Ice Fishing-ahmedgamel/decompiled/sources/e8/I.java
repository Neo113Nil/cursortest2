package e8;

import b8.InterfaceC0537a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final c8.e[] f37328a = new c8.e[0];

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC0537a[] f37329b = new InterfaceC0537a[0];

    public static final C4506v a(String str, InterfaceC0537a interfaceC0537a) {
        return new C4506v(str, new C4507w(interfaceC0537a));
    }

    public static final c8.e[] b(List list) {
        c8.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (c8.e[]) list.toArray(new c8.e[0])) == null) ? f37328a : eVarArr;
    }

    public static final int c(c8.e eVar, c8.e[] typeParams) {
        kotlin.jvm.internal.h.e(eVar, "<this>");
        kotlin.jvm.internal.h.e(typeParams, "typeParams");
        int hashCode = (eVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        c8.g gVar = new c8.g(eVar);
        int i = 1;
        int i4 = 1;
        while (true) {
            int i6 = 0;
            if (!gVar.hasNext()) {
                break;
            }
            int i9 = i4 * 31;
            String a9 = ((c8.e) gVar.next()).a();
            if (a9 != null) {
                i6 = a9.hashCode();
            }
            i4 = i9 + i6;
        }
        c8.g gVar2 = new c8.g(eVar);
        while (gVar2.hasNext()) {
            int i10 = i * 31;
            com.bumptech.glide.h d9 = ((c8.e) gVar2.next()).d();
            i = i10 + (d9 != null ? d9.hashCode() : 0);
        }
        return (((hashCode * 31) + i4) * 31) + i;
    }
}
