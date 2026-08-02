package com.squareup.cash.booklet.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.marketing.components.TooltipState;
import com.squareup.protos.cash.ui.Image;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BookletTileKt$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ float f$5;
    public final /* synthetic */ Function0 f$6;
    public final /* synthetic */ Function2 f$7;
    public final /* synthetic */ int f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ BookletTileKt$$ExternalSyntheticLambda7(Modifier modifier, String str, Object obj, Object obj2, float f, Function0 function0, Function2 function2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = modifier;
        this.f$1 = str;
        this.f$2 = obj;
        this.f$3 = obj2;
        this.f$5 = f;
        this.f$6 = function0;
        this.f$7 = function2;
        this.f$8 = i;
        this.f$9 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$8;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                BookletGridKt.m3424BookletTileeHTjO5g(this.f$0, this.f$1, (String) obj4, (Image) obj3, this.f$5, this.f$6, this.f$7, (Composer) obj, updateChangedFlags, this.f$9);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                CardUpsellKt.m3598TooltipBoxiHT50w(this.f$0, this.f$1, (TooltipState) obj4, (Alignment.Horizontal) obj3, this.f$5, this.f$6, (ComposableLambdaImpl) this.f$7, (Composer) obj, updateChangedFlags2, this.f$9);
                break;
        }
        return Unit.INSTANCE;
    }
}
