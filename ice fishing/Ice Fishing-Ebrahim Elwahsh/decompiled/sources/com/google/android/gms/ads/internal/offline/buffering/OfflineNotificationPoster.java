package com.google.android.gms.ads.internal.offline.buffering;

import J0.n;
import J0.q;
import V2.b;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.InterfaceC3101de;
import q2.C4887f;
import q2.C4903n;
import q2.C4907p;
import r2.C4957a;

/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3101de f23711u;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C4903n c4903n = C4907p.f40108g.f40110b;
        BinderC3317hd binderC3317hd = new BinderC3317hd();
        c4903n.getClass();
        this.f23711u = (InterfaceC3101de) new C4887f(c4903n, context, binderC3317hd).d(context, false);
    }

    @Override // androidx.work.Worker
    public final q doWork() {
        try {
            this.f23711u.h3(new b(getApplicationContext()), new C4957a(getInputData().b("uri"), getInputData().b("gws_query_id"), getInputData().b("image_url")));
            return q.a();
        } catch (RemoteException unused) {
            return new n();
        }
    }
}
