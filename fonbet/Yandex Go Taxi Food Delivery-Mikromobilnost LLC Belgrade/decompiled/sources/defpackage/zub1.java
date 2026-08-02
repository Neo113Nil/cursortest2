package defpackage;

import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class zub1 {
    public final zzcs a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zub1) {
            return ooc.m(this.a, ((zub1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
