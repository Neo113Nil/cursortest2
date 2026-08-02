package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import yads.it0;

/* loaded from: classes7.dex */
public final class qk71 extends yd71 {
    public boolean A;
    public RandomAccessFile x;
    public Uri y;
    public long z;

    public qk71() {
        super(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r0 != false) goto L39;
     */
    @Override // defpackage.u871
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long Q(no71 no71Var) {
        boolean b;
        Uri uri = no71Var.a;
        long j = no71Var.e;
        this.y = uri;
        h();
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.x = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = no71Var.f;
                if (j2 == -1) {
                    j2 = this.x.length() - j;
                }
                this.z = j2;
                if (j2 < 0) {
                    throw new it0(2008, null, null);
                }
                this.A = true;
                a(no71Var);
                return this.z;
            } catch (IOException e) {
                throw new it0(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (rf71.a >= 21) {
                    b = hb71.b(e2.getCause());
                }
                i = 2005;
                throw new it0(i, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder v = b64.v("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            v.append(fragment);
            throw new it0(1004, e2, v.toString());
        } catch (SecurityException e3) {
            throw new it0(2006, e3);
        } catch (RuntimeException e4) {
            throw new it0(2000, e4);
        }
    }

    @Override // defpackage.u871
    public final void close() {
        this.y = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.x;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new it0(2000, e);
            }
        } finally {
            this.x = null;
            if (this.A) {
                this.A = false;
                g();
            }
        }
    }

    @Override // defpackage.u871
    public final Uri d() {
        return this.y;
    }

    @Override // defpackage.jz61
    public final int v(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.z;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.x;
            int i3 = rf71.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.z -= read;
                c(read);
            }
            return read;
        } catch (IOException e) {
            throw new it0(2000, e);
        }
    }
}
