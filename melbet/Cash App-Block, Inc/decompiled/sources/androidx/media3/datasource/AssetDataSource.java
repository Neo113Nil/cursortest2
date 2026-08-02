package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.common.util.Util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class AssetDataSource extends BaseDataSource {
    public final AssetManager assetManager;
    public long bytesRemaining;
    public InputStream inputStream;
    public boolean opened;
    public Uri uri;

    public final class AssetDataSourceException extends DataSourceException {
    }

    public AssetDataSource(Context context) {
        super(false);
        this.assetManager = context.getAssets();
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.uri = null;
        try {
            try {
                InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AssetDataSourceException(2000, e);
            }
        } finally {
            this.inputStream = null;
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
        try {
            Uri uri = dataSpec.uri;
            long j = dataSpec.position;
            this.uri = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing();
            InputStream open = this.assetManager.open(path, 1);
            this.inputStream = open;
            if (open.skip(j) < j) {
                throw new AssetDataSourceException(2008, null);
            }
            long j2 = dataSpec.length;
            if (j2 != -1) {
                this.bytesRemaining = j2;
            } else {
                long available = this.inputStream.available();
                this.bytesRemaining = available;
                if (available == 2147483647L) {
                    this.bytesRemaining = -1L;
                }
            }
            this.opened = true;
            transferStarted(dataSpec);
            return this.bytesRemaining;
        } catch (AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSourceException(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new AssetDataSourceException(2000, e);
                }
            }
            InputStream inputStream = this.inputStream;
            String str = Util.DEVICE_DEBUG_INFO;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.bytesRemaining;
                if (j2 != -1) {
                    this.bytesRemaining = j2 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
