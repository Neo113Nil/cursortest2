package ru.yandex.taxi.surge.mapper;

import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.bdc;
import defpackage.bqw0;
import defpackage.btw0;
import defpackage.how0;
import defpackage.htw0;
import defpackage.jqw0;
import defpackage.ktw0;
import defpackage.mvg;
import defpackage.my6;
import defpackage.noh;
import defpackage.ny61;
import defpackage.q3q0;
import defpackage.q47;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.ui.ButtonOrientation;
import ru.yandex.taxi.common_models.ui.TextStyle;
import ru.yandex.taxi.surge.models.dto.SurgeButtonActionDto$ActionButtonStyle;
import ru.yandex.taxi.surge.models.dto.SurgeInfoItem$ActionButtonsContent;
import ru.yandex.taxi.surge.models.dto.h0;
import ru.yandex.taxi.surge.models.dto.s0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lhtw0;", "<anonymous>", "(Ltse;)Lhtw0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.mapper.SurgeInfoStateMapper$mapItems$2", f = "SurgeInfoStateMapper.kt", l = {152, BlendingGradientView.BASE_ALPHA, 154, HProv.PP_LICENSE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateMapper$mapItems$2 extends SuspendLambda implements wls {
    final /* synthetic */ btw0 $response;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateMapper$mapItems$2(btw0 btw0Var, Continuation continuation, a aVar) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$response = btw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SurgeInfoStateMapper$mapItems$2 surgeInfoStateMapper$mapItems$2 = new SurgeInfoStateMapper$mapItems$2(this.$response, continuation, this.this$0);
        surgeInfoStateMapper$mapItems$2.L$0 = obj;
        return surgeInfoStateMapper$mapItems$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateMapper$mapItems$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x011e, code lost:
    
        if (r3 != r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00bc, code lost:
    
        if (r9 == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        Object s;
        List list;
        Object k;
        noh nohVar;
        int i;
        Object obj2;
        List list2;
        Object k2;
        Object obj3;
        noh nohVar2;
        List list3;
        Object k3;
        ButtonOrientation buttonOrientation;
        SurgeInfoItem$ActionButtonsContent surgeInfoItem$ActionButtonsContent;
        my6 my6Var;
        SurgeInfoItem$ActionButtonsContent surgeInfoItem$ActionButtonsContent2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        q47 q47Var = null;
        if (i2 == 0) {
            b.b(obj);
            h = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapItems$2$header$1(this.$response, null, this.this$0), 3);
            qoh h3 = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapItems$2$mainSection$1(this.$response, null, this.this$0), 3);
            h2 = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapItems$2$bottomSection$1(this.$response, null, this.this$0), 3);
            this.L$0 = null;
            this.L$1 = h;
            this.L$2 = null;
            this.L$3 = h2;
            this.label = 1;
            s = h3.s(this);
        } else if (i2 == 1) {
            h2 = (noh) this.L$3;
            h = (noh) this.L$1;
            b.b(obj);
            s = obj;
        } else {
            if (i2 == 2) {
                i = this.I$0;
                List list4 = (List) this.L$6;
                list2 = (List) this.L$5;
                Object obj4 = this.L$4;
                noh nohVar3 = (noh) this.L$3;
                b.b(obj);
                nohVar = nohVar3;
                obj2 = obj4;
                list = list4;
                k = obj;
                list.add(i, k);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar;
                this.L$4 = obj2;
                this.L$5 = list2;
                this.L$6 = null;
                this.label = 3;
                k2 = nohVar.k(this);
                if (k2 != coroutineSingletons) {
                    obj3 = obj2;
                    nohVar2 = nohVar;
                    if (!((Collection) k2).isEmpty()) {
                    }
                    list3 = (List) obj3;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = list3;
                    this.L$5 = null;
                    this.label = 4;
                    k3 = nohVar2.k(this);
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list3 = (List) this.L$4;
                b.b(obj);
                k3 = obj;
                List list5 = (List) k3;
                a aVar = this.this$0;
                jqw0 jqw0Var = this.$response.b;
                String str = jqw0Var.c.a;
                bqw0 bqw0Var = jqw0Var.g;
                aVar.getClass();
                List list6 = bqw0Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list6) {
                    if (obj5 instanceof s0) {
                        arrayList.add(obj5);
                    }
                }
                s0 s0Var = (s0) kotlin.collections.a.R(arrayList);
                List<SurgeInfoItem$ActionButtonsContent.a> list7 = (s0Var == null || (surgeInfoItem$ActionButtonsContent2 = s0Var.a) == null) ? null : surgeInfoItem$ActionButtonsContent2.b;
                if (list7 == null) {
                    list7 = EmptyList.a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (SurgeInfoItem$ActionButtonsContent.a aVar2 : list7) {
                    SurgeButtonActionDto$ActionButtonStyle surgeButtonActionDto$ActionButtonStyle = aVar2.b;
                    h0 h0Var = aVar2.c;
                    int i3 = ktw0.e[surgeButtonActionDto$ActionButtonStyle.ordinal()];
                    if (i3 == 1) {
                        my6Var = new my6(aVar2.a, new bdc(xng0.textOnControl), new bdc(xng0.controlMain), TextStyle.ACCENT, aVar.n(h0Var), null, null, false, false, 16292);
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        my6Var = new my6(aVar2.a, new bdc(xng0.textOnControlMinor), new bdc(xng0.controlMinor), TextStyle.DEFAULT, aVar.n(h0Var), null, null, false, false, 16292);
                    }
                    arrayList2.add(my6Var);
                }
                arrayList2.add(new my6(str, new bdc(xng0.textOnControl), new bdc(xng0.controlMain), TextStyle.ACCENT, how0.b, null, null, false, false, 16292));
                if (!arrayList2.isEmpty()) {
                    SurgeInfoItem$ActionButtonsContent.ButtonsOrientation buttonsOrientation = (s0Var == null || (surgeInfoItem$ActionButtonsContent = s0Var.a) == null) ? null : surgeInfoItem$ActionButtonsContent.a;
                    int i4 = buttonsOrientation == null ? -1 : ktw0.f[buttonsOrientation.ordinal()];
                    if (i4 == -1) {
                        buttonOrientation = ButtonOrientation.VERTICAL;
                    } else if (i4 == 1) {
                        buttonOrientation = ButtonOrientation.VERTICAL;
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        buttonOrientation = ButtonOrientation.HORIZONTAL;
                    }
                    q47Var = new q47(buttonOrientation, arrayList2);
                }
                return new htw0(list3, list5, q47Var);
            }
            List list8 = (List) this.L$5;
            obj3 = this.L$4;
            nohVar2 = (noh) this.L$3;
            b.b(obj);
            list2 = list8;
            k2 = obj;
            if (!((Collection) k2).isEmpty()) {
                list2.add(q3q0.a);
            }
            list3 = (List) obj3;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = list3;
            this.L$5 = null;
            this.label = 4;
            k3 = nohVar2.k(this);
        }
        list = (List) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h2;
        this.L$4 = s;
        this.L$5 = list;
        this.L$6 = list;
        this.I$0 = 0;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            nohVar = h2;
            i = 0;
            obj2 = s;
            list2 = list;
            list.add(i, k);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = nohVar;
            this.L$4 = obj2;
            this.L$5 = list2;
            this.L$6 = null;
            this.label = 3;
            k2 = nohVar.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
