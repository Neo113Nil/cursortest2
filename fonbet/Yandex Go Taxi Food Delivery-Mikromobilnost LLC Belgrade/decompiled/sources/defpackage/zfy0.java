package defpackage;

import android.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzfy0;", "Lyfy0;", "Landroid/database/sqlite/SQLiteDatabase;", "writableDatabase", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "Lxfy0;", "usage", "Lzy11;", "a", "(Lxfy0;)V", "b", "()V", "", "cardId", "c", "(Ljava/lang/String;)V", "Landroid/database/sqlite/SQLiteDatabase;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class zfy0 implements yfy0 {

    /* renamed from: a, reason: from kotlin metadata */
    private final SQLiteDatabase writableDatabase;

    public zfy0(SQLiteDatabase sQLiteDatabase) {
        this.writableDatabase = sQLiteDatabase;
        sQLiteDatabase.isReadOnly();
    }

    @Override // defpackage.yfy0
    public final void a(xfy0 usage) {
        this.writableDatabase.execSQL(agy0.INSERT_TEMPLATE_USAGE_QUERY_TEMPLATE, new String[]{usage.getCardId(), usage.getTemplateId()});
    }

    @Override // defpackage.yfy0
    public final void b() {
        this.writableDatabase.execSQL(agy0.DELETE_ALL_TEMPLATE_USAGES_QUERY);
    }

    @Override // defpackage.yfy0
    public final void c(String cardId) {
        this.writableDatabase.execSQL(agy0.DELETE_TEMPLATE_USAGE_BY_CARD_ID_QUERY_TEMPLATE, new String[]{cardId});
    }
}
