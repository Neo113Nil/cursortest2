package z0;

import I7.r;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import y0.InterfaceC5199d;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5213b extends kotlin.jvm.internal.i implements r {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5199d f42195n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5213b(InterfaceC5199d interfaceC5199d) {
        super(4);
        this.f42195n = interfaceC5199d;
    }

    @Override // I7.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        kotlin.jvm.internal.h.b(sQLiteQuery);
        this.f42195n.i(new C5219h(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
