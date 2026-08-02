package androidx.core.splashscreen;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda15;
import androidx.work.impl.WorkLauncherImpl;
import coil3.memory.MemoryCacheService;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.ui.MainActivity;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda3;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public class SplashScreen$Impl {
    public final MainActivity activity;
    public MainActivity$$ExternalSyntheticLambda3 animationListener;
    public Integer backgroundColor;
    public Integer backgroundResId;
    public boolean hasBackground;
    public Drawable icon;
    public MemoryCacheService mSplashScreenViewProvider;
    public SplashScreen$KeepOnScreenCondition splashScreenWaitPredicate = new Drop$$ExternalSyntheticBUOutline0(16);

    public SplashScreen$Impl(MainActivity mainActivity) {
        this.activity = mainActivity;
    }

    public void install() {
        int i;
        TypedValue typedValue = new TypedValue();
        MainActivity mainActivity = this.activity;
        Resources.Theme theme = mainActivity.getTheme();
        if (theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true)) {
            this.backgroundResId = Integer.valueOf(typedValue.resourceId);
            this.backgroundColor = Integer.valueOf(typedValue.data);
        }
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            this.icon = DimensionKt.getDrawable(mainActivity, typedValue.resourceId);
        }
        if (theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true)) {
            this.hasBackground = typedValue.resourceId == R.dimen.splashscreen_icon_size_with_background;
        }
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        mainActivity.setTheme(i);
    }

    public void setKeepOnScreenCondition(SplashScreen$KeepOnScreenCondition splashScreen$KeepOnScreenCondition) {
        this.splashScreenWaitPredicate = splashScreen$KeepOnScreenCondition;
        final View findViewById = this.activity.findViewById(android.R.id.content);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl$setKeepOnScreenCondition$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                MainActivity$$ExternalSyntheticLambda3 mainActivity$$ExternalSyntheticLambda3;
                SplashScreen$Impl splashScreen$Impl = SplashScreen$Impl.this;
                if (splashScreen$Impl.splashScreenWaitPredicate.shouldKeepOnScreen()) {
                    return false;
                }
                findViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                MemoryCacheService memoryCacheService = splashScreen$Impl.mSplashScreenViewProvider;
                if (memoryCacheService == null || (mainActivity$$ExternalSyntheticLambda3 = splashScreen$Impl.animationListener) == null) {
                    return true;
                }
                splashScreen$Impl.animationListener = null;
                ((WorkLauncherImpl) memoryCacheService.imageLoader).getSplashScreenView().postOnAnimation(new Recorder$$ExternalSyntheticLambda15(28, memoryCacheService, mainActivity$$ExternalSyntheticLambda3));
                return true;
            }
        });
    }

    public void setOnExitAnimationListener(MainActivity$$ExternalSyntheticLambda3 mainActivity$$ExternalSyntheticLambda3) {
        float dimension;
        this.animationListener = mainActivity$$ExternalSyntheticLambda3;
        MainActivity mainActivity = this.activity;
        MemoryCacheService memoryCacheService = new MemoryCacheService(mainActivity);
        Integer num = this.backgroundResId;
        Integer num2 = this.backgroundColor;
        ViewGroup splashScreenView = ((WorkLauncherImpl) memoryCacheService.imageLoader).getSplashScreenView();
        if (num != null && num.intValue() != 0) {
            splashScreenView.setBackgroundResource(num.intValue());
        } else if (num2 != null) {
            splashScreenView.setBackgroundColor(num2.intValue());
        } else {
            splashScreenView.setBackground(mainActivity.getWindow().getDecorView().getBackground());
        }
        Drawable drawable = this.icon;
        if (drawable != null) {
            ImageView imageView = (ImageView) splashScreenView.findViewById(R.id.splashscreen_icon_view);
            if (this.hasBackground) {
                Drawable drawable2 = DimensionKt.getDrawable(imageView.getContext(), R.drawable.icon_background);
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_with_background) * 0.6666667f;
                if (drawable2 != null) {
                    imageView.setBackground(new MaskedDrawable(drawable2, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_no_background) * 0.6666667f;
            }
            imageView.setImageDrawable(new MaskedDrawable(drawable, dimension));
        }
        splashScreenView.addOnLayoutChangeListener(new SplashScreen$Impl$setOnExitAnimationListener$2(0, this, memoryCacheService));
    }
}
