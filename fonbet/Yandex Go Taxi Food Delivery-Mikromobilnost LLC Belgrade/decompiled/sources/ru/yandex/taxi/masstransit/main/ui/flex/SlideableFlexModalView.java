package ru.yandex.taxi.masstransit.main.ui.flex;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.feedsdk.di.FeedSdkComponent;
import defpackage.bos0;
import defpackage.dmn;
import defpackage.e230;
import defpackage.g18;
import defpackage.gas0;
import defpackage.i3y;
import defpackage.l7s0;
import defpackage.mmp0;
import defpackage.nch0;
import defpackage.pey;
import defpackage.pns0;
import defpackage.quq0;
import defpackage.t1w;
import defpackage.uqq;
import defpackage.vng;
import defpackage.w130;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000f*\u00018\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001d\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001d\u0010\nJ\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0015¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010\u0017J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\"H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\"H\u0002¢\u0006\u0004\b)\u0010(J\u0017\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010,J\u001b\u00100\u001a\u00020/*\u00020\"2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0018\u00103\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001e\u0010C\u001a\u0004\u0018\u00010>8$@$X¤\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010H\u001a\u0004\u0018\u00010\b8$@$X¤\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010K\u001a\u0004\u0018\u00010\b8$@$X¤\u000e¢\u0006\f\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR\u0014\u0010L\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\r¨\u0006M"}, d2 = {"Lru/yandex/taxi/masstransit/main/ui/flex/SlideableFlexModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Lcom/yandex/feedsdk/di/FeedSdkComponent;", "feedSdk", "<init>", "(Landroid/content/Context;Lcom/yandex/feedsdk/di/FeedSdkComponent;)V", "", "flexContentHeightPx", "()I", "", "shouldUseFullHeightExpandedGeometry", "()Z", "Lt1w;", "insets", "Lzy11;", "applyFlexWindowInsets", "(Lt1w;)V", "Le230;", "insetsType", "()Le230;", "onAttachedToWindow", "()V", "invalidateFlexVisibleBounds", "invalidateFlexVisibleBoundsAfterLayout", "onDetachedFromWindow", "onBackPressed", "canDragToExpandFromAnchored", "getMaxAnchoredHeight", "rootHeight", "contentHeight", "computeExpandedMinOffset", "(II)I", "Landroidx/recyclerview/widget/RecyclerView;", "flexRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "onContentUpdated", "recycler", "updateFlexContentGeometry", "(Landroidx/recyclerview/widget/RecyclerView;)V", "updateMinOffset", "bottomInset", "anchorHeight", "(I)I", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChangeListener", "Lg18;", "listenSizeCancellable", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View$OnLayoutChangeListener;)Lg18;", "Lcom/yandex/feedsdk/di/FeedSdkComponent;", "recyclerSizeCancellable", "Lg18;", "Ljava/lang/Runnable;", "invalidateVisibleBoundsRunnable", "Ljava/lang/Runnable;", "bos0", "documentTracker$delegate", "Li3y;", "getDocumentTracker", "()Lbos0;", "documentTracker", "", "getMaxHeightToScreenRatio", "()Ljava/lang/Float;", "setMaxHeightToScreenRatio", "(Ljava/lang/Float;)V", "maxHeightToScreenRatio", "getMinHeight", "()Ljava/lang/Integer;", "setMinHeight", "(Ljava/lang/Integer;)V", "minHeight", "getMinHiddenContentHeight", "setMinHiddenContentHeight", "minHiddenContentHeight", "isExpandedState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SlideableFlexModalView extends SlideableModalView {
    public static final int $stable = 8;

    /* renamed from: documentTracker$delegate, reason: from kotlin metadata */
    private final i3y documentTracker;
    private final FeedSdkComponent feedSdk;
    private final Runnable invalidateVisibleBoundsRunnable;
    private g18 recyclerSizeCancellable;

    public SlideableFlexModalView(Context context, FeedSdkComponent feedSdkComponent) {
        super(context);
        this.feedSdk = feedSdkComponent;
        this.invalidateVisibleBoundsRunnable = new mmp0(24, this);
        this.documentTracker = a.b(LazyThreadSafetyMode.NONE, new gas0(6, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r0 < (r2.intValue() + r5.intValue())) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int anchorHeight(int bottomInset) {
        RecyclerView flexRecyclerView = flexRecyclerView();
        int height = (flexRecyclerView != null ? flexRecyclerView.getHeight() : 0) + bottomInset;
        int height2 = getContent().getHeight();
        Integer minHeight = getMinHeight();
        Integer valueOf = minHeight != null ? Integer.valueOf(minHeight.intValue() + bottomInset) : null;
        Float maxHeightToScreenRatio = getMaxHeightToScreenRatio();
        Integer valueOf2 = maxHeightToScreenRatio != null ? Integer.valueOf((int) ((maxHeightToScreenRatio.floatValue() * height2) + bottomInset)) : null;
        Integer minHiddenContentHeight = getMinHiddenContentHeight();
        if ((valueOf == null || height > valueOf.intValue()) && ((minHiddenContentHeight == null || height > minHiddenContentHeight.intValue()) && (valueOf2 == null || height > valueOf2.intValue()))) {
            if (minHiddenContentHeight != null && valueOf != null) {
            }
            if (valueOf2 != null) {
                return Math.min(height, valueOf2.intValue());
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bos0 documentTracker_delegate$lambda$0(SlideableFlexModalView slideableFlexModalView) {
        return new bos0(slideableFlexModalView);
    }

    private final bos0 getDocumentTracker() {
        return (bos0) this.documentTracker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(SlideableFlexModalView slideableFlexModalView, t1w t1wVar) {
        slideableFlexModalView.applyFlexWindowInsets(t1wVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidateVisibleBoundsRunnable$lambda$0(SlideableFlexModalView slideableFlexModalView) {
        if (slideableFlexModalView.isAttachedToWindow()) {
            slideableFlexModalView.invalidateFlexVisibleBounds();
        }
    }

    private final boolean isExpandedState() {
        int i = getBottomSheetBehavior().E;
        return i == 3 || i == 7;
    }

    private final g18 listenSizeCancellable(RecyclerView recyclerView, View.OnLayoutChangeListener onLayoutChangeListener) {
        recyclerView.addOnLayoutChangeListener(onLayoutChangeListener);
        return new pns0(recyclerView, onLayoutChangeListener, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onContentUpdated() {
        RecyclerView flexRecyclerView = flexRecyclerView();
        if (flexRecyclerView == null) {
            return;
        }
        g18 g18Var = this.recyclerSizeCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.recyclerSizeCancellable = null;
        flexRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        getBottomSheetBehavior().L(flexRecyclerView);
        this.recyclerSizeCancellable = listenSizeCancellable(flexRecyclerView, new dmn(3, this, flexRecyclerView));
        flexRecyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView$onContentUpdated$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                RecyclerView flexRecyclerView2 = SlideableFlexModalView.this.flexRecyclerView();
                if (flexRecyclerView2 != null) {
                    SlideableFlexModalView.this.updateFlexContentGeometry(flexRecyclerView2);
                }
            }
        });
        flexRecyclerView.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onContentUpdated$lambda$0(SlideableFlexModalView slideableFlexModalView, RecyclerView recyclerView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i8 - i6 != i4 - i2) {
            slideableFlexModalView.updateFlexContentGeometry(recyclerView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFlexContentGeometry(RecyclerView recycler) {
        setBehaviorAnchorHeight(Integer.valueOf(getMaxAnchoredHeight()));
        updateMinOffset(recycler);
        invalidateFlexVisibleBoundsAfterLayout();
    }

    private final void updateMinOffset(RecyclerView recycler) {
        int height = recycler.getHeight() + getCurrentInsets().d;
        getBottomSheetBehavior().K(computeExpandedMinOffset(getContent().getHeight(), height), true);
    }

    public final void applyFlexWindowInsets(t1w insets) {
        setBehaviorAnchorHeight(Integer.valueOf(anchorHeight(insets.g)));
        View cardContentView = getCardContentView();
        cardContentView.setPadding(cardContentView.getPaddingLeft(), cardContentView.getPaddingTop(), cardContentView.getPaddingRight(), insets.g);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    public int computeExpandedMinOffset(int rootHeight, int contentHeight) {
        int i = rootHeight - contentHeight;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final int flexContentHeightPx() {
        RecyclerView flexRecyclerView = flexRecyclerView();
        return (flexRecyclerView != null ? flexRecyclerView.getHeight() : 0) + getCurrentInsets().d;
    }

    public final RecyclerView flexRecyclerView() {
        return (RecyclerView) getCardContentView().findViewById(nch0.flexsdk_recycler_view_id);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getMaxAnchoredHeight() {
        return anchorHeight(getCurrentInsets().g);
    }

    public abstract Float getMaxHeightToScreenRatio();

    public abstract Integer getMinHeight();

    public abstract Integer getMinHiddenContentHeight();

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new quq0(14, this));
    }

    public final void invalidateFlexVisibleBounds() {
        this.feedSdk.getEngine().n();
    }

    public final void invalidateFlexVisibleBoundsAfterLayout() {
        removeCallbacks(this.invalidateVisibleBoundsRunnable);
        post(this.invalidateVisibleBoundsRunnable);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.feedSdk.getEngine().b(getDocumentTracker());
        pey o = vng.o(getCardContentView());
        if (o != null) {
            View cardContentView = getCardContentView();
            ViewGroup viewGroup = cardContentView instanceof ViewGroup ? (ViewGroup) cardContentView : null;
            if (viewGroup != null) {
                this.feedSdk.getEngine().g(viewGroup, o);
            }
        }
        setSlideListener(new l7s0(this));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        RecyclerView flexRecyclerView = flexRecyclerView();
        if (flexRecyclerView == null) {
            super.onBackPressed();
            return;
        }
        boolean canScrollVertically = flexRecyclerView.canScrollVertically(-1);
        boolean z = true;
        boolean canScrollVertically2 = flexRecyclerView.canScrollVertically(1);
        if (!canScrollVertically && !canScrollVertically2) {
            z = false;
        }
        if (isExpandedState() && canScrollVertically) {
            uqq.a(this.feedSdk.getEngine());
        } else if (isExpandedState() && z) {
            getBottomSheetBehavior().O(6);
        } else {
            super.onBackPressed();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.invalidateVisibleBoundsRunnable);
        super.onDetachedFromWindow();
        flex.engine.a engine = this.feedSdk.getEngine();
        ((ArrayList) engine.P.c).remove(getDocumentTracker());
        this.feedSdk.getEngine().j();
        g18 g18Var = this.recyclerSizeCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.recyclerSizeCancellable = null;
        setSlideListener(null);
    }

    public abstract void setMaxHeightToScreenRatio(Float f);

    public abstract void setMinHeight(Integer num);

    public abstract void setMinHiddenContentHeight(Integer num);

    public final boolean shouldUseFullHeightExpandedGeometry() {
        return getMaxAnchoredHeight() != flexContentHeightPx();
    }
}
