package com.google.android.gms.internal.mlkit_vision_barcode;

import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.room.Room;
import app.cash.paraphrase.FormattedResource;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class zzux {
    public static final String formattedResource(FormattedResource formattedResource, Composer composer) {
        String format2 = new MessageFormat(Room.stringResource(composer, formattedResource.id)).format(formattedResource.arguments);
        format2.getClass();
        return format2;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDocumentStockMonthlyStatement.deepLinkSpecs;
    }
}
