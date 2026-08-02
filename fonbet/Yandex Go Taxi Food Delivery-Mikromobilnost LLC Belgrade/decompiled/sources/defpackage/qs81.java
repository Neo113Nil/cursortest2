package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import yads.wh;

/* loaded from: classes7.dex */
public final class qs81 extends yd71 {
    public long A;
    public boolean B;
    public final AssetManager x;
    public Uri y;
    public InputStream z;

    public qs81(Context context) {
        super(false);
        this.x = context.getAssets();
    }

    @Override // defpackage.u871
    public final long Q(no71 no71Var) {
        try {
            Uri uri = no71Var.a;
            long j = no71Var.e;
            this.y = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            h();
            InputStream open = this.x.open(path, 1);
            this.z = open;
            if (open.skip(j) < j) {
                throw new wh(2008, null);
            }
            long j2 = no71Var.f;
            if (j2 != -1) {
                this.A = j2;
            } else {
                long available = this.z.available();
                this.A = available;
                if (available == 2147483647L) {
                    this.A = -1L;
                }
            }
            this.B = true;
            a(no71Var);
            return this.A;
        } catch (wh e) {
            throw e;
        } catch (IOException e2) {
            throw new wh(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // defpackage.u871
    public final void close() {
        this.y = null;
        try {
            try {
                InputStream inputStream = this.z;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new wh(2000, e);
            }
        } finally {
            this.z = null;
            if (this.B) {
                this.B = false;
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
        long j = this.A;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new wh(2000, e);
            }
        }
        InputStream inputStream = this.z;
        int i3 = rf71.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.A;
        if (j2 != -1) {
            this.A = j2 - read;
        }
        c(read);
        return read;
    }
}
