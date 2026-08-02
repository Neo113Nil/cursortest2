package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b6e;
import defpackage.dzf;
import defpackage.su2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.H3;
import ru.kinopoisk.tvauth.internal.presentation.connecting.ConnectingScreen;
import ru.kinopoisk.tvauth.internal.presentation.foundtv.FoundTvStubScreen;

/* loaded from: classes5.dex */
public final class Aa extends su2 {

    @NotNull
    public final I9 a;

    @NotNull
    public final C1078i5 b;

    @NotNull
    public final H9 c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/Aa$a;", "", "", "TAG", "Ljava/lang/String;", "android_easylogin_tvauthdetected_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Aa(@NotNull B2 b2, @NotNull C1167oa c1167oa, @NotNull I9 i9, @NotNull C1078i5 c1078i5, @NotNull H9 h9, @NotNull C1288x9 c1288x9) {
        super("TvDetectedViewModel");
        boolean z;
        b2.getClass();
        c1167oa.getClass();
        i9.getClass();
        c1078i5.getClass();
        h9.getClass();
        c1288x9.getClass();
        this.a = i9;
        this.b = c1078i5;
        this.c = h9;
        H3 h3 = b2.a;
        if (h3 instanceof H3.a) {
            z = c1288x9.a().r;
        } else {
            if (!(h3 instanceof H3.c) && !(h3 instanceof H3.b)) {
                b6e.s();
                throw null;
            }
            z = true;
        }
        C1153na c1153na = c1167oa.b;
        if (z) {
            Z7.a(c1153na, new ConnectingScreen(new Q1(c1167oa.a.a, false)));
        } else {
            Z7.a(c1153na, FoundTvStubScreen.a);
        }
    }

    @Override // defpackage.su2, defpackage.bfu
    public final void onCleared() {
        this.a.cancel();
        super.onCleared();
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
