package kotlinx.serialization.json;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/ClassDiscriminatorMode;", "", JCP.RAW_PREFIX, "ALL_JSON_OBJECTS", "POLYMORPHIC", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ClassDiscriminatorMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ClassDiscriminatorMode[] $VALUES;
    public static final ClassDiscriminatorMode ALL_JSON_OBJECTS;
    public static final ClassDiscriminatorMode NONE;
    public static final ClassDiscriminatorMode POLYMORPHIC;

    static {
        ClassDiscriminatorMode classDiscriminatorMode = new ClassDiscriminatorMode(JCP.RAW_PREFIX, 0);
        NONE = classDiscriminatorMode;
        ClassDiscriminatorMode classDiscriminatorMode2 = new ClassDiscriminatorMode("ALL_JSON_OBJECTS", 1);
        ALL_JSON_OBJECTS = classDiscriminatorMode2;
        ClassDiscriminatorMode classDiscriminatorMode3 = new ClassDiscriminatorMode("POLYMORPHIC", 2);
        POLYMORPHIC = classDiscriminatorMode3;
        ClassDiscriminatorMode[] classDiscriminatorModeArr = {classDiscriminatorMode, classDiscriminatorMode2, classDiscriminatorMode3};
        $VALUES = classDiscriminatorModeArr;
        $ENTRIES = kotlin.enums.a.a(classDiscriminatorModeArr);
    }

    public static ClassDiscriminatorMode valueOf(String str) {
        return (ClassDiscriminatorMode) Enum.valueOf(ClassDiscriminatorMode.class, str);
    }

    public static ClassDiscriminatorMode[] values() {
        return (ClassDiscriminatorMode[]) $VALUES.clone();
    }
}
