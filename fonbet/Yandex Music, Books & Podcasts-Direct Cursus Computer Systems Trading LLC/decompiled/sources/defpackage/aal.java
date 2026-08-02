package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aal {
    public static final aal a;
    public static final aal b;
    public static final aal c;
    public static final aal d;
    public static final /* synthetic */ aal[] e;

    static {
        aal aalVar = new aal("Hidden", 0);
        a = aalVar;
        aal aalVar2 = new aal("Expanded", 1);
        b = aalVar2;
        aal aalVar3 = new aal("Collapsed", 2);
        c = aalVar3;
        aal aalVar4 = new aal("Dragging", 3);
        d = aalVar4;
        e = new aal[]{aalVar, aalVar2, aalVar3, aalVar4};
    }

    public static aal valueOf(String str) {
        return (aal) Enum.valueOf(aal.class, str);
    }

    public static aal[] values() {
        return (aal[]) e.clone();
    }
}
