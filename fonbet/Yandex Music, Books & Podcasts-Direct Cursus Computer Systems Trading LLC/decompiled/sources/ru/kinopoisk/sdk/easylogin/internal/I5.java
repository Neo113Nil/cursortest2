package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.device.ConnectableDeviceListener;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.command.ServiceCommandError;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bqi;
import defpackage.cg6;
import defpackage.e7o;
import defpackage.f1d;
import defpackage.hrg;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rj7;
import defpackage.t7o;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import defpackage.z7o;
import defpackage.zsd;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class I5 {
    public static final /* synthetic */ int e = 0;

    @NotNull
    public final F0 a;

    @NotNull
    public final N5 b;

    @NotNull
    public final bqi c;

    @NotNull
    public final d d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/I5$a;", "", "", "TAG", "Ljava/lang/String;", "android_cast_connectivitymobile_lg"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public interface c {

        public static final class a implements c {

            @NotNull
            public final ConnectableDevice a;

            public a(@NotNull ConnectableDevice connectableDevice) {
                connectableDevice.getClass();
                this.a = connectableDevice;
            }

            @NotNull
            public final ConnectableDevice a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.d(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Connected(device=" + this.a + ")";
            }
        }

        public static final class b implements c {

            @NotNull
            public final ConnectableDevice a;

            public b(@NotNull ConnectableDevice connectableDevice) {
                connectableDevice.getClass();
                this.a = connectableDevice;
            }

            @NotNull
            public final ConnectableDevice a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.d(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Connecting(device=" + this.a + ")";
            }
        }

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.I5$c$c, reason: collision with other inner class name */
        public static final class C0028c implements c {

            @NotNull
            public static final C0028c a = new C0028c();
        }

        public static final class d implements c {

            @NotNull
            public final b a;

            public d(@NotNull b bVar) {
                bVar.getClass();
                this.a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.d(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Error(error=" + this.a + ")";
            }
        }
    }

    public static final class d implements ConnectableDeviceListener {
        public d() {
        }

        @Override // com.connectsdk.device.ConnectableDeviceListener
        public final void onCapabilityUpdated(ConnectableDevice connectableDevice, List<String> list, List<String> list2) {
        }

        @Override // com.connectsdk.device.ConnectableDeviceListener
        public final void onConnectionFailed(ConnectableDevice connectableDevice, ServiceCommandError serviceCommandError) {
            connectableDevice.getClass();
            serviceCommandError.getClass();
            F8.a(I5.this.a, "LgDeviceConnector", "onConnectionFailed", null, null, new Object[]{f1d.g("deviceId=", connectableDevice.getId()), "error=" + serviceCommandError}, 12);
            bqi bqiVar = I5.this.c;
            c.d dVar = new c.d(new b(serviceCommandError, null, 2, null));
            xdr xdrVar = (xdr) bqiVar;
            xdrVar.getClass();
            xdrVar.m(null, dVar);
            connectableDevice.removeListener(this);
        }

        @Override // com.connectsdk.device.ConnectableDeviceListener
        public final void onDeviceDisconnected(ConnectableDevice connectableDevice) {
            connectableDevice.getClass();
            F8.a(I5.this.a, "LgDeviceConnector", "onDeviceDisconnected", new Object[]{f1d.g("deviceId=", connectableDevice.getId())}, 4);
            ((xdr) I5.this.c).l(c.C0028c.a);
            connectableDevice.removeListener(this);
        }

        @Override // com.connectsdk.device.ConnectableDeviceListener
        public final void onDeviceReady(ConnectableDevice connectableDevice) {
            connectableDevice.getClass();
            F8.a(I5.this.a, "LgDeviceConnector", "onDeviceReady", new Object[]{f1d.g("deviceId=", connectableDevice.getId())}, 4);
            bqi bqiVar = I5.this.c;
            c.a aVar = new c.a(connectableDevice);
            xdr xdrVar = (xdr) bqiVar;
            xdrVar.getClass();
            xdrVar.m(null, aVar);
        }

        @Override // com.connectsdk.device.ConnectableDeviceListener
        public final void onPairingRequired(ConnectableDevice connectableDevice, DeviceService deviceService, DeviceService.PairingType pairingType) {
            F8.a(I5.this.a, "LgDeviceConnector", "onPairingRequired", new Object[]{f1d.g("deviceId=", connectableDevice != null ? connectableDevice.getId() : null), "pairingType=" + pairingType, f1d.g("serviceName=", deviceService != null ? deviceService.getServiceName() : null)}, 4);
        }
    }

    static {
        new a(null);
    }

    public I5(@NotNull F0 f0, @NotNull N5 n5) {
        f0.getClass();
        n5.getClass();
        this.a = f0;
        this.b = n5;
        this.c = ydr.a(c.C0028c.a);
        this.d = new d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull cg6 cg6Var) {
        J5 j5;
        int i;
        Throwable th;
        I5 i5;
        Object t7oVar;
        Throwable a2;
        if (cg6Var instanceof J5) {
            j5 = (J5) cg6Var;
            int i2 = j5.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j5.d = i2 - Integer.MIN_VALUE;
                Object obj = j5.b;
                nm6 nm6Var = nm6.a;
                i = j5.d;
                if (i != 0) {
                    qgg.h0(obj);
                    try {
                        r7o r7oVar = z7o.b;
                        j5.a = this;
                        j5.d = 1;
                        if (b(str, j5) == nm6Var) {
                            return nm6Var;
                        }
                        i5 = this;
                    } catch (Throwable th2) {
                        th = th2;
                        i5 = this;
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                        a2 = z7o.a(t7oVar);
                        if (a2 != null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = j5.a;
                    try {
                        qgg.h0(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        r7o r7oVar22 = z7o.b;
                        t7oVar = new t7o(th);
                        a2 = z7o.a(t7oVar);
                        if (a2 != null) {
                        }
                    }
                }
                t7oVar = Unit.a;
                r7o r7oVar3 = z7o.b;
                a2 = z7o.a(t7oVar);
                if (a2 != null) {
                    return Unit.a;
                }
                F8.a(i5.a, "LgDeviceConnector", null, "An error occurred while connecting to the TV", a2, new Object[0], 2);
                throw new b(a2);
            }
        }
        j5 = new J5(this, cg6Var);
        Object obj2 = j5.b;
        nm6 nm6Var2 = nm6.a;
        i = j5.d;
        if (i != 0) {
        }
        t7oVar = Unit.a;
        r7o r7oVar32 = z7o.b;
        a2 = z7o.a(t7oVar);
        if (a2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        M5 m5;
        int i;
        I5 i5;
        if (cg6Var instanceof M5) {
            m5 = (M5) cg6Var;
            int i2 = m5.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m5.e = i2 - Integer.MIN_VALUE;
                Object obj = m5.c;
                nm6 nm6Var = nm6.a;
                i = m5.e;
                if (i != 0) {
                    qgg.h0(obj);
                    c cVar = (c) ((xdr) this.c).getValue();
                    if (cVar instanceof c.a) {
                        c.a aVar = (c.a) cVar;
                        if (Intrinsics.d(aVar.a().getId(), str)) {
                            this.a.a("LgDeviceConnector", hrg.q("Already connected to device ", str, ", skip connect"), f1d.g("deviceId=", aVar.a().getId()));
                            return Unit.a;
                        }
                        e7o.i(aVar.a().getId(), "Already connected to another device ");
                        return null;
                    }
                    if (cVar instanceof c.b) {
                        c.b bVar = (c.b) cVar;
                        if (Intrinsics.d(bVar.a().getId(), str)) {
                            this.a.a("LgDeviceConnector", hrg.q("Already connecting to device ", str, ", skip connect"), f1d.g("deviceId=", bVar.a().getId()));
                            return Unit.a;
                        }
                        e7o.i(bVar.a().getId(), "Already connecting to another device ");
                        return null;
                    }
                    ConnectableDevice a2 = this.b.a(str);
                    if (a2 == null) {
                        rj7.i(str, " not found in network", "Device ");
                        return null;
                    }
                    a2.addListener(this.d);
                    this.a.a("LgDeviceConnector", "connect to device", f1d.g("deviceId=", str));
                    a2.setPairingType(DeviceService.PairingType.NONE);
                    bqi bqiVar = this.c;
                    c.b bVar2 = new c.b(a2);
                    xdr xdrVar = (xdr) bqiVar;
                    xdrVar.getClass();
                    xdrVar.m(null, bVar2);
                    a2.connect();
                    L5 l5 = new L5(new K5(this.c));
                    m5.a = this;
                    m5.b = str;
                    m5.e = 1;
                    if (zsd.i0(l5, m5) == nm6Var) {
                        return nm6Var;
                    }
                    i5 = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = m5.b;
                    i5 = m5.a;
                    qgg.h0(obj);
                }
                i5.a.a("LgDeviceConnector", "connected to device", f1d.g("deviceId=", str));
                return Unit.a;
            }
        }
        m5 = new M5(this, cg6Var);
        Object obj2 = m5.c;
        nm6 nm6Var2 = nm6.a;
        i = m5.e;
        if (i != 0) {
        }
        i5.a.a("LgDeviceConnector", "connected to device", f1d.g("deviceId=", str));
        return Unit.a;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/I5$b;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "android_cast_connectivitymobile_lg"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class b extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            super(str, th);
            str = (i & 2) != 0 ? null : str;
            th.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Throwable th) {
            super("An error occurred while connecting to the TV", th);
            th.getClass();
        }
    }

    public final void a() {
        c cVar = (c) ((xdr) this.c).getValue();
        if (cVar instanceof c.a) {
            c.a aVar = (c.a) cVar;
            F8.a(this.a, "LgDeviceConnector", "disconnect", new Object[]{f1d.g("deviceId=", aVar.a().getId())}, 4);
            aVar.a().disconnect();
        }
    }
}
