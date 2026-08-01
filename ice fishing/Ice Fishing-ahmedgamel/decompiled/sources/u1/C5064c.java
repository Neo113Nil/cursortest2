package u1;

import java.io.File;
import java.util.List;
import s1.InterfaceC4970e;
import y1.C5222q;
import y1.InterfaceC5223r;

/* renamed from: u1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5064c implements InterfaceC5067f, com.bumptech.glide.load.data.c {

    /* renamed from: A, reason: collision with root package name */
    public volatile C5222q f41048A;

    /* renamed from: B, reason: collision with root package name */
    public File f41049B;

    /* renamed from: n, reason: collision with root package name */
    public final List f41050n;

    /* renamed from: u, reason: collision with root package name */
    public final g f41051u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC5066e f41052v;

    /* renamed from: w, reason: collision with root package name */
    public int f41053w = -1;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4970e f41054x;

    /* renamed from: y, reason: collision with root package name */
    public List f41055y;

    /* renamed from: z, reason: collision with root package name */
    public int f41056z;

    public C5064c(List list, g gVar, InterfaceC5066e interfaceC5066e) {
        this.f41050n = list;
        this.f41051u = gVar;
        this.f41052v = interfaceC5066e;
    }

    @Override // u1.InterfaceC5067f
    public final boolean b() {
        while (true) {
            List list = this.f41055y;
            boolean z3 = false;
            if (list != null && this.f41056z < list.size()) {
                this.f41048A = null;
                while (!z3 && this.f41056z < this.f41055y.size()) {
                    List list2 = this.f41055y;
                    int i = this.f41056z;
                    this.f41056z = i + 1;
                    InterfaceC5223r interfaceC5223r = (InterfaceC5223r) list2.get(i);
                    File file = this.f41049B;
                    g gVar = this.f41051u;
                    this.f41048A = interfaceC5223r.b(file, gVar.f41063e, gVar.f41064f, gVar.i);
                    if (this.f41048A != null && this.f41051u.c(this.f41048A.f41822c.a()) != null) {
                        this.f41048A.f41822c.e(this.f41051u.f41072o, this);
                        z3 = true;
                    }
                }
                return z3;
            }
            int i6 = this.f41053w + 1;
            this.f41053w = i6;
            if (i6 >= this.f41050n.size()) {
                return false;
            }
            InterfaceC4970e interfaceC4970e = (InterfaceC4970e) this.f41050n.get(this.f41053w);
            g gVar2 = this.f41051u;
            File m4 = gVar2.f41066h.a().m(new C5065d(interfaceC4970e, gVar2.f41071n));
            this.f41049B = m4;
            if (m4 != null) {
                this.f41054x = interfaceC4970e;
                this.f41055y = this.f41051u.f41061c.a().f(m4);
                this.f41056z = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void c(Exception exc) {
        this.f41052v.c(this.f41054x, exc, this.f41048A.f41822c, 3);
    }

    @Override // u1.InterfaceC5067f
    public final void cancel() {
        C5222q c5222q = this.f41048A;
        if (c5222q != null) {
            c5222q.f41822c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        this.f41052v.a(this.f41054x, obj, this.f41048A.f41822c, 3, this.f41054x);
    }
}
