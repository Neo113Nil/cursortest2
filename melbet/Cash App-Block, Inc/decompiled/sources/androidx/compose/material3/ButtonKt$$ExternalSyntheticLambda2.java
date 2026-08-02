package androidx.compose.material3;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.Arrangement$Vertical;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.navigation.NavInflater;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import com.squareup.cash.sheet.UserDismissMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ButtonKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ int f$11;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda2(OrderBuilderModel.BuyerInfo.UiReady uiReady, TextFieldState textFieldState, TextFieldState textFieldState2, Function0 function0, Function1 function1, Modifier modifier, String str, PaddingValues paddingValues, boolean z, int i, int i2) {
        this.$r8$classId = 3;
        this.f$3 = uiReady;
        this.f$4 = textFieldState;
        this.f$5 = textFieldState2;
        this.f$0 = function0;
        this.f$6 = function1;
        this.f$1 = modifier;
        this.f$9 = str;
        this.f$7 = paddingValues;
        this.f$2 = z;
        this.f$10 = i;
        this.f$11 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$1;
        int i2 = this.f$10;
        Object obj4 = this.f$9;
        Object obj5 = this.f$7;
        Object obj6 = this.f$6;
        Object obj7 = this.f$5;
        Object obj8 = this.f$4;
        Object obj9 = this.f$3;
        Object obj10 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                MenuKt.Button((Function0) obj10, (Modifier) obj3, this.f$2, (Shape) obj9, (ButtonColors) obj8, (ButtonElevation) obj7, (BorderStroke) obj6, (PaddingValues) obj5, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags, this.f$11);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                LazyDslKt.LazyColumn((Modifier) obj3, (LazyListState) obj10, (PaddingValues) obj5, (Arrangement$Vertical) obj9, (Alignment.Horizontal) obj8, (FlingBehavior) obj7, this.f$2, (AndroidEdgeEffectOverscrollEffect) obj6, (Function1) obj4, (Composer) obj, updateChangedFlags2, this.f$11);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                LazyDslKt.LazyRow((Modifier) obj3, (LazyListState) obj10, (PaddingValues) obj5, (Arrangement$Horizontal) obj9, (BiasAlignment.Vertical) obj8, (FlingBehavior) obj7, this.f$2, (AndroidEdgeEffectOverscrollEffect) obj6, (Function1) obj4, (Composer) obj, updateChangedFlags3, this.f$11);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                CheckoutTipSectionKt.CheckoutBuyerInfoSection((OrderBuilderModel.BuyerInfo.UiReady) obj9, (TextFieldState) obj8, (TextFieldState) obj7, (Function0) obj10, (Function1) obj6, (Modifier) obj3, (String) obj4, (PaddingValues) obj5, this.f$2, (Composer) obj, updateChangedFlags4, this.f$11);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                NavInflater.Companion.TransferSheet(this.f$1, (Function0) obj10, (Function1) obj9, (Function1) obj8, (Function0) obj7, (Function0) obj6, this.f$2, (UserDismissMode) obj5, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags5, this.f$11);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda2(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, Object obj, Object obj2, FlingBehavior flingBehavior, boolean z, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Function1 function1, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$1 = modifier;
        this.f$0 = lazyListState;
        this.f$7 = paddingValues;
        this.f$3 = obj;
        this.f$4 = obj2;
        this.f$5 = flingBehavior;
        this.f$2 = z;
        this.f$6 = androidEdgeEffectOverscrollEffect;
        this.f$9 = function1;
        this.f$10 = i;
        this.f$11 = i2;
    }

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda2(Object obj, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function0 function03, boolean z, UserDismissMode userDismissMode, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = 4;
        this.f$1 = obj;
        this.f$0 = function0;
        this.f$3 = function1;
        this.f$4 = function12;
        this.f$5 = function02;
        this.f$6 = function03;
        this.f$2 = z;
        this.f$7 = userDismissMode;
        this.f$9 = composableLambdaImpl;
        this.f$10 = i;
        this.f$11 = i2;
    }

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda2(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = 0;
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$3 = shape;
        this.f$4 = buttonColors;
        this.f$5 = buttonElevation;
        this.f$6 = borderStroke;
        this.f$7 = paddingValues;
        this.f$9 = composableLambdaImpl;
        this.f$10 = i;
        this.f$11 = i2;
    }
}
