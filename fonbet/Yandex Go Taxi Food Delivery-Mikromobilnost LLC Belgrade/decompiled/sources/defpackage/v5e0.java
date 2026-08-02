package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes13.dex */
public final class v5e0 extends i9 {
    public final lfx a;
    public final List b;
    public final i3y c;

    public v5e0(lfx lfxVar) {
        this.a = lfxVar;
        this.b = EmptyList.a;
        this.c = a.b(LazyThreadSafetyMode.PUBLICATION, new r0d0(13, this));
    }

    @Override // defpackage.i9
    public final lfx c() {
        return this.a;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }

    public v5e0(g0c g0cVar, Annotation[] annotationArr) {
        this(g0cVar);
        this.b = Arrays.asList(annotationArr);
    }
}
