package ru.yandex.logistics.sdk.cargo_form.impl.popup;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.dms;
import defpackage.kae0;
import defpackage.m9e0;
import defpackage.msb1;
import defpackage.mvg;
import defpackage.nae0;
import defpackage.ny61;
import defpackage.oae0;
import defpackage.w511;
import defpackage.zii0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000(\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "Lm9e0;", "popups", "", "", "dismissedIds", "Lzii0;", "viewport", "", "<unused var>", "Lkae0;", "<anonymous>", "(Ljava/util/List;Ljava/util/Set;Lzii0;J)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.popup.PopupProvider$popupsStateFlow$2", f = "PopupProvider.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PopupProvider$popupsStateFlow$2 extends SuspendLambda implements dms {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$10;
    Object L$11;
    /* synthetic */ Object L$2;
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
    public PopupProvider$popupsStateFlow$2(b bVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Number) obj4).longValue();
        PopupProvider$popupsStateFlow$2 popupProvider$popupsStateFlow$2 = new PopupProvider$popupsStateFlow$2(this.this$0, (Continuation) obj5);
        popupProvider$popupsStateFlow$2.L$0 = (List) obj;
        popupProvider$popupsStateFlow$2.L$1 = (Set) obj2;
        popupProvider$popupsStateFlow$2.L$2 = (zii0) obj3;
        return popupProvider$popupsStateFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
    
        if (null == r7) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c6  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.Collection] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        zii0 zii0Var;
        b bVar;
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        PopupProvider$popupsStateFlow$2 popupProvider$popupsStateFlow$2 = this;
        List list = (List) popupProvider$popupsStateFlow$2.L$0;
        Set set = (Set) popupProvider$popupsStateFlow$2.L$1;
        zii0 zii0Var2 = (zii0) popupProvider$popupsStateFlow$2.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = popupProvider$popupsStateFlow$2.label;
        if (i4 == 0) {
            kotlin.b.b(obj);
            if (zii0Var2 == null) {
                return EmptyList.a;
            }
            b bVar2 = popupProvider$popupsStateFlow$2.this$0;
            ArrayList arrayList2 = new ArrayList();
            it = list.iterator();
            zii0Var = zii0Var2;
            bVar = bVar2;
            arrayList = arrayList2;
            i = 0;
            i2 = 0;
            i3 = 0;
            if (it.hasNext()) {
            }
        } else {
            if (i4 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = popupProvider$popupsStateFlow$2.I$2;
            int i6 = popupProvider$popupsStateFlow$2.I$1;
            int i7 = popupProvider$popupsStateFlow$2.I$0;
            Iterator it2 = (Iterator) popupProvider$popupsStateFlow$2.L$8;
            ?? r11 = (Collection) popupProvider$popupsStateFlow$2.L$6;
            b bVar3 = (b) popupProvider$popupsStateFlow$2.L$4;
            kotlin.b.b(obj);
            i3 = i7;
            it = it2;
            arrayList = r11;
            i = i5;
            zii0Var = zii0Var2;
            bVar = bVar3;
            Object obj2 = obj;
            i2 = i6;
            kae0 kae0Var = (kae0) obj2;
            if (kae0Var != null) {
                arrayList.add(kae0Var);
            }
            popupProvider$popupsStateFlow$2 = this;
            if (it.hasNext()) {
                m9e0 m9e0Var = (m9e0) it.next();
                popupProvider$popupsStateFlow$2.L$0 = null;
                popupProvider$popupsStateFlow$2.L$1 = set;
                popupProvider$popupsStateFlow$2.L$2 = zii0Var;
                popupProvider$popupsStateFlow$2.L$3 = null;
                popupProvider$popupsStateFlow$2.L$4 = bVar;
                popupProvider$popupsStateFlow$2.L$5 = null;
                popupProvider$popupsStateFlow$2.L$6 = arrayList;
                popupProvider$popupsStateFlow$2.L$7 = null;
                popupProvider$popupsStateFlow$2.L$8 = it;
                popupProvider$popupsStateFlow$2.L$9 = null;
                popupProvider$popupsStateFlow$2.L$10 = null;
                popupProvider$popupsStateFlow$2.L$11 = null;
                popupProvider$popupsStateFlow$2.I$0 = i3;
                popupProvider$popupsStateFlow$2.I$1 = i2;
                popupProvider$popupsStateFlow$2.I$2 = i;
                popupProvider$popupsStateFlow$2.I$3 = 0;
                popupProvider$popupsStateFlow$2.I$4 = 0;
                popupProvider$popupsStateFlow$2.label = 1;
                bVar.getClass();
                oae0 oae0Var = m9e0Var.c;
                if (oae0Var instanceof nae0) {
                    obj2 = bVar.b(m9e0Var.a, m9e0Var.b, (nae0) oae0Var, set, zii0Var, popupProvider$popupsStateFlow$2);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (!oae0Var.equals(msb1.P)) {
                        w511.b();
                        return null;
                    }
                    obj2 = null;
                }
                kae0 kae0Var2 = (kae0) obj2;
                if (kae0Var2 != null) {
                }
                popupProvider$popupsStateFlow$2 = this;
                if (it.hasNext()) {
                    return arrayList;
                }
            }
        }
    }
}
