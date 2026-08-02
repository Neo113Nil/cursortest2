package com.squareup.cash.profile.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class GenericProfileElementsViewKt$$ExternalSyntheticLambda12 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ ArrayList f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ GenericProfileElementsViewKt$$ExternalSyntheticLambda12(Modifier modifier, ArrayList arrayList, Function1 function1, int i) {
        this.f$0 = modifier;
        this.f$1 = arrayList;
        this.f$2 = function1;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        ArrayList arrayList = this.f$1;
        Function1 function1 = this.f$2;
        Modifier modifier = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                BadgeNameKt.FavoritesListWidgetView(Updater.updateChangedFlags(i2 | 1), composer, modifier, arrayList, function1);
                break;
            default:
                AddFavoritesViewKt.FavoriteItems(Updater.updateChangedFlags(i2 | 1), composer, modifier, arrayList, function1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ GenericProfileElementsViewKt$$ExternalSyntheticLambda12(Modifier modifier, Function1 function1, ArrayList arrayList, int i) {
        this.f$0 = modifier;
        this.f$2 = function1;
        this.f$1 = arrayList;
        this.f$3 = i;
    }
}
