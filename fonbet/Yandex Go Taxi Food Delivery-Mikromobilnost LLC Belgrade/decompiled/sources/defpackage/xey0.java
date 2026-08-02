package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\n \b*\u0004\u0018\u00010\u000b0\u000b*\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!¨\u0006\""}, d2 = {"Lxey0;", "Lwey0;", "Landroid/database/sqlite/SQLiteDatabase;", "writableDatabase", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "Landroid/database/Cursor;", "", "kotlin.jvm.PlatformType", "h", "(Landroid/database/Cursor;)Ljava/lang/String;", "", "g", "(Landroid/database/Cursor;)[B", "", "Ltey0;", CoreConstants.PushMessage.SERVICE_TYPE, "(Landroid/database/Cursor;)Ljava/util/List;", "d", "()Ljava/util/List;", "cardId", "a", "(Ljava/lang/String;)Ljava/util/List;", "templateIds", "f", "(Ljava/util/List;)Ljava/util/List;", "template", "Lzy11;", "c", "(Ltey0;)V", "e", "()V", "b", "Landroid/database/sqlite/SQLiteDatabase;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class xey0 implements wey0 {

    /* renamed from: a, reason: from kotlin metadata */
    private final SQLiteDatabase writableDatabase;

    public xey0(SQLiteDatabase sQLiteDatabase) {
        this.writableDatabase = sQLiteDatabase;
        sQLiteDatabase.isReadOnly();
    }

    private final byte[] g(Cursor cursor) {
        return cursor.getBlob(cursor.getColumnIndexOrThrow("template_data"));
    }

    private final String h(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("template_id"));
    }

    private final List<tey0> i(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(new tey0(cursor.getString(cursor.getColumnIndexOrThrow("template_id")), cursor.getBlob(cursor.getColumnIndexOrThrow("template_data"))));
        }
        return arrayList;
    }

    @Override // defpackage.wey0
    public final List<tey0> a(String cardId) {
        Cursor rawQuery = this.writableDatabase.rawQuery(pfy0.GET_TEMPLATES_BY_CARD_ID_QUERY_TEMPLATE, new String[]{cardId});
        List<tey0> i = i(rawQuery);
        rawQuery.close();
        return i;
    }

    @Override // defpackage.wey0
    public final void b() {
        this.writableDatabase.execSQL(pfy0.DELETE_UNUSED_TEMPLATES_QUERY_TEMPLATE);
    }

    @Override // defpackage.wey0
    public final void c(tey0 template) {
        this.writableDatabase.execSQL(pfy0.INSERT_TEMPLATE_QUERY_TEMPLATE, new Serializable[]{template.getId(), template.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_DATA java.lang.String()});
    }

    @Override // defpackage.wey0
    public final List<tey0> d() {
        Cursor rawQuery = this.writableDatabase.rawQuery(pfy0.GET_ALL_TEMPLATES_QUERY, new String[0]);
        List<tey0> i = i(rawQuery);
        rawQuery.close();
        return i;
    }

    @Override // defpackage.wey0
    public final void e() {
        this.writableDatabase.execSQL("DELETE FROM templates");
    }

    @Override // defpackage.wey0
    public final List<tey0> f(List<String> templateIds) {
        StringBuilder sb = new StringBuilder(pfy0.GET_TEMPLATES_BY_IDS_QUERY_TEMPLATE_WITHOUT_PLACEHOLDER);
        fpf.a(sb, templateIds.size());
        Cursor rawQuery = this.writableDatabase.rawQuery(sb.toString(), (String[]) templateIds.toArray(new String[0]));
        List<tey0> i = i(rawQuery);
        rawQuery.close();
        return i;
    }
}
