package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: CalendarLocale.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"defaultLocale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class CalendarLocale_androidKt {
    public static final Locale defaultLocale(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1612326743, "C(defaultLocale)26@979L7:CalendarLocale.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1612326743, i, -1, "androidx.compose.material3.defaultLocale (CalendarLocale.android.kt:26)");
        }
        CompositionLocal<androidx.compose.ui.text.intl.Locale> localLocale = CompositionLocalsKt.getLocalLocale();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localLocale);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Locale platformLocale = ((androidx.compose.ui.text.intl.Locale) consume).getPlatformLocale();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return platformLocale;
    }
}
