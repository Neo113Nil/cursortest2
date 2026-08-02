package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class l3x extends pww {
    public static final msg m = new msg("MediaRouterProxy", null);
    public final krh h;
    public final k74 i;
    public final HashMap j;
    public final b4x k;
    public final boolean l;

    public l3x(Context context, krh krhVar, k74 k74Var, w8c w8cVar) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 3);
        this.j = new HashMap();
        this.h = krhVar;
        this.i = k74Var;
        int i = Build.VERSION.SDK_INT;
        msg msgVar = m;
        if (i <= 32) {
            Log.i(msgVar.a, msgVar.d("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]));
            return;
        }
        msgVar.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.k = new b4x(k74Var);
        Intent intent = new Intent(context, (Class<?>) swh.class);
        intent.setPackage(context.getPackageName());
        boolean isEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.l = !isEmpty;
        if (!isEmpty) {
            zix.a(rgx.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        w8cVar.e(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new y8p(this, k74Var, false, 17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // defpackage.pww
    public final boolean Q0(int i, Parcel parcel, Parcel parcel2) {
        int i2 = 2;
        p1x p1xVar = null;
        Bundle bundle = null;
        HashMap hashMap = this.j;
        int i3 = 0;
        r6 = 0;
        int i4 = 0;
        i3 = 0;
        i3 = 0;
        krh krhVar = this.h;
        switch (i) {
            case 1:
                Bundle bundle2 = (Bundle) y4x.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    p1xVar = queryLocalInterface instanceof p1x ? (p1x) queryLocalInterface : new p1x(readStrongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", 2);
                }
                y4x.b(parcel);
                crh b = crh.b(bundle2);
                if (b != null) {
                    if (!hashMap.containsKey(b)) {
                        hashMap.put(b, new HashSet());
                    }
                    ((Set) hashMap.get(b)).add(new d2x(p1xVar));
                }
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle3 = (Bundle) y4x.a(parcel, Bundle.CREATOR);
                int readInt = parcel.readInt();
                y4x.b(parcel);
                crh b2 = crh.b(bundle3);
                if (b2 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        T0(b2, readInt);
                    } else {
                        new fsn(Looper.getMainLooper(), 3).post(new hs0(this, b2, readInt, i2));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle4 = (Bundle) y4x.a(parcel, Bundle.CREATOR);
                y4x.b(parcel);
                crh b3 = crh.b(bundle4);
                if (b3 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        U0(b3);
                    } else {
                        new fsn(Looper.getMainLooper(), 3).post(new rxw(this, b3, i3, 6));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 4:
                Bundle bundle5 = (Bundle) y4x.a(parcel, Bundle.CREATOR);
                int readInt2 = parcel.readInt();
                y4x.b(parcel);
                crh b4 = crh.b(bundle5);
                if (b4 != null) {
                    krhVar.getClass();
                    krh.b();
                    yld c = krh.c();
                    ArrayList arrayList = c.j;
                    if (!b4.d()) {
                        if ((readInt2 & 2) != 0 || !c.p) {
                            mrh mrhVar = c.u;
                            Object[] objArr = mrhVar != null && mrhVar.b && c.f();
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                irh irhVar = (irh) arrayList.get(i5);
                                if (((readInt2 & 1) != 0 && irhVar.d()) || ((objArr != false && !irhVar.d() && irhVar.c() != c.r) || !irhVar.h(b4))) {
                                }
                            }
                        }
                        i3 = 1;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 5:
                String readString = parcel.readString();
                y4x.b(parcel);
                msg msgVar = m;
                msgVar.b("select route with routeId = %s", readString);
                krhVar.getClass();
                Iterator it = krh.f().iterator();
                while (true) {
                    if (it.hasNext()) {
                        irh irhVar2 = (irh) it.next();
                        if (irhVar2.c.equals(readString)) {
                            msgVar.b("media route is found and selected", new Object[0]);
                            krh.j(irhVar2);
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                krhVar.getClass();
                krh.b();
                irh irhVar3 = krh.c().v;
                if (irhVar3 == null) {
                    xq0.q("There is no default route.  The media router has not yet been fully initialized.");
                    return false;
                }
                krh.j(irhVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                krhVar.getClass();
                krh.b();
                irh irhVar4 = krh.c().v;
                if (irhVar4 == null) {
                    xq0.q("There is no default route.  The media router has not yet been fully initialized.");
                    return false;
                }
                boolean equals = krh.g().c.equals(irhVar4.c);
                parcel2.writeNoException();
                int i6 = y4x.a;
                parcel2.writeInt(equals ? 1 : 0);
                return true;
            case 8:
                String readString2 = parcel.readString();
                y4x.b(parcel);
                krhVar.getClass();
                Iterator it2 = krh.f().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        irh irhVar5 = (irh) it2.next();
                        if (irhVar5.c.equals(readString2)) {
                            bundle = irhVar5.s;
                        }
                    }
                }
                parcel2.writeNoException();
                if (bundle == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, 1);
                return true;
            case 9:
                krhVar.getClass();
                String str = krh.g().c;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case 11:
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    Iterator it4 = ((Set) it3.next()).iterator();
                    while (it4.hasNext()) {
                        krhVar.i((erh) it4.next());
                    }
                }
                hashMap.clear();
                parcel2.writeNoException();
                return true;
            case 12:
                krhVar.getClass();
                krh.b();
                irh irhVar6 = krh.c().w;
                if (irhVar6 != null && krh.g().c.equals(irhVar6.c)) {
                    i4 = 1;
                }
                parcel2.writeNoException();
                int i7 = y4x.a;
                parcel2.writeInt(i4);
                return true;
            case 13:
                int readInt3 = parcel.readInt();
                y4x.b(parcel);
                krhVar.getClass();
                krh.k(readInt3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final void S0(osh oshVar) {
        this.h.getClass();
        krh.b();
        yld c = krh.c();
        c.D = oshVar;
        vx6 vx6Var = oshVar != null ? new vx6(c, oshVar) : null;
        vx6 vx6Var2 = c.C;
        if (vx6Var2 != null) {
            vx6Var2.s();
        }
        c.C = vx6Var;
        if (vx6Var != null) {
            c.l();
        }
    }

    public final void T0(crh crhVar, int i) {
        Set set = (Set) this.j.get(crhVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.h.a(crhVar, (erh) it.next(), i);
        }
    }

    public final void U0(crh crhVar) {
        Set set = (Set) this.j.get(crhVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.h.i((erh) it.next());
        }
    }
}
