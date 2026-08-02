package ru.yandex.taxi.favorites.edit;

import android.content.Context;
import android.view.View;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.jj00;
import defpackage.kj00;
import defpackage.kyh0;
import defpackage.lj00;
import defpackage.mgp;
import defpackage.mj00;
import defpackage.mvg;
import defpackage.nj00;
import defpackage.ny61;
import defpackage.rg3;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.favorites.edit.a;
import ru.yandex.taxi.widget.ShimmeringImageView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.edit.FavoriteMapHolder$1", f = "FavoriteMapHolder.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FavoriteMapHolder$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnj00;", ClidProvider.STATE, "", "shimmering", "Lzy11;", "<anonymous>", "(Lnj00;Z)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.favorites.edit.FavoriteMapHolder$1$1", f = "FavoriteMapHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.favorites.edit.FavoriteMapHolder$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(3, continuation);
            this.this$0 = aVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (Continuation) obj3);
            anonymousClass1.L$0 = (nj00) obj;
            anonymousClass1.Z$0 = booleanValue;
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Context context;
            nj00 nj00Var = (nj00) this.L$0;
            final boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            String str = null;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            final a aVar = this.this$0;
            View view = aVar.e;
            View view2 = aVar.c;
            ButtonComponent buttonComponent = aVar.h;
            ShimmeringImageView shimmeringImageView = aVar.b;
            final int i = 0;
            aVar.a.setVisibility(!(nj00Var instanceof kj00) ? 0 : 8);
            boolean z2 = nj00Var instanceof mj00;
            shimmeringImageView.setVisibility((z2 || (nj00Var instanceof lj00) || z) ? 0 : 8);
            view2.setVisibility((!z2 || z) ? 8 : 0);
            view.setVisibility((!(nj00Var instanceof jj00) || z) ? 4 : 0);
            aVar.f.setVisibility(!z ? 0 : 8);
            aVar.g.setVisibility(z ? 0 : 8);
            final int i2 = 1;
            shimmeringImageView.setLoading((nj00Var instanceof lj00) || z);
            if (!z2 || z) {
                shimmeringImageView.setImageDrawable(null);
            } else {
                shimmeringImageView.setImageBitmap(((mj00) nj00Var).a);
            }
            if (!z && (context = buttonComponent.getContext()) != null) {
                str = context.getString(kyh0.common_edit);
            }
            buttonComponent.setText(str);
            buttonComponent.setProgressing(z);
            c.z(new sls() { // from class: ngp
                @Override // defpackage.sls
                public final Object invoke() {
                    int i3 = i;
                    zy11 zy11Var = zy11.a;
                    a aVar2 = aVar;
                    boolean z3 = z;
                    switch (i3) {
                        case 0:
                            if (!z3) {
                                aVar2.j.run();
                                break;
                            }
                            break;
                        default:
                            if (!z3) {
                                aVar2.j.run();
                                break;
                            }
                            break;
                    }
                    return zy11Var;
                }
            }, shimmeringImageView);
            c.z(new sls() { // from class: ngp
                @Override // defpackage.sls
                public final Object invoke() {
                    int i3 = i2;
                    zy11 zy11Var = zy11.a;
                    a aVar2 = aVar;
                    boolean z3 = z;
                    switch (i3) {
                        case 0:
                            if (!z3) {
                                aVar2.j.run();
                                break;
                            }
                            break;
                        default:
                            if (!z3) {
                                aVar2.j.run();
                                break;
                            }
                            break;
                    }
                    return zy11Var;
                }
            }, view2);
            buttonComponent.setDebounceClickListener(new rg3(z, aVar, 6));
            c.z(new mgp(aVar, 2), view);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteMapHolder$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FavoriteMapHolder$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FavoriteMapHolder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            m0 m0Var = new m0(aVar.l, aVar.m, new AnonymousClass1(aVar, null));
            this.label = 1;
            if (e.j(m0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
