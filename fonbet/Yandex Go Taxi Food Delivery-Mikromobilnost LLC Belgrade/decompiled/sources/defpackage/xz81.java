package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zak;

/* loaded from: classes11.dex */
public final class xz81 implements xst {
    public final int a;
    public final yst b;
    public final xst c;
    public final /* synthetic */ zak w;

    public xz81(zak zakVar, int i, yst ystVar, xst xstVar) {
        this.w = zakVar;
        this.a = i;
        this.b = ystVar;
        this.c = xstVar;
    }

    @Override // defpackage.yx60
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.w.zah(connectionResult, this.a);
    }
}
