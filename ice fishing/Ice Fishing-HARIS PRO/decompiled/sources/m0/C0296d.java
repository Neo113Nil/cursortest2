package m0;

import C1.p;
import L1.r;
import O1.o;
import android.app.Activity;
import androidx.window.layout.y;

/* renamed from: m0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296d extends x1.h implements p {
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0297e f4068f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Activity f4069g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0296d(C0297e c0297e, Activity activity, v1.d dVar) {
        super(dVar);
        this.f4068f = c0297e;
        this.f4069g = activity;
    }

    @Override // C1.p
    public final Object d(Object obj, Object obj2) {
        return ((C0296d) i((r) obj, (v1.d) obj2)).k(t1.i.f4388c);
    }

    @Override // x1.a
    public final v1.d i(Object obj, v1.d dVar) {
        return new C0296d(this.f4068f, this.f4069g, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [O1.d] */
    @Override // x1.a
    public final Object k(Object obj) {
        w1.a aVar = w1.a.f4662a;
        int i = this.e;
        if (i == 0) {
            h0.f.D(obj);
            C0297e c0297e = this.f4068f;
            F.i iVar = new F.i(new B.b(8, new y(c0297e.f4070a, this.f4069g, null)), 14, c0297e);
            if (!(iVar instanceof o)) {
                iVar = new O1.d(iVar);
            }
            C0293a c0293a = new C0293a(c0297e);
            this.e = 1;
            if (iVar.w(c0293a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0.f.D(obj);
        }
        return t1.i.f4388c;
    }
}
