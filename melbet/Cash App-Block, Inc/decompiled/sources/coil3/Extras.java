package coil3;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewUtils$Api29Impl;
import androidx.camera.view.PreviewView;
import androidx.collection.MutableScatterSet;
import androidx.compose.animation.AndroidFlingSpline;
import androidx.compose.animation.FlingCalculator;
import androidx.compose.animation.FlingCalculatorKt;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.Animations;
import androidx.compose.animation.core.FloatAnimationSpec;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.FloatSpringSpec;
import androidx.compose.animation.core.VectorizedAnimationSpecKt;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SingleSubscriptionSnapshotFlowManager;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.retain.ManagedRetainedValuesStore;
import androidx.compose.runtime.retain.RetainedValuesStore;
import androidx.compose.runtime.retain.impl.PreconditionsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import androidx.compose.ui.text.platform.ImmutableBool;
import androidx.compose.ui.unit.Density;
import androidx.core.os.BundleKt;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.datastore.core.SimpleActor;
import androidx.emoji2.text.EmojiCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.request.CachePolicy;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.target.ImageViewTarget;
import coil3.target.Target;
import coil3.util.BitmapsKt;
import coil3.util.Utils_androidKt;
import com.appsflyer.AFLogger$$ExternalSyntheticLambda0;
import com.bugsnag.android.Connectivity;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.Datadog;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpo;
import com.squareup.cash.R;
import com.squareup.wire.GrpcMethod;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import okhttp3.HttpUrl;
import okio.FileSystem;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.InteractionResult;

/* loaded from: classes.dex */
public final class Extras {
    public static final Extras EMPTY = new Extras(BundleKt.toImmutableMap(new LinkedHashMap()));
    public final Map data;

    public Extras(Map map) {
        this.data = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Extras) && Intrinsics.areEqual(this.data, ((Extras) obj).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("Extras(data=", ")", this.data);
    }

    public final class Builder {
        public final LinkedHashMap data;

        public Builder(Extras extras) {
            this.data = MapsKt__MapsKt.toMutableMap(extras.data);
        }

        public final void set(Key key, Object obj) {
            LinkedHashMap linkedHashMap = this.data;
            if (obj != null) {
                linkedHashMap.put(key, obj);
            } else {
                linkedHashMap.remove(key);
            }
        }

        public Builder() {
            this.data = new LinkedHashMap();
        }
    }

    public class Key implements OnApplyWindowInsetsListener, FloatDecayAnimationSpec, Animations, VectorizedFiniteAnimationSpec, RetainedValuesStore, SQLiteDriver, Connectivity, ImageRequest.Listener, BaseGmsClient.BaseConnectionCallbacks, zzpo {
        public static volatile Key INSTANCE;

        /* renamed from: default, reason: not valid java name */
        public Object f61default;

