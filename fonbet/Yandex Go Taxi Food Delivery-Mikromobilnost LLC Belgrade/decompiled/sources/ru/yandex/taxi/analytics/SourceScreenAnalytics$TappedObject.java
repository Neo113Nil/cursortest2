package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/analytics/SourceScreenAnalytics$TappedObject", "", "Lru/yandex/taxi/analytics/SourceScreenAnalytics$TappedObject;", "ROUTE", "BUBBLE", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SourceScreenAnalytics$TappedObject {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SourceScreenAnalytics$TappedObject[] $VALUES;
    public static final SourceScreenAnalytics$TappedObject BUBBLE;
    public static final SourceScreenAnalytics$TappedObject ROUTE;

    static {
        SourceScreenAnalytics$TappedObject sourceScreenAnalytics$TappedObject = new SourceScreenAnalytics$TappedObject("ROUTE", 0);
        ROUTE = sourceScreenAnalytics$TappedObject;
        SourceScreenAnalytics$TappedObject sourceScreenAnalytics$TappedObject2 = new SourceScreenAnalytics$TappedObject("BUBBLE", 1);
        BUBBLE = sourceScreenAnalytics$TappedObject2;
        SourceScreenAnalytics$TappedObject[] sourceScreenAnalytics$TappedObjectArr = {sourceScreenAnalytics$TappedObject, sourceScreenAnalytics$TappedObject2};
        $VALUES = sourceScreenAnalytics$TappedObjectArr;
        $ENTRIES = a.a(sourceScreenAnalytics$TappedObjectArr);
    }

    public static SourceScreenAnalytics$TappedObject valueOf(String str) {
        return (SourceScreenAnalytics$TappedObject) Enum.valueOf(SourceScreenAnalytics$TappedObject.class, str);
    }

    public static SourceScreenAnalytics$TappedObject[] values() {
        return (SourceScreenAnalytics$TappedObject[]) $VALUES.clone();
    }
}
