package ru.yandex.taxi.logistics.care.impl.router;

import android.webkit.PermissionRequest;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v7j0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.care.impl.router.DeliveryCareRouterImpl$handlePermissionRequest$1$1", f = "DeliveryCareRouterImpl.kt", l = {206}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryCareRouterImpl$handlePermissionRequest$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ PermissionRequest $nonNullRequest;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryCareRouterImpl$handlePermissionRequest$1$1(PermissionRequest permissionRequest, f fVar, Continuation continuation) {
        super(2, continuation);
        this.$nonNullRequest = permissionRequest;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryCareRouterImpl$handlePermissionRequest$1$1(this.$nonNullRequest, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryCareRouterImpl$handlePermissionRequest$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0057 -> B:5:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006c -> B:8:0x0071). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006e -> B:8:0x0071). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        String[] strArr;
        int length;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            ArrayList t = g8e.t(obj);
            String[] resources = this.$nonNullRequest.getResources();
            list = t;
            strArr = resources;
            length = resources.length;
            i = 0;
            if (i >= length) {
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.I$1;
            i = this.I$0;
            strArr = (String[]) this.L$1;
            list = (List) this.L$0;
            kotlin.b.b(obj);
            if (((Boolean) obj).booleanValue()) {
                list.add("android.webkit.resource.VIDEO_CAPTURE");
            }
            i++;
            if (i >= length) {
                String str = strArr[i];
                if (jl40.l(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                    v7j0 v7j0Var = this.this$0.J;
                    this.L$0 = list;
                    this.L$1 = strArr;
                    this.L$2 = null;
                    this.I$0 = i;
                    this.I$1 = length;
                    this.label = 1;
                    obj = ((com.yandex.go.permission.b) v7j0Var).d(3, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                    i++;
                    if (i >= length) {
                    }
                } else {
                    if (jl40.l(str, "android.webkit.resource.PROTECTED_MEDIA_ID")) {
                        list.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                    }
                    i++;
                    if (i >= length) {
                        List list2 = list;
                        boolean isEmpty = list2.isEmpty();
                        PermissionRequest permissionRequest = this.$nonNullRequest;
                        if (isEmpty) {
                            permissionRequest.deny();
                        } else {
                            permissionRequest.grant((String[]) list2.toArray(new String[0]));
                        }
                        return zy11.a;
                    }
                }
            }
        }
    }
}
