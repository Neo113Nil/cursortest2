package defpackage;

import ru.yandex.music.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uht {
    public static final vpl c;
    public static final uht d;
    public static final rdb e;
    public static final uht f;
    public static final uht g;
    public static final /* synthetic */ uht[] h;
    public final int a;
    public final int b;

    static {
        uht uhtVar = new uht("System", 0, R.string.widget_settings_color_system_title, R.string.widget_settings_color_system_subtitle);
        f = uhtVar;
        uht uhtVar2 = new uht("CoverBased", 1, R.string.widget_settings_color_cover_title, R.string.widget_settings_color_cover_subtitle);
        g = uhtVar2;
        uht[] uhtVarArr = {uhtVar, uhtVar2};
        h = uhtVarArr;
        rdb rdbVar = new rdb(uhtVarArr);
        c = new vpl();
        d = uhtVar;
        e = rdbVar;
    }

    public uht(String str, int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public static uht valueOf(String str) {
        return (uht) Enum.valueOf(uht.class, str);
    }

    public static uht[] values() {
        return (uht[]) h.clone();
    }
}
