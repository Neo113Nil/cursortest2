package L6;

import J6.o;
import java.util.List;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final class c extends J6.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1760b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1761c;

    public c(j[] jVarArr) {
        super(J6.k.e(P6.a.f2685a, jVarArr));
        this.f1761c = jVarArr;
    }

    public static c d(List list, Function function) {
        int size = list.size();
        J6.f[] fVarArr = new J6.f[size];
        for (int i = 0; i < size; i++) {
            fVarArr[i] = (J6.f) function.apply(list.get(i));
        }
        return new c(new b(fVarArr));
    }

    @Override // J6.f
    public final void c(o oVar) {
        switch (this.f1760b) {
            case 0:
                oVar.a(Q6.a.f2721e, (b) this.f1761c);
                break;
            case 1:
                oVar.a(Q6.a.f2722f, (b) this.f1761c);
                break;
            case 2:
                oVar.j(S6.a.f2978a, (m[]) this.f1761c);
                break;
            default:
                oVar.j(P6.a.f2685a, (j[]) this.f1761c);
                break;
        }
    }

    public c(b bVar, byte b9) {
        super(J6.k.d(Q6.a.f2722f, bVar));
        this.f1761c = bVar;
    }

    public c(b bVar) {
        super(J6.k.d(Q6.a.f2721e, bVar));
        this.f1761c = bVar;
    }

    public c(m[] mVarArr) {
        super(J6.k.e(S6.a.f2978a, mVarArr));
        this.f1761c = mVarArr;
    }
}
