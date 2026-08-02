package app.cash.arcade.protocol.host.arcade;

import android.text.Editable;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.camera.view.PreviewView;
import androidx.core.view.ViewCompat;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.cash.arcade.protocol.host.redwoodlayout.ColumnProtocolNode$OnScroll;
import app.cash.arcade.protocol.host.redwoodlayout.RowHostProtocol;
import app.cash.arcade.protocol.host.redwoodlayout.RowProtocolNode$OnScroll;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.TextFieldState;
import app.cash.arcade.values.TimelineItemIcon;
import app.cash.redwood.layout.api.Constraint;
import app.cash.redwood.layout.api.CrossAxisAlignment;
import app.cash.redwood.layout.api.MainAxisAlignment;
import app.cash.redwood.layout.api.Overflow;
import app.cash.redwood.layout.view.ViewBox;
import app.cash.redwood.layout.view.ViewFlexContainer;
import app.cash.redwood.layout.view.YogaLayout;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.UiPropertyChange;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import app.cash.redwood.ui.Margin;
import app.cash.redwood.widget.MutableListChildren;
import app.cash.redwood.widget.Widget;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$fetch$2;
import coil3.svg.internal.AndroidSvg;
import com.caverock.androidsvg.SVG;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.treehouse.ArcadeTimelineBinding;
import com.squareup.cash.arcade.treehouse.BottomSheetBinding;
import com.squareup.cash.arcade.treehouse.CarouselBinding;
import com.squareup.cash.arcade.treehouse.ClickableCellBinding;
import com.squareup.cash.arcade.treehouse.SearchFieldBinding;
import com.squareup.cash.arcade.treehouse.TimelineBinding;
import com.squareup.cash.arcade.treehouse.TimelineItemBinding;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.mooncake.components.MooncakeSearchTextField;
import com.squareup.cash.reactions.treehouse.ReactionDialogAnchorBinding;
import java.util.List;
import java.util.WeakHashMap;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class CarouselProtocolNode extends ProtocolNode {
    public final /* synthetic */ int $r8$classId = 12;
    public Widget _widget;
    public final AndroidSvg children;
    public final WidgetHostProtocol protocol;

    public CarouselProtocolNode(int i, CarouselBinding carouselBinding, ClickableCellHostProtocol clickableCellHostProtocol) {
        super(i);
        this.protocol = clickableCellHostProtocol;
        this._widget = carouselBinding;
        this.children = new AndroidSvg(new UnleashContext((FrameLayout) carouselBinding.children));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [coil3.network.NetworkFetcher$fetch$2] */
    /* JADX WARN: Type inference failed for: r14v2, types: [coil3.network.NetworkFetcher$fetch$2] */
    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void apply(UiPropertyChange uiPropertyChange, SVG svg) {
        int i = this.$r8$classId;
        boolean z = false;
        WidgetHostProtocol widgetHostProtocol = this.protocol;
        switch (i) {
            case 0:
                svg.getClass();
                ((FormHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(25, uiPropertyChange.tag);
                return;
            case 1:
                svg.getClass();
                ((FormHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(54, uiPropertyChange.tag);
                return;
            case 2:
                svg.getClass();
                ArcadeTimelineBinding arcadeTimelineBinding = (ArcadeTimelineBinding) this._widget;
                if (arcadeTimelineBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i2 = uiPropertyChange.tag;
                if (i2 != 1) {
                    ((TimelineHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(73, i2);
                    return;
                }
                Object obj = uiPropertyChange.value;
                obj.getClass();
                arcadeTimelineBinding.collapsedSize$delegate.setIntValue(((Integer) obj).intValue());
                return;
            case 3:
                ToggleHostProtocol toggleHostProtocol = (ToggleHostProtocol) widgetHostProtocol;
                svg.getClass();
                BottomSheetBinding bottomSheetBinding = (BottomSheetBinding) this._widget;
                if (bottomSheetBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i3 = uiPropertyChange.tag;
                Object obj2 = uiPropertyChange.value;
                switch (i3) {
                    case 1:
                        obj2.getClass();
                        if (((Boolean) obj2).booleanValue()) {
                            bottomSheetBinding.onUserHidden = new PageFetcher$generateNewPagingSource$3(0, new BottomSheetProtocolNode$OnUserHidden(this.id, svg), BottomSheetProtocolNode$OnUserHidden.class, "invoke", "invoke()V", 0, 6);
                            return;
                        } else {
                            Path$$ExternalSyntheticBUOutline0.m$2();
                            return;
                        }
                    case 2:
                        obj2.getClass();
                        if (((Boolean) obj2).booleanValue()) {
                            bottomSheetBinding.bottomSheet.setOnClickOutsideListener(new BankingDialogKt$$ExternalSyntheticLambda5(15, bottomSheetBinding, new PageFetcher$generateNewPagingSource$3(0, new BottomSheetProtocolNode$OnClickOutside(this.id, svg), BottomSheetProtocolNode$OnClickOutside.class, "invoke", "invoke()V", 0, 5)));
                            return;
                        } else {
                            Path$$ExternalSyntheticBUOutline0.m$2();
                            return;
                        }
                    case 3:
                        obj2.getClass();
                        if (((Boolean) obj2).booleanValue()) {
                            return;
                        } else {
                            return;
                        }
                    case 4:
                        obj2.getClass();
                        bottomSheetBinding.isSnapping = ((Boolean) obj2).booleanValue();
                        return;
                    case 5:
                        obj2.getClass();
                        bottomSheetBinding.isLocked = ((Boolean) obj2).booleanValue();
                        return;
                    case 6:
                        obj2.getClass();
                        if (((Boolean) obj2).booleanValue()) {
                            bottomSheetBinding.onSheetPositionChanged = new GraphLoop$processingQueue$1(1, new BottomSheetProtocolNode$OnSheetPositionChanged(this.id, svg, toggleHostProtocol), BottomSheetProtocolNode$OnSheetPositionChanged.class, "invoke", "invoke(I)V", 0, 8);
                            return;
                        } else {
                            Path$$ExternalSyntheticBUOutline0.m$2();
                            return;
                        }
                    case 7:
                        obj2.getClass();
                        bottomSheetBinding.isVisible = ((Boolean) obj2).booleanValue();
                        bottomSheetBinding.updateOverlaySession();
                        return;
                    default:
                        toggleHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(39, i3);
                        return;
                }
            case 4:
                svg.getClass();
                ClickableCellBinding clickableCellBinding = (ClickableCellBinding) this._widget;
                if (clickableCellBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i4 = uiPropertyChange.tag;
                if (i4 != 1) {
                    ((ClickableCellHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(64, i4);
                    return;
                }
                Object obj3 = uiPropertyChange.value;
                obj3.getClass();
                if (((Boolean) obj3).booleanValue()) {
                    clickableCellBinding.setOnClickListener(new Q0$$ExternalSyntheticLambda0(new PageFetcher$generateNewPagingSource$3(0, new ClickableCellProtocolNode$OnClick(this.id, svg), ClickableCellProtocolNode$OnClick.class, "invoke", "invoke()V", 0, 9), 20));
                    return;
                } else {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    return;
                }
            case 5:
                svg.getClass();
                ((FormHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(46, uiPropertyChange.tag);
                return;
            case 6:
                svg.getClass();
                CarouselBinding carouselBinding = (CarouselBinding) this._widget;
                if (carouselBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) carouselBinding.value;
                int i5 = uiPropertyChange.tag;
                Object obj4 = uiPropertyChange.value;
                if (i5 == 1) {
                    obj4.getClass();
                    swipeRefreshLayout.setRefreshing(((Boolean) obj4).booleanValue());
                    return;
                }
                if (i5 == 2) {
                    obj4.getClass();
                    swipeRefreshLayout.setEnabled(((Boolean) obj4).booleanValue());
                    return;
                } else {
                    if (i5 != 3) {
                        ((ClickableCellHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(51, i5);
                        return;
                    }
                    obj4.getClass();
                    if (((Boolean) obj4).booleanValue()) {
                        swipeRefreshLayout.setOnRefreshListener(new MaterialButton$$ExternalSyntheticLambda3(new PageFetcher$generateNewPagingSource$3(0, new PullToRefreshProtocolNode$OnRefresh(this.id, svg), PullToRefreshProtocolNode$OnRefresh.class, "invoke", "invoke()V", 0, 22), 15));
                        return;
                    } else {
                        Path$$ExternalSyntheticBUOutline0.m$2();
                        return;
                    }
                }
            case 7:
                svg.getClass();
                ((FormHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(52, uiPropertyChange.tag);
                return;
            case 8:
                RadioHostProtocol radioHostProtocol = (RadioHostProtocol) widgetHostProtocol;
                svg.getClass();
                ReactionDialogAnchorBinding reactionDialogAnchorBinding = (ReactionDialogAnchorBinding) this._widget;
                if (reactionDialogAnchorBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i6 = uiPropertyChange.tag;
                Object obj5 = uiPropertyChange.value;
                if (i6 == 1) {
                    obj5.getClass();
                    boolean booleanValue = ((Boolean) obj5).booleanValue();
                    reactionDialogAnchorBinding.isVisible = booleanValue;
                    if (!booleanValue) {
                        reactionDialogAnchorBinding.expanded = false;
                    }
                    reactionDialogAnchorBinding.updateModel();
                    return;
                }
                if (i6 == 2) {
                    obj5.getClass();
                    reactionDialogAnchorBinding.availableReactions = (List) obj5;
                    reactionDialogAnchorBinding.updateModel();
                    return;
                }
                if (i6 == 3) {
                    obj5.getClass();
                    reactionDialogAnchorBinding.showExtendedPicker = ((Boolean) obj5).booleanValue();
                    reactionDialogAnchorBinding.updateModel();
                    return;
                }
                if (i6 == 4) {
                    obj5.getClass();
                    if (!((Boolean) obj5).booleanValue()) {
                        Path$$ExternalSyntheticBUOutline0.m$2();
                        return;
                    } else {
                        reactionDialogAnchorBinding.onDismiss = new PageFetcher$generateNewPagingSource$3(0, new ReactionDialogAnchorProtocolNode$OnDismiss(this.id, svg), ReactionDialogAnchorProtocolNode$OnDismiss.class, "invoke", "invoke()V", 0, 24);
                        reactionDialogAnchorBinding.updateModel();
                        return;
                    }
                }
                if (i6 != 5) {
                    radioHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(35, i6);
                    return;
                }
                obj5.getClass();
                if (!((Boolean) obj5).booleanValue()) {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    return;
                } else {
                    reactionDialogAnchorBinding.onSelect = new GraphLoop$processingQueue$1(1, new ReactionDialogAnchorProtocolNode$OnSelect(this.id, svg, radioHostProtocol), ReactionDialogAnchorProtocolNode$OnSelect.class, "invoke", "invoke(Ljava/lang/String;)V", 0, 24);
                    reactionDialogAnchorBinding.updateModel();
                    return;
                }
            case 9:
                SearchBarHostProtocol searchBarHostProtocol = (SearchBarHostProtocol) widgetHostProtocol;
                svg.getClass();
                SearchFieldBinding searchFieldBinding = (SearchFieldBinding) this._widget;
                if (searchFieldBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                MooncakeSearchTextField mooncakeSearchTextField = searchFieldBinding.value;
                int i7 = uiPropertyChange.tag;
                Object obj6 = uiPropertyChange.value;
                if (i7 == 1) {
                    obj6.getClass();
                    String str = (String) obj6;
                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                    ViewCompat.Api26Impl.setAutofillHints(mooncakeSearchTextField, str);
                    mooncakeSearchTextField.editText.setHint(str);
                    return;
                }
                if (i7 == 2) {
                    obj6.getClass();
                    if (((Boolean) obj6).booleanValue()) {
                        return;
                    } else {
                        return;
                    }
                }
                if (i7 == 3) {
                    obj6.getClass();
                    searchFieldBinding.onChange = ((Boolean) obj6).booleanValue() ? new GraphLoop$processingQueue$1(1, new SearchFieldProtocolNode$OnChange(this.id, svg, searchBarHostProtocol), SearchFieldProtocolNode$OnChange.class, "invoke", "invoke(Lapp/cash/arcade/values/TextFieldState;)V", 0, 26) : null;
                    return;
                }
                if (i7 == 4) {
                    obj6.getClass();
                    if (((Boolean) obj6).booleanValue()) {
                        return;
                    } else {
                        return;
                    }
                }
                if (i7 != 5) {
                    searchBarHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(55, i7);
                    return;
                }
                obj6.getClass();
                TextFieldState textFieldState = (TextFieldState) obj6;
                if (textFieldState.userEditCount < searchFieldBinding.state.userEditCount) {
                    return;
                }
                if (searchFieldBinding.updating) {
                    a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                    return;
                }
                searchFieldBinding.updating = true;
                try {
                    searchFieldBinding.state = textFieldState;
                    Editable editableText = mooncakeSearchTextField.editText.getEditableText();
                    if (editableText != null) {
                        int composingSpanStart = BaseInputConnection.getComposingSpanStart(editableText);
                        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(editableText);
                        editableText.replace(0, editableText.length(), textFieldState.text);
                        if (composingSpanStart != -1 && composingSpanEnd != -1) {
                            ((InputConnection) searchFieldBinding.inputConnection$delegate.getValue()).setComposingRegion(composingSpanStart, composingSpanEnd);
                        }
                        mooncakeSearchTextField.editText.setSelection(textFieldState.selectionStart, textFieldState.selectionEnd);
                    }
                    searchFieldBinding.updating = false;
                    return;
                } catch (Throwable th) {
                    searchFieldBinding.updating = false;
                    throw th;
                }
            case 10:
                svg.getClass();
                TimelineItemBinding timelineItemBinding = (TimelineItemBinding) this._widget;
                if (timelineItemBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i8 = uiPropertyChange.tag;
                Object obj7 = uiPropertyChange.value;
                if (i8 == 1) {
                    obj7.getClass();
                    timelineItemBinding.setIcon$treehouse((TimelineItemIcon) obj7);
                    timelineItemBinding.requestLayout();
                    return;
                } else if (i8 == 2) {
                    obj7.getClass();
                    timelineItemBinding.setColor$treehouse((Color) obj7);
                    timelineItemBinding.requestLayout();
                    return;
                } else {
                    if (i8 != 3) {
                        ((TimelineItemHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(49, i8);
                        return;
                    }
                    obj7.getClass();
                    if (((Boolean) obj7).booleanValue()) {
                        return;
                    } else {
                        return;
                    }
                }
            case 11:
                svg.getClass();
                if (((TimelineBinding) this._widget) == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i9 = uiPropertyChange.tag;
                if (i9 != 1) {
                    ((TimelineHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(48, i9);
                    return;
                }
                Object obj8 = uiPropertyChange.value;
                obj8.getClass();
                return;
            case 12:
                svg.getClass();
                ViewBox viewBox = (ViewBox) this._widget;
                if (viewBox == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i10 = uiPropertyChange.tag;
                Object obj9 = uiPropertyChange.value;
                if (i10 == 1) {
                    obj9.getClass();
                    viewBox.requestLayout();
                    return;
                }
                if (i10 == 2) {
                    obj9.getClass();
                    viewBox.requestLayout();
                    return;
                }
                if (i10 == 3) {
                    obj9.getClass();
                    viewBox.margin = (Margin) obj9;
                    viewBox.requestLayout();
                    return;
                } else if (i10 == 4) {
                    obj9.getClass();
                    viewBox.horizontalAlignment = ((CrossAxisAlignment) obj9).ordinal;
                    viewBox.requestLayout();
                    return;
                } else {
                    if (i10 != 5) {
                        ((IconHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(1000004, i10);
                        return;
                    }
                    obj9.getClass();
                    viewBox.verticalAlignment = ((CrossAxisAlignment) obj9).ordinal;
                    viewBox.requestLayout();
                    return;
                }
            case 13:
                RowHostProtocol rowHostProtocol = (RowHostProtocol) widgetHostProtocol;
                svg.getClass();
                ViewFlexContainer viewFlexContainer = (ViewFlexContainer) this._widget;
                if (viewFlexContainer == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                YogaLayout yogaLayout = viewFlexContainer.yogaLayout;
                ViewFlexContainer.HostView hostView = viewFlexContainer.hostView;
                int i11 = uiPropertyChange.tag;
                Object obj10 = uiPropertyChange.value;
                switch (i11) {
                    case 1:
                        obj10.getClass();
                        yogaLayout.m1364setWidthConstraintDyLkt4w$redwood_layout_view_release(((Constraint) obj10).ordinal);
                        return;
                    case 2:
                        obj10.getClass();
                        yogaLayout.m1363setHeightConstraintDyLkt4w$redwood_layout_view_release(((Constraint) obj10).ordinal);
                        return;
                    case 3:
                        obj10.getClass();
                        viewFlexContainer.margin((Margin) obj10);
                        return;
                    case 4:
                        obj10.getClass();
                        int i12 = ((Overflow) obj10).ordinal;
                        Overflow.Companion.getClass();
                        if (i12 != 0) {
                            if (i12 != 1) {
                                Path$$ExternalSyntheticBUOutline0.m$2();
                                return;
                            }
                            z = true;
                        }
                        hostView.setScrollEnabled(z);
                        return;
                    case 5:
                        obj10.getClass();
                        viewFlexContainer.m1361crossAxisAlignmentnjEs0f8(((CrossAxisAlignment) obj10).ordinal);
                        return;
                    case 6:
                        obj10.getClass();
                        viewFlexContainer.m1362mainAxisAlignment6exqka8(((MainAxisAlignment) obj10).ordinal);
                        return;
                    case 7:
                        obj10.getClass();
                        viewFlexContainer.onScroll = ((Boolean) obj10).booleanValue() ? new NetworkFetcher$fetch$2(1, new ColumnProtocolNode$OnScroll(this.id, svg, rowHostProtocol), ColumnProtocolNode$OnScroll.class, "invoke", "invoke-L2UXGw8(D)V", 0, 7) : null;
                        hostView.attachOrDetachScrollListeners();
                        return;
                    default:
                        rowHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(1000002, i11);
                        return;
                }
            default:
                RowHostProtocol rowHostProtocol2 = (RowHostProtocol) widgetHostProtocol;
                svg.getClass();
                ViewFlexContainer viewFlexContainer2 = (ViewFlexContainer) this._widget;
                if (viewFlexContainer2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                YogaLayout yogaLayout2 = viewFlexContainer2.yogaLayout;
                ViewFlexContainer.HostView hostView2 = viewFlexContainer2.hostView;
                int i13 = uiPropertyChange.tag;
                Object obj11 = uiPropertyChange.value;
                switch (i13) {
                    case 1:
                        obj11.getClass();
                        yogaLayout2.m1364setWidthConstraintDyLkt4w$redwood_layout_view_release(((Constraint) obj11).ordinal);
                        return;
                    case 2:
                        obj11.getClass();
                        yogaLayout2.m1363setHeightConstraintDyLkt4w$redwood_layout_view_release(((Constraint) obj11).ordinal);
                        return;
                    case 3:
                        obj11.getClass();
                        viewFlexContainer2.margin((Margin) obj11);
                        return;
                    case 4:
                        obj11.getClass();
                        int i14 = ((Overflow) obj11).ordinal;
                        Overflow.Companion.getClass();
                        if (i14 != 0) {
                            if (i14 != 1) {
                                Path$$ExternalSyntheticBUOutline0.m$2();
                                return;
                            }
                            z = true;
                        }
                        hostView2.setScrollEnabled(z);
                        return;
                    case 5:
                        obj11.getClass();
                        viewFlexContainer2.m1362mainAxisAlignment6exqka8(((MainAxisAlignment) obj11).ordinal);
                        return;
                    case 6:
                        obj11.getClass();
                        viewFlexContainer2.m1361crossAxisAlignmentnjEs0f8(((CrossAxisAlignment) obj11).ordinal);
                        return;
                    case 7:
                        obj11.getClass();
                        viewFlexContainer2.onScroll = ((Boolean) obj11).booleanValue() ? new NetworkFetcher$fetch$2(1, new RowProtocolNode$OnScroll(this.id, svg, rowHostProtocol2), RowProtocolNode$OnScroll.class, "invoke", "invoke-L2UXGw8(D)V", 0, 8) : null;
                        hostView2.attachOrDetachScrollListeners();
                        return;
                    default:
                        rowHostProtocol2.mismatchHandler.m1946onUnknownPropertyLKUuuww(1000001, i13);
                        return;
                }
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    /* renamed from: children-dBpC-2Y */
    public final AndroidSvg mo1195childrendBpC2Y(int i) {
        int i2 = this.$r8$classId;
        WidgetHostProtocol widgetHostProtocol = this.protocol;
        AndroidSvg androidSvg = this.children;
        switch (i2) {
            case 0:
                if (i != 1) {
                    ((FormHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(25, i);
                    break;
                } else {
                    break;
                }
            case 1:
                if (i != 1) {
                    ((FormHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(54, i);
                    break;
                } else {
                    break;
                }
            case 2:
                if (i != 1) {
                    ((TimelineHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(73, i);
                    break;
                } else {
                    break;
                }
            case 3:
                if (i != 1) {
                    ((ToggleHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(39, i);
                    break;
                } else {
                    break;
                }
            case 4:
                if (i != 1) {
                    ((ClickableCellHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(64, i);
                    break;
                } else {
                    break;
                }
            case 5:
                if (i != 1) {
                    ((FormHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(46, i);
                    break;
                } else {
                    break;
                }
            case 6:
                if (i != 1) {
                    ((ClickableCellHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(51, i);
                    break;
                } else {
                    break;
                }
            case 7:
                if (i != 1) {
                    ((FormHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(52, i);
                    break;
                } else {
                    break;
                }
            case 8:
                if (i != 1) {
                    ((RadioHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(35, i);
                    break;
                } else {
                    break;
                }
            case 9:
                if (i != 1) {
                    ((SearchBarHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(55, i);
                    break;
                } else {
                    break;
                }
            case 10:
                if (i != 1) {
                    ((TimelineItemHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(49, i);
                    break;
                } else {
                    break;
                }
            case 11:
                if (i != 1) {
                    ((TimelineHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(48, i);
                    break;
                } else {
                    break;
                }
            case 12:
                if (i != 1) {
                    ((IconHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(1000004, i);
                    break;
                } else {
                    break;
                }
            case 13:
                if (i != 1) {
                    ((RowHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(1000002, i);
                    break;
                } else {
                    break;
                }
            default:
                if (i != 1) {
                    ((RowHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(1000001, i);
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void detach() {
        switch (this.$r8$classId) {
            case 0:
                this.children.detach();
                this._widget = null;
                break;
            case 1:
                this.children.detach();
                this._widget = null;
                break;
            case 2:
                this.children.detach();
                this._widget = null;
                break;
            case 3:
                this.children.detach();
                this._widget = null;
                break;
            case 4:
                this.children.detach();
                this._widget = null;
                break;
            case 5:
                this.children.detach();
                this._widget = null;
                break;
            case 6:
                this.children.detach();
                this._widget = null;
                break;
            case 7:
                this.children.detach();
                this._widget = null;
                break;
            case 8:
                this.children.detach();
                this._widget = null;
                break;
            case 9:
                this.children.detach();
                this._widget = null;
                break;
            case 10:
                this.children.detach();
                this._widget = null;
                break;
            case 11:
                this.children.detach();
                this._widget = null;
                break;
            case 12:
                this.children.detach();
                this._widget = null;
                break;
            case 13:
                this.children.detach();
                this._widget = null;
                break;
            default:
                this.children.detach();
                this._widget = null;
                break;
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final Widget getWidget() {
        switch (this.$r8$classId) {
            case 0:
                CarouselBinding carouselBinding = (CarouselBinding) this._widget;
                if (carouselBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 1:
                CarouselBinding carouselBinding2 = (CarouselBinding) this._widget;
                if (carouselBinding2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 2:
                ArcadeTimelineBinding arcadeTimelineBinding = (ArcadeTimelineBinding) this._widget;
                if (arcadeTimelineBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 3:
                BottomSheetBinding bottomSheetBinding = (BottomSheetBinding) this._widget;
                if (bottomSheetBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 4:
                ClickableCellBinding clickableCellBinding = (ClickableCellBinding) this._widget;
                if (clickableCellBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 5:
                CarouselBinding carouselBinding3 = (CarouselBinding) this._widget;
                if (carouselBinding3 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 6:
                CarouselBinding carouselBinding4 = (CarouselBinding) this._widget;
                if (carouselBinding4 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 7:
                CarouselBinding carouselBinding5 = (CarouselBinding) this._widget;
                if (carouselBinding5 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 8:
                ReactionDialogAnchorBinding reactionDialogAnchorBinding = (ReactionDialogAnchorBinding) this._widget;
                if (reactionDialogAnchorBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 9:
                SearchFieldBinding searchFieldBinding = (SearchFieldBinding) this._widget;
                if (searchFieldBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 10:
                TimelineItemBinding timelineItemBinding = (TimelineItemBinding) this._widget;
                if (timelineItemBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 11:
                TimelineBinding timelineBinding = (TimelineBinding) this._widget;
                if (timelineBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 12:
                ViewBox viewBox = (ViewBox) this._widget;
                if (viewBox == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 13:
                ViewFlexContainer viewFlexContainer = (ViewFlexContainer) this._widget;
                if (viewFlexContainer == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            default:
                ViewFlexContainer viewFlexContainer2 = (ViewFlexContainer) this._widget;
                if (viewFlexContainer2 == null) {
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
                return "Carousel";
            case 1:
                return "ActivityInviteFriends";
            case 2:
                return "ArcadeTimeline";
            case 3:
                return "BottomSheet";
            case 4:
                return "ClickableCell";
            case 5:
                return "InfoModule";
            case 6:
                return "PullToRefresh";
            case 7:
                return "QuickAccessBar";
            case 8:
                return "ReactionDialogAnchor";
            case 9:
                return "SearchField";
            case 10:
                return "TimelineItem";
            case 11:
                return "Timeline";
            case 12:
                return "Box";
            case 13:
                return "Column";
            default:
                return "Row";
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    /* renamed from: getWidgetTag-BlhN7y0 */
    public final int mo1196getWidgetTagBlhN7y0() {
        switch (this.$r8$classId) {
            case 0:
                return 25;
            case 1:
                return 54;
            case 2:
                return 73;
            case 3:
                return 39;
            case 4:
                return 64;
            case 5:
                return 46;
            case 6:
                return 51;
            case 7:
                return 52;
            case 8:
                return 35;
            case 9:
                return 55;
            case 10:
                return 49;
            case 11:
                return 48;
            case 12:
                return 1000004;
            case 13:
                return 1000002;
            default:
                return 1000001;
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void visitIds(PreviewView.AnonymousClass1 anonymousClass1) {
        int i = this.$r8$classId;
        AndroidSvg androidSvg = this.children;
        anonymousClass1.getClass();
        switch (i) {
            case 0:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 1:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 2:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 3:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 4:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 5:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 6:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 7:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 8:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 9:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 10:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 11:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 12:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 13:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg.visitIds(anonymousClass1);
                break;
            default:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg.visitIds(anonymousClass1);
                break;
        }
    }

    public CarouselProtocolNode(int i, CarouselBinding carouselBinding, FormHostProtocol formHostProtocol, byte b) {
        super(i);
        this.protocol = formHostProtocol;
        this._widget = carouselBinding;
        this.children = new AndroidSvg((UnleashContext) carouselBinding.children);
    }

    public CarouselProtocolNode(int i, CarouselBinding carouselBinding, FormHostProtocol formHostProtocol, char c) {
        super(i);
        this.protocol = formHostProtocol;
        this._widget = carouselBinding;
        this.children = new AndroidSvg((UnleashContext) carouselBinding.children);
    }

    public CarouselProtocolNode(int i, CarouselBinding carouselBinding, FormHostProtocol formHostProtocol, int i2) {
        super(i);
        this.protocol = formHostProtocol;
        this._widget = carouselBinding;
        this.children = new AndroidSvg((MutableListChildren) carouselBinding.children);
    }

    public CarouselProtocolNode(int i, ArcadeTimelineBinding arcadeTimelineBinding, TimelineHostProtocol timelineHostProtocol) {
        super(i);
        this.protocol = timelineHostProtocol;
        this._widget = arcadeTimelineBinding;
        this.children = new AndroidSvg(arcadeTimelineBinding.content);
    }

    public CarouselProtocolNode(int i, TimelineBinding timelineBinding, TimelineHostProtocol timelineHostProtocol) {
        super(i);
        this.protocol = timelineHostProtocol;
        this._widget = timelineBinding;
        this.children = new AndroidSvg(timelineBinding.content);
    }

    public CarouselProtocolNode(int i, ClickableCellBinding clickableCellBinding, ClickableCellHostProtocol clickableCellHostProtocol) {
        super(i);
        this.protocol = clickableCellHostProtocol;
        this._widget = clickableCellBinding;
        this.children = new AndroidSvg(clickableCellBinding.content);
    }

    public CarouselProtocolNode(int i, CarouselBinding carouselBinding, FormHostProtocol formHostProtocol) {
        super(i);
        this.protocol = formHostProtocol;
        this._widget = carouselBinding;
        this.children = new AndroidSvg((MutableListChildren) carouselBinding.value);
    }

    public CarouselProtocolNode(int i, ViewBox viewBox, IconHostProtocol iconHostProtocol) {
        super(i);
        this.protocol = iconHostProtocol;
        this._widget = viewBox;
        this.children = new AndroidSvg(viewBox.children);
    }

    public CarouselProtocolNode(int i, TimelineItemBinding timelineItemBinding, TimelineItemHostProtocol timelineItemHostProtocol) {
        super(i);
        this.protocol = timelineItemHostProtocol;
        this._widget = timelineItemBinding;
        this.children = new AndroidSvg(timelineItemBinding.content);
    }

    public CarouselProtocolNode(int i, BottomSheetBinding bottomSheetBinding, ToggleHostProtocol toggleHostProtocol) {
        super(i);
        this.protocol = toggleHostProtocol;
        this._widget = bottomSheetBinding;
        this.children = new AndroidSvg(new UnleashContext(bottomSheetBinding.sheetContent));
    }

    public CarouselProtocolNode(int i, SearchFieldBinding searchFieldBinding, SearchBarHostProtocol searchBarHostProtocol) {
        super(i);
        this.protocol = searchBarHostProtocol;
        this._widget = searchFieldBinding;
        this.children = new AndroidSvg(searchFieldBinding.suggestions);
    }

    public CarouselProtocolNode(int i, ReactionDialogAnchorBinding reactionDialogAnchorBinding, RadioHostProtocol radioHostProtocol) {
        super(i);
        this.protocol = radioHostProtocol;
        this._widget = reactionDialogAnchorBinding;
        this.children = new AndroidSvg(reactionDialogAnchorBinding.children);
    }

    public CarouselProtocolNode(int i, ViewFlexContainer viewFlexContainer, RowHostProtocol rowHostProtocol) {
        super(i);
        this.protocol = rowHostProtocol;
        this._widget = viewFlexContainer;
        this.children = new AndroidSvg(viewFlexContainer.children);
    }

    public CarouselProtocolNode(int i, ViewFlexContainer viewFlexContainer, RowHostProtocol rowHostProtocol, byte b) {
        super(i);
        this.protocol = rowHostProtocol;
        this._widget = viewFlexContainer;
        this.children = new AndroidSvg(viewFlexContainer.children);
    }
}
