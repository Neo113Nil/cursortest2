package sd;

import ac.o;
import v.h1;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public int f6494g;

    /* renamed from: h, reason: collision with root package name */
    public int f6495h;

    /* renamed from: i, reason: collision with root package name */
    public v.c f6496i;

    /* renamed from: j, reason: collision with root package name */
    public int f6497j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v.c f6498k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(v.c cVar, fc.d dVar) {
        super(2, dVar);
        this.f6498k = cVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        return new h(this.f6498k, dVar);
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007b, code lost:
    
        if (v.c.c(r0, r1, r2, null, r4, 12) == r13) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (v.c.c(r4.f6498k, r1, r2, null, r4, 12) == r13) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0099 -> B:7:0x009b). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i10;
        v.c cVar;
        int i11;
        v.c cVar2;
        int i12;
        h hVar = this;
        int i13 = hVar.f6497j;
        gc.a aVar = gc.a.f2559g;
        if (i13 == 0) {
            v6.a.W(obj);
            Float f10 = new Float(1.0f);
            h1 j3 = v.d.j(300, 6, null);
            hVar.f6497j = 1;
        } else if (i13 == 1) {
            v6.a.W(obj);
        } else {
            if (i13 == 2) {
                int i14 = hVar.f6495h;
                int i15 = hVar.f6494g;
                v.c cVar3 = hVar.f6496i;
                v6.a.W(obj);
                i10 = i14;
                i11 = i15;
                cVar = cVar3;
                Float f11 = new Float(1.0f);
                h1 j6 = v.d.j(200, 6, null);
                hVar.f6496i = cVar;
                hVar.f6494g = i11;
                hVar.f6495h = i10;
                hVar.f6497j = 3;
                if (v.c.c(cVar, f11, j6, null, hVar, 12) != aVar) {
                    cVar2 = cVar;
                    i12 = i10;
                    i10 = i12 + 1;
                    hVar = this;
                    cVar = cVar2;
                    if (i10 >= i11) {
                    }
                }
                return aVar;
            }
            if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = hVar.f6495h;
            int i16 = hVar.f6494g;
            cVar2 = hVar.f6496i;
            v6.a.W(obj);
            i11 = i16;
            i10 = i12 + 1;
            hVar = this;
            cVar = cVar2;
            if (i10 >= i11) {
                return o.f277a;
            }
            Float f12 = new Float(1.2f);
            h1 j10 = v.d.j(200, 6, null);
            hVar.f6496i = cVar;
            hVar.f6494g = i11;
            hVar.f6495h = i10;
            hVar.f6497j = 2;
        }
        i10 = 0;
        cVar = hVar.f6498k;
        i11 = 3;
        if (i10 >= i11) {
        }
    }
}
