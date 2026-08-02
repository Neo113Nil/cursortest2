package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.arcade.values.ArcadeTimelineItemState;
import app.cash.arcade.values.AvatarSize;
import app.cash.arcade.values.BooleanState;
import app.cash.arcade.values.BorderStyle;
import app.cash.arcade.values.ButtonProminence;
import app.cash.arcade.values.ButtonSize;
import app.cash.arcade.values.ButtonStyle;
import app.cash.arcade.values.DisplayCurrency;
import app.cash.arcade.values.DividerStyle;
import app.cash.arcade.values.IconSize;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.ImeAction;
import app.cash.arcade.values.InputFieldHelperText;
import app.cash.arcade.values.KeyboardCapitalization;
import app.cash.arcade.values.KeyboardType;
import app.cash.arcade.values.LegacyDialogAction;
import app.cash.arcade.values.PasscodeInputStatus;
import app.cash.arcade.values.SegmentedToggleValue;
import app.cash.arcade.values.TextFieldLineLimits;
import app.cash.arcade.values.TextFieldState;
import app.cash.arcade.values.TextStyle;
import app.cash.arcade.values.button.ArcadeButtonStyles;
import app.cash.arcade.values.timeline.ArcadeTimeline2CollapseRange;
import app.cash.arcade.values.timeline.ArcadeTimeline2Item;
import app.cash.arcade.viewmodels.AvatarBadgeViewModel;
import app.cash.arcade.viewmodels.RadioSelectionOption;
import app.cash.mooncake.values.MooncakeButtonSizes;
import app.cash.mooncake.values.MooncakeButtonStyles;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.UiPropertyChange;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import app.cash.redwood.ui.Margin;
import app.cash.redwood.widget.Widget;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q2$$ExternalSyntheticLambda8;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.request.ViewTargetRequestManagerKt;
import coil3.size.SizeKt;
import coil3.svg.internal.AndroidSvg;
import com.caverock.androidsvg.SVG;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.appmessages.views.InlineAppMessageView;
import com.squareup.cash.arcade.Illustrations;
import com.squareup.cash.arcade.components.timeline.TimelineItem;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import com.squareup.cash.arcade.treehouse.ArcadeAvatarBinding;
import com.squareup.cash.arcade.treehouse.ArcadeTimeline2Binding;
import com.squareup.cash.arcade.treehouse.ArcadeTimelineItemBinding;
import com.squareup.cash.arcade.treehouse.BenefitsComparisonTableBinding;
import com.squareup.cash.arcade.treehouse.BiometricsPromptBinding;
import com.squareup.cash.arcade.treehouse.ButtonBinding;
import com.squareup.cash.arcade.treehouse.CardUpsellBinding;
import com.squareup.cash.arcade.treehouse.CarouselBinding;
import com.squareup.cash.arcade.treehouse.DividerBinding;
import com.squareup.cash.arcade.treehouse.IconBinding;
import com.squareup.cash.arcade.treehouse.IconBinding$value$1;
import com.squareup.cash.arcade.treehouse.IconButtonBinding$value$1;
import com.squareup.cash.arcade.treehouse.ImageBinding;
import com.squareup.cash.arcade.treehouse.InputFieldBinding;
import com.squareup.cash.arcade.treehouse.InputFieldBinding$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.treehouse.LegacyAmountPickerBinding;
import com.squareup.cash.arcade.treehouse.LegacyDialogBinding;
import com.squareup.cash.arcade.treehouse.LegacyPasscodeInputBinding;
import com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.treehouse.PasscodeInputBinding;
import com.squareup.cash.arcade.treehouse.ProgressBarBinding;
import com.squareup.cash.arcade.treehouse.QrCodeScannerBinding;
import com.squareup.cash.arcade.treehouse.RadioBinding;
import com.squareup.cash.arcade.treehouse.RadioSelectionGroupBinding;
import com.squareup.cash.arcade.treehouse.RoundedRectBinding;
import com.squareup.cash.arcade.treehouse.SearchBarBinding;
import com.squareup.cash.arcade.treehouse.ShimmerBinding;
import com.squareup.cash.arcade.treehouse.SpinnerBinding;
import com.squareup.cash.arcade.treehouse.SwitchBinding;
import com.squareup.cash.arcade.treehouse.TextStylesKt;
import com.squareup.cash.arcade.treehouse.ToggleBinding;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.views.BankingDialog$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.history.treehouse.views.MooncakeActivitySectionHeader;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.components.MooncakeToggle;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.resources.ColorsKt;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.cash.mooncake.resources.ResourcesKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.FormBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import okhttp3.internal.Tags;
import okio.Path$$ExternalSyntheticBUOutline0;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes3.dex */
public final class IconProtocolNode extends ProtocolNode {
    public final /* synthetic */ int $r8$classId;
    public Widget _widget;
    public final WidgetHostProtocol protocol;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IconProtocolNode(int i, Widget widget, WidgetHostProtocol widgetHostProtocol, int i2) {
        super(i);
        this.$r8$classId = i2;
        this.protocol = widgetHostProtocol;
        this._widget = widget;
    }

