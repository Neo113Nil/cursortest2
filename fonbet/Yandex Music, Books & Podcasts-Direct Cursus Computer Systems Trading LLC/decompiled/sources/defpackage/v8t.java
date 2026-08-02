package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes5.dex */
public final class v8t {

    /* JADX INFO: Fake field, exist only in values array */
    v8t EF5;
    public static final /* synthetic */ v8t[] b = {new v8t("CrossDissolve", 0)};

    @NotNull
    public static final u8t Companion = new u8t();
    public static final Object a = btf.a(bwf.b, new x6s(25));

    public static v8t valueOf(String str) {
        return (v8t) Enum.valueOf(v8t.class, str);
    }

    public static v8t[] values() {
        return (v8t[]) b.clone();
    }
}
