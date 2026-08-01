package com.google.android.gms.ads.internal.offline.buffering;

import J0.n;
import J0.q;
import W2.b;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.InterfaceC3251ge;
import q2.C4880f;
import q2.C4896n;
import q2.C4900p;
import s2.C4971a;

/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3251ge f23558u;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C4896n c4896n = C4900p.f40199g.f40201b;
        BinderC3464kd binderC3464kd = new BinderC3464kd();
        c4896n.getClass();
        this.f23558u = (InterfaceC3251ge) new C4880f(c4896n, context, binderC3464kd).d(context, false);
    }

    @Override // androidx.work.Worker
    public final q doWork() {
        try {
            this.f23558u.W1(new b(getApplicationContext()), new C4971a(getInputData().b("uri"), getInputData().b("gws_query_id"), getInputData().b("image_url")));
            return q.a();
        } catch (RemoteException unused) {
            return new n();
        }
    }
}
