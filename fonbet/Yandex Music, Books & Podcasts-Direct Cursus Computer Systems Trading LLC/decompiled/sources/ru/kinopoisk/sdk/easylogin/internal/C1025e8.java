package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.b6e;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.v75;
import defpackage.we7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;
import ru.kinopoisk.sdk.easylogin.internal.K8;

@we7(c = "ru.kinopoisk.cast.samsung.SamsungCastDeviceManager$discoveryFlow$4", f = "SamsungCastDeviceManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.e8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1025e8 extends aur implements pyc {
    public /* synthetic */ List a;
    public /* synthetic */ K8.d b;
    public final /* synthetic */ C0983b8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1025e8(C0983b8 c0983b8, Continuation<? super C1025e8> continuation) {
        super(3, continuation);
        this.c = c0983b8;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1025e8 c1025e8 = new C1025e8(this.c, (Continuation) obj3);
        c1025e8.a = (List) obj;
        c1025e8.b = (K8.d) obj2;
        return c1025e8.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        InterfaceC1305z0.d dVar;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        List list = this.a;
        K8.d dVar2 = this.b;
        C0983b8 c0983b8 = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            int i = C0983b8.f;
            c0983b8.getClass();
            String str = ((N8) obj2).a.d;
            str.getClass();
            if ((Intrinsics.d(str, "Samsung SmartTV") ? InterfaceC1305z0.b.SmartTv : InterfaceC1305z0.b.Unknown) != InterfaceC1305z0.b.Unknown) {
                arrayList.add(obj2);
            }
        }
        C0983b8 c0983b82 = this.c;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N8 n8 = (N8) it.next();
            int i2 = C0983b8.f;
            c0983b82.getClass();
            String str2 = n8.a.a;
            str2.getClass();
            String str3 = n8.a.c;
            str3.getClass();
            InterfaceC1305z0.c cVar = InterfaceC1305z0.c.SamsungCast;
            String str4 = n8.a.d;
            str4.getClass();
            InterfaceC1305z0.b bVar = Intrinsics.d(str4, "Samsung SmartTV") ? InterfaceC1305z0.b.SmartTv : InterfaceC1305z0.b.Unknown;
            String str5 = n8.a.a;
            str5.getClass();
            if (dVar2 instanceof K8.d.a) {
                dVar = Intrinsics.d(((K8.d.a) dVar2).b, str5) ? InterfaceC1305z0.d.Connected : InterfaceC1305z0.d.Disconnected;
            } else if (dVar2 instanceof K8.d.b) {
                dVar = Intrinsics.d(((K8.d.b) dVar2).a, str5) ? InterfaceC1305z0.d.Connecting : InterfaceC1305z0.d.Disconnected;
            } else {
                if (!(dVar2 instanceof K8.d.c ? true : dVar2 instanceof K8.d.C0030d)) {
                    b6e.s();
                    return null;
                }
                dVar = InterfaceC1305z0.d.Disconnected;
            }
            arrayList2.add(new InterfaceC1305z0.a(str2, str3, cVar, bVar, dVar, n8.b));
        }
        return arrayList2;
    }
}
