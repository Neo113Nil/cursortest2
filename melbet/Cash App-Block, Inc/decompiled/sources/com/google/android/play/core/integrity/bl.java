package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.c;
import com.google.android.play.integrity.internal.g;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class bl extends br {
    public final /* synthetic */ q b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TaskCompletionSource e;
    public final /* synthetic */ bs f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bs bsVar, TaskCompletionSource taskCompletionSource, q qVar, long j, long j2, TaskCompletionSource taskCompletionSource2) {
        super(bsVar, taskCompletionSource);
        this.b = qVar;
        this.c = j;
        this.d = j2;
        this.e = taskCompletionSource2;
        Objects.requireNonNull(bsVar);
        this.f = bsVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        q qVar = this.b;
        TaskCompletionSource taskCompletionSource = this.e;
        bs bsVar = this.f;
        if (bs.m(bsVar)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        if (bs.l(bsVar)) {
            a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            com.google.android.play.integrity.internal.i iVar = (com.google.android.play.integrity.internal.i) bsVar.a.o;
            Bundle a = bs.a(bsVar, qVar, this.c, this.d);
            bp bpVar = new bp(bsVar, taskCompletionSource, 0);
            g gVar = (g) iVar;
            gVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(gVar.zab);
            int i = c.$r8$clinit;
            obtain.writeInt(1);
            a.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(bpVar);
            gVar.b(obtain, 3);
        } catch (RemoteException e) {
            bsVar.b.c(e, "requestExpressIntegrityToken(%s, %s, %s)", qVar.a, qVar.b, Long.valueOf(this.c));
            taskCompletionSource.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
