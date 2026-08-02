package ru.yandex.taxi.widget.timeline;

import ru.yandex.taxi.widget.timeline.TimelineItemView;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TimelineItemView.Status.values().length];
        try {
            iArr[TimelineItemView.Status.PASSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TimelineItemView.Status.CURRENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TimelineItemView.Status.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
