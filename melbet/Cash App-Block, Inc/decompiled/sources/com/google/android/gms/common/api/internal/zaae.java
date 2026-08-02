package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes4.dex */
public final class zaae extends zabb {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaae(zaag zaagVar, zaag zaagVar2) {
        super(zaagVar2);
        this.zaa = zaagVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void zaa() {
        switch (this.$r8$classId) {
            case 0:
                ((zaag) this.zaa).zah(1);
                break;
            default:
                ((BaseGmsClient.ConnectionProgressReportCallbacks) this.zaa).onReportServiceBinding(new ConnectionResult(16, null, null));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaae(zaal zaalVar, zaba zabaVar, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabaVar);
        this.zaa = connectionProgressReportCallbacks;
    }
}
