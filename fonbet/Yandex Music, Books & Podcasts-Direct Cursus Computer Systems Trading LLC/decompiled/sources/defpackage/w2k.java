package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class w2k extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ utf s;
    public final /* synthetic */ long t;
    public final /* synthetic */ v2k u;
    public final /* synthetic */ long v;
    public final /* synthetic */ bxj w;
    public final /* synthetic */ gz2 x;
    public final /* synthetic */ hz2 y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2k(utf utfVar, long j, v2k v2kVar, long j2, bxj bxjVar, gz2 gz2Var, hz2 hz2Var, int i, int i2) {
        super(1);
        this.r = i2;
        this.s = utfVar;
        this.t = j;
        this.u = v2kVar;
        this.v = j2;
        this.w = bxjVar;
        this.x = gz2Var;
        this.y = hz2Var;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                int intValue = ((Number) obj).intValue();
                utf utfVar = this.s;
                return swf.F(utfVar, intValue, this.t, this.u, this.v, this.w, this.x, this.y, utfVar.b.getLayoutDirection(), false, this.z);
            default:
                int intValue2 = ((Number) obj).intValue();
                utf utfVar2 = this.s;
                return swf.F(utfVar2, intValue2, this.t, this.u, this.v, this.w, this.x, this.y, utfVar2.b.getLayoutDirection(), false, this.z);
        }
    }
}
