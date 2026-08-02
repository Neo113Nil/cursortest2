package com.squareup.cash.localization;

import android.content.Context;
import android.os.LocaleList;
import androidx.appcompat.app.AppCompatDelegate;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import com.squareup.cash.R;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* loaded from: classes.dex */
public final class RealLocaleManager {
    public final Context appContext;
    public final Lazy context$delegate;
    public final RealLanguageManager languageManager;
    public final ReadonlyStateFlow resolvedLocale;

    public RealLocaleManager(Context context, CoroutineScope coroutineScope, Flow flow, RealLanguageManager realLanguageManager) {
        this.appContext = context;
        this.languageManager = realLanguageManager;
        Lazy lazy = LazyKt.lazy(new RealBrazeManager$$ExternalSyntheticLambda0(this, 24));
        this.context$delegate = lazy;
        Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new FinishSetupTileBadgeCounter(16, new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(flow, 14), this));
        Locale forLanguageTag = Locale.forLanguageTag(((Context) lazy.getValue()).getString(R.string.resolved_locale));
        forLanguageTag.getClass();
        this.resolvedLocale = FlowKt.stateIn(distinctUntilChanged, coroutineScope, SharingStarted.Companion.Lazily, forLanguageTag);
    }

    public static Locale getSystemLocale() {
        Locale locale = AppCompatDelegate.getApplicationLocales().get(0);
        if (locale != null) {
            return locale;
        }
        Locale locale2 = LocaleList.getAdjustedDefault().get(0);
        locale2.getClass();
        return locale2;
    }
}
