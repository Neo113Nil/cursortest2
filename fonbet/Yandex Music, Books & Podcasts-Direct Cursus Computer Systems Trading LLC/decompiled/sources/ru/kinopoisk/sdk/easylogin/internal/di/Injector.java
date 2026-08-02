package ru.kinopoisk.sdk.easylogin.internal.di;

import android.os.Bundle;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import defpackage.bfu;
import defpackage.bjt;
import defpackage.cvw;
import defpackage.ern;
import defpackage.fvw;
import defpackage.hn5;
import defpackage.is6;
import defpackage.jfu;
import defpackage.jvw;
import defpackage.lm4;
import defpackage.lvw;
import defpackage.nme;
import defpackage.nvw;
import defpackage.ovw;
import defpackage.p97;
import defpackage.xq0;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.P3;

/* loaded from: classes5.dex */
public final class Injector {
    public static volatile EasyLoginSdkComponent b;

    @NotNull
    public static final Injector a = new Injector();

    @NotNull
    public static final WeakHashMap<hn5, cvw> c = new WeakHashMap<>();

    @NotNull
    public static final WeakHashMap<o, jvw> d = new WeakHashMap<>();

    public static final class a extends bfu {

        @NotNull
        public final fvw a;

        public a(@NotNull fvw fvwVar) {
            fvwVar.getClass();
            this.a = fvwVar;
        }
    }

    public static final class b extends bfu {

        @NotNull
        public final lvw a;

        public b(@NotNull lvw lvwVar) {
            lvwVar.getClass();
            this.a = lvwVar;
        }
    }

    @NotNull
    public static P3 a(@NotNull o oVar) {
        oVar.getClass();
        WeakHashMap<o, jvw> weakHashMap = d;
        jvw jvwVar = weakHashMap.get(oVar);
        if (jvwVar == null) {
            jvwVar = b(oVar).fragmentComponentFactory().create(oVar);
            weakHashMap.put(oVar, jvwVar);
        }
        jvwVar.getClass();
        return jvwVar;
    }

    @NotNull
    public static lvw b(@NotNull o oVar) {
        oVar.getClass();
        t requireActivity = oVar.requireActivity();
        requireActivity.getClass();
        lm4 a2 = ern.a(requireActivity.getClass());
        Bundle extras = requireActivity.getIntent().getExtras();
        p97 p97Var = new p97(1);
        p97Var.a(ern.a(a.class), new nvw(a2, extras));
        nme d2 = p97Var.d();
        jfu viewModelStore = requireActivity.getViewModelStore();
        is6 defaultViewModelCreationExtras = requireActivity.getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        bjt bjtVar = new bjt(viewModelStore, d2, defaultViewModelCreationExtras);
        lm4 a3 = ern.a(a.class);
        String f = a3.f();
        if (f == null) {
            xq0.x("Local and anonymous classes can not be ViewModels");
            return null;
        }
        fvw fvwVar = ((a) bjtVar.j(a3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f))).a;
        fvwVar.getClass();
        lm4 a4 = ern.a(oVar.getClass());
        Bundle arguments = oVar.getArguments();
        o parentFragment = oVar.getParentFragment();
        lvw b2 = parentFragment != null ? b(parentFragment) : null;
        p97 p97Var2 = new p97(1);
        p97Var2.a(ern.a(b.class), new ovw(fvwVar, a4, arguments, b2));
        nme d3 = p97Var2.d();
        jfu viewModelStore2 = oVar.getViewModelStore();
        is6 defaultViewModelCreationExtras2 = oVar.getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelCreationExtras2.getClass();
        bjt bjtVar2 = new bjt(viewModelStore2, d3, defaultViewModelCreationExtras2);
        lm4 a5 = ern.a(b.class);
        String f2 = a5.f();
        if (f2 == null) {
            xq0.x("Local and anonymous classes can not be ViewModels");
            return null;
        }
        lvw lvwVar = ((b) bjtVar2.j(a5, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f2))).a;
        lvwVar.getClass();
        return lvwVar;
    }
}
