package ru.yandex.taxi.logistics.explicit_comment_courier.comment.ui;

import defpackage.m8i;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p8i;
import defpackage.s8i;
import defpackage.wls;
import defpackage.zch;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isKeyboardVisible", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.explicit_comment_courier.comment.ui.DeliveryExplicitCommentCourierPresenter$observeKeyboardState$1", f = "DeliveryExplicitCommentCourierPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryExplicitCommentCourierPresenter$observeKeyboardState$1 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ s8i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryExplicitCommentCourierPresenter$observeKeyboardState$1(s8i s8iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s8iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryExplicitCommentCourierPresenter$observeKeyboardState$1 deliveryExplicitCommentCourierPresenter$observeKeyboardState$1 = new DeliveryExplicitCommentCourierPresenter$observeKeyboardState$1(this.this$0, continuation);
        deliveryExplicitCommentCourierPresenter$observeKeyboardState$1.Z$0 = ((Boolean) obj).booleanValue();
        return deliveryExplicitCommentCourierPresenter$observeKeyboardState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        DeliveryExplicitCommentCourierPresenter$observeKeyboardState$1 deliveryExplicitCommentCourierPresenter$observeKeyboardState$1 = (DeliveryExplicitCommentCourierPresenter$observeKeyboardState$1) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryExplicitCommentCourierPresenter$observeKeyboardState$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (!z) {
            s8i s8iVar = this.this$0;
            zch zchVar = s8iVar.z;
            boolean z2 = s8iVar.D;
            m8i m8iVar = s8iVar.y;
            String a = z2 ? m8iVar.a() : m8iVar.a.c;
            zchVar.getClass();
            if (a != null && a.length() != 0) {
                str = a;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str != null) {
                linkedHashMap.put("comment", str);
            }
            zchVar.l("Summary.SummaryCard.CommentToCourierCard.TextArea.KeyboardEnter", linkedHashMap);
            ((p8i) this.this$0.Dg()).requestFocus();
        }
        return zy11.a;
    }
}
