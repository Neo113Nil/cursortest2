package N3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import f3.AbstractC4518a;
import r2.C4900e;

/* renamed from: N3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC0325c extends e3.g {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f1959u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4900e f1960v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0325c(g gVar, C4900e c4900e) {
        super("com.google.android.play.core.hsdp.protocol.IHsdpServicePrewarmListener", 1);
        this.f1960v = c4900e;
        this.f1959u = gVar;
    }

    @Override // e3.g
    public final boolean e0(Parcel parcel, int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            AbstractC4518a.b(parcel);
            v vVar = this.f1959u.f1972b;
            vVar.getClass();
            vVar.c(new q(vVar, 0));
            return true;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC4518a.a(parcel);
        AbstractC4518a.b(parcel);
        int i4 = bundle.getInt("hsdpPrewarmStatusCode", 1);
        if (!bundle.containsKey("hsdpPrewarmStatusCode")) {
            Log.w("HsdpClientImpl", "HsdpServicePrewarmListener.onStateChange: cannot find status code");
        }
        if (Log.isLoggable("HsdpClientImpl", 3)) {
            Log.d("HsdpClientImpl", "HsdpServicePrewarmListener.onStateChange: " + i4);
        }
        String string = bundle.getString("errorMessage", "");
        if (i4 != 2) {
            t2.e eVar = (t2.e) this.f1960v.f40152n;
            if (i4 != 6) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("errorCode", i4);
                bundle2.putString("errorMessage", string);
                if (eVar != null) {
                    try {
                        eVar.K(bundle2);
                    } catch (RemoteException e9) {
                        x2.i.d("RemoteException in HsdpPrewarmListener.onError", e9);
                    }
                }
            } else {
                Bundle bundle3 = new Bundle();
                if (eVar != null) {
                    try {
                        eVar.w2(bundle3);
                    } catch (RemoteException e10) {
                        x2.i.d("RemoteException in HsdpPrewarmListener.onCompleted", e10);
                    }
                }
            }
        }
        return true;
    }
}
