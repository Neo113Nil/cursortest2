package androidx.metrics.performance;

import android.content.SharedPreferences;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda10;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.preferences.SharedPreferencesKeyValue;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class JankStats {
    public final OnFrameListener frameListener;
    public final JankStatsApi26Impl implementation;
    public boolean isTrackingEnabled;
    public final float jankHeuristicMultiplier;

    public abstract class Companion {
        public static JankStats createAndTrack(Window window, OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0) {
            window.getClass();
            onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.getClass();
            return new JankStats(window, onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0);
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewAutoAddCash.deepLinkSpecs;
        }

        public static SharedPreferencesKeyValue provideHasSeenLinkedAccountsNux(SharedPreferences sharedPreferences) {
            return Room.BooleanKeyValue(sharedPreferences, "has-seen-linked-accounts-nux-key", false, false);
        }
    }

    /* loaded from: classes.dex */
    public interface OnFrameListener {
        void onFrame(FrameDataApi24 frameDataApi24);
    }

    public JankStats(Window window, OnFrameListener onFrameListener) {
        this.frameListener = onFrameListener;
        View peekDecorView = window.peekDecorView();
        if (peekDecorView == null) {
            a$$ExternalSyntheticBUOutline0.m$1("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
            throw null;
        }
        View rootView = peekDecorView.getRootView();
        Object tag = rootView.getTag(R.id.metricsStateHolder);
        if (tag == null) {
            tag = new PerformanceMetricsState$Holder();
            rootView.setTag(R.id.metricsStateHolder, tag);
        }
        PerformanceMetricsState$Holder performanceMetricsState$Holder = (PerformanceMetricsState$Holder) tag;
        if (performanceMetricsState$Holder.state == null) {
            JWECryptoParts jWECryptoParts = new JWECryptoParts();
            jWECryptoParts.header = new ArrayList();
            jWECryptoParts.encryptedKey = new ArrayList();
            jWECryptoParts.iv = new ArrayList();
            jWECryptoParts.cipherText = new ArrayList();
            jWECryptoParts.authenticationTag = new ArrayList();
            new ArrayList();
            performanceMetricsState$Holder.state = jWECryptoParts;
        }
        JankStatsApi26Impl jankStatsApi31Impl = Build.VERSION.SDK_INT >= 31 ? new JankStatsApi31Impl(this, peekDecorView, window) : new JankStatsApi26Impl(this, peekDecorView, window);
        this.implementation = jankStatsApi31Impl;
        jankStatsApi31Impl.window.getDecorView().post(new LottieCompositionFactory$$ExternalSyntheticLambda10(true, (Object) jankStatsApi31Impl, 4));
        this.isTrackingEnabled = true;
        this.jankHeuristicMultiplier = 2.0f;
    }

    public final void setTrackingEnabled(boolean z) {
        if (z != this.isTrackingEnabled) {
            JankStatsApi26Impl jankStatsApi26Impl = this.implementation;
            jankStatsApi26Impl.window.getDecorView().post(new LottieCompositionFactory$$ExternalSyntheticLambda10(z, jankStatsApi26Impl, 4));
            this.isTrackingEnabled = z;
        }
    }
}
