package app.cash.arcade.protocol.host.arcade;

import android.text.Editable;
import android.text.TextUtils;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.core.view.ViewCompat;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.arcade.values.Attribute;
import app.cash.arcade.values.AttributeRange;
import app.cash.arcade.values.AttributedString;
import app.cash.arcade.values.BooleanState;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.NavigationIconType;
import app.cash.arcade.values.TextAlign;
import app.cash.arcade.values.TextFieldState;
import app.cash.arcade.values.TextStyle;
import app.cash.arcade.values.TitleBarAction;
import app.cash.arcade.values.TruncateAt;
import app.cash.redwood.layout.view.ViewSpacer;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.UiPropertyChange;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import app.cash.redwood.ui.Density;
import app.cash.redwood.ui.Dp;
import app.cash.redwood.widget.Widget;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$fetch$2;
import coil3.svg.internal.AndroidSvg;
import com.caverock.androidsvg.SVG;
import com.google.android.material.chip.Chip$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.treehouse.SwitchBinding;
import com.squareup.cash.arcade.treehouse.TabToolbarBinding;
import com.squareup.cash.arcade.treehouse.TextBinding;
import com.squareup.cash.arcade.treehouse.TextFieldBinding;
import com.squareup.cash.arcade.treehouse.TextFieldBinding$value$1;
import com.squareup.cash.arcade.treehouse.TextStylesKt;
import com.squareup.cash.arcade.treehouse.TitleBarCoreBinding;
import com.squareup.cash.arcade.treehouse.TitleBarSubBinding;
import com.squareup.cash.arcade.treehouse.ToastBinding;
import com.squareup.cash.arcade.treehouse.ToggleBinding;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import com.squareup.cash.mooncake.components.MooncakeSwitch;
import com.squareup.cash.mooncake.resources.ColorsKt;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import me.saket.bettermovementmethod.BetterLinkMovementMethod;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.InputEventTrigger;

/* loaded from: classes3.dex */
public final class TextProtocolNode extends ProtocolNode {
    public final /* synthetic */ int $r8$classId;
    public Widget _widget;
    public final WidgetHostProtocol protocol;

    public final class UrlHandler {
        public final SVG eventSink;
        public final int id;
        public final TextHostProtocol protocol;

