package kotlin.text;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishViewCardView implements CatchingFishFluxContext {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishViewCardView(int i, Object obj) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0192  */
    @Override // kotlin.text.CatchingFishFluxContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle CatchingFishParcelableFAB() {
        char c;
        long j;
        long j2;
        long j3;
        CatchingFishPayPalService catchingFishPayPalService;
        int i;
        int i2;
        CatchingFishGsonWorkManager[] catchingFishGsonWorkManagerArr;
        int i3 = this.CatchingFishParcelableFAB;
        int i4 = 0;
        int i5 = 1;
        Map map = CatchingFishMVPMoshiGson.CatchingFishReduxKtor;
        Object obj = this.CatchingFishSnackbar;
        switch (i3) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i6 = ComponentActivity.CatchingFishParcelableFlux;
                Bundle bundle = new Bundle();
                CatchingFishGoogleMapsGson catchingFishGoogleMapsGson = ((ComponentActivity) obj).CatchingFishEspressoTesting;
                catchingFishGoogleMapsGson.getClass();
                LinkedHashMap linkedHashMap = catchingFishGoogleMapsGson.CatchingFishSnackbar;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(catchingFishGoogleMapsGson.CatchingFishReduxKtor));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(catchingFishGoogleMapsGson.CatchingFishViewModelScope));
                return bundle;
            case 1:
                CatchingFishMVPDaggerHilt catchingFishMVPDaggerHilt = (CatchingFishMVPDaggerHilt) obj;
                CatchingFishPayPalService catchingFishPayPalService2 = catchingFishMVPDaggerHilt.CatchingFishParcelableFAB;
                if (catchingFishPayPalService2 != null || catchingFishMVPDaggerHilt.CatchingFishSnackbar != null) {
                    int i7 = catchingFishPayPalService2 != null ? catchingFishPayPalService2.CatchingFishDaggerWebsocket : 0;
                    CatchingFishPayPalService catchingFishPayPalService3 = catchingFishMVPDaggerHilt.CatchingFishSnackbar;
                    HashMap hashMap = new HashMap(i7 + (catchingFishPayPalService3 != null ? catchingFishPayPalService3.CatchingFishDaggerWebsocket : 0));
                    int i8 = 8;
                    if (catchingFishPayPalService2 != null) {
                        Object[] objArr = catchingFishPayPalService2.CatchingFishSnackbar;
                        Object[] objArr2 = catchingFishPayPalService2.CatchingFishCoroutine;
                        long[] jArr = catchingFishPayPalService2.CatchingFishParcelableFAB;
                        c = 7;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i9 = 0;
                            j = 128;
                            j2 = 255;
                            while (true) {
                                long j4 = jArr[i9];
                                j3 = -9187201950435737472L;
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                                    for (int i11 = i4; i11 < i10; i11++) {
                                        if ((j4 & 255) < 128) {
                                            int i12 = (i9 << 3) + i11;
                                            hashMap.put((String) objArr[i12], (List) objArr2[i12]);
                                        }
                                        j4 >>= 8;
                                    }
                                    if (i10 != 8) {
                                    }
                                }
                                if (i9 != length) {
                                    i9++;
                                    i4 = 0;
                                }
                            }
                            catchingFishPayPalService = catchingFishMVPDaggerHilt.CatchingFishSnackbar;
                            if (catchingFishPayPalService != null) {
                                Object[] objArr3 = catchingFishPayPalService.CatchingFishSnackbar;
                                Object[] objArr4 = catchingFishPayPalService.CatchingFishCoroutine;
                                long[] jArr2 = catchingFishPayPalService.CatchingFishParcelableFAB;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j5 = jArr2[i13];
                                        if ((((~j5) << c) & j5 & j3) != j3) {
                                            int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j5 & j2) < j) {
                                                    int i16 = (i13 << 3) + i15;
                                                    Object obj2 = objArr3[i16];
                                                    List list = (List) objArr4[i16];
                                                    String str = (String) obj2;
                                                    i2 = i8;
                                                    if (list.size() == i5) {
                                                        Object CatchingFishParcelableFAB = ((CatchingFishJUnitGlide) list.get(0)).CatchingFishParcelableFAB();
                                                        if (CatchingFishParcelableFAB == null) {
                                                            continue;
                                                        } else {
                                                            if (!CatchingFishFirebaseDagger.CatchingFishUnitTesting(CatchingFishParcelableFAB)) {
                                                                throw new IllegalStateException((CatchingFishParcelableFAB + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().").toString());
                                                            }
                                                            hashMap.put(str, CatchingFishToastCustomView.CatchingFishGradleManifest(CatchingFishParcelableFAB));
                                                        }
                                                    } else {
                                                        int size = list.size();
                                                        ArrayList arrayList = new ArrayList(size);
                                                        int i17 = 0;
                                                        while (i17 < size) {
                                                            int i18 = i17;
                                                            Object CatchingFishParcelableFAB2 = ((CatchingFishJUnitGlide) list.get(i17)).CatchingFishParcelableFAB();
                                                            if (CatchingFishParcelableFAB2 != null && !CatchingFishFirebaseDagger.CatchingFishUnitTesting(CatchingFishParcelableFAB2)) {
                                                                throw new IllegalStateException((CatchingFishParcelableFAB2 + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().").toString());
                                                            }
                                                            arrayList.add(CatchingFishParcelableFAB2);
                                                            i17 = i18 + 1;
                                                        }
                                                        hashMap.put(str, arrayList);
                                                    }
                                                } else {
                                                    i2 = i8;
                                                }
                                                j5 >>= i2;
                                                i15++;
                                                i8 = i2;
                                                i5 = 1;
                                            }
                                            i = i8;
                                            if (i14 != i) {
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        if (i13 != length2) {
                                            i13++;
                                            i8 = i;
                                            i5 = 1;
                                        }
                                    }
                                }
                            }
                            map = hashMap;
                        }
                    } else {
                        c = 7;
                    }
                    j = 128;
                    j2 = 255;
                    j3 = -9187201950435737472L;
                    catchingFishPayPalService = catchingFishMVPDaggerHilt.CatchingFishSnackbar;
                    if (catchingFishPayPalService != null) {
                    }
                    map = hashMap;
                }
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list2 = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str2, list2 instanceof ArrayList ? (ArrayList) list2 : new ArrayList<>(list2));
                }
                return bundle2;
            case 2:
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                int i19 = FragmentActivity.CatchingFishCustomView;
                while (FragmentActivity.CatchingFishEspressoTesting(((CatchingFishMVIPicasso) fragmentActivity.CatchingFishGsonAppCompat.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget)) {
                }
                fragmentActivity.CatchingFishCardViewRealm.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_STOP);
                return new Bundle();
            case 3:
                return ((CatchingFishToastSharedFlow) obj).CatchingFishParcelable();
            default:
                CatchingFishSensorManager catchingFishSensorManager = (CatchingFishSensorManager) obj;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) catchingFishSensorManager.CatchingFishViewModelScope;
                CatchingFishFirebaseDagger.CatchingFishNavigation(linkedHashMap2, "<this>");
                int size2 = linkedHashMap2.size();
                for (Map.Entry entry2 : (size2 != 0 ? size2 != 1 ? new LinkedHashMap(linkedHashMap2) : CatchingFishPicassoGlide.CatchingFishAnimation(linkedHashMap2) : map).entrySet()) {
                    catchingFishSensorManager.CatchingFishEspressoTesting(((CatchingFishHandlerAndroidX) ((CatchingFishLayoutAndroidX) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) catchingFishSensorManager.CatchingFishDaggerWebsocket;
                CatchingFishFirebaseDagger.CatchingFishNavigation(linkedHashMap3, "<this>");
                int size3 = linkedHashMap3.size();
                if (size3 != 0) {
                    map = size3 != 1 ? new LinkedHashMap(linkedHashMap3) : CatchingFishPicassoGlide.CatchingFishAnimation(linkedHashMap3);
                }
                for (Map.Entry entry3 : map.entrySet()) {
                    catchingFishSensorManager.CatchingFishEspressoTesting(((CatchingFishFluxContext) entry3.getValue()).CatchingFishParcelableFAB(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap4 = (LinkedHashMap) catchingFishSensorManager.CatchingFishReduxKtor;
                if (linkedHashMap4.isEmpty()) {
                    catchingFishGsonWorkManagerArr = new CatchingFishGsonWorkManager[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(linkedHashMap4.size());
                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                        arrayList2.add(new CatchingFishGsonWorkManager((String) entry4.getKey(), entry4.getValue()));
                    }
                    catchingFishGsonWorkManagerArr = (CatchingFishGsonWorkManager[]) arrayList2.toArray(new CatchingFishGsonWorkManager[0]);
                }
                return CatchingFishGsonCardView.CatchingFishFragmentHandler((CatchingFishGsonWorkManager[]) Arrays.copyOf(catchingFishGsonWorkManagerArr, catchingFishGsonWorkManagerArr.length));
        }
    }
}
