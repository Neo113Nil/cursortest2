package ru.yandex.taxi.messenger.fallback;

import android.content.Intent;
import defpackage.hxx;
import defpackage.m5u;
import defpackage.m950;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.t6i;
import defpackage.x7w;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a implements x7w {
    public final com.yandex.go.lifecycle.a a;
    public final t6i b;
    public final ru.yandex.taxi.messenger.a c;

    public a(com.yandex.go.lifecycle.a aVar, t6i t6iVar, ru.yandex.taxi.messenger.a aVar2) {
        this.a = aVar;
        this.b = t6iVar;
        this.c = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.x7w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oep0 oep0Var, Intent intent, Continuation continuation) {
        FallbackChatIntentHandler$processIntent$1 fallbackChatIntentHandler$processIntent$1;
        Object obj;
        int i;
        oep0 oep0Var2;
        String str;
        if (continuation instanceof FallbackChatIntentHandler$processIntent$1) {
            fallbackChatIntentHandler$processIntent$1 = (FallbackChatIntentHandler$processIntent$1) continuation;
            int i2 = fallbackChatIntentHandler$processIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fallbackChatIntentHandler$processIntent$1.label = i2 - Integer.MIN_VALUE;
                obj = fallbackChatIntentHandler$processIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fallbackChatIntentHandler$processIntent$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (intent.hasExtra("ru.yandex.taxi.activity.MainActivity.MESSENGER_FALLBACK_TO_DISPLAY")) {
                        fallbackChatIntentHandler$processIntent$1.L$0 = oep0Var;
                        fallbackChatIntentHandler$processIntent$1.L$1 = intent;
                        fallbackChatIntentHandler$processIntent$1.label = 1;
                        obj = this.c.a(fallbackChatIntentHandler$processIntent$1);
                    }
                    return n5u.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) fallbackChatIntentHandler$processIntent$1.L$2;
                    oep0Var2 = (oep0) fallbackChatIntentHandler$processIntent$1.L$0;
                    b.b(obj);
                    m950 m950Var = (m950) this.b.get();
                    if (str == null) {
                        str = "";
                    }
                    ((pep0) oep0Var2).f(m950Var, str, hxx.a);
                    return new m5u(true, false);
                }
                intent = (Intent) fallbackChatIntentHandler$processIntent$1.L$1;
                oep0Var = (oep0) fallbackChatIntentHandler$processIntent$1.L$0;
                b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    String stringExtra = intent.getStringExtra("ru.yandex.taxi.activity.MainActivity.MESSENGER_FALLBACK_TO_DISPLAY");
                    fallbackChatIntentHandler$processIntent$1.L$0 = oep0Var;
                    fallbackChatIntentHandler$processIntent$1.L$1 = null;
                    fallbackChatIntentHandler$processIntent$1.L$2 = stringExtra;
                    fallbackChatIntentHandler$processIntent$1.label = 2;
                    if (this.a.a(fallbackChatIntentHandler$processIntent$1) != coroutineSingletons) {
                        oep0Var2 = oep0Var;
                        str = stringExtra;
                        m950 m950Var2 = (m950) this.b.get();
                        if (str == null) {
                        }
                        ((pep0) oep0Var2).f(m950Var2, str, hxx.a);
                        return new m5u(true, false);
                    }
                    return coroutineSingletons;
                }
                return n5u.a;
            }
        }
        fallbackChatIntentHandler$processIntent$1 = new FallbackChatIntentHandler$processIntent$1(this, (ContinuationImpl) continuation);
        obj = fallbackChatIntentHandler$processIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fallbackChatIntentHandler$processIntent$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return n5u.a;
    }
}
