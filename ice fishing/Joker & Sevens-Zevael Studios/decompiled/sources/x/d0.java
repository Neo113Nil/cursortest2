package x;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 extends hc.i implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public int f7760h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7761i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fc.i f7762j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ hc.i f7763k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(fc.i iVar, oc.e eVar, fc.d dVar) {
        super(dVar);
        this.f7762j = iVar;
        this.f7763k = (hc.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [hc.i, oc.e] */
    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        d0 d0Var = new d0(this.f7762j, this.f7763k, dVar);
        d0Var.f7761i = obj;
        return d0Var;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((r1.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r9 != r5) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r9 == r5) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, r1.y] */
    /* JADX WARN: Type inference failed for: r0v7, types: [hc.i, oc.e] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:8:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006c -> B:8:0x0028). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r1.y yVar;
        r1.y yVar2;
        r1.y yVar3 = this.f7760h;
        fc.i iVar = this.f7762j;
        gc.a aVar = gc.a.f2559g;
        try {
        } catch (CancellationException e10) {
            e = e10;
            if (yc.a0.o(iVar)) {
                throw e;
            }
            this.f7761i = yVar3;
            this.f7760h = 3;
            Object b2 = u.l0.b(yVar3, this);
            yVar2 = yVar3;
        }
        if (yVar3 == 0) {
            v6.a.W(obj);
            yVar = (r1.y) this.f7761i;
            if (yc.a0.o(iVar)) {
            }
        } else {
            if (yVar3 != 1) {
                if (yVar3 == 2) {
                    r1.y yVar4 = (r1.y) this.f7761i;
                    v6.a.W(obj);
                    yVar2 = yVar4;
                } else {
                    if (yVar3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r1.y yVar5 = (r1.y) this.f7761i;
                    v6.a.W(obj);
                    yVar2 = yVar5;
                }
                yVar = yVar2;
                if (yc.a0.o(iVar)) {
                    return ac.o.f277a;
                }
                try {
                } catch (CancellationException e11) {
                    yVar3 = yVar;
                    e = e11;
                    if (yc.a0.o(iVar)) {
                    }
                }
                ?? r02 = this.f7763k;
                this.f7761i = yVar;
                this.f7760h = 1;
                if (r02.invoke(yVar, this) != aVar) {
                    yVar3 = yVar;
                    this.f7761i = yVar3;
                    this.f7760h = 2;
                    Object b10 = u.l0.b(yVar3, this);
                    yVar2 = yVar3;
                }
                return aVar;
            }
            r1.y yVar6 = (r1.y) this.f7761i;
            v6.a.W(obj);
            yVar3 = yVar6;
            this.f7761i = yVar3;
            this.f7760h = 2;
            Object b102 = u.l0.b(yVar3, this);
            yVar2 = yVar3;
        }
    }
}
