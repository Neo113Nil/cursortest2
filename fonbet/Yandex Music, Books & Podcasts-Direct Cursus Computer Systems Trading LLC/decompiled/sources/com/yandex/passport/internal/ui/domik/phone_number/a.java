package com.yandex.passport.internal.ui.domik.phone_number;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.t;
import com.yandex.passport.R;
import com.yandex.passport.common.network.n;
import com.yandex.passport.internal.analytics.m0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.k;
import com.yandex.passport.internal.flags.o;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.report.we;
import com.yandex.passport.internal.ui.domik.a0;
import com.yandex.passport.internal.ui.domik.b0;
import com.yandex.passport.internal.ui.domik.e;
import com.yandex.passport.internal.ui.domik.s;
import com.yandex.passport.internal.ui.domik.z;
import com.yandex.passport.internal.ui.f;
import com.yandex.passport.internal.util.h;
import com.yandex.passport.internal.util.i;
import com.yandex.passport.legacy.lx.j;
import defpackage.ca8;
import defpackage.cq4;
import defpackage.dq7;
import defpackage.mn7;
import defpackage.ot0;
import defpackage.x97;
import java.util.Stack;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public class a extends com.yandex.passport.internal.ui.domik.common.b<b, a0> {
    public static final /* synthetic */ int I = 0;
    public boolean F = false;
    public boolean G = false;
    public i H;

    @Override // com.yandex.passport.internal.ui.domik.base.a
    public final m0 F() {
        return m0.PHONE_ENTRY;
    }

    @Override // com.yandex.passport.internal.ui.domik.common.b, com.yandex.passport.internal.ui.domik.base.a
    public final boolean H(String str) {
        return true;
    }

    @Override // com.yandex.passport.internal.ui.domik.common.b
    public final void L() {
        String obj = this.w.getText().toString();
        int i = com.yandex.passport.legacy.b.a;
        if (obj == null || obj.trim().isEmpty()) {
            z(new f("phone.empty"));
            return;
        }
        b bVar = (b) this.g;
        a0 a0Var = (a0) this.o;
        a0Var.getClass();
        a0 i2 = a0.i(a0Var, null, null, null, null, null, null, 49151);
        CheckBox checkBox = this.y;
        b0.b.getClass();
        checkBox.getClass();
        b0 b0Var = checkBox.getVisibility() != 0 ? b0.NOT_SHOWED : checkBox.isChecked() ? b0.SHOWED_CHECKED : b0.SHOWED_UNCHECKED;
        b0 b0Var2 = i2.p;
        b0Var2.getClass();
        b0 b0Var3 = b0.NOT_SHOWED;
        a0 i3 = a0.i(i2, null, null, null, null, null, (b0Var2 == b0Var3 || b0Var != b0Var3) ? b0Var : b0Var2, 32767);
        bVar.getClass();
        cq4 F = ot0.F(bVar);
        dq7 dq7Var = ca8.a;
        x97.y(F, mn7.d, null, new we(bVar, i3, obj, (Continuation) null, 8), 2);
    }

    @Override // com.yandex.passport.internal.ui.domik.common.b, com.yandex.passport.internal.ui.domik.base.a, com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        boolean z;
        z zVar;
        super.onCreate(bundle);
        com.yandex.passport.internal.flags.i flagRepository = com.yandex.passport.internal.di.a.a().getFlagRepository();
        k kVar = ((a0) this.o).a.d;
        t requireActivity = requireActivity();
        requireActivity.getClass();
        n nVar = ((com.yandex.passport.internal.ui.base.a) requireActivity).d;
        nVar.getClass();
        boolean z2 = false;
        boolean z3 = ((Stack) nVar.b).size() == 1;
        l lVar = ((a0) this.o).a;
        lVar.getClass();
        this.G = lVar.p.j && z3 && !this.D;
        flagRepository.getClass();
        if (((Boolean) flagRepository.b(o.j)).booleanValue()) {
            kVar.getClass();
            if (kVar.a(com.yandex.passport.api.n.LITE) && !this.D && (((zVar = ((a0) this.o).j) == z.a || zVar == z.b) && !this.G)) {
                z = true;
                if (this.C && !z) {
                    z2 = true;
                }
                this.C = z2;
            }
        }
        z = false;
        if (this.C) {
            z2 = true;
        }
        this.C = z2;
    }

    @Override // com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onDestroyView() {
        i iVar = this.H;
        j jVar = iVar.b;
        if (jVar != null && !jVar.a) {
            jVar.a();
        }
        iVar.b = null;
        super.onDestroyView();
    }

    @Override // com.yandex.passport.internal.ui.domik.common.b, com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("relogin_auto_confirmed", this.F);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.yandex.passport.internal.ui.domik.common.b, com.yandex.passport.internal.ui.domik.base.a, com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.F = bundle.getBoolean("relogin_auto_confirmed", false);
        }
        a0 a0Var = (a0) this.o;
        if (a0Var.k != null && !this.F) {
            String str = a0Var.e;
            if (str != null) {
                str = str.replace("[TS] ", "");
            }
            this.w.setText(str);
            if (!((a0) this.o).a.y) {
                L();
            }
            this.B = true;
            this.F = true;
        }
        TextView textView = this.x;
        String str2 = ((a0) this.o).a.p.h;
        int i = R.string.passport_reg_phone_text;
        if (TextUtils.isEmpty(str2)) {
            textView.setText(i);
        } else {
            textView.setText(str2);
        }
        i iVar = new i(com.yandex.passport.internal.di.a.a().getDebugInfoUtil());
        this.H = iVar;
        this.x.setOnClickListener(new h(iVar));
        CheckBox checkBox = this.y;
        s sVar = b0.b;
        checkBox.getClass();
        checkBox.setVisibility(0);
        boolean b = ((a0) this.o).a.d.b(com.yandex.passport.api.n.PHONISH);
        if (((a0) this.o).j == z.c || b) {
            this.y.setVisibility(8);
        }
    }

    @Override // com.yandex.passport.internal.ui.base.d
    public final com.yandex.passport.internal.ui.base.h x(PassportProcessGlobalComponent passportProcessGlobalComponent) {
        return E().newPhoneNumberViewModel();
    }

    @Override // com.yandex.passport.internal.ui.base.d
    public final boolean y() {
        e eVar = this.o;
        return ((a0) eVar).a.p.a && ((a0) eVar).a.y;
    }
}
