package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class vmd {
    public static final vmd a;
    public static final vmd b;
    public static final /* synthetic */ vmd[] c;

    static {
        vmd vmdVar = new vmd("ARTIST", 0);
        a = vmdVar;
        vmd vmdVar2 = new vmd("ALBUM", 1);
        b = vmdVar2;
        c = new vmd[]{vmdVar, vmdVar2};
    }

    public static vmd valueOf(String str) {
        return (vmd) Enum.valueOf(vmd.class, str);
    }

    public static vmd[] values() {
        return (vmd[]) c.clone();
    }
}
