package app.cash.arcade.protocol.host.arcade;

import com.caverock.androidsvg.SVG;

/* loaded from: classes3.dex */
public final class SearchBarProtocolNode$OnQueryChange {
    public final SVG eventSink;
    public final int id;
    public final SearchBarHostProtocol protocol;

    public SearchBarProtocolNode$OnQueryChange(int i, SVG svg, SearchBarHostProtocol searchBarHostProtocol) {
        svg.getClass();
        this.id = i;
        this.eventSink = svg;
        this.protocol = searchBarHostProtocol;
    }
}
