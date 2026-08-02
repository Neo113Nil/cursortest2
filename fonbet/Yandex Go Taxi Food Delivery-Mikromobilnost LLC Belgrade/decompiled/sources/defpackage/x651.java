package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class x651 {
    public final y651 a;

    public x651() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new b751();
            return;
        }
        if (i >= 31) {
            this.a = new a751();
        } else if (i >= 30) {
            this.a = new z651();
        } else {
            this.a = new y651();
        }
    }

    public x651(n751 n751Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new b751(n751Var);
            return;
        }
        if (i >= 31) {
            this.a = new a751(n751Var);
        } else if (i >= 30) {
            this.a = new z651(n751Var);
        } else {
            this.a = new y651(n751Var);
        }
    }
}
