package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class g8r {
    public final jyr a = btf.b(new nrq(20));
    public final jyr b;
    public final jyr c;

    public g8r() {
        final int i = 0;
        this.b = btf.b(new Function0(this) { // from class: f8r
            public final /* synthetic */ g8r b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return lhs.b((lhs) this.b.a.getValue(), "Success", 0, 0L, 30);
                    default:
                        return lhs.b((lhs) this.b.a.getValue(), "Empty", 0, 0L, 30);
                }
            }
        });
        final int i2 = 1;
        this.c = btf.b(new Function0(this) { // from class: f8r
            public final /* synthetic */ g8r b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return lhs.b((lhs) this.b.a.getValue(), "Success", 0, 0L, 30);
                    default:
                        return lhs.b((lhs) this.b.a.getValue(), "Empty", 0, 0L, 30);
                }
            }
        });
    }
}
