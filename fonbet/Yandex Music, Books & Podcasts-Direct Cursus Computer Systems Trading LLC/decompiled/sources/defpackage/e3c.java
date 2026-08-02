package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.t;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class e3c extends twi {
    public static final Parcelable.Creator<e3c> CREATOR = new vn7(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ytg
    public final String j() {
        return "fb_lite_login";
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ytg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(atg atgVar) {
        Object obj;
        int i;
        Intent intent;
        e3c e3cVar = this;
        String h = ctg.h();
        t l = e3cVar.i().c.l();
        String str = atgVar.d;
        Set set = atgVar.b;
        boolean d = atgVar.d();
        int i2 = atgVar.c;
        String h2 = e3cVar.h(atgVar.e);
        String str2 = atgVar.h;
        String str3 = atgVar.j;
        boolean z = atgVar.k;
        boolean z2 = atgVar.m;
        boolean z3 = atgVar.n;
        ArrayList arrayList = xwi.a;
        Intent intent2 = null;
        if (bp6.a.contains(xwi.class)) {
            i = 1;
        } else {
            try {
                l.getClass();
                str.getClass();
                set.getClass();
                h.getClass();
                try {
                    if (i2 == 0) {
                        throw null;
                    }
                    str2.getClass();
                    i = 1;
                    intent2 = xwi.m(l, xwi.d.c(new wwi(1), str, set, h, d, i2, h2, str2, false, str3, z, 1, z2, z3, ""));
                } catch (Throwable th) {
                    th = th;
                    obj = e3cVar;
                    bp6.a(obj, th);
                    intent = intent2;
                    a("e2e", h);
                    int b = vz1.b(i);
                    if (intent != null) {
                    }
                    return 0;
                }
            } catch (Throwable th2) {
                th = th2;
                obj = xwi.class;
                i = 1;
            }
        }
        intent = intent2;
        a("e2e", h);
        int b2 = vz1.b(i);
        if (intent != null) {
            try {
                i().c.startActivityForResult(intent, b2);
                return i;
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
