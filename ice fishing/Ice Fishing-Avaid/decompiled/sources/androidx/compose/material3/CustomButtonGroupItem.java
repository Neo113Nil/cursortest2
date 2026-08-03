package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: ButtonGroup.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\b\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\r\u001a\u00020\u0004H\u0017¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\bH\u0017¢\u0006\u0002\u0010\u0011R\u001b\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR!\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\b\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/CustomButtonGroupItem;", "Landroidx/compose/material3/ButtonGroupItem;", "buttonGroupContent", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "menuContent", "Lkotlin/Function1;", "Landroidx/compose/material3/ButtonGroupMenuState;", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function3;", "ButtonGroupContent", "(Landroidx/compose/runtime/Composer;I)V", "MenuContent", "state", "(Landroidx/compose/material3/ButtonGroupMenuState;Landroidx/compose/runtime/Composer;I)V", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class CustomButtonGroupItem implements ButtonGroupItem {
    public static final int $stable = 0;
    private final Function2<Composer, Integer, Unit> buttonGroupContent;
    private final Function3<ButtonGroupMenuState, Composer, Integer, Unit> menuContent;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonGroupContent$lambda$0(CustomButtonGroupItem customButtonGroupItem, int i, Composer composer, int i2) {
        customButtonGroupItem.ButtonGroupContent(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuContent$lambda$0(CustomButtonGroupItem customButtonGroupItem, ButtonGroupMenuState buttonGroupMenuState, int i, Composer composer, int i2) {
        customButtonGroupItem.MenuContent(buttonGroupMenuState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomButtonGroupItem(Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ButtonGroupMenuState, ? super Composer, ? super Integer, Unit> function3) {
        this.buttonGroupContent = function2;
        this.menuContent = function3;
    }

    @Override // androidx.compose.material3.ButtonGroupItem
    public void ButtonGroupContent(Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-2102125731);
        ComposerKt.sourceInformation(startRestartGroup, "C(ButtonGroupContent)1281@55153L20:ButtonGroup.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2102125731, i2, -1, "androidx.compose.material3.CustomButtonGroupItem.ButtonGroupContent (ButtonGroup.kt:1280)");
            }
            this.buttonGroupContent.invoke(startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.CustomButtonGroupItem$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ButtonGroupContent$lambda$0;
                    ButtonGroupContent$lambda$0 = CustomButtonGroupItem.ButtonGroupContent$lambda$0(CustomButtonGroupItem.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ButtonGroupContent$lambda$0;
                }
            });
        }
    }

    @Override // androidx.compose.material3.ButtonGroupItem
    public void MenuContent(final ButtonGroupMenuState buttonGroupMenuState, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(945127568);
        ComposerKt.sourceInformation(startRestartGroup, "C(MenuContent)N(state)1286@55265L18:ButtonGroup.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(buttonGroupMenuState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(945127568, i2, -1, "androidx.compose.material3.CustomButtonGroupItem.MenuContent (ButtonGroup.kt:1285)");
            }
            this.menuContent.invoke(buttonGroupMenuState, startRestartGroup, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.CustomButtonGroupItem$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MenuContent$lambda$0;
                    MenuContent$lambda$0 = CustomButtonGroupItem.MenuContent$lambda$0(CustomButtonGroupItem.this, buttonGroupMenuState, i, (Composer) obj, ((Integer) obj2).intValue());
                    return MenuContent$lambda$0;
                }
            });
        }
    }
}