    private final void apply$app$cash$arcade$protocol$host$arcade$LegacyDialogProtocolNode(UiPropertyChange uiPropertyChange, SVG svg) {
        svg.getClass();
        final LegacyDialogBinding legacyDialogBinding = (LegacyDialogBinding) this._widget;
        if (legacyDialogBinding == null) {
            a$$ExternalSyntheticBUOutline0.m$1("detached");
            return;
        }
        AlertDialogView alertDialogView = legacyDialogBinding.alertDialogView;
        int i = uiPropertyChange.tag;
        Object obj = uiPropertyChange.value;
        switch (i) {
            case 1:
                obj.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    break;
                } else {
                    legacyDialogBinding.onClickOutside = new PageFetcher$generateNewPagingSource$3(0, new LegacyDialogProtocolNode$OnClickOutside(this.id, svg), LegacyDialogProtocolNode$OnClickOutside.class, "invoke", "invoke()V", 0, 21);
                    break;
                }
            case 2:
                obj.getClass();
                if (((Boolean) obj).booleanValue()) {
                    break;
                }
                break;
            case 3:
                obj.getClass();
                legacyDialogBinding.isVisible = ((Boolean) obj).booleanValue();
                legacyDialogBinding.updateOverlaySession$1();
                break;
            case 4:
                obj.getClass();
                alertDialogView.setTitle((String) obj);
                break;
            case 5:
                obj.getClass();
                alertDialogView.setMessage((String) obj);
                break;
            case 6:
                obj.getClass();
                final int i2 = 1;
                alertDialogView.setPositiveButton(((LegacyDialogAction) obj).title, new Function0() { // from class: com.squareup.cash.arcade.treehouse.LegacyDialogBinding$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i2;
                        LegacyDialogBinding legacyDialogBinding2 = legacyDialogBinding;
                        switch (i3) {
                            case 0:
                                PageFetcher$generateNewPagingSource$3 pageFetcher$generateNewPagingSource$3 = legacyDialogBinding2.cancelActionOnClick;
                                if (pageFetcher$generateNewPagingSource$3 != null) {
                                    pageFetcher$generateNewPagingSource$3.invoke();
                                }
                                break;
                            default:
                                legacyDialogBinding2.confirmActionOnClick.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                break;
            case 7:
                obj.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    break;
                } else {
                    legacyDialogBinding.confirmActionOnClick = new PageFetcher$generateNewPagingSource$3(0, new LegacyDialogProtocolNode$ConfirmActionOnClick(this.id, svg), LegacyDialogProtocolNode$ConfirmActionOnClick.class, "invoke", "invoke()V", 0, 19);
                    break;
                }
            case 8:
                LegacyDialogAction legacyDialogAction = (LegacyDialogAction) obj;
                String str = legacyDialogAction != null ? legacyDialogAction.title : null;
                final int i3 = 0;
                alertDialogView.setNegativeButton(str, new Function0() { // from class: com.squareup.cash.arcade.treehouse.LegacyDialogBinding$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i32 = i3;
                        LegacyDialogBinding legacyDialogBinding2 = legacyDialogBinding;
                        switch (i32) {
                            case 0:
                                PageFetcher$generateNewPagingSource$3 pageFetcher$generateNewPagingSource$3 = legacyDialogBinding2.cancelActionOnClick;
                                if (pageFetcher$generateNewPagingSource$3 != null) {
                                    pageFetcher$generateNewPagingSource$3.invoke();
                                }
                                break;
                            default:
                                legacyDialogBinding2.confirmActionOnClick.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                break;
            case 9:
                obj.getClass();
                legacyDialogBinding.cancelActionOnClick = ((Boolean) obj).booleanValue() ? new PageFetcher$generateNewPagingSource$3(0, new LegacyDialogProtocolNode$CancelActionOnClick(this.id, svg), LegacyDialogProtocolNode$CancelActionOnClick.class, "invoke", "invoke()V", 0, 18) : null;
                break;
            default:
                ((ToastHostProtocol) this.protocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(67, i);
                break;
        }
    }

    private final void apply$app$cash$arcade$protocol$host$arcade$LegacyPasscodeInputProtocolNode(UiPropertyChange uiPropertyChange, SVG svg) {
        Function1 function1;
        RoundedRectHostProtocol roundedRectHostProtocol = (RoundedRectHostProtocol) this.protocol;
        svg.getClass();
        LegacyPasscodeInputBinding legacyPasscodeInputBinding = (LegacyPasscodeInputBinding) this._widget;
        if (legacyPasscodeInputBinding == null) {
            a$$ExternalSyntheticBUOutline0.m$1("detached");
            return;
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = legacyPasscodeInputBinding.shakeTrigger$delegate;
        int i = uiPropertyChange.tag;
        Object obj = uiPropertyChange.value;
        if (i == 1) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            legacyPasscodeInputBinding.passcodeLength$delegate.setIntValue(intValue);
            if (legacyPasscodeInputBinding.getPasscode().length() > intValue) {
                legacyPasscodeInputBinding.passcode$delegate.setValue(StringsKt___StringsKt.take(intValue, legacyPasscodeInputBinding.getPasscode()));
                return;
            }
            return;
        }
        if (i == 2) {
            obj.getClass();
            Context context = legacyPasscodeInputBinding.getContext();
            context.getClass();
            legacyPasscodeInputBinding.dotAccentColor$delegate.setValue(new Color(ColorKt.Color(ColorsKt.toColorInt$default((app.cash.arcade.values.Color) obj, ThemeHelpersKt.findThemeInfo(context)))));
            return;
        }
        if (i == 3) {
            obj.getClass();
            if (((Boolean) obj).booleanValue()) {
                function1 = new GraphLoop$processingQueue$1(1, new LegacyPasscodeInputProtocolNode$OnFullyFilled(this.id, svg, roundedRectHostProtocol), LegacyPasscodeInputProtocolNode$OnFullyFilled.class, "invoke", "invoke(Ljava/lang/String;)V", 0, 18);
            } else {
                function1 = null;
            }
            if (function1 == null) {
                function1 = new NavBarBinding$$ExternalSyntheticLambda2(25);
            }
            legacyPasscodeInputBinding.onFullyFilled = function1;
            return;
        }
        if (i != 4) {
            roundedRectHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(34, i);
            return;
        }
        PasscodeInputStatus passcodeInputStatus = (PasscodeInputStatus) obj;
        PasscodeInputStatus passcodeInputStatus2 = legacyPasscodeInputBinding.latestStatus;
        if (passcodeInputStatus == null) {
            passcodeInputStatus = PasscodeInputStatus.NONE;
        }
        if (passcodeInputStatus == PasscodeInputStatus.FAILURE) {
            legacyPasscodeInputBinding.inputEnabled$delegate.setValue(Boolean.TRUE);
            if (passcodeInputStatus2 != passcodeInputStatus) {
                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
            }
        }
        legacyPasscodeInputBinding.latestStatus = passcodeInputStatus;
    }

    private final void apply$app$cash$arcade$protocol$host$arcade$PasscodeInputProtocolNode(UiPropertyChange uiPropertyChange, SVG svg) {
        GraphLoop$processingQueue$1 graphLoop$processingQueue$1;
        RadioHostProtocol radioHostProtocol = (RadioHostProtocol) this.protocol;
        svg.getClass();
        PasscodeInputBinding passcodeInputBinding = (PasscodeInputBinding) this._widget;
        if (passcodeInputBinding == null) {
            a$$ExternalSyntheticBUOutline0.m$1("detached");
            return;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = passcodeInputBinding.passcode$delegate;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = passcodeInputBinding.passcodeLength$delegate;
        int i = uiPropertyChange.tag;
        Object obj = uiPropertyChange.value;
        if (i == 1) {
            obj.getClass();
            String str = ((TextFieldState) obj).text;
            if (Intrinsics.areEqual(str, passcodeInputBinding.getPasscode$1())) {
                return;
            }
            parcelableSnapshotMutableState.setValue(StringsKt___StringsKt.take(parcelableSnapshotMutableIntState.getIntValue(), str));
            return;
        }
        if (i == 2) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            parcelableSnapshotMutableIntState.setIntValue(intValue);
            if (passcodeInputBinding.getPasscode$1().length() > intValue) {
                parcelableSnapshotMutableState.setValue(StringsKt___StringsKt.take(intValue, passcodeInputBinding.getPasscode$1()));
                return;
            }
            return;
        }
        if (i == 3) {
            obj.getClass();
            passcodeInputBinding.inputEnabled$delegate.setValue((Boolean) obj);
            return;
        }
        if (i != 4) {
            if (i != 5) {
                radioHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(85, i);
                return;
            }
            obj.getClass();
            if (((Boolean) obj).booleanValue()) {
                return;
            } else {
                return;
            }
        }
        obj.getClass();
        if (((Boolean) obj).booleanValue()) {
            graphLoop$processingQueue$1 = new GraphLoop$processingQueue$1(1, new PasscodeInputProtocolNode$OnChange(this.id, svg, radioHostProtocol), PasscodeInputProtocolNode$OnChange.class, "invoke", "invoke(Lapp/cash/arcade/values/TextFieldState;)V", 0, 19);
        } else {
            graphLoop$processingQueue$1 = null;
        }
        passcodeInputBinding.onChangeCallback = graphLoop$processingQueue$1;
    }

    private final void apply$app$cash$arcade$protocol$host$arcade$QrCodeScannerProtocolNode(UiPropertyChange uiPropertyChange, SVG svg) {
        RoundedRectHostProtocol roundedRectHostProtocol = (RoundedRectHostProtocol) this.protocol;
        svg.getClass();
        QrCodeScannerBinding qrCodeScannerBinding = (QrCodeScannerBinding) this._widget;
        if (qrCodeScannerBinding == null) {
            a$$ExternalSyntheticBUOutline0.m$1("detached");
            return;
        }
        int i = uiPropertyChange.tag;
        Object obj = uiPropertyChange.value;
        switch (i) {
            case 1:
                obj.getClass();
                qrCodeScannerBinding.title = (String) obj;
                break;
            case 2:
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                qrCodeScannerBinding.buttonText = str;
                break;
            case 3:
                obj.getClass();
                qrCodeScannerBinding.onButtonClick = ((Boolean) obj).booleanValue() ? new PageFetcher$generateNewPagingSource$3(0, new QrCodeScannerProtocolNode$OnButtonClick(this.id, svg), QrCodeScannerProtocolNode$OnButtonClick.class, "invoke", "invoke()V", 0, 23) : null;
                break;
            case 4:
                obj.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    break;
                } else {
                    qrCodeScannerBinding.onResult = new GraphLoop$processingQueue$1(1, new QrCodeScannerProtocolNode$OnResult(this.id, svg, roundedRectHostProtocol), QrCodeScannerProtocolNode$OnResult.class, "invoke", "invoke(Lcom/squareup/cash/treehouse/qr/QrScanResult;)V", 0, 21);
                    break;
                }
            case 5:
                obj.getClass();
                qrCodeScannerBinding.hint = (String) obj;
                break;
            case 6:
                obj.getClass();
                Margin margin = (Margin) obj;
                qrCodeScannerBinding.qrAddressScannerView.setExtraContentPadding(new PaddingValuesImpl((float) margin.start, (float) margin.top, (float) margin.end, (float) margin.bottom));
                break;
            default:
                roundedRectHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(72, i);
                break;
        }
    }

    private final void apply$app$cash$arcade$protocol$host$arcade$RadioProtocolNode(UiPropertyChange uiPropertyChange, SVG svg) {
        RadioHostProtocol radioHostProtocol = (RadioHostProtocol) this.protocol;
        svg.getClass();
        RadioBinding radioBinding = (RadioBinding) this._widget;
        if (radioBinding == null) {
            a$$ExternalSyntheticBUOutline0.m$1("detached");
            return;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = radioBinding.state$delegate;
        int i = uiPropertyChange.tag;
        Object obj = uiPropertyChange.value;
        if (i == 1) {
            obj.getClass();
            BooleanState booleanState = (BooleanState) obj;
            if (((BooleanState) parcelableSnapshotMutableState.getValue()).userEditCount > booleanState.userEditCount) {
                return;
            }
            parcelableSnapshotMutableState.setValue(booleanState);
            return;
        }
        if (i == 2) {
            obj.getClass();
            radioBinding.enabled$delegate.setValue((Boolean) obj);
            return;
        }
        if (i == 3) {
            obj.getClass();
            radioBinding.onChange$delegate.setValue(((Boolean) obj).booleanValue() ? new GraphLoop$processingQueue$1(1, new RadioProtocolNode$OnChange(this.id, svg, radioHostProtocol), RadioProtocolNode$OnChange.class, "invoke", "invoke(Lapp/cash/arcade/values/BooleanState;)V", 0, 22) : null);
        } else if (i != 4) {
            radioHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(77, i);
        } else {
            app.cash.arcade.values.Color color = (app.cash.arcade.values.Color) obj;
            radioBinding.tint$delegate.setValue(color != null ? new Color(ColorKt.Color(ColorsKt.toColorInt$default(color, radioBinding.themeInfo))) : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void apply$app$cash$arcade$protocol$host$arcade$RadioSelectionGroupProtocolNode(UiPropertyChange uiPropertyChange, SVG svg) {
        RadioHostProtocol radioHostProtocol = (RadioHostProtocol) this.protocol;
        svg.getClass();
        RadioSelectionGroupBinding radioSelectionGroupBinding = (RadioSelectionGroupBinding) this._widget;
        if (radioSelectionGroupBinding == null) {
            a$$ExternalSyntheticBUOutline0.m$1("detached");
            return;
        }
        int i = uiPropertyChange.tag;
        Object obj = uiPropertyChange.value;
        if (i == 1) {
            obj.getClass();
            radioSelectionGroupBinding.selectedIndex$delegate.setValue((Integer) obj);
            return;
        }
        int i2 = 3;
        if (i != 2) {
            if (i != 3) {
                radioHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(36, i);
                return;
            }
            obj.getClass();
            if (((Boolean) obj).booleanValue()) {
                radioSelectionGroupBinding.onSelectionChanged$delegate.setValue(new GraphLoop$processingQueue$1(1, new RadioSelectionGroupProtocolNode$OnSelectionChanged(this.id, svg, radioHostProtocol), RadioSelectionGroupProtocolNode$OnSelectionChanged.class, "invoke", "invoke(I)V", 0, 23));
                return;
            } else {
                Path$$ExternalSyntheticBUOutline0.m$2();
                return;
            }
        }
        obj.getClass();
        List<RadioSelectionOption> list = (List) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (RadioSelectionOption radioSelectionOption : list) {
            arrayList.add(new FormBlocker.Element.OptionPickerElement.Option(radioSelectionOption.id, radioSelectionOption.title, radioSelectionOption.subtitle, radioSelectionOption.isSelectable ? null : new FormBlocker.Element.OptionPickerElement.Option.Selectability.Unselectable(new FormBlocker.Element.OptionPickerElement.Option.Unselectable(null, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0)), null, null, null, null, null, null, null, null, null, 8176, null));
        }
        radioSelectionGroupBinding.options$delegate.setValue(arrayList);
    }

    private final void apply$app$cash$arcade$protocol$host$arcade$RoundedRectProtocolNode(UiPropertyChange uiPropertyChange, SVG svg) {
        svg.getClass();
        RoundedRectBinding roundedRectBinding = (RoundedRectBinding) this._widget;
        if (roundedRectBinding == null) {
            a$$ExternalSyntheticBUOutline0.m$1("detached");
            return;
        }
        int i = uiPropertyChange.tag;
        Object obj = uiPropertyChange.value;
        switch (i) {
            case 1:
                roundedRectBinding.color$delegate.setValue((app.cash.arcade.values.Color) obj);
                break;
            case 2:
                obj.getClass();
                roundedRectBinding.cornerRadius$delegate.setFloatValue(((Float) obj).floatValue());
                break;
            case 3:
                obj.getClass();
                roundedRectBinding.borderStyle$delegate.setValue((BorderStyle) obj);
                break;
            case 4:
                obj.getClass();
                roundedRectBinding.borderColor$delegate.setValue((app.cash.arcade.values.Color) obj);
                break;
            case 5:
                obj.getClass();
                roundedRectBinding.borderWidth$delegate.setFloatValue(((Float) obj).floatValue());
                break;
            case 6:
                obj.getClass();
                roundedRectBinding.onClick$delegate.setValue(((Boolean) obj).booleanValue() ? new PageFetcher$generateNewPagingSource$3(0, new RoundedRectProtocolNode$OnClick(this.id, svg), RoundedRectProtocolNode$OnClick.class, "invoke", "invoke()V", 0, 25) : null);
                break;
            case 7:
                roundedRectBinding.backgroundImage$delegate.setValue((ImageResource) obj);
                break;
            default:
                ((RoundedRectHostProtocol) this.protocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(62, i);
                break;
        }
    }

    private final void apply$app$cash$arcade$protocol$host$arcade$SearchBarProtocolNode(UiPropertyChange uiPropertyChange, SVG svg) {
        GraphLoop$processingQueue$1 graphLoop$processingQueue$1;
        SearchBarHostProtocol searchBarHostProtocol = (SearchBarHostProtocol) this.protocol;
        svg.getClass();
        SearchBarBinding searchBarBinding = (SearchBarBinding) this._widget;
        if (searchBarBinding == null) {
            a$$ExternalSyntheticBUOutline0.m$1("detached");
            return;
        }
        int i = uiPropertyChange.tag;
        Object obj = uiPropertyChange.value;
        if (i == 1) {
            obj.getClass();
            TextFieldState textFieldState = (TextFieldState) obj;
            if (textFieldState.userEditCount < searchBarBinding.getQuery().userEditCount) {
                return;
            }
            searchBarBinding.query$delegate.setValue(textFieldState);
            return;
        }
        if (i == 2) {
            obj.getClass();
            searchBarBinding.placeholder$delegate.setValue((String) obj);
        } else {
            if (i != 3) {
                searchBarHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(71, i);
                return;
            }
            obj.getClass();
            if (((Boolean) obj).booleanValue()) {
                graphLoop$processingQueue$1 = new GraphLoop$processingQueue$1(1, new SearchBarProtocolNode$OnQueryChange(this.id, svg, searchBarHostProtocol), SearchBarProtocolNode$OnQueryChange.class, "invoke", "invoke(Lapp/cash/arcade/values/TextFieldState;)V", 0, 25);
            } else {
                graphLoop$processingQueue$1 = null;
            }
            searchBarBinding.onQueryChange$delegate.setValue(graphLoop$processingQueue$1);
        }
    }

    private final void apply$app$cash$arcade$protocol$host$arcade$SegmentedCircleProtocolNode(UiPropertyChange uiPropertyChange, SVG svg) {
        svg.getClass();
        ToggleBinding toggleBinding = (ToggleBinding) this._widget;
        if (toggleBinding == null) {
            a$$ExternalSyntheticBUOutline0.m$1("detached");
            return;
        }
        int i = uiPropertyChange.tag;
        Object obj = uiPropertyChange.value;
        if (i == 1) {
            obj.getClass();
            ((ParcelableSnapshotMutableLongState) toggleBinding.onChange$delegate).setLongValue(((Long) obj).longValue());
        } else {
            if (i != 2) {
                ((SwitchHostProtocol) this.protocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(83, i);
                return;
            }
            obj.getClass();
            toggleBinding.state$delegate.setValue((List) obj);
        }
    }

    private final void apply$app$cash$arcade$protocol$host$arcade$SegmentedToggleProtocolNode(UiPropertyChange uiPropertyChange, SVG svg) {
        SearchBarHostProtocol searchBarHostProtocol = (SearchBarHostProtocol) this.protocol;
        svg.getClass();
        SwitchBinding switchBinding = (SwitchBinding) this._widget;
        if (switchBinding == null) {
            a$$ExternalSyntheticBUOutline0.m$1("detached");
            return;
        }
        int i = uiPropertyChange.tag;
        Object obj = uiPropertyChange.value;
        if (i == 1) {
            obj.getClass();
            MooncakeToggle.setPrimaryActivated$default((MooncakeToggle) switchBinding.value, ((SegmentedToggleValue) obj) == SegmentedToggleValue.Left, true, true, false, 8, null);
            return;
        }
        int i2 = 4;
        if (i == 2) {
            obj.getClass();
            if (((Boolean) obj).booleanValue()) {
                ((MooncakeToggle) switchBinding.value).setOnToggle(new BadgeQueries$$ExternalSyntheticLambda5(new GraphLoop$processingQueue$1(1, new SegmentedToggleProtocolNode$OnValueChanged(this.id, svg, searchBarHostProtocol), SegmentedToggleProtocolNode$OnValueChanged.class, "invoke", "invoke(Lapp/cash/arcade/values/SegmentedToggleValue;)V", 0, 29), i2));
                return;
            } else {
                Path$$ExternalSyntheticBUOutline0.m$2();
                return;
            }
        }
        if (i == 3) {
            obj.getClass();
        } else if (i != 4) {
            searchBarHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(41, i);
        } else {
            obj.getClass();
        }
    }

    private final void apply$app$cash$arcade$protocol$host$arcade$ShimmerProtocolNode(UiPropertyChange uiPropertyChange, SVG svg) {
        svg.getClass();
        ShimmerBinding shimmerBinding = (ShimmerBinding) this._widget;
        if (shimmerBinding == null) {
            a$$ExternalSyntheticBUOutline0.m$1("detached");
            return;
        }
        int i = uiPropertyChange.tag;
        if (i != 1) {
            ((ImageHostProtocol) this.protocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(66, i);
            return;
        }
        Object obj = uiPropertyChange.value;
        obj.getClass();
        shimmerBinding.cornerRadius.setValue(new Dp((float) (((app.cash.redwood.ui.Dp) obj).value / 1.1d)));
    }

    private final void apply$app$cash$arcade$protocol$host$arcade$SpinnerProtocolNode(UiPropertyChange uiPropertyChange, SVG svg) {
        svg.getClass();
        SpinnerBinding spinnerBinding = (SpinnerBinding) this._widget;
        if (spinnerBinding == null) {
            a$$ExternalSyntheticBUOutline0.m$1("detached");
            return;
        }
        int i = uiPropertyChange.tag;
        Object obj = uiPropertyChange.value;
        if (i == 1) {
            obj.getClass();
        } else {
            if (i != 2) {
                ((SpinnerHostProtocol) this.protocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(22, i);
                return;
            }
            obj.getClass();
            IconSize iconSize = (IconSize) obj;
            if (iconSize instanceof IconSize.Pt) {
                spinnerBinding.size = ((IconSize.Pt) iconSize).points;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [androidx.compose.runtime.internal.ComposableLambdaImpl] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [androidx.compose.runtime.internal.ComposableLambdaImpl] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [androidx.compose.runtime.internal.ComposableLambdaImpl] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.compose.runtime.ParcelableSnapshotMutableState] */
    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void apply(UiPropertyChange uiPropertyChange, SVG svg) {
        TimelineItem.State state;
        TimelineItem.State state2;
        String str;
        Object obj;
        AmountConfig.MoneyConfig moneyConfig;
        BitcoinDisplayUnits bitcoinDisplayUnits;
        int i = this.$r8$classId;
        int i2 = 8;
        int i3 = 7;
        int i4 = 5;
        Throwable th = null;
        r12 = null;
        Illustrations illustrations = null;
        WidgetHostProtocol widgetHostProtocol = this.protocol;
        switch (i) {
            case 0:
                svg.getClass();
                IconBinding iconBinding = (IconBinding) this._widget;
                if (iconBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                IconBinding$value$1 iconBinding$value$1 = iconBinding.value;
                int i5 = uiPropertyChange.tag;
                Object obj2 = uiPropertyChange.value;
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            ((IconHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(16, i5);
                            return;
                        } else {
                            iconBinding.size = (IconSize) obj2;
                            iconBinding$value$1.requestLayout();
                            return;
                        }
                    }
                    app.cash.arcade.values.Color color = (app.cash.arcade.values.Color) obj2;
                    Integer valueOf = color != null ? Integer.valueOf(ColorsKt.toColorInt$default(color, iconBinding.themeInfo)) : null;
                    if (valueOf == null) {
                        iconBinding$value$1.clearColorFilter();
                        return;
                    } else {
                        iconBinding$value$1.setColorFilter(valueOf.intValue());
                        return;
                    }
                }
                obj2.getClass();
                ImageResource imageResource = (ImageResource) obj2;
                if (!(imageResource instanceof ImageResource.Url)) {
                    ViewTargetRequestManagerKt.getRequestManager(iconBinding$value$1).dispose();
                    Integer drawableResId = ImageResourcesKt.toDrawableResId(imageResource, ResourcesKt.mooncakeResourceIndex);
                    drawableResId.getClass();
                    iconBinding$value$1.setImageResource(drawableResId.intValue());
                    return;
                }
                ImageResource.Url url = (ImageResource.Url) imageResource;
                Image image = new Image(url.light, url.dark, 4);
                ImageRequest.Builder builder = new ImageRequest.Builder(iconBinding.context);
                builder.data = image;
                ImageRequests_androidKt.target(builder, iconBinding$value$1);
                iconBinding.imageLoader.enqueue(builder.build());
                return;
            case 1:
                svg.getClass();
                MooncakeActivitySectionHeader mooncakeActivitySectionHeader = (MooncakeActivitySectionHeader) this._widget;
                if (mooncakeActivitySectionHeader == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i6 = uiPropertyChange.tag;
                if (i6 != 1) {
                    ((NavBarHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(47, i6);
                    return;
                }
                Object obj3 = uiPropertyChange.value;
                obj3.getClass();
                mooncakeActivitySectionHeader.title$delegate.setValue((String) obj3);
                return;
            case 2:
                RoundedRectHostProtocol roundedRectHostProtocol = (RoundedRectHostProtocol) widgetHostProtocol;
                svg.getClass();
                ArcadeTimeline2Binding arcadeTimeline2Binding = (ArcadeTimeline2Binding) this._widget;
                if (arcadeTimeline2Binding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i7 = uiPropertyChange.tag;
                Object obj4 = uiPropertyChange.value;
                if (i7 != 1) {
                    if (i7 == 2) {
                        obj4.getClass();
                        if (((Boolean) obj4).booleanValue()) {
                            arcadeTimeline2Binding.onItemClick$delegate.setValue(new GraphLoop$processingQueue$1(1, new ArcadeTimeline2ProtocolNode$OnItemClick(this.id, svg, roundedRectHostProtocol), ArcadeTimeline2ProtocolNode$OnItemClick.class, "invoke", "invoke(I)V", 0, 6));
                            return;
                        } else {
                            Path$$ExternalSyntheticBUOutline0.m$2();
                            return;
                        }
                    }
                    if (i7 != 3) {
                        if (i7 != 4) {
                            roundedRectHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(81, i7);
                            return;
                        } else {
                            arcadeTimeline2Binding.id$delegate.setValue((String) obj4);
                            return;
                        }
                    }
                    obj4.getClass();
                    List<ArcadeTimeline2CollapseRange> list = (List) obj4;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (ArcadeTimeline2CollapseRange arcadeTimeline2CollapseRange : list) {
                        arrayList.add(new TimelineState.CollapseRange(arcadeTimeline2CollapseRange.label, arcadeTimeline2CollapseRange.collapsedIndices));
                    }
                    arcadeTimeline2Binding.collapseRanges$delegate.setValue(Tags.toPersistentList(arrayList));
                    return;
                }
                obj4.getClass();
                List list2 = (List) obj4;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                int i8 = 0;
                for (Object obj5 : list2) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        Throwable th2 = th;
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw th2;
                    }
                    ArcadeTimeline2Item arcadeTimeline2Item = (ArcadeTimeline2Item) obj5;
                    int ordinal = arcadeTimeline2Item.state.ordinal();
                    if (ordinal == 0) {
                        state = TimelineItem.State.NotStarted;
                    } else if (ordinal == 1) {
                        state = TimelineItem.State.Incomplete;
                    } else if (ordinal == 2) {
                        state = TimelineItem.State.Pending;
                    } else if (ordinal == 3) {
                        state = TimelineItem.State.Skipped;
                    } else {
                        if (ordinal != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        state = TimelineItem.State.Done;
                    }
                    TimelineItem.State state3 = state;
                    Throwable th3 = th;
                    ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new BankingDialogKt$$ExternalSyntheticLambda8(arcadeTimeline2Item, i3), true, -1863020782);
                    String str2 = arcadeTimeline2Item.value;
                    ?? composableLambdaImpl2 = str2 != null ? new ComposableLambdaImpl(new BankingDialog$$ExternalSyntheticLambda1(i4, str2, arcadeTimeline2Item, arcadeTimeline2Binding), true, -60613967) : th3;
                    String str3 = arcadeTimeline2Item.body;
                    ?? composableLambdaImpl3 = str3 != null ? new ComposableLambdaImpl(new SectionKt$$ExternalSyntheticLambda2(r10, str3, arcadeTimeline2Item, arcadeTimeline2Binding), true, -1487006040) : th3;
                    String str4 = arcadeTimeline2Item.valueDescriptor;
                    arrayList2.add(new TimelineItem(state3, composableLambdaImpl, (ComposableLambdaImpl) composableLambdaImpl2, (ComposableLambdaImpl) composableLambdaImpl3, (ComposableLambdaImpl) (str4 != null ? new ComposableLambdaImpl(new TransfersViewKt$$ExternalSyntheticLambda5(str4, 18), true, 2104418867) : th3), (Function0) (arcadeTimeline2Item.isClickable ? new q2$$ExternalSyntheticLambda8(arcadeTimeline2Binding, i8, 8) : th3), 64));
                    i8 = i9;
                    th = th3;
                    i3 = 7;
                    i4 = 5;
                }
                arcadeTimeline2Binding.items$delegate.setValue(Tags.toPersistentList(arrayList2));
                return;
            case 3:
                svg.getClass();
                ArcadeTimelineItemBinding arcadeTimelineItemBinding = (ArcadeTimelineItemBinding) this._widget;
                if (arcadeTimelineItemBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i10 = uiPropertyChange.tag;
                Object obj6 = uiPropertyChange.value;
                if (i10 != 1) {
                    if (i10 == 2) {
                        arcadeTimelineItemBinding.title$delegate.setValue((String) obj6);
                        return;
                    }
                    if (i10 == 3) {
                        arcadeTimelineItemBinding.body$delegate.setValue((String) obj6);
                        return;
                    }
                    if (i10 == 4) {
                        arcadeTimelineItemBinding.valueText$delegate.setValue((String) obj6);
                        return;
                    } else if (i10 != 5) {
                        ((SpinnerHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(74, i10);
                        return;
                    } else {
                        arcadeTimelineItemBinding.valueDescriptor$delegate.setValue((String) obj6);
                        return;
                    }
                }
                obj6.getClass();
                int ordinal2 = ((ArcadeTimelineItemState) obj6).ordinal();
                if (ordinal2 == 0) {
                    state2 = TimelineItem.State.NotStarted;
                } else if (ordinal2 == 1) {
                    state2 = TimelineItem.State.Incomplete;
                } else if (ordinal2 == 2) {
                    state2 = TimelineItem.State.Pending;
                } else if (ordinal2 == 3) {
                    state2 = TimelineItem.State.Done;
                } else {
                    if (ordinal2 != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    state2 = TimelineItem.State.Skipped;
                }
                arcadeTimelineItemBinding.state$delegate.setValue(state2);
                return;
            case 4:
                svg.getClass();
                BenefitsComparisonTableBinding benefitsComparisonTableBinding = (BenefitsComparisonTableBinding) this._widget;
                if (benefitsComparisonTableBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i11 = uiPropertyChange.tag;
                if (i11 != 1) {
                    ((TimelineHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(84, i11);
                    return;
                }
                Object obj7 = uiPropertyChange.value;
                obj7.getClass();
                benefitsComparisonTableBinding.rows$delegate.setValue((List) obj7);
                return;
            case 5:
                TextFieldHostProtocol textFieldHostProtocol = (TextFieldHostProtocol) widgetHostProtocol;
                svg.getClass();
                BiometricsPromptBinding biometricsPromptBinding = (BiometricsPromptBinding) this._widget;
                if (biometricsPromptBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i12 = uiPropertyChange.tag;
                Object obj8 = uiPropertyChange.value;
                switch (i12) {
                    case 1:
                        obj8.getClass();
                        biometricsPromptBinding.key.setValue(Optional.of((String) obj8));
                        return;
                    case 2:
                        obj8.getClass();
                        biometricsPromptBinding.title.setValue(Optional.of((String) obj8));
                        return;
                    case 3:
                        biometricsPromptBinding.subtitle.setValue(Optional.ofNullable((String) obj8));
                        return;
                    case 4:
                        biometricsPromptBinding.description.setValue(Optional.ofNullable((String) obj8));
                        return;
                    case 5:
                        obj8.getClass();
                        biometricsPromptBinding.negativeButton.setValue(Optional.of((String) obj8));
                        return;
                    case 6:
                        obj8.getClass();
                        if (((Boolean) obj8).booleanValue()) {
                            biometricsPromptBinding.onResult.setValue(Optional.ofNullable(new GraphLoop$processingQueue$1(1, new BiometricsPromptProtocolNode$OnResult(this.id, svg, textFieldHostProtocol), BiometricsPromptProtocolNode$OnResult.class, "invoke", "invoke(Lcom/squareup/cash/treehouse/biometrics/BiometricsReadResult;)V", 0, 7)));
                            return;
                        } else {
                            Path$$ExternalSyntheticBUOutline0.m$2();
                            return;
                        }
                    default:
                        textFieldHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(44, i12);
                        return;
                }
            case 6:
                svg.getClass();
                ButtonBinding buttonBinding = (ButtonBinding) this._widget;
                if (buttonBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = buttonBinding.mooncakeStyle$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = buttonBinding.backgroundColor$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = buttonBinding.textColor$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = buttonBinding.textStyle$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState5 = buttonBinding.iconTint$delegate;
                ThemeInfo themeInfo = buttonBinding.themeInfo;
                int i13 = uiPropertyChange.tag;
                Object obj9 = uiPropertyChange.value;
                switch (i13) {
                    case 1:
                        obj9.getClass();
                        buttonBinding.text$delegate.setValue((String) obj9);
                        return;
                    case 2:
                        obj9.getClass();
                        buttonBinding.isButtonEnabled$delegate.setValue((Boolean) obj9);
                        return;
                    case 3:
                    default:
                        ((ButtonHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(11, i13);
                        return;
                    case 4:
                        obj9.getClass();
                        buttonBinding.onClick$delegate.setValue(((Boolean) obj9).booleanValue() ? new PageFetcher$generateNewPagingSource$3(0, new ButtonProtocolNode$OnClick(this.id, svg), ButtonProtocolNode$OnClick.class, "invoke", "invoke()V", 0, 7) : null);
                        return;
                    case 5:
                        obj9.getClass();
                        ButtonStyle buttonStyle = (ButtonStyle) obj9;
                        ButtonBinding.ArcadeStyle arcadeStyle = buttonStyle.equals(ArcadeButtonStyles.f14default) ? ButtonBinding.ArcadeStyle.DEFAULT : buttonStyle.equals(ArcadeButtonStyles.compact) ? ButtonBinding.ArcadeStyle.COMPACT : buttonStyle.equals(ArcadeButtonStyles.cta) ? ButtonBinding.ArcadeStyle.CTA : buttonStyle.equals(ArcadeButtonStyles.dropdown) ? ButtonBinding.ArcadeStyle.DROPDOWN : null;
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState6 = buttonBinding.arcadeStyle$delegate;
                        if (arcadeStyle != null) {
                            parcelableSnapshotMutableState6.setValue(arcadeStyle);
                            parcelableSnapshotMutableState.setValue(null);
                            return;
                        } else {
                            parcelableSnapshotMutableState6.setValue(null);
                            parcelableSnapshotMutableState.setValue(buttonStyle.equals(MooncakeButtonStyles.primary) ? MooncakePillButton.Style.PRIMARY : buttonStyle.equals(MooncakeButtonStyles.secondary) ? MooncakePillButton.Style.SECONDARY : buttonStyle.equals(MooncakeButtonStyles.outline) ? MooncakePillButton.Style.OUTLINE : buttonStyle.equals(MooncakeButtonStyles.tertiary) ? MooncakePillButton.Style.TERTIARY : MooncakePillButton.Style.PRIMARY);
                            return;
                        }
                    case 6:
                        obj9.getClass();
                        ButtonSize buttonSize = (ButtonSize) obj9;
                        buttonBinding.size$delegate.setValue(buttonSize.equals(MooncakeButtonSizes.small) ? MooncakePillButton.Size.SMALL : buttonSize.equals(MooncakeButtonSizes.medium) ? MooncakePillButton.Size.MEDIUM : buttonSize.equals(MooncakeButtonSizes.large) ? MooncakePillButton.Size.LARGE : MooncakePillButton.Size.LARGE);
                        return;
                    case 7:
                        app.cash.arcade.values.Color color2 = (app.cash.arcade.values.Color) obj9;
                        if (color2 == null) {
                            parcelableSnapshotMutableState2.setValue(null);
                            return;
                        } else {
                            parcelableSnapshotMutableState2.setValue(new Color(ColorKt.Color(ColorsKt.toColorInt$default(color2, themeInfo))));
                            return;
                        }
                    case 8:
                        ImageResource imageResource2 = (ImageResource) obj9;
                        buttonBinding.icon$delegate.setValue(imageResource2);
                        buttonBinding.setIconResId(imageResource2 != null ? ImageResourcesKt.toDrawableResId(imageResource2, ResourcesKt.mooncakeResourceIndex) : null);
                        return;
                    case 9:
                        app.cash.arcade.values.Color color3 = (app.cash.arcade.values.Color) obj9;
                        if (color3 == null) {
                            parcelableSnapshotMutableState3.setValue(null);
                            return;
                        } else {
                            parcelableSnapshotMutableState3.setValue(new Color(ColorKt.Color(ColorsKt.toColorInt$default(color3, themeInfo))));
                            return;
                        }
                    case 10:
                        TextStyle textStyle = (TextStyle) obj9;
                        if (textStyle == null) {
                            parcelableSnapshotMutableState4.setValue(null);
                            return;
                        } else {
                            parcelableSnapshotMutableState4.setValue(MooncakeTypographyKt.m3638toComposeTextStylePOD2ecY$default(TextStylesKt.toTextThemeInfo(textStyle)));
                            return;
                        }
                    case 11:
                        app.cash.arcade.values.Color color4 = (app.cash.arcade.values.Color) obj9;
                        if (color4 == null) {
                            parcelableSnapshotMutableState5.setValue(null);
                            return;
                        } else {
                            parcelableSnapshotMutableState5.setValue(new Color(ColorKt.Color(ColorsKt.toColorInt$default(color4, themeInfo))));
                            return;
                        }
                    case 12:
                        obj9.getClass();
                        buttonBinding.arcadeProminence$delegate.setValue((ButtonProminence) obj9);
                        return;
                }
            case 7:
                svg.getClass();
                CardUpsellBinding cardUpsellBinding = (CardUpsellBinding) this._widget;
                if (cardUpsellBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i14 = uiPropertyChange.tag;
                Object obj10 = uiPropertyChange.value;
                if (i14 == 1) {
                    obj10.getClass();
                    cardUpsellBinding.title$delegate.setValue((String) obj10);
                    return;
                }
                if (i14 == 2) {
                    cardUpsellBinding.body$delegate.setValue((String) obj10);
                    return;
                }
                if (i14 == 3) {
                    obj10.getClass();
                    cardUpsellBinding.buttonText$delegate.setValue((String) obj10);
                    return;
                }
                if (i14 == 4) {
                    obj10.getClass();
                    cardUpsellBinding.onClick$delegate.setValue(((Boolean) obj10).booleanValue() ? new PageFetcher$generateNewPagingSource$3(0, new CardUpsellProtocolNode$OnClick(this.id, svg), CardUpsellProtocolNode$OnClick.class, "invoke", "invoke()V", 0, 8) : null);
                    return;
                } else {
                    if (i14 != 5) {
                        ((ToastHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(79, i14);
                        return;
                    }
                    ImageResource.Token token = (ImageResource.Token) obj10;
                    if (token != null && (str = token.id) != null) {
                        Illustrations.Companion.getClass();
                        illustrations = (Illustrations) Illustrations.illustrationMap.get(str);
                    }
                    cardUpsellBinding.illustration$delegate.setValue(illustrations);
                    return;
                }
            case 8:
                ToggleHostProtocol toggleHostProtocol = (ToggleHostProtocol) widgetHostProtocol;
                svg.getClass();
                ToggleBinding toggleBinding = (ToggleBinding) this._widget;
                if (toggleBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                ?? r4 = toggleBinding.state$delegate;
                int i15 = uiPropertyChange.tag;
                Object obj11 = uiPropertyChange.value;
                if (i15 == 1) {
                    obj11.getClass();
                    BooleanState booleanState = (BooleanState) obj11;
                    if (((BooleanState) r4.getValue()).userEditCount > booleanState.userEditCount) {
                        return;
                    }
                    r4.setValue(booleanState);
                    return;
                }
                if (i15 == 2) {
                    obj11.getClass();
                    ((ParcelableSnapshotMutableState) toggleBinding.enabled$delegate).setValue((Boolean) obj11);
                    return;
                } else if (i15 != 3) {
                    toggleHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(76, i15);
                    return;
                } else {
                    obj11.getClass();
                    ((ParcelableSnapshotMutableState) toggleBinding.onChange$delegate).setValue(((Boolean) obj11).booleanValue() ? new GraphLoop$processingQueue$1(1, new CheckboxProtocolNode$OnChange(this.id, svg, toggleHostProtocol), CheckboxProtocolNode$OnChange.class, "invoke", "invoke(Lapp/cash/arcade/values/BooleanState;)V", 0, 9) : null);
                    return;
                }
            case 9:
                svg.getClass();
                CarouselBinding carouselBinding = (CarouselBinding) this._widget;
                if (carouselBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i16 = uiPropertyChange.tag;
                if (i16 != 1) {
                    ((ImageHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(18, i16);
                    return;
                }
                Object obj12 = uiPropertyChange.value;
                obj12.getClass();
                ProgressBar progressBar = (ProgressBar) carouselBinding.children;
                Resources resources = ((Context) carouselBinding.value).getResources();
                resources.getClass();
                progressBar.setIndeterminateDrawable(ImageResourcesKt.toDrawable$default((ImageResource) obj12, resources));
                return;
            case 10:
                svg.getClass();
                DividerBinding dividerBinding = (DividerBinding) this._widget;
                if (dividerBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i17 = uiPropertyChange.tag;
                if (i17 != 1) {
                    ((ImageHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(43, i17);
                    return;
                }
                Object obj13 = uiPropertyChange.value;
                obj13.getClass();
                dividerBinding.style = (DividerStyle) obj13;
                dividerBinding.requestLayout();
                return;
            case 11:
                svg.getClass();
                ImageBinding imageBinding = (ImageBinding) this._widget;
                if (imageBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                IconButtonBinding$value$1 iconButtonBinding$value$1 = (IconButtonBinding$value$1) imageBinding.value;
                int i18 = uiPropertyChange.tag;
                Object obj14 = uiPropertyChange.value;
                if (i18 == 1) {
                    obj14.getClass();
                    Integer drawableResId2 = ImageResourcesKt.toDrawableResId((ImageResource) obj14, ResourcesKt.mooncakeResourceIndex);
                    if (drawableResId2 == null) {
                        iconButtonBinding$value$1.setImageDrawable(null);
                        return;
                    } else {
                        iconButtonBinding$value$1.setImageResource(drawableResId2.intValue());
                        return;
                    }
                }
                if (i18 == 2) {
                    obj14.getClass();
                    iconButtonBinding$value$1.setContentDescription((String) obj14);
                    return;
                }
                if (i18 == 3) {
                    obj14.getClass();
                    PageFetcher$generateNewPagingSource$3 pageFetcher$generateNewPagingSource$3 = ((Boolean) obj14).booleanValue() ? new PageFetcher$generateNewPagingSource$3(0, new IconButtonProtocolNode$OnClick(this.id, svg), IconButtonProtocolNode$OnClick.class, "invoke", "invoke()V", 0, 10) : null;
                    if (pageFetcher$generateNewPagingSource$3 == null) {
                        iconButtonBinding$value$1.callOnClick();
                        return;
                    } else {
                        iconButtonBinding$value$1.setOnClickListener(new Q0$$ExternalSyntheticLambda0(pageFetcher$generateNewPagingSource$3, 21));
                        return;
                    }
                }
                if (i18 == 4) {
                    imageBinding.imageLoader = (IconSize) obj14;
                    iconButtonBinding$value$1.requestLayout();
                    return;
                } else {
                    if (i18 != 5) {
                        ((TextFieldHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(21, i18);
                        return;
                    }
                    app.cash.arcade.values.Color color5 = (app.cash.arcade.values.Color) obj14;
                    Integer valueOf2 = color5 != null ? Integer.valueOf(ColorsKt.toColorInt$default(color5, (ThemeInfo) imageBinding.context)) : null;
                    if (valueOf2 == null) {
                        iconButtonBinding$value$1.clearColorFilter();
                        return;
                    } else {
                        iconButtonBinding$value$1.setColorFilter(valueOf2.intValue());
                        return;
                    }
                }
            case 12:
                svg.getClass();
                ImageBinding imageBinding2 = (ImageBinding) this._widget;
                if (imageBinding2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i19 = uiPropertyChange.tag;
                if (i19 != 1) {
                    ((ImageHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(57, i19);
                    return;
                }
                Object obj15 = uiPropertyChange.value;
                obj15.getClass();
                ImageResource imageResource3 = (ImageResource) obj15;
                AppCompatImageView appCompatImageView = (AppCompatImageView) imageBinding2.value;
                if (!(imageResource3 instanceof ImageResource.Url)) {
                    ViewTargetRequestManagerKt.getRequestManager(appCompatImageView).dispose();
                    Integer drawableResId3 = ImageResourcesKt.toDrawableResId(imageResource3, ResourcesKt.mooncakeResourceIndex);
                    drawableResId3.getClass();
                    appCompatImageView.setImageResource(drawableResId3.intValue());
                    return;
                }
                ImageResource.Url url2 = (ImageResource.Url) imageResource3;
                Image image2 = new Image(url2.light, url2.dark, 4);
                ImageRequest.Builder builder2 = new ImageRequest.Builder((Context) imageBinding2.context);
                builder2.data = image2;
                ImageRequests_androidKt.target(builder2, appCompatImageView);
                ((RealImageLoader) imageBinding2.imageLoader).enqueue(builder2.build());
                return;
            case 13:
                svg.getClass();
                if (((InlineAppMessageView) this._widget) == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i20 = uiPropertyChange.tag;
                if (i20 != 1) {
                    ((ClickableCellHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(56, i20);
                    return;
                }
                Object obj16 = uiPropertyChange.value;
                obj16.getClass();
                if (((Boolean) obj16).booleanValue()) {
                    return;
                } else {
                    return;
                }
            case 14:
                InputFieldHostProtocol inputFieldHostProtocol = (InputFieldHostProtocol) widgetHostProtocol;
                svg.getClass();
                InputFieldBinding inputFieldBinding = (InputFieldBinding) this._widget;
                if (inputFieldBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i21 = uiPropertyChange.tag;
                Object obj17 = uiPropertyChange.value;
                switch (i21) {
                    case 1:
                        obj17.getClass();
                        TextFieldState textFieldState = (TextFieldState) obj17;
                        if (textFieldState.userEditCount < inputFieldBinding.treehouseTextFieldState.userEditCount) {
                            return;
                        }
                        inputFieldBinding.treehouseTextFieldState = textFieldState;
                        androidx.compose.foundation.text.input.TextFieldState textFieldState2 = inputFieldBinding.composeTextFieldState;
                        TextFieldBuffer startEdit = textFieldState2.startEdit();
                        try {
                            startEdit.replace(0, startEdit.buffer.length(), textFieldState.text);
                            startEdit.m379setSelection5zctL8(SizeKt.TextRange(textFieldState.selectionStart, textFieldState.selectionEnd));
                            textFieldState2.commitEdit(startEdit);
                            return;
                        } finally {
                            textFieldState2.finishEditing();
                        }
                    case 2:
                        obj17.getClass();
                        inputFieldBinding.enabled$delegate.setValue((Boolean) obj17);
                        return;
                    case 3:
                        obj17.getClass();
                        inputFieldBinding.readOnly$delegate.setValue((Boolean) obj17);
                        return;
                    case 4:
                        obj17.getClass();
                        inputFieldBinding.isError$delegate.setValue((Boolean) obj17);
                        return;
                    case 5:
                        obj17.getClass();
                        inputFieldBinding.isPassword$delegate.setValue((Boolean) obj17);
                        return;
                    case 6:
                        inputFieldBinding.label$delegate.setValue((String) obj17);
                        return;
                    case 7:
                        inputFieldBinding.leadingIcon$delegate.setValue((ImageResource) obj17);
                        return;
                    case 8:
                        inputFieldBinding.leadingIconContentDescription$delegate.setValue((String) obj17);
                        return;
                    case 9:
                        obj17.getClass();
                        inputFieldBinding.onLeadingIconClick$delegate.setValue(((Boolean) obj17).booleanValue() ? new PageFetcher$generateNewPagingSource$3(0, new InputFieldProtocolNode$OnLeadingIconClick(this.id, svg), InputFieldProtocolNode$OnLeadingIconClick.class, "invoke", "invoke()V", 0, 12) : null);
                        return;
                    case 10:
                        inputFieldBinding.trailingIcon$delegate.setValue((ImageResource) obj17);
                        return;
                    case 11:
                        inputFieldBinding.trailingIconContentDescription$delegate.setValue((String) obj17);
                        return;
                    case 12:
                        obj17.getClass();
                        inputFieldBinding.onTrailingIconClick$delegate.setValue(((Boolean) obj17).booleanValue() ? new PageFetcher$generateNewPagingSource$3(0, new InputFieldProtocolNode$OnTrailingIconClick(this.id, svg), InputFieldProtocolNode$OnTrailingIconClick.class, "invoke", "invoke()V", 0, 13) : null);
                        return;
                    case 13:
                        inputFieldBinding.helperText$delegate.setValue((InputFieldHelperText) obj17);
                        return;
                    case 14:
                        inputFieldBinding.placeholder$delegate.setValue((String) obj17);
                        return;
                    case 15:
                        KeyboardCapitalization keyboardCapitalization = (KeyboardCapitalization) obj17;
                        inputFieldBinding.keyboardOptionsChanged = true;
                        KeyboardCapitalization.Companion.getClass();
                        inputFieldBinding.capitalization = Intrinsics.areEqual(keyboardCapitalization, KeyboardCapitalization.None) ? 0 : Intrinsics.areEqual(keyboardCapitalization, KeyboardCapitalization.Characters) ? 1 : Intrinsics.areEqual(keyboardCapitalization, KeyboardCapitalization.Words) ? 2 : Intrinsics.areEqual(keyboardCapitalization, KeyboardCapitalization.Sentences) ? 3 : -1;
                        return;
                    case 16:
                        inputFieldBinding.keyboardOptionsChanged = true;
                        inputFieldBinding.autoCorrectEnabled = (Boolean) obj17;
                        return;
                    case 17:
                        KeyboardType keyboardType = (KeyboardType) obj17;
                        inputFieldBinding.keyboardOptionsChanged = true;
                        KeyboardType.Companion.getClass();
                        if (Intrinsics.areEqual(keyboardType, KeyboardType.Text)) {
                            i2 = 1;
                        } else if (Intrinsics.areEqual(keyboardType, KeyboardType.Ascii)) {
                            i2 = 2;
                        } else if (Intrinsics.areEqual(keyboardType, KeyboardType.Number)) {
                            i2 = 3;
                        } else if (Intrinsics.areEqual(keyboardType, KeyboardType.Phone)) {
                            i2 = 4;
                        } else if (Intrinsics.areEqual(keyboardType, KeyboardType.Uri)) {
                            i2 = 5;
                        } else if (Intrinsics.areEqual(keyboardType, KeyboardType.Email)) {
                            i2 = 6;
                        } else if (Intrinsics.areEqual(keyboardType, KeyboardType.Password)) {
                            i2 = 7;
                        } else if (!Intrinsics.areEqual(keyboardType, KeyboardType.NumberPassword)) {
                            i2 = Intrinsics.areEqual(keyboardType, KeyboardType.Decimal) ? 9 : 0;
                        }
                        inputFieldBinding.keyboardType = i2;
                        return;
                    case 18:
                        ImeAction imeAction = (ImeAction) obj17;
                        inputFieldBinding.keyboardOptionsChanged = true;
                        ImeAction.Companion.getClass();
                        if (Intrinsics.areEqual(imeAction, ImeAction.None)) {
                            i3 = 0;
                        } else if (Intrinsics.areEqual(imeAction, ImeAction.Default)) {
                            i3 = 1;
                        } else if (Intrinsics.areEqual(imeAction, ImeAction.Go)) {
                            i3 = 2;
                        } else if (Intrinsics.areEqual(imeAction, ImeAction.Search)) {
                            i3 = 3;
                        } else if (Intrinsics.areEqual(imeAction, ImeAction.Send)) {
                            i3 = 4;
                        } else if (Intrinsics.areEqual(imeAction, ImeAction.Previous)) {
                            i3 = 5;
                        } else if (Intrinsics.areEqual(imeAction, ImeAction.Next)) {
                            i3 = 6;
                        } else if (!Intrinsics.areEqual(imeAction, ImeAction.Done)) {
                            i3 = -1;
                        }
                        inputFieldBinding.imeAction = i3;
                        return;
                    case 19:
                        inputFieldBinding.showKeyboardOnFocus = (Boolean) obj17;
                        inputFieldBinding.keyboardOptionsChanged = true;
                        return;
                    case 20:
                        TextFieldLineLimits textFieldLineLimits = (TextFieldLineLimits) obj17;
                        if (textFieldLineLimits instanceof TextFieldLineLimits.MultiLine) {
                            TextFieldLineLimits.MultiLine multiLine = (TextFieldLineLimits.MultiLine) textFieldLineLimits;
                            int i22 = multiLine.minHeightInLines;
                            obj = new TextFieldLineLimits.MultiLine(i22 >= 3 ? i22 : 3, multiLine.maxHeightInLines);
                        } else if (textFieldLineLimits instanceof TextFieldLineLimits.SingleLine) {
                            obj = TextFieldLineLimits.SingleLine.INSTANCE;
                        } else if (textFieldLineLimits != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        } else {
                            androidx.compose.foundation.text.input.TextFieldLineLimits.Companion.getClass();
                            obj = TextFieldLineLimits.Companion.Default;
                        }
                        inputFieldBinding.lineLimits$delegate.setValue(obj);
                        return;
                    case 21:
                        obj17.getClass();
                        GraphLoop$processingQueue$1 graphLoop$processingQueue$1 = ((Boolean) obj17).booleanValue() ? new GraphLoop$processingQueue$1(1, new InputFieldProtocolNode$OnKeyboardAction(this.id, svg, inputFieldHostProtocol), InputFieldProtocolNode$OnKeyboardAction.class, "invoke", "invoke(Lapp/cash/arcade/values/TextFieldState;)V", 0, 12) : null;
                        inputFieldBinding.onKeyboardAction$delegate.setValue(graphLoop$processingQueue$1 != null ? new InputFieldBinding$$ExternalSyntheticLambda0(r7, graphLoop$processingQueue$1, inputFieldBinding) : null);
                        return;
                    case 22:
                        obj17.getClass();
                        inputFieldBinding.onChange$delegate.setValue(((Boolean) obj17).booleanValue() ? new GraphLoop$processingQueue$1(1, new InputFieldProtocolNode$OnChange(this.id, svg, inputFieldHostProtocol), InputFieldProtocolNode$OnChange.class, "invoke", "invoke(Lapp/cash/arcade/values/TextFieldState;)V", 0, 10) : null);
                        return;
                    case 23:
                        obj17.getClass();
                        inputFieldBinding.onFocusChange$delegate.setValue(((Boolean) obj17).booleanValue() ? new GraphLoop$processingQueue$1(1, new InputFieldProtocolNode$OnFocusChange(this.id, svg, inputFieldHostProtocol), InputFieldProtocolNode$OnFocusChange.class, "invoke", "invoke(Z)V", 0, 11) : null);
                        return;
                    default:
                        inputFieldHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(80, i21);
                        return;
                }
            case 15:
                LegacyAmountPickerHostProtocol legacyAmountPickerHostProtocol = (LegacyAmountPickerHostProtocol) widgetHostProtocol;
                svg.getClass();
                LegacyAmountPickerBinding legacyAmountPickerBinding = (LegacyAmountPickerBinding) this._widget;
                if (legacyAmountPickerBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i23 = uiPropertyChange.tag;
                Object obj18 = uiPropertyChange.value;
                switch (i23) {
                    case 1:
                        obj18.getClass();
                        return;
                    case 2:
                        obj18.getClass();
                        legacyAmountPickerBinding.buttonText = (String) obj18;
                        return;
                    case 3:
                        obj18.getClass();
                        if (((Boolean) obj18).booleanValue()) {
                            return;
                        }
                        Path$$ExternalSyntheticBUOutline0.m$2();
                        return;
                    case 4:
                        obj18.getClass();
                        if (((Boolean) obj18).booleanValue()) {
                            return;
                        }
                        Path$$ExternalSyntheticBUOutline0.m$2();
                        return;
                    case 5:
                        obj18.getClass();
                        if (((Boolean) obj18).booleanValue()) {
                            legacyAmountPickerBinding.onCloseClicked = new PageFetcher$generateNewPagingSource$3(0, new LegacyAmountPickerProtocolNode$OnCloseClicked(this.id, svg), LegacyAmountPickerProtocolNode$OnCloseClicked.class, "invoke", "invoke()V", 0, 15);
                            return;
                        } else {
                            Path$$ExternalSyntheticBUOutline0.m$2();
                            return;
                        }
                    case 6:
                        obj18.getClass();
                        legacyAmountPickerBinding.onHelpClicked = ((Boolean) obj18).booleanValue() ? new PageFetcher$generateNewPagingSource$3(0, new LegacyAmountPickerProtocolNode$OnHelpClicked(this.id, svg), LegacyAmountPickerProtocolNode$OnHelpClicked.class, "invoke", "invoke()V", 0, 16) : null;
                        return;
                    case 7:
                        legacyAmountPickerBinding.amountCaption = (String) obj18;
                        return;
                    case 8:
                        obj18.getClass();
                        legacyAmountPickerBinding.onPrimaryAmountToggled = ((Boolean) obj18).booleanValue() ? new PageFetcher$generateNewPagingSource$3(0, new LegacyAmountPickerProtocolNode$OnPrimaryAmountToggled(this.id, svg), LegacyAmountPickerProtocolNode$OnPrimaryAmountToggled.class, "invoke", "invoke()V", 0, 17) : null;
                        return;
                    case 9:
                        String str5 = (String) obj18;
                        if (str5 == null) {
                            str5 = "";
                        }
                        legacyAmountPickerBinding.title = str5;
                        return;
                    case 10:
                        legacyAmountPickerBinding.subtitle = (String) obj18;
                        return;
                    case 11:
                        obj18.getClass();
                        legacyAmountPickerBinding.showHelpButton = ((Boolean) obj18).booleanValue();
                        return;
                    case 12:
                        legacyAmountPickerBinding.themeColor = (app.cash.arcade.values.Color) obj18;
                        return;
                    case 13:
                        legacyAmountPickerBinding.errorMessage = (String) obj18;
                        return;
                    case 14:
                        obj18.getClass();
                        if (((Boolean) obj18).booleanValue()) {
                            legacyAmountPickerBinding.onAmountChanged = new GraphLoop$processingQueue$1(1, new LegacyAmountPickerProtocolNode$OnAmountChanged(this.id, svg, legacyAmountPickerHostProtocol), LegacyAmountPickerProtocolNode$OnAmountChanged.class, "invoke", "invoke(J)V", 0, 14);
                            return;
                        } else {
                            Path$$ExternalSyntheticBUOutline0.m$2();
                            return;
                        }
                    case 15:
                        obj18.getClass();
                        if (((Boolean) obj18).booleanValue()) {
                            legacyAmountPickerBinding.onAmountSubmitted = new GraphLoop$processingQueue$1(1, new LegacyAmountPickerProtocolNode$OnAmountSubmitted(this.id, svg, legacyAmountPickerHostProtocol), LegacyAmountPickerProtocolNode$OnAmountSubmitted.class, "invoke", "invoke(J)V", 0, 16);
                            return;
                        } else {
                            Path$$ExternalSyntheticBUOutline0.m$2();
                            return;
                        }
                    case 16:
                        DisplayCurrency displayCurrency = (DisplayCurrency) obj18;
                        if (displayCurrency instanceof DisplayCurrency.Bitcoin) {
                            CurrencyCode currencyCode = CurrencyCode.BTC;
                            int ordinal3 = ((DisplayCurrency.Bitcoin) displayCurrency).units.ordinal();
                            if (ordinal3 == 0) {
                                bitcoinDisplayUnits = BitcoinDisplayUnits.BITCOIN;
                            } else {
                                if (ordinal3 != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                bitcoinDisplayUnits = BitcoinDisplayUnits.SATOSHIS;
                            }
                            moneyConfig = new AmountConfig.MoneyConfig(currencyCode, bitcoinDisplayUnits, legacyAmountPickerBinding.isSymbolExperimentEnabled, 0, 8);
                        } else if (displayCurrency instanceof DisplayCurrency.Fiat) {
                            moneyConfig = new AmountConfig.MoneyConfig(CurrencyCode.valueOf(((DisplayCurrency.Fiat) displayCurrency).code), null, false, 0, 14);
                        } else {
                            if (displayCurrency != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            moneyConfig = new AmountConfig.MoneyConfig(CurrencyCode.USD, null, false, 0, 14);
                        }
                        legacyAmountPickerBinding.moneyConfig$delegate.setValue(moneyConfig);
                        return;
                    case 17:
                        legacyAmountPickerBinding.initialAmount = (Long) obj18;
                        return;
                    case 18:
                        obj18.getClass();
                        legacyAmountPickerBinding.onBackClicked = ((Boolean) obj18).booleanValue() ? new PageFetcher$generateNewPagingSource$3(0, new LegacyAmountPickerProtocolNode$OnBackClicked(this.id, svg), LegacyAmountPickerProtocolNode$OnBackClicked.class, "invoke", "invoke()V", 0, 14) : null;
                        return;
                    case 19:
                        obj18.getClass();
                        legacyAmountPickerBinding.isSymbolExperimentEnabled = ((Boolean) obj18).booleanValue();
                        return;
                    default:
                        legacyAmountPickerHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(45, i23);
                        return;
                }
            case 16:
                apply$app$cash$arcade$protocol$host$arcade$LegacyDialogProtocolNode(uiPropertyChange, svg);
                return;
            case 17:
                apply$app$cash$arcade$protocol$host$arcade$LegacyPasscodeInputProtocolNode(uiPropertyChange, svg);
                return;
            case 18:
                apply$app$cash$arcade$protocol$host$arcade$PasscodeInputProtocolNode(uiPropertyChange, svg);
                return;
            case 19:
                svg.getClass();
                ProgressBarBinding progressBarBinding = (ProgressBarBinding) this._widget;
                if (progressBarBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i24 = uiPropertyChange.tag;
                Object obj19 = uiPropertyChange.value;
                if (i24 == 1) {
                    obj19.getClass();
                    progressBarBinding.progress$delegate.setFloatValue(((Float) obj19).floatValue());
                    return;
                } else if (i24 != 2) {
                    ((SwitchHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(68, i24);
                    return;
                } else {
                    progressBarBinding.progressArcadeColor$delegate.setValue((app.cash.arcade.values.Color) obj19);
                    return;
                }
            case 20:
                apply$app$cash$arcade$protocol$host$arcade$QrCodeScannerProtocolNode(uiPropertyChange, svg);
                return;
            case 21:
                apply$app$cash$arcade$protocol$host$arcade$RadioProtocolNode(uiPropertyChange, svg);
                return;
            case 22:
                apply$app$cash$arcade$protocol$host$arcade$RadioSelectionGroupProtocolNode(uiPropertyChange, svg);
                return;
            case 23:
                apply$app$cash$arcade$protocol$host$arcade$RoundedRectProtocolNode(uiPropertyChange, svg);
                return;
            case 24:
                apply$app$cash$arcade$protocol$host$arcade$SearchBarProtocolNode(uiPropertyChange, svg);
                return;
            case 25:
                apply$app$cash$arcade$protocol$host$arcade$SegmentedCircleProtocolNode(uiPropertyChange, svg);
                return;
            case 26:
                apply$app$cash$arcade$protocol$host$arcade$SegmentedToggleProtocolNode(uiPropertyChange, svg);
                return;
            case 27:
                apply$app$cash$arcade$protocol$host$arcade$ShimmerProtocolNode(uiPropertyChange, svg);
                return;
            case 28:
                apply$app$cash$arcade$protocol$host$arcade$SpinnerProtocolNode(uiPropertyChange, svg);
                return;
            default:
                svg.getClass();
                ArcadeAvatarBinding arcadeAvatarBinding = (ArcadeAvatarBinding) this._widget;
                if (arcadeAvatarBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i25 = uiPropertyChange.tag;
                Object obj20 = uiPropertyChange.value;
                if (i25 == 1) {
                    obj20.getClass();
                    SnapshotStateList snapshotStateList = arcadeAvatarBinding.avatars;
                    snapshotStateList.clear();
                    snapshotStateList.addAll((List) obj20);
                    return;
                }
                if (i25 == 2) {
                    arcadeAvatarBinding.badge$delegate.setValue((AvatarBadgeViewModel) obj20);
                    return;
                }
                if (i25 == 3) {
                    obj20.getClass();
                    arcadeAvatarBinding.onClick$delegate.setValue(((Boolean) obj20).booleanValue() ? new PageFetcher$generateNewPagingSource$3(0, new StackedAvatarProtocolNode$OnClick(this.id, svg), StackedAvatarProtocolNode$OnClick.class, "invoke", "invoke()V", 0, 26) : null);
                    return;
                } else if (i25 == 4) {
                    obj20.getClass();
                    arcadeAvatarBinding.size$delegate.setValue((AvatarSize) obj20);
                    return;
                } else if (i25 != 5) {
                    ((RadioHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(15, i25);
                    return;
                } else {
                    obj20.getClass();
                    return;
                }
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    /* renamed from: children-dBpC-2Y */
    public final AndroidSvg mo1195childrendBpC2Y(int i) {
        int i2 = this.$r8$classId;
        WidgetHostProtocol widgetHostProtocol = this.protocol;
        switch (i2) {
            case 0:
                ((IconHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(16, i);
                break;
            case 1:
                ((NavBarHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(47, i);
                break;
            case 2:
                ((RoundedRectHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(81, i);
                break;
            case 3:
                ((SpinnerHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(74, i);
                break;
            case 4:
                ((TimelineHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(84, i);
                break;
            case 5:
                ((TextFieldHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(44, i);
                break;
            case 6:
                ((ButtonHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(11, i);
                break;
            case 7:
                ((ToastHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(79, i);
                break;
            case 8:
                ((ToggleHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(76, i);
                break;
            case 9:
                ((ImageHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(18, i);
                break;
            case 10:
                ((ImageHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(43, i);
                break;
            case 11:
                ((TextFieldHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(21, i);
                break;
            case 12:
                ((ImageHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(57, i);
                break;
            case 13:
                ((ClickableCellHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(56, i);
                break;
            case 14:
                ((InputFieldHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(80, i);
                break;
            case 15:
                ((LegacyAmountPickerHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(45, i);
                break;
            case 16:
                ((ToastHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(67, i);
                break;
            case 17:
                ((RoundedRectHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(34, i);
                break;
            case 18:
                ((RadioHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(85, i);
                break;
            case 19:
                ((SwitchHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(68, i);
                break;
            case 20:
                ((RoundedRectHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(72, i);
                break;
            case 21:
                ((RadioHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(77, i);
                break;
            case 22:
                ((RadioHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(36, i);
                break;
            case 23:
                ((RoundedRectHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(62, i);
                break;
            case 24:
                ((SearchBarHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(71, i);
                break;
            case 25:
                ((SwitchHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(83, i);
                break;
            case 26:
                ((SearchBarHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(41, i);
                break;
            case 27:
                ((ImageHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(66, i);
                break;
            case 28:
                ((SpinnerHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(22, i);
                break;
            default:
                ((RadioHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(15, i);
                break;
        }
        return null;
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void detach() {
        switch (this.$r8$classId) {
            case 0:
                this._widget = null;
                break;
            case 1:
                this._widget = null;
                break;
            case 2:
                this._widget = null;
                break;
            case 3:
                this._widget = null;
                break;
            case 4:
                this._widget = null;
                break;
            case 5:
                this._widget = null;
                break;
            case 6:
                this._widget = null;
                break;
            case 7:
                this._widget = null;
                break;
            case 8:
                this._widget = null;
                break;
            case 9:
                this._widget = null;
                break;
            case 10:
                this._widget = null;
                break;
            case 11:
                this._widget = null;
                break;
            case 12:
                this._widget = null;
                break;
            case 13:
                this._widget = null;
                break;
            case 14:
                this._widget = null;
                break;
            case 15:
                this._widget = null;
                break;
            case 16:
                this._widget = null;
                break;
            case 17:
                this._widget = null;
                break;
            case 18:
                this._widget = null;
                break;
            case 19:
                this._widget = null;
                break;
            case 20:
                this._widget = null;
                break;
            case 21:
                this._widget = null;
                break;
            case 22:
                this._widget = null;
                break;
            case 23:
                this._widget = null;
                break;
            case 24:
                this._widget = null;
                break;
            case 25:
                this._widget = null;
                break;
            case 26:
                this._widget = null;
                break;
            case 27:
                this._widget = null;
                break;
            case 28:
                this._widget = null;
                break;
            default:
                this._widget = null;
                break;
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final Widget getWidget() {
        switch (this.$r8$classId) {
            case 0:
                IconBinding iconBinding = (IconBinding) this._widget;
                if (iconBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 1:
                MooncakeActivitySectionHeader mooncakeActivitySectionHeader = (MooncakeActivitySectionHeader) this._widget;
                if (mooncakeActivitySectionHeader == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 2:
                ArcadeTimeline2Binding arcadeTimeline2Binding = (ArcadeTimeline2Binding) this._widget;
                if (arcadeTimeline2Binding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 3:
                ArcadeTimelineItemBinding arcadeTimelineItemBinding = (ArcadeTimelineItemBinding) this._widget;
                if (arcadeTimelineItemBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 4:
                BenefitsComparisonTableBinding benefitsComparisonTableBinding = (BenefitsComparisonTableBinding) this._widget;
                if (benefitsComparisonTableBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 5:
                BiometricsPromptBinding biometricsPromptBinding = (BiometricsPromptBinding) this._widget;
                if (biometricsPromptBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 6:
                ButtonBinding buttonBinding = (ButtonBinding) this._widget;
                if (buttonBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 7:
                CardUpsellBinding cardUpsellBinding = (CardUpsellBinding) this._widget;
                if (cardUpsellBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 8:
                ToggleBinding toggleBinding = (ToggleBinding) this._widget;
                if (toggleBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 9:
                CarouselBinding carouselBinding = (CarouselBinding) this._widget;
                if (carouselBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 10:
                DividerBinding dividerBinding = (DividerBinding) this._widget;
                if (dividerBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 11:
                ImageBinding imageBinding = (ImageBinding) this._widget;
                if (imageBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 12:
                ImageBinding imageBinding2 = (ImageBinding) this._widget;
                if (imageBinding2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 13:
                InlineAppMessageView inlineAppMessageView = (InlineAppMessageView) this._widget;
                if (inlineAppMessageView == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 14:
                InputFieldBinding inputFieldBinding = (InputFieldBinding) this._widget;
                if (inputFieldBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 15:
                LegacyAmountPickerBinding legacyAmountPickerBinding = (LegacyAmountPickerBinding) this._widget;
                if (legacyAmountPickerBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 16:
                LegacyDialogBinding legacyDialogBinding = (LegacyDialogBinding) this._widget;
                if (legacyDialogBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 17:
                LegacyPasscodeInputBinding legacyPasscodeInputBinding = (LegacyPasscodeInputBinding) this._widget;
                if (legacyPasscodeInputBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 18:
                PasscodeInputBinding passcodeInputBinding = (PasscodeInputBinding) this._widget;
                if (passcodeInputBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 19:
                ProgressBarBinding progressBarBinding = (ProgressBarBinding) this._widget;
                if (progressBarBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 20:
                QrCodeScannerBinding qrCodeScannerBinding = (QrCodeScannerBinding) this._widget;
                if (qrCodeScannerBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 21:
                RadioBinding radioBinding = (RadioBinding) this._widget;
                if (radioBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 22:
                RadioSelectionGroupBinding radioSelectionGroupBinding = (RadioSelectionGroupBinding) this._widget;
                if (radioSelectionGroupBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 23:
                RoundedRectBinding roundedRectBinding = (RoundedRectBinding) this._widget;
                if (roundedRectBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 24:
                SearchBarBinding searchBarBinding = (SearchBarBinding) this._widget;
                if (searchBarBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 25:
                ToggleBinding toggleBinding2 = (ToggleBinding) this._widget;
                if (toggleBinding2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 26:
                SwitchBinding switchBinding = (SwitchBinding) this._widget;
                if (switchBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 27:
                ShimmerBinding shimmerBinding = (ShimmerBinding) this._widget;
                if (shimmerBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 28:
                SpinnerBinding spinnerBinding = (SpinnerBinding) this._widget;
                if (spinnerBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            default:
                ArcadeAvatarBinding arcadeAvatarBinding = (ArcadeAvatarBinding) this._widget;
                if (arcadeAvatarBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final String getWidgetName() {
        switch (this.$r8$classId) {
            case 0:
                return "Icon";
            case 1:
                return "ActivitySectionHeader";
            case 2:
                return "ArcadeTimeline2";
            case 3:
                return "ArcadeTimelineItem";
            case 4:
                return "BenefitsComparisonTable";
            case 5:
                return "BiometricsPrompt";
            case 6:
                return "Button";
            case 7:
                return "CardUpsell";
            case 8:
                return "Checkbox";
            case 9:
                return "DeprecatedProgressSpinner";
            case 10:
                return "Divider";
            case 11:
                return "IconButton";
            case 12:
                return "Image";
            case 13:
                return "InlineAppMessage";
            case 14:
                return "InputField";
            case 15:
                return "LegacyAmountPicker";
            case 16:
                return "LegacyDialog";
            case 17:
                return "LegacyPasscodeInput";
            case 18:
                return "PasscodeInput";
            case 19:
                return "ProgressBar";
            case 20:
                return "QrCodeScanner";
            case 21:
                return "Radio";
            case 22:
                return "RadioSelectionGroup";
            case 23:
                return "RoundedRect";
            case 24:
                return "SearchBar";
            case 25:
                return "SegmentedCircle";
            case 26:
                return "SegmentedToggle";
            case 27:
                return "Shimmer";
            case 28:
                return "Spinner";
            default:
                return "StackedAvatar";
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    /* renamed from: getWidgetTag-BlhN7y0 */
    public final int mo1196getWidgetTagBlhN7y0() {
        switch (this.$r8$classId) {
            case 0:
                return 16;
            case 1:
                return 47;
            case 2:
                return 81;
            case 3:
                return 74;
            case 4:
                return 84;
            case 5:
                return 44;
            case 6:
                return 11;
            case 7:
                return 79;
            case 8:
                return 76;
            case 9:
                return 18;
            case 10:
                return 43;
            case 11:
                return 21;
            case 12:
                return 57;
            case 13:
                return 56;
            case 14:
                return 80;
            case 15:
                return 45;
            case 16:
                return 67;
            case 17:
                return 34;
            case 18:
                return 85;
            case 19:
                return 68;
            case 20:
                return 72;
            case 21:
                return 77;
            case 22:
                return 36;
            case 23:
                return 62;
            case 24:
                return 71;
            case 25:
                return 83;
            case 26:
                return 41;
            case 27:
                return 66;
            case 28:
                return 22;
            default:
                return 15;
        }
    }
}
