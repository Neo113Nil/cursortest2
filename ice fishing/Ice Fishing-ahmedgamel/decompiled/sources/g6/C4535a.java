package g6;

import f6.C4522a;
import f6.c;
import h6.C4579a;
import java.util.ArrayList;
import java.util.Comparator;
import k6.AbstractC4649c;
import k6.e;

/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4535a extends AbstractC4649c implements InterfaceC4536b {

    /* renamed from: w, reason: collision with root package name */
    public static final Comparator f37681w = Comparator.comparing(new K6.b(22));

    /* renamed from: x, reason: collision with root package name */
    public static final C4535a f37682x;

    /* renamed from: v, reason: collision with root package name */
    public C4522a f37683v;

    static {
        C4535a c4535a;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() != 2 || arrayList.get(0) == null) {
            Object[] array = arrayList.toArray();
            for (int i = 0; i < array.length; i += 2) {
                C4579a c4579a = (C4579a) array[i];
                if (c4579a != null && c4579a.f38137b.isEmpty()) {
                    array[i] = null;
                }
            }
            c4535a = new C4535a(array, f37681w);
        } else {
            c4535a = new C4535a(arrayList.toArray());
        }
        f37682x = c4535a;
    }

    @Override // g6.InterfaceC4536b
    public final c h() {
        if (this.f37683v == null) {
            K1.c cVar = new K1.c(1);
            int i = 0;
            while (true) {
                Object[] objArr = this.f38609n;
                if (i >= objArr.length) {
                    break;
                }
                Object obj = objArr[i];
                Object obj2 = objArr[i + 1];
                e a9 = ((C4579a) obj).a();
                if (a9 != null) {
                    cVar.c(a9, obj2);
                }
                i += 2;
            }
            this.f37683v = cVar.a();
        }
        return this.f37683v;
    }
}
