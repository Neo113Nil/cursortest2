package app.cash.arcade.protocol.host.redwoodlazylayout;

import app.cash.arcade.protocol.host.arcade.ButtonHostProtocol;
import com.caverock.androidsvg.SVG;

/* loaded from: classes3.dex */
public final class RefreshableLazyListProtocolNode$OnViewportChanged {
    public final SVG eventSink;
    public final int id;
    public final ButtonHostProtocol protocol;

    public RefreshableLazyListProtocolNode$OnViewportChanged(int i, SVG svg, ButtonHostProtocol buttonHostProtocol) {
        svg.getClass();
        this.id = i;
        this.eventSink = svg;
        this.protocol = buttonHostProtocol;
    }
}
