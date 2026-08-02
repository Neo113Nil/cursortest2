package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.o;
import ru.yandex.music.R;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes5.dex */
public class ue3 extends af3 implements lnb, lxi {
    public mtc h;
    public final y18 g = (y18) sk3.I(y18.class);
    public final nnb i = new nnb(this);

    @Override // defpackage.lxi
    public final kxi d() {
        Intent intent = l() != null ? l().getIntent() : null;
        m6s R = intent != null ? qgg.R(intent) : null;
        return new kxi(this.i.m(), R != null ? R.a : null);
    }

    @Override // defpackage.lnb
    public final fnb g() {
        return this.i.m();
    }

    @Override // androidx.fragment.app.o
    public final Context getContext() {
        return (Context) Preconditions.nonNull(this.h);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onAttach(Context context) {
        o parentFragment = getParentFragment();
        if (parentFragment != null) {
            context = parentFragment.getContext();
        }
        mtc mtcVar = new mtc(new uf6(context, z()), 0);
        this.h = mtcVar;
        super.onAttach(mtcVar);
        this.g.getClass();
        a28.b(this);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i.w(this, bundle, null);
    }

    @Override // defpackage.af3, defpackage.hr0, androidx.fragment.app.i
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        if (Build.VERSION.SDK_INT >= 27) {
            sht.a(getContext(), onCreateDialog);
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onDetach() {
        super.onDetach();
        this.g.getClass();
        a28.c(this);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle).cloneInContext(this.h);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.i.x(bundle);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public void onStart() {
        super.onStart();
        this.i.y(null);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public void onStop() {
        this.i.f = true;
        super.onStop();
    }

    @Override // androidx.fragment.app.o
    public final void startActivity(Intent intent) {
        super.startActivity(intent);
        this.i.t(intent);
    }

    @Override // androidx.fragment.app.o
    public final void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
        this.i.t(intent);
    }

    public int z() {
        ou0 ou0Var = (ou0) ((p8q) sk3.I(p8q.class)).d.b.invoke();
        ou0Var.getClass();
        return yu0.a[ou0Var.ordinal()] == 1 ? R.style.AppTheme_EdgeToEdge_TransparentStatusBar : R.style.AppTheme_Dark_EdgeToEdge_TransparentStatusBar;
    }

    @Override // androidx.fragment.app.o
    public final void startActivity(Intent intent, Bundle bundle) {
        super.startActivity(intent, bundle);
        this.i.t(intent);
    }

    @Override // androidx.fragment.app.o
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
        this.i.t(intent);
    }
}
