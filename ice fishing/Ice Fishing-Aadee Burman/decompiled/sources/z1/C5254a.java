package z1;

import com.bumptech.glide.load.data.j;
import java.util.ArrayDeque;
import s1.g;
import s1.h;
import t2.n;
import y1.C5213h;
import y1.C5220o;
import y1.C5221p;
import y1.C5222q;
import y1.InterfaceC5223r;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5254a implements InterfaceC5223r {

    /* renamed from: b, reason: collision with root package name */
    public static final g f42247b = g.a(Integer.valueOf(com.anythink.basead.exoplayer.d.f6764c), "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final n f42248a;

    public C5254a(n nVar) {
        this.f42248a = nVar;
    }

    @Override // y1.InterfaceC5223r
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // y1.InterfaceC5223r
    public final C5222q b(Object obj, int i, int i6, h hVar) {
        C5213h c5213h = (C5213h) obj;
        n nVar = this.f42248a;
        if (nVar != null) {
            C5221p a9 = C5221p.a(c5213h);
            C5220o c5220o = (C5220o) nVar.f40856a;
            Object a10 = c5220o.a(a9);
            ArrayDeque arrayDeque = C5221p.f41815b;
            synchronized (arrayDeque) {
                arrayDeque.offer(a9);
            }
            C5213h c5213h2 = (C5213h) a10;
            if (c5213h2 == null) {
                c5220o.f(C5221p.a(c5213h), c5213h);
            } else {
                c5213h = c5213h2;
            }
        }
        return new C5222q(c5213h, new j(c5213h, ((Integer) hVar.c(f42247b)).intValue()));
    }
}
