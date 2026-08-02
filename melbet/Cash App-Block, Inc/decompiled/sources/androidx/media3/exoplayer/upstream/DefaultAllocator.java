package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.Util;
import coil3.memory.RealStrongMemoryCache$cache$1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class DefaultAllocator {
    public int allocatedCount;
    public int targetBufferSize;
    public final boolean trimOnReset = true;
    public final int individualAllocationSize = 65536;
    public int availableCount = 0;
    public Allocation[] availableAllocations = new Allocation[100];

    public final synchronized Allocation allocate() {
        Allocation allocation;
        try {
            int i = this.allocatedCount + 1;
            this.allocatedCount = i;
            int i2 = this.availableCount;
            if (i2 > 0) {
                Allocation[] allocationArr = this.availableAllocations;
                int i3 = i2 - 1;
                this.availableCount = i3;
                allocation = allocationArr[i3];
                allocation.getClass();
                this.availableAllocations[this.availableCount] = null;
            } else {
                Allocation allocation2 = new Allocation(new byte[this.individualAllocationSize], 0);
                Allocation[] allocationArr2 = this.availableAllocations;
                if (i > allocationArr2.length) {
                    this.availableAllocations = (Allocation[]) Arrays.copyOf(allocationArr2, allocationArr2.length * 2);
                }
                allocation = allocation2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return allocation;
    }

    public final synchronized void release(RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1) {
        while (realStrongMemoryCache$cache$1 != null) {
            Allocation[] allocationArr = this.availableAllocations;
            int i = this.availableCount;
            this.availableCount = i + 1;
            Allocation allocation = (Allocation) realStrongMemoryCache$cache$1.map;
            allocation.getClass();
            allocationArr[i] = allocation;
            this.allocatedCount--;
            realStrongMemoryCache$cache$1 = (RealStrongMemoryCache$cache$1) realStrongMemoryCache$cache$1.this$0;
            if (realStrongMemoryCache$cache$1 == null || ((Allocation) realStrongMemoryCache$cache$1.map) == null) {
                realStrongMemoryCache$cache$1 = null;
            }
        }
    }

    public final synchronized void setTargetBufferSize(int i) {
        boolean z = i < this.targetBufferSize;
        this.targetBufferSize = i;
        if (z) {
            trim();
        }
    }

    public final synchronized void trim() {
        int max = Math.max(0, Util.ceilDivide(this.targetBufferSize, this.individualAllocationSize) - this.allocatedCount);
        int i = this.availableCount;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.availableAllocations, max, i, (Object) null);
        this.availableCount = max;
    }
}
