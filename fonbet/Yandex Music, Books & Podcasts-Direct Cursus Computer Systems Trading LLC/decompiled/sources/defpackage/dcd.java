package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class dcd extends ytg {
    public static final Parcelable.Creator<dcd> CREATOR = new a5c(12);
    public ccd c;

    @Override // defpackage.ytg
    public final void d() {
        ccd ccdVar = this.c;
        if (ccdVar != null) {
            ccdVar.d = false;
            ccdVar.c = null;
            this.c = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ytg
    public final String j() {
        return "get_token";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[Catch: all -> 0x0075, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0012, B:17:0x001b, B:23:0x0044, B:27:0x004e, B:34:0x003b, B:31:0x002b), top: B:3:0x0012, inners: #1 }] */
    @Override // defpackage.ytg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(atg atgVar) {
        int i;
        boolean z;
        ccd ccdVar = new ccd(i().c.l(), atgVar);
        this.c = ccdVar;
        synchronized (ccdVar) {
            if (!ccdVar.d) {
                int i2 = ccdVar.i;
                ArrayList arrayList = xwi.a;
                if (!bp6.a.contains(xwi.class)) {
                    try {
                        i = xwi.d.g(xwi.a, new int[]{i2}).b;
                    } catch (Throwable th) {
                        bp6.a(xwi.class, th);
                    }
                    if (i == -1) {
                        Intent d = xwi.d(ccdVar.a);
                        if (d == null) {
                            z = false;
                        } else {
                            ccdVar.d = true;
                            ccdVar.a.bindService(d, ccdVar, 1);
                            z = true;
                        }
                    }
                }
                i = 0;
                if (i == -1) {
                }
            }
            z = false;
        }
        if (!z) {
            return 0;
        }
        qzc qzcVar = i().e;
        if (qzcVar != null) {
            ((View) qzcVar.b).setVisibility(0);
        }
        this.c.c = new xiu(this, atgVar, false, 28);
        return 1;
    }

    public final void o(atg atgVar, Bundle bundle) {
        btg b;
        ja e;
        String str;
        String string;
        j02 j02Var;
        ctg i = i();
        try {
            e = ytg.e(bundle, atgVar.d);
            str = atgVar.o;
            string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
        } catch (c3c e2) {
            b = btg.b(i.g, null, e2.getMessage(), null);
        }
        if (string != null && string.length() != 0 && str != null && str.length() != 0) {
            try {
                j02Var = new j02(string, str);
                b = new btg(atgVar, 1, e, j02Var, null, null);
                i.f(b);
            } catch (Exception e3) {
                throw new c3c(e3.getMessage());
            }
        }
        j02Var = null;
        b = new btg(atgVar, 1, e, j02Var, null, null);
        i.f(b);
    }
}
