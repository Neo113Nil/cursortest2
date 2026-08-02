package com.nimbusds.jose;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.camera.camera2.pipe.CameraGraph$Config;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor;
import androidx.camera.camera2.pipe.compat.Camera2MetadataCache;
import androidx.camera.camera2.pipe.compat.Camera2Quirks;
import androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper;
import androidx.camera.camera2.pipe.core.ProcessingQueue$processingLoop$1;
import androidx.camera.camera2.pipe.graph.GraphCommand;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.core.AutoValue_SurfaceOutput_CameraInputInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.imagecapture.AutoValue_CaptureNode_In;
import androidx.camera.core.imagecapture.CaptureNode$$ExternalSyntheticLambda3;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda4;
import androidx.camera.core.processing.concurrent.AutoValue_DualOutConfig;
import androidx.camera.video.Recorder;
import androidx.camera.video.internal.audio.AutoValue_AudioSettings;
import androidx.compose.runtime.MutableState;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.ttml.DeleteTextSpan;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.extractor.text.ttml.TtmlRegion;
import androidx.navigation.fragment.NavHostFragment$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.local.primitives.PaymentMethodToken;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.ng$$ExternalSyntheticLambda0;
import bo.app.q4$$ExternalSyntheticLambda0;
import com.android.volley.RequestQueue;
import com.caverock.androidsvg.SVG;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.internal.metric.NoValueReason;
import com.datadog.android.rum.internal.metric.ViewInitializationMetricsState;
import com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext;
import com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier;
import com.datadog.android.rum.metric.interactiontonextview.PreviousViewLastInteractionContext;
import com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.model.FillrWebView;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.browsersdk.model.FillrWidget$WidgetType$$ExternalSyntheticLambda0;
import com.fillr.browsersdk.model.FillrWidgetFactory;
import com.fillr.browsersdk.model.FillrWidgetManager$$ExternalSyntheticLambda0;
import com.fillr.browsersdk.model.SaveWidgetToLocalStorageAsynTask;
import com.fillr.e0;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzw;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.zzb;
import com.google.android.libraries.places.api.net.zze;
import com.google.android.libraries.places.api.net.zzk;
import com.google.android.libraries.places.api.net.zzl;
import com.google.android.libraries.places.internal.zzex;
import com.google.android.libraries.places.internal.zzfa;
import com.google.android.libraries.places.internal.zzfv;
import com.google.android.libraries.places.internal.zzgc;
import com.google.android.libraries.places.internal.zzje;
import com.google.android.libraries.places.internal.zzkq;
import com.google.android.libraries.places.internal.zzkr;
import com.google.android.libraries.places.internal.zzkw;
import com.google.android.libraries.places.internal.zzla;
import com.google.android.libraries.places.internal.zzli;
import com.google.android.libraries.places.internal.zzln;
import com.google.android.libraries.places.internal.zzlz;
import com.google.android.libraries.places.internal.zzmb;
import com.google.android.libraries.places.internal.zzmg;
import com.google.android.libraries.places.internal.zznj;
import com.google.android.libraries.places.internal.zzns;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.math.MathUtils;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.mlkit.vision.text.zzd;
import com.google.zxing.Result;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.cash.graphics.swampgl.components.Transform;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import com.squareup.workflow1.Workflows__WorkflowActionKt$action$1;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import net.oneformapp.ProfileStore_;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.AndroidMainExecutor;
import utils.StringUtilsKt;

/* loaded from: classes4.dex */
public final class JWECryptoParts implements Subtitle {
    public static int sNextRequestId;
    public Object authenticationTag;
    public Object cipherText;
    public Object encryptedKey;
    public Object header;
    public Object iv;

