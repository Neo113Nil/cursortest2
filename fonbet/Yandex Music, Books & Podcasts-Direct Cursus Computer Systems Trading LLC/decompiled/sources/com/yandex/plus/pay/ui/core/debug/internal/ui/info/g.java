package com.yandex.plus.pay.ui.core.debug.internal.ui.info;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.core.app.q;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfu;
import defpackage.e3e;
import defpackage.ern;
import defpackage.f1d;
import defpackage.fmq;
import defpackage.js6;
import defpackage.jyr;
import defpackage.kg5;
import defpackage.lyf;
import defpackage.m8f;
import defpackage.ncs;
import defpackage.nme;
import defpackage.s9f;
import defpackage.sy6;
import defpackage.v42;
import defpackage.ybf;
import defpackage.yxm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/core/debug/internal/ui/info/g;", "Landroidx/fragment/app/o;", "<init>", "()V", "pay-sdk-ui-core-debug-menu_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class g extends o {
    public static final /* synthetic */ s9f[] l = {new yxm(g.class, "debugInfoRecycler", "getDebugInfoRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), f1d.c(ern.a, g.class, "reportButton", "getReportButton()Landroid/widget/Button;", 0), new yxm(g.class, "logsButton", "getLogsButton()Landroid/widget/Button;", 0)};
    public final jyr g;
    public final ybf h;
    public final com.yandex.passport.internal.core.accounts.h i;
    public final com.yandex.passport.internal.core.accounts.h j;
    public final com.yandex.passport.internal.core.accounts.h k;

    public g() {
        super(R.layout.pay_sdk_fragment_debug_info);
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.info.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                g gVar = this.b;
                switch (i2) {
                    case 0:
                        s9f[] s9fVarArr = g.l;
                        ArrayList l2 = com.yandex.plus.bdui.plus.analytics.b.l(gVar);
                        Iterator it = l2.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.core.debug.internal.common.di.b) {
                                return (com.yandex.plus.pay.ui.core.debug.internal.common.di.b) o;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.core.debug.internal.common.di.b.class, l2);
                        return null;
                    default:
                        com.yandex.plus.pay.ui.core.debug.internal.common.di.b bVar = (com.yandex.plus.pay.ui.core.debug.internal.common.di.b) gVar.g.getValue();
                        bVar.getClass();
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(i.class), new com.yandex.plus.pay.ui.core.debug.internal.common.di.a(bVar, 1))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.info.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                g gVar = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = g.l;
                        ArrayList l2 = com.yandex.plus.bdui.plus.analytics.b.l(gVar);
                        Iterator it = l2.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.core.debug.internal.common.di.b) {
                                return (com.yandex.plus.pay.ui.core.debug.internal.common.di.b) o;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.core.debug.internal.common.di.b.class, l2);
                        return null;
                    default:
                        com.yandex.plus.pay.ui.core.debug.internal.common.di.b bVar = (com.yandex.plus.pay.ui.core.debug.internal.common.di.b) gVar.g.getValue();
                        bVar.getClass();
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(i.class), new com.yandex.plus.pay.ui.core.debug.internal.common.di.a(bVar, 1))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        arf a = btf.a(bwf.c, new ncs(18, new ncs(17, this)));
        this.h = new ybf(ern.a(i.class), new sy6(a, 26), function0, new sy6(a, 27));
        this.i = new com.yandex.passport.internal.core.accounts.h(new e(this, i), new f(this, i));
        this.j = new com.yandex.passport.internal.core.accounts.h(new e(this, i2), new f(this, i2));
        int i3 = 2;
        this.k = new com.yandex.passport.internal.core.accounts.h(new e(this, i3), new f(this, i3));
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        s9f[] s9fVarArr = l;
        final int i = 1;
        final int i2 = 0;
        r1.E((Button) this.j.x(s9fVarArr[1]), new View.OnClickListener(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.info.d
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                g gVar = this.b;
                switch (i3) {
                    case 0:
                        s9f[] s9fVarArr2 = g.l;
                        ((i) gVar.h.getValue()).k.a.M(new fmq((String) null, (js6) new com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a(0), true));
                        break;
                    default:
                        s9f[] s9fVarArr3 = g.l;
                        ((i) gVar.h.getValue()).k.a.M(new fmq((String) null, (js6) new q(29), true));
                        break;
                }
            }
        });
        r1.E((Button) this.k.x(s9fVarArr[2]), new View.OnClickListener(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.info.d
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i;
                g gVar = this.b;
                switch (i3) {
                    case 0:
                        s9f[] s9fVarArr2 = g.l;
                        ((i) gVar.h.getValue()).k.a.M(new fmq((String) null, (js6) new com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a(0), true));
                        break;
                    default:
                        s9f[] s9fVarArr3 = g.l;
                        ((i) gVar.h.getValue()).k.a.M(new fmq((String) null, (js6) new q(29), true));
                        break;
                }
            }
        });
        m8f m8fVar = new m8f(a.p, i);
        s9f s9fVar = s9fVarArr[0];
        com.yandex.passport.internal.core.accounts.h hVar = this.i;
        ((RecyclerView) hVar.x(s9fVar)).setAdapter(m8fVar);
        RecyclerView recyclerView = (RecyclerView) hVar.x(s9fVarArr[0]);
        Context context = view.getContext();
        context.getClass();
        recyclerView.s(new e3e(context.getResources().getDimensionPixelSize(R.dimen.pay_sdk_margin_middle), 2));
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(((i) this.h.getValue()).l, getViewLifecycleOwner().getLifecycle(), lyf.d), com.yandex.plus.bdui.plus.analytics.b.n(this), new v42(this, m8fVar, (Continuation) null, 28));
    }
}
