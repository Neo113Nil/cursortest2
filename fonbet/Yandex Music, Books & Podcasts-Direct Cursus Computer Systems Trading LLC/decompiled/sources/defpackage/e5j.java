package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes5.dex */
public final /* synthetic */ class e5j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cr b;

    public /* synthetic */ e5j(cr crVar, int i) {
        this.a = i;
        this.b = crVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        cr crVar = this.b;
        u51 u51Var = (u51) obj;
        switch (i) {
            case 0:
                u51Var.getClass();
                int i2 = ArtistScreenActivity.w0;
                Context context = (Context) crVar.b;
                context.startActivity(l48.p(context, u51Var, d.p((nrf) crVar.h), null, 24));
                break;
            default:
                u51Var.getClass();
                int i3 = ArtistScreenActivity.w0;
                Context context2 = (Context) crVar.b;
                context2.startActivity(l48.p(context2, u51Var, null, null, 24));
                break;
        }
        return Unit.a;
    }
}
