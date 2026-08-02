package ru.yandex.taxi.stories.presentation.story;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.kdh0;
import defpackage.kqu0;
import defpackage.m8t0;
import defpackage.mqg0;
import defpackage.nph0;
import defpackage.pph0;
import defpackage.q5z;
import defpackage.rp31;
import defpackage.s2u0;
import defpackage.xby;
import defpackage.xou0;
import defpackage.xpu0;
import defpackage.ypu0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.communications.api.dto.StoryWidgets;
import ru.yandex.taxi.design.DotsIndicatorComponent;
import ru.yandex.taxi.design.StoryProgressComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 :2\u00020\u0001:\u0002\u0015;B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u000eJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u001a¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00109¨\u0006<"}, d2 = {"Lru/yandex/taxi/stories/presentation/story/StoryTopView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lxou0;", "storyMediaInfo", "Lzy11;", "updateProgressView", "(Lxou0;)V", "Lru/yandex/taxi/communications/api/dto/StoryWidgets$b;", "buttonInfo", "", "hideCloseButton", "updateCloseButton", "(Lru/yandex/taxi/communications/api/dto/StoryWidgets$b;Z)V", "Lypu0;", "listener", "setListener", "(Lypu0;)V", "setData", "", "currentMediaProgressPercent", "setCurrentMediaProgressPercent", "(F)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "canInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "translationY", "", "duration", "translateContent", "(FJ)V", Constants.KEY_PAGE, "offsetPercent", "setPageScroll", "(IF)V", "pageScrollFinished", "()V", "Landroid/view/ViewGroup;", "content", "Landroid/view/ViewGroup;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Lru/yandex/taxi/design/StoryProgressComponent;", "progressView", "Lru/yandex/taxi/design/StoryProgressComponent;", "Lru/yandex/taxi/design/DotsIndicatorComponent;", "dotsIndicatorView", "Lru/yandex/taxi/design/DotsIndicatorComponent;", "Lypu0;", "Companion", "xpu0", "stories"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StoryTopView extends FrameLayout {
    public static final xpu0 Companion = new xpu0();
    private static final ypu0 EMPTY_LISTENER = new s2u0(3);
    private final ViewGroup content;
    private final DotsIndicatorComponent dotsIndicatorView;
    private ypu0 listener;
    private final StoryProgressComponent progressView;
    private final ToolbarComponent toolbar;

    public StoryTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ru.yandex.taxi.design.utils.c.q(this, pph0.taxi_communications_story_top_view, true);
        int i2 = kdh0.story_top_view;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.content = (ViewGroup) ((View) rp31.d(this, i2));
        ToolbarComponent toolbarComponent = (ToolbarComponent) ((View) rp31.d(this, kdh0.story_toolbar));
        this.toolbar = toolbarComponent;
        StoryProgressComponent storyProgressComponent = (StoryProgressComponent) ru.yandex.taxi.design.utils.c.q(toolbarComponent, nph0.fullscreen_progress_view, false);
        this.progressView = storyProgressComponent;
        DotsIndicatorComponent dotsIndicatorComponent = (DotsIndicatorComponent) LayoutInflater.from(toolbarComponent.getContext()).inflate(nph0.fullscreen_dots_indicator, (ViewGroup) toolbarComponent, false);
        this.dotsIndicatorView = dotsIndicatorComponent;
        this.listener = EMPTY_LISTENER;
        toolbarComponent.setStoryProgressComponent(storyProgressComponent).setDotsIndicatorComponent(dotsIndicatorComponent).invalidateComponent();
        setPageScroll(0, 0.0f);
        toolbarComponent.setCloseIconColor(-1);
        toolbarComponent.setOnCloseClickListener(new m8t0(24, this));
        toolbarComponent.setClickPassesThroughEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EMPTY_LISTENER$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(StoryTopView storyTopView) {
        storyTopView.listener.b();
    }

    private final void updateCloseButton(StoryWidgets.b buttonInfo, boolean hideCloseButton) {
        if (buttonInfo == null || hideCloseButton) {
            this.toolbar.disableCloseButton();
            return;
        }
        this.toolbar.enableCloseButton();
        ToolbarComponent toolbarComponent = this.toolbar;
        String str = buttonInfo.a;
        int i = -1;
        if (str != null && !evu0.J(str) && !cvu0.t(str, ShimmerDivHandler.NUMBER_SING, true)) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.charAt(0) != '#') {
                try {
                    i = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
                } catch (IllegalArgumentException unused) {
                }
            }
            try {
                i = Color.parseColor(upperCase);
            } catch (IllegalArgumentException e) {
                xby.d.k(e, "Parsing color error, color = ".concat(upperCase));
            }
        }
        toolbarComponent.setCloseIconColor(i);
    }

    private final void updateProgressView(xou0 storyMediaInfo) {
        ToolbarComponent toolbarComponent = this.toolbar;
        StoryMediaInfo$PagerMode storyMediaInfo$PagerMode = storyMediaInfo.k;
        int i = storyMediaInfo.h;
        int i2 = storyMediaInfo.g;
        toolbarComponent.setStoryProgressEnabled(storyMediaInfo$PagerMode == StoryMediaInfo$PagerMode.DASHES).setDotsIndicatorEnabled(storyMediaInfo.k == StoryMediaInfo$PagerMode.DOTS).invalidateComponent();
        kqu0 kqu0Var = storyMediaInfo.c.e;
        int R = q5z.R(getContext(), mqg0.story_progress, kqu0Var != null ? kqu0Var.a : null);
        int R2 = q5z.R(getContext(), mqg0.story_progress_filled, kqu0Var != null ? kqu0Var.b : null);
        this.dotsIndicatorView.setDotColors(R, R2);
        this.dotsIndicatorView.setDotsCount(i2);
        this.dotsIndicatorView.setPageScroll(i, 0.0f);
        this.progressView.setMediaCount(i2).setCurrentMedia(i).setCurrentMediaProgressPercent(0.0f).setProgressColor(R).setProgressColorFilled(R2).invalidateComponent();
    }

    public final boolean canInterceptTouchEvent(MotionEvent event) {
        return !this.toolbar.isPointInsideCloseButton((int) event.getRawX(), (int) event.getRawY());
    }

    public final void pageScrollFinished() {
        this.dotsIndicatorView.scrollFinished();
    }

    public final void setCurrentMediaProgressPercent(float currentMediaProgressPercent) {
        this.progressView.setCurrentMediaProgressPercent(currentMediaProgressPercent).invalidateComponent();
    }

    public final void setData(xou0 storyMediaInfo) {
        updateProgressView(storyMediaInfo);
        updateCloseButton(storyMediaInfo.c.b, storyMediaInfo.o);
    }

    public final void setListener(ypu0 listener) {
        this.listener = listener;
    }

    public final void setPageScroll(int page, float offsetPercent) {
        this.dotsIndicatorView.setPageScroll(page, offsetPercent);
    }

    public final void translateContent(float translationY, long duration) {
        this.content.animate().translationY(translationY).setDuration(duration);
    }

    public StoryTopView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public StoryTopView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ StoryTopView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
