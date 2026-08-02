package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.af;
import com.google.android.play.integrity.internal.c;
import com.google.android.play.integrity.internal.l;
import com.google.android.play.integrity.internal.n;
import com.google.android.play.integrity.internal.t;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class an extends t {
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ Long b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ IntegrityTokenRequest d;
    public final /* synthetic */ ar e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(ar arVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.a = bArr;
        this.b = l;
        this.c = taskCompletionSource2;
        this.d = integrityTokenRequest;
        Objects.requireNonNull(arVar);
        this.e = arVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void a(Exception exc) {
        if (exc instanceof af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        TaskCompletionSource taskCompletionSource = this.c;
        ar arVar = this.e;
        try {
            n nVar = (n) arVar.a.o;
            Bundle a = ar.a(arVar, this.a, this.b);
            aq aqVar = new aq(arVar, taskCompletionSource);
            l lVar = (l) nVar;
            lVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(lVar.zab);
            int i = c.$r8$clinit;
            obtain.writeInt(1);
            a.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aqVar);
            lVar.b(obtain, 2);
        } catch (RemoteException e) {
            arVar.b.c(e, "requestIntegrityToken(%s)", this.d);
            taskCompletionSource.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
