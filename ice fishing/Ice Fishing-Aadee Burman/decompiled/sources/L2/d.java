package L2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import j3.InterfaceC4604a;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC4604a, j3.g {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ d f1631u = new d(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ d f1632v = new d(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d f1633w = new d(2);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1634n;

    public /* synthetic */ d(int i) {
        this.f1634n = i;
    }

    @Override // j3.g
    public j3.m a(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = b.f1621h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? S0.f.i(bundle) : S0.f.i(null);
    }

    @Override // j3.InterfaceC4604a
    public Object h(j3.m mVar) {
        switch (this.f1634n) {
            case 0:
                if (mVar.i()) {
                    return (Bundle) mVar.g();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(mVar.f())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", mVar.f());
            default:
                Intent intent = (Intent) ((Bundle) mVar.g()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }
}
