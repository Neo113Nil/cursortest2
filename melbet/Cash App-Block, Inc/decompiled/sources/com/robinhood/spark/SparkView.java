package com.robinhood.spark;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.compose.material.pullrefresh.ArrowValues;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.content.res.CamColor;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.libraries.places.internal.zzbsy;
import com.google.mlkit.vision.common.zzb;
import com.miteksystems.misnap.camera.a.b;
import com.robinhood.spark.SparkPath;
import com.robinhood.spark.animation.MorphSparkAnimator;
import com.robinhood.spark.animation.SparkAnimator;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.views.DataMissing;
import com.squareup.cash.portfolio.graphs.views.Gap;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphAdapter;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphPathType;
import com.squareup.cash.portfolio.graphs.views.Loading;
import com.squareup.cash.portfolio.graphs.views.Normal;
import com.squareup.cash.portfolio.graphs.views.NormalGray;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.SetsKt__SetsKt;

/* loaded from: classes4.dex */
public class SparkView extends View {
    public static final /* synthetic */ int $r8$clinit = 0;
    public SparkAdapter adapter;
    public Paint baseLinePaint;
    public final Path baseLinePath;
    public RectF contentClip;
    public final RectF contentRect;
    public final AnonymousClass2 dataSetObserver;
    public final HashMap defaultEventPaints;
    public final HashMap defaultFillPaints;
    public final HashMap defaultLinePaints;
    public float eventDotRadius;
    public SparkEventPaths eventPaths;
    public final HashMap eventXPoints;
    public int fillType;
    public float lastScrubbedX;
    public float legacyLineWidth;
    public float maxLineWidth;
    public ValueAnimator pathAnimator;
    public SparkPaths renderPaths;
    public CamColor scaleHelper;
    public boolean scrubEnabled;
    public ScrubGestureDetector scrubGestureDetector;
    public Float scrubLine;
    public final HashMap scrubLinePaints;
    public final Path scrubLinePath;
    public InvestingGraphPathType scrubLinePathType;
    public OnScrubListener scrubListener;
    public final HashMap scrubbedEventPaints;
    public final HashMap scrubbedFillPaints;
    public final HashMap scrubbedLinePaints;
    public SparkAnimator sparkAnimator;
    public final SparkPaths sparkPaths;
    public final HashMap unscrubbedEventPaints;
    public final HashMap unscrubbedFillPaints;
    public final HashMap unscrubbedLinePaints;
    public final ArrayList xPoints;

