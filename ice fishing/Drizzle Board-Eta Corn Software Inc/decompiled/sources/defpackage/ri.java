package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ri implements View.OnAttachStateChangeListener {
    public final /* synthetic */ si MdtA4re8;
    public final /* synthetic */ xj NCTxEWno;

    public ri(si siVar, xj xjVar) {
        this.MdtA4re8 = siVar;
        this.NCTxEWno = xjVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        xj xjVar = this.NCTxEWno;
        li liVar = xjVar.MdtA4re8;
        xjVar.k3x7lurq();
        pb.P7K7Inc8((ViewGroup) liVar.ytu5o6f4.getParent(), this.MdtA4re8.NCTxEWno).VgvYg0wo();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
