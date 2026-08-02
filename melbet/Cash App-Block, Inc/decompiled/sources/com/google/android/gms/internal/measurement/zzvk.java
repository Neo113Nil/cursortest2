package com.google.android.gms.internal.measurement;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.fillr.e0;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AsyncCallable;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public final class zzvk extends AbstractFuture {
    public e0 zza;
    public final int zzb;

    public zzvk(e0 e0Var, int i) {
        this.zza = e0Var;
        this.zzb = i;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        e0 e0Var = this.zza;
        this.zza = null;
        if (e0Var == null) {
            return;
        }
        AtomicReference atomicReference = (AtomicReference) e0Var.c;
        do {
            atomicLong = (AtomicLong) e0Var.b;
            j = atomicLong.get();
            i = (int) j;
            long j2 = j >>> 32;
            if (i == Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 13);
                sb.append("Refcount is: ");
                sb.append(j);
                throw new AssertionError(sb.toString());
            }
            i2 = (int) j2;
            z = i == -2147483647;
            if (z) {
                i2++;
            }
        } while (!atomicLong.compareAndSet(j, (i2 << 32) | (BodyPartID.bodyIdMax & (i - 1))));
        if (z) {
            while (true) {
                zzvl zzvlVar = (zzvl) atomicReference.get();
                if (zzvlVar != null) {
                    if (zzvlVar.zza <= this.zzb) {
                        zzvlVar.cancel(true);
                        while (!atomicReference.compareAndSet(zzvlVar, null)) {
                            if (atomicReference.get() != zzvlVar) {
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String pendingToString() {
        AsyncCallable asyncCallable;
        e0 e0Var = this.zza;
        if (e0Var == null || (asyncCallable = (AsyncCallable) ((zzpn) e0Var.a).zza) == null) {
            return null;
        }
        String obj = asyncCallable.toString();
        String m = Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(obj.length() + 11), "callable=[", obj, "]");
        zzvl zzvlVar = (zzvl) ((AtomicReference) this.zza.c).get();
        if (zzvlVar == null) {
            return m;
        }
        int length = m.length();
        String abstractFuture = zzvlVar.toString();
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(abstractFuture.length() + length + 9 + 1), m, ", trial=[", abstractFuture, "]");
    }
}
