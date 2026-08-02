package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* loaded from: classes4.dex */
public final class zai extends zaj {
    public final /* synthetic */ Intent zaa;
    public final /* synthetic */ LifecycleFragment zab;

    public zai(Intent intent, LifecycleFragment lifecycleFragment) {
        this.zaa = intent;
        this.zab = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zaj
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, 2);
        }
    }
}
