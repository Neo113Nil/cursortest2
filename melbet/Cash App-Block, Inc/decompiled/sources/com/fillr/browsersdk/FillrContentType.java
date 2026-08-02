package com.fillr.browsersdk;

import java.util.HashMap;

/* loaded from: classes4.dex */
public enum FillrContentType {
    HTML_CONTENT("text/html"),
    JS_CONTENT("text/javascript"),
    EVENT_CONTENT("fillr/json"),
    MIXED_CONTENT("fillr/mixed");

    public static final HashMap VALUES = new HashMap();
    public final String mime;

    static {
        for (FillrContentType fillrContentType : values()) {
            VALUES.put(fillrContentType.mime, fillrContentType);
        }
    }

    FillrContentType(String str) {
        this.mime = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.mime;
    }
}
