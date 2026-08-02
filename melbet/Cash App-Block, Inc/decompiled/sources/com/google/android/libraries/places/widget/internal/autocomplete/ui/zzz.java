package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.content.DialogInterface;
import androidx.core.os.CancellationSignal;
import com.google.android.gms.internal.time.zzbq;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzz implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzz(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.$r8$classId;
        Object obj = this.zza;
        switch (i) {
            case 0:
                ((BaseAutocompleteImplFragment) obj).zzu = false;
                break;
            default:
                CancellationSignal cancellationSignal = (CancellationSignal) ((zzbq) obj).zza;
                cancellationSignal.mIsCanceled = false;
                cancellationSignal.mCancelInProgress = false;
                break;
        }
    }
}
