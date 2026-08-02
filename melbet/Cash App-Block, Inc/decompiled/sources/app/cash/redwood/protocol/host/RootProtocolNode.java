package app.cash.redwood.protocol.host;

import androidx.camera.view.PreviewView;
import app.cash.redwood.Modifier;
import app.cash.redwood.protocol.ChildrenTag;
import app.cash.redwood.protocol.Id;
import app.cash.redwood.widget.Widget;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.caverock.androidsvg.SVG;

/* loaded from: classes3.dex */
public final class RootProtocolNode extends ProtocolNode implements Widget {
    public final AndroidSvg children;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootProtocolNode(Widget.Children children) {
        super(0);
        children.getClass();
        Id.Companion.getClass();
        this.children = new AndroidSvg(children);
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void apply(UiPropertyChange uiPropertyChange, SVG svg) {
        svg.getClass();
        throw new AssertionError("unexpected: " + uiPropertyChange);
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    /* renamed from: children-dBpC-2Y */
    public final AndroidSvg mo1195childrendBpC2Y(int i) {
        ChildrenTag.Companion.getClass();
        if (i == 1) {
            return this.children;
        }
        a$$ExternalSyntheticBUOutline0.m$1((Object) "unexpected: ".concat("ChildrenTag(value=" + i + ")"));
        return null;
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void detach() {
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        throw new AssertionError();
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        throw new AssertionError();
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final Widget getWidget() {
        return this;
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final String getWidgetName() {
        return "RootProtocolNode";
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    /* renamed from: getWidgetTag-BlhN7y0 */
    public final int mo1196getWidgetTagBlhN7y0() {
        return -1;
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        throw new AssertionError();
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void visitIds(PreviewView.AnonymousClass1 anonymousClass1) {
        anonymousClass1.getClass();
        this.children.visitIds(anonymousClass1);
    }
}
