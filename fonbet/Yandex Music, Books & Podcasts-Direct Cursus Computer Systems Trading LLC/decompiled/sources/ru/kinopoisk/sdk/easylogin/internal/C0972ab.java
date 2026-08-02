package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.efu;
import defpackage.ehv;
import defpackage.ern;
import defpackage.gfu;
import defpackage.hq5;
import defpackage.ild;
import defpackage.jfu;
import defpackage.nbt;
import defpackage.oq5;
import defpackage.uif;
import defpackage.wn5;
import defpackage.xdr;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;
import ru.kinopoisk.sdk.easylogin.internal.di.Injector;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/ab;", "Lru/kinopoisk/sdk/easylogin/internal/e;", "<init>", "()V", "a", "android_easylogin_tvauthdiscovery_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.ab, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0972ab extends AbstractC1016e {

    @NotNull
    public static final a f = new a(null);

    @NotNull
    public final efu c;
    public K d;
    public nbt e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/ab$a;", "", "android_easylogin_tvauthdiscovery_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.ab$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.ab$b */
    public static final class b extends uif implements Function2<hq5, Integer, Unit> {
        public b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            hq5 hq5Var = (hq5) obj;
            if ((((Number) obj2).intValue() & 3) == 2) {
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.z()) {
                    oq5Var.S();
                    return Unit.a;
                }
            }
            C1224sc.a(null, ild.s(hq5Var, 47212036, new C1056gb(C0972ab.this)), hq5Var, 48);
            return Unit.a;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.ab$c */
    public static final class c extends uif implements Function0<jfu> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            jfu viewModelStore = C0972ab.this.getViewModelStore();
            viewModelStore.getClass();
            return viewModelStore;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.ab$d */
    public static final class d extends uif implements Function0<gfu> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            gfu gfuVar = C0972ab.this.a;
            if (gfuVar != null) {
                return gfuVar;
            }
            Intrinsics.j("viewModelsFactory");
            throw null;
        }
    }

    public C0972ab() {
        super(0, 1, null);
        this.c = new efu(ern.a(C1223sb.class), new c(), new d(), this);
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NotNull DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onCancel(dialogInterface);
        C1223sb c1223sb = (C1223sb) this.c.getValue();
        c1223sb.f.trackCloseClick((Za) ((xdr) c1223sb.h).getValue());
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        Injector injector = Injector.a;
        C1084ib.a(this);
        super.onCreate(bundle);
        setStyle(1, R.style.ThemeOverlay_EasyLogin_Discovery);
    }

    @Override // androidx.fragment.app.o
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ehv.i);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeView.setContent(new wn5(new b(), 572427336, true));
        return composeView;
    }
}
