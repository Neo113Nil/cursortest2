package ru.yandex.taxi.altpins.map;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bdc;
import defpackage.bdh0;
import defpackage.cma1;
import defpackage.e100;
import defpackage.evu0;
import defpackage.gph0;
import defpackage.i1c0;
import defpackage.j741;
import defpackage.jl40;
import defpackage.mrg0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qje;
import defpackage.qoh;
import defpackage.qy1;
import defpackage.ry1;
import defpackage.tje;
import defpackage.tse;
import defpackage.vy1;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.map.WalkingRouteUiState;
import ru.yandex.taxi.map.c;
import ru.yandex.taxi.shadow.ShadowWrapperImpl;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.map.AltpinDestinationOnMapHolder$render$1", f = "AltpinDestinationOnMapHolder.kt", l = {HProv.PP_CIPHEROID, HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AltpinDestinationOnMapHolder$render$1 extends SuspendLambda implements wls {
    final /* synthetic */ ry1 $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AltpinDestinationOnMapHolder$render$1(a aVar, ry1 ry1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$state = ry1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AltpinDestinationOnMapHolder$render$1 altpinDestinationOnMapHolder$render$1 = new AltpinDestinationOnMapHolder$render$1(this.this$0, this.$state, continuation);
        altpinDestinationOnMapHolder$render$1.L$0 = obj;
        return altpinDestinationOnMapHolder$render$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AltpinDestinationOnMapHolder$render$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0059, code lost:
    
        if (r8 == r2) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ShadowWrapperImpl shadowWrapperImpl;
        Object s;
        qoh qohVar;
        Object k;
        j741 j741Var;
        WalkingRouteUiState walkingRouteUiState;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h = tje.h(tseVar, null, null, new AltpinDestinationOnMapHolder$render$1$shadows$1(this.this$0, null), 3);
            shadowWrapperImpl = this.this$0.d;
            this.L$0 = null;
            this.L$1 = h;
            this.L$2 = shadowWrapperImpl;
            this.label = 1;
            s = h.s(this);
            qohVar = h;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                walkingRouteUiState = (WalkingRouteUiState) this.L$3;
                j741Var = (j741) this.L$2;
                b.b(obj);
                k = obj;
                c cVar = (c) j741Var;
                cVar.c.setShadows((List) k);
                cVar.d(walkingRouteUiState);
                a.b(this.this$0);
                return zy11.a;
            }
            shadowWrapperImpl = (ShadowWrapperImpl) this.L$2;
            ?? r3 = (noh) this.L$1;
            b.b(obj);
            s = obj;
            qohVar = r3;
        }
        shadowWrapperImpl.setShadows((List) s);
        a aVar = this.this$0;
        qy1 qy1Var = this.$state.b;
        ShadowWrapperImpl shadowWrapperImpl2 = aVar.d;
        e100 e100Var = aVar.k;
        qy1 qy1Var2 = qy1.f;
        if (qy1Var.equals(qy1Var2)) {
            e100Var.j(false);
        } else {
            AlternativeDestinationOnMapControl alternativeDestinationOnMapControl = (AlternativeDestinationOnMapControl) aVar.f.get();
            alternativeDestinationOnMapControl.render(qy1Var);
            shadowWrapperImpl2.wrapView(alternativeDestinationOnMapControl, null);
            e100Var.i(shadowWrapperImpl2.getView(), new PointF(0.5f, 0.9f));
            e100Var.h(qy1Var.a);
            e100Var.j(true);
        }
        a aVar2 = this.this$0;
        qy1 qy1Var3 = this.$state.a;
        ShadowWrapperImpl shadowWrapperImpl3 = aVar2.d;
        MainActivity mainActivity = aVar2.a;
        e100 e100Var2 = aVar2.j;
        boolean equals = qy1Var3.equals(qy1Var2);
        boolean z = qy1Var3.e;
        zzs zzsVar = qy1Var3.a;
        if (equals) {
            e100Var2.j(false);
        } else {
            View inflate = LayoutInflater.from(mainActivity).inflate(gph0.alternative_destination_bubble, (ViewGroup) null, false);
            BubbleComponent bubbleComponent = (BubbleComponent) inflate;
            int i2 = bdh0.title;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
            if (robotoTextView == null) {
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            }
            CharSequence charSequence = qy1Var3.c;
            if (!z || evu0.J(charSequence)) {
                charSequence = qy1Var3.b;
            }
            robotoTextView.setText(charSequence);
            robotoTextView.setTextSize(0, mainActivity.getResources().getDimensionPixelSize(mrg0.component_text_size_caption));
            robotoTextView.setTextTypeface(3);
            int i3 = z ? xng0.textInvert : xng0.textMain;
            int i4 = z ? xng0.bgInvert : xng0.bgMain;
            robotoTextView.setTextColor(qje.u(mainActivity.getTheme(), i3));
            bubbleComponent.setBubbleColor(new bdc(i4));
            shadowWrapperImpl3.wrapView(bubbleComponent, new Rect(0, 0, 0, mainActivity.getResources().getDimensionPixelSize(mrg0.go_design_m_space)));
            e100Var2.i(shadowWrapperImpl3.getView(), new PointF(0.5f, 0.8f));
            e100Var2.h(zzsVar);
            boolean l = jl40.l(zzsVar, zzs.f);
            e100Var2.j(!l);
            if (!l) {
                aVar2.o.invoke();
            }
        }
        a aVar3 = this.this$0;
        vy1 vy1Var = this.$state.c;
        ShadowWrapperImpl shadowWrapperImpl4 = aVar3.d;
        e100 e100Var3 = aVar3.l;
        if (vy1Var == null) {
            e100Var3.j(false);
        } else {
            zzs zzsVar2 = vy1Var.a;
            SourceOnMapControl.a aVar4 = new SourceOnMapControl.a(vy1Var.c, null, vy1Var.b.toString(), true, false, null, null, 2034);
            SourceOnMapControl sourceOnMapControl = new SourceOnMapControl(aVar3.a);
            sourceOnMapControl.render(aVar4);
            i1c0 i1c0Var = vy1Var.d;
            if (i1c0Var != null) {
                sourceOnMapControl.updateStyle(i1c0Var);
            }
            shadowWrapperImpl4.wrapView(sourceOnMapControl, null);
            e100Var3.i(shadowWrapperImpl4.getView(), new PointF(0.5f, 0.9f));
            e100Var3.h(zzsVar2);
            e100Var3.j(!jl40.l(zzsVar2, zzs.f));
        }
        j741 j741Var2 = this.this$0.c;
        WalkingRouteUiState walkingRouteUiState2 = this.$state.d;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = j741Var2;
        this.L$3 = walkingRouteUiState2;
        this.label = 2;
        k = qohVar.k(this);
        if (k != coroutineSingletons) {
            j741Var = j741Var2;
            walkingRouteUiState = walkingRouteUiState2;
            c cVar2 = (c) j741Var;
            cVar2.c.setShadows((List) k);
            cVar2.d(walkingRouteUiState);
            a.b(this.this$0);
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
