package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldh4;", "Landroidx/fragment/app/o;", "<init>", "()V", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class dh4 extends o {
    public kh4 g;
    public boolean h;

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ch4 ch4Var = new ch4(layoutInflater.getContext());
        ch4Var.setVisibility(4);
        return ch4Var;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        super.onDestroy();
        kh4 kh4Var = this.g;
        if (kh4Var != null) {
            this.g = null;
            Object obj = kh4Var.d;
            eh4 eh4Var = obj instanceof eh4 ? (eh4) obj : null;
            if (equals(eh4Var != null ? eh4Var.a() : null)) {
                kh4Var.b(kh4Var.d.f());
            }
        }
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        ih4 a;
        super.onDestroyView();
        this.h = false;
        kh4 kh4Var = this.g;
        if (kh4Var == null || (a = kh4Var.a(this)) == null) {
            return;
        }
        kh4Var.b(a.d());
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        ih4 a;
        view.getClass();
        this.h = true;
        kh4 kh4Var = this.g;
        if (kh4Var == null || (a = kh4Var.a(this)) == null) {
            return;
        }
        kh4Var.b(a.b());
    }
}
