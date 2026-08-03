package d5;

import ac.o;
import f5.b;
import fc.d;
import hc.j;
import java.util.ArrayList;
import oc.c;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends j implements c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1679g = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f1680h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f1681i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c5.b f1682j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g5.a f1683k;

    /* renamed from: l, reason: collision with root package name */
    public Object f1684l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c5.b bVar2, g5.a aVar, d dVar) {
        super(1, dVar);
        this.f1681i = bVar;
        this.f1682j = bVar2;
        this.f1683k = aVar;
    }

    @Override // hc.a
    public final d create(d dVar) {
        switch (this.f1679g) {
            case 0:
                return new a(this.f1681i, (ArrayList) this.f1684l, this.f1682j, this.f1683k, dVar);
            default:
                return new a(this.f1681i, this.f1682j, this.f1683k, dVar);
        }
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f1679g) {
        }
        return ((a) create(dVar)).invokeSuspend(o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
    
        if (r8 != r6) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        if (r8 == r6) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v18, types: [hc.j, oc.c] */
    /* JADX WARN: Type inference failed for: r8v2, types: [hc.j, oc.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c5 -> B:30:0x00c9). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        switch (this.f1679g) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f1684l;
                int i10 = this.f1680h;
                c5.b bVar = this.f1682j;
                g5.a aVar = this.f1683k;
                gc.a aVar2 = gc.a.f2559g;
                if (i10 == 0) {
                    v6.a.W(obj);
                    this.f1680h = 1;
                    obj = this.f1681i.f2313b.invoke(this);
                    break;
                } else if (i10 == 1) {
                    v6.a.W(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return arrayList;
                    }
                    arrayList.add(bVar.f1227a.invoke(aVar));
                    f5.d c3 = aVar.c();
                    this.f1680h = 2;
                    obj = c3.f2315b;
                    break;
                }
                if (!((Boolean) obj).booleanValue()) {
                    return arrayList;
                }
                arrayList.add(bVar.f1227a.invoke(aVar));
                f5.d c32 = aVar.c();
                this.f1680h = 2;
                obj = c32.f2315b;
            default:
                int i11 = this.f1680h;
                c5.b bVar2 = this.f1682j;
                gc.a aVar3 = gc.a.f2559g;
                if (i11 == 0) {
                    v6.a.W(obj);
                    this.f1680h = 1;
                    obj = this.f1681i.f2313b.invoke(this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj3 = this.f1684l;
                        v6.a.W(obj);
                        obj2 = obj3;
                        if (((Boolean) obj).booleanValue()) {
                            return obj2;
                        }
                        throw new IllegalStateException(("ResultSet returned more than 1 row for " + bVar2).toString());
                    }
                    v6.a.W(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                c cVar = bVar2.f1227a;
                g5.a aVar4 = this.f1683k;
                Object invoke = cVar.invoke(aVar4);
                f5.d c7 = aVar4.c();
                this.f1684l = invoke;
                this.f1680h = 2;
                Object obj4 = c7.f2315b;
                if (obj4 == aVar3) {
                    return aVar3;
                }
                obj2 = invoke;
                obj = obj4;
                if (((Boolean) obj).booleanValue()) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ArrayList arrayList, c5.b bVar2, g5.a aVar, d dVar) {
        super(1, dVar);
        this.f1681i = bVar;
        this.f1684l = arrayList;
        this.f1682j = bVar2;
        this.f1683k = aVar;
    }
}
