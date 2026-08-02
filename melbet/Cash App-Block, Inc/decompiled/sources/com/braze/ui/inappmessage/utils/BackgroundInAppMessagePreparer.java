package com.braze.ui.inappmessage.utils;

import android.content.Context;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.t7$$ExternalSyntheticLambda4;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.MessageType;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.models.inappmessage.IInAppMessageZippedAssetHtml;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.support.UriUtils$$ExternalSyntheticLambda2;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007J8\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0016\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/braze/ui/inappmessage/utils/BackgroundInAppMessagePreparer;", "", "<init>", "()V", "prepareInAppMessageForDisplay", "", "inAppMessageToPrepare", "Lcom/braze/models/inappmessage/IInAppMessage;", "prepareInAppMessage", "prepareInAppMessageWithZippedAssetHtml", "", "inAppMessageHtml", "Lcom/braze/models/inappmessage/IInAppMessageZippedAssetHtml;", "prepareInAppMessageWithBitmapDownload", "inAppMessage", "handleLocalImage", "localImageUrl", "", "inAppMessageWithImage", "Lcom/braze/models/inappmessage/IInAppMessageWithImage;", "imageLoader", "Lcom/braze/images/IBrazeImageLoader;", "applicationContext", "Landroid/content/Context;", "viewBounds", "Lcom/braze/enums/BrazeViewBounds;", "prepareInAppMessageWithHtml", "Lcom/braze/models/inappmessage/InAppMessageHtml;", "getViewBoundsByType", "displayPreparedInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BackgroundInAppMessagePreparer {
    public static final BackgroundInAppMessagePreparer INSTANCE = new BackgroundInAppMessagePreparer();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BackgroundInAppMessagePreparer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object displayPreparedInAppMessage(IInAppMessage iInAppMessage, Continuation<? super Unit> continuation) {
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        Object withContext = JobKt.withContext(MainDispatcherLoader.dispatcher, new BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2(iInAppMessage, null), continuation);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    private final BrazeViewBounds getViewBoundsByType(IInAppMessage inAppMessage) {
        int i = WhenMappings.$EnumSwitchMapping$0[inAppMessage.getMessageType().ordinal()];
        return i != 3 ? i != 4 ? BrazeViewBounds.NO_BOUNDS : BrazeViewBounds.IN_APP_MESSAGE_MODAL : BrazeViewBounds.IN_APP_MESSAGE_SLIDEUP;
    }

    private final boolean handleLocalImage(String localImageUrl, IInAppMessageWithImage inAppMessageWithImage, IBrazeImageLoader imageLoader, Context applicationContext, IInAppMessage inAppMessage, BrazeViewBounds viewBounds) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(localImageUrl, 23), 6, (Object) null);
        inAppMessageWithImage.setBitmap(imageLoader.getInAppMessageBitmapFromUrl(applicationContext, inAppMessage, localImageUrl, viewBounds));
        if (inAppMessageWithImage.getBitmap() != null) {
            inAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(localImageUrl, 24), 7, (Object) null);
        inAppMessageWithImage.setLocalImageUrl(null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLocalImage$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Passing in-app message local image url to image loader: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLocalImage$lambda$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Removing local image url from IAM since it could not be loaded. URL: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IInAppMessage prepareInAppMessage(IInAppMessage inAppMessageToPrepare) {
        if (inAppMessageToPrepare.isControl()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(4), 7, (Object) null);
            return inAppMessageToPrepare;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(11), 7, (Object) null);
        int i = WhenMappings.$EnumSwitchMapping$0[inAppMessageToPrepare.getMessageType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                prepareInAppMessageWithHtml((InAppMessageHtml) inAppMessageToPrepare);
                return inAppMessageToPrepare;
            }
            if (!prepareInAppMessageWithBitmapDownload(inAppMessageToPrepare)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(13), 6, (Object) null);
                return null;
            }
        } else if (!prepareInAppMessageWithZippedAssetHtml((IInAppMessageZippedAssetHtml) inAppMessageToPrepare)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(12), 6, (Object) null);
            return null;
        }
        return inAppMessageToPrepare;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$0() {
        return "Skipping in-app message preparation for control in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$1() {
        return "Starting asynchronous in-app message preparation for message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$2() {
        return "Html in-app message zip asset download failed. Cannot display in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$3() {
        return "In-app message image download failed. Cannot display in-app message.";
    }

    public static final void prepareInAppMessageForDisplay(IInAppMessage inAppMessageToPrepare) {
        inAppMessageToPrepare.getClass();
        JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(inAppMessageToPrepare, null), 3);
    }

    public static final boolean prepareInAppMessageWithBitmapDownload(IInAppMessage inAppMessage) {
        if (!(inAppMessage instanceof IInAppMessageWithImage)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(16), 7, (Object) null);
            return false;
        }
        IInAppMessageWithImage iInAppMessageWithImage = (IInAppMessageWithImage) inAppMessage;
        if (iInAppMessageWithImage.getBitmap() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(5), 6, (Object) null);
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = INSTANCE;
        BrazeViewBounds viewBoundsByType = backgroundInAppMessagePreparer.getViewBoundsByType(inAppMessage);
        Context mApplicationContext = BrazeInAppMessageManager.INSTANCE.getInstance().getMApplicationContext();
        if (mApplicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backgroundInAppMessagePreparer, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(6), 6, (Object) null);
            return false;
        }
        IBrazeImageLoader imageLoader = Braze.INSTANCE.getInstance(mApplicationContext).getImageLoader();
        String localImageUrl = iInAppMessageWithImage.getLocalImageUrl();
        if (localImageUrl == null || StringsKt.isBlank(localImageUrl) || !backgroundInAppMessagePreparer.handleLocalImage(localImageUrl, iInAppMessageWithImage, imageLoader, mApplicationContext, inAppMessage, viewBoundsByType)) {
            String remoteImageUrl = iInAppMessageWithImage.getRemoteImageUrl();
            if (remoteImageUrl != null && !StringsKt.isBlank(remoteImageUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backgroundInAppMessagePreparer, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(remoteImageUrl, 22), 6, (Object) null);
                iInAppMessageWithImage.setBitmap(imageLoader.getInAppMessageBitmapFromUrl(mApplicationContext, inAppMessage, remoteImageUrl, viewBoundsByType));
                if (iInAppMessageWithImage.getBitmap() == null) {
                    return false;
                }
                iInAppMessageWithImage.setImageDownloadSuccessful(true);
                return true;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) backgroundInAppMessagePreparer, priority, (Throwable) null, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(7), 6, (Object) null);
            if (iInAppMessageWithImage instanceof InAppMessageFull) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) backgroundInAppMessagePreparer, priority, (Throwable) null, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(8), 6, (Object) null);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$0() {
        return "Cannot prepare non IInAppMessageWithImage object with bitmap download.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$1() {
        return "In-app message already contains image bitmap. Not downloading image from URL.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$2() {
        return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$3(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("In-app message has remote image url. Downloading image at url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$4() {
        return "In-app message has no remote image url. Not downloading image.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$5() {
        return "In-app message full has no remote image url yet is required to have an image. Failing message display.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithHtml$lambda$0() {
        return "HTML in-app message does not have prefetched assets. Not performing any substitutions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithHtml$lambda$1() {
        return "HTML in-app message does not have message. Not performing any substitutions.";
    }

    public static final boolean prepareInAppMessageWithZippedAssetHtml(IInAppMessageZippedAssetHtml inAppMessageHtml) {
        inAppMessageHtml.getClass();
        String localAssetsDirectoryUrl = inAppMessageHtml.getLocalAssetsDirectoryUrl();
        if (localAssetsDirectoryUrl != null && !StringsKt.isBlank(localAssetsDirectoryUrl) && new File(localAssetsDirectoryUrl).exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(localAssetsDirectoryUrl, 25), 6, (Object) null);
            return true;
        }
        String assetsZipRemoteUrl = inAppMessageHtml.getAssetsZipRemoteUrl();
        if (assetsZipRemoteUrl == null || StringsKt.isBlank(assetsZipRemoteUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(14), 6, (Object) null);
            return true;
        }
        Context mApplicationContext = BrazeInAppMessageManager.INSTANCE.getInstance().getMApplicationContext();
        if (mApplicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(15), 6, (Object) null);
            return false;
        }
        String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(mApplicationContext), assetsZipRemoteUrl);
        if (localHtmlUrlFromRemoteUrl == null || StringsKt.isBlank(localHtmlUrlFromRemoteUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new t7$$ExternalSyntheticLambda4(23, inAppMessageHtml, localHtmlUrlFromRemoteUrl), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(localHtmlUrlFromRemoteUrl, 26), 7, (Object) null);
        inAppMessageHtml.setLocalAssetsDirectoryUrl(localHtmlUrlFromRemoteUrl);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Local assets for html in-app message are already populated. Not downloading assets. Location = ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$1() {
        return "Html in-app message has no remote asset zip. Continuing with in-app message preparation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$2() {
        return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$3(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Local url for html in-app message assets is ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$4(IInAppMessageZippedAssetHtml iInAppMessageZippedAssetHtml, String str) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Download of html content to local directory failed for remote url: ", iInAppMessageZippedAssetHtml.getAssetsZipRemoteUrl(), " . Returned local url is: ", str);
    }

    public final void prepareInAppMessageWithHtml(InAppMessageHtml inAppMessage) {
        inAppMessage.getClass();
        if (inAppMessage.getLocalPrefetchedAssetPaths().isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(9), 7, (Object) null);
            return;
        }
        String message = inAppMessage.getMessage();
        if (message == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(10), 7, (Object) null);
        } else {
            inAppMessage.setMessage(WebContentUtils.replacePrefetchedUrlsWithLocalAssets(message, inAppMessage.getLocalPrefetchedAssetPaths()));
        }
    }
}
