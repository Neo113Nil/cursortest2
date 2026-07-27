package L3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import d3.AbstractC4446a;

/* renamed from: L3.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC0320f extends c3.g implements K3.h {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f1690u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f1691v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0320f(g gVar) {
        super("com.google.android.play.core.hsdp.protocol.IHsdpServiceListener", 1);
        this.f1691v = gVar;
        this.f1690u = gVar;
    }

    @Override // c3.g
    public final boolean e0(Parcel parcel, int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            AbstractC4446a.b(parcel);
            y yVar = this.f1690u.f1693b;
            yVar.getClass();
            yVar.c(new t(yVar, 0));
            return true;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC4446a.a(parcel);
        AbstractC4446a.b(parcel);
        int i6 = bundle.getInt("hsdpStatusCode", 1);
        if (!bundle.containsKey("hsdpStatusCode")) {
            Log.w("HsdpClientImpl", "HsdpServiceListener.onStateChange: cannot find status code");
        }
        final String string = bundle.getString("targetPackage", "");
        if (Log.isLoggable("HsdpClientImpl", 4)) {
            Log.i("HsdpClientImpl", "HsdpServiceListener.onStateChange: " + i6 + " for target package: " + string);
        }
        if (string.isEmpty()) {
            Log.e("HsdpClientImpl", "HsdpServiceListener.onStateChange: cannot find target package");
            return true;
        }
        g gVar = this.f1691v;
        switch (i6) {
            case 1:
                g.b(gVar, string, 4, new RunnableC0318d(i6, 0, this, bundle.getString("errorMessage", "HSDP service unknown status"), string));
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
                final int i9 = 0;
                g.b(gVar, string, 4, new Runnable(this) { // from class: L3.e

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ BinderC0320f f1688u;

                    {
                        this.f1688u = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                this.f1688u.f1691v.f1694c.remove(string);
                                break;
                            default:
                                this.f1688u.f1691v.f1694c.remove(string);
                                break;
                        }
                    }
                });
                break;
            case 6:
                g.b(gVar, string, 4, new RunnableC0318d(i6, 0, this, bundle.getString("errorMessage", "HSDP service error"), string));
                break;
            case 7:
                final int i10 = 1;
                g.b(gVar, string, 5, new Runnable(this) { // from class: L3.e

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ BinderC0320f f1688u;

                    {
                        this.f1688u = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f1688u.f1691v.f1694c.remove(string);
                                break;
                            default:
                                this.f1688u.f1691v.f1694c.remove(string);
                                break;
                        }
                    }
                });
                break;
            case 8:
                g.b(gVar, string, 4, new RunnableC0318d(i6, 0, this, bundle.getString("errorMessage", "HSDP service cancelled"), string));
                break;
            default:
                Log.w("HsdpClientImpl", "Ignoring HSDP service unsupported status code: " + i6 + " for target package: " + string);
                break;
        }
        return true;
    }
}
