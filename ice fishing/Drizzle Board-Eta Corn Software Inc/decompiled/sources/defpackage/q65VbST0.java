package defpackage;

import android.os.Bundle;
import com.kolosta.rejin.jilosa.presentation.ui.MainActivity;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class q65VbST0 implements p50 {
    public final Object NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public q65VbST0(mcXgUFR8 mcxgufr8) {
        this.qoPGr6Ce = 1;
        this.NCTxEWno = new LinkedHashSet();
        mcxgufr8.eIA6dogk("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.p50
    public final Bundle qoPGr6Ce() {
        int i = this.qoPGr6Ce;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((MainActivity) obj).OnDfzHZD();
                return bundle;
            default:
                Bundle VgvYg0wo = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                f50.OnDfzHZD(VgvYg0wo, "classes_to_restore", x5.B1cjorwa((LinkedHashSet) obj));
                return VgvYg0wo;
        }
    }

    public q65VbST0(MainActivity mainActivity) {
        this.qoPGr6Ce = 0;
        this.NCTxEWno = mainActivity;
    }
}
