package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class fm4 extends ot0 {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ Class m;
    public final /* synthetic */ AccessibleObject n;

    public fm4(Constructor constructor, Class cls) {
        this.n = constructor;
        this.m = cls;
    }

    @Override // defpackage.ot0
    public final Object N() {
        switch (this.l) {
            case 0:
                return ((Constructor) this.n).newInstance(null);
            default:
                return ((Method) this.n).invoke(null, this.m, Object.class);
        }
    }

    public final String toString() {
        switch (this.l) {
        }
        return this.m.getName();
    }

    public fm4(Method method, Class cls) {
        this.n = method;
        this.m = cls;
    }
}
