package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Wd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC2859Wd implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29159n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2875Xd f29160u;

    public /* synthetic */ DialogInterfaceOnClickListenerC2859Wd(C2875Xd c2875Xd, int i) {
        this.f29159n = i;
        this.f29160u = c2875Xd;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f29159n) {
            case 0:
                C2875Xd c2875Xd = this.f29160u;
                c2875Xd.getClass();
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", c2875Xd.f29313y);
                data.putExtra("eventLocation", c2875Xd.f29310C);
                data.putExtra("description", c2875Xd.f29309B);
                long j6 = c2875Xd.f29314z;
                if (j6 > -1) {
                    data.putExtra("beginTime", j6);
                }
                long j9 = c2875Xd.f29308A;
                if (j9 > -1) {
                    data.putExtra("endTime", j9);
                }
                data.setFlags(268435456);
                w2.D d9 = C4906k.f40186C.f40191c;
                w2.D.s(c2875Xd.f29312x, data);
                break;
            default:
                this.f29160u.x("Operation denied by user.");
                break;
        }
    }
}
