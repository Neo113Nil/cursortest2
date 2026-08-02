package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class brh {
    public ArrayList a = new ArrayList();

    public crh a() {
        if (this.a == null) {
            return crh.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new crh(bundle, this.a);
    }
}
