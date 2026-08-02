package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.TextFieldValue;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.BadgePlacement;
import com.squareup.cash.arcade.components.BottomNavigationScope;
import com.squareup.cash.card.onboarding.graphics.HeartEdition;
import com.squareup.cash.card.onboarding.graphics.HeartPoseController;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardEdition;
import com.squareup.cash.card.onboarding.graphics.MiniCardPoseController;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.TagPoseController;
import com.squareup.cash.card.onboarding.graphics.WandEdition;
import com.squareup.cash.card.onboarding.graphics.WandPose;
import com.squareup.cash.card.onboarding.graphics.WandPoseController;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.moneybot.widgets.ComposerKt;
import com.squareup.cash.moneybot.widgets.ComposerSharedElementKeys;
import com.squareup.cash.moneybot.widgets.ComposerSharedTransitionScope;
import com.squareup.cash.wallet.views.UtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldDefaults$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Object f$12;
    public final /* synthetic */ Object f$13;
    public final /* synthetic */ Object f$14;
    public final /* synthetic */ int f$15;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ TextFieldDefaults$$ExternalSyntheticLambda3(TextFieldDefaults textFieldDefaults, String str, Function2 function2, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, Function2 function22, Shape shape, DefaultTextFieldColors defaultTextFieldColors, PaddingValuesImpl paddingValuesImpl, int i) {
        this.$r8$classId = 0;
        this.f$0 = textFieldDefaults;
        this.f$1 = str;
        this.f$2 = function2;
        this.f$3 = z;
        this.f$6 = mutableInteractionSourceImpl;
        this.f$9 = function22;
        this.f$12 = shape;
        this.f$13 = defaultTextFieldColors;
        this.f$14 = paddingValuesImpl;
        this.f$15 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$15;
        Object obj3 = this.f$14;
        Object obj4 = this.f$13;
        Object obj5 = this.f$12;
        Object obj6 = this.f$6;
        Object obj7 = this.f$9;
        Object obj8 = this.f$2;
        Object obj9 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                ((TextFieldDefaults) obj9).TextFieldDecorationBox(this.f$1, (Function2) obj8, this.f$3, (MutableInteractionSourceImpl) obj6, (Function2) obj7, (Shape) obj5, (DefaultTextFieldColors) obj4, (PaddingValuesImpl) obj3, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                ((BottomNavigationScope) obj9).BottomNavItem((Modifier) obj8, this.f$3, (Badge) obj7, (BadgePlacement) obj6, this.f$1, (String) obj5, (Function0) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                ComposerKt.ComposerTextField((TextFieldValue) obj9, this.f$1, (Modifier) obj8, (ComposerSharedTransitionScope) obj7, (ComposerSharedElementKeys) obj6, this.f$3, (FocusRequester) obj5, (Function1) obj4, (Function0) obj3, (Composer) obj, updateChangedFlags3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(1073943105);
                UtilsKt.HeroWandEffect((WandPose) obj9, (WandPoseController.Output) obj8, (WandScene) obj7, (WandPoseController) obj6, this.f$3, (Modifier) obj5, (WandEdition) obj4, this.f$1, this.f$15, (Engine) obj3, (Composer) obj, updateChangedFlags4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(1073943105);
                UtilsKt.HeroHeartEffect((WandPose) obj9, (WandPoseController.Output) obj8, (HeartScene) obj7, (HeartPoseController) obj6, this.f$3, (Modifier) obj5, (HeartEdition) obj4, this.f$1, this.f$15, (Engine) obj3, (Composer) obj, updateChangedFlags5);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags6 = Updater.updateChangedFlags(1073943105);
                UtilsKt.HeroMiniCardEffect((WandPose) obj9, (WandPoseController.Output) obj8, (MiniCardScene) obj7, (MiniCardPoseController) obj6, this.f$3, (Modifier) obj5, (MiniCardEdition) obj4, this.f$1, this.f$15, (Engine) obj3, (Composer) obj, updateChangedFlags6);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TextFieldDefaults$$ExternalSyntheticLambda3(TextFieldValue textFieldValue, String str, Modifier modifier, ComposerSharedTransitionScope composerSharedTransitionScope, ComposerSharedElementKeys composerSharedElementKeys, boolean z, FocusRequester focusRequester, Function1 function1, Function0 function0, int i) {
        this.$r8$classId = 2;
        this.f$0 = textFieldValue;
        this.f$1 = str;
        this.f$2 = modifier;
        this.f$9 = composerSharedTransitionScope;
        this.f$6 = composerSharedElementKeys;
        this.f$3 = z;
        this.f$12 = focusRequester;
        this.f$13 = function1;
        this.f$14 = function0;
        this.f$15 = i;
    }

    public /* synthetic */ TextFieldDefaults$$ExternalSyntheticLambda3(BottomNavigationScope bottomNavigationScope, Modifier modifier, boolean z, Badge badge, BadgePlacement badgePlacement, String str, String str2, Function0 function0, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 1;
        this.f$0 = bottomNavigationScope;
        this.f$2 = modifier;
        this.f$3 = z;
        this.f$9 = badge;
        this.f$6 = badgePlacement;
        this.f$1 = str;
        this.f$12 = str2;
        this.f$13 = function0;
        this.f$14 = composableLambdaImpl;
        this.f$15 = i;
    }

    public /* synthetic */ TextFieldDefaults$$ExternalSyntheticLambda3(WandPose wandPose, WandPoseController.Output output, Scene scene, TagPoseController tagPoseController, boolean z, Modifier modifier, Enum r7, String str, int i, Engine engine, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = wandPose;
        this.f$2 = output;
        this.f$9 = scene;
        this.f$6 = tagPoseController;
        this.f$3 = z;
        this.f$12 = modifier;
        this.f$13 = r7;
        this.f$1 = str;
        this.f$15 = i;
        this.f$14 = engine;
    }
}
