package defpackage;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.nonmusic.shelf.screen.MyShelfScreenActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class ig6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg6 b;

    public /* synthetic */ ig6(zg6 zg6Var, int i) {
        this.a = i;
        this.b = zg6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        zg6 zg6Var = this.b;
        String str = (String) obj;
        str.getClass();
        switch (i) {
            case 0:
                zg6Var.getClass();
                zg6Var.a.c.t(bi6.a, str);
                mmo mmoVar = zg6Var.b;
                String replace = str.replace('\n', ' ');
                replace.getClass();
                qui quiVar = new qui(replace, kvi.a);
                hn5 hn5Var = (hn5) mmoVar.g;
                int i2 = MyShelfScreenActivity.Y;
                hn5Var.getClass();
                Intent putExtra = new Intent(hn5Var, (Class<?>) MyShelfScreenActivity.class).putExtra("extra.activityParams", quiVar);
                putExtra.getClass();
                hn5Var.startActivity(putExtra);
                break;
            default:
                zg6Var.getClass();
                zg6Var.a.c.t(bi6.b, str);
                mmo mmoVar2 = zg6Var.b;
                String replace2 = str.replace('\n', ' ');
                replace2.getClass();
                qui quiVar2 = new qui(replace2, kvi.b);
                hn5 hn5Var2 = (hn5) mmoVar2.g;
                int i3 = MyShelfScreenActivity.Y;
                hn5Var2.getClass();
                Intent putExtra2 = new Intent(hn5Var2, (Class<?>) MyShelfScreenActivity.class).putExtra("extra.activityParams", quiVar2);
                putExtra2.getClass();
                hn5Var2.startActivity(putExtra2);
                break;
        }
        return Unit.a;
    }
}
