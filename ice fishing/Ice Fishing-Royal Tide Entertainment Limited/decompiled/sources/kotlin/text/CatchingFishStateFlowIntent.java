package kotlin.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class CatchingFishStateFlowIntent extends CatchingFishDaggerBiometric {
    public static boolean CatchingFishFragmentHandler = false;
    public static Method CatchingFishLayout;
    public static Method CatchingFishViewModelFAB;
    public static Constructor CatchingFishViewModelScope;
    public static Class CatchingFishWorkManager;

    public static void CatchingFishAnimation() {
        Method method;
        Class<?> cls;
        Method method2;
        if (CatchingFishFragmentHandler) {
            return;
        }
        CatchingFishFragmentHandler = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        CatchingFishViewModelScope = constructor;
        CatchingFishWorkManager = cls;
        CatchingFishViewModelFAB = method2;
        CatchingFishLayout = method;
    }

    public static boolean CatchingFishJUnitRealm(Object obj, String str, int i, boolean z) {
        CatchingFishAnimation();
        try {
            return ((Boolean) CatchingFishViewModelFAB.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.text.CatchingFishDaggerBiometric
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface CatchingFishFragmentHandler(Context context, CatchingFishRetrofitHiltFAB[] catchingFishRetrofitHiltFABArr, int i) {
        File file;
        File CatchingFishStateLiveData;
        Typeface createFromFile;
        String readlink;
        if (catchingFishRetrofitHiltFABArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(CatchingFishDaggerBiometric.CatchingFishRoomDatabase(catchingFishRetrofitHiltFABArr, i).CatchingFishParcelableFAB, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile2 = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile2;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            CatchingFishStateLiveData = CatchingFishKtorViewModel.CatchingFishStateLiveData(context);
                            if (CatchingFishStateLiveData != null) {
                                try {
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    CatchingFishStateLiveData.delete();
                                    throw th;
                                }
                                if (CatchingFishKtorViewModel.CatchingFishViewModelScope(CatchingFishStateLiveData, fileInputStream)) {
                                    createFromFile = Typeface.createFromFile(CatchingFishStateLiveData.getPath());
                                    CatchingFishStateLiveData.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                CatchingFishStateLiveData.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        CatchingFishStateLiveData = CatchingFishKtorViewModel.CatchingFishStateLiveData(context);
                        if (CatchingFishStateLiveData != null) {
                        }
                        createFromFile = null;
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return createFromFile;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile22 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile22;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public Typeface CatchingFishLayout(Context context, CatchingFishFABSnackbarMVVM catchingFishFABSnackbarMVVM, Resources resources, int i) {
        CatchingFishAnimation();
        try {
            Object newInstance = CatchingFishViewModelScope.newInstance(null);
            for (CatchingFishFirebaseFAB catchingFishFirebaseFAB : catchingFishFABSnackbarMVVM.CatchingFishParcelableFAB) {
                File CatchingFishStateLiveData = CatchingFishKtorViewModel.CatchingFishStateLiveData(context);
                if (CatchingFishStateLiveData == null) {
                    return null;
                }
                try {
                    if (!CatchingFishKtorViewModel.CatchingFishWorkManager(CatchingFishStateLiveData, resources, catchingFishFirebaseFAB.CatchingFishWorkManager)) {
                        return null;
                    }
                    if (!CatchingFishJUnitRealm(newInstance, CatchingFishStateLiveData.getPath(), catchingFishFirebaseFAB.CatchingFishSnackbar, catchingFishFirebaseFAB.CatchingFishCoroutine)) {
                        return null;
                    }
                    CatchingFishStateLiveData.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    CatchingFishStateLiveData.delete();
                }
            }
            CatchingFishAnimation();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) CatchingFishWorkManager, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) CatchingFishLayout.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
