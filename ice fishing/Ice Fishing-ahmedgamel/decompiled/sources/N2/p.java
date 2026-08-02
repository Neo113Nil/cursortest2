package N2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.internal.consent_sdk.C4375o;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f1953a;

    /* renamed from: b, reason: collision with root package name */
    public int f1954b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1955c;

    public /* synthetic */ p(int i, int i4, C4375o c4375o) {
        this.f1953a = i;
        this.f1954b = i4;
        this.f1955c = c4375o;
    }

    public synchronized int a() {
        PackageInfo packageInfo;
        if (this.f1953a == 0) {
            try {
                packageInfo = X2.b.a((Context) this.f1955c).g(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e9) {
                Log.w("Metadata", "Failed to find package ".concat(e9.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f1953a = packageInfo.versionCode;
            }
        }
        return this.f1953a;
    }

    public synchronized int b() {
        int i = this.f1954b;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.f1955c;
        PackageManager packageManager = context.getPackageManager();
        if (X2.b.a(context).f60u.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i4 = 1;
        if (!V2.b.f()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f1954b = i4;
                return i4;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i4 = 2;
            this.f1954b = i4;
            return i4;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == V2.b.f()) {
            i4 = 2;
        }
        this.f1954b = i4;
        return i4;
    }

    public p(Context context) {
        this.f1954b = 0;
        this.f1955c = context;
    }

    public p(byte[] bArr, int i, int i4) {
        this.f1955c = bArr;
        this.f1953a = i;
        this.f1954b = i4;
    }

    public p() {
        this.f1955c = new p[256];
        this.f1953a = 0;
        this.f1954b = 0;
    }

    public p(int i, int i4) {
        this.f1955c = null;
        this.f1953a = i;
        int i6 = i4 & 7;
        this.f1954b = i6 == 0 ? 8 : i6;
    }
}
