package app.cash.zipline;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.video.Recorder;
import androidx.collection.LongSparseArray;
import androidx.collection.SieveCacheKt;
import androidx.collection.SimpleArrayMap;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.common.FlagSet;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ColorParser;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.Id3Peeker$$ExternalSyntheticBUOutline0;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import androidx.media3.extractor.text.webvtt.WebvttCssStyle;
import androidx.media3.extractor.text.webvtt.WebvttCueInfo;
import androidx.media3.extractor.text.webvtt.WebvttCueParser;
import androidx.media3.extractor.text.webvtt.WebvttParserUtil;
import androidx.media3.extractor.ts.SectionPayloadReader;
import androidx.media3.extractor.ts.SectionReader;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.paging.PageFetcher;
import androidx.paging.PageFetcher$LoadRequest$Refresh;
import androidx.paging.PageFetcher$RefreshType$All;
import androidx.paging.UiReceiver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ViewInfoStore$InfoRecord;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.tracing.Trace;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import app.cash.redwood.lazylayout.view.ViewLazyList$processor$1;
import app.cash.redwood.lazylayout.widget.LazyListUpdateProcessor$Binding;
import app.cash.redwood.ui.Cancellable;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import app.cash.redwood.widget.Widget;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import coil3.ExtrasKt;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.request.ImageRequest;
import coil3.svg.internal.AndroidSvg;
import coil3.target.Target;
import com.android.volley.AuthFailureError;
import com.android.volley.Cache$Entry;
import com.android.volley.ClientError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpResponse;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.NetworkUtility;
import com.bugsnag.android.TraceParser;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.file.FileResource;
import com.bumptech.glide.provider.ResourceDecoderRegistry$Entry;
import com.datadog.android.DatadogSite;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.DeviceInfo;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.LocaleInfo;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.ProcessInfo;
import com.datadog.android.api.context.TimeInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.core.internal.ContextProvider;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.system.AndroidInfoProvider;
import com.datadog.android.privacy.TrackingConsent;
import com.google.android.filament.Viewport;
import com.google.android.gms.internal.mlkit_vision_common.zzhm;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzb;
import com.google.android.gms.tasks.zzw;
import com.google.android.libraries.places.internal.zzcjk;
import com.google.common.base.Ascii;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.internal.zzh;
import com.google.mlkit.vision.common.InputImage;
import com.squareup.cash.util.BackHandlerKt;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Callback;
import okhttp3.ResponseBody;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Utf8;
import retrofit2.AndroidMainExecutor;

/* loaded from: classes3.dex */
public final class CallResult implements DataSource.Factory, SubtitleParser, SectionPayloadReader, UiReceiver, SupportSQLiteQuery, ImageAnalysis.Analyzer, Widget.Children, Cancellable, Callback, Target, ResourceEncoder, ContextProvider {
    public Object result;
    public Object serviceNames;

    public CallResult(int i) {
        switch (i) {
            case 8:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.result = byteArrayOutputStream;
                this.serviceNames = new DataOutputStream(byteArrayOutputStream);
                break;
            case 9:
                this.result = new ParsableByteArray();
                this.serviceNames = new WebvttCssParser();
                break;
            case 12:
                this.result = new SparseIntArray();
                this.serviceNames = new SparseIntArray();
                break;
            case 13:
                this.result = new SimpleArrayMap(0);
                this.serviceNames = new LongSparseArray((Object) null);
                break;
            case 24:
                this.result = new HashMap();
                this.serviceNames = new zzb(3);
                break;
            case 28:
                this.result = new ArrayList();
                this.serviceNames = new HashMap();
                break;
            default:
                this.result = new HashMap();
                this.serviceNames = CodecParameters.EMPTY;
                break;
        }
    }

    public static void access$2000(CallResult callResult, CodecParameters codecParameters) {
        callResult.getClass();
        for (Map.Entry entry : new HashMap((HashMap) callResult.result).entrySet()) {
            if (entry.getKey() != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                return;
            } else {
                List list = (List) entry.getValue();
                if (!createFilteredCodecParameters(codecParameters, list).equals(createFilteredCodecParameters((CodecParameters) callResult.serviceNames, list))) {
                    throw null;
                }
            }
        }
        callResult.serviceNames = codecParameters;
    }

    public static CodecParameters createFilteredCodecParameters(CodecParameters codecParameters, List list) {
        codecParameters.getClass();
        Map map = codecParameters.params;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new CodecParameters(hashMap);
    }

