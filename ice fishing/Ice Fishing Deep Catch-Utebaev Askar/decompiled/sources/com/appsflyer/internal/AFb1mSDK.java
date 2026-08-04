package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1mSDK extends AFc1dSDK<String> {
    public AFb1mSDK(Context context, Executor executor) {
        super(context, executor, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1dSDK
    /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
    public String getMonetizationNetwork() throws Throwable {
        Cursor cursorQuery;
        Throwable th;
        try {
            ContentResolver contentResolver = this.getRevenue.getContentResolver();
            StringBuilder sb = new StringBuilder("content://");
            sb.append(this.AFAdRevenueData);
            cursorQuery = contentResolver.query(Uri.parse(sb.toString()), new String[]{"aid"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("aid"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            cursorQuery = null;
            th = th3;
        }
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final /* synthetic */ String AFAdRevenueData() {
        this.getCurrencyIso4217Code.execute(this.getMediationNetwork);
        return (String) super.AFAdRevenueData();
    }

    public final String getMediationNetwork() {
        this.getCurrencyIso4217Code.execute(this.getMediationNetwork);
        return (String) super.AFAdRevenueData();
    }
}
