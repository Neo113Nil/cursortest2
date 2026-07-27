package L3;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f1731a = 1;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0315a f1732b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1733c;

    public r(String str, InterfaceC0315a interfaceC0315a) {
        this.f1733c = str;
        this.f1732b = interfaceC0315a;
    }

    public final boolean a(int i) {
        int i6 = this.f1731a;
        String str = this.f1733c;
        if (i6 == i) {
            Log.w("HsdpOverlay", "targetPackage: " + str + " status was already set to " + i);
            return false;
        }
        if (i6 == 4) {
            Log.w("HsdpOverlay", "targetPackage: " + str + " status was destroyed so cannot be updated");
            return false;
        }
        if (Log.isLoggable("HsdpOverlay", 4)) {
            Log.i("HsdpOverlay", "targetPackage: " + str + " status: " + this.f1731a + "->" + i);
        }
        if (i == 2) {
            Bundle bundle = new Bundle();
            bundle.putString("targetPackage", str);
            this.f1732b.O(bundle);
        } else if (i == 3) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("targetPackage", str);
            this.f1732b.W(bundle2);
        } else if (i != 4) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("targetPackage", str);
            bundle3.putBoolean("dldpRedirect", true);
            this.f1732b.W(bundle3);
        } else if (this.f1731a == 2) {
            Bundle bundle4 = new Bundle();
            bundle4.putString("targetPackage", str);
            bundle4.putString("errorMessage", "HSDP overlay destroyed");
            this.f1732b.W(bundle4);
        }
        this.f1731a = i;
        return true;
    }

    public final String toString() {
        int i = this.f1731a;
        String valueOf = String.valueOf(this.f1732b);
        StringBuilder sb = new StringBuilder("HsdpOverlay{'");
        sb.append(this.f1733c);
        sb.append("': ");
        sb.append(i);
        sb.append(", ");
        return u1.h.g(sb, valueOf, "}");
    }
}
