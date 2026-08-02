package io.flutter.embedding.engine.systemchannels;

import defpackage.g8e;

/* loaded from: classes4.dex */
public enum TextInputChannel$TextCapitalization {
    CHARACTERS("TextCapitalization.characters"),
    WORDS("TextCapitalization.words"),
    SENTENCES("TextCapitalization.sentences"),
    NONE("TextCapitalization.none");

    private final String encodedName;

    TextInputChannel$TextCapitalization(String str) {
        this.encodedName = str;
    }

    public static TextInputChannel$TextCapitalization a(String str) {
        for (TextInputChannel$TextCapitalization textInputChannel$TextCapitalization : values()) {
            if (textInputChannel$TextCapitalization.encodedName.equals(str)) {
                return textInputChannel$TextCapitalization;
            }
        }
        throw new NoSuchFieldException(g8e.o("No such TextCapitalization: ", str));
    }
}
