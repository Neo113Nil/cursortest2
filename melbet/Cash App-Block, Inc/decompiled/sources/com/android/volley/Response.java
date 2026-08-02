package com.android.volley;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.Image;
import android.opengl.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.core.graphics.ColorUtils;
import androidx.media3.common.audio.AudioBecomingNoisyManager$AudioBecomingNoisyReceiver;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.SystemHandlerWrapper;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingTrackOutput;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import androidx.work.Data$$ExternalSyntheticLambda0;
import androidx.work.impl.constraints.IndividualNetworkCallback;
import app.cash.redwood.treehouse.OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService;
import app.cash.redwood.treehouse.ViewContentCodeBinding;
import coil3.disk.DiskLruCache;
import coil3.request.ViewTargetDisposable;
import coil3.util.FileSystemsKt;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$2;
import com.datadog.trace.api.time.SystemTimeSource;
import com.datadog.trace.core.CoreTracer;
import com.datadog.trace.core.PendingTraceBuffer;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbi;
import com.google.android.gms.internal.mlkit_vision_text_common.zzc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzce;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzi;
import com.google.android.gms.internal.mlkit_vision_text_common.zzj;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import com.google.android.gms.maps.zzah;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.google.common.base.MoreObjects$ToStringHelper$UnconditionalValueHolder;
import com.google.firebase.messaging.ProxyNotificationInitializer$$ExternalSyntheticLambda0;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.common.sdkinternal.zzv;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.internal.zzk;
import com.google.mlkit.vision.text.internal.zzm;
import com.google.mlkit.vision.text.zzb;
import com.google.mlkit.vision.text.zzd;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.DataMask$EnumUnboxingLocalUtility;
import com.google.zxing.qrcode.decoder.FormatInformation;
import com.google.zxing.qrcode.decoder.Version;
import com.jakewharton.disklrucache.DiskLruCache;
import com.jakewharton.disklrucache.DiskLruCache$Editor$FaultHidingOutputStream;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.stripe.android.utils.MapUtilsKt;
import com.stripe.attestation.TaskExtensionsKt;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2InputSelectBottomSheetBinding;
import com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectListAdapter;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.types.KTypeSubstitutorKt;
import kotlin.text.StringsKt;
import net.oneformapp.PopEncryptorV2_;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.DiskLruCache$fileSystem$1;
import okhttp3.internal.cache.FaultHidingSink;
import okio.BlackholeSink;
import okio.Path;
import okio.Sink;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.Choreographers$$ExternalSyntheticLambda1;
import radiography.internal.ComposeLayoutInfoKt$$ExternalSyntheticLambda6;
import sqip.internal.BaseCardEntryActivity$$ExternalSyntheticLambda1;

/* loaded from: classes3.dex */
public final class Response implements ExtractorOutput, zzm {
    public final /* synthetic */ int $r8$classId;
    public Object cacheEntry;
    public Object error;
    public boolean intermediate;
    public Object result;

