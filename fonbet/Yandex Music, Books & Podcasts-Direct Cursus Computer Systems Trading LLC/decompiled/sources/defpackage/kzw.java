package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class kzw extends a {
    public final Bundle E;

    public kzw(rn5 rn5Var, rmd rmdVar, smd smdVar, Context context, Looper looper) {
        super(context, looper, 223, rn5Var, rmdVar, smdVar, 0);
        this.E = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final int k() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return queryLocalInterface instanceof pzw ? (pzw) queryLocalInterface : new pzw(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService", 1);
    }

    @Override // com.google.android.gms.common.internal.a
    public final i6c[] p() {
        return j66.m;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle r() {
        return this.E;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String t() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String u() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean v() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean y() {
        return true;
    }
}
