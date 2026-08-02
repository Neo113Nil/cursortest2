package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class s2x0 {
    public static final r2x0 c = new r2x0(new ArrayList());
    public static final String d;
    public final cce a;
    public final ContentResolver b;

    static {
        StringBuilder sb = new StringBuilder();
        DatabaseUtils.appendEscapedSQLString(sb, cce.b[0]);
        d = sb.toString();
    }

    public s2x0(Context context, cce cceVar) {
        this.a = cceVar;
        this.b = context.getContentResolver();
    }

    public final r2x0 a() {
        boolean f = bi91.f(this.a.a);
        r2x0 r2x0Var = c;
        if (!f) {
            if (ydz.a.a()) {
                ydz.b("SystemContactsProvider", "Cannot read contacts, no permissions");
            }
            return r2x0Var;
        }
        String p = oyr.p("mimetype IN (", d, ")  AND display_name IS NOT NULL");
        Uri uri = ContactsContract.Data.CONTENT_URI;
        Cursor query = this.b.query(uri, new String[]{"display_name", "contact_last_updated_timestamp", "mimetype", "data1", "data2", "data3", "data4", "contact_id", "lookup"}, p, null, null);
        try {
            Cursor cursor = query;
            if (cursor == null) {
                if (ydz.a.a()) {
                    ydz.b("SystemContactsProvider", "Cannot read contacts, null result");
                }
                ooc.g(query, null);
                return r2x0Var;
            }
            if (cursor.getCount() == 0) {
                if (ydz.a.a()) {
                    ydz.b("SystemContactsProvider", "Cannot read contacts, empty result");
                }
                ooc.g(query, null);
                return r2x0Var;
            }
            cursor.moveToFirst();
            HashSet hashSet = new HashSet(cursor.getCount());
            do {
                q2x0 b = njb1.b(cursor);
                if (b != null) {
                    hashSet.add(b);
                }
            } while (cursor.moveToNext());
            r2x0 r2x0Var2 = new r2x0(new ArrayList(hashSet));
            ooc.g(query, null);
            return r2x0Var2;
        } finally {
        }
    }
}
