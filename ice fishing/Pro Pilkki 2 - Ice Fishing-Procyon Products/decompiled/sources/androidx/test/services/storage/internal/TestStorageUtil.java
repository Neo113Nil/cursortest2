package androidx.test.services.storage.internal;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import androidx.test.internal.util.Checks;
import androidx.test.services.storage.TestStorageException;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class TestStorageUtil {
    public static InputStream getInputStream(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        Checks.checkNotNull(uri);
        ContentProviderClient contentProviderClientMakeContentProviderClient = null;
        try {
            try {
                contentProviderClientMakeContentProviderClient = makeContentProviderClient(contentResolver, uri);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new ParcelFileDescriptor.AutoCloseInputStream(contentProviderClientMakeContentProviderClient.openFile(uri, "r")));
                if (contentProviderClientMakeContentProviderClient != null) {
                    contentProviderClientMakeContentProviderClient.release();
                }
                return bufferedInputStream;
            } catch (RemoteException e) {
                throw new TestStorageException("Unable to access content provider: " + uri, e);
            }
        } catch (Throwable th) {
            if (contentProviderClientMakeContentProviderClient != null) {
                contentProviderClientMakeContentProviderClient.release();
            }
            throw th;
        }
    }

    public static OutputStream getOutputStream(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        return getOutputStream(uri, contentResolver, false);
    }

    public static OutputStream getOutputStream(Uri uri, ContentResolver contentResolver, boolean append) throws FileNotFoundException {
        Checks.checkNotNull(uri);
        ContentProviderClient contentProviderClientMakeContentProviderClient = null;
        try {
            try {
                contentProviderClientMakeContentProviderClient = makeContentProviderClient(contentResolver, uri);
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(contentProviderClientMakeContentProviderClient.openFile(uri, append ? "wa" : "wt"));
                if (contentProviderClientMakeContentProviderClient != null) {
                    contentProviderClientMakeContentProviderClient.release();
                }
                return autoCloseOutputStream;
            } catch (RemoteException e) {
                throw new TestStorageException("Unable to access content provider: " + uri, e);
            }
        } catch (Throwable th) {
            if (contentProviderClientMakeContentProviderClient != null) {
                contentProviderClientMakeContentProviderClient.release();
            }
            throw th;
        }
    }

    private static ContentProviderClient makeContentProviderClient(ContentResolver resolver, Uri uri) {
        Checks.checkNotNull(resolver);
        ContentProviderClient contentProviderClientAcquireContentProviderClient = resolver.acquireContentProviderClient(uri);
        if (contentProviderClientAcquireContentProviderClient != null) {
            return contentProviderClientAcquireContentProviderClient;
        }
        throw new TestStorageException(String.format("No content provider registered for: %s. Are all test services apks installed?", uri));
    }

    private TestStorageUtil() {
    }
}
