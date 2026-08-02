package androidx.room.util;

import androidx.room.util.TableInfo;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.viewpager.widget.ViewPager;
import coil3.size.SizeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import okhttp3.Cache;

/* loaded from: classes3.dex */
public abstract class SchemaInfoUtilKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBitcoinReward.deepLinkSpecs;
    }

    public static final List readForeignKeyFieldMappings(SQLiteStatement sQLiteStatement) {
        int columnIndexOf = SizeKt.columnIndexOf(sQLiteStatement, "id");
        int columnIndexOf2 = SizeKt.columnIndexOf(sQLiteStatement, "seq");
        int columnIndexOf3 = SizeKt.columnIndexOf(sQLiteStatement, "from");
        int columnIndexOf4 = SizeKt.columnIndexOf(sQLiteStatement, "to");
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        while (sQLiteStatement.step()) {
            createListBuilder.add(new ForeignKeyWithSequence(sQLiteStatement.getText(columnIndexOf3), (int) sQLiteStatement.getLong(columnIndexOf), (int) sQLiteStatement.getLong(columnIndexOf2), sQLiteStatement.getText(columnIndexOf4)));
        }
        return CollectionsKt.sorted(CollectionsKt__CollectionsJVMKt.build(createListBuilder));
    }

    public static final TableInfo.Index readIndex(SQLiteConnection sQLiteConnection, String str, boolean z) {
        SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndexOf = SizeKt.columnIndexOf(prepare, "seqno");
            int columnIndexOf2 = SizeKt.columnIndexOf(prepare, "cid");
            int columnIndexOf3 = SizeKt.columnIndexOf(prepare, "name");
            int columnIndexOf4 = SizeKt.columnIndexOf(prepare, "desc");
            if (columnIndexOf != -1 && columnIndexOf2 != -1 && columnIndexOf3 != -1 && columnIndexOf4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (prepare.step()) {
                    if (((int) prepare.getLong(columnIndexOf2)) >= 0) {
                        int i = (int) prepare.getLong(columnIndexOf);
                        String text = prepare.getText(columnIndexOf3);
                        String str2 = prepare.getLong(columnIndexOf4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), text);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List sortedWith = CollectionsKt.sortedWith(linkedHashMap.entrySet(), new ViewPager.AnonymousClass1(10));
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
                Iterator it = sortedWith.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List list = CollectionsKt.toList(arrayList);
                List sortedWith2 = CollectionsKt.sortedWith(linkedHashMap2.entrySet(), new ViewPager.AnonymousClass1(11));
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith2, 10));
                Iterator it2 = sortedWith2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                TableInfo.Index index = new TableInfo.Index(str, list, CollectionsKt.toList(arrayList2), z);
                Cache.Companion.closeFinally(prepare, null);
                return index;
            }
            Cache.Companion.closeFinally(prepare, null);
            return null;
        } finally {
        }
    }
}
