package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public final class q7t implements p7t {
    public int a;

    public static void b(View view) {
        view.invalidate();
        kcc kccVar = new kcc(new lcc(new wz0(new pg0(view, null, 1)), true, san.i));
        while (kccVar.hasNext()) {
            ((yp8) kccVar.next()).k();
        }
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        int i = this.a + 1;
        this.a = i;
        if (i == 1) {
            b(view);
        }
    }

    @Override // defpackage.p7t
    public final boolean e() {
        return this.a != 0;
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        int i = this.a;
        if (i > 0) {
            int i2 = i - 1;
            this.a = i2;
            if (i2 == 0) {
                b(view);
            }
        }
    }
}
