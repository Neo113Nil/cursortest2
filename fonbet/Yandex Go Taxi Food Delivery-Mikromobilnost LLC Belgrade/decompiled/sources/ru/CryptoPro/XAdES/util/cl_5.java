package ru.CryptoPro.XAdES.util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes4.dex */
public class cl_5 extends SimpleDateFormat {
    public cl_5() {
        super("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public final Date parse(String str, ParsePosition parsePosition) {
        int length = str.length();
        int i = length - 3;
        if (str.charAt(i) == ':') {
            str = str.substring(0, i).concat(str.substring(length - 2));
        }
        return super.parse(str, parsePosition);
    }
}
