package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.internal.AttributionIdentifiers;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class AFb1mSDK extends AFc1dSDK<String> {
    public AFb1mSDK(Context context, Executor executor) {
        super(context, executor, AttributionIdentifiers.ATTRIBUTION_ID_CONTENT_PROVIDER, "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1dSDK
    /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
    public String getMonetizationNetwork() {
        Cursor cursor;
        Throwable th;
        try {
            cursor = this.getRevenue.getContentResolver().query(Uri.parse(new StringBuilder("content://").append(this.AFAdRevenueData).toString()), new String[]{"aid"}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("aid"));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
        }
    }

    public final String getMediationNetwork() {
        this.getCurrencyIso4217Code.execute(this.getMediationNetwork);
        return (String) super.AFAdRevenueData();
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final /* synthetic */ String AFAdRevenueData() {
        this.getCurrencyIso4217Code.execute(this.getMediationNetwork);
        return (String) super.AFAdRevenueData();
    }
}
