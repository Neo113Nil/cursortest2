package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes11.dex */
public final class sz81 extends BasePendingResult {
    public final Status H;

    public sz81(Status status) {
        super(null);
        this.H = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final uyj0 f(Status status) {
        return this.H;
    }
}
