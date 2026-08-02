package N3;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f2004a = 1;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0323a f2005b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2006c;

    public o(String str, InterfaceC0323a interfaceC0323a) {
        this.f2006c = str;
        this.f2005b = interfaceC0323a;
    }

    public final boolean a(int i) {
        int i4 = this.f2004a;
        String str = this.f2006c;
        if (i4 == i) {
            Log.w("HsdpOverlay", "targetPackage: " + str + " status was already set to " + i);
            return false;
        }
        if (i4 == 4) {
            Log.w("HsdpOverlay", "targetPackage: " + str + " status was destroyed so cannot be updated");
            return false;
        }
        if (Log.isLoggable("HsdpOverlay", 4)) {
            Log.i("HsdpOverlay", "targetPackage: " + str + " status: " + this.f2004a + "->" + i);
        }
        if (i == 2) {
            Bundle bundle = new Bundle();
            bundle.putString("targetPackage", str);
            this.f2005b.O(bundle);
        } else if (i == 3) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("targetPackage", str);
            this.f2005b.W(bundle2);
        } else if (i != 4) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("targetPackage", str);
            bundle3.putBoolean("dldpRedirect", true);
            this.f2005b.W(bundle3);
        } else if (this.f2004a == 2) {
            Bundle bundle4 = new Bundle();
            bundle4.putString("targetPackage", str);
            bundle4.putString("errorMessage", "HSDP overlay destroyed");
            this.f2005b.W(bundle4);
        }
        this.f2004a = i;
        return true;
    }

    public final String toString() {
        int i = this.f2004a;
        String valueOf = String.valueOf(this.f2005b);
        StringBuilder sb = new StringBuilder("HsdpOverlay{'");
        sb.append(this.f2006c);
        sb.append("': ");
        sb.append(i);
        sb.append(", ");
        return Wv.i(sb, valueOf, "}");
    }
}
