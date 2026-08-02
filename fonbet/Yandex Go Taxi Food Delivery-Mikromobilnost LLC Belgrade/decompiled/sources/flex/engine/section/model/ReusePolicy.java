package flex.engine.section.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lflex/engine/section/model/ReusePolicy;", "", "FORCE_AND_STORE", "USE_STORED", "FALLBACK_TO_NATIVE", "flex-section-extension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ReusePolicy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ReusePolicy[] $VALUES;
    public static final ReusePolicy FALLBACK_TO_NATIVE;
    public static final ReusePolicy FORCE_AND_STORE;
    public static final ReusePolicy USE_STORED;

    static {
        ReusePolicy reusePolicy = new ReusePolicy("FORCE_AND_STORE", 0);
        FORCE_AND_STORE = reusePolicy;
        ReusePolicy reusePolicy2 = new ReusePolicy("USE_STORED", 1);
        USE_STORED = reusePolicy2;
        ReusePolicy reusePolicy3 = new ReusePolicy("FALLBACK_TO_NATIVE", 2);
        FALLBACK_TO_NATIVE = reusePolicy3;
        ReusePolicy[] reusePolicyArr = {reusePolicy, reusePolicy2, reusePolicy3};
        $VALUES = reusePolicyArr;
        $ENTRIES = a.a(reusePolicyArr);
    }

    public static ReusePolicy valueOf(String str) {
        return (ReusePolicy) Enum.valueOf(ReusePolicy.class, str);
    }

    public static ReusePolicy[] values() {
        return (ReusePolicy[]) $VALUES.clone();
    }
}
