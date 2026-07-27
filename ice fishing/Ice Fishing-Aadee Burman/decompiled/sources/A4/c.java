package A4;

import I7.l;
import android.content.ContentValues;

/* loaded from: classes2.dex */
public interface c {
    void delete(String str, String str2, String[] strArr);

    void insert(String str, String str2, ContentValues contentValues);

    void insertOrThrow(String str, String str2, ContentValues contentValues);

    void query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, l lVar);

    int update(String str, ContentValues contentValues, String str2, String[] strArr);
}
