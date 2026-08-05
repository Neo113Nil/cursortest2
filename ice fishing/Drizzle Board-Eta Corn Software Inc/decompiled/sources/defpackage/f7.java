package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class f7 implements p50 {
    public final /* synthetic */ f4UNdked NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ f7(f4UNdked f4undked, int i) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = f4undked;
    }

    @Override // defpackage.p50
    public final Bundle qoPGr6Ce() {
        int i = this.qoPGr6Ce;
        f4UNdked f4undked = this.NCTxEWno;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                h7 h7Var = f4undked.ow5vqvCr;
                h7Var.getClass();
                HashMap hashMap = h7Var.NCTxEWno;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(h7Var.wxUZMvaN));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) h7Var.b2ZJblxo.clone());
                return bundle;
        }
        while (f4UNdked.ygLcUYwZ(((ni) f4undked.Ey6iv0m0.MdtA4re8).KlHjfFWx)) {
        }
        f4undked.I5GHvsYW.wxUZMvaN(oo.ON_STOP);
        return new Bundle();
    }
}
