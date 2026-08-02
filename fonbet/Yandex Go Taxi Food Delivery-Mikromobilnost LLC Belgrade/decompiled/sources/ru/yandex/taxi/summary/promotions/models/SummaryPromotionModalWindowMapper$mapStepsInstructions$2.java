package ru.yandex.taxi.summary.promotions.models;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.ebu0;
import defpackage.fbu0;
import defpackage.gau0;
import defpackage.gbu0;
import defpackage.glv0;
import defpackage.hbu0;
import defpackage.hlv0;
import defpackage.jbu0;
import defpackage.lau0;
import defpackage.mau0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qos0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.ui70;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lhlv0;", "<anonymous>", "(Ltse;)Lhlv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.promotions.models.SummaryPromotionModalWindowMapper$mapStepsInstructions$2", f = "SummaryPromotionModalWindowMapper.kt", l = {52, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 56}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionModalWindowMapper$mapStepsInstructions$2 extends SuspendLambda implements wls {
    final /* synthetic */ y0 $item;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionModalWindowMapper$mapStepsInstructions$2(y0 y0Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$item = y0Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryPromotionModalWindowMapper$mapStepsInstructions$2(this.$item, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryPromotionModalWindowMapper$mapStepsInstructions$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0149, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009d, code lost:
    
        if (r2 == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0135  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x011c -> B:7:0x0121). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0129 -> B:8:0x012e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object i;
        CharSequence charSequence;
        b bVar;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        b bVar2;
        Object obj2;
        Iterator it2;
        gau0 gau0Var;
        ArrayList arrayList3;
        CharSequence charSequence2;
        Collection collection;
        FormattedText formattedText;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 30;
        glv0 glv0Var = null;
        if (i2 == 0) {
            kotlin.b.b(obj);
            y0 y0Var = this.$item;
            str = y0Var.a;
            ru.yandex.taxi.widget.c cVar = this.this$0.b;
            FormattedText formattedText2 = y0Var.b;
            this.L$0 = str;
            this.label = 1;
            i = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, this, 30);
        } else if (i2 == 1) {
            String str2 = (String) this.L$0;
            kotlin.b.b(obj);
            str = str2;
            i = obj;
        } else if (i2 == 2) {
            collection = (Collection) this.L$9;
            charSequence2 = (CharSequence) this.L$8;
            str = (String) this.L$7;
            gau0 gau0Var2 = (gau0) this.L$6;
            Iterator it3 = (Iterator) this.L$4;
            ?? r11 = (Collection) this.L$3;
            b bVar3 = (b) this.L$1;
            kotlin.b.b(obj);
            gau0Var = gau0Var2;
            arrayList3 = r11;
            it2 = it3;
            bVar2 = bVar3;
            obj2 = obj;
            CharSequence charSequence3 = (CharSequence) obj2;
            formattedText = gau0Var.c;
            if (formattedText == null) {
            }
        } else {
            if (i2 != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            collection = (Collection) this.L$11;
            charSequence2 = (CharSequence) this.L$10;
            str = (String) this.L$9;
            CharSequence charSequence4 = (CharSequence) this.L$7;
            gau0Var = (gau0) this.L$6;
            it2 = (Iterator) this.L$4;
            ?? r12 = (Collection) this.L$3;
            bVar2 = (b) this.L$1;
            kotlin.b.b(obj);
            Object i4 = obj;
            ArrayList arrayList4 = r12;
            CharSequence charSequence5 = (CharSequence) i4;
            b bVar4 = bVar2;
            CharSequence charSequence6 = charSequence4;
            bVar = bVar4;
            ArrayList arrayList5 = arrayList4;
            lau0 lau0Var = gau0Var.d;
            collection.add(new mau0(charSequence6, charSequence5, lau0Var != null ? lau0Var.a : null, gau0Var.a));
            charSequence = charSequence2;
            it = it2;
            arrayList = arrayList5;
            i3 = 30;
            if (!it.hasNext()) {
                gau0 gau0Var3 = (gau0) it.next();
                ru.yandex.taxi.widget.c cVar2 = bVar.b;
                FormattedText formattedText3 = gau0Var3.b;
                this.L$0 = null;
                this.L$1 = bVar;
                this.L$2 = null;
                this.L$3 = arrayList;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = gau0Var3;
                this.L$7 = str;
                this.L$8 = charSequence;
                this.L$9 = arrayList;
                this.L$10 = null;
                this.L$11 = null;
                this.label = 2;
                obj2 = ru.yandex.taxi.widget.c.i(cVar2, formattedText3, null, this, i3);
                if (obj2 != coroutineSingletons) {
                    bVar2 = bVar;
                    arrayList3 = arrayList;
                    gau0Var = gau0Var3;
                    it2 = it;
                    charSequence2 = charSequence;
                    collection = arrayList3;
                    CharSequence charSequence32 = (CharSequence) obj2;
                    formattedText = gau0Var.c;
                    if (formattedText == null) {
                        ru.yandex.taxi.widget.c cVar3 = bVar2.b;
                        this.L$0 = null;
                        this.L$1 = bVar2;
                        this.L$2 = null;
                        this.L$3 = arrayList3;
                        this.L$4 = it2;
                        this.L$5 = null;
                        this.L$6 = gau0Var;
                        this.L$7 = charSequence32;
                        this.L$8 = null;
                        this.L$9 = str;
                        this.L$10 = charSequence2;
                        this.L$11 = collection;
                        this.label = 3;
                        i4 = ru.yandex.taxi.widget.c.i(cVar3, formattedText, null, this, i3);
                        if (i4 != coroutineSingletons) {
                            arrayList4 = arrayList3;
                            charSequence4 = charSequence32;
                            CharSequence charSequence52 = (CharSequence) i4;
                            b bVar42 = bVar2;
                            CharSequence charSequence62 = charSequence4;
                            bVar = bVar42;
                            ArrayList arrayList52 = arrayList4;
                            lau0 lau0Var2 = gau0Var.d;
                            collection.add(new mau0(charSequence62, charSequence52, lau0Var2 != null ? lau0Var2.a : null, gau0Var.a));
                            charSequence = charSequence2;
                            it = it2;
                            arrayList = arrayList52;
                            i3 = 30;
                            if (!it.hasNext()) {
                                arrayList2 = arrayList;
                            }
                        }
                    } else {
                        arrayList52 = arrayList3;
                        bVar = bVar2;
                        charSequence62 = charSequence32;
                        charSequence52 = null;
                        lau0 lau0Var22 = gau0Var.d;
                        collection.add(new mau0(charSequence62, charSequence52, lau0Var22 != null ? lau0Var22.a : null, gau0Var.a));
                        charSequence = charSequence2;
                        it = it2;
                        arrayList = arrayList52;
                        i3 = 30;
                        if (!it.hasNext()) {
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        charSequence = (CharSequence) i;
        List list = this.$item.g;
        if (list != null) {
            List list2 = list;
            bVar = this.this$0;
            arrayList = new ArrayList(tcc.n(list2, 10));
            it = list2.iterator();
            if (!it.hasNext()) {
            }
        }
        arrayList2 = EmptyList.a;
        b bVar5 = this.this$0;
        SummaryPromotionsResponse.f fVar = this.$item.e;
        bVar5.getClass();
        qos0 qos0Var = fVar.b;
        List list3 = fVar.a;
        List list4 = fVar.c;
        jbu0 jbu0Var = new jbu0(charSequence, arrayList2, list4 != null ? new hbu0(list4) : qos0Var != null ? new gbu0(qos0Var) : !list3.isEmpty() ? new ebu0(list3) : fbu0.a);
        ui70 ui70Var = this.$item.f;
        if (ui70Var != null) {
            this.this$0.getClass();
            if (ui70Var.getA().length() != 0) {
                glv0Var = new glv0(ui70Var.getA(), ui70Var.getB());
            }
        }
        return new hlv0(str, jbu0Var, glv0Var);
    }
}
