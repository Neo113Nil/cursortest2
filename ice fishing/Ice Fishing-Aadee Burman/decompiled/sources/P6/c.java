package P6;

import N6.o;
import java.util.List;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final class c extends N6.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2572b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2573c;

    public c(j[] jVarArr) {
        super(N6.k.e(T6.a.f3092a, jVarArr));
        this.f2573c = jVarArr;
    }

    public static c d(List list, Function function) {
        int size = list.size();
        N6.f[] fVarArr = new N6.f[size];
        for (int i = 0; i < size; i++) {
            fVarArr[i] = (N6.f) function.apply(list.get(i));
        }
        return new c(new b(fVarArr));
    }

    @Override // N6.f
    public final void c(o oVar) {
        switch (this.f2572b) {
            case 0:
                oVar.a(U6.a.f3209e, (b) this.f2573c);
                break;
            case 1:
                oVar.a(U6.a.f3210f, (b) this.f2573c);
                break;
            case 2:
                oVar.k(W6.a.f3412a, (m[]) this.f2573c);
                break;
            default:
                oVar.k(T6.a.f3092a, (j[]) this.f2573c);
                break;
        }
    }

    public c(b bVar, byte b9) {
        super(N6.k.d(U6.a.f3210f, bVar));
        this.f2573c = bVar;
    }

    public c(b bVar) {
        super(N6.k.d(U6.a.f3209e, bVar));
        this.f2573c = bVar;
    }

    public c(m[] mVarArr) {
        super(N6.k.e(W6.a.f3412a, mVarArr));
        this.f2573c = mVarArr;
    }
}
