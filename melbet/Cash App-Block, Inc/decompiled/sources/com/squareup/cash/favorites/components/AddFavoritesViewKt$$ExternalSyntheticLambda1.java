package com.squareup.cash.favorites.components;

import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.favorites.viewmodels.AddFavoritesViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class AddFavoritesViewKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SearchBarKeyboardState f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ AddFavoritesViewKt$$ExternalSyntheticLambda1(SearchBarKeyboardState searchBarKeyboardState, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = searchBarKeyboardState;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        SearchBarKeyboardState searchBarKeyboardState = this.f$0;
        switch (i) {
            case 0:
                searchBarKeyboardState.setOpen(false);
                function1.invoke(AddFavoritesViewEvent.CloseClicked.INSTANCE);
                break;
            default:
                searchBarKeyboardState.setOpen(false);
                function1.invoke(AfterpaySearchViewEvent.Close.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
