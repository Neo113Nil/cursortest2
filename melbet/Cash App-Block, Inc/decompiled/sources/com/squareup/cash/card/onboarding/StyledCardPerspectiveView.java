package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.splashscreen.SplashScreen$Impl$setOnExitAnimationListener$2;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.card.onboarding.views.databinding.CardStylePerspectiveViewBinding;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.android.StringsKt;
import com.squareup.util.android.drawable.RoundedRectShadowOutlineProvider;
import com.squareup.util.android.drawable.RoundedRectShadowOutlineProvider$Radius$Res;
import com.squareup.util.android.drawable.ViewShadowInfo;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class StyledCardPerspectiveView extends ConstraintLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public boolean applyPerspective;
    public final Lazy binding$delegate;
    public final Lazy bottomDreamLights$delegate;
    public final Lazy dreamLights$delegate;
    public boolean isInteractive;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardTheme.Gradient.values().length];
            try {
                iArr[CardTheme.Gradient.DIAGONAL_DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardTheme.Gradient.DIAGONAL_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyledCardPerspectiveView(Context context) {
        super(context);
        context.getClass();
        this.binding$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new SsnViewKt$$ExternalSyntheticLambda4(this, 13));
        this.dreamLights$delegate = LazyKt.lazy(new CameraX$$ExternalSyntheticLambda0(context, 6));
        this.bottomDreamLights$delegate = LazyKt.lazy(new CameraX$$ExternalSyntheticLambda0(context, 7));
        View.inflate(context, R.layout.card_style_perspective_view, this);
        setClipChildren(false);
    }

    public final DreamLightsDrawable getDreamLights() {
        return (DreamLightsDrawable) this.dreamLights$delegate.getValue();
    }

    public final PerspectiveView getPerspectiveView() {
        return ((CardStylePerspectiveViewBinding) this.binding$delegate.getValue()).perspectiveView;
    }

    public final void render(StyledCardViewModel styledCardViewModel) {
        int i = 1;
        if (this.applyPerspective) {
            PerspectiveView perspectiveView = getPerspectiveView();
            perspectiveView.setChildRotationX(8.0f);
            perspectiveView.setChildRotationY(-13.0f);
            perspectiveView.setChildRotationZ(9.0f);
            perspectiveView.setCameraFov(26.0f);
            perspectiveView.setForceCentered(true);
            perspectiveView.addOnLayoutChangeListener(new SplashScreen$Impl$setOnExitAnimationListener$2(i, perspectiveView, this));
        }
        ArrayList arrayList = new ArrayList();
        Context context = getContext();
        context.getClass();
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.styled_card_background, null);
        drawableCompat.getClass();
        Drawable mutate = drawableCompat.mutate();
        CardTheme cardTheme = styledCardViewModel.theme;
        Integer safeParseColor = StringsKt.safeParseColor(cardTheme.card_color, new CardStudioViewKt$ThemedCard$1$4$1(1, Timber.Forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 18));
        safeParseColor.getClass();
        mutate.setTint(safeParseColor.intValue());
        arrayList.add(mutate);
        if (cardTheme.background_image == CardTheme.BackgroundImage.DREAM) {
            arrayList.add((Drawable) this.bottomDreamLights$delegate.getValue());
        }
        CardTheme.Gradient gradient = cardTheme.gradient_style;
        int i2 = gradient == null ? -1 : WhenMappings.$EnumSwitchMapping$0[gradient.ordinal()];
        if (i2 == 1) {
            Context context2 = getContext();
            context2.getClass();
            Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context2, R.drawable.gradient_diagonal_dark_edge, null);
            drawableCompat2.getClass();
            arrayList.add(drawableCompat2);
        } else if (i2 == 2) {
            Context context3 = getContext();
            context3.getClass();
            Drawable drawableCompat3 = PlatformKt.getDrawableCompat(context3, R.drawable.gradient_diagonal_light_edge, null);
            drawableCompat3.getClass();
            arrayList.add(drawableCompat3);
        }
        Lazy lazy = this.binding$delegate;
        ((CardStylePerspectiveViewBinding) lazy.getValue()).bottomCard.setImageDrawable(new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])));
        ((CardStylePerspectiveViewBinding) lazy.getValue()).styledCardView.setOutlineProvider(null);
        ((CardStylePerspectiveViewBinding) lazy.getValue()).styledCardView.setModel(StyledCardViewModel.copy$default(styledCardViewModel, Integer.valueOf(R.drawable.gradient_diagonal_light_top), Integer.valueOf(R.drawable.gradient_diagonal_dark_top), this.isInteractive, null, 65087));
        FrameLayout frameLayout = ((CardStylePerspectiveViewBinding) lazy.getValue()).cardContainer;
        Resources resources = getResources();
        resources.getClass();
        frameLayout.setOutlineProvider(new RoundedRectShadowOutlineProvider(new RoundedRectShadowOutlineProvider$Radius$Res(R.dimen.card_design_shadow_radius), new ViewShadowInfo(resources, R.dimen.card_preview_shadow_offset, R.dimen.card_preview_shadow_alpha, R.dimen.card_preview_elevation)));
    }

    public final void setApplyPerspective(boolean z) {
        this.applyPerspective = z;
    }

    public final void setInteractive(boolean z) {
        this.isInteractive = z;
    }
}
