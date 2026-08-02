package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import defpackage.f4l0;
import defpackage.gs0;
import defpackage.is0;
import defpackage.mmc;
import defpackage.ny61;
import defpackage.qej;
import defpackage.qv0;
import defpackage.sls;
import defpackage.yej;
import defpackage.zej;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes5.dex */
public final class c {
    public final f4l0 a;
    public final is0 b;
    public final com.yandex.delivery.utils.dialogmanager.impl.b c;

    public c(f4l0 f4l0Var, is0 is0Var, com.yandex.delivery.utils.dialogmanager.impl.b bVar) {
        this.a = f4l0Var;
        this.b = is0Var;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, sls slsVar, Continuation continuation) {
        CommentPopupInteractor$showCommentPopup$1 commentPopupInteractor$showCommentPopup$1;
        Object obj;
        int i2;
        mmc mmcVar;
        sls slsVar2;
        if (continuation instanceof CommentPopupInteractor$showCommentPopup$1) {
            commentPopupInteractor$showCommentPopup$1 = (CommentPopupInteractor$showCommentPopup$1) continuation;
            int i3 = commentPopupInteractor$showCommentPopup$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                commentPopupInteractor$showCommentPopup$1.label = i3 - Integer.MIN_VALUE;
                obj = commentPopupInteractor$showCommentPopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = commentPopupInteractor$showCommentPopup$1.label;
                boolean z = true;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    gs0 a = this.b.a();
                    if (a == null || (mmcVar = a.d) == null) {
                        slsVar.invoke();
                        return Boolean.TRUE;
                    }
                    qv0 qv0Var = (qv0) kotlin.collections.a.S(i, this.a.getRoute().a);
                    String str = qv0Var != null ? qv0Var.e : null;
                    if (str == null || str.length() == 0) {
                        slsVar.invoke();
                        return Boolean.TRUE;
                    }
                    qej qejVar = new qej(mmcVar.a, mmcVar.b, mmcVar.c, mmcVar.d, null, false, null, null, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
                    commentPopupInteractor$showCommentPopup$1.L$0 = slsVar;
                    commentPopupInteractor$showCommentPopup$1.L$1 = null;
                    commentPopupInteractor$showCommentPopup$1.L$2 = null;
                    commentPopupInteractor$showCommentPopup$1.I$0 = i;
                    commentPopupInteractor$showCommentPopup$1.label = 1;
                    Object a2 = this.c.a(qejVar, commentPopupInteractor$showCommentPopup$1);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a2;
                    slsVar2 = slsVar;
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slsVar2 = (sls) commentPopupInteractor$showCommentPopup$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((zej) obj) instanceof yej) {
                    z = false;
                } else {
                    slsVar2.invoke();
                }
                return Boolean.valueOf(z);
            }
        }
        commentPopupInteractor$showCommentPopup$1 = new CommentPopupInteractor$showCommentPopup$1(this, continuation);
        obj = commentPopupInteractor$showCommentPopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = commentPopupInteractor$showCommentPopup$1.label;
        boolean z2 = true;
        if (i2 != 0) {
        }
        if (((zej) obj) instanceof yej) {
        }
        return Boolean.valueOf(z2);
    }
}
