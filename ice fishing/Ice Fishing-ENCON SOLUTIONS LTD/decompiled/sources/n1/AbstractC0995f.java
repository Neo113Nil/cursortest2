package n1;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;

/* renamed from: n1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0995f extends AbstractC0991b implements kotlin.jvm.internal.f {

    /* renamed from: d, reason: collision with root package name */
    public final int f8217d;

    public AbstractC0995f(int i2, l1.d dVar) {
        super(dVar);
        this.f8217d = i2;
    }

    @Override // kotlin.jvm.internal.f
    public final int getArity() {
        return this.f8217d;
    }

    @Override // n1.AbstractC0991b
    public final String toString() {
        if (this.f8212a != null) {
            return super.toString();
        }
        q.f8077a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        i.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
