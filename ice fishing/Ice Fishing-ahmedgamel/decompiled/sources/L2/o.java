package L2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.internal.consent_sdk.C4352o;
import java.util.List;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f1663a;

    /* renamed from: b, reason: collision with root package name */
    public int f1664b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1665c;

    public /* synthetic */ o(int i, int i6, C4352o c4352o) {
        this.f1663a = i;
        this.f1664b = i6;
        this.f1665c = c4352o;
    }

    public synchronized int a() {
        PackageInfo packageInfo;
        if (this.f1663a == 0) {
            try {
                packageInfo = V2.c.a((Context) this.f1665c).c(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e9) {
                Log.w("Metadata", "Failed to find package ".concat(e9.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f1663a = packageInfo.versionCode;
            }
        }
        return this.f1663a;
    }

    public synchronized int b() {
        int i = this.f1664b;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.f1665c;
        PackageManager packageManager = context.getPackageManager();
        if (V2.c.a(context).f3273u.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i6 = 1;
        if (!T2.b.f()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f1664b = i6;
                return i6;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i6 = 2;
            this.f1664b = i6;
            return i6;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == T2.b.f()) {
            i6 = 2;
        }
        this.f1664b = i6;
        return i6;
    }

    public o(Context context) {
        this.f1664b = 0;
        this.f1665c = context;
    }

    public o(byte[] bArr, int i, int i6) {
        this.f1665c = bArr;
        this.f1663a = i;
        this.f1664b = i6;
    }

    public o() {
        this.f1665c = new o[256];
        this.f1663a = 0;
        this.f1664b = 0;
    }

    public o(int i, int i6) {
        this.f1665c = null;
        this.f1663a = i;
        int i9 = i6 & 7;
        this.f1664b = i9 == 0 ? 8 : i9;
    }
}
