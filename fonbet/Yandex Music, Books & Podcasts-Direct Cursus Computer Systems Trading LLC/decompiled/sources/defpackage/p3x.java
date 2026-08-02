package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p3x extends pww {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3x(nkp nkpVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 3);
        this.i = nkpVar;
    }

    @Override // defpackage.pww
    public final boolean Q0(int i, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        int i2 = this.h;
        boolean z = false;
        int i3 = 2;
        Object obj = this.i;
        switch (i2) {
            case 0:
                nkp nkpVar = (nkp) obj;
                switch (i) {
                    case 1:
                        zhj zhjVar = new zhj(nkpVar);
                        parcel2.writeNoException();
                        y4x.d(parcel2, zhjVar);
                        break;
                    case 2:
                        Bundle bundle = (Bundle) y4x.a(parcel, Bundle.CREATOR);
                        y4x.b(parcel);
                        ((p84) nkpVar).g(bundle);
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle2 = (Bundle) y4x.a(parcel, Bundle.CREATOR);
                        y4x.b(parcel);
                        ((p84) nkpVar).g(bundle2);
                        parcel2.writeNoException();
                        break;
                    case 4:
                        int i4 = y4x.a;
                        int i5 = parcel.readInt() != 0 ? 1 : 0;
                        y4x.b(parcel);
                        p84 p84Var = (p84) nkpVar;
                        m1x m1xVar = p84Var.e;
                        if (m1xVar != null) {
                            try {
                                h1x h1xVar = (h1x) m1xVar;
                                Parcel M0 = h1xVar.M0();
                                M0.writeInt(i5);
                                M0.writeInt(0);
                                h1xVar.O0(M0, 6);
                            } catch (RemoteException e) {
                                p84.m.a(e, "Unable to call %s on %s.", "disconnectFromDevice", m1x.class.getSimpleName());
                            }
                            p84Var.a(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        p84 p84Var2 = (p84) nkpVar;
                        y1g.B("Must be called from the main thread.");
                        xun xunVar = p84Var2.j;
                        long g = xunVar == null ? 0L : xunVar.g() - p84Var2.j.a();
                        parcel2.writeNoException();
                        parcel2.writeLong(g);
                        break;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case 7:
                        Bundle bundle3 = (Bundle) y4x.a(parcel, Bundle.CREATOR);
                        y4x.b(parcel);
                        ((p84) nkpVar).k = CastDevice.e(bundle3);
                        parcel2.writeNoException();
                        break;
                    case 8:
                        Bundle bundle4 = (Bundle) y4x.a(parcel, Bundle.CREATOR);
                        y4x.b(parcel);
                        ((p84) nkpVar).k = CastDevice.e(bundle4);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        Bundle bundle5 = (Bundle) y4x.a(parcel, Bundle.CREATOR);
                        y4x.b(parcel);
                        p84 p84Var3 = (p84) nkpVar;
                        CastDevice e2 = CastDevice.e(bundle5);
                        if (e2 != null) {
                            String str = e2.d;
                            if (!e2.equals(p84Var3.k)) {
                                if (!TextUtils.isEmpty(str) && ((castDevice2 = p84Var3.k) == null || !TextUtils.equals(castDevice2.d, str))) {
                                    z = true;
                                }
                                p84Var3.k = e2;
                                p84.m.b("update to device (%s) with name %s", e2, true != z ? "unchanged" : "changed");
                                if (z && (castDevice = p84Var3.k) != null) {
                                    mmx mmxVar = p84Var3.h;
                                    if (mmxVar != null) {
                                        msg msgVar = mmx.v;
                                        Log.i(msgVar.a, msgVar.d("update Cast device to %s", castDevice));
                                        mmxVar.o = castDevice;
                                        mmxVar.c();
                                    }
                                    Iterator it = new HashSet(p84Var3.d).iterator();
                                    while (it.hasNext()) {
                                        ((kox) it.next()).getClass();
                                    }
                                    knn knnVar = p84Var3.l;
                                    if (knnVar != null) {
                                        ((tao) knnVar.b).x().t++;
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                }
                break;
            case 1:
                b1x b1xVar = (b1x) obj;
                k74 k74Var = b1xVar.d;
                if (i == 1) {
                    String readString = parcel.readString();
                    y4x.b(parcel);
                    l9e c = new p84(b1xVar.a, b1xVar.b, readString, b1xVar.d, b1xVar.e, new mmx(b1xVar.a, k74Var, b1xVar.e)).c();
                    parcel2.writeNoException();
                    y4x.d(parcel2, c);
                } else if (i == 2) {
                    boolean z2 = k74Var.e;
                    parcel2.writeNoException();
                    int i6 = y4x.a;
                    parcel2.writeInt(z2 ? 1 : 0);
                } else if (i == 3) {
                    String str2 = b1xVar.b;
                    parcel2.writeNoException();
                    parcel2.writeString(str2);
                } else if (i == 4) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                break;
            case 2:
                if (i == 1) {
                    long readLong = parcel.readLong();
                    long readLong2 = parcel.readLong();
                    y4x.b(parcel);
                    ((p8x) obj).publishProgress(Long.valueOf(readLong), Long.valueOf(readLong2));
                    parcel2.writeNoException();
                } else if (i == 2) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                break;
            default:
                p84 p84Var4 = (p84) obj;
                if (i == 1) {
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    y4x.b(parcel);
                    h4x h4xVar = p84Var4.i;
                    if (h4xVar != null && h4xVar.F == 3) {
                        q5i a = h8s.a();
                        a.c = new z6u(10, h4xVar, readString2, readString3);
                        a.b = 8407;
                        h4xVar.c(1, a.c()).addOnCompleteListener(new gao(this));
                    }
                    parcel2.writeNoException();
                } else if (i == 2) {
                    String readString4 = parcel.readString();
                    mnf mnfVar = (mnf) y4x.a(parcel, mnf.CREATOR);
                    y4x.b(parcel);
                    h4x h4xVar2 = p84Var4.i;
                    if (h4xVar2 != null && h4xVar2.F == 3) {
                        q5i a2 = h8s.a();
                        a2.c = new z6u(8, h4xVar2, readString4, mnfVar);
                        a2.b = 8406;
                        h4xVar2.c(1, a2.c()).addOnCompleteListener(new q3x(i3, this));
                    }
                    parcel2.writeNoException();
                } else if (i == 3) {
                    String readString5 = parcel.readString();
                    y4x.b(parcel);
                    h4x h4xVar3 = p84Var4.i;
                    if (h4xVar3 != null && h4xVar3.F == 3) {
                        q5i a3 = h8s.a();
                        a3.c = new dxr(h4xVar3, readString5);
                        a3.b = 8409;
                        h4xVar3.c(1, a3.c());
                    }
                    parcel2.writeNoException();
                } else if (i == 4) {
                    int readInt = parcel.readInt();
                    y4x.b(parcel);
                    p84.e(p84Var4, readInt);
                    parcel2.writeNoException();
                } else if (i == 5) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3x(p84 p84Var) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 3);
        this.i = p84Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3x(b1x b1xVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 3);
        this.i = b1xVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3x(p8x p8xVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 3);
        this.i = p8xVar;
    }
}
