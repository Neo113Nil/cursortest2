package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.camera.view.PreviewView$$ExternalSyntheticLambda0;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class PlayerControlViewLayoutManager {
    public final ViewGroup basicControls;
    public final ViewGroup bottomBar;
    public final ViewGroup centerControls;
    public final View controlsBackground;
    public final ViewGroup extraControls;
    public final ViewGroup extraControlsScrollView;
    public final AnimatorSet hideAllBarsAnimator;
    public final PlayerControlViewLayoutManager$$ExternalSyntheticLambda0 hideAllBarsRunnable;
    public final AnimatorSet hideMainBarAnimator;
    public final PlayerControlViewLayoutManager$$ExternalSyntheticLambda0 hideMainBarRunnable;
    public final AnimatorSet hideProgressBarAnimator;
    public boolean isMinimalMode;
    public final ViewGroup minimalControls;
    public boolean needToShowBars;
    public final PreviewView$$ExternalSyntheticLambda0 onLayoutChangeListener;
    public final ValueAnimator overflowHideAnimator;
    public final ValueAnimator overflowShowAnimator;
    public final View overflowShowButton;
    public final PlayerControlView playerControlView;
    public final AnimatorSet showAllBarsAnimator;
    public final PlayerControlViewLayoutManager$$ExternalSyntheticLambda0 showAllBarsRunnable;
    public final AnimatorSet showMainBarAnimator;
    public final View timeBar;
    public final ViewGroup timeView;
    public final ViewGroup topControls;
    public final PlayerControlViewLayoutManager$$ExternalSyntheticLambda0 hideProgressBarRunnable = new PlayerControlViewLayoutManager$$ExternalSyntheticLambda0(this, 4);
    public final PlayerControlViewLayoutManager$$ExternalSyntheticLambda0 hideControllerRunnable = new PlayerControlViewLayoutManager$$ExternalSyntheticLambda0(this, 6);
    public boolean animationEnabled = true;
    public int uxState = 0;
    public final ArrayList shownButtons = new ArrayList();

    public PlayerControlViewLayoutManager(final PlayerControlView playerControlView) {
        this.playerControlView = playerControlView;
        final int i = 0;
        this.showAllBarsRunnable = new PlayerControlViewLayoutManager$$ExternalSyntheticLambda0(this, i);
        final int i2 = 3;
        this.hideAllBarsRunnable = new PlayerControlViewLayoutManager$$ExternalSyntheticLambda0(this, i2);
        int i3 = 5;
        this.hideMainBarRunnable = new PlayerControlViewLayoutManager$$ExternalSyntheticLambda0(this, i3);
        final int i4 = 2;
        this.onLayoutChangeListener = new PreviewView$$ExternalSyntheticLambda0(this, i4);
        final int i5 = 1;
        this.topControls = (ViewGroup) playerControlView.findViewById(R.id.exo_top_controls);
        this.controlsBackground = playerControlView.findViewById(R.id.exo_controls_background);
        this.centerControls = (ViewGroup) playerControlView.findViewById(R.id.exo_center_controls);
        this.minimalControls = (ViewGroup) playerControlView.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(R.id.exo_bottom_bar);
        this.bottomBar = viewGroup;
        this.timeView = (ViewGroup) playerControlView.findViewById(R.id.exo_time);
        View findViewById = playerControlView.findViewById(R.id.exo_progress);
        this.timeBar = findViewById;
        this.basicControls = (ViewGroup) playerControlView.findViewById(R.id.exo_basic_controls);
        this.extraControls = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls);
        this.extraControlsScrollView = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = playerControlView.findViewById(R.id.exo_overflow_show);
        this.overflowShowButton = findViewById2;
        View findViewById3 = playerControlView.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, i3));
            findViewById3.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, i3));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, RecyclerView.DECELERATION_RATE);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda1
            public final /* synthetic */ PlayerControlViewLayoutManager f$0;

            {
                this.f$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i2;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.f$0;
                switch (i6) {
                    case 0:
                        playerControlViewLayoutManager.animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 1:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = playerControlViewLayoutManager.controlsBackground;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 2:
                        playerControlViewLayoutManager.animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = playerControlViewLayoutManager.controlsBackground;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.topControls;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup7 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter(this) { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.1
            public final /* synthetic */ PlayerControlViewLayoutManager this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i6 = i;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i6) {
                    case 0:
                        View view = playerControlViewLayoutManager.controlsBackground;
                        if (view != null) {
                            view.setVisibility(4);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setVisibility(4);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(4);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setVisibility(4);
                            break;
                        }
                        break;
                    case 1:
                    default:
                        super.onAnimationEnd(animator);
                        break;
                    case 2:
                        playerControlViewLayoutManager.setUxState(0);
                        break;
                    case 3:
                        playerControlViewLayoutManager.setUxState(0);
                        break;
                    case 4:
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.basicControls;
                        if (viewGroup5 != null) {
                            viewGroup5.setVisibility(4);
                            break;
                        }
                        break;
                    case 5:
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.extraControlsScrollView;
                        if (viewGroup6 != null) {
                            viewGroup6.setVisibility(4);
                            break;
                        }
                        break;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i6 = i;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i6) {
                    case 0:
                        View view = playerControlViewLayoutManager.timeBar;
                        if ((view instanceof DefaultTimeBar) && !playerControlViewLayoutManager.isMinimalMode) {
                            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                            ValueAnimator valueAnimator = defaultTimeBar.scrubberScalingAnimator;
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            valueAnimator.setFloatValues(defaultTimeBar.scrubberScale, RecyclerView.DECELERATION_RATE);
                            valueAnimator.setDuration(250L);
                            valueAnimator.start();
                            break;
                        }
                        break;
                    case 1:
                        View view2 = playerControlViewLayoutManager.controlsBackground;
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setVisibility(0);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(0);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setVisibility(playerControlViewLayoutManager.isMinimalMode ? 0 : 4);
                        }
                        View view3 = playerControlViewLayoutManager.timeBar;
                        if ((view3 instanceof DefaultTimeBar) && !playerControlViewLayoutManager.isMinimalMode) {
                            DefaultTimeBar defaultTimeBar2 = (DefaultTimeBar) view3;
                            ValueAnimator valueAnimator2 = defaultTimeBar2.scrubberScalingAnimator;
                            if (valueAnimator2.isStarted()) {
                                valueAnimator2.cancel();
                            }
                            defaultTimeBar2.scrubberPaddingDisabled = false;
                            valueAnimator2.setFloatValues(defaultTimeBar2.scrubberScale, 1.0f);
                            valueAnimator2.setDuration(250L);
                            valueAnimator2.start();
                            break;
                        }
                        break;
                    case 2:
                        playerControlViewLayoutManager.setUxState(4);
                        break;
                    case 3:
                        playerControlViewLayoutManager.setUxState(4);
                        break;
                    case 4:
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.extraControlsScrollView;
                        if (viewGroup5 != null) {
                            viewGroup5.setVisibility(0);
                            viewGroup5.setTranslationX(viewGroup5.getWidth());
                            viewGroup5.scrollTo(viewGroup5.getWidth(), 0);
                            break;
                        }
                        break;
                    default:
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.basicControls;
                        if (viewGroup6 != null) {
                            viewGroup6.setVisibility(0);
                            break;
                        }
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda1
            public final /* synthetic */ PlayerControlViewLayoutManager f$0;

            {
                this.f$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i5;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.f$0;
                switch (i6) {
                    case 0:
                        playerControlViewLayoutManager.animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 1:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = playerControlViewLayoutManager.controlsBackground;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 2:
                        playerControlViewLayoutManager.animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = playerControlViewLayoutManager.controlsBackground;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.topControls;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup7 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat2.addListener(new AnimatorListenerAdapter(this) { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.1
            public final /* synthetic */ PlayerControlViewLayoutManager this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i6 = i5;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i6) {
                    case 0:
                        View view = playerControlViewLayoutManager.controlsBackground;
                        if (view != null) {
                            view.setVisibility(4);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setVisibility(4);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(4);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setVisibility(4);
                            break;
                        }
                        break;
                    case 1:
                    default:
                        super.onAnimationEnd(animator);
                        break;
                    case 2:
                        playerControlViewLayoutManager.setUxState(0);
                        break;
                    case 3:
                        playerControlViewLayoutManager.setUxState(0);
                        break;
                    case 4:
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.basicControls;
                        if (viewGroup5 != null) {
                            viewGroup5.setVisibility(4);
                            break;
                        }
                        break;
                    case 5:
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.extraControlsScrollView;
                        if (viewGroup6 != null) {
                            viewGroup6.setVisibility(4);
                            break;
                        }
                        break;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i6 = i5;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i6) {
                    case 0:
                        View view = playerControlViewLayoutManager.timeBar;
                        if ((view instanceof DefaultTimeBar) && !playerControlViewLayoutManager.isMinimalMode) {
                            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                            ValueAnimator valueAnimator = defaultTimeBar.scrubberScalingAnimator;
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            valueAnimator.setFloatValues(defaultTimeBar.scrubberScale, RecyclerView.DECELERATION_RATE);
                            valueAnimator.setDuration(250L);
                            valueAnimator.start();
                            break;
                        }
                        break;
                    case 1:
                        View view2 = playerControlViewLayoutManager.controlsBackground;
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setVisibility(0);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(0);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setVisibility(playerControlViewLayoutManager.isMinimalMode ? 0 : 4);
                        }
                        View view3 = playerControlViewLayoutManager.timeBar;
                        if ((view3 instanceof DefaultTimeBar) && !playerControlViewLayoutManager.isMinimalMode) {
                            DefaultTimeBar defaultTimeBar2 = (DefaultTimeBar) view3;
                            ValueAnimator valueAnimator2 = defaultTimeBar2.scrubberScalingAnimator;
                            if (valueAnimator2.isStarted()) {
                                valueAnimator2.cancel();
                            }
                            defaultTimeBar2.scrubberPaddingDisabled = false;
                            valueAnimator2.setFloatValues(defaultTimeBar2.scrubberScale, 1.0f);
                            valueAnimator2.setDuration(250L);
                            valueAnimator2.start();
                            break;
                        }
                        break;
                    case 2:
                        playerControlViewLayoutManager.setUxState(4);
                        break;
                    case 3:
                        playerControlViewLayoutManager.setUxState(4);
                        break;
                    case 4:
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.extraControlsScrollView;
                        if (viewGroup5 != null) {
                            viewGroup5.setVisibility(0);
                            viewGroup5.setTranslationX(viewGroup5.getWidth());
                            viewGroup5.scrollTo(viewGroup5.getWidth(), 0);
                            break;
                        }
                        break;
                    default:
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.basicControls;
                        if (viewGroup6 != null) {
                            viewGroup6.setVisibility(0);
                            break;
                        }
                        break;
                }
            }
        });
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.hideMainBarAnimator = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new AnimatorListenerAdapter(this) { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.3
            public final /* synthetic */ PlayerControlViewLayoutManager this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i6 = i;
                PlayerControlView playerControlView2 = playerControlView;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i6) {
                    case 0:
                        playerControlViewLayoutManager.setUxState(1);
                        if (playerControlViewLayoutManager.needToShowBars) {
                            playerControlView2.post(playerControlViewLayoutManager.showAllBarsRunnable);
                            playerControlViewLayoutManager.needToShowBars = false;
                            break;
                        }
                        break;
                    case 1:
                        playerControlViewLayoutManager.setUxState(2);
                        if (playerControlViewLayoutManager.needToShowBars) {
                            playerControlView2.post(playerControlViewLayoutManager.showAllBarsRunnable);
                            playerControlViewLayoutManager.needToShowBars = false;
                            break;
                        }
                        break;
                    default:
                        playerControlViewLayoutManager.setUxState(2);
                        if (playerControlViewLayoutManager.needToShowBars) {
                            playerControlView2.post(playerControlViewLayoutManager.showAllBarsRunnable);
                            playerControlViewLayoutManager.needToShowBars = false;
                            break;
                        }
                        break;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i6 = i;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i6) {
                    case 0:
                        playerControlViewLayoutManager.setUxState(3);
                        break;
                    case 1:
                        playerControlViewLayoutManager.setUxState(3);
                        break;
                    default:
                        playerControlViewLayoutManager.setUxState(3);
                        break;
                }
            }
        });
        animatorSet.play(ofFloat).with(ofTranslationY(findViewById, RecyclerView.DECELERATION_RATE, dimension)).with(ofTranslationY(viewGroup, RecyclerView.DECELERATION_RATE, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.hideProgressBarAnimator = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new AnimatorListenerAdapter(this) { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.3
            public final /* synthetic */ PlayerControlViewLayoutManager this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i6 = i5;
                PlayerControlView playerControlView2 = playerControlView;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i6) {
                    case 0:
                        playerControlViewLayoutManager.setUxState(1);
                        if (playerControlViewLayoutManager.needToShowBars) {
                            playerControlView2.post(playerControlViewLayoutManager.showAllBarsRunnable);
                            playerControlViewLayoutManager.needToShowBars = false;
                            break;
                        }
                        break;
                    case 1:
                        playerControlViewLayoutManager.setUxState(2);
                        if (playerControlViewLayoutManager.needToShowBars) {
                            playerControlView2.post(playerControlViewLayoutManager.showAllBarsRunnable);
                            playerControlViewLayoutManager.needToShowBars = false;
                            break;
                        }
                        break;
                    default:
                        playerControlViewLayoutManager.setUxState(2);
                        if (playerControlViewLayoutManager.needToShowBars) {
                            playerControlView2.post(playerControlViewLayoutManager.showAllBarsRunnable);
                            playerControlViewLayoutManager.needToShowBars = false;
                            break;
                        }
                        break;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i6 = i5;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i6) {
                    case 0:
                        playerControlViewLayoutManager.setUxState(3);
                        break;
                    case 1:
                        playerControlViewLayoutManager.setUxState(3);
                        break;
                    default:
                        playerControlViewLayoutManager.setUxState(3);
                        break;
                }
            }
        });
        animatorSet2.play(ofTranslationY(findViewById, dimension, dimension2)).with(ofTranslationY(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.hideAllBarsAnimator = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new AnimatorListenerAdapter(this) { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.3
            public final /* synthetic */ PlayerControlViewLayoutManager this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i6 = i4;
                PlayerControlView playerControlView2 = playerControlView;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i6) {
                    case 0:
                        playerControlViewLayoutManager.setUxState(1);
                        if (playerControlViewLayoutManager.needToShowBars) {
                            playerControlView2.post(playerControlViewLayoutManager.showAllBarsRunnable);
                            playerControlViewLayoutManager.needToShowBars = false;
                            break;
                        }
                        break;
                    case 1:
                        playerControlViewLayoutManager.setUxState(2);
                        if (playerControlViewLayoutManager.needToShowBars) {
                            playerControlView2.post(playerControlViewLayoutManager.showAllBarsRunnable);
                            playerControlViewLayoutManager.needToShowBars = false;
                            break;
                        }
                        break;
                    default:
                        playerControlViewLayoutManager.setUxState(2);
                        if (playerControlViewLayoutManager.needToShowBars) {
                            playerControlView2.post(playerControlViewLayoutManager.showAllBarsRunnable);
                            playerControlViewLayoutManager.needToShowBars = false;
                            break;
                        }
                        break;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i6 = i4;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i6) {
                    case 0:
                        playerControlViewLayoutManager.setUxState(3);
                        break;
                    case 1:
                        playerControlViewLayoutManager.setUxState(3);
                        break;
                    default:
                        playerControlViewLayoutManager.setUxState(3);
                        break;
                }
            }
        });
        animatorSet3.play(ofFloat).with(ofTranslationY(findViewById, RecyclerView.DECELERATION_RATE, dimension2)).with(ofTranslationY(viewGroup, RecyclerView.DECELERATION_RATE, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.showMainBarAnimator = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new AnimatorListenerAdapter(this) { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.1
            public final /* synthetic */ PlayerControlViewLayoutManager this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i6 = i4;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i6) {
                    case 0:
                        View view = playerControlViewLayoutManager.controlsBackground;
                        if (view != null) {
                            view.setVisibility(4);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setVisibility(4);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(4);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setVisibility(4);
                            break;
                        }
                        break;
                    case 1:
                    default:
                        super.onAnimationEnd(animator);
                        break;
                    case 2:
                        playerControlViewLayoutManager.setUxState(0);
                        break;
                    case 3:
                        playerControlViewLayoutManager.setUxState(0);
                        break;
                    case 4:
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.basicControls;
                        if (viewGroup5 != null) {
                            viewGroup5.setVisibility(4);
                            break;
                        }
                        break;
                    case 5:
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.extraControlsScrollView;
                        if (viewGroup6 != null) {
                            viewGroup6.setVisibility(4);
                            break;
                        }
                        break;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i6 = i4;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i6) {
                    case 0:
                        View view = playerControlViewLayoutManager.timeBar;
                        if ((view instanceof DefaultTimeBar) && !playerControlViewLayoutManager.isMinimalMode) {
                            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                            ValueAnimator valueAnimator = defaultTimeBar.scrubberScalingAnimator;
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            valueAnimator.setFloatValues(defaultTimeBar.scrubberScale, RecyclerView.DECELERATION_RATE);
                            valueAnimator.setDuration(250L);
                            valueAnimator.start();
                            break;
                        }
                        break;
                    case 1:
                        View view2 = playerControlViewLayoutManager.controlsBackground;
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setVisibility(0);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(0);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setVisibility(playerControlViewLayoutManager.isMinimalMode ? 0 : 4);
                        }
                        View view3 = playerControlViewLayoutManager.timeBar;
                        if ((view3 instanceof DefaultTimeBar) && !playerControlViewLayoutManager.isMinimalMode) {
                            DefaultTimeBar defaultTimeBar2 = (DefaultTimeBar) view3;
                            ValueAnimator valueAnimator2 = defaultTimeBar2.scrubberScalingAnimator;
                            if (valueAnimator2.isStarted()) {
                                valueAnimator2.cancel();
                            }
                            defaultTimeBar2.scrubberPaddingDisabled = false;
                            valueAnimator2.setFloatValues(defaultTimeBar2.scrubberScale, 1.0f);
                            valueAnimator2.setDuration(250L);
                            valueAnimator2.start();
                            break;
                        }
                        break;
                    case 2:
                        playerControlViewLayoutManager.setUxState(4);
                        break;
                    case 3:
                        playerControlViewLayoutManager.setUxState(4);
                        break;
                    case 4:
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.extraControlsScrollView;
                        if (viewGroup5 != null) {
                            viewGroup5.setVisibility(0);
                            viewGroup5.setTranslationX(viewGroup5.getWidth());
                            viewGroup5.scrollTo(viewGroup5.getWidth(), 0);
                            break;
                        }
                        break;
                    default:
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.basicControls;
                        if (viewGroup6 != null) {
                            viewGroup6.setVisibility(0);
                            break;
                        }
                        break;
                }
            }
        });
        animatorSet4.play(ofFloat2).with(ofTranslationY(findViewById, dimension, RecyclerView.DECELERATION_RATE)).with(ofTranslationY(viewGroup, dimension, RecyclerView.DECELERATION_RATE));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.showAllBarsAnimator = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new AnimatorListenerAdapter(this) { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.1
            public final /* synthetic */ PlayerControlViewLayoutManager this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i6 = i2;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i6) {
                    case 0:
                        View view = playerControlViewLayoutManager.controlsBackground;
                        if (view != null) {
                            view.setVisibility(4);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setVisibility(4);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(4);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setVisibility(4);
                            break;
                        }
                        break;
                    case 1:
                    default:
                        super.onAnimationEnd(animator);
                        break;
                    case 2:
                        playerControlViewLayoutManager.setUxState(0);
                        break;
                    case 3:
                        playerControlViewLayoutManager.setUxState(0);
                        break;
                    case 4:
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.basicControls;
                        if (viewGroup5 != null) {
                            viewGroup5.setVisibility(4);
                            break;
                        }
                        break;
                    case 5:
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.extraControlsScrollView;
                        if (viewGroup6 != null) {
                            viewGroup6.setVisibility(4);
                            break;
                        }
                        break;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i6 = i2;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i6) {
                    case 0:
                        View view = playerControlViewLayoutManager.timeBar;
                        if ((view instanceof DefaultTimeBar) && !playerControlViewLayoutManager.isMinimalMode) {
                            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                            ValueAnimator valueAnimator = defaultTimeBar.scrubberScalingAnimator;
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            valueAnimator.setFloatValues(defaultTimeBar.scrubberScale, RecyclerView.DECELERATION_RATE);
                            valueAnimator.setDuration(250L);
                            valueAnimator.start();
                            break;
                        }
                        break;
                    case 1:
                        View view2 = playerControlViewLayoutManager.controlsBackground;
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setVisibility(0);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(0);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setVisibility(playerControlViewLayoutManager.isMinimalMode ? 0 : 4);
                        }
                        View view3 = playerControlViewLayoutManager.timeBar;
                        if ((view3 instanceof DefaultTimeBar) && !playerControlViewLayoutManager.isMinimalMode) {
                            DefaultTimeBar defaultTimeBar2 = (DefaultTimeBar) view3;
                            ValueAnimator valueAnimator2 = defaultTimeBar2.scrubberScalingAnimator;
                            if (valueAnimator2.isStarted()) {
                                valueAnimator2.cancel();
                            }
                            defaultTimeBar2.scrubberPaddingDisabled = false;
                            valueAnimator2.setFloatValues(defaultTimeBar2.scrubberScale, 1.0f);
                            valueAnimator2.setDuration(250L);
                            valueAnimator2.start();
                            break;
                        }
                        break;
                    case 2:
                        playerControlViewLayoutManager.setUxState(4);
                        break;
                    case 3:
                        playerControlViewLayoutManager.setUxState(4);
                        break;
                    case 4:
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.extraControlsScrollView;
                        if (viewGroup5 != null) {
                            viewGroup5.setVisibility(0);
                            viewGroup5.setTranslationX(viewGroup5.getWidth());
                            viewGroup5.scrollTo(viewGroup5.getWidth(), 0);
                            break;
                        }
                        break;
                    default:
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.basicControls;
                        if (viewGroup6 != null) {
                            viewGroup6.setVisibility(0);
                            break;
                        }
                        break;
                }
            }
        });
        animatorSet5.play(ofFloat2).with(ofTranslationY(findViewById, dimension2, RecyclerView.DECELERATION_RATE)).with(ofTranslationY(viewGroup, dimension2, RecyclerView.DECELERATION_RATE));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        this.overflowShowAnimator = ofFloat3;
        ofFloat3.setDuration(250L);
        final int i6 = 0;
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda1
            public final /* synthetic */ PlayerControlViewLayoutManager f$0;

            {
                this.f$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i62 = i6;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.f$0;
                switch (i62) {
                    case 0:
                        playerControlViewLayoutManager.animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 1:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = playerControlViewLayoutManager.controlsBackground;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 2:
                        playerControlViewLayoutManager.animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = playerControlViewLayoutManager.controlsBackground;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.topControls;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup7 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        final int i7 = 4;
        ofFloat3.addListener(new AnimatorListenerAdapter(this) { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.1
            public final /* synthetic */ PlayerControlViewLayoutManager this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i62 = i7;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i62) {
                    case 0:
                        View view = playerControlViewLayoutManager.controlsBackground;
                        if (view != null) {
                            view.setVisibility(4);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setVisibility(4);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(4);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setVisibility(4);
                            break;
                        }
                        break;
                    case 1:
                    default:
                        super.onAnimationEnd(animator);
                        break;
                    case 2:
                        playerControlViewLayoutManager.setUxState(0);
                        break;
                    case 3:
                        playerControlViewLayoutManager.setUxState(0);
                        break;
                    case 4:
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.basicControls;
                        if (viewGroup5 != null) {
                            viewGroup5.setVisibility(4);
                            break;
                        }
                        break;
                    case 5:
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.extraControlsScrollView;
                        if (viewGroup6 != null) {
                            viewGroup6.setVisibility(4);
                            break;
                        }
                        break;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i62 = i7;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i62) {
                    case 0:
                        View view = playerControlViewLayoutManager.timeBar;
                        if ((view instanceof DefaultTimeBar) && !playerControlViewLayoutManager.isMinimalMode) {
                            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                            ValueAnimator valueAnimator = defaultTimeBar.scrubberScalingAnimator;
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            valueAnimator.setFloatValues(defaultTimeBar.scrubberScale, RecyclerView.DECELERATION_RATE);
                            valueAnimator.setDuration(250L);
                            valueAnimator.start();
                            break;
                        }
                        break;
                    case 1:
                        View view2 = playerControlViewLayoutManager.controlsBackground;
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setVisibility(0);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(0);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setVisibility(playerControlViewLayoutManager.isMinimalMode ? 0 : 4);
                        }
                        View view3 = playerControlViewLayoutManager.timeBar;
                        if ((view3 instanceof DefaultTimeBar) && !playerControlViewLayoutManager.isMinimalMode) {
                            DefaultTimeBar defaultTimeBar2 = (DefaultTimeBar) view3;
                            ValueAnimator valueAnimator2 = defaultTimeBar2.scrubberScalingAnimator;
                            if (valueAnimator2.isStarted()) {
                                valueAnimator2.cancel();
                            }
                            defaultTimeBar2.scrubberPaddingDisabled = false;
                            valueAnimator2.setFloatValues(defaultTimeBar2.scrubberScale, 1.0f);
                            valueAnimator2.setDuration(250L);
                            valueAnimator2.start();
                            break;
                        }
                        break;
                    case 2:
                        playerControlViewLayoutManager.setUxState(4);
                        break;
                    case 3:
                        playerControlViewLayoutManager.setUxState(4);
                        break;
                    case 4:
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.extraControlsScrollView;
                        if (viewGroup5 != null) {
                            viewGroup5.setVisibility(0);
                            viewGroup5.setTranslationX(viewGroup5.getWidth());
                            viewGroup5.scrollTo(viewGroup5.getWidth(), 0);
                            break;
                        }
                        break;
                    default:
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.basicControls;
                        if (viewGroup6 != null) {
                            viewGroup6.setVisibility(0);
                            break;
                        }
                        break;
                }
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, RecyclerView.DECELERATION_RATE);
        this.overflowHideAnimator = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda1
            public final /* synthetic */ PlayerControlViewLayoutManager f$0;

            {
                this.f$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i62 = i4;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.f$0;
                switch (i62) {
                    case 0:
                        playerControlViewLayoutManager.animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 1:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = playerControlViewLayoutManager.controlsBackground;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 2:
                        playerControlViewLayoutManager.animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = playerControlViewLayoutManager.controlsBackground;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.topControls;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup7 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        final int i8 = 5;
        ofFloat4.addListener(new AnimatorListenerAdapter(this) { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.1
            public final /* synthetic */ PlayerControlViewLayoutManager this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i62 = i8;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i62) {
                    case 0:
                        View view = playerControlViewLayoutManager.controlsBackground;
                        if (view != null) {
                            view.setVisibility(4);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setVisibility(4);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(4);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setVisibility(4);
                            break;
                        }
                        break;
                    case 1:
                    default:
                        super.onAnimationEnd(animator);
                        break;
                    case 2:
                        playerControlViewLayoutManager.setUxState(0);
                        break;
                    case 3:
                        playerControlViewLayoutManager.setUxState(0);
                        break;
                    case 4:
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.basicControls;
                        if (viewGroup5 != null) {
                            viewGroup5.setVisibility(4);
                            break;
                        }
                        break;
                    case 5:
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.extraControlsScrollView;
                        if (viewGroup6 != null) {
                            viewGroup6.setVisibility(4);
                            break;
                        }
                        break;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i62 = i8;
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.this$0;
                switch (i62) {
                    case 0:
                        View view = playerControlViewLayoutManager.timeBar;
                        if ((view instanceof DefaultTimeBar) && !playerControlViewLayoutManager.isMinimalMode) {
                            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                            ValueAnimator valueAnimator = defaultTimeBar.scrubberScalingAnimator;
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            valueAnimator.setFloatValues(defaultTimeBar.scrubberScale, RecyclerView.DECELERATION_RATE);
                            valueAnimator.setDuration(250L);
                            valueAnimator.start();
                            break;
                        }
                        break;
                    case 1:
                        View view2 = playerControlViewLayoutManager.controlsBackground;
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                        ViewGroup viewGroup2 = playerControlViewLayoutManager.topControls;
                        if (viewGroup2 != null) {
                            viewGroup2.setVisibility(0);
                        }
                        ViewGroup viewGroup3 = playerControlViewLayoutManager.centerControls;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(0);
                        }
                        ViewGroup viewGroup4 = playerControlViewLayoutManager.minimalControls;
                        if (viewGroup4 != null) {
                            viewGroup4.setVisibility(playerControlViewLayoutManager.isMinimalMode ? 0 : 4);
                        }
                        View view3 = playerControlViewLayoutManager.timeBar;
                        if ((view3 instanceof DefaultTimeBar) && !playerControlViewLayoutManager.isMinimalMode) {
                            DefaultTimeBar defaultTimeBar2 = (DefaultTimeBar) view3;
                            ValueAnimator valueAnimator2 = defaultTimeBar2.scrubberScalingAnimator;
                            if (valueAnimator2.isStarted()) {
                                valueAnimator2.cancel();
                            }
                            defaultTimeBar2.scrubberPaddingDisabled = false;
                            valueAnimator2.setFloatValues(defaultTimeBar2.scrubberScale, 1.0f);
                            valueAnimator2.setDuration(250L);
                            valueAnimator2.start();
                            break;
                        }
                        break;
                    case 2:
                        playerControlViewLayoutManager.setUxState(4);
                        break;
                    case 3:
                        playerControlViewLayoutManager.setUxState(4);
                        break;
                    case 4:
                        ViewGroup viewGroup5 = playerControlViewLayoutManager.extraControlsScrollView;
                        if (viewGroup5 != null) {
                            viewGroup5.setVisibility(0);
                            viewGroup5.setTranslationX(viewGroup5.getWidth());
                            viewGroup5.scrollTo(viewGroup5.getWidth(), 0);
                            break;
                        }
                        break;
                    default:
                        ViewGroup viewGroup6 = playerControlViewLayoutManager.basicControls;
                        if (viewGroup6 != null) {
                            viewGroup6.setVisibility(0);
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static int getWidthWithMargins(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator ofTranslationY(View view, float f, float f2) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    public static boolean shouldHideInMinimalMode(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_media_route_button_placeholder || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    public final void animateOverflow(float f) {
        ViewGroup viewGroup = this.extraControlsScrollView;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.timeView;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.basicControls;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final void postDelayedRunnable(Runnable runnable, long j) {
        if (j >= 0) {
            this.playerControlView.postDelayed(runnable, j);
        }
    }

    public final void removeHideCallbacks() {
        PlayerControlViewLayoutManager$$ExternalSyntheticLambda0 playerControlViewLayoutManager$$ExternalSyntheticLambda0 = this.hideControllerRunnable;
        PlayerControlView playerControlView = this.playerControlView;
        playerControlView.removeCallbacks(playerControlViewLayoutManager$$ExternalSyntheticLambda0);
        playerControlView.removeCallbacks(this.hideAllBarsRunnable);
        playerControlView.removeCallbacks(this.hideMainBarRunnable);
        playerControlView.removeCallbacks(this.hideProgressBarRunnable);
    }

    public final void resetHideCallbacks() {
        if (this.uxState == 3) {
            return;
        }
        removeHideCallbacks();
        int i = this.playerControlView.showTimeoutMs;
        if (i > 0) {
            if (!this.animationEnabled) {
                postDelayedRunnable(this.hideControllerRunnable, i);
            } else if (this.uxState == 1) {
                postDelayedRunnable(this.hideProgressBarRunnable, 2000L);
            } else {
                postDelayedRunnable(this.hideMainBarRunnable, i);
            }
        }
    }

    public final void setShowButton(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.shownButtons;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.isMinimalMode && shouldHideInMinimalMode(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void setUxState(int i) {
        int i2 = this.uxState;
        this.uxState = i;
        PlayerControlView playerControlView = this.playerControlView;
        if (i == 2) {
            playerControlView.setVisibility(8);
        } else if (i2 == 2) {
            playerControlView.setVisibility(0);
        }
        if (i2 != i) {
            Iterator it = playerControlView.visibilityListeners.iterator();
            while (it.hasNext()) {
                PlayerControlView.VisibilityListener visibilityListener = (PlayerControlView.VisibilityListener) it.next();
                playerControlView.getVisibility();
                PlayerView.this.updateContentDescription();
            }
        }
    }

    public final void showAllBars() {
        if (!this.animationEnabled) {
            setUxState(0);
            resetHideCallbacks();
            return;
        }
        int i = this.uxState;
        if (i == 1) {
            this.showMainBarAnimator.start();
        } else if (i == 2) {
            this.showAllBarsAnimator.start();
        } else if (i == 3) {
            this.needToShowBars = true;
        } else if (i == 4) {
            return;
        }
        resetHideCallbacks();
    }
}
