package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Guideline;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenDescriptionView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenInfoView;

/* loaded from: classes4.dex */
public final class t061 implements zo31 {
    public final CommunicationFullScreenDescriptionView a;
    public final Guideline b;
    public final AppCompatImageView c;
    public final CommunicationFullScreenInfoView d;

    public t061(CommunicationFullScreenDescriptionView communicationFullScreenDescriptionView, Guideline guideline, AppCompatImageView appCompatImageView, CommunicationFullScreenInfoView communicationFullScreenInfoView) {
        this.a = communicationFullScreenDescriptionView;
        this.b = guideline;
        this.c = appCompatImageView;
        this.d = communicationFullScreenInfoView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
