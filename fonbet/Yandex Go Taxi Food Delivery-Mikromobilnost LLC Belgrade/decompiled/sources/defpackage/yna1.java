package defpackage;

import com.google.android.gms.internal.mlkit_vision_face.zzkf;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class yna1 {
    public final zzkf a;
    public final Integer b;

    public /* synthetic */ yna1(kna1 kna1Var) {
        this.a = kna1Var.a;
        this.b = kna1Var.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yna1)) {
            return false;
        }
        yna1 yna1Var = (yna1) obj;
        return ooc.m(this.a, yna1Var.a) && ooc.m(this.b, yna1Var.b) && ooc.m(null, null) && ooc.m(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
