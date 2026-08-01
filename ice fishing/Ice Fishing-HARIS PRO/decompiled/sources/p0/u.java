package p0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public final View f4214b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4213a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4215c = new ArrayList();

    public u(View view) {
        this.f4214b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f4214b == uVar.f4214b && this.f4213a.equals(uVar.f4213a);
    }

    public final int hashCode() {
        return this.f4213a.hashCode() + (this.f4214b.hashCode() * 31);
    }

    public final String toString() {
        String f2 = D1.h.f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f4214b + "\n", "    values:");
        HashMap hashMap = this.f4213a;
        for (String str : hashMap.keySet()) {
            f2 = f2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return f2;
    }
}
