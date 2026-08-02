package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.u;
import java.io.EOFException;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class vu6 implements kkf0 {
    public final e5p a;
    public b5p b;
    public kbh c;

    public vu6(e5p e5pVar) {
        this.a = e5pVar;
    }

    public final long a() {
        kbh kbhVar = this.c;
        if (kbhVar != null) {
            return kbhVar.w;
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r1.w != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (r1.w != r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(kpg kpgVar, Uri uri, Map map, long j, long j2, qkf0 qkf0Var) {
        kbh kbhVar = new kbh(kpgVar, j, j2);
        this.c = kbhVar;
        if (this.b != null) {
            return;
        }
        b5p[] b = this.a.b(uri, map);
        int length = b.length;
        piv pivVar = ImmutableList.b;
        y5e.i(length, "expectedSize");
        ImmutableList.a aVar = new ImmutableList.a(length);
        boolean z = true;
        if (b.length == 1) {
            this.b = b[0];
        } else {
            int length2 = b.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                }
                b5p b5pVar = b[i];
                try {
                } catch (EOFException unused) {
                    if (this.b == null) {
                    }
                } catch (Throwable th) {
                    if (this.b == null && kbhVar.w != j) {
                        z = false;
                    }
                    d6z.x(z);
                    kbhVar.y = 0;
                    throw th;
                }
                if (b5pVar.h(kbhVar)) {
                    this.b = b5pVar;
                    kbhVar.y = 0;
                    break;
                }
                aVar.d(b5pVar.d());
                if (this.b == null) {
                }
                boolean z2 = true;
                d6z.x(z2);
                kbhVar.y = 0;
                i++;
            }
            if (this.b == null) {
                String str = "None of the available extractors (" + new mf1(Extension.FIX_SPACE).i(u.b(ImmutableList.m(b), new quz(27))) + ") could read the stream.";
                uri.getClass();
                throw new UnrecognizedInputFormatException(str, uri, aVar.g());
            }
        }
        this.b.e(qkf0Var);
    }
}
