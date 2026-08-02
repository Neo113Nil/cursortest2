package com.squareup.cash.common.composeui;

import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.UnionInsets;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class CashInsetsKt {
    public static final StaticProvidableCompositionLocal LocalCashInsets = new StaticProvidableCompositionLocal(new Moneys$$ExternalSyntheticLambda0(5));

    public static final Modifier inlineBottomNavigationPadding(Composer composer, Modifier modifier) {
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        return SpacerKt.padding(modifier, SpacerKt.asPaddingValues(((CashComposeInsets) gapComposer.consume(LocalCashInsets)).inlineBottomNavigation, gapComposer));
    }

    public static final Modifier navigationBarsWithBottomNavigationPadding(Composer composer) {
        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
        AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(composer).navigationBars;
        GapComposer gapComposer = (GapComposer) composer;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = LocalCashInsets;
        CashWindowInsets cashWindowInsets = ((CashComposeInsets) gapComposer.consume(staticProvidableCompositionLocal)).floatingBottomNavigation;
        CashWindowInsets cashWindowInsets2 = ((CashComposeInsets) gapComposer.consume(staticProvidableCompositionLocal)).inlineBottomNavigation;
        boolean changed = gapComposer.changed(androidWindowInsets) | gapComposer.changed(cashWindowInsets) | gapComposer.changed(cashWindowInsets2);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new UnionInsets(new UnionInsets(androidWindowInsets, cashWindowInsets), cashWindowInsets2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return SpacerKt.padding(Modifier.Companion.$$INSTANCE, SpacerKt.asPaddingValues((WindowInsets) rememberedValue, gapComposer));
    }
}
