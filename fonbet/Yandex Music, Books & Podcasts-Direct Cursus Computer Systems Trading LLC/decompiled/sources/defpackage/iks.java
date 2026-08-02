package defpackage;

import com.yandex.music.shared.offline.recommender.proto.a;
import j$.util.DesugarTimeZone;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public abstract class iks {
    public static final /* synthetic */ s9f[] a;
    public static final gc7 b;

    static {
        yxm yxmVar = new yxm(iks.class, "tinyMlStateStore", "getTinyMlStateStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        ern.a.getClass();
        a = new s9f[]{yxmVar};
        b = AbstractC1321yb7.a("tinyml_state.pb", eks.a);
    }

    public static final String a(a aVar) {
        if (aVar == null) {
            return "N/A";
        }
        long j = aVar.d;
        Long valueOf = Long.valueOf(j);
        if (j <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return "N/A";
        }
        Date date = new Date(valueOf.longValue());
        mo moVar = hkg.a;
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        timeZone.getClass();
        return hkg.a(date, timeZone);
    }

    public static final String b(a aVar) {
        aVar.getClass();
        mse mseVar = aVar.c;
        if (mseVar.size() <= 4) {
            mseVar = null;
        }
        if (mseVar == null) {
            return "";
        }
        return mseVar.get(3) + "." + mseVar.get(4);
    }
}
