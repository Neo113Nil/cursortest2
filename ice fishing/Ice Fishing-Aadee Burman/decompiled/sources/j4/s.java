package j4;

import android.util.Log;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f38441d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f38442a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38443b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38444c;

    public s(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + com.anythink.core.common.d.j.f12378z);
            str3 = str2.substring(8);
        }
        if (str3 == null || !f38441d.matcher(str3).matches()) {
            throw new IllegalArgumentException(D.y.o("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f38442a = str3;
        this.f38443b = str;
        this.f38444c = AbstractC4404f.g(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f38442a.equals(sVar.f38442a) && this.f38443b.equals(sVar.f38443b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f38443b, this.f38442a});
    }
}
