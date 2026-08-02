package defpackage;

import ru.yandex.logistics.care.web_view.impl.js.TaxiAppJsCallback$ErrorType;

/* loaded from: classes4.dex */
public final /* synthetic */ class wtx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Exception b;
    public final /* synthetic */ ytx0 c;

    public /* synthetic */ wtx0(Exception exc, ytx0 ytx0Var, int i) {
        this.a = i;
        this.b = exc;
        this.c = ytx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i = this.a;
        ytx0 ytx0Var = this.c;
        Exception exc = this.b;
        switch (i) {
            case 0:
                String message = exc.getMessage();
                ytx0Var.a.a(message != null ? message : "parsing_error", null, TaxiAppJsCallback$ErrorType.General);
                ytx0Var.b.error("requestOpenUri parsing failed", exc);
                break;
            case 1:
                String message2 = exc.getMessage();
                str = message2 != null ? message2 : "parsing_error";
                ytx0Var.a.a(str, null, TaxiAppJsCallback$ErrorType.General);
                ytx0Var.b.error(str, exc);
                break;
            case 2:
                String message3 = exc.getMessage();
                str = message3 != null ? message3 : "parsing_error";
                ytx0Var.a.a(str, null, TaxiAppJsCallback$ErrorType.General);
                ytx0Var.b.error(str, exc);
                break;
            case 3:
                String message4 = exc.getMessage();
                str = message4 != null ? message4 : "parsing_error";
                ytx0Var.a.a(str, null, TaxiAppJsCallback$ErrorType.Config);
                ytx0Var.b.error(str, exc);
                break;
            default:
                String message5 = exc.getMessage();
                str = message5 != null ? message5 : "parsing_error";
                ytx0Var.a.a(str, null, TaxiAppJsCallback$ErrorType.General);
                ytx0Var.b.error(str, exc);
                break;
        }
    }
}
