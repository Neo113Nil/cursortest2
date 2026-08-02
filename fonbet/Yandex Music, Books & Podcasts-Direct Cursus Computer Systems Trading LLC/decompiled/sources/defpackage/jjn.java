package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class jjn extends lq2 {
    public final Context e;
    public nb7 f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public jjn(Context context) {
        super(false);
        this.e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        Resources resourcesForApplication;
        int parseInt;
        int i;
        Resources resources;
        this.f = nb7Var;
        f(nb7Var);
        Uri uri = nb7Var.a;
        long j = nb7Var.g;
        long j2 = nb7Var.f;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.e;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new ijn(2000, null, "rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new ijn(1004, null, "Resource identifier must be an integer.");
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new ijn(1004, null, "Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.");
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
                    throw new ijn(2005, e, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.");
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new ijn(1004, null, "Resource identifier must be an integer.");
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(ouj.o(packageName, StringUtils.PROCESS_POSTFIX_DELIMITER, path), "raw", null);
                if (parseInt == 0) {
                    throw new ijn(2005, null, "Resource not found.");
                }
            }
            i = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd == null) {
                throw new ijn(2000, null, k5r.k(normalizeScheme, "Resource is compressed: "));
            }
            this.g = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.g.getFileDescriptor());
            this.h = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new ijn(2008, null, null);
                }
                long startOffset = this.g.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new ijn(2008, null, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.i = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.i = size;
                        if (size < 0) {
                            throw new ijn(2008, null, null);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.i = j3;
                    if (j3 < 0) {
                        throw new hb7(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.i;
                    this.i = j4 == -1 ? j : Math.min(j4, j);
                }
                this.j = true;
                g(nb7Var);
                return j != -1 ? j : this.i;
            } catch (ijn e2) {
                throw e2;
            } catch (IOException e3) {
                throw new ijn(2000, e3, null);
            }
        } catch (Resources.NotFoundException e4) {
            throw new ijn(2005, e4, null);
        }
    }

    @Override // defpackage.db7
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new ijn(2000, e, null);
                    }
                } finally {
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        d();
                    }
                }
            } catch (IOException e2) {
                throw new ijn(2000, e2, null);
            }
        } catch (Throwable th) {
            this.h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        d();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new ijn(2000, e3, null);
                }
            } finally {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    d();
                }
            }
        }
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        nb7 nb7Var = this.f;
        if (nb7Var != null) {
            return nb7Var.a;
        }
        return null;
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ijn(2000, e, null);
                }
            }
            FileInputStream fileInputStream = this.h;
            int i3 = dvt.a;
            int read = fileInputStream.read(bArr, i, i2);
            long j2 = this.i;
            if (read != -1) {
                if (j2 != -1) {
                    this.i = j2 - read;
                }
                c(read);
                return read;
            }
            if (j2 != -1) {
                throw new ijn(2000, new EOFException(), "End of stream reached having not read sufficient data.");
            }
        }
        return -1;
    }
}
