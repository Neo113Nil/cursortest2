package androidx.compose.ui.platform;

import androidx.compose.ui.unit.DensityWithConverter;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import com.squareup.util.cash.Countries;

/* loaded from: classes3.dex */
public final class DerivedSize {
    public static final DerivedSize Zero = new DerivedSize(0, 0);
    public final long dpSize;
    public final long pxSize;

    public abstract class Companion {
        /* renamed from: fromPxSize-viCIZxY, reason: not valid java name */
        public static DerivedSize m928fromPxSizeviCIZxY(DensityWithConverter densityWithConverter) {
            return new DerivedSize(0L, densityWithConverter.mo234toDpSizekrfVVM(Countries.m3991toSizeozmzZPI(0L)));
        }

        public static final String passkeyErrorMessage(Throwable th) {
            String message = th.getMessage();
            return message == null ? th.getClass().getSimpleName() : message;
        }
    }

    public DerivedSize(long j, long j2) {
        this.pxSize = j;
        this.dpSize = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedSize)) {
            return false;
        }
        DerivedSize derivedSize = (DerivedSize) obj;
        return IntSize.m1055equalsimpl0(this.pxSize, derivedSize.pxSize) && DpSize.m1042equalsimpl0(this.dpSize, derivedSize.dpSize);
    }

    /* renamed from: getDpSize-MYxV2XQ, reason: not valid java name */
    public final long m926getDpSizeMYxV2XQ() {
        return this.dpSize;
    }

    /* renamed from: getPxSize-YbymL2g, reason: not valid java name */
    public final long m927getPxSizeYbymL2g() {
        return this.pxSize;
    }

    public final int hashCode() {
        return Long.hashCode(this.dpSize) + (Long.hashCode(this.pxSize) * 31);
    }
}
