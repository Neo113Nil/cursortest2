package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class EntityDeletionOrUpdateAdapter extends SharedSQLiteStatement {
    public abstract void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj);

    public final int handle(Object obj) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, obj);
            return acquire.executeUpdateDelete();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<Object> iterable) {
        iterable.getClass();
        SupportSQLiteStatement acquire = acquire();
        try {
            Iterator<Object> it = iterable.iterator();
            int i = 0;
            while (it.hasNext()) {
                bind(acquire, it.next());
                i += acquire.executeUpdateDelete();
            }
            return i;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Object[] objArr) {
        objArr.getClass();
        SupportSQLiteStatement acquire = acquire();
        try {
            int i = 0;
            for (Object obj : objArr) {
                bind(acquire, obj);
                i += acquire.executeUpdateDelete();
            }
            return i;
        } finally {
            release(acquire);
        }
    }
}
