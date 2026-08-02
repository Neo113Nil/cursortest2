package androidx.compose.ui.graphics;

import defpackage.a7t;
import defpackage.apd;
import defpackage.dup;
import defpackage.vnj;
import defpackage.yci;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class a {
    public static final yci a(yci yciVar, Function1 function1) {
        return yciVar.f(new BlockGraphicsLayerElement(function1));
    }

    public static yci b(yci yciVar, float f, float f2, float f3, float f4, float f5, dup dupVar, boolean z, int i) {
        float f6 = (i & 1) != 0 ? 1.0f : f;
        float f7 = (i & 2) != 0 ? 1.0f : f2;
        float f8 = (i & 4) != 0 ? 1.0f : f3;
        float f9 = (i & 32) != 0 ? 0.0f : f4;
        float f10 = (i & 256) != 0 ? 0.0f : f5;
        long j = a7t.b;
        dup dupVar2 = (i & 2048) != 0 ? vnj.i : dupVar;
        boolean z2 = (i & 4096) != 0 ? false : z;
        long j2 = apd.a;
        return yciVar.f(new GraphicsLayerElement(f6, f7, f8, f9, f10, j, dupVar2, z2, j2, j2, (i & SQLiteDatabase.OPEN_FULLMUTEX) == 0 ? 1 : 0));
    }
}
