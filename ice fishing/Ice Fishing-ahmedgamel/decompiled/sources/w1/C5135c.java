package w1;

import java.io.File;
import java.util.List;
import u1.InterfaceC5066e;

/* renamed from: w1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5135c implements InterfaceC5138f, com.bumptech.glide.load.data.c {

    /* renamed from: A, reason: collision with root package name */
    public volatile A1.w f41431A;

    /* renamed from: B, reason: collision with root package name */
    public File f41432B;

    /* renamed from: n, reason: collision with root package name */
    public final List f41433n;

    /* renamed from: u, reason: collision with root package name */
    public final g f41434u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC5137e f41435v;

    /* renamed from: w, reason: collision with root package name */
    public int f41436w = -1;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC5066e f41437x;

    /* renamed from: y, reason: collision with root package name */
    public List f41438y;

    /* renamed from: z, reason: collision with root package name */
    public int f41439z;

    public C5135c(List list, g gVar, InterfaceC5137e interfaceC5137e) {
        this.f41433n = list;
        this.f41434u = gVar;
        this.f41435v = interfaceC5137e;
    }

    @Override // w1.InterfaceC5138f
    public final boolean a() {
        while (true) {
            List list = this.f41438y;
            boolean z6 = false;
            if (list != null && this.f41439z < list.size()) {
                this.f41431A = null;
                while (!z6 && this.f41439z < this.f41438y.size()) {
                    List list2 = this.f41438y;
                    int i = this.f41439z;
                    this.f41439z = i + 1;
                    A1.x xVar = (A1.x) list2.get(i);
                    File file = this.f41432B;
                    g gVar = this.f41434u;
                    this.f41431A = xVar.b(file, gVar.f41446e, gVar.f41447f, gVar.i);
                    if (this.f41431A != null && this.f41434u.c(this.f41431A.f92c.a()) != null) {
                        this.f41431A.f92c.e(this.f41434u.f41455o, this);
                        z6 = true;
                    }
                }
                return z6;
            }
            int i4 = this.f41436w + 1;
            this.f41436w = i4;
            if (i4 >= this.f41433n.size()) {
                return false;
            }
            InterfaceC5066e interfaceC5066e = (InterfaceC5066e) this.f41433n.get(this.f41436w);
            g gVar2 = this.f41434u;
            File a9 = gVar2.f41449h.a().a(new C5136d(interfaceC5066e, gVar2.f41454n));
            this.f41432B = a9;
            if (a9 != null) {
                this.f41437x = interfaceC5066e;
                this.f41438y = this.f41434u.f41444c.a().f(a9);
                this.f41439z = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void c(Exception exc) {
        this.f41435v.b(this.f41437x, exc, this.f41431A.f92c, 3);
    }

    @Override // w1.InterfaceC5138f
    public final void cancel() {
        A1.w wVar = this.f41431A;
        if (wVar != null) {
            wVar.f92c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        this.f41435v.c(this.f41437x, obj, this.f41431A.f92c, 3, this.f41437x);
    }
}
