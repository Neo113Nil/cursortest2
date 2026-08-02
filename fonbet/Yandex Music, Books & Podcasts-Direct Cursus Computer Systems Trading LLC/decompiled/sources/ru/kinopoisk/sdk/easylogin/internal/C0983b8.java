package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.a4g;
import defpackage.aij;
import defpackage.alc;
import defpackage.bm5;
import defpackage.clc;
import defpackage.fm5;
import defpackage.gld;
import defpackage.lbq;
import defpackage.suh;
import defpackage.tf6;
import defpackage.u0q;
import defpackage.u21;
import defpackage.ub7;
import defpackage.v5g;
import defpackage.xdr;
import defpackage.zsd;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;
import ru.kinopoisk.sdk.easylogin.internal.K8;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.b8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0983b8 implements InterfaceC1305z0 {
    public static final /* synthetic */ int f = 0;

    @NotNull
    public final K8 a;

    @NotNull
    public final F0 b;

    @NotNull
    public final J8 c;

    @NotNull
    public final CopyOnWriteArrayList<N8> d;

    @NotNull
    public final u0q e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/b8$a;", "", "", "TAG", "Ljava/lang/String;", "android_cast_connectivitymobile_samsung"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.b8$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public C0983b8(@NotNull K8 k8, @NotNull F0 f0, @NotNull J8 j8, @NotNull C1198r0 c1198r0, @NotNull kotlinx.coroutines.a aVar) {
        k8.getClass();
        f0.getClass();
        j8.getClass();
        c1198r0.getClass();
        aVar.getClass();
        this.a = k8;
        this.b = f0;
        this.c = j8;
        tf6 e = gld.e(kotlin.coroutines.e.c(a4g.n(), aVar.plus(new C1187q2("SamsungCastDeviceManager"))));
        this.d = new CopyOnWriteArrayList<>();
        this.e = zsd.D0(new alc(new clc(new ub7(12, zsd.b0(new clc(new u21(10, new ub7(12, new clc(zsd.M0(new ub7(12, zsd.b0(zsd.M0(c1198r0.a.getAuthTokenState(), new C1240u0(null, c1198r0))), new C1266w0(null)), new C1095j8(null, this)), new C0997c8(this, null)), new C1011d8(this, null)), k8.d, new C1025e8(this, null)), new C1039f8(null))), new C1053g8(this, null)), new C1067h8(this, null)), new C1081i8(this, null)), e, lbq.b);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0
    public final void a() {
        F8.a(this.b, "SamsungCastDeviceManager", "disconnect", new Object[0], 4);
        K8 k8 = this.a;
        K8.d dVar = (K8.d) ((xdr) k8.d).getValue();
        if (dVar instanceof K8.d.a) {
            ((K8.d.a) dVar).a.e(new L8(k8));
        }
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0
    @NotNull
    public final aij b() {
        return v5g.t(this.e);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0
    @NotNull
    public final bm5 a(@NotNull InterfaceC1305z0.a aVar) {
        aVar.getClass();
        return new fm5(2, new suh(28, this, aVar));
    }

    public static final void a(C0983b8 c0983b8, InterfaceC1305z0.a aVar) {
        F8.a(c0983b8.b, "SamsungCastDeviceManager", "connect", new Object[]{"castDevice = " + aVar}, 4);
        c0983b8.a.a(aVar.b());
    }
}
