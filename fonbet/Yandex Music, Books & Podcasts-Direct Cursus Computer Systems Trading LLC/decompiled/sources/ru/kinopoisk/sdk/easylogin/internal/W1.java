package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.dzf;
import defpackage.msa;
import defpackage.nsa;
import defpackage.ot0;
import defpackage.ssa;
import defpackage.su2;
import defpackage.x97;
import defpackage.yd5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.impl.ConnectingTrackerImpl;

/* loaded from: classes5.dex */
public final class W1 extends su2 {
    public static final long f;

    @NotNull
    public final Q1 a;

    @NotNull
    public final C1167oa b;

    @NotNull
    public final ConnectingTrackerImpl c;

    @NotNull
    public final I9 d;

    @NotNull
    public final InterfaceC1138m9 e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/W1$a;", "", "Lnsa;", "MINIMAL_TIMEOUT", "J", "", "TAG", "Ljava/lang/String;", "android_easylogin_tvauthdetected_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        msa msaVar = nsa.b;
        f = yd5.M(700, ssa.MILLISECONDS);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(@NotNull Q1 q1, @NotNull C1167oa c1167oa, @NotNull ConnectingTrackerImpl connectingTrackerImpl, @NotNull I9 i9, @NotNull InterfaceC1138m9 interfaceC1138m9) {
        super("ConnectingViewModel");
        q1.getClass();
        c1167oa.getClass();
        connectingTrackerImpl.getClass();
        i9.getClass();
        interfaceC1138m9.getClass();
        this.a = q1;
        this.b = c1167oa;
        this.c = connectingTrackerImpl;
        this.d = i9;
        this.e = interfaceC1138m9;
        if (q1.b) {
            connectingTrackerImpl.trackAppInstalledShowed();
        } else {
            connectingTrackerImpl.trackShowed();
        }
        x97.y(ot0.F(this), null, null, new V1(this, null), 3);
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
