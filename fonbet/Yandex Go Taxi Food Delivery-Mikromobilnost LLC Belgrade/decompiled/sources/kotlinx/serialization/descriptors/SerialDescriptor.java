package kotlinx.serialization.descriptors;

import defpackage.jl40;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public interface SerialDescriptor {
    default boolean b() {
        return false;
    }

    int c(String str);

    SerialDescriptor d(int i);

    int e();

    String f(int i);

    List g(int i);

    default List getAnnotations() {
        return EmptyList.a;
    }

    jl40 getKind();

    String h();

    boolean i(int i);

    default boolean isInline() {
        return false;
    }
}
