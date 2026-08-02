package defpackage;

import com.yandex.go.captcha.i;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final class yya implements bi41 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yya(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bi41
    public final void onPageFinished(String str) {
        switch (this.a) {
            case 0:
                ((dza) this.b).getClass();
                break;
            case 1:
                ((v8p0) this.b).getClass();
                break;
            default:
                ((i) this.b).d.b.a("Antirobot.Captcha.WebView.DidLoad", new Pair[0]);
                break;
        }
    }

    @Override // defpackage.bi41
    public final void onPageStarted(String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((dza) obj).getClass();
                break;
            case 1:
                ((v8p0) obj).onPageStarted(str);
                break;
            default:
                ((i) obj).d.b.a("Antirobot.Captcha.WebView.DidStartLoading", new Pair[0]);
                break;
        }
    }
}
