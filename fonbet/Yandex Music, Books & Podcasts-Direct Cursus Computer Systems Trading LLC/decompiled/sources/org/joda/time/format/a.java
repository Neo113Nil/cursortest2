package org.joda.time.format;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.hd7;
import defpackage.id7;
import defpackage.jd7;
import defpackage.kd7;
import defpackage.md7;
import defpackage.xq0;
import defpackage.yc7;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;

/* loaded from: classes5.dex */
public abstract class a {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    static {
        new AtomicReferenceArray(25);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x010d, code lost:
    
        if (r9 <= 2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017f, code lost:
    
        if (r11 <= 2) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static yc7 a() {
        yc7 yc7Var;
        boolean z;
        boolean z2;
        ConcurrentHashMap concurrentHashMap = a;
        yc7 yc7Var2 = (yc7) concurrentHashMap.get("yyyy-MM-dd'T'HH:mm:ss.SSS");
        if (yc7Var2 == null) {
            md7 md7Var = new md7();
            int[] iArr = new int[1];
            int i = 0;
            while (i < 25) {
                iArr[0] = i;
                String b = b(iArr);
                int i2 = iArr[0];
                int length = b.length();
                if (length == 0) {
                    yc7Var2 = md7Var.q();
                    if (concurrentHashMap.size() >= 500 && (yc7Var = (yc7) concurrentHashMap.putIfAbsent("yyyy-MM-dd'T'HH:mm:ss.SSS", yc7Var2)) != null) {
                        return yc7Var;
                    }
                } else {
                    char charAt = b.charAt(0);
                    if (charAt == '\'') {
                        String substring = b.substring(1);
                        if (substring.length() == 1) {
                            md7Var.i(substring.charAt(0));
                        } else {
                            md7Var.j(new String(substring));
                        }
                    } else if (charAt == 'K') {
                        md7Var.f(DateTimeFieldType.n, length, 2);
                    } else if (charAt != 'M') {
                        if (charAt == 'S') {
                            md7Var.h(DateTimeFieldType.t, length, length);
                        } else if (charAt == 'a') {
                            md7Var.m(DateTimeFieldType.m);
                        } else if (charAt == 'h') {
                            md7Var.f(DateTimeFieldType.o, length, 2);
                        } else if (charAt == 'k') {
                            md7Var.f(DateTimeFieldType.p, length, 2);
                        } else if (charAt == 'm') {
                            md7Var.f(DateTimeFieldType.s, length, 2);
                        } else if (charAt == 's') {
                            md7Var.f(DateTimeFieldType.u, length, 2);
                        } else if (charAt == 'G') {
                            md7Var.m(DateTimeFieldType.a);
                        } else if (charAt != 'H') {
                            if (charAt != 'Y') {
                                if (charAt != 'Z') {
                                    if (charAt == 'd') {
                                        md7Var.f(DateTimeFieldType.h, length, 2);
                                    } else if (charAt != 'e') {
                                        switch (charAt) {
                                            case 'C':
                                                md7Var.l(DateTimeFieldType.c, length, length);
                                                continue;
                                            case 'D':
                                                md7Var.f(DateTimeFieldType.f, length, 3);
                                                continue;
                                            case 'E':
                                                if (length < 4) {
                                                    md7Var.e(new hd7(DateTimeFieldType.l, true));
                                                    break;
                                                } else {
                                                    md7Var.m(DateTimeFieldType.l);
                                                    continue;
                                                }
                                            default:
                                                switch (charAt) {
                                                    case 'w':
                                                        md7Var.f(DateTimeFieldType.k, length, 2);
                                                        break;
                                                    case 'x':
                                                    case 'y':
                                                        break;
                                                    case 'z':
                                                        if (length < 4) {
                                                            id7 id7Var = new id7(1);
                                                            md7Var.d(id7Var, id7Var);
                                                            break;
                                                        } else {
                                                            md7Var.d(new id7(0), null);
                                                            continue;
                                                        }
                                                    default:
                                                        xq0.x("Illegal pattern component: ".concat(b));
                                                        return null;
                                                }
                                        }
                                    } else {
                                        md7Var.f(DateTimeFieldType.l, length, 1);
                                    }
                                } else if (length == 1) {
                                    md7Var.e(new jd7(2, null, "Z", false));
                                } else if (length == 2) {
                                    md7Var.e(new jd7(2, null, "Z", true));
                                } else {
                                    DateTimeFormatterBuilder$TimeZoneId dateTimeFormatterBuilder$TimeZoneId = DateTimeFormatterBuilder$TimeZoneId.a;
                                    md7Var.d(dateTimeFormatterBuilder$TimeZoneId, dateTimeFormatterBuilder$TimeZoneId);
                                }
                            }
                            if (length == 2) {
                                if (i2 + 1 < 25) {
                                    iArr[0] = iArr[0] + 1;
                                    String b2 = b(iArr);
                                    int length2 = b2.length();
                                    if (length2 > 0) {
                                        switch (b2.charAt(0)) {
                                            case 'C':
                                            case 'D':
                                            case RemoteCameraConfig.Camera.JPEG_QUALITY_70 /* 70 */:
                                            case 'H':
                                            case 'K':
                                            case 'S':
                                            case 'W':
                                            case 'Y':
                                            case 'c':
                                            case 'd':
                                            case 'e':
                                            case 'h':
                                            case 'k':
                                            case 'm':
                                            case 's':
                                            case 'w':
                                            case 'x':
                                            case 'y':
                                                z2 = true;
                                                break;
                                            case 'M':
                                                break;
                                        }
                                        z = !z2;
                                        iArr[0] = iArr[0] - 1;
                                    }
                                    z2 = false;
                                    z = !z2;
                                    iArr[0] = iArr[0] - 1;
                                } else {
                                    z = true;
                                }
                                if (charAt != 'x') {
                                    DateTime dateTime = new DateTime();
                                    md7Var.e(new kd7(DateTimeFieldType.e, dateTime.b().J().b(dateTime.c()) - 30, z));
                                } else {
                                    DateTime dateTime2 = new DateTime();
                                    md7Var.e(new kd7(DateTimeFieldType.j, dateTime2.b().E().b(dateTime2.c()) - 30, z));
                                }
                            } else {
                                int i3 = 9;
                                if (i2 + 1 < 25) {
                                    iArr[0] = iArr[0] + 1;
                                    String b3 = b(iArr);
                                    int length3 = b3.length();
                                    if (length3 > 0) {
                                        switch (b3.charAt(0)) {
                                            case 'M':
                                                break;
                                            case 'C':
                                            case 'D':
                                            case RemoteCameraConfig.Camera.JPEG_QUALITY_70 /* 70 */:
                                            case 'H':
                                            case 'K':
                                            case 'S':
                                            case 'W':
                                            case 'Y':
                                            case 'c':
                                            case 'd':
                                            case 'e':
                                            case 'h':
                                            case 'k':
                                            case 'm':
                                            case 's':
                                            case 'w':
                                            case 'x':
                                            case 'y':
                                                i3 = length;
                                                break;
                                        }
                                    }
                                    iArr[0] = iArr[0] - 1;
                                }
                                if (charAt == 'Y') {
                                    md7Var.f(DateTimeFieldType.b, length, i3);
                                } else if (charAt == 'x') {
                                    md7Var.l(DateTimeFieldType.j, length, i3);
                                } else if (charAt == 'y') {
                                    md7Var.l(DateTimeFieldType.e, length, i3);
                                }
                            }
                        } else {
                            md7Var.f(DateTimeFieldType.q, length, 2);
                        }
                    } else if (length < 3) {
                        md7Var.f(DateTimeFieldType.g, length, 2);
                    } else if (length >= 4) {
                        md7Var.m(DateTimeFieldType.g);
                    } else {
                        md7Var.e(new hd7(DateTimeFieldType.g, true));
                    }
                    i = i2 + 1;
                }
            }
            yc7Var2 = md7Var.q();
            if (concurrentHashMap.size() >= 500) {
            }
        }
        return yc7Var2;
    }

    public static String b(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        char charAt = "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= 25 || "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i2) != charAt) {
                    break;
                }
                sb.append(charAt);
                i = i2;
            }
        } else {
            sb.append('\'');
            boolean z = false;
            while (i < 25) {
                char charAt2 = "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i);
                if (charAt2 != '\'') {
                    if (!z && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    sb.append(charAt2);
                } else {
                    int i3 = i + 1;
                    if (i3 >= 25 || "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i3) != '\'') {
                        z = !z;
                    } else {
                        sb.append(charAt2);
                        i = i3;
                    }
                }
                i++;
            }
        }
        iArr[0] = i;
        return sb.toString();
    }
}
