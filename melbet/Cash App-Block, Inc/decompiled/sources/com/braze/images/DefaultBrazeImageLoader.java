package com.braze.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.widget.ImageView;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.j0;
import bo.app.k0;
import bo.app.m4;
import bo.app.n4;
import bo.app.o4;
import bo.app.r4;
import bo.app.t7$$ExternalSyntheticLambda4;
import com.braze.Braze$$ExternalSyntheticLambda34;
import com.braze.Braze$$ExternalSyntheticLambda82;
import com.braze.BrazeUser$$ExternalSyntheticLambda9;
import com.braze.R$string;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.b$$ExternalSyntheticLambda1;
import com.braze.ui.actions.UriAction$$ExternalSyntheticLambda4;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.JobKt;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0001RB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J3\u0010'\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"2\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0%\u0018\u00010$H\u0007¢\u0006\u0004\b'\u0010(J+\u0010)\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b)\u0010*J+\u0010,\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u0004\u0018\u00010\u00172\u0006\u0010.\u001a\u00020\bH\u0007¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u0004\u0018\u00010\u00172\u0006\u0010.\u001a\u00020\bH\u0007¢\u0006\u0004\b1\u00100J\u0019\u00102\u001a\u0004\u0018\u00010\u00172\u0006\u0010.\u001a\u00020\bH\u0007¢\u0006\u0004\b2\u00100J'\u00105\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\b2\u0006\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u001cH\u0007¢\u0006\u0004\b5\u00106J1\u00109\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b7\u00108J1\u0010:\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b:\u0010;J'\u0010=\u001a\n <*\u0004\u0018\u00010\u00170\u00172\u0006\u0010.\u001a\u00020\b2\u0006\u00103\u001a\u00020\u0017H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b?\u0010\u0005R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR#\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170C8\u0007¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR$\u0010L\u001a\u00020\u001c2\u0006\u0010K\u001a\u00020\u001c8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bL\u0010NR\u0014\u0010\u001d\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010P¨\u0006S"}, d2 = {"Lcom/braze/images/DefaultBrazeImageLoader;", "Lcom/braze/images/IBrazeImageLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/braze/models/cards/Card;", "card", "", "imageUrl", "Landroid/widget/ImageView;", "imageView", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "", "renderUrlIntoCardView", "(Landroid/content/Context;Lcom/braze/models/cards/Card;Ljava/lang/String;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;)V", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "renderUrlIntoInAppMessageView", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;)V", "Landroid/os/Bundle;", "extras", "Landroid/graphics/Bitmap;", "getPushBitmapFromUrl", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;Lcom/braze/enums/BrazeViewBounds;)Landroid/graphics/Bitmap;", "getInAppMessageBitmapFromUrl", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;Lcom/braze/enums/BrazeViewBounds;)Landroid/graphics/Bitmap;", "", "isOffline", "setOffline", "(Z)V", "shutdown", "()V", "Landroid/net/Uri;", "imageUri", "", "", "headers", "shouldSkipCaching", "(Landroid/net/Uri;Ljava/util/Map;)Z", "getBitmapFromUrl", "(Landroid/content/Context;Ljava/lang/String;Lcom/braze/enums/BrazeViewBounds;)Landroid/graphics/Bitmap;", "Lbo/app/j0;", "downloadBitmapFromUrl", "(Landroid/content/Context;Landroid/net/Uri;Lcom/braze/enums/BrazeViewBounds;)Lbo/app/j0;", "key", "getBitmapFromCache", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "getBitmapFromMemCache", "getBitmapFromDiskCache", "bitmap", "skipDiskCache", "putBitmapIntoCache", "(Ljava/lang/String;Landroid/graphics/Bitmap;Z)V", "renderUrlIntoViewTask$android_sdk_base_release", "(Landroid/content/Context;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;Ljava/lang/String;)V", "renderUrlIntoViewTask", "renderUrlIntoView", "(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;)V", "kotlin.jvm.PlatformType", "putBitmapIntoMemCache", "(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "initDiskCacheTask", "Ljava/util/concurrent/locks/ReentrantLock;", "diskCacheLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroid/util/LruCache;", "memoryCache", "Landroid/util/LruCache;", "getMemoryCache", "()Landroid/util/LruCache;", "Lbo/app/k0;", "diskLruCache", "Lbo/app/k0;", "value", "isDiskCacheStarting", "Z", "()Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "bo/app/n4", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultBrazeImageLoader implements IBrazeImageLoader {
    public static final n4 Companion = new n4();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) DefaultBrazeImageLoader.class);
    private final ReentrantLock diskCacheLock;
    private k0 diskLruCache;
    private boolean isDiskCacheStarting;
    private final AtomicBoolean isOffline;
    private final LruCache<String, Bitmap> memoryCache;

    public DefaultBrazeImageLoader(Context context) {
        context.getClass();
        this.diskCacheLock = new ReentrantLock();
        this.isDiskCacheStarting = true;
        this.isOffline = new AtomicBoolean(false);
        this.memoryCache = new m4(BrazeImageUtils.getImageLoaderCacheSize());
        initDiskCacheTask(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromCache$lambda$0$0(String str, DefaultBrazeImageLoader defaultBrazeImageLoader) {
        return "Got bitmap from mem cache for key " + str + "\nMemory cache stats: " + defaultBrazeImageLoader.memoryCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromCache$lambda$1$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Got bitmap from disk cache for key ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromCache$lambda$2(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("No cache hit for bitmap: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromDiskCache$lambda$0$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Disk cache still starting. Cannot retrieve key from disk cache: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromDiskCache$lambda$0$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Getting bitmap from disk cache for key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromUrl$lambda$0() {
        return "Cannot retrieve bitmap with blank image url";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromUrl$lambda$2() {
        return "Cache is currently in offline mode. Not downloading bitmap.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromUrl$lambda$3(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to get bitmap from url. Url: ", str);
    }

    private final void initDiskCacheTask(Context context) {
        JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new o4(context, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String putBitmapIntoCache$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Adding bitmap to mem cache for key ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String putBitmapIntoCache$lambda$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Skipping disk cache for key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String putBitmapIntoCache$lambda$2$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Adding bitmap to disk cache for key ", str);
    }

    private final Bitmap putBitmapIntoMemCache(String key, Bitmap bitmap) {
        return this.memoryCache.put(key, bitmap);
    }

    private final void renderUrlIntoView(Context context, String imageUrl, ImageView imageView, BrazeViewBounds viewBounds) {
        if (StringsKt.isBlank(imageUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(20), 7, (Object) null);
            return;
        }
        try {
            renderUrlIntoViewTask$android_sdk_base_release(context, imageView, viewBounds, imageUrl);
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th, false, (Function0) new Braze$$ExternalSyntheticLambda82(imageUrl, 29), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderUrlIntoView$lambda$0() {
        return "Cannot retrieve bitmap with a blank image url";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderUrlIntoView$lambda$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to render url into view. Url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setOffline$lambda$0(boolean z) {
        return "DefaultBrazeImageLoader outbound network requests are now ".concat(z ? "disabled" : "enabled");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String shouldSkipCaching$lambda$0(Uri uri) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(uri, "Image url specifies that it should not be cached. Not caching ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String shouldSkipCaching$lambda$2$1(Map.Entry entry, Uri uri) {
        return "Headers specify that this image should not be cached (" + entry + "). Not caching " + uri;
    }

    public final j0 downloadBitmapFromUrl(Context context, Uri imageUri, BrazeViewBounds viewBounds) {
        context.getClass();
        imageUri.getClass();
        if (viewBounds == null) {
            viewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return BrazeImageUtils.getBitmap(context, imageUri, viewBounds);
    }

    public final Bitmap getBitmapFromCache(String key) {
        key.getClass();
        Bitmap bitmap = this.memoryCache.get(key);
        if (bitmap != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new t7$$ExternalSyntheticLambda4(12, key, this), 6, (Object) null);
            return bitmap;
        }
        Bitmap bitmapFromDiskCache = getBitmapFromDiskCache(key);
        if (bitmapFromDiskCache == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(key, 3), 7, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(key, 2), 6, (Object) null);
        putBitmapIntoMemCache(key, bitmapFromDiskCache);
        return bitmapFromDiskCache;
    }

    public final Bitmap getBitmapFromDiskCache(String key) {
        key.getClass();
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            if (this.isDiskCacheStarting) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda82(key, 27), 6, (Object) null);
            } else {
                k0 k0Var = this.diskLruCache;
                if (k0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    throw null;
                }
                if (k0Var.a(key)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda82(key, 28), 6, (Object) null);
                    k0 k0Var2 = this.diskLruCache;
                    if (k0Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                        throw null;
                    }
                    Bitmap b = k0Var2.b(key);
                    reentrantLock.unlock();
                    return b;
                }
            }
            reentrantLock.unlock();
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Bitmap getBitmapFromMemCache(String key) {
        key.getClass();
        return this.memoryCache.get(key);
    }

    public final Bitmap getBitmapFromUrl(Context context, String imageUrl, BrazeViewBounds viewBounds) {
        context.getClass();
        imageUrl.getClass();
        if (StringsKt.isBlank(imageUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(21), 7, (Object) null);
            return null;
        }
        try {
            Bitmap bitmapFromCache = getBitmapFromCache(imageUrl);
            if (bitmapFromCache != null) {
                return bitmapFromCache;
            }
            if (this.isOffline.get()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(22), 7, (Object) null);
                return null;
            }
            Uri parse = Uri.parse(imageUrl);
            j0 downloadBitmapFromUrl = downloadBitmapFromUrl(context, parse, viewBounds);
            if (downloadBitmapFromUrl.a == null) {
                return null;
            }
            if (!shouldSkipCaching(parse, downloadBitmapFromUrl.b)) {
                putBitmapIntoCache(imageUrl, downloadBitmapFromUrl.a, BrazeFileUtils.isLocalUri(parse));
            }
            return downloadBitmapFromUrl.a;
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th, false, (Function0) new b$$ExternalSyntheticLambda1(imageUrl, 1), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getInAppMessageBitmapFromUrl(Context context, IInAppMessage inAppMessage, String imageUrl, BrazeViewBounds viewBounds) {
        context.getClass();
        inAppMessage.getClass();
        imageUrl.getClass();
        return getBitmapFromUrl(context, imageUrl, viewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getPushBitmapFromUrl(Context context, Bundle extras, String imageUrl, BrazeViewBounds viewBounds) {
        context.getClass();
        imageUrl.getClass();
        return getBitmapFromUrl(context, imageUrl, viewBounds);
    }

    public final void putBitmapIntoCache(String key, Bitmap bitmap, boolean skipDiskCache) {
        key.getClass();
        bitmap.getClass();
        if (getBitmapFromMemCache(key) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(key, 4), 7, (Object) null);
            this.memoryCache.put(key, bitmap);
        }
        if (skipDiskCache) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda82(key, 25), 7, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            if (!this.isDiskCacheStarting) {
                k0 k0Var = this.diskLruCache;
                if (k0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    throw null;
                }
                if (!k0Var.a(key)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda82(key, 26), 7, (Object) null);
                    k0 k0Var2 = this.diskLruCache;
                    if (k0Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                        throw null;
                    }
                    k0Var2.a(key, bitmap);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoCardView(Context context, Card card, String imageUrl, ImageView imageView, BrazeViewBounds viewBounds) {
        context.getClass();
        card.getClass();
        imageUrl.getClass();
        imageView.getClass();
        renderUrlIntoView(context, imageUrl, imageView, viewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoInAppMessageView(Context context, IInAppMessage inAppMessage, String imageUrl, ImageView imageView, BrazeViewBounds viewBounds) {
        context.getClass();
        inAppMessage.getClass();
        imageUrl.getClass();
        imageView.getClass();
        renderUrlIntoView(context, imageUrl, imageView, viewBounds);
    }

    public final void renderUrlIntoViewTask$android_sdk_base_release(Context context, ImageView imageView, BrazeViewBounds viewBounds, String imageUrl) {
        context.getClass();
        imageView.getClass();
        imageUrl.getClass();
        imageView.setTag(R$string.com_braze_image_lru_cache_image_url_key, imageUrl);
        JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new r4(this, context, imageUrl, viewBounds, imageView, null), 3);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void setOffline(boolean isOffline) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda34(isOffline, 6), 6, (Object) null);
        this.isOffline.set(isOffline);
    }

    public final boolean shouldSkipCaching(Uri imageUri, Map<String, ? extends List<String>> headers) {
        imageUri.getClass();
        int i = 1;
        if (!imageUri.getBooleanQueryParameter("cache", true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new UriAction$$ExternalSyntheticLambda4(imageUri, i), 7, (Object) null);
            return true;
        }
        if (headers == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : headers.entrySet()) {
            if (StringsKt__StringsJVMKt.equals(entry.getKey(), "cache-control", true)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Iterable<String> iterable = (Iterable) entry2.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (String str : iterable) {
                    if (StringsKt.contains((CharSequence) str, (CharSequence) "no-cache", true) || StringsKt.contains((CharSequence) str, (CharSequence) "max-age=0", true)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new t7$$ExternalSyntheticLambda4(11, entry2, imageUri), 7, (Object) null);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void shutdown() {
        super.shutdown();
        setOffline(true);
        k0 k0Var = this.diskLruCache;
        if (k0Var != null) {
            k0Var.a();
        }
    }
}
