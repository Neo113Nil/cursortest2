package ru.yandex.taxi.activity;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/activity/ContentContainer$ZOrder", "", "Lru/yandex/taxi/activity/ContentContainer$ZOrder;", "MAP", "CONTENT", "IN_FRONT_OF_CONTENT", "FRAGMENT_MODAL_VIEW", "MAIN_ACTIVITY_MODAL_VIEW", "IN_FRONT_OF_MODAL_VIEW", "IMPORTANT", "MOST_IMPORTANT", "utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ContentContainer$ZOrder {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ContentContainer$ZOrder[] $VALUES;
    public static final ContentContainer$ZOrder CONTENT;
    public static final ContentContainer$ZOrder FRAGMENT_MODAL_VIEW;
    public static final ContentContainer$ZOrder IMPORTANT;
    public static final ContentContainer$ZOrder IN_FRONT_OF_CONTENT;
    public static final ContentContainer$ZOrder IN_FRONT_OF_MODAL_VIEW;
    public static final ContentContainer$ZOrder MAIN_ACTIVITY_MODAL_VIEW;
    public static final ContentContainer$ZOrder MAP;
    public static final ContentContainer$ZOrder MOST_IMPORTANT;

    static {
        ContentContainer$ZOrder contentContainer$ZOrder = new ContentContainer$ZOrder("MAP", 0);
        MAP = contentContainer$ZOrder;
        ContentContainer$ZOrder contentContainer$ZOrder2 = new ContentContainer$ZOrder("CONTENT", 1);
        CONTENT = contentContainer$ZOrder2;
        ContentContainer$ZOrder contentContainer$ZOrder3 = new ContentContainer$ZOrder("IN_FRONT_OF_CONTENT", 2);
        IN_FRONT_OF_CONTENT = contentContainer$ZOrder3;
        ContentContainer$ZOrder contentContainer$ZOrder4 = new ContentContainer$ZOrder("FRAGMENT_MODAL_VIEW", 3);
        FRAGMENT_MODAL_VIEW = contentContainer$ZOrder4;
        ContentContainer$ZOrder contentContainer$ZOrder5 = new ContentContainer$ZOrder("MAIN_ACTIVITY_MODAL_VIEW", 4);
        MAIN_ACTIVITY_MODAL_VIEW = contentContainer$ZOrder5;
        ContentContainer$ZOrder contentContainer$ZOrder6 = new ContentContainer$ZOrder("IN_FRONT_OF_MODAL_VIEW", 5);
        IN_FRONT_OF_MODAL_VIEW = contentContainer$ZOrder6;
        ContentContainer$ZOrder contentContainer$ZOrder7 = new ContentContainer$ZOrder("IMPORTANT", 6);
        IMPORTANT = contentContainer$ZOrder7;
        ContentContainer$ZOrder contentContainer$ZOrder8 = new ContentContainer$ZOrder("MOST_IMPORTANT", 7);
        MOST_IMPORTANT = contentContainer$ZOrder8;
        ContentContainer$ZOrder[] contentContainer$ZOrderArr = {contentContainer$ZOrder, contentContainer$ZOrder2, contentContainer$ZOrder3, contentContainer$ZOrder4, contentContainer$ZOrder5, contentContainer$ZOrder6, contentContainer$ZOrder7, contentContainer$ZOrder8};
        $VALUES = contentContainer$ZOrderArr;
        $ENTRIES = kotlin.enums.a.a(contentContainer$ZOrderArr);
    }

    public static ContentContainer$ZOrder valueOf(String str) {
        return (ContentContainer$ZOrder) Enum.valueOf(ContentContainer$ZOrder.class, str);
    }

    public static ContentContainer$ZOrder[] values() {
        return (ContentContainer$ZOrder[]) $VALUES.clone();
    }
}
