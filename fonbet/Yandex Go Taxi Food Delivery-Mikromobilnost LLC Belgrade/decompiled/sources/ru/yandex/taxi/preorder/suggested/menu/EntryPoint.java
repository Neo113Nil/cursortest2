package ru.yandex.taxi.preorder.suggested.menu;

import defpackage.d4o;
import defpackage.fgn;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/preorder/suggested/menu/EntryPoint;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "d4o", "LONG_TAP", "DOTS", "SUPER_APP_HEADER", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EntryPoint {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EntryPoint[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final d4o Companion;
    public static final EntryPoint DOTS;
    public static final EntryPoint LONG_TAP;
    public static final EntryPoint SUPER_APP_HEADER;
    private final String value;

    static {
        EntryPoint entryPoint = new EntryPoint("LONG_TAP", 0, "long_tap");
        LONG_TAP = entryPoint;
        EntryPoint entryPoint2 = new EntryPoint("DOTS", 1, "dots");
        DOTS = entryPoint2;
        EntryPoint entryPoint3 = new EntryPoint("SUPER_APP_HEADER", 2, "super_app_header");
        SUPER_APP_HEADER = entryPoint3;
        EntryPoint[] entryPointArr = {entryPoint, entryPoint2, entryPoint3};
        $VALUES = entryPointArr;
        $ENTRIES = a.a(entryPointArr);
        Companion = new d4o();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fgn(26));
    }

    public EntryPoint(String str, int i, String str2) {
        this.value = str2;
    }

    public static EntryPoint valueOf(String str) {
        return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
    }

    public static EntryPoint[] values() {
        return (EntryPoint[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
