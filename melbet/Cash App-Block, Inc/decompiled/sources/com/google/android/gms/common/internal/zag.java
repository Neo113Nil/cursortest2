package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes4.dex */
public final class zag extends zaj {
    public final /* synthetic */ Intent zaa;
    public final /* synthetic */ GoogleApiActivity zab;

    public zag(Intent intent, GoogleApiActivity googleApiActivity) {
        this.zaa = intent;
        this.zab = googleApiActivity;
    }

    @Override // com.google.android.gms.common.internal.zaj
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, 2);
        }
    }
}
