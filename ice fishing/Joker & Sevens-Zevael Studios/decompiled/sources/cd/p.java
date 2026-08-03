package cd;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public ad.i f1378g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f1379h;

    /* renamed from: i, reason: collision with root package name */
    public int f1380i;

    /* renamed from: j, reason: collision with root package name */
    public int f1381j;

    /* renamed from: k, reason: collision with root package name */
    public int f1382k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1383l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ bd.e[] f1384m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ bd.j f1385n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ bd.f f1386o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(bd.e[] eVarArr, bd.j jVar, bd.f fVar, fc.d dVar) {
        super(2, dVar);
        this.f1384m = eVarArr;
        this.f1385n = jVar;
        this.f1386o = fVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        p pVar = new p(this.f1384m, this.f1385n, this.f1386o, dVar);
        pVar.f1383l = obj;
        return pVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
    
        if (r11 == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        if (r17.f1385n.b(r17.f1386o, r10, r17) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        if (r3 != 0) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d5 -> B:10:0x007c). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        ad.i iVar;
        int i10;
        Object[] objArr;
        int i11;
        Object obj2;
        dd.w wVar = c.f1343c;
        int i12 = this.f1382k;
        gc.a aVar = gc.a.f2559g;
        if (i12 == 0) {
            v6.a.W(obj);
            yc.y yVar = (yc.y) this.f1383l;
            bd.e[] eVarArr = this.f1384m;
            int length = eVarArr.length;
            if (length != 0) {
                Object[] objArr2 = new Object[length];
                int i13 = 0;
                bc.l.V(0, length, wVar, objArr2);
                ad.e a6 = a.a.a(length, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                int i14 = 0;
                while (i14 < length) {
                    yc.a0.q(yVar, null, new o(eVarArr, i14, atomicInteger, a6, null), 3);
                    i14++;
                    i13 = i13;
                }
                int i15 = i13;
                bArr = new byte[length];
                iVar = a6;
                i10 = length;
                objArr = objArr2;
                i11 = i15;
            }
            return ac.o.f277a;
        }
        if (i12 == 1) {
            i11 = this.f1381j;
            i10 = this.f1380i;
            bArr = this.f1379h;
            iVar = this.f1378g;
            objArr = (Object[]) this.f1383l;
            v6.a.W(obj);
            obj2 = ((ad.l) obj).f328a;
            if (obj2 instanceof ad.k) {
                obj2 = null;
            }
            bc.y yVar2 = (bc.y) obj2;
            if (yVar2 != null) {
                while (true) {
                    int i16 = yVar2.f1070a;
                    Object obj3 = objArr[i16];
                    objArr[i16] = yVar2.f1071b;
                    if (obj3 == wVar) {
                        i10--;
                    }
                    if (bArr[i16] != i11) {
                        bArr[i16] = (byte) i11;
                        Object p8 = iVar.p();
                        if (p8 instanceof ad.k) {
                            p8 = null;
                        }
                        yVar2 = (bc.y) p8;
                        if (yVar2 != null) {
                        }
                    }
                    if (i10 == 0) {
                        this.f1383l = objArr;
                        this.f1378g = iVar;
                        this.f1379h = bArr;
                        this.f1380i = i10;
                        this.f1381j = i11;
                        this.f1382k = 2;
                    }
                }
                return aVar;
            }
            return ac.o.f277a;
        }
        if (i12 != 2 && i12 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i11 = this.f1381j;
        i10 = this.f1380i;
        bArr = this.f1379h;
        iVar = this.f1378g;
        objArr = (Object[]) this.f1383l;
        v6.a.W(obj);
        i11 = (byte) (i11 + 1);
        this.f1383l = objArr;
        this.f1378g = iVar;
        this.f1379h = bArr;
        this.f1380i = i10;
        this.f1381j = i11;
        this.f1382k = 1;
        obj2 = iVar.t(this);
    }
}
