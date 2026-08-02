package okhttp3.internal.publicsuffix;

import defpackage.evu0;
import defpackage.h73;
import defpackage.j93;
import defpackage.jl40;
import defpackage.uza;
import defpackage.wdz;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.sequences.b;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.ssl.Alerts;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "wdz", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PublicSuffixDatabase {
    public static final ByteString b = new ByteString(Arrays.copyOf(new byte[]{Alerts.alert_bad_certificate}, 1));
    public static final List c = Collections.singletonList("*");
    public static final PublicSuffixDatabase d = new PublicSuffixDatabase(new j93(0));
    public final j93 a;

    public PublicSuffixDatabase(j93 j93Var) {
        this.a = j93Var;
    }

    public static List b(String str) {
        List Y = evu0.Y(str, new char[]{'.'}, 0, 6);
        return jl40.l(a.Z(Y), "") ? a.K(Y) : Y;
    }

    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        List list;
        int size;
        int size2;
        List b2 = b(IDN.toUnicode(str));
        j93 j93Var = this.a;
        AtomicBoolean atomicBoolean = j93Var.a;
        int i = 1;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                j93Var.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        j93Var.c();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        j93Var.e = e;
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (j93Var.c == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + ((Object) j93Var.a()) + " resource.");
            illegalStateException.initCause(j93Var.e);
            throw illegalStateException;
        }
        int size3 = b2.size();
        ByteString[] byteStringArr = new ByteString[size3];
        for (int i2 = 0; i2 < size3; i2++) {
            String str5 = (String) b2.get(i2);
            ByteString byteString = new ByteString(str5.getBytes(uza.a));
            byteString.b = str5;
            byteStringArr[i2] = byteString;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                str2 = null;
                break;
            }
            ByteString byteString2 = j93Var.c;
            if (byteString2 == null) {
                byteString2 = null;
            }
            str2 = wdz.b(byteString2, byteStringArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (size3 > 1) {
            ByteString[] byteStringArr2 = (ByteString[]) byteStringArr.clone();
            int length = byteStringArr2.length - 1;
            for (int i4 = 0; i4 < length; i4++) {
                byteStringArr2[i4] = b;
                ByteString byteString3 = j93Var.c;
                if (byteString3 == null) {
                    byteString3 = null;
                }
                str3 = wdz.b(byteString3, byteStringArr2, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i5 = size3 - 1;
            for (int i6 = 0; i6 < i5; i6++) {
                ByteString byteString4 = j93Var.d;
                if (byteString4 == null) {
                    byteString4 = null;
                }
                str4 = wdz.b(byteString4, byteStringArr, i6);
                if (str4 != null) {
                    break;
                }
            }
        }
        str4 = null;
        if (str4 != null) {
            list = evu0.Y("!".concat(str4), new char[]{'.'}, 0, 6);
        } else if (str2 == null && str3 == null) {
            list = c;
        } else {
            List list2 = EmptyList.a;
            List Y = str2 != null ? evu0.Y(str2, new char[]{'.'}, 0, 6) : list2;
            if (str3 != null) {
                list2 = evu0.Y(str3, new char[]{'.'}, 0, 6);
            }
            list = Y.size() > list2.size() ? Y : list2;
        }
        if (b2.size() == list.size() && ((String) list.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) list.get(0)).charAt(0) == '!') {
            size = b2.size();
            size2 = list.size();
        } else {
            size = b2.size();
            size2 = list.size() + 1;
        }
        return b.m(b.f(new h73(i, b(str)), size - size2), Extension.DOT_CHAR, null, 62);
    }
}
