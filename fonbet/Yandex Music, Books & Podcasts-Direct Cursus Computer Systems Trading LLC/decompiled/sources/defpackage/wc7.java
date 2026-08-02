package defpackage;

import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public abstract class wc7 {
    public static final tfs a = tfs.f;

    public static String a(Date date) {
        date.getClass();
        gbk[] gbkVarArr = gbk.a;
        return new bgs("yyyy-MM-dd'T'HH:mm:ssZZZZZ", (TimeZone) bgs.b.getValue(), 2).a(date);
    }
}
