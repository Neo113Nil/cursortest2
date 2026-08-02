package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public class g3d implements uzh {
    public final o3d a;
    public o3d b;

    public g3d(o3d o3dVar) {
        this.a = o3dVar;
        if (o3dVar.isMutable()) {
            xq0.x("Default instance must be immutable.");
            throw null;
        }
        this.b = o3dVar.newMutableInstance();
    }

    public static void f(Object obj, Object obj2) {
        yym yymVar = yym.c;
        yymVar.getClass();
        yymVar.a(obj.getClass()).d(obj, obj2);
    }

    public static void g(List list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        for (int size = list.size() - 1; size >= i; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    public final o3d b() {
        o3d c = c();
        if (c.isInitialized()) {
            return c;
        }
        throw new qit();
    }

    public final o3d c() {
        boolean isMutable = this.b.isMutable();
        o3d o3dVar = this.b;
        if (!isMutable) {
            return o3dVar;
        }
        o3dVar.makeImmutable();
        return this.b;
    }

    public final Object clone() {
        g3d newBuilderForType = this.a.newBuilderForType();
        newBuilderForType.b = c();
        return newBuilderForType;
    }

    public final void d() {
        if (this.b.isMutable()) {
            return;
        }
        o3d newMutableInstance = this.a.newMutableInstance();
        f(newMutableInstance, this.b);
        this.b = newMutableInstance;
    }

    public final void e(o3d o3dVar) {
        if (this.a.equals(o3dVar)) {
            return;
        }
        d();
        f(this.b, o3dVar);
    }

    @Override // defpackage.xzh
    public final vzh getDefaultInstanceForType() {
        throw null;
    }

    @Override // defpackage.xzh
    public final boolean isInitialized() {
        boolean c;
        c = o3d.c(this.b, false);
        return c;
    }
}
