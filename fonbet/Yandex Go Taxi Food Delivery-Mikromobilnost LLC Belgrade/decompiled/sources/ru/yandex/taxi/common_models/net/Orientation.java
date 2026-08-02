package ru.yandex.taxi.common_models.net;

import defpackage.fq80;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.yi80;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/Orientation;", "", "Companion", "fq80", "HORIZONTAL", "VERTICAL", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Orientation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Orientation[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final fq80 Companion;
    public static final Orientation HORIZONTAL;
    public static final Orientation VERTICAL;

    static {
        Orientation orientation = new Orientation("HORIZONTAL", 0);
        HORIZONTAL = orientation;
        Orientation orientation2 = new Orientation("VERTICAL", 1);
        VERTICAL = orientation2;
        Orientation[] orientationArr = {orientation, orientation2};
        $VALUES = orientationArr;
        $ENTRIES = kotlin.enums.a.a(orientationArr);
        Companion = new fq80();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yi80(13));
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) $VALUES.clone();
    }
}
