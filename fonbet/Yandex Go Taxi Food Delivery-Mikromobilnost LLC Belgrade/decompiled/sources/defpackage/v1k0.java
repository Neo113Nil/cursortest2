package defpackage;

import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import com.yandex.fintechsdk.core.network.api.model.Header;
import java.util.Iterator;
import java.util.Set;
import kotlin.Result;
import kotlin.sequences.b;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes12.dex */
public final class v1k0 implements p8w {
    public final z22 a;
    public final Set b;

    public v1k0(z22 z22Var, Set set) {
        this.a = z22Var;
        this.b = set;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        Integer valueOf;
        Object obj;
        Set set;
        Object obj2;
        kvj0 kvj0Var;
        Object failure;
        String str;
        s5r s5rVar;
        String str2;
        String str3;
        String str4;
        String str5;
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        Set set2 = this.b;
        Iterator it = set2.iterator();
        if (it.hasNext()) {
            valueOf = Integer.valueOf(((zz50) it.next()).a());
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((zz50) it.next()).a());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        int i = 1;
        int intValue = valueOf != null ? valueOf.intValue() : 1;
        if (intValue < 1) {
            intValue = 1;
        }
        int i2 = 0;
        d5j0 d5j0Var2 = d5j0Var;
        while (i2 < intValue) {
            t4j0 b = d5j0Var2.b();
            b.g(d1k0.class, new d1k0(i2));
            kvj0 b2 = zci0Var.b(new d5j0(b));
            int i3 = i2 + 1;
            if (i3 < intValue) {
                String string = b2.d(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED).string();
                s5r s5rVar2 = new s5r(b.g(new h73(i, set2), new ii8(i2, 15)));
                while (true) {
                    boolean hasNext = s5rVar2.hasNext();
                    obj = p1k0.a;
                    if (!hasNext) {
                        set = set2;
                        obj2 = obj;
                        kvj0Var = null;
                        break;
                    }
                    zz50 zz50Var = (zz50) s5rVar2.next();
                    try {
                        failure = zz50Var.b(i2, string, d5j0Var2, b2);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Throwable a = Result.a(failure);
                    if (a != null) {
                        String str6 = string;
                        s5r s5rVar3 = s5rVar2;
                        String b3 = nka1.b(d5j0Var2);
                        String message = a.getMessage();
                        String d = qoi0.a(a.getClass()).d();
                        if (d == null) {
                            d = "";
                        }
                        String d2 = qoi0.a(zz50Var.getClass()).d();
                        if (d2 == null) {
                            d2 = "";
                        }
                        String b4 = d5j0Var2.a.b();
                        kvj0Var = null;
                        set = set2;
                        String a2 = b2.y.a(Header.RequestId.getKey());
                        if (a2 == null) {
                            a2 = null;
                        }
                        if (a2 == null) {
                            str2 = b4;
                            str = str6;
                            String str7 = d;
                            str3 = d2;
                            str4 = str7;
                            s5rVar = s5rVar3;
                            str5 = "";
                        } else {
                            str2 = b4;
                            str = str6;
                            String str8 = d;
                            str3 = d2;
                            str4 = str8;
                            s5rVar = s5rVar3;
                            str5 = a2;
                        }
                        obj2 = obj;
                        ((a) this.a).a(new u1k0(i3, b3, message, str4, str3, str2, str5));
                    } else {
                        set = set2;
                        str = string;
                        s5rVar = s5rVar2;
                        obj2 = obj;
                        kvj0Var = null;
                    }
                    if (failure instanceof Result.Failure) {
                        failure = kvj0Var;
                    }
                    obj = (s1k0) failure;
                    if (obj != null && !obj.equals(obj2)) {
                        break;
                    }
                    string = str;
                    s5rVar2 = s5rVar;
                    set2 = set;
                }
                if (!obj.equals(obj2)) {
                    if (obj.equals(r1k0.a)) {
                        b2.close();
                    } else {
                        if (!(obj instanceof q1k0)) {
                            w511.b();
                            return kvj0Var;
                        }
                        b2.close();
                        d5j0Var2 = ((q1k0) obj).a;
                    }
                    i2 = i3;
                    set2 = set;
                    i = 1;
                }
            }
            return b2;
        }
        t4j0 b5 = d5j0Var2.b();
        b5.g(d1k0.class, new d1k0(i2));
        return zci0Var.b(new d5j0(b5));
    }
}
