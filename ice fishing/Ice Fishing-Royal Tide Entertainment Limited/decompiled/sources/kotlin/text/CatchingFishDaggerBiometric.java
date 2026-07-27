package kotlin.text;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.window.BackEvent;
import androidx.activity.ComponentActivity;
import com.adjust.sdk.Constants;
import com.catchingfish.fishcatcherpro.R;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class CatchingFishDaggerBiometric {
    public static boolean CatchingFishCoroutine = true;
    public static boolean CatchingFishDaggerWebsocket;
    public static long CatchingFishParcelableFAB;
    public static Field CatchingFishReduxKtor;
    public static Method CatchingFishSnackbar;

    public CatchingFishDaggerBiometric() {
        new ConcurrentHashMap();
    }

    public static ColorStateList CatchingFish(Context context, CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger, int i) {
        int resourceId;
        ColorStateList CatchingFishSpannableWidget;
        TypedArray typedArray = (TypedArray) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (CatchingFishSpannableWidget = CatchingFishGsonCardView.CatchingFishSpannableWidget(context, resourceId)) == null) ? catchingFishAsyncTaskDagger.CatchingFishFragmentFactory(i) : CatchingFishSpannableWidget;
    }

    public static boolean CatchingFishAnimationMockk() {
        Context context;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            com.google.firebase.CatchingFishPagingLibrary.CatchingFishSnackbar();
            com.google.firebase.CatchingFishPagingLibrary CatchingFishSnackbar2 = com.google.firebase.CatchingFishPagingLibrary.CatchingFishSnackbar();
            CatchingFishSnackbar2.CatchingFishParcelableFAB();
            context = CatchingFishSnackbar2.CatchingFishParcelableFAB;
            sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    public static void CatchingFishAppCompat(int i, int i2) {
        String CatchingFishCustomView;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                CatchingFishCustomView = CatchingFishKtorViewModel.CatchingFishCustomView("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                CatchingFishCustomView = CatchingFishKtorViewModel.CatchingFishCustomView("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(CatchingFishCustomView);
        }
    }

    public static void CatchingFishCameraXIntent(CatchingFishOkHttpStripeAPI catchingFishOkHttpStripeAPI, CatchingFishOkHttpStripeAPI catchingFishOkHttpStripeAPI2, CatchingFishServiceHandler catchingFishServiceHandler) {
        if (catchingFishOkHttpStripeAPI != catchingFishOkHttpStripeAPI2) {
            catchingFishOkHttpStripeAPI2.getClass();
            CatchingFishOkHttpStripeAPI.CatchingFishRoomDatabase(catchingFishOkHttpStripeAPI);
            catchingFishOkHttpStripeAPI2.CatchingFishCoroutine();
        } else if (catchingFishOkHttpStripeAPI instanceof CatchingFishDatabindingRoom) {
            ((CatchingFishDatabindingRoom) catchingFishOkHttpStripeAPI).CatchingFishNavigation = catchingFishServiceHandler;
        } else if (catchingFishOkHttpStripeAPI instanceof CatchingFishGlideMockk) {
            ((CatchingFishGlideMockk) catchingFishOkHttpStripeAPI).CatchingFishViewModelFAB = catchingFishServiceHandler;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + catchingFishOkHttpStripeAPI).toString());
        }
    }

    public static boolean CatchingFishCardViewRealm(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static void CatchingFishCardViewView(String str, Bundle bundle) {
        try {
            com.google.firebase.CatchingFishPagingLibrary.CatchingFishSnackbar();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = CatchingFishViewPagerMockk.CatchingFishUnitTesting(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            com.google.firebase.CatchingFishPagingLibrary CatchingFishSnackbar2 = com.google.firebase.CatchingFishPagingLibrary.CatchingFishSnackbar();
            CatchingFishSnackbar2.CatchingFishParcelableFAB();
            if (CatchingFishSnackbar2.CatchingFishReduxKtor.CatchingFishParcelableFAB(CatchingFishBiometric.class) != null) {
                throw new ClassCastException();
            }
        } catch (IllegalStateException unused3) {
        }
    }

    public static final void CatchingFishCoroutine(CatchingFishGsonLayout catchingFishGsonLayout, int i) {
        if (catchingFishGsonLayout.CatchingFishSnackbar == 0 || !(catchingFishGsonLayout.CatchingFishSnackbar(0) == i || catchingFishGsonLayout.CatchingFishSnackbar(catchingFishGsonLayout.CatchingFishSnackbar - 1) == i)) {
            int i2 = catchingFishGsonLayout.CatchingFishSnackbar;
            catchingFishGsonLayout.CatchingFishParcelableFAB(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int CatchingFishSnackbar2 = catchingFishGsonLayout.CatchingFishSnackbar(i3);
                if (i <= CatchingFishSnackbar2) {
                    break;
                }
                catchingFishGsonLayout.CatchingFishReduxKtor(i2, CatchingFishSnackbar2);
                i2 = i3;
            }
            catchingFishGsonLayout.CatchingFishReduxKtor(i2, i);
        }
    }

    public static final CatchingFishMVVMMVVM CatchingFishCoroutineFlow(View view) {
        CatchingFishMVVMMVVM catchingFishMVVMMVVM = (CatchingFishMVVMMVVM) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (catchingFishMVVMMVVM != null) {
            return catchingFishMVVMMVVM;
        }
        CatchingFishMVVMMVVM catchingFishMVVMMVVM2 = new CatchingFishMVVMMVVM();
        view.setTag(R.id.pooling_container_listener_holder_tag, catchingFishMVVMMVVM2);
        return catchingFishMVVMMVVM2;
    }

    public static Object CatchingFishCustomView(CatchingFishJUnitGlide catchingFishJUnitGlide, CatchingFishServiceHandler catchingFishServiceHandler) {
        CatchingFishOkHttpStripeAPI catchingFishDatabindingRoom;
        if (catchingFishServiceHandler == null) {
            return catchingFishJUnitGlide.CatchingFishParcelableFAB();
        }
        CatchingFishOkHttpStripeAPI catchingFishOkHttpStripeAPI = (CatchingFishOkHttpStripeAPI) CatchingFishIntentBundle.CatchingFishSnackbar.get();
        if (catchingFishOkHttpStripeAPI instanceof CatchingFishDatabindingRoom) {
            CatchingFishDatabindingRoom catchingFishDatabindingRoom2 = (CatchingFishDatabindingRoom) catchingFishOkHttpStripeAPI;
            if (catchingFishDatabindingRoom2.CatchingFishJetpackCompose == CatchingFishOkHttpFAB.CatchingFishRoomDatabase()) {
                CatchingFishServiceHandler catchingFishServiceHandler2 = catchingFishDatabindingRoom2.CatchingFishNavigation;
                CatchingFishServiceHandler catchingFishServiceHandler3 = catchingFishDatabindingRoom2.CatchingFish;
                try {
                    ((CatchingFishDatabindingRoom) catchingFishOkHttpStripeAPI).CatchingFishNavigation = CatchingFishIntentBundle.CatchingFishEspressoTesting(catchingFishServiceHandler, catchingFishServiceHandler2, true);
                    ((CatchingFishDatabindingRoom) catchingFishOkHttpStripeAPI).CatchingFish = catchingFishServiceHandler3;
                    return catchingFishJUnitGlide.CatchingFishParcelableFAB();
                } finally {
                    catchingFishDatabindingRoom2.CatchingFishNavigation = catchingFishServiceHandler2;
                    catchingFishDatabindingRoom2.CatchingFish = catchingFishServiceHandler3;
                }
            }
        }
        if (catchingFishOkHttpStripeAPI == null || (catchingFishOkHttpStripeAPI instanceof CatchingFishMockkAnimation)) {
            catchingFishDatabindingRoom = new CatchingFishDatabindingRoom(catchingFishOkHttpStripeAPI instanceof CatchingFishMockkAnimation ? (CatchingFishMockkAnimation) catchingFishOkHttpStripeAPI : null, catchingFishServiceHandler, null, true, false);
        } else {
            if (catchingFishServiceHandler == null) {
                return catchingFishJUnitGlide.CatchingFishParcelableFAB();
            }
            catchingFishDatabindingRoom = catchingFishOkHttpStripeAPI.CatchingFishCoroutineFlow(catchingFishServiceHandler);
        }
        try {
            CatchingFishOkHttpStripeAPI CatchingFishFragmentHandler = catchingFishDatabindingRoom.CatchingFishFragmentHandler();
            try {
                Object CatchingFishParcelableFAB2 = catchingFishJUnitGlide.CatchingFishParcelableFAB();
                CatchingFishOkHttpStripeAPI.CatchingFishRoomDatabase(CatchingFishFragmentHandler);
                catchingFishDatabindingRoom.CatchingFishCoroutine();
                return CatchingFishParcelableFAB2;
            } catch (Throwable th) {
                CatchingFishOkHttpStripeAPI.CatchingFishRoomDatabase(CatchingFishFragmentHandler);
                throw th;
            }
        } catch (Throwable th2) {
            catchingFishDatabindingRoom.CatchingFishCoroutine();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0531 A[LOOP:2: B:59:0x052a->B:61:0x0531, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CatchingFishCameraXContext CatchingFishDagger(int i, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI) {
        TypedValue typedValue;
        boolean z;
        long j;
        int i2;
        float f;
        ArrayList arrayList;
        int eventType;
        float f2;
        CatchingFishLifecycleRoom catchingFishLifecycleRoom;
        int i3;
        int i4;
        Shader shader;
        CatchingFishRobolectricHilt catchingFishMoshiIntent;
        boolean z2;
        Context context = (Context) catchingFishSharedFlowMVI.CatchingFishLayout(CatchingFishFABExoPlayer.CatchingFishSnackbar);
        Resources resources = (Resources) catchingFishSharedFlowMVI.CatchingFishLayout(CatchingFishFABExoPlayer.CatchingFishCoroutine);
        CatchingFishKtorRoom catchingFishKtorRoom = (CatchingFishKtorRoom) catchingFishSharedFlowMVI.CatchingFishLayout(CatchingFishFABExoPlayer.CatchingFishDaggerWebsocket);
        synchronized (catchingFishKtorRoom) {
            typedValue = (TypedValue) catchingFishKtorRoom.CatchingFishParcelableFAB.CatchingFishSnackbar(i);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = catchingFishKtorRoom.CatchingFishParcelableFAB;
                int CatchingFishReduxKtor2 = catchingFishLayoutGsonRoom.CatchingFishReduxKtor(i);
                Object[] objArr = catchingFishLayoutGsonRoom.CatchingFishCoroutine;
                Object obj = objArr[CatchingFishReduxKtor2];
                catchingFishLayoutGsonRoom.CatchingFishSnackbar[CatchingFishReduxKtor2] = i;
                objArr[CatchingFishReduxKtor2] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            if (!(charSequence instanceof String)) {
                int length = charSequence.length() - 4;
                CatchingFishFirebaseDagger.CatchingFishNavigation(charSequence, "<this>");
                if (length >= 0 && length <= charSequence.length() - 4 && ".xml".length() - 4 >= 0) {
                    for (int i5 = 0; i5 < 4; i5++) {
                        if (charSequence.charAt(length + i5) == ".xml".charAt(0 + i5)) {
                        }
                    }
                    z2 = true;
                }
                z2 = false;
                break;
            } else {
                z2 = ((String) charSequence).endsWith(".xml");
            }
            if (z2) {
                z = true;
                if (z) {
                    catchingFishSharedFlowMVI.CatchingFishParcelable(-1771631096);
                    boolean CatchingFishDaggerWebsocket2 = catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket(context.getTheme()) | catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket(charSequence) | catchingFishSharedFlowMVI.CatchingFishCoroutine(i);
                    Object CatchingFishPayPalService = catchingFishSharedFlowMVI.CatchingFishPayPalService();
                    if (CatchingFishDaggerWebsocket2 || CatchingFishPayPalService == CatchingFishGsonOkHttp.CatchingFishParcelableFAB) {
                        try {
                            Drawable drawable = resources.getDrawable(i, null);
                            CatchingFishFirebaseDagger.CatchingFishStateLiveData(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                            CatchingFishPayPalService = new CatchingFishWidgetWebSocket(((BitmapDrawable) drawable).getBitmap());
                            catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService);
                        } catch (Exception e) {
                            throw new CatchingFishBiometricView("Error attempting to load resource: " + ((Object) charSequence), e);
                        }
                    }
                    CatchingFishPayPalMVVM catchingFishPayPalMVVM = new CatchingFishPayPalMVVM((CatchingFishWidgetWebSocket) CatchingFishPayPalService);
                    catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
                    return catchingFishPayPalMVVM;
                }
                catchingFishSharedFlowMVI.CatchingFishParcelable(-1771786530);
                Resources.Theme theme = context.getTheme();
                int i6 = typedValue.changingConfigurations;
                CatchingFishIntentEspresso catchingFishIntentEspresso = (CatchingFishIntentEspresso) catchingFishSharedFlowMVI.CatchingFishLayout(CatchingFishFABExoPlayer.CatchingFishReduxKtor);
                CatchingFishServiceFirebase catchingFishServiceFirebase = new CatchingFishServiceFirebase(theme, i);
                WeakReference weakReference = (WeakReference) catchingFishIntentEspresso.CatchingFishParcelableFAB.get(catchingFishServiceFirebase);
                CatchingFishHiltFluxGraphQL catchingFishHiltFluxGraphQL = weakReference != null ? (CatchingFishHiltFluxGraphQL) weakReference.get() : null;
                if (catchingFishHiltFluxGraphQL == null) {
                    XmlResourceParser xml = resources.getXml(i);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(xml.getName(), "vector")) {
                        throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                    }
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    CatchingFishLifecycleRoom catchingFishLifecycleRoom2 = new CatchingFishLifecycleRoom(xml);
                    TypedArray CatchingFish = CatchingFishViewMVIMVVM.CatchingFish(resources, theme, asAttributeSet, CatchingFishFirebaseDagger.CatchingFishParcelableFAB);
                    catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish.getChangingConfigurations());
                    boolean z3 = !CatchingFishViewMVIMVVM.CatchingFishEspressoTesting(xml, "autoMirrored") ? false : CatchingFish.getBoolean(5, false);
                    catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish.getChangingConfigurations());
                    float CatchingFishParcelableFAB2 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish, "viewportWidth", 7, 0.0f);
                    float CatchingFishParcelableFAB3 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish, "viewportHeight", 8, 0.0f);
                    if (CatchingFishParcelableFAB2 <= 0.0f) {
                        throw new XmlPullParserException(CatchingFish.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                    }
                    if (CatchingFishParcelableFAB3 <= 0.0f) {
                        throw new XmlPullParserException(CatchingFish.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                    }
                    float dimension = CatchingFish.getDimension(3, 0.0f);
                    catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish.getChangingConfigurations());
                    float dimension2 = CatchingFish.getDimension(2, 0.0f);
                    catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish.getChangingConfigurations());
                    if (CatchingFish.hasValue(1)) {
                        TypedValue typedValue2 = new TypedValue();
                        CatchingFish.getValue(1, typedValue2);
                        if (typedValue2.type == 2) {
                            j = CatchingFishToastFragment.CatchingFishWorkManager;
                        } else {
                            ColorStateList CatchingFishLayout = CatchingFishViewMVIMVVM.CatchingFishLayout(CatchingFish, xml, theme);
                            catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish.getChangingConfigurations());
                            j = CatchingFishLayout != null ? CatchingFishFirebaseDagger.CatchingFishSnackbar(CatchingFishLayout.getDefaultColor()) : CatchingFishToastFragment.CatchingFishWorkManager;
                        }
                    } else {
                        j = CatchingFishToastFragment.CatchingFishWorkManager;
                    }
                    int i7 = CatchingFish.getInt(6, -1);
                    catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish.getChangingConfigurations());
                    if (i7 != -1) {
                        if (i7 == 3) {
                            i2 = 3;
                        } else if (i7 != 5) {
                            if (i7 != 9) {
                                switch (i7) {
                                    case 14:
                                        i2 = 13;
                                        break;
                                    case 15:
                                        i2 = 14;
                                        break;
                                    case 16:
                                        i2 = 12;
                                        break;
                                }
                            } else {
                                i2 = 9;
                            }
                        }
                        float f3 = dimension / resources.getDisplayMetrics().density;
                        f = dimension2 / resources.getDisplayMetrics().density;
                        CatchingFish.recycle();
                        arrayList = new ArrayList();
                        CatchingFishContextSnackbar catchingFishContextSnackbar = new CatchingFishContextSnackbar(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
                        arrayList.add(catchingFishContextSnackbar);
                        int i8 = 0;
                        for (int i9 = 3; xml.getEventType() != 1 && (xml.getDepth() >= 1 || xml.getEventType() != i9); i9 = 3) {
                            List list = CatchingFishViewPagerDagger.CatchingFishReduxKtor;
                            XmlPullParser xmlPullParser = catchingFishLifecycleRoom2.CatchingFishParcelableFAB;
                            XmlResourceParser xmlResourceParser = xml;
                            CatchingFishOkHttpViewPager catchingFishOkHttpViewPager = catchingFishLifecycleRoom2.CatchingFishCoroutine;
                            int i10 = i6;
                            eventType = xmlPullParser.getEventType();
                            int i11 = i2;
                            if (eventType == 2) {
                                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                    int i12 = 0;
                                    for (int i13 = i8 + 1; i12 < i13; i13 = i13) {
                                        CatchingFishContextSnackbar catchingFishContextSnackbar2 = (CatchingFishContextSnackbar) arrayList.remove(arrayList.size() - 1);
                                        ((CatchingFishContextSnackbar) arrayList.get(arrayList.size() - 1)).CatchingFishFragmentHandler.add(new CatchingFishPayPalViewModel(catchingFishContextSnackbar2.CatchingFishParcelableFAB, catchingFishContextSnackbar2.CatchingFishSnackbar, catchingFishContextSnackbar2.CatchingFishCoroutine, catchingFishContextSnackbar2.CatchingFishReduxKtor, catchingFishContextSnackbar2.CatchingFishDaggerWebsocket, catchingFishContextSnackbar2.CatchingFishWorkManager, catchingFishContextSnackbar2.CatchingFishViewModelScope, catchingFishContextSnackbar2.CatchingFishViewModelFAB, catchingFishContextSnackbar2.CatchingFishLayout, catchingFishContextSnackbar2.CatchingFishFragmentHandler));
                                        i12++;
                                    }
                                    f2 = f;
                                    catchingFishLifecycleRoom = catchingFishLifecycleRoom2;
                                    i8 = 0;
                                    xmlResourceParser.next();
                                    catchingFishLifecycleRoom2 = catchingFishLifecycleRoom;
                                    xml = xmlResourceParser;
                                    i6 = i10;
                                    i2 = i11;
                                    f = f2;
                                }
                                f2 = f;
                            } else {
                                String name = xmlPullParser.getName();
                                if (name != null) {
                                    int hashCode = name.hashCode();
                                    f2 = f;
                                    if (hashCode == -1649314686) {
                                        catchingFishLifecycleRoom = catchingFishLifecycleRoom2;
                                        if (name.equals("clip-path")) {
                                            TypedArray CatchingFish2 = CatchingFishViewMVIMVVM.CatchingFish(resources, theme, asAttributeSet, CatchingFishFirebaseDagger.CatchingFishReduxKtor);
                                            catchingFishLifecycleRoom.CatchingFishSnackbar(CatchingFish2.getChangingConfigurations());
                                            String string = CatchingFish2.getString(0);
                                            catchingFishLifecycleRoom.CatchingFishSnackbar(CatchingFish2.getChangingConfigurations());
                                            String str = string == null ? "" : string;
                                            String string2 = CatchingFish2.getString(1);
                                            catchingFishLifecycleRoom.CatchingFishSnackbar(CatchingFish2.getChangingConfigurations());
                                            if (string2 == null) {
                                                int i14 = CatchingFishFragmentToast.CatchingFishParcelableFAB;
                                            } else {
                                                list = CatchingFishOkHttpViewPager.CatchingFishParcelableFAB(catchingFishOkHttpViewPager, string2);
                                            }
                                            List list2 = list;
                                            CatchingFish2.recycle();
                                            arrayList.add(new CatchingFishContextSnackbar(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                            i8++;
                                        }
                                    } else if (hashCode != 3433509) {
                                        if (hashCode == 98629247 && name.equals("group")) {
                                            TypedArray CatchingFish3 = CatchingFishViewMVIMVVM.CatchingFish(resources, theme, asAttributeSet, CatchingFishFirebaseDagger.CatchingFishSnackbar);
                                            catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish3.getChangingConfigurations());
                                            float CatchingFishParcelableFAB4 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish3, "rotation", 5, 0.0f);
                                            float f4 = CatchingFish3.getFloat(1, 0.0f);
                                            catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish3.getChangingConfigurations());
                                            float f5 = CatchingFish3.getFloat(2, 0.0f);
                                            catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish3.getChangingConfigurations());
                                            float CatchingFishParcelableFAB5 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish3, "scaleX", 3, 1.0f);
                                            float CatchingFishParcelableFAB6 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish3, "scaleY", 4, 1.0f);
                                            float CatchingFishParcelableFAB7 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish3, "translateX", 6, 0.0f);
                                            float CatchingFishParcelableFAB8 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish3, "translateY", 7, 0.0f);
                                            String string3 = CatchingFish3.getString(0);
                                            catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish3.getChangingConfigurations());
                                            String str2 = string3 == null ? "" : string3;
                                            CatchingFish3.recycle();
                                            int i15 = CatchingFishFragmentToast.CatchingFishParcelableFAB;
                                            arrayList.add(new CatchingFishContextSnackbar(str2, CatchingFishParcelableFAB4, f4, f5, CatchingFishParcelableFAB5, CatchingFishParcelableFAB6, CatchingFishParcelableFAB7, CatchingFishParcelableFAB8, list, 512));
                                        }
                                    } else if (name.equals("path")) {
                                        TypedArray CatchingFish4 = CatchingFishViewMVIMVVM.CatchingFish(resources, theme, asAttributeSet, CatchingFishFirebaseDagger.CatchingFishCoroutine);
                                        catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish4.getChangingConfigurations());
                                        if (!(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null)) {
                                            throw new IllegalArgumentException("No path data available");
                                        }
                                        String string4 = CatchingFish4.getString(0);
                                        catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish4.getChangingConfigurations());
                                        String str3 = string4 == null ? "" : string4;
                                        String string5 = CatchingFish4.getString(2);
                                        catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish4.getChangingConfigurations());
                                        if (string5 == null) {
                                            int i16 = CatchingFishFragmentToast.CatchingFishParcelableFAB;
                                        } else {
                                            list = CatchingFishOkHttpViewPager.CatchingFishParcelableFAB(catchingFishOkHttpViewPager, string5);
                                        }
                                        List list3 = list;
                                        CatchingFishGsonWebSocket CatchingFishFragmentHandler = CatchingFishViewMVIMVVM.CatchingFishFragmentHandler(CatchingFish4, catchingFishLifecycleRoom2.CatchingFishParcelableFAB, theme, "fillColor", 1);
                                        catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish4.getChangingConfigurations());
                                        float CatchingFishParcelableFAB9 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish4, "fillAlpha", 12, 1.0f);
                                        int i17 = !CatchingFishViewMVIMVVM.CatchingFishEspressoTesting(catchingFishLifecycleRoom2.CatchingFishParcelableFAB, "strokeLineCap") ? -1 : CatchingFish4.getInt(8, -1);
                                        catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish4.getChangingConfigurations());
                                        if (i17 != 0) {
                                            if (i17 != 1) {
                                                i3 = 2;
                                                if (i17 == 2) {
                                                    i4 = 2;
                                                }
                                            } else {
                                                i3 = 2;
                                                i4 = 1;
                                            }
                                            int i18 = CatchingFishViewMVIMVVM.CatchingFishEspressoTesting(catchingFishLifecycleRoom2.CatchingFishParcelableFAB, "strokeLineJoin") ? -1 : CatchingFish4.getInt(9, -1);
                                            catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish4.getChangingConfigurations());
                                            int i19 = i18 == 0 ? i18 != 1 ? i3 : 1 : 0;
                                            float CatchingFishParcelableFAB10 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish4, "strokeMiterLimit", 10, 1.0f);
                                            CatchingFishGsonWebSocket CatchingFishFragmentHandler2 = CatchingFishViewMVIMVVM.CatchingFishFragmentHandler(CatchingFish4, catchingFishLifecycleRoom2.CatchingFishParcelableFAB, theme, "strokeColor", 3);
                                            catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish4.getChangingConfigurations());
                                            float CatchingFishParcelableFAB11 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish4, "strokeAlpha", 11, 1.0f);
                                            float CatchingFishParcelableFAB12 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish4, "strokeWidth", 4, 1.0f);
                                            float CatchingFishParcelableFAB13 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish4, "trimPathEnd", 6, 1.0f);
                                            float CatchingFishParcelableFAB14 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish4, "trimPathOffset", 7, 0.0f);
                                            float CatchingFishParcelableFAB15 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish4, "trimPathStart", 5, 0.0f);
                                            int i20 = CatchingFishViewMVIMVVM.CatchingFishEspressoTesting(catchingFishLifecycleRoom2.CatchingFishParcelableFAB, "fillType") ? 0 : CatchingFish4.getInt(13, 0);
                                            catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish4.getChangingConfigurations());
                                            CatchingFish4.recycle();
                                            shader = (Shader) CatchingFishFragmentHandler.CatchingFishCoroutine;
                                            if (shader == null && CatchingFishFragmentHandler.CatchingFishSnackbar == 0) {
                                                catchingFishLifecycleRoom = catchingFishLifecycleRoom2;
                                                catchingFishMoshiIntent = null;
                                            } else if (shader == null) {
                                                catchingFishMoshiIntent = new CatchingFishHilt(shader);
                                                catchingFishLifecycleRoom = catchingFishLifecycleRoom2;
                                            } else {
                                                catchingFishLifecycleRoom = catchingFishLifecycleRoom2;
                                                catchingFishMoshiIntent = new CatchingFishMoshiIntent(CatchingFishFirebaseDagger.CatchingFishSnackbar(CatchingFishFragmentHandler.CatchingFishSnackbar));
                                            }
                                            Shader shader2 = (Shader) CatchingFishFragmentHandler2.CatchingFishCoroutine;
                                            ((CatchingFishContextSnackbar) arrayList.get(arrayList.size() - 1)).CatchingFishFragmentHandler.add(new CatchingFishCustomViewMockk(str3, list3, i20 != 0 ? 0 : 1, catchingFishMoshiIntent, CatchingFishParcelableFAB9, (shader2 == null && CatchingFishFragmentHandler2.CatchingFishSnackbar == 0) ? null : shader2 != null ? new CatchingFishHilt(shader2) : new CatchingFishMoshiIntent(CatchingFishFirebaseDagger.CatchingFishSnackbar(CatchingFishFragmentHandler2.CatchingFishSnackbar)), CatchingFishParcelableFAB11, CatchingFishParcelableFAB12, i4, i19, CatchingFishParcelableFAB10, CatchingFishParcelableFAB15, CatchingFishParcelableFAB13, CatchingFishParcelableFAB14));
                                        } else {
                                            i3 = 2;
                                        }
                                        i4 = 0;
                                        if (CatchingFishViewMVIMVVM.CatchingFishEspressoTesting(catchingFishLifecycleRoom2.CatchingFishParcelableFAB, "strokeLineJoin")) {
                                        }
                                        catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish4.getChangingConfigurations());
                                        if (i18 == 0) {
                                        }
                                        float CatchingFishParcelableFAB102 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish4, "strokeMiterLimit", 10, 1.0f);
                                        CatchingFishGsonWebSocket CatchingFishFragmentHandler22 = CatchingFishViewMVIMVVM.CatchingFishFragmentHandler(CatchingFish4, catchingFishLifecycleRoom2.CatchingFishParcelableFAB, theme, "strokeColor", 3);
                                        catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish4.getChangingConfigurations());
                                        float CatchingFishParcelableFAB112 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish4, "strokeAlpha", 11, 1.0f);
                                        float CatchingFishParcelableFAB122 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish4, "strokeWidth", 4, 1.0f);
                                        float CatchingFishParcelableFAB132 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish4, "trimPathEnd", 6, 1.0f);
                                        float CatchingFishParcelableFAB142 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish4, "trimPathOffset", 7, 0.0f);
                                        float CatchingFishParcelableFAB152 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB(CatchingFish4, "trimPathStart", 5, 0.0f);
                                        if (CatchingFishViewMVIMVVM.CatchingFishEspressoTesting(catchingFishLifecycleRoom2.CatchingFishParcelableFAB, "fillType")) {
                                        }
                                        catchingFishLifecycleRoom2.CatchingFishSnackbar(CatchingFish4.getChangingConfigurations());
                                        CatchingFish4.recycle();
                                        shader = (Shader) CatchingFishFragmentHandler.CatchingFishCoroutine;
                                        if (shader == null) {
                                            catchingFishLifecycleRoom = catchingFishLifecycleRoom2;
                                            catchingFishMoshiIntent = null;
                                            Shader shader22 = (Shader) CatchingFishFragmentHandler22.CatchingFishCoroutine;
                                            if (shader22 == null) {
                                                ((CatchingFishContextSnackbar) arrayList.get(arrayList.size() - 1)).CatchingFishFragmentHandler.add(new CatchingFishCustomViewMockk(str3, list3, i20 != 0 ? 0 : 1, catchingFishMoshiIntent, CatchingFishParcelableFAB9, (shader22 == null && CatchingFishFragmentHandler22.CatchingFishSnackbar == 0) ? null : shader22 != null ? new CatchingFishHilt(shader22) : new CatchingFishMoshiIntent(CatchingFishFirebaseDagger.CatchingFishSnackbar(CatchingFishFragmentHandler22.CatchingFishSnackbar)), CatchingFishParcelableFAB112, CatchingFishParcelableFAB122, i4, i19, CatchingFishParcelableFAB102, CatchingFishParcelableFAB152, CatchingFishParcelableFAB132, CatchingFishParcelableFAB142));
                                            }
                                            ((CatchingFishContextSnackbar) arrayList.get(arrayList.size() - 1)).CatchingFishFragmentHandler.add(new CatchingFishCustomViewMockk(str3, list3, i20 != 0 ? 0 : 1, catchingFishMoshiIntent, CatchingFishParcelableFAB9, (shader22 == null && CatchingFishFragmentHandler22.CatchingFishSnackbar == 0) ? null : shader22 != null ? new CatchingFishHilt(shader22) : new CatchingFishMoshiIntent(CatchingFishFirebaseDagger.CatchingFishSnackbar(CatchingFishFragmentHandler22.CatchingFishSnackbar)), CatchingFishParcelableFAB112, CatchingFishParcelableFAB122, i4, i19, CatchingFishParcelableFAB102, CatchingFishParcelableFAB152, CatchingFishParcelableFAB132, CatchingFishParcelableFAB142));
                                        }
                                        if (shader == null) {
                                        }
                                        Shader shader222 = (Shader) CatchingFishFragmentHandler22.CatchingFishCoroutine;
                                        if (shader222 == null) {
                                        }
                                        ((CatchingFishContextSnackbar) arrayList.get(arrayList.size() - 1)).CatchingFishFragmentHandler.add(new CatchingFishCustomViewMockk(str3, list3, i20 != 0 ? 0 : 1, catchingFishMoshiIntent, CatchingFishParcelableFAB9, (shader222 == null && CatchingFishFragmentHandler22.CatchingFishSnackbar == 0) ? null : shader222 != null ? new CatchingFishHilt(shader222) : new CatchingFishMoshiIntent(CatchingFishFirebaseDagger.CatchingFishSnackbar(CatchingFishFragmentHandler22.CatchingFishSnackbar)), CatchingFishParcelableFAB112, CatchingFishParcelableFAB122, i4, i19, CatchingFishParcelableFAB102, CatchingFishParcelableFAB152, CatchingFishParcelableFAB132, CatchingFishParcelableFAB142));
                                    }
                                    xmlResourceParser.next();
                                    catchingFishLifecycleRoom2 = catchingFishLifecycleRoom;
                                    xml = xmlResourceParser;
                                    i6 = i10;
                                    i2 = i11;
                                    f = f2;
                                }
                                f2 = f;
                            }
                            catchingFishLifecycleRoom = catchingFishLifecycleRoom2;
                            xmlResourceParser.next();
                            catchingFishLifecycleRoom2 = catchingFishLifecycleRoom;
                            xml = xmlResourceParser;
                            i6 = i10;
                            i2 = i11;
                            f = f2;
                        }
                        int i21 = i2;
                        float f6 = f;
                        int i22 = i6 | catchingFishLifecycleRoom2.CatchingFishSnackbar;
                        while (arrayList.size() > 1) {
                            CatchingFishContextSnackbar catchingFishContextSnackbar3 = (CatchingFishContextSnackbar) arrayList.remove(arrayList.size() - 1);
                            ((CatchingFishContextSnackbar) arrayList.get(arrayList.size() - 1)).CatchingFishFragmentHandler.add(new CatchingFishPayPalViewModel(catchingFishContextSnackbar3.CatchingFishParcelableFAB, catchingFishContextSnackbar3.CatchingFishSnackbar, catchingFishContextSnackbar3.CatchingFishCoroutine, catchingFishContextSnackbar3.CatchingFishReduxKtor, catchingFishContextSnackbar3.CatchingFishDaggerWebsocket, catchingFishContextSnackbar3.CatchingFishWorkManager, catchingFishContextSnackbar3.CatchingFishViewModelScope, catchingFishContextSnackbar3.CatchingFishViewModelFAB, catchingFishContextSnackbar3.CatchingFishLayout, catchingFishContextSnackbar3.CatchingFishFragmentHandler));
                        }
                        catchingFishHiltFluxGraphQL = new CatchingFishHiltFluxGraphQL(new CatchingFishKtorFirebase("", f3, f6, CatchingFishParcelableFAB2, CatchingFishParcelableFAB3, new CatchingFishPayPalViewModel(catchingFishContextSnackbar.CatchingFishParcelableFAB, catchingFishContextSnackbar.CatchingFishSnackbar, catchingFishContextSnackbar.CatchingFishCoroutine, catchingFishContextSnackbar.CatchingFishReduxKtor, catchingFishContextSnackbar.CatchingFishDaggerWebsocket, catchingFishContextSnackbar.CatchingFishWorkManager, catchingFishContextSnackbar.CatchingFishViewModelScope, catchingFishContextSnackbar.CatchingFishViewModelFAB, catchingFishContextSnackbar.CatchingFishLayout, catchingFishContextSnackbar.CatchingFishFragmentHandler), j, i21, z3), i22);
                        catchingFishIntentEspresso.CatchingFishParcelableFAB.put(catchingFishServiceFirebase, new WeakReference(catchingFishHiltFluxGraphQL));
                    }
                    i2 = 5;
                    float f32 = dimension / resources.getDisplayMetrics().density;
                    f = dimension2 / resources.getDisplayMetrics().density;
                    CatchingFish.recycle();
                    arrayList = new ArrayList();
                    CatchingFishContextSnackbar catchingFishContextSnackbar4 = new CatchingFishContextSnackbar(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
                    arrayList.add(catchingFishContextSnackbar4);
                    int i82 = 0;
                    while (xml.getEventType() != 1) {
                        List list4 = CatchingFishViewPagerDagger.CatchingFishReduxKtor;
                        XmlPullParser xmlPullParser2 = catchingFishLifecycleRoom2.CatchingFishParcelableFAB;
                        XmlResourceParser xmlResourceParser2 = xml;
                        CatchingFishOkHttpViewPager catchingFishOkHttpViewPager2 = catchingFishLifecycleRoom2.CatchingFishCoroutine;
                        int i102 = i6;
                        eventType = xmlPullParser2.getEventType();
                        int i112 = i2;
                        if (eventType == 2) {
                        }
                        catchingFishLifecycleRoom = catchingFishLifecycleRoom2;
                        xmlResourceParser2.next();
                        catchingFishLifecycleRoom2 = catchingFishLifecycleRoom;
                        xml = xmlResourceParser2;
                        i6 = i102;
                        i2 = i112;
                        f = f2;
                    }
                    int i212 = i2;
                    float f62 = f;
                    int i222 = i6 | catchingFishLifecycleRoom2.CatchingFishSnackbar;
                    while (arrayList.size() > 1) {
                    }
                    catchingFishHiltFluxGraphQL = new CatchingFishHiltFluxGraphQL(new CatchingFishKtorFirebase("", f32, f62, CatchingFishParcelableFAB2, CatchingFishParcelableFAB3, new CatchingFishPayPalViewModel(catchingFishContextSnackbar4.CatchingFishParcelableFAB, catchingFishContextSnackbar4.CatchingFishSnackbar, catchingFishContextSnackbar4.CatchingFishCoroutine, catchingFishContextSnackbar4.CatchingFishReduxKtor, catchingFishContextSnackbar4.CatchingFishDaggerWebsocket, catchingFishContextSnackbar4.CatchingFishWorkManager, catchingFishContextSnackbar4.CatchingFishViewModelScope, catchingFishContextSnackbar4.CatchingFishViewModelFAB, catchingFishContextSnackbar4.CatchingFishLayout, catchingFishContextSnackbar4.CatchingFishFragmentHandler), j, i212, z3), i222);
                    catchingFishIntentEspresso.CatchingFishParcelableFAB.put(catchingFishServiceFirebase, new WeakReference(catchingFishHiltFluxGraphQL));
                }
                CatchingFishKtorFirebase catchingFishKtorFirebase = catchingFishHiltFluxGraphQL.CatchingFishParcelableFAB;
                CatchingFishOkHttpFlux catchingFishOkHttpFlux = (CatchingFishOkHttpFlux) catchingFishSharedFlowMVI.CatchingFishLayout(CatchingFishGradleLiveData.CatchingFishViewModelFAB);
                boolean CatchingFishReduxKtor3 = catchingFishSharedFlowMVI.CatchingFishReduxKtor((Float.floatToRawIntBits(catchingFishOkHttpFlux.CatchingFishFragmentHandler()) & 4294967295L) | (Float.floatToRawIntBits(catchingFishKtorFirebase.CatchingFishFragmentHandler) << 32));
                Object CatchingFishPayPalService2 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
                if (CatchingFishReduxKtor3 || CatchingFishPayPalService2 == CatchingFishGsonOkHttp.CatchingFishParcelableFAB) {
                    CatchingFishGlideRoom catchingFishGlideRoom = new CatchingFishGlideRoom();
                    CatchingFishLayoutRoom.CatchingFishCloudMessaging(catchingFishGlideRoom, catchingFishKtorFirebase.CatchingFishWorkManager);
                    long floatToRawIntBits = (Float.floatToRawIntBits(catchingFishOkHttpFlux.CatchingFishOkHttp(catchingFishKtorFirebase.CatchingFishSnackbar)) << 32) | (Float.floatToRawIntBits(catchingFishOkHttpFlux.CatchingFishOkHttp(catchingFishKtorFirebase.CatchingFishCoroutine)) & 4294967295L);
                    float f7 = catchingFishKtorFirebase.CatchingFishReduxKtor;
                    float f8 = catchingFishKtorFirebase.CatchingFishDaggerWebsocket;
                    if (Float.isNaN(f7)) {
                        f7 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                    }
                    if (Float.isNaN(f8)) {
                        f8 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                    }
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(f7) << 32) | (4294967295L & Float.floatToRawIntBits(f8));
                    CatchingFishBiometricGlide catchingFishBiometricGlide = new CatchingFishBiometricGlide(catchingFishGlideRoom);
                    String str4 = catchingFishKtorFirebase.CatchingFishParcelableFAB;
                    long j2 = catchingFishKtorFirebase.CatchingFishViewModelScope;
                    CatchingFishFluxIntent catchingFishFluxIntent = j2 != 16 ? new CatchingFishFluxIntent(catchingFishKtorFirebase.CatchingFishViewModelFAB, j2) : null;
                    boolean z4 = catchingFishKtorFirebase.CatchingFishLayout;
                    catchingFishBiometricGlide.CatchingFishReduxKtor.setValue(new CatchingFishMVPCameraX(floatToRawIntBits));
                    catchingFishBiometricGlide.CatchingFishDaggerWebsocket.setValue(Boolean.valueOf(z4));
                    CatchingFishRealmGraphQL catchingFishRealmGraphQL = catchingFishBiometricGlide.CatchingFishWorkManager;
                    catchingFishRealmGraphQL.CatchingFishViewModelScope.setValue(catchingFishFluxIntent);
                    catchingFishRealmGraphQL.CatchingFishLayout.setValue(new CatchingFishMVPCameraX(floatToRawIntBits2));
                    catchingFishRealmGraphQL.CatchingFishCoroutine = str4;
                    catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(catchingFishBiometricGlide);
                    CatchingFishPayPalService2 = catchingFishBiometricGlide;
                }
                CatchingFishBiometricGlide catchingFishBiometricGlide2 = (CatchingFishBiometricGlide) CatchingFishPayPalService2;
                catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
                return catchingFishBiometricGlide2;
            }
        }
        z = false;
        if (z) {
        }
    }

    public static void CatchingFishDaggerWebsocket(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static void CatchingFishDataStoreIntent(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? CatchingFishStateFlow("start index", i, i3) : (i2 < 0 || i2 > i3) ? CatchingFishStateFlow("end index", i2, i3) : CatchingFishKtorViewModel.CatchingFishCustomView("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static boolean CatchingFishGradleManifest(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static boolean CatchingFishGsonAppCompat() {
        if (Build.VERSION.SDK_INT >= 29) {
            return CatchingFishRetrofitMVP.CatchingFishParcelableFAB();
        }
        try {
            if (CatchingFishSnackbar == null) {
                CatchingFishParcelableFAB = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                CatchingFishSnackbar = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) CatchingFishSnackbar.invoke(null, Long.valueOf(CatchingFishParcelableFAB))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static Drawable CatchingFishJetpackCompose(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable CatchingFishCustomView;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (CatchingFishCustomView = CatchingFishLayoutRoomFAB.CatchingFishCustomView(context, resourceId)) == null) ? typedArray.getDrawable(i) : CatchingFishCustomView;
    }

    public static final void CatchingFishLayoutInflater(Object obj) {
        if (obj instanceof CatchingFishLiveDataToolbar) {
            throw ((CatchingFishLiveDataToolbar) obj).CatchingFishReduxKtor;
        }
    }

    public static String CatchingFishMVPRobolectric(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final int CatchingFishMotionLayout(CatchingFishGsonLayout catchingFishGsonLayout) {
        int CatchingFishSnackbar2;
        int i = catchingFishGsonLayout.CatchingFishSnackbar;
        int CatchingFishSnackbar3 = catchingFishGsonLayout.CatchingFishSnackbar(0);
        while (catchingFishGsonLayout.CatchingFishSnackbar != 0 && catchingFishGsonLayout.CatchingFishSnackbar(0) == CatchingFishSnackbar3) {
            int i2 = catchingFishGsonLayout.CatchingFishSnackbar;
            if (i2 == 0) {
                CatchingFishHiltMVPToast.CatchingFishMotionLayout("IntList is empty.");
                throw null;
            }
            catchingFishGsonLayout.CatchingFishReduxKtor(0, catchingFishGsonLayout.CatchingFishParcelableFAB[i2 - 1]);
            catchingFishGsonLayout.CatchingFishCoroutine(catchingFishGsonLayout.CatchingFishSnackbar - 1);
            int i3 = catchingFishGsonLayout.CatchingFishSnackbar;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int CatchingFishSnackbar4 = catchingFishGsonLayout.CatchingFishSnackbar(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int CatchingFishSnackbar5 = catchingFishGsonLayout.CatchingFishSnackbar(i7);
                if (i6 >= i3 || (CatchingFishSnackbar2 = catchingFishGsonLayout.CatchingFishSnackbar(i6)) <= CatchingFishSnackbar5) {
                    if (CatchingFishSnackbar5 > CatchingFishSnackbar4) {
                        catchingFishGsonLayout.CatchingFishReduxKtor(i5, CatchingFishSnackbar5);
                        catchingFishGsonLayout.CatchingFishReduxKtor(i7, CatchingFishSnackbar4);
                        i5 = i7;
                    }
                } else if (CatchingFishSnackbar2 > CatchingFishSnackbar4) {
                    catchingFishGsonLayout.CatchingFishReduxKtor(i5, CatchingFishSnackbar2);
                    catchingFishGsonLayout.CatchingFishReduxKtor(i6, CatchingFishSnackbar4);
                    i5 = i6;
                }
            }
        }
        return CatchingFishSnackbar3;
    }

    public static ColorStateList CatchingFishNavigation(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList CatchingFishSpannableWidget;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (CatchingFishSpannableWidget = CatchingFishGsonCardView.CatchingFishSpannableWidget(context, resourceId)) == null) ? typedArray.getColorStateList(i) : CatchingFishSpannableWidget;
    }

    public static CatchingFishSnackbarRedux CatchingFishOkHttp(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            CatchingFishSnackbarRedux catchingFishSnackbarRedux = new CatchingFishSnackbarRedux();
            new LinkedHashMap();
            catchingFishSnackbarRedux.CatchingFishParcelableFAB = new CatchingFishSensorManager(CatchingFishMVPMoshiGson.CatchingFishReduxKtor);
            return catchingFishSnackbarRedux;
        }
        ClassLoader classLoader = CatchingFishSnackbarRedux.class.getClassLoader();
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(classLoader);
        bundle.setClassLoader(classLoader);
        CatchingFishToastView catchingFishToastView = new CatchingFishToastView(bundle.size());
        for (String str : bundle.keySet()) {
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(str);
            catchingFishToastView.put(str, bundle.get(str));
        }
        catchingFishToastView.CatchingFishSnackbar();
        catchingFishToastView.CatchingFishStateLiveData = true;
        if (catchingFishToastView.CatchingFishEspressoTesting <= 0) {
            catchingFishToastView = CatchingFishToastView.CatchingFishRoomDatabase;
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishToastView, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        CatchingFishSnackbarRedux catchingFishSnackbarRedux2 = new CatchingFishSnackbarRedux();
        new LinkedHashMap();
        catchingFishSnackbarRedux2.CatchingFishParcelableFAB = new CatchingFishSensorManager(catchingFishToastView);
        return catchingFishSnackbarRedux2;
    }

    public static final CatchingFishHiltBiometric CatchingFishParcelableFAB(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new CatchingFishHiltBiometric(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:14|(1:16)|17|(1:19)(39:115|(2:118|119)|117|21|(5:103|104|105|106|107)|23|24|(1:26)(1:102)|27|28|(29:30|(1:95)|32|(1:34)(1:(1:94))|35|36|(1:38)|39|(1:41)(1:92)|42|(1:46)|(1:48)(1:91)|49|(1:51)(1:90)|52|(1:54)(1:89)|55|(1:57)(1:88)|58|(5:84|85|67|(1:69)(1:71)|70)|60|(5:80|81|67|(0)(0)|70)|62|63|(1:65)(6:73|(2:76|(1:78))|75|67|(0)(0)|70)|66|67|(0)(0)|70)|96|(1:98)(3:99|(1:101)|32)|(0)(0)|35|36|(0)|39|(0)(0)|42|(2:44|46)|(0)(0)|49|(0)(0)|52|(0)(0)|55|(0)(0)|58|(0)|60|(0)|62|63|(0)(0)|66|67|(0)(0)|70)|20|21|(0)|23|24|(0)(0)|27|28|(0)|96|(0)(0)|(0)(0)|35|36|(0)|39|(0)(0)|42|(0)|(0)(0)|49|(0)(0)|52|(0)(0)|55|(0)(0)|58|(0)|60|(0)|62|63|(0)(0)|66|67|(0)(0)|70) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c A[Catch: NumberFormatException -> 0x017a, TRY_ENTER, TRY_LEAVE, TryCatch #5 {NumberFormatException -> 0x017a, blocks: (B:65:0x016c, B:78:0x0186), top: B:63:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void CatchingFishPayPal(Intent intent) {
        CatchingFishContextMVVM catchingFishContextMVVM;
        int parseInt;
        int i;
        String string;
        String string2;
        Object[] objArr;
        String string3;
        String string4;
        long parseLong;
        String str;
        String str2;
        if (CatchingFishGradleManifest(intent)) {
            CatchingFishCardViewView("_nr", intent.getExtras());
        }
        int i2 = 0;
        if (!((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : CatchingFishAnimationMockk()) || (catchingFishContextMVVM = (CatchingFishContextMVVM) FirebaseMessaging.CatchingFishEspressoTesting.get()) == null) {
            return;
        }
        CatchingFishAndroidXHandler catchingFishAndroidXHandler = null;
        r3 = null;
        String str3 = null;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = Bundle.EMPTY;
            }
            Object obj = extras.get("google.ttl");
            if (obj instanceof Integer) {
                parseInt = ((Integer) obj).intValue();
            } else {
                if (obj instanceof String) {
                    try {
                        parseInt = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        Objects.toString(obj);
                    }
                }
                i = 0;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        com.google.firebase.CatchingFishPagingLibrary CatchingFishSnackbar2 = com.google.firebase.CatchingFishPagingLibrary.CatchingFishSnackbar();
                        try {
                            Object obj2 = CatchingFishLayoutService.CatchingFishOkHttp;
                            CatchingFishSnackbar2.CatchingFishParcelableFAB();
                            string = (String) CatchingFishViewMVIMVVM.CatchingFishSnackbar(((CatchingFishLayoutService) CatchingFishSnackbar2.CatchingFishReduxKtor.CatchingFishParcelableFAB(CatchingFishToolbarPayPal.class)).CatchingFishCoroutine());
                        } catch (InterruptedException e) {
                            e = e;
                            throw new RuntimeException(e);
                        }
                    } catch (InterruptedException | ExecutionException e2) {
                        e = e2;
                    }
                }
                String str4 = string;
                com.google.firebase.CatchingFishPagingLibrary CatchingFishSnackbar3 = com.google.firebase.CatchingFishPagingLibrary.CatchingFishSnackbar();
                CatchingFishSnackbar3.CatchingFishParcelableFAB();
                String packageName = CatchingFishSnackbar3.CatchingFishParcelableFAB.getPackageName();
                CatchingFishPayPalFluxRoom catchingFishPayPalFluxRoom = !CatchingFishViewPagerMockk.CatchingFishUnitTesting(extras) ? CatchingFishPayPalFluxRoom.DISPLAY_NOTIFICATION : CatchingFishPayPalFluxRoom.DATA_MESSAGE;
                string2 = extras.getString("google.delivered_priority");
                if (string2 == null) {
                    if (!"1".equals(extras.getString("google.priority_reduced"))) {
                        string2 = extras.getString("google.priority");
                    }
                    objArr = 2;
                    if (objArr == 2) {
                        i2 = 5;
                    } else if (objArr == 1) {
                        i2 = 10;
                    }
                    int i3 = i2;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    String str5 = string3 != null ? string3 : "";
                    string4 = extras.getString("from");
                    if (string4 != null && string4.startsWith("/topics/")) {
                        str3 = string4;
                    }
                    String str6 = str3 != null ? str3 : "";
                    String string5 = extras.getString("collapse_key");
                    String str7 = string5 != null ? string5 : "";
                    String string6 = extras.getString("google.c.a.m_l");
                    String str8 = string6 != null ? string6 : "";
                    String string7 = extras.getString("google.c.a.c_l");
                    String str9 = string7 != null ? string7 : "";
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException unused2) {
                        }
                        catchingFishAndroidXHandler = new CatchingFishAndroidXHandler(parseLong <= 0 ? parseLong : 0L, str5, str4, catchingFishPayPalFluxRoom, packageName, str7, i3, i, str6, str8, str9);
                    }
                    com.google.firebase.CatchingFishPagingLibrary CatchingFishSnackbar4 = com.google.firebase.CatchingFishPagingLibrary.CatchingFishSnackbar();
                    CatchingFishOkHttpSnackbar catchingFishOkHttpSnackbar = CatchingFishSnackbar4.CatchingFishCoroutine;
                    CatchingFishSnackbar4.CatchingFishParcelableFAB();
                    str = catchingFishOkHttpSnackbar.CatchingFishDaggerWebsocket;
                    if (str != null) {
                        try {
                            parseLong = Long.parseLong(str);
                        } catch (NumberFormatException unused3) {
                        }
                        catchingFishAndroidXHandler = new CatchingFishAndroidXHandler(parseLong <= 0 ? parseLong : 0L, str5, str4, catchingFishPayPalFluxRoom, packageName, str7, i3, i, str6, str8, str9);
                    }
                    CatchingFishSnackbar4.CatchingFishParcelableFAB();
                    str2 = catchingFishOkHttpSnackbar.CatchingFishSnackbar;
                    if (str2.startsWith("1:")) {
                        String[] split = str2.split(":");
                        if (split.length >= 2) {
                            String str10 = split[1];
                            if (!str10.isEmpty()) {
                                parseLong = Long.parseLong(str10);
                            }
                        }
                        parseLong = 0;
                        catchingFishAndroidXHandler = new CatchingFishAndroidXHandler(parseLong <= 0 ? parseLong : 0L, str5, str4, catchingFishPayPalFluxRoom, packageName, str7, i3, i, str6, str8, str9);
                    } else {
                        parseLong = Long.parseLong(str2);
                    }
                    catchingFishAndroidXHandler = new CatchingFishAndroidXHandler(parseLong <= 0 ? parseLong : 0L, str5, str4, catchingFishPayPalFluxRoom, packageName, str7, i3, i, str6, str8, str9);
                }
                if (Constants.HIGH.equals(string2)) {
                    if (!Constants.NORMAL.equals(string2)) {
                        objArr = 0;
                    }
                    objArr = 2;
                } else {
                    objArr = 1;
                }
                if (objArr == 2) {
                }
                int i32 = i2;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                }
                if (string3 != null) {
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                    str3 = string4;
                }
                if (str3 != null) {
                }
                String string52 = extras.getString("collapse_key");
                if (string52 != null) {
                }
                String string62 = extras.getString("google.c.a.m_l");
                if (string62 != null) {
                }
                String string72 = extras.getString("google.c.a.c_l");
                if (string72 != null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                com.google.firebase.CatchingFishPagingLibrary CatchingFishSnackbar42 = com.google.firebase.CatchingFishPagingLibrary.CatchingFishSnackbar();
                CatchingFishOkHttpSnackbar catchingFishOkHttpSnackbar2 = CatchingFishSnackbar42.CatchingFishCoroutine;
                CatchingFishSnackbar42.CatchingFishParcelableFAB();
                str = catchingFishOkHttpSnackbar2.CatchingFishDaggerWebsocket;
                if (str != null) {
                }
                CatchingFishSnackbar42.CatchingFishParcelableFAB();
                str2 = catchingFishOkHttpSnackbar2.CatchingFishSnackbar;
                if (str2.startsWith("1:")) {
                }
                catchingFishAndroidXHandler = new CatchingFishAndroidXHandler(parseLong <= 0 ? parseLong : 0L, str5, str4, catchingFishPayPalFluxRoom, packageName, str7, i32, i, str6, str8, str9);
            }
            i = parseInt;
            string = extras.getString("google.to");
            if (TextUtils.isEmpty(string)) {
            }
            String str42 = string;
            com.google.firebase.CatchingFishPagingLibrary CatchingFishSnackbar32 = com.google.firebase.CatchingFishPagingLibrary.CatchingFishSnackbar();
            CatchingFishSnackbar32.CatchingFishParcelableFAB();
            String packageName2 = CatchingFishSnackbar32.CatchingFishParcelableFAB.getPackageName();
            CatchingFishPayPalFluxRoom catchingFishPayPalFluxRoom2 = !CatchingFishViewPagerMockk.CatchingFishUnitTesting(extras) ? CatchingFishPayPalFluxRoom.DISPLAY_NOTIFICATION : CatchingFishPayPalFluxRoom.DATA_MESSAGE;
            string2 = extras.getString("google.delivered_priority");
            if (string2 == null) {
            }
            if (Constants.HIGH.equals(string2)) {
            }
            if (objArr == 2) {
            }
            int i322 = i2;
            string3 = extras.getString("google.message_id");
            if (string3 == null) {
            }
            if (string3 != null) {
            }
            string4 = extras.getString("from");
            if (string4 != null) {
            }
            if (str3 != null) {
            }
            String string522 = extras.getString("collapse_key");
            if (string522 != null) {
            }
            String string622 = extras.getString("google.c.a.m_l");
            if (string622 != null) {
            }
            String string722 = extras.getString("google.c.a.c_l");
            if (string722 != null) {
            }
            if (extras.containsKey("google.c.sender.id")) {
            }
            com.google.firebase.CatchingFishPagingLibrary CatchingFishSnackbar422 = com.google.firebase.CatchingFishPagingLibrary.CatchingFishSnackbar();
            CatchingFishOkHttpSnackbar catchingFishOkHttpSnackbar22 = CatchingFishSnackbar422.CatchingFishCoroutine;
            CatchingFishSnackbar422.CatchingFishParcelableFAB();
            str = catchingFishOkHttpSnackbar22.CatchingFishDaggerWebsocket;
            if (str != null) {
            }
            CatchingFishSnackbar422.CatchingFishParcelableFAB();
            str2 = catchingFishOkHttpSnackbar22.CatchingFishSnackbar;
            if (str2.startsWith("1:")) {
            }
            catchingFishAndroidXHandler = new CatchingFishAndroidXHandler(parseLong <= 0 ? parseLong : 0L, str5, str42, catchingFishPayPalFluxRoom2, packageName2, str7, i322, i, str6, str8, str9);
        }
        if (catchingFishAndroidXHandler == null) {
            return;
        }
        try {
            CatchingFishFABSharedFlow catchingFishFABSharedFlow = new CatchingFishFABSharedFlow(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
            CatchingFishBiometricIntent catchingFishBiometricIntent = new CatchingFishBiometricIntent("proto");
            CatchingFishLayoutLayout catchingFishLayoutLayout = new CatchingFishLayoutLayout(29);
            CatchingFishGsonMVVM catchingFishGsonMVVM = (CatchingFishGsonMVVM) catchingFishContextMVVM;
            Set set = catchingFishGsonMVVM.CatchingFishParcelableFAB;
            if (!set.contains(catchingFishBiometricIntent)) {
                throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", catchingFishBiometricIntent, set));
            }
            new CatchingFishAsyncTaskDagger(catchingFishGsonMVVM.CatchingFishSnackbar, catchingFishBiometricIntent, catchingFishLayoutLayout, catchingFishGsonMVVM.CatchingFishCoroutine).CatchingFishMVVMAppCompat(new CatchingFishHiltFragmentMVI(new CatchingFishMockkMVI(catchingFishAndroidXHandler), catchingFishFABSharedFlow));
        } catch (RuntimeException unused4) {
        }
    }

    public static final int CatchingFishRecyclerView(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static void CatchingFishReduxKtor(CatchingFishFluxCameraX catchingFishFluxCameraX, ComponentActivity componentActivity, CatchingFishServiceHandler catchingFishServiceHandler) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishFluxCameraX, "<this>");
        catchingFishFluxCameraX.CatchingFishParcelableFAB(new CatchingFishViewPagerRealm(catchingFishServiceHandler), componentActivity);
    }

    public static CatchingFishRetrofitHiltFAB CatchingFishRoomDatabase(CatchingFishRetrofitHiltFAB[] catchingFishRetrofitHiltFABArr, int i) {
        int i2 = (i & 1) == 0 ? Constants.MINIMAL_ERROR_STATUS_CODE : 700;
        boolean z = (i & 2) != 0;
        CatchingFishRetrofitHiltFAB catchingFishRetrofitHiltFAB = null;
        int i3 = Integer.MAX_VALUE;
        for (CatchingFishRetrofitHiltFAB catchingFishRetrofitHiltFAB2 : catchingFishRetrofitHiltFABArr) {
            int abs = (Math.abs(catchingFishRetrofitHiltFAB2.CatchingFishCoroutine - i2) * 2) + (catchingFishRetrofitHiltFAB2.CatchingFishReduxKtor == z ? 0 : 1);
            if (catchingFishRetrofitHiltFAB == null || i3 > abs) {
                catchingFishRetrofitHiltFAB = catchingFishRetrofitHiltFAB2;
                i3 = abs;
            }
        }
        return catchingFishRetrofitHiltFAB;
    }

    public static final CatchingFishMVIGraphQLHilt CatchingFishSnackbar(CatchingFishBiometricRoom catchingFishBiometricRoom, boolean z) {
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = (CatchingFishFABStripeAPIFAB) catchingFishBiometricRoom.CatchingFishJobScheduler.CatchingFishFragmentHandler;
        Object obj = null;
        if ((catchingFishFABStripeAPIFAB.CatchingFishViewModelScope & 8) != 0) {
            loop0: while (true) {
                if (catchingFishFABStripeAPIFAB == null) {
                    break;
                }
                if ((catchingFishFABStripeAPIFAB.CatchingFishWorkManager & 8) != 0) {
                    for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB; catchingFishFABStripeAPIFAB2 != null; catchingFishFABStripeAPIFAB2 = null) {
                        if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishCameraXService) {
                            obj = catchingFishFABStripeAPIFAB2;
                            break loop0;
                        }
                    }
                }
                if ((catchingFishFABStripeAPIFAB.CatchingFishViewModelScope & 8) == 0) {
                    break;
                }
                catchingFishFABStripeAPIFAB = catchingFishFABStripeAPIFAB.CatchingFishLayout;
            }
        }
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(obj);
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = ((CatchingFishFABStripeAPIFAB) ((CatchingFishCameraXService) obj)).CatchingFishReduxKtor;
        CatchingFishMVPMotionLayout CatchingFish = catchingFishBiometricRoom.CatchingFish();
        if (CatchingFish == null) {
            CatchingFish = new CatchingFishMVPMotionLayout();
        }
        return new CatchingFishMVIGraphQLHilt(catchingFishFABStripeAPIFAB3, z, catchingFishBiometricRoom, CatchingFish);
    }

    public static String CatchingFishStateFlow(String str, int i, int i2) {
        if (i < 0) {
            return CatchingFishKtorViewModel.CatchingFishCustomView("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return CatchingFishKtorViewModel.CatchingFishCustomView("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final CatchingFishLiveDataToolbar CatchingFishViewModelFAB(Throwable th) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(th, "exception");
        return new CatchingFishLiveDataToolbar(th);
    }

    public Typeface CatchingFishCloudMessaging(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public float CatchingFishDaggerHiltFAB(View view) {
        if (CatchingFishCoroutine) {
            try {
                return CatchingFishRoomContext.CatchingFishParcelableFAB(view);
            } catch (NoSuchMethodError unused) {
                CatchingFishCoroutine = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void CatchingFishEspressoMockk(View view, float f, float f2);

    public Typeface CatchingFishEspressoTesting(Context context, Resources resources, int i, String str, int i2) {
        File CatchingFishStateLiveData = CatchingFishKtorViewModel.CatchingFishStateLiveData(context);
        if (CatchingFishStateLiveData == null) {
            return null;
        }
        try {
            if (CatchingFishKtorViewModel.CatchingFishWorkManager(CatchingFishStateLiveData, resources, i)) {
                return Typeface.createFromFile(CatchingFishStateLiveData.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            CatchingFishStateLiveData.delete();
        }
    }

    public abstract void CatchingFishFragmentFactory(int i);

    public abstract Typeface CatchingFishFragmentHandler(Context context, CatchingFishRetrofitHiltFAB[] catchingFishRetrofitHiltFABArr, int i);

    public void CatchingFishHandler(View view, float f) {
        if (CatchingFishCoroutine) {
            try {
                CatchingFishRoomContext.CatchingFishSnackbar(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                CatchingFishCoroutine = false;
            }
        }
        view.setAlpha(f);
    }

    public abstract Typeface CatchingFishLayout(Context context, CatchingFishFABSnackbarMVVM catchingFishFABSnackbarMVVM, Resources resources, int i);

    public abstract void CatchingFishMutableLiveData(Typeface typeface, boolean z);

    public abstract boolean CatchingFishParcelable(View view, int i);

    public int CatchingFishParcelableFlux() {
        return 0;
    }

    public void CatchingFishPayPalLiveData(View view, int i) {
        if (!CatchingFishDaggerWebsocket) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                CatchingFishReduxKtor = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            CatchingFishDaggerWebsocket = true;
        }
        Field field = CatchingFishReduxKtor;
        if (field != null) {
            try {
                CatchingFishReduxKtor.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void CatchingFishPayPalService(int i);

    public abstract void CatchingFishSensorManager(View view, int i, int i2);

    public int CatchingFishSpannableWidget(View view) {
        return 0;
    }

    public abstract int CatchingFishStateLiveData(String str, byte[] bArr, int i, int i2);

    public abstract String CatchingFishUnitTesting(byte[] bArr, int i, int i2);

    public abstract int CatchingFishViewModelScope(View view, int i);

    public abstract int CatchingFishWorkManager(View view, int i);

    public void CatchingFishJobScheduler(View view, int i) {
    }
}
