package kotlin.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class CatchingFishPicassoGlide extends CatchingFishHiltMVPToast {
    public static final Map CatchingFishAnimation(Map map) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(singletonMap, "with(...)");
        return singletonMap;
    }

    public static Map CatchingFishJUnitRealm(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return CatchingFishMVPMoshiGson.CatchingFishReduxKtor;
        }
        if (size == 1) {
            CatchingFishGsonWorkManager catchingFishGsonWorkManager = (CatchingFishGsonWorkManager) arrayList.get(0);
            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishGsonWorkManager, "pair");
            Map singletonMap = Collections.singletonMap(catchingFishGsonWorkManager.CatchingFishReduxKtor, catchingFishGsonWorkManager.CatchingFishDaggerWebsocket);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(CatchingFishStateFlow(arrayList.size()));
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            CatchingFishGsonWorkManager catchingFishGsonWorkManager2 = (CatchingFishGsonWorkManager) obj;
            linkedHashMap.put(catchingFishGsonWorkManager2.CatchingFishReduxKtor, catchingFishGsonWorkManager2.CatchingFishDaggerWebsocket);
        }
        return linkedHashMap;
    }

    public static int CatchingFishStateFlow(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