    public JWECryptoParts(SVG svg, Joiner joiner) {
        if (svg == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Both config and auth cannot be null!");
            throw null;
        }
        this.header = (String) svg.rootElement;
        this.encryptedKey = (String) svg.cssRules;
        FillrWidget.WidgetType widgetType = FillrWidget.WidgetType.MOBILE;
        FillrWidget widget = FillrWidgetFactory.getWidget(widgetType, joiner);
        this.iv = widget;
        FillrWidget.WidgetType widgetType2 = FillrWidget.WidgetType.CART_SCRAPER;
        FillrWidget widget2 = FillrWidgetFactory.getWidget(widgetType2, joiner);
        this.cipherText = widget2;
        FillrWidget.WidgetType widgetType3 = FillrWidget.WidgetType.PAGE_CLASSIFIER;
        FillrWidget widget3 = FillrWidgetFactory.getWidget(widgetType3, joiner);
        FillrWidget.WidgetType widgetType4 = FillrWidget.WidgetType.ORDER_SCRAPER;
        FillrWidget widget4 = FillrWidgetFactory.getWidget(widgetType4, joiner);
        FillrWidget.WidgetType widgetType5 = FillrWidget.WidgetType.PRODUCT_PAGE_SCRAPER;
        FillrWidget widget5 = FillrWidgetFactory.getWidget(widgetType5, joiner);
        HashMap hashMap = new HashMap();
        this.authenticationTag = hashMap;
        hashMap.put(widgetType, widget);
        hashMap.put(FillrWidget.WidgetType.LEGACY_MOBILE, widget);
        hashMap.put(widgetType2, widget2);
        hashMap.put(widgetType3, widget3);
        hashMap.put(widgetType4, widget4);
        hashMap.put(widgetType5, widget5);
        FillrWidget[] fillrWidgetArr = {widget, widget2, widget3, widget4, widget5};
        for (int i = 0; i < 5; i++) {
            FillrWidget fillrWidget = fillrWidgetArr[i];
            fillrWidget.getClass();
            SVG svg2 = Fillr.getInstance().fillrConfig;
            if (fillrWidget.canDownload()) {
                new SimpleDecoder.AnonymousClass1(new SaveWidgetToLocalStorageAsynTask(fillrWidget, fillrWidget.fillrWidgetParams), 3).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        if (r4 == r1.size) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r8.invoke(r1, r2) == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x0030, B:13:0x007e, B:15:0x0052, B:17:0x0058, B:18:0x005c, B:20:0x0060, B:22:0x006b, B:27:0x0043, B:30:0x004f, B:34:0x003c), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x0030, B:13:0x007e, B:15:0x0052, B:17:0x0058, B:18:0x005c, B:20:0x0060, B:22:0x006b, B:27:0x0043, B:30:0x004f, B:34:0x003c), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0079 -> B:13:0x007e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$processingLoop(JWECryptoParts jWECryptoParts, ContinuationImpl continuationImpl) {
        ProcessingQueue$processingLoop$1 processingQueue$processingLoop$1;
        int i;
        Object receive$suspendImpl;
        int i2;
        BufferedChannel bufferedChannel = (BufferedChannel) jWECryptoParts.cipherText;
        ArrayDeque arrayDeque = (ArrayDeque) jWECryptoParts.authenticationTag;
        try {
            if (continuationImpl instanceof ProcessingQueue$processingLoop$1) {
                processingQueue$processingLoop$1 = (ProcessingQueue$processingLoop$1) continuationImpl;
                int i3 = processingQueue$processingLoop$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    processingQueue$processingLoop$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = processingQueue$processingLoop$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = processingQueue$processingLoop$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        processingQueue$processingLoop$1.label = 1;
                        bufferedChannel.getClass();
                        receive$suspendImpl = BufferedChannel.receive$suspendImpl(bufferedChannel, processingQueue$processingLoop$1);
                        if (receive$suspendImpl == coroutineSingletons) {
                        }
                    } else if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        arrayDeque.addLast(obj);
                        if (!arrayDeque.isEmpty()) {
                            for (Object mo4189tryReceivePtdJZtk = bufferedChannel.mo4189tryReceivePtdJZtk(); !(mo4189tryReceivePtdJZtk instanceof ChannelResult.Failed); mo4189tryReceivePtdJZtk = bufferedChannel.mo4189tryReceivePtdJZtk()) {
                                ChannelResult.m4192getOrThrowimpl(mo4189tryReceivePtdJZtk);
                                arrayDeque.addLast(mo4189tryReceivePtdJZtk);
                            }
                            i2 = arrayDeque.size;
                            WorkApplet$applet$1 workApplet$applet$1 = (WorkApplet$applet$1) jWECryptoParts.encryptedKey;
                            processingQueue$processingLoop$1.I$0 = i2;
                            processingQueue$processingLoop$1.label = 2;
                        }
                        processingQueue$processingLoop$1.label = 1;
                        bufferedChannel.getClass();
                        receive$suspendImpl = BufferedChannel.receive$suspendImpl(bufferedChannel, processingQueue$processingLoop$1);
                        if (receive$suspendImpl == coroutineSingletons) {
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            return;
                        }
                        arrayDeque.addLast(receive$suspendImpl);
                        if (!arrayDeque.isEmpty()) {
                        }
                        processingQueue$processingLoop$1.label = 1;
                        bufferedChannel.getClass();
                        receive$suspendImpl = BufferedChannel.receive$suspendImpl(bufferedChannel, processingQueue$processingLoop$1);
                        if (receive$suspendImpl == coroutineSingletons) {
                        }
                    } else if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return;
                    } else {
                        i2 = processingQueue$processingLoop$1.I$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            jWECryptoParts.releaseUnprocessedElements(th);
            throw th;
        }
        processingQueue$processingLoop$1 = new ProcessingQueue$processingLoop$1(jWECryptoParts, continuationImpl);
        Object obj2 = processingQueue$processingLoop$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = processingQueue$processingLoop$1.label;
    }

    public static Calendar addDays(Calendar calendar, int i) {
        Object clone = calendar.clone();
        clone.getClass();
        Calendar calendar2 = (Calendar) clone;
        calendar2.add(5, i);
        return calendar2;
    }

    public static boolean isSameDay(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static HashMap widgetParamsFromSettings() {
        boolean z;
        HashMap hashMap = new HashMap();
        Fillr fillr = Fillr.getInstance();
        if (fillr != null) {
            FillrWebView fillrWebView = fillr.mWebView;
            boolean z2 = false;
            if (fillrWebView != null) {
                URL url = fillrWebView.getUrl();
                z = fillr.isEnabled(url == null ? null : url.toString());
            } else {
                z = false;
            }
            if (z) {
                fillr.getFeatureToggleManager().getClass();
                z2 = true;
            }
            hashMap.put("$$refillPromptDisabled", Boolean.toString(!z2));
            hashMap.put("$$captureValuesDisabled", Boolean.toString(!fillr.isCaptureValueEnabled()));
            hashMap.put("$$fillrHome", "https://api.fillr.com");
            hashMap.put("$$platform", "android");
        }
        return hashMap;
    }

    public void addFrameState(ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) this.authenticationTag;
        ArrayList arrayList3 = (ArrayList) this.cipherText;
        ArrayList arrayList4 = (ArrayList) this.iv;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            arrayList.get(size).getClass();
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        if (arrayList4.size() > 0) {
            int size2 = arrayList4.size();
            for (int i = 0; i < size2; i++) {
                if (arrayList2.contains(Integer.valueOf(i))) {
                    arrayList3.add(Integer.valueOf(i));
                } else {
                    if (arrayList4.get(i) != null) {
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return;
                    }
                    int i2 = i + 1;
                    if (i2 < arrayList4.size()) {
                        arrayList4.get(i2).getClass();
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return;
                    }
                }
            }
            for (int size3 = arrayList3.size() - 1; -1 < size3; size3--) {
                arrayList4.remove(((Number) arrayList3.get(size3)).intValue());
            }
            if (arrayList4.size() > 0) {
                arrayList4.get(0).getClass();
                a$$ExternalSyntheticBUOutline0.m$1();
            } else {
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
            }
        }
    }

    public String authTokenValue() {
        String str = (String) this.encryptedKey;
        int length = str.length() / 2;
        long time = new Date().getTime() / 86400000;
        int i = ((int) (time % 30)) + 1;
        if (i <= length) {
            length = i;
        }
        int length2 = (str.length() - length) / 2;
        return Hex.bytesToStringLowercase(MessageDigest.getInstance("MD5").digest((((String) this.header) + str.substring(length2, length + length2) + time).getBytes()));
    }

