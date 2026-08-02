package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class z4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4 b;

    public /* synthetic */ z4(s4 s4Var, int i) {
        this.a = i;
        this.b = s4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        s4 s4Var = this.b;
        switch (i) {
            case 0:
                s4Var.b.invoke();
                break;
            case 1:
                s4Var.getClass();
                Object systemService = ((Context) sk3.I(Context.class)).getSystemService("clipboard");
                systemService.getClass();
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("2026.07.4 #157gpr", "2026.07.4 #157gpr"));
                Context context = s4Var.a;
                context.getClass();
                hag.x(context, R.string.copied, 0);
                break;
            case 2:
                w1g.z(s4Var.a, g3o.c(R.string.url_mobile_legal, swf.H().a));
                break;
            case 3:
                w1g.z(s4Var.a, g3o.c(R.string.url_mobile_components, swf.H().a));
                break;
            case 4:
                w1g.z(s4Var.a, g3o.c(R.string.url_privacy_policy, swf.H().a));
                break;
            default:
                w1g.z(s4Var.a, g3o.c(R.string.url_rules_of_recommendations, swf.H().a));
                break;
        }
        return Unit.a;
    }
}
