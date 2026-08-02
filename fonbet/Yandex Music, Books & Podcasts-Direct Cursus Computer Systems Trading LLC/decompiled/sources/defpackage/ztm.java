package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.chat.SupportChatActivity;
import ru.yandex.music.in_app_restore.RestorePurchasesActivity;
import ru.yandex.music.settings.SettingsActivity;
import ru.yandex.music.wizard3.WizardActivity;

/* loaded from: classes6.dex */
public final /* synthetic */ class ztm implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cum b;

    public /* synthetic */ ztm(cum cumVar, int i) {
        this.a = i;
        this.b = cumVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        cum cumVar = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                x7m x7mVar = (x7m) cumVar.l.getValue();
                hq0 hq0Var = cumVar.b;
                x7mVar.getClass();
                break;
            case 2:
                break;
            case 3:
                cumVar.b().a(dum.a);
                awc awcVar = cumVar.q;
                if (awcVar != null) {
                    Context context = ((ytm) awcVar.a).getContext();
                    context.getClass();
                    w1g.y(context, "yandexmusic://plus-home-sdk/home", true);
                }
                break;
            case 4:
                awc awcVar2 = cumVar.q;
                if (awcVar2 != null) {
                    ytm ytmVar = (ytm) awcVar2.a;
                    int i2 = SupportChatActivity.w;
                    Context context2 = ytmVar.getContext();
                    context2.getClass();
                    ytmVar.startActivity(qcm.d(context2, esr.PROFILE));
                }
                break;
            case 5:
                cumVar.b().a(dum.b);
                awc awcVar3 = cumVar.q;
                if (awcVar3 != null) {
                    ytm ytmVar2 = (ytm) awcVar3.a;
                    cpp cppVar = SettingsActivity.v0;
                    Context context3 = ytmVar2.getContext();
                    context3.getClass();
                    cppVar.getClass();
                    ytmVar2.startActivity(cpp.a(context3, null));
                }
                break;
            case 6:
                cumVar.b().a(dum.c);
                awc awcVar4 = cumVar.q;
                if (awcVar4 != null) {
                    int i3 = RestorePurchasesActivity.y;
                    Context context4 = ((ytm) awcVar4.a).getContext();
                    context4.getClass();
                    Parcelable.Creator<zee> creator = zee.CREATOR;
                    neg.C(context4);
                }
                break;
            case 7:
                cumVar.b().a(dum.e);
                awc awcVar5 = cumVar.q;
                if (awcVar5 != null) {
                    int i4 = WizardActivity.v;
                    ytm ytmVar3 = (ytm) awcVar5.a;
                    Context context5 = ytmVar3.getContext();
                    context5.getClass();
                    Intent intent = new Intent(context5, (Class<?>) WizardActivity.class);
                    intent.putExtra("show_onboarding", false);
                    ytmVar3.startActivity(intent);
                }
                break;
            case 8:
                awc awcVar6 = cumVar.q;
                if (awcVar6 != null) {
                    Context context6 = ((ytm) awcVar6.a).getContext();
                    context6.getClass();
                    w1g.y(context6, "https://passport.yandex.ru/profile/public?origin=music_mobile&mode=popup&retpath=yandexmusic://profile", true);
                }
                break;
            default:
                cumVar.b().a(dum.d);
                awc awcVar7 = cumVar.q;
                if (awcVar7 != null) {
                    ytm ytmVar4 = (ytm) awcVar7.a;
                    x97.y(wyf.F(ytmVar4.getLifecycle()), null, null, new xtm(ytmVar4, null, 0), 3);
                }
                break;
        }
        return Unit.a;
    }
}
