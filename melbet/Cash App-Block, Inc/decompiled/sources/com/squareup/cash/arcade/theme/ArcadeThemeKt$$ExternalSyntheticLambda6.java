package com.squareup.cash.arcade.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class ArcadeThemeKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Function2 f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ ArcadeThemeKt$$ExternalSyntheticLambda6(Colors colors, Typography typography, DefaultSizes defaultSizes, Function2 function2, int i, int i2) {
        this.$r8$classId = 0;
        this.f$0 = colors;
        this.f$1 = typography;
        this.f$2 = defaultSizes;
        this.f$3 = function2;
        this.f$4 = i;
        this.f$5 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ArcadeThemeKt.ArcadeTheme((Colors) obj5, (Typography) obj4, (DefaultSizes) obj3, this.f$3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$5);
                break;
            case 1:
                ((Integer) obj2).getClass();
                Countries.PageHeader((String) obj5, (Modifier) obj4, this.f$3, (String) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$5);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                Function2 function2 = this.f$3;
                Countries.PageHeader((ComposableLambdaImpl) obj5, (Modifier) obj4, function2, (Function2) obj3, (Composer) obj, updateChangedFlags, this.f$5);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArcadeThemeKt$$ExternalSyntheticLambda6(Object obj, Modifier modifier, Function2 function2, Object obj2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = modifier;
        this.f$3 = function2;
        this.f$2 = obj2;
        this.f$4 = i;
        this.f$5 = i2;
    }
}
