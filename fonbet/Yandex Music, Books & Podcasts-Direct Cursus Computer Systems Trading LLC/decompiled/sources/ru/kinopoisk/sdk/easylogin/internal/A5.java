package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.device.ConnectableDevice;
import defpackage.aur;
import defpackage.b6e;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.v75;
import defpackage.we7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.internal.I5;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;

@we7(c = "ru.kinopoisk.cast.lg.internal.LgCastDeviceManager$discoveryFlow$5", f = "LgCastDeviceManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class A5 extends aur implements pyc {
    public /* synthetic */ List a;
    public /* synthetic */ I5.c b;
    public final /* synthetic */ C1271w5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A5(C1271w5 c1271w5, Continuation<? super A5> continuation) {
        super(3, continuation);
        this.c = c1271w5;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        A5 a5 = new A5(this.c, (Continuation) obj3);
        a5.a = (List) obj;
        a5.b = (I5.c) obj2;
        return a5.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        InterfaceC1305z0.d dVar;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        List<ConnectableDevice> list = this.a;
        I5.c cVar = this.b;
        C1271w5 c1271w5 = this.c;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (ConnectableDevice connectableDevice : list) {
            int i = C1271w5.g;
            c1271w5.getClass();
            String id = connectableDevice.getId();
            id.getClass();
            String friendlyName = connectableDevice.getFriendlyName();
            if (friendlyName == null && (friendlyName = connectableDevice.getModelName()) == null) {
                friendlyName = "";
            }
            String str = friendlyName;
            InterfaceC1305z0.c cVar2 = InterfaceC1305z0.c.LgCast;
            InterfaceC1305z0.b bVar = InterfaceC1305z0.b.SmartTv;
            String id2 = connectableDevice.getId();
            id2.getClass();
            if (cVar instanceof I5.c.a) {
                dVar = Intrinsics.d(((I5.c.a) cVar).a.getId(), id2) ? InterfaceC1305z0.d.Connected : InterfaceC1305z0.d.Disconnected;
            } else if (cVar instanceof I5.c.b) {
                dVar = Intrinsics.d(((I5.c.b) cVar).a.getId(), id2) ? InterfaceC1305z0.d.Connecting : InterfaceC1305z0.d.Disconnected;
            } else {
                if (!(cVar instanceof I5.c.d ? true : cVar instanceof I5.c.C0028c)) {
                    b6e.s();
                    return null;
                }
                dVar = InterfaceC1305z0.d.Disconnected;
            }
            InterfaceC1305z0.d dVar2 = dVar;
            String modelName = connectableDevice.getModelName();
            if (modelName == null) {
                modelName = "Unknown";
            }
            arrayList.add(new InterfaceC1305z0.a(id, str, cVar2, bVar, dVar2, modelName));
        }
        return arrayList;
    }
}
