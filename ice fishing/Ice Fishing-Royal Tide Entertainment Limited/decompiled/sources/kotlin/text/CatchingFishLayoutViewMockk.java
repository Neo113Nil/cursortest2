package kotlin.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishLayoutViewMockk extends CatchingFishDaggerBiometric {
    public static final Method CatchingFishLayout;
    public static final Method CatchingFishViewModelFAB;
    public static final Constructor CatchingFishViewModelScope;
    public static final Class CatchingFishWorkManager;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        CatchingFishViewModelScope = constructor;
        CatchingFishWorkManager = cls;
        CatchingFishViewModelFAB = method2;
        CatchingFishLayout = method;
    }

    public static Typeface CatchingFishAnimation(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) CatchingFishWorkManager, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) CatchingFishLayout.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean CatchingFishJUnitRealm(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) CatchingFishViewModelFAB.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final Typeface CatchingFishFragmentHandler(Context context, CatchingFishRetrofitHiltFAB[] catchingFishRetrofitHiltFABArr, int i) {
        Object obj;
        try {
            obj = CatchingFishViewModelScope.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i2 = 0;
            CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = new CatchingFishGraphQLRealmFAB(0);
            int length = catchingFishRetrofitHiltFABArr.length;
            while (true) {
                if (i2 < length) {
                    CatchingFishRetrofitHiltFAB catchingFishRetrofitHiltFAB = catchingFishRetrofitHiltFABArr[i2];
                    Uri uri = catchingFishRetrofitHiltFAB.CatchingFishParcelableFAB;
                    ByteBuffer byteBuffer = (ByteBuffer) catchingFishGraphQLRealmFAB.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = CatchingFishKtorViewModel.CatchingFishJetpackCompose(uri, context);
                        catchingFishGraphQLRealmFAB.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !CatchingFishJUnitRealm(obj, byteBuffer, catchingFishRetrofitHiltFAB.CatchingFishSnackbar, catchingFishRetrofitHiltFAB.CatchingFishCoroutine, catchingFishRetrofitHiltFAB.CatchingFishReduxKtor)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface CatchingFishAnimation = CatchingFishAnimation(obj);
                    if (CatchingFishAnimation != null) {
                        return Typeface.create(CatchingFishAnimation, i);
                    }
                }
            }
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final Typeface CatchingFishLayout(Context context, CatchingFishFABSnackbarMVVM catchingFishFABSnackbarMVVM, Resources resources, int i) {
        Object obj;
        int i2;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = CatchingFishViewModelScope.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (CatchingFishFirebaseFAB catchingFishFirebaseFAB : catchingFishFABSnackbarMVVM.CatchingFishParcelableFAB) {
                int i3 = catchingFishFirebaseFAB.CatchingFishWorkManager;
                File CatchingFishStateLiveData = CatchingFishKtorViewModel.CatchingFishStateLiveData(context);
                if (CatchingFishStateLiveData != null) {
                    try {
                        if (CatchingFishKtorViewModel.CatchingFishWorkManager(CatchingFishStateLiveData, resources, i3)) {
                            try {
                                fileInputStream = new FileInputStream(CatchingFishStateLiveData);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i2 = (mappedByteBuffer != null && CatchingFishJUnitRealm(obj, mappedByteBuffer, catchingFishFirebaseFAB.CatchingFishDaggerWebsocket, catchingFishFirebaseFAB.CatchingFishSnackbar, catchingFishFirebaseFAB.CatchingFishCoroutine)) ? i2 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        CatchingFishStateLiveData.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return CatchingFishAnimation(obj);
        }
        return null;
    }
}
