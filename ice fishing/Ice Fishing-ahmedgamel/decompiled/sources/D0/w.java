package D0;

import android.view.View;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.util.ArrayList;
import java.util.HashMap;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public final View f617b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f616a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f618c = new ArrayList();

    public w(View view) {
        this.f617b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f617b == wVar.f617b && this.f616a.equals(wVar.f616a);
    }

    public final int hashCode() {
        return this.f616a.hashCode() + (this.f617b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder c9 = AbstractC5049e.c("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        c9.append(this.f617b);
        c9.append("\n");
        String f3 = AbstractC4404f.f(c9.toString(), "    values:");
        HashMap hashMap = this.f616a;
        for (String str : hashMap.keySet()) {
            f3 = f3 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return f3;
    }
}
