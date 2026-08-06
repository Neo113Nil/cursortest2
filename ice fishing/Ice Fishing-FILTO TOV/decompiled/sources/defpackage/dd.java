package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class dd {
    public final Bundle EljAMC1QTz;
    public final LinkedHashMap OOA6hdeuvCS;
    public final ArrayList X1lG3V04pd;
    public final transient LinkedHashMap xqGvceK5x;
    public final LinkedHashMap GWasM1elztuh = new LinkedHashMap();
    public final LinkedHashMap Yi7zF1RB1 = new LinkedHashMap();

    public dd() {
        new LinkedHashMap();
        this.X1lG3V04pd = new ArrayList();
        this.xqGvceK5x = new LinkedHashMap();
        this.OOA6hdeuvCS = new LinkedHashMap();
        this.EljAMC1QTz = new Bundle();
    }

    public final boolean GWasM1elztuh(int i, int i2, Intent intent) {
        String str = (String) this.GWasM1elztuh.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        if (this.xqGvceK5x.get(str) != null) {
            o4.YmKjaVtbfp5Z();
            return false;
        }
        this.OOA6hdeuvCS.remove(str);
        this.EljAMC1QTz.putParcelable(str, new FhVkB11j(intent, i2));
        return true;
    }
}
