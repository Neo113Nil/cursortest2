package N3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import f3.AbstractC4518a;
import h.C4543G;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class z extends e3.g {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ HashMap f2031A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ A f2032B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f2033u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f2034v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IBinder f2035w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2036x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f2037y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C4543G f2038z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a9, String str, String str2, IBinder iBinder, int i, int i4, C4543G c4543g, HashMap hashMap) {
        super("com.google.android.play.core.hsdp.protocol.IHpoaServiceListener", 1);
        this.f2033u = str;
        this.f2034v = str2;
        this.f2035w = iBinder;
        this.f2036x = i;
        this.f2037y = i4;
        this.f2038z = c4543g;
        this.f2031A = hashMap;
        Objects.requireNonNull(a9);
        this.f2032B = a9;
    }

    @Override // e3.g
    public final boolean e0(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC4518a.a(parcel);
        AbstractC4518a.b(parcel);
        int i4 = bundle.getInt("statusCode", 9270);
        if (i4 == 9281) {
            Log.i("HpoaClientImpl", "onStateChange: HPOA_SERVICE_NO_OP");
            return true;
        }
        String str = this.f2034v;
        String str2 = this.f2033u;
        final A a9 = this.f2032B;
        if (i4 == 9282) {
            Activity activity = a9.f1957b;
            String packageName = activity.getPackageName();
            HashMap hashMap = this.f2031A;
            Intent x9 = Q3.b.x(str2, str, packageName, hashMap);
            x9.addFlags(536870912);
            if (activity.getPackageManager().resolveActivity(x9, com.anythink.basead.exoplayer.b.aX) != null) {
                activity.startActivityForResult(x9, 0);
                return true;
            }
            activity.startActivity(Q3.b.v(str2, str, hashMap));
            return true;
        }
        C4543G c4543g = this.f2038z;
        switch (i4) {
            case 9271:
                Log.i("HpoaClientImpl", "HPOA session started");
                v vVar = a9.f1956a;
                if (vVar == null) {
                    Log.e("HpoaClientImpl", "HPOA service is not available");
                    return true;
                }
                final Bundle bundle2 = new Bundle();
                bundle2.putString(com.anythink.expressad.videocommon.e.b.f23194u, str2);
                bundle2.putString("callerId", str);
                bundle2.putBinder("windowToken", this.f2035w);
                bundle2.putInt("clientWindowWidthPx", this.f2036x);
                bundle2.putInt("clientWindowHeightPx", this.f2037y);
                final int i6 = 0;
                vVar.a(new Runnable() { // from class: N3.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bundle bundle3 = bundle2;
                        A a10 = a9;
                        switch (i6) {
                            case 0:
                                try {
                                    v vVar2 = a10.f1956a;
                                    if (vVar2 == null) {
                                        throw null;
                                    }
                                    M3.d dVar = (M3.d) vVar2.f2023k;
                                    if (dVar == null) {
                                        return;
                                    }
                                    M3.b bVar = (M3.b) dVar;
                                    Parcel t02 = bVar.t0();
                                    int i9 = AbstractC4518a.f37439a;
                                    t02.writeInt(1);
                                    bundle3.writeToParcel(t02, 0);
                                    bVar.D0(t02, 2);
                                    return;
                                } catch (RemoteException e9) {
                                    Log.e("HpoaClientImpl", "Failed to call hpoaService.show", e9);
                                    return;
                                }
                            default:
                                try {
                                    v vVar3 = a10.f1956a;
                                    if (vVar3 == null) {
                                        throw null;
                                    }
                                    M3.d dVar2 = (M3.d) vVar3.f2023k;
                                    if (dVar2 == null) {
                                        return;
                                    }
                                    M3.b bVar2 = (M3.b) dVar2;
                                    Parcel t03 = bVar2.t0();
                                    int i10 = AbstractC4518a.f37439a;
                                    t03.writeInt(1);
                                    bundle3.writeToParcel(t03, 0);
                                    bVar2.D0(t03, 3);
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
                v vVar2 = a9.f1956a;
                if (vVar2 != null) {
                    vVar2.c(new q(vVar2, 0));
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
                v vVar3 = a9.f1956a;
                if (vVar3 == null) {
                    Log.e("HpoaClientImpl", "HPOA service is not available");
                    return true;
                }
                final Bundle bundle3 = new Bundle();
                bundle3.putString(com.anythink.expressad.videocommon.e.b.f23194u, str2);
                bundle3.putString("callerId", str);
                final int i9 = 1;
                vVar3.a(new Runnable() { // from class: N3.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bundle bundle32 = bundle3;
                        A a10 = a9;
                        switch (i9) {
                            case 0:
                                try {
                                    v vVar22 = a10.f1956a;
                                    if (vVar22 == null) {
                                        throw null;
                                    }
                                    M3.d dVar = (M3.d) vVar22.f2023k;
                                    if (dVar == null) {
                                        return;
                                    }
                                    M3.b bVar = (M3.b) dVar;
                                    Parcel t02 = bVar.t0();
                                    int i92 = AbstractC4518a.f37439a;
                                    t02.writeInt(1);
                                    bundle32.writeToParcel(t02, 0);
                                    bVar.D0(t02, 2);
                                    return;
                                } catch (RemoteException e9) {
                                    Log.e("HpoaClientImpl", "Failed to call hpoaService.show", e9);
                                    return;
                                }
                            default:
                                try {
                                    v vVar32 = a10.f1956a;
                                    if (vVar32 == null) {
                                        throw null;
                                    }
                                    M3.d dVar2 = (M3.d) vVar32.f2023k;
                                    if (dVar2 == null) {
                                        return;
                                    }
                                    M3.b bVar2 = (M3.b) dVar2;
                                    Parcel t03 = bVar2.t0();
                                    int i10 = AbstractC4518a.f37439a;
                                    t03.writeInt(1);
                                    bundle32.writeToParcel(t03, 0);
                                    bVar2.D0(t03, 3);
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
                Log.e("HpoaClientImpl", "HPOA error: " + i4);
                Bundle bundle4 = new Bundle();
                if (i4 == 9278) {
                    bundle4.putString("errorMessage", "HPOA internal error");
                } else if (i4 == 9279) {
                    bundle4.putString("errorMessage", "HPOA authentication error");
                } else if (i4 == 9280) {
                    bundle4.putString("errorMessage", "HPOA invalid parameter");
                } else {
                    bundle4.putString("errorMessage", "HPOA unknown error");
                }
                c4543g.K(bundle4);
                v vVar4 = a9.f1956a;
                if (vVar4 != null) {
                    vVar4.c(new q(vVar4, 0));
                    return true;
                }
                return true;
        }
    }
}
