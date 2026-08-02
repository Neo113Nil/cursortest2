package defpackage;

import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zznh;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class z4b1 {
    public final zznh a;
    public final Integer b;

    public /* synthetic */ z4b1(n4b1 n4b1Var) {
        this.a = n4b1Var.a;
        this.b = n4b1Var.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z4b1)) {
            return false;
        }
        z4b1 z4b1Var = (z4b1) obj;
        return ooc.m(this.a, z4b1Var.a) && ooc.m(this.b, z4b1Var.b) && ooc.m(null, null) && ooc.m(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
