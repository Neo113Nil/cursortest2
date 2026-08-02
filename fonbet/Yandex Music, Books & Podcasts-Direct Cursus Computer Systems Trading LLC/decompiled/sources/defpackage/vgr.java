package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
public final class vgr extends BasePendingResult {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vgr(tmd tmdVar, int i) {
        super(tmdVar);
        this.o = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ a8o c(Status status) {
        switch (this.o) {
            case 0:
                return status;
            default:
                return new i3x(status, 0);
        }
    }
}
