package defpackage;

import com.yandex.go.taxi.order.queue.analytics.QueueAnalytics$Screen;

/* loaded from: classes14.dex */
public final class rkg0 extends tkg0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rkg0(dkg0 dkg0Var, int i) {
        super(dkg0Var);
        this.b = i;
    }

    @Override // defpackage.tkg0
    public final QueueAnalytics$Screen a() {
        switch (this.b) {
            case 0:
                return QueueAnalytics$Screen.CONFIRM;
            case 1:
                return QueueAnalytics$Screen.CONFIRM_ERROR;
            default:
                return QueueAnalytics$Screen.MAIN;
        }
    }

    @Override // defpackage.tkg0
    public final kkg0 b() {
        switch (this.b) {
            case 0:
                return this.a.d;
            case 1:
                return this.a.f;
            default:
                return this.a.c;
        }
    }

    @Override // defpackage.tkg0
    public final tkg0 c() {
        switch (this.b) {
            case 0:
                return new skg0(this.a);
            case 1:
                return new skg0(this.a);
            default:
                return new rkg0(this.a, 0);
        }
    }

    @Override // defpackage.tkg0
    public tkg0 d() {
        switch (this.b) {
            case 0:
                return new rkg0(this.a, 2);
            case 1:
                return new rkg0(this.a, 2);
            default:
                return this;
        }
    }
}
