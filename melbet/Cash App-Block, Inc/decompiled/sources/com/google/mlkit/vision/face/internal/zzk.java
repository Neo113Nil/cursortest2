package com.google.mlkit.vision.face.internal;

import com.google.android.gms.internal.measurement.zzlj;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;

/* loaded from: classes.dex */
public final /* synthetic */ class zzk implements ComponentFactory {
    public static final /* synthetic */ zzk zza = new zzk(0);
    public static final /* synthetic */ zzk zza$1 = new zzk(1);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzk(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(zzlj zzljVar) {
        switch (this.$r8$classId) {
            case 0:
                return new zze((MlKitContext) zzljVar.get(MlKitContext.class));
            default:
                return new zzc((zze) zzljVar.get(zze.class), (ExecutorSelector) zzljVar.get(ExecutorSelector.class));
        }
    }
}
