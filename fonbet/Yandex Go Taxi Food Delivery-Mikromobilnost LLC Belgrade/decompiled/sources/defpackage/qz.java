package defpackage;

import com.yandex.messaging.ChatRequest;

/* loaded from: classes15.dex */
public final class qz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b00 b;
    public final /* synthetic */ ChatRequest c;

    public /* synthetic */ qz(b00 b00Var, ChatRequest chatRequest, int i) {
        this.a = i;
        this.b = b00Var;
        this.c = chatRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ChatRequest chatRequest = this.c;
        b00 b00Var = this.b;
        switch (i) {
            case 0:
                ((i00) b00Var.j.getValue()).a(new t0c(chatRequest));
                break;
            case 1:
                b00.a(b00Var).a(new g9x(chatRequest));
                break;
            case 2:
                b00.a(b00Var).a(new xub0(chatRequest, b00Var.d, b00Var.g));
                break;
            case 3:
                ((i00) b00Var.j.getValue()).a(new aw11(chatRequest));
                break;
            default:
                b00.a(b00Var).a(new z821(chatRequest));
                break;
        }
    }
}
