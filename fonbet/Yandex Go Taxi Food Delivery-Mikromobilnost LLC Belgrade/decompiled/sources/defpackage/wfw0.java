package defpackage;

import ru.yandex.taxi.animation.NavigationDirection;

/* loaded from: classes8.dex */
public final class wfw0 extends omr {
    public final dfw0 b;
    public final lh2 c;

    public wfw0(dfw0 dfw0Var) {
        this.b = dfw0Var;
        final int i = 0;
        final int i2 = 1;
        this.c = new lh2(new sls(this) { // from class: vfw0
            public final /* synthetic */ wfw0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                wfw0 wfw0Var = this.b;
                switch (i3) {
                    case 0:
                        if (wfw0Var.b.a != null) {
                            break;
                        } else {
                            break;
                        }
                    default:
                        if (!wfw0Var.a) {
                            break;
                        } else {
                            break;
                        }
                }
                return NavigationDirection.BACKWARD;
            }
        }, new sls(this) { // from class: vfw0
            public final /* synthetic */ wfw0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                wfw0 wfw0Var = this.b;
                switch (i3) {
                    case 0:
                        if (wfw0Var.b.a != null) {
                            break;
                        } else {
                            break;
                        }
                    default:
                        if (!wfw0Var.a) {
                            break;
                        } else {
                            break;
                        }
                }
                return NavigationDirection.BACKWARD;
            }
        });
    }

    @Override // defpackage.rmr
    public final mh2 a() {
        return this.c;
    }
}
