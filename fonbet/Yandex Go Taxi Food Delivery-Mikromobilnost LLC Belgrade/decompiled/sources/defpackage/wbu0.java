package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes15.dex */
public final class wbu0 extends ybu0 {
    public final TextView N;

    public wbu0(Context context, ViewGroup viewGroup) {
        super(context, viewGroup, olh0.msg_vh_emoji_sticker_header_item);
        this.N = (TextView) this.a;
    }

    @Override // defpackage.ybu0
    public final void W(qgn0 qgn0Var) {
        z83.h(null, !((vcu0) qgn0Var.b).b.isNull(2));
        vcu0 vcu0Var = (vcu0) qgn0Var.b;
        if (vcu0Var.b.isNull(2)) {
            ny61.r("Check isHeader() first");
        } else {
            this.N.setText(vcu0Var.b.getString(2));
        }
    }

    @Override // defpackage.ybu0
    public final void b() {
    }
}
