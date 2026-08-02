package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import android.util.AttributeSet;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.impl.UseCaseType;
import androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.android.volley.NetworkResponse;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.engine.LockedResource;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.model.StringLoader;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.util.pool.FactoryPools;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.account.MutableAccountInfoProvider;
import com.datadog.android.core.internal.net.info.NetworkInfoProvider;
import com.datadog.android.core.internal.system.AppVersionProvider;
import com.datadog.android.core.persistence.Serializer;
import com.datadog.android.ndk.internal.NdkCrashHandler;
import com.datadog.android.rum.internal.domain.InfoData;
import com.datadog.android.rum.internal.domain.InfoProvider;
import com.datadog.android.rum.internal.domain.battery.BatteryInfo;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.filament.Renderer;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.floatingactionbutton.BaseMotionStrategy;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate;
import com.google.android.material.search.SearchViewAnimationHelper;
import com.google.android.material.shape.ShapePath;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.squareup.scannerview.OverlayView;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public abstract class Transition implements Cloneable {
    public Animator[] mAnimatorCache;
    public ArrayList mAnimators;
    public Transition mCloneParent;
    public final ArrayList mCurrentAnimators;
    public long mDuration;
    public UnleashContext mEndValues;
    public ArrayList mEndValuesList;
    public boolean mEnded;
    public Styleable mEpicenterCallback;
    public TimeInterpolator mInterpolator;
    public ArrayList mListeners;
    public TransitionListener[] mListenersCache;
    public final int[] mMatchOrder;
    public final String mName;
    public int mNumInstances;
    public TransitionSet mParent;
    public AnonymousClass1 mPathMotion;
    public boolean mPaused;
    public SidePropagation mPropagation;
    public SeekController mSeekController;
    public long mSeekOffsetInParent;
    public long mStartDelay;
    public UnleashContext mStartValues;
    public ArrayList mStartValuesList;
    public ArrayList mTargetExcludes;
    public final ArrayList mTargetIds;
    public final ArrayList mTargets;
    public long mTotalDuration;
    public static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    public static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    public static final AnonymousClass1 STRAIGHT_PATH_MOTION = new AnonymousClass1();
    public static final ThreadLocal sRunningAnimators = new ThreadLocal();

    /* renamed from: androidx.transition.Transition$3, reason: invalid class name */
    public final class AnonymousClass3 extends AnimatorListenerAdapter {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 1:
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                    actionBarOverlayLayout.mCurrentActionBarTopAnimator = null;
                    actionBarOverlayLayout.mAnimatingForFling = false;
                    break;
                case 5:
                    ((BaseMotionStrategy) obj).onAnimationCancel();
                    break;
                case 6:
                    super.onAnimationCancel(animator);
                    FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                    focusRingDrawable.interpolation = 1.0f;
                    focusRingDrawable.invalidateSelf();
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    ((Transition) obj).end();
                    animator.removeListener(this);
                    break;
                case 1:
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                    actionBarOverlayLayout.mCurrentActionBarTopAnimator = null;
                    actionBarOverlayLayout.mAnimatingForFling = false;
                    break;
                case 2:
                    AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) obj;
                    ArrayList arrayList = new ArrayList(animatedVectorDrawableCompat.mAnimationCallbacks);
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((Animatable2Compat$AnimationCallback) arrayList.get(i2)).onAnimationEnd(animatedVectorDrawableCompat);
                    }
                    break;
                case 3:
                    NetworkResponse networkResponse = (NetworkResponse) obj;
                    int i3 = networkResponse.statusCode - 1;
                    networkResponse.statusCode = i3;
                    if (i3 == 0) {
                        Iterator it = ((ArrayList) networkResponse.allHeaders).iterator();
                        while (it.hasNext()) {
                            ((SearchViewAnimationHelper.AnonymousClass1) it.next()).onAnimationsEnd();
                        }
                        networkResponse.notModified = false;
                        break;
                    }
                    break;
                case 4:
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                    bottomSheetBehavior.setStateInternal(5);
                    WeakReference weakReference = bottomSheetBehavior.viewRef;
                    if (weakReference != null && weakReference.get() != null) {
                        ((View) bottomSheetBehavior.viewRef.get()).requestLayout();
                        break;
                    }
                    break;
                case 5:
                    ((BaseMotionStrategy) obj).onAnimationEnd();
                    break;
                case 6:
                case 9:
                default:
                    super.onAnimationEnd(animator);
                    break;
                case 7:
                    MaterialBottomContainerBackHelper materialBottomContainerBackHelper = (MaterialBottomContainerBackHelper) obj;
                    materialBottomContainerBackHelper.view.setTranslationY(RecyclerView.DECELERATION_RATE);
                    materialBottomContainerBackHelper.updateBackProgress(RecyclerView.DECELERATION_RATE);
                    break;
                case 8:
                    View view = (View) obj;
                    if (view != null) {
                        view.setVisibility(0);
                        break;
                    }
                    break;
                case 10:
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                    sideSheetBehavior.setStateInternal(5);
                    WeakReference weakReference2 = sideSheetBehavior.viewRef;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        ((View) sideSheetBehavior.viewRef.get()).requestLayout();
                        break;
                    }
                    break;
                case 11:
                    DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) obj;
                    dropdownMenuEndIconDelegate.refreshIconState();
                    dropdownMenuEndIconDelegate.fadeInAnim.start();
                    break;
                case 12:
                    ((ExpandableTransformationBehavior) obj).currentAnimation = null;
                    break;
                case 13:
                    animator.getClass();
                    ((OverlayView) obj).showingSuccess = false;
                    break;
                case 14:
                    animator.getClass();
                    ((LinearLayout) obj).setVisibility(8);
                    break;
                case 15:
                    animator.getClass();
                    ArrayList arrayList2 = ((OldSelfieOverlayView) obj).oneShotOnAnimationCompleteListeners;
                    List list = CollectionsKt.toList(arrayList2);
                    arrayList2.clear();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((Function0) it2.next()).invoke();
                    }
                    break;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            switch (this.$r8$classId) {
                case 9:
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = (LinearIndeterminateContiguousAnimatorDelegate) this.this$0;
                    linearIndeterminateContiguousAnimatorDelegate.newIndicatorColorIndex = (linearIndeterminateContiguousAnimatorDelegate.newIndicatorColorIndex + 1) % linearIndeterminateContiguousAnimatorDelegate.baseSpec.indicatorColors.length;
                    linearIndeterminateContiguousAnimatorDelegate.dirtyColors = true;
                    break;
                default:
                    super.onAnimationRepeat(animator);
                    break;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 2:
                    AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) obj;
                    ArrayList arrayList = new ArrayList(animatedVectorDrawableCompat.mAnimationCallbacks);
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((Animatable2Compat$AnimationCallback) arrayList.get(i2)).onAnimationStart(animatedVectorDrawableCompat);
                    }
                    break;
                case 5:
                    ((BaseMotionStrategy) obj).onAnimationStart(animator);
                    break;
                case 13:
                    animator.getClass();
                    ((OverlayView) obj).showingSuccess = true;
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }
    }

    public final class AnimationInfo {
        public Animator mAnimator;
        public String mName;
        public Transition mTransition;
        public TransitionValues mValues;
        public View mView;
        public WindowId mWindowId;
    }

    public final class SeekController extends TransitionListenerAdapter {
        public boolean mIsCanceled;
        public boolean mIsReady;
        public Runnable mResetToStartState;
        public SpringAnimation mSpringAnimation;
        public final HuffmanTreeGroup mVelocityTracker;
        public final /* synthetic */ TransitionSet this$0;
        public long mCurrentPlayTime = -1;
        public int mOnReady = 0;

        public SeekController(TransitionSet transitionSet) {
            this.this$0 = transitionSet;
            HuffmanTreeGroup huffmanTreeGroup = new HuffmanTreeGroup(12, false);
            long[] jArr = new long[20];
            huffmanTreeGroup.codes = jArr;
            huffmanTreeGroup.trees = new float[20];
            huffmanTreeGroup.alphabetSize = 0;
            Arrays.fill(jArr, Long.MIN_VALUE);
            this.mVelocityTracker = huffmanTreeGroup;
        }

        public final void animateToEnd() {
            if (this.mIsReady) {
                ensureAnimation();
                this.mSpringAnimation.animateToFinalPosition(this.this$0.mTotalDuration + 1);
            } else {
                this.mOnReady = 1;
                this.mResetToStartState = null;
            }
        }

        public final void ensureAnimation() {
            int i;
            char c;
            if (this.mSpringAnimation != null) {
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f = this.mCurrentPlayTime;
            HuffmanTreeGroup huffmanTreeGroup = this.mVelocityTracker;
            int i2 = huffmanTreeGroup.alphabetSize;
            float[] fArr = (float[]) huffmanTreeGroup.trees;
            long[] jArr = (long[]) huffmanTreeGroup.codes;
            char c2 = 20;
            int i3 = (i2 + 1) % 20;
            huffmanTreeGroup.alphabetSize = i3;
            jArr[i3] = currentAnimationTimeMillis;
            fArr[i3] = f;
            Renderer.DisplayInfo displayInfo = new Renderer.DisplayInfo(1);
            float f2 = RecyclerView.DECELERATION_RATE;
            displayInfo.refreshRate = RecyclerView.DECELERATION_RATE;
            this.mSpringAnimation = new SpringAnimation(displayInfo);
            SpringForce springForce = new SpringForce();
            springForce.setDampingRatio(1.0f);
            springForce.setStiffness(200.0f);
            SpringAnimation springAnimation = this.mSpringAnimation;
            springAnimation.mSpring = springForce;
            springAnimation.setStartValue(this.mCurrentPlayTime);
            SpringAnimation springAnimation2 = this.mSpringAnimation;
            ArrayList arrayList = springAnimation2.mUpdateListeners;
            if (springAnimation2.mRunning) {
                a$$ExternalSyntheticBUOutline0.m("Error: Update listeners must be added beforethe animation.");
                return;
            }
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            SpringAnimation springAnimation3 = this.mSpringAnimation;
            int i4 = huffmanTreeGroup.alphabetSize;
            int i5 = 0;
            long j = Long.MIN_VALUE;
            if (i4 != 0 || jArr[i4] != Long.MIN_VALUE) {
                long j2 = jArr[i4];
                int i6 = 0;
                long j3 = j2;
                while (true) {
                    long j4 = jArr[i4];
                    if (j4 != j) {
                        float f3 = j2 - j4;
                        float abs = Math.abs(j4 - j3);
                        if (f3 > 100.0f || abs > 40.0f) {
                            break;
                        }
                        if (i4 == 0) {
                            i4 = 20;
                        }
                        i4--;
                        i = i6 + 1;
                        if (i >= 20) {
                            break;
                        }
                        i6 = i;
                        j3 = j4;
                        j = Long.MIN_VALUE;
                    } else {
                        break;
                    }
                }
                i = i6;
                if (i >= 2) {
                    int i7 = huffmanTreeGroup.alphabetSize;
                    if (i == 2) {
                        int i8 = i7 == 0 ? 19 : i7 - 1;
                        float f4 = jArr[i7] - jArr[i8];
                        if (f4 != RecyclerView.DECELERATION_RATE) {
                            f2 = ((fArr[i7] - fArr[i8]) / f4) * 1000.0f;
                        }
                    } else {
                        int i9 = ((i7 - i) + 21) % 20;
                        int i10 = (i7 + 21) % 20;
                        long j5 = jArr[i9];
                        float f5 = fArr[i9];
                        int i11 = i9 + 1;
                        int i12 = i11 % 20;
                        float f6 = 0.0f;
                        while (i12 != i10) {
                            long j6 = jArr[i12];
                            float f7 = f2;
                            int i13 = i10;
                            float f8 = j6 - j5;
                            if (f8 == f7) {
                                c = c2;
                            } else {
                                float f9 = fArr[i12];
                                c = c2;
                                float f10 = (f9 - f5) / f8;
                                float abs2 = (Math.abs(f10) * (f10 - ((float) (Math.sqrt(2.0f * Math.abs(f6)) * Math.signum(f6))))) + f6;
                                if (i12 == i11) {
                                    abs2 *= 0.5f;
                                }
                                f6 = abs2;
                                f5 = f9;
                                j5 = j6;
                            }
                            i12 = (i12 + 1) % 20;
                            f2 = f7;
                            i10 = i13;
                            c2 = c;
                        }
                        f2 = ((float) (Math.sqrt(Math.abs(f6) * 2.0f) * Math.signum(f6))) * 1000.0f;
                    }
                }
            }
            springAnimation3.mVelocity = f2;
            SpringAnimation springAnimation4 = this.mSpringAnimation;
            springAnimation4.mMaxValue = this.this$0.mTotalDuration + 1;
            springAnimation4.mMinValue = -1.0f;
            springAnimation4.setMinimumVisibleChange(4.0f);
            this.mSpringAnimation.addEndListener(new Transition$SeekController$$ExternalSyntheticLambda0(this, i5));
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            this.mIsCanceled = true;
        }
    }

    public interface TransitionListener {
        void onTransitionCancel(Transition transition);

        void onTransitionEnd(Transition transition);

        default void onTransitionEnd$1(Transition transition) {
            onTransitionEnd(transition);
        }

        void onTransitionPause();

        void onTransitionResume();

        void onTransitionStart(Transition transition);

        default void onTransitionStart$1(Transition transition) {
            onTransitionStart(transition);
        }
    }

    public interface TransitionNotification {
        public static final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 ON_START = new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(8);
        public static final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 ON_END = new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(9);
        public static final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 ON_CANCEL = new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(10);
        public static final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 ON_PAUSE = new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(11);
        public static final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 ON_RESUME = new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(12);

        void notifyListener(TransitionListener transitionListener, Transition transition, boolean z);
    }

    public Transition(Context context, AttributeSet attributeSet) {
        this.mName = getClass().getName();
        this.mStartDelay = -1L;
        this.mDuration = -1L;
        this.mInterpolator = null;
        this.mTargetIds = new ArrayList();
        this.mTargets = new ArrayList();
        this.mTargetExcludes = null;
        this.mStartValues = new UnleashContext(8);
        this.mEndValues = new UnleashContext(8);
        this.mParent = null;
        int[] iArr = DEFAULT_MATCH_ORDER;
        this.mMatchOrder = iArr;
        this.mCurrentAnimators = new ArrayList();
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        this.mNumInstances = 0;
        this.mPaused = false;
        this.mEnded = false;
        this.mCloneParent = null;
        this.mListeners = null;
        this.mAnimators = new ArrayList();
        this.mPathMotion = STRAIGHT_PATH_MOTION;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.TRANSITION);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long namedInt = DimensionKt.getNamedInt(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (namedInt >= 0) {
            setDuration(namedInt);
        }
        long j = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startDelay") != null ? obtainStyledAttributes.getInt(2, -1) : -1;
        if (j > 0) {
            setStartDelay(j);
        }
        int resourceId = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? obtainStyledAttributes.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String string2 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "matchOrder") != null ? obtainStyledAttributes.getString(3) : null;
        if (string2 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(string2, ",");
            int[] iArr2 = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String trim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(trim)) {
                    iArr2[i] = 3;
                } else if ("instance".equalsIgnoreCase(trim)) {
                    iArr2[i] = 1;
                } else if ("name".equalsIgnoreCase(trim)) {
                    iArr2[i] = 2;
                } else if ("itemId".equalsIgnoreCase(trim)) {
                    iArr2[i] = 4;
                } else {
                    if (!trim.isEmpty()) {
                        throw new InflateException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unknown match type in matchOrder: '", trim, "'"));
                    }
                    int[] iArr3 = new int[iArr2.length - 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i);
                    i--;
                    iArr2 = iArr3;
                }
                i++;
            }
            if (iArr2.length == 0) {
                this.mMatchOrder = iArr;
            } else {
                for (int i2 = 0; i2 < iArr2.length; i2++) {
                    int i3 = iArr2[i2];
                    if (i3 < 1 || i3 > 4) {
                        a$$ExternalSyntheticBUOutline0.m$3("matches contains invalid value");
                        throw null;
                    }
                    for (int i4 = 0; i4 < i2; i4++) {
                        if (iArr2[i4] == i3) {
                            a$$ExternalSyntheticBUOutline0.m$3("matches contains a duplicate value");
                            throw null;
                        }
                    }
                }
                this.mMatchOrder = (int[]) iArr2.clone();
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static void addViewValues(UnleashContext unleashContext, View view, TransitionValues transitionValues) {
        ArrayMap arrayMap = (ArrayMap) unleashContext.userId;
        ArrayMap arrayMap2 = (ArrayMap) unleashContext.properties;
        SparseArray sparseArray = (SparseArray) unleashContext.sessionId;
        LongSparseArray longSparseArray = (LongSparseArray) unleashContext.remoteAddress;
        arrayMap.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (arrayMap2.containsKey(transitionName)) {
                arrayMap2.put(transitionName, null);
            } else {
                arrayMap2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (longSparseArray.indexOfKey(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    longSparseArray.put(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) longSparseArray.get(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    longSparseArray.put(null, itemIdAtPosition);
                }
            }
        }
    }

    public static ArrayMap getRunningAnimators() {
        ThreadLocal threadLocal = sRunningAnimators;
        ArrayMap arrayMap = (ArrayMap) threadLocal.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap(0);
        threadLocal.set(arrayMap2);
        return arrayMap2;
    }

    public static boolean isValueChanged(TransitionValues transitionValues, TransitionValues transitionValues2, String str) {
        Object obj = transitionValues.values.get(str);
        Object obj2 = transitionValues2.values.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void addListener(TransitionListener transitionListener) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList();
        }
        this.mListeners.add(transitionListener);
    }

    public void addTarget(View view) {
        this.mTargets.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.mCurrentAnimators;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.mAnimatorCache = animatorArr;
        notifyFromTransition(this, TransitionNotification.ON_CANCEL, false);
    }

    public abstract void captureEndValues(TransitionValues transitionValues);

    public final void captureHierarchy(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList arrayList = this.mTargetExcludes;
        if (arrayList == null || !arrayList.contains(view)) {
            if (view.getParent() instanceof ViewGroup) {
                TransitionValues transitionValues = new TransitionValues(view);
                if (z) {
                    captureStartValues(transitionValues);
                } else {
                    captureEndValues(transitionValues);
                }
                transitionValues.mTargetedTransitions.add(this);
                capturePropagationValues(transitionValues);
                if (z) {
                    addViewValues(this.mStartValues, view, transitionValues);
                } else {
                    addViewValues(this.mEndValues, view, transitionValues);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    captureHierarchy(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public void capturePropagationValues(TransitionValues transitionValues) {
        if (this.mPropagation != null) {
            HashMap hashMap = transitionValues.values;
            if (hashMap.isEmpty()) {
                return;
            }
            this.mPropagation.getClass();
            for (int i = 0; i < 2; i++) {
                if (!hashMap.containsKey(SidePropagation.VISIBILITY_PROPAGATION_VALUES[i])) {
                    this.mPropagation.getClass();
                    View view = transitionValues.view;
                    Integer num = (Integer) hashMap.get("android:visibility:visibility");
                    if (num == null) {
                        num = Integer.valueOf(view.getVisibility());
                    }
                    hashMap.put("android:visibilityPropagation:visibility", num);
                    int[] iArr = {r4, 0};
                    view.getLocationOnScreen(iArr);
                    int round = Math.round(view.getTranslationX()) + iArr[0];
                    iArr[0] = (view.getWidth() / 2) + round;
                    int round2 = Math.round(view.getTranslationY()) + iArr[1];
                    iArr[1] = round2;
                    iArr[1] = (view.getHeight() / 2) + round2;
                    hashMap.put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    public abstract void captureStartValues(TransitionValues transitionValues);

    public final void captureValues(ViewGroup viewGroup, boolean z) {
        clearValues(z);
        ArrayList arrayList = this.mTargetIds;
        int size = arrayList.size();
        ArrayList arrayList2 = this.mTargets;
        if (size <= 0 && arrayList2.size() <= 0) {
            captureHierarchy(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                TransitionValues transitionValues = new TransitionValues(findViewById);
                if (z) {
                    captureStartValues(transitionValues);
                } else {
                    captureEndValues(transitionValues);
                }
                transitionValues.mTargetedTransitions.add(this);
                capturePropagationValues(transitionValues);
                if (z) {
                    addViewValues(this.mStartValues, findViewById, transitionValues);
                } else {
                    addViewValues(this.mEndValues, findViewById, transitionValues);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            TransitionValues transitionValues2 = new TransitionValues(view);
            if (z) {
                captureStartValues(transitionValues2);
            } else {
                captureEndValues(transitionValues2);
            }
            transitionValues2.mTargetedTransitions.add(this);
            capturePropagationValues(transitionValues2);
            if (z) {
                addViewValues(this.mStartValues, view, transitionValues2);
            } else {
                addViewValues(this.mEndValues, view, transitionValues2);
            }
        }
    }

    public final void clearValues(boolean z) {
        if (z) {
            ((ArrayMap) this.mStartValues.userId).clear();
            ((SparseArray) this.mStartValues.sessionId).clear();
            ((LongSparseArray) this.mStartValues.remoteAddress).clear();
        } else {
            ((ArrayMap) this.mEndValues.userId).clear();
            ((SparseArray) this.mEndValues.sessionId).clear();
            ((LongSparseArray) this.mEndValues.remoteAddress).clear();
        }
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Transition mo1193clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.mAnimators = new ArrayList();
            transition.mStartValues = new UnleashContext(8);
            transition.mEndValues = new UnleashContext(8);
            transition.mStartValuesList = null;
            transition.mEndValuesList = null;
            transition.mSeekController = null;
            transition.mCloneParent = this;
            transition.mListeners = null;
            return transition;
        } catch (CloneNotSupportedException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b3, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c1, code lost:
    
        if (r31.getLayoutDirection() == r11) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01af, code lost:
    
        if (r31.getLayoutDirection() == r17) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b1, code lost:
    
        r1 = 5;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void createAnimators(ViewGroup viewGroup, UnleashContext unleashContext, UnleashContext unleashContext2, ArrayList arrayList, ArrayList arrayList2) {
        Animator createAnimator;
        int i;
        boolean z;
        int i2;
        int i3;
        View view;
        TransitionValues transitionValues;
        Rect rect;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int abs;
        int i9;
        long j;
        long m;
        int[] iArr;
        int[] iArr2;
        ViewGroup viewGroup2 = viewGroup;
        ArrayMap runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z2 = getRootTransition().mSeekController != null;
        long j2 = Long.MAX_VALUE;
        int i10 = 0;
        while (i10 < size) {
            TransitionValues transitionValues2 = (TransitionValues) arrayList.get(i10);
            TransitionValues transitionValues3 = (TransitionValues) arrayList2.get(i10);
            if (transitionValues2 != null && !transitionValues2.mTargetedTransitions.contains(this)) {
                transitionValues2 = null;
            }
            if (transitionValues3 != null && !transitionValues3.mTargetedTransitions.contains(this)) {
                transitionValues3 = null;
            }
            if (!(transitionValues2 == null && transitionValues3 == null) && ((transitionValues2 == null || transitionValues3 == null || isTransitionRequired(transitionValues2, transitionValues3)) && (createAnimator = createAnimator(viewGroup2, transitionValues2, transitionValues3)) != null)) {
                String str = this.mName;
                if (transitionValues3 != null) {
                    i3 = 1;
                    view = transitionValues3.view;
                    i = size;
                    String[] transitionProperties = getTransitionProperties();
                    z = z2;
                    if (transitionProperties == null || transitionProperties.length <= 0) {
                        i2 = i10;
                        createAnimator = createAnimator;
                    } else {
                        transitionValues = new TransitionValues(view);
                        i2 = i10;
                        TransitionValues transitionValues4 = (TransitionValues) ((ArrayMap) unleashContext2.userId).get(view);
                        if (transitionValues4 != null) {
                            int i11 = 0;
                            while (i11 < transitionProperties.length) {
                                String str2 = transitionProperties[i11];
                                transitionValues.values.put(str2, transitionValues4.values.get(str2));
                                i11++;
                                transitionProperties = transitionProperties;
                            }
                        }
                        int i12 = runningAnimators.size;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= i12) {
                                createAnimator = createAnimator;
                                break;
                            }
                            AnimationInfo animationInfo = (AnimationInfo) runningAnimators.get((Animator) runningAnimators.keyAt(i13));
                            if (animationInfo.mValues != null && animationInfo.mView == view && animationInfo.mName.equals(str) && animationInfo.mValues.equals(transitionValues)) {
                                createAnimator = null;
                                break;
                            }
                            i13++;
                        }
                        if (createAnimator != null) {
                            SidePropagation sidePropagation = this.mPropagation;
                            if (sidePropagation != null) {
                                if (transitionValues2 == null && transitionValues3 == null) {
                                    m = 0;
                                } else {
                                    Styleable styleable = this.mEpicenterCallback;
                                    Rect onGetEpicenter = styleable == null ? null : styleable.onGetEpicenter();
                                    if (transitionValues3 != null) {
                                        int i14 = 8;
                                        if (transitionValues2 == null) {
                                            rect = onGetEpicenter;
                                        } else {
                                            rect = onGetEpicenter;
                                            Integer num = (Integer) transitionValues2.values.get("android:visibilityPropagation:visibility");
                                            if (num != null) {
                                                i14 = num.intValue();
                                            }
                                        }
                                        if (i14 != 0) {
                                            transitionValues2 = transitionValues3;
                                            i4 = i3;
                                            int i15 = (transitionValues2 == null || (iArr2 = (int[]) transitionValues2.values.get("android:visibilityPropagation:center")) == null) ? -1 : iArr2[0];
                                            int i16 = (transitionValues2 == null || (iArr = (int[]) transitionValues2.values.get("android:visibilityPropagation:center")) == null) ? -1 : iArr[i3];
                                            int[] iArr3 = new int[2];
                                            viewGroup2.getLocationOnScreen(iArr3);
                                            int round = Math.round(viewGroup2.getTranslationX()) + iArr3[0];
                                            int round2 = Math.round(viewGroup2.getTranslationY()) + iArr3[i3];
                                            int width = viewGroup2.getWidth() + round;
                                            int height = viewGroup2.getHeight() + round2;
                                            if (rect == null) {
                                                i6 = rect.centerX();
                                                i5 = rect.centerY();
                                            } else {
                                                i5 = (round2 + height) / 2;
                                                i6 = (round + width) / 2;
                                            }
                                            i7 = sidePropagation.mSide;
                                            int i17 = i6;
                                            if (i7 == 8388611) {
                                                int i18 = i3;
                                                if (i7 == 8388613) {
                                                }
                                            }
                                            if (i7 == 3) {
                                                if (i7 == 5) {
                                                    i9 = Math.abs(i5 - i16) + (i15 - round);
                                                } else if (i7 == 48) {
                                                    i9 = Math.abs(i17 - i15) + (height - i16);
                                                } else if (i7 != 80) {
                                                    i9 = 0;
                                                } else {
                                                    i8 = i16 - round2;
                                                    abs = Math.abs(i17 - i15);
                                                }
                                                float f = i9;
                                                int i19 = sidePropagation.mSide;
                                                float width2 = f / ((i19 != 3 || i19 == 5 || i19 == 8388611 || i19 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
                                                j = this.mDuration;
                                                if (j < 0) {
                                                    j = 300;
                                                }
                                                m = Recorder$$ExternalSyntheticOutline2.m(i4 * j, 3.0f, width2);
                                            } else {
                                                i8 = width - i15;
                                                abs = Math.abs(i5 - i16);
                                            }
                                            i9 = abs + i8;
                                            float f2 = i9;
                                            int i192 = sidePropagation.mSide;
                                            float width22 = f2 / ((i192 != 3 || i192 == 5 || i192 == 8388611 || i192 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
                                            j = this.mDuration;
                                            if (j < 0) {
                                            }
                                            m = Recorder$$ExternalSyntheticOutline2.m(i4 * j, 3.0f, width22);
                                        }
                                    } else {
                                        rect = onGetEpicenter;
                                    }
                                    i4 = -1;
                                    if (transitionValues2 == null) {
                                        if (transitionValues2 == null) {
                                            int i162 = (transitionValues2 == null || (iArr = (int[]) transitionValues2.values.get("android:visibilityPropagation:center")) == null) ? -1 : iArr[i3];
                                            int[] iArr32 = new int[2];
                                            viewGroup2.getLocationOnScreen(iArr32);
                                            int round3 = Math.round(viewGroup2.getTranslationX()) + iArr32[0];
                                            int round22 = Math.round(viewGroup2.getTranslationY()) + iArr32[i3];
                                            int width3 = viewGroup2.getWidth() + round3;
                                            int height2 = viewGroup2.getHeight() + round22;
                                            if (rect == null) {
                                            }
                                            i7 = sidePropagation.mSide;
                                            int i172 = i6;
                                            if (i7 == 8388611) {
                                            }
                                            if (i7 == 3) {
                                            }
                                            i9 = abs + i8;
                                            float f22 = i9;
                                            int i1922 = sidePropagation.mSide;
                                            float width222 = f22 / ((i1922 != 3 || i1922 == 5 || i1922 == 8388611 || i1922 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
                                            j = this.mDuration;
                                            if (j < 0) {
                                            }
                                            m = Recorder$$ExternalSyntheticOutline2.m(i4 * j, 3.0f, width222);
                                        }
                                        int i1622 = (transitionValues2 == null || (iArr = (int[]) transitionValues2.values.get("android:visibilityPropagation:center")) == null) ? -1 : iArr[i3];
                                        int[] iArr322 = new int[2];
                                        viewGroup2.getLocationOnScreen(iArr322);
                                        int round32 = Math.round(viewGroup2.getTranslationX()) + iArr322[0];
                                        int round222 = Math.round(viewGroup2.getTranslationY()) + iArr322[i3];
                                        int width32 = viewGroup2.getWidth() + round32;
                                        int height22 = viewGroup2.getHeight() + round222;
                                        if (rect == null) {
                                        }
                                        i7 = sidePropagation.mSide;
                                        int i1722 = i6;
                                        if (i7 == 8388611) {
                                        }
                                        if (i7 == 3) {
                                        }
                                        i9 = abs + i8;
                                        float f222 = i9;
                                        int i19222 = sidePropagation.mSide;
                                        float width2222 = f222 / ((i19222 != 3 || i19222 == 5 || i19222 == 8388611 || i19222 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
                                        j = this.mDuration;
                                        if (j < 0) {
                                        }
                                        m = Recorder$$ExternalSyntheticOutline2.m(i4 * j, 3.0f, width2222);
                                    }
                                    int i16222 = (transitionValues2 == null || (iArr = (int[]) transitionValues2.values.get("android:visibilityPropagation:center")) == null) ? -1 : iArr[i3];
                                    int[] iArr3222 = new int[2];
                                    viewGroup2.getLocationOnScreen(iArr3222);
                                    int round322 = Math.round(viewGroup2.getTranslationX()) + iArr3222[0];
                                    int round2222 = Math.round(viewGroup2.getTranslationY()) + iArr3222[i3];
                                    int width322 = viewGroup2.getWidth() + round322;
                                    int height222 = viewGroup2.getHeight() + round2222;
                                    if (rect == null) {
                                    }
                                    i7 = sidePropagation.mSide;
                                    int i17222 = i6;
                                    if (i7 == 8388611) {
                                    }
                                    if (i7 == 3) {
                                    }
                                    i9 = abs + i8;
                                    float f2222 = i9;
                                    int i192222 = sidePropagation.mSide;
                                    float width22222 = f2222 / ((i192222 != 3 || i192222 == 5 || i192222 == 8388611 || i192222 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
                                    j = this.mDuration;
                                    if (j < 0) {
                                    }
                                    m = Recorder$$ExternalSyntheticOutline2.m(i4 * j, 3.0f, width22222);
                                }
                                sparseIntArray.put(this.mAnimators.size(), (int) m);
                                j2 = Math.min(m, j2);
                            }
                            WindowId windowId = viewGroup.getWindowId();
                            AnimationInfo animationInfo2 = new AnimationInfo();
                            animationInfo2.mView = view;
                            animationInfo2.mName = str;
                            animationInfo2.mValues = transitionValues;
                            animationInfo2.mWindowId = windowId;
                            animationInfo2.mTransition = this;
                            animationInfo2.mAnimator = createAnimator;
                            if (z) {
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.play(createAnimator);
                                createAnimator = animatorSet;
                            }
                            runningAnimators.put(createAnimator, animationInfo2);
                            this.mAnimators.add(createAnimator);
                        }
                    }
                } else {
                    i = size;
                    z = z2;
                    i2 = i10;
                    i3 = 1;
                    view = transitionValues2.view;
                }
                transitionValues = null;
                if (createAnimator != null) {
                }
            } else {
                i = size;
                z = z2;
                i2 = i10;
            }
            i10 = i2 + 1;
            viewGroup2 = viewGroup;
            size = i;
            z2 = z;
        }
        if (sparseIntArray.size() != 0) {
            for (int i20 = 0; i20 < sparseIntArray.size(); i20++) {
                AnimationInfo animationInfo3 = (AnimationInfo) runningAnimators.get((Animator) this.mAnimators.get(sparseIntArray.keyAt(i20)));
                animationInfo3.mAnimator.setStartDelay(animationInfo3.mAnimator.getStartDelay() + (sparseIntArray.valueAt(i20) - j2));
            }
        }
    }

    public final void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            notifyFromTransition(this, TransitionNotification.ON_END, false);
            for (int i2 = 0; i2 < ((LongSparseArray) this.mStartValues.remoteAddress).size(); i2++) {
                View view = (View) ((LongSparseArray) this.mStartValues.remoteAddress).valueAt(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((LongSparseArray) this.mEndValues.remoteAddress).size(); i3++) {
                View view2 = (View) ((LongSparseArray) this.mEndValues.remoteAddress).valueAt(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    public void forceToEnd(ViewGroup viewGroup) {
        ArrayMap runningAnimators = getRunningAnimators();
        int i = runningAnimators.size;
        if (viewGroup == null || i == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        ArrayMap arrayMap = new ArrayMap(runningAnimators);
        runningAnimators.clear();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            AnimationInfo animationInfo = (AnimationInfo) arrayMap.valueAt(i2);
            if (animationInfo.mView != null && windowId.equals(animationInfo.mWindowId)) {
                ((Animator) arrayMap.keyAt(i2)).end();
            }
        }
    }

    public final TransitionValues getMatchedTransitionValues(View view, boolean z) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getMatchedTransitionValues(view, z);
        }
        ArrayList arrayList = z ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            TransitionValues transitionValues = (TransitionValues) arrayList.get(i);
            if (transitionValues == null) {
                return null;
            }
            if (transitionValues.view == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (TransitionValues) (z ? this.mEndValuesList : this.mStartValuesList).get(i);
        }
        return null;
    }

    public final Transition getRootTransition() {
        TransitionSet transitionSet = this.mParent;
        return transitionSet != null ? transitionSet.getRootTransition() : this;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public final TransitionValues getTransitionValues(View view, boolean z) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getTransitionValues(view, z);
        }
        return (TransitionValues) ((ArrayMap) (z ? this.mStartValues : this.mEndValues).userId).get(view);
    }

    public boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    public boolean isSeekingSupported() {
        return this instanceof ChangeBounds;
    }

    public boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (isValueChanged(transitionValues, transitionValues2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = transitionValues.values.keySet().iterator();
                while (it.hasNext()) {
                    if (isValueChanged(transitionValues, transitionValues2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isValidTarget(View view) {
        int id = view.getId();
        ArrayList arrayList = this.mTargetExcludes;
        if (arrayList != null && arrayList.contains(view)) {
            return false;
        }
        ArrayList arrayList2 = this.mTargetIds;
        int size = arrayList2.size();
        ArrayList arrayList3 = this.mTargets;
        return (size == 0 && arrayList3.size() == 0) || arrayList2.contains(Integer.valueOf(id)) || arrayList3.contains(view);
    }

    public final void notifyFromTransition(Transition transition, TransitionNotification transitionNotification, boolean z) {
        Transition transition2 = this.mCloneParent;
        if (transition2 != null) {
            transition2.notifyFromTransition(transition, transitionNotification, z);
        }
        ArrayList arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        TransitionListener[] transitionListenerArr = this.mListenersCache;
        if (transitionListenerArr == null) {
            transitionListenerArr = new TransitionListener[size];
        }
        this.mListenersCache = null;
        TransitionListener[] transitionListenerArr2 = (TransitionListener[]) this.mListeners.toArray(transitionListenerArr);
        for (int i = 0; i < size; i++) {
            transitionNotification.notifyListener(transitionListenerArr2[i], transition, z);
            transitionListenerArr2[i] = null;
        }
        this.mListenersCache = transitionListenerArr2;
    }

    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        ArrayList arrayList = this.mCurrentAnimators;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.mAnimatorCache = animatorArr;
        notifyFromTransition(this, TransitionNotification.ON_PAUSE, false);
        this.mPaused = true;
    }

    public void prepareAnimatorsForSeeking() {
        ArrayMap runningAnimators = getRunningAnimators();
        this.mTotalDuration = 0L;
        int i = 0;
        while (true) {
            int size = this.mAnimators.size();
            ArrayList arrayList = this.mAnimators;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i);
            AnimationInfo animationInfo = (AnimationInfo) runningAnimators.get(animator);
            if (animator != null && animationInfo != null) {
                Animator animator2 = animationInfo.mAnimator;
                long j = this.mDuration;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.mStartDelay;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.mInterpolator;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.mCurrentAnimators.add(animator);
                this.mTotalDuration = Math.max(this.mTotalDuration, animator.getTotalDuration());
            }
            i++;
        }
    }

    public Transition removeListener(TransitionListener transitionListener) {
        Transition transition;
        ArrayList arrayList = this.mListeners;
        if (arrayList != null) {
            if (!arrayList.remove(transitionListener) && (transition = this.mCloneParent) != null) {
                transition.removeListener(transitionListener);
            }
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    public void removeTarget(View view) {
        this.mTargets.remove(view);
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                ArrayList arrayList = this.mCurrentAnimators;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.mAnimatorCache);
                this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.mAnimatorCache = animatorArr;
                notifyFromTransition(this, TransitionNotification.ON_RESUME, false);
            }
            this.mPaused = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void runAnimators() {
        start();
        ArrayMap runningAnimators = getRunningAnimators();
        Iterator it = this.mAnimators.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (runningAnimators.containsKey(animator)) {
                start();
                if (animator != null) {
                    Object[] objArr = 0;
                    animator.addListener(new AnonymousClass2(this, runningAnimators, false, 0 == true ? 1 : 0));
                    long j = this.mDuration;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.mStartDelay;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.mInterpolator;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new AnonymousClass3(this, objArr == true ? 1 : 0));
                    animator.start();
                }
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void setCurrentPlayTimeMillis(long j, long j2) {
        long j3 = this.mTotalDuration;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.mEnded = false;
            notifyFromTransition(this, TransitionNotification.ON_START, z);
        }
        ArrayList arrayList = this.mCurrentAnimators;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.mAnimatorCache = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.mEnded = true;
        }
        notifyFromTransition(this, TransitionNotification.ON_END, z);
    }

    public void setDuration(long j) {
        this.mDuration = j;
    }

    public void setEpicenterCallback(Styleable styleable) {
        this.mEpicenterCallback = styleable;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
    }

    public void setPathMotion(AnonymousClass1 anonymousClass1) {
        if (anonymousClass1 == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = anonymousClass1;
        }
    }

    public void setPropagation(SidePropagation sidePropagation) {
        this.mPropagation = sidePropagation;
    }

    public void setStartDelay(long j) {
        this.mStartDelay = j;
    }

    public final void start() {
        if (this.mNumInstances == 0) {
            notifyFromTransition(this, TransitionNotification.ON_START, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.mDuration != -1) {
            sb.append("dur(");
            sb.append(this.mDuration);
            sb.append(") ");
        }
        if (this.mStartDelay != -1) {
            sb.append("dly(");
            sb.append(this.mStartDelay);
            sb.append(") ");
        }
        if (this.mInterpolator != null) {
            sb.append("interp(");
            sb.append(this.mInterpolator);
            sb.append(") ");
        }
        ArrayList arrayList = this.mTargetIds;
        int size = arrayList.size();
        ArrayList arrayList2 = this.mTargets;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: androidx.transition.Transition$2, reason: invalid class name */
    public final class AnonymousClass2 extends AnimatorListenerAdapter {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;
        public final /* synthetic */ Object val$runningAnimators;

        public /* synthetic */ AnonymousClass2(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.val$runningAnimators = obj;
            this.this$0 = obj2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 1:
                    ((ViewPropertyAnimatorListener) this.val$runningAnimators).onAnimationCancel();
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            Object obj2 = this.val$runningAnimators;
            switch (i) {
                case 0:
                    ((ArrayMap) obj2).remove(animator);
                    ((Transition) obj).mCurrentAnimators.remove(animator);
                    break;
                case 1:
                    ((ViewPropertyAnimatorListener) obj2).onAnimationEnd();
                    break;
                case 2:
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) obj2;
                    windowInsetsAnimationCompat.mImpl.setFraction(1.0f);
                    WindowInsetsAnimationCompat.Impl21.dispatchOnEnd((View) obj, windowInsetsAnimationCompat);
                    break;
                case 3:
                    View view = (View) obj2;
                    HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                    hideBottomViewOnScrollBehavior.currentAnimator = null;
                    if (hideBottomViewOnScrollBehavior.currentState == 1 && view.getVisibility() == 0) {
                        view.setVisibility(4);
                        break;
                    }
                    break;
                case 4:
                    View view2 = (View) obj2;
                    HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                    hideViewOnScrollBehavior.currentAnimator = null;
                    if (hideViewOnScrollBehavior.currentState == 1 && view2.getVisibility() == 0) {
                        view2.setVisibility(4);
                        break;
                    }
                    break;
                default:
                    ((CircularRevealWidget) obj2).setCircularRevealOverlayDrawable(null);
                    break;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            Object obj2 = this.val$runningAnimators;
            switch (i) {
                case 0:
                    ((Transition) obj).mCurrentAnimators.add(animator);
                    break;
                case 1:
                    ((ViewPropertyAnimatorListener) obj2).onAnimationStart();
                    break;
                case 5:
                    ((CircularRevealWidget) obj2).setCircularRevealOverlayDrawable((Drawable) obj);
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }

        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$runningAnimators = obj2;
        }
    }

    /* renamed from: androidx.transition.Transition$1, reason: invalid class name */
    public class AnonymousClass1 implements MenuBuilder.Callback, EncoderCallback, FloatDecayAnimationSpec, ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl, ExtractorOutput, Option.CacheKeyUpdater, FactoryPools.Factory, ModelLoaderFactory, VideoDecoder.MediaInitializer, FactoryPools.Resetter, MutableAccountInfoProvider, NetworkInfoProvider, AppVersionProvider, NdkCrashHandler, Serializer, InfoProvider {
        public static AnonymousClass1 DEFAULT;

        public static SurfaceConfig create(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, StreamUseCase streamUseCase) {
            configSize.getClass();
            streamUseCase.getClass();
            return new SurfaceConfig(configType, configSize, streamUseCase);
        }

        public static UseCaseType getFeatureGroupUseCaseType(UseCase useCase) {
            useCase.getClass();
            return useCase instanceof Preview ? UseCaseType.PREVIEW : useCase instanceof ImageCapture ? UseCaseType.IMAGE_CAPTURE : useCase instanceof ImageAnalysis ? UseCaseType.IMAGE_ANALYSIS : UseCaseUtil.isVideoCapture(useCase) ? UseCaseType.VIDEO_CAPTURE : useCase instanceof StreamSharing ? UseCaseType.STREAM_SHARING : UseCaseType.UNDEFINED;
        }

        public static Path getPath(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
        
            if (r4 <= (r6.getHeight() * r6.getWidth())) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static SurfaceConfig transformSurfaceConfig(int i, Size size, AutoValue_SurfaceSizeDefinition autoValue_SurfaceSizeDefinition, int i2, SurfaceConfig.ConfigSource configSource, StreamUseCase streamUseCase) {
            LinkedHashMap linkedHashMap = autoValue_SurfaceSizeDefinition.maximumSizeMap;
            size.getClass();
            configSource.getClass();
            streamUseCase.getClass();
            SurfaceConfig.ConfigType configType = (SurfaceConfig.ConfigType) SurfaceConfig.CONFIG_TYPES_BY_IMAGE_FORMAT.get(Integer.valueOf(i));
            if (configType == null) {
                configType = SurfaceConfig.ConfigType.PRIV;
            }
            SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.NOT_SUPPORT;
            Size size2 = SizeUtil.RESOLUTION_ZERO;
            int height = size.getHeight() * size.getWidth();
            if (i2 == 1) {
                if (height <= SizeUtil.getArea((Size) autoValue_SurfaceSizeDefinition.s720pSizeMap.get(Integer.valueOf(i)))) {
                    configSize = SurfaceConfig.ConfigSize.S720P_16_9;
                } else if (height <= SizeUtil.getArea((Size) autoValue_SurfaceSizeDefinition.s1440pSizeMap.get(Integer.valueOf(i)))) {
                    configSize = SurfaceConfig.ConfigSize.S1440P_4_3;
                }
            } else if (configSource == SurfaceConfig.ConfigSource.FEATURE_COMBINATION_TABLE) {
                Size size3 = (Size) linkedHashMap.get(Integer.valueOf(i));
                SurfaceConfig.ConfigSize[] configSizeArr = SurfaceConfig.FEATURE_COMBO_QUERY_SUPPORTED_SIZES;
                int length = configSizeArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    SurfaceConfig.ConfigSize configSize2 = configSizeArr[i3];
                    if (size.equals(configSize2.relatedFixedSize)) {
                        configSize = configSize2;
                        break;
                    }
                    i3++;
                }
                if (configSize == SurfaceConfig.ConfigSize.NOT_SUPPORT && size.equals(size3)) {
                    configSize = SurfaceConfig.ConfigSize.MAXIMUM;
                }
            } else if (height <= SizeUtil.getArea(autoValue_SurfaceSizeDefinition.analysisSize)) {
                configSize = SurfaceConfig.ConfigSize.VGA;
            } else {
                Size size4 = autoValue_SurfaceSizeDefinition.previewSize;
                if (height <= size4.getHeight() * size4.getWidth()) {
                    configSize = SurfaceConfig.ConfigSize.PREVIEW;
                } else {
                    Size size5 = autoValue_SurfaceSizeDefinition.recordSize;
                    if (height <= size5.getHeight() * size5.getWidth()) {
                        configSize = SurfaceConfig.ConfigSize.RECORD;
                    } else {
                        Size size6 = (Size) linkedHashMap.get(Integer.valueOf(i));
                        Size size7 = (Size) autoValue_SurfaceSizeDefinition.ultraMaximumSizeMap.get(Integer.valueOf(i));
                        if (size6 != null) {
                        }
                        if (i2 != 2) {
                            configSize = SurfaceConfig.ConfigSize.MAXIMUM;
                        }
                        if (size7 != null) {
                            if (height <= size7.getHeight() * size7.getWidth()) {
                                configSize = SurfaceConfig.ConfigSize.ULTRA_MAXIMUM;
                            }
                        }
                    }
                }
            }
            return create(configType, configSize, streamUseCase);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.build(GlideUrl.class, InputStream.class), 1);
        }

        @Override // com.datadog.android.rum.internal.domain.InfoProvider
        public void cleanup() {
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void endTracks() {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getAbsVelocityThreshold() {
            return RecyclerView.DECELERATION_RATE;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public long getDurationNanos(float f) {
            return 0L;
        }

        public void getEdgePath(float f, float f2, float f3, ShapePath shapePath) {
            shapePath.lineTo(f, RecyclerView.DECELERATION_RATE);
        }

        @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
        public NetworkInfo getLatestNetworkInfo() {
            return new NetworkInfo(0, null, null, null, null, null, null, 127);
        }

        @Override // com.datadog.android.rum.internal.domain.InfoProvider
        public InfoData getState() {
            return new BatteryInfo(null, null);
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getTargetValue(float f, float f2) {
            return RecyclerView.DECELERATION_RATE;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getValueFromNanos(float f, float f2, long j) {
            return RecyclerView.DECELERATION_RATE;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getVelocityFromNanos(long j, float f) {
            return RecyclerView.DECELERATION_RATE;
        }

        @Override // com.datadog.android.core.internal.system.AppVersionProvider
        public String getVersion() {
            return "";
        }

        @Override // com.datadog.android.core.internal.system.AppVersionProvider
        public int getVersionCode() {
            return 0;
        }

        @Override // com.datadog.android.ndk.internal.NdkCrashHandler
        public void handleNdkCrash(DatadogCore datadogCore) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        public void initializeExtractor(MediaExtractor mediaExtractor, Object obj) {
            mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        public void initializeRetriever(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeError(EncodeException encodeException) {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStop() {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodedData(EncodedData encodedData) {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(MenuBuilder menuBuilder) {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onOutputConfigUpdate(StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl
        public void onScrollLimit(int i, int i2, boolean z, int i3) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl
        public void onScrollProgress(int i, int i2, int i3, int i4) {
        }

        @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
        public void register(Context context) {
            context.getClass();
        }

        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        public void reset(Object obj) {
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
            throw new UnsupportedOperationException();
        }

        @Override // com.datadog.android.core.persistence.Serializer
        public String serialize(Object obj) {
            UUID uuid = (UUID) obj;
            uuid.getClass();
            String uuid2 = uuid.toString();
            uuid2.getClass();
            return uuid2;
        }

        @Override // com.datadog.android.core.internal.system.AppVersionProvider
        public void setVersion(String str) {
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public TrackOutput track(int i, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
        public void unregister(Context context) {
        }

        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public void update(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }

        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        public Object create() {
            return new LockedResource();
        }
    }

    public final String toString() {
        return toString("");
    }

    public Transition() {
        this.mName = getClass().getName();
        this.mStartDelay = -1L;
        this.mDuration = -1L;
        this.mInterpolator = null;
        this.mTargetIds = new ArrayList();
        this.mTargets = new ArrayList();
        this.mTargetExcludes = null;
        this.mStartValues = new UnleashContext(8);
        this.mEndValues = new UnleashContext(8);
        this.mParent = null;
        this.mMatchOrder = DEFAULT_MATCH_ORDER;
        this.mCurrentAnimators = new ArrayList();
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        this.mNumInstances = 0;
        this.mPaused = false;
        this.mEnded = false;
        this.mCloneParent = null;
        this.mListeners = null;
        this.mAnimators = new ArrayList();
        this.mPathMotion = STRAIGHT_PATH_MOTION;
    }
}
