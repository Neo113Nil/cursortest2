package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class hnh {
    public final yde a;

    public hnh(yde ydeVar) {
        Uri uri = Uri.EMPTY;
        List list = Collections.EMPTY_LIST;
        this.a = ydeVar;
        tde u = yde.u();
        for (int i = 0; i < ydeVar.size(); i++) {
            ((knh) ydeVar.get(i)).getClass();
            u.a(new knh());
        }
        u.f();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnh)) {
            return false;
        }
        hnh hnhVar = (hnh) obj;
        Uri uri = Uri.EMPTY;
        if (!uri.equals(uri)) {
            return false;
        }
        int i = yut.a;
        List list = Collections.EMPTY_LIST;
        return list.equals(list) && this.a.equals(hnhVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() + ((Collections.EMPTY_LIST.hashCode() + (Uri.EMPTY.hashCode() * 923521)) * 961)) * 31;
    }
}
