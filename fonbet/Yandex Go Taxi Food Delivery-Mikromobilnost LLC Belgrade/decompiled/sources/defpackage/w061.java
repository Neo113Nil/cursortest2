package defpackage;

import android.view.View;
import android.widget.TextView;
import com.ybsdk.widgets.common.communication.ClickTransparentRecyclerView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenInfoView;

/* loaded from: classes4.dex */
public final class w061 implements zo31 {
    public final CommunicationFullScreenInfoView a;
    public final ClickTransparentRecyclerView b;
    public final TextView c;
    public final TextView d;

    public w061(CommunicationFullScreenInfoView communicationFullScreenInfoView, ClickTransparentRecyclerView clickTransparentRecyclerView, TextView textView, TextView textView2) {
        this.a = communicationFullScreenInfoView;
        this.b = clickTransparentRecyclerView;
        this.c = textView;
        this.d = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
