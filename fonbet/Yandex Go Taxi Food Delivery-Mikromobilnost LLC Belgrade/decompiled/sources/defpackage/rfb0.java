package defpackage;

import ru.yandex.taxi.phone_select.PhoneSelectModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class rfb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhoneSelectModalView b;

    public /* synthetic */ rfb0(PhoneSelectModalView phoneSelectModalView, int i) {
        this.a = i;
        this.b = phoneSelectModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PhoneSelectModalView phoneSelectModalView = this.b;
        switch (i) {
            case 0:
                PhoneSelectModalView.phoneSelected$lambda$0(phoneSelectModalView);
                break;
            case 1:
                PhoneSelectModalView.onBackPressed$lambda$0(phoneSelectModalView);
                break;
            default:
                phoneSelectModalView.requestFocus();
                break;
        }
    }
}
