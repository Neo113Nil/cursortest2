package ru.yandex.taxi.map_common.map;

import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.navigation.transport.NavigationSerialization;
import com.yandex.mapkit.navigation.transport.Type;
import defpackage.el00;
import defpackage.j24;
import defpackage.ny61;
import defpackage.t35;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class s extends t35 {
    public final el00 d;
    public final Type e;

    public s(el00 el00Var, Type type) {
        this.d = el00Var;
        this.e = type;
    }

    @Override // defpackage.t35
    public final void c(j24 j24Var) {
        this.d.f(true, new TransportNavigationHolder$requestCreation$1(j24Var, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(byte[] bArr, ContinuationImpl continuationImpl) {
        TransportNavigationHolder$deserializeTransportNavigation$1 transportNavigationHolder$deserializeTransportNavigation$1;
        int i;
        if (continuationImpl instanceof TransportNavigationHolder$deserializeTransportNavigation$1) {
            transportNavigationHolder$deserializeTransportNavigation$1 = (TransportNavigationHolder$deserializeTransportNavigation$1) continuationImpl;
            int i2 = transportNavigationHolder$deserializeTransportNavigation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportNavigationHolder$deserializeTransportNavigation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportNavigationHolder$deserializeTransportNavigation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportNavigationHolder$deserializeTransportNavigation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transportNavigationHolder$deserializeTransportNavigation$1.L$0 = bArr;
                    transportNavigationHolder$deserializeTransportNavigation$1.label = 1;
                    if (a(transportNavigationHolder$deserializeTransportNavigation$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bArr = (byte[]) transportNavigationHolder$deserializeTransportNavigation$1.L$0;
                    kotlin.b.b(obj);
                }
                return NavigationSerialization.deserialize(bArr);
            }
        }
        transportNavigationHolder$deserializeTransportNavigation$1 = new TransportNavigationHolder$deserializeTransportNavigation$1(this, continuationImpl);
        Object obj3 = transportNavigationHolder$deserializeTransportNavigation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportNavigationHolder$deserializeTransportNavigation$1.label;
        if (i != 0) {
        }
        return NavigationSerialization.deserialize(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(Navigation navigation, ContinuationImpl continuationImpl) {
        TransportNavigationHolder$serializeTransportNavigation$1 transportNavigationHolder$serializeTransportNavigation$1;
        int i;
        if (continuationImpl instanceof TransportNavigationHolder$serializeTransportNavigation$1) {
            transportNavigationHolder$serializeTransportNavigation$1 = (TransportNavigationHolder$serializeTransportNavigation$1) continuationImpl;
            int i2 = transportNavigationHolder$serializeTransportNavigation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportNavigationHolder$serializeTransportNavigation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportNavigationHolder$serializeTransportNavigation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportNavigationHolder$serializeTransportNavigation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transportNavigationHolder$serializeTransportNavigation$1.L$0 = navigation;
                    transportNavigationHolder$serializeTransportNavigation$1.label = 1;
                    if (a(transportNavigationHolder$serializeTransportNavigation$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    navigation = (Navigation) transportNavigationHolder$serializeTransportNavigation$1.L$0;
                    kotlin.b.b(obj);
                }
                return NavigationSerialization.serialize(navigation);
            }
        }
        transportNavigationHolder$serializeTransportNavigation$1 = new TransportNavigationHolder$serializeTransportNavigation$1(this, continuationImpl);
        Object obj2 = transportNavigationHolder$serializeTransportNavigation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportNavigationHolder$serializeTransportNavigation$1.label;
        if (i != 0) {
        }
        return NavigationSerialization.serialize(navigation);
    }
}
