package io.appmetrica.analytics.screenshot.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.ooc;
import defpackage.sls;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class G extends ContentObserver {
    public static final String d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
    public final ClientContext a;
    public final sls b;
    public volatile C1105j c;

    public G(ClientContext clientContext, C1111p c1111p) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.a = clientContext;
        this.b = c1111p;
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        C1105j c1105j;
        super.onChange(z, uri);
        if (!cvu0.x(String.valueOf(uri), d, false) || (c1105j = this.c) == null) {
            return;
        }
        try {
            List list = c1105j.b;
            int i = 1;
            Object[] copyOf = Arrays.copyOf(new String[]{"date_added"}, list.size() + 1);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                copyOf[i] = it.next();
                i++;
            }
            String[] strArr = (String[]) copyOf;
            Cursor query = this.a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c1105j.c)}, "date_added DESC");
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        for (String str : strArr) {
                        }
                        Iterator it2 = c1105j.b.iterator();
                        while (it2.hasNext()) {
                            if (evu0.y(query.getString(query.getColumnIndexOrThrow((String) it2.next())).toLowerCase(Locale.ROOT), "screenshot", false)) {
                                this.b.invoke();
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ooc.g(query, th);
                        throw th2;
                    }
                }
            }
            ooc.g(query, null);
        } catch (Exception unused) {
        }
    }
}
