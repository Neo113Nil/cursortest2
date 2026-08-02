package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.api.ContextKt;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import com.squareup.cash.appmessages.db.TooltipMessage;
import com.squareup.cash.appmessages.presenters.Tooltip$InvalidTooltip;
import com.squareup.cash.appmessages.presenters.Tooltip$ValidTooltip;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.genie.backend.real.GenieLogger;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.AlignmentResolverKt$WhenMappings;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.TooltipMessage;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xyz.block.genie.GenieLogLevel;
import xyz.block.genie.expressions.ExpressionError;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieStateValue;
import xyz.block.genie.state.GenieViewState;
import xyz.block.genie.state.StateBindingsKt;
import xyz.block.genie.templates.GenieNodeInclusionKt$$ExternalSyntheticLambda0;
import xyz.block.protos.genie.Expression;

/* loaded from: classes3.dex */
public abstract class DynamicRanges {
    public static final void ComposeRowView(ComposePlatform.Row row, Modifier modifier, Composer composer, int i) {
        int i2;
        row.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(371330456);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(row) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            GenieViewState genieViewState = (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState);
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            Dp resolveDp = ContextKt.resolveDp(expressionEvaluator, genieViewState, row.spacing);
            Expression expression = row.horizontal_arrangement;
            Arrangement$Horizontal arrangement$Horizontal = SpacerKt.Start;
            ComposePlatform.HorizontalArrangement horizontalArrangement = (ComposePlatform.HorizontalArrangement) ContextKt.resolveProtoEnum(expression, expressionEvaluator, genieViewState, new EnumListAdapter$encode$1(1, ComposePlatform.HorizontalArrangement.Companion, ComposePlatform.HorizontalArrangement.Companion.class, "fromValue", "fromValue(I)Lcom/squareup/cash/moneybot/genie/protos/ComposePlatform$HorizontalArrangement;", 0, 26));
            switch (horizontalArrangement == null ? -1 : AlignmentResolverKt$WhenMappings.$EnumSwitchMapping$4[horizontalArrangement.ordinal()]) {
                case 1:
                    arrangement$Horizontal = SpacerKt.Center;
                    break;
                case 2:
                    arrangement$Horizontal = SpacerKt.End;
                    break;
                case 3:
                    arrangement$Horizontal = SpacerKt.SpaceBetween;
                    break;
                case 4:
                    arrangement$Horizontal = SpacerKt.SpaceAround;
                    break;
                case 5:
                    arrangement$Horizontal = SpacerKt.SpaceEvenly;
                    break;
                case 6:
                    arrangement$Horizontal = new Arrangement$SpacedAligned(resolveDp != null ? resolveDp.value : RecyclerView.DECELERATION_RATE, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    break;
            }
            Expression expression2 = row.vertical_alignment;
            BiasAlignment.Vertical vertical = Alignment.Companion.Top;
            ComposePlatform.VerticalAlignment verticalAlignment = (ComposePlatform.VerticalAlignment) ContextKt.resolveProtoEnum(expression2, expressionEvaluator, genieViewState, new EnumListAdapter$encode$1(1, ComposePlatform.VerticalAlignment.Companion, ComposePlatform.VerticalAlignment.Companion.class, "fromValue", "fromValue(I)Lcom/squareup/cash/moneybot/genie/protos/ComposePlatform$VerticalAlignment;", 0, 27));
            int i3 = verticalAlignment != null ? AlignmentResolverKt$WhenMappings.$EnumSwitchMapping$1[verticalAlignment.ordinal()] : -1;
            if (i3 == 1) {
                vertical = Alignment.Companion.CenterVertically;
            } else if (i3 == 2) {
                vertical = Alignment.Companion.Bottom;
            }
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Horizontal, vertical, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-202093881);
            Iterator it = row.children.iterator();
            while (it.hasNext()) {
                MatrixExt.GenieNodeView((Node) it.next(), Modifier.Companion.$$INSTANCE, gapComposer, 48);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(row, modifier, i, 10);
        }
    }

