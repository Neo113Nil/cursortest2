package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.text.Editable;
import androidx.appcompat.widget.SearchView;
import app.cash.arcade.values.TextFieldState;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import coil3.network.NetworkFetcher$fetch$2;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.components.MooncakeEditText;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes5.dex */
public final class TextFieldBinding implements Widget {
    public final Lazy inputConnection$delegate;
    public Modifier modifier;
    public NetworkFetcher$fetch$2 onChange;
    public TextFieldState state;
    public boolean updating;
    public final TextFieldBinding$value$1 value;

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.TextView, com.squareup.cash.arcade.treehouse.TextFieldBinding$value$1] */
    public TextFieldBinding(final Context context) {
        int i = 0;
        this.state = new TextFieldState("", i, i, 14);
        ?? r0 = new MooncakeEditText(context) { // from class: com.squareup.cash.arcade.treehouse.TextFieldBinding$value$1
            @Override // com.squareup.cash.mooncake.components.MooncakeEditText, android.widget.TextView
            public final void onSelectionChanged(int i2, int i3) {
                super.onSelectionChanged(i2, i3);
                TextFieldBinding.access$stateChanged(TextFieldBinding.this, this);
            }
        };
        this.value = r0;
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.inputConnection$delegate = LazyKt.lazy(new ErrorView$$ExternalSyntheticLambda0(this, 10));
        r0.addTextChangedListener(new SearchView.AnonymousClass10(this, 7));
    }

    public static final void access$stateChanged(TextFieldBinding textFieldBinding, TextFieldBinding$value$1 textFieldBinding$value$1) {
        String str;
        if (textFieldBinding.updating) {
            return;
        }
        TextFieldState textFieldState = textFieldBinding.state;
        Editable text = textFieldBinding$value$1.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        TextFieldState userEdit = textFieldState.userEdit(textFieldBinding$value$1.getSelectionStart(), textFieldBinding$value$1.getSelectionEnd(), str);
        if (textFieldBinding.state.contentEquals(userEdit)) {
            return;
        }
        textFieldBinding.state = userEdit;
        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = textFieldBinding.onChange;
        if (networkFetcher$fetch$2 != null) {
            networkFetcher$fetch$2.invoke(userEdit);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
