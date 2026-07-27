package L3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import d3.AbstractC4446a;
import l.C4648e;

/* renamed from: L3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC0317c extends c3.g {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f1680u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4648e f1681v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0317c(g gVar, C4648e c4648e) {
        super("com.google.android.play.core.hsdp.protocol.IHsdpServicePrewarmListener", 1);
        this.f1681v = c4648e;
        this.f1680u = gVar;
    }

    @Override // c3.g
    public final boolean e0(Parcel parcel, int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            AbstractC4446a.b(parcel);
            y yVar = this.f1680u.f1693b;
            yVar.getClass();
            yVar.c(new t(yVar, 0));
            return true;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC4446a.a(parcel);
        AbstractC4446a.b(parcel);
        int i6 = bundle.getInt("hsdpPrewarmStatusCode", 1);
        if (!bundle.containsKey("hsdpPrewarmStatusCode")) {
            Log.w("HsdpClientImpl", "HsdpServicePrewarmListener.onStateChange: cannot find status code");
        }
        if (Log.isLoggable("HsdpClientImpl", 3)) {
            Log.d("HsdpClientImpl", "HsdpServicePrewarmListener.onStateChange: " + i6);
        }
        String string = bundle.getString("errorMessage", "");
        if (i6 != 2) {
            r2.e eVar = (r2.e) this.f1681v.f38761u;
            if (i6 != 6) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("errorCode", i6);
                bundle2.putString("errorMessage", string);
                if (eVar != null) {
                    try {
                        eVar.L(bundle2);
                    } catch (RemoteException e9) {
                        v2.i.d("RemoteException in HsdpPrewarmListener.onError", e9);
                    }
                }
            } else {
                Bundle bundle3 = new Bundle();
                if (eVar != null) {
                    try {
                        eVar.A2(bundle3);
                    } catch (RemoteException e10) {
                        v2.i.d("RemoteException in HsdpPrewarmListener.onCompleted", e10);
                    }
                }
            }
        }
        return true;
    }
}
