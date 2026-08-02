package com.yandex.music.core.ui.compose;

import defpackage.bcx;
import defpackage.ern;
import defpackage.jfp;
import defpackage.opi;
import defpackage.s9f;
import defpackage.tah;
import defpackage.xfp;
import defpackage.yci;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes3.dex */
public abstract class b {
    public static final /* synthetic */ s9f[] a;

    static {
        opi opiVar = new opi(b.class, "testStateTag", "getTestStateTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/Map;", 1);
        ern.a.getClass();
        a = new s9f[]{opiVar, new opi(b.class, "testIndexTag", "getTestIndexTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)};
    }

    public static final void a(jfp jfpVar, int i) {
        jfpVar.getClass();
        xfp xfpVar = bcx.g;
        s9f s9fVar = a[1];
        jfpVar.o(xfpVar, Integer.valueOf(i));
    }

    public static final yci b(yci yciVar, int i) {
        yciVar.getClass();
        return yciVar.f(new TestIndexTagElement(i));
    }

    public static final yci c(yci yciVar, String str, Object obj) {
        yciVar.getClass();
        obj.getClass();
        return yciVar.f(new TestStateTagElement(tah.b(new Pair(str, obj))));
    }

    public static final yci d(yci yciVar, Map map) {
        yciVar.getClass();
        map.getClass();
        return yciVar.f(new TestStateTagElement(map));
    }
}
