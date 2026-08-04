package com.gamericefishpro.space.r3;

import android.app.Notification;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k {
    public final /* synthetic */ int e;
    public Object f;

    public g(int i) {
        this.e = i;
        switch (i) {
            case 1:
                this.f = new ArrayList();
                break;
        }
    }

    @Override // com.gamericefishpro.space.r3.k
    public final void a(com.gamericefishpro.space.u6.n nVar) {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) nVar.e).setBigContentTitle(this.b).bigText((CharSequence) this.f);
                if (this.d) {
                    bigTextStyleBigText.setSummaryText(this.c);
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) nVar.e).setBigContentTitle(this.b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.c);
                }
                ArrayList arrayList = (ArrayList) this.f;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                break;
        }
    }

    @Override // com.gamericefishpro.space.r3.k
    public final String b() {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
