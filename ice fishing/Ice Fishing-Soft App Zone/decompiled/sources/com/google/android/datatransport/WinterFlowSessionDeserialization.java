package com.google.android.datatransport;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.icewinter.flow.winter.icecatch.R;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowSessionDeserialization extends WinterFlowDecoratorUI {
    public static Method WinterFlowResponseEngine = null;
    public static Class WinterFlowRouterRouter = null;
    public static boolean WinterFlowServerProtocol = false;
    public static Constructor WinterFlowSyntax;
    public static Method WinterFlowTransactionAgent;
    public final Method WinterFlowArrayNetwork;
    public final Method WinterFlowCacheManagerAgent;
    public final Constructor WinterFlowHookDataSource;
    public final Class WinterFlowRouterStructure;
    public final Method WinterFlowTransactionManagerStrategy;
    public final Method WinterFlowUnitTestResponse;
    public final Method WinterFlowVariableVersionControl;

    public WinterFlowSessionDeserialization() {
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
            method2 = WinterFlowSoftwareEngine(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = WinterFlowSyntaxSubsystem(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.WinterFlowRouterStructure = cls;
        this.WinterFlowHookDataSource = constructor;
        this.WinterFlowCacheManagerAgent = method2;
        this.WinterFlowArrayNetwork = method3;
        this.WinterFlowVariableVersionControl = method4;
        this.WinterFlowTransactionManagerStrategy = method5;
        this.WinterFlowUnitTestResponse = method;
    }

    public static boolean WinterFlowCacheManagerListener(Object obj, String str, int i, boolean z) {
        WinterFlowUserManagerUserManager();
        try {
            return ((Boolean) WinterFlowResponseEngine.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static Method WinterFlowSoftwareEngine(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public static void WinterFlowUserManagerUserManager() {
        Method method;
        Class<?> cls;
        Method method2;
        if (WinterFlowServerProtocol) {
            return;
        }
        WinterFlowServerProtocol = true;
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
        WinterFlowSyntax = constructor;
        WinterFlowRouterRouter = cls;
        WinterFlowResponseEngine = method2;
        WinterFlowTransactionAgent = method;
    }

    public Typeface WinterFlowPackageIDE(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.WinterFlowRouterStructure, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.WinterFlowUnitTestResponse.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorUI
    public final Typeface WinterFlowServerProtocol(Context context, WinterFlowLibraryEntity[] winterFlowLibraryEntityArr) {
        Object obj;
        Typeface WinterFlowPackageIDE;
        boolean z;
        if (winterFlowLibraryEntityArr.length >= 1) {
            try {
                if (this.WinterFlowCacheManagerAgent != null) {
                    HashMap hashMap = new HashMap();
                    for (WinterFlowLibraryEntity winterFlowLibraryEntity : winterFlowLibraryEntityArr) {
                        if (winterFlowLibraryEntity.WinterFlowTransactionManagerStrategy == 0) {
                            Uri uri = winterFlowLibraryEntity.WinterFlowRouterStructure;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, WinterFlowDecoratorRouter.WinterFlowSyntax(uri, context));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.WinterFlowHookDataSource.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = winterFlowLibraryEntityArr.length;
                        int i = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method = this.WinterFlowTransactionManagerStrategy;
                            if (i < length) {
                                WinterFlowLibraryEntity winterFlowLibraryEntity2 = winterFlowLibraryEntityArr[i];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(winterFlowLibraryEntity2.WinterFlowRouterStructure);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.WinterFlowArrayNetwork.invoke(obj, byteBuffer, Integer.valueOf(winterFlowLibraryEntity2.WinterFlowHookDataSource), null, Integer.valueOf(winterFlowLibraryEntity2.WinterFlowCacheManagerAgent), Integer.valueOf(winterFlowLibraryEntity2.WinterFlowArrayNetwork ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i++;
                                z2 = z2;
                            } else if (!z2) {
                                method.invoke(obj, null);
                            } else if (WinterFlowSoftwareProtocol(obj) && (WinterFlowPackageIDE = WinterFlowPackageIDE(obj)) != null) {
                                return Typeface.create(WinterFlowPackageIDE, 0);
                            }
                        }
                    }
                } else {
                    int i2 = Integer.MAX_VALUE;
                    WinterFlowLibraryEntity winterFlowLibraryEntity3 = null;
                    for (WinterFlowLibraryEntity winterFlowLibraryEntity4 : winterFlowLibraryEntityArr) {
                        int abs = (Math.abs(winterFlowLibraryEntity4.WinterFlowCacheManagerAgent - 400) * 2) + (winterFlowLibraryEntity4.WinterFlowArrayNetwork ? 1 : 0);
                        if (winterFlowLibraryEntity3 == null || i2 > abs) {
                            winterFlowLibraryEntity3 = winterFlowLibraryEntity4;
                            i2 = abs;
                        }
                    }
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(winterFlowLibraryEntity3.WinterFlowRouterStructure, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(winterFlowLibraryEntity3.WinterFlowCacheManagerAgent).setItalic(winterFlowLibraryEntity3.WinterFlowArrayNetwork).build();
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

    @Override // com.google.android.datatransport.WinterFlowDecoratorUI
    public final Typeface WinterFlowServiceUtility(Context context, Resources resources, String str) {
        Object obj;
        if (this.WinterFlowCacheManagerAgent != null) {
            try {
                obj = this.WinterFlowHookDataSource.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!WinterFlowStrategyTool(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.WinterFlowTransactionManagerStrategy.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (WinterFlowSoftwareProtocol(obj)) {
                    return WinterFlowPackageIDE(obj);
                }
            }
        } else {
            File WinterFlowTransactionManagerStrategy = WinterFlowDecoratorRouter.WinterFlowTransactionManagerStrategy(context);
            if (WinterFlowTransactionManagerStrategy != null) {
                try {
                    if (WinterFlowDecoratorRouter.WinterFlowArrayNetwork(WinterFlowTransactionManagerStrategy, resources, R.font.winter_app_font)) {
                        return Typeface.createFromFile(WinterFlowTransactionManagerStrategy.getPath());
                    }
                    return null;
                } catch (RuntimeException unused3) {
                    return null;
                } finally {
                    WinterFlowTransactionManagerStrategy.delete();
                }
            }
        }
        return null;
    }

    public final boolean WinterFlowSoftwareProtocol(Object obj) {
        try {
            return ((Boolean) this.WinterFlowVariableVersionControl.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean WinterFlowStrategyTool(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.WinterFlowCacheManagerAgent.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method WinterFlowSyntaxSubsystem(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorUI
    public final Typeface WinterFlowTransactionAgent(Context context, WinterFlowDecoratorView winterFlowDecoratorView, Resources resources) {
        Object obj;
        WinterFlowExceptionHook[] winterFlowExceptionHookArr = winterFlowDecoratorView.WinterFlowRouterStructure;
        int i = 0;
        if (this.WinterFlowCacheManagerAgent == null) {
            WinterFlowUserManagerUserManager();
            try {
                Object newInstance = WinterFlowSyntax.newInstance(null);
                for (WinterFlowExceptionHook winterFlowExceptionHook : winterFlowExceptionHookArr) {
                    File WinterFlowTransactionManagerStrategy = WinterFlowDecoratorRouter.WinterFlowTransactionManagerStrategy(context);
                    if (WinterFlowTransactionManagerStrategy != null) {
                        try {
                            if (!WinterFlowDecoratorRouter.WinterFlowArrayNetwork(WinterFlowTransactionManagerStrategy, resources, winterFlowExceptionHook.WinterFlowTransactionManagerStrategy)) {
                                return null;
                            }
                            if (!WinterFlowCacheManagerListener(newInstance, WinterFlowTransactionManagerStrategy.getPath(), winterFlowExceptionHook.WinterFlowHookDataSource, winterFlowExceptionHook.WinterFlowCacheManagerAgent)) {
                                return null;
                            }
                            WinterFlowTransactionManagerStrategy.delete();
                        } catch (RuntimeException unused) {
                            return null;
                        } finally {
                            WinterFlowTransactionManagerStrategy.delete();
                        }
                    }
                }
                WinterFlowUserManagerUserManager();
                try {
                    Object newInstance2 = Array.newInstance((Class<?>) WinterFlowRouterRouter, 1);
                    Array.set(newInstance2, 0, newInstance);
                    return (Typeface) WinterFlowTransactionAgent.invoke(null, newInstance2);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        try {
            obj = this.WinterFlowHookDataSource.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj != null) {
            int length = winterFlowExceptionHookArr.length;
            while (true) {
                if (i < length) {
                    WinterFlowExceptionHook winterFlowExceptionHook2 = winterFlowExceptionHookArr[i];
                    WinterFlowSessionDeserialization winterFlowSessionDeserialization = this;
                    Context context2 = context;
                    if (winterFlowSessionDeserialization.WinterFlowStrategyTool(context2, obj, winterFlowExceptionHook2.WinterFlowRouterStructure, winterFlowExceptionHook2.WinterFlowVariableVersionControl, winterFlowExceptionHook2.WinterFlowHookDataSource, winterFlowExceptionHook2.WinterFlowCacheManagerAgent ? 1 : 0, FontVariationAxis.fromFontVariationSettings(winterFlowExceptionHook2.WinterFlowArrayNetwork))) {
                        i++;
                        this = winterFlowSessionDeserialization;
                        context = context2;
                    } else {
                        try {
                            winterFlowSessionDeserialization.WinterFlowTransactionManagerStrategy.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                        }
                    }
                } else {
                    WinterFlowSessionDeserialization winterFlowSessionDeserialization2 = this;
                    if (winterFlowSessionDeserialization2.WinterFlowSoftwareProtocol(obj)) {
                        return winterFlowSessionDeserialization2.WinterFlowPackageIDE(obj);
                    }
                }
            }
        }
        return null;
    }
}
