package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.common.util.concurrent.AbstractTransformFuture;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzii implements OnTokenCanceledListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AbstractTransformFuture.AsyncTransformFuture zza;

    public /* synthetic */ zzii(AbstractTransformFuture.AsyncTransformFuture asyncTransformFuture, int i) {
        this.$r8$classId = i;
        this.zza = asyncTransformFuture;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final /* synthetic */ void onCanceled() {
        int i = this.$r8$classId;
        AbstractTransformFuture.AsyncTransformFuture asyncTransformFuture = this.zza;
        switch (i) {
            case 0:
                asyncTransformFuture.cancel(true);
                break;
            case 1:
                asyncTransformFuture.cancel(true);
                break;
            case 2:
                asyncTransformFuture.cancel(true);
                break;
            default:
                asyncTransformFuture.cancel(true);
                break;
        }
    }
}
