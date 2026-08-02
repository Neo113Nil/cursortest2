package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.AbstractComposeView;
import app.cash.arcade.values.TextFieldState;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.components.SearchBarKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class SearchBarBinding extends AbstractComposeView implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Modifier modifier;
    public final ParcelableSnapshotMutableState onQueryChange$delegate;
    public final ParcelableSnapshotMutableState placeholder$delegate;
    public final ParcelableSnapshotMutableState query$delegate;
    public final SearchBarBinding value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarBinding(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.query$delegate = Updater.mutableStateOf$default(new TextFieldState((String) null, 0, 0, 15));
        this.placeholder$delegate = Updater.mutableStateOf$default("");
        this.onQueryChange$delegate = Updater.mutableStateOf$default(null);
        this.value = this;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(294969027);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.foundation.text.input.TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(getQuery().text, SizeKt.TextRange(getQuery().selectionStart, getQuery().selectionEnd), gapComposer, 0, 0);
            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
            boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(m382rememberTextFieldStateLepunE);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SearchBarBinding$Content$1$1(this, m382rememberTextFieldStateLepunE, null, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, charSequence, (Function2) rememberedValue);
            SearchBarKt.SearchBar(m382rememberTextFieldStateLepunE, (String) this.placeholder$delegate.getValue(), SearchBarKt.rememberSearchBarKeyboardState(false, gapComposer), null, null, null, null, null, null, null, false, null, gapComposer, 0, 0, 8184);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda2(this, i, 24);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    public final TextFieldState getQuery() {
        return (TextFieldState) this.query$delegate.getValue();
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
