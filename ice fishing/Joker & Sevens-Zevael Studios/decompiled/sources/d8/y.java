package d8;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f1831d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f1832a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1833b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1834c;

    public y(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !f1831d.matcher(str3).matches()) {
            throw new IllegalArgumentException(a4.d.j("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f1832a = str3;
        this.f1833b = str;
        this.f1834c = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f1832a.equals(yVar.f1832a) && this.f1833b.equals(yVar.f1833b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1833b, this.f1832a});
    }
}
