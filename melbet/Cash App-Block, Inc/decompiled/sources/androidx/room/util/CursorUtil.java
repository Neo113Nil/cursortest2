package androidx.room.util;

import android.database.Cursor;
import android.util.Log;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes3.dex */
public abstract class CursorUtil {
    public static final int getColumnIndexOrThrow(Cursor cursor, String str) {
        String str2;
        cursor.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            str2 = ArraysKt___ArraysKt.joinToString$default(columnNames, null, null, null, null, 63);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "unknown";
        }
        a$$ExternalSyntheticBUOutline0.m$3(CameraSelector$$ExternalSyntheticOutline0.m("column '", str, "' does not exist. Available columns: ", str2));
        return 0;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewBitcoinInvoice.deepLinkSpecs;
    }
}
