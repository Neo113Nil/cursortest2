package com.google.android.gms.common.api.internal;

import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.zzae;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zabl {
    public final ApiKey zaa;
    public final Feature zab;

    public /* synthetic */ zabl(ApiKey apiKey, Feature feature) {
        this.zaa = apiKey;
        this.zab = feature;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zabl)) {
            return false;
        }
        zabl zablVar = (zabl) obj;
        return zzae.equal(this.zaa, zablVar.zaa) && zzae.equal(this.zab, zablVar.zab);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zaa, this.zab});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(this.zaa, "key");
        workLauncherImpl.add(this.zab, "feature");
        return workLauncherImpl.toString();
    }

    public final /* synthetic */ ApiKey zaa() {
        return this.zaa;
    }

    public final /* synthetic */ Feature zab() {
        return this.zab;
    }
}
