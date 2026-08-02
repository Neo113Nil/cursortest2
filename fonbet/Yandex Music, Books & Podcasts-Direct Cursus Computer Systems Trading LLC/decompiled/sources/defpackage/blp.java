package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class blp {
    public static final blp b = new blp(new HashSet());
    public static final String c;
    public final hee a;

    static {
        int i = dvt.a;
        c = Integer.toString(0, 36);
    }

    public blp(HashSet hashSet) {
        this.a = hee.v(hashSet);
    }

    public static blp a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c);
        if (parcelableArrayList == null) {
            vq1.n0("SessionCommands", "Missing commands. Creating an empty SessionCommands");
            return b;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add(alp.a((Bundle) parcelableArrayList.get(i)));
        }
        return new blp(hashSet);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        xkt it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((alp) it.next()).b());
        }
        bundle.putParcelableArrayList(c, arrayList);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof blp) {
            return this.a.equals(((blp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
