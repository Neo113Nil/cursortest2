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
    private static final int f6786j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static final int f6787k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f6788l = 60;

    /* renamed from: A, reason: collision with root package name */
    private byte[] f6789A;

    /* renamed from: B, reason: collision with root package name */
    private Object f6790B;

    /* renamed from: C, reason: collision with root package name */
    private Object f6791C;

    /* renamed from: a, reason: collision with root package name */
    final n f6792a;

    /* renamed from: b, reason: collision with root package name */
    final UUID f6793b;

    /* renamed from: c, reason: collision with root package name */
    final b<T>.HandlerC0018b f6794c;

    /* renamed from: m, reason: collision with root package name */
    private final j<T> f6795m;

    /* renamed from: n, reason: collision with root package name */
    private final c<T> f6796n;

    /* renamed from: o, reason: collision with root package name */
    private final e.a f6797o;

    /* renamed from: p, reason: collision with root package name */
    private final int f6798p;

    /* renamed from: q, reason: collision with root package name */
    private final HashMap<String, String> f6799q;

    /* renamed from: r, reason: collision with root package name */
    private final c.a f6800r;

    /* renamed from: s, reason: collision with root package name */
    private final int f6801s;

    /* renamed from: t, reason: collision with root package name */
    private int f6802t;

    /* renamed from: u, reason: collision with root package name */
    private int f6803u;

    /* renamed from: v, reason: collision with root package name */
    private HandlerThread f6804v;

    /* renamed from: w, reason: collision with root package name */
    private b<T>.a f6805w;

    /* renamed from: x, reason: collision with root package name */
    private T f6806x;

    /* renamed from: y, reason: collision with root package name */
    private f.a f6807y;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f6808z;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(int i, Object obj, boolean z3) {
            obtainMessage(i, z3 ? 1 : 0, 0, obj).sendToTarget();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object obj;
            int i;
            int i6;
            Object obj2 = message.obj;
            try {
                int i9 = message.what;
                if (i9 == 0) {
                    obj = b.this.f6792a.a();
                } else {
                    if (i9 != 1) {
                        throw new RuntimeException();
                    }
                    Object obj3 = ((Pair) obj2).first;
                    obj = b.this.f6792a.b();
                }
            } catch (Exception e9) {
                if (message.arg1 == 1 && (i6 = (i = message.arg2) + 1) <= b.this.f6801s) {
                    Message obtain = Message.obtain(message);
                    obtain.arg2 = i6;
                    sendMessageDelayed(obtain, Math.min(i * 1000, 5000));
                    return;
                }
                obj = e9;
            }
            b.this.f6794c.obtainMessage(message.what, Pair.create(obj2, obj)).sendToTarget();
        }

        private boolean a(Message message) {
            int i;
            int i6;
            if (message.arg1 != 1 || (i6 = (i = message.arg2) + 1) > b.this.f6801s) {
                return false;
            }
            Message obtain = Message.obtain(message);
            obtain.arg2 = i6;
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

    public b(UUID uuid, j<T> jVar, c<T> cVar, e.a aVar, int i6, byte[] bArr, HashMap<String, String> hashMap, n nVar, Looper looper, c.a aVar2, int i9) {
        this.f6793b = uuid;
        this.f6796n = cVar;
        this.f6795m = jVar;
        this.f6798p = i6;
        this.f6789A = bArr;
        this.f6797o = bArr != null ? null : aVar;
        this.f6799q = hashMap;
        this.f6792a = nVar;
        this.f6801s = i9;
        this.f6800r = aVar2;
        this.f6802t = 2;
        this.f6794c = new HandlerC0018b(looper);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.f6804v = handlerThread;
        handlerThread.start();
        this.f6805w = new a(this.f6804v.getLooper());
    }

    private boolean j() {
        if (n()) {
            return true;
        }
        try {
            byte[] a9 = this.f6795m.a();
            this.f6808z = a9;
            this.f6806x = this.f6795m.d(a9);
            this.f6802t = 3;
            return true;
        } catch (Exception e9) {
            c(e9);
            return false;
        }
    }

    private boolean k() {
        try {
            this.f6795m.b(this.f6808z, this.f6789A);
            return true;
        } catch (Exception e9) {
            Log.e(i, "Error trying to restore Widevine keys.", e9);
            c(e9);
            return false;
        }
    }

    private long l() {
        if (!com.anythink.basead.exoplayer.b.bk.equals(this.f6793b)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> a9 = p.a(this);
        return Math.min(((Long) a9.first).longValue(), ((Long) a9.second).longValue());
    }

    private void m() {
        if (this.f6802t == 4) {
            this.f6802t = 3;
            c(new m());
        }
    }

    private boolean n() {
        int i6 = this.f6802t;
        return i6 == 3 || i6 == 4;
    }

    public final boolean b() {
        int i6 = this.f6803u - 1;
        this.f6803u = i6;
        if (i6 != 0) {
            return false;
        }
        this.f6802t = 0;
        this.f6794c.removeCallbacksAndMessages(null);
        this.f6805w.removeCallbacksAndMessages(null);
        this.f6805w = null;
        this.f6804v.quit();
        this.f6804v = null;
        this.f6806x = null;
        this.f6807y = null;
        this.f6790B = null;
        this.f6791C = null;
        byte[] bArr = this.f6808z;
        if (bArr != null) {
            this.f6795m.a(bArr);
            this.f6808z = null;
        }
        return true;
    }

    public final void c() {
        j.h b9 = this.f6795m.b();
        this.f6791C = b9;
        this.f6805w.a(0, b9, true);
    }

    public final void d() {
        if (j()) {
            a(true);
        }
    }

    @Override // com.anythink.basead.exoplayer.d.f
    public final int e() {
        return this.f6802t;
    }

    @Override // com.anythink.basead.exoplayer.d.f
    public final f.a f() {
        if (this.f6802t == 1) {
            return this.f6807y;
        }
        return null;
    }

    @Override // com.anythink.basead.exoplayer.d.f
    public final T g() {
        return this.f6806x;
    }

    @Override // com.anythink.basead.exoplayer.d.f
    public final Map<String, String> h() {
        byte[] bArr = this.f6808z;
        if (bArr == null) {
            return null;
        }
        return this.f6795m.c(bArr);
    }

    @Override // com.anythink.basead.exoplayer.d.f
    public final byte[] i() {
        return this.f6789A;
    }

    public final void a() {
        int i6 = this.f6803u + 1;
        this.f6803u = i6;
        if (i6 == 1 && this.f6802t != 1 && j()) {
            a(true);
        }
    }

    private void c(Exception exc) {
        this.f6807y = new f.a(exc);
        this.f6800r.a(exc);
        if (this.f6802t != 4) {
            this.f6802t = 1;
        }
    }

    public final boolean a(byte[] bArr) {
        e.a aVar = this.f6797o;
        return Arrays.equals(aVar != null ? aVar.f6850c : null, bArr);
    }

    public final void a(int i6) {
        if (n()) {
            if (i6 == 1) {
                this.f6802t = 3;
                this.f6796n.a(this);
            } else {
                if (i6 != 2) {
                    if (i6 == 3 && this.f6802t == 4) {
                        this.f6802t = 3;
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
        if (obj == this.f6791C) {
            if (this.f6802t == 2 || n()) {
                this.f6791C = null;
                if (obj2 instanceof Exception) {
                    this.f6796n.a((Exception) obj2);
                    return;
                }
                try {
                    this.f6795m.b((byte[]) obj2);
                    this.f6796n.a();
                } catch (Exception e9) {
                    this.f6796n.a(e9);
                }
            }
        }
    }

    public final boolean b(byte[] bArr) {
        return Arrays.equals(this.f6808z, bArr);
    }

    private void b(Object obj, Object obj2) {
        if (obj == this.f6790B && n()) {
            this.f6790B = null;
            if (obj2 instanceof Exception) {
                b((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f6798p == 3) {
                    this.f6795m.a(this.f6789A, bArr);
                    this.f6800r.c();
                    return;
                }
                byte[] a9 = this.f6795m.a(this.f6808z, bArr);
                int i6 = this.f6798p;
                if ((i6 == 2 || (i6 == 0 && this.f6789A != null)) && a9 != null && a9.length != 0) {
                    this.f6789A = a9;
                }
                this.f6802t = 4;
                this.f6800r.a();
            } catch (Exception e9) {
                b(e9);
            }
        }
    }

    private void a(boolean z3) {
        int i6 = this.f6798p;
        if (i6 != 0 && i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3 && k()) {
                    a(3, z3);
                    return;
                }
                return;
            }
            if (this.f6789A == null) {
                a(2, z3);
                return;
            } else {
                if (k()) {
                    a(2, z3);
                    return;
                }
                return;
            }
        }
        if (this.f6789A == null) {
            a(1, z3);
            return;
        }
        if (this.f6802t == 4 || k()) {
            long l9 = l();
            if (this.f6798p == 0 && l9 <= 60) {
                Log.d(i, "Offline license has expired or will expire soon. Remaining seconds: ".concat(String.valueOf(l9)));
                a(2, z3);
            } else if (l9 <= 0) {
                c(new m());
            } else {
                this.f6802t = 4;
                this.f6800r.b();
            }
        }
    }

    private void b(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.f6796n.a(this);
        } else {
            c(exc);
        }
    }

    public static /* synthetic */ void b(b bVar, Object obj, Object obj2) {
        if (obj == bVar.f6790B && bVar.n()) {
            bVar.f6790B = null;
            if (obj2 instanceof Exception) {
                bVar.b((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (bVar.f6798p == 3) {
                    bVar.f6795m.a(bVar.f6789A, bArr);
                    bVar.f6800r.c();
                    return;
                }
                byte[] a9 = bVar.f6795m.a(bVar.f6808z, bArr);
                int i6 = bVar.f6798p;
                if ((i6 == 2 || (i6 == 0 && bVar.f6789A != null)) && a9 != null && a9.length != 0) {
                    bVar.f6789A = a9;
                }
                bVar.f6802t = 4;
                bVar.f6800r.a();
            } catch (Exception e9) {
                bVar.b(e9);
            }
        }
    }

    private void a(int i6, boolean z3) {
        String str;
        byte[] bArr;
        String str2;
        byte[] bArr2 = i6 == 3 ? this.f6789A : this.f6808z;
        e.a aVar = this.f6797o;
        if (aVar != null) {
            byte[] bArr3 = aVar.f6850c;
            String str3 = aVar.f6849b;
            str = aVar.f6848a;
            str2 = str3;
            bArr = bArr3;
        } else {
            str = null;
            bArr = null;
            str2 = null;
        }
        try {
            Pair create = Pair.create(this.f6795m.a(bArr2, bArr, str2, i6, this.f6799q), str);
            this.f6790B = create;
            this.f6805w.a(1, create, z3);
        } catch (Exception e9) {
            b(e9);
        }
    }

    public static /* synthetic */ void a(b bVar, Object obj, Object obj2) {
        if (obj == bVar.f6791C) {
            if (bVar.f6802t == 2 || bVar.n()) {
                bVar.f6791C = null;
                if (obj2 instanceof Exception) {
                    bVar.f6796n.a((Exception) obj2);
                    return;
                }
                try {
                    bVar.f6795m.b((byte[]) obj2);
                    bVar.f6796n.a();
                } catch (Exception e9) {
                    bVar.f6796n.a(e9);
                }
            }
        }
    }
}
