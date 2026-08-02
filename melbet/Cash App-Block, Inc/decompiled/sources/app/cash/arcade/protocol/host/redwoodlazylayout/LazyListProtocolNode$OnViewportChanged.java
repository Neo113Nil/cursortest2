package app.cash.arcade.protocol.host.redwoodlazylayout;

import com.caverock.androidsvg.SVG;

/* loaded from: classes3.dex */
public final class LazyListProtocolNode$OnViewportChanged {
    public final SVG eventSink;
    public final int id;
    public final LazyListHostProtocol protocol;

    public LazyListProtocolNode$OnViewportChanged(int i, SVG svg, LazyListHostProtocol lazyListHostProtocol) {
        svg.getClass();
        this.id = i;
        this.eventSink = svg;
        this.protocol = lazyListHostProtocol;
    }
}
