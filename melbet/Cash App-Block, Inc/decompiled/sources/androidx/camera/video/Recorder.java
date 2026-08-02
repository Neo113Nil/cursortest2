package androidx.camera.video;

import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.location.LocationManager;
import android.media.AudioTrack;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.util.ArrayMap;
import android.util.LogPrinter;
import android.util.LruCache;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewStructure;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.ToolbarActionBar;
import androidx.appcompat.app.TwilightManager$TwilightState;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.PopupMenu$2;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.adapter.CameraSurfaceAdapter;
import androidx.camera.camera2.adapter.PipeCameraPresenceSource;
import androidx.camera.camera2.adapter.SupportedSurfaceCombination;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.camera2.adapter.ZslControlNoOpImpl;
import androidx.camera.camera2.compat.ZoomCompat;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser;
import androidx.camera.camera2.compat.workaround.InactiveSurfaceCloserImpl$ConfiguredOutput;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.impl.CameraGraphConfigProvider;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.impl.ComboRequestListener;
import androidx.camera.camera2.impl.DisplayInfoManager;
import androidx.camera.camera2.impl.RejectOperationCameraCaptureSession;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.internal.HighSpeedResolver;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.camera2.pipe.CameraGraph$Config;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.media.ClosingFinalizer;
import androidx.camera.camera2.pipe.media.OutputImage;
import androidx.camera.core.AutoValue_SurfaceRequest_Result;
import androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.impl.FeatureCombinationQuery;
import androidx.camera.core.imagecapture.AutoValue_CaptureNode_In;
import androidx.camera.core.imagecapture.AutoValue_Image2JpegBytes_In;
import androidx.camera.core.imagecapture.AutoValue_TakePictureManager_CaptureError;
import androidx.camera.core.imagecapture.ProcessingRequest;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureManagerImpl;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.AutoValue_AttachedSurfaceInfo;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_AudioProfileProxy;
import androidx.camera.core.impl.AutoValue_StateObservable_ErrorWrapper;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.InternalCameraPresenceListener;
import androidx.camera.core.impl.LiveDataObservable$$ExternalSyntheticLambda2;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceStreamSpecQueryResult;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.impl.utils.futures.ListFuture;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.internal.StreamSpecQueryResult;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.processing.AutoValue_Packet;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceOutputImpl;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.TargetUtils;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.EncoderProfilesResolverFactory;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.video.internal.AutoValue_VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda1;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.AutoValue_AudioSettings;
import androidx.camera.video.internal.audio.AutoValue_AudioStream_PacketInfo;
import androidx.camera.video.internal.audio.BufferedAudioStream;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.camera.video.internal.config.CaptureEncodeRates;
import androidx.camera.video.internal.encoder.AutoValue_AudioEncoderConfig;
import androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.EncodedDataImpl;
import androidx.camera.video.internal.encoder.Encoder$EncoderInput;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda2;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.TimeProvider;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl$$ExternalSyntheticLambda0;
import androidx.camera.video.internal.muxer.MuxerException;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.camera.view.PreviewStreamStateObserver;
import androidx.camera.view.PreviewView;
import androidx.camera.view.TextureViewImplementation;
import androidx.cardview.widget.CardView;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableOrderedScatterSet;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.ScatterMapKt;
import androidx.collection.Values;
import androidx.collection.internal.Lock;
import androidx.compose.animation.SharedBoundsNode;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.animation.core.VectorizedFloatDecaySpec;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DefaultDraggable2DState$drag2DScope$1;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.gestures.snapping.SnapPosition$Start;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo$Interval;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.pager.MeasuredPage;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.pager.PagerLayoutInfoKt;
import androidx.compose.foundation.pager.PagerMeasureResult;
import androidx.compose.foundation.pager.PagerSnapDistanceMaxPages;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda1;
import androidx.compose.material.ModalBottomSheetState$$ExternalSyntheticLambda1;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PausedCompositionImpl;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.tooling.SourceInformationKt;
import androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.DefaultIntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.android.selection.SegmentFinder;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.PriorityGoalRow;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;
import androidx.core.provider.CallbackWrapper$2;
import androidx.core.provider.FontRequestWorker;
import androidx.core.util.Consumer;
import androidx.core.util.Supplier;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.view.MenuProvider;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.widget.NestedScrollView;
import androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda0;
import androidx.emoji2.text.DefaultGlyphChecker;
import androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback;
import androidx.emoji2.text.EmojiProcessor$EmojiProcessLookupCallback;
import androidx.emoji2.text.MetadataRepo;
import androidx.emoji2.text.SpannableBuilder;
import androidx.emoji2.text.TypefaceEmojiRasterizer;
import androidx.emoji2.text.TypefaceEmojiSpan;
import androidx.emoji2.text.UnprecomputeTextOnModificationSpannable;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.viewsintegration.EmojiEditableFactory;
import androidx.emoji2.viewsintegration.EmojiInputConnection;
import androidx.emoji2.viewsintegration.EmojiTextWatcher;
import androidx.exifinterface.media.ExifInterface;
import androidx.gridlayout.widget.GridLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.MutableLiveData;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format$$ExternalSyntheticLambda1;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.SonicAudioProcessor;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioCapabilities;
import androidx.media3.exoplayer.audio.AudioSink$AudioTrackConfig;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutputProvider;
import androidx.media3.exoplayer.audio.DefaultAudioOffloadSupportProvider;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.image.ImageRenderer;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.source.ProgressiveMediaPeriod;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.upstream.Allocation;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.spherical.CameraMotionRenderer;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.Id3Peeker$$ExternalSyntheticBUOutline0;
import androidx.media3.extractor.text.CueEncoder;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.webvtt.WebvttCueInfo;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.BatchingListUpdateCallback;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.transition.Transition;
import androidx.viewpager2.widget.ViewPager2;
import androidx.webkit.internal.WebViewProviderFactory;
import androidx.work.impl.foreground.SystemForegroundService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.ng$$ExternalSyntheticLambda0;
import coil3.memory.RealStrongMemoryCache;
import coil3.size.SizeKt;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.bugsnag.android.Client;
import com.bugsnag.android.TraceParser;
import com.datadog.android.rum.internal.anr.ANRDetectorRunnable;
import com.fillr.e0;
import com.fillr.n;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaco;
import com.google.android.gms.internal.time.zzei;
import com.google.android.gms.time.zzc;
import com.google.android.play.core.appupdate.zzi;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.face.internal.zzf;
import com.google.mlkit.vision.face.internal.zzm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.util.X509CertUtils;
import com.squareup.cash.api.Aliases;
import com.squareup.scannerview.CameraOperator$cameraOpenCallback$1;
import com.squareup.scannerview.PreviewView;
import com.squareup.workflow1.ui.Named;
import com.withpersona.sdk2.camera.camera2.Camera2Controller;
import com.withpersona.sdk2.inquiry.shared.SharedModule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.ReversedList;
import kotlin.collections.ReversedList$listIterator$1;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.brotli.dec.HuffmanTreeGroup;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.commonmark.internal.BlockStartImpl;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class Recorder implements VideoOutput {
    public static final SequentialExecutor AUDIO_EXECUTOR;
    public static final ZslControlImpl$$ExternalSyntheticLambda1 DEFAULT_ENCODER_FACTORY;
    public static final ZslControlImpl$$ExternalSyntheticLambda1 DEFAULT_MUXER_FACTORY;
    public static final QualitySelector DEFAULT_QUALITY_SELECTOR;
    public static final VideoEncoderInfoImpl$$ExternalSyntheticLambda0 DEFAULT_VIDEO_ENCODER_INFO_FINDER;
    public static final MediaSpec MEDIA_SPEC_DEFAULT;
    public static final ZslControlImpl$$ExternalSyntheticLambda1 OUTPUT_STORAGE_FACTORY_DEFAULT;
    public static final RuntimeException PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
    public static final Set PENDING_STATES = Collections.unmodifiableSet(EnumSet.of(State.PENDING_RECORDING, State.PENDING_PAUSED));
    public static final Set VALID_NON_PENDING_STATES_WHILE_PENDING = Collections.unmodifiableSet(EnumSet.of(State.CONFIGURING, State.IDLING, State.RESETTING, State.STOPPING, State.ERROR));
    public static final VideoSpec VIDEO_SPEC_DEFAULT;
    public static final long sRetrySetupVideoDelayMs;
    public static final int sRetrySetupVideoMaxCount;
    public final ZslControlImpl$$ExternalSyntheticLambda1 mAudioEncoderFactory;
    public final Executor mExecutor;
    public final zzm mIsRecording;
    public SurfaceRequest mLatestSurfaceRequest;
    public final zzm mMediaSpec;
    public final ZslControlImpl$$ExternalSyntheticLambda1 mMuxerFactory;
    public final ZslControlImpl$$ExternalSyntheticLambda1 mOutputStorageFactory;
    public final long mRequiredFreeStorageBytes;
    public final SequentialExecutor mSequentialExecutor;
    public final zzm mStreamInfo;
    public final Executor mUserProvidedExecutor;
    public final ZslControlImpl$$ExternalSyntheticLambda1 mVideoEncoderFactory;
    public VideoEncoderSession mVideoEncoderSession;
    public Timebase mVideoSourceTimebase;
    public final Object mLock = new Object();
    public final zzm mVideoEncoderBitrateRange = new zzm(null);
    public State mState = State.CONFIGURING;
    public State mNonPendingState = null;
    public int mStreamId = 0;
    public AutoValue_Recorder_RecordingRecord mActiveRecordingRecord = null;
    public AutoValue_Recorder_RecordingRecord mPendingRecordingRecord = null;
    public long mLastGeneratedRecordingId = 0;
    public AutoValue_Recorder_RecordingRecord mInProgressRecording = null;
    public boolean mInProgressRecordingStopping = false;
    public AutoValue_SurfaceRequest_TransformationInfo mInProgressTransformationInfo = null;
    public AutoValue_SurfaceRequest_TransformationInfo mSourceTransformationInfo = null;
    public AutoValue_VideoValidatedEncoderProfilesProxy mResolvedEncoderProfiles = null;
    public final ArrayList mEncodingFutures = new ArrayList();
    public Integer mAudioTrackIndex = null;
    public Integer mVideoTrackIndex = null;
    public Surface mLatestSurface = null;
    public Surface mActiveSurface = null;
    public HuffmanTreeGroup mMuxer = null;
    public AudioSource mAudioSource = null;
    public EncoderImpl mVideoEncoder = null;
    public StreamSharing$$ExternalSyntheticLambda1 mVideoOutputConfig = null;
    public EncoderImpl mAudioEncoder = null;
    public StreamSharing$$ExternalSyntheticLambda1 mAudioOutputConfig = null;
    public int mAudioState = 1;
    public Uri mOutputUri = Uri.EMPTY;
    public long mRecordingBytes = 0;
    public long mRecordingAudioBytes = 0;
    public long mRecordingDurationUs = 0;
    public long mFirstRecordingVideoDataTimeUs = Long.MAX_VALUE;
    public long mFirstRecordingAudioDataTimeUs = Long.MAX_VALUE;
    public long mPreviousRecordingVideoDataTimeUs = Long.MAX_VALUE;
    public long mPreviousRecordingAudioDataTimeUs = Long.MAX_VALUE;
    public long mFileSizeLimitInBytes = 0;
    public long mDurationLimitUs = 0;
    public int mRecordingStopError = 1;
    public Throwable mRecordingStopErrorCause = null;
    public EncodedData mPendingFirstVideoData = null;
    public final zzv mPendingAudioRingBuffer = new zzv(60, (ZslControlImpl$$ExternalSyntheticLambda1) null);
    public Throwable mAudioErrorCause = null;
    public boolean mIsAudioSourceSilenced = false;
    public int mSourceState = 3;
    public ScheduledFuture mSourceNonStreamingTimeout = null;
    public boolean mNeedsResetBeforeNextStart = false;
    public AutoValue_VideoEncoderConfig mVideoEncoderConfig = null;
    public VideoEncoderSession mVideoEncoderSessionToRelease = null;
    public double mAudioAmplitude = 0.0d;
    public SetupVideoTask mSetupVideoTask = null;
    public PreviewView.AnonymousClass1 mOutputStorage = null;
    public long mAvailableBytesAboveRequired = Long.MAX_VALUE;
    public boolean mHasGlProcessing = false;

    /* renamed from: androidx.camera.video.Recorder$2, reason: invalid class name */
    public final class AnonymousClass2 implements FutureCallback {
        public final /* synthetic */ AudioSource val$audioSource;

        public /* synthetic */ AnonymousClass2(AudioSource audioSource) {
            this.val$audioSource = audioSource;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th) {
            StringUtilsKt.d("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.val$audioSource.hashCode())));
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onSuccess(Object obj) {
            StringUtilsKt.d("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.val$audioSource.hashCode())));
        }
    }

    /* renamed from: androidx.camera.video.Recorder$7, reason: invalid class name */
    public final class AnonymousClass7 implements Observable.Observer {
        public final /* synthetic */ int $r8$classId;
        public final Object this$0;

        public /* synthetic */ AnonymousClass7(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public final void onError(Throwable th) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    zzm zzmVar = ((Recorder) obj).mIsRecording;
                    zzmVar.getClass();
                    zzmVar.updateStateInternal(new AutoValue_StateObservable_ErrorWrapper(th));
                    break;
                case 1:
                    th.getClass();
                    CameraPresenceProvider cameraPresenceProvider = (CameraPresenceProvider) obj;
                    if (cameraPresenceProvider.isMonitoring.get()) {
                        StringUtilsKt.e("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", th);
                        PipeCameraPresenceSource pipeCameraPresenceSource = cameraPresenceProvider.sourcePresenceObservable;
                        if (pipeCameraPresenceSource != null) {
                            pipeCameraPresenceSource.fetchData();
                            break;
                        }
                    }
                    break;
                case 2:
                    StringUtilsKt.e("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
                    break;
                default:
                    StringUtilsKt.w("VideoCapture", "Receive onError from StreamState observer", th);
                    break;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [androidx.media3.common.util.StuckPlayerDetector] */
        /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
        @Override // androidx.camera.core.impl.Observable.Observer
        public final void onNewData(Object obj) {
            CameraPresenceProvider cameraPresenceProvider;
            ?? r2;
            CameraRepository cameraRepository;
            FlagSet.Builder builder;
            ?? r5;
            switch (this.$r8$classId) {
                case 0:
                    ((Recorder) this.this$0).mIsRecording.updateStateInternal((Boolean) obj);
                    return;
                case 1:
                    List list = (List) obj;
                    if (!((CameraPresenceProvider) this.this$0).isMonitoring.get() || (r2 = (cameraPresenceProvider = (CameraPresenceProvider) this.this$0).cameraFactory) == 0 || (cameraRepository = cameraPresenceProvider.cameraRepository) == null || (builder = cameraPresenceProvider.cameraValidator) == null) {
                        return;
                    }
                    if (list != null) {
                        List list2 = list;
                        r5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            r5.add(((CameraIdentifier) it.next()).getInternalId());
                        }
                    } else {
                        r5 = EmptyList.INSTANCE;
                    }
                    try {
                        List list3 = ((CameraPresenceProvider) this.this$0).currentFilteredIds;
                        r5.getClass();
                        Iterable list4 = ((AtomicBoolean) r2.stuckSuppressedDetector).get() ? EmptyList.INSTANCE : CollectionsKt.toList(r2.calculateAvailableCameraIds(r5));
                        list4.getClass();
                        Iterable<String> iterable = list4;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                        for (String str : iterable) {
                            str.getClass();
                            arrayList.add(Aliases.create(str, null, null));
                        }
                        Set minus = SetsKt___SetsKt.minus(CollectionsKt.toSet(list3), (Iterable) CollectionsKt.toSet(arrayList));
                        if (!minus.isEmpty() && builder.isChangeInvalid(cameraRepository.getCameras(), minus)) {
                            StringUtilsKt.w("CameraPresencePrvdr", "Camera removal update invalid. Aborting.");
                            return;
                        }
                    } catch (Exception e) {
                        StringUtilsKt.w("CameraPresencePrvdr", "Failed to interrogate camera factory. Falling back to full update.", e);
                    }
                    try {
                        r2.onCameraIdsUpdated(r5);
                        Set availableCameraIds = r2.getAvailableCameraIds();
                        availableCameraIds.getClass();
                        Set<String> set = availableCameraIds;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
                        for (String str2 : set) {
                            str2.getClass();
                            arrayList2.add(Aliases.create(str2, null, null));
                        }
                        if (arrayList2.equals(((CameraPresenceProvider) this.this$0).currentFilteredIds)) {
                            return;
                        }
                        CameraPresenceProvider cameraPresenceProvider2 = (CameraPresenceProvider) this.this$0;
                        List list5 = CollectionsKt.toList(cameraPresenceProvider2.currentFilteredIds);
                        if (arrayList2.equals(list5)) {
                            return;
                        }
                        synchronized (cameraPresenceProvider2.retryLock) {
                            if (cameraPresenceProvider2.retryScanFuture != null) {
                                StringUtilsKt.d("CameraPresencePrvdr", "Camera list updated. Cancelling any pending retries.");
                                ScheduledFuture scheduledFuture = cameraPresenceProvider2.retryScanFuture;
                                scheduledFuture.getClass();
                                scheduledFuture.cancel(false);
                                cameraPresenceProvider2.retryScanFuture = null;
                            }
                        }
                        List list6 = list5;
                        Set set2 = CollectionsKt.toSet(list6);
                        Set set3 = CollectionsKt.toSet(arrayList2);
                        Set minus2 = SetsKt___SetsKt.minus(set3, (Iterable) set2);
                        Set minus3 = SetsKt___SetsKt.minus(set2, (Iterable) set3);
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((CameraIdentifier) it2.next()).getInternalId());
                        }
                        try {
                            Iterator it3 = minus3.iterator();
                            while (it3.hasNext()) {
                                cameraPresenceProvider2.removeCameraStateObserver(((CameraIdentifier) it3.next()).getInternalId());
                            }
                            CameraRepository cameraRepository2 = cameraPresenceProvider2.cameraRepository;
                            if (cameraRepository2 != null) {
                                StringUtilsKt.d("CameraPresencePrvdr", "Updating CameraRepository...");
                                cameraRepository2.onCamerasUpdated(arrayList4);
                                arrayList3.add(cameraRepository2);
                                StringUtilsKt.d("CameraPresencePrvdr", "CameraRepository updated successfully.");
                            }
                            if (!cameraPresenceProvider2.dependentInternalListeners.isEmpty()) {
                                StringUtilsKt.d("CameraPresencePrvdr", "Updating " + cameraPresenceProvider2.dependentInternalListeners.size() + " dependent listeners...");
                                Iterator it4 = cameraPresenceProvider2.dependentInternalListeners.iterator();
                                while (it4.hasNext()) {
                                    InternalCameraPresenceListener internalCameraPresenceListener = (InternalCameraPresenceListener) it4.next();
                                    internalCameraPresenceListener.onCamerasUpdated(arrayList4);
                                    arrayList3.add(internalCameraPresenceListener);
                                }
                            }
                            cameraPresenceProvider2.currentFilteredIds = arrayList2;
                            Iterator it5 = minus2.iterator();
                            while (it5.hasNext()) {
                                cameraPresenceProvider2.conditionallySetupCameraStateObserver(((CameraIdentifier) it5.next()).getInternalId());
                            }
                            cameraPresenceProvider2.notifyPublicListeners(minus2, minus3);
                            return;
                        } catch (Exception e2) {
                            StringUtilsKt.e("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e2);
                            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                            Iterator it6 = list6.iterator();
                            while (it6.hasNext()) {
                                arrayList5.add(((CameraIdentifier) it6.next()).getInternalId());
                            }
                            Iterator it7 = new ReversedList(arrayList3).iterator();
                            while (true) {
                                ReversedList$listIterator$1 reversedList$listIterator$1 = (ReversedList$listIterator$1) it7;
                                if (!((ListIterator) reversedList$listIterator$1.delegateIterator).hasPrevious()) {
                                    Iterator it8 = minus3.iterator();
                                    while (it8.hasNext()) {
                                        cameraPresenceProvider2.conditionallySetupCameraStateObserver(((CameraIdentifier) it8.next()).getInternalId());
                                    }
                                    Iterator it9 = minus2.iterator();
                                    while (it9.hasNext()) {
                                        cameraPresenceProvider2.removeCameraStateObserver(((CameraIdentifier) it9.next()).getInternalId());
                                    }
                                    return;
                                }
                                InternalCameraPresenceListener internalCameraPresenceListener2 = (InternalCameraPresenceListener) ((ListIterator) reversedList$listIterator$1.delegateIterator).previous();
                                try {
                                    internalCameraPresenceListener2.onCamerasUpdated(arrayList5);
                                } catch (Exception e3) {
                                    StringUtilsKt.e("CameraPresencePrvdr", "Failed to rollback listener: " + internalCameraPresenceListener2, e3);
                                }
                            }
                        }
                    } catch (Exception e4) {
                        StringUtilsKt.w("CameraPresencePrvdr", "CameraFactory failed to update. The camera list may be stale until the next update.", e4);
                        return;
                    }
                    break;
                case 2:
                    ((Consumer) this.this$0).accept(obj);
                    return;
                default:
                    AutoValue_StreamInfo autoValue_StreamInfo = (AutoValue_StreamInfo) obj;
                    VideoCapture videoCapture = (VideoCapture) this.this$0;
                    if (autoValue_StreamInfo == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("StreamInfo can't be null");
                        return;
                    }
                    int i = autoValue_StreamInfo.id;
                    if (videoCapture.mSourceState == 3) {
                        return;
                    }
                    StringUtilsKt.d("VideoCapture", "Stream info update: old: " + videoCapture.mStreamInfo + " new: " + autoValue_StreamInfo);
                    AutoValue_StreamInfo autoValue_StreamInfo2 = videoCapture.mStreamInfo;
                    videoCapture.mStreamInfo = autoValue_StreamInfo;
                    AutoValue_StreamSpec autoValue_StreamSpec = videoCapture.mAttachedStreamSpec;
                    autoValue_StreamSpec.getClass();
                    int i2 = autoValue_StreamInfo2.id;
                    Set set4 = AutoValue_StreamInfo.NON_SURFACE_STREAM_ID;
                    if ((!set4.contains(Integer.valueOf(i2)) && !set4.contains(Integer.valueOf(i)) && i2 != i) || (videoCapture.mHasCompensatingTransformation && autoValue_StreamInfo2.inProgressTransformationInfo != null && autoValue_StreamInfo.inProgressTransformationInfo == null)) {
                        videoCapture.resetPipeline();
                        return;
                    }
                    int i3 = autoValue_StreamInfo2.id;
                    if ((i3 != -1 && i == -1) || (i3 == -1 && i != -1)) {
                        videoCapture.applyStreamInfoAndStreamSpecToSessionConfigBuilder(videoCapture.mSessionConfigBuilder, autoValue_StreamInfo, autoValue_StreamSpec);
                        Object[] objArr = {videoCapture.mSessionConfigBuilder.build()};
                        ArrayList arrayList6 = new ArrayList(1);
                        Object obj2 = objArr[0];
                        Objects.requireNonNull(obj2);
                        arrayList6.add(obj2);
                        videoCapture.updateSessionConfig(Collections.unmodifiableList(arrayList6));
                        videoCapture.notifyReset();
                        return;
                    }
                    if (autoValue_StreamInfo2.streamState != autoValue_StreamInfo.streamState) {
                        videoCapture.applyStreamInfoAndStreamSpecToSessionConfigBuilder(videoCapture.mSessionConfigBuilder, autoValue_StreamInfo, autoValue_StreamSpec);
                        Object[] objArr2 = {videoCapture.mSessionConfigBuilder.build()};
                        ArrayList arrayList7 = new ArrayList(1);
                        Object obj3 = objArr2[0];
                        Objects.requireNonNull(obj3);
                        arrayList7.add(obj3);
                        videoCapture.updateSessionConfig(Collections.unmodifiableList(arrayList7));
                        Iterator it10 = videoCapture.mStateChangeCallbacks.iterator();
                        while (it10.hasNext()) {
                            ((UseCase.StateChangeCallback) it10.next()).onUseCaseUpdated(videoCapture);
                        }
                        return;
                    }
                    return;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State CONFIGURING;
        public static final State ERROR;
        public static final State IDLING;
        public static final State PAUSED;
        public static final State PENDING_PAUSED;
        public static final State PENDING_RECORDING;
        public static final State RECORDING;
        public static final State RESETTING;
        public static final State STOPPING;

        static {
            State state = new State("CONFIGURING", 0);
            CONFIGURING = state;
            State state2 = new State("PENDING_RECORDING", 1);
            PENDING_RECORDING = state2;
            State state3 = new State("PENDING_PAUSED", 2);
            PENDING_PAUSED = state3;
            State state4 = new State("IDLING", 3);
            IDLING = state4;
            State state5 = new State("RECORDING", 4);
            RECORDING = state5;
            State state6 = new State("PAUSED", 5);
            PAUSED = state6;
            State state7 = new State("STOPPING", 6);
            STOPPING = state7;
            State state8 = new State("RESETTING", 7);
            RESETTING = state8;
            State state9 = new State("ERROR", 8);
            ERROR = state9;
            $VALUES = new State[]{state, state2, state3, state4, state5, state6, state7, state8, state9};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    static {
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality = AutoValue_Quality_ConstantQuality.FHD;
        List asList = Arrays.asList(autoValue_Quality_ConstantQuality, AutoValue_Quality_ConstantQuality.HD, AutoValue_Quality_ConstantQuality.SD);
        AutoValue_FallbackStrategy_RuleStrategy autoValue_FallbackStrategy_RuleStrategy = AutoValue_FallbackStrategy_RuleStrategy.NONE;
        QualitySelector fromOrderedList = QualitySelector.fromOrderedList(asList, new AutoValue_FallbackStrategy_RuleStrategy(autoValue_Quality_ConstantQuality, 1));
        DEFAULT_QUALITY_SELECTOR = fromOrderedList;
        VideoSpec videoSpec = new VideoSpec(fromOrderedList, 0, -1, "video/*");
        VIDEO_SPEC_DEFAULT = videoSpec;
        MEDIA_SPEC_DEFAULT = new MediaSpec(videoSpec, AudioSpec.DEFAULT, -1);
        PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE = new RuntimeException("The video frame producer became inactive before any data was received.");
        DEFAULT_ENCODER_FACTORY = new ZslControlImpl$$ExternalSyntheticLambda1(24);
        DEFAULT_VIDEO_ENCODER_INFO_FINDER = VideoEncoderInfoImpl.FINDER;
        DEFAULT_MUXER_FACTORY = new ZslControlImpl$$ExternalSyntheticLambda1(25);
        OUTPUT_STORAGE_FACTORY_DEFAULT = new ZslControlImpl$$ExternalSyntheticLambda1(26);
        AUDIO_EXECUTOR = new SequentialExecutor(zzabp.ioExecutor());
        sRetrySetupVideoMaxCount = 3;
        sRetrySetupVideoDelayMs = 1000L;
    }

    public Recorder(Executor executor, MediaSpec mediaSpec, ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda1, ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda12, ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda13, ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda14) {
        this.mUserProvidedExecutor = executor;
        executor = executor == null ? zzabp.ioExecutor() : executor;
        this.mExecutor = executor;
        SequentialExecutor sequentialExecutor = new SequentialExecutor(executor);
        this.mSequentialExecutor = sequentialExecutor;
        HuffmanTreeGroup builder = mediaSpec.toBuilder();
        if (mediaSpec.videoSpec.aspectRatio == -1) {
            VideoSpec videoSpec = (VideoSpec) builder.trees;
            videoSpec.getClass();
            VideoSpec videoSpec2 = VideoSpec.DEFAULT;
            QualitySelector qualitySelector = videoSpec.qualitySelector;
            qualitySelector.getClass();
            int i = videoSpec.bitrate;
            String str = videoSpec.mimeType;
            str.getClass();
            builder.trees = new VideoSpec(qualitySelector, i, VIDEO_SPEC_DEFAULT.aspectRatio, str);
        }
        this.mMediaSpec = new zzm(new MediaSpec((VideoSpec) builder.trees, (AudioSpec) builder.codes, builder.alphabetSize));
        this.mStreamInfo = new zzm(new AutoValue_StreamInfo(this.mStreamId, internalStateToStreamState(this.mState), null));
        this.mIsRecording = new zzm(Boolean.FALSE);
        this.mVideoEncoderFactory = zslControlImpl$$ExternalSyntheticLambda1;
        this.mAudioEncoderFactory = zslControlImpl$$ExternalSyntheticLambda12;
        this.mMuxerFactory = zslControlImpl$$ExternalSyntheticLambda13;
        this.mOutputStorageFactory = zslControlImpl$$ExternalSyntheticLambda14;
        this.mVideoEncoderSession = new VideoEncoderSession(zslControlImpl$$ExternalSyntheticLambda1, sequentialExecutor, executor);
        this.mRequiredFreeStorageBytes = 52428800L;
        StringUtilsKt.d("Recorder", "mRequiredFreeStorageBytes = " + StorageUtil.formatSize(52428800L));
    }

    public static EncoderProfilesResolver getEncoderProfilesResolverInternal(int i, CameraInfo cameraInfo) {
        EncoderProfilesResolver encoderProfilesResolver;
        VideoEncoderInfoImpl$$ExternalSyntheticLambda0 videoEncoderInfoImpl$$ExternalSyntheticLambda0 = DEFAULT_VIDEO_ENCODER_INFO_FINDER;
        LruCache lruCache = EncoderProfilesResolverFactory.cache;
        cameraInfo.getClass();
        videoEncoderInfoImpl$$ExternalSyntheticLambda0.getClass();
        Lazy lazy = LazyKt.lazy(new Http2Connection$$ExternalSyntheticLambda3(cameraInfo, i, videoEncoderInfoImpl$$ExternalSyntheticLambda0, 1));
        if (cameraInfo instanceof AdapterCameraInfo) {
            AdapterCameraInfo adapterCameraInfo = (AdapterCameraInfo) cameraInfo;
            CameraInfoInternal cameraInfoInternal = adapterCameraInfo.mCameraInfoInternal;
            if (!cameraInfoInternal.isExternalCamera() && cameraInfoInternal.getLensFacing() != -1) {
                String cameraId = adapterCameraInfo.mCameraInfoInternal.getCameraId();
                cameraId.getClass();
                CameraConfig cameraConfig = adapterCameraInfo.mCameraConfig;
                cameraConfig.getClass();
                EncoderProfilesResolverFactory.CacheKey cacheKey = new EncoderProfilesResolverFactory.CacheKey(cameraId, cameraConfig, i, videoEncoderInfoImpl$$ExternalSyntheticLambda0);
                LruCache lruCache2 = EncoderProfilesResolverFactory.cache;
                synchronized (lruCache2) {
                    encoderProfilesResolver = (EncoderProfilesResolver) lruCache2.get(cacheKey);
                    if (encoderProfilesResolver == null) {
                        encoderProfilesResolver = (EncoderProfilesResolver) lazy.getValue();
                        lruCache2.put(cacheKey, encoderProfilesResolver);
                    }
                }
                return encoderProfilesResolver;
            }
        }
        return (EncoderProfilesResolver) lazy.getValue();
    }

    public static Object getObservableData(zzm zzmVar) {
        try {
            return zzmVar.fetchData().get();
        } catch (InterruptedException | ExecutionException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }

    public static int internalStateToStreamState(State state) {
        return (state == State.RECORDING || state == State.STOPPING) ? 1 : 2;
    }

    public static boolean isSameRecording(Recording recording, AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord) {
        return autoValue_Recorder_RecordingRecord != null && recording.mRecordingId == autoValue_Recorder_RecordingRecord.getRecordingId;
    }

    public static void notifyEncoderSourceStopped(EncoderImpl encoderImpl) {
        if (encoderImpl != null) {
            StringUtilsKt.d(encoderImpl.mTag, "signalSourceStopped");
            encoderImpl.mEncoderExecutor.execute(new EncoderImpl$$ExternalSyntheticLambda2(encoderImpl, 5));
        }
    }

    public final void configureInternal(SurfaceRequest surfaceRequest, Timebase timebase, boolean z) {
        if (surfaceRequest.mSurfaceFuture.delegate.isDone()) {
            StringUtilsKt.w("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1 = new StreamSharing$$ExternalSyntheticLambda1(this, 13);
        SequentialExecutor sequentialExecutor = this.mSequentialExecutor;
        surfaceRequest.setTransformationInfoListener(sequentialExecutor, streamSharing$$ExternalSyntheticLambda1);
        Size size = surfaceRequest.mResolution;
        DynamicRange dynamicRange = surfaceRequest.mDynamicRange;
        EncoderProfilesResolver encoderProfilesResolver = getEncoderProfilesResolver(surfaceRequest.mSessionType, surfaceRequest.mCamera.getCameraInfo());
        encoderProfilesResolver.getClass();
        size.getClass();
        dynamicRange.getClass();
        CapabilitiesByQuality capabilities = encoderProfilesResolver.getCapabilities(dynamicRange);
        this.mResolvedEncoderProfiles = capabilities != null ? capabilities.findNearestHigherSupportedEncoderProfilesFor(size) : null;
        StringUtilsKt.d("Recorder", "mResolvedEncoderProfiles = " + this.mResolvedEncoderProfiles);
        SetupVideoTask setupVideoTask = this.mSetupVideoTask;
        if (setupVideoTask != null && !setupVideoTask.mIsFailedRetryCanceled) {
            setupVideoTask.mIsFailedRetryCanceled = true;
            ScheduledFuture scheduledFuture = (ScheduledFuture) setupVideoTask.mRetryFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                setupVideoTask.mRetryFuture = null;
            }
        }
        SetupVideoTask setupVideoTask2 = new SetupVideoTask(this, surfaceRequest, timebase, this.mHasGlProcessing, z ? sRetrySetupVideoMaxCount : 0);
        this.mSetupVideoTask = setupVideoTask2;
        safeToCloseVideoEncoder().addListener(new AFd1wSDK$$ExternalSyntheticLambda2(11, setupVideoTask2, surfaceRequest, timebase), sequentialExecutor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    public final void finalizeInProgressRecording(Throwable th, int i) {
        VideoRecordEvent.Finalize finalize;
        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord;
        RuntimeException runtimeException;
        int i2;
        if (this.mInProgressRecording == null) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Attempted to finalize in-progress recording, but no recording is in progress.");
            return;
        }
        boolean z = true;
        HuffmanTreeGroup huffmanTreeGroup = 0;
        huffmanTreeGroup = 0;
        r7 = null;
        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord2 = null;
        try {
            if (this.mMuxer != null) {
                try {
                    StringUtilsKt.d("Recorder", "Muxer.stop()");
                    this.mMuxer.stop();
                } catch (MuxerException e) {
                    StringUtilsKt.w("Recorder", "Muxer failed to stop with error: " + e, e);
                    if (i == 0) {
                        i = hasInsufficientStorageOrException(e) ? 3 : (this.mRecordingBytes <= 0 || (isAudioEnabled() && this.mRecordingAudioBytes <= 0)) ? 8 : 1;
                        th = e;
                    }
                }
            } else if (i == 0) {
                i = 8;
            }
            this.mInProgressRecording.finalizeRecording(this.mOutputUri);
            FileOutputOptions fileOutputOptions = this.mInProgressRecording.getOutputOptions;
            AutoValue_RecordingStats inProgressRecordingStats = getInProgressRecordingStats();
            TransactorKt.checkNotNull(this.mOutputUri, "OutputUri cannot be null.");
            AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord3 = this.mInProgressRecording;
            boolean z2 = false;
            if (i == 0) {
                finalize = new VideoRecordEvent.Finalize(fileOutputOptions, inProgressRecordingStats, 0, null);
            } else {
                TransactorKt.checkArgument("An error type is required.", i != 0);
                finalize = new VideoRecordEvent.Finalize(fileOutputOptions, inProgressRecordingStats, i, th);
            }
            autoValue_Recorder_RecordingRecord3.updateVideoRecordEvent(finalize, true);
            AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord4 = this.mInProgressRecording;
            this.mInProgressRecording = null;
            this.mInProgressRecordingStopping = false;
            this.mAudioTrackIndex = null;
            this.mVideoTrackIndex = null;
            this.mEncodingFutures.clear();
            this.mOutputUri = Uri.EMPTY;
            this.mRecordingBytes = 0L;
            this.mRecordingAudioBytes = 0L;
            this.mRecordingDurationUs = 0L;
            this.mFirstRecordingVideoDataTimeUs = Long.MAX_VALUE;
            this.mFirstRecordingAudioDataTimeUs = Long.MAX_VALUE;
            this.mPreviousRecordingVideoDataTimeUs = Long.MAX_VALUE;
            this.mPreviousRecordingAudioDataTimeUs = Long.MAX_VALUE;
            this.mRecordingStopError = 1;
            this.mRecordingStopErrorCause = null;
            this.mAudioErrorCause = null;
            this.mAudioAmplitude = 0.0d;
            this.mOutputStorage = null;
            this.mAvailableBytesAboveRequired = Long.MAX_VALUE;
            zzv zzvVar = this.mPendingAudioRingBuffer;
            while (!zzvVar.isEmpty()) {
                ((EncodedData) zzvVar.dequeue()).close();
            }
            setInProgressTransformationInfo(null);
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.mAudioState);
            int i3 = 4;
            if (ordinal == 2 || ordinal == 3) {
                setAudioState(2);
                AudioSource audioSource = this.mAudioSource;
                audioSource.mExecutor.execute(new Preview$$ExternalSyntheticLambda0(audioSource, 22));
            } else if (ordinal == 4 || ordinal == 5) {
                setAudioState(1);
            }
            synchronized (this.mLock) {
                try {
                    AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord5 = this.mActiveRecordingRecord;
                    if (autoValue_Recorder_RecordingRecord5 != autoValue_Recorder_RecordingRecord4) {
                        throw new AssertionError("Active recording did not match finalized recording on finalize.");
                    }
                    zzm zzmVar = autoValue_Recorder_RecordingRecord5.mRecordingState;
                    synchronized (zzmVar.zzb) {
                        try {
                            Iterator it = new HashSet(((HashMap) zzmVar.zze).keySet()).iterator();
                            while (it.hasNext()) {
                                zzmVar.removeObserverLocked((Observable.Observer) it.next());
                            }
                        } finally {
                        }
                    }
                    this.mActiveRecordingRecord = null;
                    switch (this.mState.ordinal()) {
                        case 1:
                            z = false;
                        case 2:
                            if (this.mSourceState == 3) {
                                autoValue_Recorder_RecordingRecord = this.mPendingRecordingRecord;
                                this.mPendingRecordingRecord = null;
                                setState(State.CONFIGURING);
                                runtimeException = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
                                z2 = z;
                                z = false;
                                break;
                            } else {
                                if (this.mVideoEncoder != null) {
                                    runtimeException = null;
                                    i2 = 0;
                                    huffmanTreeGroup = makePendingRecordingActiveLocked(this.mState);
                                    z2 = z;
                                    autoValue_Recorder_RecordingRecord = null;
                                } else {
                                    autoValue_Recorder_RecordingRecord = null;
                                    runtimeException = null;
                                    i2 = 0;
                                    z2 = z;
                                }
                                z = i2;
                                i3 = i2;
                                autoValue_Recorder_RecordingRecord2 = huffmanTreeGroup;
                            }
                        case 3:
                            throw new AssertionError("Unexpected state on finalize of recording: " + this.mState);
                        case 4:
                        case 5:
                        case 6:
                            setState(State.IDLING);
                            autoValue_Recorder_RecordingRecord = null;
                            runtimeException = null;
                            i2 = 0;
                            z = i2;
                            i3 = i2;
                            autoValue_Recorder_RecordingRecord2 = huffmanTreeGroup;
                            break;
                        case 7:
                            autoValue_Recorder_RecordingRecord = null;
                            runtimeException = null;
                            i3 = 0;
                            break;
                        default:
                            autoValue_Recorder_RecordingRecord = null;
                            runtimeException = null;
                            i2 = 0;
                            z = i2;
                            i3 = i2;
                            autoValue_Recorder_RecordingRecord2 = huffmanTreeGroup;
                            break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z) {
                reset();
            } else if (autoValue_Recorder_RecordingRecord2 != null) {
                startRecording(autoValue_Recorder_RecordingRecord2, z2);
            } else if (autoValue_Recorder_RecordingRecord != null) {
                finalizePendingRecording(autoValue_Recorder_RecordingRecord, i3, runtimeException);
            }
        } finally {
            StringUtilsKt.d("Recorder", "Muxer.release()");
            this.mMuxer.release();
            this.mMuxer = null;
        }
    }

    public final void finalizePendingRecording(AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord, int i, Throwable th) {
        Uri uri = Uri.EMPTY;
        autoValue_Recorder_RecordingRecord.finalizeRecording(uri);
        FileOutputOptions fileOutputOptions = autoValue_Recorder_RecordingRecord.getOutputOptions;
        AutoValue_RecordingStats of = AutoValue_RecordingStats.of(0L, 0L, new AutoValue_AudioStats(1, 0.0d, 0L, this.mAudioErrorCause));
        TransactorKt.checkNotNull(uri, "OutputUri cannot be null.");
        TransactorKt.checkArgument("An error type is required.", i != 0);
        autoValue_Recorder_RecordingRecord.updateVideoRecordEvent(new VideoRecordEvent.Finalize(fileOutputOptions, of, i, th), true);
    }

    @Override // androidx.camera.video.VideoOutput
    public final EncoderProfilesResolver getEncoderProfilesResolver(int i, CameraInfo cameraInfo) {
        return getEncoderProfilesResolverInternal(i == 1 ? 2 : 1, cameraInfo);
    }

    public final AutoValue_RecordingStats getInProgressRecordingStats() {
        int i;
        long nanos = TimeUnit.MICROSECONDS.toNanos(this.mRecordingDurationUs);
        long j = this.mRecordingBytes;
        int i2 = this.mAudioState;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i2);
        int i3 = 1;
        if (ordinal != 0 && ordinal != 1) {
            int i4 = 2;
            if (ordinal != 2) {
                i3 = 5;
                i = 3;
                if (ordinal != 3) {
                    i4 = 4;
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            a$$ExternalSyntheticBUOutline0.m$1((Object) "Invalid internal audio state: ".concat(Recorder$$ExternalSyntheticOutline1.stringValueOf$1(i2)));
                            return null;
                        }
                    }
                    return AutoValue_RecordingStats.of(nanos, j, new AutoValue_AudioStats(i, this.mAudioAmplitude, this.mRecordingAudioBytes, this.mAudioErrorCause));
                }
                AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord = this.mInProgressRecording;
                if (autoValue_Recorder_RecordingRecord == null || !autoValue_Recorder_RecordingRecord.mMuted.get()) {
                    if (!this.mIsAudioSourceSilenced) {
                        i3 = 0;
                    }
                }
                i = i4;
                return AutoValue_RecordingStats.of(nanos, j, new AutoValue_AudioStats(i, this.mAudioAmplitude, this.mRecordingAudioBytes, this.mAudioErrorCause));
            }
        }
        i = i3;
        return AutoValue_RecordingStats.of(nanos, j, new AutoValue_AudioStats(i, this.mAudioAmplitude, this.mRecordingAudioBytes, this.mAudioErrorCause));
    }

    @Override // androidx.camera.video.VideoOutput
    public final VideoCapabilities getMediaCapabilities(int i, CameraInfo cameraInfo) {
        int i2 = i == 1 ? 2 : 1;
        String str = ((MediaSpec) getObservableData(this.mMediaSpec)).videoSpec.mimeType;
        CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) cameraInfo;
        return "video/*".equals(str) ? new RecorderVideoCapabilities(getEncoderProfilesResolverInternal(i2, cameraInfo), cameraInfoInternal) : new MimeMatchedVideoCapabilities(str, cameraInfoInternal, DEFAULT_VIDEO_ENCODER_INFO_FINDER);
    }

    @Override // androidx.camera.video.VideoOutput
    public final Observable getMediaSpec() {
        return this.mMediaSpec;
    }

    @Override // androidx.camera.video.VideoOutput
    public final Observable getStreamInfo() {
        return this.mStreamInfo;
    }

    public final boolean hasInsufficientStorageOrException(Exception exc) {
        if (StorageUtil.isStorageFullException(exc)) {
            return true;
        }
        PreviewView.AnonymousClass1 anonymousClass1 = this.mOutputStorage;
        anonymousClass1.getClass();
        return anonymousClass1.getAvailableBytes() < this.mRequiredFreeStorageBytes;
    }

    public final boolean isAudioEnabled() {
        return this.mAudioState == 4;
    }

    @Override // androidx.camera.video.VideoOutput
    public final boolean isQualitySelectorDefault() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).videoSpec.qualitySelector == DEFAULT_QUALITY_SELECTOR;
    }

    @Override // androidx.camera.video.VideoOutput
    public final Observable isSourceStreamRequired() {
        return this.mIsRecording;
    }

    public final AutoValue_Recorder_RecordingRecord makePendingRecordingActiveLocked(State state) {
        boolean z;
        int i = 0;
        if (state == State.PENDING_PAUSED) {
            z = true;
        } else {
            if (state != State.PENDING_RECORDING) {
                a$$ExternalSyntheticBUOutline0.m$1((Object) "makePendingRecordingActiveLocked() can only be called from a pending state.");
                return null;
            }
            z = false;
        }
        if (this.mActiveRecordingRecord != null) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Cannot make pending recording active because another recording is already active.");
            return null;
        }
        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord = this.mPendingRecordingRecord;
        if (autoValue_Recorder_RecordingRecord == null) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Pending recording should exist when in a PENDING state.");
            return null;
        }
        this.mActiveRecordingRecord = autoValue_Recorder_RecordingRecord;
        autoValue_Recorder_RecordingRecord.mRecordingState.addObserver(zzabp.directExecutor(), new AnonymousClass7(this, i));
        this.mPendingRecordingRecord = null;
        if (z) {
            setState(State.PAUSED);
            return autoValue_Recorder_RecordingRecord;
        }
        setState(State.RECORDING);
        return autoValue_Recorder_RecordingRecord;
    }

    public final void onInProgressRecordingInternalError(AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord, int i, Exception exc) {
        boolean z;
        if (autoValue_Recorder_RecordingRecord != this.mInProgressRecording) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Internal error occurred on recording that is not the current in-progress recording.");
            return;
        }
        synchronized (this.mLock) {
            try {
                z = false;
                switch (this.mState.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.mState);
                    case 4:
                    case 5:
                        setState(State.STOPPING);
                        z = true;
                    case 1:
                    case 2:
                    case 6:
                    case 7:
                        if (autoValue_Recorder_RecordingRecord != this.mActiveRecordingRecord) {
                            throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                        }
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            stopInternal(autoValue_Recorder_RecordingRecord, -1L, i, exc);
        }
    }

    @Override // androidx.camera.video.VideoOutput
    public final void onSourceStateChanged(int i) {
        this.mSequentialExecutor.execute(new Recorder$$ExternalSyntheticLambda14(this, i, 0));
    }

    @Override // androidx.camera.video.VideoOutput
    public final void onSurfaceRequested(SurfaceRequest surfaceRequest, Timebase timebase, boolean z) {
        synchronized (this.mLock) {
            try {
                StringUtilsKt.d("Recorder", "Surface is requested in state: " + this.mState + ", Current surface: " + this.mStreamId);
                if (this.mState == State.ERROR) {
                    setState(State.CONFIGURING);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mSequentialExecutor.execute(new Recorder$$ExternalSyntheticLambda16(this, surfaceRequest, timebase, z));
    }

    public final void releaseCurrentAudioSource() {
        AudioSource audioSource = this.mAudioSource;
        if (audioSource == null) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Cannot release null audio source.");
            return;
        }
        this.mAudioSource = null;
        StringUtilsKt.d("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            audioSource.mExecutor.execute(new Recorder$$ExternalSyntheticLambda15(11, audioSource, callbackToFutureAdapter$Completer));
            callbackToFutureAdapter$Completer.tag = "AudioSource-release";
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
        }
        Futures.addCallback(callbackToFutureAdapter$SafeFuture, new AnonymousClass2(audioSource), zzabp.directExecutor());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void requestReset(boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this.mLock) {
            try {
                z2 = true;
                z3 = false;
                switch (this.mState.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        updateNonPendingState(State.RESETTING);
                        break;
                    case 4:
                    case 5:
                        TransactorKt.checkState("In-progress recording shouldn't be null when in state " + this.mState, this.mInProgressRecording != null);
                        if (this.mActiveRecordingRecord != this.mInProgressRecording) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        setState(State.RESETTING);
                        z3 = true;
                        z2 = false;
                        break;
                    case 6:
                        setState(State.RESETTING);
                        z2 = false;
                        break;
                    case 7:
                    default:
                        z2 = false;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            if (z3) {
                stopInternal(this.mInProgressRecording, -1L, 4, null);
            }
        } else if (z) {
            resetVideo();
        } else {
            reset();
        }
    }

    public final void reset() {
        if (this.mAudioEncoder != null) {
            StringUtilsKt.d("Recorder", "Releasing audio encoder.");
            EncoderImpl encoderImpl = this.mAudioEncoder;
            encoderImpl.mEncoderExecutor.execute(new EncoderImpl$$ExternalSyntheticLambda2(encoderImpl, 0));
            this.mAudioEncoder = null;
            this.mAudioOutputConfig = null;
        }
        if (this.mAudioSource != null) {
            releaseCurrentAudioSource();
        }
        setAudioState(1);
        resetVideo();
    }

    public final void resetVideo() {
        if (this.mVideoEncoder != null) {
            StringUtilsKt.d("Recorder", "Releasing video encoder.");
            VideoEncoderSession videoEncoderSession = this.mVideoEncoderSessionToRelease;
            if (videoEncoderSession != null) {
                TransactorKt.checkState(null, ((EncoderImpl) videoEncoderSession.mVideoEncoder) == this.mVideoEncoder);
                StringUtilsKt.d("Recorder", "Releasing video encoder: " + this.mVideoEncoder);
                this.mVideoEncoderSessionToRelease.terminateNow();
                this.mVideoEncoderSessionToRelease = null;
                this.mVideoEncoder = null;
                this.mVideoOutputConfig = null;
                setLatestSurface(null);
            } else {
                safeToCloseVideoEncoder();
            }
        }
        synchronized (this.mLock) {
            try {
                switch (this.mState.ordinal()) {
                    case 1:
                    case 2:
                        updateNonPendingState(State.CONFIGURING);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        setState(State.CONFIGURING);
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mNeedsResetBeforeNextStart = false;
        SurfaceRequest surfaceRequest = this.mLatestSurfaceRequest;
        if (surfaceRequest == null || surfaceRequest.mSurfaceFuture.delegate.isDone()) {
            return;
        }
        configureInternal(this.mLatestSurfaceRequest, this.mVideoSourceTimebase, false);
    }

    public final void restoreNonPendingState() {
        if (PENDING_STATES.contains(this.mState)) {
            setState(this.mNonPendingState);
        } else {
            OptionalProvider$$ExternalSyntheticLambda0.m$2(this.mState, "Cannot restore non-pending state when in state ");
        }
    }

    public final ListenableFuture safeToCloseVideoEncoder() {
        StringUtilsKt.d("Recorder", "Try to safely release video encoder: " + this.mVideoEncoder);
        VideoEncoderSession videoEncoderSession = this.mVideoEncoderSession;
        videoEncoderSession.closeInternal();
        return Futures.nonCancellationPropagating((ListenableFuture) videoEncoderSession.mReleasedFuture);
    }

    public final void setAudioState(int i) {
        StringUtilsKt.d("Recorder", "Transitioning audio state: " + Recorder$$ExternalSyntheticOutline1.stringValueOf$1(this.mAudioState) + " --> " + Recorder$$ExternalSyntheticOutline1.stringValueOf$1(i));
        this.mAudioState = i;
    }

    public final void setInProgressTransformationInfo(AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo) {
        StringUtilsKt.d("Recorder", "Update stream transformation info: " + autoValue_SurfaceRequest_TransformationInfo);
        this.mInProgressTransformationInfo = autoValue_SurfaceRequest_TransformationInfo;
        synchronized (this.mLock) {
            this.mStreamInfo.updateStateInternal(new AutoValue_StreamInfo(this.mStreamId, internalStateToStreamState(this.mState), autoValue_SurfaceRequest_TransformationInfo));
        }
    }

    public final void setLatestSurface(Surface surface) {
        int hashCode;
        if (this.mLatestSurface == surface) {
            return;
        }
        this.mLatestSurface = surface;
        synchronized (this.mLock) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                hashCode = 0;
            }
            setStreamId(hashCode);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setState(State state) {
        int i;
        if (this.mState == state) {
            throw new AssertionError("Attempted to transition to state " + state + ", but Recorder is already in state " + state);
        }
        StringUtilsKt.d("Recorder", "Transitioning Recorder internal state: " + this.mState + " --> " + state);
        Set set = PENDING_STATES;
        if (set.contains(state)) {
            if (!set.contains(this.mState)) {
                boolean contains = VALID_NON_PENDING_STATES_WHILE_PENDING.contains(this.mState);
                State state2 = this.mState;
                if (!contains) {
                    ZslControlImpl$$ExternalSyntheticLambda1.m(state2, "Invalid state transition. Should not be transitioning to a PENDING state from state ");
                    return;
                }
                this.mNonPendingState = state2;
                i = internalStateToStreamState(state2);
                this.mState = state;
                if (i == 0) {
                    i = internalStateToStreamState(state);
                }
                this.mStreamInfo.updateStateInternal(new AutoValue_StreamInfo(this.mStreamId, i, this.mInProgressTransformationInfo));
            }
        } else if (this.mNonPendingState != null) {
            this.mNonPendingState = null;
        }
        i = 0;
        this.mState = state;
        if (i == 0) {
        }
        this.mStreamInfo.updateStateInternal(new AutoValue_StreamInfo(this.mStreamId, i, this.mInProgressTransformationInfo));
    }

    public final void setStreamId(int i) {
        if (this.mStreamId == i) {
            return;
        }
        StringUtilsKt.d("Recorder", "Transitioning streamId: " + this.mStreamId + " --> " + i);
        this.mStreamId = i;
        this.mStreamInfo.updateStateInternal(new AutoValue_StreamInfo(i, internalStateToStreamState(this.mState), this.mInProgressTransformationInfo));
    }

    public final void setupAndStartMuxer(AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord) {
        if (this.mMuxer != null) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Unable to set up muxer when one already exists.");
            return;
        }
        boolean isAudioEnabled = isAudioEnabled();
        zzv zzvVar = this.mPendingAudioRingBuffer;
        if (isAudioEnabled && zzvVar.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Audio is enabled but no audio sample is ready. Cannot start muxer.");
            return;
        }
        EncodedData encodedData = this.mPendingFirstVideoData;
        if (encodedData == null) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Muxer cannot be started without an encoded video frame.");
            return;
        }
        try {
            this.mPendingFirstVideoData = null;
            long presentationTimeUs = encodedData.getPresentationTimeUs();
            ArrayList arrayList = new ArrayList();
            while (!zzvVar.isEmpty()) {
                EncodedData encodedData2 = (EncodedData) zzvVar.dequeue();
                if (encodedData2.getPresentationTimeUs() >= presentationTimeUs) {
                    arrayList.add(encodedData2);
                }
            }
            long size = encodedData.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                size += ((EncodedData) it.next()).size();
            }
            long j = this.mFileSizeLimitInBytes;
            int i = 2;
            if (j != 0 && size > j) {
                StringUtilsKt.d("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
                onInProgressRecordingInternalError(autoValue_Recorder_RecordingRecord, 2, null);
                encodedData.close();
                return;
            }
            int i2 = 3;
            try {
                int i3 = ((MediaSpec) getObservableData(this.mMediaSpec)).outputFormat;
                if (i3 == -1) {
                    AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = this.mResolvedEncoderProfiles;
                    int i4 = MEDIA_SPEC_DEFAULT.outputFormat == 1 ? 1 : 0;
                    if (autoValue_VideoValidatedEncoderProfilesProxy != null) {
                        int i5 = autoValue_VideoValidatedEncoderProfilesProxy.recommendedFileFormat;
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 9) {
                                }
                                i = 1;
                            }
                            i = 0;
                        }
                    }
                    i = i4;
                } else {
                    if (i3 == 1) {
                        i = 1;
                    }
                    i = 0;
                }
                HuffmanTreeGroup performOneTimeMuxerCreation = autoValue_Recorder_RecordingRecord.performOneTimeMuxerCreation(i, new Recorder$$ExternalSyntheticLambda17(this, r6));
                AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo = this.mSourceTransformationInfo;
                if (autoValue_SurfaceRequest_TransformationInfo != null) {
                    setInProgressTransformationInfo(autoValue_SurfaceRequest_TransformationInfo);
                    try {
                        performOneTimeMuxerCreation.setOrientationDegrees(autoValue_SurfaceRequest_TransformationInfo.getRotationDegrees);
                    } catch (IllegalArgumentException e) {
                        performOneTimeMuxerCreation.release();
                        onInProgressRecordingInternalError(autoValue_Recorder_RecordingRecord, 5, e);
                        encodedData.close();
                        return;
                    }
                }
                AutoValue_FileOutputOptions_FileOutputOptionsInternal autoValue_FileOutputOptions_FileOutputOptionsInternal = autoValue_Recorder_RecordingRecord.getOutputOptions.mOutputOptionsInternal;
                AutoValue_VideoEncoderConfig autoValue_VideoEncoderConfig = this.mVideoEncoderConfig;
                autoValue_VideoEncoderConfig.getClass();
                int i6 = autoValue_VideoEncoderConfig.captureFrameRate;
                if ((i6 > autoValue_VideoEncoderConfig.encodeFrameRate ? 1 : 0) != 0) {
                    try {
                        performOneTimeMuxerCreation.setCaptureFps(i6);
                    } catch (IllegalArgumentException e2) {
                        performOneTimeMuxerCreation.release();
                        onInProgressRecordingInternalError(autoValue_Recorder_RecordingRecord, 5, e2);
                        encodedData.close();
                        return;
                    }
                }
                try {
                    StringUtilsKt.d("Recorder", "Muxer.addTrack() for video " + ((MediaFormat) this.mVideoOutputConfig.f$0));
                    this.mVideoTrackIndex = Integer.valueOf(performOneTimeMuxerCreation.addTrack((MediaFormat) this.mVideoOutputConfig.f$0));
                    if (isAudioEnabled()) {
                        StringUtilsKt.d("Recorder", "Muxer.addTrack() for audio " + ((MediaFormat) this.mAudioOutputConfig.f$0));
                        this.mAudioTrackIndex = Integer.valueOf(performOneTimeMuxerCreation.addTrack((MediaFormat) this.mAudioOutputConfig.f$0));
                    }
                    StringUtilsKt.d("Recorder", "Muxer.start()");
                    performOneTimeMuxerCreation.start();
                    this.mMuxer = performOneTimeMuxerCreation;
                    writeVideoData(encodedData, autoValue_Recorder_RecordingRecord);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        writeAudioData((EncodedData) it2.next(), autoValue_Recorder_RecordingRecord);
                    }
                    encodedData.close();
                } catch (MuxerException e3) {
                    StringUtilsKt.w("Recorder", "Failed to setup and start muxer", e3);
                    performOneTimeMuxerCreation.release();
                    if (!hasInsufficientStorageOrException(e3)) {
                        i2 = 1;
                    }
                    onInProgressRecordingInternalError(autoValue_Recorder_RecordingRecord, i2, e3);
                    encodedData.close();
                }
            } catch (IOException e4) {
                if (!hasInsufficientStorageOrException(e4)) {
                    i2 = 5;
                }
                onInProgressRecordingInternalError(autoValue_Recorder_RecordingRecord, i2, e4);
                encodedData.close();
            }
        } catch (Throwable th) {
            try {
                encodedData.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void setupAudio(AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord) {
        AutoValue_EncoderProfilesProxy_AudioProfileProxy autoValue_EncoderProfilesProxy_AudioProfileProxy;
        AutoValue_EncoderProfilesProxy_AudioProfileProxy autoValue_EncoderProfilesProxy_AudioProfileProxy2;
        MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
        AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = this.mResolvedEncoderProfiles;
        mediaSpec.getClass();
        AudioSpec audioSpec = mediaSpec.audioSpec;
        int i = mediaSpec.outputFormat;
        String str = i == 1 ? "audio/vorbis" : "audio/mp4a-latm";
        int i2 = (i != 1 ? "audio/mp4a-latm" : "audio/vorbis").equals("audio/mp4a-latm") ? 2 : -1;
        if (autoValue_VideoValidatedEncoderProfilesProxy == null || (autoValue_EncoderProfilesProxy_AudioProfileProxy2 = autoValue_VideoValidatedEncoderProfilesProxy.defaultAudioProfile) == null) {
            autoValue_EncoderProfilesProxy_AudioProfileProxy = null;
        } else {
            String str2 = autoValue_EncoderProfilesProxy_AudioProfileProxy2.mediaType;
            str2.getClass();
            int i3 = autoValue_EncoderProfilesProxy_AudioProfileProxy2.profile;
            if (str2.equals("audio/none")) {
                StringUtilsKt.d("AudioConfigUtil", Recorder$$ExternalSyntheticOutline1.m("EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: ", i2, str, "(profile: ", ")]"));
            } else {
                if (i == -1) {
                    StringUtilsKt.d("AudioConfigUtil", Recorder$$ExternalSyntheticOutline1.m("MediaSpec contains OUTPUT_FORMAT_UNSPECIFIED. Using EncoderProfiles to derive AUDIO settings [mime type: ", i3, str2, "(profile: ", ")]"));
                    str = str2;
                    i2 = i3;
                } else if (str.equals(str2) && i2 == i3) {
                    StringUtilsKt.d("AudioConfigUtil", Recorder$$ExternalSyntheticOutline1.m("MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: ", i2, str2, "(profile: ", ")]"));
                    str = str2;
                } else {
                    StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: ", i3, str2, "(profile: ", "), chosen mime type: ");
                    m.append(str);
                    m.append("(profile: ");
                    m.append(i2);
                    m.append(")]");
                    StringUtilsKt.d("AudioConfigUtil", m.toString());
                }
                autoValue_EncoderProfilesProxy_AudioProfileProxy = autoValue_EncoderProfilesProxy_AudioProfileProxy2;
            }
            autoValue_EncoderProfilesProxy_AudioProfileProxy2 = null;
            autoValue_EncoderProfilesProxy_AudioProfileProxy = autoValue_EncoderProfilesProxy_AudioProfileProxy2;
        }
        String str3 = str;
        AutoValue_VideoEncoderConfig autoValue_VideoEncoderConfig = this.mVideoEncoderConfig;
        autoValue_VideoEncoderConfig.getClass();
        int i4 = autoValue_VideoEncoderConfig.encodeFrameRate;
        int i5 = autoValue_VideoEncoderConfig.captureFrameRate;
        Rational rational = i5 > i4 ? new Rational(i5, i4) : null;
        audioSpec.getClass();
        Object obj = (autoValue_EncoderProfilesProxy_AudioProfileProxy != null ? new AnonymousClass3(audioSpec, autoValue_EncoderProfilesProxy_AudioProfileProxy, rational) : new AnonymousClass1(audioSpec, rational)).get();
        obj.getClass();
        AutoValue_AudioSettings autoValue_AudioSettings = (AutoValue_AudioSettings) obj;
        if (this.mAudioSource != null) {
            releaseCurrentAudioSource();
        }
        if (!autoValue_Recorder_RecordingRecord.hasAudioEnabled) {
            ZslControlImpl$$ExternalSyntheticLambda1.m(autoValue_Recorder_RecordingRecord, "Recording does not have audio enabled. Unable to create audio source for recording ");
            return;
        }
        Recorder$RecordingRecord$1 recorder$RecordingRecord$1 = (Recorder$RecordingRecord$1) autoValue_Recorder_RecordingRecord.mAudioSourceSupplier.getAndSet(null);
        if (recorder$RecordingRecord$1 == null) {
            ZslControlImpl$$ExternalSyntheticLambda1.m(autoValue_Recorder_RecordingRecord, "One-time audio source creation has already occurred for recording ");
            return;
        }
        AudioSource audioSource = new AudioSource(autoValue_AudioSettings, AUDIO_EXECUTOR, recorder$RecordingRecord$1.val$attributionContext);
        this.mAudioSource = audioSource;
        StringUtilsKt.d("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
        Object obj2 = (autoValue_EncoderProfilesProxy_AudioProfileProxy != null ? new TraceParser(str3, i2, audioSpec, autoValue_AudioSettings, autoValue_EncoderProfilesProxy_AudioProfileProxy) : new zzv(str3, i2, audioSpec, autoValue_AudioSettings)).get();
        obj2.getClass();
        SurfaceRequest surfaceRequest = this.mLatestSurfaceRequest;
        surfaceRequest.getClass();
        int i6 = surfaceRequest.mSessionType;
        this.mAudioEncoderFactory.getClass();
        EncoderImpl encoderImpl = new EncoderImpl(this.mExecutor, (AutoValue_AudioEncoderConfig) obj2, i6);
        this.mAudioEncoder = encoderImpl;
        Encoder$EncoderInput encoder$EncoderInput = encoderImpl.mEncoderInput;
        if (!(encoder$EncoderInput instanceof EncoderImpl.ByteBufferInput)) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "The EncoderInput of audio isn't a ByteBufferInput.");
        } else {
            AudioSource audioSource2 = this.mAudioSource;
            audioSource2.mExecutor.execute(new Recorder$$ExternalSyntheticLambda15(10, audioSource2, (EncoderImpl.ByteBufferInput) encoder$EncoderInput));
        }
    }

    public final void startRecording(AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord, boolean z) {
        if (this.mInProgressRecording != null) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Attempted to start a new recording while another was in progress.");
            return;
        }
        this.mInProgressRecording = autoValue_Recorder_RecordingRecord;
        FileOutputOptions fileOutputOptions = autoValue_Recorder_RecordingRecord.getOutputOptions;
        boolean z2 = autoValue_Recorder_RecordingRecord.hasAudioEnabled;
        this.mOutputStorageFactory.getClass();
        fileOutputOptions.getClass();
        PreviewView.AnonymousClass1 anonymousClass1 = new PreviewView.AnonymousClass1();
        anonymousClass1.this$0 = fileOutputOptions;
        this.mOutputStorage = anonymousClass1;
        long availableBytes = anonymousClass1.getAvailableBytes();
        StringUtilsKt.d("Recorder", "availableBytes = " + StorageUtil.formatSize(availableBytes));
        long j = this.mRequiredFreeStorageBytes;
        int i = 0;
        if (availableBytes < j) {
            finalizeInProgressRecording(new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(availableBytes), Long.valueOf(j))), 3);
        } else {
            this.mAvailableBytesAboveRequired = availableBytes - j;
            long j2 = fileOutputOptions.mOutputOptionsInternal.fileSizeLimit;
            if (j2 > 0) {
                this.mFileSizeLimitInBytes = Math.round(j2 * 0.95d);
                StringUtilsKt.d("Recorder", "File size limit in bytes: " + this.mFileSizeLimitInBytes);
            } else {
                this.mFileSizeLimitInBytes = 0L;
            }
            long j3 = fileOutputOptions.mOutputOptionsInternal.durationLimitMillis;
            if (j3 > 0) {
                this.mDurationLimitUs = TimeUnit.MILLISECONDS.toMicros(j3);
                StringUtilsKt.d("Recorder", "Duration limit in microseconds: " + this.mDurationLimitUs);
            } else {
                this.mDurationLimitUs = 0L;
            }
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.mAudioState);
            if (ordinal != 0) {
                if (ordinal == 1) {
                    setAudioState(z2 ? 4 : 3);
                } else if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
                    a$$ExternalSyntheticBUOutline0.m$1((Object) "Incorrectly invoke startInternal in audio state ".concat(Recorder$$ExternalSyntheticOutline1.stringValueOf$1(this.mAudioState)));
                    return;
                }
            } else if (z2) {
                ((MediaSpec) getObservableData(this.mMediaSpec)).audioSpec.getClass();
                try {
                    this.mInProgressRecording.getClass();
                    setupAudio(autoValue_Recorder_RecordingRecord);
                    setAudioState(4);
                } catch (AudioSourceAccessException | InvalidConfigException e) {
                    StringUtilsKt.e("Recorder", "Unable to create audio resource with error: ", e);
                    setAudioState(e instanceof InvalidConfigException ? 5 : 6);
                    this.mAudioErrorCause = e;
                }
            }
            updateEncoderCallbacks(autoValue_Recorder_RecordingRecord, false);
            if (isAudioEnabled()) {
                AudioSource audioSource = this.mAudioSource;
                audioSource.mExecutor.execute(new AudioSource$$ExternalSyntheticLambda1(audioSource, autoValue_Recorder_RecordingRecord.mMuted.get(), i));
                this.mAudioEncoder.start();
            }
            this.mVideoEncoder.start();
            AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord2 = this.mInProgressRecording;
            autoValue_Recorder_RecordingRecord2.updateVideoRecordEvent(new VideoRecordEvent.Start(autoValue_Recorder_RecordingRecord2.getOutputOptions, getInProgressRecordingStats()), true);
        }
        if (z && this.mInProgressRecording == autoValue_Recorder_RecordingRecord && !this.mInProgressRecordingStopping) {
            if (isAudioEnabled()) {
                this.mAudioEncoder.pause();
            }
            this.mVideoEncoder.pause();
            AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord3 = this.mInProgressRecording;
            autoValue_Recorder_RecordingRecord3.updateVideoRecordEvent(new VideoRecordEvent.Pause(autoValue_Recorder_RecordingRecord3.getOutputOptions, getInProgressRecordingStats()), true);
        }
    }

    public final void stopInternal(AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord, final long j, int i, Throwable th) {
        if (this.mInProgressRecording != autoValue_Recorder_RecordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        this.mInProgressRecordingStopping = true;
        this.mRecordingStopError = i;
        this.mRecordingStopErrorCause = th;
        if (isAudioEnabled()) {
            while (true) {
                zzv zzvVar = this.mPendingAudioRingBuffer;
                if (zzvVar.isEmpty()) {
                    break;
                } else {
                    ((EncodedData) zzvVar.dequeue()).close();
                }
            }
            final EncoderImpl encoderImpl = this.mAudioEncoder;
            final long uptimeUs = encoderImpl.mTimeProvider.uptimeUs();
            encoderImpl.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda8
                /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    EncoderImpl encoderImpl2 = EncoderImpl.this;
                    String str = encoderImpl2.mTag;
                    switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(encoderImpl2.mState)) {
                        case 0:
                        case 3:
                        case 7:
                            break;
                        case 1:
                        case 2:
                            int i2 = encoderImpl2.mState;
                            encoderImpl2.setState(4);
                            Long l = (Long) encoderImpl2.mStartStopTimeRangeUs.getLower();
                            long longValue = l.longValue();
                            if (longValue == Long.MAX_VALUE) {
                                a$$ExternalSyntheticBUOutline0.m$1((Object) "There should be a \"start\" before \"stop\"");
                                break;
                            } else {
                                long j2 = j;
                                if (j2 != -1) {
                                    if (j2 < longValue) {
                                        StringUtilsKt.w(str, "The expected stop time is less than the start time. Use current time as stop time.");
                                    }
                                    if (j2 >= longValue) {
                                        a$$ExternalSyntheticBUOutline0.m$1((Object) "The start time should be before the stop time.");
                                        break;
                                    } else {
                                        encoderImpl2.mStartStopTimeRangeUs = Range.create(l, Long.valueOf(j2));
                                        StringUtilsKt.d(str, "Stop on ".concat(DebugUtils.readableUs(j2)));
                                        if (i2 == 3 && encoderImpl2.mLastDataStopTimestamp != null) {
                                            encoderImpl2.signalCodecStop();
                                            break;
                                        } else {
                                            encoderImpl2.mPendingCodecStop = true;
                                            encoderImpl2.mStopTimeoutFuture = zzabp.mainThreadExecutor().schedule(new EncoderImpl$$ExternalSyntheticLambda2(encoderImpl2, 2), 1000L, TimeUnit.MILLISECONDS);
                                            break;
                                        }
                                    }
                                }
                                j2 = uptimeUs;
                                if (j2 >= longValue) {
                                }
                            }
                            break;
                        case 4:
                        case 5:
                            encoderImpl2.setState(1);
                            break;
                        case 6:
                        case 8:
                            a$$ExternalSyntheticBUOutline0.m$1("Encoder is released");
                            break;
                        default:
                            a$$ExternalSyntheticBUOutline0.m$1("Unknown state: ".concat(Recorder$$ExternalSyntheticOutline1.stringValueOf$6(encoderImpl2.mState)));
                            break;
                    }
                }
            });
        }
        EncodedData encodedData = this.mPendingFirstVideoData;
        if (encodedData != null) {
            encodedData.close();
            this.mPendingFirstVideoData = null;
        }
        if (this.mSourceState != 2) {
            int i2 = 0;
            this.mSourceNonStreamingTimeout = zzabp.mainThreadExecutor().schedule(new Recorder$$ExternalSyntheticLambda15(i2, this.mSequentialExecutor, new Recorder$$ExternalSyntheticLambda13(i2)), 1000L, TimeUnit.MILLISECONDS);
        } else {
            notifyEncoderSourceStopped(this.mVideoEncoder);
        }
        final EncoderImpl encoderImpl2 = this.mVideoEncoder;
        final long uptimeUs2 = encoderImpl2.mTimeProvider.uptimeUs();
        encoderImpl2.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda8
            /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                EncoderImpl encoderImpl22 = EncoderImpl.this;
                String str = encoderImpl22.mTag;
                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(encoderImpl22.mState)) {
                    case 0:
                    case 3:
                    case 7:
                        break;
                    case 1:
                    case 2:
                        int i22 = encoderImpl22.mState;
                        encoderImpl22.setState(4);
                        Long l = (Long) encoderImpl22.mStartStopTimeRangeUs.getLower();
                        long longValue = l.longValue();
                        if (longValue == Long.MAX_VALUE) {
                            a$$ExternalSyntheticBUOutline0.m$1((Object) "There should be a \"start\" before \"stop\"");
                            break;
                        } else {
                            long j2 = j;
                            if (j2 != -1) {
                                if (j2 < longValue) {
                                    StringUtilsKt.w(str, "The expected stop time is less than the start time. Use current time as stop time.");
                                }
                                if (j2 >= longValue) {
                                    a$$ExternalSyntheticBUOutline0.m$1((Object) "The start time should be before the stop time.");
                                    break;
                                } else {
                                    encoderImpl22.mStartStopTimeRangeUs = Range.create(l, Long.valueOf(j2));
                                    StringUtilsKt.d(str, "Stop on ".concat(DebugUtils.readableUs(j2)));
                                    if (i22 == 3 && encoderImpl22.mLastDataStopTimestamp != null) {
                                        encoderImpl22.signalCodecStop();
                                        break;
                                    } else {
                                        encoderImpl22.mPendingCodecStop = true;
                                        encoderImpl22.mStopTimeoutFuture = zzabp.mainThreadExecutor().schedule(new EncoderImpl$$ExternalSyntheticLambda2(encoderImpl22, 2), 1000L, TimeUnit.MILLISECONDS);
                                        break;
                                    }
                                }
                            }
                            j2 = uptimeUs2;
                            if (j2 >= longValue) {
                            }
                        }
                        break;
                    case 4:
                    case 5:
                        encoderImpl22.setState(1);
                        break;
                    case 6:
                    case 8:
                        a$$ExternalSyntheticBUOutline0.m$1("Encoder is released");
                        break;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("Unknown state: ".concat(Recorder$$ExternalSyntheticOutline1.stringValueOf$6(encoderImpl22.mState)));
                        break;
                }
            }
        });
    }

    public final void updateEncoderCallbacks(final AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord, boolean z) {
        ArrayList arrayList = this.mEncodingFutures;
        final int i = 1;
        if (!arrayList.isEmpty()) {
            ListFuture listFuture = new ListFuture(new ArrayList(arrayList), true, zzabp.directExecutor());
            if (!listFuture.isDone()) {
                listFuture.cancel(true);
            }
            arrayList.clear();
        }
        final int i2 = 0;
        arrayList.add(DBUtil.getFuture(new CallbackToFutureAdapter$Resolver(this) { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda10
            public final /* synthetic */ Recorder f$0;

            {
                this.f$0 = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
            public final Object attachCompleter(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
                switch (i2) {
                    case 0:
                        Recorder recorder = this.f$0;
                        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord2 = autoValue_Recorder_RecordingRecord;
                        EncoderImpl encoderImpl = recorder.mVideoEncoder;
                        Recorder.AnonymousClass3 anonymousClass3 = new Recorder.AnonymousClass3(recorder, callbackToFutureAdapter$Completer, autoValue_Recorder_RecordingRecord2, false, 0);
                        SequentialExecutor sequentialExecutor = recorder.mSequentialExecutor;
                        synchronized (encoderImpl.mLock) {
                            encoderImpl.mEncoderCallback = anonymousClass3;
                            encoderImpl.mEncoderCallbackExecutor = sequentialExecutor;
                        }
                        return "videoEncodingFuture";
                    default:
                        Recorder recorder2 = this.f$0;
                        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord3 = autoValue_Recorder_RecordingRecord;
                        int i3 = 0;
                        Recorder$$ExternalSyntheticLambda12 recorder$$ExternalSyntheticLambda12 = new Recorder$$ExternalSyntheticLambda12(i3, recorder2, callbackToFutureAdapter$Completer);
                        AudioSource audioSource = recorder2.mAudioSource;
                        SequentialExecutor sequentialExecutor2 = recorder2.mSequentialExecutor;
                        audioSource.mExecutor.execute(new AFd1wSDK$$ExternalSyntheticLambda2(13, audioSource, sequentialExecutor2, new Recorder.AnonymousClass4(i3, recorder2, recorder$$ExternalSyntheticLambda12)));
                        EncoderImpl encoderImpl2 = recorder2.mAudioEncoder;
                        n nVar = new n(recorder2, callbackToFutureAdapter$Completer, recorder$$ExternalSyntheticLambda12, autoValue_Recorder_RecordingRecord3, false);
                        synchronized (encoderImpl2.mLock) {
                            encoderImpl2.mEncoderCallback = nVar;
                            encoderImpl2.mEncoderCallbackExecutor = sequentialExecutor2;
                        }
                        return "audioEncodingFuture";
                }
            }
        }));
        if (isAudioEnabled() && !z) {
            arrayList.add(DBUtil.getFuture(new CallbackToFutureAdapter$Resolver(this) { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda10
                public final /* synthetic */ Recorder f$0;

                {
                    this.f$0 = this;
                }

                @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
                public final Object attachCompleter(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
                    switch (i) {
                        case 0:
                            Recorder recorder = this.f$0;
                            AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord2 = autoValue_Recorder_RecordingRecord;
                            EncoderImpl encoderImpl = recorder.mVideoEncoder;
                            Recorder.AnonymousClass3 anonymousClass3 = new Recorder.AnonymousClass3(recorder, callbackToFutureAdapter$Completer, autoValue_Recorder_RecordingRecord2, false, 0);
                            SequentialExecutor sequentialExecutor = recorder.mSequentialExecutor;
                            synchronized (encoderImpl.mLock) {
                                encoderImpl.mEncoderCallback = anonymousClass3;
                                encoderImpl.mEncoderCallbackExecutor = sequentialExecutor;
                            }
                            return "videoEncodingFuture";
                        default:
                            Recorder recorder2 = this.f$0;
                            AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord3 = autoValue_Recorder_RecordingRecord;
                            int i3 = 0;
                            Recorder$$ExternalSyntheticLambda12 recorder$$ExternalSyntheticLambda12 = new Recorder$$ExternalSyntheticLambda12(i3, recorder2, callbackToFutureAdapter$Completer);
                            AudioSource audioSource = recorder2.mAudioSource;
                            SequentialExecutor sequentialExecutor2 = recorder2.mSequentialExecutor;
                            audioSource.mExecutor.execute(new AFd1wSDK$$ExternalSyntheticLambda2(13, audioSource, sequentialExecutor2, new Recorder.AnonymousClass4(i3, recorder2, recorder$$ExternalSyntheticLambda12)));
                            EncoderImpl encoderImpl2 = recorder2.mAudioEncoder;
                            n nVar = new n(recorder2, callbackToFutureAdapter$Completer, recorder$$ExternalSyntheticLambda12, autoValue_Recorder_RecordingRecord3, false);
                            synchronized (encoderImpl2.mLock) {
                                encoderImpl2.mEncoderCallback = nVar;
                                encoderImpl2.mEncoderCallbackExecutor = sequentialExecutor2;
                            }
                            return "audioEncodingFuture";
                    }
                }
            }));
        }
        Futures.addCallback(new ListFuture(new ArrayList(arrayList), true, zzabp.directExecutor()), new AnonymousClass6(this, i2), zzabp.directExecutor());
    }

    public final void updateInProgressStatusEvent(boolean z) {
        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord = this.mInProgressRecording;
        if (autoValue_Recorder_RecordingRecord != null) {
            autoValue_Recorder_RecordingRecord.updateVideoRecordEvent(new VideoRecordEvent.Status(autoValue_Recorder_RecordingRecord.getOutputOptions, getInProgressRecordingStats()), z);
        }
    }

    public final void updateNonPendingState(State state) {
        if (!PENDING_STATES.contains(this.mState)) {
            OptionalProvider$$ExternalSyntheticLambda0.m$2(this.mState, "Can only updated non-pending state from a pending state, but state is ");
            return;
        }
        if (!VALID_NON_PENDING_STATES_WHILE_PENDING.contains(state)) {
            ZslControlImpl$$ExternalSyntheticLambda1.m(state, "Invalid state transition. State is not a valid non-pending state while in a pending state: ");
        } else if (this.mNonPendingState != state) {
            this.mNonPendingState = state;
            this.mStreamInfo.updateStateInternal(new AutoValue_StreamInfo(this.mStreamId, internalStateToStreamState(state), this.mInProgressTransformationInfo));
        }
    }

    public final void writeAudioData(EncodedData encodedData, AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord) {
        if (this.mAudioEncoder == null) {
            StringUtilsKt.d("Recorder", "Ignore the audio data since the audio encoder has been released.");
            return;
        }
        if (encodedData.getPresentationTimeUs() < this.mFirstRecordingVideoDataTimeUs) {
            StringUtilsKt.d("Recorder", "Skipping audio data: timestamp precedes first video frame.");
            return;
        }
        long size = encodedData.size() + this.mRecordingBytes;
        long j = this.mFileSizeLimitInBytes;
        if (j != 0 && size > j) {
            StringUtilsKt.d("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
            onInProgressRecordingInternalError(autoValue_Recorder_RecordingRecord, 2, null);
            return;
        }
        long presentationTimeUs = encodedData.getPresentationTimeUs();
        long j2 = presentationTimeUs - this.mFirstRecordingVideoDataTimeUs;
        if (this.mFirstRecordingAudioDataTimeUs == Long.MAX_VALUE) {
            this.mFirstRecordingAudioDataTimeUs = presentationTimeUs;
            StringUtilsKt.d("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(presentationTimeUs), DebugUtils.readableUs(this.mFirstRecordingAudioDataTimeUs)));
        } else if (this.mDurationLimitUs != 0) {
            TransactorKt.checkState("There should be a previous data for adjusting the duration.", this.mPreviousRecordingAudioDataTimeUs != Long.MAX_VALUE);
            long j3 = (presentationTimeUs - this.mPreviousRecordingAudioDataTimeUs) + j2;
            if (j3 > this.mDurationLimitUs) {
                StringUtilsKt.d("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(j3), Long.valueOf(this.mDurationLimitUs)));
                onInProgressRecordingInternalError(autoValue_Recorder_RecordingRecord, 9, null);
                return;
            }
        }
        encodedData.getBufferInfo().presentationTimeUs = j2;
        try {
            this.mMuxer.writeSampleData(this.mAudioTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
            this.mRecordingBytes = size;
            this.mRecordingAudioBytes = encodedData.size() + this.mRecordingAudioBytes;
            this.mPreviousRecordingAudioDataTimeUs = presentationTimeUs;
        } catch (MuxerException e) {
            StringUtilsKt.w("Recorder", "writeAudioData failed", e);
            onInProgressRecordingInternalError(autoValue_Recorder_RecordingRecord, hasInsufficientStorageOrException(e) ? 3 : 1, e);
        }
    }

    public final void writeVideoData(EncodedData encodedData, AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord) {
        if (this.mVideoEncoder == null) {
            StringUtilsKt.d("Recorder", "Ignore the video data since the video encoder has been released.");
            return;
        }
        if (this.mVideoTrackIndex == null) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Video data comes before the track is added to Muxer.");
            return;
        }
        long size = encodedData.size() + this.mRecordingBytes;
        long j = this.mFileSizeLimitInBytes;
        long j2 = 0;
        if (j != 0 && size > j) {
            StringUtilsKt.d("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
            onInProgressRecordingInternalError(autoValue_Recorder_RecordingRecord, 2, null);
            return;
        }
        long presentationTimeUs = encodedData.getPresentationTimeUs();
        long j3 = this.mFirstRecordingVideoDataTimeUs;
        if (j3 == Long.MAX_VALUE) {
            this.mFirstRecordingVideoDataTimeUs = presentationTimeUs;
            StringUtilsKt.d("Recorder", String.format("First video time: %d (%s)", Long.valueOf(presentationTimeUs), DebugUtils.readableUs(this.mFirstRecordingVideoDataTimeUs)));
        } else {
            long j4 = presentationTimeUs - j3;
            if (this.mDurationLimitUs != 0) {
                TransactorKt.checkState("There should be a previous data for adjusting the duration.", this.mPreviousRecordingVideoDataTimeUs != Long.MAX_VALUE);
                long j5 = (presentationTimeUs - this.mPreviousRecordingVideoDataTimeUs) + j4;
                if (j5 > this.mDurationLimitUs) {
                    StringUtilsKt.d("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(j5), Long.valueOf(this.mDurationLimitUs)));
                    onInProgressRecordingInternalError(autoValue_Recorder_RecordingRecord, 9, null);
                    return;
                }
            }
            j2 = j4;
        }
        encodedData.getBufferInfo().presentationTimeUs = j2;
        try {
            this.mMuxer.writeSampleData(this.mVideoTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
            this.mRecordingBytes = size;
            this.mRecordingDurationUs = j2;
            this.mPreviousRecordingVideoDataTimeUs = presentationTimeUs;
            updateInProgressStatusEvent(encodedData.isKeyFrame());
            if (size > this.mAvailableBytesAboveRequired) {
                PreviewView.AnonymousClass1 anonymousClass1 = this.mOutputStorage;
                anonymousClass1.getClass();
                long availableBytes = anonymousClass1.getAvailableBytes();
                StringUtilsKt.d("Recorder", "availableBytes = " + StorageUtil.formatSize(availableBytes));
                long j6 = this.mRequiredFreeStorageBytes;
                if (availableBytes < j6) {
                    onInProgressRecordingInternalError(autoValue_Recorder_RecordingRecord, 3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(availableBytes), Long.valueOf(j6))));
                } else {
                    this.mAvailableBytesAboveRequired = availableBytes - j6;
                }
            }
        } catch (MuxerException e) {
            StringUtilsKt.w("Recorder", "writeVideoData failed", e);
            onInProgressRecordingInternalError(autoValue_Recorder_RecordingRecord, hasInsufficientStorageOrException(e) ? 3 : 1, e);
        }
    }

    /* renamed from: androidx.camera.video.Recorder$6, reason: invalid class name */
    public final class AnonymousClass6 implements MenuPresenter.Callback, MenuBuilder.Callback, ImageProxy.PlaneProxy, FutureCallback, SnapLayoutInfoProvider, DifferentialMotionFlingTarget, AccessibilityViewCommand, WebViewProviderFactory {
        public final /* synthetic */ int $r8$classId;
        public Object this$0;

        public AnonymousClass6(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 15:
                    this.this$0 = new MutableVector(0, new LazyLayoutBeyondBoundsInfo$Interval[16]);
                    break;
                case 23:
                    this.this$0 = new FlagSet.Builder(0);
                    break;
                default:
                    this.this$0 = (ExtraCroppingQuirk) DeviceQuirks.getAll().get(ExtraCroppingQuirk.class);
                    break;
            }
        }

        public static AnonymousClass6 obtain(boolean z, int i, int i2, int i3, int i4) {
            return new AnonymousClass6(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z), 20);
        }

        public static AutoValue_Packet processYuvImage(AutoValue_Image2JpegBytes_In autoValue_Image2JpegBytes_In) {
            AutoValue_Packet autoValue_Packet = autoValue_Image2JpegBytes_In.packet;
            ImageProxy imageProxy = (ImageProxy) autoValue_Packet.data;
            Rect rect = autoValue_Packet.cropRect;
            try {
                byte[] yuvImageToJpegByteArray = ImageUtil.yuvImageToJpegByteArray(imageProxy, rect, autoValue_Image2JpegBytes_In.jpegQuality, autoValue_Packet.rotationDegrees);
                try {
                    Exif exif = new Exif(new ExifInterface(new ByteArrayInputStream(yuvImageToJpegByteArray)));
                    Size size = new Size(rect.width(), rect.height());
                    Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                    int i = autoValue_Packet.rotationDegrees;
                    Matrix matrix = autoValue_Packet.sensorToBufferTransform;
                    RectF rectF = TransformUtils.NORMALIZED_RECT;
                    Matrix matrix2 = new Matrix(matrix);
                    matrix2.postTranslate(-rect.left, -rect.top);
                    return new AutoValue_Packet(yuvImageToJpegByteArray, exif, 256, size, rect2, i, matrix2, autoValue_Packet.cameraCaptureResult);
                } catch (IOException e) {
                    throw new ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e);
                }
            } catch (ImageUtil.CodecFailedException e2) {
                throw new ImageCaptureException(1, "Failed to encode the image to JPEG.", e2);
            }
        }

        public void addIf(int i, boolean z) {
            FlagSet.Builder builder = (FlagSet.Builder) this.this$0;
            if (z) {
                builder.add(i);
            } else {
                builder.getClass();
            }
        }

        public Object apply(Object obj) {
            AutoValue_Packet processYuvImage;
            AutoValue_Image2JpegBytes_In autoValue_Image2JpegBytes_In = (AutoValue_Image2JpegBytes_In) obj;
            AutoValue_Packet autoValue_Packet = autoValue_Image2JpegBytes_In.packet;
            try {
                int i = autoValue_Packet.f846format;
                Object obj2 = autoValue_Packet.data;
                if (i == 35) {
                    processYuvImage = processYuvImage(autoValue_Image2JpegBytes_In);
                } else {
                    if (i != 256 && i != 4101) {
                        throw new IllegalArgumentException("Unexpected format: " + i);
                    }
                    processYuvImage = processJpegImage(autoValue_Image2JpegBytes_In, i);
                }
                ((ImageProxy) obj2).close();
                return processYuvImage;
            } catch (Throwable th) {
                ((ImageProxy) autoValue_Packet.data).close();
                throw th;
            }
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
        public float calculateApproachOffset(float f, float f2) {
            return RecyclerView.DECELERATION_RATE;
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
        public float calculateSnapOffset(float f) {
            return ((AnonymousClass1) this.this$0).calculateSnapOffset(f);
        }

        public void detach() {
            SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
            try {
                transaction.reparent((SurfaceControl) this.this$0, null).apply();
                transaction.close();
            } finally {
            }
        }

        public Object getArgValue() {
            return (Float) this.this$0;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public ByteBuffer getBuffer() {
            return ((Image.Plane) this.this$0).getBuffer();
        }

        /* renamed from: getNativeTypeface-PYhJU0U, reason: not valid java name */
        public Typeface m117getNativeTypefacePYhJU0U() {
            return (Typeface) this.this$0;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getPixelStride() {
            return ((Image.Plane) this.this$0).getPixelStride();
        }

        @Override // androidx.webkit.internal.WebViewProviderFactory
        public ProxyControllerBoundaryInterface getProxyController() {
            return (ProxyControllerBoundaryInterface) X509CertUtils.castToSuppLibClass(ProxyControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.this$0).getProxyController());
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getRowStride() {
            return ((Image.Plane) this.this$0).getRowStride();
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public float getScaledScrollFactor() {
            return -((NestedScrollView) this.this$0).getVerticalScrollFactorCompat();
        }

        @Override // androidx.webkit.internal.WebViewProviderFactory
        public StaticsBoundaryInterface getStatics() {
            return (StaticsBoundaryInterface) X509CertUtils.castToSuppLibClass(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.this$0).getStatics());
        }

        @Override // androidx.webkit.internal.WebViewProviderFactory
        public String[] getWebViewFeatures() {
            return ((WebViewProviderFactoryBoundaryInterface) this.this$0).getSupportedFeatures();
        }

        @Override // androidx.webkit.internal.WebViewProviderFactory
        public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
            return (WebkitToCompatConverterBoundaryInterface) X509CertUtils.castToSuppLibClass(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.this$0).getWebkitToCompatConverter());
        }

        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult m118measure3p2s80s(ApproachIntrinsicsMeasureScope approachIntrinsicsMeasureScope, DefaultIntrinsicMeasurable defaultIntrinsicMeasurable, long j) {
            return ((SharedBoundsNode) ((ApproachLayoutModifierNode) this.this$0)).m149approachMeasure3p2s80s(approachIntrinsicsMeasureScope, defaultIntrinsicMeasurable, j);
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            ((AppCompatDelegateImpl) this.this$0).checkCloseActionMenu(menuBuilder);
        }

        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(((ToolbarActionBar) this.this$0).mDecorToolbar.mToolbar.getContext());
            }
            return null;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th) {
            switch (this.$r8$classId) {
                case 0:
                    Recorder recorder = (Recorder) this.this$0;
                    TransactorKt.checkState("In-progress recording shouldn't be null", recorder.mInProgressRecording != null);
                    recorder.mInProgressRecording.getClass();
                    StringUtilsKt.d("Recorder", "Encodings end with error: " + th);
                    recorder.finalizeInProgressRecording(th, recorder.mMuxer == null ? 8 : 6);
                    break;
                case 12:
                    ((CallbackToFutureAdapter$Completer) this.this$0).setException(th);
                    break;
                default:
                    boolean z = th instanceof MediaCodec.CodecException;
                    EncoderImpl encoderImpl = (EncoderImpl) ((BiometricPrompt) this.this$0).mClientFragmentManager;
                    if (!z) {
                        encoderImpl.handleEncodeError(0, th.getMessage(), th);
                        break;
                    } else {
                        MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                        encoderImpl.handleEncodeError(1, codecException.getMessage(), codecException);
                        break;
                    }
            }
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            MenuBuilder.Callback callback = ((Toolbar) this.this$0).mMenuBuilderCallback;
            return callback != null && callback.onMenuItemSelected(menuBuilder, menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(MenuBuilder menuBuilder) {
            Toolbar toolbar = (Toolbar) this.this$0;
            ActionMenuPresenter actionMenuPresenter = toolbar.mMenuView.mPresenter;
            if (actionMenuPresenter == null || !actionMenuPresenter.isOverflowMenuShowing()) {
                Iterator it = toolbar.mMenuHostHelper.mMenuProviders.iterator();
                while (it.hasNext()) {
                    ((MenuProvider) it.next()).onPrepareMenu(menuBuilder);
                }
            }
            MenuBuilder.Callback callback = toolbar.mMenuBuilderCallback;
            if (callback != null) {
                callback.onMenuModeChange(menuBuilder);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Window.Callback callback = ((AppCompatDelegateImpl) this.this$0).mWindow.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, menuBuilder);
            return true;
        }

        public void onPreparePanel(int i) {
            if (i == 0) {
                ToolbarActionBar toolbarActionBar = (ToolbarActionBar) this.this$0;
                if (toolbarActionBar.mToolbarMenuPrepared) {
                    return;
                }
                toolbarActionBar.mDecorToolbar.mMenuPrepared = true;
                toolbarActionBar.mToolbarMenuPrepared = true;
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onSuccess(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    StringUtilsKt.d("Recorder", "Encodings end successfully.");
                    Recorder recorder = (Recorder) this.this$0;
                    recorder.finalizeInProgressRecording(recorder.mRecordingStopErrorCause, recorder.mRecordingStopError);
                    break;
                case 12:
                    CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) this.this$0;
                    try {
                        callbackToFutureAdapter$Completer.set(obj);
                        break;
                    } catch (Throwable th) {
                        callbackToFutureAdapter$Completer.setException(th);
                        return;
                    }
                default:
                    break;
            }
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public boolean perform(View view) {
            n nVar = (n) this.this$0;
            int i = ((ViewPager2) view).mCurrentItem + 1;
            ViewPager2 viewPager2 = (ViewPager2) nVar.d;
            if (viewPager2.mUserInputEnabled) {
                viewPager2.setCurrentItemInternal(i, true);
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
        
            r0 = java.util.Arrays.copyOfRange(r2, r1, r10.limit());
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
        
            if (r1 != (-1)) goto L26;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AutoValue_Packet processJpegImage(AutoValue_Image2JpegBytes_In autoValue_Image2JpegBytes_In, int i) {
            byte[] bArr;
            byte[] copyOfRange;
            byte b;
            AutoValue_Packet autoValue_Packet = autoValue_Image2JpegBytes_In.packet;
            Toolbar.AnonymousClass1 anonymousClass1 = (Toolbar.AnonymousClass1) this.this$0;
            ImageProxy imageProxy = (ImageProxy) autoValue_Packet.data;
            int i2 = 0;
            if (((IncorrectJpegMetadataQuirk) anonymousClass1.this$0) != null) {
                ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
                int capacity = buffer.capacity();
                bArr = new byte[capacity];
                buffer.rewind();
                buffer.get(bArr);
                int i3 = 2;
                for (int i4 = 2; i4 + 4 <= capacity && (b = bArr[i4]) == -1; i4 += (((bArr[i4 + 2] & 255) << 8) | (bArr[i4 + 3] & 255)) + 2) {
                    if (b == -1 && bArr[i4 + 1] == -38) {
                        break;
                    }
                }
                while (true) {
                    int i5 = i3 + 1;
                    if (i5 > capacity) {
                        i2 = -1;
                        break;
                    }
                    if (bArr[i3] == -1 && bArr[i5] == -40) {
                        i2 = i3;
                        break;
                    }
                    i3 = i5;
                    i = i;
                }
            } else {
                ByteBuffer buffer2 = imageProxy.getPlanes()[0].getBuffer();
                copyOfRange = new byte[buffer2.capacity()];
                buffer2.rewind();
                buffer2.get(copyOfRange);
            }
            bArr = copyOfRange;
            Exif exif = autoValue_Packet.exif;
            Objects.requireNonNull(exif);
            return new AutoValue_Packet(bArr, exif, i, autoValue_Packet.size, autoValue_Packet.cropRect, autoValue_Packet.rotationDegrees, autoValue_Packet.sensorToBufferTransform, autoValue_Packet.cameraCaptureResult);
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public boolean startDifferentialMotionFling(float f) {
            if (f == RecyclerView.DECELERATION_RATE) {
                return false;
            }
            stopDifferentialMotionFling();
            ((NestedScrollView) this.this$0).fling((int) f);
            return true;
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public void stopDifferentialMotionFling() {
            ((NestedScrollView) this.this$0).mScroller.abortAnimation();
        }

        public void unlockFlashMode() {
            ImageCapture imageCapture = (ImageCapture) this.this$0;
            synchronized (imageCapture.mLockedFlashMode) {
                try {
                    Integer num = (Integer) imageCapture.mLockedFlashMode.getAndSet(null);
                    if (num == null) {
                        return;
                    }
                    if (num.intValue() != imageCapture.getFlashMode()) {
                        imageCapture.trySetFlashModeToCameraControl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ AnonymousClass6(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        public AnonymousClass6(Quirks quirks) {
            this.$r8$classId = 11;
            Toolbar.AnonymousClass1 anonymousClass1 = new Toolbar.AnonymousClass1();
            anonymousClass1.this$0 = (IncorrectJpegMetadataQuirk) quirks.get(IncorrectJpegMetadataQuirk.class);
            this.this$0 = anonymousClass1;
        }

        public AnonymousClass6(SurfaceControl surfaceControl) {
            this.$r8$classId = 14;
            surfaceControl.getClass();
            this.this$0 = surfaceControl;
        }
    }

    @Override // androidx.camera.video.VideoOutput
    public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        onSurfaceRequested(surfaceRequest, Timebase.UPTIME, false);
    }

    /* renamed from: androidx.camera.video.Recorder$1, reason: invalid class name */
    public final class AnonymousClass1 implements ImageReaderProxy, FutureCallback, Supplier, SnapLayoutInfoProvider, SubcomposeSlotReusePolicy, OperationErrorContext, SubcomposeLayoutState.PausedPrecomposition, SegmentFinder {
        public final /* synthetic */ int $r8$classId;
        public Object this$0;
        public Object val$videoEncoderSession;

        public AnonymousClass1(EditText editText) {
            this.$r8$classId = 27;
            this.val$videoEncoderSession = editText;
            EmojiTextWatcher emojiTextWatcher = new EmojiTextWatcher(editText);
            this.this$0 = emojiTextWatcher;
            editText.addTextChangedListener(emojiTextWatcher);
            if (EmojiEditableFactory.sInstance == null) {
                synchronized (EmojiEditableFactory.INSTANCE_LOCK) {
                    try {
                        if (EmojiEditableFactory.sInstance == null) {
                            EmojiEditableFactory emojiEditableFactory = new EmojiEditableFactory();
                            try {
                                EmojiEditableFactory.sWatcherClass = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, EmojiEditableFactory.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            EmojiEditableFactory.sInstance = emojiEditableFactory;
                        }
                    } finally {
                    }
                }
            }
            editText.setEditableFactory(EmojiEditableFactory.sInstance);
        }

        public static void access$100(AnonymousClass1 anonymousClass1, boolean z, boolean z2) {
            synchronized (anonymousClass1) {
                boolean z3 = false;
                if (z) {
                    if (((PowerManager.WakeLock) anonymousClass1.this$0) == null) {
                        if (((Context) anonymousClass1.val$videoEncoderSession).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                            Log.w("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                            return;
                        }
                        PowerManager powerManager = (PowerManager) ((Context) anonymousClass1.val$videoEncoderSession).getSystemService("power");
                        if (powerManager == null) {
                            Log.w("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                            return;
                        } else {
                            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                            anonymousClass1.this$0 = newWakeLock;
                            newWakeLock.setReferenceCounted(false);
                        }
                    }
                }
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) anonymousClass1.this$0;
                if (wakeLock == null) {
                    return;
                }
                if (z && z2) {
                    z3 = true;
                }
                if (z3) {
                    wakeLock.acquire();
                } else {
                    wakeLock.release();
                }
            }
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public ImageProxy acquireLatestImage() {
            return createImageProxyWithEmptyMetadata(((VideoCapture.AnonymousClass3) this.val$videoEncoderSession).acquireLatestImage());
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public ImageProxy acquireNextImage() {
            return createImageProxyWithEmptyMetadata(((VideoCapture.AnonymousClass3) this.val$videoEncoderSession).acquireNextImage());
        }

        public TextFieldValue apply(List list) {
            EditCommand editCommand;
            EditCommand editCommand2 = null;
            try {
                int size = list.size();
                int i = 0;
                EditCommand editCommand3 = null;
                while (i < size) {
                    try {
                        editCommand = (EditCommand) list.get(i);
                    } catch (Exception e) {
                        e = e;
                        editCommand2 = editCommand3;
                    }
                    try {
                        editCommand.applyTo((LongArrayQueue) this.this$0);
                        i++;
                        editCommand3 = editCommand;
                    } catch (Exception e2) {
                        e = e2;
                        editCommand2 = editCommand;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(((TimedValueQueue) ((LongArrayQueue) this.this$0).data).getLength());
                        sb2.append(", composition=");
                        sb2.append(((LongArrayQueue) this.this$0).m1141getCompositionMzsxiRA$ui_text());
                        sb2.append(", selection=");
                        LongArrayQueue longArrayQueue = (LongArrayQueue) this.this$0;
                        sb2.append((Object) TextRange.m992toStringimpl(SizeKt.TextRange(longArrayQueue.headIndex, longArrayQueue.tailIndex)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        CollectionsKt.joinTo$default(list, sb, "\n", null, null, new CachedPageEventFlow$$ExternalSyntheticLambda0(editCommand2, this), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                }
                LongArrayQueue longArrayQueue2 = (LongArrayQueue) this.this$0;
                longArrayQueue2.getClass();
                AnnotatedString annotatedString = new AnnotatedString(((TimedValueQueue) longArrayQueue2.data).toString());
                LongArrayQueue longArrayQueue3 = (LongArrayQueue) this.this$0;
                long TextRange = SizeKt.TextRange(longArrayQueue3.headIndex, longArrayQueue3.tailIndex);
                TextRange textRange = TextRange.m991getReversedimpl(((TextFieldValue) this.val$videoEncoderSession).selection) ? null : new TextRange(TextRange);
                TextFieldValue textFieldValue = new TextFieldValue(annotatedString, textRange != null ? textRange.packedValue : SizeKt.TextRange(TextRange.m989getMaximpl(TextRange), TextRange.m990getMinimpl(TextRange)), ((LongArrayQueue) this.this$0).m1141getCompositionMzsxiRA$ui_text());
                this.val$videoEncoderSession = textFieldValue;
                return textFieldValue;
            } catch (Exception e3) {
                e = e3;
            }
        }

        @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
        public boolean areCompatible(Object obj, Object obj2) {
            LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) this.val$videoEncoderSession;
            return Intrinsics.areEqual(lazyLayoutItemContentFactory.getContentType(obj), lazyLayoutItemContentFactory.getContentType(obj2));
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
        public List buildStackTrace(Integer num) {
            List buildStackTrace = ((OperationErrorContext) this.val$videoEncoderSession).buildStackTrace(null);
            SlotWriter slotWriter = (SlotWriter) this.this$0;
            int i = slotWriter.parent;
            if (i < 0) {
                return buildStackTrace;
            }
            return CollectionsKt.plus((Iterable) buildStackTrace, (Collection) SourceInformationKt.buildTrace(slotWriter, num, i, Integer.valueOf(slotWriter.parent(i, slotWriter.groups))));
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
        public float calculateApproachOffset(float f, float f2) {
            float abs = Math.abs(f2);
            List list = ((LazyListState) this.val$videoEncoderSession).getLayoutInfo().visibleItemsInfo;
            int i = 0;
            if (!list.isEmpty()) {
                int size = list.size();
                int size2 = list.size();
                int i2 = 0;
                while (i < size2) {
                    i2 += ((LazyListMeasuredItem) list.get(i)).size;
                    i++;
                }
                i = i2 / size;
            }
            float f3 = abs - i;
            if (f3 < RecyclerView.DECELERATION_RATE) {
                f3 = 0.0f;
            }
            return Math.signum(f2) * f3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
        
            if (java.lang.Math.abs(r9) <= java.lang.Math.abs(r8)) goto L41;
         */
        @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public float calculateSnapOffset(float f) {
            LazyListState lazyListState = (LazyListState) this.val$videoEncoderSession;
            List list = lazyListState.getLayoutInfo().visibleItemsInfo;
            SnapPosition$Start snapPosition$Start = (SnapPosition$Start) this.this$0;
            int size = list.size();
            float f2 = Float.POSITIVE_INFINITY;
            float f3 = Float.NEGATIVE_INFINITY;
            for (int i = 0; i < size; i++) {
                LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) list.get(i);
                LazyListMeasuredItem lazyListMeasuredItem2 = lazyListMeasuredItem != null ? lazyListMeasuredItem : null;
                if (lazyListMeasuredItem2 == null || !lazyListMeasuredItem2.nonScrollableItem) {
                    LazyListMeasureResult layoutInfo = lazyListState.getLayoutInfo();
                    int m310getViewportSizeYbymL2g = (int) (layoutInfo.orientation == Orientation.Vertical ? layoutInfo.m310getViewportSizeYbymL2g() & BodyPartID.bodyIdMax : layoutInfo.m310getViewportSizeYbymL2g() >> 32);
                    int i2 = -lazyListState.getLayoutInfo().viewportStartOffset;
                    int i3 = lazyListState.getLayoutInfo().afterContentPadding;
                    int i4 = lazyListMeasuredItem.size;
                    int i5 = lazyListMeasuredItem.offset;
                    int i6 = lazyListState.getLayoutInfo().totalItemsCount;
                    float position = i5 - snapPosition$Start.position(m310getViewportSizeYbymL2g, i4, i2, i3);
                    if (position <= RecyclerView.DECELERATION_RATE && position > f3) {
                        f3 = position;
                    }
                    if (position >= RecyclerView.DECELERATION_RATE && position < f2) {
                        f2 = position;
                    }
                }
            }
            char c = Math.abs(f) >= ((LazyListMeasureResult) lazyListState.layoutInfoState.getValue()).density.mo236toPx0680j_4(400.0f) ? f > RecyclerView.DECELERATION_RATE ? (char) 1 : (char) 2 : (char) 0;
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        f3 = 0.0f;
                    }
                }
                f3 = f2;
            }
            return (f3 == Float.POSITIVE_INFINITY || f3 == Float.NEGATIVE_INFINITY) ? RecyclerView.DECELERATION_RATE : f3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:298:0x05f8, code lost:
        
            if (r1 == androidx.camera.core.impl.stabilization.VideoStabilization.PREVIEW) goto L221;
         */
        /* JADX WARN: Removed duplicated region for block: B:250:0x06ab  */
        /* JADX WARN: Removed duplicated region for block: B:260:0x06d8  */
        /* JADX WARN: Type inference failed for: r0v50, types: [boolean, int] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public StreamSpecQueryResult calculateSuggestedStreamSpecs(int i, CameraInfoInternal cameraInfoInternal, ArrayList arrayList, ArrayList arrayList2, CameraConfig cameraConfig, Range range, boolean z) {
            Pair pair;
            int i2;
            Rect rect;
            SupportedSurfaceCombination supportedSurfaceCombination;
            boolean z2;
            boolean z3;
            LinkedHashMap linkedHashMap;
            ArrayList arrayList3;
            boolean z4;
            boolean z5;
            int i3;
            int i4;
            SupportedSurfaceCombination.CheckingMethod checkingMethod;
            SurfaceStreamSpecQueryResult resolveSpecsBySettings;
            SupportedSurfaceCombination.FeatureSettings copy$default;
            SupportedSurfaceCombination supportedSurfaceCombination2;
            cameraInfoInternal.getClass();
            cameraConfig.getClass();
            range.getClass();
            ArrayList arrayList4 = new ArrayList();
            String cameraId = cameraInfoInternal.getCameraId();
            cameraId.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                UseCase useCase = (UseCase) it.next();
                AutoValue_StreamSpec autoValue_StreamSpec = useCase.mAttachedStreamSpec;
                if (autoValue_StreamSpec == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Attached stream spec cannot be null for already attached use cases.");
                    return null;
                }
                CameraSurfaceAdapter cameraSurfaceAdapter = (CameraSurfaceAdapter) this.this$0;
                if (cameraSurfaceAdapter == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                    return null;
                }
                int inputFormat = useCase.mCurrentConfig.getInputFormat();
                Size attachedSurfaceResolution = useCase.getAttachedSurfaceResolution();
                if (attachedSurfaceResolution == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Attached surface resolution cannot be null for already attached use cases.");
                    return null;
                }
                StreamUseCase streamUseCase = useCase.mCurrentConfig.getStreamUseCase();
                Iterator it2 = it;
                TransactorKt.checkArgument("No such camera id in supported combination list: ".concat(cameraId), cameraSurfaceAdapter.supportedSurfaceCombinationMap.containsKey(cameraId));
                synchronized (cameraSurfaceAdapter.lock) {
                    supportedSurfaceCombination2 = (SupportedSurfaceCombination) cameraSurfaceAdapter.supportedSurfaceCombinationMap.get(cameraId);
                }
                if (supportedSurfaceCombination2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("No such camera id in supported combination list: ".concat(cameraId));
                    return null;
                }
                SurfaceConfig transformSurfaceConfig = supportedSurfaceCombination2.transformSurfaceConfig(i, inputFormat, attachedSurfaceResolution, streamUseCase);
                int inputFormat2 = useCase.mCurrentConfig.getInputFormat();
                Size attachedSurfaceResolution2 = useCase.getAttachedSurfaceResolution();
                attachedSurfaceResolution2.getClass();
                DynamicRange dynamicRange = autoValue_StreamSpec.dynamicRange;
                ArrayList arrayList5 = new ArrayList();
                if (useCase instanceof StreamSharing) {
                    Iterator it3 = ((StreamSharing) useCase).mVirtualCameraAdapter.mChildren.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(((UseCase) it3.next()).mCurrentConfig.getCaptureType());
                    }
                } else {
                    arrayList5.add(useCase.mCurrentConfig.getCaptureType());
                }
                Config config = autoValue_StreamSpec.implementationOptions;
                int intValue = ((Integer) useCase.mCurrentConfig.retrieveOption(UseCaseConfig.OPTION_SESSION_TYPE, 0)).intValue();
                Range range2 = (Range) useCase.mCurrentConfig.retrieveOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
                if (range2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                }
                Boolean bool = (Boolean) useCase.mCurrentConfig.retrieveOption(UseCaseConfig.OPTION_IS_STRICT_FRAME_RATE_REQUIRED, Boolean.FALSE);
                Objects.requireNonNull(bool);
                boolean booleanValue = bool.booleanValue();
                UseCaseConfig useCaseConfig = useCase.mCurrentConfig;
                Size attachedSurfaceResolution3 = useCase.getAttachedSurfaceResolution();
                attachedSurfaceResolution3.getClass();
                AutoValue_AttachedSurfaceInfo autoValue_AttachedSurfaceInfo = new AutoValue_AttachedSurfaceInfo(transformSurfaceConfig, inputFormat2, attachedSurfaceResolution2, dynamicRange, arrayList5, config, intValue, range2, booleanValue, useCaseConfig.getCustomMaxFrameRate(attachedSurfaceResolution3));
                arrayList4.add(autoValue_AttachedSurfaceInfo);
                linkedHashMap3.put(autoValue_AttachedSurfaceInfo, useCase);
                linkedHashMap2.put(useCase, autoValue_StreamSpec);
                it = it2;
            }
            Pair pair2 = new Pair(linkedHashMap2, linkedHashMap3);
            Object obj = pair2.second;
            obj.getClass();
            Map map = (Map) obj;
            HashMap configs = CameraUseCaseAdapter.getConfigs(arrayList, (UseCaseConfigFactory) cameraConfig.retrieveOption(CameraConfig.OPTION_USECASE_CONFIG_FACTORY, UseCaseConfigFactory.EMPTY_INSTANCE), (androidx.camera.camera2.adapter.CameraUseCaseAdapter) this.val$videoEncoderSession, range);
            String cameraId2 = cameraInfoInternal.getCameraId();
            cameraId2.getClass();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            if (arrayList.isEmpty()) {
                pair = pair2;
                i2 = Integer.MAX_VALUE;
            } else {
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                try {
                    rect = cameraInfoInternal.getSensorRect();
                } catch (NullPointerException unused) {
                    rect = null;
                }
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(cameraInfoInternal, rect != null ? TransformUtils.rectToSize(rect) : null);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    UseCase useCase2 = (UseCase) it4.next();
                    Object obj2 = configs.get(useCase2);
                    if (obj2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    CameraUseCaseAdapter.ConfigPair configPair = (CameraUseCaseAdapter.ConfigPair) obj2;
                    UseCaseConfig mergeConfigs = useCase2.mergeConfigs(cameraInfoInternal, configPair.mExtendedConfig, configPair.mCameraConfig);
                    mergeConfigs.getClass();
                    linkedHashMap5.put(mergeConfigs, useCase2);
                    linkedHashMap6.put(mergeConfigs, anonymousClass3.getSortedSupportedOutputSizes(mergeConfigs));
                }
                VideoStabilization videoStabilization = UseCaseUtil.getVideoStabilization(arrayList, new ClickableKt$$ExternalSyntheticLambda0(7, configs, cameraInfoInternal));
                CameraSurfaceAdapter cameraSurfaceAdapter2 = (CameraSurfaceAdapter) this.this$0;
                if (cameraSurfaceAdapter2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                    return null;
                }
                ArrayList arrayList6 = new ArrayList(map.keySet());
                boolean containsVideoCapture = UseCaseUtil.containsVideoCapture(arrayList);
                TransactorKt.checkArgument("No such camera id in supported combination list: ".concat(cameraId2), cameraSurfaceAdapter2.supportedSurfaceCombinationMap.containsKey(cameraId2));
                synchronized (cameraSurfaceAdapter2.lock) {
                    supportedSurfaceCombination = (SupportedSurfaceCombination) cameraSurfaceAdapter2.supportedSurfaceCombinationMap.get(cameraId2);
                }
                if (supportedSurfaceCombination == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("No such camera id in supported combination list: ".concat(cameraId2));
                    return null;
                }
                DisplayInfoManager displayInfoManager = supportedSurfaceCombination.displayInfoManager;
                synchronized (displayInfoManager.lock) {
                    displayInfoManager.previewSize = displayInfoManager.calculatePreviewSize();
                }
                if (supportedSurfaceCombination.surfaceSizeDefinition == null) {
                    supportedSurfaceCombination.generateSurfaceSizeDefinition();
                } else {
                    supportedSurfaceCombination.surfaceSizeDefinition = new AutoValue_SurfaceSizeDefinition(supportedSurfaceCombination.getSurfaceSizeDefinition$camera_camera2().analysisSize, supportedSurfaceCombination.getSurfaceSizeDefinition$camera_camera2().s720pSizeMap, supportedSurfaceCombination.displayInfoManager.getPreviewSize(), supportedSurfaceCombination.getSurfaceSizeDefinition$camera_camera2().s1440pSizeMap, supportedSurfaceCombination.getSurfaceSizeDefinition$camera_camera2().recordSize, supportedSurfaceCombination.getSurfaceSizeDefinition$camera_camera2().maximumSizeMap, supportedSurfaceCombination.getSurfaceSizeDefinition$camera_camera2().maximum4x3SizeMap, supportedSurfaceCombination.getSurfaceSizeDefinition$camera_camera2().maximum16x9SizeMap, supportedSurfaceCombination.getSurfaceSizeDefinition$camera_camera2().ultraMaximumSizeMap);
                }
                Range range3 = HighSpeedResolver.DEFAULT_FPS;
                Set keySet = linkedHashMap6.keySet();
                keySet.getClass();
                ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
                Iterator it5 = arrayList6.iterator();
                while (it5.hasNext()) {
                    arrayList7.add(Integer.valueOf(((AutoValue_AttachedSurfaceInfo) it5.next()).sessionType));
                }
                Set set = keySet;
                ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
                Iterator it6 = set.iterator();
                while (it6.hasNext()) {
                    Integer num = (Integer) ((UseCaseConfig) it6.next()).retrieveOption(UseCaseConfig.OPTION_SESSION_TYPE, 0);
                    num.getClass();
                    arrayList8.add(num);
                }
                ArrayList plus = CollectionsKt.plus((Iterable) arrayList8, (Collection) arrayList7);
                if (!plus.isEmpty()) {
                    Iterator it7 = plus.iterator();
                    while (it7.hasNext()) {
                        if (((Number) it7.next()).intValue() == 1) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (z2 && !plus.isEmpty()) {
                    Iterator it8 = plus.iterator();
                    while (it8.hasNext()) {
                        if (((Number) it8.next()).intValue() != 1) {
                            a$$ExternalSyntheticBUOutline0.m$3("All sessionTypes should be high-speed when any of them is high-speed");
                            return null;
                        }
                    }
                }
                if (z2) {
                    HighSpeedResolver highSpeedResolver = supportedSurfaceCombination.highSpeedResolver;
                    highSpeedResolver.getClass();
                    List findCommonElements = HighSpeedResolver.findCommonElements(CollectionsKt.toList(linkedHashMap6.values()));
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj3 : findCommonElements) {
                        boolean z6 = containsVideoCapture;
                        if (((List) highSpeedResolver.supportedSizes$delegate.getValue()).contains((Size) obj3)) {
                            arrayList9.add(obj3);
                        }
                        containsVideoCapture = z6;
                    }
                    z3 = containsVideoCapture;
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap6.size()));
                    Iterator it9 = linkedHashMap6.entrySet().iterator();
                    while (it9.hasNext()) {
                        Map.Entry entry = (Map.Entry) it9.next();
                        Object key = entry.getKey();
                        List list = (List) entry.getValue();
                        ArrayList arrayList10 = new ArrayList();
                        for (Object obj4 : list) {
                            Iterator it10 = it9;
                            if (arrayList9.contains((Size) obj4)) {
                                arrayList10.add(obj4);
                            }
                            it9 = it10;
                        }
                        linkedHashMap7.put(key, arrayList10);
                    }
                    linkedHashMap = linkedHashMap7;
                } else {
                    z3 = containsVideoCapture;
                    linkedHashMap = linkedHashMap6;
                }
                List<UseCaseConfig> list2 = CollectionsKt.toList(linkedHashMap.keySet());
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                Iterator it11 = list2.iterator();
                while (it11.hasNext()) {
                    Integer num2 = (Integer) ((UseCaseConfig) it11.next()).retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, 0);
                    num2.getClass();
                    if (!arrayList12.contains(num2)) {
                        arrayList12.add(num2);
                    }
                }
                CollectionsKt__MutableCollectionsJVMKt.sort(arrayList12);
                Collections.reverse(arrayList12);
                Iterator it12 = arrayList12.iterator();
                while (it12.hasNext()) {
                    int intValue2 = ((Number) it12.next()).intValue();
                    for (UseCaseConfig useCaseConfig2 : list2) {
                        if (intValue2 == ((Integer) useCaseConfig2.retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, 0)).intValue()) {
                            arrayList11.add(Integer.valueOf(list2.indexOf(useCaseConfig2)));
                        }
                    }
                }
                LinkedHashMap resolveAndValidateDynamicRanges = supportedSurfaceCombination.dynamicRangeResolver.resolveAndValidateDynamicRanges(arrayList6, list2, arrayList11);
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    android.util.Log.d("CXCP", "resolvedDynamicRanges = " + resolveAndValidateDynamicRanges);
                }
                Iterator it13 = arrayList6.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        if (((AutoValue_AttachedSurfaceInfo) it13.next()).imageFormat == 4101) {
                            break;
                        }
                    } else {
                        Iterator it14 = linkedHashMap.keySet().iterator();
                        while (it14.hasNext()) {
                            if (((UseCaseConfig) it14.next()).getInputFormat() == 4101) {
                            }
                        }
                        arrayList3 = arrayList11;
                        z4 = false;
                    }
                }
                arrayList3 = arrayList11;
                z4 = true;
                Iterator it15 = arrayList6.iterator();
                Boolean bool2 = null;
                while (it15.hasNext()) {
                    boolean z7 = ((AutoValue_AttachedSurfaceInfo) it15.next()).strictFrameRateRequired;
                    if (bool2 != null && !bool2.equals(Boolean.valueOf(z7))) {
                        a$$ExternalSyntheticBUOutline0.m$1("All isStrictFpsRequired should be the same");
                        return null;
                    }
                    bool2 = Boolean.valueOf(z7);
                }
                Iterator it16 = list2.iterator();
                while (it16.hasNext()) {
                    Boolean bool3 = (Boolean) ((UseCaseConfig) it16.next()).retrieveOption(UseCaseConfig.OPTION_IS_STRICT_FRAME_RATE_REQUIRED, Boolean.FALSE);
                    Objects.requireNonNull(bool3);
                    if (bool2 != null && !bool2.equals(bool3)) {
                        a$$ExternalSyntheticBUOutline0.m$1("All isStrictFpsRequired should be the same");
                        return null;
                    }
                    bool2 = bool3;
                }
                boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                Range range4 = AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
                range4.getClass();
                Iterator it17 = arrayList6.iterator();
                while (it17.hasNext()) {
                    Range range5 = ((AutoValue_AttachedSurfaceInfo) it17.next()).targetFrameRate;
                    range5.getClass();
                    range4 = SupportedSurfaceCombination.getUpdatedTargetFrameRate(range5, range4, booleanValue2);
                }
                Iterator it18 = arrayList3.iterator();
                Range range6 = range4;
                while (it18.hasNext()) {
                    List list3 = list2;
                    Range range7 = (Range) ((UseCaseConfig) list2.get(((Number) it18.next()).intValue())).retrieveOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
                    range7.getClass();
                    range6 = SupportedSurfaceCombination.getUpdatedTargetFrameRate(range7, range6, booleanValue2);
                    list2 = list3;
                }
                List list4 = list2;
                boolean booleanValue3 = Boolean.valueOf(booleanValue2).booleanValue();
                boolean z8 = videoStabilization == VideoStabilization.PREVIEW;
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    StringBuilder sb = new StringBuilder("getSuggestedStreamSpecifications: isPreviewStabilizationSupported = ");
                    sb.append(supportedSurfaceCombination.isPreviewStabilizationSupported);
                    sb.append(", isFeatureComboInvocation = ");
                    z5 = z;
                    sb.append(z5);
                    android.util.Log.d("CXCP", sb.toString());
                } else {
                    z5 = z;
                }
                if (z8 && !supportedSurfaceCombination.isPreviewStabilizationSupported && z5) {
                    a$$ExternalSyntheticBUOutline0.m$3("Preview stabilization is not supported by the camera.");
                    return null;
                }
                range6.getClass();
                Iterator it19 = resolveAndValidateDynamicRanges.values().iterator();
                while (true) {
                    if (!it19.hasNext()) {
                        i3 = 8;
                        break;
                    }
                    i3 = 10;
                    if (((DynamicRange) it19.next()).mBitDepth == 10) {
                        break;
                    }
                }
                pair = pair2;
                SupportedSurfaceCombination supportedSurfaceCombination3 = supportedSurfaceCombination;
                SupportedSurfaceCombination.FeatureSettings featureSettings = new SupportedSurfaceCombination.FeatureSettings(i, i3, z3, videoStabilization, z4, z2, z, false, range6, booleanValue3);
                supportedSurfaceCombination3.validateSelf(featureSettings);
                Collection values = resolveAndValidateDynamicRanges.values();
                if (z) {
                    ?? contains = values.contains(DynamicRange.HLG_10_BIT);
                    Integer num3 = (Integer) range6.getUpper();
                    int i5 = contains;
                    if (num3 != null) {
                        i5 = contains;
                        if (num3.intValue() == 60) {
                            i5 = contains + 1;
                        }
                    }
                    if (videoStabilization != VideoStabilization.ON) {
                        i4 = i5;
                    }
                    i4 = i5 + 1;
                    if (z4) {
                        i4++;
                    }
                    checkingMethod = i4 > 1 ? SupportedSurfaceCombination.CheckingMethod.WITH_FEATURE_COMBO : i4 == 1 ? SupportedSurfaceCombination.CheckingMethod.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT : SupportedSurfaceCombination.CheckingMethod.WITHOUT_FEATURE_COMBO;
                } else {
                    checkingMethod = SupportedSurfaceCombination.CheckingMethod.WITHOUT_FEATURE_COMBO;
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    android.util.Log.d("CXCP", "resolveSpecsByCheckingMethod: checkingMethod = " + checkingMethod);
                }
                int ordinal = checkingMethod.ordinal();
                if (ordinal == 0) {
                    SupportedSurfaceCombination.FeatureSettings copy$default2 = SupportedSurfaceCombination.FeatureSettings.copy$default(featureSettings, false, null, 895);
                    supportedSurfaceCombination3.validateSelf(copy$default2);
                    resolveSpecsBySettings = supportedSurfaceCombination3.resolveSpecsBySettings(copy$default2, arrayList6, linkedHashMap, list4, arrayList3, resolveAndValidateDynamicRanges);
                } else if (ordinal == 1) {
                    if (z) {
                        Range range8 = AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
                    }
                    SupportedSurfaceCombination.FeatureSettings copy$default3 = SupportedSurfaceCombination.FeatureSettings.copy$default(featureSettings, true, range6, 639);
                    supportedSurfaceCombination3.validateSelf(copy$default3);
                    resolveSpecsBySettings = supportedSurfaceCombination3.resolveSpecsBySettings(copy$default3, arrayList6, linkedHashMap, list4, arrayList3, resolveAndValidateDynamicRanges);
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    try {
                        copy$default = SupportedSurfaceCombination.FeatureSettings.copy$default(featureSettings, false, null, 895);
                        supportedSurfaceCombination3.validateSelf(copy$default);
                    } catch (IllegalArgumentException e) {
                        e = e;
                    }
                    try {
                        resolveSpecsBySettings = supportedSurfaceCombination3.resolveSpecsBySettings(copy$default, arrayList6, linkedHashMap, list4, arrayList3, resolveAndValidateDynamicRanges);
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        supportedSurfaceCombination3 = supportedSurfaceCombination3;
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            android.util.Log.d("CXCP", "Failed to find a supported combination without feature combo, trying again with feature combo", e);
                        }
                        SupportedSurfaceCombination.FeatureSettings copy$default4 = SupportedSurfaceCombination.FeatureSettings.copy$default(featureSettings, true, null, 895);
                        supportedSurfaceCombination3.validateSelf(copy$default4);
                        resolveSpecsBySettings = supportedSurfaceCombination3.resolveSpecsBySettings(copy$default4, arrayList6, linkedHashMap, list4, arrayList3, resolveAndValidateDynamicRanges);
                        LinkedHashMap linkedHashMap8 = resolveSpecsBySettings.useCaseStreamSpecs;
                        LinkedHashMap linkedHashMap9 = resolveSpecsBySettings.attachedSurfaceStreamSpecs;
                        i2 = resolveSpecsBySettings.maxSupportedFrameRate;
                        while (r3.hasNext()) {
                        }
                        while (r1.hasNext()) {
                        }
                        Object obj5 = pair.first;
                        obj5.getClass();
                        return new StreamSpecQueryResult(i2, MapsKt__MapsKt.plus((Map) obj5, linkedHashMap4));
                    }
                }
                LinkedHashMap linkedHashMap82 = resolveSpecsBySettings.useCaseStreamSpecs;
                LinkedHashMap linkedHashMap92 = resolveSpecsBySettings.attachedSurfaceStreamSpecs;
                i2 = resolveSpecsBySettings.maxSupportedFrameRate;
                for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
                    Object value = entry2.getValue();
                    Object obj6 = linkedHashMap82.get(entry2.getKey());
                    if (obj6 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    linkedHashMap4.put(value, obj6);
                }
                for (Map.Entry entry3 : linkedHashMap92.entrySet()) {
                    if (map.containsKey(entry3.getKey())) {
                        Object obj7 = map.get(entry3.getKey());
                        if (obj7 == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return null;
                        }
                        linkedHashMap4.put(obj7, entry3.getValue());
                    }
                }
            }
            Object obj52 = pair.first;
            obj52.getClass();
            return new StreamSpecQueryResult(i2, MapsKt__MapsKt.plus((Map) obj52, linkedHashMap4));
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
        public void cancel() {
            LayoutNodeSubcompositionsState.NodeState nodeState = getNodeState();
            if ((nodeState != null ? nodeState.pausedComposition : null) != null) {
                LayoutNodeSubcompositionsState.access$disposePrecomposedSlot((LayoutNodeSubcompositionsState) this.val$videoEncoderSession, this.this$0);
            }
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public void clearOnImageAvailableListener() {
            ((VideoCapture.AnonymousClass3) this.val$videoEncoderSession).clearOnImageAvailableListener();
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public void close() {
            ((VideoCapture.AnonymousClass3) this.val$videoEncoderSession).close();
        }

        public SettableImageProxy createImageProxyWithEmptyMetadata(ImageProxy imageProxy) {
            TagBundle tagBundle;
            if (imageProxy == null) {
                return null;
            }
            if (((ProcessingRequest) this.this$0) == null) {
                tagBundle = TagBundle.EMPTY_TAGBUNDLE;
            } else {
                ProcessingRequest processingRequest = (ProcessingRequest) this.this$0;
                Pair pair = new Pair(processingRequest.mTagBundleKey, processingRequest.mStageIds.get(0));
                TagBundle tagBundle2 = TagBundle.EMPTY_TAGBUNDLE;
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put((String) pair.first, pair.second);
                tagBundle = new TagBundle(arrayMap);
            }
            this.this$0 = null;
            return new SettableImageProxy(imageProxy, new Size(imageProxy.getWidth(), imageProxy.getHeight()), new CameraCaptureResultImageInfo(new RealStrongMemoryCache((CameraCaptureResult) null, tagBundle, imageProxy.getImageInfo().getTimestamp())));
        }

        @Override // androidx.core.util.Supplier
        public Object get() {
            ((AudioSpec) this.val$videoEncoderSession).getClass();
            StringUtilsKt.d("AudioConfigUtil", "Using default AUDIO source: 5");
            StringUtilsKt.d("AudioConfigUtil", "Using default AUDIO source format: 2");
            StringUtilsKt.d("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            CaptureEncodeRates resolveSampleRates$camera_video = AudioConfigUtil.resolveSampleRates$camera_video(44100, 1, (Rational) this.this$0);
            StringBuilder sb = new StringBuilder("Using AUDIO sample rate resolved from AudioSpec: Capture sample rate: ");
            int i = resolveSampleRates$camera_video.captureRate;
            sb.append(i);
            sb.append("Hz. Encode sample rate: ");
            int i2 = resolveSampleRates$camera_video.encodeRate;
            sb.append(i2);
            sb.append("Hz.");
            StringUtilsKt.d("DefAudioResolver", sb.toString());
            List list = AutoValue_AudioSettings.COMMON_SAMPLE_RATES;
            JWECryptoParts jWECryptoParts = new JWECryptoParts();
            jWECryptoParts.header = -1;
            jWECryptoParts.encryptedKey = -1;
            jWECryptoParts.iv = -1;
            jWECryptoParts.cipherText = -1;
            jWECryptoParts.authenticationTag = -1;
            jWECryptoParts.header = 5;
            jWECryptoParts.authenticationTag = 2;
            jWECryptoParts.cipherText = 1;
            jWECryptoParts.encryptedKey = Integer.valueOf(i);
            jWECryptoParts.iv = Integer.valueOf(i2);
            return jWECryptoParts.m2170build();
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public int getHeight() {
            return ((VideoCapture.AnonymousClass3) this.val$videoEncoderSession).getHeight();
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public int getImageFormat() {
            return ((VideoCapture.AnonymousClass3) this.val$videoEncoderSession).getImageFormat();
        }

        public InputMethodManager getImm() {
            return (InputMethodManager) ((Lazy) this.this$0).getValue();
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public int getMaxImages() {
            return ((VideoCapture.AnonymousClass3) this.val$videoEncoderSession).getMaxImages();
        }

        public MotionEvent getMotionEvent() {
            return (MotionEvent) this.this$0;
        }

        public LayoutNodeSubcompositionsState.NodeState getNodeState() {
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = (LayoutNodeSubcompositionsState) this.val$videoEncoderSession;
            LayoutNode layoutNode = (LayoutNode) layoutNodeSubcompositionsState.precomposeMap.get(this.this$0);
            if (layoutNode != null) {
                return (LayoutNodeSubcompositionsState.NodeState) layoutNodeSubcompositionsState.nodeToNodeState.get(layoutNode);
            }
            return null;
        }

        public List getPointers() {
            return (List) this.val$videoEncoderSession;
        }

        @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
        public void getSlotsToRetain(Values values) {
            MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) this.this$0;
            mutableObjectIntMap.clear();
            MutableOrderedScatterSet mutableOrderedScatterSet = (MutableOrderedScatterSet) values.parent;
            Object[] objArr = mutableOrderedScatterSet.elements;
            long[] jArr = mutableOrderedScatterSet.nodes;
            int i = mutableOrderedScatterSet.tail;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
                Object obj = objArr[i];
                Object contentType = ((LazyLayoutItemContentFactory) this.val$videoEncoderSession).getContentType(obj);
                int findKeyIndex = mutableObjectIntMap.findKeyIndex(contentType);
                int i3 = findKeyIndex >= 0 ? mutableObjectIntMap.values[findKeyIndex] : 0;
                if (i3 == 7) {
                    values.remove(obj);
                } else {
                    mutableObjectIntMap.set(i3 + 1, contentType);
                }
                i = i2;
            }
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
        public boolean getSourceInformationEnabled() {
            return ((OperationErrorContext) this.val$videoEncoderSession).getSourceInformationEnabled();
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public Surface getSurface() {
            return ((VideoCapture.AnonymousClass3) this.val$videoEncoderSession).getSurface();
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public int getWidth() {
            return ((VideoCapture.AnonymousClass3) this.val$videoEncoderSession).getWidth();
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
        public boolean isComplete() {
            PausedCompositionImpl pausedCompositionImpl;
            LayoutNodeSubcompositionsState.NodeState nodeState = getNodeState();
            if (nodeState == null || (pausedCompositionImpl = nodeState.pausedComposition) == null) {
                return true;
            }
            return pausedCompositionImpl.isComplete();
        }

        public void launchUrl(Context context, Uri uri) {
            Intent intent = (Intent) this.val$videoEncoderSession;
            intent.setData(uri);
            context.startActivity(intent, (Bundle) this.this$0);
        }

        /* renamed from: linkTo-VpY3zN4, reason: not valid java name */
        public void m110linkToVpY3zN4(ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, float f) {
            int i = verticalAnchor.index;
            String str = "start";
            if (i != -2) {
                if (i == -1) {
                    str = "end";
                } else if (i != 1) {
                    android.util.Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
                } else {
                    str = "right";
                }
            }
            CLArray cLArray = new CLArray(new char[0]);
            cLArray.add(CLString.from(verticalAnchor.id.toString()));
            cLArray.add(CLString.from(str));
            cLArray.add(new CLNumber(f));
            cLArray.add(new CLNumber(RecyclerView.DECELERATION_RATE));
            ((CLObject) this.val$videoEncoderSession).put((String) this.this$0, cLArray);
        }

        @Override // androidx.compose.ui.text.android.selection.SegmentFinder
        public int nextEndBoundary(int i) {
            TextPaint textPaint = (TextPaint) this.this$0;
            CharSequence charSequence = (CharSequence) this.val$videoEncoderSession;
            return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        }

        @Override // androidx.compose.ui.text.android.selection.SegmentFinder
        public int nextStartBoundary(int i) {
            TextPaint textPaint = (TextPaint) this.this$0;
            CharSequence charSequence = (CharSequence) this.val$videoEncoderSession;
            int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
            if (textRunCursor == -1 || ((TextPaint) this.this$0).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 0) == -1) {
                return -1;
            }
            return textRunCursor;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th) {
            AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord;
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    StringUtilsKt.d("Recorder", "Error in ReadyToReleaseFuture: " + th);
                    return;
                case 10:
                    int i2 = ((SurfaceEdge) this.val$videoEncoderSession).mTargets;
                    if (i2 == 2 && (th instanceof CancellationException)) {
                        StringUtilsKt.d("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                        return;
                    }
                    StringUtilsKt.w("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + TargetUtils.getHumanReadableName(i2), th);
                    return;
                case 11:
                    StringUtilsKt.w("Recorder", "VideoEncoder Setup error: " + th, th);
                    SetupVideoTask setupVideoTask = (SetupVideoTask) this.this$0;
                    int i3 = setupVideoTask.mRetryCount;
                    if (i3 < setupVideoTask.mMaxRetryCount) {
                        setupVideoTask.mRetryCount = i3 + 1;
                        Preview$$ExternalSyntheticLambda0 preview$$ExternalSyntheticLambda0 = new Preview$$ExternalSyntheticLambda0(this, 19);
                        setupVideoTask.mRetryFuture = zzabp.mainThreadExecutor().schedule(new Recorder$$ExternalSyntheticLambda15(i, ((Recorder) setupVideoTask.this$0).mSequentialExecutor, preview$$ExternalSyntheticLambda0), Recorder.sRetrySetupVideoDelayMs, TimeUnit.MILLISECONDS);
                        return;
                    }
                    Recorder recorder = (Recorder) setupVideoTask.this$0;
                    synchronized (recorder.mLock) {
                        try {
                            autoValue_Recorder_RecordingRecord = null;
                            switch (recorder.mState.ordinal()) {
                                case 1:
                                case 2:
                                    AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord2 = recorder.mPendingRecordingRecord;
                                    recorder.mPendingRecordingRecord = null;
                                    autoValue_Recorder_RecordingRecord = autoValue_Recorder_RecordingRecord2;
                                case 0:
                                    recorder.setStreamId(-1);
                                    recorder.setState(State.ERROR);
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    throw new AssertionError("Encountered encoder setup error while in unexpected state " + recorder.mState + ": " + th);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (autoValue_Recorder_RecordingRecord != null) {
                        recorder.finalizePendingRecording(autoValue_Recorder_RecordingRecord, 7, th);
                        return;
                    }
                    return;
                default:
                    EncoderImpl encoderImpl = EncoderImpl.this;
                    encoderImpl.mEncodedDataSet.remove((EncodedDataImpl) this.val$videoEncoderSession);
                    if (!(th instanceof MediaCodec.CodecException)) {
                        encoderImpl.handleEncodeError(0, th.getMessage(), th);
                        return;
                    } else {
                        MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                        encoderImpl.handleEncodeError(1, codecException.getMessage(), codecException);
                        return;
                    }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0107 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:23:0x00bb, B:24:0x00c1, B:27:0x012a, B:41:0x00c6, B:42:0x00d3, B:43:0x00da, B:45:0x00de, B:47:0x00e8, B:48:0x00fb, B:50:0x00ff, B:53:0x0107, B:55:0x010c, B:56:0x0116, B:58:0x0121), top: B:22:0x00bb }] */
        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onSuccess(Object obj) {
            EncoderImpl encoderImpl;
            boolean z;
            RuntimeException runtimeException;
            AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord;
            AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord2 = null;
            boolean z2 = false;
            z2 = false;
            z2 = false;
            z2 = false;
            switch (this.$r8$classId) {
                case 0:
                    EncoderImpl encoderImpl2 = (EncoderImpl) obj;
                    Recorder recorder = (Recorder) this.this$0;
                    StringUtilsKt.d("Recorder", "VideoEncoder can be released: " + encoderImpl2);
                    if (encoderImpl2 == null) {
                        return;
                    }
                    ScheduledFuture scheduledFuture = recorder.mSourceNonStreamingTimeout;
                    if (scheduledFuture != null && scheduledFuture.cancel(false) && (encoderImpl = recorder.mVideoEncoder) != null && encoderImpl == encoderImpl2) {
                        Recorder.notifyEncoderSourceStopped(encoderImpl);
                    }
                    recorder.mVideoEncoderSessionToRelease = (VideoEncoderSession) this.val$videoEncoderSession;
                    recorder.setLatestSurface(null);
                    recorder.requestReset(false);
                    return;
                case 10:
                    SurfaceOutputImpl surfaceOutputImpl = (SurfaceOutputImpl) obj;
                    surfaceOutputImpl.getClass();
                    try {
                        ((DefaultSurfaceProcessor) ((MetadataRepo) this.this$0).mMetadataList).onOutputSurface(surfaceOutputImpl);
                        return;
                    } catch (ProcessingException e) {
                        StringUtilsKt.e("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
                        return;
                    }
                case 11:
                    EncoderImpl encoderImpl3 = (EncoderImpl) obj;
                    StringUtilsKt.d("Recorder", "VideoEncoder is created. " + encoderImpl3);
                    if (encoderImpl3 == null) {
                        return;
                    }
                    TransactorKt.checkState(null, ((Recorder) ((SetupVideoTask) this.this$0).this$0).mVideoEncoderSession == ((VideoEncoderSession) this.val$videoEncoderSession));
                    TransactorKt.checkState(null, ((Recorder) ((SetupVideoTask) this.this$0).this$0).mVideoEncoder == null);
                    Recorder recorder2 = (Recorder) ((SetupVideoTask) this.this$0).this$0;
                    VideoEncoderSession videoEncoderSession = (VideoEncoderSession) this.val$videoEncoderSession;
                    EncoderImpl encoderImpl4 = (EncoderImpl) videoEncoderSession.mVideoEncoder;
                    encoderImpl4.getClass();
                    recorder2.mVideoEncoder = encoderImpl4;
                    recorder2.mVideoEncoderBitrateRange.updateStateInternal(((VideoEncoderInfo) encoderImpl4.mEncoderInfo).getSupportedBitrateRange());
                    MediaFormat mediaFormat = recorder2.mVideoEncoder.mMediaFormat;
                    if (mediaFormat.containsKey("bitrate")) {
                        mediaFormat.getInteger("bitrate");
                    }
                    int i = 4;
                    Surface surface = videoEncoderSession.mVideoEncoderState != 4 ? null : (Surface) videoEncoderSession.mActiveSurface;
                    recorder2.mActiveSurface = surface;
                    recorder2.setLatestSurface(surface);
                    Futures.addCallback(Futures.nonCancellationPropagating((ListenableFuture) videoEncoderSession.mReadyToReleaseFuture), new AnonymousClass1(recorder2, videoEncoderSession, z2, z2 ? 1 : 0), recorder2.mSequentialExecutor);
                    Recorder recorder3 = (Recorder) ((SetupVideoTask) this.this$0).this$0;
                    synchronized (recorder3.mLock) {
                        try {
                            switch (recorder3.mState.ordinal()) {
                                case 0:
                                    recorder3.setState(State.IDLING);
                                    autoValue_Recorder_RecordingRecord = null;
                                    runtimeException = null;
                                    z = false;
                                    i = 0;
                                    break;
                                case 1:
                                    z = false;
                                    if (recorder3.mActiveRecordingRecord == null) {
                                        autoValue_Recorder_RecordingRecord = null;
                                        runtimeException = null;
                                        i = 0;
                                    } else if (recorder3.mSourceState == 3) {
                                        autoValue_Recorder_RecordingRecord = recorder3.mPendingRecordingRecord;
                                        recorder3.mPendingRecordingRecord = null;
                                        recorder3.restoreNonPendingState();
                                        runtimeException = Recorder.PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
                                    } else {
                                        runtimeException = null;
                                        i = 0;
                                        autoValue_Recorder_RecordingRecord2 = recorder3.makePendingRecordingActiveLocked(recorder3.mState);
                                        autoValue_Recorder_RecordingRecord = null;
                                    }
                                    break;
                                case 2:
                                    z = true;
                                    if (recorder3.mActiveRecordingRecord == null) {
                                    }
                                    break;
                                case 3:
                                case 7:
                                    throw new AssertionError("Incorrectly invoke onConfigured() in state " + recorder3.mState);
                                case 4:
                                    z = false;
                                    TransactorKt.checkState("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", false);
                                    autoValue_Recorder_RecordingRecord = null;
                                    runtimeException = null;
                                    i = 0;
                                    z2 = true;
                                    break;
                                case 5:
                                    z = true;
                                    TransactorKt.checkState("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", false);
                                    autoValue_Recorder_RecordingRecord = null;
                                    runtimeException = null;
                                    i = 0;
                                    z2 = true;
                                    break;
                                case 6:
                                    throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                                case 8:
                                    StringUtilsKt.e("Recorder", "onConfigured() was invoked when the Recorder had encountered error");
                                    autoValue_Recorder_RecordingRecord = null;
                                    runtimeException = null;
                                    z = false;
                                    i = 0;
                                    break;
                                default:
                                    autoValue_Recorder_RecordingRecord = null;
                                    runtimeException = null;
                                    z = false;
                                    i = 0;
                                    break;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (z2) {
                        recorder3.updateEncoderCallbacks(recorder3.mInProgressRecording, true);
                        recorder3.mVideoEncoder.start();
                        if (z) {
                            recorder3.mVideoEncoder.pause();
                            return;
                        }
                        return;
                    }
                    if (autoValue_Recorder_RecordingRecord2 != null) {
                        recorder3.startRecording(autoValue_Recorder_RecordingRecord2, z);
                        return;
                    } else {
                        if (autoValue_Recorder_RecordingRecord != null) {
                            recorder3.finalizePendingRecording(autoValue_Recorder_RecordingRecord, i, runtimeException);
                            return;
                        }
                        return;
                    }
                default:
                    EncoderImpl.this.mEncodedDataSet.remove((EncodedDataImpl) this.val$videoEncoderSession);
                    return;
            }
        }

        /* renamed from: openCamera-RzXb1QE, reason: not valid java name */
        public Unit m111openCameraRzXb1QE(String str, CameraDevice.StateCallback stateCallback) {
            CameraManager cameraManager = (CameraManager) ((Provider) this.val$videoEncoderSession).get();
            try {
                Trace.beginSection(((Object) CameraId.m46toStringimpl(str)) + "#openCamera");
                cameraManager.getClass();
                Executor executor = (Executor) ((Threads) this.this$0)._camera2Executor.getValue();
                executor.getClass();
                cameraManager.openCamera(str, executor, stateCallback);
                Trace.endSection();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }

        @Override // androidx.compose.ui.text.android.selection.SegmentFinder
        public int previousEndBoundary(int i) {
            TextPaint textPaint = (TextPaint) this.this$0;
            CharSequence charSequence = (CharSequence) this.val$videoEncoderSession;
            int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
            if (textRunCursor == -1 || ((TextPaint) this.this$0).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 2) == -1) {
                return -1;
            }
            return textRunCursor;
        }

        @Override // androidx.compose.ui.text.android.selection.SegmentFinder
        public int previousStartBoundary(int i) {
            TextPaint textPaint = (TextPaint) this.this$0;
            CharSequence charSequence = (CharSequence) this.val$videoEncoderSession;
            return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
        public boolean resume(CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0) {
            LayoutNodeSubcompositionsState.NodeState nodeState = getNodeState();
            PausedCompositionImpl pausedCompositionImpl = nodeState != null ? nodeState.pausedComposition : null;
            if (pausedCompositionImpl == null || pausedCompositionImpl.isComplete()) {
                return true;
            }
            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                return pausedCompositionImpl.resume(captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0);
            } catch (Throwable th) {
                try {
                    nodeState.getClass();
                    throw th;
                } finally {
                    zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                }
            }
        }

        public void setMotionEvent() {
            this.this$0 = null;
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public void setOnImageAvailableListener(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
            ((VideoCapture.AnonymousClass3) this.val$videoEncoderSession).setOnImageAvailableListener(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(3, this, onImageAvailableListener), executor);
        }

        public void setShadowPadding(int i, int i2, int i3, int i4) {
            CardView cardView = (CardView) this.this$0;
            cardView.mShadowBounds.set(i, i2, i3, i4);
            Rect rect = cardView.mContentPadding;
            super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        public /* synthetic */ AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        public /* synthetic */ AnonymousClass1(Object obj, Object obj2, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$videoEncoderSession = obj2;
        }

        public /* synthetic */ AnonymousClass1(Object obj, boolean z, int i) {
            this.$r8$classId = i;
            this.val$videoEncoderSession = obj;
        }

        public AnonymousClass1(AudioSpec audioSpec, Rational rational) {
            this.$r8$classId = 12;
            audioSpec.getClass();
            this.val$videoEncoderSession = audioSpec;
            this.this$0 = rational;
        }

        public AnonymousClass1(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 22:
                    break;
                case 26:
                    this.val$videoEncoderSession = Choreographer.getInstance();
                    this.this$0 = Looper.myLooper();
                    break;
                default:
                    CameraOperator$cameraOpenCallback$1 cameraOperator$cameraOpenCallback$1 = new CameraOperator$cameraOpenCallback$1();
                    cameraOperator$cameraOpenCallback$1.this$0 = AtomicFU.atomic(EmptyList.INSTANCE);
                    this.val$videoEncoderSession = cameraOperator$cameraOpenCallback$1;
                    this.this$0 = new AnonymousClass4(4);
                    break;
            }
        }

        public AnonymousClass1(View view) {
            this.$r8$classId = 1;
            this.val$videoEncoderSession = view;
            this.this$0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Threads$$ExternalSyntheticLambda1(this, 28));
        }

        public AnonymousClass1(int i, CLObject cLObject) {
            this.$r8$classId = 23;
            this.val$videoEncoderSession = cLObject;
            String str = "start";
            if (i != -2) {
                if (i == -1) {
                    str = "end";
                } else if (i == 0) {
                    str = "left";
                } else if (i != 1) {
                    android.util.Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
                } else {
                    str = "right";
                }
            }
            this.this$0 = str;
        }

        public /* synthetic */ AnonymousClass1(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.val$videoEncoderSession = obj;
            this.this$0 = obj2;
        }

        public AnonymousClass1(Provider provider, Threads threads) {
            this.$r8$classId = 6;
            provider.getClass();
            threads.getClass();
            this.val$videoEncoderSession = provider;
            this.this$0 = threads;
        }

        public AnonymousClass1(androidx.camera.camera2.adapter.CameraUseCaseAdapter cameraUseCaseAdapter) {
            this.$r8$classId = 9;
            this.val$videoEncoderSession = cameraUseCaseAdapter;
            this.this$0 = null;
        }

        public AnonymousClass1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
            this.$r8$classId = 16;
            this.val$videoEncoderSession = lazyLayoutItemContentFactory;
            MutableObjectIntMap mutableObjectIntMap = ObjectIntMapKt.EmptyObjectIntMap;
            this.this$0 = new MutableObjectIntMap();
        }

        public AnonymousClass1(ArrayList arrayList, ArrayList arrayList2) {
            this.$r8$classId = 24;
            int size = arrayList.size();
            this.val$videoEncoderSession = new int[size];
            this.this$0 = new float[size];
            for (int i = 0; i < size; i++) {
                ((int[]) this.val$videoEncoderSession)[i] = ((Integer) arrayList.get(i)).intValue();
                ((float[]) this.this$0)[i] = ((Float) arrayList2.get(i)).floatValue();
            }
        }

        public AnonymousClass1(int i, int i2) {
            this.$r8$classId = 24;
            this.val$videoEncoderSession = new int[]{i, i2};
            this.this$0 = new float[]{RecyclerView.DECELERATION_RATE, 1.0f};
        }

        public AnonymousClass1(int i, int i2, int i3) {
            this.$r8$classId = 24;
            this.val$videoEncoderSession = new int[]{i, i2, i3};
            this.this$0 = new float[]{RecyclerView.DECELERATION_RATE, 0.5f, 1.0f};
        }

        public AnonymousClass1(RegularImmutableList regularImmutableList, int[] iArr) {
            this.$r8$classId = 29;
            this.val$videoEncoderSession = ImmutableList.copyOf((Collection) regularImmutableList);
            this.this$0 = iArr;
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
        public SubcomposeLayoutState.PrecomposedSlotHandle apply() {
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = (LayoutNodeSubcompositionsState) this.val$videoEncoderSession;
            LayoutNodeSubcompositionsState.NodeState nodeState = getNodeState();
            if (nodeState != null) {
                layoutNodeSubcompositionsState.applyPausedPrecomposition(nodeState, false);
            }
            return layoutNodeSubcompositionsState.createPrecomposedSlotHandle(this.this$0);
        }
    }

    /* renamed from: androidx.camera.video.Recorder$3, reason: invalid class name */
    public final class AnonymousClass3 implements ZoomCompat, FeatureCombinationQuery, Observable, CallbackToFutureAdapter$Resolver, EncoderCallback, Supplier, FutureCallback, SnapLayoutInfoProvider, Subtitle {
        public static AnonymousClass3 sInstance;
        public final /* synthetic */ int $r8$classId;
        public Object this$0;
        public Object val$completer;
        public Object val$recordingToStart;

        public AnonymousClass3(CameraInfoInternal cameraInfoInternal, Size size) {
            Rational rational;
            this.$r8$classId = 8;
            this.val$completer = cameraInfoInternal;
            cameraInfoInternal.getSensorRotationDegrees();
            cameraInfoInternal.getLensFacing();
            if (size != null) {
                rational = new Rational(size.getWidth(), size.getHeight());
            } else {
                List supportedResolutions = cameraInfoInternal.getSupportedResolutions(256);
                if (supportedResolutions.isEmpty()) {
                    rational = null;
                } else {
                    Size size2 = (Size) Collections.max(supportedResolutions, new CompareSizesByArea(false));
                    rational = new Rational(size2.getWidth(), size2.getHeight());
                }
            }
            this.val$recordingToStart = rational;
            this.this$0 = new BlockStartImpl(cameraInfoInternal, rational);
        }

        public static Object[] compact(Object[] objArr, int[] iArr) {
            int length = objArr.length;
            Class<?> componentType = objArr.getClass().getComponentType();
            LogPrinter logPrinter = GridLayout.LOG_PRINTER;
            int i = -1;
            for (int i2 : iArr) {
                i = Math.max(i, i2);
            }
            Object[] objArr2 = (Object[]) Array.newInstance(componentType, i + 1);
            for (int i3 = 0; i3 < length; i3++) {
                objArr2[iArr[i3]] = objArr[i3];
            }
            return objArr2;
        }

        public static boolean delete(Editable editable, KeyEvent keyEvent, boolean z) {
            TypefaceEmojiSpan[] typefaceEmojiSpanArr;
            if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
                int selectionStart = Selection.getSelectionStart(editable);
                int selectionEnd = Selection.getSelectionEnd(editable);
                if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (typefaceEmojiSpanArr = (TypefaceEmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, TypefaceEmojiSpan.class)) != null && typefaceEmojiSpanArr.length > 0) {
                    for (TypefaceEmojiSpan typefaceEmojiSpan : typefaceEmojiSpanArr) {
                        int spanStart = editable.getSpanStart(typefaceEmojiSpan);
                        int spanEnd = editable.getSpanEnd(typefaceEmojiSpan);
                        if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public static AnonymousClass3 getInstance(Context context) {
            if (sInstance == null) {
                Context applicationContext = context.getApplicationContext();
                sInstance = new AnonymousClass3(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            return sInstance;
        }

        public static ArrayList getResolutionListGroupingAspectRatioKeys(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(AspectRatioUtil.ASPECT_RATIO_4_3);
            arrayList2.add(AspectRatioUtil.ASPECT_RATIO_16_9);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Size size = (Size) it.next();
                Rational rational = new Rational(size.getWidth(), size.getHeight());
                if (!arrayList2.contains(rational)) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            arrayList2.add(rational);
                            break;
                        }
                        if (AspectRatioUtil.hasMatchingAspectRatio(size, (Rational) it2.next(), SizeUtil.RESOLUTION_VGA)) {
                            break;
                        }
                    }
                }
            }
            return arrayList2;
        }

        public static Rational getTargetAspectRatioRationalValue(int i, boolean z) {
            if (i == -1 || i == 0) {
                return z ? AspectRatioUtil.ASPECT_RATIO_4_3 : AspectRatioUtil.ASPECT_RATIO_3_4;
            }
            if (i == 1) {
                return z ? AspectRatioUtil.ASPECT_RATIO_16_9 : AspectRatioUtil.ASPECT_RATIO_9_16;
            }
            StringUtilsKt.e("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
            return null;
        }

        public static HashMap groupSizesByAspectRatio(ArrayList arrayList) {
            HashMap hashMap = new HashMap();
            Iterator it = getResolutionListGroupingAspectRatioKeys(arrayList).iterator();
            while (it.hasNext()) {
                hashMap.put((Rational) it.next(), new ArrayList());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Size size = (Size) it2.next();
                for (Rational rational : hashMap.keySet()) {
                    if (AspectRatioUtil.hasMatchingAspectRatio(size, rational, SizeUtil.RESOLUTION_VGA)) {
                        ((List) hashMap.get(rational)).add(size);
                    }
                }
            }
            return hashMap;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
        
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
        
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
        
            if (r11 != false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
        
            if (r10 != (-1)) goto L70;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean handleDeleteSurroundingText(EmojiInputConnection emojiInputConnection, Editable editable, int i, int i2, boolean z) {
            int min;
            if (editable != null && i >= 0 && i2 >= 0) {
                int selectionStart = Selection.getSelectionStart(editable);
                int selectionEnd = Selection.getSelectionEnd(editable);
                if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                    if (z) {
                        int max = Math.max(i, 0);
                        int length = editable.length();
                        if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                            loop0: while (true) {
                                boolean z2 = false;
                                while (true) {
                                    if (max == 0) {
                                        break loop0;
                                    }
                                    selectionStart--;
                                    if (selectionStart >= 0) {
                                        char charAt = editable.charAt(selectionStart);
                                        if (z2) {
                                            break;
                                        }
                                        if (!Character.isSurrogate(charAt)) {
                                            max--;
                                        } else {
                                            if (Character.isHighSurrogate(charAt)) {
                                                break loop0;
                                            }
                                            z2 = true;
                                        }
                                    } else if (!z2) {
                                        selectionStart = 0;
                                    }
                                }
                                max--;
                            }
                        }
                        selectionStart = -1;
                        int max2 = Math.max(i2, 0);
                        min = editable.length();
                        if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                            loop2: while (true) {
                                boolean z3 = false;
                                while (true) {
                                    if (max2 == 0) {
                                        min = selectionEnd;
                                        break loop2;
                                    }
                                    if (selectionEnd < min) {
                                        char charAt2 = editable.charAt(selectionEnd);
                                        if (z3) {
                                            break;
                                        }
                                        if (!Character.isSurrogate(charAt2)) {
                                            max2--;
                                            selectionEnd++;
                                        } else {
                                            if (Character.isLowSurrogate(charAt2)) {
                                                break loop2;
                                            }
                                            selectionEnd++;
                                            z3 = true;
                                        }
                                    }
                                }
                                max2--;
                                selectionEnd++;
                            }
                        }
                        min = -1;
                        if (selectionStart != -1) {
                        }
                    } else {
                        selectionStart = Math.max(selectionStart - i, 0);
                        min = Math.min(selectionEnd + i2, editable.length());
                    }
                    TypefaceEmojiSpan[] typefaceEmojiSpanArr = (TypefaceEmojiSpan[]) editable.getSpans(selectionStart, min, TypefaceEmojiSpan.class);
                    if (typefaceEmojiSpanArr != null && typefaceEmojiSpanArr.length > 0) {
                        for (TypefaceEmojiSpan typefaceEmojiSpan : typefaceEmojiSpanArr) {
                            int spanStart = editable.getSpanStart(typefaceEmojiSpan);
                            int spanEnd = editable.getSpanEnd(typefaceEmojiSpan);
                            selectionStart = Math.min(spanStart, selectionStart);
                            min = Math.max(spanEnd, min);
                        }
                        int max3 = Math.max(selectionStart, 0);
                        int min2 = Math.min(min, editable.length());
                        emojiInputConnection.beginBatchEdit();
                        editable.delete(max3, min2);
                        emojiInputConnection.endBatchEdit();
                        return true;
                    }
                }
            }
            return false;
        }

        public static void sortSupportedSizesByFallbackRuleClosestHigherThenLower(List list, Size size, boolean z) {
            ArrayList arrayList = new ArrayList();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                Size size3 = (Size) list.get(size2);
                if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                    break;
                }
                arrayList.add(0, size3);
            }
            list.removeAll(arrayList);
            Collections.reverse(list);
            if (z) {
                list.addAll(arrayList);
            }
        }

        public static void sortSupportedSizesByFallbackRuleClosestLowerThenHigher(List list, Size size, boolean z) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Size size2 = (Size) list.get(i);
                if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                    break;
                }
                arrayList.add(0, size2);
            }
            list.removeAll(arrayList);
            if (z) {
                list.addAll(arrayList);
            }
        }

        @Override // androidx.camera.core.impl.Observable
        public void addObserver(Executor executor, Observable.Observer observer) {
            synchronized (((HashMap) this.val$recordingToStart)) {
                boolean isEmpty = ((HashMap) this.val$recordingToStart).isEmpty();
                ((HashMap) this.val$recordingToStart).put(observer, executor);
                if (isEmpty) {
                    zzabp.mainThreadExecutor().execute(new LiveDataObservable$$ExternalSyntheticLambda2(this, 1));
                } else {
                    executor.execute(new CameraX$$ExternalSyntheticLambda2(25, this, observer));
                }
            }
        }

        @Override // androidx.camera.camera2.compat.ZoomCompat
        public Deferred applyAsync(float f, UseCaseCameraRequestControl useCaseCameraRequestControl) {
            useCaseCameraRequestControl.getClass();
            Rect rect = (Rect) this.this$0;
            if (Math.abs(f) < Math.ulp(Math.abs(f)) * 2.0d) {
                if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                    android.util.Log.w("CXCP", "ZoomCompat: Invalid zoom ratio of 0.0f passed in, defaulting to 1.0f");
                }
                f = 1.0f;
            }
            float width = rect.width() / f;
            float height = rect.height() / f;
            float width2 = (rect.width() - width) / 2.0f;
            float height2 = (rect.height() - height) / 2.0f;
            Rect rect2 = new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
            this.val$recordingToStart = rect2;
            return UseCaseCameraRequestControl.setParametersAsync$default(useCaseCameraRequestControl, MapsKt__MapsJVMKt.mapOf(new kotlin.Pair(CaptureRequest.SCALER_CROP_REGION, rect2)));
        }

        public CLElement asCLElement() {
            Dp dp = (Dp) this.val$completer;
            if (dp != null) {
                return new CLNumber(dp.value);
            }
            String str = (String) this.val$recordingToStart;
            if (str != null) {
                return CLString.from(str);
            }
            android.util.Log.e("CCL", "DimensionDescription: Null value & symbol for " + ((String) this.this$0) + ". Using WrapContent.");
            return CLString.from("wrap");
        }

        @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
        public Object attachCompleter(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
            callbackToFutureAdapter$Completer.addCancellationListener(new Client.AnonymousClass7(this, 6), zzabp.directExecutor());
            ((HandlerScheduledExecutorService.HandlerScheduledFuture) this.this$0).mCompleter.set(callbackToFutureAdapter$Completer);
            return "HandlerScheduledFuture-" + ((Callable) this.val$recordingToStart).toString();
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
        public float calculateApproachOffset(float f, float f2) {
            switch (this.$r8$classId) {
                case 12:
                    return RecyclerView.DECELERATION_RATE;
                default:
                    PagerState pagerState = (PagerState) this.val$completer;
                    int pageSize$foundation = pagerState.getPageSize$foundation();
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = pagerState.pagerLayoutInfoState;
                    int i = ((PagerMeasureResult) parcelableSnapshotMutableState.getValue()).pageSpacing + pageSize$foundation;
                    if (i == 0) {
                        return RecyclerView.DECELERATION_RATE;
                    }
                    int i2 = pagerState.firstVisiblePage;
                    if (f < RecyclerView.DECELERATION_RATE) {
                        i2++;
                    }
                    int coerceIn = RangesKt___RangesKt.coerceIn(((int) (f2 / i)) + i2, 0, pagerState.getPageCount());
                    PagerSnapDistanceMaxPages pagerSnapDistanceMaxPages = (PagerSnapDistanceMaxPages) this.this$0;
                    pagerState.getPageSize$foundation();
                    int i3 = ((PagerMeasureResult) parcelableSnapshotMutableState.getValue()).pageSpacing;
                    long j = i2;
                    long j2 = pagerSnapDistanceMaxPages.pagesLimit;
                    long j3 = j - j2;
                    if (j3 < 0) {
                        j3 = 0;
                    }
                    int i4 = (int) j3;
                    long j4 = j + j2;
                    if (j4 > 2147483647L) {
                        j4 = 2147483647L;
                    }
                    int abs = Math.abs((RangesKt___RangesKt.coerceIn(RangesKt___RangesKt.coerceIn(coerceIn, i4, (int) j4), 0, pagerState.getPageCount()) - i2) * i) - i;
                    int i5 = abs >= 0 ? abs : 0;
                    if (i5 == 0) {
                        return i5;
                    }
                    return Math.signum(f) * i5;
            }
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
        public float calculateSnapOffset(float f) {
            switch (this.$r8$classId) {
                case 12:
                    AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) this.val$completer;
                    float requireOffset = anchoredDraggableState.requireOffset();
                    Object access$computeTarget = Draggable2DKt.access$computeTarget(anchoredDraggableState.getAnchors(), requireOffset, f, (Function1) this.val$recordingToStart, (ModalBottomSheetState$$ExternalSyntheticLambda1) this.this$0);
                    if (!((Boolean) anchoredDraggableState.confirmValueChange.invoke(access$computeTarget)).booleanValue()) {
                        access$computeTarget = anchoredDraggableState.settledValue$delegate.getValue();
                    }
                    return anchoredDraggableState.getAnchors().positionOf(access$computeTarget) - requireOffset;
                default:
                    PagerState pagerState = (PagerState) this.val$completer;
                    SnapPosition$Start snapPosition$Start = pagerState.getLayoutInfo().snapPosition;
                    List list = pagerState.getLayoutInfo().visiblePagesInfo;
                    int size = list.size();
                    float f2 = Float.POSITIVE_INFINITY;
                    float f3 = Float.NEGATIVE_INFINITY;
                    for (int i = 0; i < size; i++) {
                        MeasuredPage measuredPage = (MeasuredPage) list.get(i);
                        int mainAxisViewportSize = PagerLayoutInfoKt.getMainAxisViewportSize(pagerState.getLayoutInfo());
                        int i2 = -pagerState.getLayoutInfo().viewportStartOffset;
                        int i3 = pagerState.getLayoutInfo().afterContentPadding;
                        int i4 = pagerState.getLayoutInfo().pageSize;
                        int i5 = measuredPage.offset;
                        pagerState.getPageCount();
                        float position = i5 - snapPosition$Start.position(mainAxisViewportSize, i4, i2, i3);
                        if (position <= RecyclerView.DECELERATION_RATE && position > f3) {
                            f3 = position;
                        }
                        if (position >= RecyclerView.DECELERATION_RATE && position < f2) {
                            f2 = position;
                        }
                    }
                    if (f3 == Float.NEGATIVE_INFINITY) {
                        f3 = f2;
                    }
                    if (f2 == Float.POSITIVE_INFINITY) {
                        f2 = f3;
                    }
                    if (!pagerState.getCanScrollForward()) {
                        if (zzaco.isScrollingForward(pagerState, f)) {
                            f3 = 0.0f;
                            f2 = 0.0f;
                        } else {
                            f2 = 0.0f;
                        }
                    }
                    if (!pagerState.getCanScrollBackward()) {
                        f3 = 0.0f;
                        if (!zzaco.isScrollingForward(pagerState, f)) {
                            f2 = 0.0f;
                        }
                    }
                    Float valueOf = Float.valueOf(f3);
                    Float valueOf2 = Float.valueOf(f2);
                    float floatValue = valueOf.floatValue();
                    float floatValue2 = valueOf2.floatValue();
                    float floatValue3 = ((Number) ((PagerDefaults$$ExternalSyntheticLambda0) this.val$recordingToStart).invoke(Float.valueOf(f), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
                    if (floatValue3 != floatValue && floatValue3 != floatValue2 && floatValue3 != RecyclerView.DECELERATION_RATE) {
                        InlineClassHelperKt.throwIllegalStateException("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0");
                    }
                    return (floatValue3 == Float.POSITIVE_INFINITY || floatValue3 == Float.NEGATIVE_INFINITY) ? RecyclerView.DECELERATION_RATE : floatValue3;
            }
        }

        @Override // androidx.camera.core.impl.Observable
        public ListenableFuture fetchData() {
            return DBUtil.getFuture(new StreamSharing$$ExternalSyntheticLambda1(this, 9));
        }

        @Override // androidx.core.util.Supplier
        public Object get() {
            ((AudioSpec) this.val$completer).getClass();
            StringUtilsKt.d("AudioConfigUtil", "Using default AUDIO source: 5");
            StringUtilsKt.d("AudioConfigUtil", "Using default AUDIO source format: 2");
            AutoValue_EncoderProfilesProxy_AudioProfileProxy autoValue_EncoderProfilesProxy_AudioProfileProxy = (AutoValue_EncoderProfilesProxy_AudioProfileProxy) this.val$recordingToStart;
            int i = autoValue_EncoderProfilesProxy_AudioProfileProxy.channels;
            StringUtilsKt.d("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + i);
            int i2 = autoValue_EncoderProfilesProxy_AudioProfileProxy.sampleRate;
            CaptureEncodeRates resolveSampleRates$camera_video = AudioConfigUtil.resolveSampleRates$camera_video(i2, i, (Rational) this.this$0);
            StringBuilder sb = new StringBuilder("Using resolved AUDIO sample rate or nearest supported from AudioProfile: Capture sample rate: ");
            int i3 = resolveSampleRates$camera_video.captureRate;
            sb.append(i3);
            sb.append("Hz. Encode sample rate: ");
            int i4 = resolveSampleRates$camera_video.encodeRate;
            StringUtilsKt.d("AudioSrcAdPrflRslvr", Recorder$$ExternalSyntheticOutline1.m(i4, i2, "Hz. [AudioProfile sample rate: ", "Hz]", sb));
            List list = AutoValue_AudioSettings.COMMON_SAMPLE_RATES;
            JWECryptoParts jWECryptoParts = new JWECryptoParts();
            jWECryptoParts.header = -1;
            jWECryptoParts.encryptedKey = -1;
            jWECryptoParts.iv = -1;
            jWECryptoParts.cipherText = -1;
            jWECryptoParts.authenticationTag = -1;
            jWECryptoParts.header = 5;
            jWECryptoParts.authenticationTag = 2;
            jWECryptoParts.cipherText = Integer.valueOf(i);
            jWECryptoParts.encryptedKey = Integer.valueOf(i3);
            jWECryptoParts.iv = Integer.valueOf(i4);
            return jWECryptoParts.m2170build();
        }

        @Override // androidx.camera.camera2.compat.ZoomCompat
        public Rect getCropSensorRegion() {
            Rect rect = (Rect) this.val$recordingToStart;
            return rect == null ? (Rect) this.this$0 : rect;
        }

        @Override // androidx.media3.extractor.text.Subtitle
        public List getCues(long j) {
            List list = (List) this.val$completer;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                long[] jArr = (long[]) this.val$recordingToStart;
                int i2 = i * 2;
                if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                    WebvttCueInfo webvttCueInfo = (WebvttCueInfo) list.get(i);
                    Cue cue = webvttCueInfo.cue;
                    if (cue.line == -3.4028235E38f) {
                        arrayList2.add(webvttCueInfo);
                    } else {
                        arrayList.add(cue);
                    }
                }
            }
            Collections.sort(arrayList2, new ng$$ExternalSyntheticLambda0(19));
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                Cue.Builder buildUpon = ((WebvttCueInfo) arrayList2.get(i3)).cue.buildUpon();
                buildUpon.line = (-1) - i3;
                buildUpon.lineType = 1;
                arrayList.add(buildUpon.build());
            }
            return arrayList;
        }

        public long getCurrentInputPosition() {
            DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) this.this$0;
            if (defaultExtractorInput != null) {
                return defaultExtractorInput.position;
            }
            return -1L;
        }

        public int getEmojiMatch(String str) {
            MetadataRepo metadataRepo = (MetadataRepo) this.val$recordingToStart;
            int metadataVersion = metadataRepo.getMetadataVersion();
            zzei zzeiVar = new zzei((MetadataRepo.Node) metadataRepo.mRootNode);
            int length = str.length();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int codePointAt = Character.codePointAt(str, i);
                int check = zzeiVar.check(codePointAt);
                TypefaceEmojiRasterizer typefaceEmojiRasterizer = ((MetadataRepo.Node) zzeiVar.zza).mData;
                if (check == 1) {
                    i += Character.charCount(codePointAt);
                    i3 = 0;
                } else if (check == 2) {
                    i += Character.charCount(codePointAt);
                } else if (check == 3) {
                    typefaceEmojiRasterizer = ((MetadataRepo.Node) zzeiVar.zzb).mData;
                    if (typefaceEmojiRasterizer.getCompatAdded() <= metadataVersion) {
                        i2++;
                    }
                }
                if (typefaceEmojiRasterizer != null && typefaceEmojiRasterizer.getCompatAdded() <= metadataVersion) {
                    i3++;
                }
            }
            if (i2 == 0) {
                if (zzeiVar.zzb$1 == 2 && ((MetadataRepo.Node) zzeiVar.zza).mData != null && ((zzeiVar.zzc > 1 || zzeiVar.shouldUseEmojiPresentationStyleForSingleCodepoint()) && ((MetadataRepo.Node) zzeiVar.zza).mData.getCompatAdded() <= metadataVersion)) {
                    return 1;
                }
                if (i3 == 0) {
                    return 0;
                }
            }
            return 2;
        }

        public int getEmojiStart(int i, CharSequence charSequence) {
            if (i < 0 || i >= charSequence.length()) {
                return -1;
            }
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                TypefaceEmojiSpan[] typefaceEmojiSpanArr = (TypefaceEmojiSpan[]) spanned.getSpans(i, i + 1, TypefaceEmojiSpan.class);
                if (typefaceEmojiSpanArr.length > 0) {
                    return spanned.getSpanStart(typefaceEmojiSpanArr[0]);
                }
            }
            return ((EmojiProcessor$EmojiProcessLookupCallback) process(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new EmojiProcessor$EmojiProcessLookupCallback(i))).start;
        }

        @Override // androidx.media3.extractor.text.Subtitle
        public long getEventTime(int i) {
            long[] jArr = (long[]) this.this$0;
            androidx.tracing.Trace.checkArgument(i >= 0);
            androidx.tracing.Trace.checkArgument(i < jArr.length);
            return jArr[i];
        }

        @Override // androidx.media3.extractor.text.Subtitle
        public int getEventTimeCount() {
            return ((long[]) this.this$0).length;
        }

        public int getFirstVisibleLineIndex() {
            if (getLayoutInfo().visiblePagesInfo.isEmpty()) {
                return -1;
            }
            long j = ((MeasuredPage) CollectionsKt.first(getLayoutInfo().visiblePagesInfo)).index - getLayoutInfo().beyondViewportPageCount;
            if (j < 0) {
                j = 0;
            }
            return (int) j;
        }

        public boolean getHasVisibleItems() {
            return !getLayoutInfo().visiblePagesInfo.isEmpty();
        }

        public int getLastVisibleLineIndex() {
            if (getLayoutInfo().visiblePagesInfo.isEmpty()) {
                return -1;
            }
            long j = ((MeasuredPage) CollectionsKt.last(getLayoutInfo().visiblePagesInfo)).index + getLayoutInfo().beyondViewportPageCount;
            long totalItemsCount = getTotalItemsCount() - 1;
            if (j > totalItemsCount) {
                j = totalItemsCount;
            }
            return (int) j;
        }

        public PagerMeasureResult getLayoutInfo() {
            PagerMeasureResult pagerMeasureResult = (PagerMeasureResult) this.val$recordingToStart;
            if (pagerMeasureResult != null) {
                return pagerMeasureResult;
            }
            Intrinsics.throwUninitializedPropertyAccessException("layoutInfo");
            throw null;
        }

        public int getMainAxisExtraSpaceEnd() {
            if (getLayoutInfo().visiblePagesInfo.isEmpty()) {
                return 0;
            }
            return Math.abs(((((MeasuredPage) CollectionsKt.last(getLayoutInfo().visiblePagesInfo)).offset + getLayoutInfo().pageSize) + getLayoutInfo().pageSpacing) - getLayoutInfo().viewportEndOffset);
        }

        public int getMainAxisExtraSpaceStart() {
            if (getLayoutInfo().visiblePagesInfo.isEmpty()) {
                return 0;
            }
            int i = ((MeasuredPage) CollectionsKt.first(getLayoutInfo().visiblePagesInfo)).offset + (-getLayoutInfo().viewportStartOffset);
            return Math.abs(i <= 0 ? i : 0);
        }

        @Override // androidx.camera.camera2.compat.ZoomCompat
        public float getMaxZoomRatio() {
            CameraMetadata cameraMetadata = ((CameraPipeCameraProperties) this.val$completer).metadata;
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
            key.getClass();
            Object valueOf = Float.valueOf(1.0f);
            Camera2CameraMetadata camera2CameraMetadata = (Camera2CameraMetadata) cameraMetadata;
            camera2CameraMetadata.getClass();
            Object obj = camera2CameraMetadata.get(key);
            if (obj != null) {
                valueOf = obj;
            }
            Float f = (Float) valueOf;
            float floatValue = f.floatValue();
            if (Math.abs(floatValue) >= Math.ulp(Math.abs(floatValue)) * 2.0d) {
                return f.floatValue();
            }
            if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                android.util.Log.w("CXCP", "Invalid max zoom ratio of " + f + " detected, defaulting to 1.0f");
            }
            return 1.0f;
        }

        @Override // androidx.camera.camera2.compat.ZoomCompat
        public float getMinZoomRatio() {
            return 1.0f;
        }

        @Override // androidx.media3.extractor.text.Subtitle
        public int getNextEventTimeIndex(long j) {
            long[] jArr = (long[]) this.this$0;
            int binarySearchCeil = Util.binarySearchCeil(jArr, j, false);
            if (binarySearchCeil < jArr.length) {
                return binarySearchCeil;
            }
            return -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x020b  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ArrayList getSortedSupportedOutputSizes(UseCaseConfig useCaseConfig) {
            Size[] sizeArr;
            Size size;
            int area;
            Size size2;
            Iterator it;
            Rational rational;
            CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) this.val$completer;
            ImageOutputConfig imageOutputConfig = (ImageOutputConfig) useCaseConfig;
            List list = (List) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, null);
            ArrayList arrayList = list != null ? new ArrayList(list) : null;
            if (arrayList != null) {
                return arrayList;
            }
            ResolutionSelector resolutionSelector = (ResolutionSelector) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, null);
            List<Pair> list2 = (List) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, null);
            int inputFormat = useCaseConfig.getInputFormat();
            if (list2 != null) {
                for (Pair pair : list2) {
                    if (((Integer) pair.first).intValue() == inputFormat) {
                        sizeArr = (Size[]) pair.second;
                        break;
                    }
                }
            }
            sizeArr = null;
            List asList = sizeArr == null ? null : Arrays.asList(sizeArr);
            if (asList == null) {
                asList = cameraInfoInternal.getSupportedResolutions(inputFormat);
            }
            ArrayList arrayList2 = new ArrayList(asList);
            Collections.sort(arrayList2, new CompareSizesByArea(true));
            if (arrayList2.isEmpty()) {
                StringUtilsKt.w("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + inputFormat + ".");
            }
            if (resolutionSelector != null) {
                Size size3 = (Size) ((ImageOutputConfig) useCaseConfig).retrieveOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, null);
                imageOutputConfig.getTargetRotation(0);
                if (!((Boolean) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, Boolean.FALSE)).booleanValue()) {
                    useCaseConfig.getInputFormat();
                }
                StringUtilsKt.d("SupportedOutputSizesCollector", "useCaseConfig = " + useCaseConfig + ", candidateSizes = " + arrayList2);
                ResolutionSelector resolutionSelector2 = (ResolutionSelector) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR);
                Rational rational2 = (Rational) this.val$recordingToStart;
                AspectRatioStrategy aspectRatioStrategy = resolutionSelector2.mAspectRatioStrategy;
                HashMap groupSizesByAspectRatio = groupSizesByAspectRatio(arrayList2);
                boolean z = rational2 == null || rational2.getNumerator() >= rational2.getDenominator();
                aspectRatioStrategy.getClass();
                Rational targetAspectRatioRationalValue = getTargetAspectRatioRationalValue(0, z);
                ArrayList arrayList3 = new ArrayList(groupSizesByAspectRatio.keySet());
                Collections.sort(arrayList3, new AspectRatioUtil.CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(targetAspectRatioRationalValue, rational2));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Rational rational3 = (Rational) it2.next();
                    linkedHashMap.put(rational3, (List) groupSizesByAspectRatio.get(rational3));
                }
                if (size3 != null) {
                    Size size4 = SizeUtil.RESOLUTION_ZERO;
                    int height = size3.getHeight() * size3.getWidth();
                    Iterator it3 = linkedHashMap.keySet().iterator();
                    while (it3.hasNext()) {
                        List<Size> list3 = (List) linkedHashMap.get((Rational) it3.next());
                        ArrayList arrayList4 = new ArrayList();
                        for (Size size5 : list3) {
                            if (SizeUtil.getArea(size5) <= height) {
                                arrayList4.add(size5);
                            }
                        }
                        list3.clear();
                        list3.addAll(arrayList4);
                    }
                }
                ResolutionStrategy resolutionStrategy = resolutionSelector2.mResolutionStrategy;
                if (resolutionStrategy != null) {
                    Iterator it4 = linkedHashMap.keySet().iterator();
                    while (it4.hasNext()) {
                        List list4 = (List) linkedHashMap.get((Rational) it4.next());
                        if (!list4.isEmpty()) {
                            int i = resolutionStrategy.mFallbackRule;
                            if (resolutionStrategy != ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY) {
                                Size size6 = resolutionStrategy.mBoundSize;
                                if (i == 0) {
                                    boolean contains = list4.contains(size6);
                                    list4.clear();
                                    if (contains) {
                                        list4.add(size6);
                                    }
                                } else if (i == 1) {
                                    sortSupportedSizesByFallbackRuleClosestHigherThenLower(list4, size6, true);
                                } else if (i == 2) {
                                    sortSupportedSizesByFallbackRuleClosestHigherThenLower(list4, size6, false);
                                } else if (i == 3) {
                                    sortSupportedSizesByFallbackRuleClosestLowerThenHigher(list4, size6, true);
                                } else if (i == 4) {
                                    sortSupportedSizesByFallbackRuleClosestLowerThenHigher(list4, size6, false);
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = linkedHashMap.values().iterator();
                while (it5.hasNext()) {
                    for (Size size7 : (List) it5.next()) {
                        if (!arrayList5.contains(size7)) {
                            arrayList5.add(size7);
                        }
                    }
                }
                return arrayList5;
            }
            BlockStartImpl blockStartImpl = (BlockStartImpl) this.this$0;
            blockStartImpl.getClass();
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            ArrayList arrayList6 = new ArrayList(arrayList2);
            Collections.sort(arrayList6, new CompareSizesByArea(true));
            ArrayList arrayList7 = new ArrayList();
            ImageOutputConfig imageOutputConfig2 = (ImageOutputConfig) useCaseConfig;
            Size size8 = (Size) imageOutputConfig2.retrieveOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, null);
            Size size9 = (Size) arrayList6.get(0);
            if (size8 != null) {
                if (SizeUtil.getArea(size9) >= size8.getHeight() * size8.getWidth()) {
                    size = size8;
                    Size targetSize = blockStartImpl.getTargetSize(imageOutputConfig2);
                    Size size10 = SizeUtil.RESOLUTION_VGA;
                    area = SizeUtil.getArea(size10);
                    if (SizeUtil.getArea(size) >= area) {
                        size10 = SizeUtil.RESOLUTION_ZERO;
                    } else if (targetSize != null) {
                        if (targetSize.getHeight() * targetSize.getWidth() < area) {
                            size2 = targetSize;
                            it = arrayList6.iterator();
                            while (it.hasNext()) {
                                Size size11 = (Size) it.next();
                                if (SizeUtil.getArea(size11) <= size.getHeight() * size.getWidth()) {
                                    if (size11.getHeight() * size11.getWidth() >= SizeUtil.getArea(size2) && !arrayList7.contains(size11)) {
                                        arrayList7.add(size11);
                                    }
                                }
                            }
                            if (arrayList7.isEmpty()) {
                                AesGcmSiv$$ExternalSyntheticLambda0.m("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = ", size2, "\nmaxSize = ", size, "\ninitial size list: ", arrayList6);
                                return null;
                            }
                            AutoValue_Config_Option autoValue_Config_Option = ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO;
                            if (imageOutputConfig2.containsOption(autoValue_Config_Option)) {
                                rational = getTargetAspectRatioRationalValue(((Integer) imageOutputConfig2.retrieveOption(autoValue_Config_Option)).intValue(), blockStartImpl.replaceActiveBlockParser);
                            } else {
                                Size targetSize2 = blockStartImpl.getTargetSize(imageOutputConfig2);
                                if (targetSize2 != null) {
                                    Iterator it6 = getResolutionListGroupingAspectRatioKeys(arrayList7).iterator();
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            rational = new Rational(targetSize2.getWidth(), targetSize2.getHeight());
                                            break;
                                        }
                                        Rational rational4 = (Rational) it6.next();
                                        if (AspectRatioUtil.hasMatchingAspectRatio(targetSize2, rational4, SizeUtil.RESOLUTION_VGA)) {
                                            rational = rational4;
                                            break;
                                        }
                                    }
                                } else {
                                    rational = null;
                                }
                            }
                            if (targetSize == null) {
                                targetSize = (Size) imageOutputConfig2.retrieveOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, null);
                            }
                            ArrayList arrayList8 = new ArrayList();
                            new HashMap();
                            if (rational == null) {
                                arrayList8.addAll(arrayList7);
                                if (targetSize != null) {
                                    sortSupportedSizesByFallbackRuleClosestHigherThenLower(arrayList8, targetSize, true);
                                    return arrayList8;
                                }
                            } else {
                                HashMap groupSizesByAspectRatio2 = groupSizesByAspectRatio(arrayList7);
                                if (targetSize != null) {
                                    Iterator it7 = groupSizesByAspectRatio2.keySet().iterator();
                                    while (it7.hasNext()) {
                                        sortSupportedSizesByFallbackRuleClosestHigherThenLower((List) groupSizesByAspectRatio2.get((Rational) it7.next()), targetSize, true);
                                    }
                                }
                                ArrayList arrayList9 = new ArrayList(groupSizesByAspectRatio2.keySet());
                                Collections.sort(arrayList9, new AspectRatioUtil.CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(rational, (Rational) blockStartImpl.blockParsers));
                                Iterator it8 = arrayList9.iterator();
                                while (it8.hasNext()) {
                                    for (Size size12 : (List) groupSizesByAspectRatio2.get((Rational) it8.next())) {
                                        if (!arrayList8.contains(size12)) {
                                            arrayList8.add(size12);
                                        }
                                    }
                                }
                            }
                            return arrayList8;
                        }
                    }
                    size2 = size10;
                    it = arrayList6.iterator();
                    while (it.hasNext()) {
                    }
                    if (arrayList7.isEmpty()) {
                    }
                }
            }
            size = size9;
            Size targetSize3 = blockStartImpl.getTargetSize(imageOutputConfig2);
            Size size102 = SizeUtil.RESOLUTION_VGA;
            area = SizeUtil.getArea(size102);
            if (SizeUtil.getArea(size) >= area) {
            }
            size2 = size102;
            it = arrayList6.iterator();
            while (it.hasNext()) {
            }
            if (arrayList7.isEmpty()) {
            }
        }

        public int getTotalItemsCount() {
            return ((Number) ((PagerState$$ExternalSyntheticLambda1) this.val$completer).invoke()).intValue();
        }

        public Typeface getTypeface() {
            Object obj = this.this$0;
            obj.getClass();
            return (Typeface) obj;
        }

        public boolean hasGlyph(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if ((typefaceEmojiRasterizer.mCache & 3) == 0) {
                DefaultGlyphChecker defaultGlyphChecker = (DefaultGlyphChecker) this.this$0;
                MetadataItem metadataItem = typefaceEmojiRasterizer.getMetadataItem();
                int __offset = metadataItem.__offset(8);
                if (__offset != 0) {
                    metadataItem.bb.getShort(__offset + metadataItem.bb_pos);
                }
                defaultGlyphChecker.getClass();
                ThreadLocal threadLocal = DefaultGlyphChecker.sStringBuilder;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb = (StringBuilder) threadLocal.get();
                sb.setLength(0);
                while (i < i2) {
                    sb.append(charSequence.charAt(i));
                    i++;
                }
                boolean hasGlyph = defaultGlyphChecker.mTextPaint.hasGlyph(sb.toString());
                int i3 = typefaceEmojiRasterizer.mCache & 4;
                typefaceEmojiRasterizer.mCache = hasGlyph ? i3 | 2 : i3 | 1;
            }
            return (typefaceEmojiRasterizer.mCache & 3) == 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
        
            if (r1.position != r11) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
        
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
        
            if (r1.position != r11) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void init(DataSource dataSource, Uri uri, Map map, long j, long j2, ProgressiveMediaPeriod progressiveMediaPeriod) {
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, j, j2);
            this.this$0 = defaultExtractorInput;
            if (((Extractor) this.val$recordingToStart) != null) {
                return;
            }
            Extractor[] createExtractors = ((ExtractorsFactory) this.val$completer).createExtractors(uri, map);
            ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(createExtractors.length);
            boolean z = true;
            if (createExtractors.length == 1) {
                this.val$recordingToStart = createExtractors[0];
            } else {
                int length = createExtractors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Extractor extractor = createExtractors[i];
                    try {
                    } catch (EOFException unused) {
                        if (((Extractor) this.val$recordingToStart) == null) {
                        }
                    } catch (Throwable th) {
                        if (((Extractor) this.val$recordingToStart) == null && defaultExtractorInput.position != j) {
                            z = false;
                        }
                        androidx.tracing.Trace.checkState(z);
                        defaultExtractorInput.peekBufferPosition = 0;
                        throw th;
                    }
                    if (extractor.sniff(defaultExtractorInput)) {
                        this.val$recordingToStart = extractor;
                        defaultExtractorInput.peekBufferPosition = 0;
                        break;
                    }
                    builderWithExpectedSize.addAll(extractor.getSniffFailureDetails());
                    if (((Extractor) this.val$recordingToStart) == null) {
                    }
                    boolean z2 = true;
                    androidx.tracing.Trace.checkState(z2);
                    defaultExtractorInput.peekBufferPosition = 0;
                    i++;
                }
                if (((Extractor) this.val$recordingToStart) == null) {
                    String str = "None of the available extractors (" + new Joiner(", ").join(Maps.transform(ImmutableList.copyOf(createExtractors), new Format$$ExternalSyntheticLambda1(3)).iterator()) + ") could read the stream.";
                    uri.getClass();
                    throw new UnrecognizedInputFormatException(str, builderWithExpectedSize.build());
                }
            }
            ((Extractor) this.val$recordingToStart).init(progressiveMediaPeriod);
        }

        public boolean isStaleResolvedFont() {
            if (((androidx.compose.runtime.State) this.val$completer).getValue() != this.this$0) {
                return true;
            }
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) this.val$recordingToStart;
            return anonymousClass3 != null && anonymousClass3.isStaleResolvedFont();
        }

        @Override // androidx.camera.core.featuregroup.impl.FeatureCombinationQuery
        public boolean isSupported(SessionConfig sessionConfig) {
            CameraCallbackMap cameraCallbackMap = new CameraCallbackMap();
            ComboRequestListener comboRequestListener = new ComboRequestListener();
            CameraMetadata cameraMetadata = (CameraMetadata) this.val$completer;
            n.a aVar = new n.a(((Camera2CameraMetadata) cameraMetadata).camera, 1);
            CameraQuirks cameraQuirks = (CameraQuirks) this.this$0;
            CameraGraphConfigProvider cameraGraphConfigProvider = new CameraGraphConfigProvider(cameraCallbackMap, comboRequestListener, aVar, cameraQuirks, new ZslControlNoOpImpl(), new SharedModule(cameraQuirks.getQuirks()), cameraMetadata, null, null);
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return ((Boolean) JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new VirtualCameraState$connect$2$1(this, cameraGraphConfigProvider.m31create79VDu0o(0, sessionConfig, true, null, null, emptyMap, emptyMap), null, 5))).booleanValue();
        }

        public boolean measure(int i, ConstraintWidget constraintWidget, BasicMeasure$Measurer basicMeasure$Measurer) {
            BasicMeasure$Measure basicMeasure$Measure = (BasicMeasure$Measure) this.val$recordingToStart;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
            int[] iArr = constraintWidget.mResolvedMatchConstraintDefault;
            basicMeasure$Measure.horizontalBehavior = dimensionBehaviourArr[0];
            basicMeasure$Measure.verticalBehavior = dimensionBehaviourArr[1];
            basicMeasure$Measure.horizontalDimension = constraintWidget.getWidth();
            basicMeasure$Measure.verticalDimension = constraintWidget.getHeight();
            basicMeasure$Measure.measuredNeedsSolverPass = false;
            basicMeasure$Measure.measureStrategy = i;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = basicMeasure$Measure.horizontalBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z = dimensionBehaviour == dimensionBehaviour2;
            boolean z2 = basicMeasure$Measure.verticalBehavior == dimensionBehaviour2;
            boolean z3 = z && constraintWidget.mDimensionRatio > RecyclerView.DECELERATION_RATE;
            boolean z4 = z2 && constraintWidget.mDimensionRatio > RecyclerView.DECELERATION_RATE;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
            if (z3 && iArr[0] == 4) {
                basicMeasure$Measure.horizontalBehavior = dimensionBehaviour3;
            }
            if (z4 && iArr[1] == 4) {
                basicMeasure$Measure.verticalBehavior = dimensionBehaviour3;
            }
            basicMeasure$Measurer.measure(constraintWidget, basicMeasure$Measure);
            constraintWidget.setWidth(basicMeasure$Measure.measuredWidth);
            constraintWidget.setHeight(basicMeasure$Measure.measuredHeight);
            constraintWidget.mHasBaseline = basicMeasure$Measure.measuredHasBaseline;
            constraintWidget.setBaselineDistance(basicMeasure$Measure.measuredBaseline);
            basicMeasure$Measure.measureStrategy = 0;
            return basicMeasure$Measure.measuredNeedsSolverPass;
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeError(EncodeException encodeException) {
            ((CallbackToFutureAdapter$Completer) this.val$completer).setException(encodeException);
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStop() {
            ((CallbackToFutureAdapter$Completer) this.val$completer).set(null);
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodedData(EncodedData encodedData) {
            boolean z;
            AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord = (AutoValue_Recorder_RecordingRecord) this.val$recordingToStart;
            Recorder recorder = (Recorder) this.this$0;
            if (recorder.mMuxer != null) {
                try {
                    recorder.writeVideoData(encodedData, autoValue_Recorder_RecordingRecord);
                    encodedData.close();
                    return;
                } catch (Throwable th) {
                    try {
                        encodedData.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (recorder.mInProgressRecordingStopping) {
                StringUtilsKt.d("Recorder", "Drop video data since recording is stopping.");
                encodedData.close();
                return;
            }
            EncodedData encodedData2 = recorder.mPendingFirstVideoData;
            if (encodedData2 != null) {
                encodedData2.close();
                recorder.mPendingFirstVideoData = null;
                z = true;
            } else {
                z = false;
            }
            if (!encodedData.isKeyFrame()) {
                if (z) {
                    StringUtilsKt.d("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                StringUtilsKt.d("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                EncoderImpl encoderImpl = recorder.mVideoEncoder;
                encoderImpl.mEncoderExecutor.execute(new EncoderImpl$$ExternalSyntheticLambda2(encoderImpl, 4));
                encodedData.close();
                return;
            }
            recorder.mPendingFirstVideoData = encodedData;
            if (!recorder.isAudioEnabled() || !recorder.mPendingAudioRingBuffer.isEmpty()) {
                StringUtilsKt.d("Recorder", "Received video keyframe. Starting muxer...");
                recorder.setupAndStartMuxer(autoValue_Recorder_RecordingRecord);
            } else if (z) {
                StringUtilsKt.d("Recorder", "Replaced cached video keyframe with newer keyframe.");
            } else {
                StringUtilsKt.d("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th) {
            ((PreviewStreamStateObserver) this.this$0).mFlowFuture = null;
            ArrayList arrayList = (ArrayList) this.val$completer;
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((CameraInfoInternal) ((CameraInfo) this.val$recordingToStart)).removeSessionCaptureCallback((CameraCaptureCallback) it.next());
            }
            arrayList.clear();
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onOutputConfigUpdate(StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1) {
            ((Recorder) this.this$0).mVideoOutputConfig = streamSharing$$ExternalSyntheticLambda1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onSuccess(Object obj) {
            ((PreviewStreamStateObserver) this.this$0).mFlowFuture = null;
        }

        public void postDispatchRunnable(Lifecycle.Event event) {
            ANRDetectorRunnable aNRDetectorRunnable = (ANRDetectorRunnable) this.this$0;
            if (aNRDetectorRunnable != null) {
                aNRDetectorRunnable.run();
            }
            ANRDetectorRunnable aNRDetectorRunnable2 = new ANRDetectorRunnable((LifecycleRegistry) this.val$completer, event);
            this.this$0 = aNRDetectorRunnable2;
            ((Handler) this.val$recordingToStart).postAtFrontOfQueue(aNRDetectorRunnable2);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:58:0x000f, B:61:0x0014, B:63:0x0018, B:65:0x0025, B:9:0x0046, B:11:0x0050, B:13:0x0053, B:15:0x0057, B:17:0x0067, B:18:0x006a), top: B:57:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00ba A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public CharSequence process(CharSequence charSequence, int i, int i2, boolean z) {
            UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable;
            CharSequence charSequence2;
            Throwable th;
            int i3;
            int i4;
            SpannableBuilder spannableBuilder;
            TypefaceEmojiSpan[] typefaceEmojiSpanArr;
            boolean z2 = charSequence instanceof SpannableBuilder;
            if (z2) {
                ((SpannableBuilder) charSequence).blockWatchers();
            }
            boolean z3 = false;
            try {
                if (!z2) {
                    try {
                        if (!(charSequence instanceof Spannable)) {
                            if (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, TypefaceEmojiSpan.class) > i2) {
                                unprecomputeTextOnModificationSpannable = null;
                            } else {
                                unprecomputeTextOnModificationSpannable = new UnprecomputeTextOnModificationSpannable();
                                unprecomputeTextOnModificationSpannable.mSafeToWrite = false;
                                unprecomputeTextOnModificationSpannable.mDelegate = new SpannableString(charSequence);
                            }
                            if (unprecomputeTextOnModificationSpannable != null && (typefaceEmojiSpanArr = (TypefaceEmojiSpan[]) unprecomputeTextOnModificationSpannable.mDelegate.getSpans(i, i2, TypefaceEmojiSpan.class)) != null && typefaceEmojiSpanArr.length > 0) {
                                for (TypefaceEmojiSpan typefaceEmojiSpan : typefaceEmojiSpanArr) {
                                    int spanStart = unprecomputeTextOnModificationSpannable.mDelegate.getSpanStart(typefaceEmojiSpan);
                                    int spanEnd = unprecomputeTextOnModificationSpannable.mDelegate.getSpanEnd(typefaceEmojiSpan);
                                    if (spanStart != i2) {
                                        unprecomputeTextOnModificationSpannable.removeSpan(typefaceEmojiSpan);
                                    }
                                    i = Math.min(spanStart, i);
                                    i2 = Math.max(spanEnd, i2);
                                }
                            }
                            i3 = i;
                            i4 = i2;
                            if (i3 != i4 || i3 >= charSequence.length()) {
                                charSequence2 = charSequence;
                                if (z2) {
                                    return charSequence2;
                                }
                                spannableBuilder = (SpannableBuilder) charSequence2;
                            } else {
                                AnonymousClass4 anonymousClass4 = new AnonymousClass4(unprecomputeTextOnModificationSpannable, (Lock) this.val$completer, z3, 26);
                                charSequence2 = charSequence;
                                try {
                                    UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable2 = (UnprecomputeTextOnModificationSpannable) process(charSequence2, i3, i4, Integer.MAX_VALUE, z, anonymousClass4);
                                    if (unprecomputeTextOnModificationSpannable2 == null) {
                                        if (z2) {
                                            spannableBuilder = (SpannableBuilder) charSequence2;
                                        }
                                        return charSequence2;
                                    }
                                    Spannable spannable = unprecomputeTextOnModificationSpannable2.mDelegate;
                                    if (z2) {
                                        ((SpannableBuilder) charSequence2).endBatchEdit();
                                    }
                                    return spannable;
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = th;
                                    if (!z2) {
                                    }
                                }
                            }
                            spannableBuilder.endBatchEdit();
                            return charSequence2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        charSequence2 = charSequence;
                        if (!z2) {
                        }
                    }
                }
                unprecomputeTextOnModificationSpannable = new UnprecomputeTextOnModificationSpannable((Spannable) charSequence);
                if (unprecomputeTextOnModificationSpannable != null) {
                    while (r5 < r4) {
                    }
                }
                i3 = i;
                i4 = i2;
                if (i3 != i4) {
                }
                charSequence2 = charSequence;
                if (z2) {
                }
            } catch (Throwable th4) {
                th = th4;
                charSequence2 = charSequence;
                th = th;
                if (!z2) {
                    throw th;
                }
                ((SpannableBuilder) charSequence2).endBatchEdit();
                throw th;
            }
        }

        public void releaseInternal(Allocation allocation) {
            PlayerId playerId = (PlayerId) ((HashMap) this.val$completer).remove(allocation);
            playerId.getClass();
            DefaultLoadControl.PlayerLoadingState playerLoadingState = (DefaultLoadControl.PlayerLoadingState) ((DefaultLoadControl) this.this$0).loadingStates.get(playerId);
            if (playerLoadingState != null) {
                synchronized (playerLoadingState) {
                    playerLoadingState.allocatedCounts--;
                }
            }
        }

        @Override // androidx.camera.core.impl.Observable
        public void removeObserver(Observable.Observer observer) {
            synchronized (((HashMap) this.val$recordingToStart)) {
                ((HashMap) this.val$recordingToStart).remove(observer);
                if (((HashMap) this.val$recordingToStart).isEmpty()) {
                    zzabp.mainThreadExecutor().execute(new LiveDataObservable$$ExternalSyntheticLambda2(this, 0));
                }
            }
        }

        @Override // androidx.camera.camera2.compat.ZoomCompat
        public Deferred resetAsync(UseCaseCameraRequestControl useCaseCameraRequestControl) {
            useCaseCameraRequestControl.getClass();
            List listOf = CollectionsKt__CollectionsJVMKt.listOf(CaptureRequest.SCALER_CROP_REGION);
            UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
            return useCaseCameraRequestControl.removeParametersAsync(listOf);
        }

        public void solveLinearSystem(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
            constraintWidgetContainer.getClass();
            int i4 = constraintWidgetContainer.mMinWidth;
            int i5 = constraintWidgetContainer.mMinHeight;
            constraintWidgetContainer.mMinWidth = 0;
            constraintWidgetContainer.mMinHeight = 0;
            constraintWidgetContainer.setWidth(i2);
            constraintWidgetContainer.setHeight(i3);
            if (i4 < 0) {
                constraintWidgetContainer.mMinWidth = 0;
            } else {
                constraintWidgetContainer.mMinWidth = i4;
            }
            if (i5 < 0) {
                constraintWidgetContainer.mMinHeight = 0;
            } else {
                constraintWidgetContainer.mMinHeight = i5;
            }
            ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) this.this$0;
            constraintWidgetContainer2.mPass = i;
            constraintWidgetContainer2.layout();
        }

        public void updateHierarchy(ConstraintWidgetContainer constraintWidgetContainer) {
            ArrayList arrayList = (ArrayList) this.val$completer;
            arrayList.clear();
            int size = constraintWidgetContainer.mChildren.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) constraintWidgetContainer.mChildren.get(i);
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2) {
                    arrayList.add(constraintWidget);
                }
            }
            constraintWidgetContainer.mDependencyGraph.mNeedBuildGraph = true;
        }

        public /* synthetic */ AnonymousClass3(int i, boolean z) {
            this.$r8$classId = i;
        }

        public /* synthetic */ AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.val$completer = obj;
        }

        public /* synthetic */ AnonymousClass3(Object obj, Object obj2, Object obj3, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$completer = obj2;
            this.val$recordingToStart = obj3;
        }

        public AnonymousClass3(SystemForegroundService systemForegroundService) {
            this.$r8$classId = 24;
            this.val$completer = new LifecycleRegistry(systemForegroundService, true);
            this.val$recordingToStart = new Handler(Looper.getMainLooper());
        }

        public AnonymousClass3(AudioSpec audioSpec, AutoValue_EncoderProfilesProxy_AudioProfileProxy autoValue_EncoderProfilesProxy_AudioProfileProxy, Rational rational) {
            this.$r8$classId = 10;
            audioSpec.getClass();
            autoValue_EncoderProfilesProxy_AudioProfileProxy.getClass();
            this.val$completer = audioSpec;
            this.val$recordingToStart = autoValue_EncoderProfilesProxy_AudioProfileProxy;
            this.this$0 = rational;
        }

        public AnonymousClass3(OutputImage outputImage) {
            this.$r8$classId = 5;
            this.val$completer = outputImage;
            this.val$recordingToStart = AtomicFU.atomic(1);
            this.this$0 = AtomicFU.atomic(ClosingFinalizer.INSTANCE);
        }

        public AnonymousClass3(ArrayList arrayList) {
            this.$r8$classId = 29;
            this.val$completer = Collections.unmodifiableList(new ArrayList(arrayList));
            this.val$recordingToStart = new long[arrayList.size() * 2];
            for (int i = 0; i < arrayList.size(); i++) {
                WebvttCueInfo webvttCueInfo = (WebvttCueInfo) arrayList.get(i);
                int i2 = i * 2;
                long[] jArr = (long[]) this.val$recordingToStart;
                jArr[i2] = webvttCueInfo.startTimeUs;
                jArr[i2 + 1] = webvttCueInfo.endTimeUs;
            }
            long[] jArr2 = (long[]) this.val$recordingToStart;
            long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
            this.this$0 = copyOf;
            Arrays.sort(copyOf);
        }

        public AnonymousClass3(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 15:
                    long[] jArr = ScatterMapKt.EmptyGroup;
                    this.val$completer = new MutableScatterMap();
                    break;
                default:
                    this.val$completer = new MutableLiveData();
                    this.val$recordingToStart = new HashMap();
                    break;
            }
        }

        public AnonymousClass3(Context context, LocationManager locationManager) {
            this.$r8$classId = 1;
            this.this$0 = new TwilightManager$TwilightState();
            this.val$completer = context;
            this.val$recordingToStart = locationManager;
        }

        public AnonymousClass3(ConstraintWidgetContainer constraintWidgetContainer) {
            this.$r8$classId = 21;
            this.val$completer = new ArrayList();
            this.val$recordingToStart = new BasicMeasure$Measure();
            this.this$0 = constraintWidgetContainer;
        }

        public /* synthetic */ AnonymousClass3(int i, Object obj, Object obj2, Object obj3) {
            this.$r8$classId = i;
            this.val$completer = obj;
            this.val$recordingToStart = obj2;
            this.this$0 = obj3;
        }

        public AnonymousClass3(CameraPipeCameraProperties cameraPipeCameraProperties) {
            this.$r8$classId = 3;
            this.val$completer = cameraPipeCameraProperties;
            CameraMetadata cameraMetadata = cameraPipeCameraProperties.metadata;
            CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
            key.getClass();
            Object obj = ((Camera2CameraMetadata) cameraMetadata).get(key);
            obj.getClass();
            this.this$0 = (Rect) obj;
        }

        public AnonymousClass3(Context context, View view, int i) {
            this.$r8$classId = 2;
            this.val$recordingToStart = view;
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.val$completer = menuBuilder;
            menuBuilder.mCallback = new Transition.AnonymousClass1();
            MenuPopupHelper menuPopupHelper = new MenuPopupHelper(0, i, context, view, menuBuilder, false);
            this.this$0 = menuPopupHelper;
            menuPopupHelper.mDropDownGravity = 17;
            menuPopupHelper.mOnDismissListener = new PopupMenu$2();
        }

        public AnonymousClass3(MetadataRepo metadataRepo, Lock lock, DefaultGlyphChecker defaultGlyphChecker, Set set) {
            this.$r8$classId = 22;
            this.val$completer = lock;
            this.val$recordingToStart = metadataRepo;
            this.this$0 = defaultGlyphChecker;
            if (set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                String str = new String(iArr, 0, iArr.length);
                process(str, 0, str.length(), 1, true, new Joiner(str, false));
            }
        }

        public float get(CLElement cLElement) {
            HashMap hashMap = (HashMap) this.val$completer;
            HashMap hashMap2 = (HashMap) this.val$recordingToStart;
            if (!(cLElement instanceof CLString)) {
                return cLElement instanceof CLNumber ? ((CLNumber) cLElement).getFloat() : RecyclerView.DECELERATION_RATE;
            }
            String content = ((CLString) cLElement).content();
            if (hashMap2.containsKey(content)) {
                return ((ConstraintSetParser$GeneratedValue) hashMap2.get(content)).value();
            }
            return hashMap.containsKey(content) ? ((Integer) hashMap.get(content)).floatValue() : RecyclerView.DECELERATION_RATE;
        }

        public AnonymousClass3(AudioProcessor[] audioProcessorArr) {
            this.$r8$classId = 27;
            SilenceSkippingAudioProcessor silenceSkippingAudioProcessor = new SilenceSkippingAudioProcessor();
            SonicAudioProcessor sonicAudioProcessor = new SonicAudioProcessor();
            sonicAudioProcessor.speed = 1.0f;
            sonicAudioProcessor.pitch = 1.0f;
            AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
            sonicAudioProcessor.pendingInputAudioFormat = audioFormat;
            sonicAudioProcessor.pendingOutputAudioFormat = audioFormat;
            sonicAudioProcessor.inputAudioFormat = audioFormat;
            sonicAudioProcessor.outputAudioFormat = audioFormat;
            ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
            sonicAudioProcessor.buffer = byteBuffer;
            sonicAudioProcessor.outputBuffer = byteBuffer;
            sonicAudioProcessor.pendingOutputSampleRate = -1;
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.val$completer = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.val$recordingToStart = silenceSkippingAudioProcessor;
            this.this$0 = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }

        public AnonymousClass3(TypefaceResult typefaceResult, AnonymousClass3 anonymousClass3) {
            this.$r8$classId = 17;
            this.val$completer = typefaceResult;
            this.val$recordingToStart = anonymousClass3;
            this.this$0 = typefaceResult.getValue();
        }

        public AnonymousClass3(Function1 function1) {
            this.$r8$classId = 13;
            this.val$completer = function1;
            this.val$recordingToStart = new DefaultDraggable2DState$drag2DScope$1(this);
            this.this$0 = new MutatorMutex();
        }

        public AnonymousClass3(AudioTrackAudioOutput audioTrackAudioOutput) {
            this.$r8$classId = 26;
            this.this$0 = audioTrackAudioOutput;
            Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper(null);
            this.val$completer = createHandlerForCurrentLooper;
            AudioTrack.StreamEventCallback streamEventCallback = new AudioTrack.StreamEventCallback() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput$StreamEventCallbackV29$1
                @Override // android.media.AudioTrack.StreamEventCallback
                public final void onDataRequest(AudioTrack audioTrack, int i) {
                    ((AudioTrackAudioOutput) Recorder.AnonymousClass3.this.this$0).listeners.sendEvent(-1, new Id3Peeker$$ExternalSyntheticBUOutline0(9));
                }

                @Override // android.media.AudioTrack.StreamEventCallback
                public final void onPresentationEnded(AudioTrack audioTrack) {
                    ((AudioTrackAudioOutput) Recorder.AnonymousClass3.this.this$0).listeners.sendEvent(-1, new Id3Peeker$$ExternalSyntheticBUOutline0(10));
                }

                @Override // android.media.AudioTrack.StreamEventCallback
                public final void onTearDown(AudioTrack audioTrack) {
                    ((AudioTrackAudioOutput) Recorder.AnonymousClass3.this.this$0).listeners.sendEvent(-1, new Id3Peeker$$ExternalSyntheticBUOutline0(9));
                }
            };
            this.val$recordingToStart = streamEventCallback;
            audioTrackAudioOutput.audioTrack.registerStreamEventCallback(new ConcurrencyHelpers$$ExternalSyntheticLambda0(createHandlerForCurrentLooper, 0), streamEventCallback);
        }

        public AnonymousClass3(DefaultLoadControl defaultLoadControl, PlayerId playerId) {
            this.$r8$classId = 25;
            this.this$0 = defaultLoadControl;
            this.val$completer = new HashMap();
            this.val$recordingToStart = playerId;
        }

        public AnonymousClass3(String str, String str2) {
            this.$r8$classId = 18;
            this.val$completer = null;
            this.val$recordingToStart = str;
            this.this$0 = str2;
        }

        public AnonymousClass3(Object[] objArr, Object[] objArr2) {
            this.$r8$classId = 23;
            int length = objArr.length;
            int[] iArr = new int[length];
            HashMap hashMap = new HashMap();
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Integer num = (Integer) hashMap.get(obj);
                if (num == null) {
                    num = Integer.valueOf(hashMap.size());
                    hashMap.put(obj, num);
                }
                iArr[i] = num.intValue();
            }
            this.val$completer = iArr;
            this.val$recordingToStart = compact(objArr, iArr);
            this.this$0 = compact(objArr2, iArr);
        }

        public Object process(CharSequence charSequence, int i, int i2, int i3, boolean z, EmojiProcessor$EmojiProcessCallback emojiProcessor$EmojiProcessCallback) {
            int i4;
            zzei zzeiVar = new zzei((MetadataRepo.Node) ((MetadataRepo) this.val$recordingToStart).mRootNode);
            int codePointAt = Character.codePointAt(charSequence, i);
            int i5 = 0;
            boolean z2 = true;
            loop0: while (true) {
                int i6 = codePointAt;
                while (true) {
                    i4 = i;
                    while (i < i2 && i5 < i3 && z2) {
                        int check = zzeiVar.check(i6);
                        if (check == 1) {
                            i = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                            if (i < i2) {
                                break;
                            }
                        } else if (check == 2) {
                            int charCount = Character.charCount(i6) + i;
                            if (charCount < i2) {
                                i6 = Character.codePointAt(charSequence, charCount);
                            }
                            i = charCount;
                        } else if (check == 3) {
                            if (z || !hasGlyph(charSequence, i4, i, ((MetadataRepo.Node) zzeiVar.zzb).mData)) {
                                z2 = emojiProcessor$EmojiProcessCallback.handleEmoji(charSequence, i4, i, ((MetadataRepo.Node) zzeiVar.zzb).mData);
                                i5++;
                            }
                        }
                    }
                }
                codePointAt = Character.codePointAt(charSequence, i);
            }
            if (zzeiVar.zzb$1 == 2 && ((MetadataRepo.Node) zzeiVar.zza).mData != null && ((zzeiVar.zzc > 1 || zzeiVar.shouldUseEmojiPresentationStyleForSingleCodepoint()) && i5 < i3 && z2 && (z || !hasGlyph(charSequence, i4, i, ((MetadataRepo.Node) zzeiVar.zza).mData)))) {
                emojiProcessor$EmojiProcessCallback.handleEmoji(charSequence, i4, i, ((MetadataRepo.Node) zzeiVar.zza).mData);
            }
            return emojiProcessor$EmojiProcessCallback.getResult();
        }
    }

    /* renamed from: androidx.camera.video.Recorder$4, reason: invalid class name */
    public final class AnonymousClass4 implements InactiveSurfaceCloser, FutureCallback, TimeProvider, SubcomposeLayoutState.PausedPrecomposition, ContentCaptureSessionWrapper, SegmentFinder, EmojiProcessor$EmojiProcessCallback {
        public final /* synthetic */ int $r8$classId;
        public Object this$0;
        public Object val$audioErrorConsumer;

        public AnonymousClass4(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 3:
                    this.val$audioErrorConsumer = new Object();
                    this.this$0 = new ArrayList();
                    break;
                case 4:
                    this.val$audioErrorConsumer = new RejectOperationCameraCaptureSession();
                    this.this$0 = AtomicFU.atomic(EmptyList.INSTANCE);
                    break;
                case 5:
                    EmptySet emptySet = EmptySet.INSTANCE;
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    emptySet.getClass();
                    this.val$audioErrorConsumer = emptySet;
                    this.this$0 = emptyMap;
                    break;
                case 9:
                    this.val$audioErrorConsumer = (ImageCaptureFailedForSpecificCombinationQuirk) androidx.camera.core.internal.compat.quirk.DeviceQuirks.sQuirks.get(ImageCaptureFailedForSpecificCombinationQuirk.class);
                    this.this$0 = (PreviewGreenTintQuirk) androidx.camera.core.internal.compat.quirk.DeviceQuirks.sQuirks.get(PreviewGreenTintQuirk.class);
                    break;
                case 14:
                    this.val$audioErrorConsumer = new VelocityTracker1D(0);
                    this.this$0 = new VelocityTracker1D(0);
                    break;
                case 16:
                    TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.FloatToVector;
                    Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
                    this.this$0 = new AnimationState(twoWayConverterImpl, valueOf, (AnimationVector) twoWayConverterImpl.convertToVector.invoke(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                    break;
                case 17:
                    this.val$audioErrorConsumer = new LinkedHashMap();
                    this.this$0 = new LinkedHashMap();
                    break;
                case 28:
                    this.val$audioErrorConsumer = new HashMap();
                    break;
                default:
                    this.val$audioErrorConsumer = new LinkedHashMap();
                    this.this$0 = new MarkwonConfiguration(18);
                    break;
            }
        }

        /* renamed from: linkTo-VpY3zN4$default, reason: not valid java name */
        public static void m112linkToVpY3zN4$default(AnonymousClass4 anonymousClass4, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f, int i) {
            if ((i & 2) != 0) {
                f = RecyclerView.DECELERATION_RATE;
            }
            anonymousClass4.m113linkToVpY3zN4(horizontalAnchor, f);
        }

        public static AnonymousClass4 toContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
            return new AnonymousClass4(contentCaptureSession, view, false, 20);
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
        public SubcomposeLayoutState.PrecomposedSlotHandle apply() {
            return ((LayoutNodeSubcompositionsState) this.val$audioErrorConsumer).createPrecomposedSlotHandle(this.this$0);
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
        public void cancel() {
        }

        public void clearCache() {
            synchronized (this) {
                try {
                    MutableScatterMap mutableScatterMap = (MutableScatterMap) this.val$audioErrorConsumer;
                    if (mutableScatterMap != null) {
                        mutableScatterMap.clear();
                    }
                    this.this$0 = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
        public void closeAll() {
            synchronized (this.val$audioErrorConsumer) {
                try {
                    Iterator it = ((ArrayList) this.this$0).iterator();
                    while (it.hasNext()) {
                        InactiveSurfaceCloserImpl$ConfiguredOutput inactiveSurfaceCloserImpl$ConfiguredOutput = (InactiveSurfaceCloserImpl$ConfiguredOutput) it.next();
                        inactiveSurfaceCloserImpl$ConfiguredOutput.graph.m83setSurfaceNYG5g8E(inactiveSurfaceCloserImpl$ConfiguredOutput.streamId, null);
                        inactiveSurfaceCloserImpl$ConfiguredOutput.deferrableSurface.close();
                    }
                    ((ArrayList) this.this$0).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
        /* renamed from: configure-hB7JTeY */
        public void mo24configurehB7JTeY(int i, DeferrableSurface deferrableSurface, CameraGraphImpl cameraGraphImpl) {
            deferrableSurface.getClass();
            synchronized (this.val$audioErrorConsumer) {
                ((ArrayList) this.this$0).add(new InactiveSurfaceCloserImpl$ConfiguredOutput(i, deferrableSurface, cameraGraphImpl));
            }
        }

        public BaseRenderer[] createRenderers(Handler handler, ExoPlayerImpl.ComponentListener componentListener, ExoPlayerImpl.ComponentListener componentListener2, ExoPlayerImpl.ComponentListener componentListener3, ExoPlayerImpl.ComponentListener componentListener4) {
            ArrayList arrayList = new ArrayList();
            Context context = (Context) this.val$audioErrorConsumer;
            MediaCodecVideoRenderer.Builder builder = new MediaCodecVideoRenderer.Builder(context);
            zzi zziVar = (zzi) this.this$0;
            builder.codecAdapterFactory = zziVar;
            builder.allowedJoiningTimeMs = 5000L;
            builder.eventHandler = handler;
            builder.eventListener = componentListener;
            builder.maxDroppedFramesToNotify = 50;
            androidx.tracing.Trace.checkState(!builder.buildCalled);
            Handler handler2 = builder.eventHandler;
            androidx.tracing.Trace.checkState((handler2 == null && builder.eventListener == null) || !(handler2 == null || builder.eventListener == null));
            builder.buildCalled = true;
            arrayList.add(new MediaCodecVideoRenderer(builder));
            Camera2Controller camera2Controller = new Camera2Controller(context);
            androidx.tracing.Trace.checkState(!camera2Controller.recordingOngoing);
            camera2Controller.recordingOngoing = true;
            if (((AnonymousClass3) camera2Controller.coroutineScope) == null) {
                camera2Controller.coroutineScope = new AnonymousClass3(new AudioProcessor[0]);
            }
            AudioTrackAudioOutputProvider audioTrackAudioOutputProvider = (AudioTrackAudioOutputProvider) camera2Controller._previewState;
            DefaultAudioOffloadSupportProvider defaultAudioOffloadSupportProvider = (DefaultAudioOffloadSupportProvider) camera2Controller.currentStateCollectJob;
            if (audioTrackAudioOutputProvider == null) {
                if (defaultAudioOffloadSupportProvider == null) {
                    camera2Controller.currentStateCollectJob = new DefaultAudioOffloadSupportProvider(context);
                }
                if (((AudioSink$AudioTrackConfig) camera2Controller.currentManager) == null) {
                    camera2Controller.currentManager = AudioSink$AudioTrackConfig.DEFAULT;
                }
                VectorizedFloatDecaySpec vectorizedFloatDecaySpec = new VectorizedFloatDecaySpec(context);
                AudioCapabilities audioCapabilities = context != null ? null : (AudioCapabilities) camera2Controller.camera2ManagerFactory;
                Context context2 = (Context) vectorizedFloatDecaySpec.floatDecaySpec;
                if (context2 == null) {
                    vectorizedFloatDecaySpec.targetVector = audioCapabilities;
                }
                DefaultAudioOffloadSupportProvider defaultAudioOffloadSupportProvider2 = (DefaultAudioOffloadSupportProvider) camera2Controller.currentStateCollectJob;
                vectorizedFloatDecaySpec.valueVector = defaultAudioOffloadSupportProvider2;
                vectorizedFloatDecaySpec.velocityVector = (AudioSink$AudioTrackConfig) camera2Controller.currentManager;
                if (defaultAudioOffloadSupportProvider2 == null) {
                    vectorizedFloatDecaySpec.valueVector = new DefaultAudioOffloadSupportProvider(context2);
                }
                camera2Controller._previewState = new AudioTrackAudioOutputProvider(vectorizedFloatDecaySpec);
            } else {
                androidx.tracing.Trace.checkState(defaultAudioOffloadSupportProvider == null);
                androidx.tracing.Trace.checkState(((AudioSink$AudioTrackConfig) camera2Controller.currentManager) == null);
            }
            arrayList.add(new MediaCodecAudioRenderer((Context) this.val$audioErrorConsumer, zziVar, handler, componentListener2, new DefaultAudioSink(camera2Controller)));
            arrayList.add(new TextRenderer(componentListener3, handler.getLooper()));
            Looper looper = handler.getLooper();
            for (int i = 0; i < 4; i++) {
                arrayList.add(new MetadataRenderer(componentListener4, looper));
            }
            arrayList.add(new CameraMotionRenderer());
            arrayList.add(new ImageRenderer(new zzc(context)));
            return (BaseRenderer[]) arrayList.toArray(new BaseRenderer[0]);
        }

        public void flush() {
            ((ContentCaptureSession) this.val$audioErrorConsumer).notifyViewsDisappeared(((View) this.this$0).getAutofillId(), new long[]{Long.MIN_VALUE});
        }

        @Override // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
        public Object getResult() {
            return (UnprecomputeTextOnModificationSpannable) this.val$audioErrorConsumer;
        }

        public synchronized Map getSnapshot() {
            try {
                if (((Map) this.this$0) == null) {
                    this.this$0 = Collections.unmodifiableMap(new HashMap((HashMap) this.val$audioErrorConsumer));
                }
            } catch (Throwable th) {
                throw th;
            }
            return (Map) this.this$0;
        }

        @Override // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
        public boolean handleEmoji(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if ((typefaceEmojiRasterizer.mCache & 4) > 0) {
                return true;
            }
            if (((UnprecomputeTextOnModificationSpannable) this.val$audioErrorConsumer) == null) {
                this.val$audioErrorConsumer = new UnprecomputeTextOnModificationSpannable(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            ((Lock) this.this$0).getClass();
            ((UnprecomputeTextOnModificationSpannable) this.val$audioErrorConsumer).setSpan(new TypefaceEmojiSpan(typefaceEmojiRasterizer), i, i2, 33);
            return true;
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
        public boolean isComplete() {
            return true;
        }

        /* renamed from: linkTo-VpY3zN4, reason: not valid java name */
        public void m113linkToVpY3zN4(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f) {
            int i = horizontalAnchor.index;
            String str = "top";
            if (i != 0) {
                if (i != 1) {
                    android.util.Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
                } else {
                    str = "bottom";
                }
            }
            CLArray cLArray = new CLArray(new char[0]);
            cLArray.add(CLString.from(horizontalAnchor.id.toString()));
            cLArray.add(CLString.from(str));
            cLArray.add(new CLNumber(f));
            cLArray.add(new CLNumber(RecyclerView.DECELERATION_RATE));
            ((CLObject) this.val$audioErrorConsumer).put((String) this.this$0, cLArray);
        }

        public AutofillId newAutofillId(long j) {
            return ((ContentCaptureSession) this.val$audioErrorConsumer).newAutofillId(((View) this.this$0).getAutofillId(), j);
        }

        public BiometricPrompt newVirtualViewStructure(AutofillId autofillId, long j) {
            return new BiometricPrompt(((ContentCaptureSession) this.val$audioErrorConsumer).newVirtualViewStructure(autofillId, j), 22);
        }

        @Override // androidx.compose.ui.text.android.selection.SegmentFinder
        public int nextEndBoundary(int i) {
            do {
                i = ((TimedValueQueue) this.this$0).nextBoundary(i);
                if (i == -1) {
                    return -1;
                }
            } while (Character.isWhitespace(((CharSequence) this.val$audioErrorConsumer).charAt(i - 1)));
            return i;
        }

        @Override // androidx.compose.ui.text.android.selection.SegmentFinder
        public int nextStartBoundary(int i) {
            CharSequence charSequence = (CharSequence) this.val$audioErrorConsumer;
            do {
                i = ((TimedValueQueue) this.this$0).nextBoundary(i);
                if (i == -1 || i == charSequence.length()) {
                    return -1;
                }
            } while (Character.isWhitespace(charSequence.charAt(i)));
            return i;
        }

        public void notifyViewAppeared(ViewStructure viewStructure) {
            ((ContentCaptureSession) this.val$audioErrorConsumer).notifyViewAppeared(viewStructure);
        }

        public void notifyViewDisappeared(AutofillId autofillId) {
            ((ContentCaptureSession) this.val$audioErrorConsumer).notifyViewDisappeared(autofillId);
        }

        public void notifyViewTextChanged(AutofillId autofillId, String str) {
            ((ContentCaptureSession) this.val$audioErrorConsumer).notifyViewTextChanged(autofillId, str);
        }

        /* renamed from: onClosed-rphkYDA, reason: not valid java name */
        public void m114onClosedrphkYDA(String str) {
            str.getClass();
            Iterator it = ((List) ((AtomicRef) this.this$0).value).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onClosed((RejectOperationCameraCaptureSession) this.val$audioErrorConsumer);
            }
        }

        /* renamed from: onConfigureFailed-rphkYDA, reason: not valid java name */
        public void m115onConfigureFailedrphkYDA(String str) {
            str.getClass();
            Iterator it = ((List) ((AtomicRef) this.this$0).value).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed((RejectOperationCameraCaptureSession) this.val$audioErrorConsumer);
            }
        }

        /* renamed from: onConfigured-rphkYDA, reason: not valid java name */
        public void m116onConfiguredrphkYDA(String str) {
            str.getClass();
            Iterator it = ((List) ((AtomicRef) this.this$0).value).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigured((RejectOperationCameraCaptureSession) this.val$audioErrorConsumer);
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th) {
            switch (this.$r8$classId) {
                case 7:
                    androidx.camera.core.impl.utils.Threads.checkMainThread();
                    ProcessingRequest processingRequest = (ProcessingRequest) this.val$audioErrorConsumer;
                    e0 e0Var = (e0) this.this$0;
                    if (processingRequest == ((ProcessingRequest) e0Var.a)) {
                        StringUtilsKt.w("CaptureNode", "request aborted, id=" + ((ProcessingRequest) e0Var.a).mRequestId);
                        AnonymousClass1 anonymousClass1 = (AnonymousClass1) e0Var.h;
                        if (anonymousClass1 != null) {
                            anonymousClass1.this$0 = null;
                        }
                        e0Var.a = null;
                        return;
                    }
                    return;
                case 8:
                    TakePictureManagerImpl takePictureManagerImpl = (TakePictureManagerImpl) this.this$0;
                    AnonymousClass1 anonymousClass12 = (AnonymousClass1) this.val$audioErrorConsumer;
                    if (((RequestWithCallback) anonymousClass12.this$0).mIsAborted) {
                        return;
                    }
                    Object obj = ((CaptureConfig) ((ArrayList) anonymousClass12.val$videoEncoderSession).get(0)).mTagBundle.mTagMap.get("CAPTURE_CONFIG_ID_KEY");
                    int intValue = obj == null ? -1 : ((Integer) obj).intValue();
                    boolean z = th instanceof ImageCaptureException;
                    JWECryptoParts jWECryptoParts = takePictureManagerImpl.mImagePipeline;
                    if (z) {
                        AutoValue_TakePictureManager_CaptureError autoValue_TakePictureManager_CaptureError = new AutoValue_TakePictureManager_CaptureError(intValue, (ImageCaptureException) th);
                        jWECryptoParts.getClass();
                        androidx.camera.core.impl.utils.Threads.checkMainThread();
                        ((AutoValue_CaptureNode_In) jWECryptoParts.authenticationTag).errorEdge.accept(autoValue_TakePictureManager_CaptureError);
                    } else {
                        AutoValue_TakePictureManager_CaptureError autoValue_TakePictureManager_CaptureError2 = new AutoValue_TakePictureManager_CaptureError(intValue, new ImageCaptureException(2, "Failed to submit capture request", th));
                        jWECryptoParts.getClass();
                        androidx.camera.core.impl.utils.Threads.checkMainThread();
                        ((AutoValue_CaptureNode_In) jWECryptoParts.authenticationTag).errorEdge.accept(autoValue_TakePictureManager_CaptureError2);
                    }
                    takePictureManagerImpl.mImageCaptureControl.unlockFlashMode();
                    return;
                case 9:
                default:
                    throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
                case 10:
                    int i = ((SurfaceEdge) this.val$audioErrorConsumer).mTargets;
                    if (i == 2 && (th instanceof CancellationException)) {
                        StringUtilsKt.d("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                        return;
                    }
                    StringUtilsKt.w("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + TargetUtils.getHumanReadableName(i), th);
                    return;
                case 11:
                    AudioSource audioSource = (AudioSource) this.this$0;
                    if (audioSource.mBufferProvider != ((EncoderImpl.ByteBufferInput) this.val$audioErrorConsumer)) {
                        return;
                    }
                    StringUtilsKt.d("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
                    if (th instanceof IllegalStateException) {
                        return;
                    }
                    Executor executor = audioSource.mCallbackExecutor;
                    AnonymousClass4 anonymousClass4 = audioSource.mAudioSourceCallback;
                    if (executor == null || anonymousClass4 == null) {
                        return;
                    }
                    executor.execute(new Recorder$$ExternalSyntheticLambda15(13, anonymousClass4, th));
                    return;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onSuccess(Object obj) {
            switch (this.$r8$classId) {
                case 7:
                    break;
                case 8:
                    ((TakePictureManagerImpl) this.this$0).mImageCaptureControl.unlockFlashMode();
                    break;
                case 9:
                default:
                    TransactorKt.checkState("Unexpected result from SurfaceRequest. Surface was provided twice.", ((AutoValue_SurfaceRequest_Result) obj).resultCode != 3);
                    StringUtilsKt.d("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                    ((SurfaceTexture) this.val$audioErrorConsumer).release();
                    TextureViewImplementation textureViewImplementation = (TextureViewImplementation) ((PreviewView.AnonymousClass1) this.this$0).this$0;
                    if (textureViewImplementation.mDetachedSurfaceTexture != null) {
                        textureViewImplementation.mDetachedSurfaceTexture = null;
                        break;
                    }
                    break;
                case 10:
                    SurfaceOutputImpl surfaceOutputImpl = (SurfaceOutputImpl) obj;
                    surfaceOutputImpl.getClass();
                    try {
                        ((SurfaceProcessorInternal) ((JWECryptoParts) this.this$0).header).onOutputSurface(surfaceOutputImpl);
                        break;
                    } catch (ProcessingException e) {
                        StringUtilsKt.e("DualSurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
                        return;
                    }
                case 11:
                    EncoderImpl.AnonymousClass2 anonymousClass2 = (EncoderImpl.AnonymousClass2) obj;
                    AudioSource audioSource = (AudioSource) this.this$0;
                    boolean z = audioSource.mIsSendingAudio;
                    zzf zzfVar = audioSource.mSilentAudioStream;
                    BufferedAudioStream bufferedAudioStream = audioSource.mAudioStream;
                    if (!z || audioSource.mBufferProvider != ((EncoderImpl.ByteBufferInput) this.val$audioErrorConsumer)) {
                        anonymousClass2.cancel();
                        break;
                    } else {
                        if (audioSource.mInSilentStartState) {
                            TransactorKt.checkState(null, audioSource.mLatestFailedStartTimeNs > 0);
                            if (System.nanoTime() - audioSource.mLatestFailedStartTimeNs >= audioSource.mStartRetryIntervalNs) {
                                TransactorKt.checkState(null, audioSource.mInSilentStartState);
                                try {
                                    bufferedAudioStream.start();
                                    StringUtilsKt.d("AudioSource", "Retry start AudioStream succeed");
                                    zzfVar.checkNotReleasedOrThrow$2();
                                    ((AtomicBoolean) zzfVar.zza).set(false);
                                    audioSource.mInSilentStartState = false;
                                } catch (AudioStream.AudioStreamException e2) {
                                    StringUtilsKt.w("AudioSource", "Retry start AudioStream failed", e2);
                                    audioSource.mLatestFailedStartTimeNs = System.nanoTime();
                                }
                            }
                        }
                        if (!audioSource.mInSilentStartState) {
                            zzfVar = bufferedAudioStream;
                        }
                        if (!anonymousClass2.mTerminated.get()) {
                            ByteBuffer byteBuffer = anonymousClass2.mByteBuffer;
                            AutoValue_AudioStream_PacketInfo read = zzfVar.read(byteBuffer);
                            int i = read.sizeInBytes;
                            long j = read.timestampNs;
                            if (i > 0) {
                                if (audioSource.mMuted) {
                                    byte[] bArr = audioSource.mZeroBytes;
                                    if (bArr == null || bArr.length < i) {
                                        audioSource.mZeroBytes = new byte[i];
                                    }
                                    int position = byteBuffer.position();
                                    byteBuffer.put(audioSource.mZeroBytes, 0, i);
                                    byteBuffer.limit(byteBuffer.position()).position(position);
                                }
                                Executor executor = audioSource.mCallbackExecutor;
                                if (executor != null && j - audioSource.mAmplitudeTimestamp >= 200) {
                                    audioSource.mAmplitudeTimestamp = j;
                                    AnonymousClass4 anonymousClass4 = audioSource.mAudioSourceCallback;
                                    if (audioSource.mAudioFormat == 2) {
                                        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
                                        double d = 0.0d;
                                        while (asShortBuffer.hasRemaining()) {
                                            d = Math.max(d, Math.abs((int) asShortBuffer.get()));
                                        }
                                        audioSource.mAudioAmplitude = d / 32767.0d;
                                        if (anonymousClass4 != null) {
                                            executor.execute(new Recorder$$ExternalSyntheticLambda15(12, audioSource, anonymousClass4));
                                        }
                                    }
                                }
                                byteBuffer.limit(byteBuffer.position() + i);
                                anonymousClass2.setPresentationTimeUs(j / 1000);
                                anonymousClass2.submit();
                            } else {
                                StringUtilsKt.w("AudioSource", "Unable to read data from AudioStream.");
                                anonymousClass2.cancel();
                            }
                            audioSource.sendNextAudio();
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("The buffer is submitted or canceled.");
                            break;
                        }
                    }
                    break;
            }
        }

        @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
        public void onSurfaceInactive(DeferrableSurface deferrableSurface) {
            synchronized (this.val$audioErrorConsumer) {
                Iterator it = ((ArrayList) this.this$0).iterator();
                while (it.hasNext()) {
                    InactiveSurfaceCloserImpl$ConfiguredOutput inactiveSurfaceCloserImpl$ConfiguredOutput = (InactiveSurfaceCloserImpl$ConfiguredOutput) it.next();
                    inactiveSurfaceCloserImpl$ConfiguredOutput.getClass();
                    if (Intrinsics.areEqual(inactiveSurfaceCloserImpl$ConfiguredOutput.deferrableSurface, deferrableSurface)) {
                        deferrableSurface.close();
                    }
                }
            }
        }

        public void onTypefaceResult(FontRequestWorker.TypefaceResult typefaceResult) {
            BiometricFragment.PromptExecutor promptExecutor = (BiometricFragment.PromptExecutor) this.this$0;
            AnonymousClass6 anonymousClass6 = (AnonymousClass6) this.val$audioErrorConsumer;
            int i = typefaceResult.mResult;
            if (i != 0) {
                promptExecutor.execute(new CallbackWrapper$2(anonymousClass6, i, 0));
            } else {
                promptExecutor.execute(new Client.AnonymousClass4(4, anonymousClass6, typefaceResult.mTypeface));
            }
        }

        @Override // androidx.compose.ui.text.android.selection.SegmentFinder
        public int previousEndBoundary(int i) {
            do {
                i = ((TimedValueQueue) this.this$0).prevBoundary(i);
                if (i == -1 || i == 0) {
                    return -1;
                }
            } while (Character.isWhitespace(((CharSequence) this.val$audioErrorConsumer).charAt(i - 1)));
            return i;
        }

        @Override // androidx.compose.ui.text.android.selection.SegmentFinder
        public int previousStartBoundary(int i) {
            do {
                i = ((TimedValueQueue) this.this$0).prevBoundary(i);
                if (i == -1) {
                    return -1;
                }
            } while (Character.isWhitespace(((CharSequence) this.val$audioErrorConsumer).charAt(i)));
            return i;
        }

        public void prune(Collection collection) {
            collection.getClass();
            Collection collection2 = collection;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10));
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Named) it.next()).compatibilityKey);
            }
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.val$audioErrorConsumer;
            Set minus = SetsKt___SetsKt.minus(linkedHashMap.keySet(), (Iterable) arrayList);
            Set keySet = linkedHashMap.keySet();
            Set set = minus;
            keySet.getClass();
            set.getClass();
            keySet.removeAll(CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(set));
            ((MarkwonConfiguration) this.this$0).pruneAllChildRegistryOwnersExcept(arrayList);
        }

        @Override // androidx.camera.video.internal.encoder.TimeProvider
        public long realtimeUs() {
            return ((Long) ((StreamSharing$$ExternalSyntheticLambda1) this.val$audioErrorConsumer).mo103apply((Object) Long.valueOf(((CueEncoder) this.this$0).realtimeUs()))).longValue();
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
        public boolean resume(CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0) {
            return true;
        }

        public void stop$foundation() {
            StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) this.val$audioErrorConsumer;
            AnimationVector animationVector = null;
            if (standaloneCoroutine != null) {
                standaloneCoroutine.cancel(null);
            }
            this.this$0 = new AnimationState(AnimatableKt.FloatToVector, Float.valueOf(RecyclerView.DECELERATION_RATE), animationVector, 60);
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 23:
                    String str = "[ ";
                    if (((SolverVariable) this.val$audioErrorConsumer) != null) {
                        for (int i = 0; i < 9; i++) {
                            str = Recorder$$ExternalSyntheticOutline1.m(((SolverVariable) this.val$audioErrorConsumer).mGoalStrengthVector[i], " ", Boxes$$ExternalSyntheticOutline1.m(str));
                        }
                    }
                    StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, "] ");
                    m108m.append((SolverVariable) this.val$audioErrorConsumer);
                    return m108m.toString();
                default:
                    return super.toString();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void updateScrollDeltaForApproach$foundation(float f, Density density, CoroutineScope coroutineScope) {
            if (f <= density.mo236toPx0680j_4(1.0f)) {
                return;
            }
            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
            Continuation continuation = null;
            Object[] objArr = 0;
            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                float floatValue = ((Number) ((AnimationState) this.this$0).value$delegate.getValue()).floatValue();
                StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) this.val$audioErrorConsumer;
                if (standaloneCoroutine != null) {
                    standaloneCoroutine.cancel(null);
                }
                AnimationState animationState = (AnimationState) this.this$0;
                if (animationState.isRunning) {
                    this.this$0 = AnimatableKt.copy$default(animationState, floatValue - f, RecyclerView.DECELERATION_RATE, 30);
                } else {
                    this.this$0 = new AnimationState(AnimatableKt.FloatToVector, Float.valueOf(-f), objArr == true ? 1 : 0, 60);
                }
                this.val$audioErrorConsumer = JobKt.launch$default(coroutineScope, null, null, new ThumbNode$onAttach$1(this, continuation, 19), 3);
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            } catch (Throwable th) {
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                throw th;
            }
        }

        @Override // androidx.camera.video.internal.encoder.TimeProvider
        public long uptimeUs() {
            return ((Long) ((StreamSharing$$ExternalSyntheticLambda1) this.val$audioErrorConsumer).mo103apply((Object) Long.valueOf(((CueEncoder) this.this$0).uptimeUs()))).longValue();
        }

        public /* synthetic */ AnonymousClass4(int i, boolean z) {
            this.$r8$classId = i;
        }

        public /* synthetic */ AnonymousClass4(Object obj, Object obj2, boolean z, int i) {
            this.$r8$classId = i;
            this.val$audioErrorConsumer = obj;
            this.this$0 = obj2;
        }

        public /* synthetic */ AnonymousClass4(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$audioErrorConsumer = obj2;
        }

        public AnonymousClass4(PriorityGoalRow priorityGoalRow) {
            this.$r8$classId = 23;
            this.this$0 = priorityGoalRow;
        }

        public AnonymousClass4(String str, String str2) {
            this.$r8$classId = 25;
            this.val$audioErrorConsumer = str;
            this.this$0 = str2;
            if (str.length() > 0) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("userId should not be empty");
            throw null;
        }

        public AnonymousClass4(CameraGraph$Config cameraGraph$Config, CameraGraphId cameraGraphId) {
            this.$r8$classId = 6;
            cameraGraph$Config.getClass();
            this.val$audioErrorConsumer = cameraGraph$Config;
            this.this$0 = cameraGraphId;
        }

        public AnonymousClass4(int i, CLObject cLObject) {
            this.$r8$classId = 22;
            this.val$audioErrorConsumer = cLObject;
            String str = "top";
            if (i != 0) {
                if (i != 1) {
                    android.util.Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
                } else {
                    str = "bottom";
                }
            }
            this.this$0 = str;
        }

        public AnonymousClass4(Context context) {
            this.$r8$classId = 29;
            this.val$audioErrorConsumer = context;
            this.this$0 = new zzi(context, 1);
        }
    }

    public final class SetupVideoTask {
        public boolean mIsFailedRetryCanceled;
        public final int mMaxRetryCount;
        public int mRetryCount;
        public Object mRetryFuture;
        public final Object mSurfaceRequest;
        public final Serializable mTimebase;
        public final Object this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public SetupVideoTask(DiffUtil.Callback callback, ArrayList arrayList, int[] iArr, int[] iArr2) {
            int i;
            DiffUtil.Diagonal diagonal;
            int i2;
            this.mSurfaceRequest = arrayList;
            this.mTimebase = iArr;
            this.mRetryFuture = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.this$0 = callback;
            int oldListSize = callback.getOldListSize();
            this.mMaxRetryCount = oldListSize;
            int newListSize = callback.getNewListSize();
            this.mRetryCount = newListSize;
            this.mIsFailedRetryCanceled = true;
            DiffUtil.Diagonal diagonal2 = arrayList.isEmpty() ? null : (DiffUtil.Diagonal) arrayList.get(0);
            if (diagonal2 == null || diagonal2.x != 0 || diagonal2.y != 0) {
                arrayList.add(0, new DiffUtil.Diagonal(0, 0, 0));
            }
            arrayList.add(new DiffUtil.Diagonal(oldListSize, newListSize, 0));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                DiffUtil.Diagonal diagonal3 = (DiffUtil.Diagonal) it.next();
                for (int i3 = 0; i3 < diagonal3.size; i3++) {
                    int i4 = diagonal3.x + i3;
                    int i5 = diagonal3.y + i3;
                    int i6 = callback.areContentsTheSame(i4, i5) ? 1 : 2;
                    iArr[i4] = (i5 << 4) | i6;
                    iArr2[i5] = (i4 << 4) | i6;
                }
            }
            if (this.mIsFailedRetryCanceled) {
                Iterator it2 = arrayList.iterator();
                int i7 = 0;
                while (it2.hasNext()) {
                    DiffUtil.Diagonal diagonal4 = (DiffUtil.Diagonal) it2.next();
                    while (true) {
                        i = diagonal4.x;
                        if (i7 < i) {
                            if (iArr[i7] == 0) {
                                int size = arrayList.size();
                                int i8 = 0;
                                int i9 = 0;
                                while (true) {
                                    if (i8 < size) {
                                        diagonal = (DiffUtil.Diagonal) arrayList.get(i8);
                                        while (true) {
                                            i2 = diagonal.y;
                                            if (i9 < i2) {
                                                if (iArr2[i9] == 0 && callback.areItemsTheSame(i7, i9)) {
                                                    int i10 = callback.areContentsTheSame(i7, i9) ? 8 : 4;
                                                    iArr[i7] = (i9 << 4) | i10;
                                                    iArr2[i9] = i10 | (i7 << 4);
                                                } else {
                                                    i9++;
                                                }
                                            }
                                        }
                                    }
                                    i9 = diagonal.size + i2;
                                    i8++;
                                }
                            }
                            i7++;
                        }
                    }
                    i7 = diagonal4.size + i;
                }
            }
        }

        public static DiffUtil.PostponedUpdate getPostponedUpdate(ArrayDeque arrayDeque, int i, boolean z) {
            DiffUtil.PostponedUpdate postponedUpdate;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    postponedUpdate = null;
                    break;
                }
                postponedUpdate = (DiffUtil.PostponedUpdate) it.next();
                if (postponedUpdate.posInOwnerList == i && postponedUpdate.removal == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                DiffUtil.PostponedUpdate postponedUpdate2 = (DiffUtil.PostponedUpdate) it.next();
                if (z) {
                    postponedUpdate2.currentPos--;
                } else {
                    postponedUpdate2.currentPos++;
                }
            }
            return postponedUpdate;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void dispatchUpdatesTo(ListUpdateCallback listUpdateCallback) {
            int i;
            int i2;
            int[] iArr;
            ArrayList arrayList;
            int[] iArr2 = (int[]) this.mTimebase;
            ArrayList arrayList2 = (ArrayList) this.mSurfaceRequest;
            DiffUtil.Callback callback = (DiffUtil.Callback) this.this$0;
            BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.mRetryCount;
            int i4 = 1;
            int size = arrayList2.size() - 1;
            int i5 = this.mMaxRetryCount;
            int i6 = i5;
            while (size >= 0) {
                DiffUtil.Diagonal diagonal = (DiffUtil.Diagonal) arrayList2.get(size);
                int i7 = diagonal.x;
                int i8 = diagonal.size;
                int i9 = i7 + i8;
                int i10 = diagonal.y;
                int i11 = i10 + i8;
                int i12 = i4;
                while (true) {
                    i = 0;
                    if (i6 <= i9) {
                        break;
                    }
                    i6--;
                    int i13 = iArr2[i6];
                    if ((i13 & 12) != 0) {
                        iArr = iArr2;
                        int i14 = i13 >> 4;
                        DiffUtil.PostponedUpdate postponedUpdate = getPostponedUpdate(arrayDeque, i14, false);
                        if (postponedUpdate != null) {
                            int i15 = (i5 - postponedUpdate.currentPos) - 1;
                            batchingListUpdateCallback.onMoved(i6, i15);
                            if ((i13 & 4) != 0) {
                                arrayList = arrayList2;
                                batchingListUpdateCallback.onChanged(i15, i12, callback.getChangePayload(i6, i14));
                            } else {
                                arrayList = arrayList2;
                            }
                        } else {
                            arrayList = arrayList2;
                            boolean z = i12;
                            arrayDeque.add(new DiffUtil.PostponedUpdate(i6, (i5 - i6) - (z ? 1 : 0), z));
                        }
                    } else {
                        iArr = iArr2;
                        arrayList = arrayList2;
                        batchingListUpdateCallback.onRemoved(i6, i12);
                        i5--;
                    }
                    arrayList2 = arrayList;
                    iArr2 = iArr;
                    i12 = 1;
                }
                int[] iArr3 = iArr2;
                ArrayList arrayList3 = arrayList2;
                while (i3 > i11) {
                    i3--;
                    int i16 = ((int[]) this.mRetryFuture)[i3];
                    if ((i16 & 12) != 0) {
                        int i17 = i16 >> 4;
                        DiffUtil.PostponedUpdate postponedUpdate2 = getPostponedUpdate(arrayDeque, i17, true);
                        if (postponedUpdate2 == null) {
                            arrayDeque.add(new DiffUtil.PostponedUpdate(i3, i5 - i6, false));
                            i2 = 0;
                        } else {
                            i2 = 0;
                            batchingListUpdateCallback.onMoved((i5 - postponedUpdate2.currentPos) - 1, i6);
                            if ((i16 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i6, 1, callback.getChangePayload(i17, i3));
                            }
                        }
                    } else {
                        i2 = i;
                        batchingListUpdateCallback.onInserted(i6, 1);
                        i5++;
                    }
                    i = i2;
                }
                int i18 = i10;
                int i19 = i7;
                while (i < i8) {
                    if ((iArr3[i19] & 15) == 2) {
                        batchingListUpdateCallback.onChanged(i19, 1, callback.getChangePayload(i19, i18));
                    }
                    i19++;
                    i18++;
                    i++;
                }
                size--;
                i3 = i10;
                i6 = i7;
                i4 = 1;
                arrayList2 = arrayList3;
                iArr2 = iArr3;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }

        public SetupVideoTask(Recorder recorder, SurfaceRequest surfaceRequest, Timebase timebase, boolean z, int i) {
            this.this$0 = recorder;
            this.mIsFailedRetryCanceled = false;
            this.mRetryCount = 0;
            this.mRetryFuture = null;
            this.mSurfaceRequest = surfaceRequest;
            this.mTimebase = timebase;
            recorder.mHasGlProcessing = z;
            this.mMaxRetryCount = i;
        }
    }
}
