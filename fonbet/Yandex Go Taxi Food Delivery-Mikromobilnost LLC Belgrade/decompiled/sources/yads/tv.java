package yads;

import com.yandex.go.sql.BaseDatabaseHelper;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class tv {
    public static final tv b;
    public static final tv c;
    public static final /* synthetic */ tv[] d;

    static {
        tv tvVar = new tv(BaseDatabaseHelper.TYPE_TEXT, 0);
        b = tvVar;
        tv tvVar2 = new tv("IMAGE", 1);
        c = tvVar2;
        d = new tv[]{tvVar, tvVar2};
    }

    public static tv valueOf(String str) {
        return (tv) Enum.valueOf(tv.class, str);
    }

    public static tv[] values() {
        return (tv[]) d.clone();
    }
}