    public Response(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 13:
                this.result = new Object();
                this.cacheEntry = new ArrayDeque();
                this.error = new AtomicReference();
                break;
            default:
                this.result = new float[16];
                this.cacheEntry = new float[16];
                this.error = new TimedValueQueue((byte) 0, 0);
                break;
        }
    }

    public static void computeRecenterMatrix(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / sqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3;
    }

    public void abort() {
        switch (this.$r8$classId) {
            case 8:
                DiskLruCache.access$2100((DiskLruCache) this.error, this, false);
                return;
            case 16:
                com.jakewharton.disklrucache.DiskLruCache.access$2200((com.jakewharton.disklrucache.DiskLruCache) this.error, this, false);
                return;
            default:
                okhttp3.internal.cache.DiskLruCache diskLruCache = (okhttp3.internal.cache.DiskLruCache) this.error;
                synchronized (diskLruCache) {
                    try {
                        if (this.intermediate) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (Intrinsics.areEqual(((DiskLruCache.Entry) this.result).currentEditor, this)) {
                            diskLruCache.completeEdit$okhttp(this, false);
                        }
                        this.intermediate = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public void add(Object obj, String str) {
        n nVar = new n(4);
        ((n) this.error).c = nVar;
        this.error = nVar;
        nVar.b = obj;
        nVar.a = str;
    }

    public void addUnconditionalHolder(String str, String str2) {
        MoreObjects$ToStringHelper$UnconditionalValueHolder moreObjects$ToStringHelper$UnconditionalValueHolder = new MoreObjects$ToStringHelper$UnconditionalValueHolder(4);
        ((n) this.error).c = moreObjects$ToStringHelper$UnconditionalValueHolder;
        this.error = moreObjects$ToStringHelper$UnconditionalValueHolder;
        moreObjects$ToStringHelper$UnconditionalValueHolder.b = str2;
        moreObjects$ToStringHelper$UnconditionalValueHolder.a = str;
    }

    public boolean close() {
        ViewGroup viewGroup = (ViewGroup) this.result;
        if (!((Lazy) this.cacheEntry).isInitialized()) {
            return false;
        }
        BottomSheetBehavior from = BottomSheetBehavior.from(getBinding().bottomSheet);
        Context context = viewGroup.getContext();
        context.getClass();
        ContextUtilsKt.hideKeyboard(context);
        viewGroup.postDelayed(new UiStepBottomSheet$$ExternalSyntheticLambda1(from, 5), 100L);
        return from.state != 5;
    }

    public void commit() {
        okhttp3.internal.cache.DiskLruCache diskLruCache = (okhttp3.internal.cache.DiskLruCache) this.error;
        synchronized (diskLruCache) {
            try {
                if (this.intermediate) {
                    throw new IllegalStateException("Check failed.");
                }
                if (Intrinsics.areEqual(((DiskLruCache.Entry) this.result).currentEditor, this)) {
                    diskLruCache.completeEdit$okhttp(this, true);
                }
                this.intermediate = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void complete(boolean z) {
        coil3.disk.DiskLruCache diskLruCache = (coil3.disk.DiskLruCache) this.error;
        synchronized (diskLruCache.lock) {
            try {
                if (this.intermediate) {
                    throw new IllegalStateException("editor is closed");
                }
                if (Intrinsics.areEqual(((DiskLruCache.Entry) this.result).currentEditor, this)) {
                    coil3.disk.DiskLruCache.access$completeEdit(diskLruCache, this, z);
                }
                this.intermediate = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int copyBit(int i, int i2, int i3) {
        boolean z = this.intermediate;
        BitMatrix bitMatrix = (BitMatrix) this.result;
        return z ? bitMatrix.get(i2, i) : bitMatrix.get(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    public void detach$okhttp() {
        DiskLruCache.Entry entry = (DiskLruCache.Entry) this.result;
        if (Intrinsics.areEqual(entry.currentEditor, this)) {
            okhttp3.internal.cache.DiskLruCache diskLruCache = (okhttp3.internal.cache.DiskLruCache) this.error;
            if (diskLruCache.civilizedFileSystem) {
                diskLruCache.completeEdit$okhttp(this, false);
            } else {
                entry.zombie = true;
            }
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        SparseArray sparseArray = (SparseArray) this.error;
        ((ExtractorOutput) this.result).endTracks();
        if (this.intermediate) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((SubtitleTranscodingTrackOutput) sparseArray.valueAt(i)).shouldSuppressParsingErrors = true;
            }
        }
    }

    public Path file(int i) {
        Path path;
        coil3.disk.DiskLruCache diskLruCache = (coil3.disk.DiskLruCache) this.error;
        synchronized (diskLruCache.lock) {
            if (this.intermediate) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.cacheEntry)[i] = true;
            Object obj = ((DiskLruCache.Entry) this.result).dirtyFiles.get(i);
            FileSystemsKt.createFile$default(diskLruCache.fileSystem, (Path) obj);
            path = (Path) obj;
        }
        return path;
    }

    public Pi2InputSelectBottomSheetBinding getBinding() {
        return (Pi2InputSelectBottomSheetBinding) ((Lazy) this.cacheEntry).getValue();
    }

    public DiskLruCache.Entry getEntry$okhttp() {
        return (DiskLruCache.Entry) this.result;
    }

    public File getFile() {
        File file;
        synchronized (((com.bumptech.glide.disklrucache.DiskLruCache) this.error)) {
            try {
                DiskLruCache.Entry entry = (DiskLruCache.Entry) this.result;
                if (entry.currentEditor != this) {
                    throw new IllegalStateException();
                }
                if (!entry.readable) {
                    ((boolean[]) this.cacheEntry)[0] = true;
                }
                file = entry.dirtyFiles[0];
                ((com.bumptech.glide.disklrucache.DiskLruCache) this.error).directory.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public Feature[] getRequiredFeatures() {
        return (Feature[]) this.cacheEntry;
    }

    public boolean[] getWritten$okhttp() {
        return (boolean[]) this.cacheEntry;
    }

    public OutputStream newOutputStream(int i) {
        FileOutputStream fileOutputStream;
        DiskLruCache$Editor$FaultHidingOutputStream diskLruCache$Editor$FaultHidingOutputStream;
        synchronized (((com.jakewharton.disklrucache.DiskLruCache) this.error)) {
            try {
                DiskLruCache.Entry entry = (DiskLruCache.Entry) this.result;
                if (entry.currentEditor != this) {
                    throw new IllegalStateException();
                }
                if (!entry.readable) {
                    ((boolean[]) this.cacheEntry)[i] = true;
                }
                File dirtyFile = entry.getDirtyFile(i);
                try {
                    fileOutputStream = new FileOutputStream(dirtyFile);
                } catch (FileNotFoundException unused) {
                    ((com.jakewharton.disklrucache.DiskLruCache) this.error).directory.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(dirtyFile);
                    } catch (FileNotFoundException unused2) {
                        return com.jakewharton.disklrucache.DiskLruCache.NULL_OUTPUT_STREAM;
                    }
                }
                diskLruCache$Editor$FaultHidingOutputStream = new DiskLruCache$Editor$FaultHidingOutputStream(this, fileOutputStream);
            } catch (Throwable th) {
                throw th;
            }
        }
        return diskLruCache$Editor$FaultHidingOutputStream;
    }

    public Sink newSink(int i) {
        okhttp3.internal.cache.DiskLruCache diskLruCache = (okhttp3.internal.cache.DiskLruCache) this.error;
        synchronized (diskLruCache) {
            try {
                if (this.intermediate) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.areEqual(((DiskLruCache.Entry) this.result).currentEditor, this)) {
                    return new BlackholeSink();
                }
                if (!((DiskLruCache.Entry) this.result).readable) {
                    boolean[] zArr = (boolean[]) this.cacheEntry;
                    zArr.getClass();
                    zArr[i] = true;
                }
                Path path = (Path) ((DiskLruCache.Entry) this.result).dirtyFiles.get(i);
                try {
                    DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = diskLruCache.fileSystem;
                    diskLruCache$fileSystem$1.getClass();
                    path.getClass();
                    return new FaultHidingSink(diskLruCache$fileSystem$1.sink(path, false), new BlurEffectKt$$ExternalSyntheticLambda1(19, diskLruCache, this));
                } catch (FileNotFoundException unused) {
                    return new BlackholeSink();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public FormatInformation readFormatInformation() {
        FormatInformation formatInformation = (FormatInformation) this.error;
        if (formatInformation != null) {
            return formatInformation;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = copyBit(i3, 8, i2);
        }
        int copyBit = copyBit(8, 7, copyBit(8, 8, copyBit(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            copyBit = copyBit(8, i4, copyBit);
        }
        int i5 = ((BitMatrix) this.result).height;
        int i6 = i5 - 7;
        for (int i7 = i5 - 1; i7 >= i6; i7--) {
            i = copyBit(8, i7, i);
        }
        for (int i8 = i5 - 8; i8 < i5; i8++) {
            i = copyBit(i8, 8, i);
        }
        FormatInformation doDecodeFormatInformation = FormatInformation.doDecodeFormatInformation(copyBit, i);
        if (doDecodeFormatInformation == null) {
            doDecodeFormatInformation = FormatInformation.doDecodeFormatInformation(copyBit ^ 21522, i ^ 21522);
        }
        this.error = doDecodeFormatInformation;
        if (doDecodeFormatInformation != null) {
            return doDecodeFormatInformation;
        }
        throw FormatException.getFormatInstance();
    }

    public Version readVersion() {
        Version version = (Version) this.cacheEntry;
        if (version != null) {
            return version;
        }
        int i = ((BitMatrix) this.result).height;
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return Version.getVersionForNumber(i2);
        }
        int i3 = i - 11;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                i5 = copyBit(i7, i6, i5);
            }
        }
        Version decodeVersionInformation = Version.decodeVersionInformation(i5);
        if (decodeVersionInformation != null && (decodeVersionInformation.versionNumber * 4) + 17 == i) {
            this.cacheEntry = decodeVersionInformation;
            return decodeVersionInformation;
        }
        for (int i8 = 5; i8 >= 0; i8--) {
            for (int i9 = i - 9; i9 >= i3; i9--) {
                i4 = copyBit(i8, i9, i4);
            }
        }
        Version decodeVersionInformation2 = Version.decodeVersionInformation(i4);
        if (decodeVersionInformation2 == null || (decodeVersionInformation2.versionNumber * 4) + 17 != i) {
            throw FormatException.getFormatInstance();
        }
        this.cacheEntry = decodeVersionInformation2;
        return decodeVersionInformation2;
    }

    public void registerListener(GmsClient gmsClient, TaskCompletionSource taskCompletionSource) {
        ((zzah) ((PopEncryptorV2_) this.error).encryptionKey).accept(gmsClient, taskCompletionSource);
    }

    public void remask() {
        if (((FormatInformation) this.error) == null) {
            return;
        }
        int i = CameraSelector$$ExternalSyntheticOutline0.values(8)[((FormatInformation) this.error).dataMask];
        BitMatrix bitMatrix = (BitMatrix) this.result;
        int i2 = bitMatrix.height;
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (DataMask$EnumUnboxingLocalUtility._dispatch_isMasked(i, i3, i4)) {
                    bitMatrix.flip(i4, i3);
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        ((ExtractorOutput) this.result).seekMap(seekMap);
    }

    public void setEnabled() {
        if (this.intermediate) {
            ((SystemHandlerWrapper) this.error).post(new AFd1lSDK$$ExternalSyntheticLambda0(this, 5));
            this.intermediate = false;
        }
    }

    public void show(InputSelectBoxComponent inputSelectBoxComponent, Function1 function1) {
        View currentFocus;
        inputSelectBoxComponent.getClass();
        int i = 1;
        if (!this.intermediate) {
            this.intermediate = true;
            BottomSheetBehavior from = BottomSheetBehavior.from(getBinding().bottomSheet);
            from.updateImportantForAccessibilityOnSiblings = true;
            zzbk.setup(from, new ShimmerThemeKt$$ExternalSyntheticLambda0(29), getBinding().bottomSheet, getBinding().listContent, getBinding().shadow);
            from.addBottomSheetCallback(new BottomSheetDialog.AnonymousClass5(this, i));
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = function1;
        String label = inputSelectBoxComponent.getLabel();
        boolean z = label == null || StringsKt.isBlank(label);
        BottomSheetBehavior from2 = BottomSheetBehavior.from(getBinding().bottomSheet);
        Context context = getBinding().recyclerviewInquirySelectList.getContext();
        context.getClass();
        InputSelectListAdapter inputSelectListAdapter = new InputSelectListAdapter(context, inputSelectBoxComponent.getOptions(), inputSelectBoxComponent.getStyles(), inputSelectBoxComponent.getCanSelectMultipleValues(), inputSelectBoxComponent.getSelectedOptions(), new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(i, inputSelectBoxComponent, ref$ObjectRef, this));
        this.error = new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(2, ref$ObjectRef, inputSelectListAdapter, this);
        if (z) {
            getBinding().textviewInputSelectSheetTitle.setVisibility(8);
            getBinding().searchBarTextInput.setVisibility(0);
            getBinding().searchBarEditText.requestFocus();
            Context context2 = getBinding().searchBarEditText.getContext();
            context2.getClass();
            AppCompatActivity activity = ContextUtilsKt.getActivity(context2);
            if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
                Object systemService = context2.getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(currentFocus, 1);
                }
            }
        } else {
            Context context3 = getBinding().searchBarEditText.getContext();
            context3.getClass();
            ContextUtilsKt.hideKeyboard(context3);
            getBinding().searchBarTextInput.setVisibility(8);
            getBinding().textviewInputSelectSheetTitle.setVisibility(0);
            getBinding().searchBarEditText.setText("");
        }
        getBinding().textviewInputSelectSheetTitle.setText(inputSelectBoxComponent.getLabel());
        getBinding().recyclerviewInquirySelectList.setAdapter(inputSelectListAdapter);
        getBinding().shadow.setOnClickListener(new UiStepBottomSheet$$ExternalSyntheticLambda3(from2, 7));
        InputSelectBoxComponentStyle styles = inputSelectBoxComponent.getStyles();
        if (styles != null) {
            TextStylingKt.style(getBinding().textviewInputSelectSheetTitle, styles.getTextBasedStyle(), EmptySet.INSTANCE);
            Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
            if (baseBackgroundColorValue != null) {
                int intValue = baseBackgroundColorValue.intValue();
                getBinding().listContent.setBackgroundColor(intValue);
                getBinding().recyclerviewInquirySelectList.setBackgroundColor(intValue);
            }
            Integer baseBorderColorValue = styles.getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                getBinding().listContentSeparator.setBackgroundColor(baseBorderColorValue.intValue());
            }
            Integer headerCancelButtonColor = styles.getHeaderCancelButtonColor();
            if (headerCancelButtonColor != null) {
                int intValue2 = headerCancelButtonColor.intValue();
                getBinding().navBarBackButton.setImageTintList(ColorStateList.valueOf(intValue2));
                getBinding().searchBarTextInput.setEndIconTintList(ColorStateList.valueOf(intValue2));
            }
            Integer baseTextColor = styles.getBaseTextColor();
            if (baseTextColor != null) {
                int intValue3 = baseTextColor.intValue();
                ColorStateList valueOf = ColorStateList.valueOf(ColorUtils.setAlphaComponent(intValue3, 128));
                valueOf.getClass();
                getBinding().searchBarEditText.setHintTextColor(valueOf);
                getBinding().searchBarEditText.setTextColor(intValue3);
            }
        }
        getBinding().recyclerviewInquirySelectList.setLayoutManager(new LinearLayoutManager(getBinding().rootView.getContext()));
        getBinding().recyclerviewInquirySelectList.setHasFixedSize(true);
        getBinding().searchBarEditText.addTextChangedListener(new SearchView.AnonymousClass10(inputSelectListAdapter, 13));
        getBinding().navBarBackButton.setOnClickListener(new BaseCardEntryActivity$$ExternalSyntheticLambda1(this, 4));
        getBinding().searchBarEditText.setText("");
        getBinding().bottomSheet.setTranslationY(RecyclerView.DECELERATION_RATE);
        ((ViewGroup) this.result).postDelayed(new ProxyNotificationInitializer$$ExternalSyntheticLambda0(z, this, from2), 100L);
    }

    public void submit(Runnable runnable, Executor executor) {
        synchronized (this.result) {
            try {
                if (this.intermediate) {
                    ((ArrayDeque) this.cacheEntry).add(new zzv(runnable, executor));
                } else {
                    this.intermediate = true;
                    zzd(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 12:
                boolean z = this.intermediate;
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.result);
                sb.append('{');
                String str = "";
                for (n nVar = (n) ((n) this.cacheEntry).c; nVar != null; nVar = (n) nVar.c) {
                    Object obj = nVar.b;
                    if ((nVar instanceof MoreObjects$ToStringHelper$UnconditionalValueHolder) || obj != null || !z) {
                        sb.append(str);
                        String str2 = (String) nVar.a;
                        if (str2 != null) {
                            sb.append(str2);
                            sb.append('=');
                        }
                        if (obj == null || !obj.getClass().isArray()) {
                            sb.append(obj);
                        } else {
                            String deepToString = Arrays.deepToString(new Object[]{obj});
                            sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                        }
                        str = ", ";
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.error;
        ExtractorOutput extractorOutput = (ExtractorOutput) this.result;
        if (i2 != 3 && i2 != 5) {
            this.intermediate = true;
        }
        if (i2 != 3) {
            return extractorOutput.track(i, i2);
        }
        SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput = (SubtitleTranscodingTrackOutput) sparseArray.get(i);
        if (subtitleTranscodingTrackOutput != null) {
            return subtitleTranscodingTrackOutput;
        }
        SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput2 = new SubtitleTranscodingTrackOutput(extractorOutput.track(i, i2), (SubtitleParser.Factory) this.cacheEntry);
        sparseArray.put(i, subtitleTranscodingTrackOutput2);
        return subtitleTranscodingTrackOutput2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0315, code lost:
    
        if (com.withpersona.sdk2.camera.CameraPropertiesKt.zzb(r0) == false) goto L73;
     */
    @Override // com.google.mlkit.vision.text.internal.zzm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Text zza(InputImage inputImage) {
        Bitmap zza;
        int i;
        String str;
        if (((zzh) this.error) == null) {
            zzb();
        }
        if (((zzh) this.error) == null) {
            throw new MlKitException("Waiting for the text recognition module to be downloaded. Please wait.", 14);
        }
        int i2 = inputImage.zzg;
        boolean z = true;
        int i3 = 0;
        if (i2 == -1) {
            zza = inputImage.zza;
            i = CommonConvertUtils.convertToMVRotation(inputImage.zzf);
        } else {
            if (i2 == -1) {
                Bitmap bitmap = inputImage.zza;
                zzae.checkNotNull(bitmap);
                zza = KTypeSubstitutorKt.zza(bitmap, inputImage.zzf, inputImage.zzd, inputImage.zze);
            } else if (i2 == 17) {
                ByteBuffer byteBuffer = inputImage.zzb;
                zzae.checkNotNull(byteBuffer);
                zza = KTypeSubstitutorKt.nv21ToBitmap(byteBuffer, inputImage.zzd, inputImage.zze, inputImage.zzf);
            } else if (i2 == 35) {
                Image.Plane[] planes = inputImage.getPlanes();
                zzae.checkNotNull(planes);
                zza = KTypeSubstitutorKt.nv21ToBitmap(KTypeSubstitutorKt.yuv420ThreePlanesToNV21(planes, inputImage.zzd, inputImage.zze), inputImage.zzd, inputImage.zze, inputImage.zzf);
            } else {
                if (i2 != 842094169) {
                    throw new MlKitException("Unsupported image format", 13);
                }
                ByteBuffer byteBuffer2 = inputImage.zzb;
                zzae.checkNotNull(byteBuffer2);
                int i4 = inputImage.zzd;
                int i5 = inputImage.zze;
                int i6 = inputImage.zzf;
                byte[] zzb = KTypeSubstitutorKt.zzb(i4, i5, KTypeSubstitutorKt.yv12ToNv21Buffer(byteBuffer2, true).array());
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(zzb, 0, zzb.length);
                zza = KTypeSubstitutorKt.zza(decodeByteArray, i6, decodeByteArray.getWidth(), decodeByteArray.getHeight());
            }
            i = 0;
        }
        ObjectWrapper objectWrapper = new ObjectWrapper(zza);
        int i7 = inputImage.zzd;
        int i8 = inputImage.zze;
        try {
            zzh zzhVar = (zzh) this.error;
            zzae.checkNotNull(zzhVar);
            Parcel zza2 = zzhVar.zza();
            int i9 = zzc.$r8$clinit;
            zza2.writeStrongBinder(objectWrapper);
            zza2.writeInt(1);
            int zzb2 = MooncakeHeaderViewKt.zzb(zza2, 20293);
            int i10 = 4;
            char c = 2;
            MooncakeHeaderViewKt.zza(zza2, 2, 4);
            zza2.writeInt(i7);
            char c2 = 3;
            MooncakeHeaderViewKt.zza(zza2, 3, 4);
            zza2.writeInt(i8);
            MooncakeHeaderViewKt.zza(zza2, 4, 4);
            zza2.writeInt(0);
            MooncakeHeaderViewKt.zza(zza2, 5, 8);
            zza2.writeLong(0L);
            MooncakeHeaderViewKt.zza(zza2, 6, 4);
            zza2.writeInt(i);
            MooncakeHeaderViewKt.zzc(zza2, zzb2);
            Parcel zzb3 = zzhVar.zzb(zza2, 1);
            zzl[] zzlVarArr = (zzl[]) zzb3.createTypedArray(zzl.CREATOR);
            zzb3.recycle();
            SparseArray sparseArray = new SparseArray();
            for (zzl zzlVar : zzlVarArr) {
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzlVar.zzj);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.append(zzlVar.zzj, sparseArray2);
                }
                sparseArray2.append(zzlVar.zzk, zzlVar);
            }
            Object[] objArr = new Object[4];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = 10;
                if (i11 >= sparseArray.size()) {
                    zzce zzg = com.google.android.gms.internal.mlkit_vision_text_common.zzbk.zzg(i12, objArr);
                    return new Text(TaskExtensionsKt.zzb(MapUtilsKt.zza(zzg, new zzb(i13))), zzg);
                }
                SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i11);
                Object[] objArr2 = new Object[i10];
                int i14 = i3;
                int i15 = i14;
                while (i14 < sparseArray3.size()) {
                    zzl zzlVar2 = (zzl) sparseArray3.valueAt(i14);
                    zzlVar2.getClass();
                    char c3 = c2;
                    int i16 = i15 + 1;
                    boolean z2 = z;
                    int length = objArr2.length;
                    if (length < i16) {
                        int i17 = length + (length >> 1) + 1;
                        if (i17 < i16) {
                            int highestOneBit = Integer.highestOneBit(i15);
                            i17 = highestOneBit + highestOneBit;
                        }
                        objArr2 = Arrays.copyOf(objArr2, i17 < 0 ? Integer.MAX_VALUE : i17);
                    }
                    objArr2[i15] = zzlVar2;
                    i14++;
                    i15 = i16;
                    z = z2;
                    c2 = c3;
                }
                char c4 = c2;
                boolean z3 = z;
                zzce zzg2 = com.google.android.gms.internal.mlkit_vision_text_common.zzbk.zzg(i15, objArr2);
                AbstractList zza3 = MapUtilsKt.zza(zzg2, new com.google.mlkit.vision.text.zzc(i13));
                zzf zzfVar = ((zzl) zzg2.get(i3)).zzb;
                zzbi listIterator = zzg2.listIterator(i3);
                int i18 = PKIFailureInfo.systemUnavail;
                int i19 = Integer.MIN_VALUE;
                int i20 = Integer.MAX_VALUE;
                int i21 = Integer.MAX_VALUE;
                while (listIterator.hasNext()) {
                    zzf zzfVar2 = ((zzl) listIterator.next()).zzb;
                    int i22 = i3;
                    int i23 = zzfVar.zza;
                    char c5 = c;
                    float f = zzfVar.zze;
                    int i24 = -zzfVar.zzb;
                    double d = f;
                    double sin = Math.sin(Math.toRadians(d));
                    double cos = Math.cos(Math.toRadians(d));
                    SparseArray sparseArray4 = sparseArray;
                    zzbi zzbiVar = listIterator;
                    Point[] pointArr = new Point[4];
                    int i25 = zzfVar2.zza;
                    int i26 = i11;
                    int i27 = zzfVar2.zzd;
                    int i28 = zzfVar2.zzc;
                    Point point = new Point(i25, zzfVar2.zzb);
                    pointArr[i22] = point;
                    point.offset(-i23, i24);
                    Point point2 = pointArr[i22];
                    double d2 = point2.x * cos;
                    double d3 = point2.y;
                    int i29 = (int) (d2 + (d3 * sin));
                    point2.x = i29;
                    int i30 = (int) (((-r2) * sin) + (d3 * cos));
                    point2.y = i30;
                    int i31 = i29 + i28;
                    pointArr[z3 ? 1 : 0] = new Point(i31, i30);
                    int i32 = i30 + i27;
                    pointArr[c5] = new Point(i31, i32);
                    pointArr[c4] = new Point(i29, i32);
                    for (int i33 = i22; i33 < 4; i33++) {
                        Point point3 = pointArr[i33];
                        i20 = Math.min(i20, point3.x);
                        i18 = Math.max(i18, point3.x);
                        i21 = Math.min(i21, point3.y);
                        i19 = Math.max(i19, point3.y);
                    }
                    c = c5;
                    listIterator = zzbiVar;
                    i3 = i22;
                    sparseArray = sparseArray4;
                    i11 = i26;
                }
                SparseArray sparseArray5 = sparseArray;
                int i34 = i11;
                int i35 = i3;
                char c6 = c;
                int i36 = zzfVar.zza;
                float f2 = zzfVar.zze;
                int i37 = zzfVar.zzb;
                double d4 = f2;
                double sin2 = Math.sin(Math.toRadians(d4));
                double cos2 = Math.cos(Math.toRadians(d4));
                Point[] pointArr2 = {new Point(i20, i21), new Point(i18, i21), new Point(i18, i19), new Point(i20, i19)};
                int i38 = i35;
                while (i38 < 4) {
                    Point point4 = pointArr2[i38];
                    double d5 = point4.x;
                    double d6 = point4.y;
                    point4.x = (int) ((d5 * cos2) - (d6 * sin2));
                    point4.y = (int) ((d5 * sin2) + (d6 * cos2));
                    point4.offset(i36, i37);
                    i38++;
                    cos2 = cos2;
                }
                List asList = Arrays.asList(pointArr2);
                String zzb4 = TaskExtensionsKt.zzb(MapUtilsKt.zza(zza3, new zzd(11)));
                Rect zza4 = zzk.zza(asList);
                HashMap hashMap = new HashMap();
                Iterator it = zza3.iterator();
                while (it.hasNext()) {
                    String str2 = (String) ((Text.Line) it.next()).zzd;
                    hashMap.put(str2, Integer.valueOf((hashMap.containsKey(str2) ? ((Integer) hashMap.get(str2)).intValue() : i35) + 1));
                }
                Set entrySet = hashMap.entrySet();
                if (!entrySet.isEmpty()) {
                    str = (String) ((Map.Entry) Collections.max(entrySet, zzk.zzc)).getKey();
                }
                str = "und";
                Text.TextBlock textBlock = new Text.TextBlock(zzb4, zza4, asList, str, zza3);
                int i39 = i12 + 1;
                int length2 = objArr.length;
                if (length2 < i39) {
                    int i40 = length2 + (length2 >> 1) + 1;
                    if (i40 < i39) {
                        int highestOneBit2 = Integer.highestOneBit(i12);
                        i40 = highestOneBit2 + highestOneBit2;
                    }
                    objArr = Arrays.copyOf(objArr, i40 < 0 ? Integer.MAX_VALUE : i40);
                }
                objArr[i12] = textBlock;
                i11 = i34 + 1;
                c2 = c4;
                c = c6;
                i12 = i39;
                z = z3 ? 1 : 0;
                i3 = i35;
                sparseArray = sparseArray5;
                i10 = 4;
            }
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to run legacy text recognizer.");
        }
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public void zzb() {
        com.google.android.gms.internal.mlkit_vision_text_common.zzk zziVar;
        Context context = (Context) this.result;
        if (((zzh) this.error) != null) {
            return;
        }
        try {
            IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
            int i = zzj.$r8$clinit;
            if (instantiate == null) {
                zziVar = null;
            } else {
                IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
                zziVar = queryLocalInterface instanceof com.google.android.gms.internal.mlkit_vision_text_common.zzk ? (com.google.android.gms.internal.mlkit_vision_text_common.zzk) queryLocalInterface : new zzi(instantiate, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator", 9);
            }
            zzh zzd = ((zzi) zziVar).zzd(new ObjectWrapper(context), (zzp) this.cacheEntry);
            this.error = zzd;
            if (zzd != null || this.intermediate) {
                return;
            }
            Log.d("LegacyTextDelegate", "Request OCR optional module download.");
            OptionalModuleUtils.requestDownload(context, "ocr");
            this.intermediate = true;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to create legacy text recognizer.");
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException(13, e2, "Failed to load deprecated vision dynamite module.");
        }
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public void zzc() {
        switch (this.$r8$classId) {
            case 13:
                synchronized (this.result) {
                    try {
                        if (((ArrayDeque) this.cacheEntry).isEmpty()) {
                            this.intermediate = false;
                            return;
                        }
                        zzv zzvVar = (zzv) ((ArrayDeque) this.cacheEntry).remove();
                        zzd(zzvVar.zzb, zzvVar.zza);
                        return;
                    } finally {
                    }
                }
            default:
                zzh zzhVar = (zzh) this.error;
                if (zzhVar != null) {
                    try {
                        zzhVar.zzc(zzhVar.zza(), 2);
                    } catch (RemoteException e) {
                        Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e);
                    }
                    this.error = null;
                    return;
                }
                return;
        }
    }

    public void zzd(Runnable runnable, Executor executor) {
        try {
            executor.execute(new com.google.mlkit.common.sdkinternal.zzb(this, runnable, false, 19));
        } catch (RejectedExecutionException unused) {
            zzc();
        }
    }

    public void add(long j, String str) {
        addUnconditionalHolder(str, String.valueOf(j));
    }

    public void add(String str, boolean z) {
        addUnconditionalHolder(str, String.valueOf(z));
    }

    public Response(Context context) {
        this.$r8$classId = 14;
        this.cacheEntry = new zzp(null);
        this.result = context;
    }

    public Response(ViewContentCodeBinding viewContentCodeBinding, OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService, boolean z) {
        this.$r8$classId = 6;
        this.cacheEntry = viewContentCodeBinding;
        this.error = onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService;
        this.intermediate = z;
    }

    public Response(Data$$ExternalSyntheticLambda0 data$$ExternalSyntheticLambda0) {
        this.$r8$classId = 5;
        this.result = data$$ExternalSyntheticLambda0;
        this.cacheEntry = new Transition.AnonymousClass1();
        this.error = new ArrayList();
    }

    public Response(BitMatrix bitMatrix) {
        this.$r8$classId = 15;
        int i = bitMatrix.height;
        if (i >= 21 && (i & 3) == 1) {
            this.result = bitMatrix;
            return;
        }
        throw FormatException.getFormatInstance();
    }

    public Response(PopEncryptorV2_ popEncryptorV2_, ListenerHolder listenerHolder, Feature[] featureArr, boolean z) {
        this.$r8$classId = 11;
        this.error = popEncryptorV2_;
        this.result = listenerHolder;
        this.cacheEntry = featureArr;
        this.intermediate = z;
    }

    public Response(ViewGroup viewGroup) {
        this.$r8$classId = 17;
        viewGroup.getClass();
        this.result = viewGroup;
        this.cacheEntry = LazyKt.lazy(new Choreographers$$ExternalSyntheticLambda1(this, 9));
    }

    public Response(ExtractorOutput extractorOutput, SubtitleParser.Factory factory) {
        this.$r8$classId = 4;
        this.result = extractorOutput;
        this.cacheEntry = factory;
        this.error = new SparseArray();
    }

    public Response(CoreTracer coreTracer, PendingTraceBuffer pendingTraceBuffer, SystemTimeSource systemTimeSource, boolean z) {
        this.$r8$classId = 10;
        this.result = coreTracer;
        this.cacheEntry = pendingTraceBuffer;
        this.error = systemTimeSource;
        this.intermediate = z;
    }

    public Response(Context context, Looper looper, Looper looper2, ExoPlayerImpl.ComponentListener componentListener, SystemClock systemClock) {
        this.$r8$classId = 2;
        this.result = context.getApplicationContext();
        this.error = systemClock.createHandler(looper, null);
        this.cacheEntry = new AudioBecomingNoisyManager$AudioBecomingNoisyReceiver(this, systemClock.createHandler(looper2, null), componentListener);
    }

    public Response(Object obj, Cache$Entry cache$Entry) {
        this.$r8$classId = 0;
        this.intermediate = false;
        this.result = obj;
        this.cacheEntry = cache$Entry;
        this.error = null;
    }

    public Response(VolleyError volleyError) {
        this.$r8$classId = 0;
        this.intermediate = false;
        this.result = null;
        this.cacheEntry = null;
        this.error = volleyError;
    }

    public Response(String str) {
        this.$r8$classId = 12;
        n nVar = new n(4);
        this.cacheEntry = nVar;
        this.error = nVar;
        this.intermediate = false;
        this.result = str;
    }

    public Response(ViewTargetDisposable viewTargetDisposable, SingletonConnectivityReceiver$2 singletonConnectivityReceiver$2) {
        this.$r8$classId = 9;
        this.error = new IndividualNetworkCallback(this);
        this.cacheEntry = viewTargetDisposable;
        this.result = singletonConnectivityReceiver$2;
    }

    public Response(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler prefetchScheduler) {
        this.$r8$classId = 1;
        this.result = lazyLayoutItemContentFactory;
        this.cacheEntry = subcomposeLayoutState;
        this.error = prefetchScheduler;
        this.intermediate = true;
    }

    public Response(coil3.disk.DiskLruCache diskLruCache, DiskLruCache.Entry entry) {
        this.$r8$classId = 7;
        this.error = diskLruCache;
        this.result = entry;
        this.cacheEntry = new boolean[2];
    }

    public Response(com.jakewharton.disklrucache.DiskLruCache diskLruCache, DiskLruCache.Entry entry) {
        this.$r8$classId = 16;
        this.error = diskLruCache;
        this.result = entry;
        this.cacheEntry = entry.readable ? null : new boolean[diskLruCache.valueCount];
    }

    public Response(com.bumptech.glide.disklrucache.DiskLruCache diskLruCache, DiskLruCache.Entry entry) {
        this.$r8$classId = 8;
        this.error = diskLruCache;
        this.result = entry;
        this.cacheEntry = entry.readable ? null : new boolean[diskLruCache.valueCount];
    }

    public Response(okhttp3.internal.cache.DiskLruCache diskLruCache, DiskLruCache.Entry entry) {
        boolean[] zArr;
        this.$r8$classId = 18;
        this.error = diskLruCache;
        this.result = entry;
        if (entry.readable) {
            zArr = null;
        } else {
            diskLruCache.getClass();
            zArr = new boolean[2];
        }
        this.cacheEntry = zArr;
    }
}
