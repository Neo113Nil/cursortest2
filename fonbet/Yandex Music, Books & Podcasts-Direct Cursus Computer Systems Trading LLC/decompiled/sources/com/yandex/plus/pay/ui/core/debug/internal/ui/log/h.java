package com.yandex.plus.pay.ui.core.debug.internal.ui.log;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.home.internal.di.y;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfu;
import defpackage.ern;
import defpackage.f1d;
import defpackage.ib9;
import defpackage.jl2;
import defpackage.jyr;
import defpackage.kg5;
import defpackage.lyf;
import defpackage.m8f;
import defpackage.ncs;
import defpackage.nme;
import defpackage.r7o;
import defpackage.rdb;
import defpackage.s9f;
import defpackage.sy6;
import defpackage.v42;
import defpackage.v75;
import defpackage.ybf;
import defpackage.yxm;
import defpackage.z7o;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/core/debug/internal/ui/log/h;", "Landroidx/fragment/app/o;", "<init>", "()V", "pay-sdk-ui-core-debug-menu_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class h extends o {
    public static final /* synthetic */ s9f[] n = {new yxm(h.class, "backButton", "getBackButton()Landroid/widget/ImageButton;", 0), f1d.c(ern.a, h.class, "filterSpinner", "getFilterSpinner()Landroid/widget/Spinner;", 0), new yxm(h.class, "scrollUpButton", "getScrollUpButton()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", 0), new yxm(h.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(h.class, "exportButton", "getExportButton()Landroid/widget/Button;", 0)};
    public final jyr g;
    public final ybf h;
    public final com.yandex.passport.internal.core.accounts.h i;
    public final com.yandex.passport.internal.core.accounts.h j;
    public final com.yandex.passport.internal.core.accounts.h k;
    public final com.yandex.passport.internal.core.accounts.h l;
    public final com.yandex.passport.internal.core.accounts.h m;

    public h() {
        super(R.layout.pay_sdk_fragment_debug_logs);
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.log.c
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                h hVar = this.b;
                switch (i2) {
                    case 0:
                        s9f[] s9fVarArr = h.n;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(hVar);
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.core.debug.internal.common.di.b) {
                                return (com.yandex.plus.pay.ui.core.debug.internal.common.di.b) o;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.core.debug.internal.common.di.b.class, l);
                        return null;
                    default:
                        com.yandex.plus.pay.ui.core.debug.internal.common.di.b bVar = (com.yandex.plus.pay.ui.core.debug.internal.common.di.b) hVar.g.getValue();
                        bVar.getClass();
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(k.class), new com.yandex.plus.pay.ui.core.debug.internal.common.di.a(bVar, 3))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.log.c
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                h hVar = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = h.n;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(hVar);
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.core.debug.internal.common.di.b) {
                                return (com.yandex.plus.pay.ui.core.debug.internal.common.di.b) o;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.core.debug.internal.common.di.b.class, l);
                        return null;
                    default:
                        com.yandex.plus.pay.ui.core.debug.internal.common.di.b bVar = (com.yandex.plus.pay.ui.core.debug.internal.common.di.b) hVar.g.getValue();
                        bVar.getClass();
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(k.class), new com.yandex.plus.pay.ui.core.debug.internal.common.di.a(bVar, 3))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        arf a = btf.a(bwf.c, new ncs(20, new ncs(19, this)));
        this.h = new ybf(ern.a(k.class), new sy6(a, 28), function0, new sy6(a, 29));
        this.i = new com.yandex.passport.internal.core.accounts.h(new g(this, i), new f(this, i2));
        int i3 = 2;
        this.j = new com.yandex.passport.internal.core.accounts.h(new g(this, i2), new f(this, i3));
        g gVar = new g(this, i3);
        int i4 = 3;
        this.k = new com.yandex.passport.internal.core.accounts.h(gVar, new f(this, i4));
        g gVar2 = new g(this, i4);
        int i5 = 4;
        this.l = new com.yandex.passport.internal.core.accounts.h(gVar2, new f(this, i5));
        this.m = new com.yandex.passport.internal.core.accounts.h(new g(this, i5), new f(this, i));
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        m8f m8fVar = new m8f(a.p, 2);
        s9f[] s9fVarArr = n;
        s9f s9fVar = s9fVarArr[2];
        com.yandex.passport.internal.core.accounts.h hVar = this.k;
        FloatingActionButton floatingActionButton = (FloatingActionButton) hVar.x(s9fVar);
        s9f s9fVar2 = s9fVarArr[3];
        com.yandex.passport.internal.core.accounts.h hVar2 = this.l;
        r1.E(floatingActionButton, new jl2(6, (RecyclerView) hVar2.x(s9fVar2), m8fVar, floatingActionButton));
        floatingActionButton.setVisibility(8);
        Spinner spinner = (Spinner) this.j.x(s9fVarArr[1]);
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) hVar.x(s9fVarArr[2]);
        Context context = spinner.getContext();
        rdb rdbVar = com.yandex.plus.log.api.a.g;
        ArrayList arrayList = new ArrayList(v75.o(rdbVar, 10));
        Iterator it = rdbVar.iterator();
        while (it.hasNext()) {
            com.yandex.plus.log.api.a aVar = (com.yandex.plus.log.api.a) it.next();
            Context context2 = spinner.getContext();
            context2.getClass();
            arrayList.add(u.G(aVar, context2));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(new e(this, floatingActionButton2));
        RecyclerView recyclerView = (RecyclerView) hVar2.x(s9fVarArr[3]);
        FloatingActionButton floatingActionButton3 = (FloatingActionButton) hVar.x(s9fVarArr[2]);
        recyclerView.setAdapter(m8fVar);
        recyclerView.t(new ib9(3, floatingActionButton3));
        final int i = 0;
        r1.E((ImageButton) this.i.x(s9fVarArr[0]), new View.OnClickListener(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.log.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                h hVar3 = this.b;
                switch (i2) {
                    case 0:
                        s9f[] s9fVarArr2 = h.n;
                        ((k) hVar3.h.getValue()).m.a();
                        break;
                    default:
                        s9f[] s9fVarArr3 = h.n;
                        k kVar = (k) hVar3.h.getValue();
                        y yVar = kVar.l;
                        List list = kVar.k;
                        Context context3 = (Context) yVar.a;
                        list.getClass();
                        try {
                            r7o r7oVar = z7o.b;
                            File cacheDir = context3.getCacheDir();
                            cacheDir.getClass();
                            y.k(context3, yVar.e(cacheDir, list));
                            break;
                        } catch (Throwable unused) {
                            r7o r7oVar2 = z7o.b;
                        }
                }
            }
        });
        final int i2 = 1;
        r1.E((Button) this.m.x(s9fVarArr[4]), new View.OnClickListener(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.log.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                h hVar3 = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr2 = h.n;
                        ((k) hVar3.h.getValue()).m.a();
                        break;
                    default:
                        s9f[] s9fVarArr3 = h.n;
                        k kVar = (k) hVar3.h.getValue();
                        y yVar = kVar.l;
                        List list = kVar.k;
                        Context context3 = (Context) yVar.a;
                        list.getClass();
                        try {
                            r7o r7oVar = z7o.b;
                            File cacheDir = context3.getCacheDir();
                            cacheDir.getClass();
                            y.k(context3, yVar.e(cacheDir, list));
                            break;
                        } catch (Throwable unused) {
                            r7o r7oVar2 = z7o.b;
                        }
                }
            }
        });
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(((k) this.h.getValue()).o, getViewLifecycleOwner().getLifecycle(), lyf.d), com.yandex.plus.bdui.plus.analytics.b.n(this), new v42(this, m8fVar, (Continuation) null, 29));
    }
}
