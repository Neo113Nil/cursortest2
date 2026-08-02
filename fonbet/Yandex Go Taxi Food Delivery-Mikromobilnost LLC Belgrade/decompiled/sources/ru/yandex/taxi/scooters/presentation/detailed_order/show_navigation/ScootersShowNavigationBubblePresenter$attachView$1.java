package ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.ewo0;
import defpackage.fwo0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.q0h0;
import defpackage.qoh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.map_object.ShowNavigationButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation.ScootersShowNavigationBubblePresenter$attachView$1", f = "ScootersShowNavigationBubblePresenter.kt", l = {67, 67, 67, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 74, 83}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersShowNavigationBubblePresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ ewo0 $mvpView;
    final /* synthetic */ ShowNavigationButton $noBtn;
    final /* synthetic */ ScreenPoint $screenPoint;
    final /* synthetic */ ShowNavigationButton $yesBtn;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ fwo0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersShowNavigationBubblePresenter$attachView$1(ewo0 ewo0Var, fwo0 fwo0Var, ScreenPoint screenPoint, ShowNavigationButton showNavigationButton, ShowNavigationButton showNavigationButton2, Continuation continuation) {
        super(2, continuation);
        this.$mvpView = ewo0Var;
        this.this$0 = fwo0Var;
        this.$screenPoint = screenPoint;
        this.$yesBtn = showNavigationButton;
        this.$noBtn = showNavigationButton2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersShowNavigationBubblePresenter$attachView$1 scootersShowNavigationBubblePresenter$attachView$1 = new ScootersShowNavigationBubblePresenter$attachView$1(this.$mvpView, this.this$0, this.$screenPoint, this.$yesBtn, this.$noBtn, continuation);
        scootersShowNavigationBubblePresenter$attachView$1.L$0 = obj;
        return scootersShowNavigationBubblePresenter$attachView$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersShowNavigationBubblePresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x01a3, code lost:
    
        if (r13.h7(r12) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x013c, code lost:
    
        if (r13.h7(r12) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fe  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh nohVar;
        ewo0 ewo0Var;
        Object k;
        CharSequence charSequence;
        noh nohVar2;
        Object k2;
        CharSequence charSequence2;
        ewo0 ewo0Var2;
        int i;
        int i2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                b.b(obj);
                qoh h2 = tje.h(tseVar, null, null, new ScootersShowNavigationBubblePresenter$attachView$1$title$1(this.this$0, null), 3);
                h = tje.h(tseVar, null, null, new ScootersShowNavigationBubblePresenter$attachView$1$yesText$1(this.this$0, this.$yesBtn, null), 3);
                qoh h3 = tje.h(tseVar, null, null, new ScootersShowNavigationBubblePresenter$attachView$1$noText$1(this.this$0, this.$noBtn, null), 3);
                ewo0 ewo0Var3 = this.$mvpView;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.L$3 = h3;
                this.L$4 = ewo0Var3;
                this.label = 1;
                obj = h2.s(this);
                if (obj != coroutineSingletons) {
                    nohVar = h3;
                    ewo0Var = ewo0Var3;
                    CharSequence charSequence3 = (CharSequence) obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = nohVar;
                    this.L$4 = ewo0Var;
                    this.L$5 = charSequence3;
                    this.label = 2;
                    k = h.k(this);
                    if (k != coroutineSingletons) {
                        noh nohVar3 = nohVar;
                        charSequence = charSequence3;
                        obj = k;
                        nohVar2 = nohVar3;
                        CharSequence charSequence4 = (CharSequence) obj;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = ewo0Var;
                        this.L$5 = charSequence;
                        this.L$6 = charSequence4;
                        this.label = 3;
                        k2 = nohVar2.k(this);
                        if (k2 != coroutineSingletons) {
                            ewo0 ewo0Var4 = ewo0Var;
                            charSequence2 = charSequence4;
                            obj = k2;
                            ewo0Var2 = ewo0Var4;
                            ewo0Var2.d8(charSequence, charSequence2, (CharSequence) obj);
                            ewo0 ewo0Var5 = this.$mvpView;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.label = 4;
                            break;
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                ewo0Var = (ewo0) this.L$4;
                nohVar = (noh) this.L$3;
                h = (noh) this.L$2;
                b.b(obj);
                CharSequence charSequence32 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar;
                this.L$4 = ewo0Var;
                this.L$5 = charSequence32;
                this.label = 2;
                k = h.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                CharSequence charSequence5 = (CharSequence) this.L$5;
                ewo0 ewo0Var6 = (ewo0) this.L$4;
                nohVar2 = (noh) this.L$3;
                b.b(obj);
                charSequence = charSequence5;
                ewo0Var = ewo0Var6;
                CharSequence charSequence42 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = ewo0Var;
                this.L$5 = charSequence;
                this.L$6 = charSequence42;
                this.label = 3;
                k2 = nohVar2.k(this);
                if (k2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                charSequence2 = (CharSequence) this.L$6;
                charSequence = (CharSequence) this.L$5;
                ewo0Var2 = (ewo0) this.L$4;
                b.b(obj);
                ewo0Var2.d8(charSequence, charSequence2, (CharSequence) obj);
                ewo0 ewo0Var52 = this.$mvpView;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 4;
                break;
            case 4:
                b.b(obj);
                GradientDrawable gradientDrawable = (GradientDrawable) tje.y(q0h0.scooters_show_navigation_bubble, this.this$0.x);
                int l5 = this.$mvpView.l5();
                int i6 = this.$mvpView.i6();
                this.this$0.z.getClass();
                sjh sjhVar = uyj.a;
                ScootersShowNavigationBubblePresenter$attachView$1$shadowedDrawable$1 scootersShowNavigationBubblePresenter$attachView$1$shadowedDrawable$1 = new ScootersShowNavigationBubblePresenter$attachView$1$shadowedDrawable$1(gradientDrawable, l5, i6, this.this$0, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = l5;
                this.I$1 = i6;
                this.label = 5;
                obj = tje.k0(sjhVar, scootersShowNavigationBubblePresenter$attachView$1$shadowedDrawable$1, this);
                if (obj != coroutineSingletons) {
                    i = l5;
                    i2 = i6;
                    this.$mvpView.l1((Drawable) obj);
                    ewo0 ewo0Var7 = this.$mvpView;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.I$0 = i;
                    this.I$1 = i2;
                    this.label = 6;
                    break;
                }
                return coroutineSingletons;
            case 5:
                i2 = this.I$1;
                i = this.I$0;
                b.b(obj);
                this.$mvpView.l1((Drawable) obj);
                ewo0 ewo0Var72 = this.$mvpView;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 6;
                break;
            case 6:
                b.b(obj);
                this.$mvpView.Sa(this.$screenPoint);
                return zy11.a;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
