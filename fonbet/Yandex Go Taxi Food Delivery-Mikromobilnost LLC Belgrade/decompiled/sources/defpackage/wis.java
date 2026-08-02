package defpackage;

import android.widget.ImageView;
import com.ybsdk.core.design.design.DesignTextStyle;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView$State$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wis extends yis {
    public final Throwable b;

    public wis(Throwable th) {
        super(new sis(new vrc(CommunicationFullScreenView$State$Type.DESCRIPTION, unr0.h(Text.Companion, dzh0.ybsdk_pin_first_pin_set_title), null, DesignTextStyle.H1, new Text.Resource(dzh0.ybsdk_pin_you_must_create_code_description), null, DesignTextStyle.B2, null, new ColorModel.Attr(ung0.ybColor_fill_color7_200), new nbv(gyg0.ybsdk_create_pin_image, null), null, new YbButtonViewGroup.b(YbButtonViewGroup.Orientation.VERTICAL, new YbButtonView.a(new Text.Resource(dzh0.ybsdk_pin_you_must_create_code_button_title), null, null, null, null, null, null, false, false, null, 4094), null, null, 12), null, 0, 0, null, null, ImageView.ScaleType.FIT_CENTER, 0, false, null, null, null, null, null, null, -267100, 3)));
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wis) && jl40.l(this.b, ((wis) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return b64.m("PinSetup(throwable=", Extension.C_BRAKE, this.b);
    }
}
