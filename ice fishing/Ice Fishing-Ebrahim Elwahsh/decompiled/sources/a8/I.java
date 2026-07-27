package a8;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final Y7.e[] f4437a = new Y7.e[0];

    /* renamed from: b, reason: collision with root package name */
    public static final X7.a[] f4438b = new X7.a[0];

    public static final C0454v a(String str, X7.a aVar) {
        return new C0454v(str, new C0455w(aVar));
    }

    public static final Y7.e[] b(List list) {
        Y7.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (Y7.e[]) list.toArray(new Y7.e[0])) == null) ? f4437a : eVarArr;
    }

    public static final int c(Y7.e eVar, Y7.e[] typeParams) {
        kotlin.jvm.internal.h.e(eVar, "<this>");
        kotlin.jvm.internal.h.e(typeParams, "typeParams");
        int hashCode = (eVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        Y7.g gVar = new Y7.g(eVar);
        int i = 1;
        int i4 = 1;
        while (true) {
            int i9 = 0;
            if (!gVar.hasNext()) {
                break;
            }
            int i10 = i4 * 31;
            String a9 = ((Y7.e) gVar.next()).a();
            if (a9 != null) {
                i9 = a9.hashCode();
            }
            i4 = i10 + i9;
        }
        Y7.g gVar2 = new Y7.g(eVar);
        while (gVar2.hasNext()) {
            int i11 = i * 31;
            com.bumptech.glide.e d2 = ((Y7.e) gVar2.next()).d();
            i = i11 + (d2 != null ? d2.hashCode() : 0);
        }
        return (((hashCode * 31) + i4) * 31) + i;
    }
}
