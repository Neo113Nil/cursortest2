package D0;

import android.view.View;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.HashMap;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public final View f513b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f512a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f514c = new ArrayList();

    public w(View view) {
        this.f513b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f513b == wVar.f513b && this.f512a.equals(wVar.f512a);
    }

    public final int hashCode() {
        return this.f512a.hashCode() + (this.f513b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder c9 = AbstractC5050e.c("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        c9.append(this.f513b);
        c9.append("\n");
        String g9 = Wv.g(c9.toString(), "    values:");
        HashMap hashMap = this.f512a;
        for (String str : hashMap.keySet()) {
            g9 = g9 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return g9;
    }
}
