package com.squareup.cash.booklet.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BookletImageState {
    public static final /* synthetic */ BookletImageState[] $VALUES;
    public static final BookletImageState Error;
    public static final BookletImageState Loading;
    public static final BookletImageState Success;

    static {
        BookletImageState bookletImageState = new BookletImageState("Loading", 0);
        Loading = bookletImageState;
        BookletImageState bookletImageState2 = new BookletImageState("Error", 1);
        Error = bookletImageState2;
        BookletImageState bookletImageState3 = new BookletImageState("Success", 2);
        Success = bookletImageState3;
        $VALUES = new BookletImageState[]{bookletImageState, bookletImageState2, bookletImageState3};
    }

    public static BookletImageState valueOf(String str) {
        return (BookletImageState) Enum.valueOf(BookletImageState.class, str);
    }

    public static BookletImageState[] values() {
        return (BookletImageState[]) $VALUES.clone();
    }
}
