package kotlin.text;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class CatchingFishWidgetContext implements CatchingFishGlidePayPal, CatchingFishMockkAsyncTask, CatchingFishJUnitBiometric, CatchingFishAdMobLayout, CatchingFishPicassoKtor, CatchingFishMVIGoogleMaps, CatchingFishEspressoToast {
    public static CatchingFishWidgetContext CatchingFishReduxKtor;
    public static CatchingFishWidgetContext CatchingFishUnitTesting;
    public static final /* synthetic */ CatchingFishWidgetContext CatchingFishDaggerWebsocket = new CatchingFishWidgetContext();
    public static final CatchingFishWidgetContext CatchingFishWorkManager = new CatchingFishWidgetContext();
    public static final CatchingFishWidgetContext CatchingFishViewModelScope = new CatchingFishWidgetContext();
    public static final CatchingFishWidgetContext CatchingFishViewModelFAB = new CatchingFishWidgetContext();
    public static final /* synthetic */ CatchingFishWidgetContext CatchingFishLayout = new CatchingFishWidgetContext();
    public static final /* synthetic */ CatchingFishWidgetContext CatchingFishFragmentHandler = new CatchingFishWidgetContext();
    public static final CatchingFishWidgetContext CatchingFishCloudMessaging = new CatchingFishWidgetContext();
    public static final CatchingFishWidgetContext CatchingFishEspressoTesting = new CatchingFishWidgetContext();
    public static final /* synthetic */ CatchingFishWidgetContext CatchingFishOkHttp = new CatchingFishWidgetContext();

    public /* synthetic */ CatchingFishWidgetContext(Object obj) {
    }

    public static final void CatchingFishParcelableFAB(CatchingFishGradleMVVM catchingFishGradleMVVM) {
        CatchingFishHandlerAndroidX catchingFishHandlerAndroidX;
        Object obj;
        CatchingFishOkHttpToolbar catchingFishOkHttpToolbar;
        CatchingFishHandlerAndroidX catchingFishHandlerAndroidX2 = CatchingFishMVIHandlerHilt.CatchingFishParcelableFlux;
        do {
            catchingFishHandlerAndroidX = CatchingFishMVIHandlerHilt.CatchingFishParcelableFlux;
            obj = (CatchingFishMVPHiltFAB) catchingFishHandlerAndroidX.getValue();
            catchingFishOkHttpToolbar = (CatchingFishOkHttpToolbar) obj;
            CatchingFishLayoutViewAdMob catchingFishLayoutViewAdMob = catchingFishOkHttpToolbar.CatchingFishWorkManager;
            CatchingFishWorkManagerGson catchingFishWorkManagerGson = (CatchingFishWorkManagerGson) catchingFishLayoutViewAdMob.get(catchingFishGradleMVVM);
            if (catchingFishWorkManagerGson != null) {
                Object obj2 = catchingFishWorkManagerGson.CatchingFishParcelableFAB;
                Object obj3 = catchingFishWorkManagerGson.CatchingFishSnackbar;
                CatchingFishOkHttpIntent catchingFishOkHttpIntent = catchingFishLayoutViewAdMob.CatchingFishReduxKtor;
                CatchingFishOkHttpIntent CatchingFishDaggerHiltFAB = catchingFishOkHttpIntent.CatchingFishDaggerHiltFAB(catchingFishGradleMVVM != null ? catchingFishGradleMVVM.hashCode() : 0, 0, catchingFishGradleMVVM);
                if (catchingFishOkHttpIntent != CatchingFishDaggerHiltFAB) {
                    catchingFishLayoutViewAdMob = CatchingFishDaggerHiltFAB == null ? CatchingFishLayoutViewAdMob.CatchingFishWorkManager : new CatchingFishLayoutViewAdMob(CatchingFishDaggerHiltFAB, catchingFishLayoutViewAdMob.CatchingFishDaggerWebsocket - 1);
                }
                CatchingFishMVPExoPlayer catchingFishMVPExoPlayer = CatchingFishMVPExoPlayer.CatchingFishViewModelScope;
                if (obj2 != catchingFishMVPExoPlayer) {
                    Object obj4 = catchingFishLayoutViewAdMob.get(obj2);
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(obj4);
                    catchingFishLayoutViewAdMob = catchingFishLayoutViewAdMob.CatchingFishParcelableFAB(obj2, new CatchingFishWorkManagerGson(((CatchingFishWorkManagerGson) obj4).CatchingFishParcelableFAB, obj3));
                }
                if (obj3 != catchingFishMVPExoPlayer) {
                    Object obj5 = catchingFishLayoutViewAdMob.get(obj3);
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(obj5);
                    catchingFishLayoutViewAdMob = catchingFishLayoutViewAdMob.CatchingFishParcelableFAB(obj3, new CatchingFishWorkManagerGson(obj2, ((CatchingFishWorkManagerGson) obj5).CatchingFishSnackbar));
                }
                Object obj6 = obj2 != catchingFishMVPExoPlayer ? catchingFishOkHttpToolbar.CatchingFishReduxKtor : obj3;
                if (obj3 != catchingFishMVPExoPlayer) {
                    obj2 = catchingFishOkHttpToolbar.CatchingFishDaggerWebsocket;
                }
                catchingFishOkHttpToolbar = new CatchingFishOkHttpToolbar(obj6, obj2, catchingFishLayoutViewAdMob);
            }
            if (obj == catchingFishOkHttpToolbar) {
                return;
            }
            Object obj7 = CatchingFishAdMobFAB.CatchingFishViewModelScope;
            if (obj == null) {
                obj = obj7;
            }
        } while (!catchingFishHandlerAndroidX.CatchingFishFragmentHandler(obj, catchingFishOkHttpToolbar));
    }

    public static synchronized CatchingFishWidgetContext CatchingFishSnackbar() {
        CatchingFishWidgetContext catchingFishWidgetContext;
        synchronized (CatchingFishWidgetContext.class) {
            try {
                if (CatchingFishReduxKtor == null) {
                    CatchingFishReduxKtor = new CatchingFishWidgetContext();
                }
                catchingFishWidgetContext = CatchingFishReduxKtor;
            } catch (Throwable th) {
                throw th;
            }
        }
        return catchingFishWidgetContext;
    }

    @Override // kotlin.text.CatchingFishAdMobLayout
    public long CatchingFishCoroutine(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        int i = CatchingFishPicassoAndroidX.CatchingFishParcelableFAB;
        return floatToRawIntBits;
    }

    public List CatchingFishDaggerWebsocket(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (CatchingFishToastKtor catchingFishToastKtor : componentRegistrar.getComponents()) {
            String str = catchingFishToastKtor.CatchingFishParcelableFAB;
            if (str != null) {
                catchingFishToastKtor = new CatchingFishToastKtor(str, catchingFishToastKtor.CatchingFishSnackbar, catchingFishToastKtor.CatchingFishCoroutine, catchingFishToastKtor.CatchingFishReduxKtor, catchingFishToastKtor.CatchingFishDaggerWebsocket, new CatchingFishXMLLayoutOkHttp(0, str, catchingFishToastKtor), catchingFishToastKtor.CatchingFishViewModelScope);
            }
            arrayList.add(catchingFishToastKtor);
        }
        return arrayList;
    }

    @Override // kotlin.text.CatchingFishJUnitBiometric
    public Object CatchingFishFragmentHandler(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        Intent intent = (Intent) ((Bundle) catchingFishWorkManagerMVP.CatchingFishWorkManager()).getParcelable("notification_data");
        if (intent != null) {
            return new CatchingFishFragmentJUnit(intent);
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishMockkAsyncTask
    public Object CatchingFishWorkManager(CatchingFishViewWorkManager catchingFishViewWorkManager) {
        Object CatchingFishWorkManager2 = catchingFishViewWorkManager.CatchingFishWorkManager(new CatchingFishFABDagger(CatchingFishSpannableMoshi.class, Executor.class));
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(CatchingFishWorkManager2, "get(...)");
        return new CatchingFishGradleMVP((Executor) CatchingFishWorkManager2);
    }

    @Override // kotlin.text.CatchingFishHandlerMVP
    public Object get() {
        return new CatchingFishLayoutOkHttp(1, Executors.newSingleThreadExecutor());
    }

    @Override // kotlin.text.CatchingFishEspressoToast
    public void CatchingFishReduxKtor(int i, Object obj) {
    }
}
