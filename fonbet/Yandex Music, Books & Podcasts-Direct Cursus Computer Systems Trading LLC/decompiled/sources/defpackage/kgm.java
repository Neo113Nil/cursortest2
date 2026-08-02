package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class kgm extends p8 {
    public final f9f a;
    public final List b;
    public final Object c;

    public kgm(f9f f9fVar) {
        f9fVar.getClass();
        this.a = f9fVar;
        this.b = c5b.a;
        this.c = btf.a(bwf.b, new ril(23, this));
    }

    @Override // defpackage.p8
    public final f9f c() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return (mhp) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }

    public kgm(lm4 lm4Var, Annotation[] annotationArr) {
        this(lm4Var);
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.b = asList;
    }
}
