package defpackage;

import android.content.Context;
import android.media.AudioManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ex1 {
    public final Context a;
    public final jyr b;
    public final jyr c;
    public boolean d;

    public ex1(Context context) {
        this.a = context;
        final int i = 0;
        this.b = btf.b(new Function0(this) { // from class: dx1
            public final /* synthetic */ ex1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return l1b.c(this.b.a);
                    default:
                        return ((AudioManager) this.b.b.getValue()).getClass().getMethod("getOutputLatency", Integer.TYPE);
                }
            }
        });
        final int i2 = 1;
        this.c = btf.b(new Function0(this) { // from class: dx1
            public final /* synthetic */ ex1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return l1b.c(this.b.a);
                    default:
                        return ((AudioManager) this.b.b.getValue()).getClass().getMethod("getOutputLatency", Integer.TYPE);
                }
            }
        });
    }
}
