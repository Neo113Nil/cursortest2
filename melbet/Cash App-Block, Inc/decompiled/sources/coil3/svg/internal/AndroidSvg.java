package coil3.svg.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.biometric.BiometricPrompt;
import androidx.camera.view.PreviewView;
import androidx.collection.ArrayMap;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.emoji2.text.MetadataRepo;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.container.ObuParser$NotYetImplementedException;
import androidx.media3.container.ObuParser$Obu;
import androidx.media3.container.ObuParser$SequenceHeader;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.extractor.BinarySearchSeeker$TimestampSearchResult;
import androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.mp4.BoxParser;
import androidx.media3.extractor.ts.PsBinarySearchSeeker;
import androidx.media3.extractor.ts.PsDurationReader;
import androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ViewBoundsCheck$Callback;
import androidx.room.Room;
import androidx.room.RoomConnectionManager;
import androidx.room.RoomDatabase;
import androidx.room.concurrent.ExclusiveLock;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.viewpager.widget.ViewPager;
import app.cash.badging.api.Badger2;
import app.cash.badging.backend.RealBadger2;
import app.cash.local.backend.MarkMarketingMessageAsViewed$invoke$1;
import app.cash.local.backend.real.RealMarketingMessageRepository;
import app.cash.local.primitives.MarketingMessageBadging;
import app.cash.redwood.lazylayout.view.ViewLazyList$processor$1;
import app.cash.redwood.lazylayout.widget.LazyListUpdateProcessor$Binding;
import app.cash.redwood.lazylayout.widget.LazyListUpdateProcessor$Edit;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.widget.Widget;
import app.cash.trifle.TrifleAlgorithmIdentifier;
import app.cash.trifle.signers.Buffer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q4$$ExternalSyntheticLambda0;
import com.bumptech.glide.GlideBuilder$1;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry;
import com.bumptech.glide.load.engine.bitmap_recycle.Poolable;
import com.bumptech.glide.load.engine.cache.SafeKeyGenerator$PoolableDigestContainer;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.bumptech.glide.util.ExceptionPassthroughInputStream;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.caverock.androidsvg.SVG;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.configuration.DataUploadConfiguration;
import com.datadog.android.core.sampling.RateBasedSampler$1;
import com.datadog.android.core.sampling.RateBasedSampler$random$2;
import com.datadog.android.core.sampling.Sampler;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumConfiguration;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.datadog.android.rum.tracking.ViewTarget;
import com.datadog.android.trace.internal.DatadogTracerAdapter;
import com.fillr.m1;
import com.google.android.gms.internal.mlkit_vision_common.zzib;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.DefaultSignatureNameFinder;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AndroidSvg implements BinarySearchSeeker$TimestampSeeker, SQLiteDriver, OnApplyWindowInsetsListener, Widget.Children, ContentSigner, Downsampler.DecodeCallbacks, Sampler {
    public final /* synthetic */ int $r8$classId;
    public Object renderOptions;
    public Object svg;

    public AndroidSvg(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 8:
                StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(new Pair(Integer.valueOf(PKIFailureInfo.systemUnavail), null));
                this.svg = MutableStateFlow;
                this.renderOptions = new CachedPagingDataKt$cachedIn$$inlined$map$1(MutableStateFlow, 1);
                break;
            case 19:
                this.svg = new GroupedLinkedMap$LinkedEntry(null);
                this.renderOptions = new HashMap();
                break;
            case 20:
                this.svg = new LruCache(1000L);
                this.renderOptions = FactoryPools.threadSafe(10, new GlideBuilder$1());
                break;
            case 23:
                this.svg = new AtomicReference();
                this.renderOptions = new ArrayMap(0);
                break;
            case 24:
                this.svg = null;
                this.renderOptions = null;
                break;
            default:
                this.svg = ByteBuffer.allocateDirect(500);
                break;
        }
    }

    public RumConfiguration build() {
        Object obj = ((RumFeature.Configuration) this.renderOptions).additionalConfig.get("_dd.telemetry.configuration_sample_rate");
        Float f = null;
        if (obj != null && (obj instanceof Number)) {
            f = Float.valueOf(((Number) obj).floatValue());
        }
        String str = (String) this.svg;
        RumFeature.Configuration configuration = (RumFeature.Configuration) this.renderOptions;
        if (f != null) {
            configuration = RumFeature.Configuration.copy$default(configuration, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f.floatValue(), null, null, null, -9);
        }
        return new RumConfiguration(str, configuration);
    }

    public void clear() {
        this.svg = null;
        this.renderOptions = null;
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public void detach() {
        switch (this.$r8$classId) {
            case 15:
                ((ArrayList) this.svg).clear();
                Iterator it = ((ViewLazyList$processor$1) this.renderOptions).loadedItems.iterator();
                while (it.hasNext()) {
                    LazyListUpdateProcessor$Binding lazyListUpdateProcessor$Binding = (LazyListUpdateProcessor$Binding) it.next();
                    if (lazyListUpdateProcessor$Binding.view != null) {
                        lazyListUpdateProcessor$Binding.processor.getClass();
                    }
                    lazyListUpdateProcessor$Binding.content = null;
                    lazyListUpdateProcessor$Binding.view = null;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) this.renderOptions;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ProtocolNode) it2.next()).detach();
                }
                arrayList.clear();
                ((Widget.Children) this.svg).detach();
                break;
        }
    }

    public View findOneViewWithinBoundFlags(int i, int i2, int i3, int i4) {
        BoxParser.TkhdData tkhdData = (BoxParser.TkhdData) this.renderOptions;
        ViewBoundsCheck$Callback viewBoundsCheck$Callback = (ViewBoundsCheck$Callback) this.svg;
        int parentStart = viewBoundsCheck$Callback.getParentStart();
        int parentEnd = viewBoundsCheck$Callback.getParentEnd();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View childAt = viewBoundsCheck$Callback.getChildAt(i);
            int childStart = viewBoundsCheck$Callback.getChildStart(childAt);
            int childEnd = viewBoundsCheck$Callback.getChildEnd(childAt);
            tkhdData.alternateGroup = parentStart;
            tkhdData.rotationDegrees = parentEnd;
            tkhdData.width = childStart;
            tkhdData.height = childEnd;
            if (i3 != 0) {
                tkhdData.id = i3;
                if (tkhdData.boundsMatch()) {
                    return childAt;
                }
            }
            if (i4 != 0) {
                tkhdData.id = i4;
                if (tkhdData.boundsMatch()) {
                    view = childAt;
                }
            }
            i += i5;
        }
        return view;
    }

    public Object get(Poolable poolable) {
        HashMap hashMap = (HashMap) this.renderOptions;
        GroupedLinkedMap$LinkedEntry groupedLinkedMap$LinkedEntry = (GroupedLinkedMap$LinkedEntry) hashMap.get(poolable);
        if (groupedLinkedMap$LinkedEntry == null) {
            groupedLinkedMap$LinkedEntry = new GroupedLinkedMap$LinkedEntry(poolable);
            hashMap.put(poolable, groupedLinkedMap$LinkedEntry);
        } else {
            poolable.offer();
        }
        GroupedLinkedMap$LinkedEntry groupedLinkedMap$LinkedEntry2 = groupedLinkedMap$LinkedEntry.prev;
        groupedLinkedMap$LinkedEntry2.next = groupedLinkedMap$LinkedEntry.next;
        groupedLinkedMap$LinkedEntry.next.prev = groupedLinkedMap$LinkedEntry2;
        GroupedLinkedMap$LinkedEntry groupedLinkedMap$LinkedEntry3 = (GroupedLinkedMap$LinkedEntry) this.svg;
        groupedLinkedMap$LinkedEntry.prev = groupedLinkedMap$LinkedEntry3;
        GroupedLinkedMap$LinkedEntry groupedLinkedMap$LinkedEntry4 = groupedLinkedMap$LinkedEntry3.next;
        groupedLinkedMap$LinkedEntry.next = groupedLinkedMap$LinkedEntry4;
        groupedLinkedMap$LinkedEntry4.prev = groupedLinkedMap$LinkedEntry;
        groupedLinkedMap$LinkedEntry.prev.next = groupedLinkedMap$LinkedEntry;
        ArrayList arrayList = groupedLinkedMap$LinkedEntry.values;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return groupedLinkedMap$LinkedEntry.values.remove(size - 1);
        }
        return null;
    }

    @Override // org.bouncycastle.operator.ContentSigner
    public TrifleAlgorithmIdentifier.ECDSASha256AlgorithmIdentifier getAlgorithmIdentifier() {
        SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(((KeyPair) this.svg).getPublic().getEncoded());
        subjectPublicKeyInfo.getClass();
        AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
        TrifleAlgorithmIdentifier.P256v1AlgorithmIdentifier p256v1AlgorithmIdentifier = TrifleAlgorithmIdentifier.P256v1AlgorithmIdentifier.INSTANCE;
        p256v1AlgorithmIdentifier.getClass();
        if (Intrinsics.areEqual(algorithm, new TrifleAlgorithmIdentifier.ECPublicKeyAlgorithmIdentifier(new ASN1ObjectIdentifier("1.2.840.10045.2.1"), p256v1AlgorithmIdentifier.getAlgorithm()))) {
            return TrifleAlgorithmIdentifier.ECDSASha256AlgorithmIdentifier.INSTANCE;
        }
        f$$ExternalSyntheticLambda0.m((Object) algorithm, "Default signature algorithm is not supported for key algorithm: ");
        return null;
    }

    @Override // org.bouncycastle.operator.ContentSigner
    public OutputStream getOutputStream() {
        return (Buffer) this.renderOptions;
    }

    public String getSafeKey(Key key) {
        String str;
        synchronized (((LruCache) this.svg)) {
            str = (String) ((LruCache) this.svg).get(key);
        }
        if (str == null) {
            SafeKeyGenerator$PoolableDigestContainer safeKeyGenerator$PoolableDigestContainer = (SafeKeyGenerator$PoolableDigestContainer) ((SVG) this.renderOptions).acquire();
            try {
                key.updateDiskCacheKey(safeKeyGenerator$PoolableDigestContainer.messageDigest);
                byte[] digest = safeKeyGenerator$PoolableDigestContainer.messageDigest.digest();
                char[] cArr = Util.SHA_256_CHARS;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        byte b = digest[i];
                        int i2 = i * 2;
                        char[] cArr2 = Util.HEX_CHAR_ARRAY;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((SVG) this.renderOptions).release(safeKeyGenerator$PoolableDigestContainer);
            }
        }
        synchronized (((LruCache) this.svg)) {
            ((LruCache) this.svg).put(key, str);
        }
        return str;
    }

    @Override // com.datadog.android.core.sampling.Sampler
    public Float getSampleRate() {
        float floatValue = Float.valueOf(((RateBasedSampler$1) this.svg).$sampleRate).floatValue();
        float f = RecyclerView.DECELERATION_RATE;
        InternalLogger.Target target = InternalLogger.Target.USER;
        if (floatValue >= RecyclerView.DECELERATION_RATE) {
            f = 100.0f;
            if (floatValue > 100.0f) {
                InternalLogger.Companion.getClass();
                DBUtil.log$default(InternalLogger.Companion.UNBOUND, 4, target, new RateBasedSampler$1(floatValue, 4), null, false, 56);
            }
            return Float.valueOf(floatValue);
        }
        InternalLogger.Companion.getClass();
        DBUtil.log$default(InternalLogger.Companion.UNBOUND, 4, target, new RateBasedSampler$1(floatValue, 3), null, false, 56);
        floatValue = f;
        return Float.valueOf(floatValue);
    }

    @Override // org.bouncycastle.operator.ContentSigner
    public byte[] getSignature() {
        Buffer buffer = (Buffer) this.renderOptions;
        try {
            Signature signature = Signature.getInstance(new DefaultSignatureNameFinder().getAlgorithmName(getAlgorithmIdentifier()));
            signature.initSign(((KeyPair) this.svg).getPrivate());
            signature.update(buffer.toByteArray());
            byte[] sign = signature.sign();
            buffer.close();
            buffer.reset();
            sign.getClass();
            return sign;
        } finally {
        }
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public void insert(int i, Widget widget) {
        widget.getClass();
        ((ArrayList) this.svg).add(i, widget);
        ArrayList arrayList = ((ViewLazyList$processor$1) this.renderOptions).edits;
        LazyListUpdateProcessor$Edit lazyListUpdateProcessor$Edit = (LazyListUpdateProcessor$Edit) CollectionsKt.lastOrNull((List) arrayList);
        if (lazyListUpdateProcessor$Edit instanceof LazyListUpdateProcessor$Edit.Insert) {
            LazyListUpdateProcessor$Edit.Insert insert = (LazyListUpdateProcessor$Edit.Insert) lazyListUpdateProcessor$Edit;
            ArrayList arrayList2 = insert.widgets;
            int i2 = insert.index;
            if (i < arrayList2.size() + i2 + 1 && i2 <= i) {
                arrayList2.add(i - insert.index, widget);
                return;
            }
        }
        arrayList.add(new LazyListUpdateProcessor$Edit.Insert(i, CollectionsKt__CollectionsKt.mutableListOf(widget)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: invoke-bPdJ9CI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1472invokebPdJ9CI(String str, ContinuationImpl continuationImpl) {
        MarkMarketingMessageAsViewed$invoke$1 markMarketingMessageAsViewed$invoke$1;
        Object obj;
        int i;
        if (continuationImpl instanceof MarkMarketingMessageAsViewed$invoke$1) {
            markMarketingMessageAsViewed$invoke$1 = (MarkMarketingMessageAsViewed$invoke$1) continuationImpl;
            int i2 = markMarketingMessageAsViewed$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                markMarketingMessageAsViewed$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = markMarketingMessageAsViewed$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = markMarketingMessageAsViewed$invoke$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealMarketingMessageRepository realMarketingMessageRepository = (RealMarketingMessageRepository) this.svg;
                    markMarketingMessageAsViewed$invoke$1.label = 1;
                    obj = realMarketingMessageRepository.m1208markMessageAsViewedbPdJ9CI(str, markMarketingMessageAsViewed$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = markMarketingMessageAsViewed$invoke$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        return obj2;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    Badger2 badger2 = (Badger2) this.renderOptions;
                    ArrayList arrayList = MarketingMessageBadging.GROUP_NAMES;
                    markMarketingMessageAsViewed$invoke$1.L$1 = obj;
                    markMarketingMessageAsViewed$invoke$1.label = 2;
                    if (((RealBadger2) badger2).refreshCounts(arrayList, markMarketingMessageAsViewed$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return obj;
            }
        }
        markMarketingMessageAsViewed$invoke$1 = new MarkMarketingMessageAsViewed$invoke$1(this, continuationImpl);
        obj = markMarketingMessageAsViewed$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = markMarketingMessageAsViewed$invoke$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return obj;
    }

    public boolean isViewWithinBoundFlags(View view) {
        BoxParser.TkhdData tkhdData = (BoxParser.TkhdData) this.renderOptions;
        ViewBoundsCheck$Callback viewBoundsCheck$Callback = (ViewBoundsCheck$Callback) this.svg;
        int parentStart = viewBoundsCheck$Callback.getParentStart();
        int parentEnd = viewBoundsCheck$Callback.getParentEnd();
        int childStart = viewBoundsCheck$Callback.getChildStart(view);
        int childEnd = viewBoundsCheck$Callback.getChildEnd(view);
        tkhdData.alternateGroup = parentStart;
        tkhdData.rotationDegrees = parentEnd;
        tkhdData.width = childStart;
        tkhdData.height = childEnd;
        tkhdData.id = 24579;
        return tkhdData.boundsMatch();
    }

    public void lock() {
        String str = (String) this.svg;
        if (((FileChannel) this.renderOptions) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.renderOptions = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.renderOptions;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.renderOptions = null;
            a$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unable to lock file: '", str, "'."), th);
        }
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public void move(int i, int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.svg;
        arrayList.getClass();
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List subList = arrayList.subList(i, i3 + i);
            ArrayList mutableList = CollectionsKt.toMutableList((Collection) subList);
            subList.clear();
            arrayList.addAll(i4, mutableList);
        } else if (i == i2 + 1 || i == i2 - 1) {
            arrayList.set(i, arrayList.set(i2, arrayList.get(i)));
        } else {
            arrayList.add(i4, arrayList.remove(i));
        }
        ((ViewLazyList$processor$1) this.renderOptions).edits.add(new LazyListUpdateProcessor$Edit.Move());
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ViewPager viewPager = (ViewPager) this.renderOptions;
        WindowInsetsCompat onApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
        if (onApplyWindowInsets.mImpl.isConsumed()) {
            return onApplyWindowInsets;
        }
        Rect rect = (Rect) this.svg;
        rect.left = onApplyWindowInsets.getSystemWindowInsetLeft();
        rect.top = onApplyWindowInsets.getSystemWindowInsetTop();
        rect.right = onApplyWindowInsets.getSystemWindowInsetRight();
        rect.bottom = onApplyWindowInsets.getSystemWindowInsetBottom();
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            WindowInsetsCompat dispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(viewPager.getChildAt(i), onApplyWindowInsets);
            rect.left = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
            rect.top = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
            rect.right = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
            rect.bottom = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
        }
        return onApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
    public void onDecodeComplete(Bitmap bitmap, BitmapPool bitmapPool) {
        IOException iOException = ((ExceptionPassthroughInputStream) this.renderOptions).exception;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            bitmapPool.put(bitmap);
            throw iOException;
        }
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public void onModifierUpdated(int i, Widget widget) {
        widget.getClass();
    }

    @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
    public void onObtainBounds() {
        RecyclableBufferedInputStream recyclableBufferedInputStream = (RecyclableBufferedInputStream) this.svg;
        synchronized (recyclableBufferedInputStream) {
            recyclableBufferedInputStream.marklimit = recyclableBufferedInputStream.buf.length;
        }
    }

    @Override // androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker
    public void onSeekFinished() {
        ParsableByteArray parsableByteArray = (ParsableByteArray) this.renderOptions;
        byte[] bArr = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
        parsableByteArray.getClass();
        parsableByteArray.reset(bArr.length, bArr);
    }

    public void onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!((GestureDetector) ((BiometricPrompt) this.renderOptions).mClientFragmentManager).onTouchEvent(motionEvent) && motionEvent.getActionMasked() == 1) {
            GesturesListener gesturesListener = (GesturesListener) this.svg;
            gesturesListener.getClass();
            Window window = (Window) gesturesListener.windowReference.get();
            View decorView = window != null ? window.getDecorView() : null;
            RumActionType rumActionType = gesturesListener.scrollEventType;
            if (rumActionType != null) {
                RumMonitor rumMonitor = GlobalRumMonitor.get(gesturesListener.sdkCore);
                ViewTarget viewTarget = gesturesListener.scrollTargetReference;
                if (decorView != null && viewTarget != null) {
                    LinkedHashMap resolveAttributes = gesturesListener.resolveAttributes(viewTarget, motionEvent);
                    zzib.resolveViewTargetName(gesturesListener.interactionPredicate, viewTarget);
                    rumMonitor.stopAction(rumActionType, resolveAttributes);
                }
            } else if (decorView != null) {
                ViewTarget findTarget = gesturesListener.findTarget(decorView, gesturesListener.onTouchDownXPos, gesturesListener.onTouchDownYPos, false);
                ViewTarget findTarget2 = gesturesListener.findTarget(decorView, motionEvent.getX(), motionEvent.getY(), false);
                if (findTarget != null) {
                    if (!findTarget.equals(findTarget2)) {
                        findTarget = null;
                    }
                    if (findTarget != null) {
                        gesturesListener.sendTapEventWithTarget(findTarget);
                    }
                }
            }
            gesturesListener.scrollTargetReference = null;
            gesturesListener.scrollEventType = null;
            gesturesListener.onTouchDownYPos = RecyclerView.DECELERATION_RATE;
            gesturesListener.onTouchDownXPos = RecyclerView.DECELERATION_RATE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    @Override // androidx.sqlite.SQLiteDriver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SQLiteConnection open(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        RoomConnectionManager roomConnectionManager = (RoomConnectionManager) this.renderOptions;
        if (!str.equals(":memory:")) {
            str = roomConnectionManager.configuration.context.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        ExclusiveLock exclusiveLock = new ExclusiveLock(str, (roomConnectionManager.isConfigured || roomConnectionManager.isInitializing || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = exclusiveLock.threadLock;
        reentrantLock.lock();
        AndroidSvg androidSvg = exclusiveLock.fileLock;
        if (androidSvg != null) {
            try {
                androidSvg.lock();
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    if (!z) {
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        try {
            try {
                if (roomConnectionManager.isInitializing) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                SQLiteConnection open = ((SQLiteDriver) this.svg).open(str);
                if (roomConnectionManager.isConfigured) {
                    if (roomConnectionManager.configuration.journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING) {
                        Room.execSQL(open, "PRAGMA synchronous = NORMAL");
                    } else {
                        Room.execSQL(open, "PRAGMA synchronous = FULL");
                    }
                    RoomConnectionManager.configureBusyTimeout(open);
                    roomConnectionManager.openDelegate.onOpen(open);
                } else {
                    try {
                        roomConnectionManager.isInitializing = true;
                        RoomConnectionManager.access$configureDatabase(roomConnectionManager, open);
                        roomConnectionManager.isInitializing = false;
                    } catch (Throwable th2) {
                        roomConnectionManager.isInitializing = false;
                        throw th2;
                    }
                }
                if (androidSvg != null && (fileChannel2 = (FileChannel) androidSvg.renderOptions) != null) {
                    try {
                        fileChannel2.close();
                        androidSvg.renderOptions = null;
                    } finally {
                    }
                }
                return open;
            } catch (Throwable th3) {
                th = th3;
                if (!z) {
                    throw th;
                }
                throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
            }
        } catch (Throwable th4) {
            if (androidSvg != null && (fileChannel = (FileChannel) androidSvg.renderOptions) != null) {
                try {
                    fileChannel.close();
                    androidSvg.renderOptions = null;
                } finally {
                }
            }
            throw th4;
        }
    }

    public void put(Poolable poolable, Object obj) {
        HashMap hashMap = (HashMap) this.renderOptions;
        GroupedLinkedMap$LinkedEntry groupedLinkedMap$LinkedEntry = (GroupedLinkedMap$LinkedEntry) hashMap.get(poolable);
        if (groupedLinkedMap$LinkedEntry == null) {
            groupedLinkedMap$LinkedEntry = new GroupedLinkedMap$LinkedEntry(poolable);
            groupedLinkedMap$LinkedEntry.prev = groupedLinkedMap$LinkedEntry;
            GroupedLinkedMap$LinkedEntry groupedLinkedMap$LinkedEntry2 = (GroupedLinkedMap$LinkedEntry) this.svg;
            groupedLinkedMap$LinkedEntry.prev = groupedLinkedMap$LinkedEntry2.prev;
            groupedLinkedMap$LinkedEntry.next = groupedLinkedMap$LinkedEntry2;
            groupedLinkedMap$LinkedEntry2.prev = groupedLinkedMap$LinkedEntry;
            groupedLinkedMap$LinkedEntry.prev.next = groupedLinkedMap$LinkedEntry;
            hashMap.put(poolable, groupedLinkedMap$LinkedEntry);
        } else {
            poolable.offer();
        }
        if (groupedLinkedMap$LinkedEntry.values == null) {
            groupedLinkedMap$LinkedEntry.values = new ArrayList();
        }
        groupedLinkedMap$LinkedEntry.values.add(obj);
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public void remove(int i, int i2) {
        ArrayList arrayList = ((ViewLazyList$processor$1) this.renderOptions).edits;
        ArrayList arrayList2 = (ArrayList) this.svg;
        arrayList2.getClass();
        if (i2 == 1) {
            arrayList2.remove(i);
        } else {
            arrayList2.subList(i, i + i2).clear();
        }
        LazyListUpdateProcessor$Edit lazyListUpdateProcessor$Edit = (LazyListUpdateProcessor$Edit) CollectionsKt.lastOrNull((List) arrayList);
        if (lazyListUpdateProcessor$Edit instanceof LazyListUpdateProcessor$Edit.Remove) {
            LazyListUpdateProcessor$Edit.Remove remove = (LazyListUpdateProcessor$Edit.Remove) lazyListUpdateProcessor$Edit;
            int i3 = remove.index;
            int i4 = i3 - i2;
            if (i < i3 + 1 && i4 <= i) {
                if (i < i3) {
                    remove.index = i;
                }
                remove.count += i2;
                return;
            }
        }
        LazyListUpdateProcessor$Edit.Remove remove2 = new LazyListUpdateProcessor$Edit.Remove();
        remove2.index = i;
        remove2.count = i2;
        arrayList.add(remove2);
    }

    public Object removeLast() {
        GroupedLinkedMap$LinkedEntry groupedLinkedMap$LinkedEntry = (GroupedLinkedMap$LinkedEntry) this.svg;
        GroupedLinkedMap$LinkedEntry groupedLinkedMap$LinkedEntry2 = groupedLinkedMap$LinkedEntry.prev;
        while (true) {
            boolean equals = groupedLinkedMap$LinkedEntry2.equals(groupedLinkedMap$LinkedEntry);
            Object obj = groupedLinkedMap$LinkedEntry2.key;
            if (equals) {
                return null;
            }
            ArrayList arrayList = groupedLinkedMap$LinkedEntry2.values;
            int size = arrayList != null ? arrayList.size() : 0;
            Object remove = size > 0 ? groupedLinkedMap$LinkedEntry2.values.remove(size - 1) : null;
            if (remove != null) {
                return remove;
            }
            GroupedLinkedMap$LinkedEntry groupedLinkedMap$LinkedEntry3 = groupedLinkedMap$LinkedEntry2.prev;
            groupedLinkedMap$LinkedEntry3.next = groupedLinkedMap$LinkedEntry2.next;
            groupedLinkedMap$LinkedEntry2.next.prev = groupedLinkedMap$LinkedEntry3;
            ((HashMap) this.renderOptions).remove(obj);
            ((Poolable) obj).offer();
            groupedLinkedMap$LinkedEntry2 = groupedLinkedMap$LinkedEntry2.prev;
        }
    }

    @Override // com.datadog.android.core.sampling.Sampler
    public boolean sample(Object obj) {
        obj.getClass();
        float floatValue = getSampleRate().floatValue();
        if (floatValue == RecyclerView.DECELERATION_RATE) {
            return false;
        }
        return floatValue == 100.0f || ((SecureRandom) ((Lazy) this.renderOptions).getValue()).nextFloat() * 100.0f <= floatValue;
    }

    @Override // androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker
    public BinarySearchSeeker$TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j) {
        long position = extractorInput.getPosition();
        int min = (int) Math.min(20000L, extractorInput.getLength() - position);
        ParsableByteArray parsableByteArray = (ParsableByteArray) this.renderOptions;
        parsableByteArray.reset(min);
        extractorInput.peekFully(0, min, parsableByteArray.data);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (parsableByteArray.bytesLeft() >= 4) {
            if (PsBinarySearchSeeker.access$100(parsableByteArray.position, parsableByteArray.data) != 442) {
                parsableByteArray.skipBytes(1);
            } else {
                parsableByteArray.skipBytes(4);
                long readScrValueFromPack = PsDurationReader.readScrValueFromPack(parsableByteArray);
                if (readScrValueFromPack != -9223372036854775807L) {
                    long adjustTsTimestamp = ((TimestampAdjuster) this.svg).adjustTsTimestamp(readScrValueFromPack);
                    if (adjustTsTimestamp > j) {
                        return j2 == -9223372036854775807L ? new BinarySearchSeeker$TimestampSearchResult(-1, adjustTsTimestamp, position) : new BinarySearchSeeker$TimestampSearchResult(0, -9223372036854775807L, position + i2);
                    }
                    j2 = adjustTsTimestamp;
                    long j3 = 100000 + j2;
                    i2 = parsableByteArray.position;
                    if (j3 > j) {
                        return new BinarySearchSeeker$TimestampSearchResult(0, -9223372036854775807L, position + i2);
                    }
                }
                int i3 = parsableByteArray.limit;
                if (parsableByteArray.bytesLeft() >= 10) {
                    parsableByteArray.skipBytes(9);
                    int readUnsignedByte = parsableByteArray.readUnsignedByte() & 7;
                    if (parsableByteArray.bytesLeft() >= readUnsignedByte) {
                        parsableByteArray.skipBytes(readUnsignedByte);
                        if (parsableByteArray.bytesLeft() >= 4) {
                            if (PsBinarySearchSeeker.access$100(parsableByteArray.position, parsableByteArray.data) == 443) {
                                parsableByteArray.skipBytes(4);
                                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                                if (parsableByteArray.bytesLeft() < readUnsignedShort) {
                                    parsableByteArray.setPosition(i3);
                                } else {
                                    parsableByteArray.skipBytes(readUnsignedShort);
                                }
                            }
                            while (true) {
                                if (parsableByteArray.bytesLeft() < 4) {
                                    break;
                                }
                                int access$100 = PsBinarySearchSeeker.access$100(parsableByteArray.position, parsableByteArray.data);
                                if (access$100 == 442 || access$100 == 441 || (access$100 >>> 8) != 1) {
                                    break;
                                }
                                parsableByteArray.skipBytes(4);
                                if (parsableByteArray.bytesLeft() < 2) {
                                    parsableByteArray.setPosition(i3);
                                    break;
                                }
                                parsableByteArray.setPosition(Math.min(parsableByteArray.limit, parsableByteArray.position + parsableByteArray.readUnsignedShort()));
                            }
                        } else {
                            parsableByteArray.setPosition(i3);
                        }
                    } else {
                        parsableByteArray.setPosition(i3);
                    }
                } else {
                    parsableByteArray.setPosition(i3);
                }
                i = parsableByteArray.position;
            }
        }
        return j2 != -9223372036854775807L ? new BinarySearchSeeker$TimestampSearchResult(-2, j2, position + i) : BinarySearchSeeker$TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
    }

    public void send(Object obj) {
        obj.getClass();
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.svg;
        Pair pair = new Pair(Integer.valueOf(((Number) ((Pair) stateFlowImpl.getValue()).first).intValue() + 1), obj);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, pair);
    }

    public void setSessionSampleRate(float f) {
        this.renderOptions = RumFeature.Configuration.copy$default((RumFeature.Configuration) this.renderOptions, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, null, null, -3);
    }

    public void setTelemetrySampleRate(float f) {
        this.renderOptions = RumFeature.Configuration.copy$default((RumFeature.Configuration) this.renderOptions, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, null, null, null, -5);
    }

    public void setVitalsUpdateFrequency() {
        this.renderOptions = RumFeature.Configuration.copy$default((RumFeature.Configuration) this.renderOptions, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, null, null, -1048577);
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 19:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                GroupedLinkedMap$LinkedEntry groupedLinkedMap$LinkedEntry = (GroupedLinkedMap$LinkedEntry) this.svg;
                GroupedLinkedMap$LinkedEntry groupedLinkedMap$LinkedEntry2 = groupedLinkedMap$LinkedEntry.next;
                boolean z = false;
                while (!groupedLinkedMap$LinkedEntry2.equals(groupedLinkedMap$LinkedEntry)) {
                    sb.append('{');
                    sb.append(groupedLinkedMap$LinkedEntry2.key);
                    sb.append(':');
                    ArrayList arrayList = groupedLinkedMap$LinkedEntry2.values;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    groupedLinkedMap$LinkedEntry2 = groupedLinkedMap$LinkedEntry2.next;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void trackBackgroundEvents() {
        this.renderOptions = RumFeature.Configuration.copy$default((RumFeature.Configuration) this.renderOptions, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, null, null, -131073);
    }

    public void trackFrustrations() {
        this.renderOptions = RumFeature.Configuration.copy$default((RumFeature.Configuration) this.renderOptions, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, null, null, -262145);
    }

    public void trackLongTasks() {
        this.renderOptions = RumFeature.Configuration.copy$default((RumFeature.Configuration) this.renderOptions, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, null, new MainLooperLongTaskStrategy(200L), -257);
    }

    public void updateSequenceHeaders(ArrayList arrayList) {
        ObuParser$SequenceHeader obuParser$SequenceHeader;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((ObuParser$Obu) arrayList.get(i)).f873type == 1) {
                try {
                    obuParser$SequenceHeader = new ObuParser$SequenceHeader((ObuParser$Obu) arrayList.get(i));
                } catch (ObuParser$NotYetImplementedException unused) {
                    obuParser$SequenceHeader = null;
                }
                this.renderOptions = obuParser$SequenceHeader;
            }
        }
    }

    public void useViewTrackingStrategy() {
        this.renderOptions = RumFeature.Configuration.copy$default((RumFeature.Configuration) this.renderOptions, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, null, null, -129);
    }

    public void videoSizeChanged(VideoSize videoSize) {
        Handler handler = (Handler) this.svg;
        if (handler != null) {
            handler.post(new q4$$ExternalSyntheticLambda0(4, this, videoSize));
        }
    }

    public void visitIds(PreviewView.AnonymousClass1 anonymousClass1) {
        anonymousClass1.getClass();
        ArrayList arrayList = (ArrayList) this.renderOptions;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ProtocolNode) arrayList.get(i)).visitIds(anonymousClass1);
        }
    }

    public /* synthetic */ AndroidSvg(int i, boolean z) {
        this.$r8$classId = i;
    }

    public AndroidSvg(DataUploadConfiguration dataUploadConfiguration) {
        this.$r8$classId = 25;
        this.svg = dataUploadConfiguration;
        this.renderOptions = new ConcurrentHashMap();
    }

    public AndroidSvg(KeyPair keyPair) {
        this.$r8$classId = 17;
        keyPair.getClass();
        this.svg = keyPair;
        this.renderOptions = new Buffer(0);
    }

    public AndroidSvg(SVG svg) {
        this.$r8$classId = 0;
        this.svg = svg;
    }

    public AndroidSvg(Context context, GesturesListener gesturesListener) {
        this.$r8$classId = 29;
        context.getClass();
        BiometricPrompt biometricPrompt = new BiometricPrompt(context, gesturesListener);
        this.svg = gesturesListener;
        this.renderOptions = biometricPrompt;
    }

    public AndroidSvg(float f) {
        this.$r8$classId = 26;
        this.svg = new RateBasedSampler$1(f, 0);
        this.renderOptions = LazyKt.lazy(RateBasedSampler$random$2.INSTANCE);
    }

    public AndroidSvg(String str, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 27:
                str.getClass();
                this.svg = str;
                RumFeature.Configuration configuration = RumFeature.DEFAULT_RUM_CONFIG;
                this.renderOptions = RumFeature.DEFAULT_RUM_CONFIG;
                break;
            default:
                this.svg = str.concat(".lck");
                break;
        }
    }

    public AndroidSvg(RoomConnectionManager roomConnectionManager, SQLiteDriver sQLiteDriver) {
        this.$r8$classId = 11;
        sQLiteDriver.getClass();
        this.renderOptions = roomConnectionManager;
        this.svg = sQLiteDriver;
    }

    public AndroidSvg(TimestampAdjuster timestampAdjuster) {
        this.$r8$classId = 7;
        this.svg = timestampAdjuster;
        this.renderOptions = new ParsableByteArray();
    }

    public /* synthetic */ AndroidSvg(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.svg = obj;
        this.renderOptions = obj2;
    }

    public AndroidSvg(Widget.Children children) {
        this.$r8$classId = 16;
        children.getClass();
        this.svg = children;
        this.renderOptions = new ArrayList();
    }

    public AndroidSvg(ViewLazyList$processor$1 viewLazyList$processor$1) {
        this.$r8$classId = 15;
        this.renderOptions = viewLazyList$processor$1;
        this.svg = new ArrayList();
    }

    public AndroidSvg(ViewBoundsCheck$Callback viewBoundsCheck$Callback) {
        this.$r8$classId = 10;
        this.svg = viewBoundsCheck$Callback;
        BoxParser.TkhdData tkhdData = new BoxParser.TkhdData();
        tkhdData.id = 0;
        this.renderOptions = tkhdData;
    }

    public AndroidSvg(Handler handler, ExoPlayerImpl.ComponentListener componentListener) {
        this.$r8$classId = 4;
        if (componentListener != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.svg = handler;
        this.renderOptions = componentListener;
    }

    public AndroidSvg(ViewPager viewPager) {
        this.$r8$classId = 13;
        this.renderOptions = viewPager;
        this.svg = new Rect();
    }

    public AndroidSvg(RumFeature rumFeature) {
        this.$r8$classId = 28;
        this.renderOptions = rumFeature;
        InternalSdkCore internalSdkCore = rumFeature.sdkCore;
        internalSdkCore.getClass();
        InternalLogger internalLogger = internalSdkCore.getInternalLogger();
        DatadogTracerAdapter.AnonymousClass1 anonymousClass1 = new DatadogTracerAdapter.AnonymousClass1(internalSdkCore, 2);
        m1 m1Var = new m1(11);
        Handler handler = new Handler(Looper.getMainLooper());
        internalLogger.getClass();
        MetadataRepo metadataRepo = new MetadataRepo();
        metadataRepo.mMetadataList = internalLogger;
        metadataRepo.mEmojiCharArray = anonymousClass1;
        metadataRepo.mRootNode = m1Var;
        metadataRepo.mTypeface = handler;
        this.svg = metadataRepo;
    }
}
