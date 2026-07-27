package E0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class j implements f, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final int f308e;

    public j(int i2) {
        this.f308e = i2;
    }

    @Override // E0.f
    public final int g() {
        return this.f308e;
    }

    public final String toString() {
        q.f314a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        i.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
