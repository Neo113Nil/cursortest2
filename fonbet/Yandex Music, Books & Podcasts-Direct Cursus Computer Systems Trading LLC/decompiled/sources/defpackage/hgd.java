package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class hgd {
    public static final /* synthetic */ hgd[] a = {new hgd("PULT", 0), new hgd("SHOTS", 1), new hgd("MULTIROOM", 2), new hgd("MULTIROOM_CLUSTER", 3), new hgd("BITRATE_192", 4), new hgd("BITRATE_320", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    hgd EF5;

    public static hgd valueOf(String str) {
        return (hgd) Enum.valueOf(hgd.class, str);
    }

    public static hgd[] values() {
        return (hgd[]) a.clone();
    }
}
