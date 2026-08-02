package defpackage;

import com.yandex.go.settings.email.EmailModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class trn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EmailModalView b;

    public /* synthetic */ trn(EmailModalView emailModalView, int i) {
        this.a = i;
        this.b = emailModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        EmailModalView emailModalView = this.b;
        switch (i) {
            case 0:
                emailModalView.processGoBack();
                break;
            case 1:
                EmailModalView._init_$lambda$0(emailModalView);
                break;
            case 2:
                emailModalView.processGoBack();
                break;
            default:
                EmailModalView._init_$lambda$2(emailModalView);
                break;
        }
    }
}
