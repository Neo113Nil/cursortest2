package kotlin.text;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpCameraX {
    public final HashMap CatchingFishParcelableFAB = new HashMap();
    public final HashMap CatchingFishSnackbar;

    public CatchingFishOkHttpCameraX(HashMap hashMap) {
        this.CatchingFishSnackbar = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            CatchingFishToolbarLiveData catchingFishToolbarLiveData = (CatchingFishToolbarLiveData) entry.getValue();
            List list = (List) this.CatchingFishParcelableFAB.get(catchingFishToolbarLiveData);
            if (list == null) {
                list = new ArrayList();
                this.CatchingFishParcelableFAB.put(catchingFishToolbarLiveData, list);
            }
            list.add((CatchingFishHiltDaggerHilt) entry.getKey());
        }
    }

    public static void CatchingFishParcelableFAB(List list, CatchingFishToastFlux catchingFishToastFlux, CatchingFishToolbarLiveData catchingFishToolbarLiveData, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                CatchingFishHiltDaggerHilt catchingFishHiltDaggerHilt = (CatchingFishHiltDaggerHilt) list.get(size);
                Method method = catchingFishHiltDaggerHilt.CatchingFishSnackbar;
                try {
                    int i = catchingFishHiltDaggerHilt.CatchingFishParcelableFAB;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, catchingFishToastFlux);
                    } else if (i == 2) {
                        method.invoke(obj, catchingFishToastFlux, catchingFishToolbarLiveData);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