        public Key(int i) {
            switch (i) {
                case 11:
                    ManagedRetainedValuesStore managedRetainedValuesStore = new ManagedRetainedValuesStore();
                    this.f61default = managedRetainedValuesStore;
                    if (!managedRetainedValuesStore.isDisposed) {
                        if (managedRetainedValuesStore.isContentComposed) {
                            PreconditionsKt.throwIllegalStateException("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                        }
                        managedRetainedValuesStore.purgeUnusedExitedValues();
                        managedRetainedValuesStore.isContentComposed = true;
                        break;
                    }
                    break;
                case 14:
                    this.f61default = new AccessibilityNodeProvider(this) { // from class: androidx.core.view.accessibility.AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi26
                        public final Extras.Key mCompat;

                        {
                            this.mCompat = this;
                        }

                        @Override // android.view.accessibility.AccessibilityNodeProvider
                        public final void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
                            this.mCompat.addExtraDataToAccessibilityNodeInfo(i2, AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo), str, bundle);
                        }

                        @Override // android.view.accessibility.AccessibilityNodeProvider
                        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
                            AccessibilityNodeInfoCompat createAccessibilityNodeInfo = this.mCompat.createAccessibilityNodeInfo(i2);
                            if (createAccessibilityNodeInfo == null) {
                                return null;
                            }
                            return createAccessibilityNodeInfo.unwrap();
                        }

                        @Override // android.view.accessibility.AccessibilityNodeProvider
                        public final List findAccessibilityNodeInfosByText(String str, int i2) {
                            this.mCompat.getClass();
                            return null;
                        }

                        @Override // android.view.accessibility.AccessibilityNodeProvider
                        public final AccessibilityNodeInfo findFocus(int i2) {
                            AccessibilityNodeInfoCompat findFocus = this.mCompat.findFocus(i2);
                            if (findFocus == null) {
                                return null;
                            }
                            return findFocus.unwrap();
                        }

                        @Override // android.view.accessibility.AccessibilityNodeProvider
                        public final boolean performAction(int i2, int i3, Bundle bundle) {
                            return this.mCompat.performAction(i2, i3, bundle);
                        }
                    };
                    break;
                case 18:
                    this.f61default = null;
                    break;
                case 21:
                    this.f61default = Choreographer.getInstance();
                    break;
                case 25:
                    this.f61default = Datadog.getInstance(null);
                    break;
                default:
                    this.f61default = new HashSet();
                    break;
            }
        }

        /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
        public static void m1433clipRectN_I0leg$default(Key key, float f, float f2, int i) {
            GrpcMethod grpcMethod = (GrpcMethod) key.f61default;
            if ((i & 4) != 0) {
                f = Float.intBitsToFloat((int) (grpcMethod.m3999getSizeNHjbRc() >> 32));
            }
            float f3 = f;
            if ((i & 8) != 0) {
                f2 = Float.intBitsToFloat((int) (grpcMethod.m3999getSizeNHjbRc() & BodyPartID.bodyIdMax));
            }
            key.m1435clipRectN_I0leg(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f3, f2, 1);
        }

        public static Lifecycle findLifecycle(ImageRequest imageRequest) {
            Target target = imageRequest.getTarget();
            Object context = target instanceof ImageViewTarget ? ((ImageViewTarget) target).getView().getContext() : imageRequest.getContext();
            while (!(context instanceof LifecycleOwner)) {
                if (!(context instanceof ContextWrapper)) {
                    return null;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            return ((LifecycleOwner) context).getLifecycle();
        }

        public static boolean isConfigValidForHardware(ImageRequest imageRequest, Bitmap.Config config) {
            if (!BitmapsKt.isHardware(config)) {
                return true;
            }
            if (!((Boolean) ExtrasKt.getExtra(imageRequest, ImageRequests_androidKt.allowHardwareKey)).booleanValue()) {
                return false;
            }
            Target target = imageRequest.getTarget();
            if (!(target instanceof ImageViewTarget)) {
                return true;
            }
            View view = ((ImageViewTarget) target).getView();
            return !view.isAttachedToWindow() || view.isHardwareAccelerated();
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
        }

        /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
        public void m1434clipPathmtrdDE(AndroidPath androidPath, int i) {
            ((GrpcMethod) this.f61default).getCanvas().mo647clipPathmtrdDE(androidPath, i);
        }

        /* renamed from: clipRect-N_I0leg, reason: not valid java name */
        public void m1435clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
            ((GrpcMethod) this.f61default).getCanvas().mo648clipRectN_I0leg(f, f2, f3, f4, i);
        }

        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
            return null;
        }

        public AccessibilityNodeInfoCompat findFocus(int i) {
            return null;
        }

