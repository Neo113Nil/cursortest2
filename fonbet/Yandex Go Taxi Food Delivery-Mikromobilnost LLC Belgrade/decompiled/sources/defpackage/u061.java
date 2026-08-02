package defpackage;

import android.view.View;
import com.ybsdk.widgets.common.ImageViewWithCustomScaleTypes;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenGraphicsView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenInfoView;

/* loaded from: classes4.dex */
public final class u061 implements zo31 {
    public final CommunicationFullScreenGraphicsView a;
    public final ImageViewWithCustomScaleTypes b;
    public final CommunicationFullScreenInfoView c;

    public u061(CommunicationFullScreenGraphicsView communicationFullScreenGraphicsView, ImageViewWithCustomScaleTypes imageViewWithCustomScaleTypes, CommunicationFullScreenInfoView communicationFullScreenInfoView) {
        this.a = communicationFullScreenGraphicsView;
        this.b = imageViewWithCustomScaleTypes;
        this.c = communicationFullScreenInfoView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
