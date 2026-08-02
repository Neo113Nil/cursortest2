package defpackage;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;

/* loaded from: classes10.dex */
public final class xe2 implements ComposeAnimation, dy01 {
    public static final boolean b;
    public final zx01 a;

    static {
        ComposeAnimationType[] values = ComposeAnimationType.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (jl40.l(values[i].name(), "ANIMATED_CONTENT")) {
                z = true;
                break;
            }
            i++;
        }
        b = z;
    }

    public xe2(zx01 zx01Var) {
        this.a = zx01Var;
        ComposeAnimationType composeAnimationType = ComposeAnimationType.ANIMATED_CONTENT;
    }

    @Override // defpackage.dy01
    public final zx01 a() {
        return this.a;
    }
}
