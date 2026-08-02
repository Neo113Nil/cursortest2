package defpackage;

import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenInfoView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenVideoView;

/* loaded from: classes4.dex */
public final class x061 implements zo31 {
    public final CommunicationFullScreenVideoView a;
    public final CommunicationFullScreenInfoView b;
    public final ImageView c;
    public final TextureView d;

    public x061(CommunicationFullScreenVideoView communicationFullScreenVideoView, CommunicationFullScreenInfoView communicationFullScreenInfoView, ImageView imageView, TextureView textureView) {
        this.a = communicationFullScreenVideoView;
        this.b = communicationFullScreenInfoView;
        this.c = imageView;
        this.d = textureView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
