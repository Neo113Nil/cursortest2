package defpackage;

import com.yandex.plus.core.analytics.logging.PlusLogTag;

/* loaded from: classes2.dex */
public final class v810 implements ct41 {
    public final int a;
    public int b;

    public v810(int i) {
        this.a = 20;
    }

    @Override // defpackage.ct41
    public final boolean a(mn41 mn41Var, urd0 urd0Var) {
        if (u810.a[urd0Var.a().ordinal()] != 1) {
            this.b = 0;
            return false;
        }
        int i = this.b;
        if (i < this.a) {
            this.b = i + 1;
            return false;
        }
        skd0.h(PlusLogTag.SDK, "Redirect to " + urd0Var.getUri() + " is not allowed: max redirect depth is reached!", null);
        return true;
    }

    public v810() {
        this(0);
    }
}
