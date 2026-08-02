package defpackage;

import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzoa;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class yk91 {
    public final zzoa a;
    public final Boolean b;
    public final wmb1 c;

    public /* synthetic */ yk91(qk91 qk91Var) {
        this.a = qk91Var.a;
        this.b = qk91Var.b;
        this.c = qk91Var.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yk91)) {
            return false;
        }
        yk91 yk91Var = (yk91) obj;
        return ooc.m(this.a, yk91Var.a) && ooc.m(this.b, yk91Var.b) && ooc.m(null, null) && ooc.m(this.c, yk91Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
