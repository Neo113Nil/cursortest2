package p0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;

/* renamed from: p0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1028y {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f8421d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f8422a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8423b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8424c;

    public C1028y(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f8422a = str;
        if (TextUtils.isEmpty("com.google.android.gms")) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f8423b = "com.google.android.gms";
        this.f8424c = z2;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f8422a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f8424c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f8421d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e2) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e2.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.f8423b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1028y)) {
            return false;
        }
        C1028y c1028y = (C1028y) obj;
        return AbstractC1021r.e(this.f8422a, c1028y.f8422a) && AbstractC1021r.e(this.f8423b, c1028y.f8423b) && AbstractC1021r.e(null, null) && this.f8424c == c1028y.f8424c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8422a, this.f8423b, null, 4225, Boolean.valueOf(this.f8424c)});
    }

    public final String toString() {
        String str = this.f8422a;
        if (str != null) {
            return str;
        }
        AbstractC1021r.c(null);
        throw null;
    }
}
