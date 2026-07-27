package u1;

import java.io.File;
import java.util.List;
import s1.InterfaceC4992e;
import y1.C5243r;
import y1.InterfaceC5244s;

/* renamed from: u1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5103c implements InterfaceC5106f, com.bumptech.glide.load.data.c {

    /* renamed from: A, reason: collision with root package name */
    public volatile C5243r f41062A;

    /* renamed from: B, reason: collision with root package name */
    public File f41063B;

    /* renamed from: n, reason: collision with root package name */
    public final List f41064n;

    /* renamed from: u, reason: collision with root package name */
    public final g f41065u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC5105e f41066v;

    /* renamed from: w, reason: collision with root package name */
    public int f41067w = -1;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4992e f41068x;

    /* renamed from: y, reason: collision with root package name */
    public List f41069y;

    /* renamed from: z, reason: collision with root package name */
    public int f41070z;

    public C5103c(List list, g gVar, InterfaceC5105e interfaceC5105e) {
        this.f41064n = list;
        this.f41065u = gVar;
        this.f41066v = interfaceC5105e;
    }

    @Override // u1.InterfaceC5106f
    public final boolean b() {
        while (true) {
            List list = this.f41069y;
            boolean z8 = false;
            if (list != null && this.f41070z < list.size()) {
                this.f41062A = null;
                while (!z8 && this.f41070z < this.f41069y.size()) {
                    List list2 = this.f41069y;
                    int i = this.f41070z;
                    this.f41070z = i + 1;
                    InterfaceC5244s interfaceC5244s = (InterfaceC5244s) list2.get(i);
                    File file = this.f41063B;
                    g gVar = this.f41065u;
                    this.f41062A = interfaceC5244s.b(file, gVar.f41077e, gVar.f41078f, gVar.i);
                    if (this.f41062A != null && this.f41065u.c(this.f41062A.f41859c.a()) != null) {
                        this.f41062A.f41859c.e(this.f41065u.f41086o, this);
                        z8 = true;
                    }
                }
                return z8;
            }
            int i4 = this.f41067w + 1;
            this.f41067w = i4;
            if (i4 >= this.f41064n.size()) {
                return false;
            }
            InterfaceC4992e interfaceC4992e = (InterfaceC4992e) this.f41064n.get(this.f41067w);
            g gVar2 = this.f41065u;
            File d2 = gVar2.f41080h.a().d(new C5104d(interfaceC4992e, gVar2.f41085n));
            this.f41063B = d2;
            if (d2 != null) {
                this.f41068x = interfaceC4992e;
                this.f41069y = this.f41065u.f41075c.a().f(d2);
                this.f41070z = 0;
            }
        }
    }

    @Override // u1.InterfaceC5106f
    public final void cancel() {
        C5243r c5243r = this.f41062A;
        if (c5243r != null) {
            c5243r.f41859c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void d(Exception exc) {
        this.f41066v.c(this.f41068x, exc, this.f41062A.f41859c, 3);
    }

    @Override // com.bumptech.glide.load.data.c
    public final void g(Object obj) {
        this.f41066v.a(this.f41068x, obj, this.f41062A.f41859c, 3, this.f41068x);
    }
}
