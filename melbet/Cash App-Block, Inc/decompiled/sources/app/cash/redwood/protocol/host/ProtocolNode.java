package app.cash.redwood.protocol.host;

import androidx.camera.view.PreviewView;
import app.cash.redwood.widget.Widget;
import coil3.svg.internal.AndroidSvg;
import com.caverock.androidsvg.SVG;

/* loaded from: classes3.dex */
public abstract class ProtocolNode {
    public Widget.Children container;
    public int id;
    public int index = -1;
    public boolean reuse;
    public long shapeHash;

    public ProtocolNode(int i) {
        this.id = i;
    }

    public abstract void apply(UiPropertyChange uiPropertyChange, SVG svg);

    /* renamed from: children-dBpC-2Y */
    public abstract AndroidSvg mo1195childrendBpC2Y(int i);

    public abstract void detach();

    public abstract Widget getWidget();

    public abstract String getWidgetName();

    /* renamed from: getWidgetTag-BlhN7y0 */
    public abstract int mo1196getWidgetTagBlhN7y0();

    public final String toString() {
        return getWidgetName() + "(id=" + this.id + ", tag=" + mo1196getWidgetTagBlhN7y0() + ")";
    }

    public void visitIds(PreviewView.AnonymousClass1 anonymousClass1) {
        anonymousClass1.getClass();
        anonymousClass1.m125visitou3jOuA(this.id);
    }
}
