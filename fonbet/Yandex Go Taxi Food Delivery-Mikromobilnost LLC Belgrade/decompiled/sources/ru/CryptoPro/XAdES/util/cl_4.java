package ru.CryptoPro.XAdES.util;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes4.dex */
public class cl_4 extends SimpleDateFormat {
    public cl_4() {
        super("yyyy-MM-dd'T'HH:mm:ssZ");
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public final StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        StringBuffer format = super.format(date, stringBuffer, fieldPosition);
        format.insert(format.length() - 2, ':');
        return format;
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
