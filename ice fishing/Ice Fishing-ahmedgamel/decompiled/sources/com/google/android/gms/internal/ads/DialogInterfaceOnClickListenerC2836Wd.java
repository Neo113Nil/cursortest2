package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Wd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC2836Wd implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28360n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2852Xd f28361u;

    public /* synthetic */ DialogInterfaceOnClickListenerC2836Wd(C2852Xd c2852Xd, int i) {
        this.f28360n = i;
        this.f28361u = c2852Xd;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f28360n) {
            case 0:
                C2852Xd c2852Xd = this.f28361u;
                c2852Xd.getClass();
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", c2852Xd.f28541y);
                data.putExtra("eventLocation", c2852Xd.f28538C);
                data.putExtra("description", c2852Xd.f28537B);
                long j6 = c2852Xd.f28542z;
                if (j6 > -1) {
                    data.putExtra("beginTime", j6);
                }
                long j9 = c2852Xd.f28536A;
                if (j9 > -1) {
                    data.putExtra("endTime", j9);
                }
                data.setFlags(268435456);
                u2.D d2 = C4835j.f39733C.f39738c;
                u2.D.s(c2852Xd.f28540x, data);
                break;
            default:
                this.f28361u.y("Operation denied by user.");
                break;
        }
    }
}
