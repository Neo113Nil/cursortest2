package io.flutter.embedding.engine.systemchannels;

import defpackage.g8e;

/* loaded from: classes4.dex */
public enum TextInputChannel$TextInputType {
    TEXT("TextInputType.text"),
    DATETIME("TextInputType.datetime"),
    NAME("TextInputType.name"),
    POSTAL_ADDRESS("TextInputType.address"),
    NUMBER("TextInputType.number"),
    PHONE("TextInputType.phone"),
    MULTILINE("TextInputType.multiline"),
    EMAIL_ADDRESS("TextInputType.emailAddress"),
    URL("TextInputType.url"),
    VISIBLE_PASSWORD("TextInputType.visiblePassword"),
    NONE("TextInputType.none"),
    WEB_SEARCH("TextInputType.webSearch"),
    TWITTER("TextInputType.twitter");

    private final String encodedName;

    TextInputChannel$TextInputType(String str) {
        this.encodedName = str;
    }

    public static TextInputChannel$TextInputType a(String str) {
        for (TextInputChannel$TextInputType textInputChannel$TextInputType : values()) {
            if (textInputChannel$TextInputType.encodedName.equals(str)) {
                return textInputChannel$TextInputType;
            }
        }
        throw new NoSuchFieldException(g8e.o("No such TextInputType: ", str));
    }
}
