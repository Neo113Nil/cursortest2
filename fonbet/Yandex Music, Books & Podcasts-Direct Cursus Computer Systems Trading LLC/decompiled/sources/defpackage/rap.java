package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class rap {
    public static final rap a;
    public static final rap b;
    public static final /* synthetic */ rap[] c;

    static {
        rap rapVar = new rap("Tap", 0);
        a = rapVar;
        rap rapVar2 = new rap("Drag", 1);
        b = rapVar2;
        c = new rap[]{rapVar, rapVar2};
    }

    public static rap valueOf(String str) {
        return (rap) Enum.valueOf(rap.class, str);
    }

    public static rap[] values() {
        return (rap[]) c.clone();
    }
}
