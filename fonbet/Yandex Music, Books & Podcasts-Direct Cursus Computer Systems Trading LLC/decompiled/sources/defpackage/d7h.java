package defpackage;

import android.os.Parcelable;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.url.ui.UrlActivity;

/* loaded from: classes5.dex */
public final class d7h extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ MainScreenActivity l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7h(MainScreenActivity mainScreenActivity, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = mainScreenActivity;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new d7h(this.l, continuation, 0);
            case 1:
                return new d7h(this.l, continuation, 1);
            case 2:
                return new d7h(this.l, continuation, 2);
            default:
                return new d7h(this.l, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((d7h) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object h;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    AtomicReference atomicReference = nu7.a;
                    this.k = 1;
                    mu7 mu7Var = (mu7) nu7.a.getAndSet(null);
                    obj = mu7Var != null ? mu7Var.H(this) : null;
                    if (obj == nm6Var) {
                        break;
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                ypt yptVar = (ypt) obj;
                if (yptVar != null) {
                    MainScreenActivity mainScreenActivity = this.l;
                    int i2 = UrlActivity.C;
                    a aVar = PlaybackScope.a;
                    aVar.getClass();
                    mainScreenActivity.startActivity(zfm.a(mainScreenActivity, yptVar, aVar, null, true));
                }
                break;
            case 1:
                MainScreenActivity mainScreenActivity2 = this.l;
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    lhs lhsVar = MainScreenActivity.Q0;
                    bsr bsrVar = (bsr) mainScreenActivity2.v0.getValue();
                    this.k = 1;
                    obj = bsrVar.c(this);
                    if (obj == nm6Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                y supportFragmentManager = mainScreenActivity2.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                aVar2.e(R.id.support_chat_spy_log_frame, (o) obj, null);
                aVar2.k(true, true);
                break;
            case 2:
                MainScreenActivity mainScreenActivity3 = this.l;
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    if (!mainScreenActivity3.isFinishing() && !mainScreenActivity3.isDestroyed()) {
                        h7h H = mainScreenActivity3.H();
                        MainScreenActivity mainScreenActivity4 = this.l;
                        this.k = 1;
                        H.getClass();
                        l18 l18Var = l18.b;
                        Parcelable.Creator<zh5> creator = zh5.CREATOR;
                        zh5 zh5Var = (zh5) zh5.d.get("music-launch");
                        if (zh5Var == null) {
                            h = Unit.a;
                        } else {
                            ssg.a(3, "MainScreenCommunicationTriggerProcessor", "try to open trigger on launch with timeout", null);
                            xj5 a = H.a();
                            bdt I = hag.I(byb.class);
                            qdc qdcVar = l18Var.a;
                            qdcVar.getClass();
                            boolean h2 = ((yg5) ((byb) qdcVar.C(I)).c(ern.a(yg5.class))).h();
                            bdt I2 = hag.I(byb.class);
                            qdc qdcVar2 = l18Var.a;
                            qdcVar2.getClass();
                            Long e = ((nj5) ((byb) qdcVar2.C(I2)).b(nj5.class)).a().e("loadTimeoutMs");
                            h = a.h(zh5Var, mainScreenActivity4, h2, e != null ? e.longValue() : 10000L, this);
                            if (h != nm6Var3) {
                                h = Unit.a;
                            }
                        }
                        if (h == nm6Var3) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                MainScreenActivity mainScreenActivity5 = this.l;
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    lhs lhsVar2 = MainScreenActivity.Q0;
                    h7h H2 = mainScreenActivity5.H();
                    this.k = 1;
                    if (H2.c(mainScreenActivity5, this) == nm6Var4) {
                        break;
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
