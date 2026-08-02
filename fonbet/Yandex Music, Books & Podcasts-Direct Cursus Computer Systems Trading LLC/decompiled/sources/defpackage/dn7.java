package defpackage;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.regex.Pattern;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dn7 extends h0o {
    public final /* synthetic */ int a;
    public final Object b;

    public dn7(JSONObject jSONObject) {
        this.a = 2;
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        byte[] bytes = jSONObject2.getBytes(Charsets.UTF_8);
        bytes.getClass();
        this.b = bytes;
    }

    @Override // defpackage.h0o
    public final long a() {
        switch (this.a) {
            case 0:
                return ((z5e) this.b).getContentLength();
            case 1:
                File file = (File) this.b;
                if (file.length() <= 2000000) {
                    return file.length();
                }
                return 2000000L;
            default:
                return ((byte[]) this.b).length;
        }
    }

    @Override // defpackage.h0o
    public final twh b() {
        twh twhVar;
        switch (this.a) {
            case 0:
                Pattern pattern = twh.e;
                return q5g.C(((z5e) this.b).getContentType());
            case 1:
                Pattern pattern2 = twh.e;
                try {
                    return q5g.C("text/plain");
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            default:
                Pattern pattern3 = twh.e;
                try {
                    twhVar = q5g.C("application/json");
                } catch (IllegalArgumentException unused2) {
                    twhVar = null;
                }
                if (twhVar != null) {
                    return twhVar;
                }
                xq0.x("mime type not parsed");
                return null;
        }
    }

    @Override // defpackage.h0o
    public boolean c() {
        switch (this.a) {
            case 0:
                return ((z5e) this.b) instanceof yot;
            default:
                return super.c();
        }
    }

    @Override // defpackage.h0o
    public final void d(gj3 gj3Var) {
        switch (this.a) {
            case 0:
                ((z5e) this.b).g(gj3Var);
                return;
            case 1:
                File file = (File) this.b;
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, rhn.a.a());
                try {
                    if (file.length() > 2000000) {
                        randomAccessFile.seek(file.length() - 2000000);
                    }
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = randomAccessFile.read(bArr);
                        if (read < 0) {
                            gj3Var.flush();
                            randomAccessFile.close();
                            return;
                        }
                        gj3Var.r0(read, bArr);
                    }
                } finally {
                }
            default:
                gj3Var.write((byte[]) this.b);
                return;
        }
    }

    public /* synthetic */ dn7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
