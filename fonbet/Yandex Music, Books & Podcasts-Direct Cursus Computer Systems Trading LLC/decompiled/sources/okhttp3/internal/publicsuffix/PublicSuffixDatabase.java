package okhttp3.internal.publicsuffix;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.c5b;
import defpackage.dfi;
import defpackage.fxf;
import defpackage.ikn;
import defpackage.jhp;
import defpackage.jkl;
import defpackage.jrd;
import defpackage.otk;
import defpackage.pra;
import defpackage.t75;
import defpackage.ura;
import defpackage.xq0;
import defpackage.xqn;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "jkl", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List f = t75.c("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List e0 = StringsKt.e0(str, new char[]{'.'}, 6);
        return Intrinsics.d(CollectionsKt.Y(e0), "") ? CollectionsKt.M(e0) : e0;
    }

    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        List list;
        List list2;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List c = c(unicode);
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        otk otkVar = otk.a;
                        otk.a.getClass();
                        otk.i(5, "Failed to read public suffix list", e2);
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
        if (this.c == null) {
            xq0.q("Unable to load publicsuffixes.gz resource from the classpath.");
            return null;
        }
        int size3 = c.size();
        byte[][] bArr = new byte[size3][];
        for (int i = 0; i < size3; i++) {
            String str5 = (String) c.get(i);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str5.getBytes(charset);
            bytes.getClass();
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                Intrinsics.j("publicSuffixListBytes");
                throw null;
            }
            str2 = jkl.c(bArr2, bArr, i2);
            if (str2 != null) {
                break;
            }
            i2++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                bArr3[i3] = e;
                byte[] bArr4 = this.c;
                if (bArr4 == null) {
                    Intrinsics.j("publicSuffixListBytes");
                    throw null;
                }
                str3 = jkl.c(bArr4, bArr3, i3);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i4 = size3 - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                byte[] bArr5 = this.d;
                if (bArr5 == null) {
                    Intrinsics.j("publicSuffixExceptionListBytes");
                    throw null;
                }
                str4 = jkl.c(bArr5, bArr, i5);
                if (str4 != null) {
                    break;
                }
            }
        }
        str4 = null;
        if (str4 != null) {
            list2 = StringsKt.e0("!".concat(str4), new char[]{'.'}, 6);
        } else if (str2 == null && str3 == null) {
            list2 = f;
        } else {
            if (str2 == null || (list = StringsKt.e0(str2, new char[]{'.'}, 6)) == null) {
                list = c5b.a;
            }
            if (str3 == null || (list2 = StringsKt.e0(str3, new char[]{'.'}, 6)) == null) {
                list2 = c5b.a;
            }
            if (list.size() > list2.size()) {
                list2 = list;
            }
        }
        if (c.size() == list2.size() && ((String) list2.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) list2.get(0)).charAt(0) == '!') {
            size = c.size();
            size2 = list2.size();
        } else {
            size = c.size();
            size2 = list2.size() + 1;
        }
        int i6 = size - size2;
        Sequence F = CollectionsKt.F(c(str));
        if (i6 < 0) {
            xq0.o(dfi.c(i6, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i6 != 0) {
            F = F instanceof ura ? ((ura) F).a(i6) : new pra(F, i6, 0);
        }
        return jhp.g(F, ".", null, 62);
    }

    public final void b() {
        try {
            xqn xqnVar = new xqn();
            xqn xqnVar2 = new xqn();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                ikn iknVar = new ikn(new jrd(fxf.T(resourceAsStream)));
                try {
                    long readInt = iknVar.readInt();
                    iknVar.a0(readInt);
                    xqnVar.a = iknVar.b.X(readInt);
                    long readInt2 = iknVar.readInt();
                    iknVar.a0(readInt2);
                    xqnVar2.a = iknVar.b.X(readInt2);
                    iknVar.close();
                    synchronized (this) {
                        Object obj = xqnVar.a;
                        obj.getClass();
                        this.c = (byte[]) obj;
                        Object obj2 = xqnVar2.a;
                        obj2.getClass();
                        this.d = (byte[]) obj2;
                    }
                } finally {
                }
            }
        } finally {
            this.b.countDown();
        }
    }
}
