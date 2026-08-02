package ru.yandex.taxi.surge.mapper;

import android.graphics.drawable.Drawable;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.q47;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tvw0;
import defpackage.uvw0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Luvw0;", "<anonymous>", "(Ltse;)Luvw0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.mapper.SurgeInfoStateMapper$mapShortcutItemModal$2", f = "SurgeInfoStateMapper.kt", l = {505, 505, 505, 511, 513, 514, 515}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateMapper$mapShortcutItemModal$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    final /* synthetic */ tvw0 $modal;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateMapper$mapShortcutItemModal$2(tvw0 tvw0Var, String str, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$modal = tvw0Var;
        this.$id = str;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SurgeInfoStateMapper$mapShortcutItemModal$2 surgeInfoStateMapper$mapShortcutItemModal$2 = new SurgeInfoStateMapper$mapShortcutItemModal$2(this.$modal, this.$id, this.this$0, continuation);
        surgeInfoStateMapper$mapShortcutItemModal$2.L$0 = obj;
        return surgeInfoStateMapper$mapShortcutItemModal$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateMapper$mapShortcutItemModal$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x014d, code lost:
    
        if (r12 == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0130, code lost:
    
        if (r12 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0174  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        noh h3;
        noh nohVar;
        noh nohVar2;
        noh nohVar3;
        noh nohVar4;
        String str;
        int i;
        noh nohVar5;
        noh nohVar6;
        noh nohVar7;
        tvw0.a aVar;
        Object k;
        q47 q47Var;
        noh nohVar8;
        Object k2;
        CharSequence charSequence;
        noh nohVar9;
        String str2;
        q47 q47Var2;
        tvw0.a aVar2;
        Object k3;
        CharSequence charSequence2;
        q47 q47Var3;
        CharSequence charSequence3;
        String str3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = 1;
        switch (this.label) {
            case 0:
                b.b(obj);
                qoh h4 = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapShortcutItemModal$2$title$1(this.this$0, this.$modal, null), 3);
                h = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapShortcutItemModal$2$text$1(this.this$0, this.$modal, null), 3);
                h2 = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapShortcutItemModal$2$image$1(this.this$0, this.$modal, null), 3);
                h3 = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapShortcutItemModal$2$buttons$1(this.this$0, this.$modal, null), 3);
                this.L$0 = null;
                this.L$1 = h4;
                this.L$2 = h;
                this.L$3 = h2;
                this.L$4 = h3;
                this.label = 1;
                obj = h4.s(this);
                nohVar = h4;
                break;
            case 1:
                h3 = (noh) this.L$4;
                h2 = (noh) this.L$3;
                h = (noh) this.L$2;
                noh nohVar10 = (noh) this.L$1;
                b.b(obj);
                nohVar = nohVar10;
                nohVar7 = nohVar;
                if (evu0.J((CharSequence) obj)) {
                    this.L$0 = null;
                    this.L$1 = nohVar;
                    this.L$2 = h;
                    this.L$3 = h2;
                    this.L$4 = h3;
                    this.label = 2;
                    obj = h.k(this);
                    nohVar2 = nohVar;
                    break;
                }
                nohVar3 = h;
                nohVar4 = nohVar7;
                if (!this.$modal.e.b.isEmpty() || i2 == 0) {
                    return null;
                }
                String str4 = this.$id;
                this.L$0 = null;
                this.L$1 = nohVar4;
                this.L$2 = nohVar3;
                this.L$3 = h2;
                this.L$4 = null;
                this.L$5 = str4;
                this.I$0 = i2;
                this.label = 4;
                Object k4 = h3.k(this);
                if (k4 != coroutineSingletons) {
                    int i3 = i2;
                    str = str4;
                    obj = k4;
                    i = i3;
                    nohVar5 = nohVar3;
                    nohVar6 = h2;
                    q47 q47Var4 = (q47) obj;
                    aVar = this.$modal.a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = nohVar5;
                    this.L$3 = nohVar6;
                    this.L$4 = null;
                    this.L$5 = str;
                    this.L$6 = q47Var4;
                    this.L$7 = aVar;
                    this.I$0 = i;
                    this.label = 5;
                    k = nohVar4.k(this);
                    if (k != coroutineSingletons) {
                        noh nohVar11 = nohVar6;
                        q47Var = q47Var4;
                        obj = k;
                        nohVar8 = nohVar11;
                        CharSequence charSequence4 = (CharSequence) obj;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = nohVar8;
                        this.L$4 = null;
                        this.L$5 = str;
                        this.L$6 = q47Var;
                        this.L$7 = aVar;
                        this.L$8 = charSequence4;
                        this.I$0 = i;
                        this.label = 6;
                        k2 = nohVar5.k(this);
                        if (k2 != coroutineSingletons) {
                            tvw0.a aVar3 = aVar;
                            charSequence = charSequence4;
                            obj = k2;
                            nohVar9 = nohVar8;
                            str2 = str;
                            q47Var2 = q47Var;
                            aVar2 = aVar3;
                            CharSequence charSequence5 = (CharSequence) obj;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = str2;
                            this.L$6 = q47Var2;
                            this.L$7 = aVar2;
                            this.L$8 = charSequence;
                            this.L$9 = charSequence5;
                            this.I$0 = i;
                            this.label = 7;
                            k3 = nohVar9.k(this);
                            if (k3 != coroutineSingletons) {
                                q47 q47Var5 = q47Var2;
                                charSequence2 = charSequence;
                                q47Var3 = q47Var5;
                                charSequence3 = charSequence5;
                                str3 = str2;
                                obj = k3;
                                return new uvw0(str3, q47Var3, aVar2, charSequence2, charSequence3, (Drawable) obj);
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                h3 = (noh) this.L$4;
                h2 = (noh) this.L$3;
                h = (noh) this.L$2;
                noh nohVar12 = (noh) this.L$1;
                b.b(obj);
                nohVar2 = nohVar12;
                nohVar7 = nohVar2;
                if (evu0.J((CharSequence) obj)) {
                    this.L$0 = null;
                    this.L$1 = nohVar2;
                    this.L$2 = h;
                    this.L$3 = h2;
                    this.L$4 = h3;
                    this.label = 3;
                    obj = h2.k(this);
                    if (obj != coroutineSingletons) {
                        nohVar3 = h;
                        nohVar4 = nohVar2;
                        if (obj != null) {
                            i2 = 0;
                            if (this.$modal.e.b.isEmpty()) {
                            }
                            return null;
                        }
                        nohVar7 = nohVar4;
                        h = nohVar3;
                    }
                    return coroutineSingletons;
                }
                nohVar3 = h;
                nohVar4 = nohVar7;
                if (this.$modal.e.b.isEmpty()) {
                }
                return null;
            case 3:
                h3 = (noh) this.L$4;
                h2 = (noh) this.L$3;
                nohVar3 = (noh) this.L$2;
                nohVar4 = (noh) this.L$1;
                b.b(obj);
                if (obj != null) {
                }
                break;
            case 4:
                i = this.I$0;
                String str5 = (String) this.L$5;
                nohVar6 = (noh) this.L$3;
                noh nohVar13 = (noh) this.L$2;
                nohVar4 = (noh) this.L$1;
                b.b(obj);
                nohVar5 = nohVar13;
                str = str5;
                q47 q47Var42 = (q47) obj;
                aVar = this.$modal.a;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = nohVar5;
                this.L$3 = nohVar6;
                this.L$4 = null;
                this.L$5 = str;
                this.L$6 = q47Var42;
                this.L$7 = aVar;
                this.I$0 = i;
                this.label = 5;
                k = nohVar4.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                i = this.I$0;
                aVar = (tvw0.a) this.L$7;
                q47Var = (q47) this.L$6;
                str = (String) this.L$5;
                nohVar8 = (noh) this.L$3;
                nohVar5 = (noh) this.L$2;
                b.b(obj);
                CharSequence charSequence42 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar8;
                this.L$4 = null;
                this.L$5 = str;
                this.L$6 = q47Var;
                this.L$7 = aVar;
                this.L$8 = charSequence42;
                this.I$0 = i;
                this.label = 6;
                k2 = nohVar5.k(this);
                if (k2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                i = this.I$0;
                charSequence = (CharSequence) this.L$8;
                aVar2 = (tvw0.a) this.L$7;
                q47Var2 = (q47) this.L$6;
                str2 = (String) this.L$5;
                nohVar9 = (noh) this.L$3;
                b.b(obj);
                CharSequence charSequence52 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = str2;
                this.L$6 = q47Var2;
                this.L$7 = aVar2;
                this.L$8 = charSequence;
                this.L$9 = charSequence52;
                this.I$0 = i;
                this.label = 7;
                k3 = nohVar9.k(this);
                if (k3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 7:
                CharSequence charSequence6 = (CharSequence) this.L$9;
                CharSequence charSequence7 = (CharSequence) this.L$8;
                tvw0.a aVar4 = (tvw0.a) this.L$7;
                q47 q47Var6 = (q47) this.L$6;
                String str6 = (String) this.L$5;
                b.b(obj);
                charSequence2 = charSequence7;
                str3 = str6;
                aVar2 = aVar4;
                q47Var3 = q47Var6;
                charSequence3 = charSequence6;
                return new uvw0(str3, q47Var3, aVar2, charSequence2, charSequence3, (Drawable) obj);
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
