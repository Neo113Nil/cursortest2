package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.connectsdk.service.NetcastTVService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.arf;
import defpackage.btf;
import defpackage.dzf;
import defpackage.hq0;
import defpackage.kpj;
import defpackage.nxv;
import defpackage.pd;
import defpackage.rq0;
import defpackage.sq0;
import defpackage.uif;
import defpackage.vx7;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\b\u0006*\u0001'\b'\u0018\u0000 *2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0015¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u0013H\u0015¢\u0006\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\tR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/T;", "Lhq0;", "<init>", "()V", "", "isTabletDevice", "()Z", "Lrq0;", "getDelegate", "()Lrq0;", "Landroid/content/Context;", "newBase", "", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onBackInvoked", "onBackPressed", "Landroid/view/KeyEvent;", NetcastTVService.UDAP_API_EVENT, "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "", "requestCode", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "cachedDelegate$delegate", "Larf;", "getCachedDelegate", "cachedDelegate", "ru/kinopoisk/sdk/easylogin/internal/T$c", "onBackPressedCallback", "Lru/kinopoisk/sdk/easylogin/internal/T$c;", "Companion", "a", "android_ui_uishared_coreuimobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public abstract class T extends hq0 {
    private static boolean wasIdentifiedAsTablet;

    /* renamed from: cachedDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final arf cachedDelegate = btf.b(new b());

    @NotNull
    private final c onBackPressedCallback = new c();

    @NotNull
    private static final a Companion = new a(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/T$a;", "", "", "wasIdentifiedAsTablet", "Z", "android_ui_uishared_coreuimobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class b extends uif implements Function0<rq0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            nxv nxvVar = pd.k;
            if (nxvVar != null) {
                nxvVar.invoke();
            }
            Y8.e.getClass();
            Y8 y8 = Y8.f;
            if (y8 == null) {
                xq0.x("SupportedLanguageProvider.createIfNeeded() must be called first");
                return null;
            }
            T t = T.this;
            t.getClass();
            return new sq0(t, t, y8);
        }
    }

    public static final class c extends kpj {
        public c() {
            super(true);
        }

        @Override // defpackage.kpj
        public final void handleOnBackPressed() {
            T.this.onBackInvoked();
        }
    }

    private final rq0 getCachedDelegate() {
        return (rq0) this.cachedDelegate.getValue();
    }

    private final boolean isTabletDevice() {
        if (wasIdentifiedAsTablet) {
            return true;
        }
        boolean b2 = B8.b(this);
        wasIdentifiedAsTablet = b2;
        return b2;
    }

    @Override // defpackage.hq0, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context newBase) {
        newBase.getClass();
        nxv nxvVar = pd.k;
        if (nxvVar != null) {
            nxvVar.invoke();
        }
        Y8.e.getClass();
        Y8 y8 = Y8.f;
        if (y8 != null) {
            super.attachBaseContext(Y8.a(y8, this, newBase));
        } else {
            xq0.x("SupportedLanguageProvider.createIfNeeded() must be called first");
        }
    }

    @Override // defpackage.hq0, androidx.core.app.i, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        event.getClass();
        dzf a2 = Q3.a(this);
        event.getClass();
        P2 p2 = a2 instanceof P2 ? (P2) a2 : null;
        if (p2 == null || !p2.a()) {
            return super.dispatchKeyEvent(event);
        }
        return true;
    }

    @Override // defpackage.hq0
    @NotNull
    public rq0 getDelegate() {
        return getCachedDelegate();
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        List f = getSupportFragmentManager().c.f();
        f.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            if (obj instanceof InterfaceC1010d7) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1010d7) it.next()).a();
        }
    }

    public final void onBackInvoked() {
        Intent a2;
        this.onBackPressedCallback.setEnabled(false);
        getOnBackPressedDispatcher().d();
        this.onBackPressedCallback.setEnabled(true);
        if (isTaskRoot() && getSupportFragmentManager().H() == 0 && (a2 = androidx.core.app.f.a(this)) != null) {
            startActivity(a2);
        }
    }

    @Override // defpackage.hn5, android.app.Activity
    @vx7
    public final void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isTabletDevice()) {
            setRequestedOrientation(13);
        } else {
            C1156o.a(this);
        }
        getOnBackPressedDispatcher().a(this, this.onBackPressedCallback);
    }

    @Override // defpackage.hn5, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        List<dzf> f = getSupportFragmentManager().c.f();
        f.getClass();
        for (dzf dzfVar : f) {
            if (dzfVar instanceof InterfaceC0996c7) {
                ((InterfaceC0996c7) dzfVar).a();
            }
        }
    }
}
