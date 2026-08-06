package defpackage;

import java.util.Random;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ozMwhSAI extends ts0 {
    @Override // defpackage.ts0
    public final int GWasM1elztuh(int i) {
        return (OOA6hdeuvCS().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    public abstract Random OOA6hdeuvCS();

    @Override // defpackage.ts0
    public final int X1lG3V04pd() {
        return OOA6hdeuvCS().nextInt();
    }

    @Override // defpackage.ts0
    public final float Yi7zF1RB1() {
        return OOA6hdeuvCS().nextFloat();
    }
}
