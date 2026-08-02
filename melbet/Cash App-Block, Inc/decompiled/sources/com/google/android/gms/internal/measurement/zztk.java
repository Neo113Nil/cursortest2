package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Callables$$ExternalSyntheticLambda0;
import com.google.common.util.concurrent.CombinedFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final /* synthetic */ class zztk implements AsyncFunction {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ zzqa zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ ArrayList zzc;

    public /* synthetic */ zztk(zzqa zzqaVar, int i, ArrayList arrayList) {
        this.zza = zzqaVar;
        this.zzb = i;
        this.zzc = arrayList;
    }

    @Override // com.google.common.util.concurrent.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.zzb;
        ArrayList arrayList = this.zzc;
        zzqa zzqaVar = this.zza;
        switch (i) {
            case 0:
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    if (((Boolean) Futures.getDone((Future) arrayList.get(i3))).booleanValue()) {
                        ((List) zzqaVar.zza).get(i3).getClass();
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    }
                }
                ImmutableList copyOf = ImmutableList.copyOf((Iterable) arrayList2);
                Callables$$ExternalSyntheticLambda0 callables$$ExternalSyntheticLambda0 = new Callables$$ExternalSyntheticLambda0();
                CombinedFuture combinedFuture = new CombinedFuture(copyOf, true);
                combinedFuture.task = new CombinedFuture.CallableInterruptibleTask(combinedFuture, callables$$ExternalSyntheticLambda0);
                combinedFuture.init();
                return combinedFuture;
            default:
                ImmutableList copyOf2 = ImmutableList.copyOf((Iterable) arrayList);
                zzz zzb = zzxa.zzb(new zzv(zzqaVar, (zzacb) obj, i2, arrayList));
                Executor executor = (Executor) zzqaVar.zzb;
                CombinedFuture combinedFuture2 = new CombinedFuture(copyOf2, false);
                combinedFuture2.task = new CombinedFuture.CallableInterruptibleTask(combinedFuture2, zzb, executor);
                combinedFuture2.init();
                return combinedFuture2;
        }
    }

    public /* synthetic */ zztk(zzqa zzqaVar, ArrayList arrayList, int i) {
        this.zza = zzqaVar;
        this.zzc = arrayList;
        this.zzb = i;
    }
}
