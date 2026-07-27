package B1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
import v1.InterfaceC5104a;

/* loaded from: classes.dex */
public final class s implements s1.l {

    /* renamed from: b, reason: collision with root package name */
    public final s1.l f157b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f158c;

    public s(s1.l lVar, boolean z3) {
        this.f157b = lVar;
        this.f158c = z3;
    }

    @Override // s1.InterfaceC4970e
    public final void a(MessageDigest messageDigest) {
        this.f157b.a(messageDigest);
    }

    @Override // s1.l
    public final u1.x b(Context context, u1.x xVar, int i, int i6) {
        InterfaceC5104a interfaceC5104a = com.bumptech.glide.c.a(context).f23372n;
        Drawable drawable = (Drawable) xVar.get();
        C0262d b9 = r.b(interfaceC5104a, drawable, i, i6);
        if (b9 != null) {
            u1.x b10 = this.f157b.b(context, b9, i, i6);
            if (!b10.equals(b9)) {
                return new C0262d(context.getResources(), b10);
            }
            b10.a();
            return xVar;
        }
        if (!this.f158c) {
            return xVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // s1.InterfaceC4970e
    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f157b.equals(((s) obj).f157b);
        }
        return false;
    }

    @Override // s1.InterfaceC4970e
    public final int hashCode() {
        return this.f157b.hashCode();
    }
}
