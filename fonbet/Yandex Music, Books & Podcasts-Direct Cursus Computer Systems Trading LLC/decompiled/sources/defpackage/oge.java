package defpackage;

import com.google.android.play.core.install.zza;

/* loaded from: classes6.dex */
public final /* synthetic */ class oge {
    public final /* synthetic */ tge a;

    public /* synthetic */ oge(tge tgeVar) {
        this.a = tgeVar;
    }

    public final void a(zza zzaVar) {
        ssg.a(4, null, "Install state updated " + zzaVar, null);
        int i = zzaVar.a;
        int i2 = zzaVar.d;
        tge tgeVar = this.a;
        if (i == 10) {
            ssg.a(4, null, "Install status = REQUIRES_UI_INTENT", null);
        } else if (i != 11) {
            switch (i) {
                case 0:
                    ssg.a(4, null, "Install status = UNKNOWN", null);
                    break;
                case 1:
                    ssg.a(4, null, "Install status = PENDING", null);
                    break;
                case 2:
                    ssg.a(4, null, hrg.m(zzaVar.c, " total bytes to download.", tlm.l(zzaVar.b, "Install status = DOWNLOADING. Downloaded ", " bytes of = ")), null);
                    break;
                case 3:
                    ssg.a(4, null, "Install status = INSTALLING", null);
                    break;
                case 4:
                    ssg.a(4, null, "Install status = INSTALLED", null);
                    break;
                case 5:
                    v3w.k("Install status = FAILED. Error code = ", i2, 4, null, null);
                    break;
                case 6:
                    ssg.a(4, null, "Install status = CANCELED", null);
                    break;
            }
        } else {
            ssg.a(4, null, "Install status = DOWNLOADED", null);
            xdr xdrVar = tgeVar.c;
            pge pgeVar = pge.d;
            xdrVar.getClass();
            xdrVar.m(null, pgeVar);
        }
        if (i2 != 0) {
            v3w.k("Update flow failed. Error code ", i2, 6, null, null);
            tgeVar.a();
        }
    }
}
