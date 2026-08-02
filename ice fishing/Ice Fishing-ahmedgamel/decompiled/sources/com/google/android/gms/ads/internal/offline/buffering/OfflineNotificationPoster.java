package com.google.android.gms.ads.internal.offline.buffering;

import J0.m;
import J0.p;
import Y2.b;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.InterfaceC3274ge;
import s2.C4929f;
import s2.C4945n;
import s2.C4949p;
import u2.C5067a;

/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3274ge f24338u;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C4945n c4945n = C4949p.f40498g.f40500b;
        BinderC3487kd binderC3487kd = new BinderC3487kd();
        c4945n.getClass();
        this.f24338u = (InterfaceC3274ge) new C4929f(c4945n, context, binderC3487kd).d(context, false);
    }

    @Override // androidx.work.Worker
    public final p doWork() {
        try {
            this.f24338u.J0(new b(getApplicationContext()), new C5067a(getInputData().b("uri"), getInputData().b("gws_query_id"), getInputData().b("image_url")));
            return p.a();
        } catch (RemoteException unused) {
            return new m();
        }
    }
}
