package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import android.widget.ImageView;
import com.yandex.passport.R;
import defpackage.fft;
import defpackage.wft;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 extends wft {
    public final com.yandex.passport.common.ui.lang.b k;
    public final z l;

    public f0(Activity activity, com.yandex.passport.common.ui.lang.b bVar) {
        activity.getClass();
        bVar.getClass();
        this.k = bVar;
        this.l = new z(activity, this, 1);
    }

    @Override // defpackage.orq, defpackage.srq
    public final void c() {
        super.c();
        ((ImageView) this.l.e()).setImageResource(p());
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.l;
    }

    public final int p() {
        Locale b = ((com.yandex.passport.internal.ui.lang.a) this.k).b();
        int i = com.yandex.passport.common.ui.lang.a.a;
        String language = b.getLanguage();
        language.getClass();
        String lowerCase = language.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return (Intrinsics.d(lowerCase, new Locale("ru").getLanguage()) || Intrinsics.d(lowerCase, new Locale("az").getLanguage()) || Intrinsics.d(lowerCase, new Locale("uk").getLanguage()) || Intrinsics.d(lowerCase, new Locale("kk").getLanguage()) || Intrinsics.d(lowerCase, new Locale("ky").getLanguage()) || Intrinsics.d(lowerCase, new Locale("be").getLanguage()) || Intrinsics.d(lowerCase, new Locale("bg").getLanguage())) ? R.drawable.passport_logo_ya_id_ru : R.drawable.passport_logo_ya_id_en;
    }
}
