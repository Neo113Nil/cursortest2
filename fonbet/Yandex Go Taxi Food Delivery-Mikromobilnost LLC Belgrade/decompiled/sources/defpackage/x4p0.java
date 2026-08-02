package defpackage;

import android.content.Context;
import kotlin.a;

/* loaded from: classes13.dex */
public final class x4p0 extends r8 {
    public xm00 A;
    public w4e0 B;
    public final zuj0 c;
    public final o7g w;
    public final eym0 x;
    public final i3y y;
    public final i3y z;

    public x4p0(ah00 ah00Var, Context context, zuj0 zuj0Var, o7g o7gVar) {
        super(5, ah00Var);
        this.c = zuj0Var;
        this.w = o7gVar;
        eym0 eym0Var = new eym0(2, this);
        ((gh00) ah00Var).e(eym0Var);
        this.x = eym0Var;
        final int i = 0;
        this.y = a.a(new sls(this) { // from class: w4p0
            public final /* synthetic */ x4p0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                x4p0 x4p0Var = this.b;
                switch (i2) {
                }
                return (j741) x4p0Var.w.get();
            }
        });
        final int i2 = 1;
        this.z = a.a(new sls(this) { // from class: w4p0
            public final /* synthetic */ x4p0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                x4p0 x4p0Var = this.b;
                switch (i22) {
                }
                return (j741) x4p0Var.w.get();
            }
        });
    }
}
