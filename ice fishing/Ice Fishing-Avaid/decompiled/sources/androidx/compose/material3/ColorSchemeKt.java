package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.MotionEventCompat;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* compiled from: ColorScheme.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aí\u0003\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u0003¢\u0006\u0004\b3\u00104\u001aí\u0003\u00105\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u0003¢\u0006\u0004\b6\u00104\u001a\u001b\u00107\u001a\u00020\u0003*\u00020\u00012\u0006\u00108\u001a\u00020\u0003H\u0007¢\u0006\u0004\b9\u0010:\u001a\u0017\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0003H\u0007¢\u0006\u0004\b;\u0010<\u001a\u001b\u0010=\u001a\u00020\u0003*\u00020\u00012\u0006\u0010>\u001a\u00020?H\u0007¢\u0006\u0004\b@\u0010A\u001a\b\u0010B\u001a\u00020\u0001H\u0007\u001a÷\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u0003H\u0007¢\u0006\u0004\bC\u0010D\u001a±\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007¢\u0006\u0004\bE\u0010F\u001a÷\u0002\u00105\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u0003H\u0007¢\u0006\u0004\bG\u0010D\u001a±\u0002\u00105\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007¢\u0006\u0004\bH\u0010F\u001a\u0019\u0010I\u001a\u00020\u0003*\u00020\u00012\u0006\u0010J\u001a\u00020KH\u0001¢\u0006\u0002\u0010L\u001a#\u0010Q\u001a\u00020\u0003*\u00020\u00012\u0006\u00108\u001a\u00020\u00032\u0006\u0010>\u001a\u00020?H\u0001¢\u0006\u0004\bR\u0010S\"\u000e\u0010M\u001a\u00020NX\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010J\u001a\u00020\u0003*\u00020K8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P\"\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020V0U¢\u0006\b\n\u0000\u001a\u0004\bW\u0010X¨\u0006Y"}, d2 = {"lightColorScheme", "Landroidx/compose/material3/ColorScheme;", "primary", "Landroidx/compose/ui/graphics/Color;", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "primaryFixed", "primaryFixedDim", "onPrimaryFixed", "onPrimaryFixedVariant", "secondaryFixed", "secondaryFixedDim", "onSecondaryFixed", "onSecondaryFixedVariant", "tertiaryFixed", "tertiaryFixedDim", "onTertiaryFixed", "onTertiaryFixedVariant", "lightColorScheme-_VG5OTI", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "darkColorScheme", "darkColorScheme-_VG5OTI", "contentColorFor", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "surfaceColorAtElevation", "elevation", "Landroidx/compose/ui/unit/Dp;", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "expressiveLightColorScheme", "lightColorScheme-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "lightColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "darkColorScheme-C-Xl9yA", "darkColorScheme-G1PFc-w", "fromToken", "value", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "DisabledAlpha", "", "getValue", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "applyTonalElevation", "applyTonalElevation-RFCenO8", "(Landroidx/compose/material3/ColorScheme;JFLandroidx/compose/runtime/Composer;I)J", "LocalTonalElevationEnabled", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalTonalElevationEnabled", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<Boolean> LocalTonalElevationEnabled = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.material3.ColorSchemeKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            boolean LocalTonalElevationEnabled$lambda$0;
            LocalTonalElevationEnabled$lambda$0 = ColorSchemeKt.LocalTonalElevationEnabled$lambda$0();
            return Boolean.valueOf(LocalTonalElevationEnabled$lambda$0);
        }
    });

    /* compiled from: ColorScheme.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryFixed.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryFixedDim.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryFixed.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryFixedVariant.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryFixed.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryFixedDim.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryFixed.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryFixedVariant.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryFixed.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryFixedDim.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryFixed.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryFixedVariant.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalTonalElevationEnabled$lambda$0() {
        return true;
    }

    /* renamed from: lightColorScheme-_VG5OTI$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2796lightColorScheme_VG5OTI$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, int i, int i2, Object obj) {
        long m5098getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m5098getPrimary0d7_KjU() : j;
        long m5082getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorLightTokens.INSTANCE.m5082getOnPrimary0d7_KjU() : j2;
        long m5099getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorLightTokens.INSTANCE.m5099getPrimaryContainer0d7_KjU() : j3;
        long m5083getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorLightTokens.INSTANCE.m5083getOnPrimaryContainer0d7_KjU() : j4;
        long m5077getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorLightTokens.INSTANCE.m5077getInversePrimary0d7_KjU() : j5;
        long m5103getSecondary0d7_KjU = (i & 32) != 0 ? ColorLightTokens.INSTANCE.m5103getSecondary0d7_KjU() : j6;
        long m5086getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorLightTokens.INSTANCE.m5086getOnSecondary0d7_KjU() : j7;
        long j49 = m5098getPrimary0d7_KjU;
        long m5104getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorLightTokens.INSTANCE.m5104getSecondaryContainer0d7_KjU() : j8;
        long m5087getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorLightTokens.INSTANCE.m5087getOnSecondaryContainer0d7_KjU() : j9;
        long m5117getTertiary0d7_KjU = (i & 512) != 0 ? ColorLightTokens.INSTANCE.m5117getTertiary0d7_KjU() : j10;
        long m5092getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorLightTokens.INSTANCE.m5092getOnTertiary0d7_KjU() : j11;
        long m5118getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorLightTokens.INSTANCE.m5118getTertiaryContainer0d7_KjU() : j12;
        long m5093getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorLightTokens.INSTANCE.m5093getOnTertiaryContainer0d7_KjU() : j13;
        long m5073getBackground0d7_KjU = (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m5073getBackground0d7_KjU() : j14;
        long m5079getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorLightTokens.INSTANCE.m5079getOnBackground0d7_KjU() : j15;
        long m5107getSurface0d7_KjU = (i & 32768) != 0 ? ColorLightTokens.INSTANCE.m5107getSurface0d7_KjU() : j16;
        long m5090getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m5090getOnSurface0d7_KjU() : j17;
        long m5116getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorLightTokens.INSTANCE.m5116getSurfaceVariant0d7_KjU() : j18;
        long m5091getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorLightTokens.INSTANCE.m5091getOnSurfaceVariant0d7_KjU() : j19;
        long j50 = (i & 524288) != 0 ? j49 : j20;
        long m5078getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorLightTokens.INSTANCE.m5078getInverseSurface0d7_KjU() : j21;
        long m5076getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorLightTokens.INSTANCE.m5076getInverseOnSurface0d7_KjU() : j22;
        long m5074getError0d7_KjU = (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m5074getError0d7_KjU() : j23;
        long m5080getOnError0d7_KjU = (i & 8388608) != 0 ? ColorLightTokens.INSTANCE.m5080getOnError0d7_KjU() : j24;
        long m5075getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorLightTokens.INSTANCE.m5075getErrorContainer0d7_KjU() : j25;
        long m5081getOnErrorContainer0d7_KjU = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorLightTokens.INSTANCE.m5081getOnErrorContainer0d7_KjU() : j26;
        long m5096getOutline0d7_KjU = (i & 67108864) != 0 ? ColorLightTokens.INSTANCE.m5096getOutline0d7_KjU() : j27;
        long m5097getOutlineVariant0d7_KjU = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? ColorLightTokens.INSTANCE.m5097getOutlineVariant0d7_KjU() : j28;
        long m5102getScrim0d7_KjU = (i & GroupFlagsKt.IsMovableContentFlag) != 0 ? ColorLightTokens.INSTANCE.m5102getScrim0d7_KjU() : j29;
        long m5108getSurfaceBright0d7_KjU = (i & GroupFlagsKt.HasMovableContentFlag) != 0 ? ColorLightTokens.INSTANCE.m5108getSurfaceBright0d7_KjU() : j30;
        long m5109getSurfaceContainer0d7_KjU = (i & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? ColorLightTokens.INSTANCE.m5109getSurfaceContainer0d7_KjU() : j31;
        long m5110getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m5110getSurfaceContainerHigh0d7_KjU() : j32;
        long m5111getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m5111getSurfaceContainerHighest0d7_KjU() : j33;
        long m5112getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m5112getSurfaceContainerLow0d7_KjU() : j34;
        long m5113getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m5113getSurfaceContainerLowest0d7_KjU() : j35;
        long m5114getSurfaceDim0d7_KjU = (i2 & 8) != 0 ? ColorLightTokens.INSTANCE.m5114getSurfaceDim0d7_KjU() : j36;
        long m5100getPrimaryFixed0d7_KjU = (i2 & 16) != 0 ? ColorLightTokens.INSTANCE.m5100getPrimaryFixed0d7_KjU() : j37;
        long m5101getPrimaryFixedDim0d7_KjU = (i2 & 32) != 0 ? ColorLightTokens.INSTANCE.m5101getPrimaryFixedDim0d7_KjU() : j38;
        long m5084getOnPrimaryFixed0d7_KjU = (i2 & 64) != 0 ? ColorLightTokens.INSTANCE.m5084getOnPrimaryFixed0d7_KjU() : j39;
        long m5085getOnPrimaryFixedVariant0d7_KjU = (i2 & 128) != 0 ? ColorLightTokens.INSTANCE.m5085getOnPrimaryFixedVariant0d7_KjU() : j40;
        long m5105getSecondaryFixed0d7_KjU = (i2 & 256) != 0 ? ColorLightTokens.INSTANCE.m5105getSecondaryFixed0d7_KjU() : j41;
        long m5106getSecondaryFixedDim0d7_KjU = (i2 & 512) != 0 ? ColorLightTokens.INSTANCE.m5106getSecondaryFixedDim0d7_KjU() : j42;
        long m5088getOnSecondaryFixed0d7_KjU = (i2 & 1024) != 0 ? ColorLightTokens.INSTANCE.m5088getOnSecondaryFixed0d7_KjU() : j43;
        long m5089getOnSecondaryFixedVariant0d7_KjU = (i2 & 2048) != 0 ? ColorLightTokens.INSTANCE.m5089getOnSecondaryFixedVariant0d7_KjU() : j44;
        long m5119getTertiaryFixed0d7_KjU = (i2 & 4096) != 0 ? ColorLightTokens.INSTANCE.m5119getTertiaryFixed0d7_KjU() : j45;
        long m5120getTertiaryFixedDim0d7_KjU = (i2 & 8192) != 0 ? ColorLightTokens.INSTANCE.m5120getTertiaryFixedDim0d7_KjU() : j46;
        long m5094getOnTertiaryFixed0d7_KjU = (i2 & 16384) != 0 ? ColorLightTokens.INSTANCE.m5094getOnTertiaryFixed0d7_KjU() : j47;
        if ((i2 & 32768) != 0) {
            j48 = ColorLightTokens.INSTANCE.m5095getOnTertiaryFixedVariant0d7_KjU();
        }
        return m2795lightColorScheme_VG5OTI(j49, m5082getOnPrimary0d7_KjU, m5099getPrimaryContainer0d7_KjU, m5083getOnPrimaryContainer0d7_KjU, m5077getInversePrimary0d7_KjU, m5103getSecondary0d7_KjU, m5086getOnSecondary0d7_KjU, m5104getSecondaryContainer0d7_KjU, m5087getOnSecondaryContainer0d7_KjU, m5117getTertiary0d7_KjU, m5092getOnTertiary0d7_KjU, m5118getTertiaryContainer0d7_KjU, m5093getOnTertiaryContainer0d7_KjU, m5073getBackground0d7_KjU, m5079getOnBackground0d7_KjU, m5107getSurface0d7_KjU, m5090getOnSurface0d7_KjU, m5116getSurfaceVariant0d7_KjU, m5091getOnSurfaceVariant0d7_KjU, j50, m5078getInverseSurface0d7_KjU, m5076getInverseOnSurface0d7_KjU, m5074getError0d7_KjU, m5080getOnError0d7_KjU, m5075getErrorContainer0d7_KjU, m5081getOnErrorContainer0d7_KjU, m5096getOutline0d7_KjU, m5097getOutlineVariant0d7_KjU, m5102getScrim0d7_KjU, m5108getSurfaceBright0d7_KjU, m5109getSurfaceContainer0d7_KjU, m5110getSurfaceContainerHigh0d7_KjU, m5111getSurfaceContainerHighest0d7_KjU, m5112getSurfaceContainerLow0d7_KjU, m5113getSurfaceContainerLowest0d7_KjU, m5114getSurfaceDim0d7_KjU, m5100getPrimaryFixed0d7_KjU, m5101getPrimaryFixedDim0d7_KjU, m5084getOnPrimaryFixed0d7_KjU, m5085getOnPrimaryFixedVariant0d7_KjU, m5105getSecondaryFixed0d7_KjU, m5106getSecondaryFixedDim0d7_KjU, m5088getOnSecondaryFixed0d7_KjU, m5089getOnSecondaryFixedVariant0d7_KjU, m5119getTertiaryFixed0d7_KjU, m5120getTertiaryFixedDim0d7_KjU, m5094getOnTertiaryFixed0d7_KjU, j48);
    }

    /* renamed from: lightColorScheme-_VG5OTI, reason: not valid java name */
    public static final ColorScheme m2795lightColorScheme_VG5OTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, null);
    }

    /* renamed from: darkColorScheme-_VG5OTI$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2790darkColorScheme_VG5OTI$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, int i, int i2, Object obj) {
        long m5050getPrimary0d7_KjU = (i & 1) != 0 ? ColorDarkTokens.INSTANCE.m5050getPrimary0d7_KjU() : j;
        long m5034getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorDarkTokens.INSTANCE.m5034getOnPrimary0d7_KjU() : j2;
        long m5051getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorDarkTokens.INSTANCE.m5051getPrimaryContainer0d7_KjU() : j3;
        long m5035getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorDarkTokens.INSTANCE.m5035getOnPrimaryContainer0d7_KjU() : j4;
        long m5029getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorDarkTokens.INSTANCE.m5029getInversePrimary0d7_KjU() : j5;
        long m5055getSecondary0d7_KjU = (i & 32) != 0 ? ColorDarkTokens.INSTANCE.m5055getSecondary0d7_KjU() : j6;
        long m5038getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorDarkTokens.INSTANCE.m5038getOnSecondary0d7_KjU() : j7;
        long j49 = m5050getPrimary0d7_KjU;
        long m5056getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorDarkTokens.INSTANCE.m5056getSecondaryContainer0d7_KjU() : j8;
        long m5039getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorDarkTokens.INSTANCE.m5039getOnSecondaryContainer0d7_KjU() : j9;
        long m5069getTertiary0d7_KjU = (i & 512) != 0 ? ColorDarkTokens.INSTANCE.m5069getTertiary0d7_KjU() : j10;
        long m5044getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorDarkTokens.INSTANCE.m5044getOnTertiary0d7_KjU() : j11;
        long m5070getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorDarkTokens.INSTANCE.m5070getTertiaryContainer0d7_KjU() : j12;
        long m5045getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorDarkTokens.INSTANCE.m5045getOnTertiaryContainer0d7_KjU() : j13;
        long m5025getBackground0d7_KjU = (i & 8192) != 0 ? ColorDarkTokens.INSTANCE.m5025getBackground0d7_KjU() : j14;
        long m5031getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorDarkTokens.INSTANCE.m5031getOnBackground0d7_KjU() : j15;
        long m5059getSurface0d7_KjU = (i & 32768) != 0 ? ColorDarkTokens.INSTANCE.m5059getSurface0d7_KjU() : j16;
        long m5042getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorDarkTokens.INSTANCE.m5042getOnSurface0d7_KjU() : j17;
        long m5068getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorDarkTokens.INSTANCE.m5068getSurfaceVariant0d7_KjU() : j18;
        long m5043getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorDarkTokens.INSTANCE.m5043getOnSurfaceVariant0d7_KjU() : j19;
        long j50 = (i & 524288) != 0 ? j49 : j20;
        long m5030getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m5030getInverseSurface0d7_KjU() : j21;
        long m5028getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m5028getInverseOnSurface0d7_KjU() : j22;
        long m5026getError0d7_KjU = (i & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m5026getError0d7_KjU() : j23;
        long m5032getOnError0d7_KjU = (i & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m5032getOnError0d7_KjU() : j24;
        long m5027getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m5027getErrorContainer0d7_KjU() : j25;
        long m5033getOnErrorContainer0d7_KjU = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorDarkTokens.INSTANCE.m5033getOnErrorContainer0d7_KjU() : j26;
        long m5048getOutline0d7_KjU = (i & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m5048getOutline0d7_KjU() : j27;
        long m5049getOutlineVariant0d7_KjU = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? ColorDarkTokens.INSTANCE.m5049getOutlineVariant0d7_KjU() : j28;
        long m5054getScrim0d7_KjU = (i & GroupFlagsKt.IsMovableContentFlag) != 0 ? ColorDarkTokens.INSTANCE.m5054getScrim0d7_KjU() : j29;
        long m5060getSurfaceBright0d7_KjU = (i & GroupFlagsKt.HasMovableContentFlag) != 0 ? ColorDarkTokens.INSTANCE.m5060getSurfaceBright0d7_KjU() : j30;
        long m5061getSurfaceContainer0d7_KjU = (i & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? ColorDarkTokens.INSTANCE.m5061getSurfaceContainer0d7_KjU() : j31;
        long m5062getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m5062getSurfaceContainerHigh0d7_KjU() : j32;
        long m5063getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorDarkTokens.INSTANCE.m5063getSurfaceContainerHighest0d7_KjU() : j33;
        long m5064getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorDarkTokens.INSTANCE.m5064getSurfaceContainerLow0d7_KjU() : j34;
        long m5065getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorDarkTokens.INSTANCE.m5065getSurfaceContainerLowest0d7_KjU() : j35;
        long m5066getSurfaceDim0d7_KjU = (i2 & 8) != 0 ? ColorDarkTokens.INSTANCE.m5066getSurfaceDim0d7_KjU() : j36;
        long m5052getPrimaryFixed0d7_KjU = (i2 & 16) != 0 ? ColorDarkTokens.INSTANCE.m5052getPrimaryFixed0d7_KjU() : j37;
        long m5053getPrimaryFixedDim0d7_KjU = (i2 & 32) != 0 ? ColorDarkTokens.INSTANCE.m5053getPrimaryFixedDim0d7_KjU() : j38;
        long m5036getOnPrimaryFixed0d7_KjU = (i2 & 64) != 0 ? ColorDarkTokens.INSTANCE.m5036getOnPrimaryFixed0d7_KjU() : j39;
        long m5037getOnPrimaryFixedVariant0d7_KjU = (i2 & 128) != 0 ? ColorDarkTokens.INSTANCE.m5037getOnPrimaryFixedVariant0d7_KjU() : j40;
        long m5057getSecondaryFixed0d7_KjU = (i2 & 256) != 0 ? ColorDarkTokens.INSTANCE.m5057getSecondaryFixed0d7_KjU() : j41;
        long m5058getSecondaryFixedDim0d7_KjU = (i2 & 512) != 0 ? ColorDarkTokens.INSTANCE.m5058getSecondaryFixedDim0d7_KjU() : j42;
        long m5040getOnSecondaryFixed0d7_KjU = (i2 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m5040getOnSecondaryFixed0d7_KjU() : j43;
        long m5041getOnSecondaryFixedVariant0d7_KjU = (i2 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m5041getOnSecondaryFixedVariant0d7_KjU() : j44;
        long m5071getTertiaryFixed0d7_KjU = (i2 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m5071getTertiaryFixed0d7_KjU() : j45;
        long m5072getTertiaryFixedDim0d7_KjU = (i2 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m5072getTertiaryFixedDim0d7_KjU() : j46;
        long m5046getOnTertiaryFixed0d7_KjU = (i2 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m5046getOnTertiaryFixed0d7_KjU() : j47;
        if ((i2 & 32768) != 0) {
            j48 = ColorDarkTokens.INSTANCE.m5047getOnTertiaryFixedVariant0d7_KjU();
        }
        return m2789darkColorScheme_VG5OTI(j49, m5034getOnPrimary0d7_KjU, m5051getPrimaryContainer0d7_KjU, m5035getOnPrimaryContainer0d7_KjU, m5029getInversePrimary0d7_KjU, m5055getSecondary0d7_KjU, m5038getOnSecondary0d7_KjU, m5056getSecondaryContainer0d7_KjU, m5039getOnSecondaryContainer0d7_KjU, m5069getTertiary0d7_KjU, m5044getOnTertiary0d7_KjU, m5070getTertiaryContainer0d7_KjU, m5045getOnTertiaryContainer0d7_KjU, m5025getBackground0d7_KjU, m5031getOnBackground0d7_KjU, m5059getSurface0d7_KjU, m5042getOnSurface0d7_KjU, m5068getSurfaceVariant0d7_KjU, m5043getOnSurfaceVariant0d7_KjU, j50, m5030getInverseSurface0d7_KjU, m5028getInverseOnSurface0d7_KjU, m5026getError0d7_KjU, m5032getOnError0d7_KjU, m5027getErrorContainer0d7_KjU, m5033getOnErrorContainer0d7_KjU, m5048getOutline0d7_KjU, m5049getOutlineVariant0d7_KjU, m5054getScrim0d7_KjU, m5060getSurfaceBright0d7_KjU, m5061getSurfaceContainer0d7_KjU, m5062getSurfaceContainerHigh0d7_KjU, m5063getSurfaceContainerHighest0d7_KjU, m5064getSurfaceContainerLow0d7_KjU, m5065getSurfaceContainerLowest0d7_KjU, m5066getSurfaceDim0d7_KjU, m5052getPrimaryFixed0d7_KjU, m5053getPrimaryFixedDim0d7_KjU, m5036getOnPrimaryFixed0d7_KjU, m5037getOnPrimaryFixedVariant0d7_KjU, m5057getSecondaryFixed0d7_KjU, m5058getSecondaryFixedDim0d7_KjU, m5040getOnSecondaryFixed0d7_KjU, m5041getOnSecondaryFixedVariant0d7_KjU, m5071getTertiaryFixed0d7_KjU, m5072getTertiaryFixedDim0d7_KjU, m5046getOnTertiaryFixed0d7_KjU, j48);
    }

    /* renamed from: darkColorScheme-_VG5OTI, reason: not valid java name */
    public static final ColorScheme m2789darkColorScheme_VG5OTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, null);
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m2783contentColorFor4WTKRHQ(ColorScheme colorScheme, long j) {
        if (Color.m6787equalsimpl0(j, colorScheme.getPrimary())) {
            return colorScheme.getOnPrimary();
        }
        if (Color.m6787equalsimpl0(j, colorScheme.getSecondary())) {
            return colorScheme.getOnSecondary();
        }
        if (Color.m6787equalsimpl0(j, colorScheme.getTertiary())) {
            return colorScheme.getOnTertiary();
        }
        if (Color.m6787equalsimpl0(j, colorScheme.getBackground())) {
            return colorScheme.getOnBackground();
        }
        if (Color.m6787equalsimpl0(j, colorScheme.getError())) {
            return colorScheme.getOnError();
        }
        if (Color.m6787equalsimpl0(j, colorScheme.getPrimaryContainer())) {
            return colorScheme.getOnPrimaryContainer();
        }
        if (Color.m6787equalsimpl0(j, colorScheme.getSecondaryContainer())) {
            return colorScheme.getOnSecondaryContainer();
        }
        if (Color.m6787equalsimpl0(j, colorScheme.getTertiaryContainer())) {
            return colorScheme.getOnTertiaryContainer();
        }
        if (Color.m6787equalsimpl0(j, colorScheme.getErrorContainer())) {
            return colorScheme.getOnErrorContainer();
        }
        if (Color.m6787equalsimpl0(j, colorScheme.getInverseSurface())) {
            return colorScheme.getInverseOnSurface();
        }
        if (Color.m6787equalsimpl0(j, colorScheme.getSurface())) {
            return colorScheme.getOnSurface();
        }
        if (Color.m6787equalsimpl0(j, colorScheme.getSurfaceVariant())) {
            return colorScheme.getOnSurfaceVariant();
        }
        if (!Color.m6787equalsimpl0(j, colorScheme.getSurfaceBright()) && !Color.m6787equalsimpl0(j, colorScheme.getSurfaceContainer()) && !Color.m6787equalsimpl0(j, colorScheme.getSurfaceContainerHigh()) && !Color.m6787equalsimpl0(j, colorScheme.getSurfaceContainerHighest()) && !Color.m6787equalsimpl0(j, colorScheme.getSurfaceContainerLow()) && !Color.m6787equalsimpl0(j, colorScheme.getSurfaceContainerLowest()) && !Color.m6787equalsimpl0(j, colorScheme.getSurfaceDim())) {
            if (!Color.m6787equalsimpl0(j, colorScheme.getPrimaryFixed()) && !Color.m6787equalsimpl0(j, colorScheme.getPrimaryFixedDim())) {
                if (!Color.m6787equalsimpl0(j, colorScheme.getSecondaryFixed()) && !Color.m6787equalsimpl0(j, colorScheme.getSecondaryFixedDim())) {
                    if (!Color.m6787equalsimpl0(j, colorScheme.getTertiaryFixed()) && !Color.m6787equalsimpl0(j, colorScheme.getTertiaryFixedDim())) {
                        return Color.INSTANCE.m6822getUnspecified0d7_KjU();
                    }
                    return colorScheme.getOnTertiaryFixed();
                }
                return colorScheme.getOnSecondaryFixed();
            }
            return colorScheme.getOnPrimaryFixed();
        }
        return colorScheme.getOnSurface();
    }

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m2784contentColorForek8zF_U(long j, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 509589638, "C(contentColorFor)N(backgroundColor:c#ui.graphics.Color)1125@51799L11:ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:1125)");
        }
        composer.startReplaceGroup(89373914);
        ComposerKt.sourceInformation(composer, "*1126@51883L7");
        long m2783contentColorFor4WTKRHQ = m2783contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j);
        if (m2783contentColorFor4WTKRHQ == 16) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            m2783contentColorFor4WTKRHQ = ((Color) consume).m6796unboximpl();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2783contentColorFor4WTKRHQ;
    }

    public static final ColorScheme expressiveLightColorScheme() {
        return m2796lightColorScheme_VG5OTI$default(0L, 0L, 0L, PaletteTokens.INSTANCE.m5485getPrimary300d7_KjU(), 0L, 0L, 0L, 0L, PaletteTokens.INSTANCE.m5498getSecondary300d7_KjU(), 0L, 0L, 0L, PaletteTokens.INSTANCE.m5511getTertiary300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, PaletteTokens.INSTANCE.m5435getError300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -33558793, SupportMenu.USER_MASK, null);
    }

    /* renamed from: lightColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2792lightColorSchemeCXl9yA$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i2, Object obj) {
        long m5098getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m5098getPrimary0d7_KjU() : j;
        long m5082getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorLightTokens.INSTANCE.m5082getOnPrimary0d7_KjU() : j2;
        long m5099getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorLightTokens.INSTANCE.m5099getPrimaryContainer0d7_KjU() : j3;
        long m5083getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorLightTokens.INSTANCE.m5083getOnPrimaryContainer0d7_KjU() : j4;
        long m5077getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorLightTokens.INSTANCE.m5077getInversePrimary0d7_KjU() : j5;
        long m5103getSecondary0d7_KjU = (i & 32) != 0 ? ColorLightTokens.INSTANCE.m5103getSecondary0d7_KjU() : j6;
        long m5086getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorLightTokens.INSTANCE.m5086getOnSecondary0d7_KjU() : j7;
        long m5104getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorLightTokens.INSTANCE.m5104getSecondaryContainer0d7_KjU() : j8;
        long j37 = m5098getPrimary0d7_KjU;
        long m5087getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorLightTokens.INSTANCE.m5087getOnSecondaryContainer0d7_KjU() : j9;
        long m5117getTertiary0d7_KjU = (i & 512) != 0 ? ColorLightTokens.INSTANCE.m5117getTertiary0d7_KjU() : j10;
        long m5092getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorLightTokens.INSTANCE.m5092getOnTertiary0d7_KjU() : j11;
        long m5118getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorLightTokens.INSTANCE.m5118getTertiaryContainer0d7_KjU() : j12;
        long m5093getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorLightTokens.INSTANCE.m5093getOnTertiaryContainer0d7_KjU() : j13;
        long m5073getBackground0d7_KjU = (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m5073getBackground0d7_KjU() : j14;
        long m5079getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorLightTokens.INSTANCE.m5079getOnBackground0d7_KjU() : j15;
        long m5107getSurface0d7_KjU = (i & 32768) != 0 ? ColorLightTokens.INSTANCE.m5107getSurface0d7_KjU() : j16;
        long m5090getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m5090getOnSurface0d7_KjU() : j17;
        long m5116getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorLightTokens.INSTANCE.m5116getSurfaceVariant0d7_KjU() : j18;
        long m5091getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorLightTokens.INSTANCE.m5091getOnSurfaceVariant0d7_KjU() : j19;
        long j38 = (i & 524288) != 0 ? j37 : j20;
        long m5078getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorLightTokens.INSTANCE.m5078getInverseSurface0d7_KjU() : j21;
        long m5076getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorLightTokens.INSTANCE.m5076getInverseOnSurface0d7_KjU() : j22;
        long m5074getError0d7_KjU = (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m5074getError0d7_KjU() : j23;
        long m5080getOnError0d7_KjU = (i & 8388608) != 0 ? ColorLightTokens.INSTANCE.m5080getOnError0d7_KjU() : j24;
        long m5075getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorLightTokens.INSTANCE.m5075getErrorContainer0d7_KjU() : j25;
        long m5081getOnErrorContainer0d7_KjU = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorLightTokens.INSTANCE.m5081getOnErrorContainer0d7_KjU() : j26;
        long m5096getOutline0d7_KjU = (i & 67108864) != 0 ? ColorLightTokens.INSTANCE.m5096getOutline0d7_KjU() : j27;
        long m5097getOutlineVariant0d7_KjU = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? ColorLightTokens.INSTANCE.m5097getOutlineVariant0d7_KjU() : j28;
        long m5102getScrim0d7_KjU = (i & GroupFlagsKt.IsMovableContentFlag) != 0 ? ColorLightTokens.INSTANCE.m5102getScrim0d7_KjU() : j29;
        long m5108getSurfaceBright0d7_KjU = (i & GroupFlagsKt.HasMovableContentFlag) != 0 ? ColorLightTokens.INSTANCE.m5108getSurfaceBright0d7_KjU() : j30;
        long m5109getSurfaceContainer0d7_KjU = (i & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? ColorLightTokens.INSTANCE.m5109getSurfaceContainer0d7_KjU() : j31;
        long m5110getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m5110getSurfaceContainerHigh0d7_KjU() : j32;
        long m5111getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m5111getSurfaceContainerHighest0d7_KjU() : j33;
        long m5112getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m5112getSurfaceContainerLow0d7_KjU() : j34;
        long m5113getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m5113getSurfaceContainerLowest0d7_KjU() : j35;
        if ((i2 & 8) != 0) {
            j36 = ColorLightTokens.INSTANCE.m5114getSurfaceDim0d7_KjU();
        }
        return m2791lightColorSchemeCXl9yA(j37, m5082getOnPrimary0d7_KjU, m5099getPrimaryContainer0d7_KjU, m5083getOnPrimaryContainer0d7_KjU, m5077getInversePrimary0d7_KjU, m5103getSecondary0d7_KjU, m5086getOnSecondary0d7_KjU, m5104getSecondaryContainer0d7_KjU, m5087getOnSecondaryContainer0d7_KjU, m5117getTertiary0d7_KjU, m5092getOnTertiary0d7_KjU, m5118getTertiaryContainer0d7_KjU, m5093getOnTertiaryContainer0d7_KjU, m5073getBackground0d7_KjU, m5079getOnBackground0d7_KjU, m5107getSurface0d7_KjU, m5090getOnSurface0d7_KjU, m5116getSurfaceVariant0d7_KjU, m5091getOnSurfaceVariant0d7_KjU, j38, m5078getInverseSurface0d7_KjU, m5076getInverseOnSurface0d7_KjU, m5074getError0d7_KjU, m5080getOnError0d7_KjU, m5075getErrorContainer0d7_KjU, m5081getOnErrorContainer0d7_KjU, m5096getOutline0d7_KjU, m5097getOutlineVariant0d7_KjU, m5102getScrim0d7_KjU, m5108getSurfaceBright0d7_KjU, m5109getSurfaceContainer0d7_KjU, m5110getSurfaceContainerHigh0d7_KjU, m5111getSurfaceContainerHighest0d7_KjU, m5112getSurfaceContainerLow0d7_KjU, m5113getSurfaceContainerLowest0d7_KjU, j36);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional Fixed roles instead")
    /* renamed from: lightColorScheme-C-Xl9yA, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m2791lightColorSchemeCXl9yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return m2796lightColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2794lightColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        long m5098getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m5098getPrimary0d7_KjU() : j;
        long m5082getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorLightTokens.INSTANCE.m5082getOnPrimary0d7_KjU() : j2;
        long m5099getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorLightTokens.INSTANCE.m5099getPrimaryContainer0d7_KjU() : j3;
        long m5083getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorLightTokens.INSTANCE.m5083getOnPrimaryContainer0d7_KjU() : j4;
        long m5077getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorLightTokens.INSTANCE.m5077getInversePrimary0d7_KjU() : j5;
        long m5103getSecondary0d7_KjU = (i & 32) != 0 ? ColorLightTokens.INSTANCE.m5103getSecondary0d7_KjU() : j6;
        long m5086getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorLightTokens.INSTANCE.m5086getOnSecondary0d7_KjU() : j7;
        long m5104getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorLightTokens.INSTANCE.m5104getSecondaryContainer0d7_KjU() : j8;
        long j30 = m5098getPrimary0d7_KjU;
        long m5087getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorLightTokens.INSTANCE.m5087getOnSecondaryContainer0d7_KjU() : j9;
        long m5117getTertiary0d7_KjU = (i & 512) != 0 ? ColorLightTokens.INSTANCE.m5117getTertiary0d7_KjU() : j10;
        long m5092getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorLightTokens.INSTANCE.m5092getOnTertiary0d7_KjU() : j11;
        long m5118getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorLightTokens.INSTANCE.m5118getTertiaryContainer0d7_KjU() : j12;
        long m5093getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorLightTokens.INSTANCE.m5093getOnTertiaryContainer0d7_KjU() : j13;
        long m5073getBackground0d7_KjU = (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m5073getBackground0d7_KjU() : j14;
        long m5079getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorLightTokens.INSTANCE.m5079getOnBackground0d7_KjU() : j15;
        long m5107getSurface0d7_KjU = (i & 32768) != 0 ? ColorLightTokens.INSTANCE.m5107getSurface0d7_KjU() : j16;
        long m5090getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m5090getOnSurface0d7_KjU() : j17;
        long m5116getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorLightTokens.INSTANCE.m5116getSurfaceVariant0d7_KjU() : j18;
        long m5091getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorLightTokens.INSTANCE.m5091getOnSurfaceVariant0d7_KjU() : j19;
        long j31 = (i & 524288) != 0 ? j30 : j20;
        long m5078getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorLightTokens.INSTANCE.m5078getInverseSurface0d7_KjU() : j21;
        long m5076getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorLightTokens.INSTANCE.m5076getInverseOnSurface0d7_KjU() : j22;
        long m5074getError0d7_KjU = (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m5074getError0d7_KjU() : j23;
        long m5080getOnError0d7_KjU = (i & 8388608) != 0 ? ColorLightTokens.INSTANCE.m5080getOnError0d7_KjU() : j24;
        long m5075getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorLightTokens.INSTANCE.m5075getErrorContainer0d7_KjU() : j25;
        long m5081getOnErrorContainer0d7_KjU = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorLightTokens.INSTANCE.m5081getOnErrorContainer0d7_KjU() : j26;
        long m5096getOutline0d7_KjU = (i & 67108864) != 0 ? ColorLightTokens.INSTANCE.m5096getOutline0d7_KjU() : j27;
        long m5097getOutlineVariant0d7_KjU = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? ColorLightTokens.INSTANCE.m5097getOutlineVariant0d7_KjU() : j28;
        if ((i & GroupFlagsKt.IsMovableContentFlag) != 0) {
            j29 = ColorLightTokens.INSTANCE.m5102getScrim0d7_KjU();
        }
        return m2793lightColorSchemeG1PFcw(j30, m5082getOnPrimary0d7_KjU, m5099getPrimaryContainer0d7_KjU, m5083getOnPrimaryContainer0d7_KjU, m5077getInversePrimary0d7_KjU, m5103getSecondary0d7_KjU, m5086getOnSecondary0d7_KjU, m5104getSecondaryContainer0d7_KjU, m5087getOnSecondaryContainer0d7_KjU, m5117getTertiary0d7_KjU, m5092getOnTertiary0d7_KjU, m5118getTertiaryContainer0d7_KjU, m5093getOnTertiaryContainer0d7_KjU, m5073getBackground0d7_KjU, m5079getOnBackground0d7_KjU, m5107getSurface0d7_KjU, m5090getOnSurface0d7_KjU, m5116getSurfaceVariant0d7_KjU, m5091getOnSurfaceVariant0d7_KjU, j31, m5078getInverseSurface0d7_KjU, m5076getInverseOnSurface0d7_KjU, m5074getError0d7_KjU, m5080getOnError0d7_KjU, m5075getErrorContainer0d7_KjU, m5081getOnErrorContainer0d7_KjU, m5096getOutline0d7_KjU, m5097getOutlineVariant0d7_KjU, j29);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m2793lightColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return m2796lightColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, SupportMenu.USER_MASK, null);
    }

    /* renamed from: darkColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2786darkColorSchemeCXl9yA$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i2, Object obj) {
        long m5050getPrimary0d7_KjU = (i & 1) != 0 ? ColorDarkTokens.INSTANCE.m5050getPrimary0d7_KjU() : j;
        long m5034getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorDarkTokens.INSTANCE.m5034getOnPrimary0d7_KjU() : j2;
        long m5051getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorDarkTokens.INSTANCE.m5051getPrimaryContainer0d7_KjU() : j3;
        long m5035getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorDarkTokens.INSTANCE.m5035getOnPrimaryContainer0d7_KjU() : j4;
        long m5029getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorDarkTokens.INSTANCE.m5029getInversePrimary0d7_KjU() : j5;
        long m5055getSecondary0d7_KjU = (i & 32) != 0 ? ColorDarkTokens.INSTANCE.m5055getSecondary0d7_KjU() : j6;
        long m5038getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorDarkTokens.INSTANCE.m5038getOnSecondary0d7_KjU() : j7;
        long m5056getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorDarkTokens.INSTANCE.m5056getSecondaryContainer0d7_KjU() : j8;
        long j37 = m5050getPrimary0d7_KjU;
        long m5039getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorDarkTokens.INSTANCE.m5039getOnSecondaryContainer0d7_KjU() : j9;
        long m5069getTertiary0d7_KjU = (i & 512) != 0 ? ColorDarkTokens.INSTANCE.m5069getTertiary0d7_KjU() : j10;
        long m5044getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorDarkTokens.INSTANCE.m5044getOnTertiary0d7_KjU() : j11;
        long m5070getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorDarkTokens.INSTANCE.m5070getTertiaryContainer0d7_KjU() : j12;
        long m5045getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorDarkTokens.INSTANCE.m5045getOnTertiaryContainer0d7_KjU() : j13;
        long m5025getBackground0d7_KjU = (i & 8192) != 0 ? ColorDarkTokens.INSTANCE.m5025getBackground0d7_KjU() : j14;
        long m5031getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorDarkTokens.INSTANCE.m5031getOnBackground0d7_KjU() : j15;
        long m5059getSurface0d7_KjU = (i & 32768) != 0 ? ColorDarkTokens.INSTANCE.m5059getSurface0d7_KjU() : j16;
        long m5042getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorDarkTokens.INSTANCE.m5042getOnSurface0d7_KjU() : j17;
        long m5068getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorDarkTokens.INSTANCE.m5068getSurfaceVariant0d7_KjU() : j18;
        long m5043getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorDarkTokens.INSTANCE.m5043getOnSurfaceVariant0d7_KjU() : j19;
        long j38 = (i & 524288) != 0 ? j37 : j20;
        long m5030getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m5030getInverseSurface0d7_KjU() : j21;
        long m5028getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m5028getInverseOnSurface0d7_KjU() : j22;
        long m5026getError0d7_KjU = (i & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m5026getError0d7_KjU() : j23;
        long m5032getOnError0d7_KjU = (i & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m5032getOnError0d7_KjU() : j24;
        long m5027getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m5027getErrorContainer0d7_KjU() : j25;
        long m5033getOnErrorContainer0d7_KjU = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorDarkTokens.INSTANCE.m5033getOnErrorContainer0d7_KjU() : j26;
        long m5048getOutline0d7_KjU = (i & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m5048getOutline0d7_KjU() : j27;
        long m5049getOutlineVariant0d7_KjU = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? ColorDarkTokens.INSTANCE.m5049getOutlineVariant0d7_KjU() : j28;
        long m5054getScrim0d7_KjU = (i & GroupFlagsKt.IsMovableContentFlag) != 0 ? ColorDarkTokens.INSTANCE.m5054getScrim0d7_KjU() : j29;
        long m5060getSurfaceBright0d7_KjU = (i & GroupFlagsKt.HasMovableContentFlag) != 0 ? ColorDarkTokens.INSTANCE.m5060getSurfaceBright0d7_KjU() : j30;
        long m5061getSurfaceContainer0d7_KjU = (i & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? ColorDarkTokens.INSTANCE.m5061getSurfaceContainer0d7_KjU() : j31;
        long m5062getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m5062getSurfaceContainerHigh0d7_KjU() : j32;
        long m5063getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorDarkTokens.INSTANCE.m5063getSurfaceContainerHighest0d7_KjU() : j33;
        long m5064getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorDarkTokens.INSTANCE.m5064getSurfaceContainerLow0d7_KjU() : j34;
        long m5065getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorDarkTokens.INSTANCE.m5065getSurfaceContainerLowest0d7_KjU() : j35;
        if ((i2 & 8) != 0) {
            j36 = ColorDarkTokens.INSTANCE.m5066getSurfaceDim0d7_KjU();
        }
        return m2785darkColorSchemeCXl9yA(j37, m5034getOnPrimary0d7_KjU, m5051getPrimaryContainer0d7_KjU, m5035getOnPrimaryContainer0d7_KjU, m5029getInversePrimary0d7_KjU, m5055getSecondary0d7_KjU, m5038getOnSecondary0d7_KjU, m5056getSecondaryContainer0d7_KjU, m5039getOnSecondaryContainer0d7_KjU, m5069getTertiary0d7_KjU, m5044getOnTertiary0d7_KjU, m5070getTertiaryContainer0d7_KjU, m5045getOnTertiaryContainer0d7_KjU, m5025getBackground0d7_KjU, m5031getOnBackground0d7_KjU, m5059getSurface0d7_KjU, m5042getOnSurface0d7_KjU, m5068getSurfaceVariant0d7_KjU, m5043getOnSurfaceVariant0d7_KjU, j38, m5030getInverseSurface0d7_KjU, m5028getInverseOnSurface0d7_KjU, m5026getError0d7_KjU, m5032getOnError0d7_KjU, m5027getErrorContainer0d7_KjU, m5033getOnErrorContainer0d7_KjU, m5048getOutline0d7_KjU, m5049getOutlineVariant0d7_KjU, m5054getScrim0d7_KjU, m5060getSurfaceBright0d7_KjU, m5061getSurfaceContainer0d7_KjU, m5062getSurfaceContainerHigh0d7_KjU, m5063getSurfaceContainerHighest0d7_KjU, m5064getSurfaceContainerLow0d7_KjU, m5065getSurfaceContainerLowest0d7_KjU, j36);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: darkColorScheme-C-Xl9yA, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m2785darkColorSchemeCXl9yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return m2790darkColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2788darkColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        long m5050getPrimary0d7_KjU = (i & 1) != 0 ? ColorDarkTokens.INSTANCE.m5050getPrimary0d7_KjU() : j;
        long m5034getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorDarkTokens.INSTANCE.m5034getOnPrimary0d7_KjU() : j2;
        long m5051getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorDarkTokens.INSTANCE.m5051getPrimaryContainer0d7_KjU() : j3;
        long m5035getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorDarkTokens.INSTANCE.m5035getOnPrimaryContainer0d7_KjU() : j4;
        long m5029getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorDarkTokens.INSTANCE.m5029getInversePrimary0d7_KjU() : j5;
        long m5055getSecondary0d7_KjU = (i & 32) != 0 ? ColorDarkTokens.INSTANCE.m5055getSecondary0d7_KjU() : j6;
        long m5038getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorDarkTokens.INSTANCE.m5038getOnSecondary0d7_KjU() : j7;
        long m5056getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorDarkTokens.INSTANCE.m5056getSecondaryContainer0d7_KjU() : j8;
        long j30 = m5050getPrimary0d7_KjU;
        long m5039getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorDarkTokens.INSTANCE.m5039getOnSecondaryContainer0d7_KjU() : j9;
        long m5069getTertiary0d7_KjU = (i & 512) != 0 ? ColorDarkTokens.INSTANCE.m5069getTertiary0d7_KjU() : j10;
        long m5044getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorDarkTokens.INSTANCE.m5044getOnTertiary0d7_KjU() : j11;
        long m5070getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorDarkTokens.INSTANCE.m5070getTertiaryContainer0d7_KjU() : j12;
        long m5045getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorDarkTokens.INSTANCE.m5045getOnTertiaryContainer0d7_KjU() : j13;
        long m5025getBackground0d7_KjU = (i & 8192) != 0 ? ColorDarkTokens.INSTANCE.m5025getBackground0d7_KjU() : j14;
        long m5031getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorDarkTokens.INSTANCE.m5031getOnBackground0d7_KjU() : j15;
        long m5059getSurface0d7_KjU = (i & 32768) != 0 ? ColorDarkTokens.INSTANCE.m5059getSurface0d7_KjU() : j16;
        long m5042getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorDarkTokens.INSTANCE.m5042getOnSurface0d7_KjU() : j17;
        long m5068getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorDarkTokens.INSTANCE.m5068getSurfaceVariant0d7_KjU() : j18;
        long m5043getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorDarkTokens.INSTANCE.m5043getOnSurfaceVariant0d7_KjU() : j19;
        long j31 = (i & 524288) != 0 ? j30 : j20;
        long m5030getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m5030getInverseSurface0d7_KjU() : j21;
        long m5028getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m5028getInverseOnSurface0d7_KjU() : j22;
        long m5026getError0d7_KjU = (i & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m5026getError0d7_KjU() : j23;
        long m5032getOnError0d7_KjU = (i & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m5032getOnError0d7_KjU() : j24;
        long m5027getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m5027getErrorContainer0d7_KjU() : j25;
        long m5033getOnErrorContainer0d7_KjU = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorDarkTokens.INSTANCE.m5033getOnErrorContainer0d7_KjU() : j26;
        long m5048getOutline0d7_KjU = (i & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m5048getOutline0d7_KjU() : j27;
        long m5049getOutlineVariant0d7_KjU = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? ColorDarkTokens.INSTANCE.m5049getOutlineVariant0d7_KjU() : j28;
        if ((i & GroupFlagsKt.IsMovableContentFlag) != 0) {
            j29 = ColorDarkTokens.INSTANCE.m5054getScrim0d7_KjU();
        }
        return m2787darkColorSchemeG1PFcw(j30, m5034getOnPrimary0d7_KjU, m5051getPrimaryContainer0d7_KjU, m5035getOnPrimaryContainer0d7_KjU, m5029getInversePrimary0d7_KjU, m5055getSecondary0d7_KjU, m5038getOnSecondary0d7_KjU, m5056getSecondaryContainer0d7_KjU, m5039getOnSecondaryContainer0d7_KjU, m5069getTertiary0d7_KjU, m5044getOnTertiary0d7_KjU, m5070getTertiaryContainer0d7_KjU, m5045getOnTertiaryContainer0d7_KjU, m5025getBackground0d7_KjU, m5031getOnBackground0d7_KjU, m5059getSurface0d7_KjU, m5042getOnSurface0d7_KjU, m5068getSurfaceVariant0d7_KjU, m5043getOnSurfaceVariant0d7_KjU, j31, m5030getInverseSurface0d7_KjU, m5028getInverseOnSurface0d7_KjU, m5026getError0d7_KjU, m5032getOnError0d7_KjU, m5027getErrorContainer0d7_KjU, m5033getOnErrorContainer0d7_KjU, m5048getOutline0d7_KjU, m5049getOutlineVariant0d7_KjU, j29);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m2787darkColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return m2790darkColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, SupportMenu.USER_MASK, null);
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.getBackground();
            case 2:
                return colorScheme.getError();
            case 3:
                return colorScheme.getErrorContainer();
            case 4:
                return colorScheme.getInverseOnSurface();
            case 5:
                return colorScheme.getInversePrimary();
            case 6:
                return colorScheme.getInverseSurface();
            case 7:
                return colorScheme.getOnBackground();
            case 8:
                return colorScheme.getOnError();
            case 9:
                return colorScheme.getOnErrorContainer();
            case 10:
                return colorScheme.getOnPrimary();
            case 11:
                return colorScheme.getOnPrimaryContainer();
            case 12:
                return colorScheme.getOnSecondary();
            case 13:
                return colorScheme.getOnSecondaryContainer();
            case 14:
                return colorScheme.getOnSurface();
            case 15:
                return colorScheme.getOnSurfaceVariant();
            case 16:
                return colorScheme.getSurfaceTint();
            case 17:
                return colorScheme.getOnTertiary();
            case 18:
                return colorScheme.getOnTertiaryContainer();
            case 19:
                return colorScheme.getOutline();
            case 20:
                return colorScheme.getOutlineVariant();
            case 21:
                return colorScheme.getPrimary();
            case 22:
                return colorScheme.getPrimaryContainer();
            case 23:
                return colorScheme.getScrim();
            case 24:
                return colorScheme.getSecondary();
            case 25:
                return colorScheme.getSecondaryContainer();
            case 26:
                return colorScheme.getSurface();
            case 27:
                return colorScheme.getSurfaceVariant();
            case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                return colorScheme.getSurfaceBright();
            case 29:
                return colorScheme.getSurfaceContainer();
            case 30:
                return colorScheme.getSurfaceContainerHigh();
            case 31:
                return colorScheme.getSurfaceContainerHighest();
            case 32:
                return colorScheme.getSurfaceContainerLow();
            case 33:
                return colorScheme.getSurfaceContainerLowest();
            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                return colorScheme.getSurfaceDim();
            case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                return colorScheme.getTertiary();
            case 36:
                return colorScheme.getTertiaryContainer();
            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                return colorScheme.getPrimaryFixed();
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                return colorScheme.getPrimaryFixedDim();
            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                return colorScheme.getOnPrimaryFixed();
            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                return colorScheme.getOnPrimaryFixedVariant();
            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                return colorScheme.getSecondaryFixed();
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                return colorScheme.getSecondaryFixedDim();
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                return colorScheme.getOnSecondaryFixed();
            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                return colorScheme.getOnSecondaryFixedVariant();
            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                return colorScheme.getTertiaryFixed();
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                return colorScheme.getTertiaryFixedDim();
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                return colorScheme.getOnTertiaryFixed();
            case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                return colorScheme.getOnTertiaryFixedVariant();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final long getValue(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -810780884, "C(<get-value>)1532@70382L11:ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810780884, i, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1532)");
        }
        long fromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return fromToken;
    }

    /* renamed from: applyTonalElevation-RFCenO8, reason: not valid java name */
    public static final long m2782applyTonalElevationRFCenO8(ColorScheme colorScheme, long j, float f, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1610977682, "C(applyTonalElevation)N(backgroundColor:c#ui.graphics.Color,elevation:c#ui.unit.Dp)1548@71252L7:ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610977682, i, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:1547)");
        }
        ProvidableCompositionLocal<Boolean> providableCompositionLocal = LocalTonalElevationEnabled;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        boolean booleanValue = ((Boolean) consume).booleanValue();
        if (Color.m6787equalsimpl0(j, colorScheme.getSurface()) && booleanValue) {
            j = m2797surfaceColorAtElevation3ABfNKs(colorScheme, f);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return j;
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalTonalElevationEnabled() {
        return LocalTonalElevationEnabled;
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m2797surfaceColorAtElevation3ABfNKs(ColorScheme colorScheme, float f) {
        if (Dp.m9737equalsimpl0(f, Dp.m9732constructorimpl(0))) {
            return colorScheme.getSurface();
        }
        return ColorKt.m6831compositeOverOWjLjI(Color.m6785copywmQWz5c$default(colorScheme.getSurfaceTint(), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface());
    }
}
