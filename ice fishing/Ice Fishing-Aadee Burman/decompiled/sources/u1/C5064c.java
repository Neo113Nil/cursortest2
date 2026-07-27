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
    public volatile C5222q f41045A;

    /* renamed from: B, reason: collision with root package name */
    public File f41046B;

    /* renamed from: n, reason: collision with root package name */
    public final List f41047n;

    /* renamed from: u, reason: collision with root package name */
    public final g f41048u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC5066e f41049v;

    /* renamed from: w, reason: collision with root package name */
    public int f41050w = -1;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4970e f41051x;

    /* renamed from: y, reason: collision with root package name */
    public List f41052y;

    /* renamed from: z, reason: collision with root package name */
    public int f41053z;

    public C5064c(List list, g gVar, InterfaceC5066e interfaceC5066e) {
        this.f41047n = list;
        this.f41048u = gVar;
        this.f41049v = interfaceC5066e;
    }

    @Override // u1.InterfaceC5067f
    public final boolean b() {
        while (true) {
            List list = this.f41052y;
            boolean z3 = false;
            if (list != null && this.f41053z < list.size()) {
                this.f41045A = null;
                while (!z3 && this.f41053z < this.f41052y.size()) {
                    List list2 = this.f41052y;
                    int i = this.f41053z;
                    this.f41053z = i + 1;
                    InterfaceC5223r interfaceC5223r = (InterfaceC5223r) list2.get(i);
                    File file = this.f41046B;
                    g gVar = this.f41048u;
                    this.f41045A = interfaceC5223r.b(file, gVar.f41060e, gVar.f41061f, gVar.i);
                    if (this.f41045A != null && this.f41048u.c(this.f41045A.f41819c.a()) != null) {
                        this.f41045A.f41819c.e(this.f41048u.f41069o, this);
                        z3 = true;
                    }
                }
                return z3;
            }
            int i6 = this.f41050w + 1;
            this.f41050w = i6;
            if (i6 >= this.f41047n.size()) {
                return false;
            }
            InterfaceC4970e interfaceC4970e = (InterfaceC4970e) this.f41047n.get(this.f41050w);
            g gVar2 = this.f41048u;
            File m4 = gVar2.f41063h.a().m(new C5065d(interfaceC4970e, gVar2.f41068n));
            this.f41046B = m4;
            if (m4 != null) {
                this.f41051x = interfaceC4970e;
                this.f41052y = this.f41048u.f41058c.a().f(m4);
                this.f41053z = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void c(Exception exc) {
        this.f41049v.c(this.f41051x, exc, this.f41045A.f41819c, 3);
    }

    @Override // u1.InterfaceC5067f
    public final void cancel() {
        C5222q c5222q = this.f41045A;
        if (c5222q != null) {
            c5222q.f41819c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        this.f41049v.a(this.f41051x, obj, this.f41045A.f41819c, 3, this.f41051x);
    }
}
