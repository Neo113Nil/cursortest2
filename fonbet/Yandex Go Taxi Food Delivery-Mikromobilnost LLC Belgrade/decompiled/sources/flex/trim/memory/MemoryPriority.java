package flex.trim.memory;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ti10;
import defpackage.w410;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lflex/trim/memory/MemoryPriority;", "", "Companion", "ti10", "HIGH", "LOW", "flex-trim-memory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MemoryPriority {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MemoryPriority[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ti10 Companion;
    public static final MemoryPriority HIGH;
    public static final MemoryPriority LOW;

    static {
        MemoryPriority memoryPriority = new MemoryPriority("HIGH", 0);
        HIGH = memoryPriority;
        MemoryPriority memoryPriority2 = new MemoryPriority("LOW", 1);
        LOW = memoryPriority2;
        MemoryPriority[] memoryPriorityArr = {memoryPriority, memoryPriority2};
        $VALUES = memoryPriorityArr;
        $ENTRIES = a.a(memoryPriorityArr);
        Companion = new ti10();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w410(15));
    }

    public static MemoryPriority valueOf(String str) {
        return (MemoryPriority) Enum.valueOf(MemoryPriority.class, str);
    }

    public static MemoryPriority[] values() {
        return (MemoryPriority[]) $VALUES.clone();
    }
}
