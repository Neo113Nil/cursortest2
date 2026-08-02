package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class vix extends cix {
    @Override // defpackage.cix
    public final void S0(Bundle bundle) {
        super.S0(bundle);
        int i = bundle.getInt("error.code", -2);
        i8s i8sVar = this.i;
        if (i != 0) {
            i8sVar.c(new ooe(bundle.getInt("error.code", -2)));
        } else {
            i8sVar.d(null);
        }
    }
}
