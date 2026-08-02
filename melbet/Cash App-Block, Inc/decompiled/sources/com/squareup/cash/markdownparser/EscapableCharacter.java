package com.squareup.cash.markdownparser;

/* loaded from: classes10.dex */
public final class EscapableCharacter {
    public final String escaped;
    public final String literal;
    public final String placeholder;

    public EscapableCharacter(String str, String str2, String str3) {
        this.escaped = str;
        this.placeholder = str2;
        this.literal = str3;
    }
}
