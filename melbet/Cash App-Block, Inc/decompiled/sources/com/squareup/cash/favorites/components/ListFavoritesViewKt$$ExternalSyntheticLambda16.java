package com.squareup.cash.favorites.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.Icons;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt;
import java.io.Serializable;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class ListFavoritesViewKt$$ExternalSyntheticLambda16 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Function f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Serializable f$4;
    public final /* synthetic */ String f$5;
    public final /* synthetic */ String f$6;
    public final /* synthetic */ String f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ boolean f$9;

    public /* synthetic */ ListFavoritesViewKt$$ExternalSyntheticLambda16(Function0 function0, Function0 function02, Modifier modifier, Color color, Image image, String str, String str2, String str3, Icons icons, boolean z, int i) {
        this.f$0 = function0;
        this.f$1 = function02;
        this.f$2 = modifier;
        this.f$3 = color;
        this.f$4 = image;
        this.f$5 = str;
        this.f$6 = str2;
        this.f$7 = str3;
        this.f$8 = icons;
        this.f$9 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$8;
        Serializable serializable = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        Function function = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                AddFavoritesViewKt.FavoritePersonRowItem((Function0) obj6, (Function0) function, (Modifier) obj5, (Color) obj4, (Image) serializable, this.f$5, this.f$6, this.f$7, (Icons) obj3, this.f$9, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1);
                ManualEntryScreenKt.AccountForm(this.f$9, this.f$5, (Integer) obj6, (Function1) function, this.f$6, (Integer) obj5, (Function1) obj4, this.f$7, (Integer) serializable, (Function1) obj3, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ListFavoritesViewKt$$ExternalSyntheticLambda16(boolean z, String str, Integer num, Function1 function1, String str2, Integer num2, Function1 function12, String str3, Integer num3, Function1 function13, int i) {
        this.f$9 = z;
        this.f$5 = str;
        this.f$0 = num;
        this.f$1 = function1;
        this.f$6 = str2;
        this.f$2 = num2;
        this.f$3 = function12;
        this.f$7 = str3;
        this.f$4 = num3;
        this.f$8 = function13;
    }
}
