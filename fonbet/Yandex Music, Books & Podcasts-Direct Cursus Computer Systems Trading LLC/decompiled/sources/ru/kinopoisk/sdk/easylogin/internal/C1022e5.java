package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bqi;
import defpackage.dzf;
import defpackage.fkn;
import defpackage.ot0;
import defpackage.su2;
import defpackage.vdr;
import defpackage.x97;
import defpackage.xdr;
import defpackage.ydr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.impl.InstallTvAppTrackerImpl;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.e5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1022e5 extends su2 {
    public static final /* synthetic */ int g = 0;

    @NotNull
    public final C1167oa a;

    @NotNull
    public final InstallTvAppTrackerImpl b;

    @NotNull
    public final I9 c;

    @NotNull
    public final C1288x9 d;

    @NotNull
    public final bqi e;

    @NotNull
    public final vdr f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/e5$a;", "", "", "TAG", "Ljava/lang/String;", "android_easylogin_tvauthdetected_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.e5$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1022e5(@NotNull C1167oa c1167oa, @NotNull InstallTvAppTrackerImpl installTvAppTrackerImpl, @NotNull I9 i9, @NotNull C1288x9 c1288x9) {
        super("InstallTvAppViewModel");
        c1167oa.getClass();
        installTvAppTrackerImpl.getClass();
        i9.getClass();
        c1288x9.getClass();
        this.a = c1167oa;
        this.b = installTvAppTrackerImpl;
        this.c = i9;
        this.d = c1288x9;
        xdr a2 = ydr.a(Boolean.FALSE);
        this.e = a2;
        this.f = new fkn(a2);
        installTvAppTrackerImpl.trackShowed();
        x97.y(ot0.F(this), null, null, new C1036f5(this, null), 3);
    }

    @Override // defpackage.yn7
    public void onCreate(@NotNull dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public void onDestroy(@NotNull dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public void onPause(@NotNull dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public void onResume(@NotNull dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public void onStart(@NotNull dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public void onStop(@NotNull dzf dzfVar) {
        dzfVar.getClass();
    }
}
