package defpackage;

import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class bir implements yhr {
    public final Object a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;

    public bir(List list, Function1 function1) {
        this.b = list;
        this.c = function1;
        this.a = btf.a(bwf.c, new ep7(list, 4));
    }

    @Override // defpackage.yhr
    public final void a(zp4 zp4Var) {
        ArrayList arrayList = new ArrayList();
        SQLiteStatement compileStatement = ((dg0) zp4Var.b).a.compileStatement("INSERT OR REPLACE INTO raw_json VALUES (?, ?)");
        ((ArrayList) zp4Var.c).add(compileStatement);
        for (pin pinVar : this.b) {
            compileStatement.bindString(1, pinVar.getId());
            byte[] bytes = pinVar.getData().toString().getBytes(Charsets.UTF_8);
            bytes.getClass();
            compileStatement.bindBlob(2, bytes);
            long executeInsert = compileStatement.executeInsert();
            Long valueOf = Long.valueOf(executeInsert);
            if (executeInsert >= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                arrayList.add(pinVar.getId());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.c.invoke(arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [arf, java.lang.Object] */
    public final String toString() {
        return dfi.i(new StringBuilder("Replace raw jsons ("), (String) this.a.getValue(), ')');
    }
}
