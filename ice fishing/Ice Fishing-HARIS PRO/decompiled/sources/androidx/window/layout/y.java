package androidx.window.layout;

import Z.C0072u;
import android.app.Activity;

/* loaded from: classes.dex */
public final class y extends x1.h implements C1.p {
    public N.a e;

    /* renamed from: f, reason: collision with root package name */
    public N1.a f2259f;

    /* renamed from: g, reason: collision with root package name */
    public int f2260g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2261h;
    public final /* synthetic */ s i;
    public final /* synthetic */ Activity j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(s sVar, Activity activity, v1.d dVar) {
        super(dVar);
        this.i = sVar;
        this.j = activity;
    }

    @Override // C1.p
    public final Object d(Object obj, Object obj2) {
        return ((y) i((O1.f) obj, (v1.d) obj2)).k(t1.i.f4388c);
    }

    @Override // x1.a
    public final v1.d i(Object obj, v1.d dVar) {
        y yVar = new y(this.i, this.j, dVar);
        yVar.f2261h = obj;
        return yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b4: INVOKE (r3v1 ?? I:androidx.window.layout.v), (r5 I:N.a) INTERFACE call: androidx.window.layout.v.b(N.a):void A[MD:(N.a):void (m)], block:B:39:0x00b4 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:7:0x0018, B:9:0x0058, B:14:0x006b, B:16:0x0073, B:18:0x0079, B:20:0x007f, B:23:0x0090, B:25:0x009c, B:26:0x00a3, B:27:0x00a5, B:28:0x00a6, B:29:0x00ad, B:35:0x0031, B:37:0x0053), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Type inference failed for: r5v6, types: [N.a] */
    /* JADX WARN: Type inference failed for: r5v7, types: [N.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008d -> B:8:0x001b). Please report as a decompilation issue!!! */
    @Override // x1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        N.a b2;
        O1.f fVar;
        N1.a aVar;
        O1.f fVar2;
        C0072u c0072u;
        N1.a aVar2;
        C0072u c0072u2;
        Object b3;
        w1.a aVar3 = w1.a.f4662a;
        int i = this.f2260g;
        v vVar = this.i.f2248b;
        try {
            if (i == 0) {
                h0.f.D(obj);
                fVar = (O1.f) this.f2261h;
                N1.k kVar = new N1.k(10, 2, null);
                C0072u c0072u3 = new C0072u(2, kVar);
                vVar.a(this.j, new i0.d(), c0072u3);
                aVar = new N1.a(kVar);
                c0072u2 = c0072u3;
                this.f2261h = fVar;
                this.e = c0072u2;
                this.f2259f = aVar;
                this.f2260g = 1;
                b3 = aVar.b(this);
                if (b3 == aVar3) {
                }
            } else if (i == 1) {
                aVar2 = this.f2259f;
                ?? r5 = this.e;
                fVar2 = (O1.f) this.f2261h;
                h0.f.D(obj);
                c0072u = r5;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = this.f2259f;
                ?? r52 = this.e;
                fVar2 = (O1.f) this.f2261h;
                h0.f.D(obj);
                C0072u c0072u4 = r52;
                fVar = fVar2;
                aVar = aVar2;
                c0072u2 = c0072u4;
                this.f2261h = fVar;
                this.e = c0072u2;
                this.f2259f = aVar;
                this.f2260g = 1;
                b3 = aVar.b(this);
                if (b3 == aVar3) {
                    return aVar3;
                }
                N1.a aVar4 = aVar;
                fVar2 = fVar;
                obj = b3;
                aVar2 = aVar4;
                c0072u = c0072u2;
                if (!((Boolean) obj).booleanValue()) {
                    vVar.b(c0072u);
                    return t1.i.f4388c;
                }
                Object obj2 = aVar2.f711a;
                Q1.u uVar = N1.d.f733p;
                if (obj2 == uVar) {
                    throw new IllegalStateException("`hasNext()` has not been invoked");
                }
                aVar2.f711a = uVar;
                if (obj2 == N1.d.f729l) {
                    Throwable th = (Throwable) N1.b.j.get(aVar2.f713c);
                    if (th == null) {
                        th = new N1.i("Channel was closed");
                    }
                    int i2 = Q1.t.f971a;
                    throw th;
                }
                this.f2261h = fVar2;
                this.e = c0072u;
                this.f2259f = aVar2;
                this.f2260g = 2;
                c0072u4 = c0072u;
                if (fVar2.a((z) obj2, this) == aVar3) {
                    return aVar3;
                }
                fVar = fVar2;
                aVar = aVar2;
                c0072u2 = c0072u4;
                this.f2261h = fVar;
                this.e = c0072u2;
                this.f2259f = aVar;
                this.f2260g = 1;
                b3 = aVar.b(this);
                if (b3 == aVar3) {
                }
            }
        } catch (Throwable th2) {
            vVar.b(b2);
            throw th2;
        }
    }
}
