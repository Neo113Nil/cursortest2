package s;

import java.util.Map;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4964a extends j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f40399e;

    public /* synthetic */ C4964a(int i, Object obj) {
        this.f40398d = i;
        this.f40399e = obj;
    }

    @Override // s.j
    public final void b() {
        switch (this.f40398d) {
            case 0:
                ((b) this.f40399e).clear();
                break;
            default:
                ((c) this.f40399e).clear();
                break;
        }
    }

    @Override // s.j
    public final Object c(int i, int i6) {
        switch (this.f40398d) {
            case 0:
                return ((b) this.f40399e).f40439u[(i << 1) + i6];
            default:
                return ((c) this.f40399e).f40408u[i];
        }
    }

    @Override // s.j
    public final Map d() {
        switch (this.f40398d) {
            case 0:
                return (b) this.f40399e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // s.j
    public final int e() {
        switch (this.f40398d) {
            case 0:
                return ((b) this.f40399e).f40440v;
            default:
                return ((c) this.f40399e).f40409v;
        }
    }

    @Override // s.j
    public final int f(Object obj) {
        switch (this.f40398d) {
            case 0:
                return ((b) this.f40399e).e(obj);
            default:
                c cVar = (c) this.f40399e;
                return obj == null ? cVar.e() : cVar.d(obj.hashCode(), obj);
        }
    }

    @Override // s.j
    public final int g(Object obj) {
        switch (this.f40398d) {
            case 0:
                return ((b) this.f40399e).g(obj);
            default:
                c cVar = (c) this.f40399e;
                return obj == null ? cVar.e() : cVar.d(obj.hashCode(), obj);
        }
    }

    @Override // s.j
    public final void h(Object obj, Object obj2) {
        switch (this.f40398d) {
            case 0:
                ((b) this.f40399e).put(obj, obj2);
                break;
            default:
                ((c) this.f40399e).add(obj);
                break;
        }
    }

    @Override // s.j
    public final void i(int i) {
        switch (this.f40398d) {
            case 0:
                ((b) this.f40399e).j(i);
                break;
            default:
                ((c) this.f40399e).f(i);
                break;
        }
    }

    @Override // s.j
    public final Object j(int i, Object obj) {
        switch (this.f40398d) {
            case 0:
                return ((b) this.f40399e).k(i, obj);
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
