package H1;

import D1.C0299d;
import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import u1.l;
import w1.w;

/* loaded from: classes.dex */
public final class d implements l {

    /* renamed from: b, reason: collision with root package name */
    public final l f1206b;

    public d(l lVar) {
        P1.g.c(lVar, "Argument must not be null");
        this.f1206b = lVar;
    }

    @Override // u1.l
    public final w a(Context context, w wVar, int i, int i4) {
        c cVar = (c) wVar.get();
        w c0299d = new C0299d(((h) cVar.f1199n.f644b).f1226l, com.bumptech.glide.c.a(context).f24159n);
        l lVar = this.f1206b;
        w a9 = lVar.a(context, c0299d, i, i4);
        if (!c0299d.equals(a9)) {
            c0299d.a();
        }
        ((h) cVar.f1199n.f644b).c(lVar, (Bitmap) a9.get());
        return wVar;
    }

    @Override // u1.InterfaceC5066e
    public final void b(MessageDigest messageDigest) {
        this.f1206b.b(messageDigest);
    }

    @Override // u1.InterfaceC5066e
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f1206b.equals(((d) obj).f1206b);
        }
        return false;
    }

    @Override // u1.InterfaceC5066e
    public final int hashCode() {
        return this.f1206b.hashCode();
    }
}
