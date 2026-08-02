package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class tcs extends uif implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ ges D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ String r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ long t;
    public final /* synthetic */ long u;
    public final /* synthetic */ tqc v;
    public final /* synthetic */ long w;
    public final /* synthetic */ o9s x;
    public final /* synthetic */ long y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcs(String str, yci yciVar, long j, long j2, tqc tqcVar, long j3, o9s o9sVar, long j4, int i, boolean z, int i2, int i3, ges gesVar, int i4, int i5, int i6) {
        super(2);
        this.r = str;
        this.s = yciVar;
        this.t = j;
        this.u = j2;
        this.v = tqcVar;
        this.w = j3;
        this.x = o9sVar;
        this.y = j4;
        this.z = i;
        this.A = z;
        this.B = i2;
        this.C = i3;
        this.D = gesVar;
        this.E = i4;
        this.F = i5;
        this.G = i6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(this.E | 1);
        int R2 = rvf.R(this.F);
        int i = this.G;
        wcs.b(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, (hq5) obj, R, R2, i);
        return Unit.a;
    }
}
