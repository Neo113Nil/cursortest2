package defpackage;

import android.text.TextUtils;
import com.connectsdk.etc.helper.HttpMessage;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class xsf {
    public static final Map b;
    public Map a = b;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            property = sb.toString();
        }
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            hashMap.put(HttpMessage.USER_AGENT, Collections.singletonList(new ysf(property)));
        }
        b = Collections.unmodifiableMap(hashMap);
    }
}
