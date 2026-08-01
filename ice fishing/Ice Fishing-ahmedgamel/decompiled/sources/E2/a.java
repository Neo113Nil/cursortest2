package E2;

import D.y;
import K.f;
import M2.h;
import P2.w;
import Q0.d;
import S0.e;
import W2.c;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.a0;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.AbstractC4094wD;
import com.google.android.gms.internal.ads.AbstractC4096wF;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.C3467kg;
import com.google.android.gms.internal.ads.InterfaceC3521lg;
import com.google.android.gms.internal.ads.InterfaceC3575mg;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.UC;
import com.google.android.gms.internal.ads.Ux;
import com.google.android.gms.internal.ads.WC;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import h.LayoutInflaterFactory2C4533A;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;
import k2.b;
import l.t;
import p2.C4835j;
import q2.C4890k;
import q2.C4896n;
import q2.C4900p;
import q2.S;
import q2.r;
import s.k;
import u2.C5069B;
import v2.i;
import y1.InterfaceC5223r;
import y1.InterfaceC5224s;
import y1.x;
import z1.C5257d;

/* loaded from: classes.dex */
public abstract class a implements InterfaceC5224s {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f730n;

    /* renamed from: u, reason: collision with root package name */
    public Object f731u;

    /* renamed from: v, reason: collision with root package name */
    public Object f732v;

    public /* synthetic */ a(int i, Object obj) {
        this.f730n = i;
        this.f731u = obj;
    }

    public void c() {
        d dVar = (d) this.f731u;
        if (dVar != null) {
            try {
                ((LayoutInflaterFactory2C4533A) this.f732v).f37760D.unregisterReceiver(dVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f731u = null;
        }
    }

    public void d() {
        a0 a0Var = (a0) this.f731u;
        f fVar = (f) this.f732v;
        LinkedHashSet linkedHashSet = a0Var.f4950e;
        if (linkedHashSet.remove(fVar) && linkedHashSet.isEmpty()) {
            a0Var.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof I.a)) {
            return menuItem;
        }
        I.a aVar = (I.a) menuItem;
        if (((k) this.f732v) == null) {
            this.f732v = new k();
        }
        MenuItem menuItem2 = (MenuItem) ((k) this.f732v).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        t tVar = new t((Context) this.f731u, aVar);
        ((k) this.f732v).put(aVar, tVar);
        return tVar;
    }

    public abstract Object h(IBinder iBinder);

    @Override // y1.InterfaceC5224s
    public InterfaceC5223r i(x xVar) {
        Class cls = (Class) this.f732v;
        return new C5257d((Context) this.f731u, xVar.b(File.class, cls), xVar.b(Uri.class, cls), cls);
    }

    public Object j(Context context) {
        Context context2;
        if (this.f732v == null) {
            w.h(context);
            int i = h.f1847c;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 == null) {
                throw new c("Could not get remote context.");
            }
            try {
                this.f732v = h((IBinder) context2.getClassLoader().loadClass((String) this.f731u).newInstance());
            } catch (ClassNotFoundException e9) {
                throw new c("Could not load creator class.", e9);
            } catch (IllegalAccessException e10) {
                throw new c("Could not access creator.", e10);
            } catch (InstantiationException e11) {
                throw new c("Could not instantiate creator.", e11);
            }
        }
        return this.f732v;
    }

