package K2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.internal.consent_sdk.C4365o;
import java.util.List;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f1608a;

    /* renamed from: b, reason: collision with root package name */
    public int f1609b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1610c;

    public /* synthetic */ o(int i, int i4, C4365o c4365o) {
        this.f1608a = i;
        this.f1609b = i4;
        this.f1610c = c4365o;
    }

    public synchronized int a() {
        PackageInfo packageInfo;
        if (this.f1608a == 0) {
            try {
                packageInfo = U2.c.a((Context) this.f1610c).e(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e6) {
                Log.w("Metadata", "Failed to find package ".concat(e6.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f1608a = packageInfo.versionCode;
            }
        }
        return this.f1608a;
    }

    public synchronized int b() {
        int i = this.f1609b;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.f1610c;
        PackageManager packageManager = context.getPackageManager();
        if (U2.c.a(context).f3280n.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i4 = 1;
        if (!S2.b.f()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f1609b = i4;
                return i4;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i4 = 2;
            this.f1609b = i4;
            return i4;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == S2.b.f()) {
            i4 = 2;
        }
        this.f1609b = i4;
        return i4;
    }

    public o(Context context) {
        this.f1609b = 0;
        this.f1610c = context;
    }

    public o(byte[] bArr, int i, int i4) {
        this.f1610c = bArr;
        this.f1608a = i;
        this.f1609b = i4;
    }

    public o() {
        this.f1610c = new o[256];
        this.f1608a = 0;
        this.f1609b = 0;
    }

    public o(int i, int i4) {
        this.f1610c = null;
        this.f1608a = i;
        int i9 = i4 & 7;
        this.f1609b = i9 == 0 ? 8 : i9;
    }
}
