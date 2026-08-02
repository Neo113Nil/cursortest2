package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class gx6 {
    public static final rre b;
    public static final /* synthetic */ gx6[] c;
    public static final /* synthetic */ rdb d;
    public final String a;

    static {
        gx6[] gx6VarArr = {new gx6("DISLIKE", 0, "actionDislike"), new gx6("UNDO_DISLIKE", 1, "actionUndoDislike"), new gx6("LIKE", 2, "actionLike"), new gx6("UNDO_LIKE", 3, "actionUndoLike"), new gx6("REPEAT", 4, "actionRepeat"), new gx6("SHUFFLE", 5, "actionShuffle"), new gx6("SEEK_FORWARD", 6, "seekForward"), new gx6("SEEK_BACKWARD", 7, "seekBackward")};
        c = gx6VarArr;
        d = new rdb(gx6VarArr);
        b = new rre(19);
    }

    public gx6(String str, int i, String str2) {
        this.a = str2;
    }

    public static gx6 valueOf(String str) {
        return (gx6) Enum.valueOf(gx6.class, str);
    }

    public static gx6[] values() {
        return (gx6[]) c.clone();
    }
}
