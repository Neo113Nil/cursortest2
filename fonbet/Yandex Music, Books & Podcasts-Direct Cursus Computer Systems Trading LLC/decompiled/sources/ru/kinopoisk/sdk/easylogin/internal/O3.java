package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.dzf;
import defpackage.su2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.impl.FoundTvStubTrackerImpl;

/* loaded from: classes5.dex */
public final class O3 extends su2 {

    @NotNull
    public final C1167oa a;

    @NotNull
    public final H9 b;

    @NotNull
    public final FoundTvStubTrackerImpl c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/O3$a;", "", "", "TAG", "Ljava/lang/String;", "android_easylogin_tvauthdetected_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O3(@NotNull C1167oa c1167oa, @NotNull H9 h9, @NotNull FoundTvStubTrackerImpl foundTvStubTrackerImpl) {
        super("FoundTvStubViewModel");
        c1167oa.getClass();
        h9.getClass();
        foundTvStubTrackerImpl.getClass();
        this.a = c1167oa;
        this.b = h9;
        this.c = foundTvStubTrackerImpl;
        foundTvStubTrackerImpl.trackShowed();
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
