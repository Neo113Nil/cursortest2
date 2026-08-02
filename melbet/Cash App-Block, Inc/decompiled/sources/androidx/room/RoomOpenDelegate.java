package androidx.room;

import androidx.sqlite.SQLiteConnection;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes.dex */
public abstract class RoomOpenDelegate implements RoomOpenDelegateMarker {
    public final String identityHash;
    public final String legacyIdentityHash;
    public final int version;

    public RoomOpenDelegate(int i, String str, String str2) {
        this.version = i;
        this.identityHash = str;
        this.legacyIdentityHash = str2;
    }

    public abstract void createAllTables(SQLiteConnection sQLiteConnection);

    public abstract void dropAllTables(SQLiteConnection sQLiteConnection);

    public abstract void onCreate(SQLiteConnection sQLiteConnection);

    public abstract void onOpen(SQLiteConnection sQLiteConnection);

    public abstract void onPostMigrate(SQLiteConnection sQLiteConnection);

    public abstract void onPreMigrate(SQLiteConnection sQLiteConnection);

    public abstract MarkdownElementType onValidateSchema(SQLiteConnection sQLiteConnection);
}
