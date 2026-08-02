package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.zzae;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class zacn {
    public Object zaa;
    public Serializable zaa$1;
    public boolean zab;
    public int zac;

    public static zacn builder() {
        zacn zacnVar = new zacn();
        zacnVar.zab = true;
        zacnVar.zac = 0;
        return zacnVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    public zacn build() {
        zzae.checkArgument("execute parameter required", ((RemoteCall) this.zaa) != null);
        ?? r1 = (Feature[]) this.zaa$1;
        boolean z = this.zab;
        int i = this.zac;
        zacn zacnVar = new zacn();
        zacnVar.zaa = this;
        zacnVar.zaa$1 = r1;
        boolean z2 = false;
        if (r1 != 0 && z) {
            z2 = true;
        }
        zacnVar.zab = z2;
        zacnVar.zac = i;
        return zacnVar;
    }
}
