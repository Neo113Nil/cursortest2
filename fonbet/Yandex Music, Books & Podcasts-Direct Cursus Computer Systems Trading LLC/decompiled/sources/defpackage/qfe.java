package defpackage;

import android.os.Parcelable;
import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class qfe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sfe b;

    public /* synthetic */ qfe(sfe sfeVar, int i) {
        this.a = i;
        this.b = sfeVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                sfe sfeVar = this.b;
                nfe nfeVar = sfeVar.k;
                t requireActivity = sfeVar.requireActivity();
                requireActivity.getClass();
                Parcelable parcelable = sfeVar.requireArguments().getParcelable("inapp_restore_screen_args");
                if (parcelable != null) {
                    nfeVar.getClass();
                    return new yfe(requireActivity, (zee) parcelable);
                }
                xq0.x("Required value was null.");
                return null;
            default:
                sfe sfeVar2 = this.b;
                nfe nfeVar2 = sfeVar2.k;
                yfe yfeVar = (yfe) sfeVar2.m.getValue();
                nfeVar2.getClass();
                yfeVar.getClass();
                e00 e00Var = nfeVar2.a;
                e00Var.getClass();
                bdt I = hag.I(frt.class);
                qdc qdcVar = e00Var.a;
                qdcVar.getClass();
                frt frtVar = (frt) qdcVar.C(I);
                bdt I2 = hag.I(vrt.class);
                qdc qdcVar2 = e00Var.a;
                qdcVar2.getClass();
                vrt vrtVar = (vrt) qdcVar2.C(I2);
                bdt I3 = hag.I(lge.class);
                qdc qdcVar3 = e00Var.a;
                qdcVar3.getClass();
                return new ige(frtVar, vrtVar, (lge) qdcVar3.C(I3), yfeVar);
        }
    }
}
