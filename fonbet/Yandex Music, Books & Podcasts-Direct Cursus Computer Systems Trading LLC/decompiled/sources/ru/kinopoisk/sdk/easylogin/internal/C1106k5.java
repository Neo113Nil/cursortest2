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
import defpackage.tf6;
import defpackage.tiu;
import defpackage.u0q;
import defpackage.ub7;
import defpackage.v5g;
import defpackage.zsd;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.k5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1106k5 implements InterfaceC1305z0 {

    @NotNull
    public static final a e = new a(null);

    @NotNull
    public final InterfaceC1192q7 a;

    @NotNull
    public final F0 b;

    @NotNull
    public final CopyOnWriteArrayList<C1164o7> c;

    @NotNull
    public final u0q d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/k5$a;", "", "", "TAG", "Ljava/lang/String;", "android_cast_connectivitymobile_kinopoisk"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.k5$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public C1106k5(@NotNull InterfaceC1192q7 interfaceC1192q7, @NotNull F0 f0, @NotNull C1198r0 c1198r0, @NotNull Q2 q2) {
        interfaceC1192q7.getClass();
        f0.getClass();
        c1198r0.getClass();
        q2.getClass();
        this.a = interfaceC1192q7;
        this.b = f0;
        tf6 e2 = gld.e(kotlin.coroutines.e.c(a4g.n(), q2.a().plus(new C1187q2("KinopoiskCastDeviceManager"))));
        this.c = new CopyOnWriteArrayList<>();
        this.d = zsd.D0(new alc(new clc(new ub7(12, zsd.b0(new clc(new C1231t5(new ub7(12, new clc(zsd.M0(new ub7(12, new ub7(12, zsd.b0(zsd.M0(c1198r0.a.getAuthTokenState(), new C1240u0(null, c1198r0))), new C1266w0(null)), new C1120l5(this, null)), new C1217s5(null, this)), new C1134m5(this, null)), new C1148n5(this, null)), this), new C1162o5(null))), new C1176p5(this, null)), new C1190q5(this, null)), new C1203r5(this, null)), e2, lbq.b);
    }

    public static final void c() {
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0
    @NotNull
    public final bm5 a(@NotNull InterfaceC1305z0.a aVar) {
        aVar.getClass();
        return new fm5(2, new tiu(16));
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0
    @NotNull
    public final aij b() {
        return v5g.t(this.d);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0
    public final void a() {
    }
}
