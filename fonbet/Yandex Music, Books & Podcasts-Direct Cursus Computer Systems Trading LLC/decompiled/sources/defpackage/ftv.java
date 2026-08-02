package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class ftv {
    public final jyr a = btf.b(new h8v(25));
    public final jyr b;
    public final jyr c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    public ftv() {
        final int i = 0;
        this.b = btf.b(new Function0(this) { // from class: etv
            public final /* synthetic */ ftv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return lhs.b((lhs) this.b.a.getValue(), "Data", 60, 60000L, 24);
                    default:
                        return lhs.b((lhs) this.b.a.getValue(), "Image", 60, 60000L, 24);
                }
            }
        });
        final int i2 = 1;
        this.c = btf.b(new Function0(this) { // from class: etv
            public final /* synthetic */ ftv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return lhs.b((lhs) this.b.a.getValue(), "Data", 60, 60000L, 24);
                    default:
                        return lhs.b((lhs) this.b.a.getValue(), "Image", 60, 60000L, 24);
                }
            }
        });
    }
}
