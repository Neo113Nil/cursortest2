package kotlin.text;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.OnGoogleAdIdReadListener;
import com.catchingfish.fishcatcherpro.R;
import com.catchingfish.fishcatcherpro.presentation.launch.MainActivity;
import com.catchingfish.fishcatcherpro.presentation.menu.MenuGameActivity;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class CatchingFishAsyncTaskDagger implements OnGoogleAdIdReadListener, CatchingFishFABFluxHilt, CatchingFishDaggerHiltMockk, CatchingFishMVIGoogleMaps, CatchingFishViewFlux, CatchingFishSnackbarFAB, CatchingFishFragmentFAB {
    public static CatchingFishAsyncTaskDagger CatchingFishFragmentHandler;
    public static final Object CatchingFishLayout = new Object();
    public static volatile CatchingFishAsyncTaskDagger CatchingFishViewModelFAB;
    public Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public Object CatchingFishViewModelScope;
    public Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishAsyncTaskDagger(int i, boolean z) {
        this.CatchingFishReduxKtor = i;
    }

    public static CatchingFishAsyncTaskDagger CatchingFishRecyclerView(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new CatchingFishAsyncTaskDagger(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static CatchingFishAsyncTaskDagger CatchingFishSensorManager(Context context) {
        if (CatchingFishViewModelFAB == null) {
            synchronized (CatchingFishLayout) {
                try {
                    if (CatchingFishViewModelFAB == null) {
                        CatchingFishViewModelFAB = new CatchingFishAsyncTaskDagger(context);
                    }
                } finally {
                }
            }
        }
        return CatchingFishViewModelFAB;
    }

    public static boolean CatchingFishSpannableWidget(Editable editable, KeyEvent keyEvent, boolean z) {
        CatchingFishDaggerRealm[] catchingFishDaggerRealmArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (catchingFishDaggerRealmArr = (CatchingFishDaggerRealm[]) editable.getSpans(selectionStart, selectionEnd, CatchingFishDaggerRealm.class)) != null && catchingFishDaggerRealmArr.length > 0) {
                for (CatchingFishDaggerRealm catchingFishDaggerRealm : catchingFishDaggerRealmArr) {
                    int spanStart = editable.getSpanStart(catchingFishDaggerRealm);
                    int spanEnd = editable.getSpanEnd(catchingFishDaggerRealm);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void CatchingFish(View view, int i, boolean z) {
        RecyclerView recyclerView = ((CatchingFishKtorPayPal) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB;
        int childCount = i < 0 ? recyclerView.getChildCount() : CatchingFishEspressoMockk(i);
        ((CatchingFishGradleMockk) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket(childCount, z);
        if (z) {
            CatchingFishMotionLayout(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.CatchingFishSensorManager(view);
    }

    public void CatchingFishAndroidX(CatchingFishOkHttpHandler catchingFishOkHttpHandler) {
        ((CatchingFishEspressoMoshi) this.CatchingFishViewModelScope).CatchingFishReduxKtor.CatchingFishCoroutine = catchingFishOkHttpHandler;
    }

    public void CatchingFishAnimation() {
        ((TypedArray) this.CatchingFishDaggerWebsocket).recycle();
    }

    public void CatchingFishAppCompat() {
        CatchingFishAdMobJUnit catchingFishAdMobJUnit = ((CatchingFishBiometricRoom) this.CatchingFishDaggerWebsocket).CatchingFishStateLiveData;
        if (catchingFishAdMobJUnit != null) {
            ((CatchingFishGradleCameraX) catchingFishAdMobJUnit).CatchingFishDaggerHiltFAB();
        }
    }

    public View CatchingFishCameraXIntent(int i) {
        return ((CatchingFishKtorPayPal) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB.getChildAt(i);
    }

    public Object CatchingFishCardViewRealm(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.CatchingFishDaggerWebsocket;
        if (CatchingFishDaggerBiometric.CatchingFishGsonAppCompat()) {
            try {
                CatchingFishDaggerBiometric.CatchingFishDaggerWebsocket(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                CatchingFishToolbarAdMob catchingFishToolbarAdMob = (CatchingFishToolbarAdMob) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> CatchingFishParcelableFAB = catchingFishToolbarAdMob.CatchingFishParcelableFAB();
                if (!CatchingFishParcelableFAB.isEmpty()) {
                    for (Class cls2 : CatchingFishParcelableFAB) {
                        if (!hashMap.containsKey(cls2)) {
                            CatchingFishCardViewRealm(cls2, hashSet);
                        }
                    }
                }
                obj = catchingFishToolbarAdMob.CatchingFishSnackbar((Context) this.CatchingFishViewModelScope);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new CatchingFishBiometricView(th2);
            }
        }
        Trace.endSection();
        return obj;
    }

    public CatchingFishOkHttpHandler CatchingFishCardViewView() {
        return ((CatchingFishEspressoMoshi) this.CatchingFishViewModelScope).CatchingFishReduxKtor.CatchingFishCoroutine;
    }

    @Override // kotlin.text.CatchingFishFABFluxHilt
    public Object CatchingFishCloudMessaging() {
        return null;
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public void CatchingFishCoroutine(Object obj) {
        ((ArrayList) this.CatchingFishWorkManager).add(this.CatchingFishViewModelScope);
        this.CatchingFishViewModelScope = obj;
    }

    public CatchingFishBundleMVIHilt CatchingFishCoroutineFlow() {
        String str = ((String) this.CatchingFishDaggerWebsocket) == null ? " backendName" : "";
        if (((CatchingFishContextMVI) this.CatchingFishViewModelScope) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new CatchingFishBundleMVIHilt((String) this.CatchingFishDaggerWebsocket, (byte[]) this.CatchingFishWorkManager, (CatchingFishContextMVI) this.CatchingFishViewModelScope);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public int CatchingFishCustomView() {
        return ((CatchingFishKtorPayPal) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB.getChildCount() - ((ArrayList) this.CatchingFishViewModelScope).size();
    }

    public void CatchingFishCustomViewJUnit(long j) {
        ((CatchingFishEspressoMoshi) this.CatchingFishViewModelScope).CatchingFishReduxKtor.CatchingFishReduxKtor = j;
    }

    public long CatchingFishDagger() {
        return ((CatchingFishEspressoMoshi) this.CatchingFishViewModelScope).CatchingFishReduxKtor.CatchingFishReduxKtor;
    }

    public void CatchingFishDaggerHiltFAB() {
        ((ArrayList) this.CatchingFishWorkManager).clear();
        this.CatchingFishViewModelScope = this.CatchingFishDaggerWebsocket;
        CatchingFishBiometricRoom catchingFishBiometricRoom = (CatchingFishBiometricRoom) this.CatchingFishDaggerWebsocket;
        CatchingFishViewModelIntent catchingFishViewModelIntent = catchingFishBiometricRoom.CatchingFishEspressoTesting;
        CatchingFishFABToast catchingFishFABToast = (CatchingFishFABToast) catchingFishViewModelIntent.CatchingFishDaggerWebsocket;
        int i = catchingFishFABToast.CatchingFishWorkManager;
        while (true) {
            i--;
            if (-1 >= i) {
                catchingFishFABToast.CatchingFishViewModelScope();
                ((CatchingFishViewPagerRedux) catchingFishViewModelIntent.CatchingFishWorkManager).CatchingFishParcelableFAB();
                return;
            }
            catchingFishBiometricRoom.CatchingFishJobScheduler((CatchingFishBiometricRoom) catchingFishFABToast.CatchingFishReduxKtor[i]);
        }
    }

    public void CatchingFishDaggerMVVM(CatchingFishGsonAppCompat catchingFishGsonAppCompat, int i, int i2, int i3) {
        catchingFishGsonAppCompat.getClass();
        int i4 = catchingFishGsonAppCompat.CatchingFishAndroidX;
        int i5 = catchingFishGsonAppCompat.CatchingFishNavigationGson;
        catchingFishGsonAppCompat.CatchingFishAndroidX = 0;
        catchingFishGsonAppCompat.CatchingFishNavigationGson = 0;
        catchingFishGsonAppCompat.CatchingFishGradleManifest(i2);
        catchingFishGsonAppCompat.CatchingFishCameraXIntent(i3);
        if (i4 < 0) {
            catchingFishGsonAppCompat.CatchingFishAndroidX = 0;
        } else {
            catchingFishGsonAppCompat.CatchingFishAndroidX = i4;
        }
        if (i5 < 0) {
            catchingFishGsonAppCompat.CatchingFishNavigationGson = 0;
        } else {
            catchingFishGsonAppCompat.CatchingFishNavigationGson = i5;
        }
        CatchingFishGsonAppCompat catchingFishGsonAppCompat2 = (CatchingFishGsonAppCompat) this.CatchingFishViewModelScope;
        catchingFishGsonAppCompat2.CatchingFishWidget = i;
        catchingFishGsonAppCompat2.CatchingFishDataStoreIntent();
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public void CatchingFishDaggerWebsocket() {
        CatchingFishDataStoreMVVM catchingFishDataStoreMVVM;
        CatchingFishBiometricRoom catchingFishBiometricRoom = (CatchingFishBiometricRoom) this.CatchingFishViewModelScope;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = catchingFishBiometricRoom.CatchingFishJobScheduler;
        if (!catchingFishBiometricRoom.CatchingFishCustomView()) {
            CatchingFishFluxGradle.CatchingFishParcelableFAB("onReuse is only expected on attached node");
        }
        CatchingFishReduxRetrofit catchingFishReduxRetrofit = catchingFishBiometricRoom.CatchingFishRoomDatabase;
        if (catchingFishReduxRetrofit != null) {
            View view = catchingFishReduxRetrofit.CatchingFishDaggerWebsocket;
            if (view.getParent() != catchingFishReduxRetrofit) {
                catchingFishReduxRetrofit.addView(view);
            } else {
                catchingFishReduxRetrofit.CatchingFishLayout.CatchingFishParcelableFAB();
            }
        }
        catchingFishBiometricRoom.CatchingFishDaggerHiltFAB = false;
        if (catchingFishBiometricRoom.CatchingFishLayoutInflater) {
            catchingFishBiometricRoom.CatchingFishLayoutInflater = false;
        } else {
            catchingFishBiometricRoom.CatchingFishMotionLayout();
        }
        int i = catchingFishBiometricRoom.CatchingFishDaggerWebsocket;
        catchingFishBiometricRoom.CatchingFishDaggerWebsocket = CatchingFishJUnitCardView.CatchingFishParcelableFAB.addAndGet(1);
        CatchingFishAdMobJUnit catchingFishAdMobJUnit = catchingFishBiometricRoom.CatchingFishStateLiveData;
        if (catchingFishAdMobJUnit != null) {
            CatchingFishGradleCameraX catchingFishGradleCameraX = (CatchingFishGradleCameraX) catchingFishAdMobJUnit;
            catchingFishGradleCameraX.m10getLayoutNodes().CatchingFishViewModelScope(i);
            catchingFishGradleCameraX.m10getLayoutNodes().CatchingFishViewModelFAB(catchingFishBiometricRoom.CatchingFishDaggerWebsocket, catchingFishBiometricRoom);
        }
        for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = (CatchingFishFABStripeAPIFAB) catchingFishExoPlayerBundle.CatchingFishFragmentHandler; catchingFishFABStripeAPIFAB != null; catchingFishFABStripeAPIFAB = catchingFishFABStripeAPIFAB.CatchingFishLayout) {
            catchingFishFABStripeAPIFAB.CatchingFishJetpackCompose();
        }
        catchingFishExoPlayerBundle.CatchingFishFragmentHandler();
        if (catchingFishExoPlayerBundle.CatchingFishViewModelFAB(8)) {
            catchingFishBiometricRoom.CatchingFishCardViewView();
        }
        CatchingFishBiometricRoom.CatchingFishGradleManifest(catchingFishBiometricRoom);
        CatchingFishAdMobJUnit catchingFishAdMobJUnit2 = catchingFishBiometricRoom.CatchingFishStateLiveData;
        if (catchingFishAdMobJUnit2 != null) {
            CatchingFishGradleCameraX catchingFishGradleCameraX2 = (CatchingFishGradleCameraX) catchingFishAdMobJUnit2;
            if (CatchingFishGradleCameraX.CatchingFishViewModelFAB() && (catchingFishDataStoreMVVM = catchingFishGradleCameraX2.CatchingFishSensorManager) != null) {
                CatchingFishGradleCameraX catchingFishGradleCameraX3 = catchingFishDataStoreMVVM.CatchingFishCoroutine;
                CatchingFishViewPagerMockk catchingFishViewPagerMockk = catchingFishDataStoreMVVM.CatchingFishParcelableFAB;
                CatchingFishMVIWidget catchingFishMVIWidget = catchingFishDataStoreMVVM.CatchingFishViewModelScope;
                if (catchingFishMVIWidget.CatchingFishDaggerWebsocket(i)) {
                    catchingFishViewPagerMockk.CatchingFishStateLiveData(catchingFishGradleCameraX3, i, false);
                }
                CatchingFishMVPMotionLayout CatchingFish = catchingFishBiometricRoom.CatchingFish();
                if (CatchingFish != null && CatchingFish.CatchingFishReduxKtor.CatchingFishSnackbar(CatchingFishServiceMVI.CatchingFishStateLiveData)) {
                    catchingFishMVIWidget.CatchingFishParcelableFAB(catchingFishBiometricRoom.CatchingFishDaggerWebsocket);
                    catchingFishViewPagerMockk.CatchingFishStateLiveData(catchingFishGradleCameraX3, catchingFishBiometricRoom.CatchingFishDaggerWebsocket, true);
                }
            }
            catchingFishGradleCameraX2.getRectManager().CatchingFishViewModelScope(catchingFishBiometricRoom, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CatchingFishDataStoreIntent(String str, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishJUnitManifest catchingFishJUnitManifest;
        int i;
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger;
        if (catchingFishStateFlowGson instanceof CatchingFishJUnitManifest) {
            catchingFishJUnitManifest = (CatchingFishJUnitManifest) catchingFishStateFlowGson;
            int i2 = catchingFishJUnitManifest.CatchingFishCloudMessaging;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                catchingFishJUnitManifest.CatchingFishCloudMessaging = i2 - Integer.MIN_VALUE;
                Object obj = catchingFishJUnitManifest.CatchingFishLayout;
                i = catchingFishJUnitManifest.CatchingFishCloudMessaging;
                if (i != 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    CatchingFishEspressoPayPal catchingFishEspressoPayPal = (CatchingFishEspressoPayPal) this.CatchingFishViewModelScope;
                    catchingFishJUnitManifest.CatchingFishViewModelScope = this;
                    catchingFishJUnitManifest.CatchingFishViewModelFAB = str;
                    catchingFishJUnitManifest.CatchingFishCloudMessaging = 1;
                    obj = ((CatchingFishCustomViewAdMob) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket).CatchingFishNavigationGson(catchingFishJUnitManifest);
                    CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                    if (obj == catchingFishXMLLayoutMockk) {
                        return catchingFishXMLLayoutMockk;
                    }
                    catchingFishAsyncTaskDagger = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = catchingFishJUnitManifest.CatchingFishViewModelFAB;
                    catchingFishAsyncTaskDagger = catchingFishJUnitManifest.CatchingFishViewModelScope;
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                }
                WebView webView = (WebView) obj;
                CatchingFishBundleGlide catchingFishBundleGlide = (CatchingFishBundleGlide) catchingFishAsyncTaskDagger.CatchingFishWorkManager;
                ((CatchingFishViewWidgetFAB) catchingFishBundleGlide.CatchingFishDaggerWebsocket).CatchingFishViewModelFAB(0);
                ((CatchingFishAsyncTaskIntent) catchingFishBundleGlide.CatchingFishWorkManager).setValue(Boolean.TRUE);
                webView.setVisibility(0);
                if (str.length() > 0) {
                    String userAgentString = webView.getSettings().getUserAgentString();
                    WebSettings settings = webView.getSettings();
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(userAgentString);
                    settings.setUserAgentString(CatchingFishRoomMVVMWidget.CatchingFishEspressoMockk(userAgentString, "; wv", ""));
                }
                webView.loadUrl(str);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            }
        }
        catchingFishJUnitManifest = new CatchingFishJUnitManifest(this, catchingFishStateFlowGson);
        Object obj2 = catchingFishJUnitManifest.CatchingFishLayout;
        i = catchingFishJUnitManifest.CatchingFishCloudMessaging;
        if (i != 0) {
        }
        WebView webView2 = (WebView) obj2;
        CatchingFishBundleGlide catchingFishBundleGlide2 = (CatchingFishBundleGlide) catchingFishAsyncTaskDagger.CatchingFishWorkManager;
        ((CatchingFishViewWidgetFAB) catchingFishBundleGlide2.CatchingFishDaggerWebsocket).CatchingFishViewModelFAB(0);
        ((CatchingFishAsyncTaskIntent) catchingFishBundleGlide2.CatchingFishWorkManager).setValue(Boolean.TRUE);
        webView2.setVisibility(0);
        if (str.length() > 0) {
        }
        webView2.loadUrl(str);
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }

    public int CatchingFishEspressoMockk(int i) {
        CatchingFishGradleMockk catchingFishGradleMockk = (CatchingFishGradleMockk) this.CatchingFishWorkManager;
        if (i < 0) {
            return -1;
        }
        int childCount = ((CatchingFishKtorPayPal) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int CatchingFishSnackbar = i - (i2 - catchingFishGradleMockk.CatchingFishSnackbar(i2));
            if (CatchingFishSnackbar == 0) {
                while (catchingFishGradleMockk.CatchingFishReduxKtor(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += CatchingFishSnackbar;
        }
        return -1;
    }

    @Override // kotlin.text.CatchingFishFABFluxHilt
    public Uri CatchingFishEspressoTesting() {
        return (Uri) this.CatchingFishDaggerWebsocket;
    }

    public ColorStateList CatchingFishFragmentFactory(int i) {
        int resourceId;
        ColorStateList CatchingFishSpannableWidget;
        TypedArray typedArray = (TypedArray) this.CatchingFishDaggerWebsocket;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (CatchingFishSpannableWidget = CatchingFishGsonCardView.CatchingFishSpannableWidget((Context) this.CatchingFishViewModelScope, resourceId)) == null) ? typedArray.getColorStateList(i) : CatchingFishSpannableWidget;
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public void CatchingFishFragmentHandler(int i, int i2) {
        CatchingFishBiometricRoom catchingFishBiometricRoom = (CatchingFishBiometricRoom) this.CatchingFishViewModelScope;
        CatchingFishViewModelIntent catchingFishViewModelIntent = catchingFishBiometricRoom.CatchingFishEspressoTesting;
        if (i2 < 0) {
            CatchingFishFluxGradle.CatchingFishParcelableFAB("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            catchingFishBiometricRoom.CatchingFishJobScheduler((CatchingFishBiometricRoom) ((CatchingFishFABToast) catchingFishViewModelIntent.CatchingFishDaggerWebsocket).CatchingFishReduxKtor[i3]);
            Object CatchingFishFragmentHandler2 = ((CatchingFishFABToast) catchingFishViewModelIntent.CatchingFishDaggerWebsocket).CatchingFishFragmentHandler(i3);
            ((CatchingFishViewPagerRedux) catchingFishViewModelIntent.CatchingFishWorkManager).CatchingFishParcelableFAB();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public boolean CatchingFishGradleManifest(CharSequence charSequence, int i, int i2, CatchingFishFirebaseFABGson catchingFishFirebaseFABGson) {
        if ((catchingFishFirebaseFABGson.CatchingFishCoroutine & 3) == 0) {
            CatchingFishToastLiveData catchingFishToastLiveData = (CatchingFishToastLiveData) this.CatchingFishViewModelScope;
            CatchingFishManifestGson CatchingFishSnackbar = catchingFishFirebaseFABGson.CatchingFishSnackbar();
            int CatchingFishParcelableFAB = CatchingFishSnackbar.CatchingFishParcelableFAB(8);
            if (CatchingFishParcelableFAB != 0) {
                ((ByteBuffer) CatchingFishSnackbar.CatchingFishViewModelScope).getShort(CatchingFishParcelableFAB + CatchingFishSnackbar.CatchingFishReduxKtor);
            }
            CatchingFishRoomDatabaseMVI catchingFishRoomDatabaseMVI = (CatchingFishRoomDatabaseMVI) catchingFishToastLiveData;
            catchingFishRoomDatabaseMVI.getClass();
            ThreadLocal threadLocal = CatchingFishRoomDatabaseMVI.CatchingFishSnackbar;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = catchingFishRoomDatabaseMVI.CatchingFishParcelableFAB.hasGlyph(sb.toString());
            int i3 = catchingFishFirebaseFABGson.CatchingFishCoroutine & 4;
            catchingFishFirebaseFABGson.CatchingFishCoroutine = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (catchingFishFirebaseFABGson.CatchingFishCoroutine & 3) == 2;
    }

    public void CatchingFishGsonAppCompat(Bundle bundle) {
        HashSet hashSet = (HashSet) this.CatchingFishWorkManager;
        String string = ((Context) this.CatchingFishViewModelScope).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (CatchingFishToolbarAdMob.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    CatchingFishCardViewRealm((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new CatchingFishBiometricView(e);
            }
        }
    }

    public int CatchingFishHandler() {
        return ((CatchingFishKtorPayPal) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB.getChildCount();
    }

    public Object CatchingFishJUnitRealm(CharSequence charSequence, int i, int i2, int i3, boolean z, CatchingFishSpannableGson catchingFishSpannableGson) {
        int i4;
        char c;
        CatchingFishFirebaseRoom catchingFishFirebaseRoom = new CatchingFishFirebaseRoom((CatchingFishOkHttpXMLLayout) ((CatchingFishFluxFluxBundle) this.CatchingFishWorkManager).CatchingFishWorkManager);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray sparseArray = catchingFishFirebaseRoom.CatchingFishCoroutine.CatchingFishParcelableFAB;
                CatchingFishOkHttpXMLLayout catchingFishOkHttpXMLLayout = sparseArray == null ? null : (CatchingFishOkHttpXMLLayout) sparseArray.get(codePointAt);
                if (catchingFishFirebaseRoom.CatchingFishParcelableFAB == 2) {
                    if (catchingFishOkHttpXMLLayout != null) {
                        catchingFishFirebaseRoom.CatchingFishCoroutine = catchingFishOkHttpXMLLayout;
                        catchingFishFirebaseRoom.CatchingFishWorkManager++;
                    } else {
                        if (codePointAt == 65038) {
                            catchingFishFirebaseRoom.CatchingFishParcelableFAB();
                        } else if (codePointAt != 65039) {
                            CatchingFishOkHttpXMLLayout catchingFishOkHttpXMLLayout2 = catchingFishFirebaseRoom.CatchingFishCoroutine;
                            if (catchingFishOkHttpXMLLayout2.CatchingFishSnackbar != null) {
                                if (catchingFishFirebaseRoom.CatchingFishWorkManager != 1) {
                                    catchingFishFirebaseRoom.CatchingFishReduxKtor = catchingFishOkHttpXMLLayout2;
                                    catchingFishFirebaseRoom.CatchingFishParcelableFAB();
                                } else if (catchingFishFirebaseRoom.CatchingFishSnackbar()) {
                                    catchingFishFirebaseRoom.CatchingFishReduxKtor = catchingFishFirebaseRoom.CatchingFishCoroutine;
                                    catchingFishFirebaseRoom.CatchingFishParcelableFAB();
                                } else {
                                    catchingFishFirebaseRoom.CatchingFishParcelableFAB();
                                }
                                c = 3;
                            } else {
                                catchingFishFirebaseRoom.CatchingFishParcelableFAB();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (catchingFishOkHttpXMLLayout == null) {
                    catchingFishFirebaseRoom.CatchingFishParcelableFAB();
                    c = 1;
                } else {
                    catchingFishFirebaseRoom.CatchingFishParcelableFAB = 2;
                    catchingFishFirebaseRoom.CatchingFishCoroutine = catchingFishOkHttpXMLLayout;
                    catchingFishFirebaseRoom.CatchingFishWorkManager = 1;
                    c = 2;
                }
                catchingFishFirebaseRoom.CatchingFishDaggerWebsocket = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !CatchingFishGradleManifest(charSequence, i4, i6, catchingFishFirebaseRoom.CatchingFishReduxKtor.CatchingFishSnackbar)) {
                        z2 = catchingFishSpannableGson.CatchingFishSnackbar(charSequence, i4, i6, catchingFishFirebaseRoom.CatchingFishReduxKtor.CatchingFishSnackbar);
                        i5++;
                    }
                }
            }
        }
        if (catchingFishFirebaseRoom.CatchingFishParcelableFAB == 2 && catchingFishFirebaseRoom.CatchingFishCoroutine.CatchingFishSnackbar != null && ((catchingFishFirebaseRoom.CatchingFishWorkManager > 1 || catchingFishFirebaseRoom.CatchingFishSnackbar()) && i5 < i3 && z2 && (z || !CatchingFishGradleManifest(charSequence, i4, i6, catchingFishFirebaseRoom.CatchingFishCoroutine.CatchingFishSnackbar)))) {
            catchingFishSpannableGson.CatchingFishSnackbar(charSequence, i4, i6, catchingFishFirebaseRoom.CatchingFishCoroutine.CatchingFishSnackbar);
        }
        return catchingFishSpannableGson.CatchingFishParcelableFAB();
    }

    public void CatchingFishJetpackCompose(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((CatchingFishKtorPayPal) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB;
        int childCount = i < 0 ? recyclerView.getChildCount() : CatchingFishEspressoMockk(i);
        ((CatchingFishGradleMockk) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket(childCount, z);
        if (z) {
            CatchingFishMotionLayout(view);
        }
        CatchingFishPayPalCardView CatchingFishSensorManager = RecyclerView.CatchingFishSensorManager(view);
        if (CatchingFishSensorManager != null) {
            if (!CatchingFishSensorManager.CatchingFishFragmentHandler() && !CatchingFishSensorManager.CatchingFishAnimationMockk()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + CatchingFishSensorManager + recyclerView.CatchingFishGsonAppCompat());
            }
            CatchingFishSensorManager.CatchingFishFragmentHandler &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public Drawable CatchingFishJobScheduler(int i) {
        int resourceId;
        Drawable CatchingFishReduxKtor;
        if (!((TypedArray) this.CatchingFishDaggerWebsocket).hasValue(i) || (resourceId = ((TypedArray) this.CatchingFishDaggerWebsocket).getResourceId(i, 0)) == 0) {
            return null;
        }
        CatchingFishPicassoMVPJUnit CatchingFishParcelableFAB = CatchingFishPicassoMVPJUnit.CatchingFishParcelableFAB();
        Context context = (Context) this.CatchingFishViewModelScope;
        synchronized (CatchingFishParcelableFAB) {
            CatchingFishReduxKtor = CatchingFishParcelableFAB.CatchingFishParcelableFAB.CatchingFishReduxKtor(context, resourceId, true);
        }
        return CatchingFishReduxKtor;
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public Object CatchingFishLayout() {
        return this.CatchingFishViewModelScope;
    }

    public boolean CatchingFishLayoutInflater() {
        return !(((CatchingFishServiceGson) ((CatchingFishViewPagerMockk) this.CatchingFishDaggerWebsocket).CatchingFishDaggerWebsocket).isEmpty() && ((CatchingFishServiceGson) ((CatchingFishViewPagerMockk) this.CatchingFishViewModelScope).CatchingFishDaggerWebsocket).isEmpty() && ((CatchingFishServiceGson) ((CatchingFishViewPagerMockk) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket).isEmpty());
    }

    public View CatchingFishMVPRobolectric(int i) {
        return ((CatchingFishKtorPayPal) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB.getChildAt(CatchingFishEspressoMockk(i));
    }

    public void CatchingFishMVVMAppCompat(CatchingFishHiltFragmentMVI catchingFishHiltFragmentMVI) {
        CatchingFishAsyncTaskWidget catchingFishAsyncTaskWidget = new CatchingFishAsyncTaskWidget(9);
        CatchingFishGlideDagger catchingFishGlideDagger = (CatchingFishGlideDagger) this.CatchingFishViewModelScope;
        CatchingFishBundleMVIHilt catchingFishBundleMVIHilt = (CatchingFishBundleMVIHilt) this.CatchingFishDaggerWebsocket;
        CatchingFishBiometricIntent catchingFishBiometricIntent = (CatchingFishBiometricIntent) this.CatchingFishWorkManager;
        CatchingFishToastHandler catchingFishToastHandler = catchingFishGlideDagger.CatchingFishCoroutine;
        CatchingFishAsyncTaskDagger CatchingFishParcelableFAB = CatchingFishBundleMVIHilt.CatchingFishParcelableFAB();
        CatchingFishParcelableFAB.CatchingFishMoshiDaggerHilt(catchingFishBundleMVIHilt.CatchingFishParcelableFAB);
        CatchingFishParcelableFAB.CatchingFishViewModelScope = CatchingFishContextMVI.CatchingFishReduxKtor;
        CatchingFishParcelableFAB.CatchingFishWorkManager = catchingFishBundleMVIHilt.CatchingFishSnackbar;
        CatchingFishBundleMVIHilt CatchingFishCoroutineFlow = CatchingFishParcelableFAB.CatchingFishCoroutineFlow();
        CatchingFishViewWorkManager catchingFishViewWorkManager = new CatchingFishViewWorkManager();
        catchingFishViewWorkManager.CatchingFishLayout = new HashMap();
        catchingFishViewWorkManager.CatchingFishViewModelScope = Long.valueOf(catchingFishGlideDagger.CatchingFishParcelableFAB.CatchingFishParcelableFAB());
        catchingFishViewWorkManager.CatchingFishViewModelFAB = Long.valueOf(catchingFishGlideDagger.CatchingFishSnackbar.CatchingFishParcelableFAB());
        catchingFishViewWorkManager.CatchingFishReduxKtor = "FCM_CLIENT_EVENT_LOGGING";
        CatchingFishMockkMVI catchingFishMockkMVI = catchingFishHiltFragmentMVI.CatchingFishParcelableFAB;
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = CatchingFishMVIServiceFAB.CatchingFishParcelableFAB;
        catchingFishAsyncTaskDagger.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            catchingFishAsyncTaskDagger.CatchingFishPayPal(catchingFishMockkMVI, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        catchingFishViewWorkManager.CatchingFishWorkManager = new CatchingFishManifestBundle(catchingFishBiometricIntent, byteArrayOutputStream.toByteArray());
        catchingFishViewWorkManager.CatchingFishDaggerWebsocket = null;
        CatchingFishMVIMockk catchingFishMVIMockk = (CatchingFishMVIMockk) catchingFishToastHandler;
        catchingFishMVIMockk.CatchingFishSnackbar.execute(new CatchingFishMVPFluxFirebase(catchingFishMVIMockk, CatchingFishCoroutineFlow, catchingFishAsyncTaskWidget, catchingFishViewWorkManager.CatchingFishCloudMessaging()));
    }

    public void CatchingFishMockkOkHttp(View view) {
        if (((ArrayList) this.CatchingFishViewModelScope).remove(view)) {
            CatchingFishKtorPayPal catchingFishKtorPayPal = (CatchingFishKtorPayPal) this.CatchingFishDaggerWebsocket;
            CatchingFishPayPalCardView CatchingFishSensorManager = RecyclerView.CatchingFishSensorManager(view);
            if (CatchingFishSensorManager != null) {
                RecyclerView recyclerView = catchingFishKtorPayPal.CatchingFishParcelableFAB;
                int i = CatchingFishSensorManager.CatchingFishStateLiveData;
                if (recyclerView.CatchingFishCameraXIntent()) {
                    CatchingFishSensorManager.CatchingFishRoomDatabase = i;
                    recyclerView.CatchingFishFABLayout.add(CatchingFishSensorManager);
                } else {
                    View view2 = CatchingFishSensorManager.CatchingFishParcelableFAB;
                    WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                    view2.setImportantForAccessibility(i);
                }
                CatchingFishSensorManager.CatchingFishStateLiveData = 0;
            }
        }
    }

    public void CatchingFishMoshiDaggerHilt(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.CatchingFishDaggerWebsocket = str;
    }

    public void CatchingFishMotionLayout(View view) {
        ((ArrayList) this.CatchingFishViewModelScope).add(view);
        CatchingFishKtorPayPal catchingFishKtorPayPal = (CatchingFishKtorPayPal) this.CatchingFishDaggerWebsocket;
        CatchingFishPayPalCardView CatchingFishSensorManager = RecyclerView.CatchingFishSensorManager(view);
        if (CatchingFishSensorManager != null) {
            View view2 = CatchingFishSensorManager.CatchingFishParcelableFAB;
            RecyclerView recyclerView = catchingFishKtorPayPal.CatchingFishParcelableFAB;
            int i = CatchingFishSensorManager.CatchingFishRoomDatabase;
            if (i != -1) {
                CatchingFishSensorManager.CatchingFishStateLiveData = i;
            } else {
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                CatchingFishSensorManager.CatchingFishStateLiveData = view2.getImportantForAccessibility();
            }
            if (recyclerView.CatchingFishCameraXIntent()) {
                CatchingFishSensorManager.CatchingFishRoomDatabase = 4;
                recyclerView.CatchingFishFABLayout.add(CatchingFishSensorManager);
            } else {
                WeakHashMap weakHashMap2 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public Drawable CatchingFishMutableLiveData(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.CatchingFishDaggerWebsocket;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : CatchingFishLayoutRoomFAB.CatchingFishCustomView((Context) this.CatchingFishViewModelScope, resourceId);
    }

    public void CatchingFishNavigation(CatchingFishBiometricRoom catchingFishBiometricRoom, CatchingFishMVVMRoom catchingFishMVVMRoom) {
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = (CatchingFishViewPagerMockk) this.CatchingFishDaggerWebsocket;
        CatchingFishViewPagerMockk catchingFishViewPagerMockk2 = (CatchingFishViewPagerMockk) this.CatchingFishWorkManager;
        CatchingFishViewPagerMockk catchingFishViewPagerMockk3 = (CatchingFishViewPagerMockk) this.CatchingFishViewModelScope;
        int ordinal = catchingFishMVVMRoom.ordinal();
        if (ordinal == 0) {
            catchingFishViewPagerMockk.CatchingFishWorkManager(catchingFishBiometricRoom);
            catchingFishViewPagerMockk3.CatchingFishWorkManager(catchingFishBiometricRoom);
            return;
        }
        if (ordinal == 1) {
            catchingFishViewPagerMockk2.CatchingFishWorkManager(catchingFishBiometricRoom);
            catchingFishViewPagerMockk3.CatchingFishWorkManager(catchingFishBiometricRoom);
            return;
        }
        if (ordinal == 2) {
            if (catchingFishBiometricRoom.CatchingFishFragmentHandler != null) {
                catchingFishViewPagerMockk3.CatchingFishWorkManager(catchingFishBiometricRoom);
                return;
            } else {
                catchingFishViewPagerMockk.CatchingFishWorkManager(catchingFishBiometricRoom);
                return;
            }
        }
        if (ordinal != 3) {
            throw new CatchingFishBiometricView();
        }
        if (catchingFishBiometricRoom.CatchingFishFragmentHandler != null) {
            catchingFishViewPagerMockk3.CatchingFishWorkManager(catchingFishBiometricRoom);
        } else {
            catchingFishViewPagerMockk2.CatchingFishWorkManager(catchingFishBiometricRoom);
        }
    }

    public void CatchingFishNavigationGson(CatchingFishOkHttpFlux catchingFishOkHttpFlux) {
        ((CatchingFishEspressoMoshi) this.CatchingFishViewModelScope).CatchingFishReduxKtor.CatchingFishParcelableFAB = catchingFishOkHttpFlux;
    }

    public boolean CatchingFishParcelable(int i, CatchingFishRetrofitDagger catchingFishRetrofitDagger, CatchingFishDaggerRetrofit catchingFishDaggerRetrofit) {
        CatchingFishGsonBiometric catchingFishGsonBiometric = (CatchingFishGsonBiometric) this.CatchingFishWorkManager;
        int[] iArr = catchingFishDaggerRetrofit.CatchingFishGlideWidgetKtor;
        int[] iArr2 = catchingFishDaggerRetrofit.CatchingFishJetpackCompose;
        catchingFishGsonBiometric.CatchingFishParcelableFAB = iArr[0];
        catchingFishGsonBiometric.CatchingFishSnackbar = iArr[1];
        catchingFishGsonBiometric.CatchingFishCoroutine = catchingFishDaggerRetrofit.CatchingFishRoomDatabase();
        catchingFishGsonBiometric.CatchingFishReduxKtor = catchingFishDaggerRetrofit.CatchingFishCloudMessaging();
        catchingFishGsonBiometric.CatchingFishLayout = false;
        catchingFishGsonBiometric.CatchingFishFragmentHandler = i;
        boolean z = catchingFishGsonBiometric.CatchingFishParcelableFAB == 3;
        boolean z2 = catchingFishGsonBiometric.CatchingFishSnackbar == 3;
        boolean z3 = z && catchingFishDaggerRetrofit.CatchingFishJUnitRealm > 0.0f;
        boolean z4 = z2 && catchingFishDaggerRetrofit.CatchingFishJUnitRealm > 0.0f;
        if (z3 && iArr2[0] == 4) {
            catchingFishGsonBiometric.CatchingFishParcelableFAB = 1;
        }
        if (z4 && iArr2[1] == 4) {
            catchingFishGsonBiometric.CatchingFishSnackbar = 1;
        }
        catchingFishRetrofitDagger.CatchingFishSnackbar(catchingFishDaggerRetrofit, catchingFishGsonBiometric);
        catchingFishDaggerRetrofit.CatchingFishGradleManifest(catchingFishGsonBiometric.CatchingFishDaggerWebsocket);
        catchingFishDaggerRetrofit.CatchingFishCameraXIntent(catchingFishGsonBiometric.CatchingFishWorkManager);
        catchingFishDaggerRetrofit.CatchingFishFragmentFactory = catchingFishGsonBiometric.CatchingFishViewModelFAB;
        catchingFishDaggerRetrofit.CatchingFishSensorManager(catchingFishGsonBiometric.CatchingFishViewModelScope);
        catchingFishGsonBiometric.CatchingFishFragmentHandler = 0;
        return catchingFishGsonBiometric.CatchingFishLayout;
    }

    @Override // kotlin.text.CatchingFishSnackbarFAB
    public CatchingFishEspressoView CatchingFishParcelableFAB(long j, CatchingFishEspressoView catchingFishEspressoView, CatchingFishEspressoView catchingFishEspressoView2, CatchingFishEspressoView catchingFishEspressoView3) {
        if (((CatchingFishEspressoView) this.CatchingFishWorkManager) == null) {
            this.CatchingFishWorkManager = catchingFishEspressoView.CatchingFishCoroutine();
        }
        CatchingFishEspressoView catchingFishEspressoView4 = (CatchingFishEspressoView) this.CatchingFishWorkManager;
        if (catchingFishEspressoView4 == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("valueVector");
            throw null;
        }
        int CatchingFishSnackbar = catchingFishEspressoView4.CatchingFishSnackbar();
        for (int i = 0; i < CatchingFishSnackbar; i++) {
            CatchingFishEspressoView catchingFishEspressoView5 = (CatchingFishEspressoView) this.CatchingFishWorkManager;
            if (catchingFishEspressoView5 == null) {
                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("valueVector");
                throw null;
            }
            catchingFishEspressoView5.CatchingFishReduxKtor(i, ((CatchingFishEspressoPayPal) this.CatchingFishDaggerWebsocket).CatchingFishViewModelFAB(i).CatchingFishSnackbar(j, catchingFishEspressoView.CatchingFishParcelableFAB(i), catchingFishEspressoView2.CatchingFishParcelableFAB(i), catchingFishEspressoView3.CatchingFishParcelableFAB(i)));
        }
        CatchingFishEspressoView catchingFishEspressoView6 = (CatchingFishEspressoView) this.CatchingFishWorkManager;
        if (catchingFishEspressoView6 != null) {
            return catchingFishEspressoView6;
        }
        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("valueVector");
        throw null;
    }

    public void CatchingFishParcelableFlux(int i) {
        CatchingFishPayPalCardView CatchingFishSensorManager;
        int CatchingFishEspressoMockk = CatchingFishEspressoMockk(i);
        ((CatchingFishGradleMockk) this.CatchingFishWorkManager).CatchingFishWorkManager(CatchingFishEspressoMockk);
        RecyclerView recyclerView = ((CatchingFishKtorPayPal) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB;
        View childAt = recyclerView.getChildAt(CatchingFishEspressoMockk);
        if (childAt != null && (CatchingFishSensorManager = RecyclerView.CatchingFishSensorManager(childAt)) != null) {
            if (CatchingFishSensorManager.CatchingFishFragmentHandler() && !CatchingFishSensorManager.CatchingFishAnimationMockk()) {
                throw new IllegalArgumentException("called detach on an already detached child " + CatchingFishSensorManager + recyclerView.CatchingFishGsonAppCompat());
            }
            CatchingFishSensorManager.CatchingFishParcelableFAB(256);
        }
        recyclerView.detachViewFromParent(CatchingFishEspressoMockk);
    }

    public void CatchingFishPayPal(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.CatchingFishDaggerWebsocket;
        CatchingFishAndroidXGson catchingFishAndroidXGson = new CatchingFishAndroidXGson(byteArrayOutputStream, hashMap, (HashMap) this.CatchingFishWorkManager, (CatchingFishMVPStripeAPI) this.CatchingFishViewModelScope);
        CatchingFishMVPStripeAPI catchingFishMVPStripeAPI = (CatchingFishMVPStripeAPI) hashMap.get(obj.getClass());
        if (catchingFishMVPStripeAPI != null) {
            catchingFishMVPStripeAPI.CatchingFishParcelableFAB(obj, catchingFishAndroidXGson);
        } else {
            throw new CatchingFishStripeAPIWidget("No encoder for " + obj.getClass());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(86:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(83:268|269|(1:24)|25|26|27|(1:29)|265|31|32|(3:243|244|(72:246|(1:248)|250|(1:252)|254|(3:256|(1:258)(1:260)|259)|261|35|(1:37)|38|(1:40)|41|(3:230|(2:238|239)|(1:237))|47|(1:49)|50|(1:52)(2:220|(1:225)(1:224))|53|(1:55)(1:219)|56|(1:58)(5:209|(1:211)|212|(1:214)(1:218)|(1:216)(1:217))|59|(1:61)(6:191|(4:194|(2:202|203)(1:200)|201|192)|204|205|(1:207)|208)|62|(1:64)(1:190)|(1:66)|67|(40:186|187|(1:73)|74|(1:76)(1:181)|77|(1:79)|80|(1:82)|(1:84)|85|(1:87)|(1:89)|90|(1:92)|(1:94)|95|(23:167|168|(1:99)|100|(3:157|158|(20:160|(1:162)|163|(1:104)|105|(4:142|143|144|(2:146|(14:148|(3:109|(1:114)(1:112)|113)|115|(1:117)|118|(1:120)|121|(1:123)|124|(1:141)|126|(4:130|131|(1:133)(1:136)|134)|128|129)(2:149|150))(2:151|152))|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)(2:164|165))|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|69|(43:182|183|(0)|74|(0)(0)|77|(0)|80|(1:177)|82|(0)|85|(1:173)|87|(0)|90|(1:171)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129))|34|35|(0)|38|(0)|41|(2:43|226)|230|(1:232)|238|239|(1:235)|237|47|(0)|50|(0)(0)|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|22|(0)|25|26|27|(0)|265|31|32|(0)|34|35|(0)|38|(0)|41|(0)|230|(0)|238|239|(0)|237|47|(0)|50|(0)(0)|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129) */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01a5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01a6, code lost:
    
        r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x00e3, code lost:
    
        if (r10 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x00f6, code lost:
    
        if (r10 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x00ab, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x00ac, code lost:
    
        r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x032f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x031e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[Catch: NameNotFoundException -> 0x00ab, TRY_LEAVE, TryCatch #12 {NameNotFoundException -> 0x00ab, blocks: (B:27:0x009f, B:29:0x00a5), top: B:26:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03e5  */
    /* JADX WARN: Type inference failed for: r0v101, types: [int] */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v173 */
    /* JADX WARN: Type inference failed for: r0v174 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean CatchingFishPayPalLiveData() {
        CatchingFishKtorCoroutine catchingFishKtorCoroutine;
        FirebaseMessagingService firebaseMessagingService;
        CatchingFishViewPagerMockk catchingFishViewPagerMockk;
        Bundle bundle;
        NotificationChannel notificationChannel;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        String packageName;
        PackageManager packageManager;
        String CatchingFishEspressoTesting;
        String CatchingFishEspressoTesting2;
        String CatchingFishOkHttp;
        int i;
        String CatchingFishOkHttp2;
        Uri defaultUri;
        String CatchingFishOkHttp3;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String CatchingFishOkHttp4;
        Integer valueOf;
        boolean CatchingFishViewModelFAB2;
        String CatchingFishOkHttp5;
        Integer CatchingFishFragmentHandler2;
        Integer CatchingFishFragmentHandler3;
        Integer CatchingFishFragmentHandler4;
        String CatchingFishOkHttp6;
        Long valueOf2;
        JSONArray CatchingFishCloudMessaging;
        long[] jArr;
        JSONArray CatchingFishCloudMessaging2;
        int[] iArr;
        ?? r0;
        String CatchingFishOkHttp7;
        IconCompat iconCompat;
        boolean z;
        int i2;
        ApplicationInfo applicationInfo;
        if (((CatchingFishViewPagerMockk) this.CatchingFishViewModelScope).CatchingFishViewModelFAB("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.CatchingFishWorkManager;
        if (!((KeyguardManager) firebaseMessagingService2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String CatchingFishOkHttp8 = ((CatchingFishViewPagerMockk) this.CatchingFishViewModelScope).CatchingFishOkHttp("gcm.n.image");
        if (!TextUtils.isEmpty(CatchingFishOkHttp8)) {
            try {
                catchingFishKtorCoroutine = new CatchingFishKtorCoroutine(new URL(CatchingFishOkHttp8));
            } catch (MalformedURLException unused) {
            }
            if (catchingFishKtorCoroutine != null) {
                ExecutorService executorService = (ExecutorService) this.CatchingFishDaggerWebsocket;
                CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = new CatchingFishAndroidXPayPal();
                catchingFishKtorCoroutine.CatchingFishDaggerWebsocket = executorService.submit(new CatchingFishEspressoFlux(11, catchingFishKtorCoroutine, catchingFishAndroidXPayPal));
                catchingFishKtorCoroutine.CatchingFishWorkManager = catchingFishAndroidXPayPal.CatchingFishParcelableFAB;
            }
            firebaseMessagingService = (FirebaseMessagingService) this.CatchingFishWorkManager;
            catchingFishViewPagerMockk = (CatchingFishViewPagerMockk) this.CatchingFishViewModelScope;
            AtomicInteger atomicInteger = CatchingFishIntentLayout.CatchingFishParcelableFAB;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String CatchingFishOkHttp9 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.android_channel_id");
            if (Build.VERSION.SDK_INT >= 26) {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(CatchingFishOkHttp9)) {
                        notificationChannel3 = notificationManager.getNotificationChannel(CatchingFishOkHttp9);
                    }
                    CatchingFishOkHttp9 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(CatchingFishOkHttp9)) {
                        notificationChannel2 = notificationManager.getNotificationChannel(CatchingFishOkHttp9);
                    }
                    notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
                    if (notificationChannel == null) {
                        int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                        notificationManager.createNotificationChannel(CatchingFishLifecycleJUnit.CatchingFishReduxKtor(identifier == 0 ? "Misc" : firebaseMessagingService.getString(identifier)));
                    }
                    CatchingFishOkHttp9 = "fcm_fallback_notification_channel";
                    AtomicInteger atomicInteger2 = CatchingFishIntentLayout.CatchingFishParcelableFAB;
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    CatchingFishPicassoLayout catchingFishPicassoLayout = new CatchingFishPicassoLayout(firebaseMessagingService, CatchingFishOkHttp9);
                    CatchingFishEspressoTesting = catchingFishViewPagerMockk.CatchingFishEspressoTesting(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(CatchingFishEspressoTesting)) {
                        catchingFishPicassoLayout.CatchingFishDaggerWebsocket = CatchingFishPicassoLayout.CatchingFishSnackbar(CatchingFishEspressoTesting);
                    }
                    CatchingFishEspressoTesting2 = catchingFishViewPagerMockk.CatchingFishEspressoTesting(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(CatchingFishEspressoTesting2)) {
                        catchingFishPicassoLayout.CatchingFishWorkManager = CatchingFishPicassoLayout.CatchingFishSnackbar(CatchingFishEspressoTesting2);
                        CatchingFishGraphQLRoom catchingFishGraphQLRoom = new CatchingFishGraphQLRoom();
                        catchingFishGraphQLRoom.CatchingFishSnackbar = CatchingFishPicassoLayout.CatchingFishSnackbar(CatchingFishEspressoTesting2);
                        catchingFishPicassoLayout.CatchingFishReduxKtor(catchingFishGraphQLRoom);
                    }
                    CatchingFishOkHttp = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.icon");
                    if (!TextUtils.isEmpty(CatchingFishOkHttp) || (((i = resources.getIdentifier(CatchingFishOkHttp, "drawable", packageName)) == 0 || !CatchingFishIntentLayout.CatchingFishParcelableFAB(resources, i)) && ((i = resources.getIdentifier(CatchingFishOkHttp, "mipmap", packageName)) == 0 || !CatchingFishIntentLayout.CatchingFishParcelableFAB(resources, i)))) {
                        i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i != 0 || !CatchingFishIntentLayout.CatchingFishParcelableFAB(resources, i)) {
                            i = packageManager.getApplicationInfo(packageName, 0).icon;
                        }
                        if (i != 0 || !CatchingFishIntentLayout.CatchingFishParcelableFAB(resources, i)) {
                            i = 17301651;
                        }
                    }
                    catchingFishPicassoLayout.CatchingFish.icon = i;
                    CatchingFishOkHttp2 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.sound2");
                    if (TextUtils.isEmpty(CatchingFishOkHttp2)) {
                        CatchingFishOkHttp2 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.sound");
                    }
                    if (TextUtils.isEmpty(CatchingFishOkHttp2)) {
                        defaultUri = null;
                    } else if ("default".equals(CatchingFishOkHttp2) || resources.getIdentifier(CatchingFishOkHttp2, "raw", packageName) == 0) {
                        defaultUri = RingtoneManager.getDefaultUri(2);
                    } else {
                        defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + CatchingFishOkHttp2);
                    }
                    if (defaultUri != null) {
                        Notification notification = catchingFishPicassoLayout.CatchingFish;
                        notification.sound = defaultUri;
                        notification.audioStreamType = -1;
                        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
                    }
                    CatchingFishOkHttp3 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.click_action");
                    if (TextUtils.isEmpty(CatchingFishOkHttp3)) {
                        String CatchingFishOkHttp10 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.link_android");
                        if (TextUtils.isEmpty(CatchingFishOkHttp10)) {
                            CatchingFishOkHttp10 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.link");
                        }
                        Uri parse = !TextUtils.isEmpty(CatchingFishOkHttp10) ? Uri.parse(CatchingFishOkHttp10) : null;
                        if (parse != null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setData(parse);
                        } else {
                            launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                        }
                    } else {
                        launchIntentForPackage = new Intent(CatchingFishOkHttp3);
                        launchIntentForPackage.setPackage(packageName);
                        launchIntentForPackage.setFlags(268435456);
                    }
                    if (launchIntentForPackage == null) {
                        activity = null;
                    } else {
                        launchIntentForPackage.addFlags(67108864);
                        Bundle bundle3 = (Bundle) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket;
                        Bundle bundle4 = new Bundle(bundle3);
                        for (String str : bundle3.keySet()) {
                            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                bundle4.remove(str);
                            }
                        }
                        launchIntentForPackage.putExtras(bundle4);
                        if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("google.c.a.e")) {
                            launchIntentForPackage.putExtra("gcm.n.analytics_data", catchingFishViewPagerMockk.CatchingFishNavigation());
                        }
                        activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                    }
                    catchingFishPicassoLayout.CatchingFishViewModelScope = activity;
                    broadcast = !catchingFishViewPagerMockk.CatchingFishViewModelFAB("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(catchingFishViewPagerMockk.CatchingFishNavigation())), 1140850688);
                    if (broadcast != null) {
                        catchingFishPicassoLayout.CatchingFish.deleteIntent = broadcast;
                    }
                    CatchingFishOkHttp4 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.color");
                    if (!TextUtils.isEmpty(CatchingFishOkHttp4)) {
                        try {
                            valueOf = Integer.valueOf(Color.parseColor(CatchingFishOkHttp4));
                        } catch (IllegalArgumentException unused2) {
                        }
                        if (valueOf != null) {
                            catchingFishPicassoLayout.CatchingFishAnimationMockk = valueOf.intValue();
                        }
                        CatchingFishViewModelFAB2 = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.sticky");
                        Notification notification2 = catchingFishPicassoLayout.CatchingFish;
                        if (CatchingFishViewModelFAB2) {
                            notification2.flags &= -17;
                        } else {
                            notification2.flags |= 16;
                        }
                        catchingFishPicassoLayout.CatchingFishOkHttp = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.local_only");
                        CatchingFishOkHttp5 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.ticker");
                        if (CatchingFishOkHttp5 != null) {
                            catchingFishPicassoLayout.CatchingFish.tickerText = CatchingFishPicassoLayout.CatchingFishSnackbar(CatchingFishOkHttp5);
                        }
                        CatchingFishFragmentHandler2 = catchingFishViewPagerMockk.CatchingFishFragmentHandler("gcm.n.notification_priority");
                        if (CatchingFishFragmentHandler2 != null || CatchingFishFragmentHandler2.intValue() < -2 || CatchingFishFragmentHandler2.intValue() > 2) {
                            CatchingFishFragmentHandler2 = null;
                        }
                        if (CatchingFishFragmentHandler2 != null) {
                            catchingFishPicassoLayout.CatchingFishFragmentHandler = CatchingFishFragmentHandler2.intValue();
                        }
                        CatchingFishFragmentHandler3 = catchingFishViewPagerMockk.CatchingFishFragmentHandler("gcm.n.visibility");
                        if (CatchingFishFragmentHandler3 != null || CatchingFishFragmentHandler3.intValue() < -1 || CatchingFishFragmentHandler3.intValue() > 1) {
                            CatchingFishFragmentHandler3 = null;
                        }
                        if (CatchingFishFragmentHandler3 != null) {
                            catchingFishPicassoLayout.CatchingFishStateLiveData = CatchingFishFragmentHandler3.intValue();
                        }
                        CatchingFishFragmentHandler4 = catchingFishViewPagerMockk.CatchingFishFragmentHandler("gcm.n.notification_count");
                        if (CatchingFishFragmentHandler4 != null || CatchingFishFragmentHandler4.intValue() < 0) {
                            CatchingFishFragmentHandler4 = null;
                        }
                        if (CatchingFishFragmentHandler4 != null) {
                            catchingFishPicassoLayout.CatchingFishLayout = CatchingFishFragmentHandler4.intValue();
                        }
                        CatchingFishOkHttp6 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.event_time");
                        if (!TextUtils.isEmpty(CatchingFishOkHttp6)) {
                            try {
                                valueOf2 = Long.valueOf(Long.parseLong(CatchingFishOkHttp6));
                            } catch (NumberFormatException unused3) {
                                CatchingFishViewPagerMockk.CatchingFishGsonAppCompat("gcm.n.event_time");
                            }
                            if (valueOf2 != null) {
                                catchingFishPicassoLayout.CatchingFishCloudMessaging = true;
                                catchingFishPicassoLayout.CatchingFish.when = valueOf2.longValue();
                            }
                            CatchingFishCloudMessaging = catchingFishViewPagerMockk.CatchingFishCloudMessaging("gcm.n.vibrate_timings");
                            if (CatchingFishCloudMessaging != null) {
                                try {
                                } catch (NumberFormatException | JSONException unused4) {
                                    CatchingFishCloudMessaging.toString();
                                }
                                if (CatchingFishCloudMessaging.length() <= 1) {
                                    throw new JSONException("vibrateTimings have invalid length");
                                }
                                int length = CatchingFishCloudMessaging.length();
                                jArr = new long[length];
                                for (int i3 = 0; i3 < length; i3++) {
                                    jArr[i3] = CatchingFishCloudMessaging.optLong(i3);
                                }
                                if (jArr != null) {
                                    catchingFishPicassoLayout.CatchingFish.vibrate = jArr;
                                }
                                CatchingFishCloudMessaging2 = catchingFishViewPagerMockk.CatchingFishCloudMessaging("gcm.n.light_settings");
                                if (CatchingFishCloudMessaging2 != null) {
                                    iArr = new int[3];
                                    try {
                                    } catch (IllegalArgumentException e) {
                                        CatchingFishCloudMessaging2.toString();
                                        e.getMessage();
                                    } catch (JSONException unused5) {
                                        CatchingFishCloudMessaging2.toString();
                                    }
                                    if (CatchingFishCloudMessaging2.length() != 3) {
                                        throw new JSONException("lightSettings don't have all three fields");
                                    }
                                    int parseColor = Color.parseColor(CatchingFishCloudMessaging2.optString(0));
                                    if (parseColor == -16777216) {
                                        throw new IllegalArgumentException("Transparent color is invalid");
                                    }
                                    iArr[0] = parseColor;
                                    iArr[1] = CatchingFishCloudMessaging2.optInt(1);
                                    iArr[2] = CatchingFishCloudMessaging2.optInt(2);
                                    if (iArr != null) {
                                        int i4 = iArr[0];
                                        int i5 = iArr[1];
                                        int i6 = iArr[2];
                                        Notification notification3 = catchingFishPicassoLayout.CatchingFish;
                                        notification3.ledARGB = i4;
                                        notification3.ledOnMS = i5;
                                        notification3.ledOffMS = i6;
                                        notification3.flags = ((i5 == 0 || i6 == 0) ? 0 : 1) | ((-2) & notification3.flags);
                                    }
                                    boolean CatchingFishViewModelFAB3 = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_sound");
                                    boolean z2 = CatchingFishViewModelFAB3;
                                    if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_vibrate_timings")) {
                                        z2 = (CatchingFishViewModelFAB3 ? 1 : 0) | 2;
                                    }
                                    r0 = z2;
                                    if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_light_settings")) {
                                        r0 = (z2 ? 1 : 0) | 4;
                                    }
                                    Notification notification4 = catchingFishPicassoLayout.CatchingFish;
                                    notification4.defaults = r0;
                                    if ((r0 & 4) != 0) {
                                        notification4.flags |= 1;
                                    }
                                    CatchingFishOkHttp7 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.tag");
                                    if (TextUtils.isEmpty(CatchingFishOkHttp7)) {
                                        CatchingFishOkHttp7 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                    }
                                    String str2 = CatchingFishOkHttp7;
                                    if (catchingFishKtorCoroutine != null) {
                                        try {
                                            CatchingFishWorkManagerMVP catchingFishWorkManagerMVP = catchingFishKtorCoroutine.CatchingFishWorkManager;
                                            CatchingFishToastHiltBundle.CatchingFishAnimationMockk(catchingFishWorkManagerMVP);
                                            TimeUnit timeUnit = TimeUnit.SECONDS;
                                            Bitmap bitmap = (Bitmap) CatchingFishViewMVIMVVM.CatchingFishCoroutine(catchingFishWorkManagerMVP, 5L);
                                            catchingFishPicassoLayout.CatchingFishCoroutine(bitmap);
                                            CatchingFishWidgetFlux catchingFishWidgetFlux = new CatchingFishWidgetFlux();
                                            if (bitmap == null) {
                                                iconCompat = null;
                                                z = true;
                                            } else {
                                                z = true;
                                                iconCompat = new IconCompat(1);
                                                iconCompat.CatchingFishSnackbar = bitmap;
                                            }
                                            catchingFishWidgetFlux.CatchingFishSnackbar = iconCompat;
                                            catchingFishWidgetFlux.CatchingFishCoroutine = null;
                                            catchingFishWidgetFlux.CatchingFishReduxKtor = z;
                                            catchingFishPicassoLayout.CatchingFishReduxKtor(catchingFishWidgetFlux);
                                        } catch (InterruptedException unused6) {
                                            catchingFishKtorCoroutine.close();
                                            Thread.currentThread().interrupt();
                                        } catch (ExecutionException e2) {
                                            Objects.toString(e2.getCause());
                                        } catch (TimeoutException unused7) {
                                            catchingFishKtorCoroutine.close();
                                        }
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.CatchingFishWorkManager).getSystemService("notification")).notify(str2, 0, catchingFishPicassoLayout.CatchingFishParcelableFAB());
                                    return true;
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean CatchingFishViewModelFAB32 = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_sound");
                                boolean z22 = CatchingFishViewModelFAB32;
                                if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_vibrate_timings")) {
                                }
                                r0 = z22;
                                if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_light_settings")) {
                                }
                                Notification notification42 = catchingFishPicassoLayout.CatchingFish;
                                notification42.defaults = r0;
                                if ((r0 & 4) != 0) {
                                }
                                CatchingFishOkHttp7 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.tag");
                                if (TextUtils.isEmpty(CatchingFishOkHttp7)) {
                                }
                                String str22 = CatchingFishOkHttp7;
                                if (catchingFishKtorCoroutine != null) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.CatchingFishWorkManager).getSystemService("notification")).notify(str22, 0, catchingFishPicassoLayout.CatchingFishParcelableFAB());
                                return true;
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            CatchingFishCloudMessaging2 = catchingFishViewPagerMockk.CatchingFishCloudMessaging("gcm.n.light_settings");
                            if (CatchingFishCloudMessaging2 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean CatchingFishViewModelFAB322 = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_sound");
                            boolean z222 = CatchingFishViewModelFAB322;
                            if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_vibrate_timings")) {
                            }
                            r0 = z222;
                            if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_light_settings")) {
                            }
                            Notification notification422 = catchingFishPicassoLayout.CatchingFish;
                            notification422.defaults = r0;
                            if ((r0 & 4) != 0) {
                            }
                            CatchingFishOkHttp7 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.tag");
                            if (TextUtils.isEmpty(CatchingFishOkHttp7)) {
                            }
                            String str222 = CatchingFishOkHttp7;
                            if (catchingFishKtorCoroutine != null) {
                            }
                            ((NotificationManager) ((FirebaseMessagingService) this.CatchingFishWorkManager).getSystemService("notification")).notify(str222, 0, catchingFishPicassoLayout.CatchingFishParcelableFAB());
                            return true;
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        CatchingFishCloudMessaging = catchingFishViewPagerMockk.CatchingFishCloudMessaging("gcm.n.vibrate_timings");
                        if (CatchingFishCloudMessaging != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        CatchingFishCloudMessaging2 = catchingFishViewPagerMockk.CatchingFishCloudMessaging("gcm.n.light_settings");
                        if (CatchingFishCloudMessaging2 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean CatchingFishViewModelFAB3222 = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_sound");
                        boolean z2222 = CatchingFishViewModelFAB3222;
                        if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_vibrate_timings")) {
                        }
                        r0 = z2222;
                        if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_light_settings")) {
                        }
                        Notification notification4222 = catchingFishPicassoLayout.CatchingFish;
                        notification4222.defaults = r0;
                        if ((r0 & 4) != 0) {
                        }
                        CatchingFishOkHttp7 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.tag");
                        if (TextUtils.isEmpty(CatchingFishOkHttp7)) {
                        }
                        String str2222 = CatchingFishOkHttp7;
                        if (catchingFishKtorCoroutine != null) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.CatchingFishWorkManager).getSystemService("notification")).notify(str2222, 0, catchingFishPicassoLayout.CatchingFishParcelableFAB());
                        return true;
                    }
                    i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i2 != 0) {
                        try {
                            valueOf = Integer.valueOf(firebaseMessagingService.getColor(i2));
                        } catch (Resources.NotFoundException unused8) {
                        }
                        if (valueOf != null) {
                        }
                        CatchingFishViewModelFAB2 = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.sticky");
                        Notification notification22 = catchingFishPicassoLayout.CatchingFish;
                        if (CatchingFishViewModelFAB2) {
                        }
                        catchingFishPicassoLayout.CatchingFishOkHttp = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.local_only");
                        CatchingFishOkHttp5 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.ticker");
                        if (CatchingFishOkHttp5 != null) {
                        }
                        CatchingFishFragmentHandler2 = catchingFishViewPagerMockk.CatchingFishFragmentHandler("gcm.n.notification_priority");
                        if (CatchingFishFragmentHandler2 != null) {
                        }
                        CatchingFishFragmentHandler2 = null;
                        if (CatchingFishFragmentHandler2 != null) {
                        }
                        CatchingFishFragmentHandler3 = catchingFishViewPagerMockk.CatchingFishFragmentHandler("gcm.n.visibility");
                        if (CatchingFishFragmentHandler3 != null) {
                        }
                        CatchingFishFragmentHandler3 = null;
                        if (CatchingFishFragmentHandler3 != null) {
                        }
                        CatchingFishFragmentHandler4 = catchingFishViewPagerMockk.CatchingFishFragmentHandler("gcm.n.notification_count");
                        if (CatchingFishFragmentHandler4 != null) {
                        }
                        CatchingFishFragmentHandler4 = null;
                        if (CatchingFishFragmentHandler4 != null) {
                        }
                        CatchingFishOkHttp6 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.event_time");
                        if (!TextUtils.isEmpty(CatchingFishOkHttp6)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        CatchingFishCloudMessaging = catchingFishViewPagerMockk.CatchingFishCloudMessaging("gcm.n.vibrate_timings");
                        if (CatchingFishCloudMessaging != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        CatchingFishCloudMessaging2 = catchingFishViewPagerMockk.CatchingFishCloudMessaging("gcm.n.light_settings");
                        if (CatchingFishCloudMessaging2 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean CatchingFishViewModelFAB32222 = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_sound");
                        boolean z22222 = CatchingFishViewModelFAB32222;
                        if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_vibrate_timings")) {
                        }
                        r0 = z22222;
                        if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_light_settings")) {
                        }
                        Notification notification42222 = catchingFishPicassoLayout.CatchingFish;
                        notification42222.defaults = r0;
                        if ((r0 & 4) != 0) {
                        }
                        CatchingFishOkHttp7 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.tag");
                        if (TextUtils.isEmpty(CatchingFishOkHttp7)) {
                        }
                        String str22222 = CatchingFishOkHttp7;
                        if (catchingFishKtorCoroutine != null) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.CatchingFishWorkManager).getSystemService("notification")).notify(str22222, 0, catchingFishPicassoLayout.CatchingFishParcelableFAB());
                        return true;
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    CatchingFishViewModelFAB2 = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.sticky");
                    Notification notification222 = catchingFishPicassoLayout.CatchingFish;
                    if (CatchingFishViewModelFAB2) {
                    }
                    catchingFishPicassoLayout.CatchingFishOkHttp = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.local_only");
                    CatchingFishOkHttp5 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.ticker");
                    if (CatchingFishOkHttp5 != null) {
                    }
                    CatchingFishFragmentHandler2 = catchingFishViewPagerMockk.CatchingFishFragmentHandler("gcm.n.notification_priority");
                    if (CatchingFishFragmentHandler2 != null) {
                    }
                    CatchingFishFragmentHandler2 = null;
                    if (CatchingFishFragmentHandler2 != null) {
                    }
                    CatchingFishFragmentHandler3 = catchingFishViewPagerMockk.CatchingFishFragmentHandler("gcm.n.visibility");
                    if (CatchingFishFragmentHandler3 != null) {
                    }
                    CatchingFishFragmentHandler3 = null;
                    if (CatchingFishFragmentHandler3 != null) {
                    }
                    CatchingFishFragmentHandler4 = catchingFishViewPagerMockk.CatchingFishFragmentHandler("gcm.n.notification_count");
                    if (CatchingFishFragmentHandler4 != null) {
                    }
                    CatchingFishFragmentHandler4 = null;
                    if (CatchingFishFragmentHandler4 != null) {
                    }
                    CatchingFishOkHttp6 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.event_time");
                    if (!TextUtils.isEmpty(CatchingFishOkHttp6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    CatchingFishCloudMessaging = catchingFishViewPagerMockk.CatchingFishCloudMessaging("gcm.n.vibrate_timings");
                    if (CatchingFishCloudMessaging != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    CatchingFishCloudMessaging2 = catchingFishViewPagerMockk.CatchingFishCloudMessaging("gcm.n.light_settings");
                    if (CatchingFishCloudMessaging2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean CatchingFishViewModelFAB322222 = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_sound");
                    boolean z222222 = CatchingFishViewModelFAB322222;
                    if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z222222;
                    if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_light_settings")) {
                    }
                    Notification notification422222 = catchingFishPicassoLayout.CatchingFish;
                    notification422222.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    CatchingFishOkHttp7 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.tag");
                    if (TextUtils.isEmpty(CatchingFishOkHttp7)) {
                    }
                    String str222222 = CatchingFishOkHttp7;
                    if (catchingFishKtorCoroutine != null) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.CatchingFishWorkManager).getSystemService("notification")).notify(str222222, 0, catchingFishPicassoLayout.CatchingFishParcelableFAB());
                    return true;
                }
            }
            CatchingFishOkHttp9 = null;
            AtomicInteger atomicInteger22 = CatchingFishIntentLayout.CatchingFishParcelableFAB;
            packageName = firebaseMessagingService.getPackageName();
            Resources resources2 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            CatchingFishPicassoLayout catchingFishPicassoLayout2 = new CatchingFishPicassoLayout(firebaseMessagingService, CatchingFishOkHttp9);
            CatchingFishEspressoTesting = catchingFishViewPagerMockk.CatchingFishEspressoTesting(resources2, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(CatchingFishEspressoTesting)) {
            }
            CatchingFishEspressoTesting2 = catchingFishViewPagerMockk.CatchingFishEspressoTesting(resources2, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(CatchingFishEspressoTesting2)) {
            }
            CatchingFishOkHttp = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.icon");
            if (!TextUtils.isEmpty(CatchingFishOkHttp)) {
            }
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i != 0) {
            }
            i = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i != 0) {
            }
            i = 17301651;
            catchingFishPicassoLayout2.CatchingFish.icon = i;
            CatchingFishOkHttp2 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.sound2");
            if (TextUtils.isEmpty(CatchingFishOkHttp2)) {
            }
            if (TextUtils.isEmpty(CatchingFishOkHttp2)) {
            }
            if (defaultUri != null) {
            }
            CatchingFishOkHttp3 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.click_action");
            if (TextUtils.isEmpty(CatchingFishOkHttp3)) {
            }
            if (launchIntentForPackage == null) {
            }
            catchingFishPicassoLayout2.CatchingFishViewModelScope = activity;
            if (!catchingFishViewPagerMockk.CatchingFishViewModelFAB("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            CatchingFishOkHttp4 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.color");
            if (!TextUtils.isEmpty(CatchingFishOkHttp4)) {
            }
            i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i2 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            CatchingFishViewModelFAB2 = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.sticky");
            Notification notification2222 = catchingFishPicassoLayout2.CatchingFish;
            if (CatchingFishViewModelFAB2) {
            }
            catchingFishPicassoLayout2.CatchingFishOkHttp = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.local_only");
            CatchingFishOkHttp5 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.ticker");
            if (CatchingFishOkHttp5 != null) {
            }
            CatchingFishFragmentHandler2 = catchingFishViewPagerMockk.CatchingFishFragmentHandler("gcm.n.notification_priority");
            if (CatchingFishFragmentHandler2 != null) {
            }
            CatchingFishFragmentHandler2 = null;
            if (CatchingFishFragmentHandler2 != null) {
            }
            CatchingFishFragmentHandler3 = catchingFishViewPagerMockk.CatchingFishFragmentHandler("gcm.n.visibility");
            if (CatchingFishFragmentHandler3 != null) {
            }
            CatchingFishFragmentHandler3 = null;
            if (CatchingFishFragmentHandler3 != null) {
            }
            CatchingFishFragmentHandler4 = catchingFishViewPagerMockk.CatchingFishFragmentHandler("gcm.n.notification_count");
            if (CatchingFishFragmentHandler4 != null) {
            }
            CatchingFishFragmentHandler4 = null;
            if (CatchingFishFragmentHandler4 != null) {
            }
            CatchingFishOkHttp6 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.event_time");
            if (!TextUtils.isEmpty(CatchingFishOkHttp6)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            CatchingFishCloudMessaging = catchingFishViewPagerMockk.CatchingFishCloudMessaging("gcm.n.vibrate_timings");
            if (CatchingFishCloudMessaging != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            CatchingFishCloudMessaging2 = catchingFishViewPagerMockk.CatchingFishCloudMessaging("gcm.n.light_settings");
            if (CatchingFishCloudMessaging2 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean CatchingFishViewModelFAB3222222 = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_sound");
            boolean z2222222 = CatchingFishViewModelFAB3222222;
            if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_vibrate_timings")) {
            }
            r0 = z2222222;
            if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_light_settings")) {
            }
            Notification notification4222222 = catchingFishPicassoLayout2.CatchingFish;
            notification4222222.defaults = r0;
            if ((r0 & 4) != 0) {
            }
            CatchingFishOkHttp7 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.tag");
            if (TextUtils.isEmpty(CatchingFishOkHttp7)) {
            }
            String str2222222 = CatchingFishOkHttp7;
            if (catchingFishKtorCoroutine != null) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.CatchingFishWorkManager).getSystemService("notification")).notify(str2222222, 0, catchingFishPicassoLayout2.CatchingFishParcelableFAB());
            return true;
        }
        catchingFishKtorCoroutine = null;
        if (catchingFishKtorCoroutine != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.CatchingFishWorkManager;
        catchingFishViewPagerMockk = (CatchingFishViewPagerMockk) this.CatchingFishViewModelScope;
        AtomicInteger atomicInteger3 = CatchingFishIntentLayout.CatchingFishParcelableFAB;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String CatchingFishOkHttp92 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT >= 26) {
        }
        CatchingFishOkHttp92 = null;
        AtomicInteger atomicInteger222 = CatchingFishIntentLayout.CatchingFishParcelableFAB;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources22 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        CatchingFishPicassoLayout catchingFishPicassoLayout22 = new CatchingFishPicassoLayout(firebaseMessagingService, CatchingFishOkHttp92);
        CatchingFishEspressoTesting = catchingFishViewPagerMockk.CatchingFishEspressoTesting(resources22, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(CatchingFishEspressoTesting)) {
        }
        CatchingFishEspressoTesting2 = catchingFishViewPagerMockk.CatchingFishEspressoTesting(resources22, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(CatchingFishEspressoTesting2)) {
        }
        CatchingFishOkHttp = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.icon");
        if (!TextUtils.isEmpty(CatchingFishOkHttp)) {
        }
        i = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i != 0) {
        }
        i = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i != 0) {
        }
        i = 17301651;
        catchingFishPicassoLayout22.CatchingFish.icon = i;
        CatchingFishOkHttp2 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.sound2");
        if (TextUtils.isEmpty(CatchingFishOkHttp2)) {
        }
        if (TextUtils.isEmpty(CatchingFishOkHttp2)) {
        }
        if (defaultUri != null) {
        }
        CatchingFishOkHttp3 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.click_action");
        if (TextUtils.isEmpty(CatchingFishOkHttp3)) {
        }
        if (launchIntentForPackage == null) {
        }
        catchingFishPicassoLayout22.CatchingFishViewModelScope = activity;
        if (!catchingFishViewPagerMockk.CatchingFishViewModelFAB("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        CatchingFishOkHttp4 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.color");
        if (!TextUtils.isEmpty(CatchingFishOkHttp4)) {
        }
        i2 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i2 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        CatchingFishViewModelFAB2 = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.sticky");
        Notification notification22222 = catchingFishPicassoLayout22.CatchingFish;
        if (CatchingFishViewModelFAB2) {
        }
        catchingFishPicassoLayout22.CatchingFishOkHttp = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.local_only");
        CatchingFishOkHttp5 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.ticker");
        if (CatchingFishOkHttp5 != null) {
        }
        CatchingFishFragmentHandler2 = catchingFishViewPagerMockk.CatchingFishFragmentHandler("gcm.n.notification_priority");
        if (CatchingFishFragmentHandler2 != null) {
        }
        CatchingFishFragmentHandler2 = null;
        if (CatchingFishFragmentHandler2 != null) {
        }
        CatchingFishFragmentHandler3 = catchingFishViewPagerMockk.CatchingFishFragmentHandler("gcm.n.visibility");
        if (CatchingFishFragmentHandler3 != null) {
        }
        CatchingFishFragmentHandler3 = null;
        if (CatchingFishFragmentHandler3 != null) {
        }
        CatchingFishFragmentHandler4 = catchingFishViewPagerMockk.CatchingFishFragmentHandler("gcm.n.notification_count");
        if (CatchingFishFragmentHandler4 != null) {
        }
        CatchingFishFragmentHandler4 = null;
        if (CatchingFishFragmentHandler4 != null) {
        }
        CatchingFishOkHttp6 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.event_time");
        if (!TextUtils.isEmpty(CatchingFishOkHttp6)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        CatchingFishCloudMessaging = catchingFishViewPagerMockk.CatchingFishCloudMessaging("gcm.n.vibrate_timings");
        if (CatchingFishCloudMessaging != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        CatchingFishCloudMessaging2 = catchingFishViewPagerMockk.CatchingFishCloudMessaging("gcm.n.light_settings");
        if (CatchingFishCloudMessaging2 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean CatchingFishViewModelFAB32222222 = catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_sound");
        boolean z22222222 = CatchingFishViewModelFAB32222222;
        if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_vibrate_timings")) {
        }
        r0 = z22222222;
        if (catchingFishViewPagerMockk.CatchingFishViewModelFAB("gcm.n.default_light_settings")) {
        }
        Notification notification42222222 = catchingFishPicassoLayout22.CatchingFish;
        notification42222222.defaults = r0;
        if ((r0 & 4) != 0) {
        }
        CatchingFishOkHttp7 = catchingFishViewPagerMockk.CatchingFishOkHttp("gcm.n.tag");
        if (TextUtils.isEmpty(CatchingFishOkHttp7)) {
        }
        String str22222222 = CatchingFishOkHttp7;
        if (catchingFishKtorCoroutine != null) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.CatchingFishWorkManager).getSystemService("notification")).notify(str22222222, 0, catchingFishPicassoLayout22.CatchingFishParcelableFAB());
        return true;
    }

    public Typeface CatchingFishPayPalService(int i, int i2, CatchingFishContextMockk catchingFishContextMockk) {
        int resourceId = ((TypedArray) this.CatchingFishDaggerWebsocket).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.CatchingFishWorkManager) == null) {
            this.CatchingFishWorkManager = new TypedValue();
        }
        Context context = (Context) this.CatchingFishViewModelScope;
        TypedValue typedValue = (TypedValue) this.CatchingFishWorkManager;
        ThreadLocal threadLocal = CatchingFishFABAsyncTask.CatchingFishParcelableFAB;
        if (context.isRestricted()) {
            return null;
        }
        return CatchingFishFABAsyncTask.CatchingFishParcelableFAB(context, resourceId, typedValue, i2, catchingFishContextMockk, true, false);
    }

    public void CatchingFishRedux(CatchingFishGradleMVPKtor catchingFishGradleMVPKtor) {
        ((CatchingFishEspressoMoshi) this.CatchingFishViewModelScope).CatchingFishReduxKtor.CatchingFishSnackbar = catchingFishGradleMVPKtor;
    }

    @Override // kotlin.text.CatchingFishSnackbarFAB
    public long CatchingFishReduxKtor(CatchingFishEspressoView catchingFishEspressoView, CatchingFishEspressoView catchingFishEspressoView2, CatchingFishEspressoView catchingFishEspressoView3) {
        Iterator it = CatchingFishOkHttpFAB.CatchingFishMoshiDaggerHilt(0, catchingFishEspressoView.CatchingFishSnackbar()).iterator();
        long j = 0;
        while (((CatchingFishGradleView) it).CatchingFishWorkManager) {
            int nextInt = ((CatchingFishGradleView) it).nextInt();
            CatchingFishCameraXRoom CatchingFishViewModelFAB2 = ((CatchingFishEspressoPayPal) this.CatchingFishDaggerWebsocket).CatchingFishViewModelFAB(nextInt);
            catchingFishEspressoView.CatchingFishParcelableFAB(nextInt);
            catchingFishEspressoView2.CatchingFishParcelableFAB(nextInt);
            catchingFishEspressoView3.CatchingFishParcelableFAB(nextInt);
            CatchingFishViewModelFAB2.getClass();
            j = Math.max(j, 1500 * 1000000);
        }
        return j;
    }

    public void CatchingFishReduxMoshi(CatchingFishGsonAppCompat catchingFishGsonAppCompat) {
        ArrayList arrayList = (ArrayList) this.CatchingFishDaggerWebsocket;
        arrayList.clear();
        int size = catchingFishGsonAppCompat.CatchingFishFABLayout.size();
        for (int i = 0; i < size; i++) {
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = (CatchingFishDaggerRetrofit) catchingFishGsonAppCompat.CatchingFishFABLayout.get(i);
            int[] iArr = catchingFishDaggerRetrofit.CatchingFishGlideWidgetKtor;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(catchingFishDaggerRetrofit);
            }
        }
        catchingFishGsonAppCompat.CatchingFishStateFlowIntent.CatchingFishSnackbar = true;
    }

    @Override // kotlin.text.CatchingFishFragmentFAB
    public void CatchingFishRoomDatabase(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        CatchingFishGlideAdMobMVI catchingFishGlideAdMobMVI = (CatchingFishGlideAdMobMVI) this.CatchingFishDaggerWebsocket;
        String str = (String) this.CatchingFishWorkManager;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.CatchingFishViewModelScope;
        synchronized (catchingFishGlideAdMobMVI.CatchingFishParcelableFAB) {
            catchingFishGlideAdMobMVI.CatchingFishParcelableFAB.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public void CatchingFishSnackbar(int i, Object obj) {
        ((CatchingFishBiometricRoom) this.CatchingFishViewModelScope).CatchingFishSpannableWidget(i, (CatchingFishBiometricRoom) obj);
    }

    public Object CatchingFishStateFlow(CatchingFishCoroutineIntent catchingFishCoroutineIntent, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        boolean equals = catchingFishCoroutineIntent.equals(CatchingFishViewModelMVVM.CatchingFishParcelableFAB);
        CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
        if (equals) {
            MainActivity mainActivity = (MainActivity) this.CatchingFishDaggerWebsocket;
            mainActivity.startActivity(new Intent(mainActivity, (Class<?>) MenuGameActivity.class));
            mainActivity.finish();
            return catchingFishRealmContext;
        }
        if (!(catchingFishCoroutineIntent instanceof CatchingFishExoPlayerGlide)) {
            throw new CatchingFishBiometricView();
        }
        Object CatchingFishDataStoreIntent = CatchingFishDataStoreIntent(((CatchingFishExoPlayerGlide) catchingFishCoroutineIntent).CatchingFishParcelableFAB, catchingFishStateFlowGson);
        return CatchingFishDataStoreIntent == CatchingFishXMLLayoutMockk.CatchingFishReduxKtor ? CatchingFishDataStoreIntent : catchingFishRealmContext;
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public void CatchingFishStateLiveData() {
        this.CatchingFishViewModelScope = ((ArrayList) this.CatchingFishWorkManager).remove(r0.size() - 1);
    }

    public void CatchingFishStripeAPI(Object obj) {
        long CatchingFishRoomDatabase = CatchingFishOkHttpFAB.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase == CatchingFishKtorMVIFAB.CatchingFishParcelableFAB) {
            this.CatchingFishViewModelScope = obj;
            return;
        }
        synchronized (this.CatchingFishWorkManager) {
            CatchingFishRoomGradleRoom catchingFishRoomGradleRoom = (CatchingFishRoomGradleRoom) ((AtomicReference) this.CatchingFishDaggerWebsocket).get();
            int CatchingFishParcelableFAB = catchingFishRoomGradleRoom.CatchingFishParcelableFAB(CatchingFishRoomDatabase);
            if (CatchingFishParcelableFAB < 0) {
                ((AtomicReference) this.CatchingFishDaggerWebsocket).set(catchingFishRoomGradleRoom.CatchingFishSnackbar(CatchingFishRoomDatabase, obj));
            } else {
                catchingFishRoomGradleRoom.CatchingFishCoroutine[CatchingFishParcelableFAB] = obj;
            }
        }
    }

    @Override // kotlin.text.CatchingFishFABFluxHilt
    public Uri CatchingFishUnitTesting() {
        return (Uri) this.CatchingFishViewModelScope;
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public void CatchingFishViewModelFAB(int i, int i2, int i3) {
        CatchingFishBiometricRoom catchingFishBiometricRoom = (CatchingFishBiometricRoom) this.CatchingFishViewModelScope;
        CatchingFishViewModelIntent catchingFishViewModelIntent = catchingFishBiometricRoom.CatchingFishEspressoTesting;
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            CatchingFishFABToast catchingFishFABToast = (CatchingFishFABToast) catchingFishViewModelIntent.CatchingFishDaggerWebsocket;
            CatchingFishViewPagerRedux catchingFishViewPagerRedux = (CatchingFishViewPagerRedux) catchingFishViewModelIntent.CatchingFishWorkManager;
            Object CatchingFishFragmentHandler2 = catchingFishFABToast.CatchingFishFragmentHandler(i5);
            catchingFishViewPagerRedux.CatchingFishParcelableFAB();
            ((CatchingFishFABToast) catchingFishViewModelIntent.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB(i6, (CatchingFishBiometricRoom) CatchingFishFragmentHandler2);
            catchingFishViewPagerRedux.CatchingFishParcelableFAB();
        }
        catchingFishBiometricRoom.CatchingFishSensorManager();
        catchingFishBiometricRoom.CatchingFishMVPRobolectric();
        catchingFishBiometricRoom.CatchingFishCardViewRealm();
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public /* bridge */ /* synthetic */ void CatchingFishViewModelScope(int i, Object obj) {
    }

    @Override // kotlin.text.CatchingFishFABFluxHilt
    public ClipDescription CatchingFishWorkManager() {
        return (ClipDescription) this.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishHandlerMVP
    public Object get() {
        switch (this.CatchingFishReduxKtor) {
            case 19:
                return new CatchingFishAppCompatLayout((Context) ((CatchingFishHandlerMVP) this.CatchingFishDaggerWebsocket).get(), (CatchingFishOkHttpFirebase) ((CatchingFishHandlerMVP) this.CatchingFishWorkManager).get(), (CatchingFishKtorAsyncTask) ((CatchingFishMoshiFluxMoshi) this.CatchingFishViewModelScope).get());
            case 20:
                long CatchingFishRoomDatabase = CatchingFishOkHttpFAB.CatchingFishRoomDatabase();
                if (CatchingFishRoomDatabase == CatchingFishKtorMVIFAB.CatchingFishParcelableFAB) {
                    return this.CatchingFishViewModelScope;
                }
                CatchingFishRoomGradleRoom catchingFishRoomGradleRoom = (CatchingFishRoomGradleRoom) ((AtomicReference) this.CatchingFishDaggerWebsocket).get();
                int CatchingFishParcelableFAB = catchingFishRoomGradleRoom.CatchingFishParcelableFAB(CatchingFishRoomDatabase);
                if (CatchingFishParcelableFAB >= 0) {
                    return catchingFishRoomGradleRoom.CatchingFishCoroutine[CatchingFishParcelableFAB];
                }
                return null;
            default:
                return new CatchingFishGlideDagger(new CatchingFishMoshiGson(), new CatchingFishExoPlayerMVP(), (CatchingFishToastHandler) ((CatchingFishSensorManager) this.CatchingFishDaggerWebsocket).get(), (CatchingFishGsonRetrofit) ((CatchingFishSpannableJUnit) this.CatchingFishWorkManager).get(), (CatchingFishMVIAppCompat) ((CatchingFishFluxFluxBundle) this.CatchingFishViewModelScope).get());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r3 == null) goto L10;
     */
    @Override // com.adjust.sdk.OnGoogleAdIdReadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onGoogleAdIdRead(String str) {
        CatchingFishKtorMockk catchingFishKtorMockk = (CatchingFishKtorMockk) this.CatchingFishDaggerWebsocket;
        if (catchingFishKtorMockk.CatchingFishParcelableFlux()) {
            if (str != null) {
                if (str.equals((String) ((CatchingFishBundleGlide) this.CatchingFishViewModelScope).CatchingFishWorkManager)) {
                    str = null;
                }
            }
            str = (String) this.CatchingFishWorkManager;
            catchingFishKtorMockk.CatchingFishViewModelFAB(str);
        }
    }

    public String toString() {
        switch (this.CatchingFishReduxKtor) {
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((CatchingFishGradleMockk) this.CatchingFishWorkManager).toString() + ", hidden list:" + ((ArrayList) this.CatchingFishViewModelScope).size();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ CatchingFishAsyncTaskDagger(Object obj, Object obj2, Object obj3, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = obj2;
        this.CatchingFishViewModelScope = obj3;
    }

    public CatchingFishAsyncTaskDagger(MainActivity mainActivity, CatchingFishBundleGlide catchingFishBundleGlide, CatchingFishEspressoPayPal catchingFishEspressoPayPal) {
        this.CatchingFishReduxKtor = 14;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishBundleGlide, "screenState");
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishEspressoPayPal, "rootWebViewAwaiter");
        this.CatchingFishDaggerWebsocket = mainActivity;
        this.CatchingFishWorkManager = catchingFishBundleGlide;
        this.CatchingFishViewModelScope = catchingFishEspressoPayPal;
    }

    public CatchingFishAsyncTaskDagger(CatchingFishBundleMVIHilt catchingFishBundleMVIHilt, CatchingFishBiometricIntent catchingFishBiometricIntent, CatchingFishLayoutLayout catchingFishLayoutLayout, CatchingFishGlideDagger catchingFishGlideDagger) {
        this.CatchingFishReduxKtor = 22;
        this.CatchingFishDaggerWebsocket = catchingFishBundleMVIHilt;
        this.CatchingFishWorkManager = catchingFishBiometricIntent;
        this.CatchingFishViewModelScope = catchingFishGlideDagger;
    }

    public CatchingFishAsyncTaskDagger(CatchingFishKtorPayPal catchingFishKtorPayPal) {
        this.CatchingFishReduxKtor = 7;
        this.CatchingFishDaggerWebsocket = catchingFishKtorPayPal;
        this.CatchingFishWorkManager = new CatchingFishGradleMockk();
        this.CatchingFishViewModelScope = new ArrayList();
    }

    public CatchingFishAsyncTaskDagger(FirebaseMessagingService firebaseMessagingService, CatchingFishViewPagerMockk catchingFishViewPagerMockk, ExecutorService executorService) {
        this.CatchingFishReduxKtor = 11;
        this.CatchingFishDaggerWebsocket = executorService;
        this.CatchingFishWorkManager = firebaseMessagingService;
        this.CatchingFishViewModelScope = catchingFishViewPagerMockk;
    }

    public CatchingFishAsyncTaskDagger(CatchingFishEspressoMoshi catchingFishEspressoMoshi) {
        this.CatchingFishReduxKtor = 5;
        this.CatchingFishViewModelScope = catchingFishEspressoMoshi;
        this.CatchingFishDaggerWebsocket = new CatchingFishServiceHilt(20, this);
    }

    public CatchingFishAsyncTaskDagger(Context context, TypedArray typedArray) {
        this.CatchingFishReduxKtor = 21;
        this.CatchingFishViewModelScope = context;
        this.CatchingFishDaggerWebsocket = typedArray;
    }

    public CatchingFishAsyncTaskDagger(Runnable runnable) {
        this.CatchingFishReduxKtor = 16;
        this.CatchingFishViewModelScope = new CopyOnWriteArrayList();
        this.CatchingFishDaggerWebsocket = new HashMap();
        this.CatchingFishWorkManager = runnable;
    }

    public CatchingFishAsyncTaskDagger(Context context, LocationManager locationManager) {
        this.CatchingFishReduxKtor = 24;
        this.CatchingFishWorkManager = new CatchingFishMockkMVP();
        this.CatchingFishViewModelScope = context;
        this.CatchingFishDaggerWebsocket = locationManager;
    }

    public CatchingFishAsyncTaskDagger(Context context) {
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishViewModelScope = context.getApplicationContext();
        this.CatchingFishWorkManager = new HashSet();
        this.CatchingFishDaggerWebsocket = new HashMap();
    }

    public CatchingFishAsyncTaskDagger(CatchingFishGsonAppCompat catchingFishGsonAppCompat) {
        this.CatchingFishReduxKtor = 3;
        this.CatchingFishDaggerWebsocket = new ArrayList();
        this.CatchingFishWorkManager = new CatchingFishGsonBiometric();
        this.CatchingFishViewModelScope = catchingFishGsonAppCompat;
    }

    public CatchingFishAsyncTaskDagger(int i) {
        this.CatchingFishReduxKtor = i;
        switch (i) {
            case 20:
                this.CatchingFishDaggerWebsocket = new AtomicReference(CatchingFishBiometricBundle.CatchingFishCloudMessaging);
                this.CatchingFishWorkManager = new Object();
                break;
            case 25:
                this.CatchingFishDaggerWebsocket = new WeakHashMap();
                this.CatchingFishWorkManager = new WeakHashMap();
                this.CatchingFishViewModelScope = new WeakHashMap();
                break;
            default:
                this.CatchingFishDaggerWebsocket = new CatchingFishViewPagerMockk(3);
                this.CatchingFishWorkManager = new CatchingFishViewPagerMockk(3);
                this.CatchingFishViewModelScope = new CatchingFishViewPagerMockk(3);
                break;
        }
    }

    @Override // kotlin.text.CatchingFishFABFluxHilt
    public void CatchingFishOkHttp() {
    }

    public CatchingFishAsyncTaskDagger(CatchingFishFluxFluxBundle catchingFishFluxFluxBundle, CatchingFishGradleMVVM catchingFishGradleMVVM, CatchingFishRoomDatabaseMVI catchingFishRoomDatabaseMVI, Set set) {
        this.CatchingFishReduxKtor = 12;
        this.CatchingFishDaggerWebsocket = catchingFishGradleMVVM;
        this.CatchingFishWorkManager = catchingFishFluxFluxBundle;
        this.CatchingFishViewModelScope = catchingFishRoomDatabaseMVI;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            CatchingFishJUnitRealm(str, 0, str.length(), 1, true, new CatchingFishFluxWorkManager(str, 0));
        }
    }

    public CatchingFishAsyncTaskDagger(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        this.CatchingFishReduxKtor = 26;
        this.CatchingFishDaggerWebsocket = catchingFishBiometricRoom;
        this.CatchingFishWorkManager = new ArrayList();
        this.CatchingFishViewModelScope = catchingFishBiometricRoom;
    }

    public CatchingFishAsyncTaskDagger(CatchingFishCameraXRoom catchingFishCameraXRoom) {
        this.CatchingFishReduxKtor = 27;
        this.CatchingFishDaggerWebsocket = new CatchingFishEspressoPayPal(12, catchingFishCameraXRoom);
    }
}
