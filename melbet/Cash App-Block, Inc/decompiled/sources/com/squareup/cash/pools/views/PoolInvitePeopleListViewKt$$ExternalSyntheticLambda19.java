package com.squareup.cash.pools.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolInvitePeopleListViewKt$$ExternalSyntheticLambda19 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ PoolInvitePeopleListViewKt$$ExternalSyntheticLambda19(Modifier modifier, Function0 function0, Function0 function02, int i) {
        this.$r8$classId = 0;
        this.f$0 = modifier;
        this.f$1 = function0;
        this.f$2 = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                PoolToastKt.SharePoolSection(Updater.updateChangedFlags(1), composer, this.f$0, this.f$1, this.f$2);
                break;
            case 1:
                AddFavoritesViewKt.EmptyFavoritesList(Updater.updateChangedFlags(1), composer, this.f$0, this.f$1, this.f$2);
                break;
            default:
                AliasPickerViewKt.AccountFailedRemoval(Updater.updateChangedFlags(385), composer, this.f$0, this.f$1, this.f$2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PoolInvitePeopleListViewKt$$ExternalSyntheticLambda19(Function0 function0, Function0 function02, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = function0;
        this.f$2 = function02;
        this.f$0 = modifier;
    }
}
