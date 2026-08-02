package coil3.memory;

import android.app.ActivityManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.autofill.AutofillManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.camera.video.Recorder;
import androidx.collection.LongSparseArray;
import androidx.collection.MutableLongList;
import androidx.collection.internal.Lock;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.animation.core.Animations;
import androidx.compose.animation.core.ArcSpline$Arc;
import androidx.compose.animation.core.FloatAnimationSpec;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputChangeEventProducer$PointerInputData;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.SortedSet;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl31;
import androidx.core.view.SoftwareKeyboardControllerCompat$Impl30;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.profileinstaller.ProfileInstaller;
import androidx.room.driver.SupportSQLiteStatement;
import androidx.savedstate.internal.SavedStateRegistryImpl$$ExternalSyntheticLambda0;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.BitmapImage;
import coil3.EventListener;
import coil3.Extras;
import coil3.ExtrasKt;
import coil3.Image;
import coil3.RealImageLoader;
import coil3.Uri;
import coil3.UriKt;
import coil3.key.UriKeyer;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.request.Options;
import coil3.size.Dimension;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.util.BitmapsKt;
import coil3.util.Utils_androidKt;
import com.bugsnag.android.ConfigInternal;
import com.datadog.android.Datadog$getInstance$1$1;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.service.zak;
import com.google.android.gms.common.internal.service.zau;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhh;
import com.google.android.gms.measurement.internal.zzht;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzoc;
import com.google.android.gms.measurement.internal.zzpo;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzr;
import com.google.mlkit.common.model.RemoteModelManager$RemoteModelManagerRegistration;
import com.nimbusds.jose.util.Base64Codec;
import com.squareup.cash.ui.MainActivity;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import okio.FileSystem;
import okio.Path;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class MemoryCacheService implements ContentFrameLayout.OnAttachListener, Animations, ViewCompositionStrategy, CorruptionHandler, ProfileInstaller.DiagnosticsCallback, SupportSQLiteQuery, RemoteCall, BaseGmsClient.BaseOnConnectionFailedListener, zzpo {
    public final /* synthetic */ int $r8$classId;
    public final Object imageLoader;

    public MemoryCacheService(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 9:
                this.imageLoader = new AndroidCanvas();
                break;
            case 10:
                this.imageLoader = new LongSparseArray((Object) null);
                break;
            case 11:
                this.imageLoader = new SortedSet(DepthSortedSetKt.DepthComparator);
                break;
            case 13:
                this.imageLoader = new Lock(3);
                break;
            case 16:
                this.imageLoader = new AtomicInteger(0);
                break;
            case 20:
                this.imageLoader = Handler.createAsync(Looper.getMainLooper());
                break;
            case 23:
                this.imageLoader = new ConfigInternal("5baa331ebf8e79c0168ac3b5cd828bd6");
                break;
            case 24:
                this.imageLoader = new StringBuilder();
                break;
            default:
                this.imageLoader = new MutableVector(0, new ContentInViewNode.Request[16]);
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public /* synthetic */ void accept(Object obj, Object obj2) {
        ((zak) ((zau) obj).getService()).zae((TelemetryData) this.imageLoader);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    public void add(Object obj, String str) {
        StringBuilder sb = (StringBuilder) this.imageLoader;
        sb.append(str + '=' + obj);
        sb.append("\n");
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        SupportSQLiteStatement.SupportAndroidSQLiteStatement supportAndroidSQLiteStatement = (SupportSQLiteStatement.SupportAndroidSQLiteStatement) this.imageLoader;
        int length = supportAndroidSQLiteStatement.bindingTypes.length;
        for (int i = 1; i < length; i++) {
            int i2 = supportAndroidSQLiteStatement.bindingTypes[i];
            if (i2 == 1) {
                supportSQLiteProgram.bindLong(i, supportAndroidSQLiteStatement.longBindings[i]);
            } else if (i2 == 2) {
                supportSQLiteProgram.bindDouble(i, supportAndroidSQLiteStatement.doubleBindings[i]);
            } else if (i2 == 3) {
                String str = supportAndroidSQLiteStatement.stringBindings[i];
                str.getClass();
                supportSQLiteProgram.bindString(i, str);
            } else if (i2 == 4) {
                byte[] bArr = supportAndroidSQLiteStatement.blobBindings[i];
                bArr.getClass();
                supportSQLiteProgram.bindBlob(i, bArr);
            } else if (i2 == 5) {
                supportSQLiteProgram.bindNull(i);
            }
        }
    }

    public void cancelAndRemoveAll(CancellationException cancellationException) {
        MutableVector mutableVector = (MutableVector) this.imageLoader;
        int i = mutableVector.size;
        CancellableContinuation[] cancellableContinuationArr = new CancellableContinuation[i];
        for (int i2 = 0; i2 < i; i2++) {
            cancellableContinuationArr[i2] = ((ContentInViewNode.Request) mutableVector.content[i2]).continuation;
        }
        for (int i3 = 0; i3 < i; i3++) {
            cancellableContinuationArr[i3].cancel(cancellationException);
        }
        if (mutableVector.size == 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("uncancelled requests present");
    }

    public void current() {
        ((CompositionContext) this.imageLoader).getClass();
    }

    @Override // androidx.compose.animation.core.Animations
    public FloatAnimationSpec get(int i) {
        return (FloatAnimationSpec) this.imageLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MemoryCache$Value getCacheValue(ImageRequest imageRequest, MemoryCache$Key memoryCache$Key, Size size, Scale scale) {
        int abs;
        if (imageRequest.getMemoryCachePolicy().readEnabled) {
            RealMemoryCache memoryCache = ((RealImageLoader) this.imageLoader).getMemoryCache();
            MemoryCache$Value memoryCache$Value = memoryCache != null ? memoryCache.get(memoryCache$Key) : null;
            if (memoryCache$Value != null) {
                Image image = memoryCache$Value.getImage();
                BitmapImage bitmapImage = image instanceof BitmapImage ? (BitmapImage) image : null;
                if (bitmapImage == null ? true : Extras.Key.isConfigValidForHardware(imageRequest, BitmapsKt.getSafeConfig(bitmapImage.getBitmap()))) {
                    String str = (String) memoryCache$Key.getExtras().get("coil#size");
                    if (str == null) {
                        Object obj = memoryCache$Value.getExtras().get("coil#is_sampled");
                        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                        if ((bool != null ? bool.booleanValue() : false) || (!Intrinsics.areEqual(size, Size.ORIGINAL) && imageRequest.getPrecision() != Precision.INEXACT)) {
                            int width = memoryCache$Value.getImage().getWidth();
                            int height = memoryCache$Value.getImage().getHeight();
                            Size size2 = memoryCache$Value.getImage() instanceof BitmapImage ? (Size) ExtrasKt.getExtra(imageRequest, ImageRequestsKt.maxBitmapSizeKey) : Size.ORIGINAL;
                            Dimension dimension = size.width;
                            int i = dimension instanceof Dimension.Pixels ? ((Dimension.Pixels) dimension).px : Integer.MAX_VALUE;
                            Dimension dimension2 = size2.width;
                            int min = Math.min(i, dimension2 instanceof Dimension.Pixels ? ((Dimension.Pixels) dimension2).px : Integer.MAX_VALUE);
                            Dimension dimension3 = size.height;
                            int i2 = dimension3 instanceof Dimension.Pixels ? ((Dimension.Pixels) dimension3).px : Integer.MAX_VALUE;
                            Dimension dimension4 = size2.height;
                            int min2 = Math.min(i2, dimension4 instanceof Dimension.Pixels ? ((Dimension.Pixels) dimension4).px : Integer.MAX_VALUE);
                            double d = min / width;
                            double d2 = min2 / height;
                            int ordinal = ((min == Integer.MAX_VALUE || min2 == Integer.MAX_VALUE) ? Scale.FIT : scale).ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                if (d < d2) {
                                    abs = Math.abs(min - width);
                                    if (abs > 1) {
                                        int ordinal2 = imageRequest.getPrecision().ordinal();
                                        if (ordinal2 != 0) {
                                            if (ordinal2 != 1) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            if (d > 1.0d) {
                                                return null;
                                            }
                                        } else if (d != 1.0d) {
                                            return null;
                                        }
                                    }
                                } else {
                                    abs = Math.abs(min2 - height);
                                    d = d2;
                                    if (abs > 1) {
                                    }
                                }
                            } else if (d > d2) {
                                abs = Math.abs(min - width);
                                if (abs > 1) {
                                }
                            } else {
                                abs = Math.abs(min2 - height);
                                d = d2;
                                if (abs > 1) {
                                }
                            }
                        }
                    } else if (str.equals(size.toString())) {
                    }
                    return memoryCache$Value;
                }
            }
        }
        return null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String getSql() {
        return ((SupportSQLiteStatement.SupportAndroidSQLiteStatement) this.imageLoader).sql;
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException) {
        return ((Function1) this.imageLoader).invoke(corruptionException);
    }

    @Override // androidx.compose.ui.platform.ViewCompositionStrategy
    public Function0 installFor(AbstractComposeView abstractComposeView) {
        Lifecycle lifecycle = (Lifecycle) this.imageLoader;
        if (lifecycle.getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            Path$$ExternalSyntheticBUOutline0.m(abstractComposeView, " to disposeComposition at Lifecycle ON_DESTROY: ", lifecycle, "is already destroyed", "Cannot configure ");
            return null;
        }
        SavedStateRegistryImpl$$ExternalSyntheticLambda0 savedStateRegistryImpl$$ExternalSyntheticLambda0 = new SavedStateRegistryImpl$$ExternalSyntheticLambda0(abstractComposeView, 1);
        lifecycle.addObserver(savedStateRegistryImpl$$ExternalSyntheticLambda0);
        return new Datadog$getInstance$1$1(4, lifecycle, savedStateRegistryImpl$$ExternalSyntheticLambda0);
    }

    public MemoryCache$Key newCacheKey(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener) {
        String str;
        String filePath;
        if (imageRequest.getMemoryCachePolicy() != CachePolicy.DISABLED) {
            if (imageRequest.getMemoryCacheKey() != null) {
                return new MemoryCache$Key(imageRequest.getMemoryCacheKey(), imageRequest.getMemoryCacheKeyExtras());
            }
            List list = ((RealImageLoader) this.imageLoader).components.keyers;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Pair pair = (Pair) list.get(i);
                    UriKeyer uriKeyer = (UriKeyer) pair.first;
                    if (((KClass) pair.second).isInstance(obj)) {
                        uriKeyer.getClass();
                        switch (uriKeyer.$r8$classId) {
                            case 0:
                                str = ((Uri) obj).data;
                                break;
                            case 1:
                                Uri uri = (Uri) obj;
                                if (Intrinsics.areEqual(uri.scheme, "android.resource")) {
                                    Configuration configuration = options.getContext().getResources().getConfiguration();
                                    Bitmap.Config[] configArr = Utils_androidKt.VALID_TRANSFORMATION_CONFIGS;
                                    str = uri + ":" + (configuration.uiMode & 48);
                                    break;
                                }
                                str = null;
                                break;
                            default:
                                Uri uri2 = (Uri) obj;
                                String str2 = uri2.scheme;
                                if ((str2 == null || str2.equals("file")) && uri2.path != null) {
                                    Bitmap.Config[] configArr2 = Utils_androidKt.VALID_TRANSFORMATION_CONFIGS;
                                    if ((!Intrinsics.areEqual(uri2.scheme, "file") || !Intrinsics.areEqual(CollectionsKt.firstOrNull(UriKt.getPathSegments(uri2)), "android_asset")) && ((Boolean) ExtrasKt.getExtra(options, ImageRequestsKt.addLastModifiedToFileCacheKeyKey)).booleanValue() && (filePath = UriKt.getFilePath(uri2)) != null) {
                                        FileSystem fileSystem = options.getFileSystem();
                                        String str3 = Path.DIRECTORY_SEPARATOR;
                                        str = uri2 + "-" + ((Long) fileSystem.metadata(Path.Companion.get(filePath, false)).lastModifiedAtMillis);
                                        break;
                                    }
                                }
                                str = null;
                                break;
                        }
                        if (str != null) {
                        }
                    }
                    i++;
                } else {
                    str = null;
                }
            }
            if (str != null) {
                if (((List) ExtrasKt.getExtra(imageRequest, ImageRequestsKt.transformationsKey)).isEmpty()) {
                    return new MemoryCache$Key(str, imageRequest.getMemoryCacheKeyExtras());
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(imageRequest.getMemoryCacheKeyExtras());
                linkedHashMap.put("coil#size", options.getSize().toString());
                return new MemoryCache$Key(str, linkedHashMap);
            }
        }
        return null;
    }

    public void notifyViewVisibilityChanged(View view, int i, boolean z) {
        ((AutofillManager) this.imageLoader).notifyViewVisibilityChanged(view, i, z);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        ((GoogleApiClient.OnConnectionFailedListener) this.imageLoader).onConnectionFailed(connectionResult);
    }

    @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
    public void onDiagnosticReceived() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
    public void onResultReceived(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.imageLoader).setResultCode(i);
    }

    public zzr produce(Recorder.AnonymousClass1 anonymousClass1, AndroidComposeView androidComposeView) {
        long uptime;
        boolean down;
        long m920screenToLocalMKHz9U;
        LongSparseArray longSparseArray = (LongSparseArray) this.imageLoader;
        LongSparseArray longSparseArray2 = new LongSparseArray(anonymousClass1.getPointers().size());
        List pointers = anonymousClass1.getPointers();
        int size = pointers.size();
        for (int i = 0; i < size; i++) {
            PointerInputEventData pointerInputEventData = (PointerInputEventData) pointers.get(i);
            PointerInputChangeEventProducer$PointerInputData pointerInputChangeEventProducer$PointerInputData = (PointerInputChangeEventProducer$PointerInputData) longSparseArray.get(pointerInputEventData.m820getIdJ3iCeTQ());
            if (pointerInputChangeEventProducer$PointerInputData == null) {
                down = false;
                uptime = pointerInputEventData.getUptime();
                m920screenToLocalMKHz9U = pointerInputEventData.m823getPositionF1C5BW0();
            } else {
                uptime = pointerInputChangeEventProducer$PointerInputData.getUptime();
                down = pointerInputChangeEventProducer$PointerInputData.getDown();
                m920screenToLocalMKHz9U = androidComposeView.m920screenToLocalMKHz9U(pointerInputChangeEventProducer$PointerInputData.m819getPositionOnScreenF1C5BW0());
            }
            longSparseArray2.put(new PointerInputChange(pointerInputEventData.m820getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m823getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, m920screenToLocalMKHz9U, down, pointerInputEventData.m826getTypeT8wyACA(), pointerInputEventData.getHistorical(), pointerInputEventData.m825getScrollDeltaF1C5BW0(), pointerInputEventData.getScaleGestureFactor(), pointerInputEventData.m822getPanGestureOffsetF1C5BW0(), pointerInputEventData.m821getOriginalEventPositionF1C5BW0()), pointerInputEventData.m820getIdJ3iCeTQ());
            if (pointerInputEventData.getDown()) {
                long m820getIdJ3iCeTQ = pointerInputEventData.m820getIdJ3iCeTQ();
                final long uptime2 = pointerInputEventData.getUptime();
                final long m824getPositionOnScreenF1C5BW0 = pointerInputEventData.m824getPositionOnScreenF1C5BW0();
                final boolean down2 = pointerInputEventData.getDown();
                longSparseArray.put(new Object(down2, uptime2, m824getPositionOnScreenF1C5BW0) { // from class: androidx.compose.ui.input.pointer.PointerInputChangeEventProducer$PointerInputData
                    public final boolean down;
                    public final long positionOnScreen;
                    public final long uptime;

                    {
                        this.uptime = uptime2;
                        this.positionOnScreen = m824getPositionOnScreenF1C5BW0;
                        this.down = down2;
                    }

                    public final boolean getDown() {
                        return this.down;
                    }

                    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
                    public final long m819getPositionOnScreenF1C5BW0() {
                        return this.positionOnScreen;
                    }

                    public final long getUptime() {
                        return this.uptime;
                    }
                }, m820getIdJ3iCeTQ);
            } else {
                longSparseArray.remove(pointerInputEventData.m820getIdJ3iCeTQ());
            }
        }
        return new zzr(longSparseArray2, anonymousClass1);
    }

    public boolean remove(LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.remove called on an unattached node");
        }
        return ((SortedSet) this.imageLoader).remove(layoutNode);
    }

    public void resumeAndRemoveAll() {
        MutableVector mutableVector = (MutableVector) this.imageLoader;
        IntRange until = RangesKt___RangesKt.until(0, mutableVector.size);
        int i = until.first;
        int i2 = until.last;
        if (i <= i2) {
            while (true) {
                CancellableContinuationImpl cancellableContinuationImpl = ((ContentInViewNode.Request) mutableVector.content[i]).continuation;
                Unit unit = Unit.INSTANCE;
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(unit);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        mutableVector.clear();
    }

    public String toString() {
        int i = this.$r8$classId;
        Object obj = this.imageLoader;
        switch (i) {
            case 11:
                return ((SortedSet) obj).toString();
            case 24:
                return ((StringBuilder) obj).toString();
            default:
                return super.toString();
        }
    }

    public void zza(int i, String str, List list, boolean z, boolean z2) {
        zzgs zzgsVar;
        zzht zzhtVar = (zzht) this.imageLoader;
        int i2 = i - 1;
        if (i2 == 0) {
            zzgu zzguVar = ((zzic) zzhtVar.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzgsVar = zzguVar.zzk;
        } else if (i2 != 1) {
            if (i2 == 3) {
                zzgu zzguVar2 = ((zzic) zzhtVar.$$delegate_0).zzi;
                zzic.zzP(zzguVar2);
                zzgsVar = zzguVar2.zzl;
            } else if (i2 != 4) {
                zzgu zzguVar3 = ((zzic) zzhtVar.$$delegate_0).zzi;
                zzic.zzP(zzguVar3);
                zzgsVar = zzguVar3.zzj;
            } else if (z) {
                zzgu zzguVar4 = ((zzic) zzhtVar.$$delegate_0).zzi;
                zzic.zzP(zzguVar4);
                zzgsVar = zzguVar4.zzh;
            } else if (z2) {
                zzgu zzguVar5 = ((zzic) zzhtVar.$$delegate_0).zzi;
                zzic.zzP(zzguVar5);
                zzgsVar = zzguVar5.zzg;
            } else {
                zzgu zzguVar6 = ((zzic) zzhtVar.$$delegate_0).zzi;
                zzic.zzP(zzguVar6);
                zzgsVar = zzguVar6.zzi;
            }
        } else if (z) {
            zzgu zzguVar7 = ((zzic) zzhtVar.$$delegate_0).zzi;
            zzic.zzP(zzguVar7);
            zzgsVar = zzguVar7.zze;
        } else if (z2) {
            zzgu zzguVar8 = ((zzic) zzhtVar.$$delegate_0).zzi;
            zzic.zzP(zzguVar8);
            zzgsVar = zzguVar8.zzd;
        } else {
            zzgu zzguVar9 = ((zzic) zzhtVar.$$delegate_0).zzi;
            zzic.zzP(zzguVar9);
            zzgsVar = zzguVar9.zzf;
        }
        int size = list.size();
        if (size == 1) {
            zzgsVar.zzb(list.get(0), str);
            return;
        }
        if (size == 2) {
            zzgsVar.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzgsVar.zza(str);
        } else {
            zzgsVar.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void zzb(long j, long j2) {
        zzoc zzocVar = (zzoc) this.imageLoader;
        zzocVar.zzg();
        zzocVar.zzn$1();
        zzic zzicVar = (zzic) zzocVar.$$delegate_0;
        zzhh zzhhVar = zzicVar.zzh;
        zzic.zzN(zzhhVar);
        if (zzhhVar.zzo(j)) {
            zzic.zzN(zzhhVar);
            zzhhVar.zzg.zzb(true);
            zzicVar.zzv().zzi$1();
        }
        zzic.zzN(zzhhVar);
        zzhhVar.zzk.zzb(j);
        if (zzhhVar.zzg.zza()) {
            zzc(j, j2);
        }
    }

    public void zzc(long j, long j2) {
        zzoc zzocVar = (zzoc) this.imageLoader;
        zzocVar.zzg();
        zzic zzicVar = (zzic) zzocVar.$$delegate_0;
        if (zzicVar.zzB()) {
            zzhh zzhhVar = zzicVar.zzh;
            zzic.zzN(zzhhVar);
            zzhhVar.zzk.zzb(j);
            zzicVar.zzn.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzl.zzb(Long.valueOf(elapsedRealtime), "Session started, time");
            long j3 = j / 1000;
            Long valueOf = Long.valueOf(j3);
            zzlj zzljVar = zzicVar.zzp;
            zzic.zzO(zzljVar);
            zzljVar.zzM(j, valueOf, "auto", "_sid");
            zzic.zzN(zzhhVar);
            zzhhVar.zzl.zzb(j3);
            zzhhVar.zzg.zzb(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            zzic.zzO(zzljVar);
            zzljVar.zzF(j, j2, bundle, "auto", "_s");
            String zza = zzhhVar.zzq.zza();
            if (TextUtils.isEmpty(zza)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", zza);
            zzic.zzO(zzljVar);
            zzljVar.zzF(j, j2, bundle2, "auto", "_ssr");
        }
    }

    public void add(LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.add called on an unattached node");
        }
        ((SortedSet) this.imageLoader).add(layoutNode);
    }

    public MemoryCacheService(Set set) {
        this.$r8$classId = 1;
        this.imageLoader = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            RemoteModelManager$RemoteModelManagerRegistration remoteModelManager$RemoteModelManagerRegistration = (RemoteModelManager$RemoteModelManagerRegistration) it.next();
            HashMap hashMap = (HashMap) this.imageLoader;
            remoteModelManager$RemoteModelManagerRegistration.getClass();
            hashMap.put(Base64Codec.class, remoteModelManager$RemoteModelManagerRegistration.zzb);
        }
    }

    public MemoryCacheService(RealImageLoader realImageLoader, Extras.Key key) {
        this.$r8$classId = 0;
        this.imageLoader = realImageLoader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (r8 == 1) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MemoryCacheService(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int i2 = 3;
        this.$r8$classId = 3;
        int length = fArr.length - 1;
        ArcSpline$Arc[][] arcSpline$ArcArr = new ArcSpline$Arc[length][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != i2) {
                            int i7 = 4;
                            if (i6 != 4) {
                                i7 = 5;
                                if (i6 != 5) {
                                    i = i4;
                                }
                            }
                            i = i7;
                        }
                    }
                    i3 = 2;
                    i = i3;
                }
                i3 = 1;
                i = i3;
            } else {
                i = i2;
            }
            float[] fArr3 = fArr2[i5];
            int i8 = i5 + 1;
            float[] fArr4 = fArr2[i8];
            float f = fArr[i5];
            float f2 = fArr[i8];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            ArcSpline$Arc[] arcSpline$ArcArr2 = new ArcSpline$Arc[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = i9 * 2;
                int i11 = i9;
                int i12 = i10 + 1;
                arcSpline$ArcArr2[i11] = new ArcSpline$Arc(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                i9 = i11 + 1;
            }
            arcSpline$ArcArr[i5] = arcSpline$ArcArr2;
            i5 = i8;
            i4 = i;
            i2 = 3;
        }
        this.imageLoader = arcSpline$ArcArr;
    }

    public MemoryCacheService(MainActivity mainActivity) {
        WorkLauncherImpl workLauncherImpl;
        this.$r8$classId = 14;
        if (Build.VERSION.SDK_INT >= 31) {
            workLauncherImpl = new SplashScreenViewProvider$ViewImpl31(mainActivity);
        } else {
            workLauncherImpl = new WorkLauncherImpl(mainActivity);
        }
        workLauncherImpl.createSplashScreenView();
        this.imageLoader = workLauncherImpl;
    }

    public /* synthetic */ MemoryCacheService(Object obj, int i) {
        this.$r8$classId = i;
        this.imageLoader = obj;
    }

    public MemoryCacheService(View view) {
        this.$r8$classId = 15;
        if (Build.VERSION.SDK_INT >= 30) {
            SoftwareKeyboardControllerCompat$Impl30 softwareKeyboardControllerCompat$Impl30 = new SoftwareKeyboardControllerCompat$Impl30(view);
            softwareKeyboardControllerCompat$Impl30.mView = view;
            this.imageLoader = softwareKeyboardControllerCompat$Impl30;
            return;
        }
        this.imageLoader = new Extras.Key(view);
    }

    public MemoryCacheService(WindowInsetsController windowInsetsController) {
        this.$r8$classId = 15;
        SoftwareKeyboardControllerCompat$Impl30 softwareKeyboardControllerCompat$Impl30 = new SoftwareKeyboardControllerCompat$Impl30(null);
        softwareKeyboardControllerCompat$Impl30.mWindowInsetsController = windowInsetsController;
        this.imageLoader = softwareKeyboardControllerCompat$Impl30;
    }

    public MemoryCacheService(long[] jArr) {
        MutableLongList mutableLongList;
        this.$r8$classId = 7;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            mutableLongList = new MutableLongList(copyOf.length);
            int i = mutableLongList._size;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i;
                    long[] jArr2 = mutableLongList.content;
                    if (jArr2.length < length) {
                        mutableLongList.content = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = mutableLongList.content;
                    int i2 = mutableLongList._size;
                    if (i != i2) {
                        ArraysKt___ArraysJvmKt.copyInto(copyOf.length + i, jArr3, i, jArr3, i2);
                    }
                    ArraysKt___ArraysJvmKt.copyInto$default(i, copyOf, 0, jArr3, 12);
                    mutableLongList._size += copyOf.length;
                }
            } else {
                RuntimeHelpersKt.throwIndexOutOfBoundsException("");
                throw null;
            }
        } else {
            mutableLongList = new MutableLongList();
        }
        this.imageLoader = mutableLongList;
    }

    public MemoryCacheService(LifecycleOwner lifecycleOwner) {
        this.$r8$classId = 12;
        this.imageLoader = lifecycleOwner.getLifecycle();
    }

    @Override // com.google.android.gms.measurement.internal.zzpo
    public void zza(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        zzlj zzljVar = (zzlj) this.imageLoader;
        if (isEmpty) {
            zzljVar.zzA("auto", "_err", bundle);
        } else {
            zzljVar.getClass();
            a$$ExternalSyntheticBUOutline0.m$1("Unexpected call on client side");
        }
    }

    public void zza() {
        zzoc zzocVar = (zzoc) this.imageLoader;
        zzocVar.zzg();
        zzic zzicVar = (zzic) zzocVar.$$delegate_0;
        zzhh zzhhVar = zzicVar.zzh;
        zzic.zzN(zzhhVar);
        zzicVar.zzn.getClass();
        if (zzhhVar.zzo(System.currentTimeMillis())) {
            zzhh zzhhVar2 = zzicVar.zzh;
            zzic.zzN(zzhhVar2);
            zzhhVar2.zzg.zzb(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzl.zza("Detected application was in foreground");
                zzc(System.currentTimeMillis(), zzicVar.zzg.zzp(null, zzfy.zzbe) ? SystemClock.elapsedRealtime() : 0L);
            }
        }
    }
}
