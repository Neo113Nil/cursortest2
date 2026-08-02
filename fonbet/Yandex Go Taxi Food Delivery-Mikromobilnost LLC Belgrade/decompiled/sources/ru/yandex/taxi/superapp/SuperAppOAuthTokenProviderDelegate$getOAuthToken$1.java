package ru.yandex.taxi.superapp;

import android.net.Uri;
import defpackage.ck7;
import defpackage.gcn;
import defpackage.jl40;
import defpackage.lo60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sdn;
import defpackage.tcc;
import defpackage.tdn;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppOAuthTokenProviderDelegate$getOAuthToken$1", f = "SuperAppOAuthTokenProviderDelegate.kt", l = {26, 43}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SuperAppOAuthTokenProviderDelegate$getOAuthToken$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppOAuthTokenProviderDelegate$getOAuthToken$1(i iVar, gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$callback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperAppOAuthTokenProviderDelegate$getOAuthToken$1 superAppOAuthTokenProviderDelegate$getOAuthToken$1 = new SuperAppOAuthTokenProviderDelegate$getOAuthToken$1(this.this$0, this.$callback, continuation);
        superAppOAuthTokenProviderDelegate$getOAuthToken$1.L$0 = obj;
        return superAppOAuthTokenProviderDelegate$getOAuthToken$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppOAuthTokenProviderDelegate$getOAuthToken$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fb, code lost:
    
        if (r11 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0043, code lost:
    
        if (r11 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x010d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        String str;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            tdn tdnVar = this.this$0.b;
            this.L$0 = tseVar;
            this.label = 1;
            obj = tdnVar.a.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                d = ((Result) obj).getValue();
                if (d instanceof Result.Failure) {
                    d = null;
                }
                str = (String) d;
                gcn gcnVar = this.$callback;
                if (str == null) {
                    str = "";
                }
                gcnVar.a(new ck7(new lo60(str), null));
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        sdn sdnVar = (sdn) obj;
        i iVar = this.this$0;
        if (sdnVar.b) {
            String str2 = iVar.c.a().a;
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                Uri parse = Uri.parse(str2);
                List list = sdnVar.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((String) obj2).length() != 0) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Uri.parse((String) it.next()));
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Uri uri = (Uri) it2.next();
                        if (jl40.l(uri.getScheme(), parse.getScheme()) && jl40.l(uri.getHost(), parse.getHost())) {
                            break;
                        }
                    }
                }
                i2 = 0;
                if (i2 != 0) {
                    ru.yandex.taxi.am.token.a aVar = iVar.a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i2;
                    this.label = 2;
                    d = aVar.d(false, this);
                }
            }
        }
        str = null;
        gcn gcnVar2 = this.$callback;
        if (str == null) {
        }
        gcnVar2.a(new ck7(new lo60(str), null));
        return zy11.a;
    }
}
