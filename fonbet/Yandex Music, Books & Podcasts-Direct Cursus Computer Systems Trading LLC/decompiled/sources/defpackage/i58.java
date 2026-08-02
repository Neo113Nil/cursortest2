package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.catalog.juicybottommenu.JuicyBottomSheetFrameLayout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li58;", "Lx7f;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class i58 extends x7f {
    public q58 l;
    public Function0 m;
    public Function0 n;
    public Function0 o;
    public y58 p;
    public bw1 q;
    public boolean r;

    @Override // defpackage.x7f
    public final void A(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.getClass();
        bottomSheetBehavior.setSkipCollapsed(true);
        bottomSheetBehavior.setFitToContents(true);
        bottomSheetBehavior.setState(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r0 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(boolean z) {
        this.r = true;
        Function0 function0 = this.n;
        if (function0 != null) {
            if (!z) {
                function0 = null;
            }
        }
        function0 = this.m;
        if (function0 == null) {
            Intrinsics.j("continueAction");
            throw null;
        }
        function0.invoke();
        dismissAllowingStateLoss();
    }

    public final void E(y yVar) {
        yVar.getClass();
        x7f.B(this, yVar, "DISCLAIMER_DIALOG");
    }

    @Override // defpackage.ue3, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.l == null || this.m == null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        this.q = null;
        this.p = null;
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Function0 function0;
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        if (this.r || (function0 = this.o) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // defpackage.ue3, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStart() {
        bw1 bw1Var;
        super.onStart();
        y58 y58Var = this.p;
        if (y58Var == null || (bw1Var = this.q) == null) {
            return;
        }
        rjq rjqVar = (rjq) bw1Var.i;
        rjqVar.g();
        bw1Var.j = y58Var;
        ox6.B(new ub7(2, ((z66) ((jyr) bw1Var.f).getValue()).c(), bw1Var), hld.s(rjqVar, dm6.b()), new u58(0, bw1Var));
        bw1Var.s(true);
        x97.y(hld.s(rjqVar, dm6.b()), null, null, new ja4(bw1Var, null, 28), 3);
    }

    @Override // defpackage.ue3, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStop() {
        bw1 bw1Var = this.q;
        if (bw1Var != null) {
            y58 y58Var = (y58) bw1Var.j;
            if (y58Var != null) {
                y58Var.a().clearAnimation();
            }
            bw1Var.j = null;
            ((rjq) bw1Var.i).V();
        }
        super.onStop();
    }

    @Override // defpackage.x7f, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (this.l == null) {
            Assertions.throwOrSkip$default(new FailedAssertionException("Track must be set"), null, 2, null);
            dismissAllowingStateLoss();
            return;
        }
        if (this.m == null) {
            Assertions.throwOrSkip$default(new FailedAssertionException("continueAction must be set"), null, 2, null);
            dismissAllowingStateLoss();
            return;
        }
        Context context = getContext();
        context.getClass();
        q58 q58Var = this.l;
        if (q58Var == null) {
            Intrinsics.j("data");
            throw null;
        }
        this.q = new bw1(context, q58Var, new xzi(this));
        LayoutInflater layoutInflater = getLayoutInflater();
        layoutInflater.getClass();
        View findViewById = requireView().findViewById(R.id.dialog_juicy_catalog_menu_container);
        findViewById.getClass();
        this.p = new y58(layoutInflater, (JuicyBottomSheetFrameLayout) findViewById, new qxp(this));
    }
}
