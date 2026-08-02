package flex.feature.flexoverlaycontroller.decorviewprovider;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lflex/feature/flexoverlaycontroller/decorviewprovider/DecorViewLifecycle;", "", "ATTACH", "DETACH", "flex-overlay-controller-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DecorViewLifecycle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DecorViewLifecycle[] $VALUES;
    public static final DecorViewLifecycle ATTACH;
    public static final DecorViewLifecycle DETACH;

    static {
        DecorViewLifecycle decorViewLifecycle = new DecorViewLifecycle("ATTACH", 0);
        ATTACH = decorViewLifecycle;
        DecorViewLifecycle decorViewLifecycle2 = new DecorViewLifecycle("DETACH", 1);
        DETACH = decorViewLifecycle2;
        DecorViewLifecycle[] decorViewLifecycleArr = {decorViewLifecycle, decorViewLifecycle2};
        $VALUES = decorViewLifecycleArr;
        $ENTRIES = a.a(decorViewLifecycleArr);
    }

    public static DecorViewLifecycle valueOf(String str) {
        return (DecorViewLifecycle) Enum.valueOf(DecorViewLifecycle.class, str);
    }

    public static DecorViewLifecycle[] values() {
        return (DecorViewLifecycle[]) $VALUES.clone();
    }
}
