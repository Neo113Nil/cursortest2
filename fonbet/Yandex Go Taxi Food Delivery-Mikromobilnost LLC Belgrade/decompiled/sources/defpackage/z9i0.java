package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes10.dex */
public final class z9i0 extends nz4 {
    public final Context a;
    public npg b;
    public AssetFileDescriptor c;
    public FileInputStream w;
    public long x;
    public boolean y;

    public z9i0(Context context) {
        super(false);
        this.a = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // defpackage.kpg
    public final void close() {
        this.b = null;
        try {
            try {
                FileInputStream fileInputStream = this.w;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.w = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new RawResourceDataSource$RawResourceDataSourceException(2000, e, null);
                    }
                } finally {
                    this.c = null;
                    if (this.y) {
                        this.y = false;
                        transferEnded();
                    }
                }
            } catch (IOException e2) {
                throw new RawResourceDataSource$RawResourceDataSourceException(2000, e2, null);
            }
        } catch (Throwable th) {
            this.w = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.c = null;
                    if (this.y) {
                        this.y = false;
                        transferEnded();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2000, e3, null);
                }
            } finally {
                this.c = null;
                if (this.y) {
                    this.y = false;
                    transferEnded();
                }
            }
        }
    }

    @Override // defpackage.kpg
    /* renamed from: getUri */
    public final Uri getInflatedUri() {
        npg npgVar = this.b;
        if (npgVar != null) {
            return npgVar.a;
        }
        return null;
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        Resources resourcesForApplication;
        int parseInt;
        int i;
        Resources resources;
        this.b = npgVar;
        transferInitializing(npgVar);
        Uri uri = npgVar.a;
        long j = npgVar.g;
        long j2 = npgVar.f;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.a;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSource$RawResourceDataSourceException(2000, null, "rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSource$RawResourceDataSourceException(1004, null, "Resource identifier must be an integer.");
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new RawResourceDataSource$RawResourceDataSourceException(1004, null, "Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.");
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
                    throw new RawResourceDataSource$RawResourceDataSourceException(2005, e, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.");
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(1004, null, "Resource identifier must be an integer.");
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(g8e.p(packageName, ":", path), "raw", null);
                if (parseInt == 0) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2005, null, "Resource not found.");
                }
            }
            i = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd == null) {
                throw new RawResourceDataSource$RawResourceDataSourceException(2000, null, unr0.n(normalizeScheme, "Resource is compressed: "));
            }
            this.c = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.c.getFileDescriptor());
            this.w = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2008, null, null);
                }
                long startOffset = this.c.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2008, null, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.x = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.x = size;
                        if (size < 0) {
                            throw new RawResourceDataSource$RawResourceDataSourceException(2008, null, null);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.x = j3;
                    if (j3 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.x;
                    this.x = j4 == -1 ? j : Math.min(j4, j);
                }
                this.y = true;
                transferStarted(npgVar);
                return j != -1 ? j : this.x;
            } catch (RawResourceDataSource$RawResourceDataSourceException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RawResourceDataSource$RawResourceDataSourceException(2000, e3, null);
            }
        } catch (Resources.NotFoundException e4) {
            throw new RawResourceDataSource$RawResourceDataSourceException(2005, e4, null);
        }
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.x;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2000, e, null);
                }
            }
            FileInputStream fileInputStream = this.w;
            int i3 = tw21.a;
            int read = fileInputStream.read(bArr, i, i2);
            long j2 = this.x;
            if (read != -1) {
                if (j2 != -1) {
                    this.x = j2 - read;
                }
                bytesTransferred(read);
                return read;
            }
            if (j2 != -1) {
                throw new RawResourceDataSource$RawResourceDataSourceException(2000, new EOFException(), "End of stream reached having not read sufficient data.");
            }
        }
        return -1;
    }
}
