package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class kja {
    public static final kja a;
    public static final kja b;
    public static final kja c;
    public static final /* synthetic */ kja[] d;

    static {
        kja kjaVar = new kja("DOWNLOADED_DATE", 0);
        a = kjaVar;
        kja kjaVar2 = new kja("AUTHORS", 1);
        b = kjaVar2;
        kja kjaVar3 = new kja("ALPHABET", 2);
        c = kjaVar3;
        d = new kja[]{kjaVar, kjaVar2, kjaVar3};
    }

    public static kja valueOf(String str) {
        return (kja) Enum.valueOf(kja.class, str);
    }

    public static kja[] values() {
        return (kja[]) d.clone();
    }
}
