package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult$StatusListener;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zay implements PendingResult$StatusListener {
    public final /* synthetic */ BasePendingResult zaa;
    public final /* synthetic */ zaaa zab;

    public zay(zaaa zaaaVar, BasePendingResult basePendingResult) {
        this.zaa = basePendingResult;
        Objects.requireNonNull(zaaaVar);
        this.zab = zaaaVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult$StatusListener
    public final void onComplete(Status status) {
        this.zab.zaa.remove(this.zaa);
    }
}
