package defpackage;

import com.yandex.music.shared.media.session.common.state.source_info.Media3RatingScopedCache$Media3RatingCancellationException;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.a;

/* loaded from: classes3.dex */
public final class dgh implements Function1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ dgh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                if (!(((Throwable) obj) instanceof Media3RatingScopedCache$Media3RatingCancellationException)) {
                    rn5 rn5Var = (rn5) this.b;
                    rn5Var.f = null;
                    rn5Var.g = null;
                    rn5Var.h = null;
                }
                return Unit.a;
            case 1:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                fk0 fk0Var = (fk0) this.b;
                zcoVar.n(((Number) fk0Var.e()).floatValue());
                zcoVar.k(((Number) fk0Var.e()).floatValue());
                return Unit.a;
            case 2:
                List list = (List) obj;
                list.getClass();
                ((Function1) this.b).invoke(list);
                throw new fif();
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                tfm tfmVar = (tfm) this.b;
                if (tfmVar != null) {
                    tfmVar.c = booleanValue;
                }
                return Unit.a;
            default:
                a aVar = (a) obj;
                aVar.getClass();
                return aVar == ((a) this.b) ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
        }
    }

    public /* synthetic */ dgh() {
        this.a = 3;
    }
}
