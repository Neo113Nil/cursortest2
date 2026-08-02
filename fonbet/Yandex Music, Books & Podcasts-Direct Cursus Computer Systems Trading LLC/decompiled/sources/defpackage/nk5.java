package defpackage;

import android.net.Uri;
import com.connectsdk.device.ConnectableDevice;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class nk5 {
    public static boolean a(String str, LinkedHashMap linkedHashMap) {
        List list;
        str.getClass();
        if (!new b30(sk5.YANDEXMUSIC).b(str) && !new b30(sk5.HTTPS).b(str)) {
            return true;
        }
        String queryParameter = Uri.parse(str).getQueryParameter(ConnectableDevice.KEY_ID);
        if (queryParameter == null || (list = (List) linkedHashMap.get("music-deeplink")) == null) {
            return false;
        }
        return list.contains(queryParameter);
    }
}
