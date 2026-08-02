package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d2x extends erh {
    public static final msg c = new msg("MediaRouterCallback", null);
    public final p1x b;

    public d2x(p1x p1xVar) {
        y1g.G(p1xVar);
        this.b = p1xVar;
    }

    @Override // defpackage.erh
    public final void onRouteAdded(krh krhVar, irh irhVar) {
        try {
            p1x p1xVar = this.b;
            String str = irhVar.c;
            Bundle bundle = irhVar.s;
            Parcel M0 = p1xVar.M0();
            M0.writeString(str);
            y4x.c(M0, bundle);
            p1xVar.O0(M0, 1);
        } catch (RemoteException e) {
            c.a(e, "Unable to call %s on %s.", "onRouteAdded", p1x.class.getSimpleName());
        }
    }

    @Override // defpackage.erh
    public final void onRouteChanged(krh krhVar, irh irhVar) {
        if (irhVar.g()) {
            try {
                p1x p1xVar = this.b;
                String str = irhVar.c;
                Bundle bundle = irhVar.s;
                Parcel M0 = p1xVar.M0();
                M0.writeString(str);
                y4x.c(M0, bundle);
                p1xVar.O0(M0, 2);
            } catch (RemoteException e) {
                c.a(e, "Unable to call %s on %s.", "onRouteChanged", p1x.class.getSimpleName());
            }
        }
    }

    @Override // defpackage.erh
    public final void onRouteRemoved(krh krhVar, irh irhVar) {
        try {
            p1x p1xVar = this.b;
            String str = irhVar.c;
            Bundle bundle = irhVar.s;
            Parcel M0 = p1xVar.M0();
            M0.writeString(str);
            y4x.c(M0, bundle);
            p1xVar.O0(M0, 3);
        } catch (RemoteException e) {
            c.a(e, "Unable to call %s on %s.", "onRouteRemoved", p1x.class.getSimpleName());
        }
    }

    @Override // defpackage.erh
    public final void onRouteSelected(krh krhVar, irh irhVar, int i) {
        String str;
        CastDevice e;
        CastDevice e2;
        p1x p1xVar = this.b;
        Object[] objArr = {Integer.valueOf(i), irhVar.c};
        msg msgVar = c;
        Log.i(msgVar.a, msgVar.d("onRouteSelected with reason = %d, routeId = %s", objArr));
        if (irhVar.l != 1) {
            return;
        }
        try {
            String str2 = irhVar.c;
            if (str2 != null && str2.endsWith("-groupRoute") && (e = CastDevice.e(irhVar.s)) != null) {
                String d = e.d();
                krhVar.getClass();
                Iterator it = krh.f().iterator();
                while (it.hasNext()) {
                    irh irhVar2 = (irh) it.next();
                    str = irhVar2.c;
                    if (str != null && !str.endsWith("-groupRoute") && (e2 = CastDevice.e(irhVar2.s)) != null && TextUtils.equals(e2.d(), d)) {
                        msgVar.b("routeId is changed from %s to %s", str2, str);
                        break;
                    }
                }
            }
            str = str2;
            Parcel N0 = p1xVar.N0(p1xVar.M0(), 7);
            int readInt = N0.readInt();
            N0.recycle();
            Bundle bundle = irhVar.s;
            if (readInt < 220400000) {
                Parcel M0 = p1xVar.M0();
                M0.writeString(str);
                y4x.c(M0, bundle);
                p1xVar.O0(M0, 4);
                return;
            }
            Parcel M02 = p1xVar.M0();
            M02.writeString(str);
            M02.writeString(str2);
            y4x.c(M02, bundle);
            p1xVar.O0(M02, 8);
        } catch (RemoteException e3) {
            msgVar.a(e3, "Unable to call %s on %s.", "onRouteSelected", p1x.class.getSimpleName());
        }
    }

    @Override // defpackage.erh
    public final void onRouteUnselected(krh krhVar, irh irhVar, int i) {
        Object[] objArr = {Integer.valueOf(i), irhVar.c};
        msg msgVar = c;
        Log.i(msgVar.a, msgVar.d("onRouteUnselected with reason = %d, routeId = %s", objArr));
        if (irhVar.l != 1) {
            msgVar.b("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            p1x p1xVar = this.b;
            String str = irhVar.c;
            Bundle bundle = irhVar.s;
            Parcel M0 = p1xVar.M0();
            M0.writeString(str);
            y4x.c(M0, bundle);
            M0.writeInt(i);
            p1xVar.O0(M0, 6);
        } catch (RemoteException e) {
            msgVar.a(e, "Unable to call %s on %s.", "onRouteUnselected", p1x.class.getSimpleName());
        }
    }
}