    /* renamed from: build, reason: collision with other method in class */
    public AutoValue_AudioSettings m2170build() {
        if (!"".isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(""));
            return null;
        }
        int intValue = ((Integer) this.header).intValue();
        int intValue2 = ((Integer) this.encryptedKey).intValue();
        int intValue3 = ((Integer) this.iv).intValue();
        int intValue4 = ((Integer) this.cipherText).intValue();
        int intValue5 = ((Integer) this.authenticationTag).intValue();
        AutoValue_AudioSettings autoValue_AudioSettings = new AutoValue_AudioSettings(intValue, intValue2, intValue3, intValue4, intValue5);
        String str = intValue == -1 ? " audioSource" : "";
        if (intValue2 <= 0) {
            str = str.concat(" captureSampleRate");
        }
        if (intValue3 <= 0) {
            str = str.concat(" encodeSampleRate");
        }
        if (intValue4 <= 0) {
            str = str.concat(" channelCount");
        }
        if (intValue5 == -1) {
            str = str.concat(" audioFormat");
        }
        if (str.isEmpty()) {
            return autoValue_AudioSettings;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required settings missing or non-positive:".concat(str));
        return null;
    }

    public String buildPayload(FillrWidget.WidgetType... widgetTypeArr) {
        String str;
        List<FillrWidget.WidgetType> asList = Arrays.asList(widgetTypeArr);
        Collections.sort(asList, new ng$$ExternalSyntheticLambda0(24));
        StringBuilder sb = new StringBuilder();
        for (FillrWidget.WidgetType widgetType : asList) {
            try {
                FillrWidget fillrWidget = (FillrWidget) ((HashMap) this.authenticationTag).get(widgetType);
                if (fillrWidget == null || fillrWidget.mWidgetJavaScript == null || sb.toString().contains(fillrWidget.mWidgetJavaScript)) {
                    widgetType.name();
                    SVG svg = Fillr.getInstance().fillrConfig;
                } else {
                    sb.append("\n");
                    sb.append(fillrWidget.mWidgetJavaScript);
                }
            } catch (Exception e) {
                widgetType.name();
                e.getMessage();
                SVG svg2 = Fillr.getInstance().fillrConfig;
                e.printStackTrace();
            }
        }
        String trim = sb.toString().trim();
        if (trim == null) {
            trim = "";
        }
        try {
            trim = trim.trim();
            str = trim;
            for (Map.Entry entry : widgetParamsFromSettings().entrySet()) {
                str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
            }
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
        }
        try {
            return "(function(arg1, arg2){\nwindow[arg1] = arg2;\n" + str + "\n}('F" + Long.toString(new Date().getTime() / 86400000) + "', '" + authTokenValue() + "'));";
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            trim = str;
            e.getMessage();
            SVG svg3 = Fillr.getInstance().fillrConfig;
            return trim;
        }
    }

    public String buildPayloadForUrl(String str) {
        ArrayList enabledWidgetsForUrl = enabledWidgetsForUrl(str);
        return buildPayload((FillrWidget.WidgetType[]) enabledWidgetsForUrl.toArray(new FillrWidget.WidgetType[enabledWidgetsForUrl.size()]));
    }

    public void close() {
        SurfaceRequest.AnonymousClass2 anonymousClass2;
        Threads.checkMainThread();
        e0 e0Var = (e0) this.iv;
        e0Var.getClass();
        Threads.checkMainThread();
        AutoValue_CaptureNode_In autoValue_CaptureNode_In = (AutoValue_CaptureNode_In) e0Var.f;
        Objects.requireNonNull(autoValue_CaptureNode_In);
        ProfileStore_ profileStore_ = (ProfileStore_) e0Var.b;
        Objects.requireNonNull(profileStore_);
        ProfileStore_ profileStore_2 = (ProfileStore_) e0Var.c;
        SurfaceRequest.AnonymousClass2 anonymousClass22 = autoValue_CaptureNode_In.mSurface;
        Objects.requireNonNull(anonymousClass22);
        anonymousClass22.close();
        SurfaceRequest.AnonymousClass2 anonymousClass23 = autoValue_CaptureNode_In.mSurface;
        Objects.requireNonNull(anonymousClass23);
        Futures.nonCancellationPropagating(anonymousClass23.mTerminationFuture).addListener(new CaptureNode$$ExternalSyntheticLambda3(profileStore_, 0), zzabp.mainThreadExecutor());
        SurfaceRequest.AnonymousClass2 anonymousClass24 = autoValue_CaptureNode_In.mPostviewSurface;
        if (anonymousClass24 != null) {
            anonymousClass24.close();
            Futures.nonCancellationPropagating(autoValue_CaptureNode_In.mPostviewSurface.mTerminationFuture).addListener(new CaptureNode$$ExternalSyntheticLambda3(null, 3), zzabp.mainThreadExecutor());
        }
        if (autoValue_CaptureNode_In.outputFormats.size() > 1 && (anonymousClass2 = autoValue_CaptureNode_In.mSecondarySurface) != null) {
            anonymousClass2.close();
            Futures.nonCancellationPropagating(autoValue_CaptureNode_In.mSecondarySurface.mTerminationFuture).addListener(new CaptureNode$$ExternalSyntheticLambda3(profileStore_2, 4), zzabp.mainThreadExecutor());
        }
        ((ProcessingNode) this.cipherText).getClass();
    }

    public Camera2CaptureSequenceProcessor create(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, Map map, Map map2) {
        cameraCaptureSessionWrapper.getClass();
        map.getClass();
        map2.getClass();
        androidx.camera.camera2.pipe.core.Threads threads = (androidx.camera.camera2.pipe.core.Threads) this.header;
        CameraGraph$Config cameraGraph$Config = (CameraGraph$Config) this.encryptedKey;
        int i = cameraGraph$Config.defaultTemplate;
        StreamGraphImpl streamGraphImpl = (StreamGraphImpl) this.iv;
        StrictMode strictMode = (StrictMode) this.authenticationTag;
        Camera2Quirks camera2Quirks = (Camera2Quirks) this.cipherText;
        camera2Quirks.getClass();
        camera2Quirks.strictMode.getClass();
        cameraGraph$Config.flags.getClass();
        CameraMetadata.Companion companion = CameraMetadata.Companion;
        CameraMetadata m72awaitCameraMetadataEfqyGwQ = ((Camera2MetadataCache) camera2Quirks.metadataProvider).m72awaitCameraMetadataEfqyGwQ(cameraGraph$Config.camera);
        companion.getClass();
        return new Camera2CaptureSequenceProcessor(cameraCaptureSessionWrapper, threads, i, map, map2, streamGraphImpl, strictMode, CameraMetadata.Companion.isHardwareLevelLegacy(m72awaitCameraMetadataEfqyGwQ));
    }

