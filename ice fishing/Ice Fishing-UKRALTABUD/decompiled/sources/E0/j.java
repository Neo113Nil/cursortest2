package E0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class j implements f, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final int f307f;

    public j(int i2) {
        this.f307f = i2;
    }

    @Override // E0.f
    public final int g() {
        return this.f307f;
    }

    public final String toString() {
        q.f313a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        i.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
