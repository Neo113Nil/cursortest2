package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.lifecycle.ViewModelKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzg implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzl zza;

    public /* synthetic */ zzg(zzl zzlVar, int i) {
        this.$r8$classId = i;
        this.zza = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        zzl zzlVar = this.zza;
        switch (i) {
            case 0:
                JobKt.launch$default(ViewModelKt.getCoroutineScope(zzlVar.getLifecycle()), null, null, new BlockRunner$cancel$1(zzlVar, (Continuation) null, 19), 3);
                break;
            default:
                zzlVar.zzi(true);
                break;
        }
    }
}
