package com.google.android.datatransport;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowSessionManagerService {
    public static final WinterFlowParserRequest WinterFlowArrayNetwork;
    public static final Object WinterFlowCacheManagerAgent;
    public static final ThreadPoolExecutor WinterFlowHookDataSource;
    public static final WinterFlowThreadNode WinterFlowRouterStructure = new WinterFlowThreadNode(16);

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new WinterFlowInheritanceAgent());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        WinterFlowHookDataSource = threadPoolExecutor;
        WinterFlowCacheManagerAgent = new Object();
        WinterFlowArrayNetwork = new WinterFlowParserRequest(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static WinterFlowSchedulerEventEmitter WinterFlowRouterStructure(String str, Context context, List list) {
        Typeface typeface;
        int i;
        Typeface WinterFlowServerProtocol;
        WinterFlowThreadNode winterFlowThreadNode = WinterFlowRouterStructure;
        WinterFlowHookProcessor.WinterFlowTransactionManagerStrategy("getFontSync");
        try {
            typeface = (Typeface) winterFlowThreadNode.WinterFlowCacheManagerAgent(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new WinterFlowSchedulerEventEmitter(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new WinterFlowSchedulerEventEmitter(typeface);
        }
        WinterFlowSyntax WinterFlowRouterStructure2 = WinterFlowUIDecorator.WinterFlowRouterStructure(context, list);
        List list2 = (List) WinterFlowRouterStructure2.WinterFlowHookDataSource;
        int i2 = WinterFlowRouterStructure2.WinterFlowRouterStructure;
        if (i2 != 0) {
            if (i2 == 1) {
                i = -2;
                if (i == 0) {
                    return new WinterFlowSchedulerEventEmitter(i);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    WinterFlowLibraryEntity[] winterFlowLibraryEntityArr = (WinterFlowLibraryEntity[]) list2.get(0);
                    WinterFlowDecoratorUI winterFlowDecoratorUI = WinterFlowAlgorithmProxy.WinterFlowRouterStructure;
                    WinterFlowHookProcessor.WinterFlowTransactionManagerStrategy("TypefaceCompat.createFromFontInfo");
                    WinterFlowServerProtocol = WinterFlowAlgorithmProxy.WinterFlowRouterStructure.WinterFlowServerProtocol(context, winterFlowLibraryEntityArr);
                    Trace.endSection();
                    if (WinterFlowServerProtocol != null) {
                        return new WinterFlowSchedulerEventEmitter(-3);
                    }
                    winterFlowThreadNode.WinterFlowArrayNetwork(str, WinterFlowServerProtocol);
                    return new WinterFlowSchedulerEventEmitter(WinterFlowServerProtocol);
                }
                WinterFlowDecoratorUI winterFlowDecoratorUI2 = WinterFlowAlgorithmProxy.WinterFlowRouterStructure;
                WinterFlowHookProcessor.WinterFlowTransactionManagerStrategy("TypefaceCompat.createFromFontInfoWithFallback");
                WinterFlowServerProtocol = WinterFlowAlgorithmProxy.WinterFlowRouterStructure.WinterFlowThreadListener(context, list2);
                Trace.endSection();
                if (WinterFlowServerProtocol != null) {
                }
            }
            i = -3;
            if (i == 0) {
            }
        } else {
            WinterFlowLibraryEntity[] winterFlowLibraryEntityArr2 = (WinterFlowLibraryEntity[]) list2.get(0);
            if (winterFlowLibraryEntityArr2 != null && winterFlowLibraryEntityArr2.length != 0) {
                int length = winterFlowLibraryEntityArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i = 0;
                        break;
                    }
                    int i4 = winterFlowLibraryEntityArr2[i3].WinterFlowTransactionManagerStrategy;
                    if (i4 == 0) {
                        i3++;
                    } else if (i4 >= 0) {
                        i = i4;
                    }
                }
                if (i == 0) {
                }
            }
            i = 1;
            if (i == 0) {
            }
        }
    }
}
