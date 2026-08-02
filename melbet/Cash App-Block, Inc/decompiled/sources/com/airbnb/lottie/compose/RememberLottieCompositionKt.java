package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.plaid.internal.EnumC0170g;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ao\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022*\b\u0002\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aN\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a \u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0082@¢\u0006\u0004\b\u001b\u0010\u001c\u001a*\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010#\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010%\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&\u001a2\u0010'\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b'\u0010(\u001a1\u0010+\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,\u001a!\u00100\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101\u001a\u0017\u00102\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00104\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b4\u00103\"\u0014\u00105\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106¨\u00069²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "spec", "", "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", "cacheKey", "Lkotlin/Function3;", "", "", "Lkotlin/coroutines/Continuation;", "", "", "onRetry", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "rememberLottieComposition", "(Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieCompositionResult;", "Landroid/content/Context;", "context", "Lcom/airbnb/lottie/LottieComposition;", "lottieComposition", "(Landroid/content/Context;Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isWarmingCache", "Lcom/airbnb/lottie/LottieTask;", "lottieTask", "(Landroid/content/Context;Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Z)Lcom/airbnb/lottie/LottieTask;", "T", "await", "(Lcom/airbnb/lottie/LottieTask;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "composition", "", "loadImagesFromAssets", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/airbnb/lottie/LottieImageAsset;", "asset", "maybeLoadImageFromAsset", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieImageAsset;Ljava/lang/String;)V", "maybeDecodeBase64Image", "(Lcom/airbnb/lottie/LottieImageAsset;)V", "loadFontsFromAssets", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/airbnb/lottie/model/Font;", "font", "maybeLoadTypefaceFromAssets", "(Landroid/content/Context;Lcom/airbnb/lottie/model/Font;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/Typeface;", "typeface", "style", "typefaceForStyle", "(Landroid/graphics/Typeface;Ljava/lang/String;)Landroid/graphics/Typeface;", "ensureTrailingSlash", "(Ljava/lang/String;)Ljava/lang/String;", "ensureLeadingPeriod", "DefaultCacheKey", "Ljava/lang/String;", "Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;", "result", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RememberLottieCompositionKt {
    private static final String DefaultCacheKey = "__LottieInternalDefaultCacheKey__";

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object await(LottieTask<T> lottieTask, Continuation<? super T> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        lottieTask.addListener(new LottieListener() { // from class: com.airbnb.lottie.compose.RememberLottieCompositionKt$await$2$1
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(T t) {
                if (CancellableContinuation.this.isCompleted()) {
                    return;
                }
                CancellableContinuation cancellableContinuation = CancellableContinuation.this;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(t);
            }
        }).addFailureListener(new LottieListener() { // from class: com.airbnb.lottie.compose.RememberLottieCompositionKt$await$2$2
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Throwable th) {
                if (CancellableContinuation.this.isCompleted()) {
                    return;
                }
                CancellableContinuation cancellableContinuation = CancellableContinuation.this;
                Result.Companion companion = Result.Companion;
                th.getClass();
                cancellableContinuation.resumeWith(new Result.Failure(th));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureLeadingPeriod(String str) {
        return (StringsKt.isBlank(str) || StringsKt__StringsJVMKt.startsWith(str, ".", false)) ? str : ".".concat(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureTrailingSlash(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        return StringsKt.endsWith$default(str, '/') ? str : str.concat("/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadFontsFromAssets(Context context, LottieComposition lottieComposition, String str, String str2, Continuation<? super Unit> continuation) {
        if (lottieComposition.getFonts().isEmpty()) {
            return Unit.INSTANCE;
        }
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        Object withContext = JobKt.withContext(DefaultIoScheduler.INSTANCE, new RememberLottieCompositionKt$loadFontsFromAssets$2(lottieComposition, context, str, str2, null), continuation);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadImagesFromAssets(Context context, LottieComposition lottieComposition, String str, Continuation<? super Unit> continuation) {
        if (!lottieComposition.hasImages()) {
            return Unit.INSTANCE;
        }
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        Object withContext = JobKt.withContext(DefaultIoScheduler.INSTANCE, new RememberLottieCompositionKt$loadImagesFromAssets$2(lottieComposition, context, str, null), continuation);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r13 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object lottieComposition(Context context, LottieCompositionSpec lottieCompositionSpec, String str, String str2, String str3, String str4, Continuation<? super LottieComposition> continuation) {
        RememberLottieCompositionKt$lottieComposition$1 rememberLottieCompositionKt$lottieComposition$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        LottieComposition lottieComposition;
        String str5;
        Context context2;
        LottieComposition lottieComposition2;
        String str6;
        if (continuation instanceof RememberLottieCompositionKt$lottieComposition$1) {
            rememberLottieCompositionKt$lottieComposition$1 = (RememberLottieCompositionKt$lottieComposition$1) continuation;
            int i2 = rememberLottieCompositionKt$lottieComposition$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                rememberLottieCompositionKt$lottieComposition$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = rememberLottieCompositionKt$lottieComposition$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rememberLottieCompositionKt$lottieComposition$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    LottieTask<LottieComposition> lottieTask = lottieTask(context, lottieCompositionSpec, str4, false);
                    if (lottieTask == null) {
                        a$$ExternalSyntheticBUOutline0.m("Unable to create parsing task for ", lottieCompositionSpec, ".");
                        return null;
                    }
                    rememberLottieCompositionKt$lottieComposition$1.L$0 = context;
                    rememberLottieCompositionKt$lottieComposition$1.L$1 = str;
                    rememberLottieCompositionKt$lottieComposition$1.L$2 = str2;
                    rememberLottieCompositionKt$lottieComposition$1.L$3 = str3;
                    rememberLottieCompositionKt$lottieComposition$1.label = 1;
                    obj = await(lottieTask, rememberLottieCompositionKt$lottieComposition$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            LottieComposition lottieComposition3 = (LottieComposition) rememberLottieCompositionKt$lottieComposition$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            return lottieComposition3;
                        }
                        lottieComposition2 = (LottieComposition) rememberLottieCompositionKt$lottieComposition$1.L$3;
                        str6 = (String) rememberLottieCompositionKt$lottieComposition$1.L$2;
                        str5 = (String) rememberLottieCompositionKt$lottieComposition$1.L$1;
                        context2 = (Context) rememberLottieCompositionKt$lottieComposition$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        rememberLottieCompositionKt$lottieComposition$1.L$0 = lottieComposition2;
                        rememberLottieCompositionKt$lottieComposition$1.L$1 = null;
                        rememberLottieCompositionKt$lottieComposition$1.L$2 = null;
                        rememberLottieCompositionKt$lottieComposition$1.L$3 = null;
                        rememberLottieCompositionKt$lottieComposition$1.label = 3;
                        return loadFontsFromAssets(context2, lottieComposition2, str5, str6, rememberLottieCompositionKt$lottieComposition$1) != coroutineSingletons ? coroutineSingletons : lottieComposition2;
                    }
                    str3 = (String) rememberLottieCompositionKt$lottieComposition$1.L$3;
                    str2 = (String) rememberLottieCompositionKt$lottieComposition$1.L$2;
                    str = (String) rememberLottieCompositionKt$lottieComposition$1.L$1;
                    context = (Context) rememberLottieCompositionKt$lottieComposition$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                lottieComposition = (LottieComposition) obj;
                rememberLottieCompositionKt$lottieComposition$1.L$0 = context;
                rememberLottieCompositionKt$lottieComposition$1.L$1 = str2;
                rememberLottieCompositionKt$lottieComposition$1.L$2 = str3;
                rememberLottieCompositionKt$lottieComposition$1.L$3 = lottieComposition;
                rememberLottieCompositionKt$lottieComposition$1.label = 2;
                if (loadImagesFromAssets(context, lottieComposition, str, rememberLottieCompositionKt$lottieComposition$1) != coroutineSingletons) {
                    str5 = str2;
                    context2 = context;
                    lottieComposition2 = lottieComposition;
                    str6 = str3;
                    rememberLottieCompositionKt$lottieComposition$1.L$0 = lottieComposition2;
                    rememberLottieCompositionKt$lottieComposition$1.L$1 = null;
                    rememberLottieCompositionKt$lottieComposition$1.L$2 = null;
                    rememberLottieCompositionKt$lottieComposition$1.L$3 = null;
                    rememberLottieCompositionKt$lottieComposition$1.label = 3;
                    if (loadFontsFromAssets(context2, lottieComposition2, str5, str6, rememberLottieCompositionKt$lottieComposition$1) != coroutineSingletons) {
                    }
                }
            }
        }
        rememberLottieCompositionKt$lottieComposition$1 = new RememberLottieCompositionKt$lottieComposition$1(continuation);
        Object obj2 = rememberLottieCompositionKt$lottieComposition$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rememberLottieCompositionKt$lottieComposition$1.label;
        if (i != 0) {
        }
        lottieComposition = (LottieComposition) obj2;
        rememberLottieCompositionKt$lottieComposition$1.L$0 = context;
        rememberLottieCompositionKt$lottieComposition$1.L$1 = str2;
        rememberLottieCompositionKt$lottieComposition$1.L$2 = str3;
        rememberLottieCompositionKt$lottieComposition$1.L$3 = lottieComposition;
        rememberLottieCompositionKt$lottieComposition$1.label = 2;
        if (loadImagesFromAssets(context, lottieComposition, str, rememberLottieCompositionKt$lottieComposition$1) != coroutineSingletons) {
        }
    }

    public static /* synthetic */ Object lottieComposition$default(Context context, LottieCompositionSpec lottieCompositionSpec, String str, String str2, String str3, String str4, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = "fonts/";
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = ".ttf";
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = DefaultCacheKey;
        }
        return lottieComposition(context, lottieCompositionSpec, str5, str6, str7, str4, continuation);
    }

    private static final LottieTask<LottieComposition> lottieTask(Context context, LottieCompositionSpec lottieCompositionSpec, String str, boolean z) {
        if (lottieCompositionSpec instanceof LottieCompositionSpec.RawRes) {
            return Intrinsics.areEqual(str, DefaultCacheKey) ? LottieCompositionFactory.fromRawRes(context, ((LottieCompositionSpec.RawRes) lottieCompositionSpec).m1530unboximpl()) : LottieCompositionFactory.fromRawRes(context, ((LottieCompositionSpec.RawRes) lottieCompositionSpec).m1530unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.Url) {
            return Intrinsics.areEqual(str, DefaultCacheKey) ? LottieCompositionFactory.fromUrl(context, ((LottieCompositionSpec.Url) lottieCompositionSpec).m1537unboximpl()) : LottieCompositionFactory.fromUrl(context, ((LottieCompositionSpec.Url) lottieCompositionSpec).m1537unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.File) {
            if (z) {
                return null;
            }
            LottieCompositionSpec.File file = (LottieCompositionSpec.File) lottieCompositionSpec;
            FileInputStream fileInputStream = new FileInputStream(file.m1516unboximpl());
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                str = file.m1516unboximpl();
            }
            return StringsKt__StringsJVMKt.endsWith(file.m1516unboximpl(), "zip", false) ? LottieCompositionFactory.fromZipStream(new ZipInputStream(fileInputStream), str) : StringsKt__StringsJVMKt.endsWith(file.m1516unboximpl(), "tgs", false) ? LottieCompositionFactory.fromJsonInputStream(new GZIPInputStream(fileInputStream), str) : LottieCompositionFactory.fromJsonInputStream(fileInputStream, str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.Asset) {
            return Intrinsics.areEqual(str, DefaultCacheKey) ? LottieCompositionFactory.fromAsset(context, ((LottieCompositionSpec.Asset) lottieCompositionSpec).m1502unboximpl()) : LottieCompositionFactory.fromAsset(context, ((LottieCompositionSpec.Asset) lottieCompositionSpec).m1502unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.JsonString) {
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                str = String.valueOf(((LottieCompositionSpec.JsonString) lottieCompositionSpec).m1523unboximpl().hashCode());
            }
            return LottieCompositionFactory.fromJsonString(((LottieCompositionSpec.JsonString) lottieCompositionSpec).m1523unboximpl(), str);
        }
        if (!(lottieCompositionSpec instanceof LottieCompositionSpec.ContentProvider)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        LottieCompositionSpec.ContentProvider contentProvider = (LottieCompositionSpec.ContentProvider) lottieCompositionSpec;
        InputStream openInputStream = context.getContentResolver().openInputStream(contentProvider.m1509unboximpl());
        if (Intrinsics.areEqual(str, DefaultCacheKey)) {
            str = contentProvider.m1509unboximpl().toString();
        }
        return LottieCompositionFactory.fromInputStream(context, openInputStream, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeDecodeBase64Image(LottieImageAsset lottieImageAsset) {
        if (lottieImageAsset.getBitmap() != null) {
            return;
        }
        String fileName = lottieImageAsset.getFileName();
        fileName.getClass();
        if (!StringsKt__StringsJVMKt.startsWith(fileName, "data:", false) || StringsKt.indexOf$default((CharSequence) fileName, "base64,", 0, false, 6) <= 0) {
            return;
        }
        try {
            byte[] decode = Base64.decode(fileName.substring(StringsKt.indexOf$default((CharSequence) fileName, ',', 0, false, 6) + 1), 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
            lottieImageAsset.setBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
        } catch (IllegalArgumentException e) {
            Logger.warning("data URL did not have correct base64 format.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeLoadImageFromAsset(Context context, LottieImageAsset lottieImageAsset, String str) {
        if (lottieImageAsset.getBitmap() != null || str == null) {
            return;
        }
        String fileName = lottieImageAsset.getFileName();
        try {
            InputStream open = context.getAssets().open(str + fileName);
            open.getClass();
            Bitmap bitmap = null;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
                bitmap = BitmapFactory.decodeStream(open, null, options);
            } catch (IllegalArgumentException e) {
                Logger.warning("Unable to decode image.", e);
            }
            if (bitmap != null) {
                lottieImageAsset.setBitmap(Utils.resizeBitmapIfNeeded(bitmap, lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
            }
        } catch (IOException e2) {
            Logger.warning("Unable to open asset.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeLoadTypefaceFromAssets(Context context, Font font, String str, String str2) {
        String m = Recorder$$ExternalSyntheticOutline2.m(str, font.getFamily(), str2);
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), m);
            try {
                createFromAsset.getClass();
                String style = font.getStyle();
                style.getClass();
                font.setTypeface(typefaceForStyle(createFromAsset, style));
            } catch (Exception e) {
                Logger.error(Boxes$$ExternalSyntheticOutline1.m("Failed to create ", font.getFamily(), " typeface with style=", font.getStyle(), "!"), e);
            }
        } catch (Exception e2) {
            Logger.error("Failed to find typeface in assets with path " + m + ".", e2);
        }
    }

    public static final LottieCompositionResult rememberLottieComposition(LottieCompositionSpec lottieCompositionSpec, String str, String str2, String str3, String str4, Function3 function3, Composer composer, int i, int i2) {
        lottieCompositionSpec.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceableGroup(-1248473602);
        String str5 = (i2 & 2) != 0 ? null : str;
        String str6 = (i2 & 4) != 0 ? "fonts/" : str2;
        String str7 = (i2 & 8) != 0 ? ".ttf" : str3;
        String str8 = (i2 & 16) != 0 ? DefaultCacheKey : str4;
        Function3 rememberLottieCompositionKt$rememberLottieComposition$1 = (i2 & 32) != 0 ? new RememberLottieCompositionKt$rememberLottieComposition$1(null) : function3;
        Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
        gapComposer.startReplaceableGroup(1388713953);
        int i3 = (i & 14) ^ 6;
        boolean z = (i3 > 4 && gapComposer.changed(lottieCompositionSpec)) || (i & 6) == 4;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (z || rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(new LottieCompositionResultImpl());
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        gapComposer.end(false);
        gapComposer.startReplaceableGroup(1388714244);
        boolean z2 = ((((57344 & i) ^ 24576) > 16384 && gapComposer.changed(str8)) || (i & 24576) == 16384) | ((i3 > 4 && gapComposer.changed(lottieCompositionSpec)) || (i & 6) == 4);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (z2 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = lottieTask(context, lottieCompositionSpec, str8, true);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        gapComposer.end(false);
        Updater.LaunchedEffect(lottieCompositionSpec, str8, new RememberLottieCompositionKt$rememberLottieComposition$3(rememberLottieCompositionKt$rememberLottieComposition$1, context, lottieCompositionSpec, str5, str6, str7, str8, mutableState, null), gapComposer);
        LottieCompositionResultImpl rememberLottieComposition$lambda$1 = rememberLottieComposition$lambda$1(mutableState);
        gapComposer.end(false);
        return rememberLottieComposition$lambda$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieCompositionResultImpl rememberLottieComposition$lambda$1(MutableState mutableState) {
        return (LottieCompositionResultImpl) mutableState.getValue();
    }

    private static final Typeface typefaceForStyle(Typeface typeface, String str) {
        int i = 0;
        boolean contains = StringsKt.contains((CharSequence) str, (CharSequence) "Italic", false);
        boolean contains2 = StringsKt.contains((CharSequence) str, (CharSequence) "Bold", false);
        if (contains && contains2) {
            i = 3;
        } else if (contains) {
            i = 2;
        } else if (contains2) {
            i = 1;
        }
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
