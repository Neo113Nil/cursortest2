package ru.yandex.taxi.surge.mapper;

import android.graphics.drawable.BitmapDrawable;
import defpackage.aru;
import defpackage.bru;
import defpackage.bvf0;
import defpackage.cru;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.tvw0;
import defpackage.tzr0;
import defpackage.uvw0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ldru;", "<anonymous>", "(Ltse;)Ldru;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.mapper.SurgeInfoStateMapper$mapShortcutItems$2$1$1", f = "SurgeInfoStateMapper.kt", l = {485, 488, 490}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateMapper$mapShortcutItems$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isWide;
    final /* synthetic */ tzr0 $item;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateMapper$mapShortcutItems$2$1$1(a aVar, tzr0 tzr0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = tzr0Var;
        this.$isWide = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgeInfoStateMapper$mapShortcutItems$2$1$1(this.this$0, this.$item, this.$isWide, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateMapper$mapShortcutItems$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0052, code lost:
    
        if (r14 == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        aru aruVar;
        CharSequence charSequence;
        BitmapDrawable bitmapDrawable;
        String str;
        tvw0 tvw0Var;
        BitmapDrawable bitmapDrawable2;
        CharSequence charSequence2;
        BitmapDrawable bitmapDrawable3;
        CharSequence charSequence3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        uvw0 uvw0Var = null;
        if (i == 0) {
            b.b(obj);
            e eVar = this.this$0.b;
            FormattedText formattedText = this.$item.b.a;
            this.label = 1;
            obj = eVar.t(formattedText, this);
        } else if (i == 1) {
            b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bitmapDrawable3 = (BitmapDrawable) this.L$2;
                aruVar = (aru) this.L$1;
                charSequence3 = (CharSequence) this.L$0;
                b.b(obj);
                uvw0Var = (uvw0) obj;
                bitmapDrawable2 = bitmapDrawable3;
                charSequence2 = charSequence3;
                aru aruVar2 = aruVar;
                uvw0 uvw0Var2 = uvw0Var;
                boolean z = this.$isWide;
                tzr0 tzr0Var = this.$item;
                return z ? new cru(tzr0Var.a, charSequence2, aruVar2, bitmapDrawable2, uvw0Var2) : new bru(tzr0Var.a, charSequence2, aruVar2, bitmapDrawable2, uvw0Var2);
            }
            aruVar = (aru) this.L$1;
            charSequence = (CharSequence) this.L$0;
            b.b(obj);
            bitmapDrawable = (BitmapDrawable) obj;
            tzr0 tzr0Var2 = this.$item;
            tvw0Var = tzr0Var2.e;
            if (tvw0Var != null) {
                a aVar = this.this$0;
                String str2 = tzr0Var2.a;
                this.L$0 = charSequence;
                this.L$1 = aruVar;
                this.L$2 = bitmapDrawable;
                this.L$3 = null;
                this.label = 3;
                aVar.getClass();
                Object n = bvf0.n(new SurgeInfoStateMapper$mapShortcutItemModal$2(tvw0Var, str2, aVar, null), this);
                if (n != coroutineSingletons) {
                    bitmapDrawable3 = bitmapDrawable;
                    obj = n;
                    charSequence3 = charSequence;
                    uvw0Var = (uvw0) obj;
                    bitmapDrawable2 = bitmapDrawable3;
                    charSequence2 = charSequence3;
                    aru aruVar22 = aruVar;
                    uvw0 uvw0Var22 = uvw0Var;
                    boolean z2 = this.$isWide;
                    tzr0 tzr0Var3 = this.$item;
                    if (z2) {
                    }
                }
                return coroutineSingletons;
            }
            bitmapDrawable2 = bitmapDrawable;
            charSequence2 = charSequence;
            aru aruVar222 = aruVar;
            uvw0 uvw0Var222 = uvw0Var;
            boolean z22 = this.$isWide;
            tzr0 tzr0Var32 = this.$item;
            if (z22) {
            }
        }
        CharSequence charSequence4 = (CharSequence) obj;
        tzr0 tzr0Var4 = this.$item;
        aruVar = new aru(tzr0Var4.d.a);
        tzr0.b bVar = tzr0Var4.c;
        if (bVar != null && (str = bVar.a) != null) {
            if (evu0.J(str)) {
                str = null;
            }
            if (str != null) {
                e eVar2 = this.this$0.b;
                this.L$0 = charSequence4;
                this.L$1 = aruVar;
                this.L$2 = null;
                this.label = 2;
                Object f = e.f(eVar2, str, null, this, 6);
                if (f != coroutineSingletons) {
                    charSequence = charSequence4;
                    obj = f;
                    bitmapDrawable = (BitmapDrawable) obj;
                    tzr0 tzr0Var22 = this.$item;
                    tvw0Var = tzr0Var22.e;
                    if (tvw0Var != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        charSequence = charSequence4;
        bitmapDrawable = null;
        tzr0 tzr0Var222 = this.$item;
        tvw0Var = tzr0Var222.e;
        if (tvw0Var != null) {
        }
    }
}
