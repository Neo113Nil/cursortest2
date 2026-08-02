package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class t0b0 {
    public Activity a;
    public Application b;
    public final lya0 c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public m0b0 g;

    public t0b0() {
        lya0 kya0Var;
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            kya0Var = new hya0();
        } else if (i == 33) {
            kya0Var = new iya0();
        } else {
            if (34 > i || i >= Integer.MAX_VALUE) {
                w511.x("This sdk version is not supported yet.");
                throw null;
            }
            kya0Var = new kya0();
        }
        this.c = kya0Var;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }
}
