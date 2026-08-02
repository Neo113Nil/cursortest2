package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ecb extends h7o implements Function2 {
    public final /* synthetic */ int k;
    public long[] l;
    public int m;
    public int n;
    public int o;
    public int p;
    public long q;
    public int r;
    public /* synthetic */ Object s;
    public Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ecb(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.u = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.k) {
            case 0:
                ecb ecbVar = new ecb((fcb) this.u, continuation, 0);
                ecbVar.s = obj;
                return ecbVar;
            case 1:
                ecb ecbVar2 = new ecb((fcb) this.u, continuation, 1);
                ecbVar2.s = obj;
                return ecbVar2;
            case 2:
                ecb ecbVar3 = new ecb((yso) this.u, continuation, 2);
                ecbVar3.s = obj;
                return ecbVar3;
            default:
                ecb ecbVar4 = new ecb((enr) this.u, continuation, 3);
                ecbVar4.s = obj;
                return ecbVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ygp ygpVar = (ygp) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.k) {
        }
        return ((ecb) create(ygpVar, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0086 -> B:7:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006c -> B:16:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006e -> B:8:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0120 -> B:30:0x0140). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0107 -> B:38:0x0149). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0109 -> B:31:0x011a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01b9 -> B:52:0x01d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01a0 -> B:60:0x01e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01a2 -> B:53:0x01b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0252 -> B:74:0x027f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0238 -> B:82:0x0289). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x023a -> B:75:0x024c). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ygp ygpVar;
        fcb fcbVar;
        long[] jArr;
        int length;
        int i;
        long j;
        ygp ygpVar2;
        Object[] objArr;
        long[] jArr2;
        int length2;
        int i2;
        long j2;
        ygp ygpVar3;
        Object[] objArr2;
        long[] jArr3;
        int length3;
        int i3;
        long j3;
        long j4;
        long j5;
        char c;
        ygp ygpVar4;
        Object[] objArr3;
        long[] jArr4;
        int length4;
        int i4;
        long j6;
        int i5 = this.k;
        Object obj2 = this.u;
        switch (i5) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i6 = this.r;
                if (i6 == 0) {
                    qgg.h0(obj);
                    ygpVar = (ygp) this.s;
                    fcbVar = (fcb) obj2;
                    jArr = fcbVar.b.a;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i = 0;
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i != length) {
                        }
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i7 = this.p;
                    int i8 = this.o;
                    long j7 = this.q;
                    int i9 = this.n;
                    int i10 = this.m;
                    long[] jArr5 = this.l;
                    fcb fcbVar2 = (fcb) this.t;
                    ygp ygpVar5 = (ygp) this.s;
                    qgg.h0(obj);
                    j7 >>= 8;
                    i7++;
                    if (i7 < i8) {
                        if (i8 == 8) {
                            i = i9;
                            length = i10;
                            jArr = jArr5;
                            fcbVar = fcbVar2;
                            ygpVar = ygpVar5;
                            if (i != length) {
                                i++;
                                j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    ygpVar5 = ygpVar;
                                    i7 = 0;
                                    jArr5 = jArr;
                                    i8 = 8 - ((~(i - length)) >>> 31);
                                    fcbVar2 = fcbVar;
                                    i10 = length;
                                    i9 = i;
                                    j7 = j;
                                    if (i7 < i8) {
                                        if ((j7 & 255) < 128) {
                                            int i11 = (i9 << 3) + i7;
                                            tpi tpiVar = fcbVar2.b;
                                            k9h k9hVar = new k9h(1, tpiVar.b[i11], tpiVar.c[i11]);
                                            this.s = ygpVar5;
                                            this.t = fcbVar2;
                                            this.l = jArr5;
                                            this.m = i10;
                                            this.n = i9;
                                            this.q = j7;
                                            this.o = i8;
                                            this.p = i7;
                                            this.r = 1;
                                            ygpVar5.a(k9hVar, this);
                                            nm6 nm6Var2 = nm6.a;
                                            break;
                                        }
                                        j7 >>= 8;
                                        i7++;
                                        if (i7 < i8) {
                                        }
                                    }
                                }
                                if (i != length) {
                                }
                            }
                        }
                        break;
                    }
                }
            case 1:
                nm6 nm6Var3 = nm6.a;
                int i12 = this.r;
                if (i12 == 0) {
                    qgg.h0(obj);
                    ygpVar2 = (ygp) this.s;
                    tpi tpiVar2 = ((fcb) obj2).b;
                    objArr = tpiVar2.b;
                    jArr2 = tpiVar2.a;
                    length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        i2 = 0;
                        j2 = jArr2[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i2 != length2) {
                        }
                    }
                } else if (i12 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i13 = this.p;
                    int i14 = this.o;
                    long j8 = this.q;
                    i2 = this.n;
                    int i15 = this.m;
                    long[] jArr6 = this.l;
                    Object[] objArr4 = (Object[]) this.t;
                    ygp ygpVar6 = (ygp) this.s;
                    qgg.h0(obj);
                    j8 >>= 8;
                    i13++;
                    if (i13 < i14) {
                        if (i14 == 8) {
                            length2 = i15;
                            jArr2 = jArr6;
                            objArr = objArr4;
                            ygpVar2 = ygpVar6;
                            if (i2 != length2) {
                                i2++;
                                j2 = jArr2[i2];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    ygpVar6 = ygpVar2;
                                    i13 = 0;
                                    jArr6 = jArr2;
                                    i15 = length2;
                                    i14 = 8 - ((~(i2 - length2)) >>> 31);
                                    objArr4 = objArr;
                                    j8 = j2;
                                    if (i13 < i14) {
                                        if ((j8 & 255) < 128) {
                                            Object obj3 = objArr4[(i2 << 3) + i13];
                                            this.s = ygpVar6;
                                            this.t = objArr4;
                                            this.l = jArr6;
                                            this.m = i15;
                                            this.n = i2;
                                            this.q = j8;
                                            this.o = i14;
                                            this.p = i13;
                                            this.r = 1;
                                            ygpVar6.a(obj3, this);
                                            nm6 nm6Var4 = nm6.a;
                                            break;
                                        }
                                        j8 >>= 8;
                                        i13++;
                                        if (i13 < i14) {
                                        }
                                    }
                                }
                                if (i2 != length2) {
                                }
                            }
                        }
                        break;
                    }
                }
            case 2:
                nm6 nm6Var5 = nm6.a;
                int i16 = this.r;
                if (i16 == 0) {
                    qgg.h0(obj);
                    ygpVar3 = (ygp) this.s;
                    upi upiVar = ((yso) obj2).a;
                    objArr2 = upiVar.b;
                    jArr3 = upiVar.a;
                    length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        i3 = 0;
                        j3 = jArr3[i3];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i3 != length3) {
                        }
                    }
                } else if (i16 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i17 = this.p;
                    int i18 = this.o;
                    long j9 = this.q;
                    i3 = this.n;
                    int i19 = this.m;
                    long[] jArr7 = this.l;
                    Object[] objArr5 = (Object[]) this.t;
                    ygp ygpVar7 = (ygp) this.s;
                    qgg.h0(obj);
                    j9 >>= 8;
                    i17++;
                    if (i17 < i18) {
                        if (i18 == 8) {
                            length3 = i19;
                            jArr3 = jArr7;
                            objArr2 = objArr5;
                            ygpVar3 = ygpVar7;
                            if (i3 != length3) {
                                i3++;
                                j3 = jArr3[i3];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    ygpVar7 = ygpVar3;
                                    i17 = 0;
                                    jArr7 = jArr3;
                                    i19 = length3;
                                    i18 = 8 - ((~(i3 - length3)) >>> 31);
                                    objArr5 = objArr2;
                                    j9 = j3;
                                    if (i17 < i18) {
                                        if ((j9 & 255) < 128) {
                                            Object obj4 = objArr5[(i3 << 3) + i17];
                                            this.s = ygpVar7;
                                            this.t = objArr5;
                                            this.l = jArr7;
                                            this.m = i19;
                                            this.n = i3;
                                            this.q = j9;
                                            this.o = i18;
                                            this.p = i17;
                                            this.r = 1;
                                            ygpVar7.a(obj4, this);
                                            nm6 nm6Var6 = nm6.a;
                                            break;
                                        }
                                        j9 >>= 8;
                                        i17++;
                                        if (i17 < i18) {
                                        }
                                    }
                                }
                                if (i3 != length3) {
                                }
                            }
                        }
                        break;
                    }
                }
            default:
                nm6 nm6Var7 = nm6.a;
                int i20 = this.r;
                if (i20 == 0) {
                    j4 = 128;
                    j5 = 255;
                    c = 7;
                    qgg.h0(obj);
                    ygpVar4 = (ygp) this.s;
                    tpi tpiVar3 = (tpi) ((enr) obj2).b;
                    objArr3 = tpiVar3.c;
                    jArr4 = tpiVar3.a;
                    length4 = jArr4.length - 2;
                    if (length4 >= 0) {
                        i4 = 0;
                        j6 = jArr4[i4];
                        if ((((~j6) << c) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i4 != length4) {
                        }
                    }
                } else if (i20 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i21 = this.p;
                    int i22 = this.o;
                    j4 = 128;
                    long j10 = this.q;
                    int i23 = this.n;
                    j5 = 255;
                    int i24 = this.m;
                    long[] jArr8 = this.l;
                    c = 7;
                    Object[] objArr6 = (Object[]) this.t;
                    ygp ygpVar8 = (ygp) this.s;
                    qgg.h0(obj);
                    j10 >>= 8;
                    i21++;
                    if (i21 < i22) {
                        if (i22 == 8) {
                            jArr4 = jArr8;
                            ygpVar4 = ygpVar8;
                            length4 = i24;
                            objArr3 = objArr6;
                            i4 = i23;
                            if (i4 != length4) {
                                i4++;
                                j6 = jArr4[i4];
                                if ((((~j6) << c) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i25 = 8 - ((~(i4 - length4)) >>> 31);
                                    ygpVar8 = ygpVar4;
                                    int i26 = length4;
                                    jArr8 = jArr4;
                                    j10 = j6;
                                    i22 = i25;
                                    i21 = 0;
                                    i23 = i4;
                                    objArr6 = objArr3;
                                    i24 = i26;
                                    if (i21 < i22) {
                                        if ((j10 & j5) < j4) {
                                            Object obj5 = objArr6[(i23 << 3) + i21];
                                            this.s = ygpVar8;
                                            this.t = objArr6;
                                            this.l = jArr8;
                                            this.m = i24;
                                            this.n = i23;
                                            this.q = j10;
                                            this.o = i22;
                                            this.p = i21;
                                            this.r = 1;
                                            ygpVar8.a(obj5, this);
                                            nm6 nm6Var8 = nm6.a;
                                            break;
                                        }
                                        j10 >>= 8;
                                        i21++;
                                        if (i21 < i22) {
                                        }
                                    }
                                }
                                if (i4 != length4) {
                                }
                            }
                        }
                        break;
                    }
                }
        }
        return Unit.a;
    }
}
