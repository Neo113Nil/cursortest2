package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class y9f extends twi {
    public static final Parcelable.Creator<y9f> CREATOR = new a5c(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ytg
    public final String j() {
        return "katana_proxy_auth";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    @Override // defpackage.ytg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(atg atgVar) {
        ArrayList arrayList;
        boolean z = j3c.l && ox6.F() != null && hrg.c(atgVar.a);
        String h = ctg.h();
        i().c.l();
        String str = atgVar.d;
        Set set = atgVar.b;
        boolean d = atgVar.d();
        int i = atgVar.c;
        String h2 = h(atgVar.e);
        String str2 = atgVar.h;
        String str3 = atgVar.j;
        boolean z2 = atgVar.k;
        boolean z3 = atgVar.m;
        boolean z4 = atgVar.n;
        String str4 = atgVar.o;
        ArrayList arrayList2 = xwi.a;
        if (!bp6.a.contains(xwi.class)) {
            try {
                str.getClass();
                set.getClass();
                h.getClass();
            } catch (Throwable th) {
                bp6.a(xwi.class, th);
            }
            if (i == 0) {
                throw null;
            }
            str2.getClass();
            ArrayList arrayList3 = xwi.a;
            arrayList = new ArrayList();
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                boolean z5 = z3;
                boolean z6 = z2;
                boolean z7 = z4;
                String str5 = str3;
                Intent c = xwi.d.c((wwi) it.next(), str, set, h, d, i, h2, str2, z, str5, z6, 1, z5, z7, str4);
                if (c != null) {
                    arrayList.add(c);
                }
                str3 = str5;
                z2 = z6;
                z3 = z5;
                z4 = z7;
            }
            a("e2e", h);
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Intent intent = (Intent) arrayList.get(i2);
                    int b = vz1.b(1);
                    if (intent != null) {
                        try {
                            i().c.startActivityForResult(intent, b);
                            return i2 + 1;
                        } catch (Exception unused) {
                            continue;
                        }
                    }
                }
            }
            return 0;
        }
        arrayList = null;
        a("e2e", h);
        if (arrayList != null) {
        }
        return 0;
    }
}
