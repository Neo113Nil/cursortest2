package androidx.compose.foundation.text.input.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class WedgeAffinity {
    public static final /* synthetic */ WedgeAffinity[] $VALUES;
    public static final WedgeAffinity End;
    public static final WedgeAffinity Start;

    static {
        WedgeAffinity wedgeAffinity = new WedgeAffinity("Start", 0);
        Start = wedgeAffinity;
        WedgeAffinity wedgeAffinity2 = new WedgeAffinity("End", 1);
        End = wedgeAffinity2;
        $VALUES = new WedgeAffinity[]{wedgeAffinity, wedgeAffinity2};
    }

    public static WedgeAffinity valueOf(String str) {
        return (WedgeAffinity) Enum.valueOf(WedgeAffinity.class, str);
    }

    public static WedgeAffinity[] values() {
        return (WedgeAffinity[]) $VALUES.clone();
    }
}
