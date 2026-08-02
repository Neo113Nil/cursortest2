package io.appmetrica.analytics.screenshot.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import defpackage.yd5;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class Z extends ContentObserver {
    public static final String d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
    public final ClientContext a;
    public final Function0 b;
    public volatile C0943k c;

    public Z(ClientContext clientContext, C0950s c0950s) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.a = clientContext;
        this.b = c0950s;
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        C0943k c0943k;
        super.onChange(z, uri);
        if (!kotlin.text.c.v(String.valueOf(uri), d, false) || (c0943k = this.c) == null) {
            return;
        }
        try {
            List list = c0943k.b;
            list.getClass();
            int i = 1;
            Object[] copyOf = Arrays.copyOf(new String[]{"date_added"}, list.size() + 1);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                copyOf[i] = it.next();
                i++;
            }
            String[] strArr = (String[]) copyOf;
            Cursor query = this.a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c0943k.c)}, "date_added DESC");
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        for (String str : strArr) {
                        }
                        Iterator it2 = c0943k.b.iterator();
                        while (it2.hasNext()) {
                            if (StringsKt.M(query.getString(query.getColumnIndexOrThrow((String) it2.next())).toLowerCase(Locale.ROOT), "screenshot", false)) {
                                this.b.invoke();
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        yd5.q(query, th);
                        throw th2;
                    }
                }
            }
            yd5.q(query, null);
        } catch (Exception unused) {
        }
    }
}
