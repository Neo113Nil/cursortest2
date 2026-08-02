package F5;

import f6.C4522a;
import java.time.Instant;
import java.util.Locale;
import u7.v;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f1017a = new o();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e eVar, String str, String str2, String str3, String str4, String str5, B7.c cVar) {
        n nVar;
        int i;
        l6.i iVar;
        C4522a c4522a;
        l6.i iVar2;
        Instant now;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i4 = nVar.f1016y;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nVar.f1016y = i4 - Integer.MIN_VALUE;
                Object obj = nVar.f1014w;
                A7.a aVar = A7.a.f215n;
                i = nVar.f1016y;
                if (i != 0) {
                    Q3.b.s(obj);
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.h.d(upperCase, "toUpperCase(...)");
                    int hashCode = upperCase.hashCode();
                    l6.i iVar3 = l6.i.INFO;
                    switch (hashCode) {
                        case 2251950:
                            upperCase.equals("INFO");
                            iVar = iVar3;
                            break;
                        case 2656902:
                            if (upperCase.equals("WARN")) {
                                iVar = l6.i.WARN;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 64921139:
                            if (upperCase.equals("DEBUG")) {
                                iVar = l6.i.DEBUG;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 66247144:
                            if (upperCase.equals("ERROR")) {
                                iVar = l6.i.ERROR;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 66665700:
                            if (upperCase.equals("FATAL")) {
                                iVar = l6.i.FATAL;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 1069090146:
                            if (upperCase.equals("VERBOSE")) {
                                iVar = l6.i.TRACE;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        default:
                            iVar = iVar3;
                            break;
                    }
                    K1.c cVar2 = new K1.c(1);
                    cVar2.b("log.message", str2);
                    cVar2.b("log.level", str);
                    if (str3 != null) {
                        cVar2.b("exception.type", str3);
                    }
                    if (str4 != null) {
                        cVar2.b("exception.message", str4);
                    }
                    if (str5 != null) {
                        cVar2.b("exception.stacktrace", str5);
                    }
                    C4522a a9 = cVar2.a();
                    nVar.f1011n = str2;
                    nVar.f1012u = iVar;
                    nVar.f1013v = a9;
                    nVar.f1016y = 1;
                    j jVar = (j) eVar;
                    jVar.getClass();
                    Object b9 = j.b(jVar, nVar);
                    if (b9 == aVar) {
                        return aVar;
                    }
                    l6.i iVar4 = iVar;
                    obj = b9;
                    c4522a = a9;
                    iVar2 = iVar4;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4522a = nVar.f1013v;
                    iVar2 = nVar.f1012u;
                    str2 = nVar.f1011n;
                    Q3.b.s(obj);
                }
                l6.e eVar2 = (l6.e) obj;
                eVar2.f(c4522a);
                eVar2.e(iVar2);
                eVar2.a(str2);
                now = Instant.now();
                eVar2.d(now);
                eVar2.b();
                return v.f41073a;
            }
        }
        nVar = new n(this, cVar);
        Object obj2 = nVar.f1014w;
        A7.a aVar2 = A7.a.f215n;
        i = nVar.f1016y;
        if (i != 0) {
        }
        l6.e eVar22 = (l6.e) obj2;
        eVar22.f(c4522a);
        eVar22.e(iVar2);
        eVar22.a(str2);
        now = Instant.now();
        eVar22.d(now);
        eVar22.b();
        return v.f41073a;
    }
}
