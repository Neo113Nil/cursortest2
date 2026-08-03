package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: AppBarDsl.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B8\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\u0004H\u0017¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/ClickableAppBarItem;", "Landroidx/compose/material3/AppBarItem;", "onClick", "Lkotlin/Function0;", "", "icon", "Landroidx/compose/runtime/Composable;", "enabled", "", "label", "", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;)V", "Lkotlin/jvm/functions/Function2;", "AppbarContent", "(Landroidx/compose/runtime/Composer;I)V", "MenuContent", "state", "Landroidx/compose/material3/AppBarMenuState;", "(Landroidx/compose/material3/AppBarMenuState;Landroidx/compose/runtime/Composer;I)V", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ClickableAppBarItem implements AppBarItem {
    public static final int $stable = 0;
    private final boolean enabled;
    private final Function2<Composer, Integer, Unit> icon;
    private final String label;
    private final Function0<Unit> onClick;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppbarContent$lambda$2(ClickableAppBarItem clickableAppBarItem, int i, Composer composer, int i2) {
        clickableAppBarItem.AppbarContent(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuContent$lambda$2(ClickableAppBarItem clickableAppBarItem, AppBarMenuState appBarMenuState, int i, Composer composer, int i2) {
        clickableAppBarItem.MenuContent(appBarMenuState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClickableAppBarItem(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, String str) {
        this.onClick = function0;
        this.icon = function2;
        this.enabled = z;
        this.label = str;
    }

    @Override // androidx.compose.material3.AppBarItem
    public void AppbarContent(Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1170649368);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppbarContent)168@5601L60,169@5685L32,170@5739L22,171@5773L88,166@5526L335:AppBarDsl.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1170649368, i2, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent (AppBarDsl.kt:164)");
            }
            TooltipKt.TooltipBox(TooltipDefaults.INSTANCE.m4536rememberTooltipPositionProviderHu5FAss(TooltipAnchorPosition.INSTANCE.m4523getAbovelOKsHw4(), 0.0f, startRestartGroup, 390, 2), ComposableLambdaKt.rememberComposableLambda(-816691117, true, new Function3() { // from class: androidx.compose.material3.ClickableAppBarItem$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit AppbarContent$lambda$0;
                    AppbarContent$lambda$0 = ClickableAppBarItem.AppbarContent$lambda$0(ClickableAppBarItem.this, (TooltipScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return AppbarContent$lambda$0;
                }
            }, startRestartGroup, 54), TooltipKt.rememberTooltipState(false, false, null, startRestartGroup, 0, 7), null, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(-592360853, true, new Function2() { // from class: androidx.compose.material3.ClickableAppBarItem$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppbarContent$lambda$1;
                    AppbarContent$lambda$1 = ClickableAppBarItem.AppbarContent$lambda$1(ClickableAppBarItem.this, (Composer) obj, ((Integer) obj2).intValue());
                    return AppbarContent$lambda$1;
                }
            }, startRestartGroup, 54), startRestartGroup, 100663344, 248);
            startRestartGroup = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ClickableAppBarItem$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppbarContent$lambda$2;
                    AppbarContent$lambda$2 = ClickableAppBarItem.AppbarContent$lambda$2(ClickableAppBarItem.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return AppbarContent$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppbarContent$lambda$0(final ClickableAppBarItem clickableAppBarItem, TooltipScope tooltipScope, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "C169@5700L15,169@5687L28:AppBarDsl.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(tooltipScope) : composer.changedInstance(tooltipScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-816691117, i2, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:169)");
            }
            TooltipKt.m4544PlainTooltipgv3ox5I(tooltipScope, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(837175745, true, new Function2() { // from class: androidx.compose.material3.ClickableAppBarItem$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppbarContent$lambda$0$0;
                    AppbarContent$lambda$0$0 = ClickableAppBarItem.AppbarContent$lambda$0$0(ClickableAppBarItem.this, (Composer) obj, ((Integer) obj2).intValue());
                    return AppbarContent$lambda$0$0;
                }
            }, composer, 54), composer, (i2 & 14) | 805306368, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppbarContent$lambda$0$0(ClickableAppBarItem clickableAppBarItem, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C169@5702L11:AppBarDsl.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(837175745, i, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent.<anonymous>.<anonymous> (AppBarDsl.kt:169)");
            }
            TextKt.m4292TextNvy7gAk(clickableAppBarItem.label, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppbarContent$lambda$1(ClickableAppBarItem clickableAppBarItem, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C172@5787L64:AppBarDsl.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-592360853, i, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:172)");
            }
            IconButtonKt.IconButton(clickableAppBarItem.onClick, (Modifier) null, clickableAppBarItem.enabled, (IconButtonColors) null, (MutableInteractionSource) null, (Shape) null, clickableAppBarItem.icon, composer, 0, 58);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.AppBarItem
    public void MenuContent(final AppBarMenuState appBarMenuState, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-791598787);
        ComposerKt.sourceInformation(startRestartGroup, "C(MenuContent)N(state)180@6016L15,181@6055L73,178@5948L191:AppBarDsl.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(appBarMenuState) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(-791598787, i2, -1, "androidx.compose.material3.ClickableAppBarItem.MenuContent (AppBarDsl.kt:177)");
            }
            boolean z = this.enabled;
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(900574477, true, new Function2() { // from class: androidx.compose.material3.ClickableAppBarItem$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MenuContent$lambda$0;
                    MenuContent$lambda$0 = ClickableAppBarItem.MenuContent$lambda$0(ClickableAppBarItem.this, (Composer) obj, ((Integer) obj2).intValue());
                    return MenuContent$lambda$0;
                }
            }, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -517217818, "CC(remember):AppBarDsl.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(appBarMenuState) | ((i2 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material3.ClickableAppBarItem$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MenuContent$lambda$1$0;
                        MenuContent$lambda$1$0 = ClickableAppBarItem.MenuContent$lambda$1$0(ClickableAppBarItem.this, appBarMenuState);
                        return MenuContent$lambda$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (Function0) rememberedValue, null, null, null, z, null, null, null, startRestartGroup, 6, 476);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ClickableAppBarItem$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MenuContent$lambda$2;
                    MenuContent$lambda$2 = ClickableAppBarItem.MenuContent$lambda$2(ClickableAppBarItem.this, appBarMenuState, i, (Composer) obj, ((Integer) obj2).intValue());
                    return MenuContent$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuContent$lambda$0(ClickableAppBarItem clickableAppBarItem, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C180@6018L11:AppBarDsl.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(900574477, i, -1, "androidx.compose.material3.ClickableAppBarItem.MenuContent.<anonymous> (AppBarDsl.kt:180)");
            }
            TextKt.m4292TextNvy7gAk(clickableAppBarItem.label, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuContent$lambda$1$0(ClickableAppBarItem clickableAppBarItem, AppBarMenuState appBarMenuState) {
        clickableAppBarItem.onClick.invoke();
        appBarMenuState.dismiss();
        return Unit.INSTANCE;
    }
}
