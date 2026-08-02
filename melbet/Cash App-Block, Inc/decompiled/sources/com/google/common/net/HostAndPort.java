package com.google.common.net;

import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class HostAndPort implements Serializable {
    public final String host;
    public final int port;

    public HostAndPort(String str, int i) {
        this.host = str;
        this.port = i;
    }

    public static HostAndPort fromString(String str) {
        String str2;
        String str3;
        Integer num;
        String[] strArr;
        str.getClass();
        if (str.startsWith("[")) {
            Trace.checkArgument("Bracketed host-port string must start with a bracket: %s", str, str.charAt(0) == '[');
            int indexOf = str.indexOf(58);
            int lastIndexOf = str.lastIndexOf(93);
            Trace.checkArgument("Invalid bracketed host/port: %s", str, indexOf > -1 && lastIndexOf > indexOf);
            String substring = str.substring(1, lastIndexOf);
            int i = lastIndexOf + 1;
            if (i == str.length()) {
                strArr = new String[]{substring, ""};
            } else {
                Trace.checkArgument("Only a colon may follow a close bracket: %s", str, str.charAt(i) == ':');
                int i2 = lastIndexOf + 2;
                for (int i3 = i2; i3 < str.length(); i3++) {
                    Trace.checkArgument("Port must be numeric: %s", str, Character.isDigit(str.charAt(i3)));
                }
                strArr = new String[]{substring, str.substring(i2)};
            }
            str3 = strArr[0];
            str2 = strArr[1];
        } else {
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0) {
                int i4 = indexOf2 + 1;
                if (str.indexOf(58, i4) == -1) {
                    str3 = str.substring(0, indexOf2);
                    str2 = str.substring(i4);
                }
            }
            str2 = null;
            str3 = str;
        }
        if (TransactorKt.stringIsNullOrEmpty(str2)) {
            num = -1;
        } else {
            Integer tryParse = CompositeException.WrappedPrintStream.tryParse(str2);
            Trace.checkArgument("Unparseable port number: %s", str, tryParse != null);
            int intValue = tryParse.intValue();
            Trace.checkArgument("Port number out of range: %s", str, intValue >= 0 && intValue <= 65535);
            num = tryParse;
        }
        return new HostAndPort(str3, num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HostAndPort) {
            HostAndPort hostAndPort = (HostAndPort) obj;
            if (Objects.equals(this.host, hostAndPort.host) && this.port == hostAndPort.port) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.host, Integer.valueOf(this.port));
    }

    public final String toString() {
        String str = this.host;
        StringBuilder sb = new StringBuilder(str.length() + 8);
        if (str.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(str);
            sb.append(']');
        } else {
            sb.append(str);
        }
        int i = this.port;
        if (i >= 0) {
            sb.append(':');
            sb.append(i);
        }
        return sb.toString();
    }
}
