package com.yandex.plus.pay.ui.core.debug.internal;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.di.e;
import defpackage.af3;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfu;
import defpackage.ern;
import defpackage.jyr;
import defpackage.ncs;
import defpackage.nme;
import defpackage.rb5;
import defpackage.s9f;
import defpackage.sy6;
import defpackage.ybf;
import defpackage.yxm;
import defpackage.ze3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/pay/ui/core/debug/internal/c;", "Laf3;", "Lcom/yandex/plus/di/d;", "<init>", "()V", "pay-sdk-ui-core-debug-menu_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class c extends af3 implements com.yandex.plus.di.d {
    public static final /* synthetic */ s9f[] j;
    public final jyr g;
    public final f h;
    public final ybf i;

    static {
        yxm yxmVar = new yxm(c.class, "component", "getComponent()Lcom/yandex/plus/pay/ui/core/debug/internal/common/di/Component;", 0);
        ern.a.getClass();
        j = new s9f[]{yxmVar};
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.plus.pay.ui.core.debug.internal.a] */
    public c() {
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                c cVar = this.b;
                switch (i2) {
                    case 0:
                        s9f[] s9fVarArr = c.j;
                        y childFragmentManager = cVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        return new com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.c(cVar, childFragmentManager);
                    case 1:
                        s9f[] s9fVarArr2 = c.j;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(cVar);
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.core.debug.api.b) {
                                return new com.yandex.plus.pay.ui.core.debug.internal.common.di.b((com.yandex.plus.pay.ui.core.debug.api.b) o);
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.core.debug.api.b.class, l);
                        return null;
                    default:
                        s9f[] s9fVarArr3 = c.j;
                        com.yandex.plus.pay.ui.core.debug.internal.common.di.b z = cVar.z();
                        z.getClass();
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(d.class), new com.yandex.plus.pay.ui.core.debug.internal.common.di.a(z, 0))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i2 = 1;
        this.h = new f(this, (a) new Function0(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                c cVar = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = c.j;
                        y childFragmentManager = cVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        return new com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.c(cVar, childFragmentManager);
                    case 1:
                        s9f[] s9fVarArr2 = c.j;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(cVar);
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.core.debug.api.b) {
                                return new com.yandex.plus.pay.ui.core.debug.internal.common.di.b((com.yandex.plus.pay.ui.core.debug.api.b) o);
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.core.debug.api.b.class, l);
                        return null;
                    default:
                        s9f[] s9fVarArr3 = c.j;
                        com.yandex.plus.pay.ui.core.debug.internal.common.di.b z = cVar.z();
                        z.getClass();
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(d.class), new com.yandex.plus.pay.ui.core.debug.internal.common.di.a(z, 0))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i3 = 2;
        Function0 function0 = new Function0(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                c cVar = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = c.j;
                        y childFragmentManager = cVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        return new com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.c(cVar, childFragmentManager);
                    case 1:
                        s9f[] s9fVarArr2 = c.j;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(cVar);
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.core.debug.api.b) {
                                return new com.yandex.plus.pay.ui.core.debug.internal.common.di.b((com.yandex.plus.pay.ui.core.debug.api.b) o);
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.core.debug.api.b.class, l);
                        return null;
                    default:
                        s9f[] s9fVarArr3 = c.j;
                        com.yandex.plus.pay.ui.core.debug.internal.common.di.b z = cVar.z();
                        z.getClass();
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(d.class), new com.yandex.plus.pay.ui.core.debug.internal.common.di.a(z, 0))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        arf a = btf.a(bwf.c, new ncs(14, new e(this, 1)));
        this.i = new ybf(ern.a(d.class), new sy6(a, 22), function0, new sy6(a, 23));
    }

    @Override // com.yandex.plus.di.d
    public final com.yandex.plus.di.c o() {
        return z();
    }

    @Override // defpackage.af3, defpackage.hr0, androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.getClass();
        ze3 ze3Var = (ze3) onCreateDialog;
        ze3Var.setOnShowListener(new b());
        return ze3Var;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.pay_sdk_fragment_debug_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.o
    public final void onPause() {
        ((rb5) z().e.a.a).a = null;
        super.onPause();
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        ((rb5) z().e.a.a).a((com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.c) this.g.getValue());
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        d dVar = (d) this.i.getValue();
        if (dVar.l) {
            return;
        }
        dVar.l = true;
        dVar.k.a();
    }

    public final com.yandex.plus.pay.ui.core.debug.internal.common.di.b z() {
        return (com.yandex.plus.pay.ui.core.debug.internal.common.di.b) this.h.getValue(this, j[0]);
    }
}
