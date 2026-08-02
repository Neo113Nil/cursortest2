package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bqi;
import defpackage.dzf;
import defpackage.r2f;
import defpackage.su2;
import defpackage.xdr;
import defpackage.ydr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.impl.EnterCodeTrackerImpl;
import ru.kinopoisk.tvauth.internal.presentation.updatecode.UpdateCodeScreen;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.j3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1090j3 extends su2 {

    @NotNull
    public final C1167oa a;

    @NotNull
    public final EnterCodeTrackerImpl b;

    @NotNull
    public final I9 c;

    @NotNull
    public final C1288x9 d;

    @NotNull
    public final C1300y8 e;

    @NotNull
    public final bqi f;

    @NotNull
    public final bqi g;
    public r2f h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/j3$a;", "", "", "CHECK_CODE_DELAY", "J", "", "TAG", "Ljava/lang/String;", "android_easylogin_tvauthdetected_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.j3$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1090j3(@NotNull C1167oa c1167oa, @NotNull EnterCodeTrackerImpl enterCodeTrackerImpl, @NotNull I9 i9, @NotNull C1288x9 c1288x9, @NotNull C1300y8 c1300y8) {
        super("EnterCodeViewModel");
        c1167oa.getClass();
        enterCodeTrackerImpl.getClass();
        i9.getClass();
        c1288x9.getClass();
        c1300y8.getClass();
        this.a = c1167oa;
        this.b = enterCodeTrackerImpl;
        this.c = i9;
        this.d = c1288x9;
        this.e = c1300y8;
        xdr a2 = ydr.a(new C1020e3("", Nc.None, 0, 4, null));
        this.f = a2;
        this.g = a2;
        enterCodeTrackerImpl.trackShowed();
    }

    public static final void a(C1090j3 c1090j3) {
        xdr xdrVar;
        Object value;
        Nc nc;
        int i = ((C1020e3) ((xdr) c1090j3.f).getValue()).c + 1;
        if (i >= c1090j3.d.a().p) {
            Z7.a(c1090j3.a.b, UpdateCodeScreen.a);
            return;
        }
        bqi bqiVar = c1090j3.f;
        do {
            xdrVar = (xdr) bqiVar;
            value = xdrVar.getValue();
            nc = Nc.Error;
            ((C1020e3) value).getClass();
            nc.getClass();
        } while (!xdrVar.k(value, new C1020e3("", nc, i)));
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
