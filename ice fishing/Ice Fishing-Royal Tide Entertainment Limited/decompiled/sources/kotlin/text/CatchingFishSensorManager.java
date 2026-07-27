package kotlin.text;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class CatchingFishSensorManager implements CatchingFishMVIGoogleMaps {
    public final Object CatchingFishDaggerWebsocket;
    public final Object CatchingFishReduxKtor;
    public final Object CatchingFishViewModelFAB;
    public final Object CatchingFishViewModelScope;
    public final Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishSensorManager(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.CatchingFishReduxKtor = obj;
        this.CatchingFishDaggerWebsocket = obj2;
        this.CatchingFishWorkManager = obj3;
        this.CatchingFishViewModelScope = obj4;
        this.CatchingFishViewModelFAB = obj5;
    }

    public static CatchingFishSensorManager CatchingFishCoroutine(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        CatchingFishSensorManager catchingFishSensorManager = new CatchingFishSensorManager(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) catchingFishSensorManager.CatchingFishViewModelScope)) {
            try {
                ((ArrayDeque) catchingFishSensorManager.CatchingFishViewModelScope).clear();
                String string = ((SharedPreferences) catchingFishSensorManager.CatchingFishReduxKtor).getString((String) catchingFishSensorManager.CatchingFishDaggerWebsocket, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) catchingFishSensorManager.CatchingFishWorkManager)) {
                    String[] split = string.split((String) catchingFishSensorManager.CatchingFishWorkManager, -1);
                    int length = split.length;
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) catchingFishSensorManager.CatchingFishViewModelScope).add(str);
                        }
                    }
                    return catchingFishSensorManager;
                }
                return catchingFishSensorManager;
            } finally {
            }
        }
    }

    public void CatchingFishCloudMessaging(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            CatchingFishViewCustomView catchingFishViewCustomView = (CatchingFishViewCustomView) arrayList.get(i);
            catchingFishViewCustomView.getClass();
            ((CatchingFishBundleAsyncTask) this.CatchingFishReduxKtor).CatchingFishCoroutine(catchingFishViewCustomView);
        }
        arrayList.clear();
    }

    public void CatchingFishDaggerWebsocket(CatchingFishViewCustomView catchingFishViewCustomView, int i) {
        CatchingFishKtorPayPal catchingFishKtorPayPal = (CatchingFishKtorPayPal) this.CatchingFishViewModelScope;
        catchingFishKtorPayPal.CatchingFishParcelableFAB(catchingFishViewCustomView);
        int i2 = catchingFishViewCustomView.CatchingFishParcelableFAB;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            catchingFishKtorPayPal.CatchingFishCoroutine(i, catchingFishViewCustomView.CatchingFishCoroutine);
        } else {
            int i3 = catchingFishViewCustomView.CatchingFishCoroutine;
            RecyclerView recyclerView = catchingFishKtorPayPal.CatchingFishParcelableFAB;
            recyclerView.CatchingFishGradleManifest(i, i3, true);
            recyclerView.CatchingFishMockkOkHttp = true;
            recyclerView.CatchingFishRedux.CatchingFishCoroutine += i3;
        }
    }

    public void CatchingFishEspressoTesting(Object obj, String str) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "key");
        ((LinkedHashMap) this.CatchingFishReduxKtor).put(str, obj);
        CatchingFishLayoutAndroidX catchingFishLayoutAndroidX = (CatchingFishLayoutAndroidX) ((LinkedHashMap) this.CatchingFishWorkManager).get(str);
        if (catchingFishLayoutAndroidX != null) {
            ((CatchingFishHandlerAndroidX) catchingFishLayoutAndroidX).CatchingFishViewModelFAB(obj);
        }
        CatchingFishLayoutAndroidX catchingFishLayoutAndroidX2 = (CatchingFishLayoutAndroidX) ((LinkedHashMap) this.CatchingFishViewModelScope).get(str);
        if (catchingFishLayoutAndroidX2 != null) {
            ((CatchingFishHandlerAndroidX) catchingFishLayoutAndroidX2).CatchingFishViewModelFAB(obj);
        }
    }

    public void CatchingFishFragmentHandler(CatchingFishViewCustomView catchingFishViewCustomView) {
        CatchingFishKtorPayPal catchingFishKtorPayPal = (CatchingFishKtorPayPal) this.CatchingFishViewModelScope;
        ((ArrayList) this.CatchingFishWorkManager).add(catchingFishViewCustomView);
        int i = catchingFishViewCustomView.CatchingFishParcelableFAB;
        if (i == 1) {
            catchingFishKtorPayPal.CatchingFishReduxKtor(catchingFishViewCustomView.CatchingFishSnackbar, catchingFishViewCustomView.CatchingFishCoroutine);
            return;
        }
        if (i == 2) {
            int i2 = catchingFishViewCustomView.CatchingFishSnackbar;
            int i3 = catchingFishViewCustomView.CatchingFishCoroutine;
            RecyclerView recyclerView = catchingFishKtorPayPal.CatchingFishParcelableFAB;
            recyclerView.CatchingFishGradleManifest(i2, i3, false);
            recyclerView.CatchingFishMockkOkHttp = true;
            return;
        }
        if (i == 4) {
            catchingFishKtorPayPal.CatchingFishCoroutine(catchingFishViewCustomView.CatchingFishSnackbar, catchingFishViewCustomView.CatchingFishCoroutine);
        } else if (i == 8) {
            catchingFishKtorPayPal.CatchingFishDaggerWebsocket(catchingFishViewCustomView.CatchingFishSnackbar, catchingFishViewCustomView.CatchingFishCoroutine);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + catchingFishViewCustomView);
        }
    }

    public CatchingFishViewCustomView CatchingFishLayout(int i, int i2, int i3) {
        CatchingFishViewCustomView catchingFishViewCustomView = (CatchingFishViewCustomView) ((CatchingFishBundleAsyncTask) this.CatchingFishReduxKtor).CatchingFishParcelableFAB();
        if (catchingFishViewCustomView != null) {
            catchingFishViewCustomView.CatchingFishParcelableFAB = i;
            catchingFishViewCustomView.CatchingFishSnackbar = i2;
            catchingFishViewCustomView.CatchingFishCoroutine = i3;
            return catchingFishViewCustomView;
        }
        CatchingFishViewCustomView catchingFishViewCustomView2 = new CatchingFishViewCustomView();
        catchingFishViewCustomView2.CatchingFishParcelableFAB = i;
        catchingFishViewCustomView2.CatchingFishSnackbar = i2;
        catchingFishViewCustomView2.CatchingFishCoroutine = i3;
        return catchingFishViewCustomView2;
    }

    public int CatchingFishOkHttp(int i, int i2) {
        int i3;
        int i4;
        CatchingFishBundleAsyncTask catchingFishBundleAsyncTask = (CatchingFishBundleAsyncTask) this.CatchingFishReduxKtor;
        ArrayList arrayList = (ArrayList) this.CatchingFishWorkManager;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            CatchingFishViewCustomView catchingFishViewCustomView = (CatchingFishViewCustomView) arrayList.get(size);
            int i5 = catchingFishViewCustomView.CatchingFishParcelableFAB;
            if (i5 == 8) {
                int i6 = catchingFishViewCustomView.CatchingFishSnackbar;
                int i7 = catchingFishViewCustomView.CatchingFishCoroutine;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            catchingFishViewCustomView.CatchingFishSnackbar = i6 + 1;
                            catchingFishViewCustomView.CatchingFishCoroutine = i7 + 1;
                        } else if (i2 == 2) {
                            catchingFishViewCustomView.CatchingFishSnackbar = i6 - 1;
                            catchingFishViewCustomView.CatchingFishCoroutine = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        catchingFishViewCustomView.CatchingFishCoroutine = i7 + 1;
                    } else if (i2 == 2) {
                        catchingFishViewCustomView.CatchingFishCoroutine = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        catchingFishViewCustomView.CatchingFishSnackbar = i6 + 1;
                    } else if (i2 == 2) {
                        catchingFishViewCustomView.CatchingFishSnackbar = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = catchingFishViewCustomView.CatchingFishSnackbar;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= catchingFishViewCustomView.CatchingFishCoroutine;
                    } else if (i5 == 2) {
                        i += catchingFishViewCustomView.CatchingFishCoroutine;
                    }
                } else if (i2 == 1) {
                    catchingFishViewCustomView.CatchingFishSnackbar = i8 + 1;
                } else if (i2 == 2) {
                    catchingFishViewCustomView.CatchingFishSnackbar = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            CatchingFishViewCustomView catchingFishViewCustomView2 = (CatchingFishViewCustomView) arrayList.get(size2);
            if (catchingFishViewCustomView2.CatchingFishParcelableFAB == 8) {
                int i9 = catchingFishViewCustomView2.CatchingFishCoroutine;
                if (i9 == catchingFishViewCustomView2.CatchingFishSnackbar || i9 < 0) {
                    arrayList.remove(size2);
                    catchingFishBundleAsyncTask.CatchingFishCoroutine(catchingFishViewCustomView2);
                }
            } else if (catchingFishViewCustomView2.CatchingFishCoroutine <= 0) {
                arrayList.remove(size2);
                catchingFishBundleAsyncTask.CatchingFishCoroutine(catchingFishViewCustomView2);
            }
        }
        return i;
    }

    public boolean CatchingFishParcelableFAB(int i) {
        ArrayList arrayList = (ArrayList) this.CatchingFishWorkManager;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            CatchingFishViewCustomView catchingFishViewCustomView = (CatchingFishViewCustomView) arrayList.get(i2);
            int i3 = catchingFishViewCustomView.CatchingFishParcelableFAB;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = catchingFishViewCustomView.CatchingFishSnackbar;
                    int i5 = catchingFishViewCustomView.CatchingFishCoroutine + i4;
                    while (i4 < i5) {
                        if (CatchingFishWorkManager(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (CatchingFishWorkManager(catchingFishViewCustomView.CatchingFishCoroutine, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void CatchingFishReduxKtor(CatchingFishViewCustomView catchingFishViewCustomView) {
        int i;
        CatchingFishBundleAsyncTask catchingFishBundleAsyncTask = (CatchingFishBundleAsyncTask) this.CatchingFishReduxKtor;
        int i2 = catchingFishViewCustomView.CatchingFishParcelableFAB;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int CatchingFishOkHttp = CatchingFishOkHttp(catchingFishViewCustomView.CatchingFishSnackbar, i2);
        int i3 = catchingFishViewCustomView.CatchingFishSnackbar;
        int i4 = catchingFishViewCustomView.CatchingFishParcelableFAB;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + catchingFishViewCustomView);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < catchingFishViewCustomView.CatchingFishCoroutine; i6++) {
            int CatchingFishOkHttp2 = CatchingFishOkHttp((i * i6) + catchingFishViewCustomView.CatchingFishSnackbar, catchingFishViewCustomView.CatchingFishParcelableFAB);
            int i7 = catchingFishViewCustomView.CatchingFishParcelableFAB;
            if (i7 == 2 ? CatchingFishOkHttp2 != CatchingFishOkHttp : !(i7 == 4 && CatchingFishOkHttp2 == CatchingFishOkHttp + 1)) {
                CatchingFishViewCustomView CatchingFishLayout = CatchingFishLayout(i7, CatchingFishOkHttp, i5);
                CatchingFishDaggerWebsocket(CatchingFishLayout, i3);
                catchingFishBundleAsyncTask.CatchingFishCoroutine(CatchingFishLayout);
                if (catchingFishViewCustomView.CatchingFishParcelableFAB == 4) {
                    i3 += i5;
                }
                i5 = 1;
                CatchingFishOkHttp = CatchingFishOkHttp2;
            } else {
                i5++;
            }
        }
        catchingFishBundleAsyncTask.CatchingFishCoroutine(catchingFishViewCustomView);
        if (i5 > 0) {
            CatchingFishViewCustomView CatchingFishLayout2 = CatchingFishLayout(catchingFishViewCustomView.CatchingFishParcelableFAB, CatchingFishOkHttp, i5);
            CatchingFishDaggerWebsocket(CatchingFishLayout2, i3);
            catchingFishBundleAsyncTask.CatchingFishCoroutine(CatchingFishLayout2);
        }
    }

    public void CatchingFishSnackbar() {
        CatchingFishKtorPayPal catchingFishKtorPayPal = (CatchingFishKtorPayPal) this.CatchingFishViewModelScope;
        ArrayList arrayList = (ArrayList) this.CatchingFishWorkManager;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((CatchingFishKtorPayPal) this.CatchingFishViewModelScope).CatchingFishParcelableFAB((CatchingFishViewCustomView) arrayList.get(i));
        }
        CatchingFishCloudMessaging(arrayList);
        ArrayList arrayList2 = (ArrayList) this.CatchingFishDaggerWebsocket;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            CatchingFishViewCustomView catchingFishViewCustomView = (CatchingFishViewCustomView) arrayList2.get(i2);
            int i3 = catchingFishViewCustomView.CatchingFishParcelableFAB;
            if (i3 == 1) {
                catchingFishKtorPayPal.CatchingFishParcelableFAB(catchingFishViewCustomView);
                catchingFishKtorPayPal.CatchingFishReduxKtor(catchingFishViewCustomView.CatchingFishSnackbar, catchingFishViewCustomView.CatchingFishCoroutine);
            } else if (i3 == 2) {
                catchingFishKtorPayPal.CatchingFishParcelableFAB(catchingFishViewCustomView);
                int i4 = catchingFishViewCustomView.CatchingFishSnackbar;
                int i5 = catchingFishViewCustomView.CatchingFishCoroutine;
                RecyclerView recyclerView = catchingFishKtorPayPal.CatchingFishParcelableFAB;
                recyclerView.CatchingFishGradleManifest(i4, i5, true);
                recyclerView.CatchingFishMockkOkHttp = true;
                recyclerView.CatchingFishRedux.CatchingFishCoroutine += i5;
            } else if (i3 == 4) {
                catchingFishKtorPayPal.CatchingFishParcelableFAB(catchingFishViewCustomView);
                catchingFishKtorPayPal.CatchingFishCoroutine(catchingFishViewCustomView.CatchingFishSnackbar, catchingFishViewCustomView.CatchingFishCoroutine);
            } else if (i3 == 8) {
                catchingFishKtorPayPal.CatchingFishParcelableFAB(catchingFishViewCustomView);
                catchingFishKtorPayPal.CatchingFishDaggerWebsocket(catchingFishViewCustomView.CatchingFishSnackbar, catchingFishViewCustomView.CatchingFishCoroutine);
            }
        }
        CatchingFishCloudMessaging(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CatchingFishViewModelFAB(CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishMoshiCardView catchingFishMoshiCardView;
        int i;
        CatchingFishMVVMIntentGson CatchingFishCardViewView;
        CatchingFishSensorManager catchingFishSensorManager;
        String str;
        Object CatchingFishViewModelFAB;
        if (catchingFishStateFlowGson instanceof CatchingFishMoshiCardView) {
            catchingFishMoshiCardView = (CatchingFishMoshiCardView) catchingFishStateFlowGson;
            int i2 = catchingFishMoshiCardView.CatchingFishCloudMessaging;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                catchingFishMoshiCardView.CatchingFishCloudMessaging = i2 - Integer.MIN_VALUE;
                Object obj = catchingFishMoshiCardView.CatchingFishLayout;
                i = catchingFishMoshiCardView.CatchingFishCloudMessaging;
                CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                if (i != 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    CatchingFishCardViewView = ((CatchingFishFluxFluxBundle) this.CatchingFishDaggerWebsocket).CatchingFishCardViewView();
                    CatchingFishFABLayout catchingFishFABLayout = (CatchingFishFABLayout) this.CatchingFishReduxKtor;
                    catchingFishMoshiCardView.CatchingFishViewModelScope = this;
                    catchingFishMoshiCardView.CatchingFishViewModelFAB = CatchingFishCardViewView;
                    catchingFishMoshiCardView.CatchingFishCloudMessaging = 1;
                    obj = catchingFishFABLayout.CatchingFishParcelableFAB(catchingFishMoshiCardView);
                    if (obj != catchingFishXMLLayoutMockk) {
                        catchingFishSensorManager = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    return obj;
                }
                CatchingFishCardViewView = catchingFishMoshiCardView.CatchingFishViewModelFAB;
                catchingFishSensorManager = catchingFishMoshiCardView.CatchingFishViewModelScope;
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                CatchingFishMVIRedux catchingFishMVIRedux = (CatchingFishMVIRedux) obj;
                Object obj2 = catchingFishSensorManager.CatchingFishWorkManager;
                CatchingFishDataStoreToast catchingFishDataStoreToast = CatchingFishCardViewView.CatchingFishDaggerWebsocket;
                CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMVIRedux, "signals");
                JSONObject put = new JSONObject().put(catchingFishDataStoreToast.CatchingFishParcelableFAB, catchingFishMVIRedux.CatchingFishParcelableFAB).put(catchingFishDataStoreToast.CatchingFishSnackbar, catchingFishMVIRedux.CatchingFishCoroutine).put(catchingFishDataStoreToast.CatchingFishCoroutine, catchingFishMVIRedux.CatchingFishSnackbar).put(catchingFishDataStoreToast.CatchingFishReduxKtor, catchingFishMVIRedux.CatchingFishReduxKtor);
                str = catchingFishMVIRedux.CatchingFishDaggerWebsocket;
                if (CatchingFishRoomMVVMWidget.CatchingFishSensorManager(str)) {
                    str = null;
                }
                if (str != null) {
                    try {
                        CatchingFishViewModelFAB = new JSONObject(str);
                    } catch (Throwable th) {
                        CatchingFishViewModelFAB = CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th);
                    }
                    if (CatchingFishViewModelFAB instanceof CatchingFishLiveDataToolbar) {
                        CatchingFishViewModelFAB = null;
                    }
                    JSONObject jSONObject = (JSONObject) CatchingFishViewModelFAB;
                    if (jSONObject != null) {
                        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(put);
                        CatchingFishMVPExoPlayer.CatchingFishOkHttp(jSONObject, put);
                    }
                }
                String jSONObject2 = put.toString();
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(jSONObject2, "toString(...)");
                CatchingFishToastGradle catchingFishToastGradle = (CatchingFishToastGradle) catchingFishSensorManager.CatchingFishViewModelFAB;
                CatchingFishPayPalStateFlow catchingFishPayPalStateFlow = new CatchingFishPayPalStateFlow(catchingFishSensorManager, jSONObject2, CatchingFishCardViewView, null);
                catchingFishMoshiCardView.CatchingFishViewModelScope = null;
                catchingFishMoshiCardView.CatchingFishViewModelFAB = null;
                catchingFishMoshiCardView.CatchingFishCloudMessaging = 2;
                Object CatchingFishGradleManifest = CatchingFishXMLLayoutGlide.CatchingFishGradleManifest(catchingFishToastGradle, catchingFishPayPalStateFlow, catchingFishMoshiCardView);
                return CatchingFishGradleManifest != catchingFishXMLLayoutMockk ? catchingFishXMLLayoutMockk : CatchingFishGradleManifest;
            }
        }
        catchingFishMoshiCardView = new CatchingFishMoshiCardView(this, catchingFishStateFlowGson);
        Object obj3 = catchingFishMoshiCardView.CatchingFishLayout;
        i = catchingFishMoshiCardView.CatchingFishCloudMessaging;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk2 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (i != 0) {
        }
        CatchingFishMVIRedux catchingFishMVIRedux2 = (CatchingFishMVIRedux) obj3;
        Object obj22 = catchingFishSensorManager.CatchingFishWorkManager;
        CatchingFishDataStoreToast catchingFishDataStoreToast2 = CatchingFishCardViewView.CatchingFishDaggerWebsocket;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMVIRedux2, "signals");
        JSONObject put2 = new JSONObject().put(catchingFishDataStoreToast2.CatchingFishParcelableFAB, catchingFishMVIRedux2.CatchingFishParcelableFAB).put(catchingFishDataStoreToast2.CatchingFishSnackbar, catchingFishMVIRedux2.CatchingFishCoroutine).put(catchingFishDataStoreToast2.CatchingFishCoroutine, catchingFishMVIRedux2.CatchingFishSnackbar).put(catchingFishDataStoreToast2.CatchingFishReduxKtor, catchingFishMVIRedux2.CatchingFishReduxKtor);
        str = catchingFishMVIRedux2.CatchingFishDaggerWebsocket;
        if (CatchingFishRoomMVVMWidget.CatchingFishSensorManager(str)) {
        }
        if (str != null) {
        }
        String jSONObject22 = put2.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(jSONObject22, "toString(...)");
        CatchingFishToastGradle catchingFishToastGradle2 = (CatchingFishToastGradle) catchingFishSensorManager.CatchingFishViewModelFAB;
        CatchingFishPayPalStateFlow catchingFishPayPalStateFlow2 = new CatchingFishPayPalStateFlow(catchingFishSensorManager, jSONObject22, CatchingFishCardViewView, null);
        catchingFishMoshiCardView.CatchingFishViewModelScope = null;
        catchingFishMoshiCardView.CatchingFishViewModelFAB = null;
        catchingFishMoshiCardView.CatchingFishCloudMessaging = 2;
        Object CatchingFishGradleManifest2 = CatchingFishXMLLayoutGlide.CatchingFishGradleManifest(catchingFishToastGradle2, catchingFishPayPalStateFlow2, catchingFishMoshiCardView);
        if (CatchingFishGradleManifest2 != catchingFishXMLLayoutMockk2) {
        }
    }

    public boolean CatchingFishViewModelScope() {
        return ((ArrayList) this.CatchingFishDaggerWebsocket).size() > 0;
    }

    public int CatchingFishWorkManager(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.CatchingFishWorkManager;
        int size = arrayList.size();
        while (i2 < size) {
            CatchingFishViewCustomView catchingFishViewCustomView = (CatchingFishViewCustomView) arrayList.get(i2);
            int i3 = catchingFishViewCustomView.CatchingFishParcelableFAB;
            if (i3 == 8) {
                int i4 = catchingFishViewCustomView.CatchingFishSnackbar;
                if (i4 == i) {
                    i = catchingFishViewCustomView.CatchingFishCoroutine;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (catchingFishViewCustomView.CatchingFishCoroutine <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = catchingFishViewCustomView.CatchingFishSnackbar;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = catchingFishViewCustomView.CatchingFishCoroutine;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += catchingFishViewCustomView.CatchingFishCoroutine;
                }
            }
            i2++;
        }
        return i;
    }

    @Override // kotlin.text.CatchingFishHandlerMVP
    public Object get() {
        return new CatchingFishMVIMockk((Executor) ((CatchingFishHandlerMVP) this.CatchingFishReduxKtor).get(), (CatchingFishPayPalHandler) ((CatchingFishHandlerMVP) this.CatchingFishDaggerWebsocket).get(), (CatchingFishAppCompatLayout) ((CatchingFishAsyncTaskDagger) this.CatchingFishWorkManager).get(), (CatchingFishOkHttpFirebase) ((CatchingFishHandlerMVP) this.CatchingFishViewModelScope).get(), (CatchingFishGsonCameraX) ((CatchingFishHandlerMVP) this.CatchingFishViewModelFAB).get());
    }

    public CatchingFishSensorManager(CatchingFishFABLayout catchingFishFABLayout, CatchingFishFluxFluxBundle catchingFishFluxFluxBundle, CatchingFishWidgetContext catchingFishWidgetContext, CatchingFishServiceHilt catchingFishServiceHilt, CatchingFishToastGradle catchingFishToastGradle) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishToastGradle, "encryptionDispatcher");
        this.CatchingFishReduxKtor = catchingFishFABLayout;
        this.CatchingFishDaggerWebsocket = catchingFishFluxFluxBundle;
        this.CatchingFishWorkManager = catchingFishWidgetContext;
        this.CatchingFishViewModelScope = catchingFishServiceHilt;
        this.CatchingFishViewModelFAB = catchingFishToastGradle;
    }

    public CatchingFishSensorManager(Map map) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(map, "initialState");
        this.CatchingFishReduxKtor = new LinkedHashMap(map);
        this.CatchingFishDaggerWebsocket = new LinkedHashMap();
        this.CatchingFishWorkManager = new LinkedHashMap();
        this.CatchingFishViewModelScope = new LinkedHashMap();
        this.CatchingFishViewModelFAB = new CatchingFishViewCardView(4, this);
    }

    public CatchingFishSensorManager(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.CatchingFishViewModelScope = new ArrayDeque();
        this.CatchingFishReduxKtor = sharedPreferences;
        this.CatchingFishDaggerWebsocket = "topic_operation_queue";
        this.CatchingFishWorkManager = ",";
        this.CatchingFishViewModelFAB = scheduledThreadPoolExecutor;
    }

    public CatchingFishSensorManager(CatchingFishKtorPayPal catchingFishKtorPayPal) {
        this.CatchingFishReduxKtor = new CatchingFishBundleAsyncTask(30);
        this.CatchingFishDaggerWebsocket = new ArrayList();
        this.CatchingFishWorkManager = new ArrayList();
        this.CatchingFishViewModelScope = catchingFishKtorPayPal;
        this.CatchingFishViewModelFAB = new CatchingFishViewPagerMockk(22, this);
    }
}
