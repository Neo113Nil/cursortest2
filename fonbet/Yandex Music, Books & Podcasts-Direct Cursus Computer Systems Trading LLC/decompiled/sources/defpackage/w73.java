package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class w73 extends uif implements Function2 {
    public final /* synthetic */ String r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w73(String str, int i, boolean z, yci yciVar, int i2) {
        super(2);
        this.r = str;
        this.s = yciVar;
        this.t = z;
        this.u = i;
        this.v = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        h4a.m(rvf.R(this.u | 1), this.v, (hq5) obj, this.s, this.r, this.t);
        return Unit.a;
    }
}
