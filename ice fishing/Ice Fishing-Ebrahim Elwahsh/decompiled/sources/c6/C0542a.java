package c6;

import I1.f;
import b6.C0530a;
import b6.c;
import d6.C4460a;
import g6.AbstractC4533c;
import g6.e;
import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0542a extends AbstractC4533c implements InterfaceC0543b {

    /* renamed from: w, reason: collision with root package name */
    public static final Comparator f5711w = Comparator.comparing(new G6.b(22));

    /* renamed from: x, reason: collision with root package name */
    public static final C0542a f5712x;

    /* renamed from: v, reason: collision with root package name */
    public C0530a f5713v;

    static {
        C0542a c0542a;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() != 2 || arrayList.get(0) == null) {
            Object[] array = arrayList.toArray();
            for (int i = 0; i < array.length; i += 2) {
                C4460a c4460a = (C4460a) array[i];
                if (c4460a != null && c4460a.f37203b.isEmpty()) {
                    array[i] = null;
                }
            }
            c0542a = new C0542a(array, f5711w);
        } else {
            c0542a = new C0542a(arrayList.toArray());
        }
        f5712x = c0542a;
    }

    @Override // c6.InterfaceC0543b
    public final c h() {
        if (this.f5713v == null) {
            f fVar = new f(2);
            int i = 0;
            while (true) {
                Object[] objArr = this.f37928n;
                if (i >= objArr.length) {
                    break;
                }
                Object obj = objArr[i];
                Object obj2 = objArr[i + 1];
                e a9 = ((C4460a) obj).a();
                if (a9 != null) {
                    fVar.d(a9, obj2);
                }
                i += 2;
            }
            this.f5713v = fVar.b();
        }
        return this.f5713v;
    }
}
