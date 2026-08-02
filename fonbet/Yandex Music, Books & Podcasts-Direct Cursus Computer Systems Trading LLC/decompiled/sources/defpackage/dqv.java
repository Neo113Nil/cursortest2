package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class dqv extends cqv {
    public dqv(kqv kqvVar, WindowInsets windowInsets) {
        super(kqvVar, windowInsets);
    }

    @Override // defpackage.hqv
    public kqv a() {
        return kqv.h(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.bqv, defpackage.hqv
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqv)) {
            return false;
        }
        dqv dqvVar = (dqv) obj;
        return Objects.equals(this.c, dqvVar.c) && Objects.equals(this.g, dqvVar.g) && bqv.C(this.h, dqvVar.h);
    }

    @Override // defpackage.hqv
    public ea8 f() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new ea8(displayCutout);
    }

    @Override // defpackage.hqv
    public int hashCode() {
        return this.c.hashCode();
    }

    public dqv(kqv kqvVar, dqv dqvVar) {
        super(kqvVar, dqvVar);
    }
}
