package defpackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes11.dex */
public abstract class vqc implements Comparable {
    public static long a(int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return TimeUnit.SECONDS.toMillis(i2) + TimeUnit.MINUTES.toMillis(i) + TimeUnit.HOURS.toMillis(0L) + i3;
    }

    public static long b(long j) {
        return TimeUnit.SECONDS.toMillis(0L) + TimeUnit.MINUTES.toMillis(0L) + TimeUnit.HOURS.toMillis(0L) + j;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String c(long j, String str) {
        String str2;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        String str3;
        long j7;
        z83.c("durationMillis must not be negative", j < 0);
        ArrayList arrayList = new ArrayList(str.length());
        int i = 0;
        boolean z = false;
        StringBuilder sb = null;
        wqc wqcVar = null;
        while (true) {
            String str4 = "M";
            str2 = "s";
            if (i >= str.length()) {
                break;
            }
            char charAt = str.charAt(i);
            if (z && charAt != '\'') {
                sb.append(charAt);
            } else if (charAt != '\'') {
                if (charAt == 'H') {
                    str4 = CA20Status.STATUS_CERTIFICATE_H;
                } else if (charAt != 'M') {
                    if (charAt == 'S') {
                        str4 = "S";
                    } else if (charAt == 'd') {
                        str4 = "d";
                    } else if (charAt == 'm') {
                        str4 = "m";
                    } else if (charAt == 's') {
                        str4 = "s";
                    } else if (charAt != 'y') {
                        if (sb == null) {
                            StringBuilder sb2 = new StringBuilder();
                            arrayList.add(new wqc(sb2));
                            sb = sb2;
                        }
                        sb.append(charAt);
                        str4 = null;
                    } else {
                        str4 = RemoteBioParameters.Y;
                    }
                }
                if (str4 != null) {
                    if (wqcVar == null || !wqcVar.a.equals(str4)) {
                        wqc wqcVar2 = new wqc(str4);
                        arrayList.add(wqcVar2);
                        wqcVar = wqcVar2;
                    } else {
                        wqcVar.b++;
                    }
                    sb = null;
                }
            } else if (z) {
                z = false;
                sb = null;
                str4 = null;
                if (str4 != null) {
                }
            } else {
                sb = new StringBuilder();
                arrayList.add(new wqc(sb));
                z = true;
                str4 = null;
                if (str4 != null) {
                }
            }
            i++;
        }
        if (z) {
            ny61.g("Unmatched quote in format: ".concat(str));
            return null;
        }
        wqc[] wqcVarArr = (wqc[]) arrayList.toArray(new wqc[0]);
        if (wqc.a(wqcVarArr, "d")) {
            j2 = j / 86400000;
            j3 = j - (86400000 * j2);
        } else {
            j2 = 0;
            j3 = j;
        }
        if (wqc.a(wqcVarArr, CA20Status.STATUS_CERTIFICATE_H)) {
            long j8 = j3 / 3600000;
            j3 -= 3600000 * j8;
            j4 = j8;
        } else {
            j4 = 0;
        }
        if (wqc.a(wqcVarArr, "m")) {
            long j9 = j3 / 60000;
            j3 -= 60000 * j9;
            j5 = j9;
        } else {
            j5 = 0;
        }
        if (wqc.a(wqcVarArr, "s")) {
            long j10 = j3 / 1000;
            j3 -= 1000 * j10;
            j6 = j10;
        } else {
            j6 = 0;
        }
        StringBuilder sb3 = new StringBuilder();
        int length = wqcVarArr.length;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            int i3 = i2;
            wqc wqcVar3 = wqcVarArr[i3];
            int i4 = length;
            Object obj = wqcVar3.a;
            int i5 = wqcVar3.b;
            long j11 = j3;
            if (obj instanceof StringBuilder) {
                sb3.append(obj.toString());
            } else {
                if (obj.equals(RemoteBioParameters.Y)) {
                    sb3.append(rob1.c(i5, 0L));
                } else if (obj.equals("M")) {
                    sb3.append(rob1.c(i5, 0L));
                } else if (obj.equals("d")) {
                    sb3.append(rob1.c(i5, j2));
                } else if (obj.equals(CA20Status.STATUS_CERTIFICATE_H)) {
                    sb3.append(rob1.c(i5, j4));
                } else {
                    if (obj.equals("m")) {
                        sb3.append(rob1.c(i5, j5));
                        str3 = str2;
                        z2 = false;
                    } else {
                        long j12 = j5;
                        if (obj.equals(str2)) {
                            str3 = str2;
                            j5 = j12;
                            sb3.append(rob1.c(i5, j6));
                            z2 = true;
                        } else {
                            str3 = str2;
                            j5 = j12;
                            long j13 = j6;
                            if (obj.equals("S")) {
                                if (z2) {
                                    j6 = j13;
                                    j7 = j11;
                                    sb3.append(rob1.c(Math.max(3, i5), j7));
                                } else {
                                    j6 = j13;
                                    j7 = j11;
                                    sb3.append(rob1.c(i5, j7));
                                }
                                z2 = false;
                                i2 = i3 + 1;
                                j3 = j7;
                                length = i4;
                                str2 = str3;
                            } else {
                                j6 = j13;
                            }
                        }
                    }
                    j7 = j11;
                    i2 = i3 + 1;
                    j3 = j7;
                    length = i4;
                    str2 = str3;
                }
                z2 = false;
            }
            str3 = str2;
            j7 = j11;
            i2 = i3 + 1;
            j3 = j7;
            length = i4;
            str2 = str3;
        }
        return sb3.toString();
    }
}
