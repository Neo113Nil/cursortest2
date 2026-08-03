package androidx.compose.material3.internal;

import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SpreadBuilder;

/* compiled from: ProvideContentColorTextStyle.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0004\b\t\u0010\n\u001aN\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001a\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\r0\f\"\u0006\u0012\u0002\b\u00030\r2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"ProvideContentColorTextStyle", "", "contentColor", "Landroidx/compose/ui/graphics/Color;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "ProvideContentColorTextStyle-3J-VO9M", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "otherValues", "", "Landroidx/compose/runtime/ProvidedValue;", "ProvideContentColorTextStyle-KTwxG1Y", "(JLandroidx/compose/ui/text/TextStyle;[Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ProvideContentColorTextStyleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProvideContentColorTextStyle_3J_VO9M$lambda$0(long j, TextStyle textStyle, Function2 function2, int i, Composer composer, int i2) {
        m4806ProvideContentColorTextStyle3JVO9M(j, textStyle, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProvideContentColorTextStyle_KTwxG1Y$lambda$0(long j, TextStyle textStyle, ProvidedValue[] providedValueArr, Function2 function2, int i, Composer composer, int i2) {
        m4807ProvideContentColorTextStyleKTwxG1Y(j, textStyle, providedValueArr, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: ProvideContentColorTextStyle-3J-VO9M, reason: not valid java name */
    public static final void m4806ProvideContentColorTextStyle3JVO9M(final long j, final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-684938728);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideContentColorTextStyle)N(contentColor:c#ui.graphics.Color,textStyle,content)39@1492L7,40@1521L152:ProvideContentColorTextStyle.kt#mqatfk");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-684938728, i2, -1, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:38)");
            }
            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localTextStyle);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(j)), TextKt.getLocalTextStyle().provides(((TextStyle) consume).merge(textStyle))}, function2, startRestartGroup, ProvidedValue.$stable | ((i2 >> 3) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.internal.ProvideContentColorTextStyleKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ProvideContentColorTextStyle_3J_VO9M$lambda$0;
                    ProvideContentColorTextStyle_3J_VO9M$lambda$0 = ProvideContentColorTextStyleKt.ProvideContentColorTextStyle_3J_VO9M$lambda$0(j, textStyle, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ProvideContentColorTextStyle_3J_VO9M$lambda$0;
                }
            });
        }
    }

    /* renamed from: ProvideContentColorTextStyle-KTwxG1Y, reason: not valid java name */
    public static final void m4807ProvideContentColorTextStyleKTwxG1Y(final long j, final TextStyle textStyle, final ProvidedValue<?>[] providedValueArr, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1730739611);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideContentColorTextStyle)N(contentColor:c#ui.graphics.Color,textStyle,otherValues,content)61@2215L7,62@2244L174:ProvideContentColorTextStyle.kt#mqatfk");
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(j) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        startRestartGroup.startMovableGroup(-1088419735, Integer.valueOf(providedValueArr.length));
        int i3 = i2 | (startRestartGroup.changed(providedValueArr.length) ? 256 : 0);
        for (ProvidedValue<?> providedValue : providedValueArr) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(providedValue) : startRestartGroup.changedInstance(providedValue) ? 256 : 0;
        }
        startRestartGroup.endMovableGroup();
        if ((i3 & 896) == 0) {
            i3 |= 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1730739611, i3, -1, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:60)");
            }
            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localTextStyle);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextStyle merge = ((TextStyle) consume).merge(textStyle);
            SpreadBuilder spreadBuilder = new SpreadBuilder(3);
            spreadBuilder.add(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(j)));
            spreadBuilder.add(TextKt.getLocalTextStyle().provides(merge));
            spreadBuilder.addSpread(providedValueArr);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) spreadBuilder.toArray(new ProvidedValue[spreadBuilder.size()]), function2, startRestartGroup, ((i3 >> 6) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.internal.ProvideContentColorTextStyleKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ProvideContentColorTextStyle_KTwxG1Y$lambda$0;
                    ProvideContentColorTextStyle_KTwxG1Y$lambda$0 = ProvideContentColorTextStyleKt.ProvideContentColorTextStyle_KTwxG1Y$lambda$0(j, textStyle, providedValueArr, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ProvideContentColorTextStyle_KTwxG1Y$lambda$0;
                }
            });
        }
    }
}
