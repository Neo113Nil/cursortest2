package ru.yandex.taxi.fragment.common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebChromeClient;
import androidx.core.content.FileProvider;
import defpackage.evu0;
import defpackage.jst;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.scc;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes9.dex */
public final class c {
    public Uri a;

    public static Intent c(WebChromeClient.FileChooserParams fileChooserParams) {
        Intent createIntent = fileChooserParams.createIntent();
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        if (acceptTypes == null || acceptTypes.length <= 1) {
            qv10.C(new Object[]{createIntent.getType()}, 1, "ShowFileChooser for MIME-type: %s", jst.e);
            return createIntent;
        }
        String[] strArr = new String[acceptTypes.length];
        int length = acceptTypes.length;
        for (int i = 0; i < length; i++) {
            strArr[i] = Intent.normalizeMimeType(acceptTypes[i]);
        }
        createIntent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        qv10.C(new Object[]{Arrays.toString(acceptTypes)}, 1, "ShowFileChooser for MIME-types: %s", jst.e);
        return createIntent;
    }

    public static Uri f(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        File[] listFiles = externalCacheDir.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        return FileProvider.getUriForFile(context, "ru.yandex.taxi.utils.fileprovider." + context.getPackageName(), File.createTempFile(UUID.randomUUID().toString(), ".jpg", externalCacheDir));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, a aVar, WebChromeClient.FileChooserParams fileChooserParams, ContinuationImpl continuationImpl) {
        FileChooserIntentFactory$createActionChooserIntent$1 fileChooserIntentFactory$createActionChooserIntent$1;
        int i;
        if (continuationImpl instanceof FileChooserIntentFactory$createActionChooserIntent$1) {
            fileChooserIntentFactory$createActionChooserIntent$1 = (FileChooserIntentFactory$createActionChooserIntent$1) continuationImpl;
            int i2 = fileChooserIntentFactory$createActionChooserIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fileChooserIntentFactory$createActionChooserIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fileChooserIntentFactory$createActionChooserIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fileChooserIntentFactory$createActionChooserIntent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fileChooserIntentFactory$createActionChooserIntent$1.L$0 = context;
                    fileChooserIntentFactory$createActionChooserIntent$1.L$1 = null;
                    fileChooserIntentFactory$createActionChooserIntent$1.L$2 = fileChooserParams;
                    fileChooserIntentFactory$createActionChooserIntent$1.label = 1;
                    obj = ((b) aVar).c(fileChooserIntentFactory$createActionChooserIntent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileChooserParams = (WebChromeClient.FileChooserParams) fileChooserIntentFactory$createActionChooserIntent$1.L$2;
                    context = (Context) fileChooserIntentFactory$createActionChooserIntent$1.L$0;
                    kotlin.b.b(obj);
                }
                Intent d = ((Boolean) obj).booleanValue() ? d(context) : null;
                Intent c = c(fileChooserParams);
                return d != null ? c : new Intent("android.intent.action.CHOOSER").putExtra("android.intent.extra.INTENT", c).putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{d});
            }
        }
        fileChooserIntentFactory$createActionChooserIntent$1 = new FileChooserIntentFactory$createActionChooserIntent$1(this, continuationImpl);
        Object obj2 = fileChooserIntentFactory$createActionChooserIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fileChooserIntentFactory$createActionChooserIntent$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
        Intent c2 = c(fileChooserParams);
        if (d != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, a aVar, WebChromeClient.FileChooserParams fileChooserParams, ContinuationImpl continuationImpl) {
        FileChooserIntentFactory$createCameraOrFileChooserIntent$1 fileChooserIntentFactory$createCameraOrFileChooserIntent$1;
        int i;
        Intent d;
        if (continuationImpl instanceof FileChooserIntentFactory$createCameraOrFileChooserIntent$1) {
            fileChooserIntentFactory$createCameraOrFileChooserIntent$1 = (FileChooserIntentFactory$createCameraOrFileChooserIntent$1) continuationImpl;
            int i2 = fileChooserIntentFactory$createCameraOrFileChooserIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fileChooserIntentFactory$createCameraOrFileChooserIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fileChooserIntentFactory$createCameraOrFileChooserIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fileChooserIntentFactory$createCameraOrFileChooserIntent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fileChooserIntentFactory$createCameraOrFileChooserIntent$1.L$0 = context;
                    fileChooserIntentFactory$createCameraOrFileChooserIntent$1.L$1 = null;
                    fileChooserIntentFactory$createCameraOrFileChooserIntent$1.L$2 = fileChooserParams;
                    fileChooserIntentFactory$createCameraOrFileChooserIntent$1.label = 1;
                    obj = ((b) aVar).c(fileChooserIntentFactory$createCameraOrFileChooserIntent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileChooserParams = (WebChromeClient.FileChooserParams) fileChooserIntentFactory$createCameraOrFileChooserIntent$1.L$2;
                    context = (Context) fileChooserIntentFactory$createCameraOrFileChooserIntent$1.L$0;
                    kotlin.b.b(obj);
                }
                return (!((Boolean) obj).booleanValue() || (d = d(context)) == null) ? c(fileChooserParams) : d;
            }
        }
        fileChooserIntentFactory$createCameraOrFileChooserIntent$1 = new FileChooserIntentFactory$createCameraOrFileChooserIntent$1(this, continuationImpl);
        Object obj2 = fileChooserIntentFactory$createCameraOrFileChooserIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fileChooserIntentFactory$createCameraOrFileChooserIntent$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
            return c(fileChooserParams);
        }
    }

    public final Intent d(Context context) {
        try {
            this.a = f(context);
            return new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", this.a);
        } catch (IOException e) {
            jst.e.k(e, "Unable to create temporary image file");
            return null;
        }
    }

    public final Object e(Context context, a aVar, WebChromeClient.FileChooserParams fileChooserParams, SuspendLambda suspendLambda) {
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        List g = scc.g("image/jpg", "image/jpeg", "image/*");
        for (String str : acceptTypes) {
            List list = g;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (evu0.y(str, (String) it.next(), false)) {
                        return a(context, aVar, fileChooserParams, suspendLambda);
                    }
                }
            }
        }
        return c(fileChooserParams);
    }
}
