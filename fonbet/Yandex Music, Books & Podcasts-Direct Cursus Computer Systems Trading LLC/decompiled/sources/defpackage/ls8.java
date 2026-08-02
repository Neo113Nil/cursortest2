package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* loaded from: classes3.dex */
public final class ls8 extends OrientationEventListener {
    public final /* synthetic */ ns8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls8(ns8 ns8Var, Context context) {
        super(context);
        this.a = ns8Var;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        xdr xdrVar = this.a.z().q;
        Integer valueOf = Integer.valueOf(i);
        xdrVar.getClass();
        xdrVar.m(null, valueOf);
    }
}
