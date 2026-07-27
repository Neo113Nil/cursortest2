package kotlin.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class CatchingFishAsyncTaskMVI {
    public static final Object CatchingFishCoroutine;
    public static final CatchingFishGsonIntent CatchingFishParcelableFAB = new CatchingFishGsonIntent(16);
    public static final CatchingFishGraphQLRealmFAB CatchingFishReduxKtor;
    public static final ThreadPoolExecutor CatchingFishSnackbar;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new CatchingFishAnimationJUnit());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        CatchingFishSnackbar = threadPoolExecutor;
        CatchingFishCoroutine = new Object();
        CatchingFishReduxKtor = new CatchingFishGraphQLRealmFAB(0);
    }

    public static String CatchingFishParcelableFAB(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((CatchingFishViewAsyncTask) list.get(i2)).CatchingFishViewModelScope);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CatchingFishLayoutBiometric CatchingFishSnackbar(String str, Context context, List list, int i) {
        Typeface typeface;
        int i2;
        Typeface CatchingFishFragmentHandler;
        CatchingFishGsonIntent catchingFishGsonIntent = CatchingFishParcelableFAB;
        CatchingFishDaggerBiometric.CatchingFishDaggerWebsocket("getFontSync");
        try {
            typeface = (Typeface) catchingFishGsonIntent.CatchingFishWorkManager(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new CatchingFishLayoutBiometric(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new CatchingFishLayoutBiometric(typeface);
        }
        CatchingFishRoomManifest CatchingFishParcelableFAB2 = CatchingFishGsonStateFlow.CatchingFishParcelableFAB(context, list);
        List list2 = (List) CatchingFishParcelableFAB2.CatchingFishDaggerWebsocket;
        int i3 = CatchingFishParcelableFAB2.CatchingFishReduxKtor;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = -2;
                if (i2 == 0) {
                    return new CatchingFishLayoutBiometric(i2);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    CatchingFishRetrofitHiltFAB[] catchingFishRetrofitHiltFABArr = (CatchingFishRetrofitHiltFAB[]) list2.get(0);
                    CatchingFishDaggerBiometric catchingFishDaggerBiometric = CatchingFishGraphQLAdMob.CatchingFishParcelableFAB;
                    CatchingFishDaggerBiometric.CatchingFishDaggerWebsocket("TypefaceCompat.createFromFontInfo");
                    CatchingFishFragmentHandler = CatchingFishGraphQLAdMob.CatchingFishParcelableFAB.CatchingFishFragmentHandler(context, catchingFishRetrofitHiltFABArr, i);
                    Trace.endSection();
                    if (CatchingFishFragmentHandler != null) {
                        return new CatchingFishLayoutBiometric(-3);
                    }
                    catchingFishGsonIntent.CatchingFishFragmentHandler(str, CatchingFishFragmentHandler);
                    return new CatchingFishLayoutBiometric(CatchingFishFragmentHandler);
                }
                CatchingFishDaggerBiometric catchingFishDaggerBiometric2 = CatchingFishGraphQLAdMob.CatchingFishParcelableFAB;
                CatchingFishDaggerBiometric.CatchingFishDaggerWebsocket("TypefaceCompat.createFromFontInfoWithFallback");
                CatchingFishFragmentHandler = CatchingFishGraphQLAdMob.CatchingFishParcelableFAB.CatchingFishCloudMessaging(context, list2, i);
                Trace.endSection();
                if (CatchingFishFragmentHandler != null) {
                }
            }
            i2 = -3;
            if (i2 == 0) {
            }
        } else {
            CatchingFishRetrofitHiltFAB[] catchingFishRetrofitHiltFABArr2 = (CatchingFishRetrofitHiltFAB[]) list2.get(0);
            if (catchingFishRetrofitHiltFABArr2 != null && catchingFishRetrofitHiltFABArr2.length != 0) {
                int length = catchingFishRetrofitHiltFABArr2.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i2 = 0;
                        break;
                    }
                    int i5 = catchingFishRetrofitHiltFABArr2[i4].CatchingFishWorkManager;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i2 = i5;
                    }
                }
                if (i2 == 0) {
                }
            }
            i2 = 1;
            if (i2 == 0) {
            }
        }
    }
}
