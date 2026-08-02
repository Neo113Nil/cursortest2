package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.o;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes5.dex */
public class bf6 extends jnb {
    public mtc j;

    public final void A(Intent intent) {
        Context context = getContext();
        context.getClass();
        intent.getClass();
        if (sj2.C(context, intent)) {
            Activity G = sj2.G(getContext());
            if (G instanceof np2) {
                ((np2) G).l().y(intent);
                return;
            }
            Assertions.fail(this + " has to be attached to BaseActivity in order to use shared tabs");
        }
    }

    @Override // androidx.fragment.app.o
    public final Context getContext() {
        return (Context) Preconditions.nonNull(this.j);
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Context context) {
        o parentFragment = getParentFragment();
        if (parentFragment != null) {
            context = parentFragment.getContext();
        }
        mtc mtcVar = new mtc(context, 0);
        this.j = mtcVar;
        super.onAttach(mtcVar);
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bzf.v(this);
    }

    @Override // androidx.fragment.app.o
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle).cloneInContext(this.j);
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void startActivity(Intent intent) {
        A(intent);
        super.startActivity(intent);
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void startActivityForResult(Intent intent, int i) {
        A(intent);
        super.startActivityForResult(intent, i);
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void startActivity(Intent intent, Bundle bundle) {
        A(intent);
        super.startActivity(intent, bundle);
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        A(intent);
        super.startActivityForResult(intent, i, bundle);
    }
}
