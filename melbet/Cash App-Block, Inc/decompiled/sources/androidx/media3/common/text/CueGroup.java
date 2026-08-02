package androidx.media3.common.text;

import androidx.media3.common.Format$$ExternalSyntheticLambda1;
import androidx.media3.common.util.Util;
import com.google.common.collect.ByFunctionOrdering;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.RegularImmutableList;
import java.util.List;

/* loaded from: classes3.dex */
public final class CueGroup {
    public static final ByFunctionOrdering CUES_PRIORITY_COMPARATOR = new ByFunctionOrdering(new Format$$ExternalSyntheticLambda1(1), NaturalOrdering.INSTANCE);
    public static final CueGroup EMPTY_TIME_ZERO;
    public final RegularImmutableList cues;

    static {
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        EMPTY_TIME_ZERO = new CueGroup(RegularImmutableList.EMPTY);
        Util.intToStringMaxRadix(0);
        Util.intToStringMaxRadix(1);
    }

    public CueGroup(List list) {
        this.cues = ImmutableList.sortedCopyOf(CUES_PRIORITY_COMPARATOR, list);
    }
}
