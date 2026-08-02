package ru.yandex.music.entry;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.aaw;
import defpackage.btf;
import defpackage.cxb;
import defpackage.hag;
import defpackage.hoe;
import defpackage.jyr;
import defpackage.kcb;
import defpackage.l18;
import defpackage.mcb;
import defpackage.ndb;
import defpackage.np2;
import defpackage.odb;
import defpackage.ou0;
import defpackage.su4;
import defpackage.wj3;
import defpackage.yu0;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.entry.EntryScreenActivity;

/* loaded from: classes5.dex */
public final class EntryScreenActivity extends np2 {
    public static final /* synthetic */ int y = 0;
    public final jyr v = l18.b.b(hag.I(mcb.class), true);
    public final jyr w;
    public final jyr x;

    public EntryScreenActivity() {
        final int i = 0;
        this.w = btf.b(new Function0(this) { // from class: jcb
            public final /* synthetic */ EntryScreenActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EntryScreenActivity entryScreenActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = EntryScreenActivity.y;
                        ((mcb) entryScreenActivity.v.getValue()).getClass();
                        return wcb.class;
                    default:
                        int i4 = EntryScreenActivity.y;
                        return new kcb(entryScreenActivity);
                }
            }
        });
        final int i2 = 1;
        this.x = btf.b(new Function0(this) { // from class: jcb
            public final /* synthetic */ EntryScreenActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EntryScreenActivity entryScreenActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = EntryScreenActivity.y;
                        ((mcb) entryScreenActivity.v.getValue()).getClass();
                        return wcb.class;
                    default:
                        int i4 = EntryScreenActivity.y;
                        return new kcb(entryScreenActivity);
                }
            }
        });
    }

    @Override // defpackage.np2
    public final boolean m() {
        return true;
    }

    @Override // defpackage.np2
    public final boolean n() {
        return true;
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        jyr jyrVar = this.v;
        mcb mcbVar = (mcb) jyrVar.getValue();
        mcbVar.getClass();
        supportFragmentManager.B = new wj3(3, mcbVar);
        getOnBackPressedDispatcher().a(this, (kcb) this.x.getValue());
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        aaw.q(this, intent);
        if (bundle == null) {
            Object obj = (odb) getIntent().getParcelableExtra("entry_type");
            if (obj == null) {
                Assertions.throwOrSkip("EntryScreenActivity", new FailedAssertionException("Entry screen activity entry type must not be null. Fallback to login"));
                obj = new ndb(true);
            }
            y supportFragmentManager2 = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager2, supportFragmentManager2);
            Class cls = (Class) this.w.getValue();
            ((mcb) jyrVar.getValue()).getClass();
            l.f(R.id.fragment_container_view, cls, cxb.K(new Pair("EntryScreenEntryTypeKey", obj)));
            l.j();
        }
    }

    @Override // defpackage.np2
    public final int q() {
        return R.layout.simple_fragment_activity;
    }

    @Override // defpackage.np2
    public final void s(Bundle bundle) {
        super.s(bundle);
        hoe.c(this);
    }

    @Override // defpackage.np2
    public final void t(boolean z) {
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        return yu0.a[ou0Var.ordinal()] == 1 ? R.style.AppTheme_EdgeToEdge_TransparentLightStatusBar : R.style.AppTheme_Dark_EdgeToEdge_TransparentStatusBar;
    }
}
