package bo.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.datastore.preferences.core.Preferences;
import coil3.decode.ImageSource;
import coil3.decode.ImageSourceKt;
import coil3.decode.StaticImageDecoder$decode$lambda$0$0$$inlined$decodeBitmap$1;
import coil3.decode.StaticImageDecoderKt;
import coil3.gif.AnimatedImageDecoder;
import coil3.gif.DecodeUtilsKt;
import coil3.gif.internal.FrameDelayRewritingSource;
import coil3.network.NetworkFetcher$doFetch$2;
import com.braze.Braze;
import com.braze.enums.Channel;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessageZippedAssetHtml;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeImageUtils;
import com.braze.support.IntentUtils;
import com.braze.support.WebContentUtils;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import com.braze.ui.support.ViewUtils;
import com.google.android.libraries.places.internal.zzcha;
import com.google.maps.android.compose.NoDrawContainerView;
import com.squareup.cardcustomizations.signature.Signature;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.signature.SignatureStateListener;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import java.io.File;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import okhttp3.Cache;
import okio.BufferedSource;
import okio.RealBufferedSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class t7$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ t7$$ExternalSyntheticLambda4(LinkedHashSet linkedHashSet, Set set) {
        this.$r8$classId = 1;
        this.f$1 = linkedHashSet;
        this.f$0 = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit _init_$lambda$3;
        String shouldSkipCaching$lambda$2$1;
        String bitmapFromCache$lambda$0$0;
        String handlePush$lambda$3;
        String localBitmap$lambda$5;
        String remoteBitmap$lambda$3;
        String remoteBitmap$lambda$4;
        String addComponentAndSendBroadcast$lambda$0$0;
        String unpackZipIntoDirectory$lambda$2;
        String openUriWithActionView$lambda$0;
        String execute$lambda$0;
        String isArgCountInBounds$lambda$1;
        String createBrazeUserChangeEventSubscriber$lambda$0$1;
        String prepareInAppMessageWithZippedAssetHtml$lambda$4;
        String removeViewFromParent$lambda$1;
        int i = this.$r8$classId;
        Continuation continuation = null;
        int i2 = 1;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                return t7.a((t7) obj2, (Set) obj);
            case 1:
                return x3.a((Set) obj, (Set) obj2);
            case 2:
                return x3.a((Ref$ObjectRef) obj2, (x3) obj);
            case 3:
                return xd.a((yd) obj2, (td) obj);
            case 4:
                return y1.a((y1) obj2, (String) obj);
            case 5:
                return yf.a((String) obj2, (Preferences.Key) obj);
            case 6:
                return yf.a((y9) obj2, (String) obj);
            case 7:
                return yg.a((Context) obj2, (yg) obj);
            case 8:
                return zf.a((String) obj2, (Map) obj);
            case 9:
                AnimatedImageDecoder animatedImageDecoder = (AnimatedImageDecoder) obj2;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj;
                ImageSource imageSource = animatedImageDecoder.source;
                if (animatedImageDecoder.enforceMinimumFrameDelay) {
                    BufferedSource source = imageSource.source();
                    if (source.rangeEquals(0L, DecodeUtilsKt.GIF_HEADER_89A) || source.rangeEquals(0L, DecodeUtilsKt.GIF_HEADER_87A)) {
                        imageSource = ImageSourceKt.ImageSource$default(new RealBufferedSource(new FrameDelayRewritingSource(imageSource.source())), imageSource.getFileSystem());
                    }
                }
                try {
                    ImageDecoder.Source imageDecoderSourceOrNull = StaticImageDecoderKt.toImageDecoderSourceOrNull(imageSource, animatedImageDecoder.options, true);
                    if (imageDecoderSourceOrNull == null) {
                        BufferedSource source2 = imageSource.source();
                        try {
                            source2.request(Long.MAX_VALUE);
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) source2.getBuffer().size);
                            while (!source2.getBuffer().exhausted()) {
                                source2.getBuffer().read(allocateDirect);
                            }
                            allocateDirect.flip();
                            source2.close();
                            imageDecoderSourceOrNull = ImageDecoder.createSource(allocateDirect);
                        } finally {
                        }
                    }
                    Drawable decodeDrawable = ImageDecoder.decodeDrawable(imageDecoderSourceOrNull, new StaticImageDecoder$decode$lambda$0$0$$inlined$decodeBitmap$1(animatedImageDecoder, ref$BooleanRef, i2));
                    Cache.Companion.closeFinally(imageSource, null);
                    return decodeDrawable;
                } finally {
                }
            case 10:
                _init_$lambda$3 = Braze._init_$lambda$3((Braze) obj2, (Context) obj);
                return _init_$lambda$3;
            case 11:
                shouldSkipCaching$lambda$2$1 = DefaultBrazeImageLoader.shouldSkipCaching$lambda$2$1((Map.Entry) obj2, (Uri) obj);
                return shouldSkipCaching$lambda$2$1;
            case 12:
                bitmapFromCache$lambda$0$0 = DefaultBrazeImageLoader.getBitmapFromCache$lambda$0$0((String) obj2, (DefaultBrazeImageLoader) obj);
                return bitmapFromCache$lambda$0$0;
            case 13:
                handlePush$lambda$3 = BrazePushReceiver.Companion.handlePush$lambda$3((String) obj2, (Intent) obj);
                return handlePush$lambda$3;
            case 14:
                localBitmap$lambda$5 = BrazeImageUtils.getLocalBitmap$lambda$5((Uri) obj2, (BitmapFactory.Options) obj);
                return localBitmap$lambda$5;
            case 15:
                remoteBitmap$lambda$3 = BrazeImageUtils.getRemoteBitmap$lambda$3((URL) obj2, (BitmapFactory.Options) obj);
                return remoteBitmap$lambda$3;
            case 16:
                remoteBitmap$lambda$4 = BrazeImageUtils.getRemoteBitmap$lambda$4((String) obj2, (Exception) obj);
                return remoteBitmap$lambda$4;
            case 17:
                addComponentAndSendBroadcast$lambda$0$0 = IntentUtils.addComponentAndSendBroadcast$lambda$0$0((ComponentName) obj2, (Intent) obj);
                return addComponentAndSendBroadcast$lambda$0$0;
            case 18:
                unpackZipIntoDirectory$lambda$2 = WebContentUtils.unpackZipIntoDirectory$lambda$2((File) obj2, (String) obj);
                return unpackZipIntoDirectory$lambda$2;
            case 19:
                openUriWithActionView$lambda$0 = UriAction.openUriWithActionView$lambda$0((Uri) obj2, (Bundle) obj);
                return openUriWithActionView$lambda$0;
            case 20:
                execute$lambda$0 = BrazeActionParser.execute$lambda$0((Channel) obj2, (Uri) obj);
                return execute$lambda$0;
            case 21:
                isArgCountInBounds$lambda$1 = StepData.isArgCountInBounds$lambda$1((IntRange) obj2, (StepData) obj);
                return isArgCountInBounds$lambda$1;
            case 22:
                createBrazeUserChangeEventSubscriber$lambda$0$1 = BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$0$1((String) obj2, (BrazeUserChangeEvent) obj);
                return createBrazeUserChangeEventSubscriber$lambda$0$1;
            case 23:
                prepareInAppMessageWithZippedAssetHtml$lambda$4 = BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml$lambda$4((IInAppMessageZippedAssetHtml) obj2, (String) obj);
                return prepareInAppMessageWithZippedAssetHtml$lambda$4;
            case 24:
                removeViewFromParent$lambda$1 = ViewUtils.removeViewFromParent$lambda$1((View) obj2, (ViewGroup) obj);
                return removeViewFromParent$lambda$1;
            case 25:
                zzcha zzchaVar = (zzcha) obj;
                ((StandaloneCoroutine) obj2).cancel(null);
                ((NoDrawContainerView) zzchaVar.zza$1).removeView((AbstractComposeView) zzchaVar.zza);
                return Unit.INSTANCE;
            case 26:
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) obj2;
                ProducerScope producerScope = (ProducerScope) obj;
                if (!ref$BooleanRef2.element) {
                    JobKt.launch$default(producerScope, null, null, new NetworkFetcher$doFetch$2(producerScope, ref$BooleanRef2, continuation, 6), 3);
                    ref$BooleanRef2.element = true;
                }
                return Unit.INSTANCE;
            case 27:
                SignatureState signatureState = (SignatureState) obj;
                ((SignatureStateListener) obj2).onGlyphAdded();
                Signature signature$customizations = signatureState.getSignature$customizations();
                if (signature$customizations != null) {
                    signature$customizations.finishGlyph();
                }
                signatureState.setInvalidate$customizations(signatureState.getInvalidate$customizations() + 1);
                return Unit.INSTANCE;
            case 28:
                ((Function1) obj2).invoke(new AccountDocumentsViewEvent.RecordClick(((AccountDocumentsViewModel.DocumentModel.RecordModel) obj).payload));
                return Unit.INSTANCE;
            default:
                ((Function1) obj2).invoke(new AccountDocumentsViewEvent.SectionClick(((AccountDocumentsViewModel.DocumentModel.SectionModel) obj).payload));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ t7$$ExternalSyntheticLambda4(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
