package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.search.SearchFactory;
import com.yandex.mapkit.search.SearchManager;
import com.yandex.mapkit.search.SearchManagerType;
import com.yandex.mapkit.search.Session;
import com.yandex.mapkit.search.SuggestOptions;
import com.yandex.mapkit.search.SuggestSession;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import java.util.HashMap;
import java.util.Map;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

/* loaded from: classes7.dex */
public final class qup0 extends k45 {
    public final mup0 b;
    public final ini0 c;
    public final HashMap w;
    public final HashMap x;
    public final HashMap y;

    public qup0(ssr ssrVar, mup0 mup0Var, ini0 ini0Var) {
        super(ssrVar, "search_manager");
        this.b = mup0Var;
        this.c = ini0Var;
        this.w = new HashMap();
        this.x = new HashMap();
        this.y = new HashMap();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            HashMap hashMap = this.w;
            HashMap hashMap2 = this.x;
            mup0 mup0Var = this.b;
            HashMap hashMap3 = this.y;
            switch (hashCode) {
                case -1863356540:
                    if (str.equals("suggest")) {
                        Map map = (Map) obj;
                        String str2 = (String) map.get("text");
                        String str3 = (String) map.get("cancelToken");
                        BoundingBox a = lyi.a((Map) map.get("boundingBox"));
                        SuggestOptions suggestOptions = new SuggestOptions();
                        Object obj2 = map.get("userPosition");
                        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                        if (map2 != null) {
                            suggestOptions.setUserPosition(lyi.g(map2));
                        }
                        hashMap3.put(str3, da20Var);
                        SuggestSession suggestSession = (SuggestSession) hashMap2.get(str3);
                        if (suggestSession != null) {
                            suggestSession.suggest(str2, a, suggestOptions, new pup0(this, str3));
                            return;
                        }
                        return;
                    }
                    break;
                case -1367724422:
                    if (str.equals("cancel")) {
                        String str4 = (String) obj;
                        Session session = (Session) hashMap.remove(str4);
                        if (session != null) {
                            session.cancel();
                        }
                        da20 da20Var2 = (da20) hashMap3.remove(str4);
                        if (da20Var2 != null) {
                            da20Var2.success(null);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -891535336:
                    if (str.equals("submit")) {
                        Map map3 = (Map) obj;
                        String str5 = (String) map3.get("cancelToken");
                        hashMap.put(str5, ((SearchManager) mup0Var.a).submit(lyi.g((Map) map3.get(IssuingDistributionPointExtension.POINT)), (Integer) map3.get("zoom"), lyi.l((Map) map3.get("options")), new oup0(this, str5)));
                        hashMap3.put(str5, da20Var);
                        return;
                    }
                    break;
                case -565886771:
                    if (str.equals("searchByUri")) {
                        Map map4 = (Map) obj;
                        String str6 = (String) map4.get(LaunchBrowserActivity.KEY_URI);
                        String str7 = (String) map4.get("cancelToken");
                        hashMap.put(str7, ((SearchManager) mup0Var.a).searchByURI(str6, lyi.l((Map) map4.get("options")), new oup0(this, str7)));
                        hashMap3.put(str7, da20Var);
                        return;
                    }
                    break;
                case 3237136:
                    if (str.equals("init")) {
                        mup0Var.a = SearchFactory.getInstance().createSearchManager(SearchManagerType.ONLINE);
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 977658273:
                    if (str.equals("resetSuggestSession")) {
                        String str8 = (String) obj;
                        SuggestSession suggestSession2 = (SuggestSession) hashMap2.get(str8);
                        if (suggestSession2 != null) {
                            suggestSession2.reset();
                        }
                        da20 da20Var3 = (da20) hashMap3.remove(str8);
                        if (da20Var3 != null) {
                            da20Var3.success(null);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1425222516:
                    if (str.equals("startSuggestSession")) {
                        hashMap2.put((String) ((Map) obj).get("cancelToken"), ((SearchManager) mup0Var.a).createSuggestSession());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }
}