    public static final void GenieInclusionGate(Expression expression, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1708725761);
        int i2 = (gapComposer.changedInstance(expression) ? 4 : 2) | i;
        boolean z = true;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            GenieViewState genieViewState = (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState);
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            expressionEvaluator.getClass();
            genieViewState.getClass();
            if (expression != null) {
                try {
                    GenieStateValue evaluate = expressionEvaluator.evaluate(expression, genieViewState);
                    if (!(evaluate instanceof GenieStateValue.BoolValue)) {
                        throw new ExpressionError.TypeMismatch("bool", evaluate);
                    }
                    z = ((GenieStateValue.BoolValue) evaluate).value;
                } catch (ExpressionError e) {
                    try {
                        Result.Companion companion = Result.Companion;
                        if (expressionEvaluator.logger != null) {
                            GenieLogger.log(GenieLogLevel.WARNING, "Inclusion expression evaluation failed; defaulting to included: " + e);
                        }
                    } catch (Throwable unused) {
                        Result.Companion companion2 = Result.Companion;
                    }
                }
            }
            if (z) {
                gapComposer.startReplaceGroup(-1407941720);
                composableLambdaImpl.invoke((Object) gapComposer, (Object) 6);
            } else {
                gapComposer.startReplaceGroup(-697404509);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GenieNodeInclusionKt$$ExternalSyntheticLambda0(expression, composableLambdaImpl, i);
        }
    }

    public static final StateBindingsKt asTooltip(TooltipMessage tooltipMessage) {
        String str;
        TooltipAppMessageViewModel.Ready.ArrowPosition arrowPosition;
        tooltipMessage.getClass();
        TooltipMessage.ArrowPosition arrowPosition2 = tooltipMessage.arrowPosition;
        AppMessageAction appMessageAction = tooltipMessage.tooltip;
        Placement placement = tooltipMessage.placement;
        if (arrowPosition2 != null && placement != null && appMessageAction != null && (str = appMessageAction.text) != null) {
            str.getClass();
            arrowPosition2.getClass();
            int ordinal = arrowPosition2.ordinal();
            if (ordinal == 0) {
                arrowPosition = TooltipAppMessageViewModel.Ready.ArrowPosition.TopLeft;
            } else if (ordinal == 1) {
                arrowPosition = TooltipAppMessageViewModel.Ready.ArrowPosition.TopCenter;
            } else if (ordinal == 2) {
                arrowPosition = TooltipAppMessageViewModel.Ready.ArrowPosition.TopRight;
            } else if (ordinal == 3) {
                arrowPosition = TooltipAppMessageViewModel.Ready.ArrowPosition.BottomRight;
            } else if (ordinal == 4) {
                arrowPosition = TooltipAppMessageViewModel.Ready.ArrowPosition.BottomCenter;
            } else {
                if (ordinal != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                arrowPosition = TooltipAppMessageViewModel.Ready.ArrowPosition.BottomLeft;
            }
            TooltipAppMessageViewModel.Ready.ArrowPosition arrowPosition3 = arrowPosition;
            String str2 = appMessageAction.url_to_open;
            try {
                TooltipAppMessageViewModel.Ready.Placement placement2 = toPlacement(placement);
                switch (placement2.ordinal()) {
                    case 0:
                        return new Tooltip$ValidTooltip(tooltipMessage.messageToken, arrowPosition3, placement2, str, TooltipAppMessageViewModel.Ready.TooltipType.BALANCE_APPLET_TILE, str2);
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 10:
                        return new Tooltip$ValidTooltip(tooltipMessage.messageToken, arrowPosition3, placement2, str, TooltipAppMessageViewModel.Ready.TooltipType.TOOLBAR_MENU, str2);
                    case 3:
                        return new Tooltip$ValidTooltip(tooltipMessage.messageToken, arrowPosition3, placement2, str, TooltipAppMessageViewModel.Ready.TooltipType.TOOLBAR_DISCOVER_MENU_ITEM, str2);
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return new Tooltip$ValidTooltip(tooltipMessage.messageToken, arrowPosition3, placement2, str, TooltipAppMessageViewModel.Ready.TooltipType.BOTTOM_NAVIGATION_TAB, str2);
                    case 11:
                    case 13:
                        return new Tooltip$ValidTooltip(tooltipMessage.messageToken, arrowPosition3, placement2, str, TooltipAppMessageViewModel.Ready.TooltipType.KEYPAD_BUTTON, str2);
                    case 12:
                        return new Tooltip$ValidTooltip(tooltipMessage.messageToken, arrowPosition3, placement2, str, TooltipAppMessageViewModel.Ready.TooltipType.KEYPAD_QR_BUTTON, str2);
                    case 14:
                        return new Tooltip$ValidTooltip(tooltipMessage.messageToken, arrowPosition3, placement2, str, TooltipAppMessageViewModel.Ready.TooltipType.KEYPAD_TOOLBAR_ICON, str2);
                    case 15:
                        return new Tooltip$ValidTooltip(tooltipMessage.messageToken, arrowPosition3, placement2, str, TooltipAppMessageViewModel.Ready.TooltipType.ACCOUNT_SETTINGS, str2);
                    case 16:
                        return new Tooltip$ValidTooltip(tooltipMessage.messageToken, arrowPosition3, placement2, str, TooltipAppMessageViewModel.Ready.TooltipType.TOOLBAR_MONEYBOT_MENU_ITEM, str2);
                    case 17:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return Tooltip$InvalidTooltip.INSTANCE;
    }

    public static final boolean canResolve(DynamicRange dynamicRange, Set set) {
        Object obj;
        dynamicRange.getClass();
        set.getClass();
        if (dynamicRange.isFullySpecified()) {
            return set.contains(dynamicRange);
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            DynamicRange dynamicRange2 = (DynamicRange) obj;
            TransactorKt.checkState("Fully specified range is not actually fully specified.", dynamicRange2.isFullySpecified());
            int i = dynamicRange.mBitDepth;
            if (i == 0 || i == dynamicRange2.mBitDepth) {
                TransactorKt.checkState("Fully specified range is not actually fully specified.", dynamicRange2.isFullySpecified());
                int i2 = dynamicRange.mEncoding;
                if (i2 != 0) {
                    int i3 = dynamicRange2.mEncoding;
                    if ((i2 == 2 && i3 != 1) || i2 == i3) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return obj != null;
    }

    public static final TooltipAppMessageViewModel.Ready.Placement toPlacement(Placement placement) {
        placement.getClass();
        switch (placement.ordinal()) {
            case 3:
                return TooltipAppMessageViewModel.Ready.Placement.BankingBottomNavigationTab;
            case 4:
                return TooltipAppMessageViewModel.Ready.Placement.ActivityBottomNavigationTab;
            case 5:
                return TooltipAppMessageViewModel.Ready.Placement.DiscoverBottomNavigationTab;
            case 6:
                return TooltipAppMessageViewModel.Ready.Placement.WalletBottomNavigationTab;
            case 7:
                return TooltipAppMessageViewModel.Ready.Placement.QrToolbarMenuItem;
            case 8:
                return TooltipAppMessageViewModel.Ready.Placement.GlobeToolbarMenuItem;
            case 9:
                return TooltipAppMessageViewModel.Ready.Placement.SettingToolbarMenuItem;
            case 10:
                return TooltipAppMessageViewModel.Ready.Placement.ProfileToolbarMenuItem;
            case 11:
                return TooltipAppMessageViewModel.Ready.Placement.RecipientSelectorPersonalizePaymentButton;
            case 12:
                return TooltipAppMessageViewModel.Ready.Placement.DiscoverToolbarMenuItem;
            case 13:
                return TooltipAppMessageViewModel.Ready.Placement.BalanceAppletTile;
            case 14:
            case 16:
            case 22:
            case 23:
            default:
                a$$ExternalSyntheticBUOutline0.m$3("Unsupported placement");
                return null;
            case 15:
                return TooltipAppMessageViewModel.Ready.Placement.KeypadTabTapToPayButton;
            case 17:
                return TooltipAppMessageViewModel.Ready.Placement.AccountSettingsCashtagDropdown;
            case 18:
                return TooltipAppMessageViewModel.Ready.Placement.KeypadTabPoolButton;
            case 19:
                return TooltipAppMessageViewModel.Ready.Placement.KeypadTabQrButton;
            case 20:
                return TooltipAppMessageViewModel.Ready.Placement.KeypadTabNearbyButton;
            case 21:
                return TooltipAppMessageViewModel.Ready.Placement.MoneybotSavedToMemoryLabel;
            case 24:
                return TooltipAppMessageViewModel.Ready.Placement.MoneybotToolbarMenuItem;
        }
    }
}
