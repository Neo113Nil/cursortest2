package defpackage;

import android.os.Parcelable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.player.a;

/* loaded from: classes6.dex */
public final class qal extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ a l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qal(a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = aVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new qal(this.l, continuation, 0);
            default:
                return new qal(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((qal) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object D;
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    hal halVar = (hal) this.l.H.getValue();
                    a aVar = this.l;
                    this.k = 1;
                    halVar.getClass();
                    ssg.a(3, "PlayerCommunicationTriggerProcessor", "onPlayerExpanded", null);
                    Parcelable.Creator<zh5> creator = zh5.CREATOR;
                    zh5 zh5Var = (zh5) zh5.d.get("music-fullscreen-player");
                    if (zh5Var == null) {
                        D = Unit.a;
                    } else {
                        jyr jyrVar = k3j.e;
                        boolean x = ixf.x();
                        jyr jyrVar2 = halVar.a;
                        if (x) {
                            D = xv7.D((xj5) jyrVar2.getValue(), zh5Var, aVar, null, this);
                            if (D != obj2) {
                                D = Unit.a;
                            }
                        } else {
                            xj5 xj5Var = (xj5) jyrVar2.getValue();
                            l18 l18Var = l18.b;
                            bdt I = hag.I(byb.class);
                            qdc qdcVar = l18Var.a;
                            qdcVar.getClass();
                            xj5Var.f(zh5Var, aVar, ((yg5) ((byb) qdcVar.C(I)).c(ern.a(yg5.class))).h(), null);
                            D = Unit.a;
                        }
                    }
                    if (D == obj2) {
                        break;
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(2000L, this) == nm6Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                px2.c(this.l);
                break;
        }
        return Unit.a;
    }
}
