package com.onesignal.common.threading;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37103n;

    public /* synthetic */ a(int i) {
        this.f37103n = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37103n) {
            case 0:
                b.prewarm$lambda$1();
                break;
            default:
                int i = AlarmManagerSchedulerBroadcastReceiver.f24331a;
                break;
        }
    }
}
