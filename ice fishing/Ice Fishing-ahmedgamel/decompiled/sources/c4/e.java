package c4;

import D1.o;
import N3.p;
import Q2.InterfaceC0364i;
import Q7.q;
import a7.InterfaceC0450e;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.AbstractActivityC0484x;
import c1.InterfaceC0542b;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3230fo;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.InterfaceC2579Fl;
import com.google.android.gms.internal.ads.WP;
import i8.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import l.m;
import l.x;
import m1.C4739a;
import r.C4891a;
import r2.C4906k;
import s2.InterfaceC4919a;
import s2.r;
import t8.l;
import t8.n;
import v2.C5101e;
import v2.InterfaceC5097a;
import v2.InterfaceC5099c;
import v7.AbstractC5121l;
import w2.D;
import w2.z;
import x1.InterfaceC5183a;
import x2.i;

/* loaded from: classes2.dex */
public final class e implements A2.d, o, p, Q1.c, InterfaceC0450e, InterfaceC0364i, InterfaceC0542b, com.bumptech.glide.manager.f, x, l {

    /* renamed from: n, reason: collision with root package name */
    public static e f5740n;

    public static ArrayList n(List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((s) obj) != s.f38343v) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5121l.w(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s) it.next()).f38348n);
        }
        return arrayList2;
    }

    public static byte[] o(List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        y8.e eVar = new y8.e();
        Iterator it = n(protocols).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            eVar.X(str.length());
            eVar.d0(str);
        }
        return eVar.A(eVar.f41924u);
    }

    public static final void q(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z6, C3230fo c3230fo) {
        if (adOverlayInfoParcel.f24345D == 4 && adOverlayInfoParcel.f24360v == null) {
            InterfaceC4919a interfaceC4919a = adOverlayInfoParcel.f24359u;
            if (interfaceC4919a != null) {
                interfaceC4919a.onAdClicked();
            }
            InterfaceC2579Fl interfaceC2579Fl = adOverlayInfoParcel.f24354N;
            if (interfaceC2579Fl != null) {
                interfaceC2579Fl.D();
            }
            Activity j6 = adOverlayInfoParcel.f24361w.j();
            C5101e c5101e = adOverlayInfoParcel.f24358n;
            Context context2 = (c5101e == null || !c5101e.f41122C || j6 == null) ? context : j6;
            e eVar = C4906k.f40186C.f40189a;
            s(context2, c5101e, adOverlayInfoParcel.f24343B, c5101e != null ? c5101e.f41121B : null, c3230fo, adOverlayInfoParcel.J);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f24347F.f41848w);
        intent.putExtra("shouldCallOnOverlayOpened", z6);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Ie)).booleanValue()) {
            D d9 = C4906k.f40186C.f40191c;
            D.v(context, intent, c3230fo, adOverlayInfoParcel.J);
        } else {
            D d10 = C4906k.f40186C.f40191c;
            D.s(context, intent);
        }
    }

    public static final boolean r(Context context, Intent intent, InterfaceC5099c interfaceC5099c, InterfaceC5097a interfaceC5097a, boolean z6, C3230fo c3230fo, String str, Bundle bundle) {
        int i;
        if (z6) {
            try {
                i = C4906k.f40186C.f40191c.J(context, intent.getData(), bundle);
                if (interfaceC5099c != null) {
                    interfaceC5099c.l();
                }
            } catch (ActivityNotFoundException e9) {
                String message = e9.getMessage();
                int i4 = z.f41712b;
                i.f(message);
                i = 6;
            }
            if (interfaceC5097a != null) {
                interfaceC5097a.x(i);
            }
            return i == 5;
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 21);
            sb.append("Launching an intent: ");
            sb.append(uri);
            z.k(sb.toString());
            if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Ie)).booleanValue()) {
                D d9 = C4906k.f40186C.f40191c;
                D.v(context, intent, c3230fo, str);
            } else {
                D d10 = C4906k.f40186C.f40191c;
                D.s(context, intent);
            }
            if (interfaceC5099c != null) {
                interfaceC5099c.l();
            }
            if (interfaceC5097a != null) {
                interfaceC5097a.e0(true);
            }
            return true;
        } catch (ActivityNotFoundException e10) {
            String message2 = e10.getMessage();
            int i6 = z.f41712b;
            i.f(message2);
            if (interfaceC5097a != null) {
                interfaceC5097a.e0(false);
            }
            return false;
        }
    }

    public static final boolean s(Context context, C5101e c5101e, InterfaceC5099c interfaceC5099c, InterfaceC5097a interfaceC5097a, C3230fo c3230fo, String str) {
        int i = 0;
        if (c5101e == null) {
            int i4 = z.f41712b;
            i.f("No intent data for launcher overlay.");
            return false;
        }
        AbstractC3592ma.a(context);
        Intent intent = c5101e.f41120A;
        if (intent != null) {
            return r(context, intent, interfaceC5099c, interfaceC5097a, c5101e.f41122C, c3230fo, str, c5101e.f41123D);
        }
        Intent intent2 = new Intent();
        String str2 = c5101e.f41125u;
        if (TextUtils.isEmpty(str2)) {
            int i6 = z.f41712b;
            i.f("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = c5101e.f41126v;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = c5101e.f41127w;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = c5101e.f41128x;
        if (!TextUtils.isEmpty(str5)) {
            String[] split = str5.split("/", 2);
            if (split.length < 2) {
                int i9 = z.f41712b;
                i.f("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str6 = c5101e.f41129y;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i10 = z.f41712b;
                i.f("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        C3324ha c3324ha = AbstractC3592ma.f33182w5;
        r rVar = r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33173v5)).booleanValue()) {
                D d9 = C4906k.f40186C.f40191c;
                D.L(context, intent2);
            }
        }
        return r(context, intent2, interfaceC5099c, interfaceC5097a, c5101e.f41122C, c3230fo, str, c5101e.f41123D);
    }

    @Override // t8.l
    public boolean a(SSLSocket sSLSocket) {
        return q.h0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.");
    }

    @Override // Q2.InterfaceC0364i
    public void accept(Object obj, Object obj2) {
        b3.c cVar = (b3.c) ((b3.b) obj).u();
        b3.f fVar = new b3.f((l3.h) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = b3.a.f5552a;
        obtain.writeInt(1);
        com.bumptech.glide.e.z(obtain, com.bumptech.glide.e.x(obtain, 20293));
        obtain.writeStrongBinder(fVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f5553n.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // N3.p
    public Object c(IBinder iBinder) {
        int i = M3.f.f1871u;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.hsdp.protocol.IHsdpService");
        return queryLocalInterface instanceof M3.g ? (M3.g) queryLocalInterface : new M3.e(iBinder, "com.google.android.play.core.hsdp.protocol.IHsdpService", 3);
    }

    @Override // c1.InterfaceC0542b
    public boolean d(float f2) {
        throw new IllegalStateException("not implemented");
    }

    @Override // l.x
    public boolean e(m mVar) {
        return false;
    }

    @Override // c1.InterfaceC0542b
    public C4739a f() {
        throw new IllegalStateException("not implemented");
    }

    @Override // c1.InterfaceC0542b
    public boolean g(float f2) {
        return false;
    }

    @Override // t8.l
    public n i(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new t8.e(cls2);
    }

    @Override // c1.InterfaceC0542b
    public boolean isEmpty() {
        return true;
    }

    @Override // c1.InterfaceC0542b
    public float j() {
        return 1.0f;
    }

    @Override // c1.InterfaceC0542b
    public float k() {
        return 0.0f;
    }

    @Override // Q1.c
    public void l(Object obj) {
        ((List) obj).clear();
    }

    public void p(WP wp, float f2) {
        C4891a c4891a = (C4891a) ((Drawable) wp.f29152n);
        CardView cardView = (CardView) wp.f29153u;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f2 != c4891a.f40100e || c4891a.f40101f != useCompatPadding || c4891a.f40102g != preventCornerOverlap) {
            c4891a.f40100e = f2;
            c4891a.f40101f = useCompatPadding;
            c4891a.f40102g = preventCornerOverlap;
            c4891a.b(null);
            c4891a.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            wp.j(0, 0, 0, 0);
            return;
        }
        C4891a c4891a2 = (C4891a) ((Drawable) wp.f29152n);
        float f9 = c4891a2.f40100e;
        float f10 = c4891a2.f40096a;
        int ceil = (int) Math.ceil(r.b.a(f9, f10, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(r.b.b(f9, f10, cardView.getPreventCornerOverlap()));
        wp.j(ceil, ceil2, ceil, ceil2);
    }

    @Override // D1.o
    public void x() {
    }

    @Override // com.bumptech.glide.manager.f
    public void h(AbstractActivityC0484x abstractActivityC0484x) {
    }

    @Override // l.x
    public void b(m mVar, boolean z6) {
    }

    @Override // D1.o
    public void z(Bitmap bitmap, InterfaceC5183a interfaceC5183a) {
    }
}
