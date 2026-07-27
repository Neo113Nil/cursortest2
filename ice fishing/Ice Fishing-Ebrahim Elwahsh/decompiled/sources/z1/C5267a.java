package z1;

import com.bumptech.glide.load.data.j;
import i8.m;
import java.util.ArrayDeque;
import s1.g;
import s1.h;
import y1.C5234i;
import y1.C5241p;
import y1.C5242q;
import y1.C5243r;
import y1.InterfaceC5244s;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5267a implements InterfaceC5244s {

    /* renamed from: b, reason: collision with root package name */
    public static final g f42132b = g.a(Integer.valueOf(com.anythink.basead.exoplayer.d.f6921c), "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final m f42133a;

    public C5267a(m mVar) {
        this.f42133a = mVar;
    }

    @Override // y1.InterfaceC5244s
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // y1.InterfaceC5244s
    public final C5243r b(Object obj, int i, int i4, h hVar) {
        C5234i c5234i = (C5234i) obj;
        m mVar = this.f42133a;
        if (mVar != null) {
            C5242q a9 = C5242q.a(c5234i);
            C5241p c5241p = (C5241p) mVar.f38384n;
            Object b9 = c5241p.b(a9);
            ArrayDeque arrayDeque = C5242q.f41855b;
            synchronized (arrayDeque) {
                arrayDeque.offer(a9);
            }
            C5234i c5234i2 = (C5234i) b9;
            if (c5234i2 == null) {
                c5241p.f(C5242q.a(c5234i), c5234i);
            } else {
                c5234i = c5234i2;
            }
        }
        return new C5243r(c5234i, new j(c5234i, ((Integer) hVar.c(f42132b)).intValue()));
    }
}
