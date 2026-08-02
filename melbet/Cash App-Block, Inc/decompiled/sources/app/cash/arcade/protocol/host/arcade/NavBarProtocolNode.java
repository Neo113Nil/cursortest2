package app.cash.arcade.protocol.host.arcade;

import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.camera.view.PreviewView;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.cash.arcade.protocol.host.redwoodlazylayout.LazyListHostProtocol;
import app.cash.arcade.protocol.host.redwoodlazylayout.LazyListProtocolNode$OnViewportChanged;
import app.cash.arcade.protocol.host.redwoodlazylayout.RefreshableLazyListProtocolNode$OnRefresh;
import app.cash.arcade.protocol.host.redwoodlazylayout.RefreshableLazyListProtocolNode$OnViewportChanged;
import app.cash.arcade.values.KeypadExtraKey;
import app.cash.arcade.values.keypad.KeypadTextState;
import app.cash.redwood.layout.api.Constraint;
import app.cash.redwood.layout.api.CrossAxisAlignment;
import app.cash.redwood.lazylayout.api.ScrollItemIndex;
import app.cash.redwood.lazylayout.view.ViewLazyList;
import app.cash.redwood.lazylayout.view.ViewLazyList$processor$1;
import app.cash.redwood.lazylayout.view.ViewLazyList$scrollProcessor$1;
import app.cash.redwood.lazylayout.view.ViewRefreshableLazyList;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.UiPropertyChange;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import app.cash.redwood.ui.Margin;
import app.cash.redwood.widget.Widget;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.caverock.androidsvg.SVG;
import com.squareup.cash.arcade.treehouse.KeypadScaffoldBinding;
import com.squareup.cash.arcade.treehouse.NavBarBinding;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import kotlin.UInt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class NavBarProtocolNode extends ProtocolNode {
    public final /* synthetic */ int $r8$classId = 2;
    public Widget _widget;
    public final AndroidSvg endContainer;
    public final WidgetHostProtocol protocol;
    public final AndroidSvg startContainer;

    public NavBarProtocolNode(int i, ViewRefreshableLazyList viewRefreshableLazyList, ButtonHostProtocol buttonHostProtocol) {
        super(i);
        this.protocol = buttonHostProtocol;
        this._widget = viewRefreshableLazyList;
        ViewLazyList viewLazyList = viewRefreshableLazyList.delegate;
        this.startContainer = new AndroidSvg(viewLazyList.placeholder);
        this.endContainer = new AndroidSvg(viewLazyList.items);
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void apply(UiPropertyChange uiPropertyChange, SVG svg) {
        int i = this.$r8$classId;
        WidgetHostProtocol widgetHostProtocol = this.protocol;
        switch (i) {
            case 0:
                svg.getClass();
                if (((NavBarBinding) this._widget) == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i2 = uiPropertyChange.tag;
                if (i2 != 1) {
                    ((NavBarHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(5, i2);
                    return;
                }
                Object obj = uiPropertyChange.value;
                obj.getClass();
                return;
            case 1:
                TextFieldHostProtocol textFieldHostProtocol = (TextFieldHostProtocol) widgetHostProtocol;
                svg.getClass();
                KeypadScaffoldBinding keypadScaffoldBinding = (KeypadScaffoldBinding) this._widget;
                if (keypadScaffoldBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                int i3 = uiPropertyChange.tag;
                Object obj2 = uiPropertyChange.value;
                if (i3 == 3) {
                    obj2.getClass();
                    KeypadTextState keypadTextState = (KeypadTextState) obj2;
                    if (keypadTextState.version < keypadScaffoldBinding.state.version) {
                        return;
                    }
                    if (keypadScaffoldBinding.updating) {
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        return;
                    }
                    keypadScaffoldBinding.updating = true;
                    try {
                        keypadScaffoldBinding.state = keypadTextState;
                        keypadScaffoldBinding.keypadAmount.setRawAmount(keypadTextState.text);
                        return;
                    } finally {
                        keypadScaffoldBinding.updating = false;
                    }
                }
                if (i3 == 4) {
                    obj2.getClass();
                    if (((Boolean) obj2).booleanValue()) {
                        keypadScaffoldBinding.onChanged = new GraphLoop$processingQueue$1(1, new KeypadScaffoldProtocolNode$OnChanged(this.id, svg, textFieldHostProtocol), KeypadScaffoldProtocolNode$OnChanged.class, "invoke", "invoke(Lapp/cash/arcade/values/keypad/KeypadTextState;)V", 0, 13);
                        return;
                    } else {
                        Path$$ExternalSyntheticBUOutline0.m$2();
                        return;
                    }
                }
                if (i3 == 5) {
                    obj2.getClass();
                    keypadScaffoldBinding.decimalKey$delegate.setValue((String) obj2);
                    return;
                } else if (i3 != 6) {
                    textFieldHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(60, i3);
                    return;
                } else {
                    obj2.getClass();
                    keypadScaffoldBinding.extraKey$delegate.setValue((KeypadExtraKey) obj2);
                    return;
                }
            case 2:
                LazyListHostProtocol lazyListHostProtocol = (LazyListHostProtocol) widgetHostProtocol;
                svg.getClass();
                ViewLazyList viewLazyList = (ViewLazyList) this._widget;
                if (viewLazyList == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                ViewLazyList$processor$1 viewLazyList$processor$1 = viewLazyList.processor;
                ViewLazyList$scrollProcessor$1 viewLazyList$scrollProcessor$1 = viewLazyList.scrollProcessor;
                int i4 = uiPropertyChange.tag;
                Object obj3 = uiPropertyChange.value;
                switch (i4) {
                    case 1:
                        obj3.getClass();
                        viewLazyList.linearLayoutManager.setOrientation(((Boolean) obj3).booleanValue() ? 1 : 0);
                        return;
                    case 2:
                        obj3.getClass();
                        if (!((Boolean) obj3).booleanValue()) {
                            Path$$ExternalSyntheticBUOutline0.m$2();
                            return;
                        }
                        WorkApplet$applet$1 workApplet$applet$1 = new WorkApplet$applet$1(2, new LazyListProtocolNode$OnViewportChanged(this.id, svg, lazyListHostProtocol), LazyListProtocolNode$OnViewportChanged.class, "invoke", "invoke(II)V", 0, 7);
                        viewLazyList$scrollProcessor$1.getClass();
                        viewLazyList$scrollProcessor$1.onViewportChanged = workApplet$applet$1;
                        return;
                    case 3:
                        obj3.getClass();
                        viewLazyList$processor$1.newItemsBefore = ((Integer) obj3).intValue();
                        return;
                    case 4:
                        obj3.getClass();
                        viewLazyList$processor$1.newItemsAfter = ((Integer) obj3).intValue();
                        return;
                    case 5:
                        obj3.getClass();
                        viewLazyList.m1367widthDyLkt4w(((Constraint) obj3).ordinal);
                        return;
                    case 6:
                        obj3.getClass();
                        viewLazyList.m1366heightDyLkt4w(((Constraint) obj3).ordinal);
                        return;
                    case 7:
                        obj3.getClass();
                        viewLazyList.margin((Margin) obj3);
                        return;
                    case 8:
                        obj3.getClass();
                        viewLazyList.m1365crossAxisAlignmentnjEs0f8(((CrossAxisAlignment) obj3).ordinal);
                        return;
                    case 9:
                        obj3.getClass();
                        ScrollItemIndex scrollItemIndex = (ScrollItemIndex) obj3;
                        viewLazyList$scrollProcessor$1.getClass();
                        viewLazyList$scrollProcessor$1.deferredProgrammaticScrollIndex = scrollItemIndex.index;
                        viewLazyList$scrollProcessor$1.deferredProgrammaticScrollAnimated = scrollItemIndex.animated;
                        return;
                    default:
                        lazyListHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(2000001, i4);
                        return;
                }
            default:
                ButtonHostProtocol buttonHostProtocol = (ButtonHostProtocol) widgetHostProtocol;
                svg.getClass();
                ViewRefreshableLazyList viewRefreshableLazyList = (ViewRefreshableLazyList) this._widget;
                if (viewRefreshableLazyList == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    return;
                }
                SwipeRefreshLayout swipeRefreshLayout = viewRefreshableLazyList.swipeRefreshLayout;
                ViewLazyList viewLazyList2 = viewRefreshableLazyList.delegate;
                int i5 = uiPropertyChange.tag;
                Object obj4 = uiPropertyChange.value;
                switch (i5) {
                    case 1:
                        obj4.getClass();
                        viewLazyList2.linearLayoutManager.setOrientation(((Boolean) obj4).booleanValue() ? 1 : 0);
                        return;
                    case 2:
                        obj4.getClass();
                        if (!((Boolean) obj4).booleanValue()) {
                            Path$$ExternalSyntheticBUOutline0.m$2();
                            return;
                        }
                        WorkApplet$applet$1 workApplet$applet$12 = new WorkApplet$applet$1(2, new RefreshableLazyListProtocolNode$OnViewportChanged(this.id, svg, buttonHostProtocol), RefreshableLazyListProtocolNode$OnViewportChanged.class, "invoke", "invoke(II)V", 0, 8);
                        ViewLazyList$scrollProcessor$1 viewLazyList$scrollProcessor$12 = viewLazyList2.scrollProcessor;
                        viewLazyList$scrollProcessor$12.getClass();
                        viewLazyList$scrollProcessor$12.onViewportChanged = workApplet$applet$12;
                        return;
                    case 3:
                        obj4.getClass();
                        viewLazyList2.processor.newItemsBefore = ((Integer) obj4).intValue();
                        return;
                    case 4:
                        obj4.getClass();
                        viewLazyList2.processor.newItemsAfter = ((Integer) obj4).intValue();
                        return;
                    case 5:
                        obj4.getClass();
                        swipeRefreshLayout.setRefreshing(((Boolean) obj4).booleanValue());
                        return;
                    case 6:
                        obj4.getClass();
                        WandScene$ring$3 wandScene$ring$3 = ((Boolean) obj4).booleanValue() ? new WandScene$ring$3(0, new RefreshableLazyListProtocolNode$OnRefresh(this.id, svg), RefreshableLazyListProtocolNode$OnRefresh.class, "invoke", "invoke()V", 0, 6) : null;
                        swipeRefreshLayout.setEnabled(wandScene$ring$3 != null);
                        swipeRefreshLayout.setOnRefreshListener(wandScene$ring$3 != null ? new ExoPlayerImplInternal$$ExternalSyntheticLambda2(wandScene$ring$3, 18) : null);
                        return;
                    case 7:
                        obj4.getClass();
                        viewLazyList2.m1367widthDyLkt4w(((Constraint) obj4).ordinal);
                        return;
                    case 8:
                        obj4.getClass();
                        viewLazyList2.m1366heightDyLkt4w(((Constraint) obj4).ordinal);
                        return;
                    case 9:
                        obj4.getClass();
                        viewLazyList2.margin((Margin) obj4);
                        return;
                    case 10:
                        obj4.getClass();
                        viewLazyList2.m1365crossAxisAlignmentnjEs0f8(((CrossAxisAlignment) obj4).ordinal);
                        return;
                    case 11:
                        obj4.getClass();
                        ScrollItemIndex scrollItemIndex2 = (ScrollItemIndex) obj4;
                        viewLazyList2.getClass();
                        ViewLazyList$scrollProcessor$1 viewLazyList$scrollProcessor$13 = viewLazyList2.scrollProcessor;
                        viewLazyList$scrollProcessor$13.getClass();
                        viewLazyList$scrollProcessor$13.deferredProgrammaticScrollIndex = scrollItemIndex2.index;
                        viewLazyList$scrollProcessor$13.deferredProgrammaticScrollAnimated = scrollItemIndex2.animated;
                        return;
                    case 12:
                        obj4.getClass();
                        swipeRefreshLayout.setColorSchemeColors(((UInt) obj4).data);
                        return;
                    default:
                        buttonHostProtocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(2000002, i5);
                        return;
                }
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    /* renamed from: children-dBpC-2Y */
    public final AndroidSvg mo1195childrendBpC2Y(int i) {
        int i2 = this.$r8$classId;
        AndroidSvg androidSvg = this.startContainer;
        AndroidSvg androidSvg2 = this.endContainer;
        WidgetHostProtocol widgetHostProtocol = this.protocol;
        switch (i2) {
            case 0:
                if (i != 1) {
                    if (i == 2) {
                        break;
                    } else {
                        ((NavBarHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(5, i);
                        break;
                    }
                }
                break;
            case 1:
                if (i != 1) {
                    if (i == 2) {
                        break;
                    } else {
                        ((TextFieldHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(60, i);
                        break;
                    }
                }
                break;
            case 2:
                if (i != 1) {
                    if (i == 2) {
                        break;
                    } else {
                        ((LazyListHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(2000001, i);
                        break;
                    }
                }
                break;
            default:
                if (i != 1) {
                    if (i == 2) {
                        break;
                    } else {
                        ((ButtonHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(2000002, i);
                        break;
                    }
                }
                break;
        }
        return androidSvg2;
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void detach() {
        switch (this.$r8$classId) {
            case 0:
                this.startContainer.detach();
                this.endContainer.detach();
                this._widget = null;
                break;
            case 1:
                this.startContainer.detach();
                this.endContainer.detach();
                this._widget = null;
                break;
            case 2:
                this.startContainer.detach();
                this.endContainer.detach();
                this._widget = null;
                break;
            default:
                this.startContainer.detach();
                this.endContainer.detach();
                this._widget = null;
                break;
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final Widget getWidget() {
        switch (this.$r8$classId) {
            case 0:
                NavBarBinding navBarBinding = (NavBarBinding) this._widget;
                if (navBarBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 1:
                KeypadScaffoldBinding keypadScaffoldBinding = (KeypadScaffoldBinding) this._widget;
                if (keypadScaffoldBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 2:
                ViewLazyList viewLazyList = (ViewLazyList) this._widget;
                if (viewLazyList == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            default:
                ViewRefreshableLazyList viewRefreshableLazyList = (ViewRefreshableLazyList) this._widget;
                if (viewRefreshableLazyList == null) {
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
                return "NavBar";
            case 1:
                return "KeypadScaffold";
            case 2:
                return "LazyList";
            default:
                return "RefreshableLazyList";
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    /* renamed from: getWidgetTag-BlhN7y0 */
    public final int mo1196getWidgetTagBlhN7y0() {
        switch (this.$r8$classId) {
            case 0:
                return 5;
            case 1:
                return 60;
            case 2:
                return 2000001;
            default:
                return 2000002;
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void visitIds(PreviewView.AnonymousClass1 anonymousClass1) {
        int i = this.$r8$classId;
        AndroidSvg androidSvg = this.endContainer;
        AndroidSvg androidSvg2 = this.startContainer;
        anonymousClass1.getClass();
        switch (i) {
            case 0:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg2.visitIds(anonymousClass1);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 1:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg2.visitIds(anonymousClass1);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 2:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg2.visitIds(anonymousClass1);
                androidSvg.visitIds(anonymousClass1);
                break;
            default:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg2.visitIds(anonymousClass1);
                androidSvg.visitIds(anonymousClass1);
                break;
        }
    }

    public NavBarProtocolNode(int i, KeypadScaffoldBinding keypadScaffoldBinding, TextFieldHostProtocol textFieldHostProtocol) {
        super(i);
        this.protocol = textFieldHostProtocol;
        this._widget = keypadScaffoldBinding;
        this.startContainer = new AndroidSvg(keypadScaffoldBinding.header);
        this.endContainer = new AndroidSvg(keypadScaffoldBinding.footer);
    }

    public NavBarProtocolNode(int i, ViewLazyList viewLazyList, LazyListHostProtocol lazyListHostProtocol) {
        super(i);
        this.protocol = lazyListHostProtocol;
        this._widget = viewLazyList;
        this.startContainer = new AndroidSvg(viewLazyList.placeholder);
        this.endContainer = new AndroidSvg(viewLazyList.items);
    }

    public NavBarProtocolNode(int i, NavBarBinding navBarBinding, NavBarHostProtocol navBarHostProtocol) {
        super(i);
        this.protocol = navBarHostProtocol;
        this._widget = navBarBinding;
        this.startContainer = new AndroidSvg(navBarBinding.startContainer);
        this.endContainer = new AndroidSvg(navBarBinding.endContainer);
    }
}
