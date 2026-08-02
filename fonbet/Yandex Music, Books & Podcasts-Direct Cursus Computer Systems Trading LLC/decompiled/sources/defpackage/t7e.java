package defpackage;

import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class t7e {
    public final /* synthetic */ int a = 0;
    public String b;
    public String c;
    public int d;

    public t7e(String str, String[] strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.c = sb;
        this.b = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (!(length <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.b, i)) {
            i++;
        }
        this.d = i;
    }

    public void a(String str, Object... objArr) {
        if (this.d <= 3) {
            String str2 = this.b;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, this.c.concat(str));
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.b);
                sb.append("://");
                int i = -1;
                if (this.c.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.c);
                    sb.append(']');
                } else {
                    sb.append(this.c);
                }
                int i2 = this.d;
                if (i2 == -1) {
                    String str = this.b;
                    i2 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
                }
                String str2 = this.b;
                if (str2.equals("http")) {
                    i = 80;
                } else if (str2.equals("https")) {
                    i = 443;
                }
                if (i2 != i) {
                    sb.append(':');
                    sb.append(i2);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t7e() {
    }
}
