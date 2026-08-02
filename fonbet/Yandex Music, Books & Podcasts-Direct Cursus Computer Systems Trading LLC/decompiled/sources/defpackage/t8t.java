package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes5.dex */
public final class t8t {

    /* JADX INFO: Fake field, exist only in values array */
    t8t EF5;
    public static final /* synthetic */ t8t[] b = {new t8t("Linear", 0), new t8t("EaseIn", 1), new t8t("EaseOut", 2), new t8t("EaseInOut", 3)};

    @NotNull
    public static final s8t Companion = new s8t();
    public static final Object a = btf.a(bwf.b, new x6s(24));

    public static t8t valueOf(String str) {
        return (t8t) Enum.valueOf(t8t.class, str);
    }

    public static t8t[] values() {
        return (t8t[]) b.clone();
    }
}
