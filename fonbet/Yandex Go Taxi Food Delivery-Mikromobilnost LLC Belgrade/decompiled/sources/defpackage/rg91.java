package defpackage;

import android.os.Bundle;
import com.google.common.collect.ImmutableSet;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class rg91 implements cv2 {
    public final /* synthetic */ wl91 a;

    public rg91(wl91 wl91Var) {
        this.a = wl91Var;
    }

    @Override // defpackage.fka1
    public final void a(String str, String str2, Bundle bundle, long j) {
        wl91 wl91Var = this.a;
        if (((HashSet) wl91Var.a).contains(str2)) {
            Bundle bundle2 = new Bundle();
            ImmutableSet immutableSet = nc91.a;
            String Z = udq0.Z(str2, cma1.e, cma1.c);
            if (Z != null) {
                str2 = Z;
            }
            bundle2.putString("events", str2);
            ((lb7) wl91Var.b).v(bundle2);
        }
    }
}
