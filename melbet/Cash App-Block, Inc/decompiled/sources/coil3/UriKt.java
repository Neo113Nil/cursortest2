package coil3;

import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.Path;

/* loaded from: classes3.dex */
public abstract class UriKt {
    public static Uri Uri$default(String str) {
        String str2 = Path.DIRECTORY_SEPARATOR;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new Uri(sb.toString(), str2, "file", null, str);
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewGenieScene.deepLinkSpecs;
    }

    public static final String getFilePath(Uri uri) {
        List pathSegments = getPathSegments(uri);
        String str = uri.separator;
        if (pathSegments.isEmpty()) {
            return null;
        }
        String str2 = uri.path;
        str2.getClass();
        if (!StringsKt__StringsJVMKt.startsWith(str2, str, false)) {
            str = "";
        }
        return CollectionsKt.joinToString$default(pathSegments, uri.separator, str, null, 0, null, null, 60);
    }

    public static final List getPathSegments(Uri uri) {
        String str = uri.path;
        if (str == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '/', i2, false, 4);
            if (indexOf$default == -1) {
                indexOf$default = str.length();
            }
            String substring = str.substring(i2, indexOf$default);
            if (substring.length() > 0) {
                arrayList.add(substring);
            }
            i = indexOf$default;
        }
        return arrayList;
    }

    public static final String percentDecode(String str, byte[] bArr) {
        int length = str.length();
        int max = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= max) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    return StringsKt__StringsJVMKt.decodeToString$default(0, i2, 5, bArr);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    bArr[i2] = (byte) Integer.parseInt(str.substring(i + 1, i3), CharsKt.checkRadix(16));
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static Uri toUri$default(String str) {
        String str2;
        String str3;
        String str4 = Path.DIRECTORY_SEPARATOR;
        String replace$default = !Intrinsics.areEqual(str4, "/") ? StringsKt__StringsJVMKt.replace$default(str, str4, "/") : str;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < replace$default.length()) {
            char charAt = replace$default.charAt(i);
            if (charAt != '#') {
                if (charAt != '/') {
                    if (charAt != ':') {
                        if (charAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/') {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (replace$default.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int min = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, replace$default.length());
        int min2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, min);
        if (i5 != -1) {
            str3 = replace$default.substring(0, i6);
            str2 = replace$default.substring(i5, Math.min(i3 != -1 ? i3 : Integer.MAX_VALUE, min2));
        } else {
            str2 = null;
            str3 = null;
        }
        String substring = i3 != -1 ? replace$default.substring(i3, min2) : null;
        String substring2 = i4 != -1 ? replace$default.substring(i4, min) : null;
        String substring3 = i2 != -1 ? replace$default.substring(i2, replace$default.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(str3 != null ? str3.length() : 0, Math.max(str2 != null ? str2.length() : 0, Math.max(substring != null ? substring.length() : 0, Math.max(substring2 != null ? substring2.length() : 0, substring3 != null ? substring3.length() : 0)))) - 2)];
        String percentDecode = str3 != null ? percentDecode(str3, bArr) : null;
        String percentDecode2 = str2 != null ? percentDecode(str2, bArr) : null;
        String percentDecode3 = substring != null ? percentDecode(substring, bArr) : null;
        if (substring2 != null) {
            percentDecode(substring2, bArr);
        }
        if (substring3 != null) {
            percentDecode(substring3, bArr);
        }
        return new Uri(replace$default, str4, percentDecode, percentDecode2, percentDecode3);
    }
}
