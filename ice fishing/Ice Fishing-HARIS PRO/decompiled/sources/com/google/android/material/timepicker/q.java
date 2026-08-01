package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.lumenpath.harispro.hrnavigator.R;

/* loaded from: classes.dex */
public final class q extends a {
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f2760f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, k kVar, int i) {
        super(context, R.string.material_hour_selection);
        this.e = i;
        switch (i) {
            case 1:
                this.f2760f = kVar;
                super(context, R.string.material_minute_selection);
                break;
            default:
                this.f2760f = kVar;
                break;
        }
    }

    @Override // com.google.android.material.timepicker.a, O.C0026b
    public final void d(View view, P.f fVar) {
        switch (this.e) {
            case 0:
                super.d(view, fVar);
                Resources resources = view.getResources();
                k kVar = this.f2760f;
                fVar.i(resources.getString(kVar.f2742c == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(kVar.b())));
                break;
            default:
                super.d(view, fVar);
                fVar.i(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(this.f2760f.e)));
                break;
        }
    }
}
