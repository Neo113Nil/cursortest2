package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import defpackage.ouj;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC0210dm;
import io.appmetrica.analytics.impl.AbstractC0626s6;
import io.appmetrica.analytics.impl.C0220e4;
import io.appmetrica.analytics.impl.C0249f4;
import io.appmetrica.analytics.impl.C0487nb;
import io.appmetrica.analytics.impl.C0655t6;
import io.appmetrica.analytics.impl.Ch;
import io.appmetrica.analytics.impl.Dh;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes5.dex */
public class PreloadInfoContentProvider extends ContentProvider {
    private boolean a = false;
    private final UriMatcher b = new UriMatcher(-1);

    private void a(C0655t6 c0655t6, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object invoke = c0655t6.a.invoke(contentValues);
                if (invoke != null) {
                    c0655t6.c.b(applicationContext);
                    if (((Boolean) c0655t6.b.invoke(invoke)).booleanValue()) {
                        AbstractC0210dm.a("Successfully saved " + c0655t6.d, new Object[0]);
                    } else {
                        AbstractC0210dm.a("Did not save " + c0655t6.d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Unexpected error occurred\n" + StringUtils.throwableToString(th), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        AbstractC0210dm.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.a = true;
    }

    @Override // android.content.ContentProvider
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.a) {
                    return null;
                }
                if (contentValues != null) {
                    int match = this.b.match(uri);
                    if (match == 1) {
                        a(new C0655t6(new Ch(), new Dh(), C0487nb.d, "preload info"), contentValues);
                    } else if (match != 2) {
                        AbstractC0210dm.a("Bad content provider uri.", new Object[0]);
                    } else {
                        a(new C0655t6(new C0220e4(), new C0249f4(), C0487nb.d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = AbstractC0626s6.a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String n = ouj.n(applicationContext != null ? applicationContext.getPackageName() : "", ".appmetrica.preloadinfo.retail");
        this.b.addURI(n, "preloadinfo", 1);
        this.b.addURI(n, "clids", 2);
        AbstractC0626s6.a = new CountDownLatch(1);
        AbstractC0626s6.b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC0210dm.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC0210dm.a("Updating is not supported", new Object[0]);
        return -1;
    }
}
