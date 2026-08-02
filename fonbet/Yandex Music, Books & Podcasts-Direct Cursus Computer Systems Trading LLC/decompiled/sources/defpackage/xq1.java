package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class xq1 extends lq2 {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public xq1(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        try {
            Uri uri = nb7Var.a;
            long j = nb7Var.f;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            f(nb7Var);
            InputStream open = this.e.open(path, 1);
            this.g = open;
            if (open.skip(j) < j) {
                throw new wq1(2008, null);
            }
            long j2 = nb7Var.g;
            if (j2 != -1) {
                this.h = j2;
            } else {
                long available = this.g.available();
                this.h = available;
                if (available == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            g(nb7Var);
            return this.h;
        } catch (wq1 e) {
            throw e;
        } catch (IOException e2) {
            throw new wq1(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // defpackage.db7
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new wq1(2000, e);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                d();
            }
        }
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return this.f;
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new wq1(2000, e);
                }
            }
            InputStream inputStream = this.g;
            int i3 = dvt.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.h;
                if (j2 != -1) {
                    this.h = j2 - read;
                }
                c(read);
                return read;
            }
        }
        return -1;
    }
}
