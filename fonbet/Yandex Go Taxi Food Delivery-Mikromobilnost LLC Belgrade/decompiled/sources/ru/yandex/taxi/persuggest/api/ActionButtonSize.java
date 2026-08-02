package ru.yandex.taxi.persuggest.api;

import defpackage.ft;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.lq;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/persuggest/api/ActionButtonSize;", "", "Companion", "ft", "XS", "S", "M", "L", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionButtonSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionButtonSize[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ft Companion;
    public static final ActionButtonSize L;
    public static final ActionButtonSize M;
    public static final ActionButtonSize S;
    public static final ActionButtonSize XS;

    static {
        ActionButtonSize actionButtonSize = new ActionButtonSize("XS", 0);
        XS = actionButtonSize;
        ActionButtonSize actionButtonSize2 = new ActionButtonSize("S", 1);
        S = actionButtonSize2;
        ActionButtonSize actionButtonSize3 = new ActionButtonSize("M", 2);
        M = actionButtonSize3;
        ActionButtonSize actionButtonSize4 = new ActionButtonSize("L", 3);
        L = actionButtonSize4;
        ActionButtonSize[] actionButtonSizeArr = {actionButtonSize, actionButtonSize2, actionButtonSize3, actionButtonSize4};
        $VALUES = actionButtonSizeArr;
        $ENTRIES = kotlin.enums.a.a(actionButtonSizeArr);
        Companion = new ft();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(26));
    }

    public static ActionButtonSize valueOf(String str) {
        return (ActionButtonSize) Enum.valueOf(ActionButtonSize.class, str);
    }

    public static ActionButtonSize[] values() {
        return (ActionButtonSize[]) $VALUES.clone();
    }
}
