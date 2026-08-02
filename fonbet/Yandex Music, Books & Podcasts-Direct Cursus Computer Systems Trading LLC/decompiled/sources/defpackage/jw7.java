package defpackage;

import android.net.Uri;
import androidx.work.impl.WorkDatabase;
import com.yandex.passport.internal.account.a;
import com.yandex.passport.internal.core.accounts.e;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.links.LinksHandlingActivity;
import com.yandex.passport.internal.links.g;
import com.yandex.passport.internal.report.reporters.g0;
import com.yandex.passport.internal.ui.social.gimap.MailGIMAPActivity;
import com.yandex.passport.internal.ui.social.gimap.p;
import com.yandex.passport.internal.ui.social.gimap.q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class jw7 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jw7(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((kw7) obj3).a.submit(new jt6(22, (Callable) obj2, (qxp) obj));
            case 1:
                String str = (String) obj;
                WorkDatabase workDatabase = ((htm) obj3).e;
                z4w B = workDatabase.B();
                B.getClass();
                str.getClass();
                ((ArrayList) obj2).addAll((List) up6.F(B.a, true, false, new v4w(str, 8)));
                return workDatabase.A().e(str);
            case 2:
                PassportProcessGlobalComponent passportProcessGlobalComponent = (PassportProcessGlobalComponent) obj3;
                Uri uri = (Uri) obj;
                int i2 = LinksHandlingActivity.r;
                a currentAccountManager = passportProcessGlobalComponent.getCurrentAccountManager();
                e accountsRetriever = passportProcessGlobalComponent.getAccountsRetriever();
                g0 g0Var = ((LinksHandlingActivity) obj2).i;
                if (g0Var != null) {
                    return new g(currentAccountManager, accountsRetriever, g0Var, uri, passportProcessGlobalComponent.getAutoLoginUseCase(), passportProcessGlobalComponent.getPreferenceStorage(), passportProcessGlobalComponent.getFlagRepository(), passportProcessGlobalComponent.getCommonParamsProvider(), passportProcessGlobalComponent.getAccountFilterRepository());
                }
                Intrinsics.j("reporter");
                throw null;
            default:
                return new q((p) obj2, com.yandex.plus.core.network.api.utils.a.L(((MailGIMAPActivity) obj3).e.d.a), ((PassportProcessGlobalComponent) obj).getAccountsUpdater());
        }
    }
}
