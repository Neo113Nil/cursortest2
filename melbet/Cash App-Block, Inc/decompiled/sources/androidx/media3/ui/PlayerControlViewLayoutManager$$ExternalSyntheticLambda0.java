package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final /* synthetic */ class PlayerControlViewLayoutManager$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PlayerControlViewLayoutManager f$0;

    public /* synthetic */ PlayerControlViewLayoutManager$$ExternalSyntheticLambda0(PlayerControlViewLayoutManager playerControlViewLayoutManager, int i) {
        this.$r8$classId = i;
        this.f$0 = playerControlViewLayoutManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i = this.$r8$classId;
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.f$0;
        switch (i) {
            case 0:
                playerControlViewLayoutManager.showAllBars();
                break;
            case 1:
                View view = playerControlViewLayoutManager.timeBar;
                ViewGroup viewGroup = playerControlViewLayoutManager.minimalControls;
                if (viewGroup != null) {
                    viewGroup.setVisibility(playerControlViewLayoutManager.isMinimalMode ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = playerControlViewLayoutManager.playerControlView.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (playerControlViewLayoutManager.isMinimalMode) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof DefaultTimeBar) {
                        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                        Rect rect = defaultTimeBar.seekBounds;
                        ValueAnimator valueAnimator = defaultTimeBar.scrubberScalingAnimator;
                        if (playerControlViewLayoutManager.isMinimalMode) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            defaultTimeBar.scrubberPaddingDisabled = true;
                            defaultTimeBar.scrubberScale = RecyclerView.DECELERATION_RATE;
                            defaultTimeBar.invalidate(rect);
                        } else {
                            int i2 = playerControlViewLayoutManager.uxState;
                            if (i2 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                defaultTimeBar.scrubberPaddingDisabled = false;
                                defaultTimeBar.scrubberScale = RecyclerView.DECELERATION_RATE;
                                defaultTimeBar.invalidate(rect);
                            } else if (i2 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                defaultTimeBar.scrubberPaddingDisabled = false;
                                defaultTimeBar.scrubberScale = 1.0f;
                                defaultTimeBar.invalidate(rect);
                            }
                        }
                    }
                }
                Iterator it = playerControlViewLayoutManager.shownButtons.iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    view2.setVisibility((playerControlViewLayoutManager.isMinimalMode && PlayerControlViewLayoutManager.shouldHideInMinimalMode(view2)) ? 4 : 0);
                }
                break;
            case 2:
                ValueAnimator valueAnimator2 = playerControlViewLayoutManager.overflowHideAnimator;
                View view3 = playerControlViewLayoutManager.overflowShowButton;
                PlayerControlView playerControlView = playerControlViewLayoutManager.playerControlView;
                ViewGroup viewGroup2 = playerControlViewLayoutManager.extraControls;
                ViewGroup viewGroup3 = playerControlViewLayoutManager.basicControls;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (playerControlView.getWidth() - playerControlView.getPaddingLeft()) - playerControlView.getPaddingRight();
                    while (viewGroup2.getChildCount() > 1) {
                        int childCount = viewGroup2.getChildCount() - 2;
                        View childAt = viewGroup2.getChildAt(childCount);
                        viewGroup2.removeViewAt(childCount);
                        viewGroup3.addView(childAt, 0);
                    }
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    int widthWithMargins = PlayerControlViewLayoutManager.getWidthWithMargins(playerControlViewLayoutManager.timeView);
                    int childCount2 = viewGroup3.getChildCount() - 1;
                    for (int i3 = 0; i3 < childCount2; i3++) {
                        widthWithMargins += PlayerControlViewLayoutManager.getWidthWithMargins(viewGroup3.getChildAt(i3));
                    }
                    if (widthWithMargins <= width) {
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.extraControlsScrollView;
                        if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator2.isStarted()) {
                            playerControlViewLayoutManager.overflowShowAnimator.cancel();
                            valueAnimator2.start();
                            break;
                        }
                    } else {
                        if (view3 != null) {
                            view3.setVisibility(0);
                            widthWithMargins += PlayerControlViewLayoutManager.getWidthWithMargins(view3);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i4 = 0; i4 < childCount2; i4++) {
                            View childAt2 = viewGroup3.getChildAt(i4);
                            widthWithMargins -= PlayerControlViewLayoutManager.getWidthWithMargins(childAt2);
                            arrayList.add(childAt2);
                            if (widthWithMargins <= width) {
                                if (arrayList.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList.size());
                                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                        viewGroup2.addView((View) arrayList.get(i5), viewGroup2.getChildCount() - 1);
                                    }
                                    break;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                        }
                    }
                }
                break;
            case 3:
                playerControlViewLayoutManager.hideAllBarsAnimator.start();
                break;
            case 4:
                playerControlViewLayoutManager.hideProgressBarAnimator.start();
                break;
            case 5:
                playerControlViewLayoutManager.hideMainBarAnimator.start();
                playerControlViewLayoutManager.postDelayedRunnable(playerControlViewLayoutManager.hideProgressBarRunnable, 2000L);
                break;
            default:
                playerControlViewLayoutManager.setUxState(2);
                break;
        }
    }
}
