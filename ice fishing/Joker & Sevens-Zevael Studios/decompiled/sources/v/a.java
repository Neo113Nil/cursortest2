package v;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends hc.j implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public i f6757g;

    /* renamed from: h, reason: collision with root package name */
    public pc.o f6758h;

    /* renamed from: i, reason: collision with root package name */
    public int f6759i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f6760j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6761k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w0 f6762l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f6763m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ oc.c f6764n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Object obj, w0 w0Var, long j3, oc.c cVar2, fc.d dVar) {
        super(1, dVar);
        this.f6760j = cVar;
        this.f6761k = obj;
        this.f6762l = w0Var;
        this.f6763m = j3;
        this.f6764n = cVar2;
    }

    @Override // hc.a
    public final fc.d create(fc.d dVar) {
        return new a(this.f6760j, this.f6761k, this.f6762l, this.f6763m, this.f6764n, dVar);
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        return ((a) create((fc.d) obj)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        pc.o oVar;
        w0 w0Var = this.f6762l;
        int i10 = this.f6759i;
        int i11 = 1;
        c cVar = this.f6760j;
        try {
            if (i10 == 0) {
                v6.a.W(obj);
                cVar.f6792c.f6858i = (n) ((oc.c) cVar.f6790a.f8356h).invoke(this.f6761k);
                cVar.f6794e.setValue(w0Var.f7006c);
                cVar.f6793d.setValue(Boolean.TRUE);
                i iVar2 = cVar.f6792c;
                i iVar3 = new i(iVar2.f6856g, iVar2.f6857h.getValue(), d.e(iVar2.f6858i), iVar2.f6859j, Long.MIN_VALUE, iVar2.f6861l);
                pc.o oVar2 = new pc.o();
                long j3 = this.f6763m;
                b0.v vVar = new b0.v(cVar, iVar3, this.f6764n, oVar2, 2);
                this.f6757g = iVar3;
                this.f6758h = oVar2;
                this.f6759i = 1;
                Object b2 = d.b(iVar3, w0Var, j3, vVar, this);
                gc.a aVar = gc.a.f2559g;
                if (b2 == aVar) {
                    return aVar;
                }
                iVar = iVar3;
                oVar = oVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar = this.f6758h;
                iVar = this.f6757g;
                v6.a.W(obj);
            }
            if (!oVar.f5679g) {
                i11 = 2;
            }
            c.b(cVar);
            return new e3.j(i11, 4, iVar);
        } catch (CancellationException e10) {
            c.b(cVar);
            throw e10;
        }
    }
}
