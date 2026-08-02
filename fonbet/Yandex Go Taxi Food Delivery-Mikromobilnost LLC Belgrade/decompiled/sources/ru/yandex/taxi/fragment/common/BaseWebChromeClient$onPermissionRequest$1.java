package ru.yandex.taxi.fragment.common;

import android.webkit.PermissionRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.fragment.common.BaseWebChromeClient$onPermissionRequest$1", f = "BaseWebChromeClient.kt", l = {169}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class BaseWebChromeClient$onPermissionRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ PermissionRequest $request;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ BaseWebChromeClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebChromeClient$onPermissionRequest$1(PermissionRequest permissionRequest, BaseWebChromeClient baseWebChromeClient, Continuation continuation) {
        super(2, continuation);
        this.$request = permissionRequest;
        this.this$0 = baseWebChromeClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseWebChromeClient$onPermissionRequest$1(this.$request, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseWebChromeClient$onPermissionRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0074  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x006d -> B:5:0x0070). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BaseWebChromeClient baseWebChromeClient;
        Collection arrayList;
        int length;
        String[] strArr;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            String[] resources = this.$request.getResources();
            baseWebChromeClient = this.this$0;
            arrayList = new ArrayList();
            length = resources.length;
            strArr = resources;
            i = 0;
            if (i < length) {
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.I$1;
            i = this.I$0;
            strArr = (String[]) this.L$4;
            arrayList = (Collection) this.L$3;
            baseWebChromeClient = (BaseWebChromeClient) this.L$1;
            kotlin.b.b(obj);
            String str = (String) obj;
            if (str != null) {
                arrayList.add(str);
            }
            i++;
            if (i < length) {
                String str2 = strArr[i];
                this.L$0 = null;
                this.L$1 = baseWebChromeClient;
                this.L$2 = null;
                this.L$3 = arrayList;
                this.L$4 = strArr;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = i;
                this.I$1 = length;
                this.label = 1;
                obj = baseWebChromeClient.getResourceOrNull(str2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                String str3 = (String) obj;
                if (str3 != null) {
                }
                i++;
                if (i < length) {
                    List list = (List) arrayList;
                    boolean isEmpty = list.isEmpty();
                    PermissionRequest permissionRequest = this.$request;
                    if (isEmpty) {
                        permissionRequest.deny();
                    } else {
                        permissionRequest.grant((String[]) list.toArray(new String[0]));
                    }
                    return zy11.a;
                }
            }
        }
    }
}
