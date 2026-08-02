package B1;

import A1.E;
import A1.x;
import A1.y;
import K.f;
import O2.h;
import R2.w;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.a0;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.AbstractC4117wD;
import com.google.android.gms.internal.ads.AbstractC4119wF;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.C3490kg;
import com.google.android.gms.internal.ads.InterfaceC3544lg;
import com.google.android.gms.internal.ads.InterfaceC3598mg;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.UC;
import com.google.android.gms.internal.ads.Ux;
import com.google.android.gms.internal.ads.WC;
import com.google.android.gms.internal.ads.Wv;
import h.LayoutInflaterFactory2C4537A;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;
import l.t;
import r2.C4906k;
import s.k;
import s2.C4939k;
import s2.C4945n;
import s2.C4949p;
import s2.S;
import s2.r;
import w2.C5140B;
import x2.i;

/* loaded from: classes.dex */
public abstract class b implements y {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f255n;

    /* renamed from: u, reason: collision with root package name */
    public Object f256u;

    /* renamed from: v, reason: collision with root package name */
    public Object f257v;

    public /* synthetic */ b(int i, Object obj) {
        this.f255n = i;
        this.f256u = obj;
    }

    public void c() {
        Q0.d dVar = (Q0.d) this.f256u;
        if (dVar != null) {
            try {
                ((LayoutInflaterFactory2C4537A) this.f257v).f37786D.unregisterReceiver(dVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f256u = null;
        }
    }

    public void d() {
        a0 a0Var = (a0) this.f256u;
        f fVar = (f) this.f257v;
        LinkedHashSet linkedHashSet = a0Var.f4918e;
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
        if (((k) this.f257v) == null) {
            this.f257v = new k();
        }
        MenuItem menuItem2 = (MenuItem) ((k) this.f257v).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        t tVar = new t((Context) this.f256u, aVar);
        ((k) this.f257v).put(aVar, tVar);
        return tVar;
    }

    public abstract Object h(IBinder iBinder);

    public Object i(Context context) {
        Context context2;
        if (this.f257v == null) {
            w.h(context);
            AtomicBoolean atomicBoolean = h.f2271a;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 == null) {
                throw new Y2.c("Could not get remote context.");
            }
            try {
                this.f257v = h((IBinder) context2.getClassLoader().loadClass((String) this.f256u).newInstance());
            } catch (ClassNotFoundException e9) {
                throw new Y2.c("Could not load creator class.", e9);
            } catch (IllegalAccessException e10) {
                throw new Y2.c("Could not access creator.", e10);
            } catch (InstantiationException e11) {
                throw new Y2.c("Could not instantiate creator.", e11);
            }
        }
        return this.f257v;
    }

    @Override // A1.y
    public x j(E e9) {
        Class cls = (Class) this.f257v;
        return new e((Context) this.f256u, e9.a(File.class, cls), e9.a(Uri.class, cls), cls);
    }

    public boolean k() {
        a0 a0Var = (a0) this.f256u;
        View view = a0Var.f4916c.f5018X;
        kotlin.jvm.internal.h.d(view, "operation.fragment.mView");
        int i = 4;
        if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
            int visibility = view.getVisibility();
            if (visibility == 0) {
                i = 2;
            } else if (visibility != 4) {
                if (visibility != 8) {
                    throw new IllegalArgumentException(Wv.f(visibility, "Unknown visibility "));
                }
                i = 3;
            }
        }
        int i4 = a0Var.f4914a;
        if (i != i4) {
            return (i == 2 || i4 == 2) ? false : true;
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
        if (((Q0.d) this.f256u) == null) {
            this.f256u = new Q0.d(7, this);
        }
        ((LayoutInflaterFactory2C4537A) this.f257v).f37786D.registerReceiver((Q0.d) this.f256u, e9);
    }

    public abstract AbstractC4119wF n(int i, byte[] bArr);

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
            ((AbstractC4119wF) this.f257v).c(0, bArr).get(bArr4);
            int length = bArr2.length;
            int i = length & 15;
            int i4 = i == 0 ? length : (length + 16) - i;
            int remaining = byteBuffer.remaining();
            int i6 = remaining % 16;
            int i9 = (i6 == 0 ? remaining : (remaining + 16) - i6) + i4;
            ByteBuffer order = ByteBuffer.allocate(i9 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr2);
            order.position(i4);
            order.put(byteBuffer);
            order.position(i9);
            order.putLong(length);
            order.putLong(remaining);
            if (!MessageDigest.isEqual(UC.g(bArr4, order.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            AbstractC4119wF abstractC4119wF = (AbstractC4119wF) this.f256u;
            abstractC4119wF.getClass();
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != abstractC4119wF.b()) {
                int b9 = abstractC4119wF.b();
                throw new GeneralSecurityException(D.x.k(b9, "The nonce length (in bytes) must be ", new StringBuilder(String.valueOf(b9).length() + 36)));
            }
            int remaining2 = byteBuffer.remaining();
            int i10 = remaining2 / 64;
            for (int i11 = 0; i11 < i10 + 1; i11++) {
                ByteBuffer c9 = abstractC4119wF.c(abstractC4119wF.f35585a + i11, bArr);
                if (i11 == i10) {
                    AbstractC4117wD.i(allocate, byteBuffer, c9, remaining2 % 64);
                } else {
                    AbstractC4117wD.i(allocate, byteBuffer, c9, 64);
                }
            }
            return allocate.array();
        } catch (GeneralSecurityException e9) {
            throw new AEADBadTagException(e9.toString());
        }
    }

    public void p(InterfaceC3598mg interfaceC3598mg, InterfaceC3544lg interfaceC3544lg) {
        S0.e eVar = new S0.e(this, interfaceC3598mg, interfaceC3544lg);
        C3490kg c3490kg = (C3490kg) this.f256u;
        c3490kg.a(new LD(0, c3490kg, eVar), AbstractC3436jg.f32062h);
    }

    public void q() {
        switch (this.f255n) {
            case 1:
                try {
                    ((S) this.f256u).Q(((m2.b) this.f257v).f39368n);
                    break;
                } catch (RemoteException e9) {
                    i.i("#007 Could not call remote method.", e9);
                    return;
                }
            default:
                ((C3490kg) this.f256u).c(new Exception());
                break;
        }
    }

    public void r(String str, Throwable th) {
        ((C3490kg) this.f256u).c(th);
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.C8)).booleanValue()) {
            C4906k.f40186C.f40196h.e(str, th);
        }
    }

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f255n = i;
        this.f256u = obj;
        this.f257v = obj2;
    }

    public b(S0.e eVar, C5140B c5140b) {
        this.f255n = 5;
        this.f257v = eVar;
        this.f256u = c5140b;
    }

    public b() {
        this.f255n = 4;
        C3490kg c3490kg = new C3490kg();
        this.f256u = c3490kg;
        this.f257v = new AtomicInteger(0);
        Ux ux = new Ux(this);
        c3490kg.a(new LD(0, c3490kg, ux), AbstractC3436jg.f32062h);
    }

    public b(Context context, m2.b bVar) {
        this.f255n = 1;
        if (m2.x.f39411b == null) {
            synchronized (m2.x.class) {
                try {
                    if (m2.x.f39411b == null) {
                        C4945n c4945n = C4949p.f40498g.f40500b;
                        BinderC3487kd binderC3487kd = new BinderC3487kd();
                        c4945n.getClass();
                        m2.x.f39411b = (S) new C4939k(c4945n, context, binderC3487kd).d(context, false);
                    }
                } finally {
                }
            }
        }
        this.f256u = m2.x.f39411b;
        context.getApplicationContext();
        this.f257v = bVar;
    }

    public b(byte[] bArr) {
        this.f255n = 6;
        if (WC.c(1)) {
            this.f256u = n(1, bArr);
            this.f257v = n(0, bArr);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public b(LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A) {
        this.f255n = 7;
        this.f257v = layoutInflaterFactory2C4537A;
    }
}
