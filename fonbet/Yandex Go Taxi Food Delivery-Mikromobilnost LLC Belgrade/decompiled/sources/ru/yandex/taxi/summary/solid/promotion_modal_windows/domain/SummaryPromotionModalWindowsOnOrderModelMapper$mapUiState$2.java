package ru.yandex.taxi.summary.solid.promotion_modal_windows.domain;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bvf0;
import defpackage.cmv0;
import defpackage.flv0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wlv0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.summary.promotions.models.TextAlign;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lwlv0;", "<anonymous>", "(Ltse;)Lwlv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.promotion_modal_windows.domain.SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2", f = "SummaryPromotionModalWindowsOnOrderModelMapper.kt", l = {48, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 52, 53, 54, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ flv0 $modalView;
    private /* synthetic */ Object L$0;
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
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/BitmapDrawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/BitmapDrawable;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.summary.solid.promotion_modal_windows.domain.SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2$1", f = "SummaryPromotionModalWindowsOnOrderModelMapper.kt", l = {44}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.summary.solid.promotion_modal_windows.domain.SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ flv0 $modalView;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(flv0 flv0Var, Continuation continuation, a aVar) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$modalView = flv0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$modalView, continuation, this.this$0);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            e eVar = this.this$0.c;
            String str = this.$modalView.e;
            this.label = 1;
            Object k = e.k(eVar, str, null, this, 14);
            return k == coroutineSingletons ? coroutineSingletons : k;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/BitmapDrawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/BitmapDrawable;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.summary.solid.promotion_modal_windows.domain.SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2$2", f = "SummaryPromotionModalWindowsOnOrderModelMapper.kt", l = {46}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.summary.solid.promotion_modal_windows.domain.SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ flv0 $modalView;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(flv0 flv0Var, Continuation continuation, a aVar) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$modalView = flv0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$modalView, continuation, this.this$0);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            e eVar = this.this$0.c;
            String str = this.$modalView.f;
            this.label = 1;
            Object k = e.k(eVar, str, null, this, 14);
            return k == coroutineSingletons ? coroutineSingletons : k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2(flv0 flv0Var, Continuation continuation, a aVar) {
        super(2, continuation);
        this.$modalView = flv0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2 summaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2 = new SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2(this.$modalView, continuation, this.this$0);
        summaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2.L$0 = obj;
        return summaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x021c, code lost:
    
        if (r14 == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c1, code lost:
    
        if (r14 == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0193, code lost:
    
        if (r14 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x028a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        noh h3;
        Pair pair;
        noh nohVar;
        noh nohVar2;
        noh nohVar3;
        List list;
        noh nohVar4;
        noh nohVar5;
        noh nohVar6;
        noh nohVar7;
        String str;
        List list2;
        String str2;
        Drawable drawable;
        List list3;
        String str3;
        Drawable drawable2;
        Drawable drawable3;
        List list4;
        noh nohVar8;
        noh nohVar9;
        noh nohVar10;
        CharSequence charSequence;
        noh nohVar11;
        List list5;
        String str4;
        Drawable drawable4;
        Drawable drawable5;
        Object k;
        Drawable drawable6;
        Drawable drawable7;
        String str5;
        List list6;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TextAlign textAlign;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                b.b(obj);
                h = tje.h(tseVar, null, null, new SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2$title$1(this.$modalView, null, this.this$0), 3);
                h2 = tje.h(tseVar, null, null, new SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2$text$1(this.$modalView, null, this.this$0), 3);
                h3 = tje.h(tseVar, null, null, new SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2$footer$1(this.$modalView, null, this.this$0), 3);
                String str6 = this.$modalView.e;
                if (str6 == null || str6.length() == 0) {
                    pair = new Pair(null, tje.h(tseVar, null, null, new AnonymousClass2(this.$modalView, null, this.this$0), 3));
                } else {
                    pair = new Pair(tje.h(tseVar, null, null, new AnonymousClass1(this.$modalView, null, this.this$0), 3), null);
                }
                nohVar = (noh) pair.getFirst();
                nohVar2 = (noh) pair.getSecond();
                List list7 = this.$modalView.h;
                if (list7 != null) {
                    a aVar = this.this$0;
                    this.L$0 = null;
                    this.L$1 = h;
                    this.L$2 = h2;
                    this.L$3 = h3;
                    this.L$4 = nohVar;
                    this.L$5 = nohVar2;
                    this.L$6 = null;
                    this.label = 1;
                    aVar.getClass();
                    obj = bvf0.n(new SummaryPromotionModalWindowsOnOrderModelMapper$mapBulletSlots$2(list7, aVar, null), this);
                    break;
                } else {
                    nohVar3 = nohVar;
                    list = null;
                    nohVar4 = h;
                    nohVar5 = h2;
                    nohVar6 = h3;
                    nohVar7 = nohVar2;
                    str = this.$modalView.a;
                    if (nohVar3 == null) {
                        this.L$0 = null;
                        this.L$1 = nohVar4;
                        this.L$2 = nohVar5;
                        this.L$3 = nohVar6;
                        this.L$4 = null;
                        this.L$5 = nohVar7;
                        this.L$6 = list;
                        this.L$7 = str;
                        this.label = 2;
                        obj = nohVar3.k(this);
                        break;
                    } else {
                        list2 = list;
                        str2 = str;
                        drawable = null;
                        if (nohVar7 == null) {
                            this.L$0 = null;
                            this.L$1 = nohVar4;
                            this.L$2 = nohVar5;
                            this.L$3 = nohVar6;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = list2;
                            this.L$7 = str2;
                            this.L$8 = drawable;
                            this.label = 3;
                            Object k2 = nohVar7.k(this);
                            if (k2 != coroutineSingletons) {
                                list4 = list2;
                                obj = k2;
                                nohVar8 = nohVar6;
                                nohVar9 = nohVar5;
                                nohVar10 = nohVar4;
                                nohVar4 = nohVar10;
                                nohVar5 = nohVar9;
                                nohVar6 = nohVar8;
                                list3 = list4;
                                str3 = str2;
                                drawable2 = drawable;
                                drawable3 = (BitmapDrawable) obj;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = nohVar5;
                                this.L$3 = nohVar6;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = list3;
                                this.L$7 = str3;
                                this.L$8 = drawable2;
                                this.L$9 = drawable3;
                                this.label = 4;
                                obj = nohVar4.k(this);
                                break;
                            }
                            return coroutineSingletons;
                        }
                        list3 = list2;
                        str3 = str2;
                        drawable2 = drawable;
                        drawable3 = null;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = nohVar5;
                        this.L$3 = nohVar6;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = list3;
                        this.L$7 = str3;
                        this.L$8 = drawable2;
                        this.L$9 = drawable3;
                        this.label = 4;
                        obj = nohVar4.k(this);
                    }
                }
                break;
            case 1:
                nohVar2 = (noh) this.L$5;
                nohVar = (noh) this.L$4;
                h3 = (noh) this.L$3;
                h2 = (noh) this.L$2;
                h = (noh) this.L$1;
                b.b(obj);
                noh nohVar12 = nohVar;
                list = (List) obj;
                nohVar3 = nohVar12;
                nohVar4 = h;
                nohVar5 = h2;
                nohVar6 = h3;
                nohVar7 = nohVar2;
                str = this.$modalView.a;
                if (nohVar3 == null) {
                }
                break;
            case 2:
                str = (String) this.L$7;
                list = (List) this.L$6;
                nohVar7 = (noh) this.L$5;
                nohVar6 = (noh) this.L$3;
                nohVar5 = (noh) this.L$2;
                nohVar4 = (noh) this.L$1;
                b.b(obj);
                String str7 = str;
                drawable = (BitmapDrawable) obj;
                list2 = list;
                str2 = str7;
                if (nohVar7 == null) {
                }
                break;
            case 3:
                drawable = (Drawable) this.L$8;
                str2 = (String) this.L$7;
                list4 = (List) this.L$6;
                nohVar8 = (noh) this.L$3;
                nohVar9 = (noh) this.L$2;
                nohVar10 = (noh) this.L$1;
                b.b(obj);
                nohVar4 = nohVar10;
                nohVar5 = nohVar9;
                nohVar6 = nohVar8;
                list3 = list4;
                str3 = str2;
                drawable2 = drawable;
                drawable3 = (BitmapDrawable) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = nohVar5;
                this.L$3 = nohVar6;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = list3;
                this.L$7 = str3;
                this.L$8 = drawable2;
                this.L$9 = drawable3;
                this.label = 4;
                obj = nohVar4.k(this);
                break;
            case 4:
                drawable3 = (Drawable) this.L$9;
                drawable2 = (Drawable) this.L$8;
                str3 = (String) this.L$7;
                list3 = (List) this.L$6;
                nohVar6 = (noh) this.L$3;
                nohVar5 = (noh) this.L$2;
                b.b(obj);
                CharSequence charSequence4 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar6;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = list3;
                this.L$7 = str3;
                this.L$8 = drawable2;
                this.L$9 = drawable3;
                this.L$10 = charSequence4;
                this.label = 5;
                Object k3 = nohVar5.k(this);
                if (k3 != coroutineSingletons) {
                    Drawable drawable8 = drawable3;
                    charSequence = charSequence4;
                    obj = k3;
                    nohVar11 = nohVar6;
                    list5 = list3;
                    str4 = str3;
                    drawable4 = drawable2;
                    drawable5 = drawable8;
                    CharSequence charSequence5 = (CharSequence) obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = list5;
                    this.L$7 = str4;
                    this.L$8 = drawable4;
                    this.L$9 = drawable5;
                    this.L$10 = charSequence;
                    this.L$11 = charSequence5;
                    this.label = 6;
                    k = nohVar11.k(this);
                    if (k != coroutineSingletons) {
                        Drawable drawable9 = drawable4;
                        drawable6 = drawable5;
                        drawable7 = drawable9;
                        str5 = str4;
                        list6 = list5;
                        charSequence2 = charSequence5;
                        obj = k;
                        charSequence3 = charSequence;
                        CharSequence charSequence6 = (CharSequence) obj;
                        flv0 flv0Var = this.$modalView;
                        cmv0 cmv0Var = flv0Var.g;
                        TextAlign textAlign2 = flv0Var.b.b;
                        TextAlign textAlign3 = flv0Var.c.b;
                        textAlign = flv0Var.d.b;
                        if (textAlign == null) {
                            textAlign = TextAlign.CENTER;
                        }
                        return new wlv0(str5, drawable7, drawable6, charSequence3, charSequence2, charSequence6, cmv0Var, list6, textAlign2, textAlign3, textAlign);
                    }
                }
                return coroutineSingletons;
            case 5:
                charSequence = (CharSequence) this.L$10;
                drawable5 = (Drawable) this.L$9;
                drawable4 = (Drawable) this.L$8;
                str4 = (String) this.L$7;
                list5 = (List) this.L$6;
                nohVar11 = (noh) this.L$3;
                b.b(obj);
                CharSequence charSequence52 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = list5;
                this.L$7 = str4;
                this.L$8 = drawable4;
                this.L$9 = drawable5;
                this.L$10 = charSequence;
                this.L$11 = charSequence52;
                this.label = 6;
                k = nohVar11.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                CharSequence charSequence7 = (CharSequence) this.L$11;
                CharSequence charSequence8 = (CharSequence) this.L$10;
                Drawable drawable10 = (Drawable) this.L$9;
                Drawable drawable11 = (Drawable) this.L$8;
                String str8 = (String) this.L$7;
                List list8 = (List) this.L$6;
                b.b(obj);
                charSequence3 = charSequence8;
                str5 = str8;
                drawable6 = drawable10;
                drawable7 = drawable11;
                list6 = list8;
                charSequence2 = charSequence7;
                CharSequence charSequence62 = (CharSequence) obj;
                flv0 flv0Var2 = this.$modalView;
                cmv0 cmv0Var2 = flv0Var2.g;
                TextAlign textAlign22 = flv0Var2.b.b;
                TextAlign textAlign32 = flv0Var2.c.b;
                textAlign = flv0Var2.d.b;
                if (textAlign == null) {
                }
                return new wlv0(str5, drawable7, drawable6, charSequence3, charSequence2, charSequence62, cmv0Var2, list6, textAlign22, textAlign32, textAlign);
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
