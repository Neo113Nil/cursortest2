package N2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import l3.InterfaceC4673a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC4673a, l3.g {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ d f1920u = new d(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ d f1921v = new d(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d f1922w = new d(2);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1923n;

    public /* synthetic */ d(int i) {
        this.f1923n = i;
    }

    @Override // l3.g
    public l3.m a(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = b.f1910h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? com.bumptech.glide.d.r(bundle) : com.bumptech.glide.d.r(null);
    }

    @Override // l3.InterfaceC4673a
    public Object g(l3.m mVar) {
        switch (this.f1923n) {
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
