package p6;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f5543d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f5544a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5545b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5546c;

    public b0(String str, boolean z10) {
        u.c(str);
        this.f5544a = str;
        u.c("com.google.android.gms");
        this.f5545b = "com.google.android.gms";
        this.f5546c = z10;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f5544a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f5546c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f5543d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.f5545b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return u.j(this.f5544a, b0Var.f5544a) && u.j(this.f5545b, b0Var.f5545b) && u.j(null, null) && this.f5546c == b0Var.f5546c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5544a, this.f5545b, null, 4225, Boolean.valueOf(this.f5546c)});
    }

    public final String toString() {
        String str = this.f5544a;
        if (str != null) {
            return str;
        }
        u.g(null);
        throw null;
    }
}
