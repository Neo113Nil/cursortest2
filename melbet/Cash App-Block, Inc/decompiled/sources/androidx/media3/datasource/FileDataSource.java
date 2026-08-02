package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.common.util.Util;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public final class FileDataSource extends BaseDataSource {
    public long bytesRemaining;
    public RandomAccessFile file;
    public boolean opened;
    public Uri uri;

    public final class FileDataSourceException extends DataSourceException {
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.uri = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.file;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(2000, e);
            }
        } finally {
            this.file = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public final long open(DataSpec dataSpec) {
        Uri uri = dataSpec.uri;
        long j = dataSpec.position;
        this.uri = uri;
        transferInitializing();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.file = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = dataSpec.length;
                if (j2 == -1) {
                    j2 = this.file.length() - j;
                }
                this.bytesRemaining = j2;
                if (j2 < 0) {
                    throw new FileDataSourceException(2008, null, null);
                }
                this.opened = true;
                transferStarted(dataSpec);
                return this.bytesRemaining;
            } catch (IOException e) {
                throw new FileDataSourceException(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            m.append(fragment);
            throw new FileDataSourceException(1004, e2, m.toString());
        } catch (SecurityException e3) {
            throw new FileDataSourceException(2006, e3);
        } catch (RuntimeException e4) {
            throw new FileDataSourceException(2000, e4);
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.file;
            String str = Util.DEVICE_DEBUG_INFO;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.bytesRemaining -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSourceException(2000, e);
        }
    }
}
