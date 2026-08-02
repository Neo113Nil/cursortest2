package ru.yandex.music.url.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import defpackage.fmr;
import defpackage.hmr;
import defpackage.kac;
import defpackage.np2;
import defpackage.o6j;
import defpackage.p6j;
import defpackage.q58;
import defpackage.rpt;
import defpackage.spt;
import defpackage.su4;
import defpackage.y48;
import ru.yandex.music.R;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes6.dex */
public class StubActivity extends np2 implements y48 {
    public static final /* synthetic */ int v = 0;

    public static class a extends o {
        @Override // androidx.fragment.app.o
        public final void onAttach(Context context) {
            super.onAttach(context);
            StubActivity stubActivity = (StubActivity) requireActivity();
            int i = StubActivity.v;
            stubActivity.finish();
            Intent intent = (Intent) stubActivity.getIntent().getParcelableExtra("intent_for_retain");
            if (intent == null) {
                Assertions.assertTrue(((fmr) Preconditions.nonNull((fmr) stubActivity.getIntent().getSerializableExtra("stub_type"))) == fmr.c);
            } else {
                stubActivity.startActivity(intent);
            }
        }

        @Override // androidx.fragment.app.o
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return layoutInflater.inflate(R.layout.activity_url, viewGroup, false);
        }
    }

    public static Intent y(Context context, Intent intent, fmr fmrVar) {
        return new Intent(context, (Class<?>) StubActivity.class).putExtra("stub_type", fmrVar).putExtra("intent_for_retain", intent);
    }

    public static Intent z(Context context, rpt rptVar) {
        return new Intent(context, (Class<?>) StubActivity.class).putExtra("stub_type", fmr.c).putExtra("url_fail_type", rptVar);
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
        hmr hmrVar;
        o oVar;
        super.onCreate(bundle);
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
            fmr fmrVar = (fmr) Preconditions.nonNull((fmr) getIntent().getSerializableExtra("stub_type"));
            int ordinal = fmrVar.ordinal();
            if (ordinal == 0) {
                hmr p6jVar = new p6j();
                p6jVar.D(0, a.class.getName(), "fragment_tag", null);
                hmrVar = p6jVar;
            } else {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        kac.j(fmrVar, "no fragment for ");
                        return;
                    }
                    rpt rptVar = (rpt) getIntent().getSerializableExtra("url_fail_type");
                    q58 q58Var = (q58) getIntent().getParcelableExtra("extra_track");
                    oVar = new spt();
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable("args.type", rptVar);
                    bundle2.putParcelable("args.disclaimer", q58Var);
                    oVar.setArguments(bundle2);
                    l.d(R.id.content_frame, oVar, "fragment_tag", 1);
                    l.j();
                }
                hmr o6jVar = new o6j();
                o6jVar.D(0, a.class.getName(), "fragment_tag", null);
                hmrVar = o6jVar;
            }
            oVar = hmrVar;
            l.d(R.id.content_frame, oVar, "fragment_tag", 1);
            l.j();
        }
    }
}
