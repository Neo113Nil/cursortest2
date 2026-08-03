package o0;

import ac.o;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import hc.i;
import s.g0;
import s.h0;
import s.s0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends i implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5137h;

    /* renamed from: i, reason: collision with root package name */
    public long[] f5138i;

    /* renamed from: j, reason: collision with root package name */
    public int f5139j;

    /* renamed from: k, reason: collision with root package name */
    public int f5140k;

    /* renamed from: l, reason: collision with root package name */
    public int f5141l;

    /* renamed from: m, reason: collision with root package name */
    public int f5142m;

    /* renamed from: n, reason: collision with root package name */
    public long f5143n;

    /* renamed from: o, reason: collision with root package name */
    public int f5144o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f5145p;

    /* renamed from: q, reason: collision with root package name */
    public Object f5146q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f5147r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, fc.d dVar, int i10) {
        super(dVar);
        this.f5137h = i10;
        this.f5147r = obj;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f5137h) {
            case 0:
                g gVar = new g((h) this.f5147r, dVar, 0);
                gVar.f5145p = obj;
                return gVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                g gVar2 = new g((s.h) this.f5147r, dVar, 1);
                gVar2.f5145p = obj;
                return gVar2;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                g gVar3 = new g((s.h) this.f5147r, dVar, 2);
                gVar3.f5145p = obj;
                return gVar3;
            default:
                g gVar4 = new g((s0) this.f5147r, dVar, 3);
                gVar4.f5145p = obj;
                return gVar4;
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        wc.f fVar = (wc.f) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f5137h) {
        }
        return ((g) create(fVar, dVar)).invokeSuspend(o.f277a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0075 -> B:7:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:16:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005b -> B:8:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0111 -> B:31:0x0130). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f5 -> B:39:0x0139). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00f7 -> B:32:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01ac -> B:54:0x01d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x018f -> B:62:0x01e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0191 -> B:55:0x01a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0256 -> B:77:0x0275). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x023a -> B:85:0x027e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x023c -> B:78:0x024d). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wc.f fVar;
        Object[] objArr;
        long[] jArr;
        int length;
        int i10;
        long j3;
        wc.f fVar2;
        s.h hVar;
        long[] jArr2;
        int length2;
        int i11;
        long j6;
        wc.f fVar3;
        Object[] objArr2;
        long[] jArr3;
        int length3;
        int i12;
        long j10;
        wc.f fVar4;
        Object[] objArr3;
        long[] jArr4;
        int length4;
        int i13;
        long j11;
        switch (this.f5137h) {
            case 0:
                int i14 = this.f5144o;
                if (i14 == 0) {
                    v6.a.W(obj);
                    fVar = (wc.f) this.f5145p;
                    h0 h0Var = ((h) this.f5147r).f5148g;
                    objArr = h0Var.f6275b;
                    jArr = h0Var.f6274a;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i10 = 0;
                        j3 = jArr[i10];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i10 != length) {
                        }
                    }
                    return o.f277a;
                }
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i15 = this.f5142m;
                int i16 = this.f5141l;
                long j12 = this.f5143n;
                i10 = this.f5140k;
                int i17 = this.f5139j;
                long[] jArr5 = this.f5138i;
                Object[] objArr4 = (Object[]) this.f5146q;
                wc.f fVar5 = (wc.f) this.f5145p;
                v6.a.W(obj);
                j12 >>= 8;
                i15++;
                if (i15 < i16) {
                    if (i16 == 8) {
                        length = i17;
                        jArr = jArr5;
                        objArr = objArr4;
                        fVar = fVar5;
                        if (i10 != length) {
                            i10++;
                            j3 = jArr[i10];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                fVar5 = fVar;
                                i15 = 0;
                                jArr5 = jArr;
                                i17 = length;
                                i16 = 8 - ((~(i10 - length)) >>> 31);
                                objArr4 = objArr;
                                j12 = j3;
                                if (i15 < i16) {
                                    if ((255 & j12) < 128) {
                                        Object obj2 = objArr4[(i10 << 3) + i15];
                                        this.f5145p = fVar5;
                                        this.f5146q = objArr4;
                                        this.f5138i = jArr5;
                                        this.f5139j = i17;
                                        this.f5140k = i10;
                                        this.f5143n = j12;
                                        this.f5141l = i16;
                                        this.f5142m = i15;
                                        this.f5144o = 1;
                                        fVar5.b(obj2, this);
                                        return gc.a.f2559g;
                                    }
                                    j12 >>= 8;
                                    i15++;
                                    if (i15 < i16) {
                                    }
                                }
                            }
                            if (i10 != length) {
                            }
                        }
                    }
                    return o.f277a;
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int i18 = this.f5144o;
                if (i18 == 0) {
                    v6.a.W(obj);
                    fVar2 = (wc.f) this.f5145p;
                    hVar = (s.h) this.f5147r;
                    jArr2 = hVar.f6273h.f6266a;
                    length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        i11 = 0;
                        j6 = jArr2[i11];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i11 != length2) {
                        }
                    }
                    return o.f277a;
                }
                if (i18 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i19 = this.f5142m;
                int i20 = this.f5141l;
                long j13 = this.f5143n;
                i11 = this.f5140k;
                int i21 = this.f5139j;
                long[] jArr6 = this.f5138i;
                s.h hVar2 = (s.h) this.f5146q;
                wc.f fVar6 = (wc.f) this.f5145p;
                v6.a.W(obj);
                j13 >>= 8;
                i19++;
                if (i19 < i20) {
                    if (i20 == 8) {
                        length2 = i21;
                        jArr2 = jArr6;
                        hVar = hVar2;
                        fVar2 = fVar6;
                        if (i11 != length2) {
                            i11++;
                            j6 = jArr2[i11];
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                hVar2 = hVar;
                                i20 = 8 - ((~(i11 - length2)) >>> 31);
                                fVar6 = fVar2;
                                i19 = 0;
                                jArr6 = jArr2;
                                i21 = length2;
                                j13 = j6;
                                if (i19 < i20) {
                                    if ((255 & j13) < 128) {
                                        int i22 = (i11 << 3) + i19;
                                        g0 g0Var = hVar2.f6273h;
                                        r0.a aVar = new r0.a(1, g0Var.f6267b[i22], g0Var.f6268c[i22]);
                                        this.f5145p = fVar6;
                                        this.f5146q = hVar2;
                                        this.f5138i = jArr6;
                                        this.f5139j = i21;
                                        this.f5140k = i11;
                                        this.f5143n = j13;
                                        this.f5141l = i20;
                                        this.f5142m = i19;
                                        this.f5144o = 1;
                                        fVar6.b(aVar, this);
                                        return gc.a.f2559g;
                                    }
                                    j13 >>= 8;
                                    i19++;
                                    if (i19 < i20) {
                                    }
                                }
                            }
                            if (i11 != length2) {
                            }
                        }
                    }
                    return o.f277a;
                }
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                int i23 = this.f5144o;
                if (i23 == 0) {
                    v6.a.W(obj);
                    fVar3 = (wc.f) this.f5145p;
                    g0 g0Var2 = ((s.h) this.f5147r).f6273h;
                    objArr2 = g0Var2.f6267b;
                    jArr3 = g0Var2.f6266a;
                    length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        i12 = 0;
                        j10 = jArr3[i12];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i12 != length3) {
                        }
                    }
                    return o.f277a;
                }
                if (i23 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i24 = this.f5142m;
                int i25 = this.f5141l;
                long j14 = this.f5143n;
                i12 = this.f5140k;
                int i26 = this.f5139j;
                long[] jArr7 = this.f5138i;
                Object[] objArr5 = (Object[]) this.f5146q;
                wc.f fVar7 = (wc.f) this.f5145p;
                v6.a.W(obj);
                j14 >>= 8;
                i24++;
                if (i24 < i25) {
                    if (i25 == 8) {
                        length3 = i26;
                        jArr3 = jArr7;
                        objArr2 = objArr5;
                        fVar3 = fVar7;
                        if (i12 != length3) {
                            i12++;
                            j10 = jArr3[i12];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                fVar7 = fVar3;
                                i24 = 0;
                                jArr7 = jArr3;
                                i26 = length3;
                                i25 = 8 - ((~(i12 - length3)) >>> 31);
                                objArr5 = objArr2;
                                j14 = j10;
                                if (i24 < i25) {
                                    if ((255 & j14) < 128) {
                                        Object obj3 = objArr5[(i12 << 3) + i24];
                                        this.f5145p = fVar7;
                                        this.f5146q = objArr5;
                                        this.f5138i = jArr7;
                                        this.f5139j = i26;
                                        this.f5140k = i12;
                                        this.f5143n = j14;
                                        this.f5141l = i25;
                                        this.f5142m = i24;
                                        this.f5144o = 1;
                                        fVar7.b(obj3, this);
                                        return gc.a.f2559g;
                                    }
                                    j14 >>= 8;
                                    i24++;
                                    if (i24 < i25) {
                                    }
                                }
                            }
                            if (i12 != length3) {
                            }
                        }
                    }
                    return o.f277a;
                }
            default:
                int i27 = this.f5144o;
                if (i27 == 0) {
                    v6.a.W(obj);
                    fVar4 = (wc.f) this.f5145p;
                    g0 g0Var3 = (g0) ((s0) this.f5147r).f6340h;
                    objArr3 = g0Var3.f6268c;
                    jArr4 = g0Var3.f6266a;
                    length4 = jArr4.length - 2;
                    if (length4 >= 0) {
                        i13 = 0;
                        j11 = jArr4[i13];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i13 != length4) {
                        }
                    }
                    return o.f277a;
                }
                if (i27 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i28 = this.f5142m;
                int i29 = this.f5141l;
                long j15 = this.f5143n;
                i13 = this.f5140k;
                int i30 = this.f5139j;
                long[] jArr8 = this.f5138i;
                Object[] objArr6 = (Object[]) this.f5146q;
                wc.f fVar8 = (wc.f) this.f5145p;
                v6.a.W(obj);
                j15 >>= 8;
                i28++;
                if (i28 < i29) {
                    if (i29 == 8) {
                        length4 = i30;
                        jArr4 = jArr8;
                        objArr3 = objArr6;
                        fVar4 = fVar8;
                        if (i13 != length4) {
                            i13++;
                            j11 = jArr4[i13];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                fVar8 = fVar4;
                                i28 = 0;
                                jArr8 = jArr4;
                                i30 = length4;
                                i29 = 8 - ((~(i13 - length4)) >>> 31);
                                objArr6 = objArr3;
                                j15 = j11;
                                if (i28 < i29) {
                                    if ((255 & j15) < 128) {
                                        Object obj4 = objArr6[(i13 << 3) + i28];
                                        this.f5145p = fVar8;
                                        this.f5146q = objArr6;
                                        this.f5138i = jArr8;
                                        this.f5139j = i30;
                                        this.f5140k = i13;
                                        this.f5143n = j15;
                                        this.f5141l = i29;
                                        this.f5142m = i28;
                                        this.f5144o = 1;
                                        fVar8.b(obj4, this);
                                        return gc.a.f2559g;
                                    }
                                    j15 >>= 8;
                                    i28++;
                                    if (i28 < i29) {
                                    }
                                }
                            }
                            if (i13 != length4) {
                            }
                        }
                    }
                    return o.f277a;
                }
        }
    }
}
