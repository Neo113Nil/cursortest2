package com.fillr.browsersdk.model;

import java.util.HashMap;

/* loaded from: classes4.dex */
public enum FillrWidgetPageEvent {
    LOAD(0, false),
    CLICK(1, true),
    CLOSE(2, true),
    NAVIGATION(3, true);

    public static final HashMap VALUES = new HashMap();
    public final boolean jsonRequired;
    public final String name;

    static {
        for (FillrWidgetPageEvent fillrWidgetPageEvent : values()) {
            VALUES.put(fillrWidgetPageEvent.name, fillrWidgetPageEvent);
        }
    }

    FillrWidgetPageEvent(int i, boolean z) {
        this.name = r2;
        this.jsonRequired = z;
    }
}
