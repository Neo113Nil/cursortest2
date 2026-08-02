package com.google.gson;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import defpackage.xq0;
import java.util.Objects;

/* loaded from: classes3.dex */
public class FormattingStyle {
    public static final FormattingStyle d = new FormattingStyle("", "", false);
    public static final FormattingStyle e = new FormattingStyle(StringUtil.LF, "  ", true);
    public final String a;
    public final String b;
    public final boolean c;

    public FormattingStyle(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "newline == null");
        if (!str.matches("[\r\n]*")) {
            xq0.x("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            xq0.x("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
