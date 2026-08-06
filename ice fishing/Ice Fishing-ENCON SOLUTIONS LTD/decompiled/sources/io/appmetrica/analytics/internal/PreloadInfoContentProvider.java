package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.A5;
import io.appmetrica.analytics.impl.AbstractC0412fj;
import io.appmetrica.analytics.impl.B5;
import io.appmetrica.analytics.impl.C0377ea;
import io.appmetrica.analytics.impl.C0434gf;
import io.appmetrica.analytics.impl.C0460hf;
import io.appmetrica.analytics.impl.C0655p3;
import io.appmetrica.analytics.impl.C0681q3;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7290a = false;

    /* renamed from: b, reason: collision with root package name */
    private final UriMatcher f7291b = new UriMatcher(-1);

    private void a(B5 b5, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object invoke = b5.f4188a.invoke(contentValues);
                if (invoke != null) {
                    b5.f4190c.b(applicationContext);
                    if (((Boolean) b5.f4189b.invoke(invoke)).booleanValue()) {
                        AbstractC0412fj.a("Successfully saved " + b5.f4191d, new Object[0]);
                    } else {
                        AbstractC0412fj.a("Did not save " + b5.f4191d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Unexpected error occurred\n" + StringUtils.throwableToString(th), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        AbstractC0412fj.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f7290a = true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f7290a) {
                    return null;
                }
                if (contentValues != null) {
                    int match = this.f7291b.match(uri);
                    if (match == 1) {
                        a(new B5(new C0434gf(), new C0460hf(), C0377ea.f5924d, "preload info"), contentValues);
                    } else if (match != 2) {
                        AbstractC0412fj.a("Bad content provider uri.", new Object[0]);
                    } else {
                        a(new B5(new C0655p3(), new C0681q3(), C0377ea.f5924d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = A5.f4123a;
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
        String str = (applicationContext != null ? applicationContext.getPackageName() : "") + ".appmetrica.preloadinfo.retail";
        this.f7291b.addURI(str, "preloadinfo", 1);
        this.f7291b.addURI(str, "clids", 2);
        A5.f4123a = new CountDownLatch(1);
        A5.f4124b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC0412fj.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC0412fj.a("Updating is not supported", new Object[0]);
        return -1;
    }
}
