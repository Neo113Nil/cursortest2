package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.util.Util;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes3.dex */
public final class RawResourceDataSource extends BaseDataSource {
    public final Context applicationContext;
    public AssetFileDescriptor assetFileDescriptor;
    public long bytesRemaining;
    public DataSpec dataSpec;
    public FileInputStream inputStream;
    public boolean opened;

    public final class RawResourceDataSourceException extends DataSourceException {
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.applicationContext = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.dataSpec = null;
        try {
            try {
                FileInputStream fileInputStream = this.inputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.inputStream = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new RawResourceDataSourceException(2000, e, null);
                    }
                } finally {
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                }
            } catch (IOException e2) {
                throw new RawResourceDataSourceException(2000, e2, null);
            }
        } catch (Throwable th) {
            this.inputStream = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.assetFileDescriptor;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new RawResourceDataSourceException(2000, e3, null);
                }
            } finally {
                this.assetFileDescriptor = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final long open(DataSpec dataSpec) {
        Resources resourcesForApplication;
        int parseInt;
        int i;
        Resources resources;
        this.dataSpec = dataSpec;
        transferInitializing();
        Uri uri = dataSpec.uri;
        long j = dataSpec.length;
        long j2 = dataSpec.position;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.applicationContext;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSourceException(2000, null, "rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException(1004, null, "Resource identifier must be an integer.");
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException(1004, null, "Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.");
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RawResourceDataSourceException(2005, e, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.");
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSourceException(1004, null, "Resource identifier must be an integer.");
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(Recorder$$ExternalSyntheticOutline2.m(packageName, ":", path), "raw", null);
                if (parseInt == 0) {
                    throw new RawResourceDataSourceException(2005, null, "Resource not found.");
                }
            }
            i = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd == null) {
                throw new RawResourceDataSourceException(2000, null, CameraState$Type$EnumUnboxingLocalUtility.m(normalizeScheme, "Resource is compressed: "));
            }
            this.assetFileDescriptor = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.assetFileDescriptor.getFileDescriptor());
            this.inputStream = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new RawResourceDataSourceException(2008, null, null);
                }
                long startOffset = this.assetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new RawResourceDataSourceException(2008, null, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.bytesRemaining = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.bytesRemaining = size;
                        if (size < 0) {
                            throw new RawResourceDataSourceException(2008, null, null);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.bytesRemaining = j3;
                    if (j3 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.bytesRemaining;
                    this.bytesRemaining = j4 == -1 ? j : Math.min(j4, j);
                }
                this.opened = true;
                transferStarted(dataSpec);
                return j != -1 ? j : this.bytesRemaining;
            } catch (RawResourceDataSourceException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RawResourceDataSourceException(2000, e3, null);
            }
        } catch (Resources.NotFoundException e4) {
            throw new RawResourceDataSourceException(2005, e4, null);
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
                    throw new RawResourceDataSourceException(2000, e, null);
                }
            }
            FileInputStream fileInputStream = this.inputStream;
            String str = Util.DEVICE_DEBUG_INFO;
            int read = fileInputStream.read(bArr, i, i2);
            long j2 = this.bytesRemaining;
            if (read != -1) {
                if (j2 != -1) {
                    this.bytesRemaining = j2 - read;
                }
                bytesTransferred(read);
                return read;
            }
            if (j2 != -1) {
                throw new RawResourceDataSourceException(2000, new EOFException(), "End of stream reached having not read sufficient data.");
            }
        }
        return -1;
    }
}
