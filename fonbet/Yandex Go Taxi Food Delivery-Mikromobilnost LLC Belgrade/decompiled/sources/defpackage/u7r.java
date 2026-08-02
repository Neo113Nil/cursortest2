package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.suggest.impl.analytics.FindInGoSearchAnalytics$Style;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class u7r {
    public final pho a;

    public u7r(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("search_session_id", str);
        }
        if (str2 != null) {
            hashMap.put(Constants.DEEPLINK, str2);
        }
        this.a.a("FindInGoSearch.LoadingError.Redirected", hashMap, 1, new HashMap());
    }

    public final void b(String str, LinkedHashMap linkedHashMap, FindInGoSearchAnalytics$Style findInGoSearchAnalytics$Style, List list, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("user_input", str);
        hashMap.put("trace_ids", linkedHashMap);
        hashMap.put("type", findInGoSearchAnalytics$Style.getEventValue());
        if (list != null) {
            hashMap.put("sections", list);
        }
        if (str2 != null) {
            hashMap.put("search_session_id", str2);
        }
        this.a.a("FindInGoSearch.SuggestSearch.Sent", hashMap, 4, new HashMap());
    }
}
