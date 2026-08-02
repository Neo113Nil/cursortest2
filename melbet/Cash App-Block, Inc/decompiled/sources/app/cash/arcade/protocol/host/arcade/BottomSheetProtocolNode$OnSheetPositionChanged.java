package app.cash.arcade.protocol.host.arcade;

import com.caverock.androidsvg.SVG;

/* loaded from: classes3.dex */
public final class BottomSheetProtocolNode$OnSheetPositionChanged {
    public final SVG eventSink;
    public final int id;
    public final ToggleHostProtocol protocol;

    public BottomSheetProtocolNode$OnSheetPositionChanged(int i, SVG svg, ToggleHostProtocol toggleHostProtocol) {
        svg.getClass();
        this.id = i;
        this.eventSink = svg;
        this.protocol = toggleHostProtocol;
    }
}
