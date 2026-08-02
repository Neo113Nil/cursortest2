package skeletor.render.token;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"skeletor/render/token/Stack$Orientation", "", "Lskeletor/render/token/Stack$Orientation;", "HORIZONTAL", "VERTICAL", "renderer_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class Stack$Orientation {
    private static final /* synthetic */ Stack$Orientation[] $VALUES;
    public static final Stack$Orientation HORIZONTAL;
    public static final Stack$Orientation VERTICAL;

    static {
        Stack$Orientation stack$Orientation = new Stack$Orientation("HORIZONTAL", 0);
        HORIZONTAL = stack$Orientation;
        Stack$Orientation stack$Orientation2 = new Stack$Orientation("VERTICAL", 1);
        VERTICAL = stack$Orientation2;
        $VALUES = new Stack$Orientation[]{stack$Orientation, stack$Orientation2};
    }

    public static Stack$Orientation valueOf(String str) {
        return (Stack$Orientation) Enum.valueOf(Stack$Orientation.class, str);
    }

    public static Stack$Orientation[] values() {
        return (Stack$Orientation[]) $VALUES.clone();
    }
}
