package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.Function;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzfn implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzfn(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // com.google.common.base.Function
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.zza;
        switch (i) {
            case 0:
                return (Unit) ((zzfm) obj2).invoke(obj);
            default:
                String str = ((zzjt) obj2).zzf;
                if (str != null) {
                    return str;
                }
                a$$ExternalSyntheticBUOutline0.m$1("Signature not generated.");
                return null;
        }
    }
}
