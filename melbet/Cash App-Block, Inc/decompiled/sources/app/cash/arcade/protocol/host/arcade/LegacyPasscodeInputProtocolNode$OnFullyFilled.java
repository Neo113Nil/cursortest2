package app.cash.arcade.protocol.host.arcade;

import com.caverock.androidsvg.SVG;

/* loaded from: classes3.dex */
public final class LegacyPasscodeInputProtocolNode$OnFullyFilled {
    public final SVG eventSink;
    public final int id;
    public final RoundedRectHostProtocol protocol;

    public LegacyPasscodeInputProtocolNode$OnFullyFilled(int i, SVG svg, RoundedRectHostProtocol roundedRectHostProtocol) {
        svg.getClass();
        this.id = i;
        this.eventSink = svg;
        this.protocol = roundedRectHostProtocol;
    }
}
