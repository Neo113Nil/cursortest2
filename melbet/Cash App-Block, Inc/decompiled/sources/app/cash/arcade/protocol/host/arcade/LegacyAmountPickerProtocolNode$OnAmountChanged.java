package app.cash.arcade.protocol.host.arcade;

import com.caverock.androidsvg.SVG;

/* loaded from: classes3.dex */
public final class LegacyAmountPickerProtocolNode$OnAmountChanged {
    public final SVG eventSink;
    public final int id;
    public final LegacyAmountPickerHostProtocol protocol;

    public LegacyAmountPickerProtocolNode$OnAmountChanged(int i, SVG svg, LegacyAmountPickerHostProtocol legacyAmountPickerHostProtocol) {
        svg.getClass();
        this.id = i;
        this.eventSink = svg;
        this.protocol = legacyAmountPickerHostProtocol;
    }
}
