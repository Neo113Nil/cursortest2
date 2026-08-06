package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class th0 implements hv {
    public final /* synthetic */ Bundle EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ th0(Bundle bundle, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = bundle;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        boolean containsKey;
        int i = this.OOA6hdeuvCS;
        Bundle bundle = this.EljAMC1QTz;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
            default:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
        }
        return Boolean.valueOf(!containsKey);
    }
}
