package defpackage;

import android.view.View;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b9t {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public b9t(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b9t)) {
            return false;
        }
        b9t b9tVar = (b9t) obj;
        return this.b == b9tVar.b && this.a.equals(b9tVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m = tlm.m("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        m.append(this.b);
        m.append(StringUtil.LF);
        String concat = m.toString().concat("    values:");
        HashMap hashMap = this.a;
        for (String str : hashMap.keySet()) {
            concat = concat + "    " + str + ": " + hashMap.get(str) + StringUtil.LF;
        }
        return concat;
    }
}
