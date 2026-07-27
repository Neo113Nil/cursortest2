package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishToastFABView extends CatchingFishMVIBundle implements CatchingFishJobSchedulerMVP {
    public /* synthetic */ CatchingFishDaggerHiltMVI CatchingFishLayout;
    public /* synthetic */ CatchingFishMockkFluxDagger CatchingFishViewModelFAB;

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        CatchingFishMockkFluxDagger catchingFishMockkFluxDagger = this.CatchingFishViewModelFAB;
        CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI = this.CatchingFishLayout;
        Set keySet = catchingFishDaggerHiltMVI.CatchingFishParcelableFAB().keySet();
        ArrayList arrayList = new ArrayList(CatchingFishLayoutToast.CatchingFishParcelable(keySet));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((CatchingFishXMLLayoutRedux) it.next()).CatchingFishParcelableFAB);
        }
        Map<String, ?> all = catchingFishMockkFluxDagger.CatchingFishParcelableFAB.getAll();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = catchingFishMockkFluxDagger.CatchingFishSnackbar;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(CatchingFishPicassoGlide.CatchingFishStateFlow(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = CatchingFishCameraXCameraX.CatchingFishCustomViewJUnit((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI2 = new CatchingFishDaggerHiltMVI(new LinkedHashMap(catchingFishDaggerHiltMVI.CatchingFishParcelableFAB()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                CatchingFishFirebaseDagger.CatchingFishNavigation(str, "name");
                catchingFishDaggerHiltMVI2.CatchingFishDaggerWebsocket(new CatchingFishXMLLayoutRedux(str), value2);
            } else if (value2 instanceof Float) {
                CatchingFishFirebaseDagger.CatchingFishNavigation(str, "name");
                catchingFishDaggerHiltMVI2.CatchingFishDaggerWebsocket(new CatchingFishXMLLayoutRedux(str), value2);
            } else if (value2 instanceof Integer) {
                CatchingFishFirebaseDagger.CatchingFishNavigation(str, "name");
                catchingFishDaggerHiltMVI2.CatchingFishDaggerWebsocket(new CatchingFishXMLLayoutRedux(str), value2);
            } else if (value2 instanceof Long) {
                CatchingFishFirebaseDagger.CatchingFishNavigation(str, "name");
                catchingFishDaggerHiltMVI2.CatchingFishDaggerWebsocket(new CatchingFishXMLLayoutRedux(str), value2);
            } else if (value2 instanceof String) {
                CatchingFishFirebaseDagger.CatchingFishNavigation(str, "name");
                catchingFishDaggerHiltMVI2.CatchingFishDaggerWebsocket(new CatchingFishXMLLayoutRedux(str), value2);
            } else if (value2 instanceof Set) {
                CatchingFishXMLLayoutRedux CatchingFishJUnitRealm = CatchingFishOkHttpFAB.CatchingFishJUnitRealm(str);
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(value2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                catchingFishDaggerHiltMVI2.CatchingFishDaggerWebsocket(CatchingFishJUnitRealm, (Set) value2);
            }
        }
        return new CatchingFishDaggerHiltMVI(new LinkedHashMap(catchingFishDaggerHiltMVI2.CatchingFishParcelableFAB()), true);
    }

    @Override // kotlin.text.CatchingFishJobSchedulerMVP
    public final Object CatchingFishReduxKtor(Object obj, Object obj2, Object obj3) {
        CatchingFishToastFABView catchingFishToastFABView = new CatchingFishToastFABView(3, (CatchingFishWebsocketGradle) obj3);
        catchingFishToastFABView.CatchingFishViewModelFAB = (CatchingFishMockkFluxDagger) obj;
        catchingFishToastFABView.CatchingFishLayout = (CatchingFishDaggerHiltMVI) obj2;
        return catchingFishToastFABView.CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }
}
