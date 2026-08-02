package androidx.room.util;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.viewpager.widget.ViewPager;
import coil3.size.SizeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Cache;

/* loaded from: classes3.dex */
public final class TableInfo {
    public final Map columns;
    public final Set foreignKeys;
    public final Set indices;
    public final String name;

    public final class Column {
        public final int affinity;
        public final int createdFrom;
        public final String defaultValue;
        public final String name;
        public final boolean notNull;
        public final int primaryKeyPosition;

        /* renamed from: type, reason: collision with root package name */
        public final String f906type;

        public Column(int i, int i2, String str, String str2, String str3, boolean z) {
            str.getClass();
            str2.getClass();
            this.name = str;
            this.f906type = str2;
            this.notNull = z;
            this.primaryKeyPosition = i;
            this.defaultValue = str3;
            this.createdFrom = i2;
            String upperCase = str2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            this.affinity = StringsKt.contains((CharSequence) upperCase, (CharSequence) "INT", false) ? 3 : (StringsKt.contains((CharSequence) upperCase, (CharSequence) "CHAR", false) || StringsKt.contains((CharSequence) upperCase, (CharSequence) "CLOB", false) || StringsKt.contains((CharSequence) upperCase, (CharSequence) "TEXT", false)) ? 2 : StringsKt.contains((CharSequence) upperCase, (CharSequence) "BLOB", false) ? 5 : (StringsKt.contains((CharSequence) upperCase, (CharSequence) "REAL", false) || StringsKt.contains((CharSequence) upperCase, (CharSequence) "FLOA", false) || StringsKt.contains((CharSequence) upperCase, (CharSequence) "DOUB", false)) ? 4 : 1;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Column) {
                    boolean z = this.primaryKeyPosition > 0;
                    Column column = (Column) obj;
                    int i = column.createdFrom;
                    if (z == (column.primaryKeyPosition > 0) && Intrinsics.areEqual(this.name, column.name) && this.notNull == column.notNull) {
                        String str = column.defaultValue;
                        int i2 = this.createdFrom;
                        String str2 = this.defaultValue;
                        if ((i2 != 1 || i != 2 || str2 == null || TableInfoKt.defaultValueEqualsCommon(str2, str)) && ((i2 != 2 || i != 1 || str == null || TableInfoKt.defaultValueEqualsCommon(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : TableInfoKt.defaultValueEqualsCommon(str2, str))) && this.affinity == column.affinity))) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((((this.name.hashCode() * 31) + this.affinity) * 31) + (this.notNull ? 1231 : 1237)) * 31) + this.primaryKeyPosition;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
            sb.append(this.name);
            sb.append("',\n            |   type = '");
            sb.append(this.f906type);
            sb.append("',\n            |   affinity = '");
            sb.append(this.affinity);
            sb.append("',\n            |   notNull = '");
            sb.append(this.notNull);
            sb.append("',\n            |   primaryKeyPosition = '");
            sb.append(this.primaryKeyPosition);
            sb.append("',\n            |   defaultValue = '");
            String str = this.defaultValue;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'\n            |}\n        ");
            return StringsKt__IndentKt.prependIndent(StringsKt__IndentKt.trimMargin$default(sb.toString()), "    ");
        }
    }

    public abstract class Companion {
        public static EmptyList getDeepLinkSpecs() {
            return ClientRoute.ViewBitcoinUri.deepLinkSpecs;
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x01ea, code lost:
        
            r0 = kotlin.collections.SetsKt__SetsJVMKt.build(r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x01ee, code lost:
        
            okhttp3.Cache.Companion.closeFinally(r2, null);
            r10 = r0;
         */
        /* JADX WARN: Finally extract failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static TableInfo read(SQLiteConnection sQLiteConnection, String str) {
            Map build;
            SetBuilder setBuilder;
            sQLiteConnection.getClass();
            SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA table_info(`" + str + "`)");
            try {
                long j = 0;
                if (prepare.step()) {
                    int columnIndexOf = SizeKt.columnIndexOf(prepare, "name");
                    int columnIndexOf2 = SizeKt.columnIndexOf(prepare, "type");
                    int columnIndexOf3 = SizeKt.columnIndexOf(prepare, "notnull");
                    int columnIndexOf4 = SizeKt.columnIndexOf(prepare, "pk");
                    int columnIndexOf5 = SizeKt.columnIndexOf(prepare, "dflt_value");
                    MapBuilder mapBuilder = new MapBuilder();
                    do {
                        String text = prepare.getText(columnIndexOf);
                        mapBuilder.put(text, new Column((int) prepare.getLong(columnIndexOf4), 2, text, prepare.getText(columnIndexOf2), prepare.isNull(columnIndexOf5) ? null : prepare.getText(columnIndexOf5), prepare.getLong(columnIndexOf3) != 0));
                    } while (prepare.step());
                    build = mapBuilder.build();
                    Cache.Companion.closeFinally(prepare, null);
                } else {
                    build = EmptyMap.INSTANCE;
                    build.getClass();
                    Cache.Companion.closeFinally(prepare, null);
                }
                prepare = sQLiteConnection.prepare("PRAGMA foreign_key_list(`" + str + "`)");
                try {
                    int columnIndexOf6 = SizeKt.columnIndexOf(prepare, "id");
                    int columnIndexOf7 = SizeKt.columnIndexOf(prepare, "seq");
                    int columnIndexOf8 = SizeKt.columnIndexOf(prepare, "table");
                    int columnIndexOf9 = SizeKt.columnIndexOf(prepare, "on_delete");
                    int columnIndexOf10 = SizeKt.columnIndexOf(prepare, "on_update");
                    List readForeignKeyFieldMappings = SchemaInfoUtilKt.readForeignKeyFieldMappings(prepare);
                    prepare.reset();
                    SetBuilder setBuilder2 = new SetBuilder();
                    while (prepare.step()) {
                        if (prepare.getLong(columnIndexOf7) == j) {
                            int i = (int) prepare.getLong(columnIndexOf6);
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            int i2 = columnIndexOf6;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : readForeignKeyFieldMappings) {
                                int i3 = columnIndexOf7;
                                List list = readForeignKeyFieldMappings;
                                if (((ForeignKeyWithSequence) obj).id == i) {
                                    arrayList3.add(obj);
                                }
                                columnIndexOf7 = i3;
                                readForeignKeyFieldMappings = list;
                            }
                            int i4 = columnIndexOf7;
                            List list2 = readForeignKeyFieldMappings;
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                ForeignKeyWithSequence foreignKeyWithSequence = (ForeignKeyWithSequence) it.next();
                                arrayList.add(foreignKeyWithSequence.from);
                                arrayList2.add(foreignKeyWithSequence.to);
                            }
                            setBuilder2.add(new ForeignKey(prepare.getText(columnIndexOf8), prepare.getText(columnIndexOf9), prepare.getText(columnIndexOf10), arrayList, arrayList2));
                            columnIndexOf6 = i2;
                            columnIndexOf7 = i4;
                            readForeignKeyFieldMappings = list2;
                            j = 0;
                        }
                    }
                    SetBuilder build2 = SetsKt__SetsJVMKt.build(setBuilder2);
                    Cache.Companion.closeFinally(prepare, null);
                    prepare = sQLiteConnection.prepare("PRAGMA index_list(`" + str + "`)");
                    try {
                        int columnIndexOf11 = SizeKt.columnIndexOf(prepare, "name");
                        int columnIndexOf12 = SizeKt.columnIndexOf(prepare, "origin");
                        int columnIndexOf13 = SizeKt.columnIndexOf(prepare, "unique");
                        if (columnIndexOf11 == -1 || columnIndexOf12 == -1 || columnIndexOf13 == -1) {
                            Cache.Companion.closeFinally(prepare, null);
                            setBuilder = null;
                        } else {
                            SetBuilder setBuilder3 = new SetBuilder();
                            while (true) {
                                if (!prepare.step()) {
                                    break;
                                }
                                if ("c".equals(prepare.getText(columnIndexOf12))) {
                                    Index readIndex = SchemaInfoUtilKt.readIndex(sQLiteConnection, prepare.getText(columnIndexOf11), prepare.getLong(columnIndexOf13) == 1);
                                    if (readIndex == null) {
                                        Cache.Companion.closeFinally(prepare, null);
                                        setBuilder = null;
                                        break;
                                    }
                                    setBuilder3.add(readIndex);
                                }
                            }
                        }
                        return new TableInfo(str, build, build2, setBuilder);
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    public final class ForeignKey {
        public final List columnNames;
        public final String onDelete;
        public final String onUpdate;
        public final List referenceColumnNames;
        public final String referenceTable;

        public ForeignKey(String str, String str2, String str3, List list, List list2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            list2.getClass();
            this.referenceTable = str;
            this.onDelete = str2;
            this.onUpdate = str3;
            this.columnNames = list;
            this.referenceColumnNames = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForeignKey)) {
                return false;
            }
            ForeignKey foreignKey = (ForeignKey) obj;
            if (Intrinsics.areEqual(this.referenceTable, foreignKey.referenceTable) && Intrinsics.areEqual(this.onDelete, foreignKey.onDelete) && Intrinsics.areEqual(this.onUpdate, foreignKey.onUpdate) && Intrinsics.areEqual(this.columnNames, foreignKey.columnNames)) {
                return Intrinsics.areEqual(this.referenceColumnNames, foreignKey.referenceColumnNames);
            }
            return false;
        }

        public final int hashCode() {
            return this.referenceColumnNames.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.referenceTable.hashCode() * 31, 31, this.onDelete), 31, this.onUpdate), 31, this.columnNames);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
            sb.append(this.referenceTable);
            sb.append("',\n            |   onDelete = '");
            sb.append(this.onDelete);
            sb.append("',\n            |   onUpdate = '");
            sb.append(this.onUpdate);
            sb.append("',\n            |   columnNames = {");
            StringsKt__IndentKt.prependIndent(CollectionsKt.joinToString$default(CollectionsKt.sorted(this.columnNames), ",", null, null, 0, null, null, 62), "    ");
            StringsKt__IndentKt.prependIndent("},", "    ");
            Unit unit = Unit.INSTANCE;
            sb.append(unit);
            sb.append("\n            |   referenceColumnNames = {");
            StringsKt__IndentKt.prependIndent(CollectionsKt.joinToString$default(CollectionsKt.sorted(this.referenceColumnNames), ",", null, null, 0, null, null, 62), "    ");
            StringsKt__IndentKt.prependIndent(" }", "    ");
            sb.append(unit);
            sb.append("\n            |}\n        ");
            return StringsKt__IndentKt.prependIndent(StringsKt__IndentKt.trimMargin$default(sb.toString()), "    ");
        }
    }

    public final class Index {
        public final List columns;
        public final String name;
        public final List orders;
        public final boolean unique;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
        public Index(String str, List list, List list2, boolean z) {
            str.getClass();
            list.getClass();
            list2.getClass();
            this.name = str;
            this.unique = z;
            this.columns = list;
            this.orders = list2;
            List list3 = list2;
            if (list3.isEmpty()) {
                int size = list.size();
                list3 = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    list3.add("ASC");
                }
            }
            this.orders = (List) list3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Index) {
                Index index = (Index) obj;
                String str = index.name;
                if (this.unique == index.unique && Intrinsics.areEqual(this.columns, index.columns) && Intrinsics.areEqual(this.orders, index.orders)) {
                    String str2 = this.name;
                    return StringsKt__StringsJVMKt.startsWith(str2, "index_", false) ? StringsKt__StringsJVMKt.startsWith(str, "index_", false) : str2.equals(str);
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.name;
            return this.orders.hashCode() + Recorder$$ExternalSyntheticOutline2.m((((StringsKt__StringsJVMKt.startsWith(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.unique ? 1 : 0)) * 31, 31, this.columns);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
            sb.append(this.name);
            sb.append("',\n            |   unique = '");
            sb.append(this.unique);
            sb.append("',\n            |   columns = {");
            StringsKt__IndentKt.prependIndent(CollectionsKt.joinToString$default(this.columns, ",", null, null, 0, null, null, 62), "    ");
            StringsKt__IndentKt.prependIndent("},", "    ");
            Unit unit = Unit.INSTANCE;
            sb.append(unit);
            sb.append("\n            |   orders = {");
            StringsKt__IndentKt.prependIndent(CollectionsKt.joinToString$default(this.orders, ",", null, null, 0, null, null, 62), "    ");
            StringsKt__IndentKt.prependIndent(" }", "    ");
            sb.append(unit);
            sb.append("\n            |}\n        ");
            return StringsKt__IndentKt.prependIndent(StringsKt__IndentKt.trimMargin$default(sb.toString()), "    ");
        }
    }

    public TableInfo(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.name = str;
        this.columns = map;
        this.foreignKeys = abstractSet;
        this.indices = abstractSet2;
    }

    public static final TableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        supportSQLiteDatabase.getClass();
        return Companion.read(new SupportSQLiteConnection(supportSQLiteDatabase), str);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) obj;
        if (!this.name.equals(tableInfo.name) || !this.columns.equals(tableInfo.columns) || !Intrinsics.areEqual(this.foreignKeys, tableInfo.foreignKeys)) {
            return false;
        }
        Set set2 = this.indices;
        if (set2 == null || (set = tableInfo.indices) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.foreignKeys.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.name.hashCode() * 31, this.columns, 31);
    }

    public final String toString() {
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.name);
        sb.append("',\n            |    columns = {");
        sb.append(TableInfoKt.formatString(CollectionsKt.sortedWith(this.columns.values(), new ViewPager.AnonymousClass1(12))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(TableInfoKt.formatString(this.foreignKeys));
        sb.append("\n            |    indices = {");
        Set set = this.indices;
        if (set == null || (collection = CollectionsKt.sortedWith(set, new ViewPager.AnonymousClass1(13))) == null) {
            collection = EmptyList.INSTANCE;
        }
        sb.append(TableInfoKt.formatString(collection));
        sb.append("\n            |}\n        ");
        return StringsKt__IndentKt.trimMargin$default(sb.toString());
    }
}