    public void createAndSendSurfaceOutput(CameraInternal cameraInternal, CameraInternal cameraInternal2, SurfaceEdge surfaceEdge, SurfaceEdge surfaceEdge2, Map.Entry entry) {
        SurfaceEdge surfaceEdge3 = (SurfaceEdge) entry.getValue();
        StringUtilsKt.d("DualSurfaceProcessorNode", "     -> outputEdge = " + surfaceEdge3);
        AutoValue_SurfaceOutput_CameraInputInfo autoValue_SurfaceOutput_CameraInputInfo = new AutoValue_SurfaceOutput_CameraInputInfo(surfaceEdge.mStreamSpec.resolution, ((AutoValue_DualOutConfig) entry.getKey()).primaryOutConfig.getCropRect, surfaceEdge.mHasCameraTransform ? cameraInternal : null, ((AutoValue_DualOutConfig) entry.getKey()).primaryOutConfig.getRotationDegrees, ((AutoValue_DualOutConfig) entry.getKey()).primaryOutConfig.isMirroring);
        AutoValue_SurfaceOutput_CameraInputInfo autoValue_SurfaceOutput_CameraInputInfo2 = new AutoValue_SurfaceOutput_CameraInputInfo(surfaceEdge2.mStreamSpec.resolution, ((AutoValue_DualOutConfig) entry.getKey()).secondaryOutConfig.getCropRect, surfaceEdge2.mHasCameraTransform ? cameraInternal2 : null, ((AutoValue_DualOutConfig) entry.getKey()).secondaryOutConfig.getRotationDegrees, ((AutoValue_DualOutConfig) entry.getKey()).secondaryOutConfig.isMirroring);
        int i = ((AutoValue_DualOutConfig) entry.getKey()).primaryOutConfig.getFormat;
        surfaceEdge3.getClass();
        Threads.checkMainThread();
        surfaceEdge3.checkNotClosed();
        TransactorKt.checkState("Consumer can only be linked once.", !surfaceEdge3.mHasConsumer);
        surfaceEdge3.mHasConsumer = true;
        SurfaceEdge.SettableSurface settableSurface = surfaceEdge3.mSettableSurface;
        Futures.addCallback(Futures.transformAsync(settableSurface.getSurface(), new SurfaceEdge$$ExternalSyntheticLambda4(surfaceEdge3, settableSurface, i, autoValue_SurfaceOutput_CameraInputInfo, autoValue_SurfaceOutput_CameraInputInfo2), zzabp.mainThreadExecutor()), new Recorder.AnonymousClass4(10, this, surfaceEdge3), zzabp.mainThreadExecutor());
    }

