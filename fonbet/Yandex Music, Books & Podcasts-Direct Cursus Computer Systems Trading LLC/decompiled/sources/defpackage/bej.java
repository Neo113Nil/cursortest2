package defpackage;

import android.database.DatabaseUtils;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class bej extends ezc implements Function1 {
    public static final bej a = new bej(1, DatabaseUtils.class, "sqlEscapeString", "sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return DatabaseUtils.sqlEscapeString((String) obj);
    }
}
