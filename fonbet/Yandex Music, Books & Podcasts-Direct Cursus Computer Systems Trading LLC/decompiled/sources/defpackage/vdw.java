package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class vdw {
    public static final /* synthetic */ vdw[] a = {new vdw("ERROR_APP_NOTHING_TO_PLAY", 0), new vdw("ERROR_STATE_UNSUPPORTED_ENTITY", 1), new vdw("ERROR_STATE_ENTITY_MISMATCH", 2), new vdw("ERROR_VOLUME_CONFIG_BROKEN", 3), new vdw("ERROR_VOLUME_OTHER", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    vdw EF5;

    public static vdw valueOf(String str) {
        return (vdw) Enum.valueOf(vdw.class, str);
    }

    public static vdw[] values() {
        return (vdw[]) a.clone();
    }
}
