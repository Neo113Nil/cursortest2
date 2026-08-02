package app.cash.zipline;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class Zipline$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Zipline f$0;

    public /* synthetic */ Zipline$$ExternalSyntheticLambda0(Zipline zipline, int i) {
        this.$r8$classId = i;
        this.f$0 = zipline;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Zipline zipline = this.f$0;
        switch (i) {
            case 0:
                return zipline.guest;
            default:
                return zipline.quickJs.getInboundChannel$zipline_release();
        }
    }
}
