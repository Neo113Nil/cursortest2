package com.google.android.gms.internal.measurement;

import androidx.collection.SimpleArrayMap;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.ImmutableSet;

/* loaded from: classes4.dex */
public abstract class zzwl {
    public static final zzwj zza = new zzwj();
    public final zzwl zzb;
    public final SimpleArrayMap zzc;
    public boolean zzd = false;

    public /* synthetic */ zzwl(zzwl zzwlVar, SimpleArrayMap simpleArrayMap) {
        if (zzwlVar != null) {
            Trace.checkArgument(zzwlVar.zzd);
        }
        this.zzb = zzwlVar;
        this.zzc = simpleArrayMap;
    }

    public static zzwl zza(zzwl zzwlVar, zzwl zzwlVar2) {
        zzwlVar.getClass();
        zzwl zzwlVar3 = zzwk.zza;
        if (zzwlVar == zzwlVar3) {
            return zzwlVar2;
        }
        zzwlVar2.getClass();
        if (zzwlVar2 == zzwlVar3) {
            return zzwlVar;
        }
        ImmutableSet<zzwl> of = ImmutableSet.of((Object) zzwlVar, (Object) zzwlVar2);
        if (of.isEmpty()) {
            return zzwlVar3;
        }
        if (of.size() == 1) {
            return (zzwl) of.iterator().next();
        }
        int i = 0;
        for (zzwl zzwlVar4 : of) {
            do {
                i += zzwlVar4.zzc.size;
                zzwlVar4 = zzwlVar4.zzb;
            } while (zzwlVar4 != null);
        }
        if (i == 0) {
            return zzwk.zza;
        }
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap(i);
        for (zzwl zzwlVar5 : of) {
            do {
                int i2 = 0;
                while (true) {
                    SimpleArrayMap simpleArrayMap2 = zzwlVar5.zzc;
                    if (i2 >= simpleArrayMap2.size) {
                        break;
                    }
                    Trace.checkArgument("Duplicate bindings: %s", simpleArrayMap2.keyAt(i2), simpleArrayMap.put((zzwj) simpleArrayMap2.keyAt(i2), simpleArrayMap2.valueAt(i2)) == null);
                    i2++;
                }
                zzwlVar5 = zzwlVar5.zzb;
            } while (zzwlVar5 != null);
        }
        return new zzwk(null, simpleArrayMap).zzb();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (zzwl zzwlVar = this; zzwlVar != null; zzwlVar = zzwlVar.zzb) {
            for (int i = 0; i < zzwlVar.zzc.size; i++) {
                sb.append("[");
                sb.append(this.zzc.valueAt(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }

    public final zzwl zzb() {
        if (this.zzd) {
            a$$ExternalSyntheticBUOutline0.m$1("Already frozen");
            return null;
        }
        this.zzd = true;
        zzwl zzwlVar = this.zzb;
        return (zzwlVar == null || !this.zzc.isEmpty()) ? this : zzwlVar;
    }

    public final boolean zzd() {
        if (this.zzc.containsKey(zza)) {
            return true;
        }
        zzwl zzwlVar = this.zzb;
        return zzwlVar != null && zzwlVar.zzd();
    }
}
