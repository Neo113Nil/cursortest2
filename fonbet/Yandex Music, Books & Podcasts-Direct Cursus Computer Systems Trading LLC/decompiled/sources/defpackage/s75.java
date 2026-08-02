package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public abstract class s75 {
    public final String a() {
        if (this instanceof q75) {
            zp2 zp2Var = (zp2) CollectionsKt.firstOrNull(((q75) this).a.n);
            if (zp2Var != null) {
                return zp2Var.b;
            }
            return null;
        }
        if (!(this instanceof r75)) {
            b6e.s();
            return null;
        }
        ljm ljmVar = (ljm) CollectionsKt.firstOrNull(((r75) this).a.a);
        if (ljmVar != null) {
            return ljmVar.b;
        }
        return null;
    }

    public final String b() {
        if (this instanceof q75) {
            return ((q75) this).a.b;
        }
        if (this instanceof r75) {
            String str = ((r75) this).a.f;
            return str == null ? "" : str;
        }
        b6e.s();
        return null;
    }

    public final Date c() {
        if (!(this instanceof q75)) {
            if (this instanceof r75) {
                return ((r75) this).a.c;
            }
            b6e.s();
            return null;
        }
        oq oqVar = ((q75) this).a;
        Date date = oqVar.p;
        if (date != null) {
            return date;
        }
        String str = oqVar.i;
        mo moVar = hkg.a;
        if (str != null) {
            try {
                Object obj = hkg.a.get();
                obj.getClass();
                return ((SimpleDateFormat) obj).parse(str.concat("-01-01"));
            } catch (ParseException unused) {
            }
        }
        return null;
    }
}
