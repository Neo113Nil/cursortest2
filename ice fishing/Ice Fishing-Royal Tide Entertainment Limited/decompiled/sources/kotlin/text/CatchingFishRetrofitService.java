package kotlin.text;

import java.util.Iterator;

/* loaded from: classes.dex */
public class CatchingFishRetrofitService implements Iterable, CatchingFishCardViewFAB {
    public final int CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;
    public final int CatchingFishWorkManager;

    public CatchingFishRetrofitService(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.CatchingFishReduxKtor = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
        }
        this.CatchingFishDaggerWebsocket = i2;
        this.CatchingFishWorkManager = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishRetrofitService)) {
            return false;
        }
        if (isEmpty() && ((CatchingFishRetrofitService) obj).isEmpty()) {
            return true;
        }
        CatchingFishRetrofitService catchingFishRetrofitService = (CatchingFishRetrofitService) obj;
        return this.CatchingFishReduxKtor == catchingFishRetrofitService.CatchingFishReduxKtor && this.CatchingFishDaggerWebsocket == catchingFishRetrofitService.CatchingFishDaggerWebsocket && this.CatchingFishWorkManager == catchingFishRetrofitService.CatchingFishWorkManager;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.CatchingFishReduxKtor * 31) + this.CatchingFishDaggerWebsocket) * 31) + this.CatchingFishWorkManager;
    }

    public boolean isEmpty() {
        int i = this.CatchingFishWorkManager;
        int i2 = this.CatchingFishDaggerWebsocket;
        int i3 = this.CatchingFishReduxKtor;
        return i > 0 ? i3 > i2 : i3 < i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new CatchingFishGradleView(this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.CatchingFishDaggerWebsocket;
        int i2 = this.CatchingFishReduxKtor;
        int i3 = this.CatchingFishWorkManager;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
