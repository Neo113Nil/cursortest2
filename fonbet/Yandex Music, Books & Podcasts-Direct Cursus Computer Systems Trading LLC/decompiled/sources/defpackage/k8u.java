package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* loaded from: classes3.dex */
public final class k8u extends OrientationEventListener {
    public final /* synthetic */ l8u a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8u(l8u l8uVar, Context context) {
        super(context);
        this.a = l8uVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        x8u x8uVar = ((i < 0 || i >= 61) && (300 > i || i >= 361)) ? x8u.LANDSCAPE : x8u.PORTRAIT;
        i9u B = this.a.B();
        xdr xdrVar = B.B;
        if (B.K == x8u.AUTO && x8uVar != xdrVar.getValue()) {
            x8u x8uVar2 = B.L;
            if (x8uVar2 != null && x8uVar != x8uVar2) {
                B.H(x8uVar);
            }
            B.L = x8uVar;
        }
        xdrVar.getClass();
        xdrVar.m(null, x8uVar);
    }
}
