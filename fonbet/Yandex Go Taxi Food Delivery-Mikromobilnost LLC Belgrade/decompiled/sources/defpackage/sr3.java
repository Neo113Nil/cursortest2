package defpackage;

import com.yandex.go.g;
import com.yandex.go.payments.shared.business.onboarding.a;
import flex.logger.FlexLogLevel;
import json.state.disk.storage.feature.b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.am.r;

/* loaded from: classes9.dex */
public final class sr3 extends d7 implements mse {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr3(b bVar) {
        super(lse.a);
        this.b = bVar;
    }

    @Override // defpackage.mse
    public final void handleException(fse fseVar, Throwable th) {
        StackTraceElement stackTraceElement;
        String str;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                jst.e.r("Error in autologin", th);
                ((r) obj).g();
                break;
            case 1:
                ((a) obj).b.getClass();
                xby.l(jst.e, "B2B.TOKEN_ERROR:PROCESS_BUSINESS_ACCOUNT_DEEPLINK", null, th, "error process business account deeplink", 2);
                break;
            case 2:
                zjr zjrVar = ((b) obj).c;
                i3y a = xfz.a(new Pair("error", th.getMessage()));
                s7s0 s7s0Var = zjrVar.c.a;
                boolean booleanValue = Boolean.FALSE.booleanValue();
                tjr tjrVar = tjr.d;
                if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName = stackTraceElement.getFileName();
                    if (fileName == null) {
                        fileName = "No file info";
                    }
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    Integer valueOf = Integer.valueOf(lineNumber);
                    if (lineNumber <= 0) {
                        valueOf = null;
                    }
                    if (valueOf == null || (str = valueOf.toString()) == null) {
                        str = "No line info";
                    }
                    tjrVar = new tjr(fileName, methodName, str);
                }
                zjrVar.d(FlexLogLevel.DEBUG, "Caught error in coroutine execution", a, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
                break;
            default:
                ((g) obj).c.b("LocationSdkController/CEH", th, new Pair[0]);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr3(g gVar) {
        super(lse.a);
        this.b = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr3(a aVar) {
        super(lse.a);
        this.b = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr3(r rVar) {
        super(lse.a);
        this.b = rVar;
    }
}
