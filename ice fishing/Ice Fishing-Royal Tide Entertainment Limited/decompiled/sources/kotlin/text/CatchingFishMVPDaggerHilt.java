package kotlin.text;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishMVPDaggerHilt implements CatchingFishFirebaseHilt {
    public final CatchingFishPayPalService CatchingFishParcelableFAB;
    public CatchingFishPayPalService CatchingFishSnackbar;

    public CatchingFishMVPDaggerHilt(LinkedHashMap linkedHashMap) {
        CatchingFishPayPalService catchingFishPayPalService;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            catchingFishPayPalService = null;
        } else {
            catchingFishPayPalService = new CatchingFishPayPalService(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                catchingFishPayPalService.CatchingFishOkHttp(entry.getKey(), entry.getValue());
            }
        }
        this.CatchingFishParcelableFAB = catchingFishPayPalService;
    }

    @Override // kotlin.text.CatchingFishFirebaseHilt
    public final CatchingFishDaggerHiltMockk CatchingFishParcelableFAB(String str, CatchingFishAdMobService catchingFishAdMobService) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!CatchingFishRobolectricHilt.CatchingFishPayPalService(str.charAt(i))) {
                CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishSnackbar;
                if (catchingFishPayPalService == null) {
                    long[] jArr = CatchingFishViewPayPal.CatchingFishParcelableFAB;
                    catchingFishPayPalService = new CatchingFishPayPalService();
                    this.CatchingFishSnackbar = catchingFishPayPalService;
                }
                Object CatchingFishViewModelScope = catchingFishPayPalService.CatchingFishViewModelScope(str);
                if (CatchingFishViewModelScope == null) {
                    CatchingFishViewModelScope = new ArrayList();
                    catchingFishPayPalService.CatchingFishOkHttp(str, CatchingFishViewModelScope);
                }
                ((List) CatchingFishViewModelScope).add(catchingFishAdMobService);
                return new CatchingFishAsyncTaskDagger(catchingFishPayPalService, str, catchingFishAdMobService, 18);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    @Override // kotlin.text.CatchingFishFirebaseHilt
    public final Object CatchingFishSnackbar(String str) {
        CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishParcelableFAB;
        List list = catchingFishPayPalService != null ? (List) catchingFishPayPalService.CatchingFishCloudMessaging(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && catchingFishPayPalService != null) {
            List subList = list.subList(1, list.size());
            int CatchingFishWorkManager = catchingFishPayPalService.CatchingFishWorkManager(str);
            if (CatchingFishWorkManager < 0) {
                CatchingFishWorkManager = ~CatchingFishWorkManager;
            }
            Object[] objArr = catchingFishPayPalService.CatchingFishCoroutine;
            Object obj = objArr[CatchingFishWorkManager];
            catchingFishPayPalService.CatchingFishSnackbar[CatchingFishWorkManager] = str;
            objArr[CatchingFishWorkManager] = subList;
        }
        return list.get(0);
    }
}