        public UrlHandler(int i, SVG svg, TextHostProtocol textHostProtocol) {
            svg.getClass();
            this.id = i;
            this.eventSink = svg;
            this.protocol = textHostProtocol;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextProtocolNode(int i, Widget widget, WidgetHostProtocol widgetHostProtocol, int i2) {
        super(i);
        this.$r8$classId = i2;
        this.protocol = widgetHostProtocol;
        this._widget = widget;
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void apply(UiPropertyChange uiPropertyChange, SVG svg) {
        TextUtils.TruncateAt truncateAt;
        int i = this.$r8$classId;
        int i2 = 3;
        TextUtils.TruncateAt truncateAt2 = null;
        WidgetHostProtocol widgetHostProtocol = this.protocol;
        switch (i) {
            case 0:
                TextHostProtocol textHostProtocol = (TextHostProtocol) widgetHostProtocol;
                svg.getClass();
                TextBinding textBinding = (TextBinding) this._widget;
                if (textBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                FigmaTextView figmaTextView = textBinding.value;
                int i3 = uiPropertyChange.tag;
                Object obj = uiPropertyChange.value;
                switch (i3) {
                    case 1:
                        obj.getClass();
                        AttributedString attributedString = (AttributedString) obj;
                        figmaTextView.setText(InputEventTrigger.Companion.toSpannedString(attributedString, textBinding.context, null, new NetworkFetcher$fetch$2(1, textBinding, TextBinding.class, "onUrlClick", "onUrlClick(Ljava/lang/String;)V", 0, 25)));
                        List list = attributedString.attributeRanges;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            return;
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((AttributeRange) it.next()).attribute instanceof Attribute.Link) {
                                figmaTextView.setMovementMethod(BetterLinkMovementMethod.getInstance());
                                ViewCompat.ensureAccessibilityDelegateCompat(figmaTextView);
                                return;
                            }
                        }
                        return;
                    case 2:
                        obj.getClass();
                        Strings.applyStyle(figmaTextView, TextStylesKt.toTextThemeInfo((TextStyle) obj));
                        return;
                    case 3:
                        textBinding.image(0, (ImageResource) obj);
                        return;
                    case 4:
                        textBinding.image(2, (ImageResource) obj);
                        return;
                    case 5:
                        TruncateAt truncateAt3 = (TruncateAt) obj;
                        if (truncateAt3 != null) {
                            int ordinal = truncateAt3.ordinal();
                            if (ordinal == 0) {
                                truncateAt = TextUtils.TruncateAt.START;
                            } else if (ordinal == 1) {
                                truncateAt = TextUtils.TruncateAt.MIDDLE;
                            } else {
                                if (ordinal != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                truncateAt = TextUtils.TruncateAt.END;
                            }
                            truncateAt2 = truncateAt;
                        }
                        figmaTextView.setEllipsize(truncateAt2);
                        return;
                    case 6:
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        if (intValue == -1) {
                            intValue = Integer.MAX_VALUE;
                        }
                        figmaTextView.setMaxLines(intValue);
                        return;
                    case 7:
                        obj.getClass();
                        figmaTextView.setTextColor(ColorsKt.toColorInt$default((Color) obj, textBinding.themeInfo));
                        return;
                    case 8:
                        obj.getClass();
                        int ordinal2 = ((TextAlign) obj).ordinal();
                        if (ordinal2 == 0) {
                            i2 = 8388611;
                        } else if (ordinal2 != 1) {
                            if (ordinal2 == 2) {
                                i2 = 1;
                            } else {
                                if (ordinal2 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                i2 = 5;
                            }
                        }
                        figmaTextView.setGravity(i2);
                        return;
                    case 9:
                        obj.getClass();
                        textBinding.urlHandler = ((Boolean) obj).booleanValue() ? new NetworkFetcher$fetch$2(1, new UrlHandler(this.id, svg, textHostProtocol), UrlHandler.class, "invoke", "invoke(Ljava/lang/String;)V", 0, 5) : null;
                        return;
                    default:
                        textHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(13, i3);
                        return;
                }
            case 1:
                SwitchHostProtocol switchHostProtocol = (SwitchHostProtocol) widgetHostProtocol;
                svg.getClass();
                SwitchBinding switchBinding = (SwitchBinding) this._widget;
                if (switchBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                MooncakeSwitch mooncakeSwitch = (MooncakeSwitch) switchBinding.value;
                int i4 = uiPropertyChange.tag;
                Object obj2 = uiPropertyChange.value;
                if (i4 == 1) {
                    obj2.getClass();
                    MooncakeSwitch.setCheckedSilently$default(mooncakeSwitch, ((Boolean) obj2).booleanValue(), false, 2, null);
                    return;
                }
                if (i4 != 2) {
                    if (i4 != 3) {
                        switchHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(40, i4);
                        return;
                    } else {
                        obj2.getClass();
                        mooncakeSwitch.setEnabled(((Boolean) obj2).booleanValue());
                        return;
                    }
                }
                obj2.getClass();
                if (((Boolean) obj2).booleanValue()) {
                    mooncakeSwitch.setOnCheckedChangeListener(new Chip$$ExternalSyntheticLambda0(new NetworkFetcher$fetch$2(1, new SwitchProtocolNode$OnCheckedChange(this.id, svg, switchHostProtocol), SwitchProtocolNode$OnCheckedChange.class, "invoke", "invoke(Z)V", 0, 1), 1));
                    return;
                } else {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    return;
                }
            case 2:
                svg.getClass();
                if (((TabToolbarBinding) this._widget) == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i5 = uiPropertyChange.tag;
                if (i5 != 1) {
                    ((NavBarHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(53, i5);
                    return;
                }
                Object obj3 = uiPropertyChange.value;
                obj3.getClass();
                return;
            case 3:
                TextFieldHostProtocol textFieldHostProtocol = (TextFieldHostProtocol) widgetHostProtocol;
                svg.getClass();
                TextFieldBinding textFieldBinding = (TextFieldBinding) this._widget;
                if (textFieldBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                TextFieldBinding$value$1 textFieldBinding$value$1 = textFieldBinding.value;
                int i6 = uiPropertyChange.tag;
                Object obj4 = uiPropertyChange.value;
                switch (i6) {
                    case 1:
                        obj4.getClass();
                        TextFieldState textFieldState = (TextFieldState) obj4;
                        if (textFieldState.userEditCount < textFieldBinding.state.userEditCount) {
                            return;
                        }
                        if (textFieldBinding.updating) {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            return;
                        }
                        textFieldBinding.updating = true;
                        try {
                            textFieldBinding.state = textFieldState;
                            Editable editableText = textFieldBinding$value$1.getEditableText();
                            if (editableText != null) {
                                int composingSpanStart = BaseInputConnection.getComposingSpanStart(editableText);
                                int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(editableText);
                                editableText.replace(0, editableText.length(), textFieldState.text);
                                if (composingSpanStart != -1 && composingSpanEnd != -1) {
                                    ((InputConnection) textFieldBinding.inputConnection$delegate.getValue()).setComposingRegion(composingSpanStart, composingSpanEnd);
                                }
                                textFieldBinding$value$1.setSelection(textFieldState.selectionStart, textFieldState.selectionEnd);
                            }
                            textFieldBinding.updating = false;
                            return;
                        } catch (Throwable th) {
                            textFieldBinding.updating = false;
                            throw th;
                        }
                    case 2:
                        obj4.getClass();
                        if (((Boolean) obj4).booleanValue()) {
                            return;
                        } else {
                            return;
                        }
                    case 3:
                        obj4.getClass();
                        textFieldBinding.onChange = ((Boolean) obj4).booleanValue() ? new NetworkFetcher$fetch$2(1, new TextFieldProtocolNode$OnChange(this.id, svg, textFieldHostProtocol), TextFieldProtocolNode$OnChange.class, "invoke", "invoke(Lapp/cash/arcade/values/TextFieldState;)V", 0, 2) : null;
                        return;
                    case 4:
                        obj4.getClass();
                        textFieldBinding$value$1.setHint((String) obj4);
                        return;
                    case 5:
                        obj4.getClass();
                        if (((Boolean) obj4).booleanValue()) {
                            return;
                        } else {
                            return;
                        }
                    case 6:
                        obj4.getClass();
                        return;
                    default:
                        textFieldHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(19, i6);
                        return;
                }
            case 4:
                svg.getClass();
                TitleBarCoreBinding titleBarCoreBinding = (TitleBarCoreBinding) this._widget;
                if (titleBarCoreBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = titleBarCoreBinding.startAction$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = titleBarCoreBinding.endPrimaryAction$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = titleBarCoreBinding.endSecondaryAction$delegate;
                int i7 = uiPropertyChange.tag;
                Object obj5 = uiPropertyChange.value;
                switch (i7) {
                    case 1:
                        titleBarCoreBinding.title$delegate.setValue((String) obj5);
                        return;
                    case 2:
                        parcelableSnapshotMutableState.setValue(TitleBarCoreBinding.ActionBinding.copy$default((TitleBarCoreBinding.ActionBinding) parcelableSnapshotMutableState.getValue(), (TitleBarAction) obj5, null, 2));
                        return;
                    case 3:
                        obj5.getClass();
                        parcelableSnapshotMutableState.setValue(TitleBarCoreBinding.ActionBinding.copy$default((TitleBarCoreBinding.ActionBinding) parcelableSnapshotMutableState.getValue(), null, ((Boolean) obj5).booleanValue() ? new WandScene$ring$3(0, new TitleBarCoreProtocolNode$StartActionCallback(this.id, svg), TitleBarCoreProtocolNode$StartActionCallback.class, "invoke", "invoke()V", 0, 1) : null, 1));
                        return;
                    case 4:
                        parcelableSnapshotMutableState2.setValue(TitleBarCoreBinding.ActionBinding.copy$default((TitleBarCoreBinding.ActionBinding) parcelableSnapshotMutableState2.getValue(), (TitleBarAction) obj5, null, 2));
                        return;
                    case 5:
                        obj5.getClass();
                        parcelableSnapshotMutableState2.setValue(TitleBarCoreBinding.ActionBinding.copy$default((TitleBarCoreBinding.ActionBinding) parcelableSnapshotMutableState2.getValue(), null, ((Boolean) obj5).booleanValue() ? new PageFetcher$generateNewPagingSource$3(0, new TitleBarCoreProtocolNode$EndPrimaryActionCallback(this.id, svg), TitleBarCoreProtocolNode$EndPrimaryActionCallback.class, "invoke", "invoke()V", 0, 28) : null, 1));
                        return;
                    case 6:
                        parcelableSnapshotMutableState3.setValue(TitleBarCoreBinding.ActionBinding.copy$default((TitleBarCoreBinding.ActionBinding) parcelableSnapshotMutableState3.getValue(), (TitleBarAction) obj5, null, 2));
                        return;
                    case 7:
                        obj5.getClass();
                        parcelableSnapshotMutableState3.setValue(TitleBarCoreBinding.ActionBinding.copy$default((TitleBarCoreBinding.ActionBinding) parcelableSnapshotMutableState3.getValue(), null, ((Boolean) obj5).booleanValue() ? new PageFetcher$generateNewPagingSource$3(0, new TitleBarCoreProtocolNode$EndSecondaryActionCallback(this.id, svg), TitleBarCoreProtocolNode$EndSecondaryActionCallback.class, "invoke", "invoke()V", 0, 29) : null, 1));
                        return;
                    default:
                        ((TimelineItemHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(69, i7);
                        return;
                }
            case 5:
                svg.getClass();
                TitleBarSubBinding titleBarSubBinding = (TitleBarSubBinding) this._widget;
                if (titleBarSubBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = titleBarSubBinding.primaryAction$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState5 = titleBarSubBinding.secondaryAction$delegate;
                int i8 = uiPropertyChange.tag;
                Object obj6 = uiPropertyChange.value;
                switch (i8) {
                    case 1:
                        titleBarSubBinding.title$delegate.setValue((String) obj6);
                        return;
                    case 2:
                        titleBarSubBinding.navigationIconType$delegate.setValue((NavigationIconType) obj6);
                        return;
                    case 3:
                        parcelableSnapshotMutableState4.setValue(TitleBarSubBinding.ActionBinding.copy$default((TitleBarSubBinding.ActionBinding) parcelableSnapshotMutableState4.getValue(), (TitleBarAction) obj6, null, 2));
                        return;
                    case 4:
                        obj6.getClass();
                        parcelableSnapshotMutableState4.setValue(TitleBarSubBinding.ActionBinding.copy$default((TitleBarSubBinding.ActionBinding) parcelableSnapshotMutableState4.getValue(), null, ((Boolean) obj6).booleanValue() ? new WandScene$ring$3(0, new TitleBarSubProtocolNode$PrimaryActionCallback(this.id, svg), TitleBarSubProtocolNode$PrimaryActionCallback.class, "invoke", "invoke()V", 0, 3) : null, 1));
                        return;
                    case 5:
                        parcelableSnapshotMutableState5.setValue(TitleBarSubBinding.ActionBinding.copy$default((TitleBarSubBinding.ActionBinding) parcelableSnapshotMutableState5.getValue(), (TitleBarAction) obj6, null, 2));
                        return;
                    case 6:
                        obj6.getClass();
                        parcelableSnapshotMutableState5.setValue(TitleBarSubBinding.ActionBinding.copy$default((TitleBarSubBinding.ActionBinding) parcelableSnapshotMutableState5.getValue(), null, ((Boolean) obj6).booleanValue() ? new WandScene$ring$3(0, new TitleBarSubProtocolNode$SecondaryActionCallback(this.id, svg), TitleBarSubProtocolNode$SecondaryActionCallback.class, "invoke", "invoke()V", 0, 4) : null, 1));
                        return;
                    case 7:
                        obj6.getClass();
                        titleBarSubBinding.navigationCallback$delegate.setValue(((Boolean) obj6).booleanValue() ? new WandScene$ring$3(0, new TitleBarSubProtocolNode$NavigationCallback(this.id, svg), TitleBarSubProtocolNode$NavigationCallback.class, "invoke", "invoke()V", 0, 2) : null);
                        return;
                    default:
                        ((RadioHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(70, i8);
                        return;
                }
            case 6:
                svg.getClass();
                ToastBinding toastBinding = (ToastBinding) this._widget;
                if (toastBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i9 = uiPropertyChange.tag;
                Object obj7 = uiPropertyChange.value;
                switch (i9) {
                    case 1:
                        obj7.getClass();
                        toastBinding.isVisible = ((Boolean) obj7).booleanValue();
                        toastBinding.updateOverlaySession$2();
                        return;
                    case 2:
                        obj7.getClass();
                        toastBinding.headline$delegate.setValue((String) obj7);
                        return;
                    case 3:
                        toastBinding.icon$delegate.setValue((ImageResource) obj7);
                        return;
                    case 4:
                        toastBinding.iconContentDescription$delegate.setValue((String) obj7);
                        return;
                    case 5:
                        toastBinding.body$delegate.setValue((String) obj7);
                        return;
                    case 6:
                        toastBinding.actionText$delegate.setValue((String) obj7);
                        return;
                    case 7:
                        obj7.getClass();
                        toastBinding.actionOnClick$delegate.setValue(((Boolean) obj7).booleanValue() ? new WandScene$ring$3(0, new ToastProtocolNode$ActionOnClick(this.id, svg), ToastProtocolNode$ActionOnClick.class, "invoke", "invoke()V", 0, 5) : null);
                        return;
                    default:
                        ((ToastHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(82, i9);
                        return;
                }
            case 7:
                ToggleHostProtocol toggleHostProtocol = (ToggleHostProtocol) widgetHostProtocol;
                svg.getClass();
                ToggleBinding toggleBinding = (ToggleBinding) this._widget;
                if (toggleBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                ParcelableSnapshotMutableState parcelableSnapshotMutableState6 = toggleBinding.state$delegate;
                int i10 = uiPropertyChange.tag;
                Object obj8 = uiPropertyChange.value;
                if (i10 == 1) {
                    obj8.getClass();
                    BooleanState booleanState = (BooleanState) obj8;
                    if (((BooleanState) parcelableSnapshotMutableState6.getValue()).userEditCount > booleanState.userEditCount) {
                        return;
                    }
                    parcelableSnapshotMutableState6.setValue(booleanState);
                    return;
                }
                if (i10 == 2) {
                    obj8.getClass();
                    ((ParcelableSnapshotMutableState) toggleBinding.enabled$delegate).setValue((Boolean) obj8);
                    return;
                } else if (i10 != 3) {
                    toggleHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(78, i10);
                    return;
                } else {
                    obj8.getClass();
                    ((ParcelableSnapshotMutableState) toggleBinding.onChange$delegate).setValue(((Boolean) obj8).booleanValue() ? new NetworkFetcher$fetch$2(1, new ToggleProtocolNode$OnChange(this.id, svg, toggleHostProtocol), ToggleProtocolNode$OnChange.class, "invoke", "invoke(Lapp/cash/arcade/values/BooleanState;)V", 0, 6) : null);
                    return;
                }
            default:
                svg.getClass();
                ViewSpacer viewSpacer = (ViewSpacer) this._widget;
                if (viewSpacer == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                double d = viewSpacer.density;
                int i11 = uiPropertyChange.tag;
                Object obj9 = uiPropertyChange.value;
                if (i11 == 1) {
                    obj9.getClass();
                    viewSpacer.setMinimumWidth(Density.m1402toPxIntmnpKzHI(d, ((Dp) obj9).value));
                    viewSpacer.requestLayout();
                    return;
                } else {
                    if (i11 != 2) {
                        ((ImageHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(1000003, i11);
                        return;
                    }
                    obj9.getClass();
                    viewSpacer.setMinimumHeight(Density.m1402toPxIntmnpKzHI(d, ((Dp) obj9).value));
                    viewSpacer.requestLayout();
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
                ((TextHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(13, i);
                break;
            case 1:
                ((SwitchHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(40, i);
                break;
            case 2:
                ((NavBarHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(53, i);
                break;
            case 3:
                ((TextFieldHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(19, i);
                break;
            case 4:
                ((TimelineItemHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(69, i);
                break;
            case 5:
                ((RadioHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(70, i);
                break;
            case 6:
                ((ToastHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(82, i);
                break;
            case 7:
                ((ToggleHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(78, i);
                break;
            default:
                ((ImageHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(1000003, i);
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
            default:
                this._widget = null;
                break;
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final Widget getWidget() {
        switch (this.$r8$classId) {
            case 0:
                TextBinding textBinding = (TextBinding) this._widget;
                if (textBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 1:
                SwitchBinding switchBinding = (SwitchBinding) this._widget;
                if (switchBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 2:
                TabToolbarBinding tabToolbarBinding = (TabToolbarBinding) this._widget;
                if (tabToolbarBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 3:
                TextFieldBinding textFieldBinding = (TextFieldBinding) this._widget;
                if (textFieldBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 4:
                TitleBarCoreBinding titleBarCoreBinding = (TitleBarCoreBinding) this._widget;
                if (titleBarCoreBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 5:
                TitleBarSubBinding titleBarSubBinding = (TitleBarSubBinding) this._widget;
                if (titleBarSubBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 6:
                ToastBinding toastBinding = (ToastBinding) this._widget;
                if (toastBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 7:
                ToggleBinding toggleBinding = (ToggleBinding) this._widget;
                if (toggleBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            default:
                ViewSpacer viewSpacer = (ViewSpacer) this._widget;
                if (viewSpacer == null) {
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
                return "Text";
            case 1:
                return "Switch";
            case 2:
                return "TabToolbar";
            case 3:
                return "TextField";
            case 4:
                return "TitleBarCore";
            case 5:
                return "TitleBarSub";
            case 6:
                return "Toast";
            case 7:
                return "Toggle";
            default:
                return "Spacer";
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    /* renamed from: getWidgetTag-BlhN7y0 */
    public final int mo1196getWidgetTagBlhN7y0() {
        switch (this.$r8$classId) {
            case 0:
                return 13;
            case 1:
                return 40;
            case 2:
                return 53;
            case 3:
                return 19;
            case 4:
                return 69;
            case 5:
                return 70;
            case 6:
                return 82;
            case 7:
                return 78;
            default:
                return 1000003;
        }
    }
}
