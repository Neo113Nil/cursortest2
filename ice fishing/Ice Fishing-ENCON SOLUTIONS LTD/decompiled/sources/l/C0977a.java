package l;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0977a {

    /* renamed from: a, reason: collision with root package name */
    public h f8078a;

    /* renamed from: b, reason: collision with root package name */
    public h f8079b;

    /* renamed from: c, reason: collision with root package name */
    public j f8080c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8082e;

    public /* synthetic */ C0977a(int i2, Object obj) {
        this.f8081d = i2;
        this.f8082e = obj;
    }

    public static boolean h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final void a() {
        switch (this.f8081d) {
            case 0:
                ((C0978b) this.f8082e).clear();
                break;
            default:
                ((C0979c) this.f8082e).clear();
                break;
        }
    }

    public final Object b(int i2, int i3) {
        switch (this.f8081d) {
            case 0:
                return ((C0978b) this.f8082e).f8123b[(i2 << 1) + i3];
            default:
                return ((C0979c) this.f8082e).f8091b[i2];
        }
    }

    public final Map c() {
        switch (this.f8081d) {
            case 0:
                return (C0978b) this.f8082e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final int d() {
        switch (this.f8081d) {
            case 0:
                return ((C0978b) this.f8082e).f8124c;
            default:
                return ((C0979c) this.f8082e).f8092c;
        }
    }

    public final int e(Object obj) {
        switch (this.f8081d) {
            case 0:
                return ((C0978b) this.f8082e).d(obj);
            default:
                return ((C0979c) this.f8082e).indexOf(obj);
        }
    }

    public final int f(Object obj) {
        switch (this.f8081d) {
            case 0:
                return ((C0978b) this.f8082e).f(obj);
            default:
                return ((C0979c) this.f8082e).indexOf(obj);
        }
    }

    public final void g(int i2) {
        switch (this.f8081d) {
            case 0:
                ((C0978b) this.f8082e).h(i2);
                break;
            default:
                ((C0979c) this.f8082e).e(i2);
                break;
        }
    }

    public final Object[] i(int i2, Object[] objArr) {
        int d2 = d();
        if (objArr.length < d2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d2);
        }
        for (int i3 = 0; i3 < d2; i3++) {
            objArr[i3] = b(i3, i2);
        }
        if (objArr.length > d2) {
            objArr[d2] = null;
        }
        return objArr;
    }
}