    public void draw(Canvas canvas) {
        Canvas canvas2;
        Paint paint = (Paint) this.iv;
        FrameLayout frameLayout = (FrameLayout) this.encryptedKey;
        CircularRevealWidget.RevealInfo revealInfo = (CircularRevealWidget.RevealInfo) this.cipherText;
        boolean z = revealInfo == null || revealInfo.radius == Float.MAX_VALUE;
        CircularRevealWidget circularRevealWidget = (CircularRevealWidget) this.header;
        if (z) {
            canvas2 = canvas;
            circularRevealWidget.actualDraw(canvas2);
            if (Color.alpha(paint.getColor()) != 0) {
                canvas2.drawRect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, frameLayout.getWidth(), frameLayout.getHeight(), paint);
            }
        } else {
            circularRevealWidget.actualDraw(canvas);
            if (Color.alpha(paint.getColor()) != 0) {
                canvas2 = canvas;
                canvas2.drawRect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, frameLayout.getWidth(), frameLayout.getHeight(), paint);
            } else {
                canvas2 = canvas;
            }
        }
        Drawable drawable = (Drawable) this.authenticationTag;
        if (drawable == null || ((CircularRevealWidget.RevealInfo) this.cipherText) == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        float width = ((CircularRevealWidget.RevealInfo) this.cipherText).centerX - (bounds.width() / 2.0f);
        float height = ((CircularRevealWidget.RevealInfo) this.cipherText).centerY - (bounds.height() / 2.0f);
        canvas2.translate(width, height);
        ((Drawable) this.authenticationTag).draw(canvas2);
        canvas2.translate(-width, -height);
    }

    public ArrayList enabledWidgetsForUrl(String str) {
        HashSet hashSet = new HashSet();
        if (zzd.getInstance() != null) {
            boolean isPropertyDisabledForDevKeyUrl = zzd.isPropertyDisabledForDevKeyUrl("DisableAutofillDevKeyDomain", str);
            FillrWidget.WidgetType widgetType = FillrWidget.WidgetType.MOBILE;
            if (isWidgetAvailable(widgetType) && !isPropertyDisabledForDevKeyUrl) {
                Fillr.getInstance().getClass();
                hashSet.add(widgetType);
            }
            FillrWidget.WidgetType widgetType2 = FillrWidget.WidgetType.CART_SCRAPER;
            if (isWidgetAvailable(widgetType2) && !isPropertyDisabledForDevKeyUrl && !zzd.isFeatureEnabledForUrl("DisableCartProductExtraction", null)) {
                if (!((str == null || str.length() <= 0) ? false : zzd.isFeatureEnabledForUrl("DisableCartInformationExtraction", str)) && !zzd.isPropertyDisabledForDevKeyUrl("DisableCartInformationExtractionDevKeyDomain", str)) {
                    hashSet.add(FillrWidget.WidgetType.PAGE_CLASSIFIER);
                    hashSet.add(widgetType2);
                }
            }
            FillrWidget.WidgetType widgetType3 = FillrWidget.WidgetType.PAGE_CLASSIFIER;
            boolean z = true;
            if (isWidgetAvailable(widgetType3) && !isPropertyDisabledForDevKeyUrl && zzd.isFeatureEnabledForUrl("PageClassifier", null)) {
                if (!((str == null || str.length() <= 0) ? true : zzd.isFeatureEnabledForUrl("DisablePageClassifierDevKeyDomain", str))) {
                    hashSet.add(widgetType3);
                }
            }
            FillrWidget.WidgetType widgetType4 = FillrWidget.WidgetType.ORDER_SCRAPER;
            if (isWidgetAvailable(widgetType4) && !isPropertyDisabledForDevKeyUrl && zzd.isFeatureEnabledForUrl("GlobalEnableOrderScraper", null)) {
                if (!((str == null || str.length() <= 0) ? true : zzd.isFeatureEnabledForUrl("DisableOrderScraperDevKeyDomain", str))) {
                    hashSet.add(widgetType3);
                    hashSet.add(widgetType4);
                }
            }
            FillrWidget.WidgetType widgetType5 = FillrWidget.WidgetType.PRODUCT_PAGE_SCRAPER;
            if (isWidgetAvailable(widgetType5) && !isPropertyDisabledForDevKeyUrl && zzd.isFeatureEnabledForUrl("GlobalEnableProductPageScraper", null)) {
                if (str != null && str.length() > 0) {
                    z = zzd.isFeatureEnabledForUrl("DisableProductPageScraperDevKeyDomain", str);
                }
                if (!z) {
                    hashSet.add(widgetType5);
                }
            }
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList, new ng$$ExternalSyntheticLambda0(24));
        return arrayList;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public List getCues(long j) {
        TtmlNode ttmlNode = (TtmlNode) this.header;
        Map map = (Map) this.iv;
        HashMap hashMap = (HashMap) this.cipherText;
        HashMap hashMap2 = (HashMap) this.authenticationTag;
        ArrayList arrayList = new ArrayList();
        ttmlNode.traverseForImage(j, ttmlNode.regionId, arrayList);
        TreeMap treeMap = new TreeMap();
        ttmlNode.traverseForText(j, false, ttmlNode.regionId, treeMap);
        ttmlNode.traverseForStyle(j, map, hashMap, ttmlNode.regionId, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                TtmlRegion ttmlRegion = (TtmlRegion) hashMap.get(pair.first);
                ttmlRegion.getClass();
                arrayList2.add(new Cue(null, null, null, decodeByteArray, ttmlRegion.line, 0, ttmlRegion.lineAnchor, ttmlRegion.position, 0, PKIFailureInfo.systemUnavail, -3.4028235E38f, ttmlRegion.width, ttmlRegion.height, false, -16777216, ttmlRegion.verticalType, RecyclerView.DECELERATION_RATE, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            TtmlRegion ttmlRegion2 = (TtmlRegion) hashMap.get(entry.getKey());
            ttmlRegion2.getClass();
            Cue.Builder builder = (Cue.Builder) entry.getValue();
            CharSequence charSequence = builder.text;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (DeleteTextSpan deleteTextSpan : (DeleteTextSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), DeleteTextSpan.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(deleteTextSpan), spannableStringBuilder.getSpanEnd(deleteTextSpan), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = ttmlRegion2.line;
            int i9 = ttmlRegion2.lineType;
            builder.line = f;
            builder.lineType = i9;
            builder.lineAnchor = ttmlRegion2.lineAnchor;
            builder.position = ttmlRegion2.position;
            builder.size = ttmlRegion2.width;
            float f2 = ttmlRegion2.textSize;
            int i10 = ttmlRegion2.textSizeType;
            builder.textSize = f2;
            builder.textSizeType = i10;
            builder.verticalType = ttmlRegion2.verticalType;
            arrayList2.add(builder.build());
        }
        return arrayList2;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        return ((long[]) this.encryptedKey)[i];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return ((long[]) this.encryptedKey).length;
    }

    public void getIntervalStates$metrics_performance_release(ArrayList arrayList) {
        arrayList.getClass();
        synchronized (((ArrayList) this.encryptedKey)) {
            arrayList.clear();
            addFrameState((ArrayList) this.header);
            addFrameState((ArrayList) this.encryptedKey);
        }
    }

    public MutableStateFlow getMutableStateFlow(Object obj, String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.header;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.cipherText;
        Object obj2 = linkedHashMap2.get(str);
        if (obj2 == null) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, obj);
            }
            obj2 = FlowKt.MutableStateFlow(linkedHashMap.get(str));
            linkedHashMap2.put(str, obj2);
        }
        return (MutableStateFlow) obj2;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        long[] jArr = (long[]) this.encryptedKey;
        int binarySearchCeil = Util.binarySearchCeil(jArr, j, false);
        if (binarySearchCeil < jArr.length) {
            return binarySearchCeil;
        }
        return -1;
    }

    /* renamed from: getPreauthorizedPaymentMethodTokenForEvents-yJPV6_0, reason: not valid java name */
    public String m2168getPreauthorizedPaymentMethodTokenForEventsyJPV6_0() {
        PaymentMethodToken paymentMethodToken = (PaymentMethodToken) ((MutableState) this.cipherText).getValue();
        if (paymentMethodToken != null) {
            return paymentMethodToken.value;
        }
        return null;
    }

    public ViewInitializationMetricsState getState(String str) {
        NoValueReason.InteractionToNextView interactionToNextView;
        str.getClass();
        Long resolveMetric = resolveMetric(str);
        LastInteractionIdentifier lastInteractionIdentifier = (LastInteractionIdentifier) this.iv;
        int i = lastInteractionIdentifier != null ? !(lastInteractionIdentifier instanceof TimeBasedInteractionIdentifier) ? 4 : 2 : 1;
        if (resolveMetric != null) {
            interactionToNextView = null;
        } else if (lastInteractionIdentifier == null) {
            interactionToNextView = NoValueReason.InteractionToNextView.DISABLED;
        } else {
            Long resolveCurrentViewCreationTimestamp = resolveCurrentViewCreationTimestamp(str);
            NoValueReason.InteractionToNextView interactionToNextView2 = NoValueReason.InteractionToNextView.UNKNOWN;
            if (resolveCurrentViewCreationTimestamp != null) {
                long longValue = resolveCurrentViewCreationTimestamp.longValue();
                String resolvePreviousViewId = resolvePreviousViewId(str);
                if (resolvePreviousViewId == null) {
                    interactionToNextView = NoValueReason.InteractionToNextView.NO_PREVIOUS_VIEW;
                } else if (((LinkedHashMap) this.cipherText).get(resolvePreviousViewId) == null) {
                    interactionToNextView = NoValueReason.InteractionToNextView.NO_ACTION;
                } else if (resolveLastInteraction(longValue, resolvePreviousViewId) == null) {
                    interactionToNextView = NoValueReason.InteractionToNextView.NO_ELIGIBLE_ACTION;
                }
            }
            interactionToNextView = interactionToNextView2;
        }
        return new ViewInitializationMetricsState(resolveMetric, i, interactionToNextView);
    }

    public void injectAndRunTasks(ArrayList arrayList, FillrWebView fillrWebView, Handler handler) {
        handler.post(new q4$$ExternalSyntheticLambda0(24, fillrWebView, buildPayload((FillrWidget.WidgetType[]) arrayList.toArray(new FillrWidget.WidgetType[arrayList.size()]))));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FillrWidget.WidgetType widgetType = (FillrWidget.WidgetType) it.next();
            widgetType.getClass();
            HashMap hashMap = FillrWidget.WidgetType.POST_INJECTION_LISTENERS;
            if (hashMap.containsKey(widgetType)) {
                handler.post(((FillrWidget$WidgetType$$ExternalSyntheticLambda0) hashMap.get(widgetType)).taskForWebview(fillrWebView, widgetType));
            }
        }
        handler.post(new FillrWidgetManager$$ExternalSyntheticLambda0(fillrWebView, 1));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((FillrWidget.WidgetType) it2.next()).notifyInjectionListeners(fillrWebView);
        }
    }

    public void injectEnabledWidgets(FillrWebView fillrWebView) {
        if (fillrWebView == null) {
            return;
        }
        int i = 0;
        fillrWebView.widgetInjected = false;
        URL url = fillrWebView.getUrl();
        String url2 = url == null ? null : url.toString();
        ArrayList arrayList = new ArrayList();
        ArrayList enabledWidgetsForUrl = enabledWidgetsForUrl(url2);
        Iterator it = enabledWidgetsForUrl.iterator();
        while (it.hasNext()) {
            FillrWidget.WidgetType widgetType = (FillrWidget.WidgetType) it.next();
            widgetType.getClass();
            HashMap hashMap = FillrWidget.WidgetType.PRE_INJECTION_LISTENERS;
            if (hashMap.containsKey(widgetType)) {
                widgetType.preInjectionComplete = false;
                arrayList.add(((FillrWidget$WidgetType$$ExternalSyntheticLambda0) hashMap.get(widgetType)).taskForWebview(fillrWebView, widgetType));
            }
        }
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new FillrWidgetManager$$ExternalSyntheticLambda0(fillrWebView, i));
        if (arrayList.isEmpty()) {
            injectAndRunTasks(enabledWidgetsForUrl, fillrWebView, handler);
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            handler.post((Runnable) it2.next());
        }
    }

    public boolean isWidgetAvailable(FillrWidget.WidgetType widgetType) {
        String str;
        HashMap hashMap = (HashMap) this.authenticationTag;
        return (widgetType == null || !hashMap.containsKey(widgetType) || hashMap.get(widgetType) == null || (str = ((FillrWidget) hashMap.get(widgetType)).mWidgetJavaScript) == null || str.length() <= 0) ? false : true;
    }

    /* renamed from: onPaymentMethodSelected-0YaROmY, reason: not valid java name */
    public boolean m2169onPaymentMethodSelected0YaROmY(String str) {
        str.getClass();
        ((MutableState) ((MutableState) this.authenticationTag).getValue()).setValue(new PaymentMethodToken(str));
        return !(m2168getPreauthorizedPaymentMethodTokenForEventsyJPV6_0() == null ? false : str.equals(r2));
    }

    public void purgeOldEntries() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.authenticationTag;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.cipherText;
        while (linkedHashMap2.entrySet().size() > 4) {
            Set entrySet = linkedHashMap2.entrySet();
            Set entrySet2 = linkedHashMap2.entrySet();
            entrySet2.getClass();
            entrySet.remove(CollectionsKt.first(entrySet2));
        }
        while (linkedHashMap.entrySet().size() > 4) {
            Set keySet = linkedHashMap.keySet();
            keySet.getClass();
            linkedHashMap.remove(CollectionsKt.first(keySet));
        }
    }

    public void releaseUnprocessedElements(Throwable th) {
        ArrayDeque arrayDeque = (ArrayDeque) this.authenticationTag;
        BufferedChannel bufferedChannel = (BufferedChannel) this.cipherText;
        if (bufferedChannel.closeOrCancelImpl(th, false)) {
            for (Object mo4189tryReceivePtdJZtk = bufferedChannel.mo4189tryReceivePtdJZtk(); !(mo4189tryReceivePtdJZtk instanceof ChannelResult.Failed); mo4189tryReceivePtdJZtk = bufferedChannel.mo4189tryReceivePtdJZtk()) {
                ChannelResult.m4192getOrThrowimpl(mo4189tryReceivePtdJZtk);
                arrayDeque.addLast(mo4189tryReceivePtdJZtk);
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            ((Function1) this.header).invoke(new ArrayList(arrayDeque));
            arrayDeque.clear();
        }
    }

    public void repositionEntities(Transform transform) {
        ArrayList arrayList = (ArrayList) this.cipherText;
        transform.getClass();
        StateFlowImpl stateFlowImpl = transform._rotation;
        List list = (List) this.authenticationTag;
        if (list.isEmpty()) {
            return;
        }
        float[] computeModelMatrix = transform.computeModelMatrix();
        int i = 4;
        float[] fArr = new float[4];
        Matrix.multiplyMV(fArr, 0, ((Quat) stateFlowImpl.getValue()).toRotationTransform(), 0, new float[]{RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE}, 0);
        float f = (fArr[2] > RecyclerView.DECELERATION_RATE ? 1.0f : -1.0f) * 0.04f;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            CardModelView.PanEntity panEntity = (CardModelView.PanEntity) obj;
            if (i2 < arrayList.size()) {
                Entity entity = (Entity) ((kotlin.Pair) arrayList.get(i2)).first;
                boolean visible = entity.getVisible();
                Transform transform2 = entity.transform;
                if (visible) {
                    float[] fArr2 = panEntity.localTranslation.vector;
                    float f2 = fArr2[0];
                    float f3 = fArr2[1] + f;
                    float f4 = fArr2[2];
                    float[] fArr3 = new float[i];
                    fArr3[0] = f2;
                    fArr3[1] = f3;
                    fArr3[2] = f4;
                    fArr3[3] = 1.0f;
                    float[] fArr4 = new float[i];
                    Matrix.multiplyMV(fArr4, 0, computeModelMatrix, 0, fArr3, 0);
                    transform2.setPosition(new Vector3(fArr4[0], fArr4[1], fArr4[2]));
                    transform2.setRotation((Quat) stateFlowImpl.getValue());
                    transform2.setScale(transform.getScale());
                }
            }
            i2 = i3;
            i = 4;
        }
    }

    public Long resolveCurrentViewCreationTimestamp(String str) {
        Long l = (Long) ((LinkedHashMap) this.authenticationTag).get(str);
        if (l == null) {
            DBUtil.log$default((InternalLogger) this.header, 4, InternalLogger.Target.MAINTAINER, new Workflows__WorkflowActionKt$action$1(str, 2), null, false, 56);
        }
        return l;
    }

    public InternalInteractionContext resolveLastInteraction(long j, String str) {
        InternalInteractionContext internalInteractionContext;
        LastInteractionIdentifier lastInteractionIdentifier = (LastInteractionIdentifier) this.iv;
        if (lastInteractionIdentifier == null || (internalInteractionContext = (InternalInteractionContext) ((LinkedHashMap) this.cipherText).get(str)) == null || !lastInteractionIdentifier.validate(new PreviousViewLastInteractionContext(internalInteractionContext.actionType, internalInteractionContext.eventCreatedAtNanos, Long.valueOf(j)))) {
            return null;
        }
        return internalInteractionContext;
    }

    public Long resolveMetric(String str) {
        str.getClass();
        purgeOldEntries();
        Long resolveCurrentViewCreationTimestamp = resolveCurrentViewCreationTimestamp(str);
        if (resolveCurrentViewCreationTimestamp != null) {
            long longValue = resolveCurrentViewCreationTimestamp.longValue();
            String resolvePreviousViewId = resolvePreviousViewId(str);
            InternalInteractionContext resolveLastInteraction = resolvePreviousViewId != null ? resolveLastInteraction(longValue, resolvePreviousViewId) : null;
            if (resolveLastInteraction != null) {
                long j = longValue - resolveLastInteraction.eventCreatedAtNanos;
                if (j > 0) {
                    return Long.valueOf(j);
                }
                DBUtil.log$default((InternalLogger) this.header, 4, InternalLogger.Target.MAINTAINER, new Workflows__WorkflowActionKt$action$1(str, 3), null, false, 56);
            }
        }
        return null;
    }

    public String resolvePreviousViewId(String str) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.authenticationTag;
        Set keySet = linkedHashMap.keySet();
        keySet.getClass();
        int indexOf = CollectionsKt.indexOf(keySet, str);
        Set keySet2 = linkedHashMap.keySet();
        keySet2.getClass();
        Set set = keySet2;
        int i = indexOf - 1;
        set.getClass();
        if (set instanceof List) {
            obj = CollectionsKt.getOrNull(i, (List) set);
        } else {
            if (i >= 0) {
                int i2 = 0;
                for (Object obj2 : set) {
                    int i3 = i2 + 1;
                    if (i == i2) {
                        obj = obj2;
                        break;
                    }
                    i2 = i3;
                }
            }
            obj = null;
        }
        return (String) obj;
    }

    public void set(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.header).put(str, obj);
        MutableStateFlow mutableStateFlow = (MutableStateFlow) ((LinkedHashMap) this.iv).get(str);
        if (mutableStateFlow != null) {
            ((StateFlowImpl) mutableStateFlow).setValue(obj);
        }
        MutableStateFlow mutableStateFlow2 = (MutableStateFlow) ((LinkedHashMap) this.cipherText).get(str);
        if (mutableStateFlow2 != null) {
            ((StateFlowImpl) mutableStateFlow2).setValue(obj);
        }
    }

    public void setRevealInfo(CircularRevealWidget.RevealInfo revealInfo) {
        FrameLayout frameLayout = (FrameLayout) this.encryptedKey;
        if (revealInfo == null) {
            this.cipherText = null;
        } else {
            CircularRevealWidget.RevealInfo revealInfo2 = (CircularRevealWidget.RevealInfo) this.cipherText;
            if (revealInfo2 == null) {
                this.cipherText = new CircularRevealWidget.RevealInfo(revealInfo);
            } else {
                float f = revealInfo.centerX;
                float f2 = revealInfo.centerY;
                float f3 = revealInfo.radius;
                revealInfo2.centerX = f;
                revealInfo2.centerY = f2;
                revealInfo2.radius = f3;
            }
            if (revealInfo.radius + 1.0E-4f >= MathUtils.distanceToFurthestCorner(revealInfo.centerX, revealInfo.centerY, frameLayout.getWidth(), frameLayout.getHeight())) {
                ((CircularRevealWidget.RevealInfo) this.cipherText).radius = Float.MAX_VALUE;
            }
        }
        frameLayout.invalidate();
    }

    public boolean tryEmit(GraphCommand graphCommand) {
        return !(((BufferedChannel) this.cipherText).mo1159trySendJP2dKIU(graphCommand) instanceof ChannelResult.Failed);
    }

    public zzw zza(zzk zzkVar, zzns zznsVar) {
        String str = zzkVar.zza;
        if (str == null || TextUtils.isEmpty(str.trim())) {
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            return Room.forResult(new zzl(ImmutableList.copyOf((Collection) RegularImmutableList.EMPTY)));
        }
        zzje zzjeVar = (zzje) this.header;
        zznj zznjVar = Places.zza;
        zzkq zzkqVar = new zzkq(zzkVar, zznjVar.zzf(), zznjVar.zze(), zzjeVar, 2);
        zzex zzexVar = (zzex) this.authenticationTag;
        zbc zbcVar = (zbc) this.encryptedKey;
        ((zzfa) zzexVar).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zzw zza = zbcVar.zza(zzkqVar, zzla.class);
        zzmg zzmgVar = new zzmg();
        zza.getClass();
        AndroidMainExecutor androidMainExecutor = TaskExecutors.MAIN_THREAD;
        return (zzw) ((zzw) zza.continueWith(androidMainExecutor, zzmgVar)).continueWith(androidMainExecutor, new zzlz(this, elapsedRealtime, zznsVar, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzw zzb(zzb zzbVar) {
        Integer num = zzbVar.zza;
        Integer num2 = zzbVar.zzb;
        Locale locale = null;
        if (num == null && num2 == null) {
            return Room.forException(new ApiException(new Status(9012, "Must include max width or max height in request.", null, null)));
        }
        if (num != null && num.intValue() <= 0) {
            return Room.forException(new ApiException(new Status(9012, String.format("Max Width must not be < 1, but was: %d.", num), null, null)));
        }
        if (num2 != null && num2.intValue() <= 0) {
            return Room.forException(new ApiException(new Status(9012, String.format("Max Height must not be < 1, but was: %d.", num2), null, null)));
        }
        zzkq zzkqVar = new zzkq(zzbVar, locale, Places.zza.zze(), (zzje) this.header, 0);
        zzex zzexVar = (zzex) this.authenticationTag;
        zzfv zzfvVar = (zzfv) this.iv;
        ((zzfa) zzexVar).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zzkr zzkrVar = new zzkr();
        String zzf = zzkqVar.zzf();
        HashMap zze = zzkqVar.zze();
        com.google.android.gms.tasks.zzb zzbVar2 = zzbVar.zzd;
        TaskCompletionSource taskCompletionSource = zzbVar2 != null ? new TaskCompletionSource(zzbVar2) : new TaskCompletionSource();
        Object[] objArr = 0;
        Result result = new Result(zzkrVar, taskCompletionSource, false, 2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        zzln zzlnVar = new zzln(zzfvVar, zzf, result, new zzli(1, taskCompletionSource), zze);
        if (zzbVar2 != null) {
            zzbVar2.onCanceledRequested(new zzfv(zzlnVar, 14));
        }
        ((RequestQueue) zzfvVar.zza).add(zzlnVar);
        zzgc zzgcVar = new zzgc(27);
        zzw zzwVar = taskCompletionSource.zza;
        zzwVar.getClass();
        AndroidMainExecutor androidMainExecutor = TaskExecutors.MAIN_THREAD;
        return (zzw) ((zzw) zzwVar.continueWith(androidMainExecutor, zzgcVar)).continueWith(androidMainExecutor, new zzmb(this, elapsedRealtime, objArr == true ? 1 : 0));
    }

    public zzw zzc(zze zzeVar, zzns zznsVar) {
        if (TextUtils.isEmpty(zzeVar.zza)) {
            return Room.forException(new ApiException(new Status(9012, "Place ID must not be empty.", null, null)));
        }
        if (zzeVar.zzb.isEmpty()) {
            return Room.forException(new ApiException(new Status(9012, "Place Fields must not be empty.", null, null)));
        }
        zzje zzjeVar = (zzje) this.header;
        zznj zznjVar = Places.zza;
        zzkq zzkqVar = new zzkq(zzeVar, zznjVar.zzf(), zznjVar.zze(), zzjeVar, 1);
        zzex zzexVar = (zzex) this.authenticationTag;
        zbc zbcVar = (zbc) this.encryptedKey;
        ((zzfa) zzexVar).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zzw zza = zbcVar.zza(zzkqVar, zzkw.class);
        zzgc zzgcVar = new zzgc(28);
        zza.getClass();
        AndroidMainExecutor androidMainExecutor = TaskExecutors.MAIN_THREAD;
        return (zzw) ((zzw) zza.continueWith(androidMainExecutor, zzgcVar)).continueWith(androidMainExecutor, new zzlz(this, elapsedRealtime, zznsVar, 1));
    }

    public AutoValue_SessionConfig_OutputConfig build() {
        String str;
        if (((DeferrableSurface) this.header) == null) {
            str = " surface";
        } else {
            str = "";
        }
        if (((List) this.encryptedKey) == null) {
            str = str.concat(" sharedSurfaces");
        }
        if (((Integer) this.iv) == null) {
            str = str.concat(" mirrorMode");
        }
        if (((Integer) this.cipherText) == null) {
            str = str.concat(" surfaceGroupId");
        }
        if (((DynamicRange) this.authenticationTag) == null) {
            str = str.concat(" dynamicRange");
        }
        if (str.isEmpty()) {
            return new AutoValue_SessionConfig_OutputConfig((DeferrableSurface) this.header, (List) this.encryptedKey, ((Integer) this.iv).intValue(), ((Integer) this.cipherText).intValue(), (DynamicRange) this.authenticationTag);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(str));
        return null;
    }

    public JWECryptoParts(Map map) {
        map.getClass();
        this.header = new LinkedHashMap(map);
        this.encryptedKey = new LinkedHashMap();
        this.iv = new LinkedHashMap();
        this.cipherText = new LinkedHashMap();
        this.authenticationTag = new NavHostFragment$$ExternalSyntheticLambda1(this, 1);
    }

    public JWECryptoParts(AndroidDateFormatManager androidDateFormatManager, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory, AndroidClock androidClock, RealJurisdictionConfigManager realJurisdictionConfigManager) {
        this.header = androidDateFormatManager;
        this.encryptedKey = androidStringManager;
        this.iv = androidClock;
        this.cipherText = realJurisdictionConfigManager;
        this.authenticationTag = factory.create(MoneyFormatterConfig.STANDARD);
    }

    public JWECryptoParts(TtmlNode ttmlNode, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.header = ttmlNode;
        this.cipherText = hashMap2;
        this.authenticationTag = hashMap3;
        this.iv = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        ttmlNode.getEventTimes(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.encryptedKey = jArr;
    }

    public /* synthetic */ JWECryptoParts(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.header = obj;
        this.encryptedKey = obj2;
        this.iv = obj3;
        this.cipherText = obj4;
        this.authenticationTag = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JWECryptoParts(CircularRevealWidget circularRevealWidget) {
        this.header = circularRevealWidget;
        View view = (View) circularRevealWidget;
        this.encryptedKey = (FrameLayout) view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.iv = paint;
        paint.setColor(0);
    }
}
