package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ni0 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ onj s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ni0(onj onjVar, int i) {
        super(0);
        this.r = i;
        this.s = onjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return Boolean.valueOf((this.s.a() & 9223372034707292159L) != 9205357640488583168L);
            default:
                return Boolean.valueOf((this.s.a() & 9223372034707292159L) != 9205357640488583168L);
        }
    }
}
