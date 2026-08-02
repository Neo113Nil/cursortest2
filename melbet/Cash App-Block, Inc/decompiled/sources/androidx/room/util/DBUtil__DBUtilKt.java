package androidx.room.util;

import androidx.room.Room;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.ui.widget.amount.Digit;
import com.squareup.kotterknife.Lazy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Cache;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class DBUtil__DBUtilKt {
    public static final void dropFtsSyncTriggers(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (prepare.step()) {
            try {
                createListBuilder.add(prepare.getText(0));
            } finally {
            }
        }
        Cache.Companion.closeFinally(prepare, null);
        ListIterator listIterator = CollectionsKt__CollectionsJVMKt.build(createListBuilder).listIterator(0);
        while (true) {
            ListBuilder.Itr itr = (ListBuilder.Itr) listIterator;
            if (!itr.hasNext()) {
                return;
            }
            String str = (String) itr.next();
            if (StringsKt__StringsJVMKt.startsWith(str, "room_fts_content_sync_", false)) {
                Room.execSQL(sQLiteConnection, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBitcoinLightningDeposit.deepLinkSpecs;
    }

    public static final String toDisplayString(List list, Lazy lazy) {
        list.getClass();
        lazy.getClass();
        StringBuilder sb = new StringBuilder();
        Function1 function1 = (Function1) lazy.initializer;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(((Digit) it.next()).toString());
        }
        String str = (String) lazy.value;
        if (str != null) {
            sb.append(" " + str);
        }
        return sb.toString();
    }
}
