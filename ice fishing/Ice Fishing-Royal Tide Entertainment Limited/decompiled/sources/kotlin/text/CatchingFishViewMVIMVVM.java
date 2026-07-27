package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class CatchingFishViewMVIMVVM implements CatchingFishContextRoomFAB {
    public static Class CatchingFishCoroutine;
    public static Field CatchingFishDaggerWebsocket;
    public static Field CatchingFishParcelableFAB;
    public static boolean CatchingFishReduxKtor;
    public static boolean CatchingFishSnackbar;
    public static boolean CatchingFishViewModelFAB;
    public static Field CatchingFishViewModelScope;
    public static boolean CatchingFishWorkManager;

    public static TypedArray CatchingFish(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final boolean CatchingFishAnimationMockk(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static void CatchingFishCardViewRealm(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int CatchingFishJobScheduler = CatchingFishJobScheduler(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }

    public static void CatchingFishCardViewView(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int CatchingFishJobScheduler = CatchingFishJobScheduler(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }

    public static final Object CatchingFishCloudMessaging(CatchingFishMVPMotionLayout catchingFishMVPMotionLayout, CatchingFishGraphQLLayout catchingFishGraphQLLayout) {
        Object CatchingFishViewModelScope2 = catchingFishMVPMotionLayout.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishGraphQLLayout);
        if (CatchingFishViewModelScope2 == null) {
            return null;
        }
        return CatchingFishViewModelScope2;
    }

    public static Object CatchingFishCoroutine(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP, long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        CatchingFishToastHiltBundle.CatchingFishUnitTesting("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(catchingFishWorkManagerMVP, "Task must not be null");
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(timeUnit, "TimeUnit must not be null");
        if (catchingFishWorkManagerMVP.CatchingFishViewModelScope()) {
            return CatchingFishCustomView(catchingFishWorkManagerMVP);
        }
        CatchingFishRealmFABMockk catchingFishRealmFABMockk = new CatchingFishRealmFABMockk();
        Executor executor = CatchingFishReduxMockk.CatchingFishSnackbar;
        catchingFishWorkManagerMVP.CatchingFishSnackbar(executor, catchingFishRealmFABMockk);
        CatchingFishEspressoContext catchingFishEspressoContext = new CatchingFishEspressoContext(executor, (CatchingFishRoomToolbar) catchingFishRealmFABMockk);
        CatchingFishGlideFAB catchingFishGlideFAB = catchingFishWorkManagerMVP.CatchingFishSnackbar;
        catchingFishGlideFAB.CatchingFishSnackbar(catchingFishEspressoContext);
        catchingFishWorkManagerMVP.CatchingFishUnitTesting();
        catchingFishGlideFAB.CatchingFishSnackbar(new CatchingFishEspressoContext(executor, (CatchingFishSpannableFAB) catchingFishRealmFABMockk));
        catchingFishWorkManagerMVP.CatchingFishUnitTesting();
        if (catchingFishRealmFABMockk.CatchingFishReduxKtor.await(j, timeUnit)) {
            return CatchingFishCustomView(catchingFishWorkManagerMVP);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static void CatchingFishCoroutineFlow(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            CatchingFishMoshiService.CatchingFishParcelableFAB(view, charSequence);
            return;
        }
        CatchingFishToolbarRealm catchingFishToolbarRealm = CatchingFishToolbarRealm.CatchingFishUnitTesting;
        if (catchingFishToolbarRealm != null && catchingFishToolbarRealm.CatchingFishReduxKtor == view) {
            CatchingFishToolbarRealm.CatchingFishSnackbar(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new CatchingFishToolbarRealm(view, charSequence);
            return;
        }
        CatchingFishToolbarRealm catchingFishToolbarRealm2 = CatchingFishToolbarRealm.CatchingFishAnimationMockk;
        if (catchingFishToolbarRealm2 != null && catchingFishToolbarRealm2.CatchingFishReduxKtor == view) {
            catchingFishToolbarRealm2.CatchingFishParcelableFAB();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static Object CatchingFishCustomView(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        if (catchingFishWorkManagerMVP.CatchingFishViewModelFAB()) {
            return catchingFishWorkManagerMVP.CatchingFishWorkManager();
        }
        if (catchingFishWorkManagerMVP.CatchingFishReduxKtor) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(catchingFishWorkManagerMVP.CatchingFishDaggerWebsocket());
    }

    public static final CatchingFishViewPagerFlux CatchingFishDaggerHiltFAB(Socket socket) {
        Logger logger = CatchingFishGlideAdMob.CatchingFishParcelableFAB;
        CatchingFishFirebaseDagger.CatchingFishNavigation(socket, "<this>");
        CatchingFishGoogleMapsRedux catchingFishGoogleMapsRedux = new CatchingFishGoogleMapsRedux(socket);
        OutputStream outputStream = socket.getOutputStream();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(outputStream, "getOutputStream()");
        return new CatchingFishViewPagerFlux(catchingFishGoogleMapsRedux, new CatchingFishViewPagerFlux(outputStream, catchingFishGoogleMapsRedux));
    }

    public static CatchingFishWorkManagerMVP CatchingFishDaggerWebsocket(Object obj) {
        CatchingFishWorkManagerMVP catchingFishWorkManagerMVP = new CatchingFishWorkManagerMVP();
        catchingFishWorkManagerMVP.CatchingFishFragmentHandler(obj);
        return catchingFishWorkManagerMVP;
    }

    public static boolean CatchingFishEspressoTesting(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static void CatchingFishFragmentFactory(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static CatchingFishGsonWebSocket CatchingFishFragmentHandler(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        CatchingFishGsonWebSocket catchingFishGsonWebSocket;
        if (CatchingFishEspressoTesting(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new CatchingFishGsonWebSocket((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                catchingFishGsonWebSocket = CatchingFishGsonWebSocket.CatchingFishCoroutine(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                catchingFishGsonWebSocket = null;
            }
            if (catchingFishGsonWebSocket != null) {
                return catchingFishGsonWebSocket;
            }
        }
        return new CatchingFishGsonWebSocket((Shader) null, (ColorStateList) null, 0);
    }

    public static void CatchingFishGsonAppCompat(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int CatchingFishJobScheduler = CatchingFishJobScheduler(parcel, i);
        parcel.writeBundle(bundle);
        CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }

    public static PorterDuff.Mode CatchingFishJetpackCompose(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static int CatchingFishJobScheduler(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static ColorStateList CatchingFishLayout(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!CatchingFishEspressoTesting(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = CatchingFishDaggerHandler.CatchingFishParcelableFAB;
        try {
            return CatchingFishDaggerHandler.CatchingFishParcelableFAB(resources, resources.getXml(resourceId), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void CatchingFishMVPRobolectric(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int CatchingFishJobScheduler = CatchingFishJobScheduler(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }

    public static void CatchingFishMutableLiveData(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List CatchingFishNavigation(CatchingFishGoogleMapsMVP catchingFishGoogleMapsMVP, int i, CatchingFishGoogleMapsMVP catchingFishGoogleMapsMVP2, boolean z, boolean z2, boolean z3) {
        CatchingFishViewPagerDagger catchingFishViewPagerDagger;
        boolean z4;
        int i2;
        int i3;
        int CatchingFish = catchingFishGoogleMapsMVP.CatchingFish(i);
        int i4 = i + CatchingFish;
        int CatchingFishWorkManager2 = catchingFishGoogleMapsMVP.CatchingFishWorkManager(i);
        int CatchingFishWorkManager3 = catchingFishGoogleMapsMVP.CatchingFishWorkManager(i4);
        int i5 = CatchingFishWorkManager3 - CatchingFishWorkManager2;
        boolean z5 = i >= 0 && (catchingFishGoogleMapsMVP.CatchingFishSnackbar[(catchingFishGoogleMapsMVP.CatchingFishRoomDatabase(i) * 5) + 1] & 201326592) != 0;
        catchingFishGoogleMapsMVP2.CatchingFishCoroutineFlow(CatchingFish);
        catchingFishGoogleMapsMVP2.CatchingFishDaggerHiltFAB(i5, catchingFishGoogleMapsMVP2.CatchingFishJetpackCompose);
        if (catchingFishGoogleMapsMVP.CatchingFishViewModelScope < i4) {
            catchingFishGoogleMapsMVP.CatchingFishCardViewRealm(i4);
        }
        if (catchingFishGoogleMapsMVP.CatchingFishCloudMessaging < CatchingFishWorkManager3) {
            catchingFishGoogleMapsMVP.CatchingFishPayPal(CatchingFishWorkManager3, i4);
        }
        int[] iArr = catchingFishGoogleMapsMVP2.CatchingFishSnackbar;
        int i6 = catchingFishGoogleMapsMVP2.CatchingFishJetpackCompose;
        int i7 = i6 * 5;
        CatchingFishMVVMHilt.CatchingFishParcelable(i7, i * 5, i4 * 5, catchingFishGoogleMapsMVP.CatchingFishSnackbar, iArr);
        Object[] objArr = catchingFishGoogleMapsMVP2.CatchingFishCoroutine;
        int i8 = catchingFishGoogleMapsMVP2.CatchingFishLayout;
        System.arraycopy(catchingFishGoogleMapsMVP.CatchingFishCoroutine, CatchingFishWorkManager2, objArr, i8, i5);
        int i9 = catchingFishGoogleMapsMVP2.CatchingFishDaggerHiltFAB;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + CatchingFish;
        int CatchingFishViewModelScope2 = i8 - catchingFishGoogleMapsMVP2.CatchingFishViewModelScope(iArr, i6);
        int i12 = catchingFishGoogleMapsMVP2.CatchingFishOkHttp;
        int i13 = catchingFishGoogleMapsMVP2.CatchingFishEspressoTesting;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int CatchingFishViewModelScope3 = catchingFishGoogleMapsMVP2.CatchingFishViewModelScope(iArr, i15) + CatchingFishViewModelScope2;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = catchingFishGoogleMapsMVP2.CatchingFishCloudMessaging;
            }
            iArr2[(i15 * 5) + 4] = CatchingFishGoogleMapsMVP.CatchingFishLayout(CatchingFishViewModelScope3, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        catchingFishGoogleMapsMVP2.CatchingFishOkHttp = i14;
        int CatchingFishSnackbar2 = CatchingFishMockkKtorGlide.CatchingFishSnackbar(catchingFishGoogleMapsMVP.CatchingFishReduxKtor, i, catchingFishGoogleMapsMVP.CatchingFishAnimationMockk());
        int CatchingFishSnackbar3 = CatchingFishMockkKtorGlide.CatchingFishSnackbar(catchingFishGoogleMapsMVP.CatchingFishReduxKtor, i4, catchingFishGoogleMapsMVP.CatchingFishAnimationMockk());
        if (CatchingFishSnackbar2 < CatchingFishSnackbar3) {
            ArrayList arrayList = catchingFishGoogleMapsMVP.CatchingFishReduxKtor;
            ArrayList arrayList2 = new ArrayList(CatchingFishSnackbar3 - CatchingFishSnackbar2);
            for (int i17 = CatchingFishSnackbar2; i17 < CatchingFishSnackbar3; i17++) {
                CatchingFishMockkPicasso catchingFishMockkPicasso = (CatchingFishMockkPicasso) arrayList.get(i17);
                catchingFishMockkPicasso.CatchingFishParcelableFAB += i10;
                arrayList2.add(catchingFishMockkPicasso);
            }
            catchingFishGoogleMapsMVP2.CatchingFishReduxKtor.addAll(CatchingFishMockkKtorGlide.CatchingFishSnackbar(catchingFishGoogleMapsMVP2.CatchingFishReduxKtor, catchingFishGoogleMapsMVP2.CatchingFishJetpackCompose, catchingFishGoogleMapsMVP2.CatchingFishAnimationMockk()), arrayList2);
            arrayList.subList(CatchingFishSnackbar2, CatchingFishSnackbar3).clear();
            catchingFishViewPagerDagger = arrayList2;
        } else {
            catchingFishViewPagerDagger = CatchingFishViewPagerDagger.CatchingFishReduxKtor;
        }
        if (!catchingFishViewPagerDagger.isEmpty()) {
            HashMap hashMap = catchingFishGoogleMapsMVP.CatchingFishDaggerWebsocket;
            HashMap hashMap2 = catchingFishGoogleMapsMVP2.CatchingFishDaggerWebsocket;
            if (hashMap != null && hashMap2 != null) {
                int size = catchingFishViewPagerDagger.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = catchingFishGoogleMapsMVP2.CatchingFishDaggerHiltFAB;
        catchingFishGoogleMapsMVP2.CatchingFishHandler(i9);
        int CatchingFishMVPRobolectric = catchingFishGoogleMapsMVP.CatchingFishMVPRobolectric(catchingFishGoogleMapsMVP.CatchingFishSnackbar, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = CatchingFishMVPRobolectric >= 0;
            if (z7) {
                catchingFishGoogleMapsMVP.CatchingFishPayPalLiveData();
                catchingFishGoogleMapsMVP.CatchingFishParcelableFAB(CatchingFishMVPRobolectric - catchingFishGoogleMapsMVP.CatchingFishJetpackCompose);
                catchingFishGoogleMapsMVP.CatchingFishPayPalLiveData();
            }
            catchingFishGoogleMapsMVP.CatchingFishParcelableFAB(i - catchingFishGoogleMapsMVP.CatchingFishJetpackCompose);
            boolean CatchingFishMutableLiveData = catchingFishGoogleMapsMVP.CatchingFishMutableLiveData();
            if (z7) {
                catchingFishGoogleMapsMVP.CatchingFishDagger();
                catchingFishGoogleMapsMVP.CatchingFishFragmentHandler();
                catchingFishGoogleMapsMVP.CatchingFishDagger();
                catchingFishGoogleMapsMVP.CatchingFishFragmentHandler();
            }
            z4 = CatchingFishMutableLiveData;
        } else {
            boolean CatchingFishJobScheduler = catchingFishGoogleMapsMVP.CatchingFishJobScheduler(i, CatchingFish);
            catchingFishGoogleMapsMVP.CatchingFishPayPalService(CatchingFishWorkManager2, i5, i - 1);
            z4 = CatchingFishJobScheduler;
        }
        if (z4) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Unexpectedly removed anchors");
        }
        int i20 = catchingFishGoogleMapsMVP2.CatchingFishAnimationMockk;
        int i21 = iArr3[i7 + 1];
        catchingFishGoogleMapsMVP2.CatchingFishAnimationMockk = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            catchingFishGoogleMapsMVP2.CatchingFishJetpackCompose = i11;
            catchingFishGoogleMapsMVP2.CatchingFishLayout = i8 + i5;
        }
        if (z6) {
            catchingFishGoogleMapsMVP2.CatchingFishParcelable(i9);
        }
        return catchingFishViewPagerDagger;
    }

    public static final boolean CatchingFishOkHttp(AssertionError assertionError) {
        Logger logger = CatchingFishGlideAdMob.CatchingFishParcelableFAB;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? CatchingFishRoomMVVMWidget.CatchingFishMutableLiveData(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    public static void CatchingFishParcelableFAB(CatchingFishGoogleMapsMVP catchingFishGoogleMapsMVP, List list, CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int CatchingFishCoroutine2 = catchingFishGoogleMapsMVP.CatchingFishCoroutine((CatchingFishMockkPicasso) list.get(i));
            int CatchingFishCameraXIntent = catchingFishGoogleMapsMVP.CatchingFishCameraXIntent(catchingFishGoogleMapsMVP.CatchingFishSnackbar, catchingFishGoogleMapsMVP.CatchingFishRoomDatabase(CatchingFishCoroutine2));
            Object obj = CatchingFishCameraXIntent < catchingFishGoogleMapsMVP.CatchingFishViewModelScope(catchingFishGoogleMapsMVP.CatchingFishSnackbar, catchingFishGoogleMapsMVP.CatchingFishRoomDatabase(CatchingFishCoroutine2 + 1)) ? catchingFishGoogleMapsMVP.CatchingFishCoroutine[catchingFishGoogleMapsMVP.CatchingFishViewModelFAB(CatchingFishCameraXIntent)] : CatchingFishGsonOkHttp.CatchingFishParcelableFAB;
            CatchingFishHiltFAB catchingFishHiltFAB = obj instanceof CatchingFishHiltFAB ? (CatchingFishHiltFAB) obj : null;
            if (catchingFishHiltFAB != null) {
                catchingFishHiltFAB.CatchingFishParcelableFAB = catchingFishLayoutStripeAPI;
            }
        }
    }

    public static final void CatchingFishParcelableFlux(CatchingFishGsonWebSocket catchingFishGsonWebSocket, long j, CatchingFishServiceHandler catchingFishServiceHandler, boolean z) {
        MotionEvent motionEvent = (MotionEvent) ((CatchingFishViewModelIntent) ((CatchingFishGlideFAB) catchingFishGsonWebSocket.CatchingFishReduxKtor).CatchingFishCoroutine).CatchingFishWorkManager;
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z) {
            motionEvent.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        catchingFishServiceHandler.CatchingFishFragmentHandler(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEvent.setAction(action);
    }

    public static void CatchingFishPayPal(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int CatchingFishJobScheduler = CatchingFishJobScheduler(parcel, i);
        parcel.writeString(str);
        CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }

    public static void CatchingFishPayPalService(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static CatchingFishWorkManagerMVP CatchingFishReduxKtor(Executor executor, Callable callable) {
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(executor, "Executor must not be null");
        CatchingFishWorkManagerMVP catchingFishWorkManagerMVP = new CatchingFishWorkManagerMVP();
        executor.execute(new CatchingFishGsonRealmMoshi(12, catchingFishWorkManagerMVP, callable, false));
        return catchingFishWorkManagerMVP;
    }

    public static int CatchingFishRoomDatabase(float f, int i, int i2) {
        return CatchingFishLiveDataAdMob.CatchingFishSnackbar(CatchingFishLiveDataAdMob.CatchingFishReduxKtor(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static Object CatchingFishSnackbar(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        CatchingFishToastHiltBundle.CatchingFishUnitTesting("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(catchingFishWorkManagerMVP, "Task must not be null");
        if (catchingFishWorkManagerMVP.CatchingFishViewModelScope()) {
            return CatchingFishCustomView(catchingFishWorkManagerMVP);
        }
        CatchingFishRealmFABMockk catchingFishRealmFABMockk = new CatchingFishRealmFABMockk();
        Executor executor = CatchingFishReduxMockk.CatchingFishSnackbar;
        catchingFishWorkManagerMVP.CatchingFishSnackbar(executor, catchingFishRealmFABMockk);
        CatchingFishEspressoContext catchingFishEspressoContext = new CatchingFishEspressoContext(executor, (CatchingFishRoomToolbar) catchingFishRealmFABMockk);
        CatchingFishGlideFAB catchingFishGlideFAB = catchingFishWorkManagerMVP.CatchingFishSnackbar;
        catchingFishGlideFAB.CatchingFishSnackbar(catchingFishEspressoContext);
        catchingFishWorkManagerMVP.CatchingFishUnitTesting();
        catchingFishGlideFAB.CatchingFishSnackbar(new CatchingFishEspressoContext(executor, (CatchingFishSpannableFAB) catchingFishRealmFABMockk));
        catchingFishWorkManagerMVP.CatchingFishUnitTesting();
        catchingFishRealmFABMockk.CatchingFishReduxKtor.await();
        return CatchingFishCustomView(catchingFishWorkManagerMVP);
    }

    public static final CatchingFishPayPalSnackbar CatchingFishSpannableWidget(Socket socket) {
        Logger logger = CatchingFishGlideAdMob.CatchingFishParcelableFAB;
        CatchingFishFirebaseDagger.CatchingFishNavigation(socket, "<this>");
        CatchingFishGoogleMapsRedux catchingFishGoogleMapsRedux = new CatchingFishGoogleMapsRedux(socket);
        InputStream inputStream = socket.getInputStream();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(inputStream, "getInputStream()");
        return new CatchingFishPayPalSnackbar(0, catchingFishGoogleMapsRedux, new CatchingFishPayPalSnackbar(1, inputStream, catchingFishGoogleMapsRedux));
    }

    public static boolean CatchingFishStateLiveData(byte b) {
        return b > -65;
    }

    public static boolean CatchingFishUnitTesting(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = CatchingFishLiveDataAdMob.CatchingFishParcelableFAB;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = red / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = green / 255.0d;
        double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = blue / 255.0d;
        double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d4 / 100.0d > 0.5d;
    }

    public static int CatchingFishViewModelFAB(View view, int i) {
        Context context = view.getContext();
        TypedValue CatchingFishLayoutInflater = CatchingFishOkHttpFAB.CatchingFishLayoutInflater(i, view.getContext(), view.getClass().getCanonicalName());
        int i2 = CatchingFishLayoutInflater.resourceId;
        return i2 != 0 ? context.getColor(i2) : CatchingFishLayoutInflater.data;
    }

    public static int CatchingFishViewModelScope(Context context, int i, int i2) {
        Integer num;
        TypedValue CatchingFishGradleManifest = CatchingFishOkHttpFAB.CatchingFishGradleManifest(context, i);
        if (CatchingFishGradleManifest != null) {
            int i3 = CatchingFishGradleManifest.resourceId;
            num = Integer.valueOf(i3 != 0 ? context.getColor(i3) : CatchingFishGradleManifest.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    public static void CatchingFishWorkManager(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 33) {
        }
        bundle.getBoolean("androidx.browser.customtabs.PrefetchOptions.KEY_REQUIRES_ANONYMOUS_IP_WHEN_CROSS_ORIGIN");
    }
}
