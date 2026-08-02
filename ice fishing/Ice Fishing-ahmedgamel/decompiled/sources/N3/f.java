package N3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import f3.AbstractC4518a;

/* loaded from: classes2.dex */
public final class f extends e3.g implements M3.h {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f1969u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f1970v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super("com.google.android.play.core.hsdp.protocol.IHsdpServiceListener", 1);
        this.f1970v = gVar;
        this.f1969u = gVar;
    }

    @Override // e3.g
    public final boolean e0(Parcel parcel, int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            AbstractC4518a.b(parcel);
            v vVar = this.f1969u.f1972b;
            vVar.getClass();
            vVar.c(new q(vVar, 0));
            return true;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC4518a.a(parcel);
        AbstractC4518a.b(parcel);
        int i4 = bundle.getInt("hsdpStatusCode", 1);
        if (!bundle.containsKey("hsdpStatusCode")) {
            Log.w("HsdpClientImpl", "HsdpServiceListener.onStateChange: cannot find status code");
        }
        final String string = bundle.getString("targetPackage", "");
        if (Log.isLoggable("HsdpClientImpl", 4)) {
            Log.i("HsdpClientImpl", "HsdpServiceListener.onStateChange: " + i4 + " for target package: " + string);
        }
        if (string.isEmpty()) {
            Log.e("HsdpClientImpl", "HsdpServiceListener.onStateChange: cannot find target package");
            return true;
        }
        g gVar = this.f1970v;
        switch (i4) {
            case 1:
                g.b(gVar, string, 4, new d(i4, 0, this, bundle.getString("errorMessage", "HSDP service unknown status"), string));
                break;
            case 2:
                break;
            case 3:
                g.b(gVar, string, 2, null);
                break;
            case 4:
                g.b(gVar, string, 3, null);
                break;
            case 5:
                final int i6 = 0;
                g.b(gVar, string, 4, new Runnable(this) { // from class: N3.e

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ f f1967u;

                    {
                        this.f1967u = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                this.f1967u.f1970v.f1973c.remove(string);
                                break;
                            default:
                                this.f1967u.f1970v.f1973c.remove(string);
                                break;
                        }
                    }
                });
                break;
            case 6:
                g.b(gVar, string, 4, new d(i4, 0, this, bundle.getString("errorMessage", "HSDP service error"), string));
                break;
            case 7:
                final int i9 = 1;
                g.b(gVar, string, 5, new Runnable(this) { // from class: N3.e

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ f f1967u;

                    {
                        this.f1967u = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                this.f1967u.f1970v.f1973c.remove(string);
                                break;
                            default:
                                this.f1967u.f1970v.f1973c.remove(string);
                                break;
                        }
                    }
                });
                break;
            case 8:
                g.b(gVar, string, 4, new d(i4, 0, this, bundle.getString("errorMessage", "HSDP service cancelled"), string));
                break;
            default:
                Log.w("HsdpClientImpl", "Ignoring HSDP service unsupported status code: " + i4 + " for target package: " + string);
                break;
        }
        return true;
    }
}
