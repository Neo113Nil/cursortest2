package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import defpackage.b64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC0774um;
import io.appmetrica.analytics.impl.AbstractC0787v6;
import io.appmetrica.analytics.impl.C0410i4;
import io.appmetrica.analytics.impl.C0438j4;
import io.appmetrica.analytics.impl.C0816w6;
import io.appmetrica.analytics.impl.C0850xb;
import io.appmetrica.analytics.impl.Sh;
import io.appmetrica.analytics.impl.Th;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes9.dex */
public class PreloadInfoContentProvider extends ContentProvider {
    private boolean a = false;
    private final UriMatcher b = new UriMatcher(-1);

    private void a(C0816w6 c0816w6, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object invoke = c0816w6.a.invoke(contentValues);
                if (invoke != null) {
                    c0816w6.c.b(applicationContext);
                    if (((Boolean) c0816w6.b.invoke(invoke)).booleanValue()) {
                        AbstractC0774um.a("Successfully saved " + c0816w6.d, new Object[0]);
                    } else {
                        AbstractC0774um.a("Did not save " + c0816w6.d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Unexpected error occurred\n" + StringUtils.throwableToString(th), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        AbstractC0774um.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.a = true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.a) {
                    return null;
                }
                if (contentValues != null) {
                    int match = this.b.match(uri);
                    if (match == 1) {
                        a(new C0816w6(new Sh(), new Th(), C0850xb.d, "preload info"), contentValues);
                    } else if (match != 2) {
                        AbstractC0774um.a("Bad content provider uri.", new Object[0]);
                    } else {
                        a(new C0816w6(new C0410i4(), new C0438j4(), C0850xb.d, ClidProvider.CLID_TABLE_NAME), contentValues);
                    }
                }
                CountDownLatch countDownLatch = AbstractC0787v6.a;
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
        String j = b64.j(applicationContext != null ? applicationContext.getPackageName() : "", ".appmetrica.preloadinfo.retail");
        this.b.addURI(j, "preloadinfo", 1);
        this.b.addURI(j, ClidProvider.CLID_TABLE_NAME, 2);
        AbstractC0787v6.a = new CountDownLatch(1);
        AbstractC0787v6.b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC0774um.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC0774um.a("Updating is not supported", new Object[0]);
        return -1;
    }
}
