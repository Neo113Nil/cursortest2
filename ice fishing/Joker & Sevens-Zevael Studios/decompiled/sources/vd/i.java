package vd;

import v.h1;
import x.h0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends hc.j implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public boolean f7334g;

    /* renamed from: h, reason: collision with root package name */
    public int f7335h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ h0 f7336i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v.c f7337j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ oc.a f7338k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v.c cVar, oc.a aVar, fc.d dVar) {
        super(3, dVar);
        this.f7337j = cVar;
        this.f7338k = aVar;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        long j3 = ((e1.b) obj2).f1929a;
        i iVar = new i(this.f7337j, this.f7338k, (fc.d) obj3);
        iVar.f7336i = (h0) obj;
        return iVar.invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        if (v.c.c(r12.f7337j, r9, r10, null, r12, 12) == r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r15 == r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (v.c.c(r14.f7337j, r9, r10, null, r12, 12) == r7) goto L20;
     */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h0 h0Var;
        i iVar;
        boolean booleanValue;
        int i10 = this.f7335h;
        gc.a aVar = gc.a.f2559g;
        if (i10 == 0) {
            v6.a.W(obj);
            h0Var = this.f7336i;
            Float f10 = new Float(0.9f);
            h1 j3 = v.d.j(80, 6, null);
            this.f7336i = h0Var;
            this.f7335h = 1;
            iVar = this;
        } else if (i10 == 1) {
            h0Var = this.f7336i;
            v6.a.W(obj);
            iVar = this;
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanValue = this.f7334g;
                v6.a.W(obj);
                iVar = this;
                if (booleanValue) {
                    iVar.f7338k.invoke();
                }
                return ac.o.f277a;
            }
            v6.a.W(obj);
            iVar = this;
            booleanValue = ((Boolean) obj).booleanValue();
            Float f11 = new Float(1.0f);
            h1 j6 = v.d.j(80, 6, null);
            iVar.f7334g = booleanValue;
            iVar.f7335h = 3;
        }
        iVar.f7336i = null;
        iVar.f7335h = 2;
        obj = h0Var.b(this);
    }
}
