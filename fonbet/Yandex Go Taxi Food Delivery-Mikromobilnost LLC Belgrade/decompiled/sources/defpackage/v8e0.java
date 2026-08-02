package defpackage;

import android.app.Activity;
import kotlin.a;

/* loaded from: classes5.dex */
public final class v8e0 {
    public final Activity a;
    public final i3y b;
    public final i3y c;

    public v8e0(Activity activity) {
        this.a = activity;
        final int i = 0;
        this.b = a.a(new sls(this) { // from class: t8e0
            public final /* synthetic */ v8e0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                v8e0 v8e0Var = this.b;
                switch (i2) {
                    case 0:
                        return new qc4(v8e0Var.a);
                    default:
                        return new a87(v8e0Var.a);
                }
            }
        });
        final int i2 = 1;
        this.c = a.a(new sls(this) { // from class: t8e0
            public final /* synthetic */ v8e0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                v8e0 v8e0Var = this.b;
                switch (i22) {
                    case 0:
                        return new qc4(v8e0Var.a);
                    default:
                        return new a87(v8e0Var.a);
                }
            }
        });
    }
}
