package androidx.versionedparcelable;

import java.util.List;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class NovaLayerResourceSyntaxAOxoVvV45udRQy0hmP42120637269487 {
    public static final Object[] ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new Object[0];
    public static final ZenithPathServiceProcessorMD9NM1tdHbXGVjreC512508001691257 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new ZenithPathServiceProcessorMD9NM1tdHbXGVjreC512508001691257(0);

    public static final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }

    public static final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }
}
