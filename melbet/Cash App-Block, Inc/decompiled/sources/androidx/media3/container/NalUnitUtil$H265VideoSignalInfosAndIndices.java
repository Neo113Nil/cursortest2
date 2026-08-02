package androidx.media3.container;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class NalUnitUtil$H265VideoSignalInfosAndIndices {
    public final int[] indices;
    public final ImmutableList videoSignalInfos;

    public NalUnitUtil$H265VideoSignalInfosAndIndices(RegularImmutableList regularImmutableList, int[] iArr, int i) {
        switch (i) {
            case 1:
                this.videoSignalInfos = ImmutableList.copyOf((Collection) regularImmutableList);
                this.indices = iArr;
                break;
            default:
                this.videoSignalInfos = ImmutableList.copyOf((Collection) regularImmutableList);
                this.indices = iArr;
                break;
        }
    }
}
