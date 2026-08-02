package defpackage;

import androidx.compose.material.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class mbi extends uif implements Function2 {
    public final /* synthetic */ wn5 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ wn5 r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ bci t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ dup v;
    public final /* synthetic */ float w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbi(wn5 wn5Var, yci yciVar, bci bciVar, boolean z, dup dupVar, float f, long j, long j2, long j3, wn5 wn5Var2, int i, int i2) {
        super(2);
        this.r = wn5Var;
        this.s = yciVar;
        this.t = bciVar;
        this.u = z;
        this.v = dupVar;
        this.w = f;
        this.x = j;
        this.y = j2;
        this.z = j3;
        this.A = wn5Var2;
        this.B = i;
        this.C = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(this.B | 1);
        int i = this.C;
        a.a(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (hq5) obj, R, i);
        return Unit.a;
    }
}
