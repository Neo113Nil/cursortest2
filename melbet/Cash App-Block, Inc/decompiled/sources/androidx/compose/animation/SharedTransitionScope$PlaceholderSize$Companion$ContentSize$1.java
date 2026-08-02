package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;

/* loaded from: classes3.dex */
public final class SharedTransitionScope$PlaceholderSize$Companion$ContentSize$1 implements SharedTransitionScope.PlaceholderSize {
    public final /* synthetic */ int $r8$classId;
    public static final SharedTransitionScope$PlaceholderSize$Companion$ContentSize$1 INSTANCE$1 = new SharedTransitionScope$PlaceholderSize$Companion$ContentSize$1(1);
    public static final SharedTransitionScope$PlaceholderSize$Companion$ContentSize$1 INSTANCE = new SharedTransitionScope$PlaceholderSize$Companion$ContentSize$1(0);

    public /* synthetic */ SharedTransitionScope$PlaceholderSize$Companion$ContentSize$1(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.compose.animation.SharedTransitionScope.PlaceholderSize
    /* renamed from: calculateSize-JyjRU_E */
    public final long mo151calculateSizeJyjRU_E(long j, long j2) {
        switch (this.$r8$classId) {
            case 0:
                return j;
            default:
                return j2;
        }
    }
}
