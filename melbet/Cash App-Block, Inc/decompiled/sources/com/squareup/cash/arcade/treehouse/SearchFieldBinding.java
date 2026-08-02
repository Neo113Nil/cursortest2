package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.appcompat.widget.SearchView;
import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import app.cash.arcade.values.TextFieldState;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.MutableListChildren;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.components.MooncakeSearchTextField;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes5.dex */
public final class SearchFieldBinding implements Widget {
    public final Lazy inputConnection$delegate;
    public Modifier modifier;
    public GraphLoop$processingQueue$1 onChange;
    public TextFieldState state;
    public final MutableListChildren suggestions;
    public boolean updating;
    public final MooncakeSearchTextField value;

    public SearchFieldBinding(Context context) {
        MooncakeSearchTextField mooncakeSearchTextField = new MooncakeSearchTextField(context, null);
        this.value = mooncakeSearchTextField;
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.suggestions = new MutableListChildren(null, 3);
        this.state = new TextFieldState("", 0, 0, 14);
        this.inputConnection$delegate = LazyKt.lazy(new ErrorView$$ExternalSyntheticLambda0(this, 9));
        mooncakeSearchTextField.editText.addTextChangedListener(new SearchView.AnonymousClass10(this, 6));
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
