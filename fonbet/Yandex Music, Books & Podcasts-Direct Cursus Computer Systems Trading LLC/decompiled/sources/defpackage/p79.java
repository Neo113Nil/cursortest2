package defpackage;

import android.content.Context;
import com.yandex.div.core.dagger.DivKitComponent;
import com.yandex.div.core.dagger.Yatagan$DivKitComponent;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class p79 {
    public static final aaw b = new aaw(20);
    public static final vx6 c = new vx6(8, Executors.newSingleThreadExecutor(), new q79(0), new q79(1));
    public static volatile p79 d;
    public final DivKitComponent a;

    public p79(Context context, vx6 vx6Var) {
        DivKitComponent.Builder a = Yatagan$DivKitComponent.builder().a(context.getApplicationContext());
        a.b(vx6Var);
        this.a = a.build();
    }
}
