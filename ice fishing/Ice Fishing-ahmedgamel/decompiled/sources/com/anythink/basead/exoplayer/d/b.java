package com.anythink.basead.exoplayer.d;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.anythink.basead.exoplayer.d.c;
import com.anythink.basead.exoplayer.d.e;
import com.anythink.basead.exoplayer.d.f;
import com.anythink.basead.exoplayer.d.i;
import com.anythink.basead.exoplayer.d.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
final class b<T extends i> implements f<T> {
    private static final String i = "DefaultDrmSession";

    /* renamed from: j, reason: collision with root package name */
    private static final int f7572j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static final int f7573k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f7574l = 60;

    /* renamed from: A, reason: collision with root package name */
    private byte[] f7575A;

    /* renamed from: B, reason: collision with root package name */
    private Object f7576B;

    /* renamed from: C, reason: collision with root package name */
    private Object f7577C;

    /* renamed from: a, reason: collision with root package name */
    final n f7578a;

    /* renamed from: b, reason: collision with root package name */
    final UUID f7579b;

    /* renamed from: c, reason: collision with root package name */
    final b<T>.HandlerC0018b f7580c;

    /* renamed from: m, reason: collision with root package name */
    private final j<T> f7581m;

    /* renamed from: n, reason: collision with root package name */
    private final c<T> f7582n;

    /* renamed from: o, reason: collision with root package name */
    private final e.a f7583o;

    /* renamed from: p, reason: collision with root package name */
    private final int f7584p;

    /* renamed from: q, reason: collision with root package name */
    private final HashMap<String, String> f7585q;

    /* renamed from: r, reason: collision with root package name */
    private final c.a f7586r;

    /* renamed from: s, reason: collision with root package name */
    private final int f7587s;

    /* renamed from: t, reason: collision with root package name */
    private int f7588t;

    /* renamed from: u, reason: collision with root package name */
    private int f7589u;

    /* renamed from: v, reason: collision with root package name */
    private HandlerThread f7590v;

    /* renamed from: w, reason: collision with root package name */
    private b<T>.a f7591w;

    /* renamed from: x, reason: collision with root package name */
    private T f7592x;

    /* renamed from: y, reason: collision with root package name */
    private f.a f7593y;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f7594z;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(int i, Object obj, boolean z6) {
            obtainMessage(i, z6 ? 1 : 0, 0, obj).sendToTarget();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object obj;
            int i;
            int i4;
            Object obj2 = message.obj;
            try {
                int i6 = message.what;
                if (i6 == 0) {
                    obj = b.this.f7578a.a();
                } else {
                    if (i6 != 1) {
                        throw new RuntimeException();
                    }
                    Object obj3 = ((Pair) obj2).first;
                    obj = b.this.f7578a.b();
                }
            } catch (Exception e9) {
                if (message.arg1 == 1 && (i4 = (i = message.arg2) + 1) <= b.this.f7587s) {
                    Message obtain = Message.obtain(message);
                    obtain.arg2 = i4;
                    sendMessageDelayed(obtain, Math.min(i * 1000, 5000));
                    return;
                }
                obj = e9;
            }
            b.this.f7580c.obtainMessage(message.what, Pair.create(obj2, obj)).sendToTarget();
        }

        private boolean a(Message message) {
            int i;
            int i4;
            if (message.arg1 != 1 || (i4 = (i = message.arg2) + 1) > b.this.f7587s) {
                return false;
            }
            Message obtain = Message.obtain(message);
            obtain.arg2 = i4;
            sendMessageDelayed(obtain, Math.min(i * 1000, 5000));
            return true;
        }

