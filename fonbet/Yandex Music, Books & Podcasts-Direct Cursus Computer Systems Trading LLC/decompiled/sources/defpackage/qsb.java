package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.media3.exoplayer.mediacodec.RecoverType;

/* loaded from: classes6.dex */
public final class qsb {
    public final Context a;
    public Boolean b;
    public ngl c;
    public Boolean d;
    public Boolean e;
    public Integer f;
    public String g;
    public String h;
    public Boolean i;
    public Boolean j;
    public Boolean k;
    public Boolean l;
    public Boolean m;
    public Boolean n;
    public nlr o;
    public hr4 p;
    public tq4 q;
    public Boolean r;

    public qsb(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rsb a() {
        Object t7oVar;
        Throwable a;
        RecoverType recoverType;
        RecoverType recoverType2;
        ngl nglVar;
        String str;
        h9w h9wVar = new h9w();
        h9wVar.c = false;
        h9wVar.d = false;
        h9wVar.a = 0;
        h9wVar.b = 0;
        Boolean bool = this.n;
        if (bool != null) {
            h9wVar.c = bool.booleanValue();
        }
        Boolean bool2 = this.j;
        if (bool2 != null) {
            h9wVar.d = bool2.booleanValue();
        }
        Boolean bool3 = this.k;
        if (bool3 != null) {
            if (bool3.booleanValue()) {
                h9wVar.a = 1;
            } else {
                h9wVar.a = 2;
            }
        }
        String str2 = this.g;
        try {
            r7o r7oVar = z7o.b;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (str2 != null) {
            t7oVar = RecoverType.valueOf(str2);
            if (t7oVar == null) {
            }
            a = z7o.a(t7oVar);
            if (a != null) {
                Log.e("ExoRenderersFactory", "unknown recover type specified", a);
            }
            recoverType = RecoverType.DEFAULT;
            if (t7oVar instanceof t7o) {
                t7oVar = recoverType;
            }
            recoverType2 = (RecoverType) t7oVar;
            if (recoverType2 == recoverType) {
                h9wVar.b = 1;
            } else {
                h9wVar.b = 2;
            }
            Boolean bool4 = this.b;
            boolean booleanValue = bool4 == null ? bool4.booleanValue() : false;
            nglVar = this.c;
            if (nglVar == null) {
                nglVar = new ksa();
            }
            Boolean bool5 = this.d;
            boolean booleanValue2 = bool5 == null ? bool5.booleanValue() : false;
            Boolean bool6 = this.e;
            boolean booleanValue3 = bool6 == null ? bool6.booleanValue() : false;
            Integer num = this.f;
            int intValue = num == null ? num.intValue() : 0;
            nlr nlrVar = this.o;
            str = this.h;
            if (str == null) {
                str = "";
            }
            Boolean bool7 = this.i;
            boolean booleanValue4 = bool7 == null ? bool7.booleanValue() : false;
            Boolean bool8 = this.j;
            boolean booleanValue5 = bool8 == null ? bool8.booleanValue() : false;
            Boolean bool9 = this.k;
            boolean booleanValue6 = bool9 == null ? bool9.booleanValue() : false;
            hr4 hr4Var = this.p;
            tq4 tq4Var = this.q;
            boolean z = booleanValue;
            Boolean bool10 = this.l;
            boolean booleanValue7 = bool10 == null ? bool10.booleanValue() : true;
            Boolean bool11 = this.m;
            boolean booleanValue8 = bool11 == null ? bool11.booleanValue() : false;
            boolean booleanValue9 = bool == null ? bool.booleanValue() : false;
            Boolean bool12 = this.r;
            return new rsb(this.a, z, nglVar, booleanValue2, booleanValue3, intValue, recoverType2, nlrVar, str, booleanValue4, booleanValue5, booleanValue6, hr4Var, tq4Var, booleanValue7, booleanValue8, booleanValue9, null, h9wVar, bool12 == null ? bool12.booleanValue() : false);
        }
        t7oVar = RecoverType.DEFAULT;
        a = z7o.a(t7oVar);
        if (a != null) {
        }
        recoverType = RecoverType.DEFAULT;
        if (t7oVar instanceof t7o) {
        }
        recoverType2 = (RecoverType) t7oVar;
        if (recoverType2 == recoverType) {
        }
        Boolean bool42 = this.b;
        if (bool42 == null) {
        }
        nglVar = this.c;
        if (nglVar == null) {
        }
        Boolean bool52 = this.d;
        if (bool52 == null) {
        }
        Boolean bool62 = this.e;
        if (bool62 == null) {
        }
        Integer num2 = this.f;
        if (num2 == null) {
        }
        nlr nlrVar2 = this.o;
        str = this.h;
        if (str == null) {
        }
        Boolean bool72 = this.i;
        if (bool72 == null) {
        }
        Boolean bool82 = this.j;
        if (bool82 == null) {
        }
        Boolean bool92 = this.k;
        if (bool92 == null) {
        }
        hr4 hr4Var2 = this.p;
        tq4 tq4Var2 = this.q;
        boolean z2 = booleanValue;
        Boolean bool102 = this.l;
        if (bool102 == null) {
        }
        Boolean bool112 = this.m;
        if (bool112 == null) {
        }
        if (bool == null) {
        }
        Boolean bool122 = this.r;
        return new rsb(this.a, z2, nglVar, booleanValue2, booleanValue3, intValue, recoverType2, nlrVar2, str, booleanValue4, booleanValue5, booleanValue6, hr4Var2, tq4Var2, booleanValue7, booleanValue8, booleanValue9, null, h9wVar, bool122 == null ? bool122.booleanValue() : false);
    }
}
