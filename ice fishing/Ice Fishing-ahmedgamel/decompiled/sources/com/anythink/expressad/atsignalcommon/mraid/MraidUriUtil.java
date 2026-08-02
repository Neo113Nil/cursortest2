package com.anythink.expressad.atsignalcommon.mraid;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.express.a.a;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.b;
import com.anythink.expressad.foundation.d.d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MraidUriUtil {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ConcurrentHashMap<String, String> f18821a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static ArrayList<String> f18822b = new ArrayList<>();

    private static Set<String> a(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static void clearUnSupportMraidMethodMap() {
        if (f18821a.size() > 0) {
            f18821a.clear();
        }
    }

    public static b getMraidMethodContext(WindVaneWebView windVaneWebView, String str) {
        Set<String> unmodifiableSet;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains(d.f19381s)) {
            return null;
        }
        b bVar = new b();
        bVar.f18852d = a.b("n+ztLkxpVTzBLkxgHN==");
        bVar.f18853e = parse.getHost();
        int i = 0;
        if (f18822b.size() == 0) {
            for (Method method : IMraidSignalCommunication.class.getDeclaredMethods()) {
                f18822b.add(method.getName());
            }
        }
        if (!f18822b.contains(bVar.f18853e) && windVaneWebView != null) {
            String campaignId = windVaneWebView.getCampaignId();
            String str2 = bVar.f18853e;
            if (!TextUtils.isEmpty(campaignId)) {
                if (f18821a.containsKey(campaignId)) {
                    String str3 = f18821a.get(campaignId);
                    if (!TextUtils.isEmpty(str2) && !str3.contains(str2)) {
                        if (str3.length() > 0) {
                            str3 = str3.concat(",");
                        }
                        f18821a.put(campaignId, str3.concat(str2));
                    }
                } else {
                    f18821a.put(campaignId, str2);
                }
            }
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(windVaneWebView, bVar.f18853e);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(windVaneWebView, bVar.f18853e, "Specified command is not implemented");
            return null;
        }
        String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null) {
            unmodifiableSet = Collections.EMPTY_SET;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            do {
                int indexOf = encodedQuery.indexOf(38, i);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
                i = indexOf + 1;
            } while (i < encodedQuery.length());
            unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str4 : unmodifiableSet) {
                jSONObject.put(str4, parse.getQueryParameter(str4));
            }
            bVar.f18854f = jSONObject.toString();
            return bVar;
        } catch (Exception e9) {
            e9.printStackTrace();
            return bVar;
        }
    }

    public static String getUnSupportMraidMethodString(String str) {
        if (f18821a.containsKey(str)) {
            return f18821a.get(str);
        }
        return null;
    }

    public static void clearUnSupportMraidMethodMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f18821a.remove(str);
    }

    private static void a() {
        for (Method method : IMraidSignalCommunication.class.getDeclaredMethods()) {
            f18822b.add(method.getName());
        }
    }

    private static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (f18821a.containsKey(str)) {
            String str3 = f18821a.get(str);
            if (TextUtils.isEmpty(str2) || str3.contains(str2)) {
                return;
            }
            if (str3.length() > 0) {
                str3 = str3.concat(",");
            }
            f18821a.put(str, str3.concat(str2));
            return;
        }
        f18821a.put(str, str2);
    }
}
