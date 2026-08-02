package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.j;
import com.anythink.expressad.foundation.g.f.k;
import com.anythink.expressad.foundation.g.f.l;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private k f20066a;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList<a> f20068c = new LinkedList<>();

    /* renamed from: b, reason: collision with root package name */
    private int f20067b = 3;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f20069a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f20070b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f20071c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f20072d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f20073e = 4;

        /* renamed from: g, reason: collision with root package name */
        private String f20075g;

        /* renamed from: h, reason: collision with root package name */
        private File f20076h;
        private com.anythink.expressad.foundation.g.f.e<Void> i;

        /* renamed from: j, reason: collision with root package name */
        private com.anythink.expressad.foundation.g.f.d.a f20077j;

        /* renamed from: k, reason: collision with root package name */
        private int f20078k;

        public /* synthetic */ a(b bVar, File file, String str, com.anythink.expressad.foundation.g.f.e eVar, byte b9) {
            this(file, str, (com.anythink.expressad.foundation.g.f.e<Void>) eVar);
        }

        public static /* synthetic */ int c(a aVar) {
            aVar.f20078k = 3;
            return 3;
        }

        private int d() {
            return this.f20078k;
        }

        private boolean e() {
            int i = this.f20078k;
            if (i == 0) {
                this.f20078k = 2;
                b.this.b();
                return true;
            }
            if (i != 1) {
                return false;
            }
            this.f20077j.e();
            this.f20078k = 2;
            b.this.b();
            return true;
        }

        private boolean f() {
            if (this.f20078k != 2) {
                return false;
            }
            this.f20078k = 0;
            b.this.b();
            return true;
        }

        public final boolean a() {
            return this.f20078k == 1;
        }

        private a(b bVar, String str, String str2, com.anythink.expressad.foundation.g.f.e<Void> eVar) {
            this(new File(str), str2, eVar);
        }

        public static /* synthetic */ boolean a(a aVar) {
            if (aVar.f20078k != 0) {
                return false;
            }
            com.anythink.expressad.foundation.g.f.d.a aVar2 = new com.anythink.expressad.foundation.g.f.d.a(aVar.f20076h, aVar.f20075g);
            aVar.f20077j = aVar2;
            aVar2.a((com.anythink.expressad.foundation.g.f.e) aVar.new AnonymousClass1());
            aVar.f20078k = 1;
            b.this.f20066a.a((j) aVar.f20077j);
            return true;
        }

        private boolean c() {
            if (this.f20078k != 0) {
                return false;
            }
            com.anythink.expressad.foundation.g.f.d.a aVar = new com.anythink.expressad.foundation.g.f.d.a(this.f20076h, this.f20075g);
            this.f20077j = aVar;
            aVar.a((com.anythink.expressad.foundation.g.f.e) new AnonymousClass1());
            this.f20078k = 1;
            b.this.f20066a.a((j) this.f20077j);
            return true;
        }

        public final boolean b() {
            int i = this.f20078k;
            if (i == 4 || i == 3) {
                return false;
            }
            if (i == 1) {
                this.f20077j.e();
            }
            this.f20078k = 4;
            b.a(b.this, this);
            return true;
        }

        private a(File file, String str, com.anythink.expressad.foundation.g.f.e<Void> eVar) {
            this.f20076h = file;
            this.i = eVar;
            this.f20075g = str;
        }

        /* renamed from: com.anythink.expressad.foundation.g.f.d.b$a$1, reason: invalid class name */
        public class AnonymousClass1 extends com.anythink.expressad.foundation.g.f.f<Void> {

            /* renamed from: a, reason: collision with root package name */
            boolean f20079a;

            public AnonymousClass1() {
            }

            @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
            public final void a() {
                if (this.f20079a) {
                    return;
                }
                a.c(a.this);
                a.this.i.a();
                a aVar = a.this;
                b.a(b.this, aVar);
            }

            @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
            public final void b() {
                a.this.i.b();
            }

            @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
            public final void c() {
                a.this.i.c();
                this.f20079a = true;
            }

            @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
            public final void a(l lVar) {
                if (this.f20079a) {
                    return;
                }
                a.this.i.a(lVar);
            }

            @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
            public final void a(com.anythink.expressad.foundation.g.f.a.a aVar) {
                if (this.f20079a) {
                    return;
                }
                a.this.i.a(aVar);
            }

            @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
            public final void a(long j6, long j9) {
                a.this.i.a(j6, j9);
            }
        }
    }

    public b(k kVar) {
        this.f20066a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        synchronized (this) {
            try {
                Iterator<a> it = this.f20068c.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (it.next().a()) {
                        i++;
                    }
                }
                if (i >= this.f20067b) {
                    return;
                }
                Iterator<a> it2 = this.f20068c.iterator();
                while (it2.hasNext()) {
                    if (a.a(it2.next()) && (i = i + 1) == this.f20067b) {
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a a(File file, String str, com.anythink.expressad.foundation.g.f.e<Void> eVar) {
        a aVar = new a(this, file, str, eVar, (byte) 0);
        synchronized (this) {
            this.f20068c.add(aVar);
        }
        b();
        return aVar;
    }

    private a a(String str, String str2, com.anythink.expressad.foundation.g.f.e<Void> eVar) {
        return a(new File(str), str2, eVar);
    }

    private void a(a aVar) {
        synchronized (this) {
            this.f20068c.remove(aVar);
        }
        b();
    }

    public final void a() {
        synchronized (this) {
            while (!this.f20068c.isEmpty()) {
                try {
                    this.f20068c.get(0).b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static com.anythink.expressad.foundation.g.f.d.a a(File file, String str) {
        return new com.anythink.expressad.foundation.g.f.d.a(file, str);
    }

    public static /* synthetic */ void a(b bVar, a aVar) {
        synchronized (bVar) {
            bVar.f20068c.remove(aVar);
        }
        bVar.b();
    }
}
