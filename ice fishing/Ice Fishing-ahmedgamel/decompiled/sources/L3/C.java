package L3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import d3.AbstractC4446a;
import g1.C4522b;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class C extends c3.g {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ HashMap f1669A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ D f1670B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f1671u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f1672v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IBinder f1673w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1674x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f1675y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C4522b f1676z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d2, String str, String str2, IBinder iBinder, int i, int i6, C4522b c4522b, HashMap hashMap) {
        super("com.google.android.play.core.hsdp.protocol.IHpoaServiceListener", 1);
        this.f1671u = str;
        this.f1672v = str2;
        this.f1673w = iBinder;
        this.f1674x = i;
        this.f1675y = i6;
        this.f1676z = c4522b;
        this.f1669A = hashMap;
        Objects.requireNonNull(d2);
        this.f1670B = d2;
    }

    @Override // c3.g
    public final boolean e0(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC4446a.a(parcel);
        AbstractC4446a.b(parcel);
        int i6 = bundle.getInt("statusCode", 9270);
        if (i6 == 9281) {
            Log.i("HpoaClientImpl", "onStateChange: HPOA_SERVICE_NO_OP");
            return true;
        }
        String str = this.f1672v;
        String str2 = this.f1671u;
        final D d2 = this.f1670B;
        if (i6 == 9282) {
            Activity activity = d2.f1678b;
            String packageName = activity.getPackageName();
            HashMap hashMap = this.f1669A;
            Intent L6 = t8.g.L(str2, str, packageName, hashMap);
            L6.addFlags(536870912);
            if (activity.getPackageManager().resolveActivity(L6, com.anythink.basead.exoplayer.b.aX) != null) {
                activity.startActivityForResult(L6, 0);
                return true;
            }
            activity.startActivity(t8.g.I(str2, str, hashMap));
            return true;
        }
        C4522b c4522b = this.f1676z;
        switch (i6) {
            case 9271:
                Log.i("HpoaClientImpl", "HPOA session started");
                y yVar = d2.f1677a;
                if (yVar == null) {
                    Log.e("HpoaClientImpl", "HPOA service is not available");
                    return true;
                }
                final Bundle bundle2 = new Bundle();
                bundle2.putString(com.anythink.expressad.videocommon.e.b.f22407u, str2);
                bundle2.putString("callerId", str);
                bundle2.putBinder("windowToken", this.f1673w);
                bundle2.putInt("clientWindowWidthPx", this.f1674x);
                bundle2.putInt("clientWindowHeightPx", this.f1675y);
                final int i9 = 0;
                yVar.a(new Runnable() { // from class: L3.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bundle bundle3 = bundle2;
                        D d9 = d2;
                        switch (i9) {
                            case 0:
                                try {
                                    y yVar2 = d9.f1677a;
                                    if (yVar2 == null) {
                                        throw null;
                                    }
                                    K3.d dVar = (K3.d) yVar2.f1751k;
                                    if (dVar == null) {
                                        return;
                                    }
                                    K3.b bVar = (K3.b) dVar;
                                    Parcel w02 = bVar.w0();
                                    int i10 = AbstractC4446a.f37037a;
                                    w02.writeInt(1);
                                    bundle3.writeToParcel(w02, 0);
                                    bVar.F0(w02, 2);
                                    return;
                                } catch (RemoteException e9) {
                                    Log.e("HpoaClientImpl", "Failed to call hpoaService.show", e9);
                                    return;
                                }
                            default:
                                try {
                                    y yVar3 = d9.f1677a;
                                    if (yVar3 == null) {
                                        throw null;
                                    }
                                    K3.d dVar2 = (K3.d) yVar3.f1751k;
                                    if (dVar2 == null) {
                                        return;
                                    }
                                    K3.b bVar2 = (K3.b) dVar2;
                                    Parcel w03 = bVar2.w0();
                                    int i11 = AbstractC4446a.f37037a;
                                    w03.writeInt(1);
                                    bundle3.writeToParcel(w03, 0);
                                    bVar2.F0(w03, 3);
                                    return;
                                } catch (RemoteException e10) {
                                    Log.e("HpoaClientImpl", "Failed to call hpoaService.endSession", e10);
                                    return;
                                }
                        }
                    }
                });
                return true;
            case 9272:
                Log.i("HpoaClientImpl", "HPOA session ended");
                y yVar2 = d2.f1677a;
                if (yVar2 != null) {
                    yVar2.c(new t(yVar2, 0));
                }
                return true;
            case 9273:
                Log.i("HpoaClientImpl", "HPOA UI to be added");
                return true;
            case 9274:
                Log.i("HpoaClientImpl", "HPOA UI attached");
                return true;
            case 9275:
                Log.i("HpoaClientImpl", "HPOA UI to be removed");
                return true;
            case 9276:
                Log.i("HpoaClientImpl", "HPOA UI detached");
                return true;
            case 9277:
                Log.i("HpoaClientImpl", "HPOA service requests to be disconnected");
                y yVar3 = d2.f1677a;
                if (yVar3 == null) {
                    Log.e("HpoaClientImpl", "HPOA service is not available");
                    return true;
                }
                final Bundle bundle3 = new Bundle();
                bundle3.putString(com.anythink.expressad.videocommon.e.b.f22407u, str2);
                bundle3.putString("callerId", str);
                final int i10 = 1;
                yVar3.a(new Runnable() { // from class: L3.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bundle bundle32 = bundle3;
                        D d9 = d2;
                        switch (i10) {
                            case 0:
                                try {
                                    y yVar22 = d9.f1677a;
                                    if (yVar22 == null) {
                                        throw null;
                                    }
                                    K3.d dVar = (K3.d) yVar22.f1751k;
                                    if (dVar == null) {
                                        return;
                                    }
                                    K3.b bVar = (K3.b) dVar;
                                    Parcel w02 = bVar.w0();
                                    int i102 = AbstractC4446a.f37037a;
                                    w02.writeInt(1);
                                    bundle32.writeToParcel(w02, 0);
                                    bVar.F0(w02, 2);
                                    return;
                                } catch (RemoteException e9) {
                                    Log.e("HpoaClientImpl", "Failed to call hpoaService.show", e9);
                                    return;
                                }
                            default:
                                try {
                                    y yVar32 = d9.f1677a;
                                    if (yVar32 == null) {
                                        throw null;
                                    }
                                    K3.d dVar2 = (K3.d) yVar32.f1751k;
                                    if (dVar2 == null) {
                                        return;
                                    }
                                    K3.b bVar2 = (K3.b) dVar2;
                                    Parcel w03 = bVar2.w0();
                                    int i11 = AbstractC4446a.f37037a;
                                    w03.writeInt(1);
                                    bundle32.writeToParcel(w03, 0);
                                    bVar2.F0(w03, 3);
                                    return;
                                } catch (RemoteException e10) {
                                    Log.e("HpoaClientImpl", "Failed to call hpoaService.endSession", e10);
                                    return;
                                }
                        }
                    }
                });
                return true;
            default:
                Log.e("HpoaClientImpl", "HPOA error: " + i6);
                Bundle bundle4 = new Bundle();
                if (i6 == 9278) {
                    bundle4.putString("errorMessage", "HPOA internal error");
                } else if (i6 == 9279) {
                    bundle4.putString("errorMessage", "HPOA authentication error");
                } else if (i6 == 9280) {
                    bundle4.putString("errorMessage", "HPOA invalid parameter");
                } else {
                    bundle4.putString("errorMessage", "HPOA unknown error");
                }
                c4522b.L(bundle4);
                y yVar4 = d2.f1677a;
                if (yVar4 != null) {
                    yVar4.c(new t(yVar4, 0));
                    return true;
                }
                return true;
        }
    }
}
