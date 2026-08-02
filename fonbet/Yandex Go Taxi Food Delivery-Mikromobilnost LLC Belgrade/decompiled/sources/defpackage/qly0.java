package defpackage;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* loaded from: classes11.dex */
public abstract class qly0 {
    public final Charset a;

    public qly0(int i) {
        this.a = uza.a;
    }

    public abstract yt31 a(String str);

    public final Object b(FileInputStream fileInputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, this.a);
        try {
            String x0 = cma1.x0(inputStreamReader);
            inputStreamReader.close();
            return a(x0);
        } finally {
        }
    }

    public qly0() {
        this(0);
    }
}
