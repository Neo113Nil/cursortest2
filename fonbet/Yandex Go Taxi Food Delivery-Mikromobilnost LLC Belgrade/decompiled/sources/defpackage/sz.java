package defpackage;

import com.yandex.messaging.ChatRequest;
import java.util.Set;

/* loaded from: classes15.dex */
public final class sz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b00 b;
    public final /* synthetic */ ChatRequest c;
    public final /* synthetic */ Set w;
    public final /* synthetic */ boolean x;

    public /* synthetic */ sz(b00 b00Var, ChatRequest chatRequest, Set set, boolean z, int i) {
        this.a = i;
        this.b = b00Var;
        this.c = chatRequest;
        this.w = set;
        this.x = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b00.a(this.b).a(new dkr0(this.c, true, this.w, this.x));
                break;
            default:
                b00.a(this.b).a(new dkr0(this.c, false, this.w, this.x));
                break;
        }
    }
}
