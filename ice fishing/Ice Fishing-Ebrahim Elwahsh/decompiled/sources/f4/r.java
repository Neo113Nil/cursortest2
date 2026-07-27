package f4;

import android.util.Log;
import com.google.android.gms.internal.ads.CL;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f37771d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f37772a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37773b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37774c;

    public r(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + com.anythink.core.common.d.j.f12535z);
            str3 = str2.substring(8);
        }
        if (str3 == null || !f37771d.matcher(str3).matches()) {
            throw new IllegalArgumentException(D.y.k("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f37772a = str3;
        this.f37773b = str;
        this.f37774c = CL.k(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f37772a.equals(rVar.f37772a) && this.f37773b.equals(rVar.f37773b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f37773b, this.f37772a});
    }
}
