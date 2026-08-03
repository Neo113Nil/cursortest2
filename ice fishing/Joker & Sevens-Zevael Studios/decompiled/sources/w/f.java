package w;

import java.util.ArrayList;
import x.k1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends hc.i implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public int f7413h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7414i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f7415j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, fc.d dVar) {
        super(dVar);
        this.f7415j = gVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        f fVar = new f(this.f7415j, dVar);
        fVar.f7414i = obj;
        return fVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((r1.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (r13 != r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0036, code lost:
    
        if (r13 == r4) goto L16;
     */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0057 -> B:6:0x005a). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r1.y yVar;
        Object obj2;
        int i10 = this.f7413h;
        g gVar = this.f7415j;
        gc.a aVar = gc.a.f2559g;
        if (i10 == 0) {
            v6.a.W(obj);
            yVar = (r1.y) this.f7414i;
            this.f7414i = yVar;
            this.f7413h = 1;
            obj = k1.b(yVar, (r3 & 1) != 0, r1.h.f5957h, this);
        } else if (i10 == 1) {
            yVar = (r1.y) this.f7414i;
            v6.a.W(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = (r1.y) this.f7414i;
            v6.a.W(obj);
            ?? r13 = ((r1.g) obj).f5954a;
            ArrayList arrayList = new ArrayList(r13.size());
            int size = r13.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Object obj3 = r13.get(i12);
                if (((r1.n) obj3).f5966d) {
                    arrayList.add(obj3);
                }
            }
            int size2 = arrayList.size();
            while (true) {
                if (i11 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i11);
                long j3 = ((r1.n) obj2).f5963a;
                r1.m mVar = gVar.f7424m;
                if (mVar != null && j3 == mVar.f5962a) {
                    break;
                }
                i11++;
            }
            r1.n nVar = (r1.n) obj2;
            if (nVar == null) {
                nVar = (r1.n) bc.m.U(arrayList);
            }
            if (nVar != null) {
                gVar.f7424m = new r1.m(nVar.f5963a);
                gVar.f7418g = new e1.b(nVar.f5965c);
            }
            if (arrayList.isEmpty()) {
                gVar.f7424m = null;
                return ac.o.f277a;
            }
            this.f7414i = yVar;
            this.f7413h = 2;
            obj = yVar.a(r1.h.f5957h, this);
        }
        r1.n nVar2 = (r1.n) obj;
        gVar.f7424m = new r1.m(nVar2.f5963a);
        gVar.f7418g = new e1.b(nVar2.f5965c);
        this.f7414i = yVar;
        this.f7413h = 2;
        obj = yVar.a(r1.h.f5957h, this);
    }
}
