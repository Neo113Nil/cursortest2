package ru.CryptoPro.JCPRequest.ca15.decoder;

import defpackage.ny61;
import defpackage.oyr;

/* loaded from: classes4.dex */
public abstract class SimpleHTMLDecoder {
    public static final String RECORD_END_TAG = "</TR>";
    public static final String RECORD_START_TAG = "<TR>";
    public String a = null;

    public final String a(String str, String str2, String str3) {
        int indexOf = this.a.indexOf(str);
        int length = str.length() + indexOf;
        int indexOf2 = this.a.indexOf(str2, length + 1);
        if (indexOf == -1 || indexOf2 == -1) {
            ny61.v(oyr.p("Start or end tag of request parameter ", str3, " is lost."));
            return null;
        }
        String substring = this.a.substring(length, indexOf2);
        String substring2 = this.a.substring(str2.length() + indexOf2);
        this.a = substring2;
        this.a = substring2.trim();
        return substring.trim();
    }

    public final String b() {
        int indexOf = this.a.indexOf(RECORD_START_TAG);
        int i = indexOf + 4;
        int indexOf2 = this.a.indexOf(RECORD_END_TAG, indexOf + 5);
        if (indexOf == -1) {
            return null;
        }
        String substring = (indexOf == -1 || indexOf2 != -1) ? this.a.substring(i, indexOf2) : this.a.substring(i);
        if (indexOf2 != -1) {
            String substring2 = this.a.substring(indexOf2 + 5);
            this.a = substring2;
            this.a = substring2.trim();
        } else {
            this.a = null;
        }
        return substring.trim();
    }
}
