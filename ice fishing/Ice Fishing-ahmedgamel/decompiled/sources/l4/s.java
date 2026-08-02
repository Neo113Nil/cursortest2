package l4;

import android.util.Log;
import com.google.android.gms.internal.ads.Wv;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f38953d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f38954a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38955b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38956c;

    public s(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + com.anythink.core.common.d.j.f13164z);
            str3 = str2.substring(8);
        }
        if (str3 == null || !f38953d.matcher(str3).matches()) {
            throw new IllegalArgumentException(D.x.l("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f38954a = str3;
        this.f38955b = str;
        this.f38956c = Wv.h(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f38954a.equals(sVar.f38954a) && this.f38955b.equals(sVar.f38955b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f38955b, this.f38954a});
    }
}
