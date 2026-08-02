package defpackage;

import androidx.compose.animation.core.c;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class qsv implements ComposeAnimation {
    public static final boolean c;
    public final ztz0 a;
    public final c b;

    static {
        ComposeAnimationType[] values = ComposeAnimationType.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (jl40.l(values[i].name(), "INFINITE_TRANSITION")) {
                z = true;
                break;
            }
            i++;
        }
        c = z;
    }

    public qsv(ztz0 ztz0Var, c cVar) {
        this.a = ztz0Var;
        this.b = cVar;
        ComposeAnimationType composeAnimationType = ComposeAnimationType.INFINITE_TRANSITION;
        Collections.singleton(0);
    }
}
