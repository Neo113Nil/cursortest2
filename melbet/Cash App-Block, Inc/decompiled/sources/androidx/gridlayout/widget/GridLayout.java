package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.gridlayout.R$styleable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.TraceParser;
import com.squareup.cash.R;
import com.squareup.cash.cdf.customersupport.CustomerSupportReviewChangeReason;
import com.squareup.cash.cdf.customersupport.CustomerSupportReviewChangeResolution;
import com.squareup.cash.cdf.customersupport.CustomerSupportReviewChangeSatisfaction;
import com.squareup.cash.cdf.customersupport.CustomerSupportReviewStart;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.support.chat.backend.api.ChatSurvey;
import com.squareup.cash.support.chat.backend.api.ChatSurveyResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class GridLayout extends ViewGroup {
    public static final AnonymousClass2 BASELINE;
    public static final AnonymousClass2 BOTTOM;
    public static final AnonymousClass2 CENTER;
    public static final AnonymousClass2 END;
    public static final AnonymousClass2 FILL;
    public static final AnonymousClass5 LEFT;
    public static final AnonymousClass5 RIGHT;
    public static final AnonymousClass2 START;
    public static final AnonymousClass2 TOP;
    public static final AnonymousClass2 UNDEFINED_ALIGNMENT;
    public int mAlignmentMode;
    public final int mDefaultGap;
    public final Axis mHorizontalAxis;
    public int mLastLayoutParamsHashCode;
    public int mOrientation;
    public Printer mPrinter;
    public boolean mUseDefaultMargins;
    public final Axis mVerticalAxis;
    public static final LogPrinter LOG_PRINTER = new LogPrinter(3, GridLayout.class.getName());
    public static final AnonymousClass1 NO_PRINTER = new AnonymousClass1();
    public static final int ORIENTATION = 3;
    public static final int ROW_COUNT = 4;
    public static final int COLUMN_COUNT = 1;
    public static final int USE_DEFAULT_MARGINS = 6;
    public static final int ALIGNMENT_MODE = 0;
    public static final int ROW_ORDER_PRESERVED = 5;
    public static final int COLUMN_ORDER_PRESERVED = 2;

    /* renamed from: androidx.gridlayout.widget.GridLayout$1, reason: invalid class name */
    public final class AnonymousClass1 implements Printer {
        @Override // android.util.Printer
        public final void println(String str) {
        }
    }

    public abstract class Alignment {
        public final /* synthetic */ int $r8$classId = 0;

        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewAddCash.deepLinkSpecs;
        }

        public static final void logAnswerChanges(Analytics analytics, ChatSurveyResponse chatSurveyResponse, ChatSurveyResponse chatSurveyResponse2) {
            int i = chatSurveyResponse.satisfaction;
            List list = chatSurveyResponse.selectedReasons;
            int i2 = chatSurveyResponse2.satisfaction;
            List list2 = chatSurveyResponse2.selectedReasons;
            Boolean bool = chatSurveyResponse2.resolved;
            String str = chatSurveyResponse2.surveyToken;
            if (i != i2) {
                analytics.track(new CustomerSupportReviewChangeSatisfaction(Integer.valueOf(i2), str), null);
            }
            if (!Intrinsics.areEqual(chatSurveyResponse.resolved, bool)) {
                analytics.track(new CustomerSupportReviewChangeResolution(bool, str), null);
            }
            List list3 = list;
            List list4 = list2;
            Iterator it = CollectionsKt.minus((Iterable) list3, (Iterable) list4).iterator();
            while (it.hasNext()) {
                analytics.track(new CustomerSupportReviewChangeReason(Boolean.FALSE, (String) it.next(), str), null);
            }
            Iterator it2 = CollectionsKt.minus((Iterable) list4, (Iterable) list3).iterator();
            while (it2.hasNext()) {
                analytics.track(new CustomerSupportReviewChangeReason(Boolean.TRUE, (String) it2.next(), str), null);
            }
        }

        public static final void logAnswerStart(Analytics analytics, String str, ChatSurvey chatSurvey) {
            CustomerSupportReviewStart.Status status;
            str.getClass();
            chatSurvey.getClass();
            if (chatSurvey.equals(ChatSurvey.Completed.INSTANCE) || (chatSurvey instanceof ChatSurvey.Pending)) {
                status = CustomerSupportReviewStart.Status.SUCCESS;
            } else {
                if (!chatSurvey.equals(ChatSurvey.Unavailable.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                status = CustomerSupportReviewStart.Status.FAILURE;
            }
            analytics.track(new CustomerSupportReviewStart(status, str), null);
        }

        public abstract int getAlignmentValue(View view, int i, int i2);

        public Bounds getBounds() {
            return new Bounds();
        }

        public abstract String getDebugString();

        public abstract int getGravityOffset(View view, int i);

        public int getSizeInCell(int i, int i2) {
            return i;
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "Alignment:".concat(getDebugString());
                default:
                    return super.toString();
            }
        }
    }

    public final class Arc {
        public final Interval span;
        public boolean valid = true;
        public final MutableInt value;

        public Arc(Interval interval, MutableInt mutableInt) {
            this.span = interval;
            this.value = mutableInt;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.span);
            sb.append(" ");
            sb.append(!this.valid ? "+>" : "->");
            sb.append(" ");
            sb.append(this.value);
            return sb.toString();
        }
    }

    public final class Assoc extends ArrayList {
        public final Class keyType;
        public final Class valueType;

        public Assoc(Class cls, Class cls2) {
            this.keyType = cls;
            this.valueType = cls2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Recorder.AnonymousClass3 pack() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.keyType, size);
            Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.valueType, size);
            for (int i = 0; i < size; i++) {
                objArr[i] = ((Pair) get(i)).first;
                objArr2[i] = ((Pair) get(i)).second;
            }
            return new Recorder.AnonymousClass3(objArr, objArr2);
        }
    }

    public final class Axis {
        public Arc[] arcs;
        public Recorder.AnonymousClass3 backwardLinks;
        public int[] deltas;
        public Recorder.AnonymousClass3 forwardLinks;
        public Recorder.AnonymousClass3 groupBounds;
        public boolean hasWeights;
        public final boolean horizontal;
        public int[] leadingMargins;
        public int[] locations;
        public int[] trailingMargins;
        public int definedCount = PKIFailureInfo.systemUnavail;
        public int maxIndex = PKIFailureInfo.systemUnavail;
        public boolean groupBoundsValid = false;
        public boolean forwardLinksValid = false;
        public boolean backwardLinksValid = false;
        public boolean leadingMarginsValid = false;
        public boolean trailingMarginsValid = false;
        public boolean arcsValid = false;
        public boolean locationsValid = false;
        public boolean hasWeightsValid = false;
        public boolean orderPreserved = true;
        public final MutableInt parentMin = new MutableInt(0);
        public final MutableInt parentMax = new MutableInt(-100000);

        public Axis(boolean z) {
            this.horizontal = z;
        }

        public static void include(ArrayList arrayList, Interval interval, MutableInt mutableInt, boolean z) {
            if (interval.size() == 0) {
                return;
            }
            if (z) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Arc) it.next()).span.equals(interval)) {
                        return;
                    }
                }
            }
            arrayList.add(new Arc(interval, mutableInt));
        }

        public static boolean relax(int[] iArr, Arc arc) {
            if (!arc.valid) {
                return false;
            }
            Interval interval = arc.span;
            int i = interval.min;
            int i2 = interval.max;
            int i3 = iArr[i] + arc.value.value;
            if (i3 <= iArr[i2]) {
                return false;
            }
            iArr[i2] = i3;
            return true;
        }

        public final String arcsToString(ArrayList arrayList) {
            String str;
            String str2 = this.horizontal ? "x" : "y";
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            boolean z = true;
            while (it.hasNext()) {
                Arc arc = (Arc) it.next();
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                Interval interval = arc.span;
                int i = interval.min;
                int i2 = interval.max;
                int i3 = arc.value.value;
                if (i < i2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(i2);
                    sb2.append("-");
                    sb2.append(str2);
                    sb2.append(i);
                    str = Boxes$$ExternalSyntheticOutline1.m(i3, ">=", sb2);
                } else {
                    str = str2 + i + "-" + str2 + i2 + "<=" + (-i3);
                }
                sb.append(str);
            }
            return sb.toString();
        }

        public final void computeLinks(Recorder.AnonymousClass3 anonymousClass3, boolean z) {
            for (MutableInt mutableInt : (MutableInt[]) ((Object[]) anonymousClass3.this$0)) {
                mutableInt.value = PKIFailureInfo.systemUnavail;
            }
            Bounds[] boundsArr = (Bounds[]) ((Object[]) getGroupBounds().this$0);
            for (int i = 0; i < boundsArr.length; i++) {
                int size = boundsArr[i].size(z);
                MutableInt mutableInt2 = (MutableInt) ((Object[]) anonymousClass3.this$0)[((int[]) anonymousClass3.val$completer)[i]];
                int i2 = mutableInt2.value;
                if (!z) {
                    size = -size;
                }
                mutableInt2.value = Math.max(i2, size);
            }
        }

        public final void computeMargins(boolean z) {
            int[] iArr = z ? this.leadingMargins : this.trailingMargins;
            GridLayout gridLayout = GridLayout.this;
            int childCount = gridLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = gridLayout.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    boolean z2 = this.horizontal;
                    Interval interval = (z2 ? layoutParams.columnSpec : layoutParams.rowSpec).span;
                    int i2 = z ? interval.min : interval.max;
                    iArr[i2] = Math.max(iArr[i2], gridLayout.getMargin1(childAt, z2, z));
                }
            }
        }

        public final Recorder.AnonymousClass3 createLinks(boolean z) {
            Interval interval;
            Assoc assoc = new Assoc(Interval.class, MutableInt.class);
            Spec[] specArr = (Spec[]) ((Object[]) getGroupBounds().val$recordingToStart);
            int length = specArr.length;
            for (int i = 0; i < length; i++) {
                if (z) {
                    interval = specArr[i].span;
                } else {
                    Interval interval2 = specArr[i].span;
                    interval = new Interval(interval2.max, interval2.min);
                }
                MutableInt mutableInt = new MutableInt();
                mutableInt.value = PKIFailureInfo.systemUnavail;
                assoc.add(Pair.create(interval, mutableInt));
            }
            return assoc.pack();
        }

        public final Arc[] getArcs() {
            if (this.arcs == null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (this.forwardLinks == null) {
                    this.forwardLinks = createLinks(true);
                }
                if (!this.forwardLinksValid) {
                    computeLinks(this.forwardLinks, true);
                    this.forwardLinksValid = true;
                }
                Recorder.AnonymousClass3 anonymousClass3 = this.forwardLinks;
                int i = 0;
                while (true) {
                    Interval[] intervalArr = (Interval[]) ((Object[]) anonymousClass3.val$recordingToStart);
                    if (i >= intervalArr.length) {
                        break;
                    }
                    include(arrayList, intervalArr[i], ((MutableInt[]) ((Object[]) anonymousClass3.this$0))[i], false);
                    i++;
                }
                if (this.backwardLinks == null) {
                    this.backwardLinks = createLinks(false);
                }
                if (!this.backwardLinksValid) {
                    computeLinks(this.backwardLinks, false);
                    this.backwardLinksValid = true;
                }
                Recorder.AnonymousClass3 anonymousClass32 = this.backwardLinks;
                int i2 = 0;
                while (true) {
                    Interval[] intervalArr2 = (Interval[]) ((Object[]) anonymousClass32.val$recordingToStart);
                    if (i2 >= intervalArr2.length) {
                        break;
                    }
                    include(arrayList2, intervalArr2[i2], ((MutableInt[]) ((Object[]) anonymousClass32.this$0))[i2], false);
                    i2++;
                }
                if (this.orderPreserved) {
                    int i3 = 0;
                    while (i3 < getCount()) {
                        int i4 = i3 + 1;
                        include(arrayList, new Interval(i3, i4), new MutableInt(0), true);
                        i3 = i4;
                    }
                }
                int count = getCount();
                include(arrayList, new Interval(0, count), this.parentMin, false);
                include(arrayList2, new Interval(count, 0), this.parentMax, false);
                Arc[] arcArr = topologicalSort(arrayList);
                Arc[] arcArr2 = topologicalSort(arrayList2);
                LogPrinter logPrinter = GridLayout.LOG_PRINTER;
                Object[] objArr = (Object[]) Array.newInstance(Arc[].class.getComponentType(), arcArr.length + arcArr2.length);
                System.arraycopy(arcArr, 0, objArr, 0, arcArr.length);
                System.arraycopy(arcArr2, 0, objArr, arcArr.length, arcArr2.length);
                this.arcs = (Arc[]) objArr;
            }
            if (!this.arcsValid) {
                if (this.forwardLinks == null) {
                    this.forwardLinks = createLinks(true);
                }
                if (!this.forwardLinksValid) {
                    computeLinks(this.forwardLinks, true);
                    this.forwardLinksValid = true;
                }
                if (this.backwardLinks == null) {
                    this.backwardLinks = createLinks(false);
                }
                if (!this.backwardLinksValid) {
                    computeLinks(this.backwardLinks, false);
                    this.backwardLinksValid = true;
                }
                this.arcsValid = true;
            }
            return this.arcs;
        }

        public final int getCount() {
            return Math.max(this.definedCount, getMaxIndex());
        }

        public final Recorder.AnonymousClass3 getGroupBounds() {
            int margin;
            int i;
            Recorder.AnonymousClass3 anonymousClass3 = this.groupBounds;
            boolean z = this.horizontal;
            GridLayout gridLayout = GridLayout.this;
            if (anonymousClass3 == null) {
                Assoc assoc = new Assoc(Spec.class, Bounds.class);
                int childCount = gridLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    LayoutParams layoutParams = (LayoutParams) gridLayout.getChildAt(i2).getLayoutParams();
                    Spec spec = z ? layoutParams.columnSpec : layoutParams.rowSpec;
                    assoc.add(Pair.create(spec, spec.getAbsoluteAlignment(z).getBounds()));
                }
                this.groupBounds = assoc.pack();
            }
            if (!this.groupBoundsValid) {
                for (Bounds bounds : (Bounds[]) ((Object[]) this.groupBounds.this$0)) {
                    bounds.reset();
                }
                int childCount2 = gridLayout.getChildCount();
                for (int i3 = 0; i3 < childCount2; i3++) {
                    View childAt = gridLayout.getChildAt(i3);
                    LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                    Spec spec2 = z ? layoutParams2.columnSpec : layoutParams2.rowSpec;
                    if (childAt.getVisibility() == 8) {
                        margin = 0;
                    } else {
                        margin = gridLayout.getMargin(childAt, z, false) + gridLayout.getMargin(childAt, z, true) + (z ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight());
                    }
                    if (spec2.weight == RecyclerView.DECELERATION_RATE) {
                        i = 0;
                    } else {
                        if (this.deltas == null) {
                            this.deltas = new int[gridLayout.getChildCount()];
                        }
                        i = this.deltas[i3];
                    }
                    int i4 = margin + i;
                    Recorder.AnonymousClass3 anonymousClass32 = this.groupBounds;
                    Bounds bounds2 = (Bounds) ((Object[]) anonymousClass32.this$0)[((int[]) anonymousClass32.val$completer)[i3]];
                    bounds2.flexibility = ((spec2.alignment == GridLayout.UNDEFINED_ALIGNMENT && spec2.weight == RecyclerView.DECELERATION_RATE) ? 0 : 2) & bounds2.flexibility;
                    Alignment absoluteAlignment = spec2.getAbsoluteAlignment(z);
                    int i5 = ViewGroupCompat.$r8$clinit;
                    int alignmentValue = absoluteAlignment.getAlignmentValue(childAt, i4, gridLayout.getLayoutMode());
                    bounds2.include(alignmentValue, i4 - alignmentValue);
                }
                this.groupBoundsValid = true;
            }
            return this.groupBounds;
        }

        public final int[] getLocations() {
            boolean z;
            if (this.locations == null) {
                this.locations = new int[getCount() + 1];
            }
            if (!this.locationsValid) {
                int[] iArr = this.locations;
                boolean z2 = this.hasWeightsValid;
                GridLayout gridLayout = GridLayout.this;
                float f = RecyclerView.DECELERATION_RATE;
                boolean z3 = this.horizontal;
                if (!z2) {
                    int childCount = gridLayout.getChildCount();
                    int i = 0;
                    while (true) {
                        if (i >= childCount) {
                            z = false;
                            break;
                        }
                        View childAt = gridLayout.getChildAt(i);
                        if (childAt.getVisibility() != 8) {
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            if ((z3 ? layoutParams.columnSpec : layoutParams.rowSpec).weight != RecyclerView.DECELERATION_RATE) {
                                z = true;
                                break;
                            }
                        }
                        i++;
                    }
                    this.hasWeights = z;
                    this.hasWeightsValid = true;
                }
                if (this.hasWeights) {
                    if (this.deltas == null) {
                        this.deltas = new int[gridLayout.getChildCount()];
                    }
                    Arrays.fill(this.deltas, 0);
                    solve(getArcs(), iArr, true);
                    int childCount2 = (gridLayout.getChildCount() * this.parentMin.value) + 1;
                    if (childCount2 >= 2) {
                        int childCount3 = gridLayout.getChildCount();
                        for (int i2 = 0; i2 < childCount3; i2++) {
                            View childAt2 = gridLayout.getChildAt(i2);
                            if (childAt2.getVisibility() != 8) {
                                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                                f += (z3 ? layoutParams2.columnSpec : layoutParams2.rowSpec).weight;
                            }
                        }
                        int i3 = -1;
                        boolean z4 = true;
                        int i4 = 0;
                        while (i4 < childCount2) {
                            int i5 = (int) ((i4 + childCount2) / 2);
                            invalidateValues();
                            shareOutDelta(f, i5);
                            boolean solve = solve(getArcs(), iArr, false);
                            if (solve) {
                                i4 = i5 + 1;
                                i3 = i5;
                            } else {
                                childCount2 = i5;
                            }
                            z4 = solve;
                        }
                        if (i3 > 0 && !z4) {
                            invalidateValues();
                            shareOutDelta(f, i3);
                            solve(getArcs(), iArr, true);
                        }
                    }
                } else {
                    solve(getArcs(), iArr, true);
                }
                if (!this.orderPreserved) {
                    int i6 = iArr[0];
                    int length = iArr.length;
                    for (int i7 = 0; i7 < length; i7++) {
                        iArr[i7] = iArr[i7] - i6;
                    }
                }
                this.locationsValid = true;
            }
            return this.locations;
        }

        public final int getMaxIndex() {
            int i = this.maxIndex;
            int i2 = PKIFailureInfo.systemUnavail;
            if (i == Integer.MIN_VALUE) {
                GridLayout gridLayout = GridLayout.this;
                int childCount = gridLayout.getChildCount();
                int i3 = -1;
                for (int i4 = 0; i4 < childCount; i4++) {
                    LayoutParams layoutParams = (LayoutParams) gridLayout.getChildAt(i4).getLayoutParams();
                    Interval interval = (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).span;
                    i3 = Math.max(Math.max(Math.max(i3, interval.min), interval.max), interval.size());
                }
                if (i3 != -1) {
                    i2 = i3;
                }
                this.maxIndex = Math.max(0, i2);
            }
            return this.maxIndex;
        }

        public final int getMeasure(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            MutableInt mutableInt = this.parentMax;
            MutableInt mutableInt2 = this.parentMin;
            if (mode == Integer.MIN_VALUE) {
                mutableInt2.value = 0;
                mutableInt.value = -size;
                this.locationsValid = false;
                return getLocations()[getCount()];
            }
            if (mode == 0) {
                mutableInt2.value = 0;
                mutableInt.value = -100000;
                this.locationsValid = false;
                return getLocations()[getCount()];
            }
            if (mode != 1073741824) {
                return 0;
            }
            mutableInt2.value = size;
            mutableInt.value = -size;
            this.locationsValid = false;
            return getLocations()[getCount()];
        }

        public final void invalidateStructure() {
            this.maxIndex = PKIFailureInfo.systemUnavail;
            this.groupBounds = null;
            this.forwardLinks = null;
            this.backwardLinks = null;
            this.leadingMargins = null;
            this.trailingMargins = null;
            this.arcs = null;
            this.locations = null;
            this.deltas = null;
            this.hasWeightsValid = false;
            invalidateValues();
        }

        public final void invalidateValues() {
            this.groupBoundsValid = false;
            this.forwardLinksValid = false;
            this.backwardLinksValid = false;
            this.leadingMarginsValid = false;
            this.trailingMarginsValid = false;
            this.arcsValid = false;
            this.locationsValid = false;
        }

        public final void setCount(int i) {
            if (i == Integer.MIN_VALUE || i >= getMaxIndex()) {
                this.definedCount = i;
            } else {
                GridLayout.handleInvalidParams((this.horizontal ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
                throw null;
            }
        }

        public final void shareOutDelta(float f, int i) {
            Arrays.fill(this.deltas, 0);
            GridLayout gridLayout = GridLayout.this;
            int childCount = gridLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = gridLayout.getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    float f2 = (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).weight;
                    if (f2 != RecyclerView.DECELERATION_RATE) {
                        int round = Math.round((i * f2) / f);
                        this.deltas[i2] = round;
                        i -= round;
                        f -= f2;
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean solve(Arc[] arcArr, int[] iArr, boolean z) {
            String str = this.horizontal ? "horizontal" : "vertical";
            int count = getCount() + 1;
            boolean[] zArr = null;
            int i = 0;
            while (true) {
                if (i >= arcArr.length) {
                    break;
                }
                Arrays.fill(iArr, 0);
                for (int i2 = 0; i2 < count; i2++) {
                    boolean z2 = false;
                    for (Arc arc : arcArr) {
                        z2 |= relax(iArr, arc);
                    }
                    if (!z2) {
                        if (zArr != null) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (int i3 = 0; i3 < arcArr.length; i3++) {
                                Arc arc2 = arcArr[i3];
                                if (zArr[i3]) {
                                    arrayList.add(arc2);
                                }
                                if (!arc2.valid) {
                                    arrayList2.add(arc2);
                                }
                            }
                            Printer printer = GridLayout.this.mPrinter;
                            StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, " constraints: ");
                            m108m.append(arcsToString(arrayList));
                            m108m.append(" are inconsistent; permanently removing: ");
                            m108m.append(arcsToString(arrayList2));
                            m108m.append(". ");
                            printer.println(m108m.toString());
                            return true;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
                boolean[] zArr2 = new boolean[arcArr.length];
                for (int i4 = 0; i4 < count; i4++) {
                    int length = arcArr.length;
                    for (int i5 = 0; i5 < length; i5++) {
                        zArr2[i5] = zArr2[i5] | relax(iArr, arcArr[i5]);
                    }
                }
                if (i == 0) {
                    zArr = zArr2;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= arcArr.length) {
                        break;
                    }
                    if (zArr2[i6]) {
                        Arc arc3 = arcArr[i6];
                        Interval interval = arc3.span;
                        if (interval.min >= interval.max) {
                            arc3.valid = false;
                            break;
                        }
                    }
                    i6++;
                }
                i++;
            }
        }

        public final Arc[] topologicalSort(ArrayList arrayList) {
            TraceParser traceParser = new TraceParser(this, (Arc[]) arrayList.toArray(new Arc[arrayList.size()]));
            int length = ((Arc[][]) traceParser.projectPackages).length;
            for (int i = 0; i < length; i++) {
                traceParser.walk(i);
            }
            return (Arc[]) traceParser.logger;
        }
    }

    public class Bounds {
        public int after;
        public int before;
        public int flexibility;

        public Bounds() {
            reset();
        }

        public int getOffset(GridLayout gridLayout, View view, Alignment alignment, int i, boolean z) {
            int i2 = this.before;
            int i3 = ViewGroupCompat.$r8$clinit;
            return i2 - alignment.getAlignmentValue(view, i, gridLayout.getLayoutMode());
        }

        public void include(int i, int i2) {
            this.before = Math.max(this.before, i);
            this.after = Math.max(this.after, i2);
        }

        public void reset() {
            this.before = PKIFailureInfo.systemUnavail;
            this.after = PKIFailureInfo.systemUnavail;
            this.flexibility = 2;
        }

        public int size(boolean z) {
            if (!z) {
                int i = this.flexibility;
                LogPrinter logPrinter = GridLayout.LOG_PRINTER;
                if ((i & 2) != 0) {
                    return 100000;
                }
            }
            return this.before + this.after;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Bounds{before=");
            sb.append(this.before);
            sb.append(", after=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.after, '}');
        }
    }

    public final class Interval {
        public final int max;
        public final int min;

        public Interval(int i, int i2) {
            this.min = i;
            this.max = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Interval.class != obj.getClass()) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.max == interval.max && this.min == interval.min;
        }

        public final int hashCode() {
            return (this.min * 31) + this.max;
        }

        public final int size() {
            return this.max - this.min;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.min);
            sb.append(", ");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.max, "]", sb);
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public Spec columnSpec;
        public Spec rowSpec;
        public static final int DEFAULT_SPAN_SIZE = (-2147483647) - PKIFailureInfo.systemUnavail;
        public static final int MARGIN = 2;
        public static final int LEFT_MARGIN = 3;
        public static final int TOP_MARGIN = 4;
        public static final int RIGHT_MARGIN = 5;
        public static final int BOTTOM_MARGIN = 6;
        public static final int COLUMN = 7;
        public static final int COLUMN_SPAN = 8;
        public static final int COLUMN_WEIGHT = 9;
        public static final int ROW = 11;
        public static final int ROW_SPAN = 12;
        public static final int ROW_WEIGHT = 13;
        public static final int GRAVITY = 10;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Spec spec = Spec.UNDEFINED;
            this.rowSpec = spec;
            this.columnSpec = spec;
            int[] iArr = R$styleable.GridLayout_Layout;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(MARGIN, PKIFailureInfo.systemUnavail);
                ((ViewGroup.MarginLayoutParams) this).leftMargin = obtainStyledAttributes.getDimensionPixelSize(LEFT_MARGIN, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).topMargin = obtainStyledAttributes.getDimensionPixelSize(TOP_MARGIN, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).rightMargin = obtainStyledAttributes.getDimensionPixelSize(RIGHT_MARGIN, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = obtainStyledAttributes.getDimensionPixelSize(BOTTOM_MARGIN, dimensionPixelSize);
                obtainStyledAttributes.recycle();
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
                try {
                    int i = obtainStyledAttributes.getInt(GRAVITY, 0);
                    int i2 = obtainStyledAttributes.getInt(COLUMN, PKIFailureInfo.systemUnavail);
                    int i3 = COLUMN_SPAN;
                    int i4 = DEFAULT_SPAN_SIZE;
                    this.columnSpec = GridLayout.spec(i2, obtainStyledAttributes.getInt(i3, i4), GridLayout.getAlignment(i, true), obtainStyledAttributes.getFloat(COLUMN_WEIGHT, RecyclerView.DECELERATION_RATE));
                    this.rowSpec = GridLayout.spec(obtainStyledAttributes.getInt(ROW, PKIFailureInfo.systemUnavail), obtainStyledAttributes.getInt(ROW_SPAN, i4), GridLayout.getAlignment(i, false), obtainStyledAttributes.getFloat(ROW_WEIGHT, RecyclerView.DECELERATION_RATE));
                } finally {
                }
            } finally {
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayoutParams)) {
                return false;
            }
            LayoutParams layoutParams = (LayoutParams) obj;
            return this.columnSpec.equals(layoutParams.columnSpec) && this.rowSpec.equals(layoutParams.rowSpec);
        }

        public final int hashCode() {
            return this.columnSpec.hashCode() + (this.rowSpec.hashCode() * 31);
        }

        @Override // android.view.ViewGroup.LayoutParams
        public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i, -2);
            ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i2, -2);
        }
    }

    public final class MutableInt {
        public int value;

        public MutableInt(int i) {
            this.value = i;
        }

        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    public final class Spec {
        public static final Spec UNDEFINED = GridLayout.spec(PKIFailureInfo.systemUnavail, 1, GridLayout.UNDEFINED_ALIGNMENT, RecyclerView.DECELERATION_RATE);
        public final Alignment alignment;
        public final Interval span;
        public final boolean startDefined;
        public final float weight;

        public Spec(boolean z, Interval interval, Alignment alignment, float f) {
            this.startDefined = z;
            this.span = interval;
            this.alignment = alignment;
            this.weight = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Spec)) {
                return false;
            }
            Spec spec = (Spec) obj;
            return this.alignment.equals(spec.alignment) && this.span.equals(spec.span);
        }

        public final Alignment getAbsoluteAlignment(boolean z) {
            AnonymousClass2 anonymousClass2 = GridLayout.UNDEFINED_ALIGNMENT;
            Alignment alignment = this.alignment;
            return alignment != anonymousClass2 ? alignment : this.weight == RecyclerView.DECELERATION_RATE ? z ? GridLayout.START : GridLayout.BASELINE : GridLayout.FILL;
        }

        public final int hashCode() {
            return this.alignment.hashCode() + (this.span.hashCode() * 31);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.gridlayout.widget.GridLayout$2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.gridlayout.widget.GridLayout$2, androidx.gridlayout.widget.GridLayout$Alignment] */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.gridlayout.widget.GridLayout$2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.gridlayout.widget.GridLayout$2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.gridlayout.widget.GridLayout$2, androidx.gridlayout.widget.GridLayout$Alignment] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.gridlayout.widget.GridLayout$5] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.gridlayout.widget.GridLayout$5] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.gridlayout.widget.GridLayout$2] */
    static {
        final int i = 3;
        final int i2 = 4;
        final int i3 = 1;
        final int i4 = 0;
        final int i5 = 5;
        final int i6 = 2;
        UNDEFINED_ALIGNMENT = new Alignment() { // from class: androidx.gridlayout.widget.GridLayout.2
            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getAlignmentValue(View view, int i7, int i8) {
                switch (i4) {
                    case 4:
                        if (view.getVisibility() != 8) {
                            int baseline = view.getBaseline();
                            if (baseline == -1) {
                                break;
                            }
                        }
                        break;
                }
                return PKIFailureInfo.systemUnavail;
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public Bounds getBounds() {
                switch (i4) {
                    case 4:
                        return new GridLayout$7$1();
                    default:
                        return super.getBounds();
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final String getDebugString() {
                switch (i4) {
                    case 0:
                        return "UNDEFINED";
                    case 1:
                        return "LEADING";
                    case 2:
                        return "TRAILING";
                    case 3:
                        return "CENTER";
                    case 4:
                        return "BASELINE";
                    default:
                        return "FILL";
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getGravityOffset(View view, int i7) {
                switch (i4) {
                    case 0:
                        return PKIFailureInfo.systemUnavail;
                    case 1:
                        return 0;
                    case 2:
                        return i7;
                    case 3:
                        return i7 >> 1;
                    case 4:
                        return 0;
                    default:
                        return 0;
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public int getSizeInCell(int i7, int i8) {
                switch (i4) {
                    case 5:
                        return i8;
                    default:
                        return i7;
                }
            }
        };
        final ?? r3 = new Alignment() { // from class: androidx.gridlayout.widget.GridLayout.2
            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getAlignmentValue(View view, int i7, int i8) {
                switch (i3) {
                    case 4:
                        if (view.getVisibility() != 8) {
                            int baseline = view.getBaseline();
                            if (baseline == -1) {
                                break;
                            }
                        }
                        break;
                }
                return PKIFailureInfo.systemUnavail;
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public Bounds getBounds() {
                switch (i3) {
                    case 4:
                        return new GridLayout$7$1();
                    default:
                        return super.getBounds();
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final String getDebugString() {
                switch (i3) {
                    case 0:
                        return "UNDEFINED";
                    case 1:
                        return "LEADING";
                    case 2:
                        return "TRAILING";
                    case 3:
                        return "CENTER";
                    case 4:
                        return "BASELINE";
                    default:
                        return "FILL";
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getGravityOffset(View view, int i7) {
                switch (i3) {
                    case 0:
                        return PKIFailureInfo.systemUnavail;
                    case 1:
                        return 0;
                    case 2:
                        return i7;
                    case 3:
                        return i7 >> 1;
                    case 4:
                        return 0;
                    default:
                        return 0;
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public int getSizeInCell(int i7, int i8) {
                switch (i3) {
                    case 5:
                        return i8;
                    default:
                        return i7;
                }
            }
        };
        final ?? r1 = new Alignment() { // from class: androidx.gridlayout.widget.GridLayout.2
            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getAlignmentValue(View view, int i7, int i8) {
                switch (i6) {
                    case 4:
                        if (view.getVisibility() != 8) {
                            int baseline = view.getBaseline();
                            if (baseline == -1) {
                                break;
                            }
                        }
                        break;
                }
                return PKIFailureInfo.systemUnavail;
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public Bounds getBounds() {
                switch (i6) {
                    case 4:
                        return new GridLayout$7$1();
                    default:
                        return super.getBounds();
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final String getDebugString() {
                switch (i6) {
                    case 0:
                        return "UNDEFINED";
                    case 1:
                        return "LEADING";
                    case 2:
                        return "TRAILING";
                    case 3:
                        return "CENTER";
                    case 4:
                        return "BASELINE";
                    default:
                        return "FILL";
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getGravityOffset(View view, int i7) {
                switch (i6) {
                    case 0:
                        return PKIFailureInfo.systemUnavail;
                    case 1:
                        return 0;
                    case 2:
                        return i7;
                    case 3:
                        return i7 >> 1;
                    case 4:
                        return 0;
                    default:
                        return 0;
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public int getSizeInCell(int i7, int i8) {
                switch (i6) {
                    case 5:
                        return i8;
                    default:
                        return i7;
                }
            }
        };
        TOP = r3;
        BOTTOM = r1;
        START = r3;
        END = r1;
        LEFT = new Alignment() { // from class: androidx.gridlayout.widget.GridLayout.5
            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getAlignmentValue(View view, int i7, int i8) {
                return (view.getLayoutDirection() == 1 ? r1 : Alignment.this).getAlignmentValue(view, i7, i8);
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final String getDebugString() {
                return "SWITCHING[L:" + Alignment.this.getDebugString() + ", R:" + r1.getDebugString() + "]";
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getGravityOffset(View view, int i7) {
                return (view.getLayoutDirection() == 1 ? r1 : Alignment.this).getGravityOffset(view, i7);
            }
        };
        RIGHT = new Alignment() { // from class: androidx.gridlayout.widget.GridLayout.5
            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getAlignmentValue(View view, int i7, int i8) {
                return (view.getLayoutDirection() == 1 ? r3 : Alignment.this).getAlignmentValue(view, i7, i8);
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final String getDebugString() {
                return "SWITCHING[L:" + Alignment.this.getDebugString() + ", R:" + r3.getDebugString() + "]";
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getGravityOffset(View view, int i7) {
                return (view.getLayoutDirection() == 1 ? r3 : Alignment.this).getGravityOffset(view, i7);
            }
        };
        CENTER = new Alignment() { // from class: androidx.gridlayout.widget.GridLayout.2
            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getAlignmentValue(View view, int i7, int i8) {
                switch (i) {
                    case 4:
                        if (view.getVisibility() != 8) {
                            int baseline = view.getBaseline();
                            if (baseline == -1) {
                                break;
                            }
                        }
                        break;
                }
                return PKIFailureInfo.systemUnavail;
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public Bounds getBounds() {
                switch (i) {
                    case 4:
                        return new GridLayout$7$1();
                    default:
                        return super.getBounds();
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final String getDebugString() {
                switch (i) {
                    case 0:
                        return "UNDEFINED";
                    case 1:
                        return "LEADING";
                    case 2:
                        return "TRAILING";
                    case 3:
                        return "CENTER";
                    case 4:
                        return "BASELINE";
                    default:
                        return "FILL";
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getGravityOffset(View view, int i7) {
                switch (i) {
                    case 0:
                        return PKIFailureInfo.systemUnavail;
                    case 1:
                        return 0;
                    case 2:
                        return i7;
                    case 3:
                        return i7 >> 1;
                    case 4:
                        return 0;
                    default:
                        return 0;
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public int getSizeInCell(int i7, int i8) {
                switch (i) {
                    case 5:
                        return i8;
                    default:
                        return i7;
                }
            }
        };
        BASELINE = new Alignment() { // from class: androidx.gridlayout.widget.GridLayout.2
            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getAlignmentValue(View view, int i7, int i8) {
                switch (i2) {
                    case 4:
                        if (view.getVisibility() != 8) {
                            int baseline = view.getBaseline();
                            if (baseline == -1) {
                                break;
                            }
                        }
                        break;
                }
                return PKIFailureInfo.systemUnavail;
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public Bounds getBounds() {
                switch (i2) {
                    case 4:
                        return new GridLayout$7$1();
                    default:
                        return super.getBounds();
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final String getDebugString() {
                switch (i2) {
                    case 0:
                        return "UNDEFINED";
                    case 1:
                        return "LEADING";
                    case 2:
                        return "TRAILING";
                    case 3:
                        return "CENTER";
                    case 4:
                        return "BASELINE";
                    default:
                        return "FILL";
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getGravityOffset(View view, int i7) {
                switch (i2) {
                    case 0:
                        return PKIFailureInfo.systemUnavail;
                    case 1:
                        return 0;
                    case 2:
                        return i7;
                    case 3:
                        return i7 >> 1;
                    case 4:
                        return 0;
                    default:
                        return 0;
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public int getSizeInCell(int i7, int i8) {
                switch (i2) {
                    case 5:
                        return i8;
                    default:
                        return i7;
                }
            }
        };
        FILL = new Alignment() { // from class: androidx.gridlayout.widget.GridLayout.2
            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getAlignmentValue(View view, int i7, int i8) {
                switch (i5) {
                    case 4:
                        if (view.getVisibility() != 8) {
                            int baseline = view.getBaseline();
                            if (baseline == -1) {
                                break;
                            }
                        }
                        break;
                }
                return PKIFailureInfo.systemUnavail;
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public Bounds getBounds() {
                switch (i5) {
                    case 4:
                        return new GridLayout$7$1();
                    default:
                        return super.getBounds();
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final String getDebugString() {
                switch (i5) {
                    case 0:
                        return "UNDEFINED";
                    case 1:
                        return "LEADING";
                    case 2:
                        return "TRAILING";
                    case 3:
                        return "CENTER";
                    case 4:
                        return "BASELINE";
                    default:
                        return "FILL";
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public final int getGravityOffset(View view, int i7) {
                switch (i5) {
                    case 0:
                        return PKIFailureInfo.systemUnavail;
                    case 1:
                        return 0;
                    case 2:
                        return i7;
                    case 3:
                        return i7 >> 1;
                    case 4:
                        return 0;
                    default:
                        return 0;
                }
            }

            @Override // androidx.gridlayout.widget.GridLayout.Alignment
            public int getSizeInCell(int i7, int i8) {
                switch (i5) {
                    case 5:
                        return i8;
                    default:
                        return i7;
                }
            }
        };
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHorizontalAxis = new Axis(true);
        this.mVerticalAxis = new Axis(false);
        this.mOrientation = 0;
        this.mUseDefaultMargins = false;
        this.mAlignmentMode = 1;
        this.mLastLayoutParamsHashCode = 0;
        this.mPrinter = LOG_PRINTER;
        this.mDefaultGap = context.getResources().getDimensionPixelOffset(R.dimen.default_gap);
        int[] iArr = R$styleable.GridLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api29Impl.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        try {
            setRowCount(obtainStyledAttributes.getInt(ROW_COUNT, PKIFailureInfo.systemUnavail));
            setColumnCount(obtainStyledAttributes.getInt(COLUMN_COUNT, PKIFailureInfo.systemUnavail));
            setOrientation(obtainStyledAttributes.getInt(ORIENTATION, 0));
            setUseDefaultMargins(obtainStyledAttributes.getBoolean(USE_DEFAULT_MARGINS, false));
            setAlignmentMode(obtainStyledAttributes.getInt(ALIGNMENT_MODE, 1));
            setRowOrderPreserved(obtainStyledAttributes.getBoolean(ROW_ORDER_PRESERVED, true));
            setColumnOrderPreserved(obtainStyledAttributes.getBoolean(COLUMN_ORDER_PRESERVED, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static Alignment getAlignment(int i, boolean z) {
        int i2 = (i & (z ? 7 : 112)) >> (z ? 0 : 4);
        return i2 != 1 ? i2 != 3 ? i2 != 5 ? i2 != 7 ? i2 != 8388611 ? i2 != 8388613 ? UNDEFINED_ALIGNMENT : END : START : FILL : z ? RIGHT : BOTTOM : z ? LEFT : TOP : CENTER;
    }

    public static void handleInvalidParams(String str) {
        throw new IllegalArgumentException(str.concat(". "));
    }

    public static void setCellGroup(LayoutParams layoutParams, int i, int i2, int i3, int i4) {
        Interval interval = new Interval(i, i2 + i);
        Spec spec = layoutParams.rowSpec;
        layoutParams.rowSpec = new Spec(spec.startDefined, interval, spec.alignment, spec.weight);
        Interval interval2 = new Interval(i3, i4 + i3);
        Spec spec2 = layoutParams.columnSpec;
        layoutParams.columnSpec = new Spec(spec2.startDefined, interval2, spec2.alignment, spec2.weight);
    }

    public static Spec spec(int i, int i2, Alignment alignment, float f) {
        return new Spec(i != Integer.MIN_VALUE, new Interval(i, i2 + i), alignment, f);
    }

    public final void checkLayoutParams(LayoutParams layoutParams, boolean z) {
        String str = z ? "column" : "row";
        Interval interval = (z ? layoutParams.columnSpec : layoutParams.rowSpec).span;
        int i = interval.min;
        if (i != Integer.MIN_VALUE && i < 0) {
            handleInvalidParams(str.concat(" indices must be positive"));
            throw null;
        }
        int i2 = (z ? this.mHorizontalAxis : this.mVerticalAxis).definedCount;
        if (i2 != Integer.MIN_VALUE) {
            if (interval.max > i2) {
                handleInvalidParams(str + " indices (start + span) mustn't exceed the " + str + " count");
                throw null;
            }
            if (interval.size() <= i2) {
                return;
            }
            handleInvalidParams(str + " span mustn't exceed the " + str + " count");
            throw null;
        }
    }

    public final int computeLayoutParamsHashCode() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i = ((LayoutParams) childAt.getLayoutParams()).hashCode() + (i * 31);
            }
        }
        return i;
    }

    public final void consistencyCheck() {
        int i = this.mLastLayoutParamsHashCode;
        if (i != 0) {
            if (i != computeLayoutParamsHashCode()) {
                this.mPrinter.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                invalidateStructure();
                consistencyCheck();
                return;
            }
            return;
        }
        boolean z = this.mOrientation == 0;
        int i2 = (z ? this.mHorizontalAxis : this.mVerticalAxis).definedCount;
        if (i2 == Integer.MIN_VALUE) {
            i2 = 0;
        }
        int[] iArr = new int[i2];
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
            Spec spec = z ? layoutParams.rowSpec : layoutParams.columnSpec;
            Interval interval = spec.span;
            boolean z2 = spec.startDefined;
            int size = interval.size();
            if (z2) {
                i3 = interval.min;
            }
            Spec spec2 = z ? layoutParams.columnSpec : layoutParams.rowSpec;
            Interval interval2 = spec2.span;
            boolean z3 = spec2.startDefined;
            int size2 = interval2.size();
            int i6 = interval2.min;
            if (i2 != 0) {
                size2 = Math.min(size2, i2 - (z3 ? Math.min(i6, i2) : 0));
            }
            if (z3) {
                i4 = i6;
            }
            if (i2 != 0) {
                if (!z2 || !z3) {
                    while (true) {
                        int i7 = i4 + size2;
                        if (i7 <= i2) {
                            for (int i8 = i4; i8 < i7; i8++) {
                                if (iArr[i8] <= i3) {
                                }
                            }
                            break;
                        }
                        if (z3) {
                            i3++;
                        } else if (i7 <= i2) {
                            i4++;
                        } else {
                            i3++;
                            i4 = 0;
                        }
                    }
                }
                Arrays.fill(iArr, Math.min(i4, i2), Math.min(i4 + size2, i2), i3 + size);
            }
            if (z) {
                setCellGroup(layoutParams, i3, size, i4, size2);
            } else {
                setCellGroup(layoutParams, i4, size2, i3, size);
            }
            i4 += size2;
        }
        this.mLastLayoutParamsHashCode = computeLayoutParamsHashCode();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Spec spec = Spec.UNDEFINED;
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.rowSpec = spec;
        layoutParams.columnSpec = spec;
        layoutParams.setMargins(PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail);
        layoutParams.rowSpec = spec;
        layoutParams.columnSpec = spec;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            Spec spec = Spec.UNDEFINED;
            layoutParams3.rowSpec = spec;
            layoutParams3.columnSpec = spec;
            layoutParams3.rowSpec = layoutParams2.rowSpec;
            layoutParams3.columnSpec = layoutParams2.columnSpec;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            Spec spec2 = Spec.UNDEFINED;
            layoutParams4.rowSpec = spec2;
            layoutParams4.columnSpec = spec2;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        Spec spec3 = Spec.UNDEFINED;
        layoutParams5.rowSpec = spec3;
        layoutParams5.columnSpec = spec3;
        return layoutParams5;
    }

    public final int getMargin(View view, boolean z, boolean z2) {
        int[] iArr;
        if (this.mAlignmentMode == 1) {
            return getMargin1(view, z, z2);
        }
        Axis axis = z ? this.mHorizontalAxis : this.mVerticalAxis;
        if (z2) {
            if (axis.leadingMargins == null) {
                axis.leadingMargins = new int[axis.getCount() + 1];
            }
            if (!axis.leadingMarginsValid) {
                axis.computeMargins(true);
                axis.leadingMarginsValid = true;
            }
            iArr = axis.leadingMargins;
        } else {
            if (axis.trailingMargins == null) {
                axis.trailingMargins = new int[axis.getCount() + 1];
            }
            if (!axis.trailingMarginsValid) {
                axis.computeMargins(false);
                axis.trailingMarginsValid = true;
            }
            iArr = axis.trailingMargins;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Interval interval = (z ? layoutParams.columnSpec : layoutParams.rowSpec).span;
        return iArr[z2 ? interval.min : interval.max];
    }

    public final int getMargin1(View view, boolean z, boolean z2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i = z ? z2 ? ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin : ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : z2 ? ((ViewGroup.MarginLayoutParams) layoutParams).topMargin : ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (this.mUseDefaultMargins && view.getClass() != Space.class) {
            return this.mDefaultGap / 2;
        }
        return 0;
    }

    public final void invalidateStructure() {
        this.mLastLayoutParamsHashCode = 0;
        Axis axis = this.mHorizontalAxis;
        if (axis != null) {
            axis.invalidateStructure();
        }
        Axis axis2 = this.mVerticalAxis;
        if (axis2 != null) {
            axis2.invalidateStructure();
        }
        if (axis == null || axis2 == null) {
            return;
        }
        axis.invalidateValues();
        axis2.invalidateValues();
    }

    public final void measureChildWithMargins2(View view, int i, int i2, int i3, int i4) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getMargin(view, true, false) + getMargin(view, true, true), i3), ViewGroup.getChildMeasureSpec(i2, getMargin(view, false, false) + getMargin(view, false, true), i4));
    }

    public final void measureChildrenWithMargins(int i, int i2, boolean z) {
        int i3;
        int i4;
        GridLayout gridLayout;
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                gridLayout = this;
                i3 = i;
                i4 = i2;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                    int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                    gridLayout = this;
                    i3 = i;
                    i4 = i2;
                    gridLayout.measureChildWithMargins2(childAt, i3, i4, i6, i7);
                } else {
                    i3 = i;
                    i4 = i2;
                    boolean z2 = this.mOrientation == 0;
                    Spec spec = z2 ? layoutParams.columnSpec : layoutParams.rowSpec;
                    if (spec.getAbsoluteAlignment(z2) == FILL) {
                        Interval interval = spec.span;
                        int[] locations = (z2 ? this.mHorizontalAxis : this.mVerticalAxis).getLocations();
                        int margin = (locations[interval.max] - locations[interval.min]) - (this.getMargin(childAt, z2, false) + this.getMargin(childAt, z2, true));
                        if (z2) {
                            int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                            gridLayout = this;
                            gridLayout.measureChildWithMargins2(childAt, i3, i4, margin, i8);
                        } else {
                            int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                            gridLayout = this;
                            gridLayout.measureChildWithMargins2(childAt, i3, i4, i9, margin);
                        }
                    } else {
                        gridLayout = this;
                    }
                }
            }
            i5++;
            this = gridLayout;
            i = i3;
            i2 = i4;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        GridLayout gridLayout = this;
        gridLayout.consistencyCheck();
        int i9 = i3 - i;
        int paddingLeft = gridLayout.getPaddingLeft();
        int paddingTop = gridLayout.getPaddingTop();
        int paddingRight = gridLayout.getPaddingRight();
        int paddingBottom = gridLayout.getPaddingBottom();
        int i10 = (i9 - paddingLeft) - paddingRight;
        Axis axis = gridLayout.mHorizontalAxis;
        axis.parentMin.value = i10;
        axis.parentMax.value = -i10;
        boolean z3 = false;
        axis.locationsValid = false;
        axis.getLocations();
        int i11 = ((i4 - i2) - paddingTop) - paddingBottom;
        Axis axis2 = gridLayout.mVerticalAxis;
        axis2.parentMin.value = i11;
        axis2.parentMax.value = -i11;
        axis2.locationsValid = false;
        axis2.getLocations();
        int[] locations = axis.getLocations();
        int[] locations2 = axis2.getLocations();
        int childCount = gridLayout.getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = gridLayout.getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                i6 = i12;
                i5 = i9;
                i7 = paddingLeft;
                i8 = paddingTop;
                z2 = z3;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Spec spec = layoutParams.columnSpec;
                Spec spec2 = layoutParams.rowSpec;
                Interval interval = spec.span;
                Interval interval2 = spec2.span;
                int i13 = i12;
                int i14 = locations[interval.min];
                int i15 = locations2[interval2.min];
                int i16 = locations[interval.max];
                int i17 = locations2[interval2.max];
                int i18 = i16 - i14;
                int i19 = i17 - i15;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                Alignment absoluteAlignment = spec.getAbsoluteAlignment(true);
                Alignment absoluteAlignment2 = spec2.getAbsoluteAlignment(false);
                Recorder.AnonymousClass3 groupBounds = axis.getGroupBounds();
                Bounds bounds = (Bounds) ((Object[]) groupBounds.this$0)[((int[]) groupBounds.val$completer)[i13]];
                Recorder.AnonymousClass3 groupBounds2 = axis2.getGroupBounds();
                i5 = i9;
                Bounds bounds2 = (Bounds) ((Object[]) groupBounds2.this$0)[((int[]) groupBounds2.val$completer)[i13]];
                int gravityOffset = absoluteAlignment.getGravityOffset(childAt, i18 - bounds.size(true));
                int gravityOffset2 = absoluteAlignment2.getGravityOffset(childAt, i19 - bounds2.size(true));
                int margin = gridLayout.getMargin(childAt, true, true);
                int margin2 = gridLayout.getMargin(childAt, false, true);
                int margin3 = gridLayout.getMargin(childAt, true, false);
                int i20 = margin + margin3;
                int margin4 = margin2 + gridLayout.getMargin(childAt, false, false);
                i6 = i13;
                i7 = paddingLeft;
                i8 = paddingTop;
                z2 = false;
                int offset = bounds.getOffset(gridLayout, childAt, absoluteAlignment, measuredWidth + i20, true);
                int offset2 = bounds2.getOffset(this, childAt, absoluteAlignment2, measuredHeight + margin4, false);
                int sizeInCell = absoluteAlignment.getSizeInCell(measuredWidth, i18 - i20);
                int sizeInCell2 = absoluteAlignment2.getSizeInCell(measuredHeight, i19 - margin4);
                int i21 = i14 + gravityOffset + offset;
                int i22 = getLayoutDirection() == 1 ? (((i5 - sizeInCell) - paddingRight) - margin3) - i21 : i7 + margin + i21;
                int i23 = i8 + i15 + gravityOffset2 + offset2 + margin2;
                if (sizeInCell != childAt.getMeasuredWidth() || sizeInCell2 != childAt.getMeasuredHeight()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(sizeInCell, 1073741824), View.MeasureSpec.makeMeasureSpec(sizeInCell2, 1073741824));
                }
                childAt.layout(i22, i23, sizeInCell + i22, sizeInCell2 + i23);
            }
            i12 = i6 + 1;
            gridLayout = this;
            paddingLeft = i7;
            paddingTop = i8;
            i9 = i5;
            z3 = z2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measure;
        int measure2;
        consistencyCheck();
        Axis axis = this.mVerticalAxis;
        Axis axis2 = this.mHorizontalAxis;
        if (axis2 != null && axis != null) {
            axis2.invalidateValues();
            axis.invalidateValues();
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingRight) + i), View.MeasureSpec.getMode(i));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingBottom) + i2), View.MeasureSpec.getMode(i2));
        measureChildrenWithMargins(makeMeasureSpec, makeMeasureSpec2, true);
        if (this.mOrientation == 0) {
            measure2 = axis2.getMeasure(makeMeasureSpec);
            measureChildrenWithMargins(makeMeasureSpec, makeMeasureSpec2, false);
            measure = axis.getMeasure(makeMeasureSpec2);
        } else {
            measure = axis.getMeasure(makeMeasureSpec2);
            measureChildrenWithMargins(makeMeasureSpec, makeMeasureSpec2, false);
            measure2 = axis2.getMeasure(makeMeasureSpec);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(measure2 + paddingRight, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(measure + paddingBottom, getSuggestedMinimumHeight()), i2, 0));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        invalidateStructure();
    }

    public void setAlignmentMode(int i) {
        this.mAlignmentMode = i;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.mHorizontalAxis.setCount(i);
        invalidateStructure();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        Axis axis = this.mHorizontalAxis;
        axis.orderPreserved = z;
        axis.invalidateStructure();
        invalidateStructure();
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            invalidateStructure();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = NO_PRINTER;
        }
        this.mPrinter = printer;
    }

    public void setRowCount(int i) {
        this.mVerticalAxis.setCount(i);
        invalidateStructure();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        Axis axis = this.mVerticalAxis;
        axis.orderPreserved = z;
        axis.invalidateStructure();
        invalidateStructure();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z) {
        this.mUseDefaultMargins = z;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams)) {
            return false;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        checkLayoutParams(layoutParams2, true);
        checkLayoutParams(layoutParams2, false);
        return true;
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLayout(Context context) {
        this(context, null);
    }
}
