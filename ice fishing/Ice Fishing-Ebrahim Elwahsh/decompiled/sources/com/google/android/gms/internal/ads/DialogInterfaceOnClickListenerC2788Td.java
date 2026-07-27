package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;

/* renamed from: com.google.android.gms.internal.ads.Td, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC2788Td implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27790n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2805Ud f27791u;

    public /* synthetic */ DialogInterfaceOnClickListenerC2788Td(C2805Ud c2805Ud, int i) {
        this.f27790n = i;
        this.f27791u = c2805Ud;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f27790n) {
            case 0:
                C2805Ud c2805Ud = this.f27791u;
                c2805Ud.getClass();
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", c2805Ud.f28050y);
                data.putExtra("eventLocation", c2805Ud.f28047C);
                data.putExtra("description", c2805Ud.f28046B);
                long j9 = c2805Ud.f28051z;
                if (j9 > -1) {
                    data.putExtra("beginTime", j9);
                }
                long j10 = c2805Ud.f28045A;
                if (j10 > -1) {
                    data.putExtra("endTime", j10);
                }
                data.setFlags(268435456);
                t2.G g9 = p2.j.f39798C.f39803c;
                t2.G.s(c2805Ud.f28049x, data);
                break;
            default:
                this.f27791u.t("Operation denied by user.");
                break;
        }
    }
}
