package g6;

import d1.C4445c;
import f6.C4512a;
import f6.c;
import h6.C4574a;
import java.util.ArrayList;
import java.util.Comparator;
import k6.AbstractC4638c;
import k6.e;

/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4531a extends AbstractC4638c implements InterfaceC4532b {

    /* renamed from: w, reason: collision with root package name */
    public static final Comparator f37656w = Comparator.comparing(new K6.b(22));

    /* renamed from: x, reason: collision with root package name */
    public static final C4531a f37657x;

    /* renamed from: v, reason: collision with root package name */
    public C4512a f37658v;

    static {
        C4531a c4531a;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() != 2 || arrayList.get(0) == null) {
            Object[] array = arrayList.toArray();
            for (int i = 0; i < array.length; i += 2) {
                C4574a c4574a = (C4574a) array[i];
                if (c4574a != null && c4574a.f38020b.isEmpty()) {
                    array[i] = null;
                }
            }
            c4531a = new C4531a(array, f37656w);
        } else {
            c4531a = new C4531a(arrayList.toArray());
        }
        f37657x = c4531a;
    }

    @Override // g6.InterfaceC4532b
    public final c h() {
        if (this.f37658v == null) {
            C4445c c4445c = new C4445c();
            int i = 0;
            while (true) {
                Object[] objArr = this.f38682n;
                if (i >= objArr.length) {
                    break;
                }
                Object obj = objArr[i];
                Object obj2 = objArr[i + 1];
                e a9 = ((C4574a) obj).a();
                if (a9 != null) {
                    c4445c.f(a9, obj2);
                }
                i += 2;
            }
            this.f37658v = c4445c.d();
        }
        return this.f37658v;
    }
}
