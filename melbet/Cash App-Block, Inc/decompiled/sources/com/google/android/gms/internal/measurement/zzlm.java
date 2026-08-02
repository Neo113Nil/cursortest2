package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractCatchingFuture;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class zzlm implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzlm(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        int i = this.$r8$classId;
        Object obj = this.zza;
        switch (i) {
            case 0:
                Object obj2 = zzlk.zzb;
                return new zzru((ArrayList) obj);
            default:
                zzrf zzrfVar = (zzrf) obj;
                MoreExecutors$ScheduledListeningDecorator moreExecutors$ScheduledListeningDecorator = (MoreExecutors$ScheduledListeningDecorator) zzrfVar.zze.get();
                moreExecutors$ScheduledListeningDecorator.getClass();
                zzmn zzmnVar = (zzmn) zzrfVar.zzd.get();
                zzmnVar.getClass();
                AbstractTransformFuture.TransformFuture transform = Futures.transform(AbstractCatchingFuture.create(FluentFuture.from(zzmnVar.zzd()), zzmk.class, zzqp.zza$1, moreExecutors$ScheduledListeningDecorator), new zzow(zzrfVar, 2), moreExecutors$ScheduledListeningDecorator);
                transform.addListener(new zzpv(transform, 4), moreExecutors$ScheduledListeningDecorator);
                return transform;
        }
    }
}
