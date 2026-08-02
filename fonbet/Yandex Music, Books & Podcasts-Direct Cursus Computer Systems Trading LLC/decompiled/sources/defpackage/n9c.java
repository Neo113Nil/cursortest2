package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class n9c extends lq2 {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        Uri uri = nb7Var.a;
        long j = nb7Var.f;
        this.f = uri;
        f(nb7Var);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = nb7Var.g;
                if (j2 == -1) {
                    j2 = this.e.length() - j;
                }
                this.g = j2;
                if (j2 < 0) {
                    throw new m9c(2008, null, null);
                }
                this.h = true;
                g(nb7Var);
                return this.g;
            } catch (IOException e) {
                throw new m9c(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new m9c(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder m = f1d.m("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            m.append(fragment);
            throw new m9c(1004, e2, m.toString());
        } catch (SecurityException e3) {
            throw new m9c(2006, e3);
        } catch (RuntimeException e4) {
            throw new m9c(2000, e4);
        }
    }

    @Override // defpackage.db7
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new m9c(2000, e);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
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
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            int i3 = dvt.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.g -= read;
                c(read);
            }
            return read;
        } catch (IOException e) {
            throw new m9c(2000, e);
        }
    }
}
