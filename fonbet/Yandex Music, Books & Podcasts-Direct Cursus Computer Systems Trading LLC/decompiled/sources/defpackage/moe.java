package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.t;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class moe extends twi {
    public static final Parcelable.Creator<moe> CREATOR = new a5c(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ytg
    public final String j() {
        return "instagram_login";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ytg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(atg atgVar) {
        Object obj;
        Intent intent;
        moe moeVar = this;
        String h = ctg.h();
        t l = moeVar.i().c.l();
        String str = atgVar.d;
        Set set = atgVar.b;
        boolean d = atgVar.d();
        int i = atgVar.c;
        String h2 = moeVar.h(atgVar.e);
        String str2 = atgVar.h;
        String str3 = atgVar.j;
        boolean z = atgVar.k;
        boolean z2 = atgVar.m;
        boolean z3 = atgVar.n;
        ArrayList arrayList = xwi.a;
        Intent intent2 = null;
        if (!bp6.a.contains(xwi.class)) {
            try {
                l.getClass();
                str.getClass();
                set.getClass();
                h.getClass();
            } catch (Throwable th) {
                th = th;
                obj = xwi.class;
            }
            try {
                if (i == 0) {
                    throw null;
                }
                str2.getClass();
                intent2 = xwi.m(l, xwi.d.c(new wwi(2), str, set, h, d, i, h2, str2, false, str3, z, 2, z2, z3, ""));
            } catch (Throwable th2) {
                th = th2;
                obj = moeVar;
                bp6.a(obj, th);
                intent = intent2;
                a("e2e", h);
                int b = vz1.b(1);
                if (intent != null) {
                }
                return 0;
            }
        }
        intent = intent2;
        a("e2e", h);
        int b2 = vz1.b(1);
        if (intent != null) {
            try {
                i().c.startActivityForResult(intent, b2);
                return 1;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // defpackage.twi
    public final ra p() {
        return ra.INSTAGRAM_APPLICATION_WEB;
    }
}
