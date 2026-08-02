package ru.kinopoisk.sdk.easylogin.internal;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.arf;
import defpackage.btf;
import defpackage.efu;
import defpackage.ern;
import defpackage.fb6;
import defpackage.gfu;
import defpackage.jfu;
import defpackage.nyf;
import defpackage.uif;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;
import ru.kinopoisk.sdk.easylogin.internal.di.Injector;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/wa;", "Lru/kinopoisk/sdk/easylogin/internal/e;", "Lru/kinopoisk/sdk/easylogin/internal/L6;", "<init>", "()V", "android_easylogin_tvauthdetected_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.wa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1276wa extends AbstractC1016e implements L6 {

    @NotNull
    public final arf c;

    @NotNull
    public final efu d;
    public C1153na e;

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.wa$a */
    public static final class a extends uif implements Function0<fb6> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fb6 invoke() {
            androidx.fragment.app.t requireActivity = C1276wa.this.requireActivity();
            requireActivity.getClass();
            androidx.fragment.app.y childFragmentManager = C1276wa.this.getChildFragmentManager();
            childFragmentManager.getClass();
            return new fb6(requireActivity, childFragmentManager, R.id.fragment_container);
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.wa$b */
    public static final class b extends uif implements Function0<jfu> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            jfu viewModelStore = C1276wa.this.getViewModelStore();
            viewModelStore.getClass();
            return viewModelStore;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.wa$c */
    public static final class c extends uif implements Function0<gfu> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            gfu gfuVar = C1276wa.this.a;
            if (gfuVar != null) {
                return gfuVar;
            }
            Intrinsics.j("viewModelsFactory");
            throw null;
        }
    }

    public C1276wa() {
        super(0, 1, null);
        this.c = btf.b(new a());
        this.d = new efu(ern.a(Aa.class), new b(), new c(), this);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.L6
    @NotNull
    public final K6 getNavigator() {
        return (K6) this.c.getValue();
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NotNull DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onCancel(dialogInterface);
        Aa aa = (Aa) this.d.getValue();
        if (aa.b.a) {
            return;
        }
        aa.c.onDecline();
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        Injector injector = Injector.a;
        C1302ya.a(this);
        super.onCreate(bundle);
        C1153na c1153na = this.e;
        if (c1153na == null) {
            Intrinsics.j("router");
            throw null;
        }
        nyf lifecycle = getLifecycle();
        lifecycle.getClass();
        C0995c6.a(c1153na, this, lifecycle);
        setStyle(1, R.style.ThemeOverlay_EasyLogin_Detected);
    }

    @Override // androidx.fragment.app.o
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.activity_one_fragment, viewGroup, false);
        inflate.getClass();
        return inflate;
    }
}
