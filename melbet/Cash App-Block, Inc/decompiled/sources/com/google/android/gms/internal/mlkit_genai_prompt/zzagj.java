package com.google.android.gms.internal.mlkit_genai_prompt;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.view.View;
import androidx.compose.ui.platform.DerivedSize;
import androidx.compose.ui.unit.DensityWithConverter;
import androidx.core.os.BundleKt;
import app.cash.local.primitives.LocalBrandBanner;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse$Results$AllowlistSearchResults;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse$Results$AllowlistSuggestions;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public abstract class zzagj {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        androidx.window.layout.WindowMetricsCalculator.Companion.getClass();
        r7 = androidx.window.layout.WindowMetricsCalculator.Companion.$$INSTANCE;
        r7 = androidx.window.layout.WindowMetricsCalculator.Companion.windowMetricsCalculatorCompat;
        r7.getClass();
        r1 = (android.content.ContextWrapper) r0;
        r2 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r2 < 34) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        r2 = androidx.window.layout.util.DensityCompatHelperApi34Impl.INSTANCE$1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        r7 = r2.currentWindowMetrics(r1, r7.densityCompatHelper);
        r1 = (r7.getBounds().width() << 32) | (r7.getBounds().height() & org.bouncycastle.asn1.cmc.BodyPartID.bodyIdMax);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        return new androidx.compose.ui.platform.DerivedSize(r1, com.squareup.util.Strings.Density(r0).mo234toDpSizekrfVVM(com.squareup.util.cash.Countries.m3991toSizeozmzZPI(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r2 < 30) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r2 = androidx.window.layout.util.BoundsHelperApi30Impl.INSTANCE$1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        r2 = androidx.window.layout.util.BoundsHelperApi28Impl.INSTANCE$3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final DerivedSize calculateWindowSize(View view) {
        Context context = view.getContext();
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if ((context2 instanceof Activity) || (context2 instanceof InputMethodService) || (context2 instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context2 = contextWrapper.getBaseContext();
        }
        context2 = null;
        Configuration configuration = context.getResources().getConfiguration();
        DensityWithConverter Density = Strings.Density(context);
        long m1091DpSizeYgX7TsA = BundleKt.m1091DpSizeYgX7TsA(configuration.screenWidthDp, configuration.screenHeightDp);
        return new DerivedSize(Countries.m3990toIntSizeuvyYCjk(Density.mo237toSizeXkaWNTQ(m1091DpSizeYgX7TsA)), m1091DpSizeYgX7TsA);
    }

    public static final AllowlistSearchResponse withUpdatedResults(AllowlistSearchResponse allowlistSearchResponse, AllowlistSearchResponse.AllowlistSuggestions allowlistSuggestions, AllowlistSearchResponse.AllowlistSearchResults allowlistSearchResults) {
        LocalBrandBanner.Action allowlistSearchResponse$Results$AllowlistSearchResults;
        allowlistSearchResponse.getClass();
        LocalBrandBanner.Action action = allowlistSearchResponse.results;
        if (action instanceof AllowlistSearchResponse$Results$AllowlistSuggestions) {
            if (allowlistSuggestions != null) {
                allowlistSearchResponse$Results$AllowlistSearchResults = new AllowlistSearchResponse$Results$AllowlistSuggestions(allowlistSuggestions);
            }
            allowlistSearchResponse$Results$AllowlistSearchResults = null;
        } else {
            if (action instanceof AllowlistSearchResponse$Results$AllowlistSearchResults) {
                if (allowlistSearchResults != null) {
                    allowlistSearchResponse$Results$AllowlistSearchResults = new AllowlistSearchResponse$Results$AllowlistSearchResults(allowlistSearchResults);
                }
            } else if (action != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            allowlistSearchResponse$Results$AllowlistSearchResults = null;
        }
        return AllowlistSearchResponse.copy$default(allowlistSearchResponse, allowlistSearchResponse$Results$AllowlistSearchResults, null, 2);
    }
}
