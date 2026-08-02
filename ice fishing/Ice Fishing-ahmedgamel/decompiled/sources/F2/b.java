package F2;

import android.net.Uri;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC2991bG;
import java.util.Map;
import kotlin.jvm.internal.h;
import s2.InterfaceC4942l0;
import x2.i;
import y0.InterfaceC5198c;
import y0.InterfaceC5199d;

/* loaded from: classes.dex */
public final class b implements InterfaceC5199d {

    /* renamed from: v, reason: collision with root package name */
    public static b f976v;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f977n;

    /* renamed from: u, reason: collision with root package name */
    public String f978u;

    public b(int i) {
        this.f977n = i;
        switch (i) {
            case 1:
                this.f978u = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat("PhoneskyVerificationUtils");
                break;
            case 4:
                break;
            default:
                this.f978u = (String) AbstractC2991bG.f30042C.r();
                break;
        }
    }

    public String a(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.f978u).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    @Override // y0.InterfaceC5199d
    public String b() {
        return this.f978u;
    }

    public void c(String str) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", this.f978u + " : " + str);
        }
    }

    public String toString() {
        switch (this.f977n) {
            case 2:
                return this.f978u;
            case 3:
                return this.f978u;
            default:
                return super.toString();
        }
    }

    public b(InterfaceC4942l0 interfaceC4942l0) {
        String str;
        this.f977n = 3;
        try {
            str = interfaceC4942l0.d();
        } catch (RemoteException e9) {
            i.d("", e9);
            str = null;
        }
        this.f978u = str;
    }

    public b(String query, int i) {
        this.f977n = i;
        switch (i) {
            case 5:
                h.e(query, "query");
                this.f978u = query;
                break;
            default:
                this.f978u = query;
                break;
        }
    }

    @Override // y0.InterfaceC5199d
    public void i(InterfaceC5198c interfaceC5198c) {
    }
}
