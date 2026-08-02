package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.compose.ui.tooling.data.SlotTreeKt;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$WavePoint;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.TableInfo;
import app.cash.zipline.internal.bridge.SerializableZiplineFunction;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.okhttp.internal.OkHttpNetworkFetcherServiceLoaderTarget;
import coil3.svg.internal.AndroidSvg;
import coil3.util.DecoderServiceLoaderTarget;
import com.bugsnag.android.Client;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.libraries.places.api.model.zzeq;
import com.google.android.libraries.places.api.model.zzfe;
import com.google.android.libraries.places.api.model.zzgk;
import com.google.android.libraries.places.api.model.zzgu;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.collect.RegularImmutableMap;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class ViewPager extends ViewGroup {
    public static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    public static final AnonymousClass2 sInterpolator = new AnonymousClass2(0);
    public static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();
    public int mActivePointerId;
    public ArrayList mAdapterChangeListeners;
    public boolean mCalledSuper;
    public int mChildHeightMeasureSpec;
    public int mCloseEnough;
    public int mDecorChildCount;
    public int mDefaultGutterSize;
    public int mDrawingOrder;
    public ArrayList mDrawingOrderedChildren;
    public final Client.AnonymousClass7 mEndScrollRunnable;
    public boolean mFirstLayout;
    public final float mFirstOffset;
    public int mGutterSize;
    public boolean mInLayout;
    public float mInitialMotionX;
    public float mInitialMotionY;
    public boolean mIsBeingDragged;
    public boolean mIsUnableToDrag;
    public final ArrayList mItems;
    public float mLastMotionX;
    public final float mLastOffset;
    public EdgeEffect mLeftEdge;
    public Drawable mMarginDrawable;
    public int mOffscreenPageLimit;
    public OnPageChangeListener mOnPageChangeListener;
    public ArrayList mOnPageChangeListeners;
    public int mPageMargin;
    public Parcelable mRestoredAdapterState;
    public EdgeEffect mRightEdge;
    public int mScrollState;
    public Scroller mScroller;
    public boolean mScrollingCacheEnabled;
    public final ItemInfo mTempItem;
    public final Rect mTempRect;
    public int mTouchSlop;
    public VelocityTracker mVelocityTracker;

    /* renamed from: androidx.viewpager.widget.ViewPager$1, reason: invalid class name */
    public final class AnonymousClass1 implements Comparator {
        public static final /* synthetic */ AnonymousClass1 zaa = new AnonymousClass1(22);
        public static final /* synthetic */ AnonymousClass1 zaa$1 = new AnonymousClass1(24);
        public static final /* synthetic */ AnonymousClass1 zza = new AnonymousClass1(26);
        public static final /* synthetic */ AnonymousClass1 zza$1 = new AnonymousClass1(27);
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((ItemInfo) obj).position - ((ItemInfo) obj2).position;
                case 1:
                    return ComparisonsKt__ComparisonsKt.compareValues((String) ((Pair) obj).first, (String) ((Pair) obj2).first);
                case 2:
                    return ComparisonsKt__ComparisonsKt.compareValues(((Field) obj).getName(), ((Field) obj2).getName());
                case 3:
                    String name = ((Field) obj).getName();
                    Integer intOrNull = StringsKt.toIntOrNull(StringsKt.substringAfter(name, "f$", name));
                    Integer valueOf = Integer.valueOf(intOrNull != null ? intOrNull.intValue() : Integer.MAX_VALUE);
                    String name2 = ((Field) obj2).getName();
                    Integer intOrNull2 = StringsKt.toIntOrNull(StringsKt.substringAfter(name2, "f$", name2));
                    return ComparisonsKt__ComparisonsKt.compareValues(valueOf, Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : Integer.MAX_VALUE));
                case 4:
                    return ComparisonsKt__ComparisonsKt.compareValues(SlotTreeKt.extractFromLegacyFields$extractedName((Field) obj), SlotTreeKt.extractFromLegacyFields$extractedName((Field) obj2));
                case 5:
                    return ((SolverVariable) obj).id - ((SolverVariable) obj2).id;
                case 6:
                    return Integer.compare(((KeyCycleOscillator$WavePoint) obj).mPosition, ((KeyCycleOscillator$WavePoint) obj2).mPosition);
                case 7:
                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                    float z = ((View) obj).getZ();
                    float z2 = ((View) obj2).getZ();
                    if (z > z2) {
                        return -1;
                    }
                    return z < z2 ? 1 : 0;
                case 8:
                    return ((DiffUtil.Diagonal) obj).x - ((DiffUtil.Diagonal) obj2).x;
                case 9:
                    GapWorker.Task task = (GapWorker.Task) obj;
                    GapWorker.Task task2 = (GapWorker.Task) obj2;
                    RecyclerView recyclerView = task.view;
                    if ((recyclerView == null) == (task2.view == null)) {
                        boolean z3 = task.neededNextFrame;
                        if (z3 == task2.neededNextFrame) {
                            int i = task2.viewVelocity - task.viewVelocity;
                            if (i != 0) {
                                return i;
                            }
                            int i2 = task.distanceToItem - task2.distanceToItem;
                            if (i2 != 0) {
                                return i2;
                            }
                            return 0;
                        }
                        if (!z3) {
                            return 1;
                        }
                    } else if (recyclerView == null) {
                        return 1;
                    }
                    return -1;
                case 10:
                    return ComparisonsKt__ComparisonsKt.compareValues((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
                case 11:
                    return ComparisonsKt__ComparisonsKt.compareValues((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
                case 12:
                    return ComparisonsKt__ComparisonsKt.compareValues(((TableInfo.Column) obj).name, ((TableInfo.Column) obj2).name);
                case 13:
                    return ComparisonsKt__ComparisonsKt.compareValues(((TableInfo.Index) obj).name, ((TableInfo.Index) obj2).name);
                case 14:
                    return ((int[]) obj)[0] - ((int[]) obj2)[0];
                case 15:
                    return ComparisonsKt__ComparisonsKt.compareValues(((LocalCard) ((Map.Entry) obj2).getValue()).sort_key, ((LocalCard) ((Map.Entry) obj).getValue()).sort_key);
                case 16:
                    return ComparisonsKt__ComparisonsKt.compareValues(((LocalPOSCheckIn) obj2).sort_key, ((LocalPOSCheckIn) obj).sort_key);
                case 17:
                    return ComparisonsKt__ComparisonsKt.compareValues(((SerializableZiplineFunction) obj).signature, ((SerializableZiplineFunction) obj2).signature);
                case 18:
                    ((OkHttpNetworkFetcherServiceLoaderTarget) obj2).getClass();
                    ((OkHttpNetworkFetcherServiceLoaderTarget) obj).getClass();
                    return ComparisonsKt__ComparisonsKt.compareValues(2, 2);
                case 19:
                    ((DecoderServiceLoaderTarget) obj2).getClass();
                    ((DecoderServiceLoaderTarget) obj).getClass();
                    return ComparisonsKt__ComparisonsKt.compareValues(0, 0);
                case 20:
                    return ((byte[]) obj).length - ((byte[]) obj2).length;
                case 21:
                    return ComparisonsKt__ComparisonsKt.compareValues((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
                case 22:
                    return ((Scope) obj).zzb.compareTo(((Scope) obj2).zzb);
                case 23:
                    return ((Scope) obj).zzb.compareTo(((Scope) obj2).zzb);
                case 24:
                    Feature feature = (Feature) obj2;
                    Feature feature2 = (Feature) obj;
                    return !feature2.zza.equals(feature.zza) ? feature2.zza.compareTo(feature.zza) : Long.compare(feature2.getVersion(), feature.getVersion());
                case 25:
                    Map.Entry entry = (Map.Entry) obj;
                    Map.Entry entry2 = (Map.Entry) obj2;
                    Objects.requireNonNull(entry);
                    Objects.requireNonNull(entry2);
                    Comparable comparable = (Comparable) entry.getKey();
                    Comparable comparable2 = (Comparable) entry2.getKey();
                    comparable.getClass();
                    comparable2.getClass();
                    return comparable.compareTo(comparable2);
                case 26:
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                case 27:
                    RegularImmutableMap regularImmutableMap = zzgu.zzb;
                    zzgk zzgkVar = ((zzfe) obj).zza;
                    zzgkVar.getClass();
                    zzgk zzgkVar2 = ((zzfe) obj2).zza;
                    zzgkVar2.getClass();
                    zzeq zzeqVar = zzgkVar.zza;
                    zzeqVar.getClass();
                    zzeq zzeqVar2 = zzgkVar2.zza;
                    zzeqVar2.getClass();
                    return zzeqVar.compareTo(zzeqVar2);
                case 28:
                    return ((View) obj).getTop() - ((View) obj2).getTop();
                default:
                    return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$2, reason: invalid class name */
    public final class AnonymousClass2 implements Interpolator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass2(int i) {
            this.$r8$classId = i;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            switch (this.$r8$classId) {
                case 0:
                case 1:
                case 3:
                default:
                    float f2 = f - 1.0f;
                    return (f2 * f2 * f2 * f2 * f2) + 1.0f;
                case 2:
                    return f * f * f * f * f;
            }
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    public final class ItemInfo {
        public float offset;
        public int position;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        public final int gravity;
        public boolean isDecor;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.gravity = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public interface OnPageChangeListener {
    }

    public interface PageTransformer {
    }

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AbsSavedState.AnonymousClass2(7);
        public final Parcelable adapterState;
        public int position;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? SavedState.class.getClassLoader() : classLoader;
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.position, "}", sb);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i);
        }
    }

    public final class ViewPositionComparator implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            LayoutParams layoutParams = (LayoutParams) ((View) obj).getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) ((View) obj2).getLayoutParams();
            boolean z = layoutParams.isDecor;
            if (z != layoutParams2.isDecor) {
                return z ? 1 : -1;
            }
            return 0;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.mItems = new ArrayList();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredAdapterState = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mEndScrollRunnable = new Client.AnonymousClass7(this, 13);
        this.mScrollState = 0;
        initViewPager();
    }

    public static boolean canScroll(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3).getVisibility() == 0) {
                    infoForChild();
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i).getVisibility() == 0) {
                infoForChild();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z = layoutParams2.isDecor | (view.getClass().getAnnotation(DecorView.class) != null);
        layoutParams2.isDecor = z;
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (z) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot add pager decor view during layout");
        } else {
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean arrowScroll(int i) {
        View findNextFocus;
        boolean z;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
            z = false;
            if (findNextFocus == null && findNextFocus != findFocus) {
                Rect rect = this.mTempRect;
                if (i == 17) {
                    int i2 = getChildRectInPagerCoordinates(rect, findNextFocus).left;
                    int i3 = getChildRectInPagerCoordinates(rect, findFocus).left;
                    if (findFocus == null || i2 < i3) {
                        z = findNextFocus.requestFocus();
                    }
                } else if (i == 66) {
                    int i4 = getChildRectInPagerCoordinates(rect, findNextFocus).left;
                    int i5 = getChildRectInPagerCoordinates(rect, findFocus).left;
                    if (findFocus == null || i4 > i5) {
                        z = findNextFocus.requestFocus();
                    }
                }
            } else if (i != 17) {
            }
            if (z) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            return z;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        z = false;
        if (findNextFocus == null) {
        }
        if (i != 17) {
        }
        if (z) {
        }
        return z;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public final void completeScroll(boolean z) {
        int i = 0;
        boolean z2 = this.mScrollState == 2;
        if (z2) {
            if (this.mScrollingCacheEnabled) {
                this.mScrollingCacheEnabled = false;
            }
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        while (true) {
            ArrayList arrayList = this.mItems;
            if (i >= arrayList.size()) {
                break;
            }
            ((ItemInfo) arrayList.get(i)).getClass();
            i++;
        }
        if (z2) {
            Client.AnonymousClass7 anonymousClass7 = this.mEndScrollRunnable;
            if (!z) {
                anonymousClass7.run();
            } else {
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                postOnAnimation(anonymousClass7);
            }
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode == 61) {
                            if (keyEvent.hasNoModifiers()) {
                                z = arrowScroll(2);
                            } else if (keyEvent.hasModifiers(1)) {
                                z = arrowScroll(1);
                            }
                            if (z) {
                                return false;
                            }
                        }
                    } else if (!keyEvent.hasModifiers(2)) {
                        z = arrowScroll(66);
                        if (z) {
                        }
                    }
                } else if (!keyEvent.hasModifiers(2)) {
                    z = arrowScroll(17);
                    if (z) {
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getVisibility() == 0) {
                infoForChild();
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        EdgeEffect edgeEffect = this.mLeftEdge;
        boolean z = false;
        if (overScrollMode != 0) {
            edgeEffect.finish();
            this.mRightEdge.finish();
        } else {
            if (!edgeEffect.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z = this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z) {
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        ((LayoutParams) ((View) this.mDrawingOrderedChildren.get(i2)).getLayoutParams()).getClass();
        return 0;
    }

    public final Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public final void infoForChild() {
        ArrayList arrayList = this.mItems;
        if (arrayList.size() <= 0) {
            return;
        }
        ((ItemInfo) arrayList.get(0)).getClass();
        throw null;
    }

    public final void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new TextInputLayout.AnonymousClass2(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(this, new AndroidSvg(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null) {
            return;
        }
        this.mItems.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        if (r13.mIsUnableToDrag != false) goto L86;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.mIsBeingDragged) {
                    return true;
                }
            }
            if (action == 0) {
                float x = motionEvent.getX();
                this.mInitialMotionX = x;
                this.mLastMotionX = x;
                this.mInitialMotionY = motionEvent.getY();
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsUnableToDrag = false;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                    completeScroll(false);
                    this.mIsBeingDragged = false;
                } else {
                    this.mScroller.abortAnimation();
                    populate();
                    this.mIsBeingDragged = true;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                }
            } else if (action == 2) {
                int i = this.mActivePointerId;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float f = x2 - this.mLastMotionX;
                    float abs = Math.abs(f);
                    float y = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y - this.mInitialMotionY);
                    if (f != RecyclerView.DECELERATION_RATE) {
                        float f2 = this.mLastMotionX;
                        if ((f2 >= this.mGutterSize || f <= RecyclerView.DECELERATION_RATE) && ((f2 <= getWidth() - this.mGutterSize || f >= RecyclerView.DECELERATION_RATE) && canScroll((int) f, (int) x2, (int) y, this, false))) {
                            this.mLastMotionX = x2;
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                    }
                    float f3 = this.mTouchSlop;
                    if (abs > f3 && abs * 0.5f > abs2) {
                        this.mIsBeingDragged = true;
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        setScrollState(1);
                        float f4 = this.mInitialMotionX;
                        float f5 = this.mTouchSlop;
                        this.mLastMotionX = f > RecyclerView.DECELERATION_RATE ? f4 + f5 : f4 - f5;
                        if (!this.mScrollingCacheEnabled) {
                            this.mScrollingCacheEnabled = true;
                        }
                    } else if (abs2 > f3) {
                        this.mIsUnableToDrag = true;
                    }
                    if (this.mIsBeingDragged) {
                        this.mLastMotionX = x2;
                        getScrollX();
                        getClientWidth();
                        ArrayList arrayList = this.mItems;
                        ItemInfo itemInfo = (ItemInfo) arrayList.get(0);
                        ItemInfo itemInfo2 = (ItemInfo) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, arrayList);
                        int i2 = itemInfo.position;
                        int i3 = itemInfo2.position;
                        throw null;
                    }
                }
            } else if (action == 6) {
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
                    int i4 = actionIndex == 0 ? 1 : 0;
                    this.mLastMotionX = motionEvent.getX(i4);
                    this.mActivePointerId = motionEvent.getPointerId(i4);
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                }
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            return this.mIsBeingDragged;
        }
        this.mActivePointerId = -1;
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker2 = this.mVelocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.mVelocityTracker = null;
        }
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (!this.mLeftEdge.isFinished()) {
            this.mRightEdge.isFinished();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        ItemInfo itemInfo;
        int max;
        int i5;
        int max2;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int i11 = layoutParams.gravity;
                    int i12 = i11 & 7;
                    int i13 = i11 & 112;
                    if (i12 != 1) {
                        if (i12 == 3) {
                            i5 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i12 != 5) {
                            i5 = paddingLeft;
                        } else {
                            max = (i7 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i13 == 16) {
                            if (i13 == 48) {
                                i6 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i13 != 80) {
                                i6 = paddingTop;
                            } else {
                                max2 = (i8 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i14 = paddingLeft + scrollX;
                            childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                            i9++;
                            paddingTop = i6;
                            paddingLeft = i5;
                        } else {
                            max2 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i15 = max2;
                        i6 = paddingTop;
                        paddingTop = i15;
                        int i142 = paddingLeft + scrollX;
                        childAt.layout(i142, paddingTop, childAt.getMeasuredWidth() + i142, childAt.getMeasuredHeight() + paddingTop);
                        i9++;
                        paddingTop = i6;
                        paddingLeft = i5;
                    } else {
                        max = Math.max((i7 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = max;
                    i5 = paddingLeft;
                    paddingLeft = i16;
                    if (i13 == 16) {
                    }
                    int i152 = max2;
                    i6 = paddingTop;
                    paddingTop = i152;
                    int i1422 = paddingLeft + scrollX;
                    childAt.layout(i1422, paddingTop, childAt.getMeasuredWidth() + i1422, childAt.getMeasuredHeight() + paddingTop);
                    i9++;
                    paddingTop = i6;
                    paddingLeft = i5;
                }
            }
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8 && !((LayoutParams) childAt2.getLayoutParams()).isDecor) {
                infoForChild();
            }
        }
        this.mDecorChildCount = i9;
        if (this.mFirstLayout) {
            int i18 = 0;
            while (true) {
                ArrayList arrayList = this.mItems;
                if (i18 >= arrayList.size()) {
                    itemInfo = null;
                    break;
                }
                itemInfo = (ItemInfo) arrayList.get(i18);
                if (itemInfo.position == 0) {
                    break;
                } else {
                    i18++;
                }
            }
            int max3 = itemInfo != null ? (int) (Math.max(this.mFirstOffset, Math.min(itemInfo.offset, this.mLastOffset)) * getClientWidth()) : 0;
            z2 = false;
            completeScroll(false);
            scrollTo(max3, 0);
            pageScrolled(max3);
        } else {
            z2 = false;
        }
        this.mFirstLayout = z2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.isDecor) {
                int i6 = layoutParams2.gravity;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = PKIFailureInfo.systemUnavail;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.isDecor)) {
                layoutParams.getClass();
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * RecyclerView.DECELERATION_RATE), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPageScrolled(int i, float f, int i2) {
        int max;
        int i3;
        int left;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int i5 = layoutParams.gravity & 7;
                    if (i5 != 1) {
                        if (i5 == 3) {
                            i3 = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            i3 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i3;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i6 = max;
                    i3 = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i3;
                }
            }
        }
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            ((TabLayout.TabLayoutOnPageChangeListener) onPageChangeListener).onPageScrolled(f, i);
        }
        ArrayList arrayList = this.mOnPageChangeListeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.mOnPageChangeListeners.get(i7);
                if (onPageChangeListener2 != null) {
                    ((TabLayout.TabLayoutOnPageChangeListener) onPageChangeListener2).onPageScrolled(f, i);
                }
            }
        }
        this.mCalledSuper = true;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i4 = childCount;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i4) {
            if (getChildAt(i2).getVisibility() == 0) {
                infoForChild();
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mSuperState);
        this.mRestoredAdapterState = savedState.adapterState;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = 0;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            recomputeScrollPosition(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    public final boolean pageScrolled(int i) {
        int i2;
        ArrayList arrayList = this.mItems;
        if (arrayList.size() == 0) {
            if (!this.mFirstLayout) {
                this.mCalledSuper = false;
                onPageScrolled(0, RecyclerView.DECELERATION_RATE, 0);
                if (!this.mCalledSuper) {
                    a$$ExternalSyntheticBUOutline0.m$1("onPageScrolled did not call superclass implementation");
                    return false;
                }
            }
            return false;
        }
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        int i3 = -1;
        boolean z = true;
        float f2 = 0.0f;
        int i4 = 0;
        ItemInfo itemInfo = null;
        while (i4 < arrayList.size()) {
            ItemInfo itemInfo2 = (ItemInfo) arrayList.get(i4);
            if (!z && itemInfo2.position != (i2 = i3 + 1)) {
                float f3 = f2 + RecyclerView.DECELERATION_RATE + f;
                ItemInfo itemInfo3 = this.mTempItem;
                itemInfo3.offset = f3;
                itemInfo3.position = i2;
                throw null;
            }
            f2 = itemInfo2.offset;
            float f4 = f2 + RecyclerView.DECELERATION_RATE + f;
            if (!z && scrollX < f2) {
                break;
            }
            if (scrollX < f4 || i4 == arrayList.size() - 1) {
                itemInfo = itemInfo2;
                break;
            }
            i3 = itemInfo2.position;
            i4++;
            z = false;
            itemInfo = itemInfo2;
        }
        int clientWidth2 = getClientWidth();
        int i5 = this.mPageMargin;
        int i6 = clientWidth2 + i5;
        float f5 = clientWidth2;
        int i7 = itemInfo.position;
        float f6 = ((i / f5) - itemInfo.offset) / (RecyclerView.DECELERATION_RATE + (i5 / f5));
        this.mCalledSuper = false;
        onPageScrolled(i7, f6, (int) (i6 * f6));
        if (this.mCalledSuper) {
            return true;
        }
        a$$ExternalSyntheticBUOutline0.m$1("onPageScrolled did not call superclass implementation");
        return false;
    }

    public final void populate() {
        if (this.mDrawingOrder != 0) {
            ArrayList arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public final void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        ItemInfo itemInfo;
        ArrayList arrayList = this.mItems;
        if (i2 > 0 && !arrayList.isEmpty()) {
            if (this.mScroller.isFinished()) {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            } else {
                Scroller scroller = this.mScroller;
                getClientWidth();
                scroller.setFinalX(0);
                return;
            }
        }
        int i5 = 0;
        while (true) {
            if (i5 >= arrayList.size()) {
                itemInfo = null;
                break;
            }
            itemInfo = (ItemInfo) arrayList.get(i5);
            if (itemInfo.position == 0) {
                break;
            } else {
                i5++;
            }
        }
        int min = (int) ((itemInfo != null ? Math.min(itemInfo.offset, this.mLastOffset) : RecyclerView.DECELERATION_RATE) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            completeScroll(false);
            scrollTo(min, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        ArrayList arrayList = this.mAdapterChangeListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mAdapterChangeListeners.size();
        for (int i = 0; i < size; i++) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.viewPager == this) {
                tabLayout.removeAllTabs();
            }
        }
    }

    public void setCurrentItem(int i) {
        if (this.mScrollingCacheEnabled) {
            this.mScrollingCacheEnabled = false;
        }
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, PageTransformer pageTransformer, int i) {
        boolean z2 = pageTransformer != null;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.mDrawingOrder = z ? 2 : 1;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z2) {
            populate();
        }
    }

    public final void setScrollState(int i) {
        if (this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            TabLayout.TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = (TabLayout.TabLayoutOnPageChangeListener) onPageChangeListener;
            tabLayoutOnPageChangeListener.previousScrollState = tabLayoutOnPageChangeListener.scrollState;
            tabLayoutOnPageChangeListener.scrollState = i;
            TabLayout tabLayout = (TabLayout) tabLayoutOnPageChangeListener.tabLayoutRef.get();
            if (tabLayout != null) {
                tabLayout.viewPagerScrollState = tabLayoutOnPageChangeListener.scrollState;
            }
        }
        ArrayList arrayList = this.mOnPageChangeListeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.mOnPageChangeListeners.get(i2);
                if (onPageChangeListener2 != null) {
                    TabLayout.TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener2 = (TabLayout.TabLayoutOnPageChangeListener) onPageChangeListener2;
                    tabLayoutOnPageChangeListener2.previousScrollState = tabLayoutOnPageChangeListener2.scrollState;
                    tabLayoutOnPageChangeListener2.scrollState = i;
                    TabLayout tabLayout2 = (TabLayout) tabLayoutOnPageChangeListener2.tabLayoutRef.get();
                    if (tabLayout2 != null) {
                        tabLayout2.viewPagerScrollState = tabLayoutOnPageChangeListener2.scrollState;
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    public void setCurrentItem(int i, boolean z) {
        if (this.mScrollingCacheEnabled) {
            this.mScrollingCacheEnabled = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }

    public void setPageTransformer(boolean z, PageTransformer pageTransformer) {
        setPageTransformer(z, pageTransformer, 2);
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredAdapterState = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mEndScrollRunnable = new Client.AnonymousClass7(this, 13);
        this.mScrollState = 0;
        initViewPager();
    }
}
