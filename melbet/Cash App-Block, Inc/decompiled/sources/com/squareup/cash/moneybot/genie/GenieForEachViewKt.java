package com.squareup.cash.moneybot.genie;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.genie.backend.real.GenieLogger;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.ui.widget.text.BalancedLineTextView;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;
import utils.StringUtilsKt;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieCollectionItem;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieScopedViewState;
import xyz.block.genie.state.GenieStateValue;
import xyz.block.genie.state.GenieViewState;
import xyz.block.protos.genie.Expression;
import xyz.block.protos.genie.KeyPath;

/* loaded from: classes6.dex */
public abstract class GenieForEachViewKt {
    public static final void GenieForEachView(ForEach forEach, Modifier modifier, Composer composer, int i) {
        Object failure;
        forEach.getClass();
        Expression expression = forEach.collection;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1791606504);
        int i2 = (gapComposer.changedInstance(forEach) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            GenieViewState genieViewState = (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState);
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            GenieLogger genieLogger = (GenieLogger) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieLogger);
            boolean z = modifier != Modifier.Companion.$$INSTANCE;
            Boolean valueOf = Boolean.valueOf(z);
            boolean changed = gapComposer.changed(z) | gapComposer.changedInstance(genieLogger);
            Object rememberedValue = gapComposer.rememberedValue();
            List list = null;
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GenieViewKt$GenieView$3$1(z, genieLogger, null, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue);
            try {
                Result.Companion companion = Result.Companion;
                failure = expressionEvaluator.evaluate(expression, genieViewState);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            GenieStateValue genieStateValue = (GenieStateValue) failure;
            GenieStateValue.CollectionValue collectionValue = genieStateValue instanceof GenieStateValue.CollectionValue ? (GenieStateValue.CollectionValue) genieStateValue : null;
            Iterable<GenieCollectionItem> iterable = collectionValue != null ? collectionValue.items : EmptyList.INSTANCE;
            String str = forEach.item_variable;
            KeyPath keyPath = forEach.source;
            if (keyPath != null) {
                list = keyPath.segments;
            } else {
                KeyPath keyPath2 = expression.key_path_ref;
                if (keyPath2 != null) {
                    list = keyPath2.segments;
                }
            }
            for (GenieCollectionItem genieCollectionItem : iterable) {
                gapComposer.startMovableGroup(1094127797, genieCollectionItem.getIdentityValue());
                Updater.CompositionLocalProvider(GenieCompositionLocalsKt.LocalGenieViewState.defaultProvidedValue$runtime(new GenieScopedViewState(genieViewState, str, genieCollectionItem, list)), Expect_jvmKt.rememberComposableLambda(590207055, new CashMapViewKt$$ExternalSyntheticLambda5(forEach, 28), gapComposer), gapComposer, 56);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda0(forEach, modifier, i, 29);
        }
    }

    public static int getRelativeImageRotation(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (StringUtilsKt.isLogLevelEnabled(2, "CameraOrientationUtil")) {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "getRelativeImageRotation: destRotationDegrees=", ", sourceRotationDegrees=", ", isOppositeFacing=");
            m107m.append(z);
            m107m.append(", result=");
            m107m.append(i3);
            StringUtilsKt.d("CameraOrientationUtil", m107m.toString());
        }
        return i3;
    }

    public static final void styleSubtitleGivenTitle(BalancedLineTextView balancedLineTextView, String str) {
        balancedLineTextView.getClass();
        Strings.applyStyle(balancedLineTextView, str == null ? TextStyles.mainBody : TextStyles.smallBody);
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(balancedLineTextView).colorPalette;
        balancedLineTextView.setTextColor(str == null ? colorPalette.label : colorPalette.secondaryLabel);
    }

    public static final void styledAsActionButton(AppCompatTextView appCompatTextView, int i) {
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextAlignment(4);
        appCompatTextView.setClickable(true);
        Strings.applyStyle(appCompatTextView, TextStyles.mainTitle);
        appCompatTextView.setBackground(RipplesKt.createRippleDrawable$default(appCompatTextView, Integer.valueOf(i), 2));
        appCompatTextView.setPadding(Views.dip((View) appCompatTextView, 16), Views.dip((View) appCompatTextView, 16), Views.dip((View) appCompatTextView, 16), Views.dip((View) appCompatTextView, 16));
    }

    public static final void styledAsTitle(BalancedLineTextView balancedLineTextView) {
        balancedLineTextView.setGravity(1);
        Strings.applyStyle(balancedLineTextView, TextStyles.mainTitle);
        balancedLineTextView.setTextColor(ThemeHelpersKt.themeInfo(balancedLineTextView).colorPalette.label);
        balancedLineTextView.setPadding(Views.dip((View) balancedLineTextView, 16), balancedLineTextView.getPaddingTop(), Views.dip((View) balancedLineTextView, 16), balancedLineTextView.getPaddingBottom());
    }

    public static int surfaceRotationToDegrees(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
        }
        if (i == 3) {
            return EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unsupported surface rotation: "));
        return 0;
    }
}
