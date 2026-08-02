package app.cash.arcade.protocol.host.arcade;

import com.caverock.androidsvg.SVG;

/* loaded from: classes3.dex */
public final class InputFieldProtocolNode$OnFocusChange {
    public final SVG eventSink;
    public final int id;
    public final InputFieldHostProtocol protocol;

    public InputFieldProtocolNode$OnFocusChange(int i, SVG svg, InputFieldHostProtocol inputFieldHostProtocol) {
        svg.getClass();
        this.id = i;
        this.eventSink = svg;
        this.protocol = inputFieldHostProtocol;
    }
}
