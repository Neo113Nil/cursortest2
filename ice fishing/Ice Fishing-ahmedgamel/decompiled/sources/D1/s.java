package D1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
import x1.InterfaceC5183a;

/* loaded from: classes.dex */
public final class s implements u1.l {

    /* renamed from: b, reason: collision with root package name */
    public final u1.l f571b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f572c;

    public s(u1.l lVar, boolean z6) {
        this.f571b = lVar;
        this.f572c = z6;
    }

    @Override // u1.l
    public final w1.w a(Context context, w1.w wVar, int i, int i4) {
        InterfaceC5183a interfaceC5183a = com.bumptech.glide.c.a(context).f24159n;
        Drawable drawable = (Drawable) wVar.get();
        C0299d b9 = r.b(interfaceC5183a, drawable, i, i4);
        if (b9 != null) {
            w1.w a9 = this.f571b.a(context, b9, i, i4);
            if (!a9.equals(b9)) {
                return new C0299d(context.getResources(), a9);
            }
            a9.a();
            return wVar;
        }
        if (!this.f572c) {
            return wVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // u1.InterfaceC5066e
    public final void b(MessageDigest messageDigest) {
        this.f571b.b(messageDigest);
    }

    @Override // u1.InterfaceC5066e
    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f571b.equals(((s) obj).f571b);
        }
        return false;
    }

    @Override // u1.InterfaceC5066e
    public final int hashCode() {
        return this.f571b.hashCode();
    }
}
