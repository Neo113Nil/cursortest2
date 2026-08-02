package com.google.android.gms.common.api.internal;

import android.text.Html;
import android.text.Spanned;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda3;
import com.stripe.android.financialconnections.ui.TextResource;

/* loaded from: classes5.dex */
public abstract class zabr {
    public static final void BoostAddedDecoration(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(427543390);
        int i2 = i | 6 | (gapComposer.changedInstance(null) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda3(i, 8);
                return;
            }
            return;
        }
        gapComposer.skipToGroupEnd();
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 15);
        }
    }

    public static final Spanned fromHtml(String str) {
        str.getClass();
        Spanned fromHtml = Html.fromHtml(str, 0);
        fromHtml.getClass();
        return fromHtml;
    }

    public static final TextResource.Text rememberHtml(String str, Composer composer) {
        str.getClass();
        boolean changed = ((GapComposer) composer).changed(str);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new TextResource.Text(fromHtml(str));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (TextResource.Text) rememberedValue;
    }

    public abstract void zaa();
}
