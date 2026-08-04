package com.gamericefishpro.space.d4;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class g1 extends f1 {
    public g1(o1 o1Var, WindowInsets windowInsets) {
        super(o1Var, windowInsets);
    }

    @Override // com.gamericefishpro.space.d4.l1
    public o1 a() {
        return o1.d(null, this.c.consumeDisplayCutout());
    }

    @Override // com.gamericefishpro.space.d4.e1, com.gamericefishpro.space.d4.l1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Objects.equals(this.c, g1Var.c) && Objects.equals(this.g, g1Var.g) && e1.C(this.h, g1Var.h);
    }

    @Override // com.gamericefishpro.space.d4.l1
    public k f() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new k(displayCutout);
    }

    @Override // com.gamericefishpro.space.d4.l1
    public int hashCode() {
        return this.c.hashCode();
    }

    public g1(o1 o1Var, g1 g1Var) {
        super(o1Var, g1Var);
    }
}
