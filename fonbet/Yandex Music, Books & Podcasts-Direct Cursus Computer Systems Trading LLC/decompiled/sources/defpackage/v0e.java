package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class v0e implements n2i {
    public final String a;
    public final String b;
    public final List c;

    public v0e(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0e.class == obj.getClass()) {
            v0e v0eVar = (v0e) obj;
            if (TextUtils.equals(this.a, v0eVar.a) && TextUtils.equals(this.b, v0eVar.b) && this.c.equals(v0eVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        return "HlsTrackMetadataEntry".concat(str != null ? su4.o(ouj.u(" [", str, ", "), this.b, "]") : "");
    }
}
