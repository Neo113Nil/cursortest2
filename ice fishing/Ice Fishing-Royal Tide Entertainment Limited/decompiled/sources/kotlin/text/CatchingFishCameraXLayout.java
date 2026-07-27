package kotlin.text;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class CatchingFishCameraXLayout {
    public static final CatchingFishReduxViewModel CatchingFishCoroutine;
    public static final Class CatchingFishParcelableFAB;
    public static final CatchingFishReduxViewModel CatchingFishSnackbar;

    static {
        Class<?> cls;
        Class<?> cls2;
        CatchingFishCoroutineHilt catchingFishCoroutineHilt = CatchingFishCoroutineHilt.CatchingFishCoroutine;
        CatchingFishReduxViewModel catchingFishReduxViewModel = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        CatchingFishParcelableFAB = cls;
        try {
            CatchingFishCoroutineHilt catchingFishCoroutineHilt2 = CatchingFishCoroutineHilt.CatchingFishCoroutine;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                catchingFishReduxViewModel = (CatchingFishReduxViewModel) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        CatchingFishSnackbar = catchingFishReduxViewModel;
        CatchingFishCoroutine = new CatchingFishReduxViewModel();
    }

    public static void CatchingFish(int i, List list, CatchingFishServiceHilt catchingFishServiceHilt, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                catchingFishViewSnackbar.CatchingFishWebSocketMockk(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CatchingFishViewSnackbar.CatchingFishFirebase(((Integer) list.get(i4)).intValue());
        }
        catchingFishViewSnackbar.CatchingFishLifecycle(i3);
        while (i2 < list.size()) {
            catchingFishViewSnackbar.CatchingFishMVPReduxContext(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void CatchingFishAnimationMockk(int i, List list, CatchingFishServiceHilt catchingFishServiceHilt, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                catchingFishViewSnackbar.CatchingFishWebSocketMockk(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CatchingFishViewSnackbar.CatchingFishFirebase(((Integer) list.get(i4)).intValue());
        }
        catchingFishViewSnackbar.CatchingFishLifecycle(i3);
        while (i2 < list.size()) {
            catchingFishViewSnackbar.CatchingFishMVPReduxContext(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void CatchingFishCardViewRealm(int i, List list, CatchingFishServiceHilt catchingFishServiceHilt, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                catchingFishViewSnackbar.CatchingFishKtor(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CatchingFishViewSnackbar.CatchingFishFirebase(((Long) list.get(i4)).longValue());
        }
        catchingFishViewSnackbar.CatchingFishLifecycle(i3);
        while (i2 < list.size()) {
            catchingFishViewSnackbar.CatchingFishMVPHandler(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void CatchingFishCloudMessaging(CatchingFishReduxViewModel catchingFishReduxViewModel, Object obj, Object obj2) {
        catchingFishReduxViewModel.getClass();
        CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow = (CatchingFishJUnitSharedFlow) obj;
        CatchingFishToastDaggerHilt catchingFishToastDaggerHilt = catchingFishJUnitSharedFlow.unknownFields;
        CatchingFishToastDaggerHilt catchingFishToastDaggerHilt2 = ((CatchingFishJUnitSharedFlow) obj2).unknownFields;
        CatchingFishToastDaggerHilt catchingFishToastDaggerHilt3 = CatchingFishToastDaggerHilt.CatchingFishWorkManager;
        if (!catchingFishToastDaggerHilt3.equals(catchingFishToastDaggerHilt2)) {
            if (catchingFishToastDaggerHilt3.equals(catchingFishToastDaggerHilt)) {
                int i = catchingFishToastDaggerHilt.CatchingFishParcelableFAB + catchingFishToastDaggerHilt2.CatchingFishParcelableFAB;
                int[] copyOf = Arrays.copyOf(catchingFishToastDaggerHilt.CatchingFishSnackbar, i);
                System.arraycopy(catchingFishToastDaggerHilt2.CatchingFishSnackbar, 0, copyOf, catchingFishToastDaggerHilt.CatchingFishParcelableFAB, catchingFishToastDaggerHilt2.CatchingFishParcelableFAB);
                Object[] copyOf2 = Arrays.copyOf(catchingFishToastDaggerHilt.CatchingFishCoroutine, i);
                System.arraycopy(catchingFishToastDaggerHilt2.CatchingFishCoroutine, 0, copyOf2, catchingFishToastDaggerHilt.CatchingFishParcelableFAB, catchingFishToastDaggerHilt2.CatchingFishParcelableFAB);
                catchingFishToastDaggerHilt = new CatchingFishToastDaggerHilt(i, copyOf, copyOf2, true);
            } else {
                catchingFishToastDaggerHilt.getClass();
                if (!catchingFishToastDaggerHilt2.equals(catchingFishToastDaggerHilt3)) {
                    if (!catchingFishToastDaggerHilt.CatchingFishDaggerWebsocket) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = catchingFishToastDaggerHilt.CatchingFishParcelableFAB + catchingFishToastDaggerHilt2.CatchingFishParcelableFAB;
                    catchingFishToastDaggerHilt.CatchingFishParcelableFAB(i2);
                    System.arraycopy(catchingFishToastDaggerHilt2.CatchingFishSnackbar, 0, catchingFishToastDaggerHilt.CatchingFishSnackbar, catchingFishToastDaggerHilt.CatchingFishParcelableFAB, catchingFishToastDaggerHilt2.CatchingFishParcelableFAB);
                    System.arraycopy(catchingFishToastDaggerHilt2.CatchingFishCoroutine, 0, catchingFishToastDaggerHilt.CatchingFishCoroutine, catchingFishToastDaggerHilt.CatchingFishParcelableFAB, catchingFishToastDaggerHilt2.CatchingFishParcelableFAB);
                    catchingFishToastDaggerHilt.CatchingFishParcelableFAB = i2;
                }
            }
        }
        catchingFishJUnitSharedFlow.unknownFields = catchingFishToastDaggerHilt;
    }

    public static int CatchingFishCoroutine(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CatchingFishViewSnackbar.CatchingFishReduxMoshi(i) + 8) * size;
    }

    public static void CatchingFishCoroutineFlow(int i, List list, CatchingFishServiceHilt catchingFishServiceHilt, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                catchingFishViewSnackbar.CatchingFishGraphQLGlide(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = CatchingFishViewSnackbar.CatchingFishCardViewRealm;
            i3 += 4;
        }
        catchingFishViewSnackbar.CatchingFishLifecycle(i3);
        while (i2 < list.size()) {
            catchingFishViewSnackbar.CatchingFishStateFlowIntent(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void CatchingFishDaggerHiltFAB(int i, List list, CatchingFishServiceHilt catchingFishServiceHilt, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                catchingFishViewSnackbar.CatchingFishWidget(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = CatchingFishViewSnackbar.CatchingFishCardViewRealm;
            i3 += 8;
        }
        catchingFishViewSnackbar.CatchingFishLifecycle(i3);
        while (i2 < list.size()) {
            catchingFishViewSnackbar.CatchingFishKtorService(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int CatchingFishDaggerWebsocket(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CatchingFishViewSnackbar.CatchingFishFirebase(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static boolean CatchingFishEspressoTesting(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void CatchingFishGsonAppCompat(int i, List list, CatchingFishServiceHilt catchingFishServiceHilt, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                catchingFishViewSnackbar.CatchingFishCameraX(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CatchingFishViewSnackbar.CatchingFishPicasso(((Integer) list.get(i4)).intValue());
        }
        catchingFishViewSnackbar.CatchingFishLifecycle(i3);
        while (i2 < list.size()) {
            catchingFishViewSnackbar.CatchingFishLifecycle(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void CatchingFishJetpackCompose(int i, List list, CatchingFishServiceHilt catchingFishServiceHilt, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                catchingFishViewSnackbar.CatchingFishKtor(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CatchingFishViewSnackbar.CatchingFishFirebase(((Long) list.get(i4)).longValue());
        }
        catchingFishViewSnackbar.CatchingFishLifecycle(i3);
        while (i2 < list.size()) {
            catchingFishViewSnackbar.CatchingFishMVPHandler(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int CatchingFishLayout(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CatchingFishViewSnackbar.CatchingFishFirebase(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void CatchingFishNavigation(int i, List list, CatchingFishServiceHilt catchingFishServiceHilt, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                catchingFishViewSnackbar.getClass();
                catchingFishViewSnackbar.CatchingFishGraphQLGlide(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = CatchingFishViewSnackbar.CatchingFishCardViewRealm;
            i3 += 4;
        }
        catchingFishViewSnackbar.CatchingFishLifecycle(i3);
        while (i2 < list.size()) {
            catchingFishViewSnackbar.CatchingFishStateFlowIntent(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void CatchingFishOkHttp(int i, List list, CatchingFishServiceHilt catchingFishServiceHilt, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                catchingFishViewSnackbar.CatchingFishServiceMVIJUnit(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = CatchingFishViewSnackbar.CatchingFishCardViewRealm;
            i3++;
        }
        catchingFishViewSnackbar.CatchingFishLifecycle(i3);
        while (i2 < list.size()) {
            catchingFishViewSnackbar.CatchingFishRetrofit(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int CatchingFishParcelableFAB(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CatchingFishViewSnackbar.CatchingFishFirebase(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static void CatchingFishParcelableFlux(int i, List list, CatchingFishServiceHilt catchingFishServiceHilt, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                catchingFishViewSnackbar.CatchingFishKtor(i, (longValue >> 63) ^ (longValue << 1));
                i2++;
            }
            return;
        }
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += CatchingFishViewSnackbar.CatchingFishFirebase((longValue2 >> 63) ^ (longValue2 << 1));
        }
        catchingFishViewSnackbar.CatchingFishLifecycle(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            catchingFishViewSnackbar.CatchingFishMVPHandler((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static int CatchingFishReduxKtor(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CatchingFishViewSnackbar.CatchingFishFirebase(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static void CatchingFishRoomDatabase(int i, List list, CatchingFishServiceHilt catchingFishServiceHilt, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                catchingFishViewSnackbar.CatchingFishWidget(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = CatchingFishViewSnackbar.CatchingFishCardViewRealm;
            i3 += 8;
        }
        catchingFishViewSnackbar.CatchingFishLifecycle(i3);
        while (i2 < list.size()) {
            catchingFishViewSnackbar.CatchingFishKtorService(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int CatchingFishSnackbar(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CatchingFishViewSnackbar.CatchingFishReduxMoshi(i) + 4) * size;
    }

    public static void CatchingFishSpannableWidget(int i, List list, CatchingFishServiceHilt catchingFishServiceHilt, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                catchingFishViewSnackbar.CatchingFishCameraX(i, (intValue >> 31) ^ (intValue << 1));
                i2++;
            }
            return;
        }
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += CatchingFishViewSnackbar.CatchingFishPicasso((intValue2 >> 31) ^ (intValue2 << 1));
        }
        catchingFishViewSnackbar.CatchingFishLifecycle(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            catchingFishViewSnackbar.CatchingFishLifecycle((intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static void CatchingFishStateLiveData(int i, List list, CatchingFishServiceHilt catchingFishServiceHilt, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                catchingFishViewSnackbar.CatchingFishGraphQLGlide(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = CatchingFishViewSnackbar.CatchingFishCardViewRealm;
            i3 += 4;
        }
        catchingFishViewSnackbar.CatchingFishLifecycle(i3);
        while (i2 < list.size()) {
            catchingFishViewSnackbar.CatchingFishStateFlowIntent(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void CatchingFishUnitTesting(int i, List list, CatchingFishServiceHilt catchingFishServiceHilt, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                catchingFishViewSnackbar.getClass();
                catchingFishViewSnackbar.CatchingFishWidget(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
            return;
        }
        catchingFishViewSnackbar.CatchingFishSharedFlow(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = CatchingFishViewSnackbar.CatchingFishCardViewRealm;
            i3 += 8;
        }
        catchingFishViewSnackbar.CatchingFishLifecycle(i3);
        while (i2 < list.size()) {
            catchingFishViewSnackbar.CatchingFishKtorService(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static int CatchingFishViewModelFAB(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CatchingFishViewSnackbar.CatchingFishPicasso(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int CatchingFishViewModelScope(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += CatchingFishViewSnackbar.CatchingFishFirebase((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int CatchingFishWorkManager(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += CatchingFishViewSnackbar.CatchingFishPicasso((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static Object CatchingFishFragmentHandler(Object obj, int i, CatchingFishManifestRedux catchingFishManifestRedux, Object obj2, CatchingFishReduxViewModel catchingFishReduxViewModel) {
        return obj2;
    }
}
