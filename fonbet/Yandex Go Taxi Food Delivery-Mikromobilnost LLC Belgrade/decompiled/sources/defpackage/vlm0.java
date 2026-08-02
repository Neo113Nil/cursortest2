package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.mobile.drive.scan.service.f;
import com.yandex.mobile.drive.scan.ui.b;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public final /* synthetic */ class vlm0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ vlm0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.n.invoke();
                bVar.n = new bgc(12);
                bVar.f();
                break;
            case 1:
                bVar.n = new bgc(12);
                f fVar = bVar.i;
                List c = fVar.b.size() == fVar.c ? fVar.a.c() : null;
                if (c == null) {
                    bVar.f();
                    break;
                } else {
                    bVar.h.toPreviousScreenWithResult(c);
                    break;
                }
            case 2:
                bVar.e();
                break;
            case 3:
                bVar.j();
                break;
            case 4:
                bVar.h.toPreviousScreen();
                break;
            case 5:
                Context context = bVar.c;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
                try {
                    intent.addFlags(SelfTester_JCP.IMITA);
                    context.startActivity(intent);
                    break;
                } catch (ActivityNotFoundException e) {
                    l0b1.h(new AssertionError("activity not found", e));
                    break;
                }
            case 6:
                Integer num = bVar.s;
                bVar.s = (num != null && num.intValue() == 1) ? 0 : 1;
                bVar.f();
                break;
            default:
                bVar.e();
                break;
        }
        return zy11Var;
        return zy11Var;
    }
}
