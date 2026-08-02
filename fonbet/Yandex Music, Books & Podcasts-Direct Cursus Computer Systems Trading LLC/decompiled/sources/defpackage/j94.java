package defpackage;

import android.content.Context;
import android.content.Intent;
import com.yandex.passport.sloth.ui.dependencies.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;

/* loaded from: classes4.dex */
public final /* synthetic */ class j94 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ j94(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                Intent intent = (Intent) obj;
                intent.getClass();
                ((Context) mVar.d).startActivity(intent);
                break;
            default:
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                int i2 = ArtistScreenActivity.w0;
                Context context = (Context) mVar.d;
                context.startActivity(l48.p(context, u51Var, (PlaybackScope) mVar.b, null, 24));
                break;
        }
        return Unit.a;
    }
}