    public static FileResource decode(ImageDecoder.Source source, int i, int i2, Options options) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new DefaultOnHeaderDecodedListener(i, i2, options));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new FileResource((AnimatedImageDrawable) decodeDrawable, 3);
        }
        a$$ExternalSyntheticBUOutline0.m$3(decodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }

    public static int getSpanGroupIndex(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public void addToPostLayout(RecyclerView.ViewHolder viewHolder, Viewport viewport) {
        SimpleArrayMap simpleArrayMap = (SimpleArrayMap) this.result;
        ViewInfoStore$InfoRecord viewInfoStore$InfoRecord = (ViewInfoStore$InfoRecord) simpleArrayMap.get(viewHolder);
        if (viewInfoStore$InfoRecord == null) {
            viewInfoStore$InfoRecord = ViewInfoStore$InfoRecord.obtain();
            simpleArrayMap.put(viewHolder, viewInfoStore$InfoRecord);
        }
        viewInfoStore$InfoRecord.postInfo = viewport;
        viewInfoStore$InfoRecord.flags |= 8;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(SettableImageProxy settableImageProxy) {
        Image image = settableImageProxy.mImage.getImage();
        if (image == null) {
            settableImageProxy.close();
            return;
        }
        InputImage fromMediaImage = InputImage.fromMediaImage(image, settableImageProxy.mImageInfo.getRotationDegrees());
        zzh zzhVar = (zzh) ((BarcodeScanner) ((Lazy) this.serviceNames).getValue());
        Task onSuccessTask = zzhVar.processBase(fromMediaImage).onSuccessTask(new OffsetApplier(zzhVar, fromMediaImage.zzd, fromMediaImage.zze, 7));
        ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2 = new ExoPlayerImplInternal$$ExternalSyntheticLambda2(new xg$$ExternalSyntheticLambda9(this, 2), 16);
        zzw zzwVar = (zzw) onSuccessTask;
        AndroidMainExecutor androidMainExecutor = TaskExecutors.MAIN_THREAD;
        zzwVar.addOnSuccessListener(androidMainExecutor, exoPlayerImplInternal$$ExternalSyntheticLambda2);
        zzwVar.addOnFailureListener(androidMainExecutor, new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(13));
        zzwVar.addOnCompleteListener(new ExoPlayerImplInternal$$ExternalSyntheticLambda2(settableImageProxy, 17));
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        BackHandlerKt.bind(supportSQLiteProgram, (Object[]) this.serviceNames);
    }

    @Override // app.cash.redwood.ui.Cancellable
    public void cancel() {
        ((Response) this.result).result = null;
        ((RedwoodLayoutKt$toAndroid$1) this.serviceNames).remove();
    }

    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    public void consume(ParsableByteArray parsableByteArray) {
        TsExtractor tsExtractor = (TsExtractor) this.serviceNames;
        SparseArray sparseArray = tsExtractor.tsPayloadReaders;
        VorbisBitArray vorbisBitArray = (VorbisBitArray) this.result;
        if (parsableByteArray.readUnsignedByte() == 0 && (parsableByteArray.readUnsignedByte() & 128) != 0) {
            parsableByteArray.skipBytes(6);
            int bytesLeft = parsableByteArray.bytesLeft() / 4;
            for (int i = 0; i < bytesLeft; i++) {
                parsableByteArray.readBytes(0, 4, vorbisBitArray.data);
                vorbisBitArray.setPosition(0);
                int readBits = vorbisBitArray.readBits(16);
                vorbisBitArray.skipBits(3);
                if (readBits == 0) {
                    vorbisBitArray.skipBits(13);
                } else {
                    int readBits2 = vorbisBitArray.readBits(13);
                    if (sparseArray.get(readBits2) == null) {
                        sparseArray.put(readBits2, new SectionReader(new TraceParser(tsExtractor, readBits2)));
                        tsExtractor.remainingPmts++;
                    }
                }
            }
            sparseArray.remove(0);
        }
    }

    public boolean contains(int i) {
        return ((FlagSet) this.result).flags.get(i);
    }

    @Override // androidx.media3.datasource.DataSource.Factory
    public DataSource createDataSource() {
        return new DefaultDataSource((Context) this.result, ((OffsetApplier) this.serviceNames).createDataSource());
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public void detach() {
        ((ArrayList) this.result).clear();
        ViewLazyList$processor$1 viewLazyList$processor$1 = (ViewLazyList$processor$1) this.serviceNames;
        viewLazyList$processor$1.firstPlaceholder = null;
        viewLazyList$processor$1.placeholdersQueue.clear();
        for (LazyListUpdateProcessor$Binding lazyListUpdateProcessor$Binding : CollectionsKt.toList(viewLazyList$processor$1.itemsBefore.elements)) {
            if (lazyListUpdateProcessor$Binding.view != null) {
                lazyListUpdateProcessor$Binding.processor.getClass();
            }
            lazyListUpdateProcessor$Binding.content = null;
            lazyListUpdateProcessor$Binding.view = null;
        }
        for (LazyListUpdateProcessor$Binding lazyListUpdateProcessor$Binding2 : CollectionsKt.toList(viewLazyList$processor$1.itemsAfter.elements)) {
            if (lazyListUpdateProcessor$Binding2.view != null) {
                lazyListUpdateProcessor$Binding2.processor.getClass();
            }
            lazyListUpdateProcessor$Binding2.content = null;
            lazyListUpdateProcessor$Binding2.view = null;
        }
    }

    public void disabled(DecoderCounters decoderCounters) {
        synchronized (decoderCounters) {
        }
        Handler handler = (Handler) this.result;
        if (handler != null) {
            handler.post(new DispatchQueue$$ExternalSyntheticLambda0(23, this, decoderCounters));
        }
    }

    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(Object obj, File file, Options options) {
        return ((BitmapEncoder) this.serviceNames).encode(new BitmapResource(((BitmapDrawable) ((Resource) obj).get()).getBitmap(), (BitmapPool) this.result), file, options);
    }

    public File get() {
        if (((File) this.result) == null) {
            this.result = new File(((Context) this.serviceNames).getCacheDir(), "volley");
        }
        return (File) this.result;
    }

    @Override // com.datadog.android.core.internal.ContextProvider
    public DatadogContext getContext(Set set) {
        set.getClass();
        DatadogSite datadogSite = ((CoreFeature) this.result).site;
        String str = ((CoreFeature) this.result).clientToken;
        String str2 = ((CoreFeature) this.result).serviceName;
        String str3 = ((CoreFeature) this.result).envName;
        String version = ((CoreFeature) this.result).packageVersionProvider.getVersion();
        int versionCode = ((CoreFeature) this.result).packageVersionProvider.getVersionCode();
        String str4 = ((CoreFeature) this.result).variant;
        String str5 = ((CoreFeature) this.result).sdkVersion;
        String str6 = ((CoreFeature) this.result).sourceName;
        TimeInfo composeTimeInfo = zzhm.composeTimeInfo(((CoreFeature) this.result).timeProvider);
        ProcessInfo processInfo = new ProcessInfo(((CoreFeature) this.result).isMainProcess);
        NetworkInfo latestNetworkInfo = ((CoreFeature) this.result).networkInfoProvider.getLatestNetworkInfo();
        AndroidInfoProvider androidInfoProvider = ((CoreFeature) this.result).androidInfoProvider;
        String deviceName = androidInfoProvider.getDeviceName();
        String deviceBrand = androidInfoProvider.getDeviceBrand();
        DeviceType deviceType = androidInfoProvider.getDeviceType();
        String deviceModel = androidInfoProvider.getDeviceModel();
        String deviceBuildId = androidInfoProvider.getDeviceBuildId();
        String osName = androidInfoProvider.getOsName();
        String osVersion = androidInfoProvider.getOsVersion();
        String osMajorVersion = androidInfoProvider.getOsMajorVersion();
        String architecture = androidInfoProvider.getArchitecture();
        Integer numberOfDisplays = androidInfoProvider.getNumberOfDisplays();
        AndroidInfoProvider androidInfoProvider2 = ((CoreFeature) this.result).androidInfoProvider;
        DeviceInfo deviceInfo = new DeviceInfo(deviceName, deviceBrand, deviceModel, deviceType, deviceBuildId, osName, osMajorVersion, osVersion, architecture, numberOfDisplays, new LocaleInfo(androidInfoProvider2.getLocales(), androidInfoProvider2.getCurrentLocale(), androidInfoProvider2.getTimeZone()));
        UserInfo userInfo = ((CoreFeature) this.result).userInfoProvider.getUserInfo();
        ((CoreFeature) this.result).accountInfoProvider.getClass();
        TrackingConsent consent = ((CoreFeature) this.result).trackingConsentProvider.getConsent();
        String str7 = ((CoreFeature) this.result).appBuildId;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str8 = str7;
            String str9 = (String) it.next();
            Iterator it2 = it;
            DatadogCore datadogCore = (DatadogCore) ((ExoPlayerImplInternal$$ExternalSyntheticLambda2) this.serviceNames).f$0;
            str9.getClass();
            Map featureContext = datadogCore.getFeatureContext(str9);
            if (!featureContext.isEmpty()) {
                linkedHashMap.put(str9, featureContext);
            }
            it = it2;
            str7 = str8;
        }
        return new DatadogContext(datadogSite, str, str2, str3, version, versionCode, str4, str6, str5, composeTimeInfo, processInfo, latestNetworkInfo, deviceInfo, userInfo, consent, str7, linkedHashMap);
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    public int getEncodeStrategy(Options options) {
        return 2;
    }

    public Extractor getExtractor(Object... objArr) {
        Constructor constructor;
        synchronized (((AtomicBoolean) this.serviceNames)) {
            if (!((AtomicBoolean) this.serviceNames).get()) {
                try {
                    constructor = ((Id3Peeker$$ExternalSyntheticBUOutline0) this.result).getConstructor();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.serviceNames).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (Extractor) constructor.newInstance(objArr);
        } catch (Exception e2) {
            a$$ExternalSyntheticBUOutline0.m("Unexpected error creating extractor", e2);
            return null;
        }
    }

    public synchronized List getOrAddEntryList(String str) {
        List list;
        try {
            if (!((ArrayList) this.result).contains(str)) {
                ((ArrayList) this.result).add(str);
            }
            list = (List) ((HashMap) this.serviceNames).get(str);
            if (list == null) {
                list = new ArrayList();
                ((HashMap) this.serviceNames).put(str, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }

    public synchronized ArrayList getResourceClasses(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.result).iterator();
        while (it.hasNext()) {
            List<ResourceDecoderRegistry$Entry> list = (List) ((HashMap) this.serviceNames).get((String) it.next());
            if (list != null) {
                for (ResourceDecoderRegistry$Entry resourceDecoderRegistry$Entry : list) {
                    if ((resourceDecoderRegistry$Entry.dataClass.isAssignableFrom(cls) && cls2.isAssignableFrom(resourceDecoderRegistry$Entry.resourceClass)) && !arrayList.contains(resourceDecoderRegistry$Entry.resourceClass)) {
                        arrayList.add(resourceDecoderRegistry$Entry.resourceClass);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String getSql() {
        return (String) this.result;
    }

    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, zzcjk zzcjkVar) {
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public void insert(int i, Widget widget) {
        widget.getClass();
        ((ArrayList) this.result).add(widget);
        ViewLazyList$processor$1 viewLazyList$processor$1 = (ViewLazyList$processor$1) this.serviceNames;
        if (viewLazyList$processor$1.firstPlaceholder == null) {
            viewLazyList$processor$1.firstPlaceholder = widget;
        }
        viewLazyList$processor$1.placeholdersQueue.addLast(widget);
    }

    public void invalidateSpanIndexCache() {
        ((SparseIntArray) this.result).clear();
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public void move(int i, int i2, int i3) {
        throw new IllegalStateException("unexpected call");
    }

    @Override // coil3.target.Target
    public void onError(coil3.Image image) {
    }

    @Override // okhttp3.Callback
    public void onFailure(okhttp3.Call call, IOException iOException) {
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.result;
        Result.Companion companion = Result.Companion;
        cancellableContinuationImpl.resumeWith(new Result.Failure(iOException));
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public void onModifierUpdated(int i, Widget widget) {
        widget.getClass();
    }

    @Override // okhttp3.Callback
    public void onResponse(okhttp3.Call call, okhttp3.Response response) {
        String str = (String) this.serviceNames;
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.result;
        try {
            try {
                if (!response.isSuccessful) {
                    throw new IOException("failed to fetch " + str + ": " + response.code);
                }
                ResponseBody responseBody = response.body;
                responseBody.getClass();
                ByteString byteString = responseBody.byteString();
                response.close();
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(byteString);
            } catch (IOException e) {
                Result.Companion companion2 = Result.Companion;
                cancellableContinuationImpl.resumeWith(new Result.Failure(e));
                response.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Utf8.closeFinally(response, th);
                throw th2;
            }
        }
    }

    @Override // coil3.target.Target
    public void onStart(coil3.Image image) {
        Painter painter;
        ImageRequest imageRequest = (ImageRequest) this.result;
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.serviceNames;
        Painter m1445asPainter55t9rM = image != null ? AsyncImageKt.m1445asPainter55t9rM(image, imageRequest.context, asyncImagePainter.filterQuality) : null;
        if (m1445asPainter55t9rM == null && ((Boolean) ExtrasKt.getExtra(imageRequest, AsyncImageKt.useExistingImageAsPlaceholderKey)).booleanValue() && (painter = asyncImagePainter.getPainter()) != null) {
            m1445asPainter55t9rM = painter;
        }
        AsyncImagePainter.access$updateState(asyncImagePainter, new AsyncImagePainter.State.Loading(m1445asPainter55t9rM));
    }

    @Override // coil3.target.Target
    public void onSuccess(coil3.Image image) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x03ad, code lost:
    
        r1.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0117, code lost:
    
        if (")".equals(androidx.media3.extractor.text.webvtt.WebvttCssParser.parseNextToken(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // androidx.media3.extractor.text.SubtitleParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        WebvttCueInfo webvttCueInfo;
        String str;
        ?? r0;
        String sb;
        int i3;
        char c;
        CallResult callResult = this;
        ParsableByteArray parsableByteArray = (ParsableByteArray) callResult.result;
        parsableByteArray.reset(i + i2, bArr);
        parsableByteArray.setPosition(i);
        ArrayList arrayList = new ArrayList();
        try {
            WebvttParserUtil.validateWebvttHeaderLine(parsableByteArray);
            while (!TextUtils.isEmpty(parsableByteArray.readLine(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z = false;
                int i4 = -1;
                int i5 = 0;
                char c2 = 65535;
                while (true) {
                    ?? r9 = 1;
                    if (c2 == 65535) {
                        i5 = parsableByteArray.position;
                        String readLine = parsableByteArray.readLine(StandardCharsets.UTF_8);
                        c2 = readLine == null ? (char) 0 : "STYLE".equals(readLine) ? (char) 2 : readLine.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        parsableByteArray.setPosition(i5);
                        if (c2 == 0) {
                            LegacySubtitleUtil.toCuesWithTiming(new Recorder.AnonymousClass3(arrayList2), outputOptions, consumer);
                            return;
                        }
                        if (c2 == 1) {
                            while (!TextUtils.isEmpty(parsableByteArray.readLine(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str2 = null;
                            if (c2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    a$$ExternalSyntheticBUOutline0.m$3("A style block was found after the first cue.");
                                    return;
                                }
                                parsableByteArray.readLine(StandardCharsets.UTF_8);
                                WebvttCssParser webvttCssParser = (WebvttCssParser) callResult.serviceNames;
                                ParsableByteArray parsableByteArray2 = webvttCssParser.styleInput;
                                StringBuilder sb2 = webvttCssParser.stringBuilder;
                                sb2.setLength(0);
                                int i6 = parsableByteArray.position;
                                while (!TextUtils.isEmpty(parsableByteArray.readLine(StandardCharsets.UTF_8))) {
                                }
                                parsableByteArray2.reset(parsableByteArray.position, parsableByteArray.data);
                                parsableByteArray2.setPosition(i6);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    WebvttCssParser.skipWhitespaceAndComments(parsableByteArray2);
                                    if (parsableByteArray2.bytesLeft() >= 5 && "::cue".equals(parsableByteArray2.readString(5, StandardCharsets.UTF_8))) {
                                        int i7 = parsableByteArray2.position;
                                        String parseNextToken = WebvttCssParser.parseNextToken(parsableByteArray2, sb2);
                                        if (parseNextToken != null) {
                                            if ("{".equals(parseNextToken)) {
                                                parsableByteArray2.setPosition(i7);
                                                str = "";
                                            } else if ("(".equals(parseNextToken)) {
                                                int i8 = parsableByteArray2.position;
                                                int i9 = parsableByteArray2.limit;
                                                boolean z2 = z ? 1 : 0;
                                                while (i8 < i9 && z2 == 0) {
                                                    int i10 = i8 + 1;
                                                    z2 = ((char) parsableByteArray2.data[i8]) == ')' ? r9 : z ? 1 : 0;
                                                    i8 = i10;
                                                }
                                                str = parsableByteArray2.readString((i8 - 1) - parsableByteArray2.position, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = str2;
                                            }
                                            if (str == null && "{".equals(WebvttCssParser.parseNextToken(parsableByteArray2, sb2))) {
                                                WebvttCssStyle webvttCssStyle = new WebvttCssStyle();
                                                webvttCssStyle.targetId = "";
                                                webvttCssStyle.targetTag = "";
                                                webvttCssStyle.targetClasses = Collections.EMPTY_SET;
                                                webvttCssStyle.targetVoice = "";
                                                webvttCssStyle.fontFamily = str2;
                                                webvttCssStyle.hasFontColor = z;
                                                webvttCssStyle.hasBackgroundColor = z;
                                                webvttCssStyle.linethrough = i4;
                                                webvttCssStyle.underline = i4;
                                                webvttCssStyle.bold = i4;
                                                webvttCssStyle.italic = i4;
                                                webvttCssStyle.fontSizeUnit = i4;
                                                webvttCssStyle.rubyPosition = i4;
                                                webvttCssStyle.combineUpright = z;
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i4) {
                                                        ?? matcher = WebvttCssParser.VOICE_NAME_PATTERN.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(r9);
                                                            group.getClass();
                                                            webvttCssStyle.targetVoice = group;
                                                        }
                                                        str = str.substring(z ? 1 : 0, indexOf);
                                                    }
                                                    String str3 = Util.DEVICE_DEBUG_INFO;
                                                    String[] split = str.split("\\.", i4);
                                                    String str4 = split[z ? 1 : 0];
                                                    int indexOf2 = str4.indexOf(35);
                                                    if (indexOf2 != i4) {
                                                        webvttCssStyle.targetTag = str4.substring(z ? 1 : 0, indexOf2);
                                                        webvttCssStyle.targetId = str4.substring(indexOf2 + 1);
                                                    } else {
                                                        webvttCssStyle.targetTag = str4;
                                                    }
                                                    if (split.length > r9) {
                                                        int length = split.length;
                                                        Trace.checkArgument(length <= split.length ? r9 : z ? 1 : 0);
                                                        webvttCssStyle.targetClasses = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, (int) r9, length)));
                                                    }
                                                }
                                                boolean z3 = z ? 1 : 0;
                                                String str5 = str2;
                                                boolean z4 = r9;
                                                while (z3 == 0) {
                                                    int i11 = parsableByteArray2.position;
                                                    str5 = WebvttCssParser.parseNextToken(parsableByteArray2, sb2);
                                                    boolean z5 = (str5 == null || "}".equals(str5)) ? z4 : z;
                                                    if (z5 == 0) {
                                                        parsableByteArray2.setPosition(i11);
                                                        WebvttCssParser.skipWhitespaceAndComments(parsableByteArray2);
                                                        String parseIdentifier = WebvttCssParser.parseIdentifier(parsableByteArray2, sb2);
                                                        if (!parseIdentifier.isEmpty() && ":".equals(WebvttCssParser.parseNextToken(parsableByteArray2, sb2))) {
                                                            WebvttCssParser.skipWhitespaceAndComments(parsableByteArray2);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            boolean z6 = false;
                                                            while (true) {
                                                                if (z6) {
                                                                    sb = sb3.toString();
                                                                } else {
                                                                    int i12 = parsableByteArray2.position;
                                                                    String parseNextToken2 = WebvttCssParser.parseNextToken(parsableByteArray2, sb2);
                                                                    if (parseNextToken2 == null) {
                                                                        sb = null;
                                                                    } else if ("}".equals(parseNextToken2) || ";".equals(parseNextToken2)) {
                                                                        parsableByteArray2.setPosition(i12);
                                                                        z6 = true;
                                                                    } else {
                                                                        sb3.append(parseNextToken2);
                                                                    }
                                                                }
                                                            }
                                                            if (sb != null && !sb.isEmpty()) {
                                                                int i13 = parsableByteArray2.position;
                                                                String parseNextToken3 = WebvttCssParser.parseNextToken(parsableByteArray2, sb2);
                                                                if (!";".equals(parseNextToken3)) {
                                                                    if ("}".equals(parseNextToken3)) {
                                                                        parsableByteArray2.setPosition(i13);
                                                                    }
                                                                }
                                                                if ("color".equals(parseIdentifier)) {
                                                                    i3 = 1;
                                                                    webvttCssStyle.fontColor = ColorParser.parseColorInternal(sb, true);
                                                                    webvttCssStyle.hasFontColor = true;
                                                                } else {
                                                                    i3 = 1;
                                                                    if ("background-color".equals(parseIdentifier)) {
                                                                        webvttCssStyle.backgroundColor = ColorParser.parseColorInternal(sb, true);
                                                                        webvttCssStyle.hasBackgroundColor = true;
                                                                    } else {
                                                                        if ("ruby-position".equals(parseIdentifier)) {
                                                                            if ("over".equals(sb)) {
                                                                                webvttCssStyle.rubyPosition = 1;
                                                                            } else if ("under".equals(sb)) {
                                                                                webvttCssStyle.rubyPosition = 2;
                                                                                r0 = 1;
                                                                                z4 = r0;
                                                                                z3 = z5;
                                                                                z = false;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(parseIdentifier)) {
                                                                            webvttCssStyle.combineUpright = "all".equals(sb) || sb.startsWith("digits");
                                                                        } else if ("text-decoration".equals(parseIdentifier)) {
                                                                            if ("underline".equals(sb)) {
                                                                                i3 = 1;
                                                                                webvttCssStyle.underline = 1;
                                                                            }
                                                                        } else if ("font-family".equals(parseIdentifier)) {
                                                                            webvttCssStyle.fontFamily = Ascii.toLowerCase(sb);
                                                                        } else if (!"font-weight".equals(parseIdentifier)) {
                                                                            i3 = 1;
                                                                            if ("font-style".equals(parseIdentifier)) {
                                                                                if ("italic".equals(sb)) {
                                                                                    webvttCssStyle.italic = 1;
                                                                                }
                                                                            } else if ("font-size".equals(parseIdentifier)) {
                                                                                ?? matcher2 = WebvttCssParser.FONT_SIZE_PATTERN.matcher(Ascii.toLowerCase(sb));
                                                                                if (matcher2.matches()) {
                                                                                    String group2 = matcher2.group(2);
                                                                                    group2.getClass();
                                                                                    switch (group2.hashCode()) {
                                                                                        case 37:
                                                                                            if (group2.equals("%")) {
                                                                                                c = 0;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3240:
                                                                                            if (group2.equals("em")) {
                                                                                                c = 1;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3592:
                                                                                            if (group2.equals("px")) {
                                                                                                c = 2;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    switch (c) {
                                                                                        case 0:
                                                                                            r0 = 1;
                                                                                            webvttCssStyle.fontSizeUnit = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            r0 = 1;
                                                                                            webvttCssStyle.fontSizeUnit = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            r0 = 1;
                                                                                            webvttCssStyle.fontSizeUnit = 1;
                                                                                            break;
                                                                                        default:
                                                                                            Path$$ExternalSyntheticBUOutline0.m();
                                                                                            return;
                                                                                    }
                                                                                    String group3 = matcher2.group(r0);
                                                                                    group3.getClass();
                                                                                    webvttCssStyle.fontSize = Float.parseFloat(group3);
                                                                                    z4 = r0;
                                                                                    z3 = z5;
                                                                                    z = false;
                                                                                } else {
                                                                                    Log.w("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(sb)) {
                                                                            i3 = 1;
                                                                            webvttCssStyle.bold = 1;
                                                                        }
                                                                        z4 = r0;
                                                                        z3 = z5;
                                                                        z = false;
                                                                    }
                                                                }
                                                                r0 = i3;
                                                                z4 = r0;
                                                                z3 = z5;
                                                                z = false;
                                                            }
                                                            r0 = 1;
                                                            z4 = r0;
                                                            z3 = z5;
                                                            z = false;
                                                        }
                                                    }
                                                    r0 = z4;
                                                    z4 = r0;
                                                    z3 = z5;
                                                    z = false;
                                                }
                                                boolean z7 = z4;
                                                if ("}".equals(str5)) {
                                                    arrayList3.add(webvttCssStyle);
                                                }
                                                r9 = z7;
                                                z = false;
                                                i4 = -1;
                                                str2 = null;
                                            }
                                        }
                                    }
                                    str = str2;
                                    if (str == null) {
                                    }
                                }
                            } else if (c2 == 3) {
                                Pattern pattern = WebvttCueParser.CUE_HEADER_PATTERN;
                                Charset charset = StandardCharsets.UTF_8;
                                String readLine2 = parsableByteArray.readLine(charset);
                                if (readLine2 == null) {
                                    webvttCueInfo = null;
                                } else {
                                    Pattern pattern2 = WebvttCueParser.CUE_HEADER_PATTERN;
                                    Matcher matcher3 = pattern2.matcher(readLine2);
                                    if (matcher3.matches()) {
                                        webvttCueInfo = WebvttCueParser.parseCue(null, matcher3, parsableByteArray, arrayList);
                                    } else {
                                        webvttCueInfo = null;
                                        String readLine3 = parsableByteArray.readLine(charset);
                                        if (readLine3 != null) {
                                            Matcher matcher4 = pattern2.matcher(readLine3);
                                            if (matcher4.matches()) {
                                                webvttCueInfo = WebvttCueParser.parseCue(readLine2.trim(), matcher4, parsableByteArray, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (webvttCueInfo != null) {
                                    arrayList2.add(webvttCueInfo);
                                }
                            }
                            callResult = this;
                        }
                    }
                }
            }
        } catch (ParserException e) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016b A[LOOP:0: B:2:0x0006->B:55:0x016b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Type inference failed for: r14v1, types: [app.cash.zipline.CallResult] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [com.android.volley.NetworkResponse] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NetworkResponse performRequest(Request request) {
        HttpResponse httpResponse;
        byte[] bArr;
        boolean z;
        AndroidSvg androidSvg;
        String str;
        DefaultRetryPolicy defaultRetryPolicy;
        int i;
        int i2;
        Map map;
        String str2 = request.mUrl;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ?? r14 = this;
        while (true) {
            try {
                Cache$Entry cache$Entry = request.mCacheEntry;
                if (cache$Entry == null) {
                    try {
                        map = Collections.EMPTY_MAP;
                    } catch (IOException e) {
                        bArr = null;
                        e = e;
                        httpResponse = null;
                        z = r14;
                        int i3 = 18;
                        if (e instanceof SocketTimeoutException) {
                        }
                        str = (String) androidSvg.svg;
                        defaultRetryPolicy = request.mRetryPolicy;
                        i = defaultRetryPolicy.mCurrentTimeoutMs;
                        try {
                            VolleyError volleyError = (VolleyError) androidSvg.renderOptions;
                            i2 = defaultRetryPolicy.mCurrentRetryCount + 1;
                            defaultRetryPolicy.mCurrentRetryCount = i2;
                            defaultRetryPolicy.mCurrentTimeoutMs = ((int) (i * defaultRetryPolicy.mBackoffMultiplier)) + i;
                            if (i2 > defaultRetryPolicy.mMaxNumRetries) {
                            }
                        } catch (VolleyError e2) {
                            request.addMarker(str + "-timeout-giveup [timeout=" + i + "]");
                            throw e2;
                        }
                    }
                } else {
                    HashMap hashMap = new HashMap();
                    String str3 = cache$Entry.etag;
                    if (str3 != null) {
                        hashMap.put("If-None-Match", str3);
                    }
                    long j = cache$Entry.lastModified;
                    if (j > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j)));
                    }
                    map = hashMap;
                }
            } catch (IOException e3) {
                e = e3;
            }
            try {
                ((HurlStack) r14.result).getClass();
                httpResponse = HurlStack.executeRequest(request, map);
                try {
                    int i4 = httpResponse.mStatusCode;
                    List unmodifiableList = Collections.unmodifiableList(httpResponse.mHeaders);
                    if (i4 == 304) {
                        SystemClock.elapsedRealtime();
                        r14 = NetworkUtility.getNotModifiedNetworkResponse(request, unmodifiableList);
                        return r14;
                    }
                    InputStream inputStream = (InputStream) httpResponse.mContent;
                    if (inputStream == null) {
                        inputStream = null;
                    }
                    bArr = inputStream != null ? NetworkUtility.inputStreamToBytes(inputStream, httpResponse.mContentLength, (HttpResponse) r14.serviceNames) : new byte[0];
                    try {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (VolleyLog.DEBUG || elapsedRealtime2 > 3000) {
                            VolleyLog.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", request, Long.valueOf(elapsedRealtime2), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i4), Integer.valueOf(request.mRetryPolicy.mCurrentRetryCount));
                        }
                        if (i4 < 200 || i4 > 299) {
                            throw new IOException();
                        }
                        SystemClock.elapsedRealtime();
                        return new NetworkResponse(i4, bArr, false, unmodifiableList);
                    } catch (IOException e4) {
                        e = e4;
                        z = r14;
                        int i32 = 18;
                        if (e instanceof SocketTimeoutException) {
                            androidSvg = new AndroidSvg(i32, "socket", new TimeoutError());
                        } else {
                            if (e instanceof MalformedURLException) {
                                a$$ExternalSyntheticBUOutline0.m$1("Bad URL ", (Object) str2, (Throwable) e);
                                return null;
                            }
                            if (httpResponse == null) {
                                throw new NoConnectionError(e);
                            }
                            int i5 = httpResponse.mStatusCode;
                            VolleyLog.e("Unexpected response code %d for %s", Integer.valueOf(i5), str2);
                            if (bArr != null) {
                                List unmodifiableList2 = Collections.unmodifiableList(httpResponse.mHeaders);
                                SystemClock.elapsedRealtime();
                                NetworkResponse networkResponse = new NetworkResponse(i5, bArr, false, unmodifiableList2);
                                if (i5 != 401 && i5 != 403) {
                                    if (i5 < 400 || i5 > 499) {
                                        throw new ServerError(networkResponse);
                                    }
                                    throw new ClientError(networkResponse);
                                }
                                androidSvg = new AndroidSvg(i32, "auth", new AuthFailureError(networkResponse));
                            } else {
                                androidSvg = new AndroidSvg(i32, "network", new NetworkError());
                            }
                        }
                        str = (String) androidSvg.svg;
                        defaultRetryPolicy = request.mRetryPolicy;
                        i = defaultRetryPolicy.mCurrentTimeoutMs;
                        VolleyError volleyError2 = (VolleyError) androidSvg.renderOptions;
                        i2 = defaultRetryPolicy.mCurrentRetryCount + 1;
                        defaultRetryPolicy.mCurrentRetryCount = i2;
                        defaultRetryPolicy.mCurrentTimeoutMs = ((int) (i * defaultRetryPolicy.mBackoffMultiplier)) + i;
                        if (i2 > defaultRetryPolicy.mMaxNumRetries) {
                            throw volleyError2;
                        }
                        request.addMarker(str + "-retry [timeout=" + i + "]");
                        r14 = z;
                    }
                } catch (IOException e5) {
                    e = e5;
                    bArr = null;
                    z = r14;
                }
            } catch (IOException e6) {
                e = e6;
                httpResponse = null;
                bArr = null;
                z = r14;
                int i322 = 18;
                if (e instanceof SocketTimeoutException) {
                }
                str = (String) androidSvg.svg;
                defaultRetryPolicy = request.mRetryPolicy;
                i = defaultRetryPolicy.mCurrentTimeoutMs;
                VolleyError volleyError22 = (VolleyError) androidSvg.renderOptions;
                i2 = defaultRetryPolicy.mCurrentRetryCount + 1;
                defaultRetryPolicy.mCurrentRetryCount = i2;
                defaultRetryPolicy.mCurrentTimeoutMs = ((int) (i * defaultRetryPolicy.mBackoffMultiplier)) + i;
                if (i2 > defaultRetryPolicy.mMaxNumRetries) {
                }
            }
            request.addMarker(str + "-retry [timeout=" + i + "]");
            r14 = z;
        }
    }

    public Viewport popFromLayoutStep(RecyclerView.ViewHolder viewHolder, int i) {
        ViewInfoStore$InfoRecord viewInfoStore$InfoRecord;
        Viewport viewport;
        SimpleArrayMap simpleArrayMap = (SimpleArrayMap) this.result;
        int indexOfKey = simpleArrayMap.indexOfKey(viewHolder);
        if (indexOfKey >= 0 && (viewInfoStore$InfoRecord = (ViewInfoStore$InfoRecord) simpleArrayMap.valueAt(indexOfKey)) != null) {
            int i2 = viewInfoStore$InfoRecord.flags;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                viewInfoStore$InfoRecord.flags = i3;
                if (i == 4) {
                    viewport = viewInfoStore$InfoRecord.preInfo;
                } else if (i == 8) {
                    viewport = viewInfoStore$InfoRecord.postInfo;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    simpleArrayMap.removeAt(indexOfKey);
                    viewInfoStore$InfoRecord.flags = 0;
                    viewInfoStore$InfoRecord.preInfo = null;
                    viewInfoStore$InfoRecord.postInfo = null;
                    ViewInfoStore$InfoRecord.sPool.release(viewInfoStore$InfoRecord);
                }
                return viewport;
            }
        }
        return null;
    }

    @Override // androidx.paging.UiReceiver
    public void refresh() {
        ((PageFetcher) this.serviceNames).loadRequests.send(new PageFetcher$LoadRequest$Refresh(true, PageFetcher$RefreshType$All.INSTANCE$1));
    }

    public void release(String str) {
        DiskCacheWriteLocker$WriteLock diskCacheWriteLocker$WriteLock;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.result).get(str);
                com.bumptech.glide.util.Util.checkNotNull(obj, "Argument must not be null");
                diskCacheWriteLocker$WriteLock = (DiskCacheWriteLocker$WriteLock) obj;
                int i = diskCacheWriteLocker$WriteLock.interestedThreads;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + diskCacheWriteLocker$WriteLock.interestedThreads);
                }
                int i2 = i - 1;
                diskCacheWriteLocker$WriteLock.interestedThreads = i2;
                if (i2 == 0) {
                    DiskCacheWriteLocker$WriteLock diskCacheWriteLocker$WriteLock2 = (DiskCacheWriteLocker$WriteLock) ((HashMap) this.result).remove(str);
                    if (!diskCacheWriteLocker$WriteLock2.equals(diskCacheWriteLocker$WriteLock)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + diskCacheWriteLocker$WriteLock + ", but actually removed: " + diskCacheWriteLocker$WriteLock2 + ", safeKey: " + str);
                    }
                    zzb zzbVar = (zzb) this.serviceNames;
                    synchronized (((ArrayDeque) zzbVar.zza)) {
                        try {
                            if (((ArrayDeque) zzbVar.zza).size() < 10) {
                                ((ArrayDeque) zzbVar.zza).offer(diskCacheWriteLocker$WriteLock2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        diskCacheWriteLocker$WriteLock.lock.unlock();
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public void remove(int i, int i2) {
        throw new IllegalStateException("unexpected call");
    }

    public void removeFromDisappearedInLayout(RecyclerView.ViewHolder viewHolder) {
        ViewInfoStore$InfoRecord viewInfoStore$InfoRecord = (ViewInfoStore$InfoRecord) ((SimpleArrayMap) this.result).get(viewHolder);
        if (viewInfoStore$InfoRecord == null) {
            return;
        }
        viewInfoStore$InfoRecord.flags &= -2;
    }

    public void removeViewHolder(RecyclerView.ViewHolder viewHolder) {
        LongSparseArray longSparseArray = (LongSparseArray) this.serviceNames;
        int size = longSparseArray.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (viewHolder == longSparseArray.valueAt(size)) {
                Object[] objArr = longSparseArray.values;
                Object obj = objArr[size];
                Object obj2 = SieveCacheKt.DELETED;
                if (obj != obj2) {
                    objArr[size] = obj2;
                    longSparseArray.garbage = true;
                }
            } else {
                size--;
            }
        }
        ViewInfoStore$InfoRecord viewInfoStore$InfoRecord = (ViewInfoStore$InfoRecord) ((SimpleArrayMap) this.result).remove(viewHolder);
        if (viewInfoStore$InfoRecord != null) {
            viewInfoStore$InfoRecord.flags = 0;
            viewInfoStore$InfoRecord.preInfo = null;
            viewInfoStore$InfoRecord.postInfo = null;
            ViewInfoStore$InfoRecord.sPool.release(viewInfoStore$InfoRecord);
        }
    }

    @Override // androidx.paging.UiReceiver
    public void retry() {
        ((AndroidSvg) this.result).send(Unit.INSTANCE);
    }

    public CallResult(Object obj, String str, List list) {
        str.getClass();
        list.getClass();
        this.result = obj;
        this.serviceNames = CollectionsKt.toList(list);
    }

    public CallResult(String str, Object[] objArr) {
        str.getClass();
        this.result = str;
        this.serviceNames = objArr;
    }

    public CallResult(String str) {
        this(str, (Object[]) null);
    }

    public CallResult(Context context, int i) {
        switch (i) {
            case 23:
                this.serviceNames = context;
                this.result = null;
                break;
            default:
                OffsetApplier offsetApplier = new OffsetApplier(3);
                this.result = context.getApplicationContext();
                this.serviceNames = offsetApplier;
                break;
        }
    }

    public CallResult(Id3Peeker$$ExternalSyntheticBUOutline0 id3Peeker$$ExternalSyntheticBUOutline0) {
        this.result = id3Peeker$$ExternalSyntheticBUOutline0;
        this.serviceNames = new AtomicBoolean(false);
    }

    public /* synthetic */ CallResult(Object obj, Object obj2) {
        this.result = obj;
        this.serviceNames = obj2;
    }
}
