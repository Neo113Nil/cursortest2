package androidx.media3.session;

import defpackage.alp;
import defpackage.e8l;
import defpackage.f8l;
import defpackage.i8l;
import defpackage.ikh;
import defpackage.kde;
import defpackage.kkh;
import defpackage.leu;
import defpackage.loh;
import defpackage.mzb;
import defpackage.ump;

/* loaded from: classes.dex */
public final class h implements ikh, f8l {
    public final MediaSessionService a;
    public final mzb b;
    public final /* synthetic */ MediaNotificationManager c;

    public h(mzb mzbVar, MediaNotificationManager mediaNotificationManager, MediaSessionService mediaSessionService) {
        this.c = mediaNotificationManager;
        this.a = mediaSessionService;
        this.b = mzbVar;
    }

    @Override // defpackage.f8l
    public final void N(i8l i8lVar, e8l e8lVar) {
        if (e8lVar.a.a(4, 5, 14, 0)) {
            this.a.h(this.b, false);
        }
    }

    @Override // defpackage.ikh
    public final void d() {
        this.a.h(this.b, false);
    }

    @Override // defpackage.ikh
    public final void f() {
        this.a.h(this.b, false);
    }

    @Override // defpackage.ikh
    public final void g(kkh kkhVar) {
        MediaSessionService mediaSessionService = this.a;
        mzb mzbVar = this.b;
        if (mediaSessionService.e(mzbVar)) {
            mediaSessionService.i(mzbVar);
        }
        mediaSessionService.h(mzbVar, false);
    }

    @Override // defpackage.ikh
    public final kde i(alp alpVar) {
        int i;
        if (alpVar.b.equals("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY")) {
            loh lohVar = (loh) this.c.g.get(this.b);
            if (lohVar != null) {
                lohVar.b = true;
            }
            i = 0;
        } else {
            i = -6;
        }
        return leu.S(new ump(i));
    }
}