        @Override // androidx.compose.animation.core.Animations
        public FloatAnimationSpec get(int i) {
            return (FloatSpringSpec) this.f61default;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getAbsVelocityThreshold() {
            return RecyclerView.DECELERATION_RATE;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public long getDurationNanos(float f) {
            FlingCalculator flingCalculator = (FlingCalculator) this.f61default;
            flingCalculator.getClass();
            float[] fArr = AndroidFlingSpline.SplinePositions;
            return ((long) (Math.exp(AndroidFlingSpline.deceleration(f, flingCalculator.friction * flingCalculator.magicPhysicalCoefficient) / (FlingCalculatorKt.DecelerationRate - 1.0d)) * 1000.0d)) * 1000000;
        }

        @Override // androidx.compose.animation.core.VectorizedAnimationSpec
        public AnimationVector getEndVelocity(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
            return ((SimpleActor) this.f61default).getEndVelocity(animationVector, animationVector2, animationVector3);
        }

        public State getFontLoadState() {
            EmojiCompat emojiCompat = EmojiCompat.get();
            if (emojiCompat.getLoadState() == 1) {
                return new ImmutableBool(true);
            }
            final ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
            emojiCompat.registerInitCallback(new Room() { // from class: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1
                @Override // androidx.room.Room
                public final void onFailed(Throwable th) {
                    this.f61default = EmojiCompatStatus_androidKt.Falsey;
                }

                @Override // androidx.room.Room
                public final void onInitialized() {
                    ParcelableSnapshotMutableState.this.setValue(Boolean.TRUE);
                    this.f61default = new ImmutableBool(true);
                }
            });
            return mutableStateOf$default;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getTargetValue(float f, float f2) {
            FlingCalculator flingCalculator = (FlingCalculator) this.f61default;
            flingCalculator.getClass();
            float[] fArr = AndroidFlingSpline.SplinePositions;
            double deceleration = AndroidFlingSpline.deceleration(f2, flingCalculator.friction * flingCalculator.magicPhysicalCoefficient);
            double d = FlingCalculatorKt.DecelerationRate;
            return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * deceleration) * r0 * r9))) + f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getValueFromNanos(float f, float f2, long j) {
            return ((FlingCalculator) this.f61default).flingInfo(f2).position(j / 1000000) + f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getVelocityFromNanos(long j, float f) {
            return ((FlingCalculator) this.f61default).flingInfo(f).velocity(j / 1000000);
        }

        @Override // com.bugsnag.android.Connectivity
        public boolean hasNetworkConnection() {
            Object failure;
            try {
                Result.Companion companion = Result.Companion;
                failure = Boolean.valueOf(((Connectivity) this.f61default).hasNetworkConnection());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            if (Result.m4120exceptionOrNullimpl(failure) != null) {
                failure = Boolean.TRUE;
            }
            return ((Boolean) failure).booleanValue();
        }

        public void hide() {
            View view = (View) this.f61default;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        public void inset(float f, float f2, float f3, float f4) {
            GrpcMethod grpcMethod = (GrpcMethod) this.f61default;
            Canvas canvas = grpcMethod.getCanvas();
            float intBitsToFloat = Float.intBitsToFloat((int) (grpcMethod.m3999getSizeNHjbRc() >> 32)) - (f3 + f);
            float intBitsToFloat2 = Float.intBitsToFloat((int) (grpcMethod.m3999getSizeNHjbRc() & BodyPartID.bodyIdMax)) - (f4 + f2);
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < RecyclerView.DECELERATION_RATE || Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax)) < RecyclerView.DECELERATION_RATE) {
                InlineClassHelperKt.throwIllegalArgumentException("Width and height must be greater than or equal to zero");
            }
            grpcMethod.m4000setSizeuvyYCjk(floatToRawIntBits);
            canvas.translate(f, f2);
        }

