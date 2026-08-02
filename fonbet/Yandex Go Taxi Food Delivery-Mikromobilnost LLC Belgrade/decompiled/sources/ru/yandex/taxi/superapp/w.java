package ru.yandex.taxi.superapp;

import android.net.Uri;
import defpackage.lg21;
import defpackage.mg21;
import defpackage.ny61;
import defpackage.og21;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class w {
    public final lg21 a;
    public final com.yandex.go.intentprocessor.a b;

    public w(lg21 lg21Var, com.yandex.go.intentprocessor.a aVar) {
        this.a = lg21Var;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri uri, ContinuationImpl continuationImpl) {
        SuperappUriNavigatorImpl$openUri$1 superappUriNavigatorImpl$openUri$1;
        int i;
        Uri uri2;
        if (continuationImpl instanceof SuperappUriNavigatorImpl$openUri$1) {
            superappUriNavigatorImpl$openUri$1 = (SuperappUriNavigatorImpl$openUri$1) continuationImpl;
            int i2 = superappUriNavigatorImpl$openUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappUriNavigatorImpl$openUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappUriNavigatorImpl$openUri$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappUriNavigatorImpl$openUri$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (og21.b(uri)) {
                        superappUriNavigatorImpl$openUri$1.L$0 = uri;
                        superappUriNavigatorImpl$openUri$1.label = 1;
                        obj = this.b.a(uri, superappUriNavigatorImpl$openUri$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    ((mg21) this.a).a(uri.toString());
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uri = (Uri) superappUriNavigatorImpl$openUri$1.L$0;
                kotlin.b.b(obj);
                uri2 = (Uri) obj;
                if (uri2 != null) {
                    uri = uri2;
                }
                ((mg21) this.a).a(uri.toString());
                return zy11.a;
            }
        }
        superappUriNavigatorImpl$openUri$1 = new SuperappUriNavigatorImpl$openUri$1(this, continuationImpl);
        Object obj3 = superappUriNavigatorImpl$openUri$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappUriNavigatorImpl$openUri$1.label;
        if (i != 0) {
        }
        uri2 = (Uri) obj3;
        if (uri2 != null) {
        }
        ((mg21) this.a).a(uri.toString());
        return zy11.a;
    }
}
