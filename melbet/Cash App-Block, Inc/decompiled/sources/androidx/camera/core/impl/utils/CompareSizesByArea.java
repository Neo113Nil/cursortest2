package androidx.camera.core.impl.utils;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class CompareSizesByArea implements Comparator {
    public final boolean mReverse;

    public CompareSizesByArea(boolean z) {
        this.mReverse = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.mReverse ? signum * (-1) : signum;
    }
}
