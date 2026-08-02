package com.squareup.cash.sheet;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.MenuItemColors;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentButtonProtoBindingKt;
import com.squareup.cash.offers.views.home.OffersHomeViewKt;
import com.squareup.cash.profile.viewmodels.AliasItem;
import com.squareup.cash.profile.viewmodels.ContactMethodType;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.protos.cash.localization.LocalizedString;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import squareup.cash.ui.arcade.elements.ButtonCtaGroup;

/* loaded from: classes6.dex */
public final /* synthetic */ class SheetKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda3(ComposableLambdaImpl composableLambdaImpl, Function0 function0, Modifier modifier, Function2 function2, Function2 function22, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, int i) {
        this.f$7 = composableLambdaImpl;
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = function2;
        this.f$3 = function22;
        this.f$6 = z;
        this.f$4 = menuItemColors;
        this.f$5 = paddingValues;
        this.f$8 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        int i2 = this.f$8;
        Object obj6 = this.f$7;
        Object obj7 = this.f$5;
        Object obj8 = this.f$3;
        Object obj9 = this.f$4;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                SheetKt.TheSheet((Function0) obj5, (Modifier) obj4, (RealSheetState) obj3, (SheetPeekPosition$FixedHeight) obj8, (String) obj9, (SheetTopCornerBehavior) obj7, this.f$6, (ComposableLambdaImpl) obj6, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                MenuKt.OutlinedButton((Function0) obj5, (Modifier) obj4, this.f$6, (Shape) obj3, (ButtonColors) obj8, (BorderStroke) obj9, (PaddingValues) obj7, (ComposableLambdaImpl) obj6, (Composer) obj, updateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                MenuKt.DropdownMenuItemContent((ComposableLambdaImpl) obj6, (Function0) obj5, (Modifier) obj4, (Function2) obj3, (Function2) obj8, this.f$6, (MenuItemColors) obj9, (PaddingValues) obj7, (Composer) obj, updateChangedFlags3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                AvatarsKt.EntryContent((Modifier) obj4, (ActivityFeedEntry) obj5, (Function3) obj3, (Function2) obj8, (Function2) obj9, (Function3) obj7, (Function1) obj6, this.f$6, (Composer) obj, updateChangedFlags4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                ArcadeComponentButtonProtoBindingKt.RenderButtonCtaGroupLayout(this.f$0, this.f$1, this.f$2, (ButtonCtaGroup.Direction) obj8, (LocalizedString) obj9, this.f$6, (Function1) obj7, (ComposableLambdaImpl) obj6, (Composer) obj, updateChangedFlags5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int updateChangedFlags6 = Updater.updateChangedFlags(i2 | 1);
                OffersHomeViewKt.OffersHomeToolbar((Modifier) obj4, (String) obj9, (Transition) obj5, (TextFieldState) obj3, (String) obj8, (Function1) obj7, this.f$6, (Function1) obj6, (Composer) obj, updateChangedFlags6);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags7 = Updater.updateChangedFlags(i2 | 1);
                ChannelListViewKt.ContactAliasBase((Function1) obj5, (ContactMethodType) obj4, (AliasItem) obj3, (String) obj9, (Icons) obj8, (String) obj7, (List) obj6, this.f$6, (Composer) obj, updateChangedFlags7);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda3(Modifier modifier, ActivityFeedEntry activityFeedEntry, Function3 function3, Function2 function2, Function2 function22, Function3 function32, Function1 function1, boolean z, int i) {
        this.f$1 = modifier;
        this.f$0 = activityFeedEntry;
        this.f$2 = function3;
        this.f$3 = function2;
        this.f$4 = function22;
        this.f$5 = function32;
        this.f$7 = function1;
        this.f$6 = z;
        this.f$8 = i;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda3(Modifier modifier, String str, Transition transition, TextFieldState textFieldState, String str2, Function1 function1, boolean z, Function1 function12, int i) {
        this.f$1 = modifier;
        this.f$4 = str;
        this.f$0 = transition;
        this.f$2 = textFieldState;
        this.f$3 = str2;
        this.f$5 = function1;
        this.f$6 = z;
        this.f$7 = function12;
        this.f$8 = i;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, ButtonCtaGroup.Direction direction, LocalizedString localizedString, boolean z, Function1 function1, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = direction;
        this.f$4 = localizedString;
        this.f$6 = z;
        this.f$5 = function1;
        this.f$7 = composableLambdaImpl;
        this.f$8 = i;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda3(Function0 function0, Modifier modifier, RealSheetState realSheetState, SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight, String str, SheetTopCornerBehavior sheetTopCornerBehavior, boolean z, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = realSheetState;
        this.f$3 = sheetPeekPosition$FixedHeight;
        this.f$4 = str;
        this.f$5 = sheetTopCornerBehavior;
        this.f$6 = z;
        this.f$7 = composableLambdaImpl;
        this.f$8 = i;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda3(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, BorderStroke borderStroke, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$6 = z;
        this.f$2 = shape;
        this.f$3 = buttonColors;
        this.f$4 = borderStroke;
        this.f$5 = paddingValues;
        this.f$7 = composableLambdaImpl;
        this.f$8 = i;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda3(Function1 function1, ContactMethodType contactMethodType, AliasItem aliasItem, String str, Icons icons, String str2, List list, boolean z, int i) {
        this.f$0 = function1;
        this.f$1 = contactMethodType;
        this.f$2 = aliasItem;
        this.f$4 = str;
        this.f$3 = icons;
        this.f$5 = str2;
        this.f$7 = list;
        this.f$6 = z;
        this.f$8 = i;
    }
}
