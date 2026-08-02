package defpackage;

import com.yandex.messaging.ChatRequest;

/* loaded from: classes15.dex */
public final class tz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b00 b;
    public final /* synthetic */ ChatRequest c;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;

    public /* synthetic */ tz(b00 b00Var, ChatRequest chatRequest, String str, String str2, int i) {
        this.a = i;
        this.b = b00Var;
        this.c = chatRequest;
        this.w = str;
        this.x = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.x;
        String str2 = this.w;
        ChatRequest chatRequest = this.c;
        b00 b00Var = this.b;
        switch (i) {
            case 0:
                b00.a(b00Var).a(new ozq(chatRequest, str2, str));
                break;
            case 1:
                ((i00) b00Var.j.getValue()).a(new nzq(chatRequest, str2, str));
                break;
            default:
                b00.a(b00Var).a(new h1r(chatRequest, str2, str));
                break;
        }
    }
}
