package kotlin.text;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class CatchingFishReduxOkHttpMVI extends CatchingFishStateFlowIntent {
    public final Method CatchingFishAnimationMockk;
    public final Class CatchingFishCloudMessaging;
    public final Constructor CatchingFishEspressoTesting;
    public final Method CatchingFishOkHttp;
    public final Method CatchingFishRoomDatabase;
    public final Method CatchingFishStateLiveData;
    public final Method CatchingFishUnitTesting;

    public CatchingFishReduxOkHttpMVI() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = CatchingFishAndroidX(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = CatchingFishNavigationGson(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.CatchingFishCloudMessaging = cls;
        this.CatchingFishEspressoTesting = constructor;
        this.CatchingFishOkHttp = method2;
        this.CatchingFishUnitTesting = method3;
        this.CatchingFishAnimationMockk = method4;
        this.CatchingFishStateLiveData = method5;
        this.CatchingFishRoomDatabase = method;
    }

    public static Method CatchingFishAndroidX(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final Typeface CatchingFishEspressoTesting(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        if (this.CatchingFishOkHttp == null) {
            return super.CatchingFishEspressoTesting(context, resources, i, str, i2);
        }
        try {
            obj = this.CatchingFishEspressoTesting.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!CatchingFishMVVMAppCompat(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.CatchingFishStateLiveData.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (CatchingFishMoshiDaggerHilt(obj)) {
                return CatchingFishStripeAPI(obj);
            }
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishStateFlowIntent, kotlin.text.CatchingFishDaggerBiometric
    public final Typeface CatchingFishFragmentHandler(Context context, CatchingFishRetrofitHiltFAB[] catchingFishRetrofitHiltFABArr, int i) {
        Object obj;
        Typeface CatchingFishStripeAPI;
        boolean z;
        if (catchingFishRetrofitHiltFABArr.length >= 1) {
            try {
                if (this.CatchingFishOkHttp != null) {
                    HashMap hashMap = new HashMap();
                    for (CatchingFishRetrofitHiltFAB catchingFishRetrofitHiltFAB : catchingFishRetrofitHiltFABArr) {
                        if (catchingFishRetrofitHiltFAB.CatchingFishWorkManager == 0) {
                            Uri uri = catchingFishRetrofitHiltFAB.CatchingFishParcelableFAB;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, CatchingFishKtorViewModel.CatchingFishJetpackCompose(uri, context));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.CatchingFishEspressoTesting.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = catchingFishRetrofitHiltFABArr.length;
                        int i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method = this.CatchingFishStateLiveData;
                            if (i2 < length) {
                                CatchingFishRetrofitHiltFAB catchingFishRetrofitHiltFAB2 = catchingFishRetrofitHiltFABArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(catchingFishRetrofitHiltFAB2.CatchingFishParcelableFAB);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.CatchingFishUnitTesting.invoke(obj, byteBuffer, Integer.valueOf(catchingFishRetrofitHiltFAB2.CatchingFishSnackbar), null, Integer.valueOf(catchingFishRetrofitHiltFAB2.CatchingFishCoroutine), Integer.valueOf(catchingFishRetrofitHiltFAB2.CatchingFishReduxKtor ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i2++;
                                z2 = z2;
                            } else if (!z2) {
                                method.invoke(obj, null);
                            } else if (CatchingFishMoshiDaggerHilt(obj) && (CatchingFishStripeAPI = CatchingFishStripeAPI(obj)) != null) {
                                return Typeface.create(CatchingFishStripeAPI, i);
                            }
                        }
                    }
                } else {
                    CatchingFishRetrofitHiltFAB CatchingFishRoomDatabase = CatchingFishDaggerBiometric.CatchingFishRoomDatabase(catchingFishRetrofitHiltFABArr, i);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(CatchingFishRoomDatabase.CatchingFishParcelableFAB, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(CatchingFishRoomDatabase.CatchingFishCoroutine).setItalic(CatchingFishRoomDatabase.CatchingFishReduxKtor).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishStateFlowIntent, kotlin.text.CatchingFishDaggerBiometric
    public final Typeface CatchingFishLayout(Context context, CatchingFishFABSnackbarMVVM catchingFishFABSnackbarMVVM, Resources resources, int i) {
        Object obj;
        if (this.CatchingFishOkHttp == null) {
            return super.CatchingFishLayout(context, catchingFishFABSnackbarMVVM, resources, i);
        }
        try {
            obj = this.CatchingFishEspressoTesting.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            CatchingFishFirebaseFAB[] catchingFishFirebaseFABArr = catchingFishFABSnackbarMVVM.CatchingFishParcelableFAB;
            int length = catchingFishFirebaseFABArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    CatchingFishFirebaseFAB catchingFishFirebaseFAB = catchingFishFirebaseFABArr[i2];
                    Context context2 = context;
                    if (CatchingFishMVVMAppCompat(context2, obj, catchingFishFirebaseFAB.CatchingFishParcelableFAB, catchingFishFirebaseFAB.CatchingFishDaggerWebsocket, catchingFishFirebaseFAB.CatchingFishSnackbar, catchingFishFirebaseFAB.CatchingFishCoroutine ? 1 : 0, FontVariationAxis.fromFontVariationSettings(catchingFishFirebaseFAB.CatchingFishReduxKtor))) {
                        i2++;
                        context = context2;
                    } else {
                        try {
                            this.CatchingFishStateLiveData.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (CatchingFishMoshiDaggerHilt(obj)) {
                    return CatchingFishStripeAPI(obj);
                }
            }
        }
        return null;
    }

    public final boolean CatchingFishMVVMAppCompat(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.CatchingFishOkHttp.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean CatchingFishMoshiDaggerHilt(Object obj) {
        try {
            return ((Boolean) this.CatchingFishAnimationMockk.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method CatchingFishNavigationGson(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Typeface CatchingFishStripeAPI(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.CatchingFishCloudMessaging, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.CatchingFishRoomDatabase.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
