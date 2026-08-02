package androidx.camera.camera2.impl;

import android.util.Size;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* loaded from: classes3.dex */
public final class MeteringRepeatingKt$getProperPreviewSize$$inlined$sortBy$1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(size.getWidth() * size.getHeight()), Long.valueOf(size2.getWidth() * size2.getHeight()));
    }
}