    /* renamed from: com.robinhood.spark.SparkView$2, reason: invalid class name */
    public final class AnonymousClass2 extends DataSetObserver {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass2(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        /* JADX WARN: Removed duplicated region for block: B:77:0x02e3  */
        @Override // android.database.DataSetObserver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onChanged() {
            ValueAnimator valueAnimator;
            HashMap hashMap;
            PointF pointF;
            PointF pointF2;
            int i = this.$r8$classId;
            boolean z = true;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    super.onChanged();
                    SparkView sparkView = (SparkView) obj;
                    int i2 = SparkView.$r8$clinit;
                    sparkView.populatePath();
                    if (sparkView.sparkAnimator != null) {
                        ValueAnimator valueAnimator2 = sparkView.pathAnimator;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        SparkAnimator sparkAnimator = sparkView.sparkAnimator;
                        if (sparkAnimator != null) {
                            final MorphSparkAnimator morphSparkAnimator = (MorphSparkAnimator) sparkAnimator;
                            ValueAnimator valueAnimator3 = morphSparkAnimator.animator;
                            SparkPaths sparkPaths = new SparkPaths(sparkView.sparkPaths);
                            final HashMap hashMap2 = new HashMap();
                            Iterator it = sparkPaths.paths.values().iterator();
                            while (it.hasNext()) {
                                for (SparkPath.SparkPathSegment sparkPathSegment : ((SparkPath) it.next()).segments) {
                                    LinkedList linkedList = sparkPathSegment.xPoints;
                                    if (!linkedList.isEmpty()) {
                                        ArrayList arrayList = new ArrayList(linkedList.size());
                                        for (int i3 = 0; i3 < linkedList.size(); i3++) {
                                            arrayList.add(new PointF(((Float) linkedList.get(i3)).floatValue(), ((Float) sparkPathSegment.yPoints.get(i3)).floatValue()));
                                        }
                                        hashMap2.put(sparkPathSegment, arrayList);
                                    }
                                }
                            }
                            if (morphSparkAnimator.animate) {
                                if (!hashMap2.isEmpty()) {
                                    if (hashMap2.keySet().equals(morphSparkAnimator.oldPointsBySegment.keySet())) {
                                        HashMap hashMap3 = new HashMap();
                                        Iterator it2 = hashMap2.entrySet().iterator();
                                        while (it2.hasNext()) {
                                            Map.Entry entry = (Map.Entry) it2.next();
                                            SparkPath.SparkPathSegment sparkPathSegment2 = (SparkPath.SparkPathSegment) entry.getKey();
                                            List list = (List) entry.getValue();
                                            List list2 = (List) morphSparkAnimator.oldPointsBySegment.get(sparkPathSegment2);
                                            int i4 = 0;
                                            while (i4 < list.size()) {
                                                float f = (list2 == null || list2.size() <= i4) ? RecyclerView.DECELERATION_RATE : ((PointF) list2.get(i4)).y;
                                                PointF pointF3 = (PointF) list.get(i4);
                                                hashMap3.put(new Pair(sparkPathSegment2, Integer.valueOf(i4)), new MorphSparkAnimator.PointMapping(new PointF(pointF3.x, f), new ArrowValues(RecyclerView.DECELERATION_RATE, pointF3.y - f)));
                                                i4++;
                                                it2 = it2;
                                            }
                                        }
                                        hashMap = hashMap3;
                                    } else {
                                        b.C0008b c0008b = new b.C0008b(3);
                                        Set<SparkPath.SparkPathSegment> keySet = morphSparkAnimator.oldPointsBySegment.keySet();
                                        TreeMap treeMap = new TreeMap(c0008b);
                                        for (SparkPath.SparkPathSegment sparkPathSegment3 : keySet) {
                                            for (int i5 = 0; i5 < sparkPathSegment3.xPoints.size(); i5++) {
                                                treeMap.put(new PointF(((Float) sparkPathSegment3.xPoints.get(i5)).floatValue(), ((Float) sparkPathSegment3.yPoints.get(i5)).floatValue()), sparkPathSegment3.pathType);
                                            }
                                        }
                                        HashMap hashMap4 = new HashMap();
                                        ArrayList arrayList2 = new ArrayList(treeMap.keySet());
                                        for (Map.Entry entry2 : hashMap2.entrySet()) {
                                            List list3 = (List) entry2.getValue();
                                            int i6 = 0;
                                            while (i6 < list3.size()) {
                                                PointF pointF4 = (PointF) list3.get(i6);
                                                int binarySearch = Collections.binarySearch(arrayList2, pointF4, c0008b);
                                                boolean z2 = z;
                                                Log.i("MorphSparkAnimator", "searchResult: " + binarySearch);
                                                if (binarySearch >= 0) {
                                                    pointF2 = (PointF) arrayList2.get(binarySearch);
                                                } else {
                                                    int i7 = (binarySearch + 1) * (-1);
                                                    if (i7 == arrayList2.size()) {
                                                        pointF2 = (PointF) arrayList2.get(i7 - 1);
                                                    } else {
                                                        PointF pointF5 = (PointF) arrayList2.get(i7);
                                                        if (i7 == arrayList2.size() - 1) {
                                                            pointF = pointF5;
                                                        } else {
                                                            PointF pointF6 = (PointF) arrayList2.get(i7 + 1);
                                                            pointF = pointF5;
                                                            if (c0008b.compare(pointF4, pointF5) > c0008b.compare(pointF4, pointF6)) {
                                                                pointF2 = pointF6;
                                                            }
                                                        }
                                                        pointF2 = pointF;
                                                    }
                                                }
                                                hashMap4.put(new Pair(entry2.getKey(), Integer.valueOf(i6)), new MorphSparkAnimator.PointMapping(pointF2, new ArrowValues(pointF4.x - pointF2.x, pointF4.y - pointF2.y)));
                                                i6++;
                                                z = z2;
                                                c0008b = c0008b;
                                                sparkView = sparkView;
                                                sparkPaths = sparkPaths;
                                            }
                                        }
                                        hashMap = hashMap4;
                                    }
                                    SparkView sparkView2 = sparkView;
                                    SparkPaths sparkPaths2 = sparkPaths;
                                    LinkedList<SparkEventPath> linkedList2 = sparkView2.getEventPaths().paths;
                                    final HashMap hashMap5 = new HashMap(linkedList2.size());
                                    HashMap hashMap6 = new HashMap();
                                    for (SparkEventPath sparkEventPath : linkedList2) {
                                        HashMap hashMap7 = morphSparkAnimator.oldYPointsByEvent;
                                        int i8 = sparkEventPath.index;
                                        float f2 = sparkEventPath.y;
                                        Float f3 = (Float) hashMap7.get(Integer.valueOf(i8));
                                        float floatValue = f3 != null ? f3.floatValue() : f2;
                                        hashMap6.put(sparkEventPath, new MorphSparkAnimator.PointMapping(new PointF(sparkEventPath.x, floatValue), new ArrowValues(RecyclerView.DECELERATION_RATE, f2 - floatValue)));
                                        hashMap5.put(Integer.valueOf(sparkEventPath.index), Float.valueOf(f2));
                                    }
                                    sparkView = sparkView2;
                                    valueAnimator3.addUpdateListener(new MorphSparkAnimator.PathAnimator(sparkView, sparkPaths2, hashMap2, hashMap6, hashMap));
                                    valueAnimator3.addListener(new AnimatorListenerAdapter() { // from class: com.robinhood.spark.animation.MorphSparkAnimator.1
                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public final void onAnimationEnd(Animator animator) {
                                            MorphSparkAnimator morphSparkAnimator2 = MorphSparkAnimator.this;
                                            morphSparkAnimator2.animator.removeAllUpdateListeners();
                                            morphSparkAnimator2.oldPointsBySegment.clear();
                                            morphSparkAnimator2.oldPointsBySegment = hashMap2;
                                            morphSparkAnimator2.oldYPointsByEvent.clear();
                                            morphSparkAnimator2.oldYPointsByEvent = hashMap5;
                                        }
                                    });
                                    valueAnimator = valueAnimator3;
                                    sparkView.pathAnimator = valueAnimator;
                                    if (valueAnimator == null) {
                                        valueAnimator.start();
                                        break;
                                    }
                                }
                            } else {
                                morphSparkAnimator.oldPointsBySegment = hashMap2;
                            }
                        }
                        valueAnimator = null;
                        sparkView.pathAnimator = valueAnimator;
                        if (valueAnimator == null) {
                        }
                    }
                    break;
                case 1:
                    ListPopupWindow listPopupWindow = (ListPopupWindow) obj;
                    if (listPopupWindow.mPopup.isShowing()) {
                        listPopupWindow.show();
                        break;
                    }
                    break;
                default:
                    CursorAdapter cursorAdapter = (CursorAdapter) obj;
                    cursorAdapter.mDataValid = true;
                    cursorAdapter.notifyDataSetChanged();
                    break;
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    super.onInvalidated();
                    SparkView sparkView = (SparkView) obj;
                    int i2 = SparkView.$r8$clinit;
                    sparkView.scaleHelper = null;
                    sparkView.sparkPaths.reset();
                    sparkView.renderPaths.reset();
                    sparkView.baseLinePath.reset();
                    sparkView.eventPaths.reset();
                    sparkView.invalidate();
                    break;
                case 1:
                    ((ListPopupWindow) obj).dismiss();
                    break;
                default:
                    CursorAdapter cursorAdapter = (CursorAdapter) obj;
                    cursorAdapter.mDataValid = false;
                    cursorAdapter.notifyDataSetInvalidated();
                    break;
            }
        }
    }

    public interface OnScrubListener {
    }

    public SparkView(Context context) {
        super(context);
        this.fillType = 0;
        this.sparkPaths = new SparkPaths();
        this.renderPaths = new SparkPaths();
        this.baseLinePath = new Path();
        this.scrubLinePath = new Path();
        this.scrubLinePathType = null;
        this.eventPaths = new SparkEventPaths();
        this.defaultLinePaints = new HashMap();
        this.scrubbedLinePaints = new HashMap();
        this.unscrubbedLinePaints = new HashMap();
        this.defaultFillPaints = new HashMap();
        this.scrubbedFillPaints = new HashMap();
        this.unscrubbedFillPaints = new HashMap();
        this.defaultEventPaints = new HashMap();
        this.scrubbedEventPaints = new HashMap();
        this.unscrubbedEventPaints = new HashMap();
        this.scrubLinePaints = new HashMap();
        this.baseLinePaint = new Paint(1);
        this.contentRect = new RectF();
        this.contentClip = null;
        this.xPoints = new ArrayList();
        this.eventXPoints = new HashMap();
        this.lastScrubbedX = -1.0f;
        this.dataSetObserver = new AnonymousClass2(this, 0);
        init(context, null, R.attr.spark_SparkViewStyle);
    }

    public float distanceToSnap() {
        return 20.0f;
    }

    public final SparkEventPaths getEventPaths() {
        SparkEventPaths sparkEventPaths = this.eventPaths;
        SparkEventPaths sparkEventPaths2 = new SparkEventPaths();
        sparkEventPaths2.paths = new LinkedList();
        Iterator it = sparkEventPaths.paths.iterator();
        while (it.hasNext()) {
            sparkEventPaths2.paths.add(new SparkEventPath((SparkEventPath) it.next()));
        }
        return sparkEventPaths2;
    }

    public final Float getFillEdge() {
        int i = this.fillType;
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            return Float.valueOf(getPaddingTop());
        }
        if (i == 2) {
            return Float.valueOf(getHeight() - getPaddingBottom());
        }
        if (i == 3) {
            CamColor camColor = this.scaleHelper;
            return Float.valueOf(Math.min((camColor.mChroma - (RecyclerView.DECELERATION_RATE * camColor.mJstar)) + camColor.mBstar, getHeight() - getPaddingBottom()));
        }
        Locale locale = Locale.US;
        a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unknown fill-type: "));
        return null;
    }

    public final void init(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SparkView, i, R.style.spark_SparkView);
        this.legacyLineWidth = obtainStyledAttributes.getDimension(1, RecyclerView.DECELERATION_RATE);
        this.scrubEnabled = obtainStyledAttributes.getBoolean(2, true);
        this.eventDotRadius = obtainStyledAttributes.getDimension(0, 2.0f);
        obtainStyledAttributes.recycle();
        ScrubGestureDetector scrubGestureDetector = new ScrubGestureDetector(this, new Handler(), ViewConfiguration.get(context).getScaledTouchSlop());
        this.scrubGestureDetector = scrubGestureDetector;
        scrubGestureDetector.enabled = this.scrubEnabled;
        setOnTouchListener(scrubGestureDetector);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.drawPath(this.baseLinePath, this.baseLinePaint);
        canvas.restore();
        RectF rectF = this.contentClip;
        RectF rectF2 = this.contentRect;
        if (rectF == null) {
            rectF = rectF2;
        }
        InvestingGraphPathType investingGraphPathType = this.scrubLinePathType;
        if (investingGraphPathType != null) {
            canvas.drawPath(this.scrubLinePath, (Paint) this.scrubLinePaints.get(investingGraphPathType));
        }
        canvas.clipRect(rectF);
        for (InvestingGraphPathType investingGraphPathType2 : this.renderPaths.paths.keySet()) {
            for (SparkPath.SparkPathSegment sparkPathSegment : ((SparkPath) this.renderPaths.paths.get(investingGraphPathType2)).segments) {
                if (this.scrubLine != null) {
                    canvas.save();
                    canvas.clipRect(rectF2.left, rectF2.top, this.scrubLine.floatValue() - 1.0f, rectF2.bottom);
                    canvas.drawPath(sparkPathSegment, (Paint) this.scrubbedLinePaints.get(investingGraphPathType2));
                    if (this.fillType != 0) {
                        canvas.drawPath(sparkPathSegment, (Paint) this.scrubbedFillPaints.get(investingGraphPathType2));
                    }
                    canvas.restore();
                    canvas.save();
                    canvas.clipRect(this.scrubLine.floatValue() + 1.0f, rectF2.top, rectF2.right, rectF2.bottom);
                    canvas.drawPath(sparkPathSegment, (Paint) this.unscrubbedLinePaints.get(investingGraphPathType2));
                    if (this.fillType != 0) {
                        canvas.drawPath(sparkPathSegment, (Paint) this.unscrubbedFillPaints.get(investingGraphPathType2));
                    }
                    canvas.restore();
                } else {
                    canvas.drawPath(sparkPathSegment, (Paint) this.defaultLinePaints.get(investingGraphPathType2));
                    if (this.fillType != 0) {
                        canvas.drawPath(sparkPathSegment, (Paint) this.defaultFillPaints.get(investingGraphPathType2));
                    }
                }
            }
        }
        for (InvestingGraphPathType investingGraphPathType3 : this.renderPaths.paths.keySet()) {
            Float f = this.scrubLine;
            SparkEventPaths sparkEventPaths = this.eventPaths;
            if (f != null) {
                for (SparkEventPath sparkEventPath : sparkEventPaths.paths) {
                    if (sparkEventPath.pathType == investingGraphPathType3) {
                        float floatValue = this.scrubLine.floatValue();
                        float f2 = sparkEventPath.x;
                        Path path = sparkEventPath.path;
                        if (floatValue < f2) {
                            canvas.drawPath(path, (Paint) this.unscrubbedEventPaints.get(investingGraphPathType3));
                        } else {
                            canvas.drawPath(path, (Paint) this.scrubbedEventPaints.get(investingGraphPathType3));
                        }
                    }
                }
            } else {
                for (SparkEventPath sparkEventPath2 : sparkEventPaths.paths) {
                    if (sparkEventPath2.pathType == investingGraphPathType3) {
                        canvas.drawPath(sparkEventPath2.path, (Paint) this.defaultEventPaints.get(investingGraphPathType3));
                    }
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v9 int, still in use, count: 2, list:
          (r5v9 int) from 0x0097: INVOKE (r0v5 java.util.ArrayList), (r5v9 int) INTERFACE call: java.util.List.get(int):java.lang.Object A[MD:(int):E (c), WRAPPED]
          (r5v9 int) from 0x00a9: PHI (r5v11 int) = (r5v7 int), (r5v8 int), (r5v9 int), (r5v10 int), (r5v14 int) binds: [B:23:0x0079, B:31:0x00a8, B:30:0x00a5, B:28:0x0087, B:18:0x0066] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public void onScrubbed(float r4, float r5) {
        /*
            r3 = this;
            java.util.HashMap r5 = r3.eventXPoints
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        La:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            float r2 = r3.distanceToSnap()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto La
            com.robinhood.spark.SparkAdapter r1 = r3.adapter
            if (r1 == 0) goto La
            java.lang.Object r5 = r0.getKey()
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            android.util.Pair r5 = new android.util.Pair
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r5.<init>(r1, r0)
            goto L49
        L48:
            r5 = 0
        L49:
            if (r5 == 0) goto L53
            java.lang.Object r4 = r5.second
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
        L53:
            com.robinhood.spark.SparkAdapter r0 = r3.adapter
            if (r0 == 0) goto Lb3
            com.squareup.cash.portfolio.graphs.views.InvestingGraphAdapter r0 = (com.squareup.cash.portfolio.graphs.views.InvestingGraphAdapter) r0
            java.util.List r0 = r0.getDisplayedData()
            int r0 = r0.size()
            if (r0 != 0) goto L64
            goto Lb3
        L64:
            if (r5 == 0) goto L6f
            java.lang.Object r5 = r5.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto La9
        L6f:
            java.lang.Float r5 = java.lang.Float.valueOf(r4)
            java.util.ArrayList r0 = r3.xPoints
            int r5 = java.util.Collections.binarySearch(r0, r5)
            if (r5 < 0) goto L7c
            goto La9
        L7c:
            int r1 = (-1) - r5
            if (r1 != 0) goto L81
            goto La8
        L81:
            int r2 = r0.size()
            if (r1 != r2) goto L8a
            int r5 = (-2) - r5
            goto La9
        L8a:
            java.lang.Object r2 = r0.get(r1)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            float r2 = r2 - r4
            int r5 = (-2) - r5
            java.lang.Object r0 = r0.get(r5)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r0 = r4 - r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto La8
            goto La9
        La8:
            r5 = r1
        La9:
            r3.scrubTo(r4, r5)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3.setScrubLine(r4)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.spark.SparkView.onScrubbed(float, float):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        updateContentRect();
        populatePath();
    }

    public final void populatePath() {
        Float f;
        if (this.adapter == null || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        int size = ((InvestingGraphAdapter) this.adapter).getDisplayedData().size();
        Path path = this.baseLinePath;
        SparkPaths sparkPaths = this.sparkPaths;
        if (size < 2) {
            this.scaleHelper = null;
            sparkPaths.reset();
            this.renderPaths.reset();
            path.reset();
            this.eventPaths.reset();
            invalidate();
            return;
        }
        this.scaleHelper = new CamColor(this.adapter, this.contentRect, Math.max(this.maxLineWidth, this.eventDotRadius * 2.0f), this.fillType != 0);
        ArrayList arrayList = this.xPoints;
        arrayList.clear();
        HashMap hashMap = this.eventXPoints;
        hashMap.clear();
        this.eventPaths.reset();
        sparkPaths.reset();
        InvestingGraphPathType investingGraphPathType = null;
        for (int i = 0; i < size; i++) {
            CamColor camColor = this.scaleHelper;
            float f2 = (((InvestingGraphContentModel.Point) ((InvestingGraphAdapter) this.adapter).getDisplayedData().get(i)).x * camColor.mJ) + camColor.mAstar;
            CamColor camColor2 = this.scaleHelper;
            float f3 = (camColor2.mChroma - (((InvestingGraphContentModel.Point) ((InvestingGraphAdapter) this.adapter).getDisplayedData().get(i)).y * camColor2.mJstar)) + camColor2.mBstar;
            arrayList.add(Float.valueOf(f2));
            InvestingGraphPathType pathType = this.adapter.getPathType(i);
            if (investingGraphPathType == null) {
                sparkPaths.startPathSegment(pathType, f2, f3);
                investingGraphPathType = pathType;
            }
            if (pathType.equals(investingGraphPathType)) {
                SparkPath sparkPath = (SparkPath) sparkPaths.paths.get(pathType);
                if (sparkPath == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Trying to add to path segment, but no such path exists");
                    return;
                }
                SparkPath.SparkPathSegment sparkPathSegment = sparkPath.currentSegment;
                if (sparkPathSegment == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("no segment to add to");
                    return;
                }
                sparkPathSegment.lineTo(f2, f3);
            } else {
                sparkPaths.endPathSegment(investingGraphPathType, getFillEdge(), super.getPaddingStart());
                sparkPaths.startPathSegment(pathType, f2, f3);
                investingGraphPathType = pathType;
            }
            InvestingGraphAdapter investingGraphAdapter = (InvestingGraphAdapter) this.adapter;
            if (investingGraphAdapter.isScrubbing && ((InvestingGraphContentModel.Point) investingGraphAdapter.getDisplayedData().get(i)).treatment == InvestingGraphContentModel.PointTreatment.DOT) {
                this.eventPaths.paths.add(new SparkEventPath(i, f2, f3, this.eventDotRadius, pathType));
                hashMap.put(Integer.valueOf(i), Float.valueOf(f2));
            }
        }
        sparkPaths.endPathSegment(investingGraphPathType, getFillEdge(), super.getPaddingStart());
        path.reset();
        SparkAdapter sparkAdapter = this.adapter;
        InvestingGraphAdapter investingGraphAdapter2 = (InvestingGraphAdapter) sparkAdapter;
        if (investingGraphAdapter2.isScrubbing) {
            InvestingGraphContentModel investingGraphContentModel = investingGraphAdapter2.content;
            InvestingGraphContentModel.Loaded loaded = investingGraphContentModel instanceof InvestingGraphContentModel.Loaded ? (InvestingGraphContentModel.Loaded) investingGraphContentModel : null;
            if ((loaded != null ? loaded.baselineY : null) != null) {
                CamColor camColor3 = this.scaleHelper;
                InvestingGraphContentModel investingGraphContentModel2 = ((InvestingGraphAdapter) sparkAdapter).content;
                InvestingGraphContentModel.Loaded loaded2 = investingGraphContentModel2 instanceof InvestingGraphContentModel.Loaded ? (InvestingGraphContentModel.Loaded) investingGraphContentModel2 : null;
                float floatValue = (camColor3.mChroma - (((loaded2 == null || (f = loaded2.baselineY) == null) ? 0.0f : f.floatValue()) * camColor3.mJstar)) + camColor3.mBstar;
                path.moveTo(RecyclerView.DECELERATION_RATE, floatValue);
                path.lineTo(getWidth(), floatValue);
            }
        }
        this.renderPaths.reset();
        this.renderPaths = new SparkPaths(sparkPaths);
        this.contentClip = null;
        SparkAnimator sparkAnimator = this.sparkAnimator;
        if (sparkAnimator != null) {
            MorphSparkAnimator morphSparkAnimator = (MorphSparkAnimator) sparkAnimator;
            if (morphSparkAnimator.oldPointsBySegment.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (InvestingGraphPathType investingGraphPathType2 : sparkPaths.paths.keySet()) {
                    SparkPath sparkPath2 = (SparkPath) sparkPaths.paths.get(investingGraphPathType2);
                    SparkPath sparkPath3 = new SparkPath(sparkPath2.pathType);
                    SparkPath.SparkPathSegment sparkPathSegment2 = null;
                    for (SparkPath.SparkPathSegment sparkPathSegment3 : sparkPath2.segments) {
                        SparkPath.SparkPathSegment sparkPathSegment4 = new SparkPath.SparkPathSegment(sparkPathSegment3);
                        sparkPath3.segments.add(sparkPathSegment4);
                        if (sparkPathSegment3.equals(sparkPath2.currentSegment)) {
                            sparkPathSegment2 = sparkPathSegment4;
                        }
                    }
                    sparkPath3.currentSegment = sparkPathSegment2;
                    hashMap2.put(investingGraphPathType2, sparkPath3);
                }
                Iterator it = hashMap2.values().iterator();
                while (it.hasNext()) {
                    for (SparkPath.SparkPathSegment sparkPathSegment5 : ((SparkPath) it.next()).segments) {
                        LinkedList linkedList = sparkPathSegment5.yPoints;
                        LinkedList linkedList2 = sparkPathSegment5.xPoints;
                        if (!linkedList.isEmpty()) {
                            ArrayList arrayList2 = new ArrayList(linkedList2.size());
                            for (int i2 = 0; i2 < linkedList2.size(); i2++) {
                                arrayList2.add(new PointF(((Float) linkedList2.get(i2)).floatValue(), ((Float) sparkPathSegment5.yPoints.get(i2)).floatValue()));
                            }
                            morphSparkAnimator.oldPointsBySegment.put(sparkPathSegment5, arrayList2);
                        }
                    }
                }
                if (morphSparkAnimator.oldYPointsByEvent.isEmpty()) {
                    for (SparkEventPath sparkEventPath : getEventPaths().paths) {
                        morphSparkAnimator.oldYPointsByEvent.put(Integer.valueOf(sparkEventPath.index), Float.valueOf(sparkEventPath.y));
                    }
                }
            }
        }
        invalidate();
    }

    public final void scrubTo(float f, int i) {
        if (this.scrubListener != null && this.lastScrubbedX != f) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.scrubLinePathType = this.adapter.getPathType(i);
            this.lastScrubbedX = f;
            ((zzb) this.scrubListener).onScrubbed((InvestingGraphContentModel.Point) ((InvestingGraphAdapter) this.adapter).getDisplayedData().get(i), Float.valueOf(f), this.scrubLinePathType);
        }
        setScrubLine(Float.valueOf(f));
    }

    public void setAdapter(SparkAdapter sparkAdapter) {
        SparkAdapter sparkAdapter2 = this.adapter;
        AnonymousClass2 anonymousClass2 = this.dataSetObserver;
        if (sparkAdapter2 != null) {
            sparkAdapter2.observable.unregisterObserver(anonymousClass2);
        }
        this.adapter = sparkAdapter;
        if (sparkAdapter != null) {
            sparkAdapter.observable.registerObserver(anonymousClass2);
        }
        updateStyling();
        populatePath();
    }

    public void setAnimationPath(SparkPaths sparkPaths, SparkEventPaths sparkEventPaths) {
        this.renderPaths.reset();
        this.renderPaths = new SparkPaths(sparkPaths);
        this.eventPaths.reset();
        this.eventPaths = sparkEventPaths;
        invalidate();
    }

    public void setContentClip(RectF rectF) {
        this.contentClip = rectF;
        invalidate();
    }

    public void setEventDotRadius(float f) {
        this.eventDotRadius = f;
        invalidate();
    }

    public void setFillType(int i) {
        if (this.fillType != i) {
            this.fillType = i;
            populatePath();
        }
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        updateContentRect();
        populatePath();
    }

    public void setScrubEnabled(boolean z) {
        this.scrubEnabled = z;
        this.scrubGestureDetector.enabled = z;
        if (!z && this.scrubLine != null) {
            OnScrubListener onScrubListener = this.scrubListener;
            if (onScrubListener != null) {
                ((zzb) onScrubListener).onScrubbed(null, null, null);
            }
            this.lastScrubbedX = -1.0f;
            setScrubLine(null);
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r5 > r2) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setScrubLine(Float f) {
        Path path = this.scrubLinePath;
        path.reset();
        if (f == null) {
            this.scrubLine = null;
        } else {
            float floatValue = f.floatValue();
            float strokeWidth = ((Paint) this.scrubLinePaints.get(this.scrubLinePathType)).getStrokeWidth() / 2.0f;
            float paddingStart = super.getPaddingStart() + strokeWidth;
            if (floatValue >= paddingStart) {
                paddingStart = (getWidth() - super.getPaddingEnd()) - strokeWidth;
            }
            floatValue = paddingStart;
            this.scrubLine = Float.valueOf(floatValue);
            path.moveTo(floatValue, getPaddingTop());
            path.lineTo(this.scrubLine.floatValue(), getHeight() - getPaddingBottom());
        }
        invalidate();
    }

    public void setScrubListener(OnScrubListener onScrubListener) {
        this.scrubListener = onScrubListener;
    }

    public void setSparkAnimator(SparkAnimator sparkAnimator) {
        this.sparkAnimator = sparkAnimator;
    }

    public final void updateContentRect() {
        this.contentRect.set(super.getPaddingStart(), getPaddingTop(), getWidth() - super.getPaddingEnd(), getHeight() - getPaddingBottom());
    }

    public final void updateStyling() {
        if (this.adapter == null) {
            return;
        }
        HashMap hashMap = this.unscrubbedLinePaints;
        hashMap.clear();
        HashMap hashMap2 = this.defaultLinePaints;
        hashMap2.clear();
        HashMap hashMap3 = this.scrubbedLinePaints;
        hashMap3.clear();
        HashMap hashMap4 = this.defaultEventPaints;
        hashMap4.clear();
        HashMap hashMap5 = this.scrubbedEventPaints;
        hashMap5.clear();
        HashMap hashMap6 = this.unscrubbedEventPaints;
        hashMap6.clear();
        HashMap hashMap7 = this.defaultFillPaints;
        hashMap7.clear();
        HashMap hashMap8 = this.scrubbedFillPaints;
        hashMap8.clear();
        HashMap hashMap9 = this.unscrubbedFillPaints;
        hashMap9.clear();
        InvestingGraphAdapter investingGraphAdapter = (InvestingGraphAdapter) this.adapter;
        zzbsy zzbsyVar = investingGraphAdapter.paintProvider;
        this.maxLineWidth = this.legacyLineWidth;
        investingGraphAdapter.getClass();
        int i = 1;
        NormalGray normalGray = NormalGray.INSTANCE;
        Iterator it = SetsKt__SetsKt.mutableSetOf(Normal.INSTANCE, normalGray, DataMissing.INSTANCE, Gap.INSTANCE, Loading.INSTANCE).iterator();
        while (it.hasNext()) {
            InvestingGraphPathType investingGraphPathType = (InvestingGraphPathType) it.next();
            Paint pathPaint = zzbsyVar.getPathPaint(getContext(), investingGraphPathType, i);
            Iterator it2 = it;
            this.maxLineWidth = Math.max(this.maxLineWidth, pathPaint.getStrokeWidth());
            hashMap2.put(investingGraphPathType, pathPaint);
            Paint pathPaint2 = zzbsyVar.getPathPaint(getContext(), investingGraphPathType, 2);
            this.maxLineWidth = Math.max(this.maxLineWidth, pathPaint2.getStrokeWidth());
            hashMap3.put(investingGraphPathType, pathPaint2);
            Paint pathPaint3 = zzbsyVar.getPathPaint(getContext(), investingGraphPathType, 3);
            this.maxLineWidth = Math.max(this.maxLineWidth, pathPaint3.getStrokeWidth());
            hashMap.put(investingGraphPathType, pathPaint3);
            Paint eventPaint = zzbsyVar.getEventPaint(getContext(), investingGraphPathType, 1);
            this.maxLineWidth = Math.max(this.maxLineWidth, eventPaint.getStrokeWidth());
            hashMap4.put(investingGraphPathType, eventPaint);
            Paint eventPaint2 = zzbsyVar.getEventPaint(getContext(), investingGraphPathType, 2);
            this.maxLineWidth = Math.max(this.maxLineWidth, eventPaint2.getStrokeWidth());
            hashMap5.put(investingGraphPathType, eventPaint2);
            Paint eventPaint3 = zzbsyVar.getEventPaint(getContext(), investingGraphPathType, 3);
            this.maxLineWidth = Math.max(this.maxLineWidth, eventPaint3.getStrokeWidth());
            hashMap6.put(investingGraphPathType, eventPaint3);
            hashMap7.put(investingGraphPathType, zzbsyVar.getPathFillPaint(getContext(), investingGraphPathType, 1));
            hashMap8.put(investingGraphPathType, zzbsyVar.getPathFillPaint(getContext(), investingGraphPathType, 2));
            hashMap9.put(investingGraphPathType, zzbsyVar.getPathFillPaint(getContext(), investingGraphPathType, 3));
            Context context = getContext();
            context.getClass();
            Paint paint = new Paint((Paint) zzbsyVar.zzd);
            HashMap hashMap10 = hashMap;
            paint.setStrokeWidth(context.getResources().getDimension(R.dimen.investing_graph_scrub_marker_width));
            HashMap hashMap11 = hashMap2;
            paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, RecyclerView.DECELERATION_RATE));
            paint.setColor(investingGraphPathType.equals(normalGray) ? context.getColor(R.color.investing_graph_line_color_gray) : ColorKt.m694toArgb8_81llA(ThemeHelpersKt.findThemeInfo(context).arcadeColors.semantic.text.standard));
            this.scrubLinePaints.put(investingGraphPathType, paint);
            hashMap2 = hashMap11;
            it = it2;
            hashMap = hashMap10;
            i = 1;
        }
        Context context2 = getContext();
        zzbsyVar.getClass();
        context2.getClass();
        Paint paint2 = new Paint((Paint) zzbsyVar.zze);
        paint2.setColor(-1710619);
        paint2.setStrokeWidth(1.0f);
        this.baseLinePaint = paint2;
        invalidate();
    }

    public SparkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.fillType = 0;
        this.sparkPaths = new SparkPaths();
        this.renderPaths = new SparkPaths();
        this.baseLinePath = new Path();
        this.scrubLinePath = new Path();
        this.scrubLinePathType = null;
        this.eventPaths = new SparkEventPaths();
        this.defaultLinePaints = new HashMap();
        this.scrubbedLinePaints = new HashMap();
        this.unscrubbedLinePaints = new HashMap();
        this.defaultFillPaints = new HashMap();
        this.scrubbedFillPaints = new HashMap();
        this.unscrubbedFillPaints = new HashMap();
        this.defaultEventPaints = new HashMap();
        this.scrubbedEventPaints = new HashMap();
        this.unscrubbedEventPaints = new HashMap();
        this.scrubLinePaints = new HashMap();
        this.baseLinePaint = new Paint(1);
        this.contentRect = new RectF();
        this.contentClip = null;
        this.xPoints = new ArrayList();
        this.eventXPoints = new HashMap();
        this.lastScrubbedX = -1.0f;
        this.dataSetObserver = new AnonymousClass2(this, 0);
        init(context, attributeSet, R.attr.spark_SparkViewStyle);
    }

    public SparkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fillType = 0;
        this.sparkPaths = new SparkPaths();
        this.renderPaths = new SparkPaths();
        this.baseLinePath = new Path();
        this.scrubLinePath = new Path();
        this.scrubLinePathType = null;
        this.eventPaths = new SparkEventPaths();
        this.defaultLinePaints = new HashMap();
        this.scrubbedLinePaints = new HashMap();
        this.unscrubbedLinePaints = new HashMap();
        this.defaultFillPaints = new HashMap();
        this.scrubbedFillPaints = new HashMap();
        this.unscrubbedFillPaints = new HashMap();
        this.defaultEventPaints = new HashMap();
        this.scrubbedEventPaints = new HashMap();
        this.unscrubbedEventPaints = new HashMap();
        this.scrubLinePaints = new HashMap();
        this.baseLinePaint = new Paint(1);
        this.contentRect = new RectF();
        this.contentClip = null;
        this.xPoints = new ArrayList();
        this.eventXPoints = new HashMap();
        this.lastScrubbedX = -1.0f;
        this.dataSetObserver = new AnonymousClass2(this, 0);
        init(context, attributeSet, i);
    }

    public SparkView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, R.style.spark_SparkView);
        this.fillType = 0;
        this.sparkPaths = new SparkPaths();
        this.renderPaths = new SparkPaths();
        this.baseLinePath = new Path();
        this.scrubLinePath = new Path();
        this.scrubLinePathType = null;
        this.eventPaths = new SparkEventPaths();
        this.defaultLinePaints = new HashMap();
        this.scrubbedLinePaints = new HashMap();
        this.unscrubbedLinePaints = new HashMap();
        this.defaultFillPaints = new HashMap();
        this.scrubbedFillPaints = new HashMap();
        this.unscrubbedFillPaints = new HashMap();
        this.defaultEventPaints = new HashMap();
        this.scrubbedEventPaints = new HashMap();
        this.unscrubbedEventPaints = new HashMap();
        this.scrubLinePaints = new HashMap();
        this.baseLinePaint = new Paint(1);
        this.contentRect = new RectF();
        this.contentClip = null;
        this.xPoints = new ArrayList();
        this.eventXPoints = new HashMap();
        this.lastScrubbedX = -1.0f;
        this.dataSetObserver = new AnonymousClass2(this, 0);
        init(context, attributeSet, i);
    }
}
