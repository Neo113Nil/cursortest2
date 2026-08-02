package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class s0x extends pww {
    public static final msg j = new msg("AppVisibilityProxy", null);
    public static final int k = 1;
    public final Set h;
    public int i;

    public s0x() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", 3);
        this.h = Collections.synchronizedSet(new HashSet());
        this.i = k;
    }

    @Override // defpackage.pww
    public final boolean Q0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            zhj zhjVar = new zhj(this);
            parcel2.writeNoException();
            y4x.d(parcel2, zhjVar);
            return true;
        }
        Set set = this.h;
        msg msgVar = j;
        if (i == 2) {
            Log.i(msgVar.a, msgVar.d("onAppEnteredForeground", new Object[0]));
            this.i = 1;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((q2x) it.next()).a.a();
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        Log.i(msgVar.a, msgVar.d("onAppEnteredBackground", new Object[0]));
        this.i = 2;
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            s2x s2xVar = ((q2x) it2.next()).a;
            s2x.g.b("Stopping RouteDiscovery.", new Object[0]);
            s2xVar.d.clear();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                nur nurVar = s2xVar.f;
                if (((krh) nurVar.c) == null) {
                    nurVar.c = krh.d((Context) nurVar.b);
                }
                krh krhVar = (krh) nurVar.c;
                if (krhVar != null) {
                    krhVar.i(s2xVar);
                }
            } else {
                new fsn(Looper.getMainLooper(), 3).post(new g2x(s2xVar, 0));
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
