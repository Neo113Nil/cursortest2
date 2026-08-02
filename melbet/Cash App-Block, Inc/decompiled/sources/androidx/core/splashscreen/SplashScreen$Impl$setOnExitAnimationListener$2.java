package androidx.core.splashscreen;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda15;
import androidx.work.impl.WorkLauncherImpl;
import coil3.memory.MemoryCacheService;
import com.squareup.cash.card.onboarding.PerspectiveView;
import com.squareup.cash.card.onboarding.StyledCardPerspectiveView;
import com.squareup.cash.formview.components.FormView;
import com.squareup.cash.history.views.ActivityItemLayout;
import com.squareup.cash.reactions.views.ChooseReactionDialog;
import com.squareup.cash.reactions.views.ChooseReactionOverlay;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda3;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes3.dex */
public final class SplashScreen$Impl$setOnExitAnimationListener$2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $splashScreenViewProvider;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ SplashScreen$Impl$setOnExitAnimationListener$2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$splashScreenViewProvider = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.$r8$classId;
        Object obj = this.$splashScreenViewProvider;
        Object obj2 = this.this$0;
        switch (i9) {
            case 0:
                MemoryCacheService memoryCacheService = (MemoryCacheService) obj;
                SplashScreen$Impl splashScreen$Impl = (SplashScreen$Impl) obj2;
                view.getClass();
                if (view.isAttachedToWindow()) {
                    view.removeOnLayoutChangeListener(this);
                    if (!splashScreen$Impl.splashScreenWaitPredicate.shouldKeepOnScreen()) {
                        MainActivity$$ExternalSyntheticLambda3 mainActivity$$ExternalSyntheticLambda3 = splashScreen$Impl.animationListener;
                        if (mainActivity$$ExternalSyntheticLambda3 != null) {
                            splashScreen$Impl.animationListener = null;
                            ((WorkLauncherImpl) memoryCacheService.imageLoader).getSplashScreenView().postOnAnimation(new Recorder$$ExternalSyntheticLambda15(28, memoryCacheService, mainActivity$$ExternalSyntheticLambda3));
                            break;
                        }
                    } else {
                        splashScreen$Impl.mSplashScreenViewProvider = memoryCacheService;
                        break;
                    }
                }
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                int i10 = StyledCardPerspectiveView.$r8$clinit;
                ((PerspectiveView) obj2).setChildOffsetZ(((StyledCardPerspectiveView) obj).getPerspectiveView().getWidth() * 1.35f);
                break;
            case 2:
                view.getClass();
                FormView formView = (FormView) obj2;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
                if (formView.getElementContainer().getHeight() != ref$IntRef.element) {
                    formView.hasScrolledToBottom = false;
                    ref$IntRef.element = formView.getElementContainer().getHeight();
                    formView.checkScrollState();
                    break;
                }
                break;
            case 3:
                view.removeOnLayoutChangeListener(this);
                Rect rect = new Rect();
                View view2 = (View) obj;
                view2.getHitRect(rect);
                rect.set(0, 0, rect.right, rect.bottom + rect.top);
                ((ActivityItemLayout) obj2).setTouchDelegate(new TouchDelegate(rect, view2));
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                ChooseReactionOverlay.access$animateDialogIn((ChooseReactionOverlay) obj2, (ChooseReactionDialog) obj);
                break;
        }
    }
}
