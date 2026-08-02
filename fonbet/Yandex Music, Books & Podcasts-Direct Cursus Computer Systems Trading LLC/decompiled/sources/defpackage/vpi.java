package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vpi extends h7o implements Function2 {
    public g5d k;
    public wpi l;
    public long[] m;
    public int n;
    public int o;
    public int p;
    public int q;
    public long r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ wpi u;
    public final /* synthetic */ g5d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpi(wpi wpiVar, g5d g5dVar, Continuation continuation) {
        super(2, continuation);
        this.u = wpiVar;
        this.v = g5dVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        vpi vpiVar = new vpi(this.u, this.v, continuation);
        vpiVar.t = obj;
        return vpiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vpi) create((ygp) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:14:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:6:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006f -> B:5:0x0096). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ygp ygpVar;
        wpi wpiVar;
        long[] jArr;
        int length;
        g5d g5dVar;
        int i;
        long j;
        nm6 nm6Var = nm6.a;
        int i2 = this.s;
        if (i2 == 0) {
            qgg.h0(obj);
            ygpVar = (ygp) this.t;
            wpiVar = this.u;
            jArr = wpiVar.b.a;
            length = jArr.length - 2;
            if (length >= 0) {
                g5dVar = this.v;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return Unit.a;
        }
        if (i2 != 1) {
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.q;
        int i4 = this.p;
        long j2 = this.r;
        int i5 = this.o;
        int i6 = this.n;
        long[] jArr2 = this.m;
        wpi wpiVar2 = this.l;
        g5d g5dVar2 = this.k;
        ygp ygpVar2 = (ygp) this.t;
        qgg.h0(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                wpiVar = wpiVar2;
                ygpVar = ygpVar2;
                i = i5;
                g5dVar = g5dVar2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        ygpVar2 = ygpVar;
                        i3 = 0;
                        wpiVar2 = wpiVar;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        g5dVar2 = g5dVar;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                g5dVar2.b = i7;
                                Object obj2 = wpiVar2.b.b[i7];
                                this.t = ygpVar2;
                                this.k = g5dVar2;
                                this.l = wpiVar2;
                                this.m = jArr2;
                                this.n = i6;
                                this.o = i5;
                                this.r = j2;
                                this.p = i4;
                                this.q = i3;
                                this.s = 1;
                                ygpVar2.a(obj2, this);
                                nm6 nm6Var2 = nm6.a;
                                return nm6Var;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return Unit.a;
        }
    }
}