    public boolean k() {
        a0 a0Var = (a0) this.f731u;
        View view = a0Var.f4948c.f5050X;
        kotlin.jvm.internal.h.d(view, "operation.fragment.mView");
        int i = 4;
        if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
            int visibility = view.getVisibility();
            if (visibility == 0) {
                i = 2;
            } else if (visibility != 4) {
                if (visibility != 8) {
                    throw new IllegalArgumentException(AbstractC4404f.e(visibility, "Unknown visibility "));
                }
                i = 3;
            }
        }
        int i6 = a0Var.f4946a;
        if (i != i6) {
            return (i == 2 || i6 == 2) ? false : true;
        }
        return true;
    }

    public abstract void l();

    public void m() {
        c();
        IntentFilter e9 = e();
        if (e9.countActions() == 0) {
            return;
        }
        if (((d) this.f731u) == null) {
            this.f731u = new d(7, this);
        }
        ((LayoutInflaterFactory2C4533A) this.f732v).f37760D.registerReceiver((d) this.f731u, e9);
    }

    public abstract AbstractC4096wF n(int i, byte[] bArr);

    public byte[] o(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((AbstractC4096wF) this.f732v).c(0, bArr).get(bArr4);
            int length = bArr2.length;
            int i = length & 15;
            int i6 = i == 0 ? length : (length + 16) - i;
            int remaining = byteBuffer.remaining();
            int i9 = remaining % 16;
            int i10 = (i9 == 0 ? remaining : (remaining + 16) - i9) + i6;
            ByteBuffer order = ByteBuffer.allocate(i10 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr2);
            order.position(i6);
            order.put(byteBuffer);
            order.position(i10);
            order.putLong(length);
            order.putLong(remaining);
            if (!MessageDigest.isEqual(UC.g(bArr4, order.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            AbstractC4096wF abstractC4096wF = (AbstractC4096wF) this.f731u;
            abstractC4096wF.getClass();
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != abstractC4096wF.b()) {
                int b9 = abstractC4096wF.b();
                throw new GeneralSecurityException(y.m(b9, "The nonce length (in bytes) must be ", new StringBuilder(String.valueOf(b9).length() + 36)));
            }
            int remaining2 = byteBuffer.remaining();
            int i11 = remaining2 / 64;
            for (int i12 = 0; i12 < i11 + 1; i12++) {
                ByteBuffer c9 = abstractC4096wF.c(abstractC4096wF.f34816a + i12, bArr);
                if (i12 == i11) {
                    AbstractC4094wD.i(allocate, byteBuffer, c9, remaining2 % 64);
                } else {
                    AbstractC4094wD.i(allocate, byteBuffer, c9, 64);
                }
            }
            return allocate.array();
        } catch (GeneralSecurityException e9) {
            throw new AEADBadTagException(e9.toString());
        }
    }

    public void p(InterfaceC3575mg interfaceC3575mg, InterfaceC3521lg interfaceC3521lg) {
        e eVar = new e(this, interfaceC3575mg, interfaceC3521lg);
        C3467kg c3467kg = (C3467kg) this.f731u;
        c3467kg.a(new LD(0, c3467kg, eVar), AbstractC3413jg.f31275h);
    }

    public void q() {
        switch (this.f730n) {
            case 0:
                try {
                    ((S) this.f731u).Q(((b) this.f732v).f38579n);
                    break;
                } catch (RemoteException e9) {
                    i.i("#007 Could not call remote method.", e9);
                    return;
                }
            default:
                ((C3467kg) this.f731u).c(new Exception());
                break;
        }
    }

    public void r(String str, Throwable th) {
        ((C3467kg) this.f731u).c(th);
        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.C8)).booleanValue()) {
            C4835j.f39733C.f39743h.e(str, th);
        }
    }

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f730n = i;
        this.f731u = obj;
        this.f732v = obj2;
    }

    public a(e eVar, C5069B c5069b) {
        this.f730n = 4;
        this.f732v = eVar;
        this.f731u = c5069b;
    }

    public a() {
        this.f730n = 3;
        C3467kg c3467kg = new C3467kg();
        this.f731u = c3467kg;
        this.f732v = new AtomicInteger(0);
        Ux ux = new Ux(this);
        c3467kg.a(new LD(0, c3467kg, ux), AbstractC3413jg.f31275h);
    }

    public a(Context context, b bVar) {
        this.f730n = 0;
        if (k2.x.f38622b == null) {
            synchronized (k2.x.class) {
                try {
                    if (k2.x.f38622b == null) {
                        C4896n c4896n = C4900p.f40199g.f40201b;
                        BinderC3464kd binderC3464kd = new BinderC3464kd();
                        c4896n.getClass();
                        k2.x.f38622b = (S) new C4890k(c4896n, context, binderC3464kd).d(context, false);
                    }
                } finally {
                }
            }
        }
        this.f731u = k2.x.f38622b;
        context.getApplicationContext();
        this.f732v = bVar;
    }

    public a(byte[] bArr) {
        this.f730n = 5;
        if (WC.c(1)) {
            this.f731u = n(1, bArr);
            this.f732v = n(0, bArr);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public a(LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A) {
        this.f730n = 6;
        this.f732v = layoutInflaterFactory2C4533A;
    }
}
