package defpackage;

import androidx.fragment.app.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;

/* loaded from: classes4.dex */
public final /* synthetic */ class y66 extends oj implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y66(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r5.i == false) goto L13;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                zzi zziVar = (zzi) obj;
                zziVar.getClass();
                ((oc4) ((ltm) this.receiver)).c(zziVar);
                break;
            case 1:
                mqs mqsVar = (mqs) obj;
                mqsVar.getClass();
                ((k0f) this.receiver).i(mqsVar);
                break;
            case 2:
                x1u x1uVar = (x1u) obj;
                x1uVar.getClass();
                til tilVar = (til) this.receiver;
                tilVar.getClass();
                int ordinal = ((ezb) l18.b.b(hag.I(ezb.class), true).getValue()).a().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        b6e.s();
                        break;
                    } else {
                        break;
                    }
                }
                y yVar = tilVar.b;
                hn5 hn5Var = tilVar.a;
                a aVar = PlaybackScope.a;
                aVar.getClass();
                rre.b0(x1uVar, yVar, hn5Var, aVar, tilVar.c, ru0.NONE);
                break;
            default:
                ((eqi) this.receiver).d((dwo) obj);
                break;
        }
        return Unit.a;
    }
}
