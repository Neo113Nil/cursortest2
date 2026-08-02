package ru.yandex.taxi.costcenters.selection;

import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.mxe;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uwe;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lmxe;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.costcenters.selection.CostCenterSelectionPresenter$loadFilteredItems$1$1$filteredItems$1", f = "CostCenterSelectionPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CostCenterSelectionPresenter$loadFilteredItems$1$1$filteredItems$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $filter;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CostCenterSelectionPresenter$loadFilteredItems$1$1$filteredItems$1(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$filter = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CostCenterSelectionPresenter$loadFilteredItems$1$1$filteredItems$1(this.this$0, this.$filter, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CostCenterSelectionPresenter$loadFilteredItems$1$1$filteredItems$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        uwe uweVar = bVar.x;
        List list = bVar.B.a;
        String str = this.$filter;
        uweVar.getClass();
        if (str == null || str.length() == 0) {
            return kotlin.collections.a.J0(list);
        }
        InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) uweVar.a.f.getSystemService("input_method")).getCurrentInputMethodSubtype();
        Locale locale = currentInputMethodSubtype != null ? new Locale(currentInputMethodSubtype.getLocale()) : null;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String obj2 = evu0.k0(str.toLowerCase(locale)).toString();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (evu0.y(evu0.k0(((mxe) obj3).a.toLowerCase(locale)).toString(), obj2, false)) {
                arrayList.add(obj3);
            }
        }
        return arrayList;
    }
}
