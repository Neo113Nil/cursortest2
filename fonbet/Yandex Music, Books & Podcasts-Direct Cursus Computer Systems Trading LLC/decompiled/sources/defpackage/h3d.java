package defpackage;

import androidx.glance.appwidget.protobuf.b;

/* loaded from: classes.dex */
public abstract class h3d implements Cloneable {
    public final b a;
    public b b;

    public h3d(b bVar) {
        this.a = bVar;
        if (bVar.f()) {
            xq0.x("Default instance must be immutable.");
            throw null;
        }
        this.b = bVar.h();
    }

    public static void e(Object obj, Object obj2) {
        zym zymVar = zym.c;
        zymVar.getClass();
        zymVar.a(obj.getClass()).d(obj, obj2);
    }

    public final b b() {
        b c = c();
        c.getClass();
        if (b.e(c, true)) {
            return c;
        }
        throw new oit();
    }

    public final b c() {
        boolean f = this.b.f();
        b bVar = this.b;
        if (!f) {
            return bVar;
        }
        bVar.getClass();
        zym zymVar = zym.c;
        zymVar.getClass();
        zymVar.a(bVar.getClass()).a(bVar);
        bVar.g();
        return this.b;
    }

    public final Object clone() {
        h3d h3dVar = (h3d) this.a.b(5);
        h3dVar.b = c();
        return h3dVar;
    }

    public final void d() {
        if (this.b.f()) {
            return;
        }
        b h = this.a.h();
        e(h, this.b);
        this.b = h;
    }
}
