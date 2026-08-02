package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class fps {
    public static final fps a;
    public static final fps b;
    public static final fps c;
    public static final /* synthetic */ fps[] d;

    static {
        fps fpsVar = new fps("NavIcons", 0);
        a = fpsVar;
        fps fpsVar2 = new fps("Title", 1);
        b = fpsVar2;
        fps fpsVar3 = new fps("ActionIcons", 2);
        c = fpsVar3;
        d = new fps[]{fpsVar, fpsVar2, fpsVar3};
    }

    public static fps valueOf(String str) {
        return (fps) Enum.valueOf(fps.class, str);
    }

    public static fps[] values() {
        return (fps[]) d.clone();
    }
}
