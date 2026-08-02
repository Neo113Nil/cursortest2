package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class hls {
    public static final hls a;
    public static final hls b;
    public static final /* synthetic */ hls[] c;

    static {
        hls hlsVar = new hls("HORIZONTAL", 0);
        a = hlsVar;
        hls hlsVar2 = new hls("VERTICAL", 1);
        b = hlsVar2;
        c = new hls[]{hlsVar, hlsVar2};
    }

    public static hls valueOf(String str) {
        return (hls) Enum.valueOf(hls.class, str);
    }

    public static hls[] values() {
        return (hls[]) c.clone();
    }
}
