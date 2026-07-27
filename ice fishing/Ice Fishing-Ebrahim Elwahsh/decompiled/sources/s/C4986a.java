package s;

import java.util.Map;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4986a extends j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f40368e;

    public /* synthetic */ C4986a(int i, Object obj) {
        this.f40367d = i;
        this.f40368e = obj;
    }

    @Override // s.j
    public final void b() {
        switch (this.f40367d) {
            case 0:
                ((b) this.f40368e).clear();
                break;
            default:
                ((c) this.f40368e).clear();
                break;
        }
    }

    @Override // s.j
    public final Object c(int i, int i4) {
        switch (this.f40367d) {
            case 0:
                return ((b) this.f40368e).f40408u[(i << 1) + i4];
            default:
                return ((c) this.f40368e).f40377u[i];
        }
    }

    @Override // s.j
    public final Map d() {
        switch (this.f40367d) {
            case 0:
                return (b) this.f40368e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // s.j
    public final int e() {
        switch (this.f40367d) {
            case 0:
                return ((b) this.f40368e).f40409v;
            default:
                return ((c) this.f40368e).f40378v;
        }
    }

    @Override // s.j
    public final int f(Object obj) {
        switch (this.f40367d) {
            case 0:
                return ((b) this.f40368e).e(obj);
            default:
                c cVar = (c) this.f40368e;
                return obj == null ? cVar.e() : cVar.d(obj.hashCode(), obj);
        }
    }

    @Override // s.j
    public final int g(Object obj) {
        switch (this.f40367d) {
            case 0:
                return ((b) this.f40368e).g(obj);
            default:
                c cVar = (c) this.f40368e;
                return obj == null ? cVar.e() : cVar.d(obj.hashCode(), obj);
        }
    }

    @Override // s.j
    public final void h(Object obj, Object obj2) {
        switch (this.f40367d) {
            case 0:
                ((b) this.f40368e).put(obj, obj2);
                break;
            default:
                ((c) this.f40368e).add(obj);
                break;
        }
    }

    @Override // s.j
    public final void i(int i) {
        switch (this.f40367d) {
            case 0:
                ((b) this.f40368e).j(i);
                break;
            default:
                ((c) this.f40368e).f(i);
                break;
        }
    }

    @Override // s.j
    public final Object j(int i, Object obj) {
        switch (this.f40367d) {
            case 0:
                return ((b) this.f40368e).k(i, obj);
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
