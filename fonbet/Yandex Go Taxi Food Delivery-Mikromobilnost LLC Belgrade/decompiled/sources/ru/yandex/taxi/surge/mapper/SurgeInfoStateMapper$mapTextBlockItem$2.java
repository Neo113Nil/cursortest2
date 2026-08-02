package ru.yandex.taxi.surge.mapper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import defpackage.jky0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ktw0;
import defpackage.lky0;
import defpackage.mrg0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pky0;
import defpackage.ptw0;
import defpackage.qoh;
import defpackage.rtw0;
import defpackage.stw0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vtw0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.surge.models.dto.SurgeInfoTextBlockIconType;
import ru.yandex.taxi.surge.models.dto.TextBlockSize;
import ru.yandex.taxi.surge.models.dto.h1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llky0;", "<anonymous>", "(Ltse;)Llky0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.mapper.SurgeInfoStateMapper$mapTextBlockItem$2", f = "SurgeInfoStateMapper.kt", l = {HProv.ALG_SID_SHA_224, 287, 288, 290}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateMapper$mapTextBlockItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ h1 $item;
    final /* synthetic */ boolean $lastSectionItem;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateMapper$mapTextBlockItem$2(h1 h1Var, boolean z, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$item = h1Var;
        this.$lastSectionItem = z;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SurgeInfoStateMapper$mapTextBlockItem$2 surgeInfoStateMapper$mapTextBlockItem$2 = new SurgeInfoStateMapper$mapTextBlockItem$2(this.$item, this.$lastSectionItem, this.this$0, continuation);
        surgeInfoStateMapper$mapTextBlockItem$2.L$0 = obj;
        return surgeInfoStateMapper$mapTextBlockItem$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateMapper$mapTextBlockItem$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0136, code lost:
    
        if (r11 != r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ed, code lost:
    
        if (r3 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        noh h3;
        Object s;
        Drawable drawable;
        Object k;
        noh nohVar;
        int i;
        CharSequence charSequence;
        Object k2;
        Object k3;
        int i2;
        Drawable drawable2;
        CharSequence charSequence2;
        int i3;
        int i4;
        int r;
        int i5;
        int i6;
        int i7;
        stw0 stw0Var;
        int u;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.label;
        jky0 jky0Var = null;
        if (i8 == 0) {
            b.b(obj);
            qoh h4 = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapTextBlockItem$2$icon$1(this.this$0, this.$item, null), 3);
            h = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapTextBlockItem$2$title$1(this.this$0, this.$item, null), 3);
            h2 = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapTextBlockItem$2$subtitle$1(this.this$0, this.$item, null), 3);
            h3 = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapTextBlockItem$2$trail$1(this.this$0, this.$item, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h2;
            this.L$4 = h3;
            this.label = 1;
            s = h4.s(this);
        } else if (i8 == 1) {
            h3 = (noh) this.L$4;
            noh nohVar2 = (noh) this.L$3;
            h = (noh) this.L$2;
            b.b(obj);
            h2 = nohVar2;
            s = obj;
        } else {
            if (i8 != 2) {
                if (i8 == 3) {
                    i = this.I$0;
                    CharSequence charSequence3 = (CharSequence) this.L$6;
                    Drawable drawable3 = (Drawable) this.L$5;
                    noh nohVar3 = (noh) this.L$4;
                    b.b(obj);
                    charSequence = charSequence3;
                    drawable = drawable3;
                    nohVar = nohVar3;
                    k2 = obj;
                    CharSequence charSequence4 = (CharSequence) k2;
                    int i9 = (this.$lastSectionItem || this.$item.a.f) ? 0 : 1;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = drawable;
                    this.L$6 = charSequence;
                    this.L$7 = charSequence4;
                    this.I$0 = i;
                    this.I$1 = i9;
                    this.label = 4;
                    k3 = nohVar.k(this);
                    if (k3 != coroutineSingletons) {
                        i2 = i;
                        drawable2 = drawable;
                        charSequence2 = charSequence4;
                        i3 = i9;
                        CharSequence charSequence5 = charSequence;
                        pky0 pky0Var = (pky0) k3;
                        a aVar = this.this$0;
                        TextBlockSize textBlockSize = this.$item.a.d;
                        Context context = aVar.a;
                        int[] iArr = ktw0.a;
                        i4 = iArr[textBlockSize.ordinal()];
                        if (i4 != 1) {
                        }
                        i5 = r;
                        a aVar2 = this.this$0;
                        TextBlockSize textBlockSize2 = this.$item.a.d;
                        Context context2 = aVar2.a;
                        i6 = iArr[textBlockSize2.ordinal()];
                        if (i6 != 1) {
                        }
                        i7 = 0;
                        a aVar3 = this.this$0;
                        stw0Var = this.$item.a.g;
                        aVar3.getClass();
                        if (!(stw0Var instanceof ptw0)) {
                        }
                        jky0 jky0Var2 = jky0Var;
                        vtw0 vtw0Var = this.$item.a;
                        return new lky0(drawable2, i2 == 0, charSequence5, charSequence2, i3 == 0, pky0Var, i5, i7, jky0Var2, vtw0Var.h, null, false, false, false, false, vtw0Var.i);
                    }
                    return coroutineSingletons;
                }
                if (i8 != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = this.I$1;
                i2 = this.I$0;
                CharSequence charSequence6 = (CharSequence) this.L$7;
                charSequence = (CharSequence) this.L$6;
                Drawable drawable4 = (Drawable) this.L$5;
                b.b(obj);
                k3 = obj;
                charSequence2 = charSequence6;
                drawable2 = drawable4;
                CharSequence charSequence52 = charSequence;
                pky0 pky0Var2 = (pky0) k3;
                a aVar4 = this.this$0;
                TextBlockSize textBlockSize3 = this.$item.a.d;
                Context context3 = aVar4.a;
                int[] iArr2 = ktw0.a;
                i4 = iArr2[textBlockSize3.ordinal()];
                if (i4 != 1) {
                    r = tje.r(mrg0.list_item_component_size_XS, context3);
                } else if (i4 == 2) {
                    r = tje.r(mrg0.list_item_component_size_S, context3);
                } else if (i4 == 3) {
                    r = tje.r(mrg0.list_item_component_size_M, context3);
                } else {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            w511.b();
                            return null;
                        }
                        jst.e.c("Unknown size for textblock");
                        i5 = 0;
                        a aVar22 = this.this$0;
                        TextBlockSize textBlockSize22 = this.$item.a.d;
                        Context context22 = aVar22.a;
                        i6 = iArr2[textBlockSize22.ordinal()];
                        if (i6 != 1) {
                            if (i6 == 2) {
                                u = tje.u(4, context22);
                            } else if (i6 == 3) {
                                u = tje.u(8, context22);
                            } else if (i6 == 4) {
                                u = tje.u(12, context22);
                            } else {
                                if (i6 != 5) {
                                    w511.b();
                                    return null;
                                }
                                jst.e.c("Unknown size for textblock");
                            }
                            i7 = u;
                            a aVar32 = this.this$0;
                            stw0Var = this.$item.a.g;
                            aVar32.getClass();
                            if (!(stw0Var instanceof ptw0)) {
                                jky0Var = new jky0(((ptw0) stw0Var).a);
                            } else if (!jl40.l(stw0Var, rtw0.INSTANCE) && stw0Var != null) {
                                w511.b();
                                return null;
                            }
                            jky0 jky0Var22 = jky0Var;
                            vtw0 vtw0Var2 = this.$item.a;
                            return new lky0(drawable2, i2 == 0, charSequence52, charSequence2, i3 == 0, pky0Var2, i5, i7, jky0Var22, vtw0Var2.h, null, false, false, false, false, vtw0Var2.i);
                        }
                        i7 = 0;
                        a aVar322 = this.this$0;
                        stw0Var = this.$item.a.g;
                        aVar322.getClass();
                        if (!(stw0Var instanceof ptw0)) {
                        }
                        jky0 jky0Var222 = jky0Var;
                        vtw0 vtw0Var22 = this.$item.a;
                        return new lky0(drawable2, i2 == 0, charSequence52, charSequence2, i3 == 0, pky0Var2, i5, i7, jky0Var222, vtw0Var22.h, null, false, false, false, false, vtw0Var22.i);
                    }
                    r = tje.r(mrg0.list_item_component_size_L, context3);
                }
                i5 = r;
                a aVar222 = this.this$0;
                TextBlockSize textBlockSize222 = this.$item.a.d;
                Context context222 = aVar222.a;
                i6 = iArr2[textBlockSize222.ordinal()];
                if (i6 != 1) {
                }
                i7 = 0;
                a aVar3222 = this.this$0;
                stw0Var = this.$item.a.g;
                aVar3222.getClass();
                if (!(stw0Var instanceof ptw0)) {
                }
                jky0 jky0Var2222 = jky0Var;
                vtw0 vtw0Var222 = this.$item.a;
                return new lky0(drawable2, i2 == 0, charSequence52, charSequence2, i3 == 0, pky0Var2, i5, i7, jky0Var2222, vtw0Var222.h, null, false, false, false, false, vtw0Var222.i);
            }
            i = this.I$0;
            drawable = (Drawable) this.L$5;
            noh nohVar4 = (noh) this.L$4;
            h2 = (noh) this.L$3;
            b.b(obj);
            nohVar = nohVar4;
            k = obj;
            charSequence = (CharSequence) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = nohVar;
            this.L$5 = drawable;
            this.L$6 = charSequence;
            this.I$0 = i;
            this.label = 3;
            k2 = h2.k(this);
        }
        drawable = (Drawable) s;
        int i10 = this.$item.a.a.b == SurgeInfoTextBlockIconType.ROTATE ? 1 : 0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h2;
        this.L$4 = h3;
        this.L$5 = drawable;
        this.I$0 = i10;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            int i11 = i10;
            nohVar = h3;
            i = i11;
            charSequence = (CharSequence) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = nohVar;
            this.L$5 = drawable;
            this.L$6 = charSequence;
            this.I$0 = i;
            this.label = 3;
            k2 = h2.k(this);
        }
        return coroutineSingletons;
    }
}
