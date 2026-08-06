package io.appmetrica.analytics.screenshot.impl;

import a.AbstractC0083a;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class Z extends ContentObserver {

    /* renamed from: d, reason: collision with root package name */
    public static final String f7624d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f7625a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1046a f7626b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0945k f7627c;

    public Z(ClientContext clientContext, C0952s c0952s) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.f7625a = clientContext;
        this.f7626b = c0952s;
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z2, Uri uri) {
        C0945k c0945k;
        super.onChange(z2, uri);
        if (!z1.o.R(String.valueOf(uri), f7624d, false) || (c0945k = this.f7627c) == null) {
            return;
        }
        try {
            List elements = c0945k.f7655b;
            kotlin.jvm.internal.i.e(elements, "elements");
            int i2 = 1;
            Object[] copyOf = Arrays.copyOf(new String[]{"date_added"}, elements.size() + 1);
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                copyOf[i2] = it.next();
                i2++;
            }
            kotlin.jvm.internal.i.b(copyOf);
            String[] strArr = (String[]) copyOf;
            Cursor query = this.f7625a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c0945k.f7656c)}, "date_added DESC");
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        for (String str : strArr) {
                        }
                        Iterator it2 = c0945k.f7655b.iterator();
                        while (it2.hasNext()) {
                            if (z1.g.T(query.getString(query.getColumnIndexOrThrow((String) it2.next())).toLowerCase(Locale.ROOT), "screenshot")) {
                                this.f7626b.invoke();
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC0083a.e(query, th);
                        throw th2;
                    }
                }
            }
            AbstractC0083a.e(query, null);
        } catch (Exception unused) {
        }
    }
}
