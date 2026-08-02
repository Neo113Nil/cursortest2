package defpackage;

import android.net.Uri;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class m42 {
    public final e12 a;
    public final md0 b;
    public final jyr c;
    public final jyr d;

    public m42(e12 e12Var, md0 md0Var) {
        this.a = e12Var;
        this.b = md0Var;
        final int i = 0;
        this.c = btf.b(new Function0(this) { // from class: k42
            public final /* synthetic */ m42 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.b.b.a();
                    default:
                        return (dc0) this.b.b.o.getValue();
                }
            }
        });
        final int i2 = 1;
        this.d = btf.b(new Function0(this) { // from class: k42
            public final /* synthetic */ m42 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.b.b.a();
                    default:
                        return (dc0) this.b.b.o.getValue();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        l42 l42Var;
        int i;
        String str2;
        String str3;
        e12 e12Var;
        if (cg6Var instanceof l42) {
            l42Var = (l42) cg6Var;
            int i2 = l42Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l42Var.o = i2 - Integer.MIN_VALUE;
                Object obj = l42Var.m;
                nm6 nm6Var = nm6.a;
                i = l42Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    String string = c().a.getString(R.string.android_auto_collection_downloaded);
                    string.getClass();
                    Uri a = dc0.a(b().a, R.drawable.ic_car_downloads_200);
                    l42Var.j = str;
                    e12 e12Var2 = this.a;
                    l42Var.k = e12Var2;
                    l42Var.l = string;
                    l42Var.o = 1;
                    a.getClass();
                    d62 d62Var = new d62(a);
                    if (d62Var == nm6Var) {
                        return nm6Var;
                    }
                    str2 = str;
                    str3 = string;
                    obj = d62Var;
                    e12Var = e12Var2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = l42Var.l;
                    e12 e12Var3 = l42Var.k;
                    String str5 = l42Var.j;
                    qgg.h0(obj);
                    str3 = str4;
                    str2 = str5;
                    e12Var = e12Var3;
                }
                y02 y02Var = y02.a;
                return e12.a(e12Var, str2, str3, y02Var, y02Var, (d62) obj, null, 352);
            }
        }
        l42Var = new l42(this, cg6Var);
        Object obj2 = l42Var.m;
        nm6 nm6Var2 = nm6.a;
        i = l42Var.o;
        if (i != 0) {
        }
        y02 y02Var2 = y02.a;
        return e12.a(e12Var, str2, str3, y02Var2, y02Var2, (d62) obj2, null, 352);
    }

    public final dc0 b() {
        return (dc0) this.d.getValue();
    }

    public final dd0 c() {
        return (dd0) this.c.getValue();
    }
}
