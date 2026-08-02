package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.device.ConnectableDevice;
import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.we7;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.cast.lg.internal.LgCastDeviceManager$discoveryFlow$4", f = "LgCastDeviceManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.z5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1310z5 extends aur implements Function2<List<? extends ConnectableDevice>, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ C1271w5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1310z5(C1271w5 c1271w5, Continuation<? super C1310z5> continuation) {
        super(2, continuation);
        this.b = c1271w5;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C1310z5 c1310z5 = new C1310z5(this.b, continuation);
        c1310z5.a = obj;
        return c1310z5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1310z5 c1310z5 = new C1310z5(this.b, (Continuation) obj2);
        c1310z5.a = (List) obj;
        return c1310z5.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        List list = (List) this.a;
        Timber.INSTANCE.d("LgCastDeviceManager", "update discovered items [it=%s]", list);
        this.b.e.clear();
        this.b.e.addAll(list);
        return Unit.a;
    }
}
