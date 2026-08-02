package defpackage;

import android.os.Parcelable;
import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class tti implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uti b;

    public /* synthetic */ tti(uti utiVar, int i) {
        this.a = i;
        this.b = utiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                Parcelable parcelable = this.b.requireArguments().getParcelable("myShelfLikesScreen:args");
                if (parcelable != null) {
                    return new bui((rui) parcelable);
                }
                xq0.x("Required value was null.");
                return null;
            default:
                uti utiVar = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(iaj.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = utiVar.requireActivity();
                requireActivity.getClass();
                return iaj.a(requireActivity, utiVar.d());
        }
    }
}
