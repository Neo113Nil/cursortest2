package com.anythink.basead.l;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9624a = "e";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9625b = "<VAST\\s.*version\\s*=\\s*\".*\"(\\s.*|)?>";

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile(f9625b).matcher(str).find();
    }

    public static boolean b(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static long b(String str) {
        Date date;
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            date = simpleDateFormat.parse(str);
        } catch (ParseException e6) {
            e6.getMessage();
            date = null;
        }
        if (date != null) {
            return date.getTime();
        }
        return 0L;
    }

    public static boolean a(CharSequence charSequence) {
        return !b(charSequence);
    }
}
