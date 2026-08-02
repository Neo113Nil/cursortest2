package com.nimbusds.jose.shaded.gson;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class FormattingStyle {
    public static final FormattingStyle COMPACT = new FormattingStyle("", "", false);
    public final String indent;
    public final String newline;
    public final boolean spaceAfterSeparators;

    static {
        new FormattingStyle("\n", "  ", true);
    }

    public FormattingStyle(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            a$$ExternalSyntheticBUOutline0.m$3("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            a$$ExternalSyntheticBUOutline0.m$3("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.newline = str;
        this.indent = str2;
        this.spaceAfterSeparators = z;
    }
}