        private static long a(int i) {
            return Math.min((i - 1) * 1000, 5000);
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.d.b$b, reason: collision with other inner class name */
    public class HandlerC0018b extends Handler {
        public HandlerC0018b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                b.a(b.this, obj, obj2);
            } else {
                if (i != 1) {
                    return;
                }
                b.b(b.this, obj, obj2);
            }
        }
    }

    public interface c<T extends i> {
        void a();

        void a(b<T> bVar);

        void a(Exception exc);
    }

    public b(UUID uuid, j<T> jVar, c<T> cVar, e.a aVar, int i4, byte[] bArr, HashMap<String, String> hashMap, n nVar, Looper looper, c.a aVar2, int i6) {
        this.f7579b = uuid;
        this.f7582n = cVar;
        this.f7581m = jVar;
        this.f7584p = i4;
        this.f7575A = bArr;
        this.f7583o = bArr != null ? null : aVar;
        this.f7585q = hashMap;
        this.f7578a = nVar;
        this.f7587s = i6;
        this.f7586r = aVar2;
        this.f7588t = 2;
        this.f7580c = new HandlerC0018b(looper);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.f7590v = handlerThread;
        handlerThread.start();
        this.f7591w = new a(this.f7590v.getLooper());
    }

    private boolean j() {
        if (n()) {
            return true;
        }
        try {
            byte[] a9 = this.f7581m.a();
            this.f7594z = a9;
            this.f7592x = this.f7581m.d(a9);
            this.f7588t = 3;
            return true;
        } catch (Exception e9) {
            c(e9);
            return false;
        }
    }

    private boolean k() {
        try {
            this.f7581m.b(this.f7594z, this.f7575A);
            return true;
        } catch (Exception e9) {
            Log.e(i, "Error trying to restore Widevine keys.", e9);
            c(e9);
            return false;
        }
    }

    private long l() {
        if (!com.anythink.basead.exoplayer.b.bk.equals(this.f7579b)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> a9 = p.a(this);
        return Math.min(((Long) a9.first).longValue(), ((Long) a9.second).longValue());
    }

    private void m() {
        if (this.f7588t == 4) {
            this.f7588t = 3;
            c(new m());
        }
    }

    private boolean n() {
        int i4 = this.f7588t;
        return i4 == 3 || i4 == 4;
    }

    public final boolean b() {
        int i4 = this.f7589u - 1;
        this.f7589u = i4;
        if (i4 != 0) {
            return false;
        }
        this.f7588t = 0;
        this.f7580c.removeCallbacksAndMessages(null);
        this.f7591w.removeCallbacksAndMessages(null);
        this.f7591w = null;
        this.f7590v.quit();
        this.f7590v = null;
        this.f7592x = null;
        this.f7593y = null;
        this.f7576B = null;
        this.f7577C = null;
        byte[] bArr = this.f7594z;
        if (bArr != null) {
            this.f7581m.a(bArr);
            this.f7594z = null;
        }
        return true;
    }

    public final void c() {
        j.h b9 = this.f7581m.b();
        this.f7577C = b9;
        this.f7591w.a(0, b9, true);
    }

    public final void d() {
        if (j()) {
            a(true);
        }
    }

    @Override // com.anythink.basead.exoplayer.d.f
    public final int e() {
        return this.f7588t;
    }

    @Override // com.anythink.basead.exoplayer.d.f
    public final f.a f() {
        if (this.f7588t == 1) {
            return this.f7593y;
        }
        return null;
    }

    @Override // com.anythink.basead.exoplayer.d.f
    public final T g() {
        return this.f7592x;
    }

    @Override // com.anythink.basead.exoplayer.d.f
    public final Map<String, String> h() {
        byte[] bArr = this.f7594z;
        if (bArr == null) {
            return null;
        }
        return this.f7581m.c(bArr);
    }

    @Override // com.anythink.basead.exoplayer.d.f
    public final byte[] i() {
        return this.f7575A;
    }

    public final void a() {
        int i4 = this.f7589u + 1;
        this.f7589u = i4;
        if (i4 == 1 && this.f7588t != 1 && j()) {
            a(true);
        }
    }

    private void c(Exception exc) {
        this.f7593y = new f.a(exc);
        this.f7586r.a(exc);
        if (this.f7588t != 4) {
            this.f7588t = 1;
        }
    }

    public final boolean a(byte[] bArr) {
        e.a aVar = this.f7583o;
        return Arrays.equals(aVar != null ? aVar.f7636c : null, bArr);
    }

    public final void a(int i4) {
        if (n()) {
            if (i4 == 1) {
                this.f7588t = 3;
                this.f7582n.a(this);
            } else {
                if (i4 != 2) {
                    if (i4 == 3 && this.f7588t == 4) {
                        this.f7588t = 3;
                        c(new m());
                        return;
                    }
                    return;
                }
                a(false);
            }
        }
    }

    public final void a(Exception exc) {
        c(exc);
    }

    private void a(Object obj, Object obj2) {
        if (obj == this.f7577C) {
            if (this.f7588t == 2 || n()) {
                this.f7577C = null;
                if (obj2 instanceof Exception) {
                    this.f7582n.a((Exception) obj2);
                    return;
                }
                try {
                    this.f7581m.b((byte[]) obj2);
                    this.f7582n.a();
                } catch (Exception e9) {
                    this.f7582n.a(e9);
                }
            }
        }
    }

    public final boolean b(byte[] bArr) {
        return Arrays.equals(this.f7594z, bArr);
    }

    private void b(Object obj, Object obj2) {
        if (obj == this.f7576B && n()) {
            this.f7576B = null;
            if (obj2 instanceof Exception) {
                b((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f7584p == 3) {
                    this.f7581m.a(this.f7575A, bArr);
                    this.f7586r.c();
                    return;
                }
                byte[] a9 = this.f7581m.a(this.f7594z, bArr);
                int i4 = this.f7584p;
                if ((i4 == 2 || (i4 == 0 && this.f7575A != null)) && a9 != null && a9.length != 0) {
                    this.f7575A = a9;
                }
                this.f7588t = 4;
                this.f7586r.a();
            } catch (Exception e9) {
                b(e9);
            }
        }
    }

    private void a(boolean z6) {
        int i4 = this.f7584p;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3 && k()) {
                    a(3, z6);
                    return;
                }
                return;
            }
            if (this.f7575A == null) {
                a(2, z6);
                return;
            } else {
                if (k()) {
                    a(2, z6);
                    return;
                }
                return;
            }
        }
        if (this.f7575A == null) {
            a(1, z6);
            return;
        }
        if (this.f7588t == 4 || k()) {
            long l9 = l();
            if (this.f7584p == 0 && l9 <= 60) {
                Log.d(i, "Offline license has expired or will expire soon. Remaining seconds: ".concat(String.valueOf(l9)));
                a(2, z6);
            } else if (l9 <= 0) {
                c(new m());
            } else {
                this.f7588t = 4;
                this.f7586r.b();
            }
        }
    }

    private void b(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.f7582n.a(this);
        } else {
            c(exc);
        }
    }

    public static /* synthetic */ void b(b bVar, Object obj, Object obj2) {
        if (obj == bVar.f7576B && bVar.n()) {
            bVar.f7576B = null;
            if (obj2 instanceof Exception) {
                bVar.b((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (bVar.f7584p == 3) {
                    bVar.f7581m.a(bVar.f7575A, bArr);
                    bVar.f7586r.c();
                    return;
                }
                byte[] a9 = bVar.f7581m.a(bVar.f7594z, bArr);
                int i4 = bVar.f7584p;
                if ((i4 == 2 || (i4 == 0 && bVar.f7575A != null)) && a9 != null && a9.length != 0) {
                    bVar.f7575A = a9;
                }
                bVar.f7588t = 4;
                bVar.f7586r.a();
            } catch (Exception e9) {
                bVar.b(e9);
            }
        }
    }

    private void a(int i4, boolean z6) {
        String str;
        byte[] bArr;
        String str2;
        byte[] bArr2 = i4 == 3 ? this.f7575A : this.f7594z;
        e.a aVar = this.f7583o;
        if (aVar != null) {
            byte[] bArr3 = aVar.f7636c;
            String str3 = aVar.f7635b;
            str = aVar.f7634a;
            str2 = str3;
            bArr = bArr3;
        } else {
            str = null;
            bArr = null;
            str2 = null;
        }
        try {
            Pair create = Pair.create(this.f7581m.a(bArr2, bArr, str2, i4, this.f7585q), str);
            this.f7576B = create;
            this.f7591w.a(1, create, z6);
        } catch (Exception e9) {
            b(e9);
        }
    }

    public static /* synthetic */ void a(b bVar, Object obj, Object obj2) {
        if (obj == bVar.f7577C) {
            if (bVar.f7588t == 2 || bVar.n()) {
                bVar.f7577C = null;
                if (obj2 instanceof Exception) {
                    bVar.f7582n.a((Exception) obj2);
                    return;
                }
                try {
                    bVar.f7581m.b((byte[]) obj2);
                    bVar.f7582n.a();
                } catch (Exception e9) {
                    bVar.f7582n.a(e9);
                }
            }
        }
    }
}
