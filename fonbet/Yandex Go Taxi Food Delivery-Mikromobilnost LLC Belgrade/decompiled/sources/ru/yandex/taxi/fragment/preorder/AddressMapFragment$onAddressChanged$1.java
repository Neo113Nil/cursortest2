package ru.yandex.taxi.fragment.preorder;

import android.view.View;
import com.yandex.go.design.view.GoImageButton;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.fragment.preorder.AddressMapFragment$onAddressChanged$1", f = "AddressMapFragment.kt", l = {472, 473}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class AddressMapFragment$onAddressChanged$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ AddressMapFragment<L, I> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapFragment$onAddressChanged$1(AddressMapFragment addressMapFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = addressMapFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapFragment$onAddressChanged$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapFragment$onAddressChanged$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
    
        if (r7 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AddressMapFragment addressMapFragment;
        ru.yandex.taxi.address.c presenter;
        ru.yandex.taxi.address.c presenter2;
        View view;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            addressMapFragment = this.this$0;
            presenter = addressMapFragment.getPresenter();
            pv0 addressInfo = this.this$0.getAddressInfo();
            this.L$0 = addressMapFragment;
            this.label = 1;
            obj = presenter.Rg(addressInfo, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                view = (View) this.L$0;
                kotlin.b.b(obj);
                view.setVisibility(!((Boolean) obj).booleanValue() ? 0 : 8);
                return zy11.a;
            }
            addressMapFragment = (AddressMapFragment) this.L$0;
            kotlin.b.b(obj);
        }
        addressMapFragment.setAddressInfo((pv0) obj);
        GoImageButton saveAddress = this.this$0.getSaveAddress();
        if (saveAddress != null) {
            presenter2 = this.this$0.getPresenter();
            pv0 addressInfo2 = this.this$0.getAddressInfo();
            this.L$0 = saveAddress;
            this.label = 2;
            Object Qg = presenter2.Qg(addressInfo2, this);
            if (Qg != coroutineSingletons) {
                obj = Qg;
                view = saveAddress;
                view.setVisibility(!((Boolean) obj).booleanValue() ? 0 : 8);
            }
            return coroutineSingletons;
        }
        return zy11.a;
    }
}