        @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
        public boolean isInfinite() {
            ((SimpleActor) this.f61default).getClass();
            return false;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            boolean z;
            boolean z2;
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) this.f61default;
            Context context = appCompatDelegateImpl.mContext;
            int systemWindowInsetTop2 = windowInsetsCompat.getSystemWindowInsetTop();
            ActionBarContextView actionBarContextView = appCompatDelegateImpl.mActionModeView;
            if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                z = false;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatDelegateImpl.mActionModeView.getLayoutParams();
                if (appCompatDelegateImpl.mActionModeView.isShown()) {
                    if (appCompatDelegateImpl.mTempRect1 == null) {
                        appCompatDelegateImpl.mTempRect1 = new Rect();
                        appCompatDelegateImpl.mTempRect2 = new Rect();
                    }
                    Rect rect = appCompatDelegateImpl.mTempRect1;
                    Rect rect2 = appCompatDelegateImpl.mTempRect2;
                    rect.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                    ViewUtils$Api29Impl.computeFitSystemWindows(appCompatDelegateImpl.mSubDecor, rect, rect2);
                    int i = rect.top;
                    int i2 = rect.left;
                    int i3 = rect.right;
                    ViewGroup viewGroup = appCompatDelegateImpl.mSubDecor;
                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                    WindowInsetsCompat rootWindowInsets = ViewCompat.Api23Impl.getRootWindowInsets(viewGroup);
                    int systemWindowInsetLeft = rootWindowInsets == null ? 0 : rootWindowInsets.getSystemWindowInsetLeft();
                    int systemWindowInsetRight = rootWindowInsets == null ? 0 : rootWindowInsets.getSystemWindowInsetRight();
                    if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                        z2 = false;
                    } else {
                        marginLayoutParams.topMargin = i;
                        marginLayoutParams.leftMargin = i2;
                        marginLayoutParams.rightMargin = i3;
                        z2 = true;
                    }
                    if (i <= 0 || appCompatDelegateImpl.mStatusGuard != null) {
                        View view2 = appCompatDelegateImpl.mStatusGuard;
                        if (view2 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                            int i4 = marginLayoutParams2.height;
                            int i5 = marginLayoutParams.topMargin;
                            if (i4 != i5 || marginLayoutParams2.leftMargin != systemWindowInsetLeft || marginLayoutParams2.rightMargin != systemWindowInsetRight) {
                                marginLayoutParams2.height = i5;
                                marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                                marginLayoutParams2.rightMargin = systemWindowInsetRight;
                                appCompatDelegateImpl.mStatusGuard.setLayoutParams(marginLayoutParams2);
                            }
                        }
                    } else {
                        View view3 = new View(context);
                        appCompatDelegateImpl.mStatusGuard = view3;
                        view3.setVisibility(8);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                        layoutParams.leftMargin = systemWindowInsetLeft;
                        layoutParams.rightMargin = systemWindowInsetRight;
                        appCompatDelegateImpl.mSubDecor.addView(appCompatDelegateImpl.mStatusGuard, -1, layoutParams);
                    }
                    View view4 = appCompatDelegateImpl.mStatusGuard;
                    r7 = view4 != null;
                    if (r7 && view4.getVisibility() != 0) {
                        View view5 = appCompatDelegateImpl.mStatusGuard;
                        view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & PKIFailureInfo.certRevoked) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                    }
                    if (!appCompatDelegateImpl.mOverlayActionMode && r7) {
                        systemWindowInsetTop2 = 0;
                    }
                    z = r7;
                    r7 = z2;
                } else if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                } else {
                    z = false;
                    r7 = false;
                }
                if (r7) {
                    appCompatDelegateImpl.mActionModeView.setLayoutParams(marginLayoutParams);
                }
            }
            View view6 = appCompatDelegateImpl.mStatusGuard;
            if (view6 != null) {
                view6.setVisibility(z ? 0 : 8);
            }
            return ViewCompat.onApplyWindowInsets(view, systemWindowInsetTop != systemWindowInsetTop2 ? windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), systemWindowInsetTop2, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()) : windowInsetsCompat);
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
        public void onConnected() {
            ((GoogleApiClient.ConnectionCallbacks) this.f61default).onConnected(null);
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
        public void onConnectionSuspended(int i) {
            ((GoogleApiClient.ConnectionCallbacks) this.f61default).onConnectionSuspended(i);
        }

        @Override // coil3.request.ImageRequest.Listener
        public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
            Map map;
            imageRequest.getClass();
            RumMonitor rumMonitor = GlobalRumMonitor.get((InternalSdkCore) this.f61default);
            Throwable throwable = errorResult.getThrowable();
            Object data = imageRequest.getData();
            if (data instanceof String) {
                map = MapsKt__MapsJVMKt.mapOf(new Pair("request_path", data));
            } else if (data instanceof android.net.Uri) {
                map = Thread$State$EnumUnboxingLocalUtility.m("request_path", ((android.net.Uri) data).getPath());
            } else if (data instanceof HttpUrl) {
                try {
                    String url = new URL(((HttpUrl) data).url).toString();
                    url.getClass();
                    map = MapsKt__MapsJVMKt.mapOf(new Pair("request_path", url));
                } catch (MalformedURLException e) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                    return;
                }
            } else if (data instanceof File) {
                map = Thread$State$EnumUnboxingLocalUtility.m("request_path", ((File) data).getPath());
            } else {
                map = EmptyMap.INSTANCE;
                map.getClass();
            }
            rumMonitor.addError("Coil request error", 2, throwable, map);
        }

        @Override // androidx.sqlite.SQLiteDriver
        public SQLiteConnection open(String str) {
            str.getClass();
            return new SupportSQLiteConnection(((SupportSQLiteOpenHelper) this.f61default).getWritableDatabase());
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Options options(ImageRequest imageRequest, Size size) {
            Context context;
            boolean z;
            boolean z2;
            Context context2 = imageRequest.getContext();
            Scale scale = imageRequest.getScale();
            Precision precision = imageRequest.getPrecision();
            String diskCacheKey = imageRequest.getDiskCacheKey();
            FileSystem fileSystem = imageRequest.getFileSystem();
            CachePolicy memoryCachePolicy = imageRequest.getMemoryCachePolicy();
            CachePolicy diskCachePolicy = imageRequest.getDiskCachePolicy();
            CachePolicy networkCachePolicy = imageRequest.getNetworkCachePolicy();
            Key key = ImageRequests_androidKt.bitmapConfigKey;
            Bitmap.Config config = (Bitmap.Config) ExtrasKt.getExtra(imageRequest, key);
            Key key2 = ImageRequests_androidKt.allowRgb565Key;
            boolean booleanValue = ((Boolean) ExtrasKt.getExtra(imageRequest, key2)).booleanValue();
            Key key3 = ImageRequestsKt.transformationsKey;
            if (((List) ExtrasKt.getExtra(imageRequest, key3)).isEmpty()) {
                context = context2;
            } else {
                context = context2;
                if (!ArraysKt___ArraysKt.contains(Utils_androidKt.VALID_TRANSFORMATION_CONFIGS, (Bitmap.Config) ExtrasKt.getExtra(imageRequest, key))) {
                    z = false;
                    boolean z3 = BitmapsKt.isHardware((Bitmap.Config) ExtrasKt.getExtra(imageRequest, key)) || isConfigValidForHardware(imageRequest, (Bitmap.Config) ExtrasKt.getExtra(imageRequest, key));
                    if (z || !z3) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    z2 = (booleanValue || !((List) ExtrasKt.getExtra(imageRequest, key3)).isEmpty() || config == Bitmap.Config.ALPHA_8) ? false : true;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsKt.plus(imageRequest.getDefaults().extras.data, imageRequest.getExtras().data));
                    if (config != ((Bitmap.Config) ExtrasKt.getExtra(imageRequest, key))) {
                        if (config != null) {
                            linkedHashMap.put(key, config);
                        } else {
                            linkedHashMap.remove(key);
                        }
                    }
                    if (z2 != ((Boolean) ExtrasKt.getExtra(imageRequest, key2)).booleanValue()) {
                        linkedHashMap.put(key2, Boolean.valueOf(z2));
                    }
                    return new Options(context, size, scale, precision, diskCacheKey, fileSystem, memoryCachePolicy, diskCachePolicy, networkCachePolicy, new Extras(BundleKt.toImmutableMap(linkedHashMap)));
                }
            }
            z = true;
            if (BitmapsKt.isHardware((Bitmap.Config) ExtrasKt.getExtra(imageRequest, key))) {
            }
            if (z) {
            }
            config = Bitmap.Config.ARGB_8888;
            if (booleanValue) {
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsKt.plus(imageRequest.getDefaults().extras.data, imageRequest.getExtras().data));
            if (config != ((Bitmap.Config) ExtrasKt.getExtra(imageRequest, key))) {
            }
            if (z2 != ((Boolean) ExtrasKt.getExtra(imageRequest, key2)).booleanValue()) {
            }
            return new Options(context, size, scale, precision, diskCacheKey, fileSystem, memoryCachePolicy, diskCachePolicy, networkCachePolicy, new Extras(BundleKt.toImmutableMap(linkedHashMap2)));
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return false;
        }

        @Override // com.bugsnag.android.Connectivity
        public void registerForNetworkChanges() {
            try {
                Result.Companion companion = Result.Companion;
                ((Connectivity) this.f61default).registerForNetworkChanges();
            } catch (Throwable unused) {
                Result.Companion companion2 = Result.Companion;
            }
        }

        @Override // com.bugsnag.android.Connectivity
        public String retrieveNetworkAccessState() {
            Object failure;
            try {
                Result.Companion companion = Result.Companion;
                failure = ((Connectivity) this.f61default).retrieveNetworkAccessState();
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            if (Result.m4120exceptionOrNullimpl(failure) != null) {
                failure = "unknown";
            }
            return (String) failure;
        }

        /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
        public void m1436rotateUv8p0NA(long j, float f) {
            Canvas canvas = ((GrpcMethod) this.f61default).getCanvas();
            int i = (int) (j >> 32);
            float intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j & BodyPartID.bodyIdMax);
            canvas.translate(intBitsToFloat, Float.intBitsToFloat(i2));
            canvas.rotate(f);
            canvas.translate(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        }

        public Object runAndWatch$runtime(Channel channel, Function0 function0) {
            SingleSubscriptionSnapshotFlowManager singleSubscriptionSnapshotFlowManager;
            SendChannel sendChannel;
            if (((InteractionResult) this.f61default) == null) {
                androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Called runAndWatch on a manager that has been disposed of");
            }
            InteractionResult interactionResult = (InteractionResult) this.f61default;
            if ((interactionResult instanceof SingleSubscriptionSnapshotFlowManager) && (sendChannel = (singleSubscriptionSnapshotFlowManager = (SingleSubscriptionSnapshotFlowManager) interactionResult).subscribedChannel) != null && !sendChannel.equals(channel)) {
                MultiSubscriptionSnapshotFlowManager multiSubscriptionSnapshotFlowManager = new MultiSubscriptionSnapshotFlowManager();
                SendChannel sendChannel2 = singleSubscriptionSnapshotFlowManager.subscribedChannel;
                if (sendChannel2 == null) {
                    androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
                }
                MutableScatterSet mutableScatterSet = singleSubscriptionSnapshotFlowManager.watchSet;
                if (mutableScatterSet == null) {
                    Object obj = singleSubscriptionSnapshotFlowManager.soleWatchedObject;
                    obj.getClass();
                    multiSubscriptionSnapshotFlowManager.watch$runtime(obj, sendChannel2);
                } else {
                    Object[] objArr = mutableScatterSet.elements;
                    long[] jArr = mutableScatterSet.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        multiSubscriptionSnapshotFlowManager.watch$runtime(objArr[(i << 3) + i3], sendChannel2);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                multiSubscriptionSnapshotFlowManager.commitSubscriptionChanges$runtime();
                singleSubscriptionSnapshotFlowManager.dispose$runtime();
                this.f61default = multiSubscriptionSnapshotFlowManager;
            }
            InteractionResult interactionResult2 = (InteractionResult) this.f61default;
            interactionResult2.getClass();
            Snapshot takeNestedSnapshot = SnapshotKt.currentSnapshot().takeNestedSnapshot(interactionResult2.readObserverFor$runtime(channel));
            interactionResult2.clearWatchSet$runtime(channel);
            try {
                Snapshot makeCurrent = takeNestedSnapshot.makeCurrent();
                try {
                    Object invoke = function0.invoke();
                    takeNestedSnapshot.dispose();
                    interactionResult2.commitSubscriptionChanges$runtime();
                    return invoke;
                } finally {
                    Snapshot.restoreCurrent(makeCurrent);
                }
            } catch (Throwable th) {
                takeNestedSnapshot.dispose();
                throw th;
            }
        }

        /* renamed from: scale-0AR0LA0, reason: not valid java name */
        public void m1437scale0AR0LA0(float f, float f2, long j) {
            Canvas canvas = ((GrpcMethod) this.f61default).getCanvas();
            int i = (int) (j >> 32);
            float intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j & BodyPartID.bodyIdMax);
            canvas.translate(intBitsToFloat, Float.intBitsToFloat(i2));
            canvas.scale(f, f2);
            canvas.translate(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        }

        public void show() {
            View findFocus;
            View view = (View) this.f61default;
            if (view == null) {
                return;
            }
            if (view.onCheckIsTextEditor()) {
                view.requestFocus();
                findFocus = view;
            } else {
                findFocus = view.getRootView().findFocus();
            }
            if (findFocus == null) {
                findFocus = view.getRootView().findViewById(android.R.id.content);
            }
            if (findFocus == null || !findFocus.hasWindowFocus()) {
                return;
            }
            findFocus.post(new AFLogger$$ExternalSyntheticLambda0(findFocus, 7));
        }

        public void translate(float f, float f2) {
            ((GrpcMethod) this.f61default).getCanvas().translate(f, f2);
        }

        @Override // com.google.android.gms.measurement.internal.zzpo
        public void zza(String str, String str2, Bundle bundle) {
            boolean isEmpty = TextUtils.isEmpty(str);
            zzpg zzpgVar = (zzpg) this.f61default;
            if (!isEmpty) {
                zzpgVar.zzaX().zzj(new ProfileAdapter.AnonymousClass8(this, str, str2, bundle));
                return;
            }
            zzic zzicVar = zzpgVar.zzn;
            if (zzicVar != null) {
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzd.zzb(str2, "AppId not known when logging event");
            }
        }

        @Override // androidx.compose.animation.core.VectorizedAnimationSpec
        public AnimationVector getVelocityFromNanos(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
            return ((SimpleActor) this.f61default).getVelocityFromNanos(j, animationVector, animationVector2, animationVector3);
        }

        @Override // androidx.compose.animation.core.VectorizedAnimationSpec
        public AnimationVector getValueFromNanos(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
            return ((SimpleActor) this.f61default).getValueFromNanos(j, animationVector, animationVector2, animationVector3);
        }

        @Override // androidx.compose.animation.core.VectorizedAnimationSpec
        public long getDurationNanos(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
            return ((SimpleActor) this.f61default).getDurationNanos(animationVector, animationVector2, animationVector3);
        }

        public Key(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
            supportSQLiteOpenHelper.getClass();
            this.f61default = supportSQLiteOpenHelper;
        }

        public Key(Density density) {
            this.f61default = new FlingCalculator(SplineBasedFloatDecayAnimationSpec_androidKt.platformFlingScrollFriction, density);
        }

        public /* synthetic */ Key(Object obj) {
            this.f61default = obj;
        }

        public Key(float f, float f2, AnimationVector animationVector) {
            Animations animations;
            int[] iArr = VectorizedAnimationSpecKt.EmptyIntArray;
            if (animationVector != null) {
                animations = new PreviewView.AnonymousClass1(f, f2, animationVector);
            } else {
                Key key = new Key();
                key.f61default = new FloatSpringSpec(f, f2, 0.01f);
                animations = key;
            }
            this.f61default = new SimpleActor(animations);
        }
    }
}
